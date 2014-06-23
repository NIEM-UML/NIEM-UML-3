package org.modeldriven.magicdraw.niem.mpd;

import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogFactory;

import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xsd.XSDSchema;
import org.modeldriven.magicdraw.niem.cam.CAMTransforms;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.qvt.InstanceDocumentAction;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.MasterDocumentAction;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.UmlInstanceDocumentAction;

import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.utils.Utilities;


public class MPDTransforms extends CAMTransforms{
	public void performMPDTransforms(Frame frame,MDLog log,File rootFile,ProjectDescriptor projectDescriptor) throws Exception
	{
		
		String complexTypeName=null;
		String directory=rootFile.getAbsolutePath();
		File directoryFile=new File(directory);
		//File tmpFolderFile=new File(directoryFile.getParent()+"/MPDtmp~");
		//String tmpFolder=tmpFolderFile.getAbsolutePath();
		//tmpFolderFile.mkdirs();
		String catFileName=CATALOG_FILENAME;
    	File catFile=new File(rootFile,catFileName);
    	if(!catFile.exists()){
	    	javax.swing.JOptionPane.showMessageDialog( frame, "Catalog File does not exist: "+catFile);
	    	return;
    	}
    	log.log("load catalog from "+catFile);
    	ResourceSet resourceSet = new ResourceSetImpl();
    	Resource catResource=resourceSet.getResource(org.eclipse.emf.common.util.URI.createFileURI(catFile.getAbsolutePath()),true);
    	for(EObject content:catResource.getContents()){
    		if(!DocumentRoot.class.isInstance(content))continue;
    		DocumentRoot documentRoot=(DocumentRoot)content;
    		Catalog cat=documentRoot.getCatalog();
    		
			String libraryDirectory=getLibraryDirectory(directory);
			String umllibraryDirectory=libraryDirectory+"/uml";
			new File(umllibraryDirectory).mkdirs();
    		// copy model file to target iepd
			URI umlModelURI=projectDescriptor.getURI();
			
    		File umlModelFile=new File(umlModelURI);
    		File iepdUmlModelFile=new File(umllibraryDirectory,umlModelFile.getName());
    		String modelFilename=iepdUmlModelFile.getAbsolutePath();
    		Utilities.copyFile(umlModelFile,iepdUmlModelFile);
	    	updateCatalog(log,cat,modelFilename,directory,NIEM_NATURES_ZIP,NIEM_PURPOSES_DATAMODEL,"Serves the purpose of a formal representation (e.g., UML) of business data requirements that indicates data semantics, structure, and relationships.");
    		// find any exchange schemas; generate sample docs via m2t from schema to xml
	    	createXmlInstanceDocuments( log, cat, directory, resourceSet);

			// TODO: produce sample xml, wantlist, model copy, spreadsheet ?, changelog, ......
			// register wantlist, master-doc, catalog  (xslt?)
	    	String masterDocFilename=directory+"/"+MASTER_DOCUMENT_FILENAME;
	    	String catalogFilename=directory+"/"+CATALOG_FILENAME;
	    	String wantlistFilename=directory+"/"+XMLSCHEMA_DIRECTORYNAME+"/"+SUBSET_DIRECTORYNAME+"/"+NIEM_DIRECTORYNAME+"/"+WANTLIST_FILENAME;
	    	String sampleXslFilename=directory+"/"+XMLSAMPLES_DIRECTORYNAME+"/"+XSL_DIRECTORYNAME+"/"+XMLVIEWER_FILENAME;
	    	updateCatalog(log,cat,masterDocFilename,directory,NIEM_NATURES_DOC,NIEM_PURPOSES_MASTER_DOC,"Serves the purpose of a primary source of documentation; a readme file; a first documentation source to consult and one that may reference other supplemental documentation.");
	    	updateCatalog(log,cat,catalogFilename,directory,NIEM_NATURES_CATALOG,NIEM_PURPOSES_CATALOG,"Serves the purpose of identifying, locating, and describing all artifacts in a model package description.");

	    	updateCatalog(log,cat,wantlistFilename,directory,NIEM_NATURES_WANTLIST,NIEM_PURPOSES_WANTLIST,"Serves the purpose of an XML instance document that represents a NIEM schema subset and is an input to or output from the NIEM Schema Subset Generation Tool.");
	    	updateCatalog(log,cat,sampleXslFilename,directory,NIEM_NATURES_XSLT,NIEM_PURPOSES_TRANSFORMATION,"Serves the purpose of formatting information for viewing on a computer monitor.");
    	}
    	Map saveMap=new HashMap();
    	catResource.save(saveMap);
	}
	protected void createXmlInstanceDocuments(MDLog log,Catalog cat,String directory,ResourceSet resourceSet) throws IOException{
		getUmlInstanceDocumentAction().performModelToText(log,cat);
	}
	protected static UmlInstanceDocumentAction umlInstanceDocumentAction=new UmlInstanceDocumentAction("umlInstanceDocument","NIEM MPD Instance Document from UML");
	public static UmlInstanceDocumentAction getUmlInstanceDocumentAction(){
		return umlInstanceDocumentAction;
	}
	
}
