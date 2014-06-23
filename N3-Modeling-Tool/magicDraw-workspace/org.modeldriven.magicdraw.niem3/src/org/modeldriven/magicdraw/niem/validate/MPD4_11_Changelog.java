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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
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
 * Validation rule for:
 *[Rule 4-12] Every MPD that is an IEPD or EIEM MUST contain a change log artifact that: 
 *• Records changes to previous IEPD or EIEM schemas that this MPD represents. 
 *• Begins with the substring "changelog". 
 *• Resides in the root directory of the MPD.
 *
 */
public class MPD4_11_Changelog extends NameValidationRule
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
//        addPropertyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}

    static protected String getNameInvalidMessage(NamedElement namedElement){
    	Component mpd=(Component)namedElement;
    	// find the changelog
		// if not profiled as pim, do nothing
		Profile pimProfile=NIEMHelper.getPimProfile();
		if(pimProfile==null)return null;
		boolean isPim=NIEMHelper.isProfileApplied(namedElement, pimProfile);
		if(!isPim)return null;
    	if(NIEMHelper.getChangelog(mpd)==null)return "no changelog";
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
