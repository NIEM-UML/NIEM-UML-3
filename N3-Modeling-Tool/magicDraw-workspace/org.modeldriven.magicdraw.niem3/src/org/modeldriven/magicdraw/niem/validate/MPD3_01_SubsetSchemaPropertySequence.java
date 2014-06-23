package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.evaluation.Evaluator;
import com.nomagic.magicdraw.evaluation.BinaryEvaluator;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import javax.jmi.reflect.RefObject;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
import org.modeldriven.magicdraw.niem.diagram.toolbar.SubsettingRedefinition;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for Classifier name in subset schema.
 *
 */
public class MPD3_01_SubsetSchemaPropertySequence extends MPD3_01_SubsetSchemaProperty 
	//implements Expression
{
	public MPD3_01_SubsetSchemaPropertySequence(){}
    /**
     * {@inheritDoc}
     */
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
//if(true)return null;// test timing
    	// a Classifier in a subset schema: name must match reference schema
    	try{
	    	Property subsetProperty=(Property)namedElement;
			Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
			if(subsetClassifier==null)return null;
	    	if(NIEMHelper.isPropertyHolder(subsetClassifier))return null;
	
	    	// check for restriction
			Class restrictedClass=NIEMHelper.getRestrictedClass(subsetClassifier);
			if(restrictedClass!=null){
				// 
		    	// check sequence: prior property in subset must correspond to A prior property in reference
				Property referenceProperty=RestrictionRedefinition.INSTANCE.getReferenceProperty(subsetProperty,restrictedClass);
				if(referenceProperty!=null){
					Classifier referenceClassifier=NameHelper.getOwningClassifier(referenceProperty);
			    	List<Property> subsetProperties=NIEMHelper.getOrderedProperties(subsetClassifier);
			    	List<Property> referenceProperties=NIEMHelper.getOrderedProperties(referenceClassifier);
			    	int subsetIndex=subsetProperties.indexOf(subsetProperty);
			    	int referenceIndex=referenceProperties.indexOf(referenceProperty);
			    	if(subsetIndex>0){
			    		Property priorSubsetProperty=subsetProperties.get(subsetIndex-1);
			        	Property priorReferenceProperty=RestrictionRedefinition.INSTANCE.getReferenceProperty(priorSubsetProperty,restrictedClass);
			        	if(priorReferenceProperty==null)return null;// violates a different rule
			        	int priorReferenceIndex=referenceProperties.indexOf(priorReferenceProperty);
	//		        	if(priorReferenceIndex>=referenceIndex)return "base Property "+subsetProperty.getName()+" out of sequence with respect to <<Restriction>> Property "+referenceProperty.getName();
			        	if(priorReferenceIndex>referenceIndex)return "base Property "+subsetProperty.getName()+" out of sequence with respect to <<Restriction>> Property "+referenceProperty.getName();
			        	
			    	}
				}
			}
	
			
	    	if(!isSubsetPropertyValidated(subsetProperty))return null;
			Property referenceProperty=NIEMHelper.getReferenceProperty(subsetProperty);
	    	
	    	
	    	
	    	if(referenceProperty==null)return null;
	    	// check sequence: prior property in subset must correspond to A prior property in reference
			Classifier referenceClassifier=NameHelper.getOwningClassifier(referenceProperty);
			if(isAssociationClassMismatch(subsetProperty)){
				return "subset Property sequence can not be aligned with reference because of metaclass (AssociationClass) mismatch"; 
			}
			/* this is check by ExtendedDiagnosticAnalysis
	    	List<Property> subsetProperties=NIEMHelper.getOrderedProperties(subsetClassifier);
	    	List<Property> referenceProperties=NIEMHelper.getOrderedProperties(referenceClassifier);
	    	int subsetIndex=subsetProperties.indexOf(subsetProperty);
	    	int referenceIndex=referenceProperties.indexOf(referenceProperty);
	    	if(subsetIndex>0){
	    		Property priorSubsetProperty=subsetProperties.get(subsetIndex-1);
	        	Property priorReferenceProperty=NIEMHelper.getReferenceProperty(priorSubsetProperty);
	        	if(priorReferenceProperty==null)return null;// violates a different rule
	        	int priorReferenceIndex=referenceProperties.indexOf(priorReferenceProperty);
//	        	if(priorReferenceIndex>=referenceIndex)return "subset Property "+subsetProperty.getName()+" out of sequence with respect to reference Property "+referenceProperty.getName()+" and its predecessor "+priorReferenceProperty.getName();
	        	if(priorReferenceIndex>referenceIndex)return "subset Property "+subsetProperty.getName()+" out of sequence with respect to reference Property "+referenceProperty.getName()+" and its predecessor "+priorReferenceProperty.getName();
	        	if(priorSubsetProperty.getLower()!=priorSubsetProperty.getUpper()){
	        		// check if substitutable conflict
	        		Property subsetPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(subsetProperty);
	        		Property priorSubsetPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(priorSubsetProperty);
	        		if((subsetPropertyHolderProperty!=null)&&(priorSubsetPropertyHolderProperty!=null)){
		        		if(isParticleOverlap(subsetPropertyHolderProperty,priorSubsetPropertyHolderProperty)||isParticleOverlap(priorSubsetPropertyHolderProperty,subsetPropertyHolderProperty)){
		        			return "Property "+subsetProperty.getName()+" overlaps  "+priorSubsetProperty.getName()+" : violates unique particle attribution";		        			
		        		}
	        		}
	        	}
	    	}
	    	*/
			return null;
    	}catch(Throwable t){
    		QvtCommonAction.log("ERROR: Internal MPD3_01_SubsetSchemaPropertySequence "+t);
    		t.printStackTrace();
    		return "ERROR: Internal MPD3_01_SubsetSchemaPropertySequence "+t;
    	}
	 	}
    protected static boolean isParticleOverlap(Property propertyHolderProperty,Property otherPropertyHolderProperty){
    	if(propertyHolderProperty==null)return false;
    	if(otherPropertyHolderProperty==null)return false;
    	if(propertyHolderProperty.equals(otherPropertyHolderProperty))return true;
    	for(Property test:propertyHolderProperty.getSubsettedProperty()){
    		if (isParticleOverlap(test,otherPropertyHolderProperty))return true;
    	}
    	return false;
    }
    protected static boolean isAssociationClassMismatch(Element element){
    	Property subsetProperty=(Property)element;
		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
		if(subsetClassifier==null)return false;
    	if(!isSubsetPropertyValidated(subsetProperty))return false;
		Property referenceProperty=NIEMHelper.getReferenceProperty(subsetProperty);
    	if(referenceProperty==null)return false;
    	// check sequence: prior property in subset must correspond to A prior property in reference
		Classifier referenceClassifier=NameHelper.getOwningClassifier(referenceProperty);
		return AssociationClass.class.isInstance(subsetClassifier)!=AssociationClass.class.isInstance(referenceClassifier);
    }
    public static String message(Property classifier) {
		return getNameInvalidMessage(classifier);
    }    

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
		if(isAssociationClassMismatch(element)) return super.createAnnotation(element,constraint);
    	FixSequenceAction action = new FixSequenceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixSequenceAction extends FixNameAction implements AnnotationAction
    {

        public FixSequenceAction(NamedElement property)
        {
            super(property);
            setName("resequence subset properties to match reference properties");
        }
        protected void fixName(Element namedElement){
        	Property subsetProperty=(Property)namedElement;
    		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
    		Class restrictedClass=NIEMHelper.getRestrictedClass(subsetClassifier);
    		if(restrictedClass!=null){
            	RestrictionRedefinition.INSTANCE.resequenceClassifierRestrictionProperties(subsetClassifier,restrictedClass);
            	//return;
    		}        	
    		Property referenceProperty=NIEMHelper.getReferenceProperty(subsetProperty);
        	if(referenceProperty==null)return;
        	SubsettingRedefinition.INSTANCE.resequenceSubsetProperties(subsetProperty);
        }
    }

}
