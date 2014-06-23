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
public class NDR9_11_NameOfACodeTypeEndsInCodeType extends NameValidationRule
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
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);
        addClassifierAppliedStereotypeConfiguration(configMap);
        */
        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
    	 if(!(namedElement instanceof Enumeration))return false;
    	 if(!isOwnerNamespace(namedElement))return false;
    	 if(!NIEMHelper.isInConformantModel(namedElement))return false;
//    	 String name=namedElement.getName();
    	 String name=NameHelper.getNIEMName((Classifier)namedElement);
    	 if(name==null)return true;
    	 Enumeration enumeration=(Enumeration)namedElement;
    	 if(!isEnumerationTested(enumeration))return false;
    	 return !name.endsWith(getEnumerationSuffix(enumeration));
     }
     protected boolean isEnumerationTested(Enumeration enumeration){
    	 return NIEMHelper.isEnumerationComplexType(enumeration);
     }
     protected String getEnumerationSuffix(Enumeration enumeration){
    	 return NIEMHelper.isEnumerationComplexType(enumeration)
    	 ?CODETYPE_SUFFIX
    			 :CODESIMPLETYPE_SUFFIX;
     }
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixNameSuffixAction action = new FixNameSuffixAction((Classifier) element,getEnumerationSuffix((Enumeration)element));
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
