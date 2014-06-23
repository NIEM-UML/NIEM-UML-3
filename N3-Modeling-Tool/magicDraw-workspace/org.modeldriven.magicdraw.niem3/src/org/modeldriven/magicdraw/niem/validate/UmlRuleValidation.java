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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
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
public class UmlRuleValidation extends BaseValidationRule
{
	// TODO: add this validation for all elements, NIEM-UML warning with message
    /**
     * {@inheritDoc}
     */
    @Override
	protected Collection<? extends Element> getInvalidElements(Constraint constraint,
                                                               Collection<? extends Element> elements)
    {
    	int size=elements.size();
    	int count=0;
    	int statusLineCount=0;
    	setStatusText("NIEM-UML validation start for "+size+" elements");
        Collection<Element> result = new ArrayList<Element>();
        //System.out.println("UmlRuleValidation "+elements);
        long startTime=System.currentTimeMillis();
if(true)// is there a loop in validation?        
        for (Element element : elements)
        {
        	count++;
        	if(!element.isEditable())continue;
        	Package umlPackage=NIEMHelper.getNearestPackage(element);
        	if(umlPackage==null)continue;
        	if("Derived Properties".equals(umlPackage.getName()))continue;
        	if(NIEMHelper.isInPSM(umlPackage))continue;
      	
        	try{
//        		if(element instanceof NamedElement)System.out.println("UmlRuleValidation "+((NamedElement)element).getQualifiedName());
				if(
//						!(element instanceof Enumeration)
//						&& 
//						!(element instanceof EnumerationLiteral)
						
						// TODO test
//						&&!(element instanceof InstanceSpecification)
//						&&!(element instanceof ValueSpecification)
//						&&!(element instanceof Slot)
						
//						&&!(element instanceof Property)
//						&&!(element instanceof Classifier)
//						&&!(element instanceof Package)
//						&&
						!(element instanceof Diagram)
						/*
						(element instanceof Package)
						||(element instanceof Property)
				//		||(element instanceof Classifier)
						||(element instanceof Class)
						||(element instanceof PrimitiveType)
						*/
						){
							statusLineCount--;
							if(statusLineCount<=0){
									setStatusText("NIEM-UML "+count+"/"+size);
									statusLineCount=200;
							}
				        	if(isElementInvalid(element)){
				        		//System.out.println("UmlRuleValidation invalid "+element);
				        		result.add(element);
				        	}
				}
        	}catch(Throwable t){
        		t.printStackTrace();
        	}
        }
       // System.out.println("UmlRuleValidation "+elements.size()+", "+(System.currentTimeMillis()-startTime));
	setStatusText("NIEM-UML validation complete "+(System.currentTimeMillis()-startTime)+" ms");
        return result;
        
    }
    protected boolean isElementInvalid(Element element){
    	return getInvalidMessage(element)!=null;
	 	}
    
    static protected String getInvalidMessage(Element element){
    	// check for constraints
    	Map<Object,Object> context=getContext();//new HashMap<Object,Object>();
    	if(context==null)return null;
    	BasicDiagnostic diagnostics=new BasicDiagnostic();
    	NIEMValidator niemValidator=getNIEMValidator();//new NIEMValidator();
    	if(niemValidator==null)return null;
    	niemValidator.validate(element, diagnostics, context);
    	return logDiagnostics(diagnostics);
	 	}
	static protected String getSeverity(Diagnostic diagnostics){
		if(diagnostics.getSeverity()==Diagnostic.ERROR)return "error";
		else if(diagnostics.getSeverity()==Diagnostic.WARNING)return "warning";
		else return "info";
	}
	static protected String logDiagnostics(Diagnostic diagnostics){
		if((diagnostics.getMessage()!=null)&&(diagnostics.getSeverity()!=Diagnostic.OK)){
			//System.out.println("logDiagnostics "+diagnostics.getMessage()+", "+diagnostics.getSeverity()+", "+Diagnostic.OK);
			return getSeverity(diagnostics)+":"+diagnostics.getMessage();
		}
		for(Diagnostic diagnostic:diagnostics.getChildren()){
			String message=logDiagnostics(diagnostic);
			if(message!=null)return message;
		}
		return null;
	}
    public static String message(Element classifier) {
		return getInvalidMessage(classifier);
    }    

    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
    	return null;// everything
    }
}
