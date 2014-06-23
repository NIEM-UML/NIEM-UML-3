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
 * Validation rule for [Rule 7-52] (REF, SUB, EXT)
Any element declaration referenced by a component within the schema MUST be from one of the following:
1. The schema being defined.
2. A namespace imported as NIEM-conformant.
3. The structures namespace.
4. An external namespace, in accordance with the rules for external schemas as specified by this specification.
 *
 */
public class NDR10_21_ExternalAdapterElementReferencesNonConformant extends NameValidationRule
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
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	if(!NIEMHelper.isInInformationModel(namedElement))return false;
    	// a References Realization
    	Realization realization=(Realization)namedElement;
    	boolean isAdapterType=false;
    	for(NamedElement client:realization.getClient()){
    		if(!(client instanceof Property))continue;
    		Classifier classifier=((Property)client).getClassifier();
    		if(classifier!=null){
    			isAdapterType=NIEMHelper.isAdapterType(classifier);
    			if(isAdapterType)break;
    		}
    	}
    	if(!isAdapterType)return false;
    	for(NamedElement supplier:realization.getSupplier()){
//   	   	 if(!NIEMHelper.isInInformationModel(supplier))return true;
   	   	 if(!NIEMHelper.isInConformantModel(supplier))return false;
    	}
//    	return false;
    	return true;
	 	}
/*
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixElementReferenceAction action = new FixElementReferenceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixElementReferenceAction extends FixNameAction implements AnnotationAction
    {

        public FixElementReferenceAction(NamedElement property)
        {
            super(property);
            setName("remove References");

        }
        protected void fixName(Element namedElement){
        	//namedElement.dispose();
			 NIEMHelper.removeElement(namedElement);
        }
    }
  */  
}
