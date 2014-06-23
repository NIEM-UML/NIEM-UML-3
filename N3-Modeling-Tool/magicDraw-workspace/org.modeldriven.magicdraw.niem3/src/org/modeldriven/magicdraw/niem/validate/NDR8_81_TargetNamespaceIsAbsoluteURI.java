package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
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
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for 
 * [Rule 6-36] (REF, SUB, EXT, CON)
Within the schema, the value of the required attribute targetNamespace on the document element xsd:schema 
MUST match the production <absolute-URI> as defined by [RFC3986].
 *
 */
public class NDR8_81_TargetNamespaceIsAbsoluteURI extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addPackageAppliedStereotypeConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	Package informationModel=(Package)namedElement;
    	if(!NIEMHelper.isInformationModel(informationModel))return null;
    	if(!NIEMHelper.getNamespaceIsConformant(informationModel))return null;
    	// check if profile applied
    	Profile pimProfile=NIEMHelper.getPimProfile();
    	if(!NIEMHelper.isProfileApplied(informationModel, pimProfile)){
    		return "<<InformationModel>> must be contained by Package with applied Profile "+PimProfileName;
    	}
    	for(Profile profile:StereotypesHelper.getAppliedProfiles(informationModel)){
    		if(pimProfile.equals(profile)){
    			return "<<InformationModel>> should not have applied Profile "+PimProfileName+" : it should be in a nesting Package";
    		}
    	}
    	
   	 //if(!NIEMHelper.getNamespaceIsConformant(informationModel))return null;
    	String targetNamespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
    	if(targetNamespace==null)return "targetNamespace is undefined";
    	if(targetNamespace.length()==0)return "targetNamespace is empty";
    	try{
    		URI uri=new URI(targetNamespace);
    		if(!uri.isAbsolute())return targetNamespace+" is not an Absolute URI";
    		if(uri.getAuthority()==null)return targetNamespace+" does not include an Authority";
    	}catch(Throwable t){
    		return  targetNamespace+" " +
    				"is syntactically incorrect: "+t;
    	}

    	// get all schemas, check if duplicate namespaces
    	/* sufficient to check classifiers
		Set<Package> infoModels=new HashSet<Package>();
		NIEMHelper.findAllInformationModelsReferenced(informationModel,infoModels,new HashSet<NamedElement>());
		return MPDCoherence.checkDuplicateNamespaces(infoModels);
		*/
    	return null;
	 	}

    public static String message(Package classifier) {
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
