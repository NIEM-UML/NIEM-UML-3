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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AssociationClass;
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
public class NDR9_33_CharacterCase extends NameValidationRule
{
     protected boolean isNameInvalid(NamedElement namedElement){
    	 if((namedElement instanceof Association)&&!(namedElement instanceof AssociationClass))return false;
    	 //System.out.println("NDR9_06_CharacterCase start "+namedElement.getQualifiedName());
    	 if((namedElement instanceof Property)&&!(((Property)namedElement).isNavigable()))return false;
    	 //System.out.println("NDR9_06_CharacterCase x ");
    	 if(!NIEMHelper.isInInformationModel(namedElement))return false;
      	if(!NIEMHelper.isInConformantModel(namedElement))return false;
    	 if(Property.class.isInstance(namedElement)&&!NIEMHelper.isXSDElement((Property)namedElement))return false;
    	 //System.out.println("NDR9_06_CharacterCase y ");
//    	 String name=namedElement.getName();
    	 String name=null;
    	 if(Property.class.isInstance(namedElement)){
    		 name=NameHelper.getNIEMName((Property)namedElement);
    	 }else{
    		 name=NameHelper.getNIEMName((Classifier)namedElement);
    	 }
     	if((name==null)|| !NIEMHelper.startsWithUpperCase(name)){
    		return true;
    	}
   	 //System.out.println("NDR9_06_CharacterCase z ");
    	 return false;
     }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixPropertyNameUpperCaseAction action = new FixPropertyNameUpperCaseAction((Property) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
