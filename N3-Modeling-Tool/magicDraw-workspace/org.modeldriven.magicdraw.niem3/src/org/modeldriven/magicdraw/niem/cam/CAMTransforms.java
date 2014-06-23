package org.modeldriven.magicdraw.niem.cam;

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
//import org.eclipse.ui.PlatformUI;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
public class CAMTransforms implements NIEM_ProfileConstants{
	protected void updateCatalog(MDLog log,Catalog cat,String outputFilename,String directory,String natureURI,String purposeURI,String description) throws Exception{
		// add file entry to catalog if it does not already exist
		String relativePathName="./"+outputFilename.substring(directory.length()+1).replace("\\","/").replace(" ","%20");
		for(EObject test:cat.getUri()){
			if(Uri.class.isInstance(test)){
				Uri testFileType=(Uri)test;
				if(relativePathName.equals(testFileType.getUri()))return;
			}
		}
		Uri fileType=CatalogFactory.eINSTANCE.createUri();
		Blackbox.add(cat, "artifactGroup", "file", fileType, null);
		/* not in NIEM3
		fileType.setNatureURI(natureURI);
		fileType.setPurposeURI(purposeURI);
		fileType.setRelativePathName(relativePathName);
		fileType.setDescriptionText(description);
		*/
		
	}
	protected String getDocumentationDirectory(String rootDirectory){
		String result= rootDirectory+"/documentation";
		new File(result).mkdirs();
		return result;
	}
	protected String getSampleDirectory(String rootDirectory){
		String result= rootDirectory+"/XMLsamples";
		new File(result).mkdirs();
		return result;
	}
	protected String getLibraryDirectory(String rootDirectory){
		String result= rootDirectory+"/library";
		new File(result).mkdirs();
		return result;
	}
	protected Collection<String> getExchangeSchemaFileNames(MDLog log,Catalog cat,String directory) {
		// find the PSM and its MPD; check each MPDFile for being an Exchange, use its relativePathName to determine fileName
		Collection<String> result=new Vector<String>();
		for(String relativePathname:getExchangeSchemaRelativePathNames(log,cat)){
			result.add(directory+"/"+relativePathname);
		}
		return result;
	}
	protected Collection<String> getExchangeSchemaRelativePathNames(MDLog log,Catalog cat) {
		// scan catalog; check each MPDFile for being an Exchange, use its relativePathName to determine fileName
		Collection<String> result=new Vector<String>();
		for(EObject artifact:cat.getUri()){
			if(Uri.class.isInstance(artifact)){
				Uri fileType=(Uri)artifact;
				// TODO: need to adjust for NIEM 3
				if(NIEM_PURPOSES_EXCHANGE_SCHEMA.equals(fileType.getPurposeURI())){
					String relativePath=fileType.getUri();
					if(relativePath.startsWith("./"))relativePath=relativePath.substring(2);
					result.add(relativePath);
				}
			}
		}
		return result;
	}
}
