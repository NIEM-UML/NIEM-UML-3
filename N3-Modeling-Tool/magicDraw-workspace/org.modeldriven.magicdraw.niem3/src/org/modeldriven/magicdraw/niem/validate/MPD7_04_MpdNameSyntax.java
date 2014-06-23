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
 * An MPD archive file MUST use file name syntax defined by the regular expression: 
 * mpd-filename ::= name '-' version '.' class '.zip' 
 * Where: name ::= alphanum ((alphanum | special)* alphanum)?
 * alphanum ::= [a-zA-Z0-9] 
 * special ::= '.' | '-' | '_' 
 * version  ::= digit+ ('.' digit+)* (status digit+)?
 * All alpha characters SHOULD be lower case to reduce the risk of complications across various file systems.
 *
 */
public class MPD7_04_MpdNameSyntax extends NameValidationRule
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
    	Component mpd=(Component)namedElement;
    	String name=mpd.getName();
//    	return !name.matches("[a-z0-9][[a-z0-9|\\.|\\-|_]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[[a-z0-9]|\\.|\\-|_]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[[a-z0-9]|.|-|_]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[[a-z0-9]|_]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[[a-z0-9]|A]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[a-z0-9_]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[a-z0-9]*?[a-z0-9]]?");
//    	return !name.matches("[a-z0-9][[a-z0-9]*[a-z0-9]]?");
//    	return !name.matches("[a-z0-9]([a-z0-9]*[a-z0-9])?");
    	return !name.matches("[a-z0-9](([a-z0-9]|\\.|\\-|_)*[a-z0-9])?");
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
