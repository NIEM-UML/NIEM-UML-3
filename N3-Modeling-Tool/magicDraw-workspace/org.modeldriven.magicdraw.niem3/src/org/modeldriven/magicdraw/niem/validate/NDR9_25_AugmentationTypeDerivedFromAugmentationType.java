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
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NDR12_23_AssociationType.FixAssociationTypeAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR9_25_AugmentationTypeDerivedFromAugmentationType extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
//        addGeneralizationConfiguration(configMap);
        addClassifierAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
     protected boolean isNameInvalid(NamedElement namedElement){
     	if(!NIEMHelper.isInInformationModel(namedElement))return false;
//    	 for(Classifier general:((Classifier)namedElement).getGeneral()){
    	 for(Classifier general:NIEMHelper.getGeneral((Classifier)namedElement)){
    		 if(!NIEMHelper.isAugmentationType(general))return true;
    	 }
    	 return false;
     }

     @Override
     protected Annotation createAnnotation(Element element, Constraint constraint)
     {
     	FixAugmentationTypeAction action = new FixAugmentationTypeAction((Classifier) element);
         return new Annotation(element, constraint, Collections.singletonList(action));
     }
     ///////////////////////////////////////////////
     static public class FixAugmentationTypeAction extends FixNameAction implements AnnotationAction
     {

         public FixAugmentationTypeAction(NamedElement property)
         {
             super(property);
             setName("remove generalization");
         }
         protected void fixName(Element ne){
        	 for(Generalization generalization:NIEMHelper.getGeneralization((Classifier)ne)){
        		 Classifier general=generalization.getGeneral();
        		 if(!NIEMHelper.isAugmentationType(general)){
//         			 generalization.dispose();
        			 NIEMHelper.removeElement(generalization);
        		 }
     	 }
         }
     }
    
}
