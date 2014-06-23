/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatFactory;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDSchema;
import org.modeldriven.magicdraw.niem.m2t.MasterDocument;
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



/**
 * @author Tom
 *
 */
public class MasterDocumentAction extends Rfp2DocAction
{
	public MasterDocumentAction(String id, String name)
	{
	super(id, name);
	}
	public String getMasterDocumentBuildDirectory(){
		return getTargetDirectoryParent().getAbsolutePath()+"/temp~/master-document";
	}
	
	/**
	* Entered when button pushed.
	 * @throws IOException 
	*/
	public void performTransform(ProgressStatus progressStatus) throws IOException
	{
//    	File rootFile=getTargetDirectory();
	    MDLog log=new MDLog(progressStatus);
			performModelToText(log);			
	}
	public void performModelToText(MDLog log) throws IOException
	{
		currentAction=this;
		log.log("starting master-document model to text");
		// this should normally be done after psm created catalog, but primary input is pim model
		File targetDirectory=getTargetDirectory();
		
		String catalogFile=targetDirectory+"/"+CATALOG_FILENAME;
		File mpdFromPimBaseDirectory=targetDirectory.getParentFile();
		File mpdFile=targetDirectory;
		if(mpdFromPimBaseDirectory==null){
			log.log("ERROR: stopping master-document provision; failed to resolve parent directory from targetDirectory "+targetDirectory);
			return;
		}
		modelToTextMasterDocument(targetDirectory, catalogFile,log);

		File masterDocumentTempDirectory=new File(mpdFromPimBaseDirectory.getAbsolutePath()+"/temp~/master-document");
//		File masterDocumentStaticDirectory=new File(basedirCommon,"master-document.static");
//		File mpdStaticDirectory=new File(basedirCommon,"mpd.static");
		File masterDocumentStaticDirectory=new File(getPluginDirectory()+"master-document.static");
		File mpdStaticDirectory=new File(getPluginDirectory()+"mpd.static");
		File masterDocumentOdtFile=new File(mpdFile,MASTER_DOCUMENT_FILENAME);
		File mpdFromPimFile=mpdFromPimBaseDirectory;
		//File mpdTargetDirectory=new File(mpdFromPimFile,mpdName);
		
		masterDocumentTempDirectory.mkdirs();
		zipMasterDocumentOdt(log,masterDocumentTempDirectory,masterDocumentStaticDirectory,masterDocumentOdtFile);
		staticMpdCopy(log,mpdStaticDirectory,mpdFile);
		//stageToMpdFromPIM(log,mpdFile,mpdTargetDirectory);
	}
	/*
	protected void staticMpdCopy(MDLog log,File mpdStaticDirectory,File mpdStagingDirectory) {
		log.log("copy static mpd resources to mpd staging area");
		Utilities.copyDirectory(mpdStaticDirectory, mpdStagingDirectory);
	}
	*/
	protected void modelToTextMasterDocument(File targetFolder,String catalogFile,MDLog log) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
    		args.add(catalogFile);
    	    Model root = getCurrentModelRoot();//project.getModel(); 
    	    if(root==null)return;
    	    log.log("start master document provisioning");
    		MasterDocument masterDocument=new  MasterDocument(root,  targetFolder,args);
    		masterDocument.doGenerate(new BasicMonitor());
    	    log.log("completed master document provisioning");
    		
    		
	}
	 protected String getMpdName(){
		 return getMpdFileName();
	}
	
	public void updateState()
	{
		// enabled if current project contains component stereotyped with mpd
		Boolean enabled=getMpdComponent()!=null;
	    setEnabled(enabled);
	}	

	}