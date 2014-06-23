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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for The URI of a domain update MUST be a valid URL that adheres to the syntax 
 * defined by the following ABNF [RFC5234] grammar: 
 * url = "http://" publicationDomain "/" domainUpdatePath "/" domainVersionNumber "/" domainUpdateVersionNumber "/" 
 * publicationDomain = "publication.niem.gov" / NEWPUBLICATIONAREA
domainUpdatePath = "niem/update/" domainName 
domainName = "cbrn" / "emergencyManagement" / "familyServices" / "immigration" / "infrastructureProtection" / "intelligence" / "internationalTrade" / "jxdm" / "maritime" / "screening" / NEWDOMAIN 
domainVersionNumber = 1*DIGIT *1("." 1*DIGIT *1("." 1*DIGIT)) 
domainUpdateVersionNumber = 1*DIGIT *1("." 1*DIGIT) *1(("alpha" / "beta" / "rc" / "rev") 1*DIGIT)
 In this grammar NEWDOMAIN is defined as a name for a new domain approved by the NIEM PMO. 
 Also, NEWPUBLICATIONAREA is defined as the Internet domain name or authority of a different (local domain) publication area.
 *
 */
public class DU4_14_MPDURI extends NameValidationRule
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
    	if(!NIEMHelper.isMpdClassCodeDU(mpd))return false;
//    	String mpdBaseURI=NIEMHelper.getMpdBaseURI(mpd);
//    	String mpdVersionID=NIEMHelper.getMpdVersionID(mpd);
    	String mpdURI=NIEMHelper.getMpdURI(mpd);
    	if(mpdURI==null)return true;
    	/*
    	if(!mpdBaseURI.matches("http://[^/]+/niem/update/[^/]+/"))return true;
    	if(!mpdVersionID.matches("\\d[\\.\\d[\\.\\d]?]?/\\d[\\.\\d]?[[alpha|beta|rc|rev]1\\d]?"))return true;
    	    	*/
    	if(!mpdURI.matches("http://[^/]+/niem/update/[^/]+/\\d(\\.\\d(\\.\\d)?)?/\\d(\\.\\d)?((alpha|beta|rc|rev)\\d)?/"))return true;
    	return false;
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
