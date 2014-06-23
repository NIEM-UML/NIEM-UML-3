/**
 * 
 */
package org.modeldriven.magicdraw.niem.mpd;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
//import java.net.URI;
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
//import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.wst.xml.core.internal.contentmodel.CMDocument;
import org.eclipse.wst.xml.core.internal.contentmodel.util.ContentBuilder;
import org.eclipse.wst.xml.core.internal.contentmodel.util.DOMContentBuilder;
import org.eclipse.wst.xml.ui.internal.wizards.NewXMLGenerator;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSchemaContent;
import org.modeldriven.magicdraw.niem.m2t.InstanceDocument;
import org.modeldriven.magicdraw.niem.m2t.MasterDocument;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.Rfp2DocAction;

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
public class XSD2InstanceDocumentAction extends Rfp2DocAction
{
//	  protected NewXMLGenerator generator;
	  protected XMLInstanceGenerator generator;
	public XSD2InstanceDocumentAction(String id, String name)
	{
	super(id, name);
	}
	
	/**
	* Entered when button pushed.
	 * @throws Exception 
	*/
	/*
	public void performTransform(ProgressStatus progressStatus) throws IOException
	{
//    	File rootFile=getTargetDirectory();
	    MDLog log=new MDLog(progressStatus);
			performModelToText(log);			
	}
	*/

	public void performModelToText(MDLog log,XSDSchema root,File schemaFile,File targetDirectory) throws Exception
	{
		//log("XSD2InstanceDocumentAction start , schema at "+schemaFile);
	    generator = new XMLInstanceGenerator();
	    generator.setGrammarURI(schemaFile.toURI().toString());
	    String[] errorInfo = new String[2];
		//log("XSD2InstanceDocumentAction createCMDocument at "+schemaFile);
	    CMDocument cmDocument=XMLInstanceGenerator.createCMDocument(generator.getGrammarURI(), errorInfo);
		//log("XSD2InstanceDocumentAction CMDocument  "+cmDocument);
	    generator.setCMDocument(cmDocument);
		int limit=10;
        generator.setOptionalElementDepthLimit(limit);
        int policy=ContentBuilder.BUILD_ALL_CONTENT
        	|DOMContentBuilder.BUILD_OPTIONAL_ELEMENTS
        	|DOMContentBuilder.BUILD_OPTIONAL_ELEMENTS
        	|DOMContentBuilder.BUILD_FIRST_CHOICE
        	|DOMContentBuilder.BUILD_TEXT_NODES
        	|DOMContentBuilder.BUILD_FIRST_SUBSTITUTION
        	;
        generator.setBuildPolicy(policy);
        generator.createNamespaceInfoList();
		
//		currentAction=this;
		// this should normally be done after psm created catalog, but primary input is pim model
		//File targetDirectory=getTargetDirectory();
		File samplesDirectory=new File(targetDirectory,"XMLSamples");
		samplesDirectory.mkdirs();

		//final IFile newFile = newFilePage.createNewFile();
        //final String xmlFileName = newFile.getLocation().toOSString();
//        final String grammarFileName = fileName;

		//log("XSD2InstanceDocumentAction to "+newFile+", schema at "+schemaFile);
//		for(XSDElementDeclaration element:root.getElementDeclarations()){
		for(XSDSchemaContent test:root.getContents()){
			if(XSDElementDeclaration.class.isInstance(test)){
				XSDElementDeclaration element=(XSDElementDeclaration)test;
				String elementName=element.getName();
				File newFile=new File(samplesDirectory,schemaFile.getName().replace(".xsd","_"+elementName+".xml"));
				generator.setRootElementName(elementName);
				log("XSD2InstanceDocumentAction rootElement "+elementName+", file="+newFile);
	            generator.createXMLDocument(newFile/*, xmlFileName*/);
			}
		}
		
//		log.log("starting instance-document model to text "+targetDirectory);
//		modelToTextInstanceDocument(targetDirectory, log,root);
	}
	/*
	protected void modelToTextInstanceDocument(File targetFolder,MDLog log,XSDSchema root) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
    		//args.add(catalogFile);
    	    //Model root = getCurrentModelRoot();//project.getModel(); 
    	    //if(root==null)return;
    	    log.log("start instance document provisioning");
    	    InstanceDocument masterDocument=new  InstanceDocument(root,  targetFolder,args);
    		masterDocument.doGenerate(new BasicMonitor());
    	    log.log("completed instance document provisioning");
    		
    		
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
*/
	
	}