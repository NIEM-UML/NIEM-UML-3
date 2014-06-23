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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
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
public class NDR12_37_PropertyReferenceName extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        /*
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
        addClassAppliedStereotypeConfiguration(configMap);
        Collection<SmartListenerConfig> configs2 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig=new SmartListenerConfig("aggregation");
        configs2.add(documentationConfig);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs2);
        */
        addPropertyConfiguration(configMap);

        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
    	 return false;// no long applicable
    	 /*
    	 //QvtCommonAction.log("NDR9_31_PropertyReferenceName "+namedElement.getQualifiedName());
     	if(!NIEMHelper.isInInformationModel(namedElement))return false;
     	if(!NIEMHelper.isInConformantModel(namedElement))return false;
    	 Property property=(Property)namedElement;
    	 //QvtCommonAction.log("NDR9_31_PropertyReferenceName "+property.getQualifiedName()+", "+property.getOwningAssociation()+", "+property.getAggregation());
    	 Association association=property.getOwningAssociation();
    	 if((association!=null)&&!AssociationClass.class.isInstance(association))return false;
//    	 if(!property.getAggregation().equals(AggregationKindEnum.NONE))return false;
    	 if(!NIEMHelper.isReferenceProperty(property))return false;
    	 //if(!NIEMHelper.isInInformationModel(property))return false;
    	 if(NIEMHelper.isList(property.getClassifier()))return false;
    	 Type type=property.getType();
    	 if(type==null)return false;
//    	 if(NIEMHelper.isSimpleType(type))return false;
    	 // a datatype/primitive should be wrappered anyway with a SOAG, so refs are possible 
    	 //if(DataType.class.isInstance(type)&&NIEMHelper.isDataTypeSimpleType((DataType)type))return false;
    	 
//    	 String name=namedElement.getName();
    	 String name=NameHelper.getNIEMName(property);
    	 //QvtCommonAction.log("NDR9_31_PropertyReferenceName "+property.getQualifiedName()+", "+name);
     	if((name==null)|| !name.endsWith(REFERENCE_SUFFIX)){
    		return true;
    	}
    	 return false;
    	 */
     }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixPropertyNameSuffixAction action = new FixPropertyNameSuffixAction((Property) element,REFERENCE_SUFFIX);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    
}
