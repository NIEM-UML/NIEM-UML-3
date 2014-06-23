/**
 * 
 */
package org.modeldriven.magicdraw.niem.qvt;

import gov.niem.niem.wantlist._2.AllNNIMember1;
import gov.niem.niem.wantlist._2.AttributeInTypeType;
import gov.niem.niem.wantlist._2.AttributeType;
import gov.niem.niem.wantlist._2.ElementInTypeType;
import gov.niem.niem.wantlist._2.ElementType;
import gov.niem.niem.wantlist._2.TypeType;
import gov.niem.niem.wantlist._2.UnionMemberType;
import gov.niem.reference.niem.resource.mpd.changelog._1.mpdchangelog.ChangeLogType;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.m2m.internal.qvt.oml.evaluator.TransformationInstance;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.expressions.BooleanLiteralExp;
import org.eclipse.ocl.expressions.UnspecifiedValueExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.utilities.ExpressionInOCL;
import org.eclipse.ocl.utilities.OCLFactory;
import org.eclipse.ocl.utilities.UMLReflection;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDComponent;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDConstrainingFacet;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDEnumerationFacet;
import org.eclipse.xsd.XSDFacet;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.modeldriven.magicdraw.niem.change.ChangelogUtility;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.BaseValidationRule;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;
import org.modeldriven.magicdraw.niem.validation.ocl.OCLExpression;
import org.oclc.purl.dsdl.schematron.AssertType;
import org.oclc.purl.dsdl.schematron.DocumentRoot;
import org.oclc.purl.dsdl.schematron.SchemaType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.TitleType;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSParser;
import org.xml.sax.SAXException;







import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.CallOperationAction;
import com.nomagic.uml2.ext.magicdraw.actions.mdbasicactions.SendSignalAction;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Operation;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Parameter;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
import com.nomagic.uml2.ext.magicdraw.statemachines.mdbehaviorstatemachines.State;

/**
 * @author Tom
 *
 */
public class BlackboxAdapter extends AdapterImpl implements Adapter {
	protected MDLog log=null;
	public BlackboxAdapter(MDLog log) {
		this.log=log;
		mapInit();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.Adapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		// TODO Auto-generated method stub
		if(notification.getEventType()==Notification.ADD){
			Object newValue=notification.getNewValue();
			if(EAnnotation.class.isInstance(newValue)){
				addedAnnotation(((EAnnotation)newValue));
			}
			//log.log("notifyChanged "+newValue);
		}
	}
	protected void log(String text){
		Application.getInstance().getGUILog().log(text);		
	}
	protected void addedAnnotation(EAnnotation annotation){
		EMap<String,String> details=annotation.getDetails();
		EList<EObject> references=annotation.getReferences();
		XSDSchema schema=getXSDSchema(annotation);
		String source=annotation.getSource();
		if("mapAbstractXSDSchemaContent".equals(source)){
			if(references.size()<2){
				references.clear();
			}else{
				EObject eObject=references.get(0);
				EObject eObject2=references.get(1);
				references.clear();
				if((eObject!=null)&&(eObject2!=null)){
					EObject result=mapAbstractXSDSchemaContent((XSDElementDeclaration)eObject,(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element)eObject2);
					if(result!=null)references.add(result);
				}
			}
		}
		else	if("xsd2umlFacetContents".equals(source)){
				if(references.size()<2){
				}else{
					EObject eObject=references.get(0);
					EObject eObject2=references.get(1);
					if(XSDSimpleTypeDefinition.class.isInstance(eObject)&&Classifier.class.isInstance(eObject2)){
						xsd2umlFacetContents((XSDSimpleTypeDefinition)eObject,(Classifier)eObject2);
					}
				}
			}
		else	if("mapXSDEnumerationFacet".equals(source)){
			if(references.size()<2){
			}else{
				EObject eObject=references.get(0);
				EObject eObject2=references.get(1);
				if(DataType.class.isInstance(eObject)&&Enumeration.class.isInstance(eObject2)){
					mapXSDEnumerationFacet((DataType)eObject,(Enumeration)eObject2);
				}
			}
		}
		else	if("ownedCommentmapXSDAnnotation".equals(source)){
			if(references.size()<2){
			}else{
				EObject eObject=references.get(0);
				EObject eObject2=references.get(1);
				if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element.class.isInstance(eObject)&&com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element.class.isInstance(eObject2)){
					ownedCommentmapXSDAnnotation((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element)eObject,(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element)eObject2);
				}
			}
		}
		else	if("mapXSDAnnotation".equals(source)){
			if(references.size()<2){
			}else{
				EObject eObject=references.get(0);
				EObject eObject2=references.get(1);
				if(XSDAnnotation.class.isInstance(eObject)&&com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element.class.isInstance(eObject2)){
					com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element owner=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element)eObject2;
					Map<String,Type> nameToStereotypeTarget=getNameToStereotype(owner);
					mapXSDAnnotation((XSDAnnotation)eObject,owner,nameToStereotypeTarget);
				}
			}
		}
		
		else if("setSchemaForSchema".equals(source)){
					String namespace=details.get("namespace");
					if(namespace==null)namespace="http://unknown";
					String prefix=details.get("prefix");
					schema.setSchemaForSchemaQNamePrefix(prefix);
					schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
					schema.setIncrementalUpdate(false);
					//log.log("setting schema for schema namespace " +namespace+", "+prefix+", "+schema);
		}
		else if("setQNamePrefixToNamespace".equals(source)){
					String namespace=details.get("namespace");
					if(namespace==null)namespace="http://unknown";
					String prefix=details.get("prefix");
					schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
					schema.setIncrementalUpdate(false);
					//log.log("setting prefix / namespace " +namespace+", "+prefix+", "+schema);
		}
		else if("importSchema".equals(source)){
			EObject eObject=references.get(0);
			Blackbox.importSchema(eObject);
		}
		else if("getExtentBaseName".equals(source)){
			EObject eObject=references.get(0);
			String extentBaseName=Blackbox.getExtentBaseName(eObject);
			annotation.getDetails().put("extentBaseName", extentBaseName);
		}
		else if("getRootFileName".equals(source)){
			EObject eObject=references.get(0);
			String filePath=eObject.eResource().getURI().toFileString();
			File baseFile=new File(filePath);
			File rootFile=baseFile.getParentFile().getParentFile().getParentFile();
			String extentBaseName=rootFile.getName()+"/";
			annotation.getDetails().put("rootFileName", extentBaseName);
		}
		else if("getModelDirectoryName".equals(source)){
			EObject eObject=references.get(0);
			String filePath=eObject.eResource().getURI().toFileString();
			File baseFile=new File(filePath);
			File rootFile=baseFile.getParentFile();
			String extentBaseName=rootFile.getName();
			annotation.getDetails().put("modelDirectoryName", extentBaseName);
		}
		else if("isEditable".equals(source)){
			EObject eObject=references.get(0);
			boolean isEditable=((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element)eObject).isEditable();
			annotation.getDetails().put("isEditable", isEditable?"true":"false");
		}
		else if("getID".equals(source)){
			com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element me=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element)references.get(0);
			annotation.getDetails().put("ID", me.getID());
		}
		else if("getSchemaAtRelativeURI".equals(source)){
			EObject eObject=references.get(0);
			String relativeURI=details.get("relativeURI");
			EObject relativeSchema=Blackbox.getSchemaAtRelativeURI(eObject,relativeURI);
			if(relativeSchema!=null)annotation.getReferences().add(relativeSchema);
//			log("getSchemaAtRelativeURI "+eObject+", "+relativeURI+", "+relativeSchema);
//			log("getSchemaAtRelativeURI "+relativeURI+" = "+relativeSchema);
		}
		else if("proxyDateValue".equals(source)){
			EObject eObject=references.get(0);
			String value=details.get("value");
			gov.niem.release.niem.proxy.xsd._3._0.Date date=(gov.niem.release.niem.proxy.xsd._3._0.Date)eObject;
			XMLGregorianCalendar calendar;
			try {
				calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(value);
				date.setValue(calendar);
			} catch (DatatypeConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		else if("getDocumentAtRelativeURI".equals(source)){
			try {
				EObject eObject=references.get(0);
				String relativeURI=details.get("relativeURI");
				Resource myResource=eObject.eResource();
				URI myURI=myResource.getURI();
				URI schemaURI=URI.createURI(relativeURI).resolve(myURI);
				log.log("getDocumentAtRelativeURI " +schemaURI+", "+myURI+", "+relativeURI);
				DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance(); 	
				documentBuilderFactory.setNamespaceAware(true);
				DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
				Document document=documentBuilder.parse(schemaURI.toString());
				if(document!=null){
	//			buildDocument(annotation,getDocumentAtURI(schemaURI));
				Element element=document.getDocumentElement();
				log.log("getDocumentAtRelativeURI element " +element);
				if(element!=null){
					buildElement(annotation,element);
				}
				}
			} catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		else if("mdclone".equals(source)){
			EObject eObject=references.get(0);
			EObject relativeSchema;
			try {
				// clone not supported by magicdraw
				//relativeSchema = (EObject) ((BaseElement)eObject).clone();
				// following ecore clone fails when trying to copy ids
				// and qvt deepclone does not work
				  Copier copier = new Copier();
				  relativeSchema = copier.copy(eObject);
				  //Collection results = copier.copyAll(eObjects);
				  copier.copyReferences();
				
				
				log("clone "+eObject+" = "+relativeSchema);
				annotation.getReferences().add(relativeSchema);
			} catch (Throwable/*CloneNotSupportedException*/ e) {
				// TODO Auto-generated catch block
				log("ERROR: clone "+e);
				e.printStackTrace();
			}
		}
		else if("setUpper".equals(source)){
			MultiplicityElement me=(MultiplicityElement)references.get(0);
			String upperValue=details.get("upperValue");
			int upper=Integer.parseInt(upperValue);
			Blackbox.setUpper(me, upper);
			/*
			LiteralUnlimitedNatural valueSpecication=UMLFactory.eINSTANCE.createLiteralUnlimitedNatural();
			valueSpecication.setValue(upper);
			me.setUpperValue(valueSpecication);
			*/
/*
			String lowerValue=me.getLower()+"";
			if("-1".equals(upperValue))upperValue="*";
			log("setUpper "+((NamedElement)me).getQualifiedName()+" : "+me.getLower()+".."+upperValue);
			String multiplicity=lowerValue+".."+upperValue;
			if(lowerValue.equals("1")&&upperValue.equals("1"))multiplicity="1";
			ModelHelper.setMultiplicity(multiplicity, me);
			*/
		}
		else if("setLower".equals(source)){
			MultiplicityElement me=(MultiplicityElement)references.get(0);
			String lowerValue=details.get("lowerValue");
			int lower=Integer.parseInt(lowerValue);
			Blackbox.setLower(me, lower);
			/*
			LiteralInteger valueSpecication=UMLFactory.eINSTANCE.createLiteralInteger();
			valueSpecication.setValue(lower);
			me.setLowerValue(valueSpecication);
			*/
			/*
			String upperValue=me.getUpper()+"";
			if("-1".equals(upperValue))upperValue="*";
			log("setLower "+((NamedElement)me).getQualifiedName()+" : "+lowerValue+".."+upperValue);
			// "0", "1", "*", "0..*", "1..*", "0..1"
			String multiplicity=lowerValue+".."+upperValue;
			if(lowerValue.equals("1")&&upperValue.equals("1"))multiplicity="1";
			ModelHelper.setMultiplicity(multiplicity, me);
			*/
		}
		
		else if("getApplicationInformation".equals(source)){
			buildApplicationInformation(annotation,getXSDAnnotation(annotation));
		}
		else if("getElement".equals(source)){
			buildElementInformation(annotation,getXSDConcreteComponent(annotation));
		}
		else if("getUserInformation".equals(source)){
			buildUserInformation(annotation,getXSDAnnotation(annotation));
		}
		
		else if("setResolvedElementDeclaration".equals(source)){
			XSDElementDeclaration elementDeclaration=(XSDElementDeclaration)references.get(0);
			XSDElementDeclaration refedElementDeclaration=(XSDElementDeclaration)references.get(1);
			try{
				elementDeclaration.setResolvedElementDeclaration(refedElementDeclaration);
			}catch(Throwable t){
				log("ERROR:setResolvedElementDeclaration "+elementDeclaration+" ref="+refedElementDeclaration+", "+t);
			}
		}
		else if("userInformation".equals(source)){
			org.w3c.dom.Element element=null;
			try{
			element=(org.w3c.dom.Element)Blackbox.createUserInformation(getXSDAnnotation(annotation),details.get("sourceURI"),schema);
			if(element!=null){
				processElement(annotation,element);
			}
			}catch(Throwable t){
				log("ERROR on userInformation "+element+" : "+t);
			}
		}
		else if("setComponentAttributeValue".equals(source)){
			XSDConcreteComponent xsdComponent=(XSDConcreteComponent)references.get(0);
			xsdComponent.updateElement();
			org.w3c.dom.Element element=xsdComponent.getElement();
			String name=details.get("name");
			String namespace=details.get("namespace");
			String value=details.get("value");
			element.setAttributeNS(namespace, name, value);
		}
		
		else if("applicationInformation".equals(source)){
			try{
				org.w3c.dom.Element element=(org.w3c.dom.Element)Blackbox.createApplicationInformation(getXSDAnnotation(annotation),details.get("sourceURI")/*,schema*/);
				//log("SUPPRESS applicationInformation");if(true)return;				
				processElement(annotation,element);
				}catch(Throwable t){
					log("ERROR on applicationInformation  : "+t);
				}
		}
		else if("add".equals(source)){
			String mapFeature=details.get("mapFeature");
			String targetFeature=details.get("targetFeature");
			EObject eObject=references.get(0);
			EObject object=references.get(1);
			Blackbox.add(eObject, mapFeature, targetFeature, object,log);
		}
		else if("addToStringList".equals(source)){
			String idref=details.get("idref");
			String featureName=details.get("featureName");
			EObject eObject=references.get(0);
			Blackbox.addToStringList(idref,eObject, featureName);
		}
		else if("qvt".equals(source)){
			EObject eObject=references.get(0);
			if(TransformationInstance.class.isInstance(eObject)){
				Rfp2DocAction.setCompositeQVT(((TransformationInstance)eObject).getModule());
			}
		}
		else if("setWantlistAttributeName".equals(source)){
			String namespace=details.get("namespace");
			String localPart=details.get("localPart");
			String prefix=details.get("prefix");
			AttributeType type=getAttributeType(annotation);
			QName qname=new QName(namespace,localPart,prefix);
			type.setName(qname);
}
		else if("setWantlistElementName".equals(source)){
			String namespace=details.get("namespace");
			String localPart=details.get("localPart");
			String prefix=details.get("prefix");
			ElementType type=null;
			QName qname=null;
			try{
			 type=getElementType(annotation);
			 qname=new QName(namespace,localPart,prefix);
			type.setName(qname);
			}catch(Throwable t){
				System.out.println("ERROR:setWantlistElementName namespace="+namespace+", localPart="+localPart+", prefix="+prefix+", type="+type+", qname="+qname);
				t.printStackTrace();
			}
}
		else if("setWantlistTypeName".equals(source)){
			String namespace=details.get("namespace");
			String localPart=details.get("localPart");
			String prefix=details.get("prefix");
			TypeType type=getTypeType(annotation);
			QName qname=new QName(namespace,localPart,prefix);
			type.setName(qname);
}
		else if("setWantlistAttributeTypeName".equals(source)){
			String namespace=details.get("namespace");
			String localPart=details.get("localPart");
			String prefix=details.get("prefix");
			AttributeInTypeType type=getAttributeInTypeType(annotation);
			QName qname=new QName(namespace,localPart,prefix);
			type.setName(qname);
}
		else if("setWantlistElementTypeName".equals(source)){
			String namespace=details.get("namespace");
			String localPart=details.get("localPart");
			String prefix=details.get("prefix");
			ElementInTypeType type=getElementInTypeType(annotation);
			QName qname=new QName(namespace,localPart,prefix);
			type.setName(qname);
}
		else if("setWantlistUnionMemberTypeName".equals(source)){
			String namespace=details.get("namespace");
			String localPart=details.get("localPart");
			String prefix=details.get("prefix");
			UnionMemberType type=getUnionMemberType(annotation);
			QName qname=new QName(namespace,localPart,prefix);
			type.setType(qname);
}
		else if("setWantlistElementMaxOccurs".equals(source)){
			String maxOccursString=details.get("maxOccurs");
			Integer maxOccursInteger=Integer.parseInt(maxOccursString);
			Object maxOccurs=AllNNIMember1.UNBOUNDED;
			if(maxOccursInteger>=0){
				maxOccurs=org.eclipse.emf.ecore.xml.type.XMLTypeFactory.eINSTANCE.createNonNegativeInteger(maxOccursString);
			}
			ElementInTypeType type=getElementInTypeType(annotation);
			type.setMaxOccurs(maxOccurs);
}
		else if("setAssertText".equals(source)){
			String message=details.get("message");
			AssertType assertType=(AssertType)references.get(0);
			FeatureMap featureMap=assertType.getMixed();
			featureMap.add(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, message);
}
		else if("setTitleText".equals(source)){
			String message=details.get("message");
			TitleType assertType=(TitleType)references.get(0);
			FeatureMap featureMap=assertType.getMixed();
			featureMap.add(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT, message);
}
		else if("addXSISchemaLocation".equals(source)){
			String targetNamespace=details.get("targetNamespace");
			String relativeLocation=details.get("relativeLocation");
			DocumentRoot documentRoot=(DocumentRoot)references.get(0);
			documentRoot.getXSISchemaLocation().put(targetNamespace, relativeLocation);
}
		else if("addImportSchema".equals(source)){
			String targetNamespace=details.get("targetNamespace");
			String relativeLocation=details.get("relativeLocation");
			SchemaType schemaType=(SchemaType)references.get(0);
			FeatureMap featureMap=schemaType.getAny();
			                	
			AnyType anyType=XMLTypeFactory.eINSTANCE.createAnyType();
			FeatureMap attributes=anyType.getAnyAttribute();
			Resource xmlResource=schemaType.eResource();
			//System.out.println("xmlResource "+xmlResource);
			ExtendedMetaData extendedMetaData=null;
			if(xmlResource instanceof XMLResource){
				extendedMetaData=(ExtendedMetaData)((XMLResource)xmlResource).getDefaultSaveOptions().get(XMLResource.OPTION_EXTENDED_META_DATA);
			}
			if(extendedMetaData==null){
				extendedMetaData=ExtendedMetaData.INSTANCE;
			}
				//System.out.println("extendedMetaData "+extendedMetaData);
					EAttribute schemaLocation=(EAttribute)extendedMetaData.demandFeature(null, "schema-location", false);
					
					//EAttribute schemaLocation=getNoNamespaceAttribute(schemaType,"schema-location");	
					if(schemaLocation!=null){
						attributes.add(schemaLocation, relativeLocation);
					}
					EAttribute namespace=(EAttribute)extendedMetaData.demandFeature(null, "namespace", false);	
//					EAttribute namespace=getNoNamespaceAttribute(schemaType,"namespace");	
					if(namespace!=null){
						attributes.add(namespace, targetNamespace);
					}
//					EReference xsltImportSchemaReference=getXsltImportSchemaReference(schemaType);	
					EReference xsltImportSchemaReference=(EReference)extendedMetaData.demandFeature("http://www.w3.org/1999/XSL/Transform", "import-schema", true);
			
					if(xsltImportSchemaReference!=null){
						featureMap.add(xsltImportSchemaReference, anyType);
//					featureMap.add(XMLTypePackage.Literals.ANY_TYPE__ANY, anyType);
					//featureMap.add(entry);
					}
			//org.eclipse.emf.ecore.util.BasicFeatureMap x;
			//org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.ContainmentUpdatingFeatureMapEntry z;
			//Entry entry=null;
			//EFactory efactory=schemaType.eClass().getEPackage().getEFactoryInstance();
			//org.eclipse.emf.ecore.impl.EStructuralFeatureImpl.BasicFeatureMapEntry x;
			//org.eclipse.emf.ecore.impl.EReference ref=efactory.getEPackage().
			//XMLTypeFactory.eINSTANCE.cre
			//attributes.add(XMLTypePackage.Literals.ANY_TYPE__ANY_ATTRIBUTE)

			//?featureMap.add(XMLTypePackage.Literals.ANY_TYPE__ANY, message);
			
}
		else if("Expression".equals(source)){
			Constraint constraint=(Constraint)references.get(0);
			//System.out.println("Expression "+constraint);
			// convert to OCLExpression
			org.eclipse.ocl.expressions.OCLExpression<Classifier> expression=null;
			String constraintName=constraint.getName();
			ValueSpecification vs = constraint.getSpecification();
			//System.out.println("Expression ValueSpecicatopm "+vs);
			if (!OpaqueExpression.class.isInstance(vs)) return ;
				OpaqueExpression oe = (OpaqueExpression) vs;
				Vector<String> languages=new Vector<String>(oe.getLanguage());
				Vector<String> bodies=new Vector<String>(oe.getBody());
				for(int i=0;i<languages.size();i++){
					String language=languages.get(i);
					//System.out.println("Expression language "+language);
					if (!language.startsWith("OCL")||i>=bodies.size()) continue;
						String body=bodies.get(i);
						for(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element:constraint.getConstrainedElement()){
							if(Classifier.class.isInstance(element)){
								if((element instanceof Class)&&StereotypesHelper.isMetaClass((Class)element)){
									// constrained element could also be a metaclass; TODO handle elsewhere
									System.out.println("UNHANDLED constrained metaclass "+((Class)element).getQualifiedName());
									continue;
								}
						    	NIEMValidator niemValidator=BaseValidationRule.getNIEMValidator();//new NIEMValidator();
								//System.out.println("Expression niemValidator "+niemValidator);
								if(niemValidator==null)continue;
								try{
									org.eclipse.ocl.Query<Classifier, Class, EObject> eval=niemValidator.getClassQuery(body,(Classifier)element);
									System.out.println("Constraint "+constraint.getQualifiedName()+", "+eval);
									System.out.println("Expression eval "+eval);
									if(eval!=null){
	//									eval.getExpression().setName(constraintName);
										expression=eval.getExpression();
										System.out.println("Expression expression "+expression);
										//oclCheck(diagnostics,eval,instanceSpecification,constraint);
									
								}else{
									log("FAILED to evaluate expression "+body);// message should be already logged
									
								}
								}catch(ParserException e){
									log(e.getMessage());
									//e.printStackTrace();
									//diagnostics.add(e.getDiagnostic());
								}
							}else{
								log("UNHANDLED constrained element "+element.eClass().getName());
							}
						}
						
					
					
				}
			
			if(expression!=null)annotation.getReferences().add(expression);
}
		else if("mapInit".equals(source)){
			mapInit();
		}
		else if("changelog".equals(source)){
			Package umlChangelog=(Package)references.get(0);
			ChangeLogType changeLogType=(ChangeLogType)references.get(1);
			try{
				//log("changelog "+umlChangelog.getQualifiedName()+" changeLogType="+changeLogType);
				
				ChangelogUtility.createChangelog(umlChangelog, changeLogType);
			}catch(Throwable t){
				log("ERROR:changelog "+umlChangelog.getQualifiedName()+" changeLogType="+changeLogType+", "+t);
			}
		}
	}
	///////////////////////////////////////////////////
	private void mapInit() {
		elementDeclaration2Uml.clear();
		didSchemas.clear();
	}
	protected Set<XSDSchema> didSchemas=new HashSet<XSDSchema>();
	protected Map<XSDElementDeclaration,com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element> elementDeclaration2Uml=new HashMap<XSDElementDeclaration,com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element>();
	private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element mapAbstractXSDSchemaContent(XSDElementDeclaration eObject,
			com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element eObject2) {
		try{
			if(eObject2.isEditable())return null;
		// 
		/*
		var name:String=self.name;
		umlContainer.oclAsType(UML::classes::mdkernel::Package).ownedType
			->select(t|t.isStereotypeApplied(XsdElementsStereotype)).oclAsType(UML::classes::mdkernel::Class).ownedAttribute
			->select(t|t.name=name)->forEach(type){return type;};
		*/	
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element result=elementDeclaration2Uml.get(eObject);
		if((result==null)&&!elementDeclaration2Uml.containsKey(eObject)){
			//String name=eObject.getName();
			if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(eObject2)){
				// should we gather everything about the schema now?
				XSDSchema schema=eObject.getSchema();
				if(didSchemas.contains(schema))return null;
				didSchemas.add(schema);
				// map all top level elements from schema to either PropertyHolder or other
				long start=System.currentTimeMillis();
				Map<String,XSDElementDeclaration> name2elementMap=new HashMap<String,XSDElementDeclaration>();
				for(XSDElementDeclaration content:schema.getElementDeclarations())name2elementMap.put(content.getName(),content);
				
				for(Type ownedType:((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)eObject2).getOwnedType()){
					if(isXsdElements(ownedType)){
						for(Property p:((Classifier)ownedType).getAttribute()){
							String name=p.getName();
							XSDElementDeclaration ed=name2elementMap.get(name);
							if(ed!=null){elementDeclaration2Uml.put(ed, p);name2elementMap.remove(name);}
						}
					}
				}
				if(!name2elementMap.isEmpty()){
					for(Type ownedType:((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)eObject2).getOwnedType()){
						if(!isXsdElements(ownedType)){
							for(Property p:((Classifier)ownedType).getAttribute()){
								String name=p.getName();
								XSDElementDeclaration ed=name2elementMap.get(name);
								if(ed!=null){elementDeclaration2Uml.put(ed, p);name2elementMap.remove(name);}
							}
							if(name2elementMap.isEmpty())break;
						}
					}
				}
				log("schemaElementMap "+schema.getTargetNamespace()+", "+(System.currentTimeMillis()-start));
				/*
					// try again, searching all
					for(Type ownedType:((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)eObject2).getOwnedType()){
						if(!isXsdElements(ownedType)){
							result=mapXSDSchemaContentClass(eObject,(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier)ownedType);
							if(result!=null)break;
						}
					}
				
				
				for(Type ownedType:((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)eObject2).getOwnedType()){
					if(isXsdElements(ownedType)){
						result=mapXSDSchemaContentClass(eObject,(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)ownedType);
						if(result!=null)break;
					}
				}
				if(result==null){
					// try again, searching all
					for(Type ownedType:((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)eObject2).getOwnedType()){
						if(!isXsdElements(ownedType)){
							result=mapXSDSchemaContentClass(eObject,(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier)ownedType);
							if(result!=null)break;
						}
					}
				if(result==null){
					elementDeclaration2Uml.put(eObject, null);
				}
				}
				*/
			}else{
				result=mapXSDSchemaContentClass(eObject,(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)eObject2);
			}
		}
		return result;
		}catch(Throwable t){
			log("mapAbstractXSDSchemaContent ERROR "+eObject+", "+eObject2+" : "+t);
			return null;
		}
	}
	private com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element mapXSDSchemaContentClass(XSDElementDeclaration eObject,
			com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier ownedType) {
		String name=eObject.getName();
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element result=null;
		for(Property p:ownedType.getAttribute()){
			if(name.equals(p.getName())){
				result=p;
				elementDeclaration2Uml.put(eObject,p);
				break;
			}
		}
		return result;
	}
	protected boolean isXsdElements(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		return StereotypesHelper.hasStereotype(element, "XSDElements");
	}
	//////////////////////////////////////////////////////////
	protected void buildUserInformation(EAnnotation annotation,XSDAnnotation xsdAnnotation){
		for(Element element:xsdAnnotation.getUserInformation()){
			buildRootElement(annotation,element);
		}
	}
	protected void buildApplicationInformation(EAnnotation annotation,XSDAnnotation xsdAnnotation){
		for(Element element:xsdAnnotation.getApplicationInformation()){
			buildRootElement(annotation,element);
		}
	}
	protected void buildElementInformation(EAnnotation annotation,XSDConcreteComponent xsdComponent){
		xsdComponent.updateElement();
			buildSimpleElement(annotation,xsdComponent.getElement());
	}
	protected void buildSimpleElement(EAnnotation parentAnnotation,Element element){
		EAnnotation annotation=EcoreFactory.eINSTANCE.createEAnnotation();
		parentAnnotation.getEAnnotations().add(annotation);
		NamedNodeMap nodeList=element.getAttributes();
		for(int i=0;i<nodeList.getLength();i++){
			Node node=nodeList.item(i);
			if(Attr.class.isInstance(node)){
				buildAttribute(annotation,(Attr)node);
			}
		}
}
	protected void buildRootElement(EAnnotation parentAnnotation,Element element){
		EAnnotation annotation=EcoreFactory.eINSTANCE.createEAnnotation();
		parentAnnotation.getEAnnotations().add(annotation);
		Node childNode=element.getFirstChild();
		EMap<String, String> map=annotation.getDetails();
		map.put("text", element.getTextContent());
		//log("root text "+element+", "+element.getTextContent());
		while(childNode!=null){
			if(Element.class.isInstance(childNode)){
				buildElement(annotation,(Element)childNode);
			}
			else if(Attr.class.isInstance(childNode)){
				buildAttribute(annotation,(Attr)childNode);
			}
			childNode=childNode.getNextSibling();
		}
}
	protected void buildElement(EAnnotation annotation,Element element){
			EAnnotation childAnnotation=EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.getEAnnotations().add(childAnnotation);
			EMap<String, String> map=childAnnotation.getDetails();
			String name=element.getLocalName();
			String namespace=getNamespaceURI(element);
			if(name==null){
				name=element.getTagName();
				if(name.contains(":")){
					int index=name.indexOf(":");
					name=name.substring(index+1);
				}
			}
			map.put("name", name);
			map.put("namespace", namespace);
//			map.put("name", element.getLocalName());
//			map.put("namespace", getNamespaceURI(element));
//			map.put("text", element.getTextContent());
			String text="";
			//log("element text "+element+", "+element.getTextContent());
			childAnnotation.setSource("childElementNS");
			Node childNode=element.getFirstChild();
			while(childNode!=null){
				if(Element.class.isInstance(childNode)){
					buildElement(childAnnotation,(Element)childNode);
				}else if (Text.class.isInstance(childNode)){
					text=((Text)childNode).getWholeText() ;
				}
				childNode=childNode.getNextSibling();
			}
			map.put("text", text);
			NamedNodeMap nodeList=element.getAttributes();
			for(int i=0;i<nodeList.getLength();i++){
				Node node=nodeList.item(i);
				if(Attr.class.isInstance(node)){
					buildAttribute(childAnnotation,(Attr)node);
				}
			}
	}
	protected String getNamespaceURI(Node node){
		String result=node.getNamespaceURI();
		if(result==null){
			String prefix=node.getPrefix();
			if(prefix==null){
				if(Element.class.isInstance(node)){
					String tagName=((Element)node).getTagName();
					int index=tagName.indexOf(":");
					if(index>=0){
						prefix=tagName.substring(0, index);
					}
				}else if(Attr.class.isInstance(node)){
					String tagName=((Attr)node).getName();
					int index=tagName.indexOf(":");
					if(index>=0){
						prefix=tagName.substring(0, index);
					}
				}
			}
			result=node.lookupNamespaceURI(prefix);
		}
		return result;
	}
	protected void buildAttribute(EAnnotation annotation,Attr element){
		EAnnotation childAnnotation=EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.getEAnnotations().add(childAnnotation);
		EMap<String, String> map=childAnnotation.getDetails();
		String name=element.getLocalName();
		if(name==null){
			name=element.getName();
			if(name.contains(":")){
				int index=name.indexOf(":");
				name=name.substring(index+1);
			}
		}
		map.put("name", name);
		map.put("namespace", getNamespaceURI(element));
		String elementValue=element.getValue();
		map.put("value", elementValue);
		//System.out.println("buildAttribute "+map);
		childAnnotation.setSource("attributeNS");
}
	protected void processElement(EAnnotation annotation,org.w3c.dom.Element element){
		EMap<String,String> details=annotation.getDetails();
		if(details.get("text")!=null) {
			Blackbox.setTextContent(details.get("text"),element);
			//log("SetText "+details.get("text")+", "+element);
		}
		for(EAnnotation attribute:annotation.getEAnnotations()){
			if("attributeNS".equals(attribute.getSource())){
				try{
					details=attribute.getDetails();
				Blackbox.setAttributeNS(details.get("name"),element,details.get("namespace"),details.get("value"));
				}catch(Throwable t){
					log("ERROR on setAttributeNS "+details.get("name")+", namespace "+details.get("namespace")+" = "+details.get("value")+" : "+t);
				}
			}
		}
		for(EAnnotation attribute:annotation.getEAnnotations()){
			if("childElementNS".equals(attribute.getSource())){
				try{
					details=attribute.getDetails();
				org.w3c.dom.Element child=(org.w3c.dom.Element)Blackbox.createChildElementNS(details.get("name"),element,details.get("namespace"));
				if(child!=null)
					processElement(attribute,child);
				}catch(Throwable t){
					log("ERROR on createChildElementNS "+details.get("name")+", namespace "+details.get("namespace")+" : "+t);
				}
			}
		}
	}
	protected XSDAnnotation getXSDAnnotation(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(XSDAnnotation.class.isInstance(reference))return (XSDAnnotation)reference;
		}
		return null;
	}
	protected XSDConcreteComponent getXSDConcreteComponent(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(XSDConcreteComponent.class.isInstance(reference))return (XSDConcreteComponent)reference;
		}
		return null;
	}
	protected XSDSchema getXSDSchema(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(XSDSchema.class.isInstance(reference))return (XSDSchema)reference;
		}
		return null;
	}
	protected AttributeType getAttributeType(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(AttributeType.class.isInstance(reference))return (AttributeType)reference;
		}
		return null;
	}
	protected ElementType getElementType(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(ElementType.class.isInstance(reference))return (ElementType)reference;
		}
		return null;
	}
	protected TypeType getTypeType(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(TypeType.class.isInstance(reference))return (TypeType)reference;
		}
		return null;
	}
	protected AttributeInTypeType getAttributeInTypeType(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(AttributeInTypeType.class.isInstance(reference))return (AttributeInTypeType)reference;
		}
		return null;
	}
	protected ElementInTypeType getElementInTypeType(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(ElementInTypeType.class.isInstance(reference))return (ElementInTypeType)reference;
		}
		return null;
	}
	protected UnionMemberType getUnionMemberType(EAnnotation annotation){
		for(EObject reference:annotation.getReferences()){
			if(UnionMemberType.class.isInstance(reference))return (UnionMemberType)reference;
		}
		return null;
	}

	//////////////////////////////xsd2umlFacetContents
	/*
	protected Profile getXsdProfile(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package p){
		for(ProfileApplication pa:p.getProfileApplication()){
			Profile profile=pa.getAppliedProfile();
			if("xsd".equals(profile.getName()))return profile;
		}
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package nestingPackage=p.getNestingPackage();
		if(nestingPackage!=null)return getXsdProfile(nestingPackage);
		return null;
	}
	*/
	protected void getAllProfiles(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package p,Set<Profile> result){
		for(ProfileApplication pa:p.getProfileApplication()){
			Profile profile=pa.getAppliedProfile();
			if(profile==null){
				log("ERROR: getAllProfiles null profile");
				continue;
			}
			result.add(profile);
		}
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package nestingPackage=p.getNestingPackage();
		if(nestingPackage!=null) getAllProfiles(nestingPackage,result);
	}
	protected Map<String,Type> getNameToStereotype(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element umlClassifier){
		Map<String,Type> nameToStereotype=new HashMap<String,Type>();
		Set<Profile> profiles=new HashSet<Profile>();
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package nearestPackage=NIEMHelper.getNearestPackage(umlClassifier);
		if(nearestPackage==null){
			log("ERROR: getNameToStereotype no package for  "+umlClassifier);
			return nameToStereotype;
		}

		getAllProfiles(nearestPackage,profiles);
		for(Profile profile:profiles){
			//Profile profile=getXsdProfile(umlClassifier.getPackage());
			if(profile==null){
				log("ERROR: null profile found");
			}else{
			for(Type stereotype:profile.getOwnedType()){
				if(stereotype==null){
					log("ERROR: null type found");
					continue;
				}
				nameToStereotype.put(stereotype.getName(),stereotype);
			}
			}
		}
		return nameToStereotype;
	}
	protected void xsd2umlFacetContents(XSDSimpleTypeDefinition simpleType,Classifier umlClassifier){
		//log("xsd2umlFacetContents start "+simpleType+", "+umlClassifier);
		long start=System.currentTimeMillis();
		Map<String,Type> nameToStereotype=getNameToStereotype(umlClassifier);
		/*
		Map<String,Type> nameToStereotype=new HashMap<String,Type>();
		Profile profile=getXsdProfile(umlClassifier.getPackage());
		for(Type stereotype:profile.getOwnedType()){
			nameToStereotype.put(stereotype.getName(),stereotype);
		}
		*/
		//log("xsd2umlFacetContents for "+umlClassifier.getQualifiedName()+", "+simpleType.getFacetContents());
		EList<XSDConstrainingFacet> facets=simpleType.getFacetContents();
		if(facets!=null){
		for(XSDConstrainingFacet facet:simpleType.getFacetContents()){
			xsd2umlConstrainingFacet(facet,umlClassifier,nameToStereotype);
		}
		log("xsd2umlFacetContents for "+umlClassifier.getQualifiedName()
					+","+(System.currentTimeMillis()-start)+", "+facets.size());
		}
	}
	static protected String USER_INFORMATION_FEATURE_NAME="userInformation"; 
	static protected String DOCUMENTATION_VALUE_FEATURE_NAME="value"; 
	protected void xsd2umlConstrainingFacet(XSDConstrainingFacet facet,Classifier umlClassifier,Map<String,Type> nameToStereotype){
//		Stereotype annotationStereotype=(Stereotype)nameToStereotype.get("XSDAnnotation");
//		StructuralFeature userInformationFeature=getFeature(annotationStereotype,USER_INFORMATION_FEATURE_NAME);
//		Classifier xsdDocumentation=(Classifier)nameToStereotype.get("XSDDocumentation");
//		StructuralFeature documentationValueFeature=getFeature(xsdDocumentation,DOCUMENTATION_VALUE_FEATURE_NAME);
		Enumeration whiteSpaceEnumeration=(Enumeration)nameToStereotype.get("XSDWhiteSpace");
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package instanceOwner=umlClassifier.getPackage();
		
		UMLFactory factory=UMLFactory.eINSTANCE;
		Constraint constraint=factory.createConstraint();
		umlClassifier.getOwnedRule().add(constraint);
		constraint.getConstrainedElement().add(umlClassifier);
		Stereotype stereotype=(Stereotype)nameToStereotype.get(facet.eClass().getName());
		StereotypesHelper.addStereotype(constraint,stereotype);
		InstanceSpecification instanceSpecification=constraint.getAppliedStereotypeInstance();
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot valueSlot=factory.createSlot();
		StructuralFeature valueFeature=getFeature(stereotype,"value");
		valueSlot.setDefiningFeature(valueFeature);
		//.constraint..setEnumerationFacetValue  facet.getLexicalValue()
		ValueSpecification valueSpecification=null;
		if("String".equals(valueFeature.getType().getName())){
			LiteralString lvalueSpecification=factory.createLiteralString();
			String facetValue=facet.getLexicalValue();
			lvalueSpecification.setValue(facetValue);
			valueSpecification=lvalueSpecification;
			lvalueSpecification.setType(valueFeature.getType());
		}
		else if("Integer".equals(valueFeature.getType().getName())){
			LiteralInteger lvalueSpecification=factory.createLiteralInteger();
			String facetValue=facet.getLexicalValue();
			lvalueSpecification.setValue(new Integer(facetValue));
			lvalueSpecification.setType(valueFeature.getType());
			valueSpecification=lvalueSpecification;
		}
		else{
			InstanceValue lvalueSpecification=factory.createInstanceValue();
			String facetValue=facet.getLexicalValue();
			EnumerationLiteral whitespace=null;
			for(EnumerationLiteral test:whiteSpaceEnumeration.getOwnedLiteral()){
				if(facetValue.equals(test.getName())){
					whitespace=test;
					break;
				}
			}
			lvalueSpecification.setInstance(whitespace);
			lvalueSpecification.setType(whiteSpaceEnumeration);
			valueSpecification=lvalueSpecification;
			
		}
		
		valueSlot.getValue().add(valueSpecification);
		
		
		instanceSpecification.getSlot().add(valueSlot);
		XSDAnnotation annotation=facet.getAnnotation();
//		XSDAnnotation annotation=null;// timing test from 100 ms/item to 15 ms/item
		if(annotation!=null){
			mapXSDAnnotation(annotation,constraint,nameToStereotype);
			/*
			Comment comment=factory.createComment();
			constraint.getOwnedComment().add(comment);
			comment.getAnnotatedElement().add(constraint);
			StereotypesHelper.addStereotype(comment,annotationStereotype);
			InstanceSpecification annotationInstanceSpecification=comment.getAppliedStereotypeInstance();
			Slot umlUserInformationListSlot=factory.createSlot();
			umlUserInformationListSlot.setDefiningFeature(userInformationFeature);
			
			annotationInstanceSpecification.getSlot().add(umlUserInformationListSlot);

			for(Element userInformation:annotation.getUserInformation()){
				String useInformationText=userInformation.getTextContent();
				InstanceSpecification userInfoValueSpecification=factory.createInstanceSpecification();
				userInfoValueSpecification.getClassifier().add(xsdDocumentation);
				Slot documentationValueSlot=factory.createSlot();
				userInfoValueSpecification.getSlot().add(documentationValueSlot);
				documentationValueSlot.setDefiningFeature(documentationValueFeature);
				LiteralString documentationValueSpecification=factory.createLiteralString();
				documentationValueSpecification.setValue(useInformationText);
				//log("xsd2umlConstrainingFacet annotation "+useInformationText);
				documentationValueSlot.getValue().add(documentationValueSpecification);
				
				InstanceValue userInfoInstanceValue=factory.createInstanceValue();
				instanceOwner.getPackagedElement().add(userInfoInstanceValue);
				userInfoInstanceValue.setInstance(userInfoValueSpecification);
				//userInfoValueSpecification.setSpecification(userInfoInstanceValue);
				
				umlUserInformationListSlot.getValue().add(userInfoInstanceValue);
			}
		*/
		}
	}
	
protected StructuralFeature getFeature(Classifier c,String name){
	for(Property p:c.getAttribute()){
		if(name.equals(p.getName()))return p;
	}
	for(Classifier g:c.getGeneral()){
		StructuralFeature sf=getFeature(g,name);
		if(sf!=null)return sf;
	}
	return null;
}
////////////////////////////////////////////////////////////////////////
protected void mapXSDEnumerationFacet(DataType self,Enumeration psmOwner){
	UMLFactory factory=UMLFactory.eINSTANCE;
	Map<String,Type> nameToStereotypeSource=getNameToStereotype(self);
	//Map<String,Type> nameToStereotypeTarget=getNameToStereotype(psmOwner);
	//Stereotype NIEMDescriptionStereotype=(Stereotype)nameToStereotypeTarget.get("Documentation");
	Stereotype XsdEnumerationFacetStereotype=(Stereotype)nameToStereotypeSource.get("XSDEnumerationFacet");


	// 	self.ownedRule.map XSDEnumerationFacet(psmOwner);
	for(Constraint rule:self.getOwnedRule()){
		if(StereotypesHelper.hasStereotype(rule, XsdEnumerationFacetStereotype)){
			EnumerationLiteral literal=factory.createEnumerationLiteral();
			literal.setEnumeration(psmOwner);
			InstanceSpecification instance=rule.getAppliedStereotypeInstance();
			for(Slot slot:instance.getSlot()){
				if("value".equals(slot.getDefiningFeature().getName())){
					for(ValueSpecification vs:slot.getValue()){
						if(LiteralString.class.isInstance(vs)){
							literal.setName(((LiteralString)vs).getValue());
							break;
						}
					}
				}
			}
			ownedCommentmapXSDAnnotation(rule,literal);
			/*
			for(Comment sourceComment:rule.getOwnedComment()){
				Comment targetComment=factory.createComment();
				literal.getOwnedComment().add(targetComment);
				targetComment.getAnnotatedElement().add(literal);
				StereotypesHelper.addStereotype(targetComment,NIEMDescriptionStereotype);
				for(Slot slot:sourceComment.getAppliedStereotypeInstance().getSlot()){
					if(USER_INFORMATION_FEATURE_NAME.equals(slot.getDefiningFeature().getName())){
						for(ValueSpecification vs:slot.getValue()){
							if(InstanceValue.class.isInstance(vs)){
								InstanceSpecification is=((InstanceValue)vs).getInstance();
								for(Slot userInformationSlot:is.getSlot()){
									if(DOCUMENTATION_VALUE_FEATURE_NAME.equals(userInformationSlot.getDefiningFeature().getName())){
										for(ValueSpecification documentationValue:userInformationSlot.getValue()){
											if(LiteralString.class.isInstance(documentationValue)){
												targetComment.setBody(((LiteralString)documentationValue).getValue());
												break;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			*/
		}
		/*
		 * 	when{self.isStereotypeApplied(XsdEnumerationFacetStereotype)}	
	{
//		enumeration:=self.owner.oclAsType(UML::classes::mdkernel::Classifier).map AbstractXSDTypeDefinition().oclAsType(UML::classes::mdkernel::Enumeration);
		enumeration:=psmOwner;
		name:=self.getStereotypeApplication(XsdEnumerationFacetStereotype).getEnumerationFacetValue();
		self.ownedComment.map XSDAnnotation(result);

		 */
	}
}
/////////////////////////////////////////////////////
protected void ownedCommentmapXSDAnnotation(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element source,com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element target){
	UMLFactory factory=UMLFactory.eINSTANCE;
	for(Comment sourceComment:source.getOwnedComment()){
		Comment targetComment=factory.createComment();
		target.getOwnedComment().add(targetComment);
		targetComment.getAnnotatedElement().add(target);
		targetComment.setBody(sourceComment.getBody());
		/*
//		StereotypesHelper.addStereotype(targetComment,NIEMDescriptionStereotype);
		for(Slot slot:sourceComment.getAppliedStereotypeInstance().getSlot()){
			if(USER_INFORMATION_FEATURE_NAME.equals(slot.getDefiningFeature().getName())){
				for(ValueSpecification vs:slot.getValue()){
					if(InstanceValue.class.isInstance(vs)){
						InstanceSpecification is=((InstanceValue)vs).getInstance();
						for(Slot userInformationSlot:is.getSlot()){
							if(DOCUMENTATION_VALUE_FEATURE_NAME.equals(userInformationSlot.getDefiningFeature().getName())){
								for(ValueSpecification documentationValue:userInformationSlot.getValue()){
									if(LiteralString.class.isInstance(documentationValue)){
										targetComment.setBody(((LiteralString)documentationValue).getValue());
										break;
									}
								}
							}
						}
					}
				}
			}
			
		}
		*/
	}
	/*
	 * 		var stereotypeInstance:Stdlib::Element=self.getStereotypeApplication(XsdAnnotationStereotype);
		var documentationElements:OrderedSet(Stdlib::Element)=stereotypeInstance.getAnnotationUserInformation();
		documentationElements->forEach(appInfo){
			body:=appInfo.getElementValue();
		};
		annotatedElement:=pimElement;
		pimElement.ownedComment+=result;
		result.applyStereotype(NIEMDescriptionStereotype);

	 */
}
protected void mapXSDAnnotationX(XSDAnnotation annotation,com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element owner,Map<String,Type> nameToStereotypeTarget){
	UMLFactory factory=UMLFactory.eINSTANCE;
//	Map<String,Type> nameToStereotypeTarget=getNameToStereotype(owner);
//	Stereotype ndrAnnotation=(Stereotype)nameToStereotypeTarget.get("ndrAnnotation");
	Stereotype annotationStereotype=(Stereotype)nameToStereotypeTarget.get("XSDAnnotation");
	StructuralFeature userInformationFeature=getFeature(annotationStereotype,USER_INFORMATION_FEATURE_NAME);
	Classifier xsdDocumentation=(Classifier)nameToStereotypeTarget.get("XSDDocumentation");
	StructuralFeature documentationValueFeature=getFeature(xsdDocumentation,DOCUMENTATION_VALUE_FEATURE_NAME);
	com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package instanceOwner=NIEMHelper.getNearestPackage(owner);
	
	Comment comment=factory.createComment();
	owner.getOwnedComment().add(comment);
	comment.getAnnotatedElement().add(owner);
	StereotypesHelper.addStereotype(comment,annotationStereotype);

	InstanceSpecification annotationInstanceSpecification=comment.getAppliedStereotypeInstance();
	Slot umlUserInformationListSlot=factory.createSlot();
	umlUserInformationListSlot.setDefiningFeature(userInformationFeature);
	
	annotationInstanceSpecification.getSlot().add(umlUserInformationListSlot);
if(false){
	// timing is about same as when we get actual element
	// so problem is on uml side- 
	String useInformationText="TEST";
	InstanceSpecification userInfoValueSpecification=factory.createInstanceSpecification();
	userInfoValueSpecification.getClassifier().add(xsdDocumentation);
	Slot documentationValueSlot=factory.createSlot();
	userInfoValueSpecification.getSlot().add(documentationValueSlot);
	documentationValueSlot.setDefiningFeature(documentationValueFeature);
	LiteralString documentationValueSpecification=factory.createLiteralString();
	documentationValueSpecification.setValue(useInformationText);
	//log("xsd2umlConstrainingFacet annotation "+useInformationText);
	documentationValueSlot.getValue().add(documentationValueSpecification);
	
	InstanceValue userInfoInstanceValue=factory.createInstanceValue();
	instanceOwner.getPackagedElement().add(userInfoInstanceValue);
	userInfoInstanceValue.setInstance(userInfoValueSpecification);
	//userInfoValueSpecification.setSpecification(userInfoInstanceValue);
	
	umlUserInformationListSlot.getValue().add(userInfoInstanceValue);
	
}else{
	for(Element userInformation:annotation.getUserInformation()){
		String useInformationText=userInformation.getTextContent();
		InstanceSpecification userInfoValueSpecification=factory.createInstanceSpecification();
		userInfoValueSpecification.getClassifier().add(xsdDocumentation);
		Slot documentationValueSlot=factory.createSlot();
		userInfoValueSpecification.getSlot().add(documentationValueSlot);
		documentationValueSlot.setDefiningFeature(documentationValueFeature);
		LiteralString documentationValueSpecification=factory.createLiteralString();
		documentationValueSpecification.setValue(useInformationText);
		//log("xsd2umlConstrainingFacet annotation "+useInformationText);
		documentationValueSlot.getValue().add(documentationValueSpecification);
		
		InstanceValue userInfoInstanceValue=factory.createInstanceValue();
		instanceOwner.getPackagedElement().add(userInfoInstanceValue);
		userInfoInstanceValue.setInstance(userInfoValueSpecification);
		//userInfoValueSpecification.setSpecification(userInfoInstanceValue);
		
		umlUserInformationListSlot.getValue().add(userInfoInstanceValue);
	}
}
}
protected void mapXSDAnnotation(XSDAnnotation annotation,com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element owner,Map<String,Type> nameToStereotypeTarget){
	UMLFactory factory=UMLFactory.eINSTANCE;
	// just make the comment, no stereotype
	Comment comment=factory.createComment();
	owner.getOwnedComment().add(comment);
	comment.getAnnotatedElement().add(owner);
	for(Element userInformation:annotation.getUserInformation()){
		String useInformationText=userInformation.getTextContent();
		comment.setBody(useInformationText);
	}
}
/*
 * mapping 	XSD::XSDAnnotation::XSDAnnotation(inout owner:UML::classes::mdkernel::Element):UML::classes::mdkernel::Comment 
{
	init{}
	owner.ownedComment+=result;
	annotatedElement+=owner;
	
	var stereotypeInstance:Stdlib::Element=result.applyStereotype(self.getStereotype());
	var applicationInformations:OrderedSet(OclAny)=self.getXSDAnnotationApplicationInformation();
	if(applicationInformations->notEmpty())then{
		var umlApplicationInformationList:Stdlib::Element=stereotypeInstance.getAnnotationApplicationInformationList();
		applicationInformations->forEach(applicationInformation){
			umlApplicationInformationList.addApplicationInformation(applicationInformation);
		};
		
	}endif;
	var userInformations:OrderedSet(OclAny)=self.getXSDAnnotationUserInformation();
	if(userInformations->notEmpty())then{
		var umlUserInformationList:Stdlib::Element=stereotypeInstance.getAnnotationUserInformationList();
		userInformations->forEach(userInformation){
			umlUserInformationList.addApplicationInformation(userInformation);
		};
		// populate body from first user information text
		//body:=userInformations->first().getElementValue();
	}endif;
}	

 */
////////////////////////////////////////////////////////////////////
}
