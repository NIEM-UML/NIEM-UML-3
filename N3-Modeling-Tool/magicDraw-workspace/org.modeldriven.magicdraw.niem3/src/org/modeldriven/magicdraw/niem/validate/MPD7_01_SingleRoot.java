package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for:
 * Definition: schema coherence – 
 * A schema set is coherent when it has the following properties: 
 * (1) the schema set does not refer to a schema outside the set (i.e., the set is closed), and 
 * (2) the set does not include two different versions of the same component in an incompatible way.
 *
 */
public class MPD7_01_SingleRoot extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addComponentAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}

    static protected String getNameInvalidMessage(NamedElement namedElement){
    	if(!(namedElement instanceof Component))return null;
		if(!namedElement.isEditable())return null;
		if(!NIEMHelper.isModelPackageDescription(namedElement))return null;
		if(QvtCommonAction.isInPSM(NIEMHelper.getNearestPackage(namedElement)))return null;
    	// check for multiple <<MPD>>
	    Model root = QvtCommonAction.getCurrentModelRoot();//project.getModel();
	    if(root!=null){
	    	for(Component component:QvtCommonAction.getContainedComponents(root)){
	    		if(!NIEMHelper.isModelPackageDescription(component))continue;
	    		if(QvtCommonAction.isInPSM(component.getOwningPackage()))continue;
	    		if(namedElement.equals(component))continue;
	    		if(!component.isEditable())continue;
				return "second root at "+component.getQualifiedName();
	    	}
	    }
    	return null;
	 	}
    public static String message(Component classifier) {
		return getNameInvalidMessage(classifier);
    }    
    
/*
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixTargetNamespaceAction action = new FixTargetNamespaceAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    */
    ///////////////////////////////////////////////
    
}
