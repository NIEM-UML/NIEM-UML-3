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
public class NDR12_27_AppliesToSchema extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addDependencyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
	   	 //if(!NIEMHelper.isInInformationModel(namedElement))return false;
	   	 // Usage supplier must be a conformant schema
    	if(!NIEMHelper.isInInformationModel(namedElement))return false;
		if(!NIEMHelper.isInformationModelDefaultPurposeExtensionOrReference(NIEMHelper.getNearestInformationModel(namedElement)))return false;

    	for(NamedElement supplier:((Usage)namedElement).getSupplier()){
    		if(!Classifier.class.isInstance(supplier)) return true;
    		Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
    		if(informationModel==null){
 //       		QvtCommonAction.log("NDR7_26 NO InformationModel "+supplier.getQualifiedName());
    			return true;
    		}
//    		QvtCommonAction.log("NDR7_26 "+informationModel.getQualifiedName()+", "+NIEMHelper.getNamespaceIsConformant(informationModel));
    		if(!NIEMHelper.getNamespaceIsConformant(informationModel))return true;
    	}
	   	 return false;
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
            setName("remove appliesTo");
        }
        protected void fixName(Element ne){
//        	ne.dispose();
			 NIEMHelper.removeElement(ne);
        }
    }
    
}
