package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
import org.modeldriven.magicdraw.niem.instance.InstanceHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for:
 * An IEPD MUST contain at least one exchange schema artifact that 
 * declares at least one top-level root element for IEP instances specified by the IEPD.
 *
 */
public class MPD4_16_IepdExchange extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addComponentAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	Component mpd=(Component)namedElement;
    	if(!NIEMHelper.isMpdClassCodeIEPD(mpd))return null;
    	// gather all schemas
    	Set<Package> allSchemas=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd);
    	if(allSchemas.isEmpty()){
    		// as in the case of PSM
    		return null;
    	}
    	boolean hasTopLevelElement=false;
    	for(Package p:allSchemas){
    		if(NIEMHelper.isInformationModelDefaultPurposeExchange(p)){
    			// check for elements
    	    		for(Type propertyHolderType:p.getOwnedType()){
    					if(Classifier.class.isInstance(propertyHolderType)){
    						for(Property propertyHolderProperty:((Classifier)propertyHolderType).getAttribute()){
    							Property topLevelElement=NameHelper.getSubsetPropertyHolderProperty(propertyHolderProperty);
    							if(topLevelElement==null)topLevelElement=propertyHolderProperty;
    							if(p.equals(NIEMHelper.getNearestInformationModel(topLevelElement))){
    								if(NIEMHelper.isXSDElement(topLevelElement)){
    									hasTopLevelElement=true;
    									// check if inconsistent use of refs vs containment
    									// all  Properties including substitutions
    									Set<Property> allProperties=new HashSet<Property>();
    									getAllProperties(topLevelElement,allProperties);
    									// all concrete Properties 
    									Set<Property> concreteProperties=new HashSet<Property>();
    									// all abstract Properties 
    									Set<Property> abstractProperties=new HashSet<Property>();
    									for(Property property:allProperties){
    										if(Classifier.class.isInstance(property.getType())){
    											concreteProperties.add(property);
    										}else{
    											if(NIEMHelper.isPropertyHolder(property.getClassifier())){
    												abstractProperties.add(property);
    											}
    										}
    									}
    									// all referencing Properties 
    									Set<Property> referencingProperties=new HashSet<Property>();
    									// all containment Properties 
    									Set<Property> containmentProperties=new HashSet<Property>();
    									// all Classifiers referenced via containment, including their supertypes
    									Set<Classifier> containedClassifiers=new HashSet<Classifier>();
    									for(Property property:concreteProperties){
    										if(NIEMHelper.isReferenceProperty(property)){
    											referencingProperties.add(property);
    										}else{
    											containmentProperties.add(property);
    											NIEMHelper.getAllBaseClassifiers((Classifier)property.getType(),containedClassifiers);
    										}
    									}
    									for(Property property:referencingProperties){
    										if(!containedClassifiers.contains(property.getType())){
    											return "No contained type in exchange "+p.getName()+" satisfies Reference Property "+property.getQualifiedName(); 
    										}
    									}
    									
    									// check for any abstract Properties with no subsetting properties
    									for(Property property:abstractProperties){
    										if(property.get_propertyOfSubsettedProperty().isEmpty()){
    											return "No concrete substitution for abstract Property "+property.getQualifiedName(); 
    										}
    									}
    								}
    							}
    						}
    					}
    	    		}
    		}
    	}
    	if(hasTopLevelElement)return null;
    	return "No Top Level Elements in any Exchange <<InformationModel>>s";
	 	}
    public static String message(Component classifier) {
		return getNameInvalidMessage(classifier);
    }    
protected static void getAllProperties(Property rootProperty,Set<Property> allProperties){
	// gather transitive closure of all Properties referenced by rootProperty, including any property subsetting
	// allClassifiers tracks our visits to Classifiers
	if(rootProperty==null)return;
	if(allProperties.contains(rootProperty))return;
	allProperties.add(rootProperty);
	Type type=rootProperty.getType();
	if(Classifier.class.isInstance(type)){
		for(Property property:InstanceHelper.getOrderedProperties((Classifier)type)){
			getAllProperties(property,allProperties);
		}
	}
	// find topLevelElement
	Property topLevelElement=NameHelper.getSubsetPropertyHolderProperty(rootProperty);
	if(topLevelElement!=null)getAllProperties(topLevelElement,allProperties);
	for(Property property:rootProperty.get_propertyOfSubsettedProperty()){
		getAllProperties(property,allProperties);
	}
}

/*
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixTargetNamespaceAction action = new FixTargetNamespaceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    */
    ///////////////////////////////////////////////
    
}
