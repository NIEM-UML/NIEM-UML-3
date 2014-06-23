/**
 * 
 */
package org.modeldriven.magicdraw.niem.instance;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import javax.script.ScriptEngine;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDAttributeUse;
import org.eclipse.xsd.XSDAttributeUseCategory;
import org.eclipse.xsd.XSDBoundedFacet;
import org.eclipse.xsd.XSDCardinalityFacet;
import org.eclipse.xsd.XSDComplexTypeContent;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDConstrainingFacet;
import org.eclipse.xsd.XSDConstraint;
import org.eclipse.xsd.XSDContentTypeCategory;
import org.eclipse.xsd.XSDDerivationMethod;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDEnumerationFacet;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDFeature;
import org.eclipse.xsd.XSDForm;
import org.eclipse.xsd.XSDFractionDigitsFacet;
import org.eclipse.xsd.XSDImport;
import org.eclipse.xsd.XSDLengthFacet;
import org.eclipse.xsd.XSDMaxExclusiveFacet;
import org.eclipse.xsd.XSDMaxInclusiveFacet;
import org.eclipse.xsd.XSDMaxLengthFacet;
import org.eclipse.xsd.XSDMinExclusiveFacet;
import org.eclipse.xsd.XSDMinInclusiveFacet;
import org.eclipse.xsd.XSDMinLengthFacet;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDModelGroupDefinition;
import org.eclipse.xsd.XSDNamespaceConstraintCategory;
import org.eclipse.xsd.XSDNumericFacet;
import org.eclipse.xsd.XSDOrderedFacet;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDParticleContent;
import org.eclipse.xsd.XSDPatternFacet;
import org.eclipse.xsd.XSDProcessContents;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSchemaContent;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTerm;
import org.eclipse.xsd.XSDTotalDigitsFacet;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.XSDWhiteSpace;
import org.eclipse.xsd.XSDWhiteSpaceFacet;
import org.eclipse.xsd.XSDWildcard;
import org.eclipse.xsd.impl.XSDSimpleTypeDefinitionImpl;
import org.eclipse.xsd.util.XSDConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NDR7_04_SchemaConformant;
import org.modeldriven.magicdraw.niem.validate.NameHelper;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author tom
 *
 */
public class SimpleType implements NIEM_ProfileConstants{
	protected Classifier dataType;
	protected XSDSchema schema;
	protected XSDTypeDefinition simpleTypeDefinition;
	protected XSDModelGroupDefinition modelGroupDefinition;
	static protected XSDSchema proxySchema;
	public SimpleType(Classifier dataTypeIn,XSDSchema schemaIn){
		dataType=dataTypeIn;
		schema=schemaIn;
		if(NIEMHelper.isModelGroupDefinition(dataType)){
			modelGroupDefinition=createModelGroupDefinition();
			addSchemaContent(schema,modelGroupDefinition);
		}else{
		simpleTypeDefinition=createType();
		//configure();
		//System.out.println("SimpleType configured "+simpleTypeDefinition+" with base "+simpleTypeDefinition.getBaseType());
		//NDR5_03_SchemaConformant.consistencyCheck(simpleTypeDefinition, "after configure");
		addSchemaContent(schema,simpleTypeDefinition);
		}
	}
	protected XSDTypeDefinition xsdBaseType=null;
	protected void setXsdBaseType(XSDTypeDefinition typeDefinition){xsdBaseType=typeDefinition;}
	protected XSDTypeDefinition getXsdBaseType(){return xsdBaseType;}
	protected void addSchemaContent(XSDSchema schema,XSDTypeDefinition simpleTypeDefinition){
		try{
			if(!schema.getContents().contains(simpleTypeDefinition)){
				//XSDTypeDefinition saveBase=simpleTypeDefinition.getBaseType();// moved before content add, but causes loop if placed here
				if(!isAnonymous(getDataType())){
				schema.getContents().add(simpleTypeDefinition);// moved before configure, otherwise duplicate schemas
				}
				//XSDTypeDefinition saveBase=simpleTypeDefinition.getBaseType();// moved before configure, but causes lots of validation errors
				configure();
				// getting base type here may not be same as original base type, and following fixup never sees a change
				//XSDTypeDefinition saveBase=simpleTypeDefinition.getBaseType();
				XSDTypeDefinition saveBase=getXsdBaseType();
				if(saveBase==null){saveBase=simpleTypeDefinition.getBaseType();}
				// fixup lost base type definitions
//				schema.getContents().add(simpleTypeDefinition);
// do we need updateElement?				
//				simpleTypeDefinition.updateElement();
				XSDTypeDefinition testBase=simpleTypeDefinition.getBaseType();
				if((saveBase!=null)&&!saveBase.equals(testBase)){
					if(simpleTypeDefinition instanceof XSDSimpleTypeDefinition){
						if(saveBase instanceof XSDSimpleTypeDefinition){
							((XSDSimpleTypeDefinition)simpleTypeDefinition).setBaseTypeDefinition((XSDSimpleTypeDefinition)saveBase);
						}
					}else{
						((XSDComplexTypeDefinition)simpleTypeDefinition).setBaseTypeDefinition(saveBase);
					}
				}
				// fixup lost element references
				// the updateElement may have propagated to all types, so check entire schema
				if(!isAnonymous(getDataType())){
				for(XSDTypeDefinition typeDefinition:simpleTypeDefinition.getSchema().getTypeDefinitions()){
					if(typeDefinition instanceof XSDComplexTypeDefinition){
						fixupLostElements((XSDComplexTypeDefinition)typeDefinition);
					}
					
				}
				}
				// check if facets have values
				// we do not seem to be getting enumeration facets, see if another updateElement helps
				//simpleTypeDefinition.updateElement();// does not help
/*
				XSDSimpleTypeDefinition useSimpleType=null;
				if(simpleTypeDefinition instanceof XSDSimpleTypeDefinition)useSimpleType=(XSDSimpleTypeDefinition)simpleTypeDefinition;
				else{
					XSDComplexTypeDefinition complexType=(XSDComplexTypeDefinition)simpleTypeDefinition;
					if(complexType.getContent() instanceof XSDSimpleTypeDefinition)useSimpleType=(XSDSimpleTypeDefinition)complexType.getContent();
				}
				
				if(useSimpleType!=null){
					XSDSimpleTypeDefinition simpleType=useSimpleType;
					for(XSDConstrainingFacet facet:simpleType.getFacetContents()){
						String lexicalValue=facet.getLexicalValue();
						Element w3cElement=facet.getElement();
						Attr attr=w3cElement.getAttributeNode("value");
						if(attr==null){
							w3cElement.setAttributeNS(null,XSDConstants.VALUE_ATTRIBUTE, lexicalValue);
							System.out.println("added value "+lexicalValue+" to "+facet);
						}else{
							//attr.setValue(lexicalValue);
							System.out.println("has value "+attr.getValue()+" should be "+lexicalValue);
						}
					}
				}
	*/			
//				System.out.println("SimpleType added "+simpleTypeDefinition+" with base "+simpleTypeDefinition.getBaseType());
//				System.out.println("SimpleType added "+simpleTypeDefinition+" with base "+simpleTypeDefinition.getBaseType());
//				NDR5_03_SchemaConformant.consistencyCheck(simpleTypeDefinition, "after add to schema");
				
			}
		}catch(Throwable t){
			t.printStackTrace();
			System.out.println("SimpleType add "+simpleTypeDefinition+" : "+t);
		}
		
	}
	protected void addSchemaContent(XSDSchema schema,XSDModelGroupDefinition modelGroupDefinition){
		try{
			if(!schema.getModelGroupDefinitions().contains(modelGroupDefinition)){
				if(!isAnonymous(getDataType())){
				schema.getContents().add(modelGroupDefinition);// moved before configure, otherwise duplicate schemas
				}
				configureModelGroup();
			}
		}catch(Throwable t){
			t.printStackTrace();
			System.out.println("SimpleType add "+modelGroupDefinition+" : "+t);
		}
		
	}
	
	protected static void fixupLostElements(XSDComplexTypeDefinition typeDefinition){
		// fixup lost element references
		// the updateElement may have propagated to all types, so check entire schema
				XSDComplexTypeContent content=typeDefinition.getContent();
				if(content instanceof XSDParticle){
					XSDParticleContent particleContent=((XSDParticle)content).getContent();
					if(particleContent instanceof XSDModelGroup){
						for(XSDParticle particle:((XSDModelGroup)particleContent).getContents()){
							XSDParticleContent subParticleContent=particle.getContent();
							if(subParticleContent instanceof XSDElementDeclaration){
								XSDElementDeclaration element=(XSDElementDeclaration)subParticleContent;
								getResolvedElementDeclaration(element);
							}
						}
					}
				}
				// double check for any lost wildcard
				XSDTypeDefinition base=typeDefinition.getBaseTypeDefinition();
				if((base!=null)&&(base instanceof XSDComplexTypeDefinition)
						&&(typeDefinition.getAttributeWildcard()==null)
						&&(typeDefinition.getSyntheticWildcard()==null)
						){
					XSDComplexTypeDefinition complexBase=(XSDComplexTypeDefinition)base;
					if(complexBase.getAttributeWildcard()!=null){
						typeDefinition.setSyntheticWildcard((XSDWildcard)complexBase.getAttributeWildcard().cloneConcreteComponent(true, true));
						typeDefinition.setAttributeWildcard((XSDWildcard)complexBase.getAttributeWildcard().cloneConcreteComponent(true, true));
						System.out.println("Fixed up lost attribute wildcard "+typeDefinition.getName());
					}else if(complexBase.getSyntheticWildcard()!=null){
						typeDefinition.setSyntheticWildcard((XSDWildcard)complexBase.getSyntheticWildcard().cloneConcreteComponent(true, true));
						typeDefinition.setAttributeWildcard((XSDWildcard)complexBase.getSyntheticWildcard().cloneConcreteComponent(true, true));
						System.out.println("Fixed up lost synthetic wildcard "+typeDefinition.getName());
					}
				}
	}
	public XSDModelGroupDefinition getXSDModelGroupDefinition(){return modelGroupDefinition;}
	public XSDTypeDefinition getXSDTypeDefinition(){return simpleTypeDefinition;}
	protected Classifier getDataType(){return dataType;}
	protected XSDSchema getXSDSchema(){return schema;}
	protected XSDSchema getProxySchema(){
		if(proxySchema==null){
			// find proxy schema and load it
			QvtCommonAction.registerFactories(null);
			File rootFile=new File(QvtCommonAction.getPluginDirectory()+"niemSchemas");
		    org.eclipse.emf.common.util.URI rootURI=org.eclipse.emf.common.util.URI.createFileURI(rootFile.getAbsolutePath());
	    	ResourceSet resourceSet = new ResourceSetImpl();

			String schemaLocation=XMLSCHEMA_DIRECTORYNAME+"/"+SUBSET_DIRECTORYNAME+"/"+NIEM_DIRECTORYNAME+"/proxy/xsd/2.0/xsd.xsd";
			org.eclipse.emf.common.util.URI targetURI=org.eclipse.emf.common.util.URI.createURI(rootURI+"/"+schemaLocation);
			Resource targetResource=resourceSet.getResource(targetURI, true);
			for(EObject eObject:targetResource.getContents()){
				if(eObject instanceof XSDSchema){
					proxySchema=(XSDSchema)eObject;
					System.out.println("Proxy schema "+proxySchema);
					break;
				}
			}

		}
		return proxySchema;
	}
	protected XSDModelGroupDefinition createModelGroupDefinition(){
		return createModelGroupDefinition(getDataType(),getXSDSchema());
	}
	protected XSDModelGroupDefinition createModelGroupDefinition(Classifier derivedClassifier,XSDSchema schema){
		// if already there, use it
		XSDModelGroupDefinition result=findModelGroupDefinition(derivedClassifier,schema);
		if(result!=null)return result;
		return createXSDModelGroupDefinition( derivedClassifier,dataType,getXSDSchema());
	}
	protected XSDTypeDefinition createType(){
		return createType(getDataType(),getXSDSchema());
	}
	protected XSDTypeDefinition createType(Classifier derivedClassifier,XSDSchema schema){
		// if this is a primitive, find the primitive in xsd schema
		if(isPrimitive(derivedClassifier)){
			return getXsdPrimitive(derivedClassifier,schema);
		}
		// if already there, use it
		XSDTypeDefinition result=findSimpleType(derivedClassifier,schema);
		if(result!=null)return result;
		return createXSDType( derivedClassifier,dataType,getXSDSchema());
		/*
		if(!(derivedClassifier instanceof DataType)){
			XSDComplexTypeDefinition complexTypeDefinition=XSDFactory.eINSTANCE.createXSDComplexTypeDefinition();
			complexTypeDefinition.setAbstract(dataType.isAbstract());
			complexTypeDefinition.setMixed(false);
			
			// if base is simple, then content is simple; otherwise a particle
			Classifier baseClassifier=NIEMHelper.getBaseClassifier(derivedClassifier);
			if((baseClassifier!=null)&&(baseClassifier instanceof DataType)){
				XSDTypeDefinition typeDefinition=createOrFindXSDTypeDefinition(baseClassifier,getXSDSchema());
				if(typeDefinition instanceof XSDSimpleTypeDefinition){
					XSDSimpleTypeDefinition simpleTypeDefinition=XSDFactory.eINSTANCE.createXSDSimpleTypeDefinition();
					complexTypeDefinition.setContentTypeCategory(XSDContentTypeCategory.SIMPLE_LITERAL);
					
//					complexTypeDefinition.setContent((XSDSimpleTypeDefinition)typeDefinition);
					complexTypeDefinition.setContent(simpleTypeDefinition);
				}
			}else{
				complexTypeDefinition.setContentTypeCategory(XSDContentTypeCategory.ELEMENT_ONLY_LITERAL);
				
				XSDParticle particle=XSDFactory.eINSTANCE.createXSDParticle();
				particle.setMaxOccurs(1);
				particle.setMinOccurs(1);
				XSDModelGroup sequence=XSDFactory.eINSTANCE.createXSDModelGroup();
				particle.setContent(sequence);
				particle.setTerm(sequence);
				sequence.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
				complexTypeDefinition.setContentType(particle);
				complexTypeDefinition.setContent(particle);
			}
			
			result=complexTypeDefinition;
			return result;
		}
		DataType dataType=(DataType)derivedClassifier;
		// create XSDSimpleTypeDefinition, hook into schema 
		XSDSimpleTypeDefinition simpleTypeDefinition=XSDFactory.eINSTANCE.createXSDSimpleTypeDefinition();
		result=simpleTypeDefinition;
		// note that we may be wrapped by a complexType
		
		if(!NIEMHelper.isDataTypeSimpleType(dataType)){
			XSDComplexTypeDefinition complexTypeDefinition=XSDFactory.eINSTANCE.createXSDComplexTypeDefinition();
			complexTypeDefinition.setAbstract(dataType.isAbstract());
			complexTypeDefinition.setMixed(false);
			complexTypeDefinition.setContent(simpleTypeDefinition);
			complexTypeDefinition.setContentTypeCategory(XSDContentTypeCategory.SIMPLE_LITERAL);
			
			result=complexTypeDefinition;
		}
//		schema.getContents().add(result);
		return result;
		*/
	}
	static protected XSDTypeDefinition createXSDType(Classifier derivedClassifier,Classifier dataTypeIn,XSDSchema xsdSchema){
		XSDTypeDefinition result=null;
		if(!(derivedClassifier instanceof DataType)){
			XSDComplexTypeDefinition complexTypeDefinition=XSDFactory.eINSTANCE.createXSDComplexTypeDefinition();
			if(!isAnonymous(dataTypeIn)){
			complexTypeDefinition.setAbstract(dataTypeIn.isAbstract());
			}
			complexTypeDefinition.setMixed(false);
			
			// if base is simple, then content is simple; otherwise a particle
			Classifier baseClassifier=NIEMHelper.getBaseClassifier(derivedClassifier);
			if((baseClassifier!=null)&&(baseClassifier instanceof DataType)){
				XSDTypeDefinition typeDefinition=createOrFindXSDTypeDefinition(baseClassifier,xsdSchema);
				if(typeDefinition instanceof XSDSimpleTypeDefinition){
					XSDSimpleTypeDefinition simpleTypeDefinition=XSDFactory.eINSTANCE.createXSDSimpleTypeDefinition();
					complexTypeDefinition.setContentTypeCategory(XSDContentTypeCategory.SIMPLE_LITERAL);
					
//					complexTypeDefinition.setContent((XSDSimpleTypeDefinition)typeDefinition);
					complexTypeDefinition.setContent(simpleTypeDefinition);
				}
			}else{
				complexTypeDefinition.setContentTypeCategory(XSDContentTypeCategory.ELEMENT_ONLY_LITERAL);
				
				XSDParticle particle=XSDFactory.eINSTANCE.createXSDParticle();
				particle.setMaxOccurs(1);
				particle.setMinOccurs(1);
				XSDModelGroup sequence=XSDFactory.eINSTANCE.createXSDModelGroup();
				particle.setContent(sequence);
				particle.setTerm(sequence);
				sequence.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
				complexTypeDefinition.setContentType(particle);
				complexTypeDefinition.setContent(particle);
			}
			
			result=complexTypeDefinition;
			return result;
		}
		DataType dataType=(DataType)derivedClassifier;
		// create XSDSimpleTypeDefinition, hook into schema 
		XSDSimpleTypeDefinition simpleTypeDefinition=XSDFactory.eINSTANCE.createXSDSimpleTypeDefinition();
		result=simpleTypeDefinition;
		// note that we may be wrapped by a complexType
		
		if(!NIEMHelper.isDataTypeSimpleType(dataType)){
			XSDComplexTypeDefinition complexTypeDefinition=XSDFactory.eINSTANCE.createXSDComplexTypeDefinition();
			if(!isAnonymous(dataType)){
			complexTypeDefinition.setAbstract(dataType.isAbstract());
			}
			complexTypeDefinition.setMixed(false);
			complexTypeDefinition.setContent(simpleTypeDefinition);
			complexTypeDefinition.setContentTypeCategory(XSDContentTypeCategory.SIMPLE_LITERAL);
			
			result=complexTypeDefinition;
		}
//		schema.getContents().add(result);
		return result;
	}
	static protected XSDModelGroupDefinition createXSDModelGroupDefinition(Classifier derivedClassifier,Classifier dataTypeIn,XSDSchema xsdSchema){
		XSDModelGroupDefinition result=null;
		XSDModelGroupDefinition modelGroupDefinition=XSDFactory.eINSTANCE.createXSDModelGroupDefinition();
			XSDModelGroup sequence=XSDFactory.eINSTANCE.createXSDModelGroup();
			String name=NameHelper.getNIEMName(derivedClassifier);
			modelGroupDefinition.setName(name);
			modelGroupDefinition.setModelGroup(sequence);
			sequence.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
			result=modelGroupDefinition;
			return result;
	}
	
	static public XSDSimpleTypeDefinition createOrFindXSDSimpleTypeDefinition(Classifier dataType,XSDSchema schema){
		XSDTypeDefinition typeDefinition=SimpleType.createOrFindXSDTypeDefinition( dataType,schema);
		if(typeDefinition instanceof XSDSimpleTypeDefinition)return (XSDSimpleTypeDefinition)typeDefinition;
		if(typeDefinition instanceof XSDComplexTypeDefinition){
			// see if content is simple
			XSDComplexTypeContent content=((XSDComplexTypeDefinition)typeDefinition).getContent();
			if(content instanceof XSDSimpleTypeDefinition){
				 return (XSDSimpleTypeDefinition)content;
			}
		}
		return null;
	}	
	static protected Package getNearestSchemaModel(NamedElement namedElement){
		Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
		if(informationModel==null){
			informationModel=NIEMHelper.getNearestPackage(namedElement);
			if(!NIEMHelper.isXMLPrimitiveTypesLibrary(informationModel))return null;
		}
		return informationModel;
	}
	static protected XSDModelGroupDefinition createOrFindXSDModelGroupDefinition(Classifier dataType,XSDSchema schemaContext){
		Package informationModel=getNearestSchemaModel(dataType);
		if(informationModel==null)return null;
		XSDSchema schema=createOrFindSchema(informationModel);
		if(schema==null)return null;
		XSDModelGroupDefinition result=findModelGroupDefinition(dataType,schema);
		if(result!=null)return result;
		// create and populate a XSDModelGroupDefinition
		SimpleType newSimpleType=new SimpleType(dataType,schema);
		return newSimpleType.getXSDModelGroupDefinition();
	}
	static public XSDTypeDefinition createOrFindXSDTypeDefinition(Classifier dataType,XSDSchema schemaContext){
		if(isPrimitive(dataType)){
			return getXsdPrimitive(dataType,schemaContext);
		}
		Package informationModel=getNearestSchemaModel(dataType);
		if(informationModel==null)return null;
		XSDSchema schema=createOrFindSchema(informationModel);
		if(schema==null)return null;
		XSDTypeDefinition result=findSimpleType(dataType,schema);
		if(result!=null)return result;
		// create and populate a simpleType
		SimpleType newSimpleType=new SimpleType(dataType,schema);
		return newSimpleType.getXSDTypeDefinition();
	}
	static public XSDConcreteComponent createOrFindXSDConcreteComponent(Property property,XSDSchema schemaContext){
		Package informationModel=NIEMHelper.getNearestInformationModel(property);
		if(informationModel==null)return null;
		XSDSchema schema=createOrFindSchema(informationModel);
		if(schema==null)return null;
		//XSDFeature result=findFeature(property,schema);
		//if(result!=null)return result;
		// get the type, unless it is a PropertyHolder
		Classifier classifier=property.getClassifier();
		if(classifier==null)return null;
		if(NIEMHelper.isPropertyHolder(classifier)){
			// need to create top level directly
			return createOrFindXSDTopLevelFeatureDefinition(property,schema);
		}else{
			if (NIEMHelper.isModelGroupDefinition(classifier)){
				XSDModelGroupDefinition modelGroupDefinition=createOrFindXSDModelGroupDefinition(classifier,schema);
				if(modelGroupDefinition !=null){
					return findModelGroupFeature(property,modelGroupDefinition.getModelGroup());
				}
			}
			else{
			XSDTypeDefinition typeDefinition=createOrFindXSDTypeDefinition(classifier,schema);
			if(typeDefinition instanceof XSDComplexTypeDefinition){
				return findTypeFeature(property,(XSDComplexTypeDefinition)typeDefinition);
			}
			}
		}
		return null;
	}
	static protected String getNamespaceTargetNamespace(Package informationModel){
		if(NIEMHelper.isXMLPrimitiveTypesLibrary(informationModel)){
			return "http://release.niem.gov/niem/proxy/xsd/3.0/";
		}
		return NIEMHelper.getNamespaceTargetNamespace(informationModel);
	}
	static public XSDSchema createOrFindSchema(Package informationModel){
		if(informationModel==null)return null;
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return null;
		Map<Package,XSDSchema> modelToSchema=projectCache.getInformationModelToSchemaMap();
		XSDSchema result=modelToSchema.get(informationModel);
		if(result!=null)return result;
		// a single schema may be referenced by multiple packages; check if schema targetNamespace match already
		String targetNamespace=getNamespaceTargetNamespace(informationModel);
		for(Entry<Package,XSDSchema> entry:modelToSchema.entrySet()){
			if(targetNamespace.equals(entry.getValue().getTargetNamespace())){
				// found it, add map entry and return result
				modelToSchema.put(informationModel, entry.getValue());
				return entry.getValue();
			}
		}
		result=XSDFactory.eINSTANCE.createXSDSchema();
		String prefix="xsd";
		result.setSchemaForSchemaQNamePrefix(prefix);
//		result.getQNamePrefixToNamespaceMap().put(prefix, XSDConstants.SCHEMA_INSTANCE_URI_2001);
		result.getQNamePrefixToNamespaceMap().put(prefix, XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001);
//		result.getQNamePrefixToNamespaceMap().put(prefix, XSDConstants.sc);
//		result.getQNamePrefixToNamespaceMap().put(prefix, XSDConstants.SCHEMA_HAS_FACET_AND_PROPERTY_URI_2001);
		String targetPrefix=NIEMHelper.getNamespaceDefaultPrefix(informationModel);
		if(targetNamespace!=null){
			result.setTargetNamespace(targetNamespace);
			if(targetPrefix!=null){
				result.getQNamePrefixToNamespaceMap().put(targetPrefix, targetNamespace);
			}
			result.getQNamePrefixToNamespaceMap().put(null, targetNamespace);
		}
		result.setAttributeFormDefault(XSDForm.QUALIFIED_LITERAL);
		/*  is this causing problem?
		result.setIncrementalUpdate(true);
		result.updateDocument();
		*/
		modelToSchema.put(informationModel, result);
		return result;
	}
	static protected boolean isAnonymous(Classifier dataType){
		return !(dataType.getOwner() instanceof Package);
	}
	/*
	static protected XSDModelGroupDefinition findModelGroupDefinition(Classifier dataType,XSDSchema schemaContext){
		if(isAnonymous(dataType))return null;
		String name=NameHelper.getNIEMName(dataType);
		for(XSDTypeDefinition typeDefinition:schemaContext.getTypeDefinitions()){
			if(name.equals(typeDefinition.getName())){
				if(typeDefinition instanceof XSDComplexTypeDefinition){
					fixupLostElements((XSDComplexTypeDefinition)typeDefinition);
				}
				return typeDefinition;
			}
		}
		return null;
	}
	*/
	static protected XSDTypeDefinition findSimpleType(Classifier dataType,XSDSchema schemaContext){
		if(isAnonymous(dataType))return null;
		String name=NameHelper.getNIEMName(dataType);
		for(XSDTypeDefinition typeDefinition:schemaContext.getTypeDefinitions()){
			if(name.equals(typeDefinition.getName())){
				if(typeDefinition instanceof XSDComplexTypeDefinition){
					fixupLostElements((XSDComplexTypeDefinition)typeDefinition);
				}
				return typeDefinition;
			}
		}
		return null;
	}
	static protected XSDModelGroupDefinition findModelGroupDefinition(Classifier dataType,XSDSchema schemaContext){
		if(isAnonymous(dataType))return null;
		String name=NameHelper.getNIEMName(dataType);
		for(XSDModelGroupDefinition typeDefinition:schemaContext.getModelGroupDefinitions()){
			if(name.equals(typeDefinition.getName())){
				return typeDefinition;
			}
		}
		return null;
	}
	public void configure(){
		// if it is primitive, no configure
		if(isPrimitive())return;
		if(!isAnonymous(getDataType())){
		String name=NameHelper.getNIEMName(getDataType());
		getXSDTypeDefinition().setName(name);
		}
		// if list or union - setup members, else for restriction set its base type, add facets 
		XSDTypeDefinition typeDefinition=getXSDTypeDefinition();
		Classifier classifier=getDataType();
		XSDSimpleTypeDefinition simpleTypeDefinition=null;
		if(!(classifier instanceof DataType)){
			XSDComplexTypeDefinition complexType=(XSDComplexTypeDefinition)typeDefinition;
	     	DirectedRelationship dr=NIEMHelper.getBaseTypeRelation(classifier);
//			boolean isRestriction=(dr!=null)&&(!NIEMHelper.isRestriction(dr));
			boolean isRestriction=(dr!=null)&&(NIEMHelper.isRestriction(dr));
			if(isRestriction){
				configureComplexRestriction(complexType);
			}else{
				if(complexType.getContent() instanceof XSDSimpleTypeDefinition){
					simpleTypeDefinition=(XSDSimpleTypeDefinition)complexType.getContent();
					configureExtension(simpleTypeDefinition,complexType);
				}else{
					configureComplexExtension(complexType);
				}
			}
			
			return;
		}
		DataType dataType=(DataType)classifier;
		boolean isRestriction=true;
		XSDComplexTypeDefinition complexType=null;
		if(typeDefinition instanceof XSDSimpleTypeDefinition)simpleTypeDefinition=(XSDSimpleTypeDefinition)typeDefinition;
		else{
			complexType=(XSDComplexTypeDefinition)typeDefinition;
			//DataType dataType=getDataType();
			isRestriction=
					(
							NIEMHelper.isValueRestriction(dataType)
							||NIEMHelper.isXSDRepresentationRestriction(dataType)
							)
//					||NIEMHelper.hasStereotype(dataType,NIEMHelper.getCommonStereotype(NIEMHelper.ListStereotypeName))
					||NIEMHelper.isList(dataType)
					||NIEMHelper.isUnion(dataType)
//					||NIEMHelper.isXMLPrimitiveTypesLibrary(NIEMHelper.getNearestPackage(dataType))
					||(Enumeration.class.isInstance(dataType)&&!NIEMHelper.isEnumerationComplexType((Enumeration)dataType))
					||(Enumeration.class.isInstance(dataType)&&!((Enumeration)dataType).getOwnedLiteral().isEmpty())
					||(NIEMHelper.isBaseTypeRestriction(dataType))
//					||(NIEMHelper.isBaseTypeRestriction(dataType)&&!NIEMHelper.isProxyRestriction(dataType))
//					||name.endsWith("Simple")
//					||name.endsWith("SimpleType")
					;

			//if(XSDDerivationMethod.EXTENSION_LITERAL.equals(complexType.getDerivationMethod()))isRestriction=false;
			if(complexType.getContent() instanceof XSDSimpleTypeDefinition){
				simpleTypeDefinition=(XSDSimpleTypeDefinition)complexType.getContent();
			}else{
				return;
			}
		}
		if(isList()){
			configureList(simpleTypeDefinition);
		}else if(isUnion()){
			configureUnion(simpleTypeDefinition);
		}else{
			if(isRestriction){
				configureRestriction(simpleTypeDefinition,complexType);
			}else{
				configureExtension(simpleTypeDefinition,complexType);
			}
		}
	}
	public void configureModelGroup(){
		XSDModelGroupDefinition modelGroupDefinition=getXSDModelGroupDefinition();
		if(!isAnonymous(getDataType())){
			String name=NameHelper.getNIEMName(getDataType());
			modelGroupDefinition.setName(name);
		}
		XSDModelGroup sequence=(XSDModelGroup)modelGroupDefinition.getModelGroup();
		configureModelGroupContent(sequence,(Class)getDataType());
	}
	protected boolean isPrimitive(){
		return isPrimitive(getDataType());
	}
	static protected boolean isPrimitive(Classifier dataType){
		String name=dataType.getName();
		return NIEMHelper.isInXmlTypeLibrary(dataType)&&!(name.endsWith("ListType")||name.endsWith("ListSimpleType"));
	}
	protected boolean isList(){
		return NIEMHelper.isList(getDataType());
	}
	protected boolean isUnion(){
		return NIEMHelper.isUnion(getDataType());
		
	}
	protected XSDSimpleTypeDefinition getXsdPrimitive(){
		return getXsdPrimitive(getDataType(),getXSDSchema());
	}
	static protected XSDSimpleTypeDefinition getXsdPrimitive(Classifier dataType,XSDSchema schemaIn){
		String primitiveTypeName=getXsdPrimitiveTypeName(dataType).toLowerCase();
		return getXsdPrimitive(schemaIn,primitiveTypeName);
	}
	static protected XSDSimpleTypeDefinition getXsdPrimitive(XSDSchema schemaIn,String primitiveTypeName){
		XSDSchema schema=schemaIn.getSchemaForSchema();
		if(schema==null)return null;
		for(XSDTypeDefinition typeDefinition:schema.getTypeDefinitions()){
			String name=typeDefinition.getName();
			if((typeDefinition instanceof XSDSimpleTypeDefinition)
					&&(name!=null)
					&&primitiveTypeName.equals(name.toLowerCase())
					){
				return (XSDSimpleTypeDefinition)typeDefinition;
			}
		}
		// if we fall through, could be a List from XmlPrimitiveTypes library
		return null;
	}
	static protected XSDComplexTypeDefinition getProxyPrimitive(XSDSchema schema,String primitiveTypeName){
		if(schema==null)return null;
		for(XSDTypeDefinition typeDefinition:schema.getTypeDefinitions()){
			String name=typeDefinition.getName();
			if((typeDefinition instanceof XSDComplexTypeDefinition)
					&&(name!=null)
					&&primitiveTypeName.equals(name.toLowerCase())
					){
				return (XSDComplexTypeDefinition)typeDefinition;
			}
		}
		return null;
	}
	protected XSDSimpleTypeDefinition getXsdToken(XSDSchema schemaIn){
		return getXsdPrimitive(schemaIn,"token");
	}
	protected XSDComplexTypeDefinition getProxyToken(XSDSchema schemaIn){
		return getProxyPrimitive(schemaIn,"token");
	}
	/*
	protected String getXsdPrimitiveTypeName(){
		return getXsdPrimitiveTypeName(getDataType());
	}
	*/
	static protected String getXsdPrimitiveTypeName(Classifier dataType){
		String umlName=dataType.getName();
		if("Real".equals(umlName)){
			umlName="double";
		}else if("UnlimitedNatural".equals(umlName)){
			umlName="NonNegativeInteger";
		}
		return umlName;
	}
	protected void configureList(XSDSimpleTypeDefinition simpleTypeDefinitionIn){
		Classifier classifier=getDataType();
		if(!(classifier instanceof DataType))return;
		DataType dataType=(DataType)classifier;
		simpleTypeDefinitionIn.setItemTypeDefinition(null);
		// get the item
		for(Property property:dataType.getOwnedAttribute()){
			Type type=property.getType();
			if(type==null)continue;
			if(type instanceof DataType){
				XSDTypeDefinition simpleTypeDefinition=createOrFindXSDTypeDefinition((DataType)type,getXSDSchema());
				if(simpleTypeDefinition==null)continue;
				if(simpleTypeDefinition instanceof XSDSimpleTypeDefinition){
				simpleTypeDefinitionIn.setItemTypeDefinition((XSDSimpleTypeDefinition)simpleTypeDefinition);
				}
			}
		}
	}
	protected void configureUnion(XSDSimpleTypeDefinition simpleTypeDefinitionIn){
		simpleTypeDefinitionIn.getMemberTypeDefinitions().clear();
		// get the item
		for(Classifier classifier:NIEMHelper.getUnionOfMembers(getDataType())){
			if(classifier instanceof DataType){
				XSDTypeDefinition simpleTypeDefinition=createOrFindXSDTypeDefinition((DataType)classifier,getXSDSchema());
				if(simpleTypeDefinition==null)continue;
				if(simpleTypeDefinition instanceof XSDSimpleTypeDefinition){
				simpleTypeDefinitionIn.getMemberTypeDefinitions().add((XSDSimpleTypeDefinition)simpleTypeDefinition);
				}
			}
		}
	}
	protected void configureBaseType(XSDSimpleTypeDefinition simpleTypeDefinitionIn,XSDComplexTypeDefinition complexTypeDefinitionIn){
		//for restriction set its base type, add facets
		if(complexTypeDefinitionIn==null){
//			simpleTypeDefinitionIn.setBaseTypeDefinition(null);
		}else{
//			complexTypeDefinitionIn.setBaseTypeDefinition(null);
		}
		Classifier baseClassifier=NIEMHelper.getBaseClassifier(getDataType());
		if(baseClassifier instanceof DataType){
			XSDTypeDefinition baseTypeDefinition=null;
			if(NIEMHelper.isProxyRestriction(getDataType())){
				baseTypeDefinition=getProxyPrimitive(getProxySchema(), baseClassifier.getName());
			}else{
				baseTypeDefinition=createOrFindXSDTypeDefinition((DataType)baseClassifier,getXSDSchema());
			}
			if(complexTypeDefinitionIn==null){
				if(baseTypeDefinition instanceof XSDSimpleTypeDefinition){
					XSDSimpleTypeDefinition baseType=(XSDSimpleTypeDefinition)baseTypeDefinition;
					simpleTypeDefinitionIn.setBaseTypeDefinition(baseType);
					setXsdBaseType(baseType);
					simpleTypeDefinitionIn.getValidFacets().addAll(baseType.getValidFacets());
					// primitiveTypeDefinition?
					if(isPrimitive((DataType)baseClassifier)){
						simpleTypeDefinitionIn.setPrimitiveTypeDefinition(baseType);
					}else{
						simpleTypeDefinitionIn.setPrimitiveTypeDefinition(baseType.getPrimitiveTypeDefinition());
					}
				}else{
					// this is an error: baseType is complex or undefined
					System.out.println("SimpleType ERROR baseType invalid "+baseClassifier.getQualifiedName()+" from "+getDataType().getQualifiedName()+"; baseType="+baseTypeDefinition);
				}
			}else{
				if(baseTypeDefinition==null){
					// this is an error: no baseType
					System.out.println("SimpleType did not find XSD Type for "+baseClassifier.getQualifiedName()+" from "+getDataType().getQualifiedName());
				}else{
					complexTypeDefinitionIn.setBaseTypeDefinition(baseTypeDefinition);
					setXsdBaseType(baseTypeDefinition);
					setContentType(simpleTypeDefinitionIn, complexTypeDefinitionIn, baseTypeDefinition);
					NDR7_04_SchemaConformant.consistencyCheck(baseTypeDefinition, "configureBaseType");
					
					
/*
					if(simpleTypeDefinition instanceof XSDSimpleTypeDefinition){
						simpleTypeDefinitionIn.setBaseTypeDefinition((XSDSimpleTypeDefinition)simpleTypeDefinition);
					}
*/
				}
			
			
			}
		}else{
			// for enumeration, use token
			if(getDataType() instanceof Enumeration){
				if(complexTypeDefinitionIn==null){
					XSDSimpleTypeDefinition token=getXsdToken(getXSDSchema());
					//System.out.println("SimpleType setting base of Enumeration to "+token+" from "+getDataType().getQualifiedName());
					simpleTypeDefinitionIn.setBaseTypeDefinition(token);
					setXsdBaseType(token);
					simpleTypeDefinitionIn.getValidFacets().addAll(token.getValidFacets());
					// primitiveTypeDefinition?
					simpleTypeDefinitionIn.setPrimitiveTypeDefinition(token);
					//setContentType(simpleTypeDefinitionIn, complexTypeDefinitionIn, token);
				}else{
					// we should get token proxy here
					XSDComplexTypeDefinition token=getProxyToken(getProxySchema());
					complexTypeDefinitionIn.setBaseTypeDefinition(token);
					setXsdBaseType(token);
					setContentType(simpleTypeDefinitionIn, complexTypeDefinitionIn, token);
				}
			}else{
				System.out.println("Type has no base "+getDataType().getQualifiedName());
				QvtCommonAction.log("Type has no base "+getDataType().getQualifiedName());
			}
			
		}
	}
	protected void setContentType(XSDSimpleTypeDefinition simpleTypeDefinitionIn,XSDComplexTypeDefinition complexTypeDefinitionIn,XSDTypeDefinition baseTypeDefinition){
//		XSDComplexTypeContent typeContent=complexTypeDefinitionIn.getContentType();
		if(baseTypeDefinition instanceof XSDSimpleTypeDefinition){
			// contentType must be baseType
			complexTypeDefinitionIn.setContentType((XSDSimpleTypeDefinition)baseTypeDefinition);
			// this is illegal complexTypeDefinitionIn.setContentType(simpleTypeDefinitionIn);
			simpleTypeDefinitionIn.setBaseTypeDefinition((XSDSimpleTypeDefinition)baseTypeDefinition);
		}else if(baseTypeDefinition!=null){
			complexTypeDefinitionIn.setContentType(((XSDComplexTypeDefinition)baseTypeDefinition).getContentType());
			// why is wrong with following?
			//complexTypeDefinitionIn.setContentType(simpleTypeDefinitionIn);
//			typeContent=((XSDComplexTypeDefinition)baseTypeDefinition).getContentType();
			simpleTypeDefinitionIn.setBaseTypeDefinition((XSDSimpleTypeDefinition)((XSDComplexTypeDefinition)baseTypeDefinition).getContentType());
		}
		XSDComplexTypeContent typeContent=complexTypeDefinitionIn.getContentType();
		if((typeContent instanceof XSDSimpleTypeDefinition)&&simpleTypeDefinitionIn.getValidFacets().isEmpty()){
			XSDSimpleTypeDefinition simpleContent=(XSDSimpleTypeDefinition)typeContent;
			simpleTypeDefinitionIn.getValidFacets().addAll(simpleContent.getValidFacets());
			// primitiveTypeDefinition?
//				if(isPrimitive((DataType)classifier)){
//				simpleTypeDefinitionIn.setPrimitiveTypeDefinition(simpleContent);
//			}else{
				simpleTypeDefinitionIn.setPrimitiveTypeDefinition(simpleContent.getPrimitiveTypeDefinition());
//			}
		}
	}
	protected void configureRestriction(XSDSimpleTypeDefinition simpleTypeDefinitionIn,XSDComplexTypeDefinition complexTypeDefinitionIn){
		//for restriction set its base type, add facets
		configureBaseType(simpleTypeDefinitionIn,complexTypeDefinitionIn);
		if(complexTypeDefinitionIn!=null){
			Classifier classifier=NIEMHelper.getBaseClassifier(getDataType());
			if((classifier!=null)||(getDataType() instanceof Enumeration)){
				complexTypeDefinitionIn.setDerivationMethod(XSDDerivationMethod.RESTRICTION_LITERAL);
			}
		}

		simpleTypeDefinitionIn.getFacetContents().clear();
		simpleTypeDefinitionIn.getFacetContents().addAll(getFacets(simpleTypeDefinitionIn));
		//getFacets(simpleTypeDefinitionIn);
	}
	protected void configureExtension(XSDSimpleTypeDefinition simpleTypeDefinitionIn,XSDComplexTypeDefinition complexTypeDefinitionIn){
		//for extension set its base type
		configureBaseType(simpleTypeDefinitionIn,complexTypeDefinitionIn);
		Classifier classifier=NIEMHelper.getBaseClassifier(getDataType());
		if(classifier!=null){
			complexTypeDefinitionIn.setDerivationMethod(XSDDerivationMethod.EXTENSION_LITERAL);
		}
		configureComplexAttributeContent( complexTypeDefinitionIn);		
	}
	protected Collection<XSDConstrainingFacet> getFacets(XSDSimpleTypeDefinition simpleTypeDefinitionIn){
		Collection<XSDConstrainingFacet> result=new Vector<XSDConstrainingFacet>();
		XSDSimpleTypeDefinition primitiveType=simpleTypeDefinitionIn.getPrimitiveTypeDefinition();
		if(primitiveType!=null){
		    //XSDBoundedFacet, XSDCardinalityFacet, XSDNumericFacet, XSDOrderedFacet
			XSDBoundedFacet boundedFacet=primitiveType.getBoundedFacet();
			simpleTypeDefinitionIn.getBoundedFacet().setLexicalValue(boundedFacet.getLexicalValue());
			simpleTypeDefinitionIn.getBoundedFacet().setValue(boundedFacet.isValue());
			XSDCardinalityFacet cardinalityFacet=primitiveType.getCardinalityFacet();
			simpleTypeDefinitionIn.getCardinalityFacet().setLexicalValue(cardinalityFacet.getLexicalValue());
			simpleTypeDefinitionIn.getCardinalityFacet().setValue(cardinalityFacet.getValue());
			XSDNumericFacet numericFacet=primitiveType.getNumericFacet();
			simpleTypeDefinitionIn.getNumericFacet().setLexicalValue(numericFacet.getLexicalValue());
			simpleTypeDefinitionIn.getNumericFacet().setValue(numericFacet.isValue());
			XSDOrderedFacet orderedFacet=primitiveType.getOrderedFacet();
			simpleTypeDefinitionIn.getOrderedFacet().setLexicalValue(orderedFacet.getLexicalValue());
			simpleTypeDefinitionIn.getOrderedFacet().setValue(orderedFacet.getValue());
		}

		// from enumerations, ValueRestriction, RepresentationRestriction 
		Classifier classifier=getDataType();
		if(!(classifier instanceof DataType))return result;
		DataType dataType=(DataType)classifier;
		if(dataType instanceof Enumeration){
			//System.out.println("SimpleType Enumeration "+dataType.getQualifiedName()+", "+((Enumeration)dataType).getOwnedLiteral());
			for(EnumerationLiteral enumerationLiteral:((Enumeration)dataType).getOwnedLiteral()){
				String lexicalValue=NameHelper.getNIEMName(enumerationLiteral);
				if(lexicalValue!=null){
					XSDEnumerationFacet enumerationFacet=XSDFactory.eINSTANCE.createXSDEnumerationFacet();
					enumerationFacet.getValue().add(lexicalValue);
					enumerationFacet.setLexicalValue(lexicalValue);
					
//					simpleTypeDefinitionIn.getFacetContents().add(enumerationFacet);
//					enumerationFacet.updateElement();
//					enumerationFacet.getValue().add(lexicalValue);
//					enumerationFacet.setLexicalValue(lexicalValue);
					result.add(enumerationFacet);
					/*
					if(!lexicalValue.equals(enumerationFacet.getValue())){
						System.out.println("getFacets conflict "+dataType.getQualifiedName()+", "+lexicalValue+", "+enumerationFacet.getValue());
					}
					*/
				}
			}
		}
		if(NIEMHelper.isXSDRepresentationRestriction(dataType)){
			EnumerationLiteral whiteSpace=NIEMHelper.getXSDRepresentationRestrictionWhiteSpace(dataType);
			if(whiteSpace!=null){
				String whiteSpaceValue=whiteSpace.getName();
				XSDWhiteSpaceFacet whiteSpaceFacet=XSDFactory.eINSTANCE.createXSDWhiteSpaceFacet();
				whiteSpaceFacet.setLexicalValue(whiteSpaceValue);
				whiteSpaceFacet.setValue("replace".equals(whiteSpaceValue)?XSDWhiteSpace.REPLACE_LITERAL
						:"collapse".equals(whiteSpaceValue)?XSDWhiteSpace.COLLAPSE_LITERAL
								:XSDWhiteSpace.PRESERVE_LITERAL
								);
//				whiteSpaceFacet.updateElement();
				result.add(whiteSpaceFacet);
			}
		}
		if(NIEMHelper.isValueRestriction(dataType)){
			Integer intTagValue=NIEMHelper.getValueRestrictionFractionDigits(dataType);
			if(intTagValue!=null){
				XSDFractionDigitsFacet facet=XSDFactory.eINSTANCE.createXSDFractionDigitsFacet();
				facet.setLexicalValue(intTagValue.toString());
				facet.setValue(intTagValue);
//				facet.updateElement();
				result.add(facet);
			}
			intTagValue=NIEMHelper.getValueRestrictionLength(dataType);
			if(intTagValue!=null){
				XSDLengthFacet facet=XSDFactory.eINSTANCE.createXSDLengthFacet();
				facet.setLexicalValue(intTagValue.toString());
				facet.setValue(intTagValue);
//				facet.updateElement();
				result.add(facet);
			}
			intTagValue=NIEMHelper.getValueRestrictionMaxLength(dataType);
			if(intTagValue!=null){
				XSDMaxLengthFacet facet=XSDFactory.eINSTANCE.createXSDMaxLengthFacet();
				facet.setLexicalValue(intTagValue.toString());
				facet.setValue(intTagValue);
//				facet.updateElement();
				result.add(facet);
			}
			intTagValue=NIEMHelper.getValueRestrictionMinLength(dataType);
			if(intTagValue!=null){
				XSDMinLengthFacet facet=XSDFactory.eINSTANCE.createXSDMinLengthFacet();
				facet.setLexicalValue(intTagValue.toString());
				facet.setValue(intTagValue);
//				facet.updateElement();
				result.add(facet);
			}
			intTagValue=NIEMHelper.getValueRestrictionTotalDigits(dataType);
			if(intTagValue!=null){
				XSDTotalDigitsFacet facet=XSDFactory.eINSTANCE.createXSDTotalDigitsFacet();
				facet.setLexicalValue(intTagValue.toString());
				facet.setValue(intTagValue);
//				facet.updateElement();
				result.add(facet);
			}
			String tagValue=NIEMHelper.getValueRestrictionMaxExclusive(dataType);
			if(tagValue!=null){
				XSDMaxExclusiveFacet facet=XSDFactory.eINSTANCE.createXSDMaxExclusiveFacet();
				result.add(facet);
				
		          Object newValue = simpleTypeDefinitionIn.getValue(tagValue);
		          //System.out.println("MaxExclusive "+newValue+", "+((newValue!=null)?newValue.getClass().getName():"null")+", ordered "+simpleTypeDefinitionIn.getOrderedFacet());
				
				facet.setLexicalValue(tagValue.toString());
//				facet.setValue(newValue);
//				facet.updateElement();
				facet.setValue(newValue);
			}
			 tagValue=NIEMHelper.getValueRestrictionMinExclusive(dataType);
			if(tagValue!=null){
				XSDMinExclusiveFacet facet=XSDFactory.eINSTANCE.createXSDMinExclusiveFacet();
				result.add(facet);
		          Object newValue = simpleTypeDefinitionIn.getValue(tagValue);
//		          System.out.println("MinExclusive "+newValue+", "+((newValue!=null)?newValue.getClass().getName():"null"));
				facet.setLexicalValue(tagValue.toString());
//				facet.updateElement();
//				result.add(facet);
				facet.setValue(newValue);
			}
			 tagValue=NIEMHelper.getValueRestrictionMaxInclusive(dataType);
			if(tagValue!=null){
				XSDMaxInclusiveFacet facet=XSDFactory.eINSTANCE.createXSDMaxInclusiveFacet();
				result.add(facet);
		          Object newValue = simpleTypeDefinitionIn.getValue(tagValue);
//		          System.out.println("MaxInclusive "+newValue+", "+((newValue!=null)?newValue.getClass().getName():"null"));
				facet.setLexicalValue(tagValue.toString());
//				facet.updateElement();
//				result.add(facet);
				facet.setValue(newValue);
			}
			 tagValue=NIEMHelper.getValueRestrictionMinInclusive(dataType);
			if(tagValue!=null){
				XSDMinInclusiveFacet facet=XSDFactory.eINSTANCE.createXSDMinInclusiveFacet();
				result.add(facet);
		          Object newValue = simpleTypeDefinitionIn.getValue(tagValue);
//		          System.out.println("MinInclusive "+newValue+", "+((newValue!=null)?newValue.getClass().getName():"null"));
				facet.setLexicalValue(tagValue.toString());
//				facet.updateElement();
//				result.add(facet);
				facet.setValue(newValue);
			}
			List values=NIEMHelper.getValueRestrictionPattern(dataType);
			if(values!=null){
				for(Object value:values){
					//System.out.println("Pattern "+value);
					if(value instanceof String){
						XSDPatternFacet facet=XSDFactory.eINSTANCE.createXSDPatternFacet();
						facet.getValue().add((String)value);
						facet.setLexicalValue((String)value);
//						facet.updateElement();
						result.add(facet);
						
					}
				}
			}
		}
		return result;
	}
	protected void configureComplexContent(XSDComplexTypeDefinition complexTypeDefinitionIn){
		XSDParticle particle=(XSDParticle)complexTypeDefinitionIn.getContent();
		XSDModelGroup sequence=(XSDModelGroup)particle.getContent();
		configureModelGroupContent(sequence,(Class)getDataType());
		configureComplexAttributeContent( complexTypeDefinitionIn);
		/*
		for(Property property:NIEMHelper.getOrderedProperties(dataType)){
		    if (NIEMHelper.isSequenceID(property)){
				configureSequenceID(property,complexTypeDefinitionIn);
		    }
		    else if (NIEMHelper.isXSDAttributeKind(property)){
		    	if(NIEMHelper.isXSDAny(property)){
		    		configureAnyAttribute(property,complexTypeDefinitionIn);
		    	}else{
		    		configureRefAttribute(property,complexTypeDefinitionIn);
		    	}
			}
		}
		// set synthetic wildcard if necessary
		if((complexTypeDefinitionIn.getAttributeWildcard()==null)
				&&(complexTypeDefinitionIn.getSyntheticWildcard()==null)
				&&(complexTypeDefinitionIn.getBaseTypeDefinition()!=null)
				&&(complexTypeDefinitionIn.getBaseTypeDefinition() instanceof XSDComplexTypeDefinition)
				){
			// clone wildcard from base
			XSDComplexTypeDefinition baseTypeDefinition=(XSDComplexTypeDefinition)complexTypeDefinitionIn.getBaseTypeDefinition();
			XSDWildcard wildcard=baseTypeDefinition.getAttributeWildcard();
			if(wildcard==null)wildcard=baseTypeDefinition.getSyntheticWildcard();
			if(wildcard!=null){
				complexTypeDefinitionIn.setSyntheticWildcard((XSDWildcard)wildcard.cloneConcreteComponent(true, true));
			}
		}
		*/
	}
	protected void configureComplexAttributeContent(XSDComplexTypeDefinition complexTypeDefinitionIn){
		
		for(Property property:NIEMHelper.getOrderedProperties(dataType)){
		    if (NIEMHelper.isSequenceID(property)){
				configureSequenceID(property,complexTypeDefinitionIn);
		    }
		    else if (NIEMHelper.isXSDAttributeKind(property)){
		    	if(NIEMHelper.isXSDAny(property)){
		    		configureAnyAttribute(property,complexTypeDefinitionIn);
		    	}else{
		    		configureRefAttribute(property,complexTypeDefinitionIn);
		    	}
			}
		}
		// set synthetic wildcard if necessary
		if((complexTypeDefinitionIn.getAttributeWildcard()==null)
				&&(complexTypeDefinitionIn.getSyntheticWildcard()==null)
				&&(complexTypeDefinitionIn.getBaseTypeDefinition()!=null)
				&&(complexTypeDefinitionIn.getBaseTypeDefinition() instanceof XSDComplexTypeDefinition)
				){
			// clone wildcard from base
			XSDComplexTypeDefinition baseTypeDefinition=(XSDComplexTypeDefinition)complexTypeDefinitionIn.getBaseTypeDefinition();
			XSDWildcard wildcard=baseTypeDefinition.getAttributeWildcard();
			if(wildcard==null)wildcard=baseTypeDefinition.getSyntheticWildcard();
			if(wildcard!=null){
				complexTypeDefinitionIn.setSyntheticWildcard((XSDWildcard)wildcard.cloneConcreteComponent(true, true));
				complexTypeDefinitionIn.setAttributeWildcard((XSDWildcard)wildcard.cloneConcreteComponent(true, true));
			}
		}
		
	}
	protected void configureSyntheticParticle(XSDComplexTypeDefinition complexTypeDefinitionIn){
		// complexTypeDefinitionIn must be an extension, must have a base, the base (recursively) must be non-empty
		if(!XSDDerivationMethod.EXTENSION_LITERAL.equals(complexTypeDefinitionIn.getDerivationMethod()))return;
		XSDTypeDefinition baseType=complexTypeDefinitionIn.getBaseTypeDefinition();
		if((baseType==null)||!(baseType instanceof XSDComplexTypeDefinition))return;
		XSDComplexTypeDefinition base=(XSDComplexTypeDefinition)baseType;
		XSDParticle syntheticParticle=null;
		XSDParticle syntheticParticleBasis=null;
		if(base.getSyntheticParticle()!=null){
			// use the synthetic particle as a basis
			syntheticParticleBasis=(XSDParticle)base.getSyntheticParticle();
		}else if(base.getContent() instanceof XSDParticle){
			// use the base particle as a basis
			syntheticParticleBasis=(XSDParticle)base.getContent();
		}else{
			return; // no synthetic particle required
		}
		syntheticParticle=(XSDParticle)syntheticParticleBasis.cloneConcreteComponent(true, true);
		complexTypeDefinitionIn.setSyntheticParticle(syntheticParticle);
		// add the current elements to those accumulated in synthetic particle
		syntheticParticle.setMaxOccurs(1);
		syntheticParticle.setMinOccurs(1);
		XSDModelGroup sequence=(XSDModelGroup)syntheticParticle.getContent();
		XSDModelGroup sequenceBasis=(XSDModelGroup)syntheticParticleBasis.getContent();
		
		sequence.setCompositor(XSDCompositor.SEQUENCE_LITERAL);
		// make sure content propagated to particles
		for(XSDParticle modelGroupParticle:sequence.getContents()){
			XSDTerm term=modelGroupParticle.getTerm();
			// it seems the deepclone does not get the typeDefinition, so make correction here if possible
			if(term instanceof XSDElementDeclaration){
				XSDElementDeclaration element=(XSDElementDeclaration)term;
				if((element.getTypeDefinition()==null)&&(element.getName()!=null)&&(element.getTargetNamespace()!=null)){
					// check if there is a type defined in sequenceBasis
					for(XSDParticle modelGroupParticleBasis:sequenceBasis.getContents()){
						XSDTerm termBasis=modelGroupParticleBasis.getTerm();
						if(termBasis instanceof XSDElementDeclaration){
							XSDElementDeclaration elementBasis=(XSDElementDeclaration)termBasis;
							if((element.getName().equals(elementBasis.getName()))&&(element.getTargetNamespace().equals(elementBasis.getTargetNamespace()))){
								element.setTypeDefinition(elementBasis.getTypeDefinition());
//								System.out.println("configureSyntheticParticle  set type of "+element.getName()+" : "+element.getTargetNamespace()+" to "+elementBasis.getTypeDefinition());
								break;
							}
						}
					}
				}
			}
			if(!sequence.getParticles().contains(modelGroupParticle)){
				sequence.getParticles().add(modelGroupParticle);
			}
		}
		
		configureModelGroupContent(sequence,(Class)getDataType());
		
		// should we also set particles? but definition is purely containment?
		// this does not help in any case

		/*
		XSDComplexTypeContent content=complexTypeDefinitionIn.getContent();
		if(content instanceof XSDParticle){
			XSDParticle particle=(XSDParticle)content;
			XSDParticleContent particleContent=particle.getContent();
			if(particleContent instanceof XSDModelGroup){
				XSDModelGroup modelGroup=(XSDModelGroup)particleContent;
				modelGroup.getParticles().clear();
				modelGroup.getParticles().addAll(sequence.getParticles());
				System.out.println("configureSyntheticParticle  for "+complexTypeDefinitionIn.getName()+" : "+complexTypeDefinitionIn.getTargetNamespace()+", "+sequence.getParticles().size());
				for(XSDParticle particleTest:modelGroup.getParticles()){
					XSDTerm term=particleTest.getTerm();
					if(term instanceof XSDElementDeclaration){
						XSDElementDeclaration element=(XSDElementDeclaration)term;
						System.out.println("configureSyntheticParticle  element "+element.getName()+" : "+element.getTargetNamespace()+", "+element.getTypeDefinition());
					}
				}
			}
		}
				*/

	}
	protected void configureSequenceID(Property property,XSDComplexTypeDefinition complexTypeDefinitionIn){
		// 
		XSDAttributeUse attributeUse=XSDFactory.eINSTANCE.createXSDAttributeUse();
		XSDAttributeUseCategory category=XSDAttributeUseCategory.PROHIBITED_LITERAL;
		if(property.getUpper()!=0){
			if(property.getLower()==0)category=XSDAttributeUseCategory.OPTIONAL_LITERAL;
			else category=XSDAttributeUseCategory.REQUIRED_LITERAL;
		}
		attributeUse.setUse(category);
//		XSDAttributeDeclaration resolvedAttribute=resolveSequenceID(property);
//		attributeUse.setAttributeDeclaration(resolvedAttribute);
		
		
		/*
		String fixed=NIEMHelper.getXSDPropertyFixed(property);
		if(fixed!=null){
			attributeUse.setConstraint(XSDConstraint.FIXED_LITERAL);
			attributeUse.setLexicalValue(fixed);
		}
		*/
		//attributeUse.setRequired((property.getUpper()!=0)&&(property.getLower()!=0));
		//complexTypeDefinitionIn.getAttributeContents().add(attributeUse);
		
		createXSDAttributeDeclaration( attributeUse, property, complexTypeDefinitionIn);
/*
		XSDAttributeDeclaration attributeContent=XSDFactory.eINSTANCE.createXSDAttributeDeclaration();
		attributeContent.setForm(XSDForm.QUALIFIED_LITERAL);
		attributeContent.setTargetNamespace(complexTypeDefinitionIn.getTargetNamespace());
		if(resolvedAttribute!=null){
			attributeUse.setAttributeDeclaration(resolvedAttribute);
			attributeContent.setResolvedAttributeDeclaration(resolvedAttribute);
		}
		attributeUse.setContent(attributeContent);
		*/
	}
	 protected XSDAttributeDeclaration resolveSequenceID(Property property){
		XSDAttributeDeclaration result=createOrFindSequenceID(property);
		return result;
	}
	static protected XSDAttributeDeclaration createOrFindSequenceID(Property property){
			Package informationModel=NIEMHelper.getNearestInformationModel(property);
			if(informationModel==null)return null;
			XSDSchema schema=createOrFindSchema(informationModel);
			if(schema==null)return null;
			XSDAttributeDeclaration result=findSequenceID(property,schema);
			if(result!=null)return result;
			// create and populate an ElementDeclaration
			XSDAttributeDeclaration attribute=XSDFactory.eINSTANCE.createXSDAttributeDeclaration();
			String name="sequenceID";
			attribute.setName(name);

			XSDSimpleTypeDefinition typeDefinition=getIntegerPrimitiveType(schema);
			if(typeDefinition!=null){
					attribute.setTypeDefinition(typeDefinition);
			}
			schema. getContents().add(attribute);
			return attribute;
	}
	 static protected XSDSimpleTypeDefinition getIntegerPrimitiveType(XSDSchema schema){
		 // find
		 for(XSDTypeDefinition type:schema.getSchemaForSchema().getTypeDefinitions()){
			 if((type instanceof XSDSimpleTypeDefinition)&&("integer".equals(type.getName()))){
				 return (XSDSimpleTypeDefinition)type;
			 }
		 }
		 return null;
	 }
	 static protected XSDTypeDefinition getAnyType(XSDSchema schema){
		 // find
		 for(XSDTypeDefinition type:schema.getSchemaForSchema().getTypeDefinitions()){
			 if("anyType".equals(type.getName())){
				 return type;
			 }
		 }
		 return null;
	 }
	static	protected XSDAttributeDeclaration findSequenceID(Property property,XSDSchema schemaContext){
			String name="sequenceID";
			for(XSDAttributeDeclaration elementDeclaration:schemaContext.getAttributeDeclarations()){
				if(name.equals(elementDeclaration.getName()))return elementDeclaration;
			}
			return null;
		}
	protected void configureRefAttribute(Property property,XSDComplexTypeDefinition complexTypeDefinitionIn){
		// 
		XSDAttributeUse attributeUse=XSDFactory.eINSTANCE.createXSDAttributeUse();
		XSDAttributeUseCategory category=XSDAttributeUseCategory.PROHIBITED_LITERAL;
		if(property.getUpper()!=0){
			if(property.getLower()==0)category=XSDAttributeUseCategory.OPTIONAL_LITERAL;
			else category=XSDAttributeUseCategory.REQUIRED_LITERAL;
		}
		attributeUse.setUse(category);
		createXSDAttributeDeclaration( attributeUse, property, complexTypeDefinitionIn);
		/*
		XSDAttributeDeclaration attributeContent=XSDFactory.eINSTANCE.createXSDAttributeDeclaration();
		XSDAttributeDeclaration resolvedAttribute=resolveAttribute(property);
		if(resolvedAttribute!=null){
			attributeUse.setAttributeDeclaration(resolvedAttribute);
			attributeContent.setResolvedAttributeDeclaration(resolvedAttribute);
		}
		attributeUse.setContent(attributeContent);
		String fixed=NIEMHelper.getXSDPropertyFixed(property);
		if(fixed!=null){
			attributeUse.setConstraint(XSDConstraint.FIXED_LITERAL);
			attributeUse.setLexicalValue(fixed);
		}
		attributeUse.setRequired((property.getUpper()!=0)&&(property.getLower()!=0));
		complexTypeDefinitionIn.getAttributeContents().add(attributeUse);
		*/
	}
	protected void createXSDAttributeDeclaration(XSDAttributeUse attributeUse,Property property,XSDComplexTypeDefinition complexTypeDefinitionIn){
		XSDAttributeDeclaration attributeContent=XSDFactory.eINSTANCE.createXSDAttributeDeclaration();
		//attributeContent.setForm(XSDForm.QUALIFIED_LITERAL);
		//attributeContent.setTargetNamespace(complexTypeDefinitionIn.getTargetNamespace());
		XSDAttributeDeclaration resolvedAttribute=resolveAttribute(property);
		if(resolvedAttribute!=null){
			attributeUse.setAttributeDeclaration(resolvedAttribute);
			attributeContent.setResolvedAttributeDeclaration(resolvedAttribute);
		}
		attributeUse.setContent(attributeContent);
		String fixed=NIEMHelper.getXSDPropertyFixed(property);
		if(fixed!=null){
			attributeUse.setConstraint(XSDConstraint.FIXED_LITERAL);
			attributeUse.setLexicalValue(fixed);
		}
		attributeUse.setRequired((property.getUpper()!=0)&&(property.getLower()!=0));
		complexTypeDefinitionIn.getAttributeContents().add(attributeUse);
		
	}
	protected void configureAnyAttribute(Property property,XSDComplexTypeDefinition complexTypeDefinitionIn){
		// 
		XSDWildcard wildcard=XSDFactory.eINSTANCE.createXSDWildcard();
		String valueNamespace=NIEMHelper.getXSDAnyPropertyValueNamespace(property);
		EnumerationLiteral processContents=NIEMHelper.getXSDAnyPropertyProcessContents(property);		
		XSDProcessContents xsdProcessContents=XSDProcessContents.STRICT_LITERAL;
		if(processContents!=null){
			String processContent=processContents.getName();
			if("lax".equals(processContent))xsdProcessContents=XSDProcessContents.LAX_LITERAL;
			else if("skip".equals(processContent))xsdProcessContents=XSDProcessContents.SKIP_LITERAL;
		}
		wildcard.setProcessContents(xsdProcessContents);
		if(valueNamespace!=null){
			wildcard.setNamespaceConstraintCategory(XSDNamespaceConstraintCategory.SET_LITERAL);
			wildcard.setStringLexicalNamespaceConstraint(valueNamespace);
		}else{
			wildcard.setNamespaceConstraintCategory(XSDNamespaceConstraintCategory.ANY_LITERAL);
			
		}
		complexTypeDefinitionIn.setAttributeWildcard(wildcard);
	}
	
	 protected XSDAttributeDeclaration resolveAttribute(Property property){
		Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
		if(propertyHolderProperty==null)propertyHolderProperty=property;
		XSDAttributeDeclaration result=createOrFindXSDAttributeDeclaration(propertyHolderProperty);
		return result;
	}
	 static protected String getNIEMAttributeName(Property property){
		 String name=NameHelper.getNIEMName(property);
		 if("type".equals(name))name="typex";
		 return name;
	 }
	 static protected XSDAttributeDeclaration createOrFindXSDAttributeDeclaration(Property property){
			Package informationModel=NIEMHelper.getNearestInformationModel(property);
			if(informationModel==null)return null;
			XSDSchema schema=createOrFindSchema(informationModel);
			if(schema==null)return null;
			XSDAttributeDeclaration result=findAttributeDeclaration(property,schema);
			if(result!=null){
				// setting targetNamespace results in not having xsi namespace, 
				// but now references are unresolved , probably due to notifications breaking the reference
				//result.setTargetNamespace(schema.getTargetNamespace());
				String schemaTargetNamespace=schema.getTargetNamespace();
				if(!schemaTargetNamespace.equals(result.getTargetNamespace())){
					QvtCommonAction.log("Attribute TargetNamespace for property "+property.getQualifiedName()+" changed to "+result.getTargetNamespace()+", should be "+schemaTargetNamespace);
					// can not correct, this will result in dangling references
					//result.setTargetNamespace(schemaTargetNamespace);
				}
				return result;
			}
			// create and populate an AttributeDeclaration

			XSDAttributeDeclaration attribute=XSDFactory.eINSTANCE.createXSDAttributeDeclaration();
			String name=getNIEMAttributeName(property);
			attribute.setName(name);
			String fixed=NIEMHelper.getXSDPropertyFixed(property);
			if(fixed!=null){
				attribute.setConstraint(XSDConstraint.FIXED_LITERAL);
				attribute.setLexicalValue(fixed);
			}
			// attach now before types, which may result in double attribute
			schema.getContents().add(attribute);
			/*
			String schemaTargetNamespace=schema.getTargetNamespace();
			if(!schemaTargetNamespace.equals(attribute.getTargetNamespace())){
				QvtCommonAction.log("Attribute TargetNamespace changed to "+attribute.getTargetNamespace()+", attempted to restore to "+schemaTargetNamespace);
				attribute.setTargetNamespace(schemaTargetNamespace);
			}
		*/
			
			Type type=property.getType();
			if(type instanceof Classifier){
				//if(type.getOwner() instanceof Package){
				
					XSDTypeDefinition typeDefinition=createOrFindXSDTypeDefinition((Classifier)type,schema);
					//System.out.println("createOrFindXSDAttributeDeclaration "+property.getQualifiedName()+" = "+typeDefinition);
					if(typeDefinition instanceof XSDSimpleTypeDefinition){
						if(isAnonymous((Classifier)type)){
						 	attribute.setAnonymousTypeDefinition((XSDSimpleTypeDefinition) typeDefinition) ;
						}else{
							attribute.setTypeDefinition((XSDSimpleTypeDefinition)typeDefinition);
							
						}
//						if(!(typeDefinition.getContainer() instanceof XSDSchema)
					}
					/*
				}else{
					// anonymous type: create the type, populate it, add it as anonymous to attribute
					XSDTypeDefinition typeDefinition=createXSDType((Classifier)type,(Classifier)type,schema);
					if(typeDefinition instanceof XSDSimpleTypeDefinition){
						XSDTypeDefinition saveBase=getXsdBaseType();
									((XSDSimpleTypeDefinition)simpleTypeDefinition).setBaseTypeDefinition((XSDSimpleTypeDefinition)saveBase);

					 	attribute.setAnonymousTypeDefinition((XSDSimpleTypeDefinition) typeDefinition) ;
						attribute.setTypeDefinition((XSDSimpleTypeDefinition)typeDefinition);
					}
				}
				*/
			}
//			schema.getContents().add(attribute);
			//attribute.setTargetNamespace(schema.getTargetNamespace());
			//System.out.println("createOrFindXSDAttributeDeclaration "+property.getQualifiedName()+" = "+attribute);
			/*
			String schemaTargetNamespace=schema.getTargetNamespace();
			if(!schemaTargetNamespace.equals(attribute.getTargetNamespace())){
				QvtCommonAction.log("Attribute TargetNamespace changed to "+attribute.getTargetNamespace()+", attempted to restore to "+schemaTargetNamespace);
				attribute.setTargetNamespace(schemaTargetNamespace);
			}
			*/
			return attribute;
	}
	static	protected XSDAttributeDeclaration findAttributeDeclaration(Property property,XSDSchema schemaContext){
			String name=getNIEMAttributeName(property);
			for(XSDAttributeDeclaration elementDeclaration:schemaContext.getAttributeDeclarations()){
				if(name.equals(elementDeclaration.getName()))return elementDeclaration;
			}
			return null;
		}
	
	protected void configureModelGroupContent(XSDModelGroup sequence,Class dataType){
		for(Property property:NIEMHelper.getOrderedProperties(dataType)){
			Type type=property.getType();
			if(NIEMHelper.isXSDAny(property)){
				if (!NIEMHelper.isXSDAttributeKind(property)){
					configureXsdAny(property,sequence);
				}
			}else if (NIEMHelper.isXSDAttribute(property)){
			}else if (NIEMHelper.isSequenceID(property)){
			}else if(NIEMHelper.isChoice(type)){
					configureChoice(property,sequence);
			}else if((type instanceof Classifier)&& NIEMHelper.isModelGroupDefinition((Classifier)type)){
				configureModelGroupDefinition(property,sequence);
			}else{
				configureRefElement(property,sequence);
			}
		}
		
	}
	static	protected XSDFeature createOrFindXSDTopLevelFeatureDefinition(Property property,XSDSchema schema){
		if (NIEMHelper.isSequenceID(property)){
			return createOrFindTopLevelSequenceID(property,schema);
		}else if (NIEMHelper.isXSDAttributeKind(property)){
			if(!NIEMHelper.isXSDAny(property)){
				return createOrFindTopLevelAttribute(property);
			}
		}else{	
					if(NIEMHelper.isXSDAny(property)){
					}else    
					if(NIEMHelper.isChoice(property.getType())){
					}else{
						return createOrFindTopLevelElement(property);
					}
			}
		return null;
		}
	static	protected XSDElementDeclaration createOrFindTopLevelElement(Property property){
		return createOrFindXSDElementDeclaration(property);
		}
	static	protected XSDAttributeDeclaration createOrFindTopLevelAttribute(Property property){
		return createOrFindXSDAttributeDeclaration(property);
	}
	
	static	protected XSDAttributeDeclaration createOrFindTopLevelSequenceID(Property property,XSDSchema schema){
		return createOrFindSequenceID(property);
	}

static	protected XSDConcreteComponent findTypeFeature(Property property,XSDComplexTypeDefinition typeDefinition){
	if (NIEMHelper.isSequenceID(property)){
		return findSequenceID(property,typeDefinition);
	}
	else if (NIEMHelper.isXSDAttributeKind(property)){
		return findRefAttribute(property,typeDefinition);
	}else{	
		XSDComplexTypeContent typeContent=typeDefinition.getContent();
		if(typeContent instanceof XSDParticle){
			XSDParticleContent particleContent=((XSDParticle)typeContent).getContent();
			if(particleContent instanceof XSDModelGroup){
				XSDModelGroup modelGroup=(XSDModelGroup)particleContent;
				return findModelGroupFeature(property,modelGroup);
			}
		}
		}
	return null;
	}
static	protected XSDConcreteComponent findModelGroupFeature(Property property,XSDModelGroup modelGroup){
	if(modelGroup==null)return null;
		if(NIEMHelper.isXSDAny(property)){
			return findXsdAny(property,modelGroup);
		}else    
		if(NIEMHelper.isChoice(property.getType())){
			return findChoice(property,modelGroup);
		}else{
			return findRefElement(property,modelGroup);
		}
	}

static	protected XSDConcreteComponent findChoice(Property property,XSDModelGroup modelGroup){
	for(XSDParticle particle:modelGroup.getContents()){
		XSDParticleContent particleContent=particle.getContent();
		if(particleContent instanceof XSDModelGroup){
			XSDModelGroup choiceGroup=(XSDModelGroup)particleContent;
			if(XSDCompositor.CHOICE_LITERAL.equals(choiceGroup.getCompositor())){
				return choiceGroup;
			}
		}
	}
	return null;
	}
static	protected XSDConcreteComponent findXsdAny(Property property,XSDModelGroup modelGroup){
	for(XSDParticle particle:modelGroup.getContents()){
		XSDParticleContent particleContent=particle.getContent();
		if(particleContent instanceof XSDWildcard){
			XSDWildcard wildcard=(XSDWildcard)particleContent;
			return wildcard;
		}
	}
	return null;
	}
static public XSDElementDeclaration getResolvedElementDeclaration(XSDElementDeclaration refElement){
	XSDElementDeclaration resolvedElement=refElement.getResolvedElementDeclaration();
	// can we do check and fix here?
	// we probably need fixes elsewhere too?
	// why can we not find / resolve via reference to getResolvedElementDeclaration(?)
	// what causes the loss anyway?
	XSDConcreteComponent refContainer=refElement.getContainer();
	if(
			(refContainer!=null)
			&&!(refContainer instanceof XSDSchema)
			&&(!refElement.isElementDeclarationReference()||(resolvedElement.getContainer()==null))){
		//System.out.println("SimpleType.findRefElement found non-reference element "+refElement+", "+resolvedElement);
		ProjectCache cache=ProjectCache.getProjectCache();
		if(cache!=null){
			XSDElementDeclaration testResolved=cache.getElementToResolvedElementMap().get(refElement);
			if(testResolved==null){
				// check if a match on name, namespace can be found in map;
				// failing that, find schema for namespace and scan that
				for(Entry<XSDElementDeclaration,XSDElementDeclaration> entry:cache.getElementToResolvedElementMap().entrySet()){
					XSDElementDeclaration test=entry.getValue();
					if(resolvedElement.getName().equals(test.getName())&&resolvedElement.getTargetNamespace().equals(test.getTargetNamespace())){
						testResolved=test;
						cache.getElementToResolvedElementMap().put(refElement,testResolved);
						break;
					}
				}
				if(testResolved==null){
					// scan schemas to find targetNamespace match, then element
					Map<Package,XSDSchema> modelToSchema=cache.getInformationModelToSchemaMap();
					for(Entry<Package,XSDSchema> entry:modelToSchema.entrySet()){
						XSDSchema testSchema=entry.getValue();
						if(resolvedElement.getTargetNamespace().equals(testSchema.getTargetNamespace())){
							for(XSDElementDeclaration testElement:testSchema.getElementDeclarations()){
								if(resolvedElement.getName().equals(testElement.getName())){
									testResolved=testElement;
									cache.getElementToResolvedElementMap().put(refElement,testResolved);
									break;
									
								}
							}
							if(testResolved!=null)break;
						}
					}

				}
			}
			if(testResolved!=null){
				resolvedElement=testResolved;
//				refElement.setResolvedElementDeclaration(resolvedElement);
				setResolvedElementDeclaration(refElement,resolvedElement);
				if(refContainer instanceof XSDParticle ){
					((XSDParticle)refContainer).setTerm(resolvedElement);
				}
				//System.out.println("SimpleType.findRefElement fixed non-reference element "+refElement+", "+resolvedElement+", "+resolvedElement.getContainer());
			}else{
				System.out.println("SimpleType.findRefElement FAILED to recover resolved element for "+refElement+", "+resolvedElement+", "+resolvedElement.getContainer());
			}
		}

		/*
		String namespace=refElement.getTargetNamespace();
		String name=refElement.getName();
		System.out.println("SimpleType.findRefElement Found non-reference element "+refElement+", "+namespace+", "+name);
		XSDSchema refSchema=findSchema(namespace);
		if(refSchema!=null){
		XSDElementDeclaration testResolvedElement=findElementDeclaration(name,refSchema);
		if(testResolvedElement!=null){
			refElement.setResolvedElementDeclaration(testResolvedElement);
			resolvedElement=testResolvedElement;
		}
		
		}
		*/
	}
	return resolvedElement;
}

static	protected XSDFeature findRefElement(Property property,XSDModelGroup modelGroup){
	String niemName=NameHelper.getNIEMName(property);
	for(XSDParticle particle:modelGroup.getContents()){
		XSDParticleContent particleContent=particle.getContent();
		if(particleContent instanceof XSDElementDeclaration){
			XSDElementDeclaration elementDeclaration=(XSDElementDeclaration)particleContent;
//			XSDElementDeclaration resolvedElement=elementDeclaration.getResolvedElementDeclaration();
			XSDElementDeclaration resolvedElement=getResolvedElementDeclaration(elementDeclaration);
			if((resolvedElement!=null)&&niemName.equals(resolvedElement.getName())){
				
				
				
				return elementDeclaration;
			}
		}
	}
	return null;
	}
static	protected XSDFeature findSequenceID(Property property,XSDComplexTypeDefinition typeDefinition){
	return findRefAttributeNamed("sequenceID",typeDefinition);
	}
static	protected XSDConcreteComponent findRefAttribute(Property property,XSDComplexTypeDefinition typeDefinition){
	if(NIEMHelper.isXSDAny(property))return typeDefinition.getAttributeWildcard();
	String niemName=NameHelper.getNIEMName(property);
	return findRefAttributeNamed(niemName,typeDefinition);
	}
static	protected XSDFeature findRefAttributeNamed(String niemName,XSDComplexTypeDefinition typeDefinition){
	for(XSDAttributeUse attributeUse:typeDefinition.getAttributeUses()){
		XSDAttributeDeclaration attributeDeclaration=attributeUse.getAttributeDeclaration();
		if(attributeDeclaration!=null){
			if(niemName.equals(attributeDeclaration.getName()))return attributeDeclaration;
		}
	}
	return null;
	}
	protected void configureChoice(Property property,XSDModelGroup sequence){
		// 
		XSDParticle particle=XSDFactory.eINSTANCE.createXSDParticle();
		particle.setMaxOccurs(property.getUpper());
		particle.setMinOccurs(property.getLower());
		XSDModelGroup modelGroup=XSDFactory.eINSTANCE.createXSDModelGroup();
		particle.setContent(modelGroup);
		particle.setTerm(modelGroup);
		modelGroup.setCompositor(XSDCompositor.CHOICE_LITERAL);
		configureModelGroupContent(modelGroup,(Class)property.getType());
		sequence.getContents().add(particle);
		sequence.getParticles().add(particle);// is this missing?
		
	}
	protected void configureXsdAny(Property property,XSDModelGroup sequence){
		// 
		XSDParticle particle=XSDFactory.eINSTANCE.createXSDParticle();
		particle.setMaxOccurs(property.getUpper());
		particle.setMinOccurs(property.getLower());
		XSDWildcard wildcard=XSDFactory.eINSTANCE.createXSDWildcard();
		particle.setContent(wildcard);
		particle.setTerm(wildcard);
		
/*
	   Namespace Constraint Category
Namespace Constraint
Process Contents
Lexical Namespace Constraint
*/
		String valueNamespace=NIEMHelper.getXSDAnyPropertyValueNamespace(property);
		EnumerationLiteral processContents=NIEMHelper.getXSDAnyPropertyProcessContents(property);		
		XSDProcessContents xsdProcessContents=XSDProcessContents.STRICT_LITERAL;
		if(processContents!=null){
			String processContent=processContents.getName();
			if("lax".equals(processContent))xsdProcessContents=XSDProcessContents.LAX_LITERAL;
			else if("skip".equals(processContent))xsdProcessContents=XSDProcessContents.SKIP_LITERAL;
		}
		wildcard.setProcessContents(xsdProcessContents);
		if(valueNamespace!=null){
			wildcard.setNamespaceConstraintCategory(XSDNamespaceConstraintCategory.SET_LITERAL);
			wildcard.setStringLexicalNamespaceConstraint(valueNamespace);
		}else{
			wildcard.setNamespaceConstraintCategory(XSDNamespaceConstraintCategory.ANY_LITERAL);
			
		}
		sequence.getContents().add(particle);
		//System.out.println("configureXsdAny "+wildcard);
	}
	
	static protected void setResolvedXSDModelGroupDefinition(XSDModelGroupDefinition element,XSDModelGroupDefinition resolvedElement){
		if((element==null)||(resolvedElement==null))return;
		element.setResolvedModelGroupDefinition(resolvedElement) ;
	}
	static protected void setResolvedElementDeclaration(XSDElementDeclaration element,XSDElementDeclaration resolvedElement){
		// we keep losing the resolved element, lets just cache the relationship
		element.setResolvedElementDeclaration(resolvedElement) ;
		ProjectCache cache=ProjectCache.getProjectCache();
		if(cache!=null){
			cache.getElementToResolvedElementMap().put(element, resolvedElement);
		}
	}
	protected void configureModelGroupDefinition(Property property,XSDModelGroup sequence){
		// 
		XSDParticle particle=XSDFactory.eINSTANCE.createXSDParticle();
		particle.setMaxOccurs(property.getUpper());
		particle.setMinOccurs(property.getLower());
		XSDModelGroupDefinition element=XSDFactory.eINSTANCE.createXSDModelGroupDefinition();
		particle.setContent(element);
		XSDModelGroupDefinition resolvedElement=resolveXSDModelGroupDefinition(property);
		setResolvedXSDModelGroupDefinition(element,resolvedElement) ;
		sequence.getContents().add(particle);
		sequence.getParticles().add(particle);
	}
	
	protected void configureRefElement(Property property,XSDModelGroup sequence){
		// 
		XSDParticle particle=XSDFactory.eINSTANCE.createXSDParticle();
		particle.setMaxOccurs(property.getUpper());
		particle.setMinOccurs(property.getLower());
		XSDElementDeclaration element=XSDFactory.eINSTANCE.createXSDElementDeclaration();
		particle.setContent(element);
		particle.setTerm(element);
		
/*
	    Resolved Element Declaration
*/
		XSDElementDeclaration resolvedElement=resolveElement(property);
//		element.setResolvedElementDeclaration(resolvedElement) ;
		setResolvedElementDeclaration(element,resolvedElement) ;
		if(resolvedElement!=null){
			particle.setTerm(resolvedElement);
		}
		sequence.getContents().add(particle);
		sequence.getParticles().add(particle);
		// does the following actually help at all?
		/*
		if(!resolvedElement.getSchema().equals(getXSDSchema())){
			System.out.println("Out of Schema resolved element "+element.isElementDeclarationReference()+", "+element+", "+resolvedElement+", "+element.getResolvedElementDeclaration());
			XSDSchema elementSchema=getXSDSchema();
			XSDSchema resolvedSchema=resolvedElement.getSchema();
			boolean foundSchema=false;
			for(XSDSchemaContent test:elementSchema.getContents()){
				if(test instanceof XSDImport){
					XSDImport xsdImport=(XSDImport)test;
					if(resolvedSchema.getTargetNamespace().equals(xsdImport.getNamespace())){
						foundSchema=true;
						break;
					}
				}
			}
			if(!foundSchema){
				XSDImport xsdImport=XSDFactory.eINSTANCE.createXSDImport();
				xsdImport.setNamespace(resolvedSchema.getTargetNamespace());
				xsdImport.setResolvedSchema(resolvedSchema);
				elementSchema.getContents().add(xsdImport);
			}
		}
		*/
	}
	
	 static protected XSDModelGroupDefinition resolveXSDModelGroupDefinition(Property property){
		Type type=property.getType();
		if((type==null)||!(type instanceof Class)||!NIEMHelper.isModelGroupDefinition((Class)type))return null;
		Package informationModel=NIEMHelper.getNearestInformationModel(type);
		if(informationModel==null)return null;
		XSDSchema schema=createOrFindSchema(informationModel);
		if(schema==null)return null;
		XSDModelGroupDefinition result=createOrFindXSDModelGroupDefinition((Class)type,schema);
		return result;
	}
	 static protected XSDElementDeclaration resolveElement(Property property){
		Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
		if(propertyHolderProperty==null)propertyHolderProperty=property;
		XSDElementDeclaration result=createOrFindXSDElementDeclaration(propertyHolderProperty);
		return result;
	}
	static protected XSDElementDeclaration createOrFindXSDElementDeclaration(Property property){
			Package informationModel=NIEMHelper.getNearestInformationModel(property);
			if(informationModel==null)return null;
			XSDSchema schema=createOrFindSchema(informationModel);
			if(schema==null)return null;
			XSDElementDeclaration result=findElementDeclaration(property,schema);
			if(result!=null)return result;
			// create and populate an ElementDeclaration
			XSDElementDeclaration element=XSDFactory.eINSTANCE.createXSDElementDeclaration();
			String name=NameHelper.getNIEMName(property);
			element.setName(name);
			boolean isAbstract=property.isDerivedUnion();
			element.setAbstract(isAbstract);
			String fixed=NIEMHelper.getXSDPropertyFixed(property);
			if(fixed!=null){
				element.setConstraint(XSDConstraint.FIXED_LITERAL);
				element.setLexicalValue(fixed);
			}
			Boolean isNillable=NIEMHelper.getXSDPropertyNillable(property);
			if(isNillable==null)isNillable=Boolean.FALSE;
			element.setNillable(isNillable);
			schema. getContents().add(element);
			Type type=property.getType();
			if(type instanceof Classifier){
				//System.out.println("createOrFindXSDElementDeclaration "+property.getQualifiedName()+"; type="+type.getQualifiedName());
				XSDTypeDefinition typeDefinition=createOrFindXSDTypeDefinition((Classifier)type,schema);
				if(typeDefinition!=null){
					if(isAnonymous((Classifier)type)){
						element.setAnonymousTypeDefinition(typeDefinition) ;
					}else{
						element.setTypeDefinition(typeDefinition);
						
					}

				}
			}
			if(element.getTypeDefinition()==null){
				XSDTypeDefinition anyType=getAnyType(schema);
				element.setTypeDefinition(anyType);
			}
			for(Property subsettedProperty:property.getSubsettedProperty()){
				XSDElementDeclaration substitutionGroup=resolveElement(subsettedProperty);
				if(substitutionGroup!=null){
					element.setSubstitutionGroupAffiliation(substitutionGroup);
				}
				break;
			}
//			schema. getContents().add(element);
			return element;
	}
	static	protected XSDElementDeclaration findElementDeclaration(Property property,XSDSchema schemaContext){
			String name=NameHelper.getNIEMName(property);
			return findElementDeclaration(name,schemaContext);
		}
	static	protected XSDElementDeclaration findElementDeclaration(String name,XSDSchema schemaContext){
		for(XSDElementDeclaration elementDeclaration:schemaContext.getElementDeclarations()){
			if(name.equals(elementDeclaration.getName()))return elementDeclaration;
		}
		return null;
	}

	protected void configureComplexRestriction(XSDComplexTypeDefinition complexTypeDefinitionIn){
		//for restriction set its base type, add facets
		configureComplexBaseType(complexTypeDefinitionIn);
		if(complexTypeDefinitionIn!=null){
			Classifier classifier=NIEMHelper.getBaseClassifier(getDataType());
			if(classifier!=null){
				complexTypeDefinitionIn.setDerivationMethod(XSDDerivationMethod.RESTRICTION_LITERAL);
			}
		}
		configureComplexContent(complexTypeDefinitionIn);

	}
	protected void configureComplexExtension(XSDComplexTypeDefinition complexTypeDefinitionIn){
		//for extension set its base type
		configureComplexBaseType(complexTypeDefinitionIn);
		Classifier classifier=NIEMHelper.getBaseClassifier(getDataType());
		if(classifier!=null){
			complexTypeDefinitionIn.setDerivationMethod(XSDDerivationMethod.EXTENSION_LITERAL);
		}
		configureComplexContent(complexTypeDefinitionIn);
		// we need to configure a synthetic particle if necessary
		configureSyntheticParticle(complexTypeDefinitionIn);
	}
	protected void configureComplexBaseType(XSDComplexTypeDefinition complexTypeDefinitionIn){
		//for restriction set its base type
		Classifier classifier=NIEMHelper.getBaseClassifier(getDataType());
		if(classifier!=null){
			XSDTypeDefinition simpleTypeDefinition=createOrFindXSDTypeDefinition(classifier,getXSDSchema());
			complexTypeDefinitionIn.setBaseTypeDefinition(simpleTypeDefinition);
		}else{
			/*
			XSDTypeDefinition anyType=getAnyType(getXSDSchema());
			complexTypeDefinitionIn.setBaseTypeDefinition(anyType);
			complexTypeDefinitionIn.setDerivationMethod(XSDDerivationMethod.EXTENSION_LITERAL);
			*/
		}
	}
	
}
