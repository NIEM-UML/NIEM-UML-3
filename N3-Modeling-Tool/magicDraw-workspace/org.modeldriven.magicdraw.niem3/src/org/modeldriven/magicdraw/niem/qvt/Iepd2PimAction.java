/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;
/*
import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogFactory;
*/
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.CatalogType;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.DocumentRoot;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.MPDClassCodeSimpleType;
import gov.niem.reference.niem.resource.mpd.catalog._1.mpdcat.mpdcatFactory;
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
import java.util.Vector;
import java.util.zip.ZipFile;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

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
import com.nomagic.ui.SimpleBaseDialog;
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
public class Iepd2PimAction extends Mpd2PsmAction
{
	public static String xsdfileNameSuffix=".xsd";
	public Iepd2PimAction(String id, String name)
	{
	super(id, name);
	setDescription(IEPD_2_PIM_ACTION_TOOLTIP);
	}
	public void performTransform(ProgressStatus progressStatus)
	{
		// select the iepd zip; then unzip it
		// select exchange schemas
		/// (optional) select extension schemas
		// build catalog 
		// continue as per Mpd2PsmAction
		progressStatus.setDescription("starting");
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    MDLog log=new MDLog(progressStatus);
	    try {
		    executionContext.setLog(log);
		    //log.log("Iepd2Pim "+System.getProperty("user.name"));
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    registerPackages(log,qvtEngine);
		    
	    	ResourceSet resourceSet = new ResourceSetImpl();
	    	// change input to an mpd.zip
	    	String catFileName=CATALOG_FILENAME;
	    	String fileNameSuffix=".zip";
	    	 JFileChooser chooser = new JFileChooser();
	    	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	    	        "IEPD zip file", "zip");
	    	    chooser.setFileFilter(filter);
	    	    chooser.setDialogTitle("Import From IEPD *.zip or Directory");
	    	    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    	    chooser.setDialogType(JFileChooser.OPEN_DIALOG);
	    	    chooser.setMultiSelectionEnabled(false);
	    	    int returnVal = chooser.showOpenDialog(getFrame());
	    	    if(returnVal != JFileChooser.APPROVE_OPTION) {
			    	log.log("user cancelled ");
			    	return;
	    	    }
		    	File dstDir=null;
		    	File chosenFile=chooser.getSelectedFile();
		    	if(chosenFile.isDirectory()){
		    		dstDir=chosenFile;
		    	}else{
		    		dstDir=extractZip(chosenFile.getAbsolutePath(),log);		    		
		    	}
	    	    log.log("You chose to open this file: " +
	    	    		chosenFile.getName());
	    	
	    	if(dstDir==null)return;
	    	// normally one level down
	    	File[] dirContent=dstDir.listFiles();
	    	if((dirContent.length==1)&&dirContent[0].isDirectory()){
	    		dstDir=dirContent[0];
	    	}
	    	///////exchange schema select
	    	Collection<File> allSchemas=getAllSchemas(dstDir);
	    	String[] allSchemaRelativePaths=getAllSchemaRelativePaths(allSchemas,dstDir);
	    	Icon icon=null;
	    	String initialSelectionValue=null;
	    	String longValue=null;
	    	List<String[]> selectionResult=IepdSchemaSelection.showDialog(getFrame(),null,
                    "Select Exchange Schemas.  \n"
	    			+"It is sufficient to select just the Exchange Schemas, since transitive closure of schema references will establish any required Extension Schemas. \n"
	    			,
                    "Exchange and Extension Schema Selection",
                    allSchemaRelativePaths,
                    "Select Extension Schemas.  \n"
	    			+"Extension Schema selection is required only when Exchange Schemas have not (yet) been defined. \n"
                     );
	    	
    	    log.log("Selected file: " +selectionResult);
    	    if((selectionResult==null)||(selectionResult.size()!=2))return;
	    	Collection <File> schemas=new Vector<File>();
	    	Collection <File> extschemas=new Vector<File>();
	    	for(String relativePath:selectionResult.get(0)){
	    		schemas.add(new File(dstDir.getAbsolutePath()+"/"+relativePath));
	    	}
	    	for(String relativePath:selectionResult.get(1)){
	    		extschemas.add(new File(dstDir.getAbsolutePath()+"/"+relativePath));
	    	}
	    	// construct the catalog
	    	File catFile=new File(dstDir,catFileName);
        	Resource catResource=resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI(catFile.getAbsolutePath()));
	    	DocumentRoot documentRoot=mpdcatFactory.eINSTANCE.createDocumentRoot();
	    	catResource.getContents().add(documentRoot);
	    	CatalogType catalogType=mpdcatFactory.eINSTANCE.createCatalogType();
	    	String catName=dstDir.getName();
	    	String mpdDescriptionText="";
	    	MPDClassCodeSimpleType mpdClassCode=MPDClassCodeSimpleType.IEPD;
	    	
	    	String mpdVersionID="1";
	    	if(catName.endsWith(".rel")){
	    		catName=catName.substring(0, catName.length()-4);
	    		mpdClassCode=MPDClassCodeSimpleType.RELEASE;
	    	}else if(catName.endsWith(".cu")){
	    		catName=catName.substring(0, catName.length()-3);
	    		mpdClassCode=MPDClassCodeSimpleType.CORE_UPDATE;
	    	}else if(catName.endsWith(".du")){
	    		catName=catName.substring(0, catName.length()-3);
	    		mpdClassCode=MPDClassCodeSimpleType.DOMAIN_UPDATE;
	    	}else if(catName.endsWith(".iepd")){
	    		catName=catName.substring(0, catName.length()-5);
	    		mpdClassCode=MPDClassCodeSimpleType.IEPD;
	    	}else if(catName.endsWith(".eiem")){
	    		catName=catName.substring(0, catName.length()-5);
	    		mpdClassCode=MPDClassCodeSimpleType.EIEM;
	    	}
	    	String mpdName=catName;
	    	int versionIndex=catName.lastIndexOf("-");
	    	if((versionIndex>0)&&(versionIndex<(catName.length()-1))){
	    		mpdName=catName.substring(0, versionIndex);
	    		mpdVersionID=catName.substring(versionIndex+1);
	    	}
	    	
	    	catalogType.setMpdName(mpdName);
	    	catalogType.setMpdVersionID(mpdVersionID);
	    	catalogType.setMpdClassCode(mpdClassCode);
	    	
	    	String mpdURI="http://myiepd.org/"+mpdName+"/"+mpdVersionID+"/";
	    	
	    	catalogType.setMpdURI(mpdURI);
	    	catalogType.setDescriptionText(mpdDescriptionText);
	    	
	    	
	    	documentRoot.setCatalog(catalogType);
	    	for(File schema:schemas){
	    		FileType fileType=mpdcatFactory.eINSTANCE.createFileType();
	    		Blackbox.add(catalogType, "artifactGroup", "file", fileType, null);
	    		fileType.setDescriptionText("Exchange schema");
	    		fileType.setNatureURI(NIEM_NATURES_XSD);
	    		fileType.setPurposeURI(NIEM_PURPOSES_EXCHANGE_SCHEMA);
	    		fileType.setRelativePathName(getRelativePathName(dstDir,schema));
	    	}
	    	for(File schema:extschemas){
	    		FileType fileType=mpdcatFactory.eINSTANCE.createFileType();
	    		Blackbox.add(catalogType, "artifactGroup", "file", fileType, null);
	    		fileType.setDescriptionText("Extension schema");
	    		fileType.setNatureURI(NIEM_NATURES_XSD);
	    		fileType.setPurposeURI(NIEM_PURPOSES_EXTENSION_SCHEMA);
	    		fileType.setRelativePathName(getRelativePathName(dstDir,schema));
	    	}
        	mpd2pim(catResource,qvtEngine,log);
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
	
	protected String[] getAllSchemaRelativePaths(Collection<File> allSchemas,File dstDir){
		Collection<String> paths=new Vector<String>();
		int dstDirLen=dstDir.getAbsolutePath().length()+1;
		for(File file:allSchemas){
			String path=file.getAbsolutePath().substring(dstDirLen);
			paths.add(path);
		}
		return paths.toArray(new String[0]);
	}
protected 	Collection<File> getAllSchemas(File dstDir){
	Collection<File> schemas=new Vector<File>();
	getAllSchemas(dstDir,schemas);
	return schemas;
}
protected void getAllSchemas(File dstDir,	Collection<File> schemas){
	for(File file:dstDir.listFiles()){
		if(file.isDirectory())getAllSchemas(file,schemas);
		else if(isSchemaFile(file))schemas.add(file);
	}
}
protected boolean isSchemaFile(File file){
	return file.getName().endsWith(".xsd");
}
protected String	getRelativePathName(File destDir,File schema){
	//  ./Schema/extension.xsd
	if(schema==null)return ".";
	if(destDir.equals(schema))return ".";
	String result=getRelativePathName(destDir,schema.getParentFile())+"/"+schema.getName();
	return result;
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
	
	public void updateState()
	{
		// enabled always
		Boolean enabled=true;
		setEnabled(enabled);
	}
	////////////////////////////////////////////////////////////////////////
	static public class XSDFileChooser extends JFileChooser{
		public XSDFileChooser(File dstDir){
			super(dstDir);
		}
		public boolean accept(File f){
			return isXsdDirectory(f)||f.getName().endsWith(xsdfileNameSuffix);
		}
		protected boolean isXsdDirectory(File f){
			if(!f.isDirectory())return false;
			for(File file:f.listFiles()){
				if(accept(file))return true;
			}
			return false;
		}
}

	}