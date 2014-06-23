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
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
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
import java.net.URI;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NDR8_80_DefineTargetNamespace.FixTargetNamespaceAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
An element xs:complexContent MUST have a child xs:extension.
 *
 */
public class NDR8_24_ComplexContentUsesExtension extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addDependencyConfiguration(configMap);
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	if(!NIEMHelper.isInInformationModel(namedElement))return false;
    	// client can not be reference
    	for(NamedElement client:((Realization)namedElement).getClient()){
    		Package informationModel=NIEMHelper.getNearestInformationModel(client);
    		if(informationModel==null)continue;
    		EnumerationLiteral purpose=NIEMHelper.getInformationModelDefaultPurpose(informationModel);
    		if(purpose==null)continue;
    		if(referenceLiteralName.equals(purpose.getName())){
    			// restriction allowed if client is simple type
    			if((client instanceof DataType) && NIEMHelper.isDataTypeSimpleType((DataType)client))continue;
    			return true;
    		}
    	}
    	return false;
	 	}
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixReferenceRestrictionAction action = new FixReferenceRestrictionAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixReferenceRestrictionAction extends FixNameAction implements AnnotationAction
    {

        public FixReferenceRestrictionAction(NamedElement property)
        {
            super(property);
            setName("remove restriction");
        }
        protected void fixName(Element ne){
        	// should we replace with generalization?
//        	ne.dispose();
			 NIEMHelper.removeElement(ne);
        }
    }
    
}
