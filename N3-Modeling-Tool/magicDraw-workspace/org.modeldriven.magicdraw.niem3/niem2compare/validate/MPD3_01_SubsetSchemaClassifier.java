package org.modeldriven.magicdraw.niem.validate;


import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
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
 * Validation rule for Classifier name in subset schema.
 *
 */
public class MPD3_01_SubsetSchemaClassifier extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
    	
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addClassifierAppliedStereotypeConfiguration(configMap);
        /*
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        //configs.add(new SmartListenerConfig("name"));
        //configs.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        //configs.add(SmartListenerConfig.STEREOTYPE_AND_TAGS_INSTANCE_SPECIFICATION_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs);
        configMap.put(AssociationClass.class, configs);
        */
        return configMap;
        
    	//return null;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
 	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	if(!Classifier.class.isInstance(namedElement))return null;
    	// a Classifier in a subset schema: name must match reference schema
    	try{
    	Classifier subsetClassifier=(Classifier)namedElement;
    	if(!(
    			DataType.class.isInstance(subsetClassifier)
    			||subsetClassifier.eClass().getName().equals("Class")
    			||subsetClassifier.eClass().getName().equals("AssociationClass")
    		))return null;
    	//boolean isTestType="MyObjectType".equals(subsetClassifier.getName());
    	//if(isTestType)QvtCommonAction.log("TEST:MPD3_01_SubsetSchemaClassifier "+subsetClassifier);
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetClassifier);
    	if(subsetInformationModel==null){
    		Package namespacePackage=NIEMHelper.getNearestNamespacePackage(subsetClassifier);
    		if(namespacePackage==null){
    		if(NIEMHelper.isAdapterType(subsetClassifier))return "<<AdapterType>> must be in an <<InformationModel>>";
    		if(NIEMHelper.hasStereotype(subsetClassifier, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName))) return "<<AssociationType>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isPropertyHolder(subsetClassifier))return "<<PropertyHolder>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isChoice(subsetClassifier))return "<<Choice>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isAugmentationType(subsetClassifier))return "<<AugmentationType>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isMetadataType(subsetClassifier))return "<<MetadataType>> must be in an <<InformationModel>>";
    		//if(NIEMHelper.isNiemType(subsetClassifier))return "<<MetadataType>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isList(subsetClassifier))return "<<List>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isUnion(subsetClassifier))return "<<Union>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isValueRestriction(subsetClassifier))return "<<ValueRestriction>> must be in an <<InformationModel>>";
    		if(NIEMHelper.isXSDRepresentationRestriction(subsetClassifier))return "<<XSDRepresentationRestriction>> must be in an <<InformationModel>>";
    		if(NIEMHelper.hasStereotype(subsetClassifier, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName)))return "<<ObjectType>> must be in an <<InformationModel>>";
    		}
    		return null;
    	}
    	
    	// check for duplicate namespace references
		Set<Package> infoModels=new HashSet<Package>();
		infoModels.add(subsetInformationModel);
		NIEMHelper.findAllInformationModelsReferencedByType(subsetClassifier,infoModels,new HashSet<NamedElement>());
		String duplicates= MPDCoherence.checkDuplicateNamespaces(infoModels);
    	if(duplicates!=null)return duplicates;
    	
    	if(NIEMHelper.isChoice(subsetClassifier)||NIEMHelper.isPropertyHolder(subsetClassifier))return null;

		if(!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetInformationModel)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetInformationModel)				
				))return null;
		if(NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetInformationModel))return null;
    	// reference model via <<references>> on classifier or informationModel
		Classifier referenceClassifier=NIEMHelper.getReferencesReferenceModelClassifier(subsetClassifier);
		if(referenceClassifier==null){
			return "no matching reference <<InformationModel>> Classifier";
		}
//		return !NameHelper.isMatchingType(subsetClassifier, referenceClassifier);
		if( !NameHelper.isMatchingType(subsetClassifier, referenceClassifier)){
			return "NIEM name of subset Classifier does not match NIEM name of "+referenceClassifier.getQualifiedName();
		}
		// for Enumeration, check if subset literals are all defined in reference model
		if((subsetClassifier instanceof Enumeration)&&(referenceClassifier instanceof Enumeration)){
			Enumeration subsetEnum=(Enumeration)subsetClassifier;
			Enumeration referenceEnum=(Enumeration)referenceClassifier;
			Set<String> referenceLiterals=new HashSet<String>();
			for(EnumerationLiteral el:referenceEnum.getOwnedLiteral()){
				referenceLiterals.add(el.getName());
			}
			for(EnumerationLiteral el:subsetEnum.getOwnedLiteral()){
				if(!referenceLiterals.contains(el.getName())){
					return "Subset Enumeration Literal "+el.getName()+" is not in reference model";
				}
			}
		}
		return null;
    	}catch(Throwable t){
    		QvtCommonAction.log("ERROR: Internal MPD3_01_SubsetSchemaClassifier "+t);
    		t.printStackTrace();
    		return "ERROR: Internal MPD3_01_SubsetSchemaClassifier "+t;
    	}
	 	}
    public static String message(Classifier classifier) {
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
