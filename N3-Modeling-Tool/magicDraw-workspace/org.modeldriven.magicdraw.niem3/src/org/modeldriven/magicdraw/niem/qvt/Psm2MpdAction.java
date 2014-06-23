/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

//import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatPackage;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogPackage;

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

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
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



/**
 * @author Tom
 *
 */
abstract public class Psm2MpdAction extends QvtCommonAction
{
	public Psm2MpdAction(String id, String name)
	{
	super(id, name);
	}
	/**
	* Entered when button pushed.
	*/
	/*
	public void performTransform(ProgressStatus progressStatus)throws IOException
	{
		progressStatus.setDescription("starting");
	    MDLog log=new MDLog(progressStatus);
    	File rootFile=getTargetDirectory();
		performPsm2MpdTransform(log,rootFile);
	}
	public void performPsm2MpdTransform(MDLog log,File rootFile)
	{
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    try {
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    registerPackages(log,qvtEngine);

		    Model root = getCurrentModelRoot();//project.getModel(); 
		    if(root==null)return;
		    Set inputModelList = new HashSet();
		    inputModelList.add(root);
		    qvtEngine.put("uml", inputModelList);
		    
		    Set outputXsdList = new HashSet();
		    qvtEngine.put("xsd", outputXsdList);
		    / *
	        String installRootDirectory = System.getProperty("install.root", ".");
	        String dir = installRootDirectory+ "plugins/org.modeldriven.magicdraw.niem.qvt/transform/";
	        File file = new File(dir + "uml2mpd.qvto");
	        qvtEngine.put(ScriptEngine.FILENAME, file.getAbsolutePath());
	        * /
		    setTransform("uml2mpd.qvto",qvtEngine);

		    //log.log("compile uml2mpd QVT target root = "+rootFile.getAbsolutePath());
	        qvtEngine.eval((String) null);
	
	    	ResourceSet resourceSet = new ResourceSetImpl();
	    	
		    org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
	
	        Collection<EObject> schemas = (Collection<EObject>)qvtEngine.get("xsd");
        	log.log("schemas "+schemas.size());
	        for(EObject schema:schemas){
	        	//log.log("schema "+schema);
	        	if(XSDSchema.class.isInstance(schema)){
	        		Blackbox.splitSchemas((XSDSchema)schema ,rootURI,resourceSet,log);
	        	}

	        }
			Map options=new HashMap();
	        / * move to pim2psm
	        Collection<EObject> changeLogs = (Collection<EObject>)qvtEngine.get("changeLog");
        	log.log("changeLogs "+changeLogs.size());
        	Resource changeLogResource=resourceSet.createResource(rootURI.appendSegment("changelog.mpdcl"));
        	changeLogResource.getContents().addAll(changeLogs);
        	changeLogResource.save(options);
* /
	        Collection<EObject> cats = (Collection<EObject>)qvtEngine.get("cat");
        	log.log("cats "+cats.size());
        	Resource catResource=resourceSet.createResource(rootURI.appendSegment(CATALOG_FILENAME));
        	catResource.getContents().addAll(cats);
        	catResource.save(options);
	        // changeLog:CHANGELOG,out xsd:XSD,out cat:CAT
	//        resource.getContents().add(attribute.get(0));
        	signOffMessage();
	    }

	    catch (CancelError e)

	    {
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PSM to MPD Cancelled by User ");
    }

    catch (Throwable e)

    {
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PSM to MPD error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);

        e.printStackTrace();

    }
	
	}
	*/
	protected void signOffMessage(){
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PSM to MPD complete");
		
	}
	protected Set<Package> getContainedPackages(Package p){
		Set<Package> result=new HashSet<Package>();
		for(PackageableElement pe:p.getPackagedElement()){
			if(Package.class.isInstance(pe)){
				result.add((Package)pe);
				result.addAll(getContainedPackages((Package)pe));
			}
		}
		return result;
	}
	/*
	public void updateState()
	{
		// enabled if current project contains package stereotyped with mpd
		Boolean enabled=getPsmMpdPackage()!=null;
	setEnabled(enabled);
	}
	*/	
	}