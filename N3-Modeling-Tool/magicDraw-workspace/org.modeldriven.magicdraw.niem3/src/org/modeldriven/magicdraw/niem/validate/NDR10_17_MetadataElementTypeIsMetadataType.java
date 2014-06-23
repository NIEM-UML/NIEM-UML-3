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
public class NDR10_17_MetadataElementTypeIsMetadataType extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        //Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        //configs.add(SmartListenerConfig.NAME_CONFIG);
        //configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
        //addClassAppliedStereotypeConfiguration(configMap);
        addPropertyConfiguration(configMap);
        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
    	 Property property=(Property)namedElement;
    	 Association association=property.getOwningAssociation();
    	 // ignore non-navigable association property
    	 if((association!=null)&&!AssociationClass.class.isInstance(association))return false;
    	 if(!NIEMHelper.isInInformationModel(property))return false;
    	 Type type=property.getType();
    	 boolean isMetaDataType=(type!=null)&&NIEMHelper.isMetadataType((Classifier)type);
    	 String name=NameHelper.getNIEMName(property);
    	 boolean isMetadataName=(name!=null)&&name.endsWith(METADATA_PROPERTY_SUFFIX);
    	 return isMetaDataType!=isMetadataName;
    	 /*
    	 if(!NIEMHelper.isMetadataType((Classifier)type))return false;
//    	 String name=namedElement.getName();
    	 String name=NameHelper.getNIEMName(property);
     	if((name==null)|| !name.endsWith(METADATA_PROPERTY_SUFFIX)){
    		return true;
    	}
    	 return false;
    	 */
     }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixPropertyNameSuffixAction action = new FixPropertyNameSuffixAction((Property) element,METADATA_PROPERTY_SUFFIX);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
