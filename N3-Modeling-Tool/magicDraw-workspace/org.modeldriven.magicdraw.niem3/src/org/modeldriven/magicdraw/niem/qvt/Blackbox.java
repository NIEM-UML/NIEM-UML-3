package org.modeldriven.magicdraw.niem.qvt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDAttributeGroupContent;
import org.eclipse.xsd.XSDAttributeGroupDefinition;
import org.eclipse.xsd.XSDAttributeUse;
import org.eclipse.xsd.XSDComplexTypeContent;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDParticleContent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSchemaContent;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.impl.XSDImportImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.MultiplicityElement;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;


public class Blackbox {
	public Blackbox() {
		super();
		
	}
	@Operation(contextual=true)
	public String toCharSet(String text,String charSet){
		//UnitResolverFactory.Registry.INSTANCE=null;
		try {
			return new String(text.getBytes(),charSet);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return text;
		}
	}	
	@Operation(contextual=true)
	public Object date(String any){
		GregorianCalendar cal=new GregorianCalendar();
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}	
	@Operation(contextual=true)
	static public List<Object> getApplicationInformation(XSDAnnotation annotation) {
		List<Object> result=new Vector<Object>();
		for(Element element:annotation.getApplicationInformation()){
			NodeList nodes=element.getElementsByTagName("*");
			for(int i=0;i<nodes.getLength();i++){
				Node node=nodes.item(i);
				if(node instanceof org.w3c.dom.Element ){
//System.out.println("getApplicationInformation "+node);					
					result.add(node);
				}
			}
		}
		return result;
	}	
	@Operation(contextual=true)
	static public Collection<Object> getManyValue(org.eclipse.uml2.uml.Element element,Stereotype stereotype,String tagName) {
		Object test=element.getValue(stereotype, tagName);
		Collection<Object> result=new Vector<Object>();
		if(Collection.class.isInstance(test)){
			result=(Collection)test;
		}else{
			if(test!=null){
				result.add(test);
			}
		}
		return result;
	}	
	@Operation(contextual=true)
	static public EStructuralFeature getEStructuralFeature(Object featureMapEntry) {
		
		return ((FeatureMap.Entry)featureMapEntry).getEStructuralFeature();
	}	
	@Operation(contextual=true)
	static public Object getValue(Object featureMapEntry) {
		return ((FeatureMap.Entry)featureMapEntry).getValue();
	}	

	// not very good for niem, xsd models; syntax variants such as [n:x] versus namespace#x,
	// not finding id matches, etc.
	/*
		@Operation(contextual=true)
		static public Object getDiff(Object v1,Object v2) {
			try{
		        Map options = new HashMap();
		        options.put(MatchOptions.OPTION_IGNORE_ID, true);
		        options.put(MatchOptions.OPTION_IGNORE_XMI_ID, true);
				System.out.println("getDiff  start match "+v1+","+v2);
//		        MatchModel match = MatchService.doContentMatch((EObject)v1, (EObject)v2, options);
				BlackboxMatchEngine matchEngine=new BlackboxMatchEngine();
		        MatchModel match = matchEngine.contentMatch((EObject)v1, (EObject)v2, options);
//		        MatchModel match = MatchService.doResourceMatch(((EObject)v1).eResource(), ((EObject)v2).eResource(), options);
				System.out.println("getDiff  start diff "+match+", "+v1+","+v2);
//		        DiffModel diff =  DiffService.doDiff(match);
				BlackboxDiffEngine diffEngine=new BlackboxDiffEngine();
		        DiffModel diff =  diffEngine.doDiff(match);
		        matchEngine.reset();
		        diffEngine.reset();
				System.out.println("getDiff  "+diff+","+v1+","+v2);
				return diff;
			}catch(Throwable t){
				System.out.println("getDiff ERROR "+v1+","+v2+" : "+t);
				t.printStackTrace();
			}
			return null;
		}
	*/
	@Operation(contextual=true)
	static public List<String> getStringList(EObject eObject,EStructuralFeature sf) {
			List<String> files=(List)eObject.eGet(sf);
			if(files==null){
				files=new Vector<String>();
			}
		return files;
	}
	@Operation(contextual=true)
	static public void addToStringList(String idref,Object eObject,String featureName) {
		try{
			//((List)idrefs).add(idref);
			EStructuralFeature sf=((EObject)eObject).eClass().getEStructuralFeature(featureName);
			List files=((List)((EObject)eObject).eGet(sf));
			if(files==null){
				files=new Vector<String>();
				((EObject)eObject).eSet(sf,files);
			}
			//System.out.println("addToStringList sf "+featureName+", "+files+", "+sf);
			files.add(idref);
			//System.out.println("addToStringList "+idref+", "+files);
		}catch(Throwable t){
			System.out.println("addToStringList ERROR "+idref+","+eObject+" : "+t);
			//t.printStackTrace();
		}
		return ;
	}

	/*
	@Operation(contextual=true)
	static public Object getValueTest(org.eclipse.uml2.uml.Element element,Stereotype stereotype,String tag) {
		try{
			Object result=element.getValue(stereotype,tag);
			System.out.println("getValueTest "+result);
			return result;
		}catch(Throwable t){
		    EObject eObject = element.getStereotypeApplication(stereotype);
		    EClass eClass = eObject.eClass();
		    EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(tag);
			System.out.println("getValueTest ERROR "+eClass.getName()+","+eStructuralFeature+" : "+t);
			for(EStructuralFeature sf:eClass.getEAllStructuralFeatures()){
				System.out.println("getValueTest feature "+sf.getName());
			}
			return null;
		}
	}
	*/
	@Operation(contextual=true)
	static public void add(EObject eObject,String mapFeature,String targetFeature,Object object,MDLog log) {
		//System.out.println("add entered for eObject "+eObject+", mapFeature "+mapFeature+", "+targetFeature+", "+eObject.eClass().getEAllStructuralFeatures().size()+", object "+object);
		//log.log("add entered "+eObject+", "+mapFeature+", "+targetFeature+", "+eObject.eClass().getEAllStructuralFeatures().size());
		//artifactGroup, file, 6
		EClass eClass=eObject.eClass();
		EPackage ePackage=eClass.getEPackage();
		EClass documentRoot=(EClass)ePackage.getEClassifier("DocumentRoot");
		for(EStructuralFeature testMapFeature:eClass.getEAllStructuralFeatures()){
			if(mapFeature.equals(testMapFeature.getName())){
				//log.log("add test2 "+testMapFeature);
				Object featureMapTest=eObject.eGet(testMapFeature);
				//log.log("add test "+featureMapTest);
				FeatureMap featureMap=(FeatureMap)featureMapTest;
				for(EStructuralFeature testTargetFeature:documentRoot.getEAllStructuralFeatures()){
					if(targetFeature.equals(testTargetFeature.getName())){
						featureMap.add(testTargetFeature, object);
						//System.out.println("add "+object);
						//log.log("add "+object);
						return;
					}
				}
			}
		}
	}
/*
	@Operation(contextual=true)
	static public Collection<Object> asMany(Object object) {
		System.out.println("asMany "+object.getClass().getName()+", "+object);
		if(Collection.class.isInstance(object))return (Collection<Object>)object;
		Collection<Object> result=new Vector<Object>();
		result.add(object);
		return result;
	}
	*/
	@Operation(contextual=true)
	public static Object getEnumerator(EEnum eNum,String name) {
		for(EEnumLiteral enumLiteral:eNum.getELiterals()){
			if(enumLiteral.getName().equals(name))return enumLiteral.getInstance();
		}
		return null;
	}
	
	@Operation(contextual=true)
	public static String platformGlobalId(EObject eObject) {
		//EnumerationLiteral x;
		return ((EObject)eObject).eResource().getURIFragment((EObject)eObject);
	}
	@Operation(contextual=true)
	static public Collection<Object> eGetManyObject(EObject eobject,EStructuralFeature reference) {
		Object test=eobject.eGet(reference);
		if(Collection.class.isInstance(test))return (Collection<Object>)test;
		Collection<Object> result=new Vector<Object>();
		result.add(test);
		return result;
	}
	@Operation(contextual=true)
	static public Collection<EObject> eGetMany(EObject eobject,EStructuralFeature reference) {
		return (Collection<EObject>)eobject.eGet(reference);
	}
	@Operation(contextual=true)
	static public void eSetManyObject(EObject eobject,EStructuralFeature reference,Collection<Object> objects) {
		Collection<Object> objectList=(Collection<Object>)eobject.eGet(reference);
		objectList.addAll(objects);
	}
	@Operation(contextual=true)
	static public String getURI(EObject eobject) {
		return eobject.eResource().getURI()+"#"+eobject.eResource().getURIFragment(eobject);
	}
	/*
	@Operation(contextual=true)
	static public void setQName(Message definition,String name) {
		QName qName=new QName(name);
		definition.setQName(qName);
	}
	@Operation(contextual=true)
	static public void setQName(PortType definition,String name) {
		QName qName=new QName(name);
		definition.setQName(qName);
	}
	@Operation(contextual=true)
	static public void setQName(Service definition,String name) {
		QName qName=new QName(name);
		definition.setQName(qName);
	}
	@Operation(contextual=true)
	static public void setQName(Binding definition,String name) {
		QName qName=new QName(name);
		definition.setQName(qName);
	}
	@Operation(contextual=true)
	static public void setQName(Definition definition,String name) {
		QName qName=new QName(name);
		definition.setQName(qName);
	}
	@Operation(contextual=true)
	static public void setElementType(UnknownExtensibilityElement definition,String namespace,String name) {
		QName qName=new QName(namespace,name);
		definition.setElementType(qName);
	}
		
	@Operation(contextual=true)
	static public void setElementAttribute(WSDLElement definition,String attributeName,String value) {
		org.w3c.dom.Element element=getDomElement(definition);
		element.setAttribute(attributeName, value);
	}
	@Operation(contextual=true)
	static public void setElementAttribute(WSDLElement definition,String namespaceURI,String attributeName,String value) {
		org.w3c.dom.Element element=getDomElement(definition);
		element.setAttributeNS(namespaceURI,attributeName, value);
	}
	static protected org.w3c.dom.Element getDomElement(WSDLElement wsdlelement) {
		org.w3c.dom.Element element=wsdlelement.getElement();
		if(element==null){
			wsdlelement.updateElement();
			element=wsdlelement.getElement();
		}
		return element;
	}
	@Operation(contextual=true)
	static public Object createDocumentationElement(WSDLElement wsdlelement) {
		org.w3c.dom.Element docElement=wsdlelement.getDocumentationElement();
		if(docElement==null){
			org.w3c.dom.Element element=getDomElement(wsdlelement);
			docElement=element.getOwnerDocument().createElementNS("http://schemas.xmlsoap.org/wsdl/", "documentation");
			//element.insertBefore(docElement, element.getFirstChild());//appendChild(docElement);
			wsdlelement.setDocumentationElement(docElement);
		}
		return docElement;
	}

	static protected void fixupExtensibleElement(ExtensibleElement wsdlElement){
		for(Object test:wsdlElement.getEExtensibilityElements()){
			ExtensibilityElement extensibilityElement=(ExtensibilityElement)test;
			QName qName=extensibilityElement.getElementType();
			String prefix=getPrefix(qName.getNamespaceURI(),wsdlElement.getEnclosingDefinition());
			org.w3c.dom.Element element=extensibilityElement.getElement();
			element.setPrefix(prefix);
		}
	}
	static protected void fixupDocumentationElement(WSDLElement wsdlElement){
		//wsdlElement.updateElement(true);
		org.w3c.dom.Element element=wsdlElement.getElement();
		org.w3c.dom.Element docElement=wsdlElement.getDocumentationElement();
		if(docElement!=null){
			element.insertBefore(docElement, element.getFirstChild());
		}
		if(ExtensibleElement.class.isInstance(wsdlElement)){
			fixupExtensibleElement((ExtensibleElement)wsdlElement);
		}
	}
	static protected void fixupElement(WSDLElement wsdlElement,String attributeName ,QName qName){
		//wsdlElement.updateElement(true);
		org.w3c.dom.Element domElementx=wsdlElement.getElement();
		domElementx.setAttribute(attributeName, qName.getPrefix()+":"+qName.getLocalPart());
		fixupDocumentationElement(wsdlElement);
	}
	static protected String getPrefix(String namespace,Definition definition){
		return getPrefix(namespace,definition.getElement());
	}
	static protected void fixupElement(WSDLElement wsdlElement,String attributeName ,QName qName,WSDLElement wsdlReferenced){
		String namespace=wsdlReferenced.getEnclosingDefinition().getTargetNamespace();
//		String prefix=getPrefix(namespace,wsdlReferenced.getEnclosingDefinition());
		String prefix=getPrefix(namespace,wsdlElement.getEnclosingDefinition());
		QName refQName=new QName(namespace,qName.getLocalPart(),prefix);
		fixupElement(wsdlElement,attributeName,refQName);
	}
	static protected String xmlnsNamespace="http://www.w3.org/2000/xmlns/";
	@Operation(contextual=true)
	static public void splitWsdls(EObject wsdlIn ,EObject referenceTarget) {
		Definition wsdl=(Definition)wsdlIn;
		Resource resource=wsdl.eResource();
		ResourceSet resourceSet=resource.getResourceSet();
		//String schemaLocation=wsdl.getLocation();//"wsdl/test.wsdl";//schema.getSchemaLocation();
		Resource referenceResource=referenceTarget.eResource();
		URI referenceURI=referenceResource.getURI().trimSegments(1);
		Map options=new HashMap();
		for(EObject targetObject:new Vector<EObject>(resource.getContents())){
			if(Definition.class.isInstance(targetObject)){
				Definition targetWsdl=(Definition)targetObject;
			URI targetURI=URI.createURI(referenceURI+"/"+targetWsdl.getLocation());
			System.out.println("splitWsdls "+targetURI);
			Resource targetResource=resourceSet.createResource(targetURI);
			targetResource.getContents().add(targetWsdl);
			try {
				// check
				// document fixups
				//targetWsdl.updateElement();
				//org.eclipse.wst.wsdl.internal.impl.DefinitionImpl x;
				//((org.eclipse.wst.wsdl.internal.impl.DefinitionImpl)targetWsdl).updateDocument();
				targetWsdl.updateElement(true);
				// namespaces
				org.w3c.dom.Element domElement=targetWsdl.getElement();
				for(Object namespaceo:targetWsdl.getENamespaces()){
					Namespace namespace=(Namespace)namespaceo;
					String localName="xmlns:"+namespace.getPrefix();
					if(domElement.getAttributeNodeNS(xmlnsNamespace, localName)==null){
						domElement.setAttributeNS(xmlnsNamespace, localName, namespace.getURI());
					}
				}
				// service
				for(Object namespaceo:targetWsdl.getEServices()){
					Service service=(Service)namespaceo;
					fixupDocumentationElement(service);
					for(Object namespacep:service.getEPorts()){
						Port port=(Port)namespacep;
						if(port.getEBinding()!=null){
						fixupElement(port,"binding",port.getEBinding().getQName(),port.getEBinding());
						}
					}
				}
				for(Object namespaceo:targetWsdl.getEBindings()){
					Binding binding=(Binding)namespaceo;
					fixupDocumentationElement(binding);
					fixupElement(binding,"type",binding.getEPortType().getQName(),binding.getEPortType());
					for(Object namespacep:binding.getBindingOperations()){
						org.eclipse.wst.wsdl.BindingOperation operation=(org.eclipse.wst.wsdl.BindingOperation)namespacep;
						fixupExtensibleElement(operation);
						BindingInput input=operation.getEBindingInput();
						BindingOutput output=operation.getEBindingOutput();
						if(input!=null)fixupExtensibleElement(input);
						if(output!=null)fixupExtensibleElement(output);
						for(Object namespaceq:operation.getEBindingFaults()){
							org.eclipse.wst.wsdl.Fault fault=(org.eclipse.wst.wsdl.Fault)namespaceq;
							fixupExtensibleElement(fault);
						}
					}
				}
				for(Object namespaceo:targetWsdl.getEPortTypes()){
					PortType portType=(PortType)namespaceo;
					fixupDocumentationElement(portType);
					for(Object namespacep:portType.getEOperations()){
						org.eclipse.wst.wsdl.Operation operation=(org.eclipse.wst.wsdl.Operation)namespacep;
						fixupDocumentationElement(operation);
						Input input=operation.getEInput();
						if(input!=null)fixupElement(input,"message",input.getEMessage().getQName(),input.getEMessage());
						Output output=operation.getEOutput();
						if(output!=null)fixupElement(output,"message",output.getEMessage().getQName(),output.getEMessage());
						for(Object namespacef:operation.getEFaults()){
							Fault fault=(Fault)namespacep;
							fixupElement(fault,"message",fault.getEMessage().getQName(),fault.getEMessage());
						}
					}
				}
				for(Object namespaceo:targetWsdl.getEMessages()){
					Message message=(Message)namespaceo;
					fixupDocumentationElement(message);
					//QName baseQName=new QName(message.getEnclosingDefinition().getTargetNamespace(),message.getQName().getLocalPart(),"tns");
					//message.setQName(baseQName);
					for(Object namespacep:message.getEParts()){
						Part part=(Part)namespacep;
						XSDTypeDefinition typeDefinition=part.getTypeDefinition();
						if(typeDefinition!=null){
							if(typeDefinition.getSchema()==null){
								System.out.println("ERROR: no schema for typeDefinition "+typeDefinition);
							}else{
							String namespace=typeDefinition.getSchema().getTargetNamespace();
							String prefix=getPrefix(namespace,targetWsdl);
							QName refQName=new QName(namespace,typeDefinition.getName(),prefix);
							//QName qName=new QName(typeDefinition.getSchema().getTargetNamespace(),typeDefinition.getName());
							fixupElement(part,"type",refQName);
							}
						}else{
//							fixupElement(part,"type",part.getTypeName());
							
						}
					}
				}
				fixupDocumentationElement(targetWsdl);

				targetResource.save(options);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else{
				System.out.println("splitWsdls ERROR-non Definition Root "+targetObject);
				
			}
		}
	}
	*/
	static protected String getPrefix(String namespace,org.w3c.dom.Element domElement){
		NamedNodeMap attributeMap=domElement.getAttributes();
		int length=attributeMap.getLength();
		// if we have a definition for a prefix, use it to override the default generated by xsd
		String xsdDefinedPrefix=null;
		for(int i=0;i<length;i++){
			Attr node=(Attr)attributeMap.item(i);
			if(
					"http://www.w3.org/2000/xmlns/".equals(node.getNamespaceURI())
					&&"xmlns".equals(node.getPrefix())
					&&namespace.equals(node.getValue())
				){
//				return node.getLocalName();
				String localName= node.getLocalName();
				if((localName!=null)&&localName.startsWith("Q")){
					xsdDefinedPrefix=localName;
					continue;
				}
				return localName;
			}
		}
		if(xsdDefinedPrefix!=null)return xsdDefinedPrefix;
		String newPrefix="tns"+(length+1);
		
		domElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:"+newPrefix, namespace);
		return newPrefix;
	}
	@Operation(contextual=true)
	static public void splitSchemas(EObject schemaIn ,URI referenceTargetURI,ResourceSet resourceSet,MDLog log) {
		//org.eclipse.xsd.impl.XSDModelGroupImpl x;
		XSDSchema schema=(XSDSchema)schemaIn;
		/*
		Resource resource=schema.eResource();
		ResourceSet resourceSet=resource.getResourceSet();
		*/
		String schemaLocation=schema.getSchemaLocation();
		if(schemaLocation==null)schemaLocation="UNKNOWN.xsd";
		String targetNamespace=schema.getTargetNamespace();
		log.log("splitSchemas schemaLocation- "+schemaLocation+", targetNamespace "+targetNamespace);
		//Resource referenceResource=referenceTarget.eResource();
		//log.log("splitSchemas referenceTargetURI- "+referenceTargetURI);
		URI referenceURI=referenceTargetURI;//.trimSegments(1);
		//log.log("splitSchemas referenceURI- "+referenceURI);
		Map options=new HashMap();
		boolean firstError=true;
//		for(EObject targetObject:new Vector<EObject>(resource.getContents())){
		EObject targetObject=schema;
			if(XSDSchema.class.isInstance(targetObject)){
			XSDSchema targetSchema=(XSDSchema)targetObject;
//			targetSchema.updateDocument();
//			targetSchema.reset();
//			targetSchema.update(true);
			// fixups: scan for types of elements
			try{
				// TODO: fixup the namespace map; if there are any "Q*", remove them if there is another definition for same namespace
			for(XSDSchemaContent schemaContent:targetSchema.getContents()){
				//log.log("splitSchemas schemaContent- "+schemaContent);
				if(XSDComplexTypeDefinition.class.isInstance(schemaContent)){
					fixupComplexTypeDefinition((XSDComplexTypeDefinition)schemaContent);
				}
				else if(XSDSimpleTypeDefinition.class.isInstance(schemaContent)){
					fixupSimpleTypeDefinition((XSDSimpleTypeDefinition)schemaContent);
				}
				else if(XSDElementDeclaration.class.isInstance(schemaContent)){
					 fixupElementDeclaration((XSDElementDeclaration)schemaContent);
				 }else if(XSDModelGroup.class.isInstance(schemaContent)){
					 fixupModelGroup((XSDModelGroup)schemaContent);
				 }else if(XSDAttributeGroupDefinition.class.isInstance(schemaContent)){
					 fixupAttributeGroupDefinition((XSDAttributeGroupDefinition)schemaContent);
			 }else if(XSDAttributeDeclaration.class.isInstance(schemaContent)){
				 fixupAttributeDeclaration((XSDAttributeDeclaration)schemaContent);
			 }
			}
			
			URI targetURI=URI.createURI(referenceURI+"/"+schemaLocation.replace("platform:/resource/",""));
			//log.log("splitSchemas targetURI "+targetURI);
			Resource targetResource=resourceSet.createResource(targetURI);
			if(targetResource==null){
				log.log("ERROR: splitSchemas failed to create resource at "+targetURI);
			}else{
				//log.log("splitSchemas targetResource "+targetResource);
				targetResource.getContents().add(targetSchema);
				try {
					//log.log("splitSchemas saving "+options);
					targetResource.save(options);
				} catch (IOException e) {
					log.log("splitSchemas ERROR- during save: "+e);
					e.printStackTrace();
				}
			}
			}catch(Throwable t){
				log.log("splitSchemas ERROR- "+t);
				if(firstError){
					t.printStackTrace();
					firstError=false;
				}
				
			}
			}else{
				log.log("splitSchemas ERROR-non Schema Root "+targetObject);
				
			}
//		}
	}
	private static void fixupComplexTypeDefinition(
			XSDComplexTypeDefinition complexTypeDefinition) {
		XSDComplexTypeContent content=complexTypeDefinition.getContent();
		XSDTypeDefinition base=complexTypeDefinition.getBaseTypeDefinition();
		if(content!=null)content.updateElement(true);
		if(XSDParticle.class.isInstance(content)){
			if(base!=null){
				/*
				if(content.getElement()==null){
					content.updateElement();
				}
				*/
				if(!"complexType".equals(content.getElement().getParentNode().getLocalName())){
				 fixupXSDElement((Element) content.getElement().getParentNode(),content,"base",base);
				}
			}
			fixupParticle((XSDParticle)content);
		}
		else if(XSDSimpleTypeDefinition.class.isInstance(content)){
//			fixupSimpleTypeDefinition((XSDSimpleTypeDefinition)content,base);
			//XSDSimpleTypeDefinition simpleBase=((XSDSimpleTypeDefinition)content).getBaseTypeDefinition();
			if((base!=null)){
//			if((simpleBase==null)&&(base!=null)){
//				System.out.println("complexType test "+base+", "+content);
				fixupSimpleTypeDefinition((XSDSimpleTypeDefinition)content,base);
			}else{
				fixupSimpleTypeDefinition((XSDSimpleTypeDefinition)content);
			}
		}
		for(XSDAttributeGroupContent attributeGroupContent:complexTypeDefinition.getAttributeContents()){
			fixupAttributeGroupContent(attributeGroupContent);
		}
		
	}
	private static void fixupAttributeGroupContent(
			XSDAttributeGroupContent complexTypeDefinition) {
		if(XSDAttributeGroupDefinition.class.isInstance(complexTypeDefinition))fixupAttributeGroupDefinition((XSDAttributeGroupDefinition)complexTypeDefinition);
		else fixupAttributeUse((XSDAttributeUse)complexTypeDefinition);
	}
	private static void fixupAttributeGroupDefinition(
			XSDAttributeGroupDefinition attributeGroupDefinition) {
		if(attributeGroupDefinition.isAttributeGroupDefinitionReference()){
			fixupXSDElement(attributeGroupDefinition,"ref",attributeGroupDefinition.getResolvedAttributeGroupDefinition());
		}
		for(XSDAttributeGroupContent attributeGroupContent:attributeGroupDefinition.getContents()){
			fixupAttributeGroupContent(attributeGroupContent);
		}
	}
	private static void fixupAttributeUse(
			XSDAttributeUse complexTypeDefinition) {
		fixupAttributeDeclaration(complexTypeDefinition.getContent());
	}
	private static void fixupAttributeDeclaration(
			XSDAttributeDeclaration attributeDeclaration) {
		//complexTypeDefinition.getResolvedAttributeDeclaration(); 
		XSDSimpleTypeDefinition typeDefinition=attributeDeclaration.getTypeDefinition();
		/*
		if("linkMetadata".equals(attributeDeclaration.getName())){
			System.out.println("fixupAttributeDeclaration linkMetadata "+typeDefinition);
		}
		*/
		if((typeDefinition!=null)&&(typeDefinition.getName()!=null)&&!(attributeDeclaration.isAttributeDeclarationReference())){
			fixupXSDElement(attributeDeclaration,"type",typeDefinition);
		}else if(attributeDeclaration.isAttributeDeclarationReference()){
			fixupXSDElement(attributeDeclaration,"ref",attributeDeclaration.getResolvedAttributeDeclaration());
		}
	}
	private static void fixupSimpleTypeDefinition(
			XSDSimpleTypeDefinition simpleTypeDefinition,XSDTypeDefinition base) {
		if(simpleTypeDefinition.getElement()==null){
			simpleTypeDefinition.updateElement();
		}
		//XSDTypeDefinition base=simpleTypeDefinition.getBaseTypeDefinition();
		if(base!=null){
			Element simpleElement=simpleTypeDefinition.getElement();
			if(simpleElement!=null){
				NodeList children=simpleElement.getChildNodes();
				for(int i=0;i<children.getLength();i++){
					Node child=children.item(i);
					if(Element.class.isInstance(child) 
							&& (child.getLocalName().equals("restriction")
								||child.getLocalName().equals("extension")
									)
							){
						if(base.getContainer()==null){
							// this seems to be the case for the simpleContent of a complex type
							//System.out.println("fixupSimpleTypeDefinition base has no container ");
						}else{
							fixupXSDElement((Element)child,simpleTypeDefinition,"base",base);
						}
					}
				}
			}
		}
		for(XSDSimpleTypeDefinition content:simpleTypeDefinition.getContents()){
			fixupSimpleTypeDefinition(content);
		}
		/*
		if(base!=null){
			if(simpleTypeDefinition.getElement()==null){
				simpleTypeDefinition.updateElement();
			}
			 fixupXSDElement(simpleTypeDefinition,"base",base);
		}
		for(XSDSimpleTypeDefinition content:simpleTypeDefinition.getContents()){
			fixupSimpleTypeDefinition(content);
		}
		*/
		/*
		for(XSDSimpleTypeDefinition content:simpleTypeDefinition.getContents()){
			if(base!=null){
				if(content.getElement()==null){
					content.updateElement();
				}
				 fixupXSDElement(content,"base",base);
			}
		}
		*/
	}
	private static void fixupSimpleTypeDefinition(
			XSDSimpleTypeDefinition simpleTypeDefinition) {
		//simpleTypeDefinition.updateElement(true);// TODO test
		XSDTypeDefinition base=simpleTypeDefinition.getBaseTypeDefinition();
		fixupSimpleTypeDefinition(simpleTypeDefinition,base);
		// TODO test
		/*
		for(XSDConstrainingFacet test:simpleTypeDefinition.getFacetContents()){
			if(XSDEnumerationFacet.class.isInstance(test))continue;
			System.out.println("fixupSimpleTypeDefinition updating "+test);
			test.updateElement(true);
		}
		*/
	}
	private static void fixupParticle(XSDParticle particle) {
		XSDParticleContent content=particle.getContent() ;
		 if(XSDElementDeclaration.class.isInstance(content)){
			 fixupElementDeclaration((XSDElementDeclaration)content);
		 }else if(XSDModelGroup.class.isInstance(content)){
			 fixupModelGroup((XSDModelGroup)content);
		 }
		
	}
	private static void fixupModelGroup(XSDModelGroup content) {
		for(XSDParticle particle:content.getContents()){
			fixupParticle(particle);
		}
	}
	private static void fixupElementDeclaration(XSDElementDeclaration elementDeclaration) {
		elementDeclaration.updateElement(true);
//		fixupXSDElement(elementDeclaration,"type",elementDeclaration.getTypeDefinition());
		XSDElementDeclaration resolvedElementDeclaration=elementDeclaration.getResolvedElementDeclaration();
		XSDTypeDefinition typeDefinition=resolvedElementDeclaration.getTypeDefinition();
		if((typeDefinition!=null)&&(typeDefinition.getName()!=null)&&!(elementDeclaration.isElementDeclarationReference())){
			
			fixupXSDElement(elementDeclaration,"type",typeDefinition);
		}
		// can we fixup the prefix on a "ref"?
		if(elementDeclaration.isElementDeclarationReference()&&(resolvedElementDeclaration!=null)){
			fixupXSDElement(elementDeclaration,"ref",resolvedElementDeclaration);
		}
		// fixup prefix on a substitutionGroup
		XSDElementDeclaration substitutionGroupAffiliation=elementDeclaration.getSubstitutionGroupAffiliation();
		if(!(elementDeclaration.isElementDeclarationReference())&&(substitutionGroupAffiliation!=null)){
			fixupXSDElement(elementDeclaration,"substitutionGroup",substitutionGroupAffiliation);
		}
	}
	static protected void fixupXSDElement(org.w3c.dom.Element domElementx,XSDConcreteComponent xsdElement,String attributeName ,XSDNamedComponent referencedComponent){
		if(referencedComponent==null){
			System.out.println("FAILED to get "+attributeName+" for xsd component "+xsdElement);
			return;
		}
		org.w3c.dom.Element schemaElement=xsdElement.getSchema().getElement();
		String namespace=null;
		XSDSchema schema=referencedComponent.getSchema();
		if(schema==null){
			namespace=referencedComponent.getTargetNamespace();
			if(namespace==null){
				XSDConcreteComponent c1=xsdElement.getContainer();
				System.out.println("FAILED to get schema for attribute "+attributeName+", "+c1+", xsd component "+xsdElement+", referenced component "+referencedComponent+", container "+referencedComponent.getContainer());
				return;
			}
		}else{
			namespace=schema.getTargetNamespace();
		}
		if(namespace==null){
			System.out.println("FAILED to get schema namespace for schema "+schema+", attribute "+attributeName+", xsd component "+xsdElement+", referenced component "+referencedComponent+", container "+referencedComponent.getContainer());
			return;
		}
		String prefix=getPrefix(namespace,schemaElement);
		domElementx.setAttribute(attributeName, prefix+":"+referencedComponent.getName());
		//System.out.println("fixupXSDElement "+prefix);
	}
	static protected void fixupXSDElement(XSDConcreteComponent xsdElement,String attributeName ,XSDNamedComponent referencedComponent){
		if(xsdElement.getElement()==null)xsdElement.updateElement();
		fixupXSDElement(xsdElement.getElement(),xsdElement,attributeName,referencedComponent);
	}

	@Operation(contextual=true)
	static public void setQNamePrefixToNamespace(XSDSchema schema,String prefix,String namespace) {
		schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
	}
	
	@Operation(contextual=true)
	static public void setSchemaForSchema(XSDSchema schema,String prefix,String namespace) {
		schema.setSchemaForSchemaQNamePrefix(prefix);
		schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
		//schema.getQNamePrefixToNamespaceMap().put("tns",schema.getTargetNamespace());
		schema.setIncrementalUpdate(false);
		//if(schema.getDocument()==null)schema.updateDocument();
	}
	@Operation(contextual=true)
	static public Object createUserInformation(XSDAnnotation annotation,String sourceURI,XSDSchema owningSchema) {
		// this will not work unless containment structure in place
		if(annotation==null){
			log("ERROR: createUserInformation internal error, illegal argument: annotation null , sourceURI "+sourceURI+", fallback Schema "+owningSchema);
			return null;
		}
		if(owningSchema==null){
			log("ERROR: createUserInformation internal error, illegal argument: owningSchema null from annotation "+annotation+", sourceURI "+sourceURI);
			return null;
		}
		if(annotation.getSchema()==null){
			owningSchema.getContents().add(annotation);// temporary, will be moved later by transform
		}
		XSDSchema schema=annotation.getSchema();
		if(schema==null){
			log("ERROR: createUserInformation internal error, failed to get Schema from annotation "+annotation+", sourceURI "+sourceURI+", fallback Schema "+owningSchema);
			return null;
		}
		if(schema.getDocument()==null)schema.updateDocument();
		org.w3c.dom.Element result=annotation.createUserInformation(sourceURI);
		if(result==null){
			log("ERROR: createUserInformation internal error, failed to create userInformation from annotation "+annotation+", sourceURI "+sourceURI+", fallback Schema "+owningSchema);
			return null;
		}
		
		
		Node firstChild=annotation.getElement().getFirstChild();

		if(firstChild==null){
			annotation.getElement().appendChild(result);
		}else{
			annotation.getElement().insertBefore(result, firstChild);
			
		}
		return result;
	}
	static public void log(String text){
		Application.getInstance().getGUILog().log(text);
	}
	
	@Operation(contextual=true)
	static public Object createApplicationInformation(XSDAnnotation annotation,String sourceURI/*,XSDSchema owningSchema*/) {
		// this will not work unless containment structure in place
		if(annotation.getSchema()==null){
			log("ERROR:createApplicationInformation no schema ");
			//TODO owningSchema.getContents().add(annotation);// temporary, will be moved later by transform
			return null;
		}
		XSDSchema schema=annotation.getSchema();
		if(schema.getDocument()==null)schema.updateDocument();
//if(true)return null;		
//log("SUPPRESS createApplicationInformation"); if(true)return null;	
		// following statement eventually causes null pointer
//if(false)		
		if(annotation.getElement()==null)annotation.updateElement();
//log("SUPPRESS createApplicationInformation"); if(true)return null;		

		for(Object test:annotation.getApplicationInformation()){
			if(test==null){
				log("ERROR:createApplicationInformation internal error, invalid applicationInformation ");
			}
			return test;
		}

//if(true)return null;		
//log("SUPPRESS createApplicationInformation"); if(true)return null;		
		// following statement also causes null pointer eventually, even if above update is suppressed
		//org.eclipse.xsd.impl.XSDConcreteComponentImpl x;
		org.w3c.dom.Element result=annotation.createApplicationInformation(sourceURI);
		if(result==null){
			log("ERROR:createApplicationInformation internal error, failed to create applicationInformation ");
			return null;
		}
		
//log("SUPPRESS createApplicationInformation"); if(true)return null;		
		Node firstChild=annotation.getElement().getFirstChild();

		if(firstChild==null){
			annotation.getElement().appendChild(result);
		}else{
			annotation.getElement().insertBefore(result, firstChild);
			
		}
		
//		annotation.getApplicationInformation().add(result);

//		org.w3c.dom.Element result=schema.getDocument().createElement("test");
//		org.w3c.dom.Element result=schema.getDocument().createElementNS("http://www.w3.org/2001/XMLSchema", "xsd:appinfo");
//		xsd:appinfo source="http://modeldriven.org/uml"
		//System.out.println("createApplicationInformation "+result+", "+result.getParentNode()+", "+owningSchema);
		return result;
	}
	@Operation(contextual=true)
	static public Object addInformation(XSDAnnotation annotation,Object element) {
//if(true)return element;	
		if(element==null){
			log("ERROR:addInformation null element ");
			return null;
		}
		org.w3c.dom.Element result=(org.w3c.dom.Element)element;
		//if(result.getParentNode()!=null)return result;
		if(annotation.getElement()==null)annotation.updateElement();
		annotation.getElement().appendChild(result);
		return result;
	}
	@Operation(contextual=true)
	static public Object createChildElementNS(String tagName,Object/*Element*/ elementObject,String namespace) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		if((element==null)||(element.getOwnerDocument()==null)){
			log("ERROR: createChildElementNS with element "+element+", for "+tagName+", "+namespace);
			return null;
		}
		org.w3c.dom.Element child=element.getOwnerDocument().createElementNS(namespace,tagName);
		element.appendChild(child);
		//log("createChildElement "+element+", "+child);
		return child;
	}
	@Operation(contextual=true)
	static public Object createChildElement(String tagName,Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		org.w3c.dom.Element child=element.getOwnerDocument().createElement(tagName);
		element.appendChild(child);
//		System.out.println("createChildElement "+element+", "+child);
		return child;
	}
	@Operation(contextual=true)
	static public void setAttribute(String name,Object/*Element*/ elementObject,String value) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		if(element!=null)element.setAttribute(name, value);
		//System.out.println("setAttribute "+element);
	}
	@Operation(contextual=true)
	static public void setAttributeNS(String name,Object/*Element*/ elementObject,String namespace,String value) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		if(element!=null)element.setAttributeNS(namespace,name, value);
		//log("setAttributeNS "+element+", name="+name+", namespace="+namespace+", value="+value);
	}
	@Operation(contextual=true)
	static public void setTextContent(String textContent,Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		if(element!=null){
			element.setTextContent(textContent);
			/*
			if("ConformantIndicator".equals(element.getLocalName())){
			System.out.println("setTextContent "+textContent+", "+element);
			}
			
			*/
		}
	}
	@Operation(contextual=true)
	static public List<Object> getAttributes(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		List<Object> result=new Vector<Object>();
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
			if(node instanceof org.w3c.dom.Element ){
				NamedNodeMap map=((org.w3c.dom.Element)node).getAttributes();
				for(int j=0;j<map.getLength();j++){
					Node nodej=map.item(j);
					if(nodej instanceof org.w3c.dom.Attr ){
						result.add(nodej);
					}
				}
//				break;
			}
//		}
		return result;
	}
	@Operation(contextual=true)
	static public String getAttributeValue(Object/*Attr*/ attrObject) {
		org.w3c.dom.Attr attr=(org.w3c.dom.Attr)attrObject;
		return attr.getValue();
	}
	@Operation(contextual=true)
	static public String getAttributeName(Object/*Attr*/ attrObject) {
		org.w3c.dom.Attr attr=(org.w3c.dom.Attr)attrObject;
		return attr.getLocalName();
	}
	@Operation(contextual=true)
	static public String getAttributeNamespace(Object/*Attr*/ attrObject) {
		org.w3c.dom.Attr attr=(org.w3c.dom.Attr)attrObject;
		return attr.getNamespaceURI();
	}
	@Operation(contextual=true)
	static public List<String> getAttributeApplicationInformationBody(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		List<String> result=new Vector<String>();
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
			if(node instanceof org.w3c.dom.Element ){
				NamedNodeMap map=((org.w3c.dom.Element)node).getAttributes();
				for(int j=0;j<map.getLength();j++){
					Node nodej=map.item(j);
					if(nodej instanceof org.w3c.dom.Attr ){
						String value=((org.w3c.dom.Attr)nodej).getValue();
						result.add(value);
					}
				}
//				break;
			}
//		}
		return result;
	}
	@Operation(contextual=true)
	static public List<String> getAttributeApplicationInformationName(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		List<String> result=new Vector<String>();
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
			if(node instanceof org.w3c.dom.Element ){
				NamedNodeMap map=((org.w3c.dom.Element)node).getAttributes();
				for(int j=0;j<map.getLength();j++){
					Node nodej=map.item(j);
					if(nodej instanceof org.w3c.dom.Attr ){
						String value=((org.w3c.dom.Attr)nodej).getLocalName();
						result.add(value);
					}
				}
//				break;
			}
//		}
		return result;
	}
	@Operation(contextual=true)
	static public List<String> getAttributeApplicationInformationNamespace(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
		List<String> result=new Vector<String>();
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
			if(node instanceof org.w3c.dom.Element ){
				NamedNodeMap map=((org.w3c.dom.Element)node).getAttributes();
				for(int j=0;j<map.getLength();j++){
					Node nodej=map.item(j);
					if(nodej instanceof org.w3c.dom.Attr ){
						String value=((org.w3c.dom.Attr)nodej).getNamespaceURI();
						result.add(value);
					}
				}
//				break;
			}
//		}
		return result;
	}
	@Operation(contextual=true)
	static public String getApplicationInformationBody(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
			if(node instanceof org.w3c.dom.Element ){
				String result=((org.w3c.dom.Element)node).getTextContent();//getNodeValue();
				if(result!=null)return result;
			}
//		}
		return "";
	}
//	static public String getApplicationInformationName(Object/*Element*/ elementObject) {
	@Operation(contextual=true)
	static public String getApplicationInformationName(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
			if(node instanceof org.w3c.dom.Element ){
				return ((org.w3c.dom.Element)node).getLocalName();
			}
//		}
		return "";
	}
	@Operation(contextual=true)
	static public String getApplicationInformationNamespace(Object/*Element*/ elementObject) {
		org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
//		NodeList nodes=element.getElementsByTagName("*");
//		for(int i=0;i<nodes.getLength();i++){
//			Node node=nodes.item(i);
		Node node=element;
		if(node instanceof org.w3c.dom.Element ){
			return ((org.w3c.dom.Element)node).getNamespaceURI();
		}
//		}
		return "";
	}
	@Operation(contextual=true)
	static public String userInformationContent(EObject/*XSDAnnotation*/ annotationObject) {
		XSDAnnotation annotation=(XSDAnnotation)annotationObject;
		String result="";
		for(org.w3c.dom.Element element:annotation.getUserInformation()){
			result+=element.getTextContent();
		}
		return result;
	}
	@Operation(contextual=true)
	static public void validate(org.eclipse.uml2.uml.Element model) {
		try{
		Diagnostician diagnostician=Diagnostician.INSTANCE ;
		org.eclipse.emf.common.util.Diagnostic diagnostic=diagnostician.validate(model);
		if(diagnostic.getSeverity()!=diagnostic.OK){
			System.out.println("validate "+diagnostic.getMessage()+", element="+model);
		}
		}catch(Throwable t){
			t.printStackTrace();
		}

	        return;
	}
	/*
	@Operation(contextual=true)
	static public void splitJava(EObject model ,String targetDirectoryPath) {
		try {
			//System.out.println("splitJava "+targetDirectoryPath);
			//org.eclipse.gmt.modisco.java.generation.utils.JavaUtils x;
			Generate_JavaStructures javaGenerator = new Generate_JavaStructures(model,
				       new File(targetDirectoryPath), new ArrayList<Object>());
			javaGenerator.doGenerate(null);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("ERROR splitJava at "+targetDirectoryPath+" : "+e);
		}
	}
	*/
	/*
	@Operation(contextual=true)
	static public String getDirectoryPath(EObject referenceTarget) {
		try {
		Resource resource=referenceTarget.eResource();
		System.out.println("getDirectoryPath resource "+resource);
		URI resourceUri=resource.getURI();
		System.out.println("getDirectoryPath resourceUri "+resourceUri);
		URI uri=resourceUri.trimSegments(1);
		/ *
		String platformPath=uri.toPlatformString(true);
		IPath path=new Path(platformPath);
		IWorkspaceRoot workspaceRoot=ResourcesPlugin.getWorkspace().getRoot();
		IResource iResource=workspaceRoot.findMember(path);
		java.net.URI locationURI=iResource.getLocationURI();
		* /
		String locationURI=uri.toFileString();
		System.out.println("getDirectoryPath "+locationURI);
		File file=new File(locationURI);
		//System.out.println("getDirectoryPath "+file);
			return file.getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	*/
	/*
	@Operation(contextual=true)
	static public void splitXml(Root root ,String targetDirectoryPath) {
		Resource resource=root.eResource();
		//ResourceSet resourceSet=resource.getResourceSet();
		//String schemaLocation=schema.getSchemaLocation();
		//Resource referenceResource=referenceTarget.eResource();
		//URI referenceURI=referenceResource.getURI().trimSegments(1);
		//Map options=new HashMap();
		for(EObject targetObject:new Vector<EObject>(resource.getContents())){
			if(Root.class.isInstance(targetObject)){
				final Root targetRoot=(Root)targetObject;
			//URI targetURI=URI.createURI(referenceURI+"/"+targetSchema.getSchemaLocation());
			//	URI targetURI=URI.createURI(referenceURI+"/"+"test.html");
				String platformPath=targetDirectoryPath+"/test.html";
				File targetFile=new File(platformPath);
				IPath path=new Path(platformPath);
				IWorkspaceRoot workspaceRoot=ResourcesPlugin.getWorkspace().getRoot();
				java.net.URI location=targetFile.toURI();
				IFile testFile=null;
				for(IFile test:workspaceRoot.findFilesForLocationURI(location)){
					testFile=test;
					break;
				}
				final IFile iFile=testFile;
				
			System.out.println("splitXml "+targetFile);
			try {
				Display.getDefault().syncExec(new Runnable(){

					@Override
					public void run() {
						try {
							System.out.println("formatting "+iFile);
							ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
							GenericXMLWriter writer=new GenericXMLWriter(outputStream);
							writer.serialize(targetRoot);
							writer.flush();
							writer.close();
							String formattedOut=new FormatProcessorXML().formatContent(new String(outputStream.toByteArray()));//formatFile(iFile);
							ByteArrayInputStream bais=new ByteArrayInputStream(formattedOut.getBytes());
							if(iFile.exists()){
								iFile.setContents(bais, true, true, null);
							}else{
								iFile.create(bais, true, null);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//formatFile(targetFile); 
					}
					
				});
				
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else{
				System.out.println("splitXml ERROR-non Root "+targetObject);
				
			}
		}
	}
	*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Operation(contextual=true)
	static public String getExtentBaseName(EObject target) {
		return target.eResource().getURI().trimFileExtension().lastSegment();
	}
	@Operation(contextual=true)
	static public void importSchema(Object/*XSDImport*/ importIn) {
		if(XSDImportImpl.class.isInstance(importIn)){
			try{
			((XSDImportImpl)importIn).importSchema();
			//log("imported Schema  "+((XSDImportImpl)importIn).getResolvedSchema());
			}catch(Throwable t){
				//t.printStackTrace();
				log("ERROR: failed to importSchema: "+t);
			}
		}
	}
	static boolean isFirst=true;	
	@Operation(contextual=true)
	static public void setSingleTagValue(org.eclipse.uml2.uml.Element element,Stereotype stereotype,String propertyName,Object newValue) {
		try{
//		element.setValue(stereotype, propertyName, toTagValue(newValue));
//		element.setValue(stereotype, propertyName, newValue);
			Object tagValue=toTagValue(newValue,stereotype);
		setValue(element,stereotype, propertyName, tagValue);
		/*
		if(propertyName.equals("targetNamespace")){
			System.out.println("Blackbox.setSingleTagValue  targetNamespace "+newValue+":"+tagValue);
			
		}
		*/
		}catch(Throwable e){
			System.out.println("Blackbox.setSingleTagValue  ERROR: for tag "+stereotype.getName()+":"+propertyName+" on element "+element+", value="+newValue+", exception "+e);
			if(isFirst){
			isFirst=false;
			e.printStackTrace();
			}
		}
	}
	
	@Operation(contextual=true)
	static public Object toTagValue(Object newValue,Stereotype stereotype) {
		EClass stereotypeClass=stereotype.getDefinition();
		if(stereotypeClass!=null){
			EPackage stereotypePackage=stereotypeClass.getEPackage();
			return fixupValue(newValue,stereotypePackage);
		}
		return newValue;
	}
	static protected Object fixupValue(Object newValue,EPackage stereotypePackage) {
		if(EEnumLiteral.class.isInstance(newValue)){
			EEnumLiteral enumValue=(EEnumLiteral)newValue;
			return enumValue.getLiteral();
		}else if (DynamicEObjectImpl.class.isInstance(newValue)){
			// change the implementation class to be same as stereotype (we may have created dynamic class from separate instance as specified profile
			newValue=fixupDynamicEObject((DynamicEObjectImpl)newValue,stereotypePackage);
		}
		return newValue;
	}
	static protected DynamicEObjectImpl fixupDynamicEObject(DynamicEObjectImpl dynValue,EPackage stereotypePackage){
		DynamicEObjectImpl result=dynValue;
		EClass dynClass=dynValue.eClass();
		if(!stereotypePackage.equals(dynClass.getEPackage())){
			EClassifier stereoSibling=stereotypePackage.getEClassifier(dynClass.getName());
			if(EClass.class.isInstance(stereoSibling)){
				EClass stereoSiblingClass=(EClass)stereoSibling;
				EObject newValue=stereotypePackage.getEFactoryInstance().create(stereoSiblingClass);
				// copy content from original, fixing up any embedded dynamicEObjects
				if(DynamicEObjectImpl.class.isInstance(newValue)){
					result=(DynamicEObjectImpl)newValue;
					for(EStructuralFeature feature:dynClass.getEAllStructuralFeatures()){
						EStructuralFeature siblingfeature=null;
						for(EStructuralFeature featureTest:stereoSiblingClass.getEAllStructuralFeatures()){
							if(featureTest.getName().equals(feature.getName())){
								siblingfeature=featureTest;
								break;
							}
						}
						Object currentValue=dynValue.eGet(feature);
						if(Collection.class.isInstance(currentValue)){
							Collection newCollection=(Collection)newValue.eGet(siblingfeature);
							for(Object currentItem:(Collection)currentValue){
								newCollection.add(fixupValue(currentItem,stereotypePackage));
							}
						}else{
							newValue.eSet(siblingfeature, fixupSetValue(currentValue,stereotypePackage));
						}
					}
				}
				//dynValue.eSetClass((EClass)stereoSibling);
			}
		}
		return result;
	}
	static protected Object fixupSetValue(Object newValue,EPackage stereotypePackage) {
		if(EEnumLiteral.class.isInstance(newValue)){
			EEnumLiteral enumValue=(EEnumLiteral)newValue;
			String literal= enumValue.getLiteral();
			EClassifier stereoSibling=stereotypePackage.getEClassifier(enumValue.getEEnum().getName());
			if(EEnum.class.isInstance(stereoSibling)){
				newValue=((EEnum)stereoSibling).getEEnumLiteral(literal);
			}
		}else if (DynamicEObjectImpl.class.isInstance(newValue)){
			// change the implementation class to be same as stereotype (we may have created dynamic class from separate instance as specified profile
			newValue=fixupDynamicEObject((DynamicEObjectImpl)newValue,stereotypePackage);
		}
		org.eclipse.uml2.uml.internal.operations.PackageOperations x;
		return newValue;
	}
	@Operation(contextual=true)
	static public void setValue(org.eclipse.uml2.uml.Element element,Stereotype stereotype,String propertyName,List<Object> newValue) {
		try{
		if(newValue==null){
//			System.out.println("Blackbox.setValue ERROR: null value for tag "+stereotype.getName()+":"+propertyName+" on element "+element);
			return;
		}
		Object test=element.getValue(stereotype, propertyName);
		if(!Collection.class.isInstance(test)){
			System.out.println("Blackbox.setValue ERROR: stereotype implementation is not collection  for tag "+stereotype.getName()+":"+propertyName+" on element "+element+", received collection "+newValue);
			return;
		}
		Collection<Object> values=(Collection<Object>)test;
		for(Object value:newValue){
			if(value==null){
//				System.out.println("Blackbox.setValue ERROR: null value in list for tag "+stereotype.getName()+":"+propertyName+" on element "+element+", values="+newValue);
				continue;
			}
			try{
			values.add(value);
//			System.out.println("Blackbox.setValue  multi for tag "+stereotype.getName()+":"+propertyName+" on element "+element+", value="+value);
			}catch(Exception e){
				System.out.println("Blackbox.setValue  ERROR: for tag "+stereotype.getName()+":"+propertyName+" on element "+element+", value="+newValue+", exception "+e);
			}
		}
		}catch(Throwable t){
			t.printStackTrace();
		}
	}
	@Operation(contextual=true)
	static public EObject getSchemaAtRelativeURI(EObject element,String uri) {
		Resource myResource=element.eResource();
		URI myURI=myResource.getURI();
//		URI schemaURI=myURI.createURI(myURI.trimSegments(1).toString()+'/'+uri);
		URI schemaURI=URI.createURI(uri).resolve(myURI);
		//log("getSchemaAtRelativeURI resolved URI "+schemaURI);
		try{
		ResourceSet resourceSet=myResource.getResourceSet();
		Resource resource=resourceSet.getResource(schemaURI, true);
		//System.out.println("getSchemaAtRelativeURI add resource "+resource);
		for(EObject test:resource.getContents()){
			if(XSDSchema.class.isInstance(test)){
				//System.out.println("getModel found schema "+test);
				return (XSDSchema)test;
			}else{
				log("getModel schema NOT found  "+resource);
			}
		}
		}catch(Throwable t){
			//t.printStackTrace();
			log("getSchemaAtRelativeURI ERROR from "+myURI+" to "+uri+"="+schemaURI+" : "+t);
		}
		return null;
	}
	@Operation(contextual=true)
	static public List<XSDSchema> getAllSchemas(EObject element) {
		List<XSDSchema> result=new Vector<XSDSchema>();
		Resource myResource=element.eResource();
			ResourceSet resourceSet=myResource.getResourceSet();
			for(Resource resource:resourceSet.getResources()){
				for(EObject test:resource.getContents()){
					if(XSDSchema.class.isInstance(test)){
						result.add((XSDSchema)test);
						XSDSchema schemaForSchema=((XSDSchema)test).getSchemaForSchema();
						if((schemaForSchema!=null)&&!result.contains(schemaForSchema))result.add(schemaForSchema);
					}
				}
			}
			System.out.println("getAllSchemas "+result);
		return result;
	}
	@Operation(contextual=true)
	static public void setLower(MultiplicityElement me,int lower) {
		LiteralInteger valueSpecication=UMLFactory.eINSTANCE.createLiteralInteger();
		valueSpecication.setValue(lower);
		me.setLowerValue(valueSpecication);
	}
	@Operation(contextual=true)
	static public void setUpper(MultiplicityElement me,int upper) {
		LiteralUnlimitedNatural valueSpecication=UMLFactory.eINSTANCE.createLiteralUnlimitedNatural();
		valueSpecication.setValue(upper);
		me.setUpperValue(valueSpecication);
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * <!-- begin-model-doc -->
	   * Sets the value of the property with the specified name in the specified stereotype for this element.
	   * @param element The receiving '<em><b>Element</b></em>' model object.
	   * @param stereotype The stereotype for which to set the value.
	   * @param propertyName The name of the property whose value to set.
	   * @param newValue The new value for the property.
	   * <!-- end-model-doc -->
	   * @generated NOT
	   */
	  public static void setValue(org.eclipse.uml2.uml.Element element, Stereotype stereotype,
	      String propertyName, Object newValue) {

	    if (stereotype == null) {
	      throw new IllegalArgumentException(String.valueOf(stereotype));
	    }

	    if (UMLUtil.isEmpty(propertyName)) {
	      throw new IllegalArgumentException(String.valueOf(propertyName));
	    }

	    EObject eObject = element.getStereotypeApplication(stereotype);

	    if (eObject == null) {
	      throw new IllegalArgumentException("Stereotype not applied "+String.valueOf(stereotype));
	    }

	    EClass eClass = eObject.eClass();
	    String[] segments = propertyName.split(NamedElement.SEPARATOR);

	    for (int i = 0, length = segments.length; i < length; i++) {
	      String segment = segments[i];
	      EStructuralFeature eStructuralFeature = null;
	      int index = -1;

	      if (segment.indexOf('[') == -1) {
	        eStructuralFeature = eClass
	          .getEStructuralFeature(UMLUtil.getValidJavaIdentifier(segment));
	      } else {
	        eStructuralFeature = eClass
	          .getEStructuralFeature(UMLUtil.getValidJavaIdentifier(segment
	            .substring(0, segment.indexOf('['))));

	        try {
	          index = Integer.parseInt(segment.substring(segment
	            .indexOf('[') + 1, segment.indexOf(']')));
	        } catch (Exception e) {
	          throw new IllegalArgumentException(e.toString()+" "+String
	            .valueOf(propertyName));
	        }
	      }

	      if (eStructuralFeature == null) {
	        throw new IllegalArgumentException("StructuralFeature not found "+segment+" "+String.valueOf(propertyName));
	      }

	      EClassifier eType = eStructuralFeature.getEType();

	      if (i + 1 < length) {

	        if (!(eType instanceof EClass)) {
	          throw new IllegalArgumentException("type not EClass "+eType+" "+String
	            .valueOf(propertyName));
	        }

	        eClass = (EClass) eType;

	        if (eStructuralFeature.isMany()) {
	          @SuppressWarnings("unchecked")
	          List<Object> list = (List<Object>) eObject
	            .eGet(eStructuralFeature);
	          int size = list.size();

	          if (size <= index) {

	            if (!((EReference) eStructuralFeature).isContainment()) {
	              throw new IllegalArgumentException("structuralFeature not containment "+eStructuralFeature+" "+String
	                .valueOf(propertyName));
	            }

	            for (int j = size; j <= index; j++) {
	              list.add(j, EcoreUtil.create(eClass));
	            }
	          }

	          eObject = (EObject) list.get(index);
	        } else {
	          Object value = eObject.eGet(eStructuralFeature);

	          if (value == null) {

	            if (!((EReference) eStructuralFeature).isContainment()) {
	              throw new IllegalArgumentException("structuralFeature not containmentx "+eStructuralFeature+" "+String
	                .valueOf(propertyName));
	            }

	            eObject.eSet(eStructuralFeature, value = EcoreUtil
	              .create(eClass));
	          }

	          eObject = (EObject) value;
	        }
	      } else {

	        if (newValue != null) {

	          if (eType instanceof EClass) {
	            EClass eClassType = (EClass) eType;

	            if (newValue instanceof List<?>) {
	              @SuppressWarnings("unchecked")
	              Iterator<Object> j = ((List<Object>) newValue)
	                .iterator();

	              while (j.hasNext()) {

	                if (!eClassType.isInstance(j.next())) {
	                  throw new IllegalArgumentException("contained item[] not "+eClassType+" "+String
	                    .valueOf(newValue));
	                }
	              }
	            } else if (!eClassType.isInstance(newValue)) {
	            	/*
	            } else if (!(eClassType.isInstance(newValue)
	            		||(eClassType.equals(((EObject)newValue).eClass())) 
	            		||(((EObject)newValue).eClass().getEAllSuperTypes().contains(eClassType)) 
	            		)) {
	            		*/
	              throw new IllegalArgumentException("contained item not "+eClassType+", "+((EObject)newValue).eClass()+" "+String
	                .valueOf(newValue));
	            }
	          } else if (eType instanceof EDataType) {
	            EDataType eDataType = (EDataType) eType;
	            EFactory eFactoryInstance = eDataType.getEPackage()
	              .getEFactoryInstance();

	            if (newValue instanceof List<?>) {
	              @SuppressWarnings("unchecked")
	              List<Object> newList = new ArrayList<Object>(
	                (List<Object>) newValue);

	              if (eDataType instanceof EEnum) {
	                EEnum eEnum = (EEnum) eDataType;

	                for (ListIterator<Object> li = newList
	                  .listIterator(); li.hasNext();) {

	                  Object item = li.next();

	                  if (item instanceof EnumerationLiteral) {
	                    li.set(eEnum.getEEnumLiteral(
	                      ((EnumerationLiteral) item)
	                        .getName()).getInstance());
	                  }
	                }
	              }

	              for (ListIterator<Object> li = newList
	                .listIterator(); li.hasNext();) {

	                Object item = li.next();

	                if (item instanceof String) {

	                  try {
	                    li.set(eFactoryInstance
	                      .createFromString(eDataType,
	                        (String) item));
	                  } catch (Exception e) {
	                    // ignore
	                  }
	                }
	              }

	              newValue = newList;
	            } else {

	              if (eDataType instanceof EEnum) {
	                EEnum eEnum = (EEnum) eDataType;

	                if (newValue instanceof EnumerationLiteral) {
	                  newValue = eEnum.getEEnumLiteral(
	                    ((EnumerationLiteral) newValue)
	                      .getName()).getInstance();
	                }
	              }

	              if (newValue instanceof String) {

	                try {
	                	Object oldValue=newValue;
	                  newValue = eFactoryInstance
	                    .createFromString(eDataType,
	                      (String) newValue);
/*
	      	  		if("targetNamespace".equals(propertyName)){
	    				System.out.println("setValue TEST set "+propertyName+"="+newValue+", incoming value="+oldValue+", type="+eDataType+" : factory="+eFactoryInstance);
	    			}
*/
	                } catch (Exception e) {
	                  // ignore
	    				System.out.println("setValue ERROR "+propertyName+"="+newValue+", type="+eDataType+" : factory="+eFactoryInstance+"; error="+e);
	                }
	              }
	            }
	          }
	        }

	        if (newValue == null) {
	          newValue = eStructuralFeature.getDefaultValue();
	        }

	        if (eStructuralFeature.isMany()) {

	          if (index == -1) {

	            if (newValue instanceof List<?>) {
	              eObject.eSet(eStructuralFeature, newValue);
	            } else {
	              throw new IllegalArgumentException("expected list "+newValue+" "+String
	                .valueOf(newValue));
	            }
	          } else {
	            @SuppressWarnings("unchecked")
	            List<Object> list = (List<Object>) eObject
	              .eGet(eStructuralFeature);

	            for (int j = list.size(); j < index; j++) {
	              list.add(j, eStructuralFeature.getDefaultValue());
	            }

	            if (index == list.size()) {
	              list.add(index, newValue);
	            } else {
	              list.set(index, newValue);
	            }
	          }

	        } else {
	          eObject.eSet(eStructuralFeature, newValue);
	        }
	      }
	    }
	  }

	
}
