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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
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
public class NDR9_03_RoleOfElementTypeIsObjectType extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addPropertyConfiguration(configMap);
        addGeneralizationConfiguration(configMap);
        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
     	if(!NIEMHelper.isInInformationModel(namedElement))return false;
     	Property property=(Property)namedElement;
     	if(!NIEMHelper.isRoleOf(property))return false;
     	Type type=property.getType();
     	if(type==null)return true;
     	if(!(type instanceof Classifier))return true;
		 if(!NIEMHelper.isObjectType((Classifier)type))return true;
    	 return false;
     }
     protected boolean isElementInvalid(Element namedElement){
      	if(!NIEMHelper.isInInformationModel(namedElement))return false;
      	if(!(namedElement instanceof Generalization))return false;
      	Generalization property=(Generalization)namedElement;
      	if(!NIEMHelper.isRolePlayedBy(property))return false;
      	Classifier type=property.getGeneral();
      	if(type==null)return true;
 		 if(!NIEMHelper.isObjectType((Classifier)type))return true;
     	 return false;
      }

    ///////////////////////////////////////////////
}
