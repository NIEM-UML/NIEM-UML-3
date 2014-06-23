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
public class NDR8_57_NestedChoice extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addClassifierAppliedStereotypeConfiguration(configMap);
        //addPropertyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
    	if(informationModel==null)return false;
    	if(!(NIEMHelper.isInformationModelDefaultPurposeExtension(informationModel)||NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel))) return false;
    	for(Property property:((Class)namedElement).getOwnedAttribute()){
    		Type type=property.getType();
    		if(Class.class.isInstance(type)){
    			if(NIEMHelper.isChoice(type))return true;
    		}
    	}
    	return false;
	 	}


    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixNestedChoiceAction action = new FixNestedChoiceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixNestedChoiceAction extends FixNameAction implements AnnotationAction
    {

        public FixNestedChoiceAction(NamedElement property)
        {
            super(property);
            setName("Remove (Property) reference to nested choice");
        }
        protected void fixName(Element ne){
        	List<Property> properties=new Vector<Property>(((Class)namedElement).getOwnedAttribute());
        	for(Property property:properties){
        		Type type=property.getType();
        		if(Class.class.isInstance(type)){
        			if(NIEMHelper.isChoice(type)){
//        				property.dispose();
        				 NIEMHelper.removeElement(property);
        			}
        		}
        	}
        }
    }
    
}
