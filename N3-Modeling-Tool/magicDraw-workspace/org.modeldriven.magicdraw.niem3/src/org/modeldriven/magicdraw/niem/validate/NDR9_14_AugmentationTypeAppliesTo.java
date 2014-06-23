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
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR9_14_AugmentationTypeAppliesTo extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        //addGeneralizationConfiguration(configMap);
        addDependencyConfiguration(configMap);
        //addClassifierAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    public static String message(Usage classifier) {
		return getNameInvalidMessage(classifier);
    }    
    
    static protected String getNameInvalidMessage(NamedElement namedElement){
	   	 // Usage supplier must be object, association
    	// (not role, metadata,augmentation,Adapter)
    	if(!NIEMHelper.isInInformationModel(namedElement))return null;
		if(!NIEMHelper.isInformationModelDefaultPurposeExtensionOrReference(NIEMHelper.getNearestInformationModel(namedElement)))return null;

    	for(NamedElement supplier:((Usage)namedElement).getSupplier()){
    		if(!Classifier.class.isInstance(supplier)) return "<<AugmentationApplication>> supplier is not a Classifier";
    		Classifier supplierClass=(Classifier)supplier;
    		//if((Class.class.isInstance(supplierClass)&&NIEMHelper.isRoleType((Class)supplierClass)))return "<<AugmentationApplication>> supplier is a role type";
    		if(NIEMHelper.isMetadataType(supplierClass))return "<<AugmentationApplication>> supplier is a metadata type";
    		if(NIEMHelper.isAugmentationType(supplierClass))return "<<AugmentationApplication>> supplier is an augmentation type";
    		//if(NIEMHelper.isAdapterType(supplierClass))return "<<AugmentationApplication>> supplier is an adapter type";
    		/*
    		if((Class.class.isInstance(supplierClass)&&NIEMHelper.isRoleType((Class)supplierClass))
    				||NIEMHelper.isMetadataType(supplierClass)
    				||NIEMHelper.isAugmentationType(supplierClass)
    				||NIEMHelper.isAdapterType(supplierClass)
    				)return true;
    				*/
    	}
	   	 return null;
    }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixAppliesToAction action = new FixAppliesToAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixAppliesToAction extends FixNameAction implements AnnotationAction
    {

        public FixAppliesToAction(NamedElement property)
        {
            super(property);
            setName("remove appliesTo");
        }
        protected void fixName(Element ne){
//        	ne.dispose();
			 NIEMHelper.removeElement(ne);
        }
    }
    
}
