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
public class NDR10_30_EachNamespaceOccursOnceInASet extends NameValidationRule
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
    	// do not need check here, check coherence at classifier level
    	return null;
 /*
    	Component mpd=(Component)namedElement;
    	// get all schemas, check if duplicate namespaces
    	String duplicates=checkDuplicateNamespaces(NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd));
    	QvtCommonAction.log("MPDCoherence "+duplicates);
    	return duplicates;
*/
    	
    	/*
    	Package informationModels[]=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd).toArray(new Package[0]);
    	int length=informationModels.length;
    	for(int i=0;i<length-1;i++){
    		Package informationModel1=informationModels[i];
    		if(informationModel1==null)continue;
    		if(NIEMHelper.isInformationModelDefaultPurposeConstraint(informationModel1))continue;
    		String targetNamespace1=NIEMHelper.getNamespaceTargetNamespace(informationModel1);
    		if(targetNamespace1==null) continue;// caught by a different validation
        	for(int j=i+1;j<length;j++){
        		Package informationModel2=informationModels[j];
        		if(informationModel2==null)continue;
        		if(NIEMHelper.isInformationModelDefaultPurposeConstraint(informationModel2))continue;
        		String targetNamespace2=NIEMHelper.getNamespaceTargetNamespace(informationModel2);
        		if(targetNamespace2==null) continue;// caught by a different validation
        		if(targetNamespace1.equals(targetNamespace2)){
        			return "targetNamespace "+targetNamespace1+" defined by both "
        					+informationModel1.getQualifiedName()+" and "
        					+informationModel2.getQualifiedName();
        		}
        	}
    	}
    	return null;
    	*/
	 	}
    static public String checkDuplicateNamespaces(Set<Package> modelsToCheck){
    	// get all schemas, check if duplicate namespaces
    	Package informationModels[]=modelsToCheck.toArray(new Package[0]);
    	int length=informationModels.length;
    	for(int i=0;i<length-1;i++){
    		Package informationModel1=informationModels[i];
    		if(informationModel1==null)continue;
    		if(NIEMHelper.isInformationModelDefaultPurposeConstraint(informationModel1))continue;
    		String targetNamespace1=NIEMHelper.getNamespaceTargetNamespace(informationModel1);
    		if(targetNamespace1==null) continue;// caught by a different validation
        	for(int j=i+1;j<length;j++){
        		Package informationModel2=informationModels[j];
        		if(informationModel2==null)continue;
        		if(NIEMHelper.isInformationModelDefaultPurposeConstraint(informationModel2))continue;
        		String targetNamespace2=NIEMHelper.getNamespaceTargetNamespace(informationModel2);
        		if(targetNamespace2==null) continue;// caught by a different validation
        		if(targetNamespace1.equals(targetNamespace2)){
        			return "targetNamespace "+targetNamespace1+" defined by both "
        					+informationModel1.getQualifiedName()+" and "
        					+informationModel2.getQualifiedName();
        		}
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
