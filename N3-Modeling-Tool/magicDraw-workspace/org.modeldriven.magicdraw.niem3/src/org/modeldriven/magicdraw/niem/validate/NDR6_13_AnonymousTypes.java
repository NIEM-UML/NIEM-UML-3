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
public class NDR6_13_AnonymousTypes extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        Collection<SmartListenerConfig> configs3 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig3=new SmartListenerConfig("nestedClassifier");
        configs3.add(documentationConfig3);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs3);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
	   	 if(!NIEMHelper.isInInformationModel(namedElement))return false;
    	 if(!NIEMHelper.isInConformantModel(namedElement))return false;
 		if(NIEMHelper.isInformationModelDefaultPurposeExchange(NIEMHelper.getNearestInformationModel(namedElement)))return false;
	   	 return Classifier.class.isInstance(namedElement.getOwner());
	 	}

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixAnonymousTypeAction action = new FixAnonymousTypeAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixAnonymousTypeAction extends FixNameAction implements AnnotationAction
    {

        public FixAnonymousTypeAction(NamedElement property)
        {
            super(property);
            setName("Move anonymous type to schema level type");
        }
        protected void fixName(Element ne){
        	com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
        	informationModel.getPackagedElement().add((PackageableElement)ne);
        }
    }
    
}
