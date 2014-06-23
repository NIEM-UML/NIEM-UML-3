/**
 * 
 */
package org.modeldriven.magicdraw.niem.validate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralReal;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.impl.PropertyNames;

/**
 * @author Tom
 *
 */
public class BaseValidationRule extends DefaultValidationRuleImpl implements NIEM_ProfileConstants{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
        return configMap;
    }
    protected boolean isOwnerNamespace(Element element){
		Element owner=element.getOwner();
		if((owner!=null)
				&&(
//						NIEMHelper.hasStereotype(element, NIEMHelper.getPimStereotype(InformationModelStereotypeName))||
						NIEMHelper.isNamespacePackage(owner)
				)
				){
			return true;
		}
		return false;
    }
    /*
	public void addPropertyNameConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
    }
    */
	public void addInstanceSpecificationConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configs.add(new SmartListenerConfig(PropertyNames.SLOT));
        configs.add(new SmartListenerConfig("instanceValueOfInstance"));
        configMap.put(InstanceSpecification.class, configs);
    }
	public void addSlotConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(new SmartListenerConfig(PropertyNames.DEFINING_FEATURE));
        configs.add(new SmartListenerConfig(PropertyNames.OWNING_INSTANCE));
        configs.add(new SmartListenerConfig(PropertyNames.VALUE));
        configMap.put(Slot.class, configs);
    }
	public void addValueSpecificationConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(new SmartListenerConfig(PropertyNames.OWNING_SLOT));
        configs.add(new SmartListenerConfig(PropertyNames.INSTANCE));
        configs.add(new SmartListenerConfig(PropertyNames.VALUE));
        LiteralUnlimitedNatural x;
        configMap.put(ValueSpecification.class, configs);
        configMap.put(InstanceValue.class, configs);
        configMap.put(LiteralBoolean.class, configs);
        configMap.put(LiteralInteger.class, configs);
        configMap.put(LiteralString.class, configs);
        configMap.put(LiteralReal.class, configs);
        configMap.put( LiteralUnlimitedNatural.class, configs);
    }
	public void addPropertyConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        SmartListenerConfig documentationConfig=new SmartListenerConfig("aggregation");
        configs.add(documentationConfig);
        configs.add(new SmartListenerConfig("type"));
        configs.add(new SmartListenerConfig(PropertyNames.ASSOCIATION));
        configs.add(new SmartListenerConfig(PropertyNames.NAMESPACE));
        
        SmartListenerConfig config2 = new SmartListenerConfig();
        configs.add(config2);
        SmartListenerConfig lowerValueConfig=config2.listenToNested(PropertyNames.LOWER_VALUE);
        lowerValueConfig.listenTo(PropertyNames.VALUE);
        SmartListenerConfig config3 = new SmartListenerConfig();
        configs.add(config3);
        SmartListenerConfig upperValueConfig=config3.listenToNested(PropertyNames.UPPER_VALUE);
        upperValueConfig.listenTo(PropertyNames.VALUE);

        configs.add(new SmartListenerConfig(PropertyNames.LOWER_VALUE));
        configs.add(new SmartListenerConfig(PropertyNames.UPPER_VALUE));
        configs.add(new SmartListenerConfig(PropertyNames.LOWER));
        configs.add(new SmartListenerConfig(PropertyNames.UPPER));
        //configs.add(new SmartListenerConfig(PropertyNames.MU));
        
        configs.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        SmartListenerConfig config = new SmartListenerConfig();
        config.listenTo(PropertyNames.APPLIED_STEREOTYPE_INSTANCE,SmartListenerConfig.STEREOTYPE_AND_TAGS_INSTANCE_SPECIFICATION_CONFIG);
        configs.add(config);

        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
    }
	public void addGeneralizationConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
		/*
        Collection<SmartListenerConfig> configs2 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig2=new SmartListenerConfig("generalization");
        configs2.add(documentationConfig2);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs2);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs2);
        configMap.put(AssociationClass.class, configs2);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs2);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs2)
        ;
    */
        Collection<SmartListenerConfig> configs3 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig3=new SmartListenerConfig("specific");
        SmartListenerConfig documentationConfig3a=new SmartListenerConfig("general");
        configs3.add(documentationConfig3);
        configs3.add(documentationConfig3a);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization.class, configs3);
    }
	public void addDependencyConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs3 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig3=new SmartListenerConfig("supplier");
        SmartListenerConfig documentationConfig3a=new SmartListenerConfig("client");
        configs3.add(documentationConfig3);
        configs3.add(documentationConfig3a);
        configs3.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        SmartListenerConfig config = new SmartListenerConfig();
        config.listenTo(PropertyNames.APPLIED_STEREOTYPE_INSTANCE,SmartListenerConfig.STEREOTYPE_AND_TAGS_INSTANCE_SPECIFICATION_CONFIG);
        configs3.add(config);
        
        configMap.put(Dependency.class, configs3);
        configMap.put(Realization.class, configs3);
        configMap.put(Usage.class, configs3);
    }
	/*
	public void addClassAppliedStereotypeConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs3 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig3=SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG;
        configs3.add(documentationConfig3);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs3);
    }

	public void addPropertyAppliedStereotypeConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs3 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig3=SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG;
        configs3.add(documentationConfig3);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs3);
    }

	public void addValueSpecificationConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.VALUE_SPECIFICATION_CONFIG);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralString.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralBoolean.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger.class, configs);
    }
    */
	public void addComponentAppliedStereotypeConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        SmartListenerConfig config = new SmartListenerConfig();
        config.listenTo(PropertyNames.APPLIED_STEREOTYPE_INSTANCE,SmartListenerConfig.STEREOTYPE_AND_TAGS_INSTANCE_SPECIFICATION_CONFIG);
        configs.add(config);
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configs.add(new SmartListenerConfig(PropertyNames.NAMESPACE));

        configMap.put(Component.class, configs);
    }
	public void addClassifierAppliedStereotypeConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        SmartListenerConfig config = new SmartListenerConfig();
        config.listenTo(PropertyNames.APPLIED_STEREOTYPE_INSTANCE,SmartListenerConfig.STEREOTYPE_AND_TAGS_INSTANCE_SPECIFICATION_CONFIG);
        configs.add(config);
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configs.add(new SmartListenerConfig(PropertyNames.NAMESPACE));
        configs.add(new SmartListenerConfig(PropertyNames.CLIENT_DEPENDENCY));
        configs.add(new SmartListenerConfig(PropertyNames.GENERALIZATION));
        SmartListenerConfig generalizationConfig=config.listenToNested(PropertyNames.GENERALIZATION);
        generalizationConfig.listenTo(PropertyNames.GENERAL);

        // following listeners for cardinality change are not triggering a validation???
        SmartListenerConfig config2a = new SmartListenerConfig();
        SmartListenerConfig propertyConfig=config2a.listenToNested(PropertyNames.ATTRIBUTE);
        SmartListenerConfig lowerValueConfig=propertyConfig.listenToNested(PropertyNames.LOWER_VALUE);
        lowerValueConfig.listenTo(PropertyNames.VALUE);
        configs.add(config2a);
        
        SmartListenerConfig config3a = new SmartListenerConfig();
        SmartListenerConfig propertyConfig3=config3a.listenToNested(PropertyNames.ATTRIBUTE);
        SmartListenerConfig upperValueConfig=propertyConfig3.listenToNested(PropertyNames.UPPER_VALUE);
        upperValueConfig.listenTo(PropertyNames.VALUE);
        configs.add(config3a);

        configMap.put(Class.class, configs);
        configMap.put(AssociationClass.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);

    }
	public void addPackageAppliedStereotypeConfiguration(Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap)
    {
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.APPLIED_STEREOTYPE_CONFIG);
        SmartListenerConfig config = new SmartListenerConfig();
        config.listenTo(PropertyNames.APPLIED_STEREOTYPE_INSTANCE,SmartListenerConfig.STEREOTYPE_AND_TAGS_INSTANCE_SPECIFICATION_CONFIG);
        configs.add(config);
        configs.add(new SmartListenerConfig(PropertyNames.NAMESPACE));
        configMap.put(Package.class, configs);
    }
    static protected Map<Object,Object> getContext(){
    	ProjectCache projectCache=ProjectCache.getProjectCache();
    	if(projectCache==null)return null;
    	return projectCache.getValidationContext();
    }
    static public NIEMValidator getNIEMValidator(){
    	ProjectCache projectCache=ProjectCache.getProjectCache();
    	if(projectCache==null)return null;
    	return projectCache.getNIEMValidator();
    }
	protected void setStatusText(String text){
		Application.getInstance().getMainFrame().getStatusLine().setText(text);
	}
    
}
