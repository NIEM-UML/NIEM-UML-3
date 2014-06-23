/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author Tom
 *
 */
public class AugmentsDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public AugmentsDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		// for inverse, specific may be null
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
		if((specificElement==null)&&(generalElement==null))return false;
		if(specificElement!=null){
			String metaClassName=specificElement.eClass().getName();
			if(!"Class".equals(metaClassName)){
				setStatusText("Specific must be a Class");
				return false;
			}
			if(!isSpecificClassifierAllowed(specificElement))return false;
			if(!(isInInformationModel(specificElement))){
				setStatusText("Specific must be in an <<InformationModel>> ");
				return false;
			}
		}
		//if(generalElement==null)return true;
		if(generalElement!=null){
			if(!NIEMHelper.canBeAugmentsSupplier(generalElement)){
				setStatusText("general of an <<Augments>> can not be <<Choice>>,<<PropertyHolder>>; must be in an <<InformationModel>>");
				return false;

			}
			/*
			if(!isGeneralClassifierAllowed(generalElement))return false;
			if(!(isInInformationModel(generalElement))){
				setStatusText("General must be in an <<InformationModel>> ");
				return false;
			}
			*/
			String generalMetaClassName=generalElement.eClass().getName();
			if(specificElement!=null){
				String specificMetaClassName=specificElement.eClass().getName();
				if(!generalMetaClassName.equals(specificMetaClassName)){
					setStatusText("Client and Supplier must be same Meta-Type");
					return false;
				}
				// now do NIEM checking
					Classifier generalClassifier=(Classifier)generalElement;
					Classifier specificClassifier=(Classifier)specificElement;
			}
		}
		return true;
	}
	protected boolean isSpecificClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
			setStatusText("<<MetaType>> can not be specific of an <<Augments>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName))){
			setStatusText("<<AdapterType>> can not be specific of an <<Augments>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be specific of an <<Augments>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName))){
			setStatusText("<<ObjectType>> can not be specific of an <<Augments>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be specific of an <<Augments>>");
			return false;
		}
		if(Type.class.isInstance(specificElement)&&NIEMHelper.isAssociationType((Type)specificElement)){
			setStatusText("<<AssociationType>> can not be specific of an <<Augments>>");
			return false;
		}
		return true;
	}
	/*
	protected boolean isGeneralClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be general of an <<Augments>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be general of an <<Augments>>");
			return false;
		}
		return true;
	}
	*/
}
