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
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
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
public class NDR12_11_SubsetSchemaTargetNamespace extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addDependencyConfiguration(configMap);
        //addClassAppliedStereotypeConfiguration(configMap);
        //addValueSpecificationConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	if(!NIEMHelper.isInInformationModel(namedElement))return false;
    	// a References Realization
    	Realization realization=(Realization)namedElement;
    	for(NamedElement client:realization.getClient()){
    		if(Package.class.isInstance(client)){
    			// could be any purpose to any other purpose?
//    			if(NIEMHelper.isInformationModelDefaultPurposeSubset((Package)client)
//    					||NIEMHelper.isInformationModelDefaultPurposeExtension((Package)client)
//    					){
    				String subsetTargetNamespace=NIEMHelper.getNamespaceTargetNamespace((Package)client);
    		    	for(NamedElement supplier:realization.getSupplier()){
    	    			if(Package.class.isInstance(supplier)
//    	    					&&NIEMHelper.isInformationModelDefaultPurposeReference((Package)supplier)
    	    					){
    	    				String referenceTargetNamespace=NIEMHelper.getNamespaceTargetNamespace((Package)supplier);
    	    				boolean isDifferentNamespace= (referenceTargetNamespace==null)||!referenceTargetNamespace.equals(subsetTargetNamespace);

    	    				return isDifferentNamespace;
    	    			}
    		       	}
    				return true;
//    			}
    		}
       	}
    	return false;
	 	}

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixReferenceAction action = new FixReferenceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixReferenceAction extends FixNameAction implements AnnotationAction
    {

        public FixReferenceAction(NamedElement property)
        {
            super(property);
            setName("set subset targetNamespace to reference targetNamespace");
        }
        protected void fixName(Element namedElement){
        	Realization realization=(Realization)namedElement;
			String referenceTargetNamespace="";
	    	for(NamedElement supplier:realization.getSupplier()){
    				referenceTargetNamespace=NIEMHelper.getNamespaceTargetNamespace((Package)supplier);
	       	}
        	for(NamedElement client:realization.getClient()){
        		NIEMHelper.setNamespaceTargetNamespace((Package)client, referenceTargetNamespace);
           	}
        }
    }
    
}
