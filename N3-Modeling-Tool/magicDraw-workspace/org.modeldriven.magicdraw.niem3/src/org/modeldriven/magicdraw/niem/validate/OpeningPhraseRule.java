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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
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
abstract public class OpeningPhraseRule extends NameValidationRule
{
    /**
     * {@inheritDoc}
     */
    @Override
	public Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> getListenerConfigurations()
    {
        Map<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>> configMap =
                new HashMap<java.lang.Class<? extends Element>, Collection<SmartListenerConfig>>();
        
        Collection<SmartListenerConfig> configs = new ArrayList<SmartListenerConfig>();
        //SmartListenerConfig documentationConfig=new SmartListenerConfig("ownedComment");
        //configs.add(documentationConfig);

        SmartListenerConfig config = new SmartListenerConfig();
        SmartListenerConfig commentConfig=config.listenToNested(PropertyNames.OWNED_COMMENT);
        commentConfig.listenTo(PropertyNames.BODY);
        configs.add(config);
        
        
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType.class, configs);
        configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType.class, configs);
        //configMap.put(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class, configs);
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
    protected boolean isNameInvalid(NamedElement namedElement){return false;}

    protected boolean isElementInvalid(Element namedElement){
//  		if(!isOwnerNamespace(namedElement))return false;
    	Package informationModel=NIEMHelper.getNearestInformationModel(namedElement);
    	if(informationModel==null)return false;
  		//if(!NIEMHelper.isInInformationModel(namedElement))return false;
  		if(!isComponentClass(namedElement))return false;
    	if(!NIEMHelper.getNamespaceIsConformant(informationModel))return false;
		if(!NIEMHelper.isInformationModelDefaultPurposeExtensionOrReference(informationModel))return false;
  		Comment comment=getDocumentationComment(namedElement);
  		if(comment==null)return false;// condition checked by other rules
  		if(!isOpeningPhraseValid(comment.getBody()))return true;
  		return false;
     }
    protected boolean isOpeningPhraseValid(String body){
    	if(body==null)return false;
    	return body.matches(getOpeningPhraseMatch());
        
    }
	protected String getOpeningPhraseMatch() {
		return "(?s)"+getOpeningPhrase()+".*";
	}
    
    abstract protected String getOpeningPhrase(); 
    abstract protected boolean isComponentClass(Element namedElement); 
     @Override
     protected Annotation createAnnotation(Element element, Constraint constraint)
     {
//     	FixOpeningPhraseAction action = new FixOpeningPhraseAction((NamedElement) element,getOpeningPhrase());
     	FixOpeningPhraseAction action = new FixOpeningPhraseAction( element,getOpeningPhrase());
         return new Annotation(element, constraint, Collections.singletonList(action));
     }
     static protected Comment getDocumentationComment(Element ne){
    	Comment firstComment=null;
		Stereotype stereotype=NIEMHelper.getCommonStereotype(DocumentationStereotypeName);
    	for(Comment comment:ne.getOwnedComment()){
    		if(firstComment==null)firstComment=comment;
    		if(stereotype==null)continue;
    		if(NIEMHelper.hasStereotype(comment, stereotype)){
    			return comment;
    		}
    	}
    	return firstComment;
     }
 	protected boolean isQuantity(String name){ 
		return name.endsWith("Quantity");
	}
	protected boolean isImage(String name){ 
		return name.endsWith("Graphic")||name.endsWith("Picture")||name.endsWith("Video");
	}
	protected boolean isIndicator(String name){ 
		return name.endsWith("Indicator");
	}
	protected boolean isIdentification(String name){ 
		return name.endsWith("Identification");
	}
	protected boolean isStatus(String name){ 
		return name.endsWith("Status");
	}
	protected boolean isName(String name){ 
		return name.endsWith("Name");
	}
	protected boolean isCategory(String name){ 
		return name.endsWith("Category")||name.endsWith("CategoryText");
	}
	protected boolean isDescription(String name){ 
		return name.endsWith("Description")||name.endsWith("DescriptionText");
	}
	protected boolean isID(String name){ 
		return name.endsWith("ID");
	}
	protected boolean isDate(String name){ 
//		return name.endsWith("DateTime")||name.endsWith("Date")||name.endsWith("Time")||name.endsWith("Duration");
		return name.endsWith("Date");
	}
     
     ///////////////////////////////////////////////
     static public class FixOpeningPhraseAction extends FixNameAction implements AnnotationAction
     {
    	 protected String openingPhrase=null;
//         public FixOpeningPhraseAction(NamedElement property,String openingPhraseIn)
         public FixOpeningPhraseAction(Element property,String openingPhraseIn)
         {
             super(property);
             setName("Add Opening Phrase");
             openingPhrase=openingPhraseIn;
         }
         
         protected void fixName(Element ne){
       		Comment comment=getDocumentationComment(ne);
        	comment.setBody(openingPhrase+comment.getBody());
         }
     }
    
}
