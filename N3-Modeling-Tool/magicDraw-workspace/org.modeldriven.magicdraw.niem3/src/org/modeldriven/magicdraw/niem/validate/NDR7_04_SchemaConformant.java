package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

import java.util.*;

import org.eclipse.xsd.XSDComplexTypeContent;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDDiagnostic;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.impl.XSDConcreteComponentImpl;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.instance.ExtendedDiagnosticAnalyzer;
import org.modeldriven.magicdraw.niem.instance.SimpleType;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR7_04_SchemaConformant extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addPropertyConfiguration(configMap);
        addClassifierAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	try{
    	return getNameInvalidMessage(namedElement)!=null;
    	}catch(Throwable t){
    		t.printStackTrace();
    		System.out.println("NDR5_03 Internal Error at "+namedElement.getQualifiedName()+" : "+t);
    	}
    	return false;
    }
    static protected boolean isAnonymousType(Classifier classifier){
    	// anonymous if not in package
    	if(classifier==null)return false;
    	if(classifier.getOwner()==null)return false;
    	return !(classifier.getOwner() instanceof Package);
    }
    static protected String getNameInvalidMessage(NamedElement namedElement){
	   	 if(!NIEMHelper.isInInformationModel(namedElement))return null;
	   	Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
	   	if(informationModel==null)return null;
   		XSDSchema schema=SimpleType.createOrFindSchema( informationModel);
   		if(schema==null)return null;
	 	// currently check at Classifier level of granularity
	   	 if(!(namedElement instanceof Classifier)) {
	   		 if(namedElement instanceof Property){
	   			 Property property=(Property)namedElement;
	   			 Classifier propertyClassifier=property.getClassifier();
	   			 if(propertyClassifier==null)return null;
	   			 if((propertyClassifier instanceof Association)&&!(propertyClassifier instanceof AssociationClass))return null;
	   			 if(isAnonymousType(propertyClassifier))return null;
					// check for an attribute whose type is complex
					if (NIEMHelper.isXSDAttribute(property)&&!NIEMHelper.isSequenceID(property)){
						Type type=property.getType();
						if(type==null){
							return "untyped attribute";
						}else if(type instanceof Classifier){
							XSDTypeDefinition typeDefinition=SimpleType.createOrFindXSDTypeDefinition((Classifier)type,schema);
							if(!(typeDefinition instanceof XSDSimpleTypeDefinition)){
								return "attribute typed by complex type definition";
							}
						}
						
					}
	   			XSDConcreteComponent feature=SimpleType.createOrFindXSDConcreteComponent( property,schema);
				if(feature!=null){
					try{
						schema.clearDiagnostics();
						feature.validate();
					}catch(Throwable e){
						e.printStackTrace();
						System.out.println("NDR5_03 validate "+feature+", "+property.getQualifiedName()+" error:"+e);
					}
					String message="";
					message=getDiagnosticMessages(message,feature,new HashSet<String>());
					if(message.length()>0){
						return message
//								+", namespace  "+((XSDNamedComponent)feature).getTargetNamespace()
								;
					}
				}
	   		 }
	   		 return null;
	   	 }
	   	Classifier classifier=(Classifier)namedElement;
		 if(isAnonymousType(classifier))return null;
	   	if(NIEMHelper.isPropertyHolder(classifier))return null;
	   	if((classifier instanceof Association)&&!(classifier instanceof AssociationClass))return null;
	   	// find the SimpleType and validate it
	   		Classifier dataType=classifier;
	   		XSDTypeDefinition typeDefinition=SimpleType.createOrFindXSDTypeDefinition( dataType,schema);
			if(typeDefinition!=null){
				try{
					consistencyCheck(typeDefinition,"clearDiagnostics");
					schema.clearDiagnostics();
					consistencyCheck(typeDefinition,"validate");
					typeDefinition.validate();
					consistencyCheck(typeDefinition,"end");
				}catch(Throwable e){
					e.printStackTrace();
					System.out.println("NDR5_03 validate "+typeDefinition+", "+dataType.getQualifiedName()+" error:"+e);
					QvtCommonAction.log("NDR5_03 validate "+typeDefinition+", "+dataType.getQualifiedName()+" error:"+e);
				}
				String message="";
				message=getDiagnosticMessages(message,typeDefinition,new HashSet<String>());
				if(message.length()>0){
					return message;
				}
				// check for simpleType inheriting complexType or none
				if((dataType instanceof DataType)&&NIEMHelper.isDataTypeSimpleType((DataType)dataType)){
					Classifier baseType=NIEMHelper.getBaseClassifier(dataType);
					if(NIEMHelper.isUnion(dataType)){
						// caught by schema validation?
					}else if(NIEMHelper.isList(dataType)){
						// caught by schema validation?
					}else{
						if((baseType instanceof DataType)&&!NIEMHelper.isDataTypeSimpleType((DataType)baseType)){
							return "SimpleType can not inherit from ComplexType";
						}else if(baseType==null){
							//return "SimpleType can not inherit from ComplexType");
							// rule 6-8
						}
					}
				}
				
			}
	   		
	   	//}
	   	 return null;
	 	}
    static public void consistencyCheck(XSDTypeDefinition typeDefinition,String message){
    	if(typeDefinition instanceof XSDComplexTypeDefinition){
    		XSDComplexTypeDefinition complexType=(XSDComplexTypeDefinition)typeDefinition;
    		XSDTypeDefinition baseType=complexType.getBaseTypeDefinition();
    		if(baseType==null){
    			System.out.println("consistencyCheck: "+message+", no baseType for "+typeDefinition);
    		}else if(baseType.getContainer()==null){
    			System.out.println("consistencyCheck: "+message+", no baseType container for "+typeDefinition+", "+baseType);
    			
    		}
    	}
    }
    static protected List<XSDDiagnostic> getExtendedDiagnostics(XSDConcreteComponent typeDefinition){
    	//fixupRestriction(typeDefinition);
		//listRestrictionInfo(typeDefinition);
    	List<XSDDiagnostic> extendedDiagnostics=new Vector<XSDDiagnostic>(typeDefinition.getDiagnostics());
    	for(XSDDiagnostic filtered:new Vector<XSDDiagnostic>(extendedDiagnostics)){
    		if("derivation-ok-restriction.5.3.3".equals(filtered.getKey())){
    			// we should also make this suppression dependent on whether there is a synthetic particle
    			if((typeDefinition instanceof XSDComplexTypeDefinition)
    					){
    				XSDComplexTypeDefinition complexTypeDefinition=(XSDComplexTypeDefinition)typeDefinition;
    		    	boolean isRestriction=ExtendedDiagnosticAnalyzer.isRestriction(complexTypeDefinition);
    		    	XSDTypeDefinition baseType=complexTypeDefinition.getBaseTypeDefinition();
    		    	if(isRestriction){		
    		    		XSDComplexTypeContent content=	complexTypeDefinition.getContent() ;
    		    		if(content instanceof XSDParticle){
    		    			//XSDParticle derivedParticle=(XSDParticle)content;
    		    			if(baseType instanceof XSDComplexTypeDefinition){
    		    				XSDComplexTypeDefinition baseComplexType=(XSDComplexTypeDefinition)baseType;
    		    	    		XSDParticle baseContent=	baseComplexType.getSyntheticParticle() ;
    		    	    		if(baseContent!=null){
    				String diagnosticMessage=filtered.getSeverity()+":"+filtered.getKey()+":"+filtered.getMessage();
    				System.out.println("suppressing diagnostic based on synthetic particle "+complexTypeDefinition.getName()+":"+complexTypeDefinition.getTargetNamespace()+"; "+diagnosticMessage);
    				extendedDiagnostics.remove(filtered);
    				//listRestrictionInfo(typeDefinition);
    		    	    		}
    		    			}
    		    		}
    		    	}
    			}
    		}
    	}
    	// 
    	// "derivation-ok-restriction.5.3.3"
    	ExtendedDiagnosticAnalyzer analyzer=new ExtendedDiagnosticAnalyzer(typeDefinition);
    	extendedDiagnostics.addAll(analyzer.extendedAnalysis());
    	return extendedDiagnostics;
    }
    static protected String getDiagnosticMessages(String message,XSDConcreteComponent typeDefinition,Set<String> didThat){
    	List<XSDDiagnostic> extendedDiagnostics=getExtendedDiagnostics(typeDefinition);
		for(XSDDiagnostic diagnostic:extendedDiagnostics){
			// how do we get valid facets set properly?
			/*
			if("cos-applicable-facets".equals(diagnostic.getKey())
					&& (typeDefinition.getContainer() instanceof XSDSimpleTypeDefinition)
					&& (((XSDSimpleTypeDefinition)typeDefinition.getContainer()).getValidFacets().isEmpty())
					){
				continue;
			}
			*/
			/*
			if("_UI_UnresolvedTypeDefinition_message".equals(diagnostic.getKey())
					&& (typeDefinition instanceof XSDSimpleTypeDefinition)
					&& (typeDefinition.getContainer() instanceof XSDComplexTypeDefinition)){
				continue;
			}
			*/
			String annotation=diagnostic.getAnnotationURI();
			String diagnosticMessage=diagnostic.getSeverity()+":"+diagnostic.getKey()+((annotation==null)?"":"("+annotation+")")+":"+diagnostic.getMessage();
			if(didThat.contains(diagnosticMessage))continue;
			didThat.add(diagnosticMessage);
			if(message.length()>0)message+="\n";
			message+=""+diagnosticMessage;
			/*
			org.w3c.dom.Element w3cElement=typeDefinition.getElement();
			Attr attr=null;
			if(w3cElement!=null){
			 attr=w3cElement.getAttributeNodeNS(null,"value");
			}
			//System.out.println("diagnostic "+w3cElement+", "+attr+" : "+typeDefinition+" : "+diagnosticMessage);
			if(typeDefinition instanceof XSDEnumerationFacet){
				XSDEnumerationFacet facet=(XSDEnumerationFacet)typeDefinition;
				String lexicalValue=facet.getLexicalValue();
				org.w3c.dom.Element w3cElement=facet.getElement();
				Attr attr=w3cElement.getAttributeNode("value");
				if(attr==null){
					//w3cElement.setAttributeNS(null,XSDConstants.VALUE_ATTRIBUTE, lexicalValue);
					System.out.println("no value "+lexicalValue+" to "+facet);
				}else{
					//attr.setValue(lexicalValue);
					System.out.println("has value "+attr.getValue()+" should be "+lexicalValue);
				}
			}
			*/
			/*
			if(typeDefinition instanceof XSDEnumerationFacet){
				XSDSimpleTypeDefinition container=((XSDEnumerationFacet)typeDefinition).getSimpleTypeDefinition();
				if(container!=null){
					//container.validate();
			System.out.println("Diagnostic "+container.getValidFacets()+"; "+diagnosticMessage);
				}
			}
			*/
		}
		if(typeDefinition instanceof XSDConcreteComponentImpl){
			/*
			if(typeDefinition instanceof XSDSimpleTypeDefinition){
				XSDSimpleTypeDefinition simpleType=(XSDSimpleTypeDefinition)typeDefinition;
				XSDEnumerationFacet enumerationFacet=simpleType.getEffectiveEnumerationFacet();
				if(enumerationFacet!=null)message=getDiagnosticMessages(message,enumerationFacet,didThat);
				XSDFractionDigitsFacet fdFacet=simpleType.getEffectiveFractionDigitsFacet();
				if(fdFacet!=null)message=getDiagnosticMessages(message,fdFacet,didThat);
				XSDLengthFacet lengthFacet=simpleType.getEffectiveLengthFacet();
				if(lengthFacet!=null)message=getDiagnosticMessages(message,lengthFacet,didThat);
				XSDMaxFacet maxFacet=simpleType.getEffectiveMaxFacet();
				if(maxFacet!=null)message=getDiagnosticMessages(message,maxFacet,didThat);
				XSDMaxLengthFacet maxLengthFacet=simpleType.getEffectiveMaxLengthFacet();
				if(maxLengthFacet!=null)message=getDiagnosticMessages(message,maxLengthFacet,didThat);
				XSDMinFacet minFacet=simpleType.getEffectiveMinFacet();
				if(minFacet!=null)message=getDiagnosticMessages(message,minFacet,didThat);
				XSDMinLengthFacet minLengthFacet=simpleType.getEffectiveMinLengthFacet();
				if(minLengthFacet!=null)message=getDiagnosticMessages(message,minLengthFacet,didThat);
				XSDPatternFacet patternFacet=simpleType.getEffectivePatternFacet();
				if(patternFacet!=null)message=getDiagnosticMessages(message,patternFacet,didThat);
				XSDTotalDigitsFacet tdFacet=simpleType.getEffectiveTotalDigitsFacet();
				if(tdFacet!=null)message=getDiagnosticMessages(message,tdFacet,didThat);
				XSDWhiteSpaceFacet wsFacet=simpleType.getEffectiveWhiteSpaceFacet();
				if(wsFacet!=null)message=getDiagnosticMessages(message,wsFacet,didThat);

				
			}else{
			*/
			for(XSDConcreteComponent concreteComponent:((XSDConcreteComponentImpl)typeDefinition).getXSDContents()){
				message=getDiagnosticMessages(message,concreteComponent,didThat);
			}

			//}
		}
		return message;
    }
    public static String message(Classifier classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    public static String message(Enumeration classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    public static String message(PrimitiveType classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    public static String message(DataType classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    public static String message(Class classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    public static String message(Property classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    public static String message(NamedElement classifier) {
    	try{
		return getNameInvalidMessage(classifier);
    	}catch(Throwable t){
    		t.printStackTrace();
    		return "internal error:"+t;
    	}
    }    
    ///////////////////////////////////////////////
}
