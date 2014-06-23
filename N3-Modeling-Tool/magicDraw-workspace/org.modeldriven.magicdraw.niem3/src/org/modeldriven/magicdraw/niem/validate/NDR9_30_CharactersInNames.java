package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
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
public class NDR9_30_CharactersInNames extends NameValidationRule
{
     protected boolean isNameInvalid(NamedElement namedElement){
    	 if(!NIEMHelper.isInInformationModel(namedElement))return false;
    	 if(!NIEMHelper.isInConformantModel(namedElement))return false;
    	 if(Association.class.isInstance(namedElement)&&!AssociationClass.class.isInstance(namedElement))return false;
    	 if(Property.class.isInstance(namedElement)&&(((Property)namedElement).getOwningAssociation()!=null))return false;
    	 if(NIEMHelper.isSequenceID(namedElement))return false;
    	 String name=namedElement.getName();
     	if((name==null)|| !NIEMHelper.isLegalName(name)){
    		return true;
    	}
    	 return false;
     }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixNameCharacterAction action = new FixNameCharacterAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
