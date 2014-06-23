/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;


import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogFactory;

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
import org.modeldriven.magicdraw.niem.m2t.InstanceDocument;
import org.modeldriven.magicdraw.niem.m2t.MasterDocument;
import org.modeldriven.magicdraw.niem.m2t.NiemHelper;
import org.modeldriven.magicdraw.niem.m2t.UmlInstanceDocument;

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
public class UmlInstanceDocumentAction extends Rfp2DocAction
{
	public UmlInstanceDocumentAction(String id, String name)
	{
	super(id, name);
	}
	
	public void performModelToText(MDLog log,Catalog cat) throws IOException
	{
		currentAction=this;
		// this should normally be done after psm created catalog, but primary input is pim model
		File targetDirectory=getTargetDirectory();
		//log.log("starting instance-document model to text "+targetDirectory);
		modelToTextInstanceDocument(targetDirectory, log,cat);
	}
	protected void modelToTextInstanceDocument(File targetFolder,MDLog log,Catalog cat) throws IOException{
		// startup transformation, passing in params 
    		List<String> args=new Vector<String>();
    		//args.add(catalogFile);
    	    Model root = getCurrentModelRoot();//project.getModel(); 
    	    if(root==null)return;
    	    log.log("start uml instance document provisioning "+targetFolder);
    		UmlInstanceDocument masterDocument=new  UmlInstanceDocument(root,  targetFolder,args);
    		//NiemHelper.setCurrentCat(cat);
    		masterDocument.doGenerate(new BasicMonitor());
    	    log.log("completed uml instance document provisioning");
    		
    		
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