package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR9_32_AttributeCharacterCase extends NameValidationRule
{
     protected boolean isNameInvalid(NamedElement namedElement){
    	 Property property=(Property)namedElement;
    	 if(!NIEMHelper.isInInformationModel(property))return false;
    	 if(!NIEMHelper.isInConformantModel(namedElement))return false;
    	 if(!NIEMHelper.isXSDAttribute(property))return false;
//    	 String name=namedElement.getName();
    	 String name=NameHelper.getNIEMName((Property)namedElement);
     	if((name==null)|| !NIEMHelper.startsWithLowerCase(name)){
    		return true;
    	}
    	 return false;
     }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixPropertyNameSuffixAction action = new FixPropertyNameLowerCaseAction((Property) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
