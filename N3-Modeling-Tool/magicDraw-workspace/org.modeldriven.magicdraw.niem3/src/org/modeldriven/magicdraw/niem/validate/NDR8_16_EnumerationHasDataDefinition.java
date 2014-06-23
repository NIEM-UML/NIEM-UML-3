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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
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
public class NDR8_16_EnumerationHasDataDefinition extends DocumentationRule
{

    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig config = new SmartListenerConfig();
        SmartListenerConfig commentConfig=config.listenToNested(PropertyNames.OWNED_COMMENT);
        commentConfig.listenTo(PropertyNames.BODY);
        configs.add(config);
        
        
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral.class, configs);
        return configMap;
    }
	
    protected boolean isElementInvalid(Element namedElement){
    	// QvtCommonAction.log("NDR7_08 "+namedElement.getQualifiedName());
 		if(!isOwnerNamespaceEnumeration(namedElement))return false;
    	if(!NIEMHelper.getNamespaceIsConformant(NIEMHelper.getNearestInformationModel(namedElement)))return false;
		if(!NIEMHelper.isInformationModelDefaultPurposeExtensionOrReference(NIEMHelper.getNearestInformationModel(namedElement)))return false;
 		return isDataDefinitionInvalid(namedElement);
     }

     protected boolean isOwnerNamespaceEnumeration(Element element){
 		Element owner=element.getOwner();
		if(NIEMHelper.isLocalVocabulary(owner))return false;
 		if((owner!=null)
 				&&(
 						Enumeration.class.isInstance(owner)
 				)
 				){
 			return isOwnerNamespace(owner);
 		}
 		return false;
     }
    
}
