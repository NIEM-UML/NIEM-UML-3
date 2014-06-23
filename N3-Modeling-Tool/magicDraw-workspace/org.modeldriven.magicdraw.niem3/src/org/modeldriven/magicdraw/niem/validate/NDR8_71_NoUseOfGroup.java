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
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for ModelGroup.
 *
 */
public class NDR8_71_NoUseOfGroup extends NameValidationRule
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
        addPackageAppliedStereotypeConfiguration(configMap);
        addPropertyConfiguration(configMap);
	    return configMap;
	}

    protected boolean isNameInvalid(NamedElement namedElement){
    	Element owner=namedElement.getOwner();
    	Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
    	if(informationModel==null)return false;
    	/*
    	if(!(
    			NIEMHelper.isInformationModelDefaultPurposeExtension(informationModel)
    			||NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)
    			||NIEMHelper.isInformationModelDefaultPurposeReference(informationModel)
    			||NIEMHelper.isInformationModelDefaultPurposeSubset(informationModel)
    			))
    		*/
    	if(NIEMHelper.isConformantExtensionSchemaDocument(informationModel)
    			||NIEMHelper.isConformantReferenceSchemaDocument(informationModel)){
	    	if(Package.class.isInstance(owner)&&modelGroupDefinitionPackageName.equals(((Package)owner).getName())){
	    		return NIEMHelper.isInConformantModel(namedElement);
	    	}
    	}
    	return false;
	 	}


    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixModelGroupAction action = new FixModelGroupAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixModelGroupAction extends FixNameAction implements AnnotationAction
    {

        public FixModelGroupAction(NamedElement property)
        {
            super(property);
            setName("move anonymous model group to schema level");
        }
        protected void fixName(Element ne){
        	Package p=NIEMHelper.getNearestInformationModel(ne);
        	p.getPackagedElement().add((Class)ne);
        }
    }
    
}
