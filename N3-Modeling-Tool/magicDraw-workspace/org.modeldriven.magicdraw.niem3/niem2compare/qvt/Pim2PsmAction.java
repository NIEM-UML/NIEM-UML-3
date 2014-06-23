/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.CatalogType;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.DocumentRoot;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatFactory;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.mpdchangelogFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDSchema;
import org.modeldriven.magicdraw.niem.cam.CAMTransforms;
import org.modeldriven.magicdraw.niem.definition.Definition;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
//import org.modeldriven.magicdraw.niem.cam.MPDFileURIResolver;
import org.modeldriven.magicdraw.niem.m2t.MasterDocument;
import org.modeldriven.magicdraw.niem.mpd.MPDTransforms;


import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ProjectOptions;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;



/**
 * @author Tom
 *
 */
public class Pim2PsmAction extends Pim2SchematronAction
{
	public Pim2PsmAction(String id, String name)
	{
	super(id, name);
	setDescription(PIM_2_PSM_ACTION_TOOLTIP);
	}
	/**
	* Entered when button pushed.
	 * @throws IOException 
	*/
	public void performTransform(ProgressStatus progressStatus) throws IOException
	{
    	File rootFile=getTargetDirectory();
	    MDLog log=new MDLog(progressStatus);
		if(progressStatus!=null)progressStatus.setDescription("starting");
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    try {
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    
		    registerPackages(log,qvtEngine);
	    
		    Application application=Application.getInstance();
		    Model root = getCurrentModelRoot();
		    if(root==null){
		    	log.log("FAILED to obtain model root");
		    	return;
		    }
		    ProjectsManager projectsManager=application.getProjectsManager();
		    Project project=projectsManager.getActiveProject();
		   // project.getRepository().getEventSupport().setEnableEventFiring(false);
		    // save active project;
		    // let active project become psm project 
		    // *********				do save as psm project (making it active project)
		    // later : close psm project;
		    //		reopen original project from its original location
	    	ProjectDescriptor projectDescriptor=ProjectDescriptorsFactory.getDescriptorForProject(project);
		    /*
		    if((!isPsmProjectMerged(project))&&project.isDirty()){
		    	log.log("Saving dirty pim project to "+projectDescriptor.getURI());	
		    	projectsManager.saveProject(projectDescriptor,true);
		    }
		    ProjectDescriptor psmprojectDescriptor=null;
		    if(!isPsmProjectMerged(project)){
			    File psmFile=getPsmFile(projectDescriptor);
			    psmprojectDescriptor=ProjectDescriptorsFactory.createLocalProjectDescriptor(project,psmFile);
		    }
		    */
	        disableEventFiring(project);
		    log.log("disabled event firing for project");
	        // update subset descriptions
	        Definition.INSTANCE.refreshSubsetDefinitions();
		    log.log("refreshed subset deinitions");

		    Set inputModelList = new HashSet();
		    inputModelList.add(root);
		    qvtEngine.put("niemUml", inputModelList);
//		    setTransform("NIEMpim2psmMDPlatform.qvto",qvtEngine);
		    //setTransform("pim2psm.qvto",qvtEngine);
		    log.log("setting pim to psm transform");
		    setPim2psmTransform(qvtEngine);
		    log.log("compile QVT NIEMpim2psm.qvto");
	        qvtEngine.eval((String) null);
		    log.log("QVT pim2psm.qvto step complete ");
		    //project.getRepository().getEventSupport().setEnableEventFiring(true);
	        enableEventFiring(project);

	        // get and save changelog
	    	ResourceSet resourceSet = new ResourceSetImpl();
			Map options=new HashMap();
		    org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
	        Collection<EObject> changeLogs = (Collection<EObject>)qvtEngine.get("changeLog");
        	log.log("changeLogs "+changeLogs.size());
        	if(changeLogs.size()>0){
	        	Resource changeLogResource=resourceSet.createResource(rootURI.appendSegment("changelog.mpdcl"));
	        	changeLogResource.getContents().addAll(changeLogs);
	        	changeLogResource.save(options);
        	}
	        
	        // now do psm2mpd
	        performNiemPsm2MpdTransform(log,rootFile);
	        performNiemPsm2MpdExtendedTransform(log,rootFile);
	    	// update catalog before master doc; instances before schematron
	    	new MPDTransforms().performMPDTransforms(getFrame(),log,rootFile,projectDescriptor);
	    	performPim2SchematronTransform(log,rootFile);
	        if(isMasterDocumentProvisioned(project)){
	        	NIEMQVTPlugin.getMasterDocumentAction().performModelToText(log);
	        }else{
			    log.log("Master Document Provisioning Suppressed for this project ");
	        }
	//new CAMTransforms().performCAMTransforms(getFrame(),log,rootFile);
	//new MPDTransforms().performMPDTransforms(getFrame(),log,rootFile,projectDescriptor);
	
    // close psm project; reload original project and make it current
	// if project option set for exposing psm model:
	//		save the project to psm variant of model;
	//		otherwise close the psm project
	if(!isPsmProjectMerged(project)){
		// find the PSM Model and remove it
		Model psmModel=getPSMModel();
		if((psmModel!=null)&&psmModel.isEditable()){
			boolean isSessionCreated=NIEMHelper.createSession("PSMRemove");
			try{
			psmModel.dispose();
			}finally{
				NIEMHelper.closeSession(isSessionCreated);
			}
		}
		/*
		psmRoot:=topRoot.nestedPackage
				->select(p|p.name='PSM').oclAsType(UML::Model)->asSequence()->first();
			if(psmRoot.oclIsUndefined().not())then psmRoot.removeElement() endif;
		if(isPsmProjectPreserved(project)){
			log.log("Saving PSM project to "+psmprojectDescriptor.getURI());	
	    	projectsManager.saveProject(psmprojectDescriptor,true);
		
		}else{
			log.log("Closing temporary PSM project ");	
			projectsManager.closeProject();
		}
		log.log("Restoring and activating project from "+projectDescriptor.getURI());	
	    projectsManager.loadProject(projectDescriptor, true);
	    project=projectsManager.findProject(projectDescriptor);
	    projectsManager.setActiveProject(project);
	*/  
	} 

		    log.log("QVT evaluation complete ");
	    	//javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PIM to PSM complete");
	    }

	    catch (CancelError e)

	    {
		    //log.log("NIEM PIM to PSM Cancelled by User "); causes another cancelError
	    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PIM to PSM Cancelled by User ");
    }

    catch (Throwable e)

    {
	    log.log("NIEM PIM to PSM error "+e);
    	if(progressStatus!=null)javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PIM to PSM error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);

        e.printStackTrace();

    }
	
	}
	protected void setPim2psmTransform(ScriptEngine qvtEngine){
	    setTransform("pim2psm.qvto",qvtEngine);
		
	}
	protected void setPsm2mpdTransform(ScriptEngine qvtEngine){
	    setTransform("NIEMmpdmodel2artifact.qvto",qvtEngine);
	}

	protected boolean isMasterDocumentProvisioned(Project project){
		boolean result=true;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					PROVISION_MASTERDOCUMENT_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
			
		
	}
	/*
	protected boolean isPsmProjectPreserved(Project project){
		boolean result=false;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					PRESERVE_PSM_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
			
		
	}
	*/
	protected boolean isPsmProjectMerged(Project project){
		boolean result=false;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					MERGE_PSM_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
			
		
	}
	/*
	protected File getPsmFile(ProjectDescriptor projectDescriptor){
		URI uri=projectDescriptor.getURI();
		File file=new File(uri);
		String fileName=file.getName();
		String psmFileName=fileName;
		if(fileName.startsWith("psm.")){
			
		}else{
			psmFileName="psm."+fileName;
		}
		File psmFile=new File(file.getParentFile(),psmFileName);
		return psmFile;
	}
	*/
//////////////////////	
	public void performNiemPsm2MpdExtendedTransform(MDLog log,File rootFile) throws Exception
	{
		// intended to be overridden
	}
	public void performNiemPsm2MpdTransform(MDLog log,File rootFile)
	{
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    try {
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    registerPackages(log,qvtEngine);
		    registerFactories(log);

		    Model root = getCurrentModelRoot();
		    if(root==null)return;
		    Set inputModelList = new HashSet();
		    inputModelList.add(root);
		    qvtEngine.put("uml", inputModelList);
		    /*
		    log.log("performNiemPsm2MpdTransform 1 ");
//		    Set outputXsdList = new HashSet();
		    Set<EObject> schemas = new HashSet<EObject>();
//		    outputXsdList.add(XSDFactory.eINSTANCE.createXSDSchema());
		    schemas.add(XSDFactory.eINSTANCE.createXSDSchema());
		    qvtEngine.put("xsd", schemas);
//		    qvtEngine.put("xsd", null);
		    
		    Set<EObject> changeLogs = new HashSet<EObject>();
		    //changeLogs.add(mpdchangelogFactory.eINSTANCE.createDocumentRoot());
		    changeLogs.add(mpdchangelogFactory.eINSTANCE.createDocumentRoot());
		    qvtEngine.put("changeLog", changeLogs);
		    Set<EObject> cats = new HashSet<EObject>();
		    cats.add(mpdcatFactory.eINSTANCE.createDocumentRoot());
		    qvtEngine.put("cat", cats);
		    */
	        //Collection<EObject> oldschemas = (Collection<EObject>)qvtEngine.get("xsd");
	        //if(oldschemas!=null)oldschemas.clear();// unsupported operation
		    org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
	    	ResourceSet resourceSet = new ResourceSetImpl();
		    
		    // add infrastructure schemas 
		    // in schemaForProxy:XSD,in schemaForStructures:XSD,in schemaForAppinfo:XSD,in schemaForAppinfo2:XSD
		    // copy these from static location to target, open, and register with qvtEngine
		    addNiemSchemas(log,qvtEngine,rootFile,rootURI,resourceSet);
			removeSvnDirectories(rootFile);

//		    setTransform("pim2niem.qvto",qvtEngine);
//		    setTransform("psm2mpd.qvto",qvtEngine);
//		    setTransform("NIEMmpdmodel2artifact.qvto",qvtEngine);
			setPsm2mpdTransform(qvtEngine);
			//
		    
		    //log.log("compile pim2niem.qvto QVT target root = "+rootFile.getAbsolutePath());
	        qvtEngine.eval((String) null);
		    log.log("NIEMmpdmodel2artifact.qvto complete");
	    	
			serializeResults(log,qvtEngine,rootURI,resourceSet);
	    /*	
		    // schema
	        Collection<EObject> schemas = (Collection<EObject>)qvtEngine.get("xsd");
        	log.log("schemas "+schemas.size());
	        for(EObject schema:schemas){
	        	//log.log("schema "+schema);
	        	if(XSDSchema.class.isInstance(schema)){
	        		Blackbox.splitSchemas((XSDSchema)schema ,rootURI,resourceSet,log);
	        	}

	        }
			Map options=new HashMap();
	        // changelog
	        Collection<EObject> changeLogs = (Collection<EObject>)qvtEngine.get("changeLog");
        	log.log("changeLogs "+changeLogs.size());
        	if(changeLogs.size()>0){
            	Resource changeLogResource=resourceSet.createResource(rootURI.appendSegment("changelog.mpdcl"));
	        	changeLogResource.getContents().addAll(changeLogs);
	        	changeLogResource.save(options);
        	}
        	// catalog
	        Collection<EObject> cats = (Collection<EObject>)qvtEngine.get("cat");
        	log.log("cats "+cats.size());
        	if(cats.size()>0){
        	Resource catResource=resourceSet.createResource(rootURI.appendSegment(CATALOG_FILENAME));
        	catResource.getContents().addAll(cats);
        	catResource.save(options);
        	}
        	// wantlist
	        Collection<EObject> wantlists = (Collection<EObject>)qvtEngine.get("wantlist");
        	log.log("wantlists "+wantlists.size());
        	if(wantlists.size()>0){
        	Resource wantlistResource=resourceSet.createResource(rootURI.appendSegment(XMLSCHEMA_DIRECTORYNAME).appendSegment(NIEM_DIRECTORYNAME).appendSegment(WANTLIST_FILENAME));

        	wantlistResource.getContents().addAll(wantlists);
        	wantlistResource.save(options);
        	}
        	*/
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
        e.printStackTrace();
    	log.log( "NIEM PSM to MPD error "+e);
    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "NIEM PSM to MPD error "+e);//+", psmmoduleFilePath "+psmprojectDescriptor+", "+psmURI);


    }
	
	}
	protected void serializeResults(MDLog log,ScriptEngine qvtEngine,org.eclipse.emf.common.util.URI rootURI,ResourceSet resourceSet) throws IOException{
	    // schema
        Collection<EObject> schemas = (Collection<EObject>)qvtEngine.get("xsd");
    	log.log("schemas "+schemas.size());
        for(EObject schema:schemas){
        	//log.log("schema "+schema);
        	if(XSDSchema.class.isInstance(schema)){
        		Blackbox.splitSchemas((XSDSchema)schema ,rootURI,resourceSet,log);
        	}

        }
		Map options=new HashMap();
        // changelog
		/* moved to pim2psm
        Collection<EObject> changeLogs = (Collection<EObject>)qvtEngine.get("changeLog");
    	log.log("changeLogs "+changeLogs.size());
    	if(changeLogs.size()>0){
        	Resource changeLogResource=resourceSet.createResource(rootURI.appendSegment("changelog.mpdcl"));
        	changeLogResource.getContents().addAll(changeLogs);
        	changeLogResource.save(options);
    	}
    	*/
    	// catalog
        Collection<EObject> cats = (Collection<EObject>)qvtEngine.get("cat");
    	log.log("cats "+cats.size());
    	if(cats.size()>0){
    	Resource catResource=resourceSet.createResource(rootURI.appendSegment(CATALOG_FILENAME));
    	catResource.getContents().addAll(cats);
    	catResource.save(options);
    	}
    	// wantlist
        Collection<EObject> wantlists = (Collection<EObject>)qvtEngine.get("wantlist");
    	log.log("wantlists "+wantlists.size());
    	if(wantlists.size()>0){
    	Resource wantlistResource=resourceSet.createResource(rootURI.appendSegment(XMLSCHEMA_DIRECTORYNAME).appendSegment(SUBSET_DIRECTORYNAME).appendSegment(NIEM_DIRECTORYNAME).appendSegment(WANTLIST_FILENAME));

    	wantlistResource.getContents().addAll(wantlists);
    	wantlistResource.save(options);
    	}
		
	}
	protected void addNiemSchemas(MDLog log,ScriptEngine qvtEngine,File rootFile,org.eclipse.emf.common.util.URI rootURI,ResourceSet resourceSet){
	    // in schemaForProxy:XSD,in schemaForStructures:XSD,in schemaForAppinfo:XSD,in schemaForAppinfo2:XSD
	    // copy these from static location to target, open, and register with qvtEngine
		// copy to target
		File niemSchemasSource=new File(getPluginDirectory()+"niemSchemas");
		Utilities.copyDirectory(niemSchemasSource, rootFile);
		// open target resources
		// register with qvtEngine
    	log.log("addNiemSchemas ");
		openNiemSchema(log,rootURI,XMLSCHEMA_DIRECTORYNAME+"/"+SUBSET_DIRECTORYNAME+"/"+NIEM_DIRECTORYNAME+"/proxy/xsd/2.0/xsd.xsd",resourceSet,qvtEngine,"schemaForProxy");
		openNiemSchema(log,rootURI,XMLSCHEMA_DIRECTORYNAME+"/"+SUBSET_DIRECTORYNAME+"/"+NIEM_DIRECTORYNAME+"/structures/2.0/structures.xsd",resourceSet,qvtEngine,"schemaForStructures");
		openNiemSchema(log,rootURI,XMLSCHEMA_DIRECTORYNAME+"/"+SUBSET_DIRECTORYNAME+"/"+NIEM_DIRECTORYNAME+"/appinfo/2.0/appinfo.xsd",resourceSet,qvtEngine,"schemaForAppinfo");
		openNiemSchema(log,rootURI,XMLSCHEMA_DIRECTORYNAME+"/"+SUBSET_DIRECTORYNAME+"/"+NIEM_DIRECTORYNAME+"/appinfo/2.1/appinfo.xsd",resourceSet,qvtEngine,"schemaForAppinfo2");
	}
	protected void openNiemSchema(MDLog log,org.eclipse.emf.common.util.URI rootURI,
				String schemaLocation,ResourceSet resourceSet,ScriptEngine qvtEngine,String parameterName){
		org.eclipse.emf.common.util.URI targetURI=org.eclipse.emf.common.util.URI.createURI(rootURI+"/"+schemaLocation);
		Resource targetResource=resourceSet.getResource(targetURI, true);
    	log.log("openNiemSchema at "+targetURI);//+", resource "+targetResource);
	    qvtEngine.put(parameterName, targetResource.getContents());
	}
	/*
	static public String getNiemSchemasDir(){
		return getPluginDirectory()+"niemSchemas/";
	}
	*/
	
	protected void signOffMessage(){
	}
	
	public void updateState()
	{
		setMpdComponentStateEnabled();
	}	
	}