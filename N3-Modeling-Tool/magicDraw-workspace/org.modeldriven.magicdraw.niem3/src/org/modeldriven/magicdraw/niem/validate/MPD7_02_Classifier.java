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
public class MPD7_02_Classifier extends NameValidationRule
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
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
 	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	if(!Classifier.class.isInstance(namedElement))return null;
    	// a Simple Type can not have a ComplexType as base
    	try{
    	Classifier subsetClassifier=(Classifier)namedElement;
    	if(!(
    			DataType.class.isInstance(subsetClassifier)
    			||subsetClassifier.eClass().getName().equals("Class")
    			||subsetClassifier.eClass().getName().equals("AssociationClass")
    		))return null;
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetClassifier);
    	if(subsetInformationModel==null)return null;
    	if(DataType.class.isInstance(subsetClassifier)){
    		//QvtCommonAction.log("check generalization "+subsetClassifier.getQualifiedName()+","+NIEMHelper.getBaseClassifier(subsetClassifier));
			Classifier baseClassifier=NIEMHelper.getBaseClassifier(subsetClassifier);
			if(DataType.class.isInstance(baseClassifier)){
				DataType dataType=(DataType)baseClassifier;
				/*
				if(NIEMHelper.isDataTypeSimpleType((DataType)subsetClassifier)){
			    		//QvtCommonAction.log("check generalization baseClassifier "+baseClassifier.getQualifiedName());
						if(!NIEMHelper.isDataTypeSimpleType(dataType)){
							return "A ComplexType can not be the base of a SimpleType"; 
						}
						if(Generalization.class.isInstance(NIEMHelper.getBaseTypeRelation(subsetClassifier))){
				    		//QvtCommonAction.log("check generalization generalization "+NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)subsetClassifier)+", "+NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)dataType));
							if(PrimitiveType.class.isInstance(subsetClassifier)
									&&PrimitiveType.class.isInstance(dataType)
									&&NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)subsetClassifier)
									&&!NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)dataType)){
								return "A ComplexType can not be the extension base of a SimpleType"; 
								
							}
	
						}
				}else{
				*/
					if(Generalization.class.isInstance(NIEMHelper.getBaseTypeRelation(subsetClassifier))){
			    		//QvtCommonAction.log("check generalization generalization "+NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)subsetClassifier)+", "+NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)dataType));
						if(PrimitiveType.class.isInstance(subsetClassifier)
								&&PrimitiveType.class.isInstance(dataType)
								&&NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)subsetClassifier)
								&&!NIEMHelper.isPimSimpleTypeDefinition((PrimitiveType)dataType)){
							return "A ComplexType can not be the extension base of a SimpleType"; 
							
						}
	
					}
				//}
				
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
