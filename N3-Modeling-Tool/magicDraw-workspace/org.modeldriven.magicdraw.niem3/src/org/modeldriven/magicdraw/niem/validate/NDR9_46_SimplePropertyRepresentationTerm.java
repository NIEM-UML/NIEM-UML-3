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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
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
public class NDR9_46_SimplePropertyRepresentationTerm extends NameValidationRule
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
        addPropertyConfiguration(configMap);
       // addClassifierAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
    	 Property property=(Property)namedElement;
    	 if(!NIEMHelper.isInInformationModel(property))return false;
    	 if(!NIEMHelper.isInConformantModel(property))return false;
    	 Type type=property.getType();
    	 if(type==null)return false;
    	 if(!(Enumeration.class.isInstance(type)||PrimitiveType.class.isInstance(type)))return false;
    	 if(NIEMHelper.isList(property.getClassifier()))return false;
//    	 if(NIEMHelper.isSequenceID(property))return false;
	   	 if(NIEMHelper.isXSDAttribute((Property)namedElement))return false;
//    	 String name=namedElement.getName();
    	 String name=NameHelper.getNIEMName(property);
    	 for(String term:getRepresentationTerms()){
//    		 if(name.endsWith(term))return false;
    		 if(name.contains(term))return false;
    	 }
    	 return true;
     }
     static protected HashSet<String> representationTerms=null;
     protected HashSet<String> getRepresentationTerms(){
    	 if(representationTerms==null){
    		 representationTerms=new HashSet<String>();
    		 representationTerms.add("Amount");
    		 representationTerms.add("BinaryObject");
    		 representationTerms.add("Graphic");
    		 representationTerms.add("Picture");
    		 representationTerms.add("Sound");
    		 representationTerms.add("Video");
    		 representationTerms.add("Code");
    		 representationTerms.add("DateTime");
    		 representationTerms.add("Date");
    		 representationTerms.add("Time");
    		 representationTerms.add("Duration");
    		 representationTerms.add("ID");
    		 representationTerms.add("URI");
    		 representationTerms.add("Indicator");
    		 representationTerms.add("Measure");
    		 representationTerms.add("Numeric");
    		 representationTerms.add("Value");
    		 representationTerms.add("Rate");
    		 representationTerms.add("Percent");
    		 representationTerms.add("Quantity");
    		 representationTerms.add("Text");
    		 representationTerms.add("Name");
    		 representationTerms.add("List");
    	 }
    	 return representationTerms;
     }
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	String term=NameHelper.getRepresentationTerm((Property)element);
    	
    	FixPropertyNameSuffixAction action = new FixPropertyNameSuffixAction((Property) element,term);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
}
