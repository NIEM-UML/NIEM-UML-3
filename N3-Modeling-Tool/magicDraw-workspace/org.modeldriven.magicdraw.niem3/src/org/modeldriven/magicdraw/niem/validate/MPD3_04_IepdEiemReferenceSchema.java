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
 * A NIEM-conforming IEPD or EIEM MUST contain at least one schema that is 
 * either a NIEM reference schema or a subset derived from a NIEM reference schema.
 *
 */
public class MPD3_04_IepdEiemReferenceSchema extends NameValidationRule
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
    	/*
    	Component mpd=(Component)namedElement;
    	if(!(NIEMHelper.isMpdClassCodeIEPD(mpd)||NIEMHelper.isMpdClassCodeEIEM(mpd)))return false;
    	// gather all schemas
    	Set<Package> allSchemas=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd);
    	for(Package p:allSchemas){
    		if(NIEMHelper.isInformationModelDefaultPurposeReference(p)
    				||NIEMHelper.isInformationModelDefaultPurposeSubset(p))return false;
    	}
    	return true;
    	*/
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	Component mpd=(Component)namedElement;
//    	if(!(NIEMHelper.isMpdClassCodeIEPD(mpd)||NIEMHelper.isMpdClassCodeEIEM(mpd)))return null;
    	String mpdClassCodeName=NIEMHelper.getMpdClassCode(mpd).getName();
    	boolean isIepd=NIEMHelper.isMpdClassCodeIEPD(mpd);
    	boolean isEiem=NIEMHelper.isMpdClassCodeEIEM(mpd);
    	boolean isIepdOrEiem=isIepd||isEiem;
    	// gather all schemas
    	boolean hasExchangeSchema=false;
    	boolean hasReferenceOrSubsetSchema=false;
    	Set<Package> allSchemas=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd);
    	if(allSchemas.isEmpty()){
    		// as in a PSM
    		return null;
    	}
    	for(Package p:allSchemas){
    		boolean isReference=NIEMHelper.isInformationModelDefaultPurposeReference(p);
    		if(isIepdOrEiem){
	    		if(isReference
	    				||NIEMHelper.isInformationModelDefaultPurposeSubset(p)){
	    			hasReferenceOrSubsetSchema=true;
	    		}
	    		boolean isExchange=NIEMHelper.isInformationModelDefaultPurposeExchange(p);
	    		if(isExchange){
		    		if(isIepd){
		    			hasExchangeSchema=true;
		    		}else{
		    			return mpdClassCodeName+" must NOT contain an exchange schema : "+p.getQualifiedName();
		    		}
	    		}
    		}else{
    			if(!isReference){
	    			return mpdClassCodeName+" must only contain reference schemas : "+p.getQualifiedName();
    			}
    			hasReferenceOrSubsetSchema=true;
    		}
    	}
    	if(isIepdOrEiem){
        	if(!hasReferenceOrSubsetSchema){
    		return mpdClassCodeName+" must contain a reference or subset schema";
        	}
        	if(isIepd&&!hasExchangeSchema){
        		return mpdClassCodeName+" must contain an exchange schema";
        	}
    	}else
    	if(!hasReferenceOrSubsetSchema){
    		return mpdClassCodeName+" must contain at least one reference schema";
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
