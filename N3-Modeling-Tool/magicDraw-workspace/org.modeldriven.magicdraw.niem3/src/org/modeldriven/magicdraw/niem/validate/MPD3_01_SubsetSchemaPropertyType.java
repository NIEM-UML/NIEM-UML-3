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
public class MPD3_01_SubsetSchemaPropertyType extends MPD3_01_SubsetSchemaProperty 
	//implements Expression
{
	public MPD3_01_SubsetSchemaPropertyType(){}
    /**
     * {@inheritDoc}
     */
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	// a Property in a subset schema: name must match reference schema, property type must be subtype
    	//  for a restriction, must match a property from restricted class, property type must be subtype
    	//  a subsetsProperty ; property type must be subtype
    	
    	//  substitutionGroups; unique particle attribution
    	//  no change in property type except in constraint schemas, which may be a subtype
    	try{
    	Property subsetProperty=(Property)namedElement;
    	if(subsetProperty==null)return null;
    	if(!NIEMHelper.isInInformationModel(subsetProperty))return null;
    	Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
    	if(subsetClassifier==null)return null;
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
    	// check for restriction
		Class restrictedClass=NIEMHelper.getRestrictedClass(subsetClassifier);
		// TODO:  suppress check for choice, for now
		Type type=subsetProperty.getType();
		if((type!=null)&&(type instanceof Class)&&NIEMHelper.isChoice((Class)type))return null;
		if(restrictedClass!=null){
			Property referenceProperty=RestrictionRedefinition.INSTANCE.getReferenceProperty(subsetProperty,restrictedClass);
			if(referenceProperty!=null){
				if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
					if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
						return "<<Restriction>> Base Property "+referenceProperty.getName()+" does not match derived Property "+subsetProperty.getName();
					}
				}
		    	Type referenceType=referenceProperty.getType();
		    	Type subsetType=subsetProperty.getType();
		    	if(referenceType!=null){
		    		if(subsetType==null)return "base Property is untyped, but <<Restriction>> Property typed as "+referenceType.getQualifiedName();
		    		if((!Classifier.class.isInstance(subsetType))||(!Classifier.class.isInstance(referenceType)))
		    			return "base Property type "+subsetType.getQualifiedName()+" or <<Restriction>> Property type "+subsetType.getQualifiedName()+" is not a Classifier";
		    		// for choice groups, we need to check choice contents;
		    		// TODO: this does not happen in conformant schemas, just bypass check for now
		    		if(NIEMHelper.isChoice(subsetProperty.getType())&&NIEMHelper.isChoice(referenceProperty.getType())&&!NIEMHelper.getNamespaceIsConformant(subsetInformationModel)){
		    			
		    		}else
		    		if(!NIEMHelper.isSubTypeOf((Classifier)subsetType, (Classifier)referenceType))
		    			return "base type "+subsetType.getQualifiedName()+" is not a subtype of required <<Restriction>> type "+referenceType.getQualifiedName();
		    		
		    	}
			}else{
				return "there is no <<Restriction>> Property corresponding to base Property "+subsetProperty.getName()+" in restricted class "+restrictedClass.getQualifiedName();
			}
		}    	
		// check if typing ok for substitutionGroup
    	for(Property subsetted:subsetProperty.getSubsettedProperty()){
	    	Type referenceType=subsetted.getType();
	    	Type subsetType=subsetProperty.getType();
	    	if(referenceType!=null){
	    		if(subsetType==null)return "substitution Property is untyped, but substitutionGroup Property typed as "+referenceType.getQualifiedName();
	    		if((!Classifier.class.isInstance(subsetType))||(!Classifier.class.isInstance(referenceType)))
	    			return "substitution Property type "+subsetType.getQualifiedName()+" or substitutionGroup Property type "+subsetType.getQualifiedName()+" is not a Classifier";
	    		if(!NIEMHelper.isSubTypeOf((Classifier)subsetType, (Classifier)referenceType))
	    			return "substitution Property type "+subsetType.getQualifiedName()+" is not a subtype of required substitutionGroup Property type "+referenceType.getQualifiedName();
	    		// check that subsetted is in hierarchy of the subsetProperty
		    	Classifier referenceClassifier=subsetted.getClassifier();
		    	if(referenceClassifier!=null){
		    		if(!NIEMHelper.isPropertyHolderSubTypeOf(subsetClassifier, referenceClassifier))
		    			return "substitutionGroup Property  "+subsetted.getQualifiedName()+" is not in redefinition context of  "+subsetProperty.getQualifiedName();
		    	}
	    	}
    	}
    	if(!isSubsetPropertyValidated(subsetProperty))return null;
    	Property referenceProperty=NIEMHelper.getReferenceProperty(subsetProperty);
    	if(referenceProperty==null)return null;
    	// check type: either reference is null or subset must be subtype
    	Type referenceType=referenceProperty.getType();
    	Type subsetType=subsetProperty.getType();
    	boolean  isSubsetConstraintModel=NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetInformationModel);

    	if(referenceType!=null){
    		if(subsetType==null)return "subset Property is untyped, but Reference Property typed as "+referenceType.getQualifiedName();
    		if((!Classifier.class.isInstance(subsetType))||(!Classifier.class.isInstance(referenceType)))
    			return "subset Property type "+subsetType.getQualifiedName()+" or reference Property type "+referenceType.getQualifiedName()+" is not a Classifier";
//    		Classifier referenceForSubsetClassifier=NIEMHelper.getReferencesReferenceModelClassifier((Classifier)subsetType);
        	Package subsetTypeInformationModel=NIEMHelper.getNearestInformationModel(subsetType);
        	boolean  isSubsetTypeConstraintModel=NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetTypeInformationModel);
    		Classifier referenceForSubsetClassifier=null;
    		if(NIEMHelper.isXMLPrimitiveType((Classifier)subsetType))referenceForSubsetClassifier=(Classifier)subsetType;
    		// case in which type of constraint property is not in constraint model
    		else if(isSubsetConstraintModel&&!isSubsetTypeConstraintModel) referenceForSubsetClassifier=(Classifier)subsetType;
    		else referenceForSubsetClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier((Classifier)subsetType);
    		//Classifier referenceForSubsetClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier((Classifier)subsetType);
    		/* this would be ok if type overridden
    		if(referenceForSubsetClassifier==null){
    			if(!isSubsetConstraintModel){
    				return "subset type "+subsetType.getQualifiedName()+" has no reference model counterpart";
    			}
    		}
    		*/
    		if(referenceForSubsetClassifier!=null){
	    		if(!NIEMHelper.isSubTypeOf(referenceForSubsetClassifier, (Classifier)referenceType))
	    			return "reference type "+referenceForSubsetClassifier.getQualifiedName()+" is not a subtype of required reference type "+referenceType.getQualifiedName();
    		}else{
    			// TODO: need to verify subtyping when no reference model counterpart; 
    			Classifier subsetModelType=NIEMHelper.getSubsetModelClassifierForReferenceModelClassifier((Classifier)subsetType,(Classifier)referenceType);
    			if(subsetModelType==null){
	    			return "subset type "+subsetType.getQualifiedName()+" is not a derivation of required reference type "+referenceType.getQualifiedName();
    			}
    		}
//    		if(!NIEMHelper.isSubTypeOf((Classifier)subsetType, (Classifier)referenceType))return true;
    	}
    	// other then constraint schemas, the type of the actual reference property being compared must be the same
    	if(!NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetInformationModel)){
        	Property resolvedProperty=NIEMHelper.getResolvedReferenceProperty(subsetProperty);
        	if(resolvedProperty==null)return null;
        	// check type: either reference is null or subset must be subtype
        	Type resolvedType=resolvedProperty.getType();
        	if(resolvedType!=null){
        		if(subsetType==null)return "subset Property is untyped, but Reference Property typed as "+resolvedType.getQualifiedName();
        		if((!Classifier.class.isInstance(subsetType))||(!Classifier.class.isInstance(resolvedType)))
        			return "subset Property type "+subsetType.getQualifiedName()+" or reference Property type "+resolvedType.getQualifiedName()+" is not a Classifier";
        		/* allow type to be different, check made above for subtype constraint
        		Classifier referenceForSubsetClassifier=null;
        		if(NIEMHelper.isXMLPrimitiveType((Classifier)subsetType))referenceForSubsetClassifier=(Classifier)subsetType;
        		else referenceForSubsetClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier((Classifier)subsetType);
        		if(referenceForSubsetClassifier==null)return "subset type "+subsetType.getQualifiedName()+" has no reference model counterpart";
        		if(!referenceForSubsetClassifier.equals(resolvedType))
        			return " type "+referenceForSubsetClassifier.getQualifiedName()+" does not match the required reference type "+resolvedType.getQualifiedName();
        			*/
        	}
    		
    	}
		return null;
    	}catch(Throwable t){
    		QvtCommonAction.log("ERROR: Internal MPD3_01_SubsetSchemaPropertyType "+t);
    		t.printStackTrace();
    		return "ERROR: Internal MPD3_01_SubsetSchemaPropertyType "+t;
    	}
	 	}
    public static String message(Property classifier) {
		return getNameInvalidMessage(classifier);
    }    

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixPropertyTypeAction action = new FixPropertyTypeAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixPropertyTypeAction extends FixNameAction implements AnnotationAction
    {

        public FixPropertyTypeAction(NamedElement property)
        {
            super(property);
            setName("retype subset property to match reference property type");
        }
        protected void fixName(Element namedElement){
        	Property subsetProperty=(Property)namedElement;
        	Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
    		Class restrictedClass=NIEMHelper.getRestrictedClass(subsetClassifier);
    		if(restrictedClass!=null){
    			Property referenceProperty=RestrictionRedefinition.INSTANCE.getReferenceProperty(subsetProperty,restrictedClass);
    			if(referenceProperty!=null){
    		    	 subsetProperty.setType(referenceProperty.getType());
    			}
    		}
        	
        	Package clientPackage=NIEMHelper.getNearestInformationModel(subsetProperty);
        			
         	Property referenceProperty=NIEMHelper.getReferenceProperty(subsetProperty);
         	if(referenceProperty==null)return;
//        	Type referenceType=subsetProperty.getType();
        	Type referenceType=referenceProperty.getType();
        	if(Classifier.class.isInstance(referenceType)){
	    	 Type subsetType=NameHelper.addClassifier((Classifier)referenceType,clientPackage);
	    	 subsetProperty.setType(subsetType);
        	}
        	
        }
    }

}
