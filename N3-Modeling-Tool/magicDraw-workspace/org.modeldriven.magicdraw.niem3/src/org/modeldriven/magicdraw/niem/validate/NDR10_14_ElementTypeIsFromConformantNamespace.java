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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
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
public class NDR10_14_ElementTypeIsFromConformantNamespace extends NameValidationRule
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
        addGeneralizationConfiguration(configMap);
        //addDependencyConfiguration(configMap);
        //addClassifierAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
	   	 if(!NIEMHelper.isInInformationModel(namedElement))return false;
	   	 Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
	   	 if(informationModel==null)return false;
	   	 if(!NIEMHelper.getNamespaceIsConformant(informationModel))return false;
	   	 // Classifiers, properties, dependencies
	   	 /*
	   	 if(Classifier.class.isInstance(namedElement)){
	   		 for(Classifier general:NIEMHelper.getGeneral((Classifier)namedElement)){
	   			 if(!(NIEMHelper.isInInformationModel(general)||NIEMHelper.isXMLPrimitiveType(general)))return true;
	   		 }
	   	 }
	   	 else
	   	 */ 
	   	 if(Property.class.isInstance(namedElement)){
		   	 if(NIEMHelper.isXSDAttribute((Property)namedElement))return false;
	    	 if(NIEMHelper.isList(((Property)namedElement).getClassifier()))return false;
	    	 Association owningAssociation=((Property)namedElement).getOwningAssociation();
	    	 if((owningAssociation!=null)&&!AssociationClass.class.isInstance(owningAssociation))return false;
	   		 Type type=((Property)namedElement).getType();
	   		 if((type!=null)&&!(NIEMHelper.isInImportedAsConformantNamespace(type)))return true;
	   	 }
	   	 else if(Generalization.class.isInstance(namedElement)){
	   		Classifier type=((Generalization)namedElement).getGeneral();
	   		   		 if(!(NIEMHelper.isInImportedAsConformantNamespace(type)))return true;
	   	 }
	   	 /*
	   	 else if(Dependency.class.isInstance(namedElement)){
	   		 for(NamedElement supplier:((Dependency)namedElement).getSupplier()){
	   			 //
	   			 if(Classifier.class.isInstance(supplier)){
	   				Classifier type=(Classifier)supplier;
	   		   		 if(!(NIEMHelper.isInInformationModel(type)||NIEMHelper.isXMLPrimitiveType(type)))return true;
	   			 }
	   		 }
	   	 }
	   	 */
	   	 return false;
	 	}

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixTypeReferenceAction action = new FixTypeReferenceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixTypeReferenceAction extends FixNameAction implements AnnotationAction
    {

        public FixTypeReferenceAction(NamedElement property)
        {
            super(property);
            setName("remove type reference");
        }
        protected void fixName(Element namedElement){
        	/*
   	   	 if(Classifier.class.isInstance(namedElement)){
   	   		 List<Generalization> generalizations=new Vector<Generalization>(((Classifier)namedElement).getGeneralization());
   	   		 for(Generalization generalization:generalizations){
   	   			 Classifier general=generalization.getGeneral();
	   			 if(!(NIEMHelper.isInInformationModel(general)||NIEMHelper.isXMLPrimitiveType(general))){
	   				 //generalization.dispose();
	   				 NIEMHelper.removeElement(generalization);
	   			 }
   	   		 }
	   	 }
	   	 else
	   	 */ 
	   	 if(Property.class.isInstance(namedElement)){
	   		 Type type=((Property)namedElement).getType();
	   		 if((type!=null)&&!(NIEMHelper.isInInformationModel(type)||NIEMHelper.isXMLPrimitiveType((Classifier)type))){
	   			((Property)namedElement).setType(null);
	   		 }
	   	 }
	   	 else if(Dependency.class.isInstance(namedElement)){
	   		 for(NamedElement supplier:((Dependency)namedElement).getSupplier()){
	   			 //
	   			 if(Classifier.class.isInstance(supplier)){
	   				Classifier type=(Classifier)supplier;
	   		   		 if(!(NIEMHelper.isInInformationModel(type)||NIEMHelper.isXMLPrimitiveType(type))){
//	   		   			 namedElement.dispose();
	   					 NIEMHelper.removeElement(namedElement);
	   		   			 return;
	   		   		 }
	   			 }
	   		 }
	   	 }
        }
    }
    
}
