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
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
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
public class NDR10_22_ElementRefDefinedByConformantSchemas extends NameValidationRule 
	//implements Expression
{
	public NDR10_22_ElementRefDefinedByConformantSchemas(){}
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
//        addPropertyConfiguration(configMap);
        addDependencyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	Dependency references=(Dependency)namedElement;
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(references);
    	if(subsetInformationModel==null)return false;
    	if(!NIEMHelper.getNamespaceIsConformant(subsetInformationModel))return false;
    	Property property=null;
    	for(NamedElement client:references.getClient()){
    		if(client instanceof Property){
    			property=(Property)client;
    			break;
    		}
    	}
    	if(property==null)return false;
    	if(NIEMHelper.isXSDAny(property))return false;
 		if(NIEMHelper.isXSDAttribute(property))return false;
 		Property resolvedProperty=null;
    	for(NamedElement supplier:references.getSupplier()){
    		if(supplier instanceof Property){
    			resolvedProperty=(Property)supplier;
    			break;
    		}
    	}
    	if(resolvedProperty==null)return false;
    	return !NIEMHelper.isInImportedAsConformantNamespace(resolvedProperty);

    	/*
    	    	Property subsetProperty=(Property)namedElement;
    	    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
    	    	if(subsetInformationModel==null)return false;
    	    	if(!NIEMHelper.getNamespaceIsConformant(subsetInformationModel))return false;
    	    	if(NIEMHelper.isXSDAny(subsetProperty))return false;
    	 		if(NIEMHelper.isXSDAttribute((Property)namedElement))return false;
    	    	Type type=subsetProperty.getType();
    	    	if((type==null))return false;
    	    	Package typeInformationModel=NIEMHelper.getNearestInformationModel(type);
    	    	if(typeInformationModel==null)return false;
    	    	return !NIEMHelper.isImportedAsConformantNamespace(typeInformationModel);
    	    	*/
        }
}
