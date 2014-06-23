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

import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for ObjectType name.
 *
 */
public class NDR8_12_NoUnionItemTypeOfxs_ID extends NameValidationRule
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
	 	if(!DataType.class.isInstance(namedElement)){return false;}
	   	 if(!NIEMHelper.isInInformationModel(namedElement))return false;
	   	 if(!NIEMHelper.isUnion(namedElement))return false;
			for(Classifier classifier:NIEMHelper.getUnionOfMembers((DataType)namedElement)){
				if(classifier instanceof DataType){
					if( isItemInvalid((DataType)classifier))return true;
				}
			}
	   	 
	   	 return false;
    }
    protected boolean isItemInvalid(DataType ne){
    	if(!NIEMHelper.isXMLPrimitiveTypesLibrary(NIEMHelper.getNearestPackage(ne)))return false;
    	return(getBaseTested().equals(ne.getName()));
    }
    protected String getBaseTested(){return "ID";}
    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixAnySimpleTypeAction action = new FixAnySimpleTypeAction((NamedElement) element,getBaseTested());
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixAnySimpleTypeAction extends FixNameAction implements AnnotationAction
    {
    	protected String baseTested=null;
        public FixAnySimpleTypeAction(NamedElement property,String baseTested)
        {
            super(property);
            this.baseTested=baseTested;
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
        
        protected boolean isItemInvalid(DataType ne){
        	if(!NIEMHelper.isXMLPrimitiveTypesLibrary(NIEMHelper.getNearestPackage(ne)))return false;
        	return baseTested.equals(ne.getName());
        }
        protected void fixName(Element ne){
			for(Dependency dependency:((NamedElement)ne).getClientDependency()){
				if(NIEMHelper.isUnionOf(dependency)
						){
					List<NamedElement> toBeRemoved=new Vector<NamedElement>();
					Set<NamedElement> toBeAdded=new HashSet<NamedElement>();
					for(NamedElement supplier:dependency.getSupplier()){
						if(DataType.class.isInstance(supplier)){
							if( isItemInvalid((DataType)supplier)){
								toBeRemoved.add(supplier);
								toBeAdded.add(getStringType((DataType)supplier));
							}
						}
					}
					dependency.getSupplier().removeAll(toBeRemoved);
					dependency.getSupplier().addAll(toBeAdded);
				}
			}
        	
        }
    }
    
}
