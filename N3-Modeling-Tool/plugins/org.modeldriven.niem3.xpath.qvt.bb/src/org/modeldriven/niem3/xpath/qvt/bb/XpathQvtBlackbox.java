package org.modeldriven.niem3.xpath.qvt.bb;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
/*
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.xsd.XSDAnnotation;
import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDAttributeGroupContent;
import org.eclipse.xsd.XSDAttributeGroupDefinition;
import org.eclipse.xsd.XSDAttributeUse;
import org.eclipse.xsd.XSDComplexTypeContent;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDImport;
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
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
*/
import org.w3.xpath20.XPath;


public class XpathQvtBlackbox {
	
	public XpathQvtBlackbox() {
		super();
	}
	@Operation(contextual=true)
	static public Object getFeatureEntry(EObject context,String mapFeatureName,String featureName){
		FeatureMap featureMap=getFeatureMap(context,mapFeatureName);
		Iterator<Entry> iterator=featureMap.iterator();
		while(iterator.hasNext()){
			Entry entry=iterator.next();
			EStructuralFeature feature=entry.getEStructuralFeature();
			if(feature.getName().equals(featureName)){
				return entry.getValue();
			}
		}
		return null;
	}
	static protected FeatureMap getFeatureMap(EObject context,String mapFeatureName){
		return (FeatureMap)context.eGet(context.eClass().getEStructuralFeature(mapFeatureName));
	}
	@Operation(contextual=true)
	static public XPath getXPath(String text) throws IOException{
		ResourceSet resourceSet=new ResourceSetImpl();
		String contentType="xpath";
		String pathName="/org.modeldriven.qvt.schematron.import/dummy.xpath";
		URI uri=URI.createPlatformResourceURI(pathName,true);
		Resource resource=resourceSet.createResource(uri, contentType);
		Map options=new HashMap();
		InputStream inputStream=new ByteArrayInputStream(text.getBytes());
		resource.load(inputStream, options);
		for(EObject content:resource.getContents()){
			if(content instanceof XPath){
				return (XPath)content;
			}
		}
		return null;
	}
	/*
	@Operation(contextual=true)
	static public Boolean isEnumerator(Object element){
		return element instanceof Enumerator;
	}
	@Operation(contextual=true)
	static public String blackBoxCurrentDate(Element element){
		return new Date().toString();
	}
	  
		@Operation(contextual=true)
		static public String getXmiID(EObject context){
			return ((XMIResource)context.eResource()).getID(context);
		}

	// like add, but feature not from same doc
	@Operation(contextual=true)
	static public void addFeatureEntry(EObject context,String mapFeatureName,EStructuralFeature feature,Object value){
		getFeatureMap(context,mapFeatureName).add(feature,value);
	}
	static protected FeatureMap getFeatureMap(EObject context,String mapFeatureName){
		return (FeatureMap)context.eGet(context.eClass().getEStructuralFeature(mapFeatureName));
	}
	@Operation(contextual=true)
	public static byte[] toByteArray(String text) {
		return text.getBytes();
	}
	@Operation(contextual=true)
	public static String getValue(EAnnotation p,String name) {
		String result= p.getDetails().get(name);
		System.out.println("getValue "+name+"="+result);
		return result;
	}
	@Operation(contextual=true)
	public static void toCanonicalIds(Package p) {
		new CanonicalId().toCanonicalIDs(p);
	}
	@Operation(contextual=true)
	static public List<Object> getMany(Object eobject) {
		List<Object> result=new Vector<Object>();
		for(Object eObject:(Collection)eobject){
			result.add(eObject);
		}
		return result;
	}
	
	@Operation(contextual=true)
	static public List<Object> eGetMany(EObject eobject,EStructuralFeature reference) {
		List<Object> result=new Vector<Object>();
		for(Object eObject:(Collection<Object>)eobject.eGet(reference)){
			result.add(eObject);
		}
		return result;
	}
	@Operation(contextual=true)
	static public List<EObject> eGetManyEObject(EObject eobject,EStructuralFeature reference) {
		List<EObject> result=new Vector<EObject>();
		for(Object eObject:(Collection<Object>)eobject.eGet(reference)){
			if(eObject instanceof EObject){
				result.add((EObject)eObject);
			}
		}
		return result;
	}
	@Operation(contextual=true)
	static public void eSetManyObject(EObject eobject,EStructuralFeature reference,Object newObject) {
		((Collection<Object>)eobject.eGet(reference)).add(newObject);
	}
	
	@Operation(contextual=true)
	public static void commitInformation(Object dummy) {
	}
	@Operation(contextual=true)
	public static void mapXSDAnnotation(XSDAnnotation annotation,Element owner) {
		UMLFactory factory=UMLFactory.eINSTANCE;
		// just make the comment, no stereotype
		Comment comment=factory.createComment();
		owner.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(owner);
		for(org.w3c.dom.Element userInformation:annotation.getUserInformation()){
			String useInformationText=userInformation.getTextContent();
			comment.setBody(useInformationText);
		}
		
	}
	@Operation(contextual=true)
	public static String getTextContent(Object element) {
		return ((org.w3c.dom.Element)element).getTextContent();
	}
	@Operation(contextual=true)
	static public EObject getSchemaAtRelativeURI(EObject element,String uri) {
		Resource myResource=element.eResource();
		URI myURI=myResource.getURI();
		URI schemaURI=URI.createURI(uri).resolve(myURI);
		//System.out.println("getSchemaAtRelativeURI resolved URI "+schemaURI);
		try{
		ResourceSet resourceSet=myResource.getResourceSet();
		Resource resource=resourceSet.getResource(schemaURI, true);
		for(EObject test:resource.getContents()){
			if(XSDSchema.class.isInstance(test)){
				return (XSDSchema)test;
			}else{
				System.out.println("getModel schema NOT found  "+resource);
			}
		}
		}catch(Throwable t){
			System.out.println("getSchemaAtRelativeURI ERROR from "+myURI+" to "+uri+"="+schemaURI+" : "+t);
		}
		return null;
	}
	@Operation(contextual=true)
	static public String getExtentURI(EObject target) {
		return target.eResource().getURI().toString();
	}
	@Operation(contextual=true)
	static public String getExtentBaseName(EObject target) {
		return target.eResource().getURI().trimFileExtension().lastSegment();
	}
	@Operation(contextual=true)
	static public void importSchema(XSDImport importIn) {
		if(XSDImportImpl.class.isInstance(importIn)){
			try{
			((XSDImportImpl)importIn).importSchema();
			//log("imported Schema  "+((XSDImportImpl)importIn).getResolvedSchema());
			}catch(Throwable t){
				//t.printStackTrace();
				System.out.println("ERROR: failed to importSchema: "+t);
			}
		}
	}
	@Operation(contextual=true)
	static public void setSchemaForSchema(XSDSchema schema,String prefix,String namespace) {
		schema.setSchemaForSchemaQNamePrefix(prefix);
		schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
		schema.setIncrementalUpdate(false);
	}
	@Operation(contextual=true)
	static public void add(EObject eObject,String mapFeature,String targetFeature,Object object) {
		EClass eClass=eObject.eClass();
		EPackage ePackage=eClass.getEPackage();
		EClass documentRoot=(EClass)ePackage.getEClassifier("DocumentRoot");
		for(EStructuralFeature testMapFeature:eClass.getEAllStructuralFeatures()){
			if(mapFeature.equals(testMapFeature.getName())){
				Object featureMapTest=eObject.eGet(testMapFeature);
				FeatureMap featureMap=(FeatureMap)featureMapTest;
				for(EStructuralFeature testTargetFeature:documentRoot.getEAllStructuralFeatures()){
					if(targetFeature.equals(testTargetFeature.getName())){
						featureMap.add(testTargetFeature, object);
						return;
					}
				}
			}
		}
	}
		@Operation(contextual=true)
		static public void setQNamePrefixToNamespace(XSDSchema schema,String prefix,String namespace) {
			schema.getQNamePrefixToNamespaceMap().put(prefix, namespace);
			schema.setIncrementalUpdate(false);
		 
	 }
		@Operation(contextual=true)
		static public List<Object> getApplicationInformation(XSDAnnotation annotation) {
			List<Object> result=new Vector<Object>();
			for(org.w3c.dom.Element element:annotation.getApplicationInformation()){
				result.add(element);
			}
			return result;
		}	
		@Operation(contextual=true)
		static public List<Object> getUserInformation(XSDAnnotation annotation) {
			List<Object> result=new Vector<Object>();
			for(org.w3c.dom.Element element:annotation.getUserInformation()){
				NodeList nodes=element.getElementsByTagName("*");
				for(int i=0;i<nodes.getLength();i++){
					Node node=nodes.item(i);
					if(node instanceof org.w3c.dom.Element ){
						result.add(node);
					}
				}
			}
			return result;
		}	
		@Operation(contextual=true)
		static public boolean isEditable(Element element) {
			return UC2Helper.isEditable(element);
		}
		@Operation(contextual=true)
		public static Object createUserInformation(XSDAnnotation annotation,String sourceURI) {
			EList<org.w3c.dom.Element> elements=annotation.getUserInformation();
			if(elements!=null)
			for(org.w3c.dom.Element userInformation:elements){
				return userInformation;
			}
			XSDSchema owningSchema=annotation.getSchema();
			return createUserInformation(annotation,sourceURI,owningSchema);
		}
		@Operation(contextual=true)
		static public Object createUserInformation(XSDAnnotation annotation,String sourceURI,XSDSchema owningSchema) {
			// this will not work unless containment structure in place
			if(annotation==null){
				System.out.println("ERROR: createUserInformation internal error, illegal argument: annotation null , sourceURI "+sourceURI+", fallback Schema "+owningSchema);
				return null;
			}
			if(owningSchema==null){
				System.out.println("ERROR: createUserInformation internal error, illegal argument: owningSchema null from annotation "+annotation+", sourceURI "+sourceURI);
				return null;
			}
			if(annotation.getSchema()==null){
				owningSchema.getContents().add(annotation);// temporary, will be moved later by transform
			}
			XSDSchema schema=annotation.getSchema();
			if(schema==null){
				System.out.println("ERROR: createUserInformation internal error, failed to get Schema from annotation "+annotation+", sourceURI "+sourceURI+", fallback Schema "+owningSchema);
				return null;
			}
			if(schema.getDocument()==null)schema.updateDocument();
			org.w3c.dom.Element result=annotation.createUserInformation(sourceURI);
			if(result==null){
				System.out.println("ERROR: createUserInformation internal error, failed to create userInformation from annotation "+annotation+", sourceURI "+sourceURI+", fallback Schema "+owningSchema);
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
		static protected org.w3c.dom.Element createApplicationInformation(XSDAnnotation annotation,String sourceURI) {
			// this will not work unless containment structure in place
			if(annotation.getSchema()==null){
				System.out.println("ERROR:createApplicationInformation no schema ");
				//TODO owningSchema.getContents().add(annotation);// temporary, will be moved later by transform
				return null;
			}
			XSDSchema schema=annotation.getSchema();
			if(schema.getDocument()==null)schema.updateDocument();
			if(annotation.getElement()==null)annotation.updateElement();

			for(org.w3c.dom.Element test:annotation.getApplicationInformation()){
				if(test==null){
					System.out.println("ERROR:createApplicationInformation internal error, invalid applicationInformation ");
				}
				return test;
			}
			// following statement also causes null pointer eventually, even if above update is suppressed
			org.w3c.dom.Element result=annotation.createApplicationInformation(sourceURI);
			if(result==null){
				System.out.println("ERROR:createApplicationInformation internal error, failed to create applicationInformation ");
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
		

		@Operation(contextual=true)
		static public void setTextContent(Object elementObject,String textContent) {
			org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
			if(element!=null){
				element.setTextContent(textContent);
			}
		}
		@Operation(contextual=true)
		static public String getAttributeName(Object attrObject) {
			org.w3c.dom.Attr attr=(org.w3c.dom.Attr)attrObject;
			return attr.getLocalName();
		}
		@Operation(contextual=true)
		static public String getAttributeNamespace(Object attrObject) {
			org.w3c.dom.Attr attr=(org.w3c.dom.Attr)attrObject;
			return attr.getNamespaceURI();
		}
		@Operation(contextual=true)
		static public String getAttributeValue(Object attrObject) {
			org.w3c.dom.Attr attr=(org.w3c.dom.Attr)attrObject;
			return attr.getValue();
		}
		@Operation(contextual=true)
		static public void setAttributeNS(String name,Object elementObject,String namespace,String value) {
			org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
			if(element!=null)element.setAttributeNS(namespace,name, value);
		}
		@Operation(contextual=true)
		static public void setAttributeNS(Object elementObject,String name,String namespace,String value) {
			org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
			if(element!=null)element.setAttributeNS(namespace,name, value);
		}
		@Operation(contextual=true)
		static public List<Object> getAttributes(Object elementObject) {
			org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
			List<Object> result=new Vector<Object>();
			Node node=element;
				if(node instanceof org.w3c.dom.Element ){
					NamedNodeMap map=((org.w3c.dom.Element)node).getAttributes();
					for(int j=0;j<map.getLength();j++){
						Node nodej=map.item(j);
						if(nodej instanceof org.w3c.dom.Attr ){
							result.add(nodej);
						}
					}
				}
			return result;
		}
		
		@Operation(contextual=true)
		static public String getElementNamespace(Object attrObject) {
			org.w3c.dom.Element attr=(org.w3c.dom.Element)attrObject;
			return attr.getNamespaceURI();
		}
		@Operation(contextual=true)
		static public String getElementName(Object attrObject) {
			org.w3c.dom.Element attr=(org.w3c.dom.Element)attrObject;
			return attr.getLocalName();
		}
		@Operation(contextual=true)
		static public List<Object> getElementElements(Object elementObject) {
			org.w3c.dom.Element element=(org.w3c.dom.Element)elementObject;
			List<Object> result=new Vector<Object>();
			//result.add(element);
			
			Node node=element;
				if(node instanceof org.w3c.dom.Element ){
					NodeList map=((org.w3c.dom.Element)node).getChildNodes();
					for(int j=0;j<map.getLength();j++){
						Node nodej=map.item(j);
						if(nodej instanceof org.w3c.dom.Element ){
							result.add(nodej);
						}
					}
				}
 			return result;
		}
		@Operation(contextual=true)
		static public void eAdd(EObject element,String name,Object value) {
			EClass eClass=element.eClass();
			for(EStructuralFeature sf:eClass.getEAllStructuralFeatures()){
				if(name.equals(sf.getName())){
					((Collection)element.eGet(sf)).add(value);
					break;
				}
			}
		}
///////////////////////////////////////////split schemas
		private static void fixupComplexTypeDefinition(
				XSDComplexTypeDefinition complexTypeDefinition) {
			XSDComplexTypeContent content=complexTypeDefinition.getContent();
			XSDTypeDefinition base=complexTypeDefinition.getBaseTypeDefinition();
			if(content!=null)content.updateElement(true);
			if(XSDParticle.class.isInstance(content)){
				if(base!=null){
					 fixupXSDElement((org.w3c.dom.Element) content.getElement().getParentNode(),content,"base",base);
				}
				fixupParticle((XSDParticle)content);
			}
			else if(XSDSimpleTypeDefinition.class.isInstance(content)){
				if((base!=null)){
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
			XSDSimpleTypeDefinition typeDefinition=attributeDeclaration.getTypeDefinition();
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
			if(base!=null){
				org.w3c.dom.Element simpleElement=simpleTypeDefinition.getElement();
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
								fixupXSDElement((org.w3c.dom.Element)child,simpleTypeDefinition,"base",base);
							}
						}
					}
				}
			}
			for(XSDSimpleTypeDefinition content:simpleTypeDefinition.getContents()){
				fixupSimpleTypeDefinition(content);
			}
		}
		private static void fixupSimpleTypeDefinition(
				XSDSimpleTypeDefinition simpleTypeDefinition) {
			XSDTypeDefinition base=simpleTypeDefinition.getBaseTypeDefinition();
			fixupSimpleTypeDefinition(simpleTypeDefinition,base);
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
			XSDTypeDefinition typeDefinition=elementDeclaration.getResolvedElementDeclaration().getTypeDefinition();
			if((typeDefinition!=null)&&(typeDefinition.getName()!=null)&&!(elementDeclaration.isElementDeclarationReference())){
				fixupXSDElement(elementDeclaration,"type",typeDefinition);
			}
		}
		static protected void fixupXSDElement(org.w3c.dom.Element domElementx,XSDConcreteComponent xsdElement,String attributeName ,XSDNamedComponent referencedComponent){
			if(referencedComponent==null){
				System.out.println("FAILED to get "+attributeName+" for xsd component "+xsdElement);
				return;
			}
			org.w3c.dom.Element schemaElement=xsdElement.getSchema().getElement();
			XSDSchema schema=referencedComponent.getSchema();
			if(schema==null){
				XSDConcreteComponent c1=xsdElement.getContainer();
				System.out.println("FAILED to get schema for attribute "+attributeName+", "+c1+", xsd component "+xsdElement+", referenced component "+referencedComponent+", container "+referencedComponent.getContainer());
				return;
			}
			String namespace=schema.getTargetNamespace();
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
		static protected String getPrefix(String namespace,org.w3c.dom.Element domElement){
			NamedNodeMap attributeMap=domElement.getAttributes();
			int length=attributeMap.getLength();
			for(int i=0;i<length;i++){
				Attr node=(Attr)attributeMap.item(i);
				if(
						"http://www.w3.org/2000/xmlns/".equals(node.getNamespaceURI())
						&&"xmlns".equals(node.getPrefix())
						&&namespace.equals(node.getValue())
					){
					return node.getLocalName();
				}
			}
			String newPrefix="tns"+(length+1);
			domElement.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:"+newPrefix, namespace);
			return newPrefix;
		}
		
				
		@Operation(contextual=true)
		static public List<Property> getPropertyOfSubsettedProperty(Property property) {
			List<Property> result=new Vector<Property>();
			Classifier propertyClassifier=getClassifier(property);
			if(propertyClassifier!=null)
			for(Classifier classifier:getAllChildrenInclusive(propertyClassifier)){
				for(Property test:classifier.getAttributes()){
					for(Property subsettedProperty:test.getSubsettedProperties()){
						if(subsettedProperty.equals(property)){
							result.add(test);
						}
					}
				}
			}
			return result;
		}
		@Operation(contextual=true)
		static public Set<Classifier> getAllChildrenInclusive(Classifier classifier) {
			Set<Classifier> result=new HashSet<Classifier>();
			getAllChildrenInclusive(classifier,result);
			return result;
		}
		static protected void getAllChildrenInclusive(Classifier classifier,Set<Classifier> result) {
			if(result.contains(classifier))return;
			result.add(classifier);
			for(DirectedRelationship dr:classifier.getTargetDirectedRelationships()){
				if(dr instanceof Generalization){
					Generalization generalization=(Generalization)dr;
					Classifier specific=generalization.getSpecific();
					getAllChildrenInclusive(specific,result);
				}
			}
		}
		@Operation(contextual=true)
		static public Classifier getClassifier(Property property) {
			Class classTest=property.getClass_();
			if(classTest!=null)return classTest;
			return property.getDatatype();
		}
		@Operation(contextual=true)
		static public String splitSchemas(XSDSchema schemaIn ,XSDSchema referenceTarget) {
			XSDSchema schema=(XSDSchema)schemaIn;
			Resource resource=schema.eResource();
			ResourceSet resourceSet=resource.getResourceSet();
			String schemaLocation=schema.getSchemaLocation();
			Resource referenceResource=referenceTarget.eResource();
			URI referenceURI=referenceResource.getURI().trimSegments(1);
			System.out.println("splitSchemas referenceURI "+referenceURI);
			Map options=new HashMap();
			boolean firstError=true;
			for(EObject targetObject:new Vector<EObject>(resource.getContents())){
				if(XSDSchema.class.isInstance(targetObject)){
					XSDSchema targetSchema=(XSDSchema)targetObject;
					// fixups: scan for types of elements
					try{
						for(XSDSchemaContent schemaContent:targetSchema.getContents()){
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
						
						URI targetURI=URI.createURI(referenceURI+"/"+targetSchema.getSchemaLocation().replace("platform:/resource/",""));
						System.out.println("splitSchemas "+targetURI+", "+targetSchema.getSchemaLocation());
						Resource targetResource=resourceSet.createResource(targetURI);
						targetResource.getContents().add(targetSchema);
						try {
							targetResource.save(options);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}catch(Throwable t){
						System.out.println("splitSchemas ERROR- "+t);
						if(firstError){
							t.printStackTrace();
							firstError=false;
						}
						
					}
				}else{
					//System.out.println("splitSchemas ERROR-non Schema Root "+targetObject);
					
				}
			}
			return "done";
		}
		
		@Operation(contextual=true)
		static public void mapInit(String dummy) {
			elementDeclaration2Uml.clear();
			didSchemas.clear();
		}
		
		///////////////////////
		static protected Set<XSDSchema> didSchemas=new HashSet<XSDSchema>();
		static protected Map<XSDElementDeclaration,Element> elementDeclaration2Uml=new HashMap<XSDElementDeclaration,Element>();
		@Operation(contextual=true)
		static public String getRootFileName(EObject eObject) {
			System.out.println("getRootFileName eObject "+eObject);
			if(eObject==null)return null;
			Resource resource=eObject.eResource();
			System.out.println("getRootFileName resource "+resource);
			if(resource==null)return null;
			URI uri=resource.getURI();
			System.out.println("getRootFileName uri "+uri);
			if(uri==null)return null;
			String filePath=uri.toFileString();
			if(uri.isPlatformResource()){
				filePath=uri.toPlatformString(true);
			}
			System.out.println("getRootFileName filePath "+filePath);
			if(filePath==null)return null;
			File baseFile=new File(filePath);
			File rootFile=baseFile.getParentFile().getParentFile();
			String extentBaseName=rootFile.getName()+"/";
			return extentBaseName;
		}
		@Operation(contextual=true)
		static public Object getDocumentAtRelativeURI(EObject eObject,String relativeURI) {
			try {
				Resource myResource=eObject.eResource();
				URI myURI=myResource.getURI();
				URI schemaURI=URI.createURI(relativeURI).resolve(myURI);
				System.out.println("getDocumentAtRelativeURI " +schemaURI+", "+myURI+", "+relativeURI);
				DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance(); 	
				documentBuilderFactory.setNamespaceAware(true);
				DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
				Document document=documentBuilder.parse(schemaURI.toString());
				if(document!=null){
					org.w3c.dom.Element element=document.getDocumentElement();
					System.out.println("getDocumentAtRelativeURI element " +element);
					return element;
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
			return null;
		}

		@Operation(contextual=true)
		static public String saveModel(Package aPackage) {
			Resource resource=aPackage.eResource();
			System.out.println("saveModel resource "+resource);
			if(resource==null)return "";
			if(!(resource instanceof XMLResource)){
				System.out.println("ERROR: non-XML Resource for "+aPackage.getQualifiedName()+", "+resource);
				return "";
			}
			XMLResource xmlResource=(XMLResource)resource;
			URI resourceURI=xmlResource.getURI();
			System.out.println("saveModel resourceURI "+resourceURI);
			if(resourceURI==null)return "";
			URI backupURI=resourceURI.appendFileExtension("fixed");
			
			Map options=new HashMap();
			xmlResource.setURI(backupURI);
			// we have duplicate ids, mismatches with applied stereotypes
			fixupResource(xmlResource);
			try {
				xmlResource.save(options);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			xmlResource.setURI(resourceURI);
			System.out.println("saveModel fixed-up original "+resourceURI+", copy of fixed at "+backupURI);
			return "";
			
		}
		protected static void fixupResource(XMLResource resource){
			TreeIterator<EObject> tree=resource.getAllContents();
			Set<String> ids=new HashSet<String>();
			List<EObject> objectsForFixing=new Vector<EObject>();
			while(tree.hasNext()){
				objectsForFixing.add(tree.next());
			}
			for(EObject eObject:new Vector<EObject>(objectsForFixing)){
				if(eObject instanceof Property){
					fixupProperty((Property)eObject,objectsForFixing);
				}
			}
			for(EObject eObject:objectsForFixing){
				fixupEObject(eObject,ids,resource);
			}
		}
		protected static void fixupProperty(Property property,List<EObject> objectsForFixing){
					ValueSpecification lowerVS=property.getLowerValue();
					ValueSpecification upperVS=property.getUpperValue();
					if(lowerVS==null){
						System.out.println("ERROR: no lower value specification for "+property.getQualifiedName());
						LiteralInteger lower=(LiteralInteger)property.createLowerValue(null,null, UMLPackage.eINSTANCE.getLiteralInteger());
						lower.setValue(property.getLower());
						objectsForFixing.add(lower);
					}
					if(upperVS==null){
						System.out.println("ERROR: no upper value specification for "+property.getQualifiedName());
						LiteralUnlimitedNatural upper=(LiteralUnlimitedNatural)property.createUpperValue(null,null, UMLPackage.eINSTANCE.getLiteralUnlimitedNatural());
						upper.setValue(property.getUpper());
						objectsForFixing.add(upper);
					}
		}
		
		protected static void fixupEObject(EObject eObject,Set<String> ids,XMLResource xmlResource){
			// check for duplicate ids, any applied stereotypes not owned by resource
			Resource resource=eObject.eResource();
			if(!xmlResource.equals(resource)){
				//System.out.println("ERROR: dual Resource ownership for "+eObject+", "+resource);
				if(resource==null){
					System.out.println("ERROR: no Resource ownership for "+eObject);
					return;
				}
				resource.getContents().remove(eObject);
			}
			String id=xmlResource.getID(eObject);
			if(id==null){
				System.out.println("ERROR: null id at "+eObject);
				id=EcoreUtil.generateUUID();
				xmlResource.setID(eObject, id);
				fixupEObject(eObject,ids,xmlResource);
				return;
			}
			if(ids.contains(id)){
				System.out.println("ERROR: duplicate id at "+eObject);
				id=EcoreUtil.generateUUID();
				xmlResource.setID(eObject, id);
				fixupEObject(eObject,ids,xmlResource);
				return;
			}
			ids.add(id);
			if(eObject instanceof Element){
				Element element=(Element)eObject;
				//Resource resource=eObject.eResource();
				for(EObject application:element.getStereotypeApplications()){
					fixupResourceContainer(element,application,ids,xmlResource);
					// and check any references we need to account for as well
					for(EObject referencedObject:application.eCrossReferences()){
						fixupResourceContainer(element,referencedObject,ids,xmlResource);
					}
				}
				// for DirectedRelationships, make sure both sides have at least one value and that they are in xmlResource
				if(element instanceof DirectedRelationship){
					DirectedRelationship directedRelationship=(DirectedRelationship)element;
					if(directedRelationship.getSources().isEmpty()||directedRelationship.getTargets().isEmpty()){
						System.out.println("ERROR: directedRelationship missing source or target  "+directedRelationship+", sources "+directedRelationship.getSources()+", target "+directedRelationship.getTargets());
						directedRelationship.destroy();
					}else{
						for(Element sourceElement:directedRelationship.getSources()){
							fixupResourceReference(element,sourceElement,ids,xmlResource);
						}
						for(Element sourceElement:directedRelationship.getTargets()){
							fixupResourceReference(element,sourceElement,ids,xmlResource);
						}
					}
				}
			}
		}
		static protected void fixupResourceContainer(Element element,EObject referencedObject,Set<String> ids,XMLResource xmlResource){
			if(!xmlResource.equals(referencedObject.eResource())){
				//System.out.println("ERROR: resource mismatch for stereotype application reference "+referencedObject+", from "+element);
				Resource resource=referencedObject.eResource();
				if(resource==null){
					System.out.println("ERROR: resource missing for "+referencedObject+", from "+element);
					return;
				}
				resource.getContents().remove(referencedObject);
				xmlResource.getContents().add(referencedObject);
				// better check that id too
				fixupEObject(referencedObject,ids,xmlResource);
			}
		}
		static protected void fixupResourceReference(Element element,EObject referencedObject,Set<String> ids,XMLResource xmlResource){
			// we should not worry about this being same resource, if we need it it will be handled elsewhere
		}
		@Operation(contextual=true)
		static public EObject ApplyStereotype(Element self,Stereotype stereotype) {
			for(Stereotype s:self.getApplicableStereotypes()){
				if(!stereotype.getName().equals(s.getName()))continue;
				
				EObject instance=self.applyStereotype(s);
				if(instance==null){
					System.out.println("ERROR: ApplyStereotype failed to apply "+stereotype.getQualifiedName());
				}
				return instance;
			}
			Package nearestPackage=self.getNearestPackage();
			System.out.println("ERROR: ApplyStereotype failed:no applicable stereotypes "+stereotype.getQualifiedName()+" on "+self+", "+nearestPackage);
			if(nearestPackage==null)return null;
			for(Stereotype s:self.getApplicableStereotypes()){
					System.out.println("ApplyStereotype applicable "+s.getQualifiedName());
			}
			for(Profile profile:nearestPackage.getAppliedProfiles()){
				System.out.println("ApplyStereotype applied profile "+profile.getQualifiedName());
			}
			for(ProfileApplication profileApplication:nearestPackage.getAllProfileApplications()){
				for(Stereotype s:profileApplication.getAppliedProfile().getOwnedStereotypes()){
					if(!stereotype.getName().equals(s.getName()))continue;
					System.out.println("ApplyStereotype definition "+profileApplication.getAppliedDefinition(s));
				}
			}
			return null;
		}

		@Operation(contextual=true)
		static public String splitDocuments(EObject schemaIn ,EObject referenceTarget,String schemaLocation) {
			EObject schema=(EObject)schemaIn;
			Resource resource=schema.eResource();
			ResourceSet resourceSet=resource.getResourceSet();
			
			//String schemaLocation=schema.getSchemaLocation();
			Resource referenceResource=referenceTarget.eResource();
			// null pointer; no resource at this point?
			URI referenceURI=referenceResource.getURI().trimSegments(1);
			System.out.println("splitSchemas referenceURI "+referenceURI);
			Map options=new HashMap();
			boolean firstError=true;
			for(EObject targetObject:new Vector<EObject>(resource.getContents())){
				EObject targetSchema=(EObject)targetObject;
					try{
						URI targetURI=URI.createURI(referenceURI+"/"+schemaLocation);
						System.out.println("splitDocuemnts "+targetURI+", "+schemaLocation);
						Resource targetResource=resourceSet.createResource(targetURI);
						targetResource.getContents().add(targetSchema);
						try {
							targetResource.save(options);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}catch(Throwable t){
						System.out.println("splitDocuemnts ERROR- "+t);
						if(firstError){
							t.printStackTrace();
							firstError=false;
						}
						
					}
			}
			return "done";
		}
		@Operation(contextual=true)
		static public String dynamicSave(EObject targetObject ,EObject referenceTarget,String schemaLocation) {
			// assume no resource for target, but referenceTarget must have resource
			Resource referenceResource=referenceTarget.eResource();
			ResourceSet resourceSet=referenceResource.getResourceSet();
			// null pointer; no resource at this point?
			URI referenceURI=referenceResource.getURI().trimSegments(1);
			System.out.println("dynamicSave referenceURI "+referenceURI);
			Map options=new HashMap();
			boolean firstError=true;
			try{
				URI targetURI=URI.createURI(referenceURI+"/"+schemaLocation);
				System.out.println("dynamicSave "+targetURI+", "+schemaLocation);
				Resource targetResource=resourceSet.createResource(targetURI);
				targetResource.getContents().add(targetObject);
				try {
					targetResource.save(options);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}catch(Throwable t){
				System.out.println("dynamicSave ERROR- "+t);
				if(firstError){
					t.printStackTrace();
					firstError=false;
				}
				
			}
			return "done";
		}
*/		
}
