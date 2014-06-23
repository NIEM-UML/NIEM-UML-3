package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.copypaste.CopyPasting;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
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
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for [Rule 6-14] (REF, SUB, EXT)
Within the schema, any element declaration carrying the attribute name MUST appear as an immediate child of the document element xsd:schema.
 *
 */
public class NDR8_30_NoLocalPropertyElements extends NameValidationRule
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
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	if(!Property.class.isInstance(namedElement))return null;
    	Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
    	if(informationModel==null)return null;
    	Property property=(Property)namedElement;
    	Classifier classifier=NameHelper.getOwningClassifier(property);
    	if(classifier!=null){
    		Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
    		if(propertyHolderProperty==null){
    			propertyHolderProperty=property;
    		}else{
    			// check implicit and explicit propertyholder reference
    			String message=NDR8_30_NoLocalElements.isNameInvalidProperty(property,propertyHolderProperty);
    			if(message!=null)return "implicit or explicit "+message;
    		}
    		// following should only be for <<PropertyHolder>> Properties
    		if(!NIEMHelper.isPropertyHolder(classifier))return null;
        	Package propertyHolderInformationModel=NIEMHelper.getNearestInformationModel(propertyHolderProperty);
        	if(propertyHolderInformationModel==null)return null;
	    	// check for unique name within extension hierarchy
	    	List<Property> extensionProperties=new Vector<Property>();
	    	Set<Classifier> extensionClassifiers=new HashSet<Classifier>();
	    	NIEMHelper.getAllBaseExtensionClassifiers(classifier,extensionClassifiers);
	    	for(Classifier extensionClassifier:extensionClassifiers){
	    		// we should be getting all the PropertyHolder and substitutions here too
	    		// and comparing namespaces
	    		extensionProperties.addAll(extensionClassifier.getAttribute());
	    	}
	    	String propertyName=NameHelper.getNIEMName(propertyHolderProperty);
	    	if(propertyName==null)propertyName="";
	    	String propertyNamespace=NIEMHelper.getNamespaceTargetNamespace(propertyHolderInformationModel);
	    	if(propertyNamespace==null)propertyNamespace="";
	    	for(Property extensionProperty:extensionProperties){
	    		if(extensionProperty.equals(property))continue;
	    		Property extensionPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(extensionProperty);
	    		if(extensionPropertyHolderProperty==null)extensionPropertyHolderProperty=extensionProperty;
	        	Package extensionPropertyHolderInformationModel=NIEMHelper.getNearestInformationModel(extensionPropertyHolderProperty);
	        	if(extensionPropertyHolderInformationModel==null)continue;

		    	String extensionPropertyName=NameHelper.getNIEMName(extensionPropertyHolderProperty);
		    	String extensionPropertyNamespace=NIEMHelper.getNamespaceTargetNamespace(extensionPropertyHolderInformationModel);
	    		if(propertyName.equals(extensionPropertyName)&&propertyNamespace.equals(extensionPropertyNamespace)){
	    			return "Duplicates property name at "+extensionProperty.getQualifiedName();
	    		}
	    	}
    	}
    	return null;
	 	}
    public static String message(Property classifier) {
		return getNameInvalidMessage(classifier);
    }    
    static protected String getKind(Property property){
    	return NIEMHelper.isXSDElement(property)?"element":"attribute";
    }
/*
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixClientPropertyAction action = new FixClientPropertyAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    */
    ///////////////////////////////////////////////
}
