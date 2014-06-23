package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.copypaste.CopyPasting;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for [Rule 6-14] (REF, SUB, EXT)
Within the schema, any element declaration carrying the attribute name MUST appear as an immediate child of the document element xsd:schema.
 *
 */
public class NDR8_30_NoLocalElements extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        //addPropertyConfiguration(configMap);
        
        //addDependencyConfiguration(configMap);
        
        
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig config = new SmartListenerConfig();
        SmartListenerConfig clientConfig=config.listenToNested(PropertyNames.CLIENT);
        SmartListenerConfig supplierConfig=config.listenToNested(PropertyNames.SUPPLIER);
        clientConfig.listenTo(PropertyNames.NAME);
        clientConfig.listenTo(PropertyNames.TYPE);
        clientConfig.listenTo(PropertyNames.AGGREGATION);
        supplierConfig.listenTo(PropertyNames.NAME);
        supplierConfig.listenTo(PropertyNames.TYPE);
        supplierConfig.listenTo(PropertyNames.AGGREGATION);

        configs.add(config);
        configs.add(new SmartListenerConfig(PropertyNames.CLIENT));
        configs.add(new SmartListenerConfig(PropertyNames.SUPPLIER));
        configs.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        configMap.put(Realization.class, configs);
        
        
        // need to look at properties independently, can not be combined with above for applied stereotypes
        return configMap;
    }
    protected boolean isNameInvalid(NamedElement namedElement){
    	return getNameInvalidMessage(namedElement)!=null;
	 	}
    static protected String getNameInvalidMessage(NamedElement namedElement){
    	if(Dependency.class.isInstance(namedElement))return isNameInvalidDependency(namedElement);
    	// this should always be a <<References>>, so we never get here
    	for(Dependency d:namedElement.getClientDependency()){
    		if(NIEMHelper.isReferences(d)){
    			String test= isNameInvalidDependency(d);
    			if(test!=null)return test;
    		}
    	}

    	return null;
	 	}
    public static String message(Realization classifier) {
		return getNameInvalidMessage(classifier);
    }    
    static protected String getKind(Property property){
    	return NIEMHelper.isXSDElement(property)?"element":"attribute";
    }
    static protected String isNameInvalidDependency(NamedElement namedElement){
    	Dependency d=(Dependency)namedElement;
		for(NamedElement client:d.getClient()){
			if(Property.class.isInstance(client)){
				Property clientProperty=(Property)client;
						for(NamedElement ne:d.getSupplier()){
							if(Property.class.isInstance(ne)){
								Property supplierProperty=(Property)ne;
								String message=isNameInvalidProperty( clientProperty, supplierProperty);
								if(message!=null)return message;
							}
						}
			}
		}
		return null;
	 	}
    static public String isNameInvalidProperty(Property clientProperty,Property supplierProperty){
				Type clientType=clientProperty.getType();
				boolean isClientAggregate=!NIEMHelper.isReferenceProperty(clientProperty);
				String clientName=NameHelper.getNIEMName(clientProperty);
			   	 Package clientModel=NIEMHelper.getNearestInformationModel(clientProperty);
			   	 if(clientModel==null)return null;
					if(NIEMHelper.isPropertyHolder(clientType)){
						return "<<References>> Property Client type should not be a <<PropertyHolder>>"; 
					}
			   	 boolean isClientReferenceModel=NIEMHelper.isInformationModelDefaultPurposeReference(clientModel);
				// do not check if for subsetting purposes
			   	 Package supplierModel=NIEMHelper.getNearestInformationModel(supplierProperty);
			   	 if(supplierModel==null)return null;
			   	 boolean isSupplierReferenceModel=NIEMHelper.isInformationModelDefaultPurposeReference(supplierModel);
				if(isSupplierReferenceModel&&!isClientReferenceModel)return null;
				
				Type supplierType=supplierProperty.getType();
				boolean isSupplierAggregate=!NIEMHelper.isReferenceProperty(supplierProperty);
				String supplierName=NameHelper.getNIEMName(supplierProperty);
				if(NIEMHelper.isXSDElement(supplierProperty)!=NIEMHelper.isXSDElement(clientProperty)){
					//setStatusText("<<References>> Property Supplier Kind must match Kind of Client");
					return "<<References>> Property Supplier Kind="+getKind(supplierProperty)+" does not match Client Kind="+getKind(clientProperty);
				}
				if((clientType==null)&&(supplierType!=null))return "<<References>> Property Client is untyped, but Supplier is typed";
				if((clientType!=null)&&!clientType.equals(supplierType))return "<<References>> Property Client does not have same type as Supplier";
				if(isClientAggregate!=isSupplierAggregate)return "<<References>> Property Client Aggregation does not match Supplier Aggreation";
				if(clientName==null)return "<<References>> Property Client name is unset";
				if(!clientName.equals(supplierName))return  "<<References>> Property Client name="+clientName+" does not match Supplier name="+supplierName;
								
		return null;
	 	}

    @Override
    protected Annotation createAnnotation(Element element, Constraint constraint)
    {
    	FixClientPropertyAction action = new FixClientPropertyAction((NamedElement) element);
        return new Annotation(element, constraint, Collections.singletonList(action));
    }
    ///////////////////////////////////////////////
    static public class FixClientPropertyAction extends FixNameAction implements AnnotationAction
    {

        public FixClientPropertyAction(NamedElement property)
        {
            super(property);
            setName("Change client property to match <<References>> property");
        }
        protected void fixName(Element namedElement){
        	if(Dependency.class.isInstance(namedElement)){ fixNameDependency((NamedElement)namedElement);return;}

        	for(Dependency d:((NamedElement)namedElement).getClientDependency()){
        		if(NIEMHelper.isReferences(d)){
        			 fixNameDependency(d);
        			 return;
        		}
        	}

        	return;
        }
        protected void fixNameDependency(NamedElement namedElement){
        	Dependency d=(Dependency)namedElement;
    		for(NamedElement client:d.getClient()){
    			if(Property.class.isInstance(client)){
    				Property clientProperty=(Property)client;
    						for(NamedElement ne:d.getSupplier()){
    							if(Property.class.isInstance(ne)){
    								Property supplierProperty=(Property)ne;
    								Type supplierType=supplierProperty.getType();
    								String supplierName=NameHelper.getNIEMName(supplierProperty);
    								clientProperty.setType(supplierType);
    								clientProperty.setName(supplierName);
    								clientProperty.setAggregation(supplierProperty.getAggregation());
    								if(NIEMHelper.isXSDElement(supplierProperty)!=NIEMHelper.isXSDElement(clientProperty)){
    									CopyPasting.copyPasteElement(supplierProperty.getAppliedStereotypeInstance(),clientProperty);
    								}
    							}
    						}
    			}
    		}
        }
    }
    
}
