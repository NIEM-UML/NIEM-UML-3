/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.internal.qvt.oml.evaluator.TransformationInstance;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.expressions.ModuleImport;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.modeldriven.magicdraw.niem.m2t.MasterDocument;
import org.modeldriven.magicdraw.niem.m2t.OmgRfpNiem;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.rcpf.product.utils.Utilities;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.utils.NativeWebBrowserLauncher;



/**
 * @author Tom
 *
 */
public class Rfp2DocAction extends QvtCommonAction
{
	static protected Rfp2DocAction currentAction=null;
	public Rfp2DocAction(String id, String name)
	{
	super(id, name);
	currentAction=this;
	}
	static public Rfp2DocAction getCurrentAction(){return currentAction;}
	/**
	* Entered when button pushed.
	 * @throws IOException 
	*/
	public void performTransform(ProgressStatus progressStatus) throws IOException
	{
		currentAction=this;
	    MDLog log=new MDLog(progressStatus);
	    try {
			performModelToText(log);			
	    }

	    catch (CancelError e)

	    {
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM RFP to DOC Cancelled by User ");
    }
			return;
	}
	public void updateState()
	{
		// enabled if current project contains component stereotyped with mpd
		Boolean enabled=getRfpModel()!=null;
	    setEnabled(enabled);
	}	
	//////////////////////////////////////////////////////////////////////////////////////
	protected void initializeQvtModels(MDLog log) throws IOException
	{
		if(compositeQVTMap!=null)return;
		// do a qvt to initialize set of qvt models
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    executionContext.setLog(log);
	    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
	    registerPackages(log,qvtEngine);
	    setTransform("composite.qvto",qvtEngine);

	    log.log("start loading MOF QVT resources");
        try {
			qvtEngine.eval((String) null);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			log.log("initializeQvtModels ERROR "+e);
			e.printStackTrace();
		}
		
	}
	//static protected Module compositeQVT=null;
	static protected Map<String,Module> compositeQVTMap=null;
	static public Module getModule(String name){
		return compositeQVTMap.get(name);
	}
	static public void setCompositeQVT(Module module){
		//log("set composite QVT "+module.getClass().getName()+" : "+module);
		compositeQVTMap=new HashMap<String,Module>();
		setCompositeQVTEntries(module);
	}
	static protected void setCompositeQVTEntries(Module module){
		if(compositeQVTMap.containsKey(module.getName()))return;
		//log("set composite QVT Entry "+module.getName()+" : "+module);
		compositeQVTMap.put(module.getName(),module);
		for(ModuleImport moduleImport:module.getModuleImport()){
			setCompositeQVTEntries(moduleImport.getImportedModule());
		}
	}
	public File getTargetDirectoryParent(){
		return getTargetDirectory().getParentFile();
	}
	public String getMasterDocumentBuildDirectory(){
		return getTargetDirectoryParent().getAbsolutePath()+"/temp~/"+getMpdName();
	}
	protected void performModelToText(MDLog log) throws IOException
	{
		log.log("starting rfp model to text document");
		File targetDirectory=getTargetDirectory();
		File mpdFile=targetDirectory;
		File masterDocumentTempDirectory=new File(getMasterDocumentBuildDirectory());
		File masterDocumentStaticDirectory=new File(getPluginDirectory()+"master-document.static");
		File masterDocumentOdtFile=new File(mpdFile,getMpdName()+".odt");
		if(masterDocumentOdtFile.exists()&&!masterDocumentOdtFile.canWrite()){
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Target Document is currently not writable: "+masterDocumentOdtFile);
			return;
		}
		log.log("using directory "+targetDirectory.getAbsolutePath()+", "+getProject().getName());
	    registerFactories(log);
if(false)// no longer used	    
	    initializeQvtModels(log);
		modelToTextMasterDocument(targetDirectory,log);
		masterDocumentTempDirectory.mkdirs();
		zipMasterDocumentOdt(log,masterDocumentTempDirectory,masterDocumentStaticDirectory,masterDocumentOdtFile);
		// open browser to view document
		// does not work
		//NativeWebBrowserLauncher.openURL(masterDocumentOdtFile.toURL().toExternalForm());
	}
	protected String getMpdName(){
			return getProject().getName();
	}
	protected void modelToTextMasterDocument(File targetFolder,MDLog log) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
    	    Model root = getCurrentModelRoot();//project.getModel(); 
    	    if(root==null)return;
    	    log.log("start rfp document provisioning "+root+", "+root.getName());
    	    OmgRfpNiem masterDocument=new  OmgRfpNiem(root,  targetFolder,args);
    		masterDocument.doGenerate(new BasicMonitor());
    	    log.log("completed rfp document provisioning");
    		
    		
	}
	
	}