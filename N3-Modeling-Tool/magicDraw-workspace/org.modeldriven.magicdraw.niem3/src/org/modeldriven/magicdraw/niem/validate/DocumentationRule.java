package org.modeldriven.magicdraw.niem.validate;

import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.utils.MDLog;
import com.nomagic.magicdraw.validation.DefaultValidationRuleImpl;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.impl.PropertyNames;

import java.awt.event.ActionEvent;
import java.util.*;
import java.util.regex.Pattern;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NDR8_80_DefineTargetNamespace.FixTargetNamespaceAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixNameAction;

/**
 * Validation rule for ObjectType name.
 *
 */
abstract public class DocumentationRule extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	protected Collection<? extends Element> getInvalidElements(Constraint constraint,
                                                               Collection<? extends Element> elements)
    {
        Collection<Element> result = new ArrayList<Element>();
        for (Element element : elements)
        {
        	//if(!NamedElement.class.isInstance(element))continue;
        	if(!element.isEditable())continue;
        	try{
//        	if(isNameInvalid((NamedElement)element))result.add(element);
        	if(isElementInvalid(element))result.add(element);
        	}catch(Throwable t){
        		t.printStackTrace();
        	}
        }
        return result;
    }
    abstract protected boolean isElementInvalid(Element namedElement);
    protected boolean isNameInvalid(NamedElement namedElement){return false;}
	
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
//        SmartListenerConfig documentationConfig=new SmartListenerConfig("ownedComment");
//        configs.add(documentationConfig);
        SmartListenerConfig config = new SmartListenerConfig();
        SmartListenerConfig commentConfig=config.listenToNested(PropertyNames.OWNED_COMMENT);
        commentConfig.listenTo(PropertyNames.BODY);
        configs.add(config);
        
        
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization.class, configs);
        /*
        Collection<SmartListenerConfig> configs2 = new ArrayList<SmartListenerConfig>();
        SmartListenerConfig documentationConfig2=new SmartListenerConfig("body");
        configs2.add(documentationConfig2);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment.class, configs2);
        */
        return configMap;
    }
    protected boolean isDataDefinitionInvalid(Element namedElement){
 		return isDataDefinitionInvalidBase(namedElement);
     }
    protected boolean isDataDefinitionElementInvalid(Element namedElement){
 		if(!isOwnerNamespace(namedElement))return false;
		if(!NIEMHelper.isInformationModelDefaultPurposeExtensionOrReference(NIEMHelper.getNearestInformationModel(namedElement)))return false;
    	if(!NIEMHelper.getNamespaceIsConformant(NIEMHelper.getNearestInformationModel(namedElement)))return false;
		if(NIEMHelper.isLocalVocabulary(namedElement))return false;
 		return isDataDefinitionInvalid(namedElement);
     }
    
    protected boolean isDataDefinitionInvalidBase(Element namedElement){
 		return namedElement.getOwnedComment().isEmpty();
     }
    protected boolean isDataDefinitionEmpty(Element namedElement){
    	if(isDataDefinitionInvalidBase(namedElement))return true;
    	boolean hasBody=false;
 		for(Comment comment:namedElement.getOwnedComment()){
 			String body=comment.getBody();
 			if((body!=null)&&(body.length()>0)){
 				hasBody=true;
 				break;
 			}
 		}
 		return !hasBody;
     }

    /**
     * {@inheritDoc}
     */
    @Override
     protected Annotation createAnnotation(Element element, Constraint constraint)
     {
//     	FixDocumentationAction action = new FixDocumentationAction((NamedElement) element);
     	FixDocumentationAction action = new FixDocumentationAction( element);
         return new Annotation(element, constraint, Collections.singletonList(action));
     }
     ///////////////////////////////////////////////
     static public class FixDocumentationAction extends FixNameAction implements AnnotationAction
     {

//         public FixDocumentationAction(NamedElement property)
         public FixDocumentationAction(Element property)
         {
             super(property);
             this.setName("Add Comment");
         }
         protected void fixName(Element ne){
        	 NIEMHelper.addComment(ne);
         }
     }
    
}
