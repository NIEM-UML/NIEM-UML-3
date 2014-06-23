/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;

import com.nomagic.ci.persistence.PersistenceException;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.qvt.jsr223.QVTEngineConstants;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.utils.Utilities;



/**
 * @author Tom
 *
 */
public class LibBuildAction extends Mpd2PsmAction
{
	public LibBuildAction(String id, String name)
	{
	super(id, name);
	}
	protected ExecutionContextImpl getExecutionContext(ScriptEngine libBuildScriptEngine){
		return (ExecutionContextImpl)libBuildScriptEngine.get(QVTEngineConstants.QVTO_EXECUTION_CONTEXT);
	}
	protected ScriptEngine getLibBuildScriptEngine(ProgressStatus progressStatus){
	    MDLog log=new MDLog(progressStatus);
	    ScriptEngine libBuildScriptEngine = getQvtEngine();
		    if(libBuildScriptEngine!=null){
			    ExecutionContextImpl executionContext=new ExecutionContextImpl();
			    libBuildScriptEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
			    registerPackages(log,libBuildScriptEngine);
			    setTransform("libBuildmpd2pim.qvto",libBuildScriptEngine);
		    }
//		}
		getExecutionContext(libBuildScriptEngine).setLog(log);
	    return libBuildScriptEngine;
	}
	/**
	* Entered when button pushed.
	*/
	public void performTransform(ProgressStatus progressStatus)
	{
		progressStatus.setDescription("starting");
	    try {
	    	// change input to an mpd.zip
	    	String fileNameSuffix=".properties";
	    	String fileName="*"+fileNameSuffix;
	    	FileDialog fd=new FileDialog(getFrame(),"open "+fileName);
	    	fd.setFile(fileName);
	    	String dir=getPropertiesDir();
	    	fd.setDirectory(dir);

	    	fd.setVisible(true);
	    	if((fd.getFile()==null)||(fd.getDirectory()==null)){
		    	log("user cancelled "+fd.getDirectory()+" "+fd.getFile());
		    	return;
	    	}
	    	if(!fd.getFile().endsWith(fileNameSuffix)){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Illegal filename for import: "+fd.getFile()+" should be a "+fileName);
		    	return;
	    	}
	    	File propertiesFile=new File(fd.getDirectory()+fd.getFile());
	    	InputStream inStream=new FileInputStream(propertiesFile);
	    	Properties properties=new Properties();
	    	properties.load(inStream);
	    	inStream.close();
	    	// use that file as master list of property files to be loaded
	    	
	    	String propertyFiles=properties.getProperty("niem.reference.properties");
	        StringTokenizer st = new StringTokenizer(propertyFiles,";");
	        while(st.hasMoreTokens()){
	        	String propertyFileName=st.nextToken();
		        String propertyFilePath = dir+ propertyFileName;
		        performModuleTransform(progressStatus,new File(propertyFilePath));
	        }
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
	@SuppressWarnings("unchecked")
	public void performModuleTransform(ProgressStatus progressStatus,File propertiesFile) throws ScriptException, IOException, PersistenceException
	{
    	String dir=getPropertiesDir();
	    ScriptEngine qvtEngine = getLibBuildScriptEngine(progressStatus);
	    if(qvtEngine==null)return;
	    MDLog log=(MDLog)getExecutionContext(qvtEngine).getLog();
	    	ResourceSet resourceSet = new ResourceSetImpl();
	    	InputStream inStream=new FileInputStream(propertiesFile);
	    	Properties properties=new Properties();
	    	properties.load(inStream);
	    	inStream.close();
	    	String mpdZip=properties.getProperty("mpd.zip");
	    	String catalog=properties.getProperty("catalog");
	    	String niemLibrary=properties.getProperty("niem.library");
	    	String niemLibraryImport=properties.getProperty("niem.library.import");
	    	String sharedPackageParent=properties.getProperty("sharedPackageParent");
	    	log.log("Properties "+properties);
	    	File dstDir=extractZip(getInstallRootDirectory()+mpdZip,log);
	    	if(dstDir==null)return;
	    	
	    	// normally one level down
	    	File[] dirContent=dstDir.listFiles();
	    	if((dirContent.length==1)&&dirContent[0].isDirectory()){
	    		dstDir=dirContent[0];
	    	}
	    	
	    	
	    	File srcCatFile=new File(dir+catalog);
	    	File catFile=new File(dstDir,catalog);
	    	if(!srcCatFile.exists()){
		    	javax.swing.JOptionPane.showMessageDialog( getFrame(), "Catalog File does not exist: "+srcCatFile);
		    	return;
	    	}
	    	// copy to dest dir
			Utilities.copyFile(srcCatFile, catFile);
	    	
	    	log.log("load catalog from "+catFile);
        	Resource catResource=resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(catFile.getAbsolutePath()),true);
		    Set catList = new HashSet();
	    	log.log("loaded catalog resource "+catResource);
		    catList.addAll(catResource.getContents());
	    	//log.log("catalog contents "+catList);
		    qvtEngine.put("cat", catList);
		    Application application=Application.getInstance();
		    ProjectsManager projectsManager=application.getProjectsManager();
		    
	    	log.log("creating project using "+projectsManager);
	        Project pimProject=projectsManager.createProject();
	    	log.log("useCommonIndexing ");
	        useCommonIndexing(pimProject);
	        disableEventFiring(pimProject);
	        Model pimModel=pimProject.getModel();
		    Set psmUmlModelList = new HashSet();
		    psmUmlModelList.add(pimModel);
		    qvtEngine.put("pimUml", psmUmlModelList);
		    // add required profiles and base models via useModule
	        String profilesdir = getProfilesDir();
	        String psmmoduleFilePath = profilesdir+ NIEM_DSL_FILENAME;
	        
	    	log.log("useModule "+psmmoduleFilePath);
	        useModule(psmmoduleFilePath,log,pimProject);
	    	log.log("useXmlLibrary ");
	        useXmlLibrary(log,pimProject);
	        
	        String librarydir = getLibraryDir();
	        StringTokenizer st = new StringTokenizer(niemLibraryImport,";");
	        while(st.hasMoreTokens()){
	        	String library=st.nextToken();
		        String psmmoduleFilePath2 = librarydir+ library;
		        useModule(psmmoduleFilePath2,log,pimProject);
	        }
	        
	    	log.log("start qvt ");
	        qvtEngine.eval((String) null);
	        
	        // diagrams
	    	log.log("createDiagrams ");
//if(true){log("WARNING: suppress diagrams");}else  // this does not prevent hangs from occuring either/ hangs on creating project	        
	        createDiagrams(pimProject); 
	        
	        try{
	        for(Package pe:getCurrentModelRoot().getNestedPackage()){
	        	if(pe.isEditable()){
	        		toCanonicalIDs(pe);
	        	}
	        }
	        }catch(Throwable t){
	        	log("ERROR: during conversion to canonical IDs "+t);
	        }
	        try{
	        enableEventFiring(pimProject);
	        }catch(Throwable t){
	        	log("ERROR: during enableEventFiring "+t);
	        	//return;
	        }
	        try{
	        shareModule(niemLibrary,log,pimProject,sharedPackageParent);
	        }catch(Throwable t){
	        	log("ERROR: during shareModule "+t);
	        	return;
	        }

	        try{
	        saveProject(log,pimProject,getAbsoluteLibraryDir()+niemLibrary);
	        }catch(Throwable t){
	        	log("ERROR: during saveProject "+t);
	        	return;
	        }
	        /* moving diagrams here did not help
	        try{
	        createDiagrams(pimProject);// this was move from above, test if diagrams after save is better
	        saveProject(log,pimProject,getAbsoluteLibraryDir()+niemLibrary);
	        }catch(Throwable t){
	        	log("ERROR: during second saveProject "+t);
	        	return;
	        }
	        */
	        // TODO: for now, single project load; check validation results;
	        // TODO: check if we can repeatedly do single project loads
	        // TODO: the symbol renderer ?
//if(true){log("WARNING: suppressing closeProject");}else // suppressing close does not help	        
	        try{
	        projectsManager.closeProject();
	        }catch(Throwable t){
	        	log("ERROR: during closeProject "+t);
	        }
	        
	}
}