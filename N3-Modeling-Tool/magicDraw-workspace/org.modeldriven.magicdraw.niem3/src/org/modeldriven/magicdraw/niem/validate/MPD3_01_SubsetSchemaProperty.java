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
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for Classifier name in subset schema.
 *
 */
public class MPD3_01_SubsetSchemaProperty extends NameValidationRule 
	//implements Expression
{
	public MPD3_01_SubsetSchemaProperty(){}
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addPropertyConfiguration(configMap);
        /*
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
        */
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	// a Classifier in a subset schema: name must match reference schema
    	try{
    	Property subsetProperty=(Property)namedElement;
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
    	if(subsetInformationModel==null)return null;
    	if(!NIEMHelper.getNamespaceIsConformant(subsetInformationModel))return null;
		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
    	// check for restriction
		Class restrictedClass=NIEMHelper.getRestrictedClass(subsetClassifier);
		if(restrictedClass!=null){
			Property referenceProperty=RestrictionRedefinition.INSTANCE.getReferenceProperty(subsetProperty,restrictedClass);
			if(referenceProperty!=null){
				if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
					if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
						return "<<Restriction>> Base Property "+referenceProperty.getName()+" does not match derived Property "+subsetProperty.getName();
					}
				}
				// cardinality, aggregation, 
				boolean isSubsetNone=NIEMHelper.isReferenceProperty(subsetProperty);
				boolean isReferenceNone=NIEMHelper.isReferenceProperty(referenceProperty);
				boolean isReferenceAny=NIEMHelper.isXSDAny(referenceProperty);
				boolean isReferenceAbstractElement=NIEMHelper.isAbstractElement(referenceProperty);
				if(!isReferenceAny&&!isReferenceAbstractElement){
					if(isSubsetNone!=isReferenceNone)return "<<Restriction>> Base Property "+referenceProperty.getName()+" aggregation "+referenceProperty.getAggregation()+" does not match derived Property "+subsetProperty.getName()+" aggregation "+subsetProperty.getAggregation();
				}
				if(subsetProperty.getLower()<referenceProperty.getLower())return "<<Restriction>> Base Property "+referenceProperty.getName()+" lower bound "+referenceProperty.getLower()+" does not match derived Property "+subsetProperty.getName()+" lower bound  "+subsetProperty.getLower();
				if(referenceProperty.getUpper()>=0){
					if(subsetProperty.getUpper()<0)return "<<Restriction>> Base Property "+referenceProperty.getName()+" upper bound "+referenceProperty.getUpper()+" does not match derived Property "+subsetProperty.getName()+" upper bound  "+subsetProperty.getUpper();
					if(subsetProperty.getUpper()>referenceProperty.getUpper())return "<<Restriction>> Base Property "+referenceProperty.getName()+" upper bound "+referenceProperty.getUpper()+" does not match derived Property "+subsetProperty.getName()+" upper bound  "+subsetProperty.getUpper();
				}
			}else{
				return "<<Restriction>> Property has no base Property in <<Restriction>> Class "+restrictedClass.getQualifiedName();
			}
		}    	
		if(!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetInformationModel)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetInformationModel)				
				))return null;
		Property referenceProperty=NIEMHelper.getReferencesReferenceModelProperty(subsetProperty);
		if(referenceProperty==null){
	    	if((subsetClassifier==null)||!(
	    			DataType.class.isInstance(subsetClassifier)
	    			||subsetClassifier.eClass().getName().equals("Class")
	    			||subsetClassifier.eClass().getName().equals("AssociationClass")
	    		))return null;
	    	// reference model via <<references>> on classifier or informationModel
			Classifier referenceClassifier=NIEMHelper.getReferencesReferenceModelClassifier(subsetClassifier);
			if(referenceClassifier==null){
				// sometimes an extra PropertyHolder will show up in subset; in which case ignore
				if(NIEMHelper.isPropertyHolder(subsetClassifier))return null;
				return "no matching <<References>> Classifier for subset Classifier "+subsetClassifier.getName();
			}
//if(true)return null;// test timing
			referenceProperty=NameHelper.getMatchingProperty(subsetProperty, referenceClassifier);
			if(referenceProperty==null){
				// ok if classifier is PropertyHolder; no need to check cardinality/aggregation match
				if(NIEMHelper.isPropertyHolder(referenceClassifier))return null;
				Property resolvedSubsetProperty=NameHelper.getSubsetPropertyHolderProperty(subsetProperty);
				return "no matching <<References>> Property for subset Property "+subsetProperty.getName()+" in "+referenceClassifier.getQualifiedName()+", "+((resolvedSubsetProperty==null)?"":resolvedSubsetProperty.getQualifiedName());
			}
		}else{
	
			if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
				if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
					return "<<References>> Property "+referenceProperty.getName()+" does not match subset Property "+subsetProperty.getName();
				}
			}
		}
		// cardinality, aggregation, 
		boolean isSubsetNone=NIEMHelper.isReferenceProperty(subsetProperty);
		boolean isReferenceNone=NIEMHelper.isReferenceProperty(referenceProperty);
		boolean isReferenceAny=NIEMHelper.isXSDAny(referenceProperty);
		boolean isReferenceAbstractElement=NIEMHelper.isAbstractElement(referenceProperty);
		if(!isReferenceAny&&!isReferenceAbstractElement){
			if(isSubsetNone!=isReferenceNone)return "<<References>> Property "+referenceProperty.getName()+" aggregation "+referenceProperty.getAggregation()+" does not match subset Property "+subsetProperty.getName()+" aggregation "+subsetProperty.getAggregation();
		}
		// check if substitutionGroup same
		Property subsetPropertySubstitutionGroup=NIEMHelper.getSubstitutionGroupProperty(subsetProperty);
		Property referencePropertySubstitutionGroup=NIEMHelper.getSubstitutionGroupProperty(referenceProperty);
		if((subsetPropertySubstitutionGroup==null)&&(referencePropertySubstitutionGroup!=null)){
			return "<<References>> Property has substitutionGroup "+referencePropertySubstitutionGroup.getQualifiedName()+" but subset Property has no substitutionGroup";
		}
		else if((subsetPropertySubstitutionGroup!=null)&&(referencePropertySubstitutionGroup==null)
				&& NameHelper.isMatchingProperty(subsetProperty,referenceProperty)){
			// this check useful only if we had a direct match
			return "<<References>> Property has no substitutionGroup but subset Property has substitutionGroup "+subsetPropertySubstitutionGroup.getQualifiedName();
		}
		else if((subsetPropertySubstitutionGroup!=null)&&(referencePropertySubstitutionGroup!=null)){
			// TODO: check if match between the subset/reference substitutionGroup properties
		}
		
		boolean isSubsetAbstract=subsetProperty.isDerivedUnion();
		// to check reference abstract, may need to resolve the actual reference property in <<PropertyHolder>>
		Property resolvedReferenceProperty=NIEMHelper.getResolvedReferenceProperty(subsetProperty);
		if(resolvedReferenceProperty!=null){
		boolean isReferenceAbstract=resolvedReferenceProperty.isDerivedUnion();
		if(isReferenceAbstract&&!isSubsetAbstract)return "An abstract <<References>> Property can not be concrete in a subset model";
		}
		if(NIEMHelper.isPropertyHolder(subsetClassifier))return null;// no multiplicity checks for property holders
		if(subsetProperty.getLower()<referenceProperty.getLower())return "<<References>> Property "+referenceProperty.getName()+" lower bound "+referenceProperty.getLower()+" does not match subset Property "+subsetProperty.getName()+" lower bound  "+subsetProperty.getLower();
		if(referenceProperty.getUpper()>=0){
			if(subsetProperty.getUpper()<0)return "<<References>> Property "+referenceProperty.getName()+" upper bound "+referenceProperty.getUpper()+" does not match subset Property "+subsetProperty.getName()+" upper bound  "+subsetProperty.getUpper();
			if(subsetProperty.getUpper()>referenceProperty.getUpper())return "<<References>> Property "+referenceProperty.getName()+" upper bound "+referenceProperty.getUpper()+" does not match subset Property "+subsetProperty.getName()+" upper bound  "+subsetProperty.getUpper();
		}
		return null;
    	}catch(Throwable t){
    		QvtCommonAction.log("ERROR: Internal MPD3_01_SubsetSchemaProperty "+t);
    		t.printStackTrace();
    		return "ERROR: Internal MPD3_01_SubsetSchemaProperty "+t;
    	}
	 	}
    static protected boolean isSubsetPropertyValidated(Property subsetProperty){
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
    	if(subsetInformationModel==null)return false;
    	if(!NIEMHelper.getNamespaceIsConformant(subsetInformationModel))return false;
		if(!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetInformationModel)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetInformationModel)				
				))return false;
		// apply these rules to constraint as well
		//if(NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetInformationModel))return false;
		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
		Property referenceProperty=NIEMHelper.getReferencesReferenceModelProperty(subsetProperty);
		if(referenceProperty==null){
	    	if((subsetClassifier==null)||!(
	    			DataType.class.isInstance(subsetClassifier)
	    			||subsetClassifier.eClass().getName().equals("Class")
	    			||subsetClassifier.eClass().getName().equals("AssociationClass")
	    		))return false;
	    	// reference model via <<references>> on classifier or informationModel
//			Classifier referenceClassifier=NIEMHelper.getReferencesReferenceModelClassifier(subsetClassifier);
//if(true)return false;// test timing
			Classifier referenceClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetClassifier);
//if(true)return false;// test timing
			
			if(referenceClassifier==null){
		    	if(NIEMHelper.isChoice(subsetClassifier)||NIEMHelper.isPropertyHolder(subsetClassifier))return false;
			}
		}

		return true;
	 	}
    public static String message(Property classifier) {
		return getNameInvalidMessage(classifier);
    }    
    
/* no fix
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixReferenceAction action = new FixReferenceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    */
}
