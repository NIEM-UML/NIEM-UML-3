/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

//import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogPackage;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
//import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipFile;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;


import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.magicdraw.qvt.jsr223.QVTScriptEngineFactory;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
//import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.metadata.MdmodelsFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.ElementsFactory;
import com.nomagic.utils.Utilities;



/**
 * @author Tom
 *
 */
public class Mpd2PsmAction extends Psm2PimAction
{
	public Mpd2PsmAction(String id, String name)
	{
	super(id, name);
	setDescription(MPD_2_PSM_ACTION_TOOLTIP);
	}
	/**
	* Entered when button pushed.
	*/
	public void performTransformX(ProgressStatus progressStatus)
	{
		progressStatus.setDescription("starting");
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    //org.eclipse.m2m.qvt.oml.util.EvaluationMonitor x;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    MDLog log=new MDLog(progressStatus);
	    try {
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    registerPackages(log,qvtEngine);
		    
	    	ResourceSet resourceSet = new ResourceSetImpl();
	    	// change input to an mpd.zip
//	    	String fileName="catalog.mpdcat";
	    	String catFileName=CATALOG_FILENAME;
	    	String fileNameSuffix=".mpd.zip";
	    	String fileName="*"+fileNameSuffix;
	    	FileDialog fd=new FileDialog(getFrame(),"open "+fileName);
	    	fd.setFile(fileName);
	    	fd.setVisible(true);
	    	if((fd.getFile()==null)||(fd.getDirectory()==null)){
		    	log.log("user cancelled "+fd.getDirectory()+" "+fd.getFile());
		    	return;
	    	}
	    	if(!fd.getFile().endsWith(fileNameSuffix)){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Illegal filename for import: "+fd.getFile()+" should be a "+fileName);
		    	return;
	    	}
	    	File dstDir=extractZip(fd.getDirectory()+fd.getFile(),log);
	    	if(dstDir==null)return;
	    	/*
	    	File mpdZipFile=new File(fd.getDirectory()+fd.getFile());
	    	if(!mpdZipFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "File does not exist: "+mpdZipFile);
		    	return;
	    	}
	    	log.log("entered mpd zip file "+mpdZipFile);
	    	// expand the zip file and find the catFile
	    	ZipFile zipFile=new ZipFile(mpdZipFile);
	    	File dstDirParent=new File(mpdZipFile.getParentFile(),"mpd~");
	    	File dstDir=new File(dstDirParent,mpdZipFile.getName().replace(fileNameSuffix, ""));
	    	dstDir.mkdirs();
	    	log.log("expand mpd zip file to "+dstDir);
	    	Utilities.extractZip(zipFile,dstDir.getAbsolutePath());
	    	*/ 
	    	File catFile=new File(dstDir,catFileName);
	    	if(!catFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Catalog File does not exist: "+catFile);
		    	return;
	    	}
	    	
	    	/*
	    	if(!fd.getFile().equals(fileName)){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Illegal filename for import: "+fd.getFile()+" should be "+fileName);
		    	return;
	    	}
	    	File catFile=new File(fd.getDirectory()+fd.getFile());
	    	if(!catFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "File does not exist: "+catFile);
		    	return;
	    	}
	    	log.log("entered file "+catFile);
	    	*/
	    	log.log("load catalog from "+catFile);
        	Resource catResource=resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(catFile.getAbsolutePath()),true);
        	/*
	    	File rootFile=getTargetDirectory();
		    org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
		    log.log("rootURI "+rootURI);
        	Resource catResource=resourceSet.createResource(rootURI.appendSegment("catalog.mpdcat"));
        	*/
		    Set catList = new HashSet();
		    catList.addAll(catResource.getContents());
		    //log.log("catalog "+catResource+" : "+catList);
		    qvtEngine.put("cat", catList);
	    	
		    
	    	log.log("create base PSM model ");
		    createPSM(log,qvtEngine);
		    setTransform("mpd2uml.qvto",qvtEngine);
		    //log.log("compiling QVT mpd2uml.qvto");
	        qvtEngine.eval((String) null);
	        Model currentModelRoot=getCurrentModelRoot();
	        if(currentModelRoot==null)return;
	        toCanonicalIDs(currentModelRoot);

			performPSM2PIMTransform(progressStatus);
	        
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(),getName()+" complete");
	    }

	    catch (CancelError e)

	    {
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" Cancelled by User ");
    }

    catch (Throwable e)

    {
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);

        e.printStackTrace();

    }
	
	}
	public void performTransform(ProgressStatus progressStatus)
	{
		progressStatus.setDescription("starting");
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    //org.eclipse.m2m.qvt.oml.util.EvaluationMonitor x;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    MDLog log=new MDLog(progressStatus);
	    try {
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    registerPackages(log,qvtEngine);
		    
	    	ResourceSet resourceSet = new ResourceSetImpl();
	    	// change input to an mpd.zip
//	    	String fileName="catalog.mpdcat";
	    	String catFileName=CATALOG_FILENAME;
	    	String fileNameSuffix=".mpd.zip";
	    	String fileName="*"+fileNameSuffix;
	    	FileDialog fd=new FileDialog(getFrame(),"open "+fileName);
	    	fd.setFile(fileName);
	    	fd.setVisible(true);
	    	if((fd.getFile()==null)||(fd.getDirectory()==null)){
		    	log.log("user cancelled "+fd.getDirectory()+" "+fd.getFile());
		    	return;
	    	}
	    	if(!fd.getFile().endsWith(fileNameSuffix)){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Illegal filename for import: "+fd.getFile()+" should be a "+fileName);
		    	return;
	    	}
	    	File dstDir=extractZip(fd.getDirectory()+fd.getFile(),log);
	    	if(dstDir==null)return;
	    	
	    	// normally one level down
	    	File[] dirContent=dstDir.listFiles();
	    	if((dirContent.length==1)&&dirContent[0].isDirectory()){
	    		dstDir=dirContent[0];
	    	}
	    	
	    	
	    	File catFile=new File(dstDir,catFileName);
	    	if(!catFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Catalog File does not exist: "+catFile);
		    	return;
	    	}
	    	
	    	log.log("load catalog from "+catFile);
        	Resource catResource=resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(catFile.getAbsolutePath()),true);
        	mpd2pim(catResource,qvtEngine,log);
        	/*
        	
		    Set catList = new HashSet();
		    catList.addAll(catResource.getContents());
		    //log.log("catalog "+catResource+" : "+catList);
		    qvtEngine.put("cat", catList);
	    	
		    
//	    	log.log("create base PIM model ");
//		    createPSM(log,qvtEngine);
		    ProjectsManager projectsManager=getProjectsManager();

		    //
	        // create a new project and add objects to it
		    log.log("creating target PIM project");
	        Project psmProject=projectsManager.createProject();
	       // psmProject.getRepository().getEventSupport().setEnableEventFiring(false);
	        disableEventFiring(psmProject);

	        Model psmModel=psmProject.getModel();
		    Set psmUmlModelList = new HashSet();
		    psmUmlModelList.add(psmModel);
		    qvtEngine.put("pimUml", psmUmlModelList);

	        
	        String profilesdir = getProfilesDir();
	        
//	        String psmmoduleFilePath = profilesdir+ NIEM_PROFILE_FILENAME;
	        String psmmoduleFilePath = profilesdir+ NIEM_DSL_FILENAME;
	        
	        useModule(psmmoduleFilePath,log,psmProject);
	        
	        
	        useXmlLibrary(log,psmProject);
	    	
//		    setTransform("mpd2uml.qvto",qvtEngine);
	        String baseTransformName="mpd2pim";
	        String transformName=baseTransformName+".qvto";
		    setTransform(transformName,qvtEngine);
		    //log.log("compiling QVT "+transformName);
	        qvtEngine.eval((String) null);
//	        qvtEngine.eval((String) new File(getTransformDir()+transformName).toURI().toString());
//	        qvtEngine.eval(baseTransformName);
	        
//	        toCanonicalIDs(getCurrentModelRoot());
	        enableEventFiring(psmProject);
	        boolean isReferencePSM=false;
        
	        if(!isReferencePSM) {
	        	// hook into reference model
	        	performSubsetReference(log,psmModel,psmProject);
		        createDiagrams(psmProject);
	        }
	        
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(),getName()+" complete");
	    	*/
	    }

	    catch (CancelError e)

	    {
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" Cancelled by User ");
    }

    catch (Throwable e)

    {
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), getName()+" error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);

        e.printStackTrace();

    }
	
	}
	protected void mpd2pim(Resource catResource,ScriptEngine qvtEngine,MDLog log) throws ScriptException, IOException{
	    Set catList = new HashSet();
	    catList.addAll(catResource.getContents());
	    log.log("catalog "+catResource+" : "+catList);
	    qvtEngine.put("cat", catList);
    	
	    
//    	log.log("create base PIM model ");
//	    createPSM(log,qvtEngine);
	    ProjectsManager projectsManager=getProjectsManager();

	    //
        // create a new project and add objects to it
	    log.log("creating target PIM project");
        Project psmProject=projectsManager.createProject();
       // psmProject.getRepository().getEventSupport().setEnableEventFiring(false);
        disableEventFiring(psmProject);

        Model psmModel=psmProject.getModel();
	    Set psmUmlModelList = new HashSet();
	    psmUmlModelList.add(psmModel);
	    qvtEngine.put("pimUml", psmUmlModelList);

        
        String profilesdir = getProfilesDir();
        
//        String psmmoduleFilePath = profilesdir+ NIEM_PROFILE_FILENAME;
        String psmmoduleFilePath = profilesdir+ NIEM_DSL_FILENAME;
        
        useModule(psmmoduleFilePath,log,psmProject);
        
        
        useXmlLibrary(log,psmProject);
    	
//        String baseTransformName="mpd2pim";
//        String transformName=baseTransformName+".qvto";
//	    setTransform(transformName,qvtEngine);
        setMpd2pimTransform(qvtEngine,log,psmProject);
	    //log.log("compiling QVT "+transformName);
        qvtEngine.eval((String) null);
//        qvtEngine.eval((String) new File(getTransformDir()+transformName).toURI().toString());
//        qvtEngine.eval(baseTransformName);
        
//        toCanonicalIDs(getCurrentModelRoot());
        enableEventFiring(psmProject);
        boolean isReferencePSM=false;
        if(!isReferencePSM) {
        	// hook into reference model
        	performSubsetReference(log,psmModel,psmProject);
	        createDiagrams(psmProject);
        }
        /*
        log.log("toCanonicalIDs");
        disableEventFiring(psmProject);
        toCanonicalIDs(psmModel);
        enableEventFiring(psmProject);
*/
        //psmProject.getRepository().getEventSupport().setEnableEventFiring(true);
		//performPSM2PIMTransform(progressStatus);
        
    	mpd2pimComplete();
	}
	protected void setMpd2pimTransform(ScriptEngine qvtEngine,MDLog log,Project psmProject){
        String baseTransformName="mpd2pim";
        String transformName=baseTransformName+".qvto";
	    setTransform(transformName,qvtEngine);
		
	}
protected void mpd2pimComplete(){
	//javax.swing.JOptionPane.showMessageDialog( getFrame(),getName()+" complete");
}
protected File extractZip(String filePath,MDLog log) throws IOException{	
	File mpdZipFile=new File(filePath);
	if(!mpdZipFile.exists()){
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "File does not exist: "+mpdZipFile);
    	return null;
	}
	log.log("extracting mpd zip file "+mpdZipFile);
	// expand the zip file and find the catFile
	ZipFile zipFile=new ZipFile(mpdZipFile);
	File dstDirParent=new File(mpdZipFile.getParentFile(),"mpd~");
	String fileNameSuffix=".zip";
	File dstDir=new File(dstDirParent,mpdZipFile.getName().replace(fileNameSuffix, ""));
	dstDir.mkdirs();
	log.log("expanding mpd zip file to "+dstDir);
	Utilities.extractZip(zipFile,dstDir.getAbsolutePath());
	return dstDir;
}	
	protected void psm2pimComplete(){
		// suppress additional completion dialog
	}
	protected boolean isNiemReferenceModel(){
		// based on editable package named NIEM Reference Model
	    Model root = getCurrentModelRoot();
	    if(root==null)return false;
	    boolean result=false;
	    for(Package p:root.getNestedPackage()){
	    	if(p.isEditable()&&"NIEM Reference Model".equals(p.getName())){
	    		result=true;
	    		break;
	    	}
	    }
	    log("is NIEM Reference Model? : "+result);
		return result;
	}
	
	public void updateState()
	{
		// enabled always
		Boolean enabled=true;
		setEnabled(enabled);
	}	
	}