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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for:
 * A NIEM-conforming IEPD or EIEM MUST contain at least one schema that is 
 * either a NIEM reference schema or a subset derived from a NIEM reference schema.
 *
 */
public class MPD4_16_IepdXmlInstance extends NameValidationRule
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
//        addPropertyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
    	/*
    	Component mpd=(Component)namedElement;
    	if(!(NIEMHelper.isMpdClassCodeIEPD(mpd)||NIEMHelper.isMpdClassCodeEIEM(mpd)))return false;
    	// gather all schemas
    	Set<Package> allSchemas=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd);
    	for(Package p:allSchemas){
    		if(NIEMHelper.isInformationModelDefaultPurposeReference(p)
    				||NIEMHelper.isInformationModelDefaultPurposeSubset(p))return false;
    	}
    	return true;
    	*/
	 	}

    static protected String getNameInvalidMessage(NamedElement namedElement){
    	Component mpd=(Component)namedElement;
//    	if(!(NIEMHelper.isMpdClassCodeIEPD(mpd)||NIEMHelper.isMpdClassCodeEIEM(mpd)))return null;
//    	String mpdClassCodeName=NIEMHelper.getMpdClassCode(mpd).getName();
    	boolean isIepd=NIEMHelper.isMpdClassCodeIEPD(mpd);
    	if(!isIepd)return null;
    	// gather all schemas
    	Set<Package> allSchemas=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd);
    	for(Package p:allSchemas){
    		if(NIEMHelper.isInformationModelDefaultPurposeExchange(p)){
    			// check for elements
    	    		for(Type propertyHolderType:p.getOwnedType()){
    					if(Classifier.class.isInstance(propertyHolderType)){
    						for(Property propertyHolderProperty:((Classifier)propertyHolderType).getAttribute()){
    							Property topLevelElement=NameHelper.getSubsetPropertyHolderProperty(propertyHolderProperty);
    							if(topLevelElement==null)topLevelElement=propertyHolderProperty;
    							Package propertyHolderInformationModel=NIEMHelper.getNearestInformationModel(topLevelElement);
    							if(propertyHolderInformationModel==null)continue;
    							if(!NIEMHelper.isInformationModelDefaultPurposeExchange(propertyHolderInformationModel))continue;
    							String topLevelElementName=topLevelElement.getName();
    							if(topLevelElementName==null)continue;
    							if(p.equals(NIEMHelper.getNearestInformationModel(topLevelElement))){
    								if(NIEMHelper.isXSDElement(topLevelElement)){
    									// check for an xml instance document matching topLevelElement
    									// name of InstanceSpecification should be same as name of Property
    									boolean hasInstanceDoc=false;
    									for(Package instanceDocumentPackage:NIEMHelper.getModelPackageDescriptionXmlInstances(mpd)){
    										for(PackageableElement content:instanceDocumentPackage.getPackagedElement()){
    											if(!InstanceSpecification.class.isInstance(content))continue;
    											InstanceSpecification instanceSpecification=(InstanceSpecification)content;
    											if(!instanceSpecification.get_instanceValueOfInstance().isEmpty())continue;
    											Collection<Slot> slots=instanceSpecification.getSlot();
    											if(slots.size()!=1)continue;
    											for(Slot slot:slots){
    												StructuralFeature feature=slot.getDefiningFeature();
    												if(feature==null)continue;
    												if(topLevelElementName.equals(feature.getName())){
        												hasInstanceDoc=true;
        												break;
    													
    												}
    											}
    											if(hasInstanceDoc)break;
    										}
    									}
    									if(!hasInstanceDoc){
    										return "Exchange Property "+topLevelElement.getQualifiedName()+" has no XML Instance Document";
    									}
    									
    									
    									
    								}
    							}
    						}
    					}
    	    		}
    		}
    	}
    	return null;
	 	}

    /*
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
    	if(informationModel==null)return null;
		if(!NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel))return null;
    	
    	Property propertyHolderProperty=(Property)namedElement;
		Property topLevelElement=NameHelper.getSubsetPropertyHolderProperty(propertyHolderProperty);
		if(topLevelElement==null)topLevelElement=propertyHolderProperty;
		if(informationModel.equals(NIEMHelper.getNearestInformationModel(topLevelElement))){
			if(NIEMHelper.isXSDElement(topLevelElement)){
				// check for an xml instance document matching topLevelElement
				// name of InstanceSpecification should be same as name of Property
				boolean hasInstanceDoc=false;
				for(Package instanceDocumentPackage:NIEMHelper.getModelPackageDescriptionXmlInstances(mpd)){
					for(PackageableElement content:instanceDocumentPackage.getPackagedElement()){
						if(InstanceSpecification.class.isInstance(content)
								&&((InstanceSpecification)content).getName().equals(topLevelElement.getName())){
							hasInstanceDoc=true;
							break;
						}
					}
				}
				if(!hasInstanceDoc){
					return "Exchange Property "+topLevelElement.getQualifiedName()+" has no XML Instance Document";
				}
				
				
				
			}
		}
    	return null;
	 	}
	 	*/
    public static String message(Component classifier) {
//    public static String message(Property classifier) {
		return getNameInvalidMessage(classifier);
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
