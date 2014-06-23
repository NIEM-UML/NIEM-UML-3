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
public class NDR10_01_ObjectTypeName extends NameValidationRule
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
        /*
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs);
        addClassifierAppliedStereotypeConfiguration(configMap);
        */
        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
    	 if(!Classifier.class.isInstance(namedElement))return false;
 		if(!isOwnerNamespace(namedElement))return false;
 		if(!NIEMHelper.isComplexType((Classifier)namedElement))return false;
//    	 String name=namedElement.getName();
    	 String name=NameHelper.getNIEMName((Classifier)namedElement);
    	 
     	if((name==null)|| !name.endsWith(TYPE_SUFFIX)){
    		return true;
//    		return true;
    	}
    	 return false;
     }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixNameSuffixAction action = new FixNameSuffixAction((Classifier) element,TYPE_SUFFIX);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
