package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
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
public class NDR7_45_MetadataElement extends NameValidationRule
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
        //addGeneralizationConfiguration(configMap);
        //addDependencyConfiguration(configMap);
        //addClassifierAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
	   	 // Property referencing metadata
    	return false;// this test should be removed, it was based on misinterpretation of appliesTo
    	/*
   	 Property property=(Property)namedElement;
	 if(!NIEMHelper.isInInformationModel(property))return false;
	 Type type=property.getType();
	 if(type==null)return false;
	 if(!property.isNavigable())return false;
	 if(!NIEMHelper.isMetadataType((Classifier)type))return false;
	 Classifier applier=property.getClassifier();
	 if(applier==null)return false;
	 // if appliesTo
	 List<Usage> metadataApplications=NIEMHelper.getMetadataApplications(type);
	 if(metadataApplications.isEmpty())return false;
	 for(Usage metadataApplication:metadataApplications){
		 for(NamedElement test:metadataApplication.getSupplier()){
			 if(!Class.class.isInstance(test))continue;
			 if(NIEMHelper.isSubTypeOf(applier,(Class)test))return false;
		 }
	 }
	   	 return true;
	   	 */
    }

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixAppliesToAction action = new FixAppliesToAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixAppliesToAction extends FixNameAction implements AnnotationAction
    {

        public FixAppliesToAction(NamedElement property)
        {
            super(property);
            setName("remove Property");
        }
        protected void fixName(Element ne){
        	//ne.dispose();
			 NIEMHelper.removeElement(ne);
        }
    }
    
}
