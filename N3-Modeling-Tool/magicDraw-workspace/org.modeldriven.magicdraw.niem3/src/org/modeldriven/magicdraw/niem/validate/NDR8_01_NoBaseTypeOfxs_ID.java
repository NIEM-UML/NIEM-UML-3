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
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
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
 * Validation rule for ObjectType name.
 *
 */
public class NDR8_01_NoBaseTypeOfxs_ID extends NameValidationRule
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
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
	 	if(!Classifier.class.isInstance(namedElement)){return false;}
	   	 if(!NIEMHelper.isInInformationModel(namedElement))return false;
	   	Classifier dataType=(Classifier)namedElement;
		Classifier baseType=NIEMHelper.getBaseClassifier(dataType);
		if(baseType!=null){
			return isBaseInvalid(baseType);
		}
	   	 return false;
    }
    protected boolean isBaseInvalid(NamedElement ne){
    	if(!PrimitiveType.class.isInstance(ne))return false;
    	if(!NIEMHelper.isXMLPrimitiveTypesLibrary(NIEMHelper.getNearestPackage(ne)))return false;
    	return(getBaseTested().equals(ne.getName()));
    }
    protected String getBaseTested(){return "ID";}
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixAnySimpleTypeAction action = new FixAnySimpleTypeAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixAnySimpleTypeAction extends FixNameAction implements AnnotationAction
    {

        public FixAnySimpleTypeAction(NamedElement property)
        {
            super(property);
            setName("Change type to String");
        }
        protected PrimitiveType getStringType(NamedElement anySimpleType){
        	for(Type pe:NIEMHelper.getNearestPackage(anySimpleType).getOwnedType()){
        		if("string".equals(pe.getName()))return (PrimitiveType)pe;
        	}
        	return null;
        }
        static protected boolean isXmlPrimitiveType(NamedElement ne){
        	if(!PrimitiveType.class.isInstance(ne))return false;
        	return(NIEMHelper.isXMLPrimitiveTypesLibrary(NIEMHelper.getNearestPackage(ne)));
        }
        
        protected void fixName(Element ne){
    	 	if(PrimitiveType.class.isInstance(namedElement)){
    	 		for(Generalization generalization:NIEMHelper.getGeneralization((PrimitiveType)namedElement)){
    	 			Classifier general=generalization.getGeneral();
    		 		if(isXmlPrimitiveType(general)){
    		 			generalization.setGeneral(getStringType(general));
    		 		}
    	 			
    	 		}
    	 	}
    	 	for(Dependency dependency:((NamedElement)namedElement).getClientDependency()){
    	 		List<NamedElement> suppliers=new Vector<NamedElement>(dependency.getSupplier());
    	 		for(NamedElement supplier:suppliers){
    		 		if(isXmlPrimitiveType(supplier)){
    		 			dependency.getSupplier().remove(supplier);
    		 			dependency.getSupplier().add(getStringType(supplier));
    		 		}
    	 		}
    	 	}
        	
        }
    }
    
}
