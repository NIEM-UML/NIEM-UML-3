/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.zip.ZipOutputStream;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xml.type.AnyType;
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
import org.oclc.purl.dsdl.schematron.DocumentRoot;
import org.oclc.purl.dsdl.schematron.SchemaType;



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
abstract public class Pim2SchematronAction extends Psm2MpdAction
{
	public Pim2SchematronAction(String id, String name)
	{
	super(id, name);
	setDescription(PIM_2_SCHEMATRON_ACTION_TOOLTIP);
	}
//////////////////////	
	public void performPim2SchematronTransform(MDLog log,File rootFile) throws ScriptException, IOException, TransformerConfigurationException, TransformerException
	{
	    ScriptEngine qvtEngine = getQvtEngine();
	    if(qvtEngine==null)return;
	    ExecutionContextImpl executionContext=new ExecutionContextImpl();
	    Application application=Application.getInstance();
	    ProjectsManager projectsManager=application.getProjectsManager();
	    Project project=projectsManager.getActiveProject();
	    // check expiration
	    /*
	    Date expireDate=new Date();
	     try {
			expireDate=NIEMQVTPlugin.niemAboutAction.getSchematronExpireDate();
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
	    Date now=new Date();
	    boolean isExpired=now.compareTo(expireDate)>=0;
	    */
	    boolean isSchematronProvisioned= isSchematronProvisioned(project);
	    
//	    log.log("Schematron expires "+DateFormat.getDateInstance().format(expireDate)+", is expired? "+isExpired+", is Schematron Provisioned? "+isSchematronProvisioned);
	    log.log("Schematron is Schematron Provisioned? "+isSchematronProvisioned);
	    if(
//	    		isExpired||!
	    		isSchematronProvisioned)return;
		    executionContext.setLog(log);
		    qvtEngine.put(QVTEngineConstants.QVTO_EXECUTION_CONTEXT, executionContext);
		    
		    registerPackages(log,qvtEngine);
		    Model root = getCurrentModelRoot();
		    if(root==null)return;
		    org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
        	org.eclipse.emf.common.util.URI schematronResourceFolderURI=rootURI.appendSegment(businessRulesPackageName);
        	
        	// TEST
        	/*
	    	ResourceSet resourceSetTEST = new ResourceSetImpl();
        	org.eclipse.emf.common.util.URI schematronResourceURITEST=schematronResourceFolderURI.appendSegment("test.sch");
        	
        	Resource schematronResourceTEST=resourceSetTEST.getResource(schematronResourceURITEST,true);
            for(EObject schematron:schematronResourceTEST.getContents()){
            	//log.log("schematron TEST "+schematron+", "+schematron.getClass().getName());
            	
            	if(DocumentRoot.class.isInstance(schematron)){
            		DocumentRoot documentRoot=(DocumentRoot)schematron;
            		FeatureMap featureMap=documentRoot.getSchema().getAny();
                	//log.log("schematron TEST featureMap "+featureMap);
            		if(featureMap!=null){
	                	//log.log("schematron TEST featureMap "+featureMap+","+featureMap.getClass().getName());
	                	for(int i=0;i<featureMap.size();i++){
	                		Entry entry=featureMap.get(i);
	                	      String prefix = entry.getEStructuralFeature().getEContainingClass().getEPackage().getNsPrefix();

	                    	log.log("schematron TEST entry "+prefix+", "+entry.getEStructuralFeature().getEContainingClass().getEPackage().getName()+":"+entry.getEStructuralFeature().getEContainingClass().getName()+":"+entry.getEStructuralFeature().getName()+","+entry.getEStructuralFeature()+", "+entry.getEStructuralFeature().getEType()+", "+entry.getValue()+", "+entry.getValue().getClass().getName());
	                    	if(entry.getValue() instanceof AnyType){
	                    		AnyType anyType=(AnyType)entry.getValue();
	                    		FeatureMap anyAttribute=anyType.getAnyAttribute();
	                    		if(anyAttribute!=null){
	        	                	log.log("schematron TEST anyAttribute "+anyAttribute+","+anyAttribute.getClass().getName());
	        	                	for(int i2=0;i2<anyAttribute.size();i2++){
	        	                		Entry entry2=anyAttribute.get(i2);
	        	                	      String prefix2 = entry2.getEStructuralFeature().getEContainingClass().getEPackage().getNsPrefix();

	        	                    	log.log("schematron TEST anyAttribute2 "+prefix2+", "+entry2.getEStructuralFeature().getEContainingClass().getEPackage().getName()+":"+entry2.getEStructuralFeature().getEContainingClass().getName()+":"+entry2.getEStructuralFeature().getName()+", "+entry2.getEStructuralFeature()+", "+entry2.getEStructuralFeature().getEContainingClass()+", "+entry2.getEStructuralFeature().getEContainingClass().getEPackage()+", "+entry2.getEStructuralFeature().getClass().getName()+", "+entry2.getEStructuralFeature().getEType()+", "+entry2.getValue()+", "+entry2.getValue().getClass().getName());
	        	                    	//chematron TEST entry Transform:import-schema=org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl@6573c612 (mixed: [], anyAttribute: [namespace=http://domain.gov/myDomain/, schema-location=../XMLschemas/niem/domains/hix/0.1/hix-o/hix-o.xsd]),org.eclipse.emf.ecore.impl.EStructuralFeatureImpl$ContainmentUpdatingFeatureMapEntry, org.eclipse.emf.ecore.impl.EReferenceImpl@2ca77b55 (name: import-schema) (ordered: true, unique: true, lowerBound: 0, upperBound: -2) (changeable: true, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: true, resolveProxies: false), org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl@6573c612 (mixed: [], anyAttribute: [namespace=http://domain.gov/myDomain/, schema-location=../XMLschemas/niem/domains/hix/0.1/hix-o/hix-o.xsd]), org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl
	        	                	}
	        	                	//schematron TEST featureMap [Transform:import-schema=org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl@2c343a3c (mixed: [], anyAttribute: [namespace=http://domain.gov/myDomain/, schema-location=../XMLschemas/niem/domains/hix/0.1/hix-o/hix-o.xsd])],org.eclipse.emf.ecore.util.FeatureMapUtil$FeatureFeatureMap
	                    		}
	                    		//org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.ContainmentUpdatingFeatureMapEntry z;
	                    	}
	                    	//chematron TEST entry Transform:import-schema=org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl@6573c612 (mixed: [], anyAttribute: [namespace=http://domain.gov/myDomain/, schema-location=../XMLschemas/niem/domains/hix/0.1/hix-o/hix-o.xsd]),org.eclipse.emf.ecore.impl.EStructuralFeatureImpl$ContainmentUpdatingFeatureMapEntry, org.eclipse.emf.ecore.impl.EReferenceImpl@2ca77b55 (name: import-schema) (ordered: true, unique: true, lowerBound: 0, upperBound: -2) (changeable: true, volatile: true, transient: true, defaultValueLiteral: null, unsettable: false, derived: true) (containment: true, resolveProxies: false), org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl@6573c612 (mixed: [], anyAttribute: [namespace=http://domain.gov/myDomain/, schema-location=../XMLschemas/niem/domains/hix/0.1/hix-o/hix-o.xsd]), org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl
	                	}
	                	//schematron TEST featureMap [Transform:import-schema=org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl@2c343a3c (mixed: [], anyAttribute: [namespace=http://domain.gov/myDomain/, schema-location=../XMLschemas/niem/domains/hix/0.1/hix-o/hix-o.xsd])],org.eclipse.emf.ecore.util.FeatureMapUtil$FeatureFeatureMap
            		}
            		featureMap=documentRoot.getSchema().getAny1();
                	log.log("schematron TEST featureMap1 "+featureMap);
            		if(featureMap!=null)
                	log.log("schematron TEST featureMap1 "+featureMap+","+featureMap.getClass().getName());
            	}

            }
            schematronResourceTEST.unload();
	    	*/
	    	// TEST END
		    Set<EObject> inputModelList = new HashSet();
		    inputModelList.add(root);
		    qvtEngine.put("niemUml", inputModelList);
		    setTransform("NIEMpim2Schematron.qvto",qvtEngine);
		    log.log("QVT NIEMpim2Schematron.qvto step start ");
	        qvtEngine.eval((String) null);
		    log.log("QVT NIEMpim2Schematron.qvto step complete ");
	        // get and save schematrons
	    	ResourceSet resourceSet = new ResourceSetImpl();
			Map options=new HashMap();
		    File xmlsamplesDirectory=new File(rootFile,XMLSAMPLES_DIRECTORYNAME);
	        Collection<EObject> schematrons = (Collection<EObject>)qvtEngine.get("sch");
        	log.log("schematrons "+schematrons.size());
        	// we could have multiple schematrons; we also may want to gen xslt and run that versus instances and save result reports
//        	Resource schematronResource=resourceSet.createResource(schematronResourceFolderURI.appendSegment("test.sch"));
//        	schematronResource.getContents().addAll(schematrons);
//        	schematronResource.save(options);

            for(EObject schematron:schematrons){
            	//log.log("schematron "+schematron);
            	
            	if(DocumentRoot.class.isInstance(schematron)){
            		DocumentRoot documentRoot=(DocumentRoot)schematron;
            		SchemaType schemaType=documentRoot.getSchema();
            		String fileName=schemaType.getId();
            		if(fileName==null)continue;
            		if(!fileName.endsWith(".sch"))fileName=fileName+".sch";
            		// can we put everything into one schematron
                	org.eclipse.emf.common.util.URI schematronResourceURI=schematronResourceFolderURI.appendSegment(fileName);
                	log.log("save schematron at "+schematronResourceURI);
                	Resource schematronResource=resourceSet.createResource(schematronResourceURI);
                	schematronResource.getContents().add(documentRoot);
                	schematronResource.save(options);
                	// gen the xslt here
                	File schFile=new File(schematronResourceURI.toFileString());
                	File xslFile=new File(schematronResourceURI.trimFileExtension().appendFileExtension("xsl").toFileString());
                	log.log("create schematron xslt processor at "+xslFile);
                	transformSch2Xslt(schFile,xslFile);
                	// run xslt for instance documents and save results
                	log.log("SUPPRESS sample document processing:  schema-aware XSLT required");
                	if(false)
                	for(File sampleFile:xmlsamplesDirectory.listFiles()){
                		if(sampleFile.getName().endsWith(".xml")){
                			File reportFile=new File(xmlsamplesDirectory,sampleFile.getName().replace(".xml", ".svrlt"));
                        	log.log("create instance validation report at "+reportFile);
                			transformXslt2Report(sampleFile,reportFile,xslFile);
                		}
                	}
            	}else{
            		log.log("schematron orphaned element "+schematron+", "+schematron.getClass().getName());
            	}

            }



		    log.log("QVT NIEMpim2Schematron evaluation complete ");
	}
	protected boolean isSchematronProvisioned(Project project){
		boolean result=false;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					PROVISION_SCHEMATRON_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
	}
	public void transformXslt2Report(File sampleFile,File reportFile,File xslFile) throws TransformerConfigurationException, TransformerException {
		getTransformer(xslFile).transform(new StreamSource(sampleFile), new StreamResult(reportFile));
}
	public void transformSch2Xslt(File schFile,File xslFile) throws TransformerConfigurationException, TransformerException {
			getTransformer().transform(new StreamSource(schFile), new StreamResult(xslFile));
	}
	private Transformer getTransformer() throws TransformerConfigurationException{
		return getTransformer(getTransformFile("iso_svrl_for_xslt2.xsl"));
	}
	private Transformer getTransformer(File xslSheet) throws TransformerConfigurationException{
		Transformer transformer = null;
		Templates templates = null;
		//System.setProperty("javax.xml.transform.TransformerFactory","net.sf.saxon.TransformerFactoryImpl");
//		TransformerFactory tfactory = TransformerFactory.newInstance();
		TransformerFactory tfactory = new net.sf.saxon.TransformerFactoryImpl();
		templates = tfactory.newTemplates(new StreamSource(xslSheet));
		transformer = templates.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");

		return transformer;
	}

	}