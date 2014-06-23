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
public class MpdCompareAction extends QvtCommonAction
{
	public MpdCompareAction(String id, String name)
	{
	super(id, name);
	setDescription(MPD_COMPARE_ACTION_TOOLTIP);
	}
	/**
	* Entered when button pushed.
	*/
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
	    	String fileName=CATALOG_FILENAME;
	    	String catFileName=CATALOG_FILENAME;
	    	FileDialog fd=new FileDialog(getFrame(),"Select Source MPD Catalog "+fileName);
	    	fd.setFile(fileName);
	    	fd.setVisible(true);
	    	if((fd.getFile()==null)||(fd.getDirectory()==null)){
		    	log.log("user cancelled "+fd.getDirectory()+" "+fd.getFile());
		    	return;
	    	}
	    	if(!fd.getFile().equals(fileName)){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Illegal filename for import: "+fd.getFile()+" should be a "+fileName);
		    	return;
	    	}
	    	File catFile=new File(fd.getDirectory()+fd.getFile());
	    	if(!catFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Catalog File does not exist: "+catFile);
		    	return;
	    	}
	    	log.log("load source catalog from "+catFile);
	    	
	    	fd=new FileDialog(getFrame(),"Select Target MPD Catalog "+fileName);
	    	fd.setFile(fileName);
	    	fd.setVisible(true);
	    	if((fd.getFile()==null)||(fd.getDirectory()==null)){
		    	log.log("user cancelled "+fd.getDirectory()+" "+fd.getFile());
		    	return;
	    	}
	    	if(!fd.getFile().equals(fileName)){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Illegal filename for import: "+fd.getFile()+" should be a "+fileName);
		    	return;
	    	}
	    	File catTargetFile=new File(fd.getDirectory()+fd.getFile());
	    	if(!catTargetFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Catalog File does not exist: "+catTargetFile);
		    	return;
	    	}
	    	log.log("load target catalog from "+catTargetFile);
	    	
	    	
	    	
        	Resource catResource=resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(catFile.getAbsolutePath()),true);
		    Set catList = new HashSet();
		    catList.addAll(catResource.getContents());
		    //log.log("catalog "+catResource+" : "+catList);
		    qvtEngine.put("cat", catList);
	    	
        	Resource catResourceTarget=resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(catTargetFile.getAbsolutePath()),true);
		    Set catTargetList = new HashSet();
		    catTargetList.addAll(catResourceTarget.getContents());
		    //log.log("catalog "+catResource+" : "+catList);
		    qvtEngine.put("catTarget", catTargetList);
		    
		    setTransform("mpdSchemaCompare.qvto",qvtEngine);
		    //log.log("compiling QVT ");
	        qvtEngine.eval((String) null);
	        
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
	
	public void updateState()
	{
		// enabled always
		Boolean enabled=true;
		setEnabled(enabled);
	}	
	}