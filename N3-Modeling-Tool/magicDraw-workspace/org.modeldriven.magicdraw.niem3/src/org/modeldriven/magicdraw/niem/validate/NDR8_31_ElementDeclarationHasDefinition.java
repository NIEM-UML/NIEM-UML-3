package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NDR8_80_DefineTargetNamespace.FixTargetNamespaceAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR8_31_ElementDeclarationHasDefinition extends DocumentationRule
{
    protected boolean isElementInvalid(Element namedElement){
    	Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
    	if(informationModel==null)return false;
 		//if(!isOwnerNamespace(namedElement.getOwner()))return false;
    	if(!NIEMHelper.getNamespaceIsConformant(informationModel))return false;
    	if(Generalization.class.isInstance(namedElement)){
    		Generalization generalization=(Generalization)namedElement;
    		if(NIEMHelper.isRolePlayedBy(generalization)
    				||NIEMHelper.isAugmentationType(generalization.getGeneral())){
    	 		return isDataDefinitionInvalid(namedElement);
    			
    		}else{
    			return false;
    		}
    	}
    	if(!(namedElement instanceof Property))return false;
    	Property property=(Property)namedElement;
    	if(!property.isNavigable())return false;
    	Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
    	if(propertyHolderProperty==null)propertyHolderProperty=property;
		if(!NIEMHelper.isInformationModelDefaultPurposeExtensionOrReference(NIEMHelper.getNearestInformationModel(propertyHolderProperty)))return false;
 		if(!NIEMHelper.isXSDElement(propertyHolderProperty))return false;
 		return isDataDefinitionInvalid(namedElement);
     }

    
}
