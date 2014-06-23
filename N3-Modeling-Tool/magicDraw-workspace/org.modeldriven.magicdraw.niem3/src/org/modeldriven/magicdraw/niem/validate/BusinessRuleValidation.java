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
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.instance.InstanceHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameSuffixAction;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;

/**
 * Validation rule for ObjectType name.
 *
 */
public class BusinessRuleValidation extends BaseValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	protected Collection<? extends Element> getInvalidElements(Constraint constraint,
                                                               Collection<? extends Element> elements)
    {
    	//System.out.println("BusinessRuleValidation "+constraint.getQualifiedName()+", "+elements.size());
    	//return super.getInvalidElements(constraint, elements);
    	
        Collection<Element> result = new ArrayList<Element>();
        for (Element element : elements)
        {
        	//if(!NamedElement.class.isInstance(element))continue;
        	if(!element.isEditable())continue;
        	if(!(element instanceof InstanceSpecification))continue;
        	InstanceSpecification instanceSpecification=(InstanceSpecification)element;
        	try{
//        	if(isNameInvalid((NamedElement)element))result.add(element);
        	if(isInstanceSpecificationInvalid(constraint,instanceSpecification)){
            	//System.out.println("BusinessRuleValidation invalid "+constraint.getQualifiedName()+", "+instanceSpecification.getQualifiedName());
        		result.add(instanceSpecification);
        	}
        	}catch(Throwable t){
        		t.printStackTrace();
        	}
        }
        return result;
        
    }
    protected boolean isInstanceSpecificationInvalid(Constraint constraint,InstanceSpecification instanceSpecification){
    	// check for constraints
    	Map<Object,Object> context=getContext();//new HashMap<Object,Object>();
    	if(context==null)return false;
    	BasicDiagnostic diagnostics=new BasicDiagnostic();
    	NIEMValidator niemValidator=getNIEMValidator();//new NIEMValidator();
    	if(niemValidator==null)return false;
    	niemValidator.validateInstanceSpecificationConstraints(constraint,instanceSpecification,diagnostics,context);
    	return logDiagnostics(diagnostics);
	 	}
	
    
	 protected boolean logDiagnostics(Diagnostic diagnostics){
		if((diagnostics.getMessage()!=null)&&(diagnostics.getSeverity()!=Diagnostic.OK)){
			//System.out.println("logDiagnostics "+diagnostics.getMessage()+", "+diagnostics.getSeverity()+", "+Diagnostic.OK);
			return true;
		}
		for(Diagnostic diagnostic:diagnostics.getChildren()){
			boolean message=logDiagnostics(diagnostic);
			if(message)return message;
		}
		return false;
	}
    
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        addInstanceSpecificationConfiguration(configMap);
        //addSlotConfiguration(configMap);
        //addValueSpecificationConfiguration(configMap);
      
        return configMap;
    }
}
