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
public class RolePlayedByDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public RolePlayedByDecoratorAdapter(PathRenderer arg0) {
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
				setStatusText("<<RolePlayedBy>> Specific must be a Class");
				return false;
			}
			if(!isSpecificClassifierAllowed(specificElement))return false;
			if(!(isInInformationModel(specificElement))){
				setStatusText("<<RolePlayedBy>> Specific must be in an <<InformationModel>> ");
				return false;
			}
		}
		//if(generalElement==null)return true; 
		if(generalElement!=null){
			if(!NIEMHelper.canBeRolePlayedBySupplier(generalElement)){
				setStatusText("General of <<RolePlayedBy>> can not be <<Choice>>,<<PropertyHolder>>,<<MetaType>>,<<AdapterType>>,<<AssociationType>>; must be in <<InformationModel>> and be same metatype as specific");
				return false;
			}
			/*
			if(!isGeneralClassifierAllowed(generalElement))return false;
			if(!(isInInformationModel(generalElement))){
				setStatusText("<<RolePlayedBy>> General must be in an <<InformationModel>> ");
				return false;
			}
			String generalMetaClassName=generalElement.eClass().getName();
			if(specificElement!=null){
				String specificMetaClassName=specificElement.eClass().getName();
				if(!generalMetaClassName.equals(specificMetaClassName)){
					setStatusText("<<RolePlayedBy>> Client and Supplier must be same Meta-Type");
					return false;
				}
				// now do NIEM checking
					Classifier generalClassifier=(Classifier)generalElement;
					Classifier specificClassifier=(Classifier)specificElement;
			}
			*/
		}
		return true;
	}
	protected boolean isSpecificClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
			setStatusText("<<MetaType>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName))){
			setStatusText("<<AdapterType>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName))){
			setStatusText("<<ObjectType>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName))){
			setStatusText("<<AssociationType>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AugmentationTypeStereotypeName))){
			setStatusText("<<AugmentationType>> can not be specific of a <<RolePlayedBy>>");
			return false;
		}
		return true;
	}
	/*
	protected boolean isGeneralClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be general of an <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be general of an <<RolePlayedBy>>");
			return false;
		}
		
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
			setStatusText("<<MetaType>> can not be general of a <<RolePlayedBy>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName))){
			setStatusText("<<AdapterType>> can not be general of a <<RolePlayedBy>>");
			return false;
		}
		if(Type.class.isInstance(specificElement)&&NIEMHelper.isAssociationType((Type)specificElement)){
			setStatusText("<<AssociationType>> can not be general of a <<RolePlayedBy>>");
			return false;
		}
		return true;
	}
	*/
}
