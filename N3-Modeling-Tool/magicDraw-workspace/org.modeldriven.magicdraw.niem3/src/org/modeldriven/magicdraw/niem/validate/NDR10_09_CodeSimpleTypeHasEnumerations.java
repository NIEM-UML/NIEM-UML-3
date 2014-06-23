package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
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
public class NDR10_09_CodeSimpleTypeHasEnumerations extends NDR10_08_NameOfACodeSimpleType
{
    protected boolean isNameInvalid(NamedElement namedElement){
   	 if(!(namedElement instanceof Enumeration))return false;
   	 if(!isOwnerNamespace(namedElement))return false;
   	 if(!NIEMHelper.isInConformantModel(namedElement))return false;
//   	 String name=namedElement.getName();
   	 String name=NameHelper.getNIEMName((Classifier)namedElement);
   	 if(name==null)return true;
   	 Enumeration enumeration=(Enumeration)namedElement;
   	 if(!isEnumerationTested(enumeration))return false;
   	 Classifier base=NIEMHelper.getBaseClassifier(enumeration);
   	 boolean inheritsCodeSimpleType=((base!=null)&&(base instanceof Enumeration)&&!NIEMHelper.isEnumerationComplexType((Enumeration)base));
   	 return enumeration.getOwnedLiteral().isEmpty()&&!inheritsCodeSimpleType;
    }
}
