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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
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
public class NDR7_14_OtherElementOpeningPhrase extends OpeningPhraseRule
{
	@Override
	protected String getOpeningPhraseMatch() {
		return "(?s)"+"A[n]? .*";
	}

	@Override
	protected String getOpeningPhrase() {
		return "A ";
	}
	/*
Element with a date representation term
"A date..."
Element with a quantity representation term
"A (optional adjective) count/number of..."
Element with an image representation term
"A(n) (optional adjective) image/picture/photograph of..."
Element with an indicator representation term
"True if...; false otherwise/if..."
Element with an identification representation term
"A(n) (optional adjective) identification..."
Element with an ID representation term
"An identifier..."
Element with a status representation term
"A(n) (optional adjective) status/state of..."
Element with a name representation term
"A name of..."
Element with a category text representation term
"A kind of..."
Element with a description text representation term
"A description of..."	 */
	@Override
	protected boolean isComponentClass(Element namedElement) {
		if(Generalization.class.isInstance(namedElement)){
			return NIEMHelper.isRolePlayedBy(namedElement);
		}
		Property property=(Property)namedElement;
//		String name=property.getName();
   	 String name=NameHelper.getNIEMName(property);
		if(isDate(name)
				||isQuantity(name)
				||isImage(name)
				||isIndicator(name)
				||isIdentification(name)
				||isID(name)
				||isStatus(name)
				||isCategory(name)
				||isDescription(name)
				||isName(name)
				)return false;
		Type type=property.getType();
		if(type==null)return false;
		return NIEMHelper.isXSDElement(property)
			&&!NIEMHelper.isAbstractElement(property)
			&&!NIEMHelper.isAssociationType(type)
			&&!NIEMHelper.isAugmentationType((Classifier)type)
			&&!NIEMHelper.isMetadataType(type)
			;
	}
	/*
	protected boolean isIdentification(String name){ 
		return name.endsWith("Quantity")
	}
	protected boolean isStatus(String name){ 
		return name.endsWith("Quantity")
	}
	protected boolean isCategory(String name){ 
		return name.endsWith("Quantity")
	}
	protected boolean isDescription(String name){ 
		return name.endsWith("Quantity")
	}
	*/
	/*
	 representationTerms.add("Amount");
	 representationTerms.add("BinaryObject");
	 representationTerms.add("Graphic");
	 representationTerms.add("Picture");
	 representationTerms.add("Sound");
	 representationTerms.add("Video");
	 representationTerms.add("Code");
	 representationTerms.add("DateTime");
	 representationTerms.add("Date");
	 representationTerms.add("Time");
	 representationTerms.add("ID");
	 representationTerms.add("URI");
	 representationTerms.add("Indicator");
	 representationTerms.add("Measure");
	 representationTerms.add("Numeric");
	 representationTerms.add("Value");
	 representationTerms.add("Rate");
	 representationTerms.add("Percent");
	 representationTerms.add("Text");
	 representationTerms.add("Name");
*/
}
