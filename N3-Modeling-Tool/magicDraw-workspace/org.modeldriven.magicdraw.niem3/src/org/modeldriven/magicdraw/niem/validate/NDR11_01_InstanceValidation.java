package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.annotation.AnnotationManager;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.magicdraw.validation.RuleViolationResult;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDComplexTypeContent;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDConcreteComponent;
import org.eclipse.xsd.XSDDiagnostic;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;
import org.eclipse.xsd.impl.XSDConcreteComponentImpl;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.instance.InstanceHelper;
import org.modeldriven.magicdraw.niem.instance.SimpleType;
import org.modeldriven.magicdraw.niem.instance.SimpleTypeInstance;
import org.modeldriven.magicdraw.niem.qvt.CancelError;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameSuffixAction;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;
import org.w3c.dom.Attr;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR11_01_InstanceValidation extends NameValidationRule
{
	
    @Override
	protected Collection<? extends Element> getInvalidElements(Constraint constraint,
                                                               Collection<? extends Element> elements)
    {
    	int size=elements.size();
    	int count=0;
    	int statusLineCount=0;
    	setStatusText("Instance validation start for "+size+" elements");
        long startTime=System.currentTimeMillis();
        Collection<Element> result = new ArrayList<Element>();
        for (Element element : elements)
        {
        	count++;
			statusLineCount--;
			if(statusLineCount<=0){
	    		setStatusText("Instance "+count+"/"+size);
				statusLineCount=200;
			}
        	if(isElementInvalid(element))result.add(element);
        }
        //System.out.println("NDR8_01_InstanceValidation "+elements.size()+", "+(System.currentTimeMillis()-startTime));
    	setStatusText("Instance validation complete "+(System.currentTimeMillis()-startTime)+" ms");
        return result;
    }
	
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addInstanceSpecificationConfiguration(configMap);
        addSlotConfiguration(configMap);
        addValueSpecificationConfiguration(configMap);
        return configMap;
    }
    protected boolean isElementInvalid(Element namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(Element namedElement){
    	if(!namedElement.isEditable())return null;
    	if(!((namedElement instanceof InstanceSpecification)
    			||(namedElement instanceof ValueSpecification)
    			||(namedElement instanceof Slot)
    			))return null;
    	// nearest package must be target of mpdFile with nature/purpose
    	Package instancePackage=NIEMHelper.getNearestPackage(namedElement);
    	if(instancePackage==null)return null;
    	if(!NIEMHelper.isInstancePackage(instancePackage))return null;
    	if(InstanceSpecification.class.isInstance(namedElement)){
    		// check sequence, cardinality, type, property substitution, (multiple) composition?
    		// get the primary classifier...
    		// use XSDSimpleTypeDefinitionImpl.AssessmentImpl ...
    		InstanceSpecification instanceSpecification=(InstanceSpecification)namedElement;
    		return getInstanceSpecificationInvalidMessage(instanceSpecification);
    	}else if(Slot.class.isInstance(namedElement)){
    		Slot slot=(Slot)namedElement;
    		return getSlotInvalidMessage( slot, instancePackage);
    	}else{
			// check type of value
			if(InstanceValue.class.isInstance(namedElement)){
				/*
				InstanceValue instanceValue=(InstanceValue)namedElement;
				InstanceSpecification targetInstance=instanceValue.getInstance();
				if(targetInstance!=null){
					String message=getNameInvalidMessage(targetInstance);
					if(message!=null)return message;
				}
				*/
				return getInstanceValueInvalidMessage((InstanceValue)namedElement);
			}else if(namedElement instanceof LiteralSpecification){
				//System.out.println("instance validation LiteralSpecification "+((LiteralSpecification)namedElement).getQualifiedName());
				LiteralSpecification literalSpecification=(LiteralSpecification)namedElement;
				return getLiteralSpecificationInvalidMessage(literalSpecification);
				}
    	}
    	return null;
	 	}
    static protected String getInstanceValueInvalidMessage(InstanceValue instanceValue){
    	if(InstanceHelper.getMetadataDependency(instanceValue).size()>1){
    		return "InstanceValue metadata ambiguous: more than 1 metadata reference";
    	}
				Slot slot=instanceValue.getOwningSlot();
				if(slot==null)return null;
				StructuralFeature feature=slot.getDefiningFeature();
				if(!(feature instanceof Property))return null;
				Property property=(Property)feature;
				Type type=property.getType();
				if(!(type instanceof Classifier))return null;
				// verify that type of instanceValue consistent with both type or definingFeature and the instanceSpecification
				Type instanceValueType=instanceValue.getType();
				if((instanceValueType==null)||!(instanceValueType instanceof Classifier)){
					// this should be an error, but let it go for now
					return null;
				}
				// instanceValueType must be derived from property type
				Set<Classifier> allTypes=new HashSet<Classifier>();
				NIEMHelper.getAllBaseClassifiers((Classifier)instanceValueType, allTypes);
				if(!allTypes.contains(type)){
					return "InstanceValue type "+instanceValueType.getQualifiedName()+" is not derived from Slot defining Feature Type "+type.getQualifiedName();
				}
				// instanceSpecification must be derived from instanceValueType
				InstanceSpecification instanceSpecification=instanceValue.getInstance();
				if((instanceSpecification==null)||(instanceSpecification instanceof EnumerationLiteral))return null;
				List<Classifier> classifiers=instanceSpecification.getClassifier();
				boolean isIsDerivedFromVs=false;
				for(Classifier classifier:classifiers){
					if(NIEMHelper.isPropertyHolder(classifier))continue;
					Set<Classifier> allISTypes=new HashSet<Classifier>();
					NIEMHelper.getAllBaseClassifiers(classifier, allISTypes);
					if(allISTypes.contains(instanceValueType)){
						isIsDerivedFromVs=true;
						break;
					}
				}
				if(!isIsDerivedFromVs){
					return "InstanceValue type "+instanceValueType.getQualifiedName()+" is not a base for any Classifier in instance "+instanceSpecification.getQualifiedName();
				}
    	return null;
	 	}
    static protected String getLiteralSpecificationInvalidMessage(LiteralSpecification literalSpecification){
				Slot slot=literalSpecification.getOwningSlot();
				if(slot==null)return null;
				StructuralFeature feature=slot.getDefiningFeature();
				if(!(feature instanceof Property))return null;
				Property property=(Property)feature;
				Type type=property.getType();
				if(!(type instanceof DataType))return null;
				InstanceSpecification instanceSpecification=slot.getOwningInstance();
				if(instanceSpecification==null)return null;
				List<Classifier> classifiers=instanceSpecification.getClassifier();
				//System.out.println("instance validation classifiers "+classifiers);
		   		XSDSchema schema=null;
				for(Classifier classifier:classifiers){
					if(NIEMHelper.isPropertyHolder(classifier))continue;
					Package informationModel=NIEMHelper.getNearestInformationModel(classifier);
					if(informationModel==null)continue;
			   		schema=SimpleType.createOrFindSchema( informationModel);

				}
				//System.out.println("instance validation schema "+schema);
		   		if(schema==null)return null;
//					if(classifiers.size()!=1)return null;
//					Classifier classifier=classifiers.get(0);
					//System.out.println("instance validation classifier "+classifier);
					//if(!(classifier instanceof DataType))continue;
//					DataType dataType=(DataType)classifier;
					DataType dataType=(DataType)type;
					
			   		XSDSimpleTypeDefinition simpleType=SimpleType.createOrFindXSDSimpleTypeDefinition( dataType,schema);
					if(simpleType!=null){
//					XSDSimpleTypeDefinition simpleType=(XSDSimpleTypeDefinition)typeDefinition;
						SimpleTypeInstance SimpleTypeInstance=new SimpleTypeInstance( simpleType, literalSpecification);
						String message="";
						Collection<XSDDiagnostic> diagnostics=SimpleTypeInstance.getDiagnostics();
						//System.out.println("instance validation "+dataType.getQualifiedName()+", "+SimpleTypeInstance+", "+diagnostics);
						for(XSDDiagnostic diagnostic:diagnostics){
							String annotation=diagnostic.getAnnotationURI();
							String diagnosticMessage=diagnostic.getSeverity()+":"+diagnostic.getKey()+((annotation==null)?"":"("+annotation+")")+":"+diagnostic.getMessage();
							if(message.length()>0)message+="\n";
							message+=""+diagnosticMessage;
						}
						if(message.length()>0){
							return message;
						}
					}
    	return null;
	 	}
    static protected String getSlotInvalidMessage(Slot slot,Package instancePackage){

    		InstanceSpecification instanceSpecification=slot.getOwningInstance();
    		if(instanceSpecification==null){
    			return "Internal error, orphaned slot in package "+instancePackage.getQualifiedName();
    		}
			StructuralFeature structuralFeature=slot.getDefiningFeature();
			if(!Property.class.isInstance(structuralFeature)){
    			return "Undefined property in slot owned by "+instanceSpecification.getQualifiedName();
			}
			Property property=(Property)structuralFeature;
			Type type=property.getType();
			boolean isAny=NIEMHelper.isXSDAny(property);
			if(!isAny&&!Classifier.class.isInstance(type)){
				return "Untyped property "+property.getName()+" at "+instanceSpecification.getQualifiedName();
			}
			Property topLevelElement= NameHelper.getSubsetPropertyHolderProperty(property);
			if(property.isDerivedUnion()||((topLevelElement!=null)&&topLevelElement.isDerivedUnion())){
				return "Abstract property "+property.getName()+" at "+instanceSpecification.getQualifiedName();
			}
			
			boolean isReference=NIEMHelper.isReferenceProperty(property);
			if(slot.getValue().isEmpty()){
				if(isReference){
					return "Unresolved property reference "+property.getName()+" at "+instanceSpecification.getQualifiedName();
				}
			}else if (isReference){
				Set<InstanceSpecification> referenceables=InstanceHelper.getReferenceables(slot);
				for(ValueSpecification valueSpecification:slot.getValue()){
					if(!InstanceValue.class.isInstance(valueSpecification)){
						return "Property value must be a reference "+property.getName()+" at "+instanceSpecification.getQualifiedName();
					}
					InstanceValue instanceValue=(InstanceValue)valueSpecification;
					InstanceSpecification instanceTarget=(InstanceSpecification)instanceValue.getInstance();
					if(instanceTarget==null){
						return "value is not an Instance at "+instanceValue.getQualifiedName();
					}
					// EnumerationLiterals will not be in the referenceables list
					if(instanceTarget instanceof EnumerationLiteral)continue;
					if(!referenceables.contains(instanceTarget)){
						return "value is not a valid referenceable Instance at "+instanceValue.getQualifiedName();
					}
				}
			}else {
			}
			// check cardinality and order at InstanceSpecification level
			
    	return null;
	 	}
    static protected String getInstanceSpecificationInvalidMessage(InstanceSpecification instanceSpecification){
//if(true)return null;//  this seems to be the longest validation for instances
    		// check sequence, cardinality, type, property substitution, (multiple) composition?
    		// get the primary classifier...
    		// use XSDSimpleTypeDefinitionImpl.AssessmentImpl ...
    		Classifier rootClassifier=InstanceHelper.getRootClassifier(instanceSpecification);
			boolean isRoot=false;
    		if(rootClassifier==null){
    			if(instanceSpecification.get_instanceValueOfInstance().isEmpty()){
    				for(Slot slot:instanceSpecification.getSlot()){
    					StructuralFeature feature=slot.getDefiningFeature();
    					if(Property.class.isInstance(feature)){
    						Property property=(Property)feature;
    						Package informationModel=NIEMHelper.getNearestInformationModel(property);
    						if(informationModel!=null){
    							if(NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)){
    								isRoot=true;
    								break;
    							}
    						}
    					}
    				}
    			}
    			if(!isRoot){
    			return "Untyped instance at "+instanceSpecification.getQualifiedName();
    			}
    		}
    		// check if properties are valid
    		if(!isRoot){
				Map<Property,Property> topLevelProperties=new HashMap<Property,Property>();
				List<Property> exchangeProperties=InstanceHelper.getOrderedProperties(rootClassifier);
				Set<Property> slotReferencedProperties=new HashSet<Property>();
				boolean includesAny=false;
				for(Property propertyRef:exchangeProperties){
					if(NIEMHelper.isXSDAny(propertyRef)){
						includesAny=true;
						// assume we can account for it
						// we may need to move this into the slot loop
							slotReferencedProperties.add(propertyRef);
						
					}
					Property topLevelProperty=NameHelper.getSubsetPropertyHolderProperty(propertyRef);
					if(topLevelProperty!=null){
						topLevelProperties.put(topLevelProperty, propertyRef);
					}
				}
				for(Slot slot:instanceSpecification.getSlot()){
					StructuralFeature structuralFeature=slot.getDefiningFeature();
					if(!Property.class.isInstance(structuralFeature))continue;
					Property property=(Property)structuralFeature;
					if(!exchangeProperties.contains(property)){
						// check if substitutable
						boolean isSubstitution=false;
						Set<Property> subsettedProperties=getSubsettedProperties(property,topLevelProperties,new HashSet<Property> ());
						for(Property substitutable:subsettedProperties){
							if(exchangeProperties.contains(substitutable)){
								slotReferencedProperties.add(substitutable);
								isSubstitution=true;
								break;
							}
						}
						if(!isSubstitution){
							// still ok if exchangeProperties contains an xsd:any
							if(!includesAny){
								//QvtCommonAction.log("Invalid property/substitution at "+property.getName()+" in "+instanceSpecification.getQualifiedName()+", "+topLevelProperties+", "+subsettedProperties);
				    			return "Invalid property/substitution at "+property.getName()+" in "+instanceSpecification.getQualifiedName();
							}else{
							}
						}
					}else{
						slotReferencedProperties.add(property);
					}
					// check cardinality
					// we need more information about how xsd:any was mapped; for now just bypass cardinality check
					if(includesAny)continue;
					int instanceCardinality=slot.getValue().size();
					if(property.getLower()>0){
						if(instanceCardinality<property.getLower()){
							return "instance value count less then required minimum="+property.getLower()+" for "+property.getName()+" at "+instanceSpecification.getName();
						}
					}
					if(property.getUpper()>=0){
						if(instanceCardinality>property.getUpper())return "instance value count greater then required maximum="+property.getUpper()+" for "+property.getName()+" at "+instanceSpecification.getName();
					}
				}
//if(true)return null;// timing test				
				// check for missing slots (properties with min cardinality>0)
				Set<Property> unReferencedProperties=new HashSet<Property>(exchangeProperties);
				unReferencedProperties.removeAll(slotReferencedProperties);
				for(Property unreferencedProperty:unReferencedProperties){
					if(unreferencedProperty.getLower()>0){
						// the above does not account for choice groups
						// for now, ignore if the property is in a choice group
						if(NIEMHelper.isChoice((NamedElement)unreferencedProperty.getOwner()))continue;
						return "instance element "+unreferencedProperty.getName()+" missing, it has lower cardinality "+unreferencedProperty.getLower()+" at "+instanceSpecification.getQualifiedName();
					}
				}
				// check order and choice cardinality
				List<Property> rawOrderedElements=InstanceHelper.getRawOrderedElements(rootClassifier);
				// may be empty if all attributes instead of elements
				if(!rawOrderedElements.isEmpty()){
	//if(true)return null;// TODO timing test				
					List<Slot> orderedSlots=InstanceHelper.getBestOrderedSlots(instanceSpecification, rootClassifier);
	//if(true)return null;// TODO timing test				
					//int slotIndex=0;
					//int propertiesAtSlot=0;
					SlotTracker slotTracker=new SlotTracker();
					for(Property property:rawOrderedElements){
						//int slotIndex=slotTracker.slotIndex;
						int nextSlotIndex=getSlotIndex(slotTracker,property,orderedSlots);
						if(nextSlotIndex<0){
							return "property "+property.getName()+" violates unique particle attribution in "+instanceSpecification.getQualifiedName();
						}
						/*
						if(nextSlotIndex==slotIndex){
							// we should account for actual slot count here
							propertiesAtSlot++;
						}
						else {
							slotIndex=nextSlotIndex;
							propertiesAtSlot=0;
						}
						*/
					}
					if(slotTracker.slotIndex<orderedSlots.size()){
						Slot slot=orderedSlots.get(slotTracker.slotIndex);
						System.out.println( "slot property "+slot.getDefiningFeature().getName()
								+" violates unique particle attribution in "+instanceSpecification.getQualifiedName()
								+" ("+slotTracker.slotIndex+"/"+orderedSlots.size()+") "+rawOrderedElements+", "+orderedSlots);
						return "slot property "+slot.getDefiningFeature().getName()+" violates unique particle attribution in "+instanceSpecification.getQualifiedName();
					}
				}
				// check for dual containment
				if(!EnumerationLiteral.class.isInstance(instanceSpecification)){
					int containers=0;
					for(InstanceValue ivTest:instanceSpecification.get_instanceValueOfInstance()){
						Slot owningSlot=ivTest.getOwningSlot();
						if(owningSlot!=null){
							StructuralFeature sfTest=owningSlot.getDefiningFeature();
							if(Property.class.isInstance(sfTest)){
								if(!NIEMHelper.isReferenceProperty((Property)sfTest)){
									containers++;
								}
							}
						}
					}
					if(containers!=1){
						return "InstanceSpecification with illegal containment, container count="+containers;
					}
				}
    		}
    		
    	return null;
	 	}
    ////////////////////////
   static  public class SlotTracker{
    	public int slotIndex=0;
    	public int valuesProcessedAtSlot=0;
    	public int propertyInstancesProcessed=0;
    }
    /////////////////////////
   protected static boolean isSlotPropertyDerivedFrom(Property currentProperty,Property headProperty){
	   // is currentProperty a valid derivation of property?
	   if(headProperty==null)return false;
		Property clientPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(headProperty);
		if(clientPropertyHolderProperty==null)clientPropertyHolderProperty=headProperty;
	   if(currentProperty==null)return false;
		Property currentPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(currentProperty);
		if(currentPropertyHolderProperty==null)currentPropertyHolderProperty=currentProperty;
	   if(currentPropertyHolderProperty.equals(clientPropertyHolderProperty))return true;
		 Set<Property> substitutes=new HashSet<Property>();
		 SubstitutionGroupDecompositionDialogHelper.INSTANCE.getAllSubstitutes(clientPropertyHolderProperty,substitutes);
		return substitutes.contains(currentPropertyHolderProperty);
	   
   }
	protected static int getSlotIndex(SlotTracker slotTracker,Property property,List<Slot> orderedSlots){
		// error if out of range of slot
		if((slotTracker.slotIndex<0)||(slotTracker.slotIndex>=orderedSlots.size()))return slotTracker.slotIndex;
		Slot currentSlot=orderedSlots.get(slotTracker.slotIndex);
		StructuralFeature feature=currentSlot.getDefiningFeature();
		if(!(feature instanceof Property))return -1;
		Property currentProperty=(Property)feature;
		if(NIEMHelper.isXSDAttribute(currentProperty)){
			// skip this slot, continue with same property
			slotTracker.valuesProcessedAtSlot=0;
			slotTracker.slotIndex++;
			return getSlotIndex(slotTracker,property,orderedSlots);
		}
		// choice property expanded with different cardinality
		if(NIEMHelper.isChoice(property.getType())){
			return getChoiceGroupSlotIndex(slotTracker,property,orderedSlots);
		}
		if(NIEMHelper.isXSDAny(property)){
			// the any should match anything
		}else{
			if(!isSlotPropertyDerivedFrom(currentProperty,property)){
				// need another Property to satisfy slot; continue with next property
				slotTracker.propertyInstancesProcessed=0;
				//System.out.println("not derived, continue with next Property after "+currentProperty.getName()+", looking for "+property.getName());
				return slotTracker.slotIndex;
			}
		}
		// if no bounds on currentProperty, allocate all slot values and bump to next slot using same property
		if((currentProperty.getUpper()<0)){
			slotTracker.propertyInstancesProcessed+=currentSlot.getValue().size();
			slotTracker.valuesProcessedAtSlot=0;
			//System.out.println("no bounds, bump to next slot after "+currentProperty.getName()+", looking for after "+property.getName());
			slotTracker.slotIndex++;
			return getSlotIndex(slotTracker,property,orderedSlots);
		}
		// check for overflowing current slot, go to next slot and continue with remainder of property
		int remainingPropertyInstances=currentProperty.getUpper()-slotTracker.propertyInstancesProcessed;
		int remainingSlotValue=currentSlot.getValue().size()-slotTracker.valuesProcessedAtSlot;
		if(remainingPropertyInstances==remainingSlotValue){
			// exact match with Property and slot values remaining; finish this property and start next slot 
			slotTracker.propertyInstancesProcessed=0;
			slotTracker.valuesProcessedAtSlot=0;
			//System.out.println("exact match, bump to next slot after "+currentProperty.getName()+", looking for after "+property.getName());
			slotTracker.slotIndex++;
			return slotTracker.slotIndex;
		}
		if(remainingPropertyInstances>remainingSlotValue){
			// current slot overflow, remainder goes to next slot 
			slotTracker.propertyInstancesProcessed+=remainingSlotValue;
			slotTracker.valuesProcessedAtSlot=0;
			//System.out.println("slot overflow, bump to next slot after "+currentProperty.getName()+", looking for after "+property.getName());
			slotTracker.slotIndex++;
			return getSlotIndex(slotTracker,property,orderedSlots);
		}
		// allocate rest of property to current slot; keep same slot; continue with next property
		slotTracker.propertyInstancesProcessed=0;// for next
		slotTracker.valuesProcessedAtSlot+=remainingPropertyInstances;
		//System.out.println("rest o property to current slot "+currentProperty.getName()+", looking for  "+property.getName());
		return slotTracker.slotIndex;
	}
	protected static int getChoiceGroupSlotIndex(SlotTracker slotTracker,Property choice,List<Slot> orderedSlots){
		// error if out of range of slot
		if((slotTracker.slotIndex<0)||(slotTracker.slotIndex>=orderedSlots.size()))return slotTracker.slotIndex;
		Slot currentSlot=orderedSlots.get(slotTracker.slotIndex);
		StructuralFeature feature=currentSlot.getDefiningFeature();
		if(!(feature instanceof Property))return -1;
		Property currentProperty=(Property)feature;
		// within cardinality of choice, process each property of choice; until no match with any of choice or cardinality of choice exhausted
		Class choiceClass=(Class)choice.getType();
		int lower=choice.getLower();
		int upper=choice.getUpper();
		int current=0;
		List<Property> rawOrderedElements=InstanceHelper.getRawOrderedElements(choiceClass);
		
		while(true){
			boolean isChoiceHandled=false;
			for(Property choiceElement:rawOrderedElements){
				int slotIndex=slotTracker.slotIndex;
				int saveValuesProcessedAtSlot=slotTracker.valuesProcessedAtSlot;
				int nextSlotIndex=getSlotIndex(slotTracker,choiceElement,orderedSlots);
				if(nextSlotIndex<0){
					return nextSlotIndex;
				}
				// if something processed, done with this iteration
				// otherwise continue with next choiceElement
				if((slotTracker.propertyInstancesProcessed==0)
						&&(nextSlotIndex==slotIndex)
						&&(slotTracker.valuesProcessedAtSlot==saveValuesProcessedAtSlot)){
					// nothing changes
					//System.out.println("choices no change at "+choiceElement.getQualifiedName());
				}else{
					// any leftovers should be picked up on next iteration?
					//System.out.println("choices done at "+choiceElement.getQualifiedName()+", next as "+orderedSlots.get(slotTracker.slotIndex).getDefiningFeature().getQualifiedName());
					isChoiceHandled=true;
					break;
				}
				
			}
			current++;
			if(!isChoiceHandled){
				// nothing happended: are we in bounds?
				if(current<lower)return -1;
				break;
			}
			// are we done?
			if(upper>=0){
				if(current>=upper)break;
			}
		}
		// for each invocation, one choice property
		return slotTracker.slotIndex;
	}
    public static String message(Element classifier) {
		return getNameInvalidMessage(classifier);
    }    
/*
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixAppliesToAction action = new FixAppliesToAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    */
    static protected Set<Property> getSubsettedProperties(Property property,Map<Property,Property> topLevelProperties,Set<Property> result){
    	for(Property subsetted:property.getSubsettedProperty()){
    		result.add(subsetted);
    		getSubsettedProperties(subsetted,topLevelProperties,result);
    	}
    	// add in the original Property from rootClassifier
    	Property propertyRef=topLevelProperties.get(property);
    	if(propertyRef!=null){
    		result.add(propertyRef);
    	}
    	return result;
    }

	@Override
	protected boolean isNameInvalid(NamedElement namedElement) {
		return false;
	}
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixInstanceAction action = new FixInstanceAction(element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
///////////////////////////////////////////////////////////////
    static public class FixInstanceAction extends NMAction implements AnnotationAction
    {
        private Element mElement;

        public FixInstanceAction(Element element)
        {
            super("DELETE_ELEMENT", "Delete Element in Error", 0);
            mElement = element;
        }

        /**
         * Executes the action.
         *
         * @param e event caused execution.
         */
        @Override
      public void actionPerformed(ActionEvent e)
        {
            SessionManager sm = SessionManager.getInstance();
            sm.createSession("Deleting Element");
            try
            {
                deleteElement(mElement);
            }
            catch (Exception exc)
            {
            	QvtCommonAction.log("ERROR: "+ exc);
                sm.cancelSession();
            }
            finally
            {
                sm.closeSession();
            }
        }
        protected void deleteElement(Element element){
        	NIEMHelper.removeElement(element);
        }
        /**
         * Executes the action on specified targets.
         *
         * @param annotations action targets.
         */
        @Override
      public void execute(Collection<Annotation> annotations)
        {
            if (annotations == null || annotations.isEmpty())
            {
                return;
            }
            boolean isSessionCreated=NIEMHelper.createSession("Deleting elements");
            //SessionManager sm = SessionManager.getInstance();
            //sm.createSession("Deleting elements");
            try
            {
                for (Annotation annotation : annotations)
                {
                    BaseElement baseElement = annotation.getTarget();
                    if (baseElement instanceof Element)
                    {
                    	Element classifier = (Element) baseElement;
//                        fixJavaConstantNames(classifier);
                    	deleteElement(classifier);
                    }
                }
            }
            catch (Exception e)
            {
                //MDLog.getGUILog().error("", e);
                QvtCommonAction.log("ERROR: "+e);
                //sm.cancelSession();
            	NIEMHelper.cancelSession(isSessionCreated);
            }
            finally
            {
                //sm.closeSession();
            	NIEMHelper.closeSession(isSessionCreated);
            }
        }

        @Override
      public boolean canExecute(Collection<Annotation> annotations)
        {
            return true;
        }
    }
    
}
