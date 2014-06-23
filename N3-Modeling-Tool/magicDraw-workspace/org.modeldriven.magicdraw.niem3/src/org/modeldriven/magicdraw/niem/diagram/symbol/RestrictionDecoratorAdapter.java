/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;

/**
 * @author Tom
 *
 */
public class RestrictionDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public RestrictionDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	// no update, check made by isConnectable
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		// no inverse
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
		if((specificElement==null)&&(generalElement==null))return false;
		if(specificElement!=null){
			if(!Classifier.class.isInstance(specificElement)){
				setStatusText("Client must be a Classifier");
				return false;
			}
			Classifier dataType=(Classifier)specificElement;
			if(NIEMHelper.getBaseClassifier(dataType)!=null){
				setStatusText("Client can not already be a derived type");
				return false;
			}
			// only Enumerations, ValueRestrictions, and Classes other then PropertyHolder, Choice
			if(!isClassifierAllowed(specificElement))return false;
			if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(UnionStereotypeName))){
				//QvtCommonAction.log("Client can not be a <<Union>>");
				setStatusText("Client can not be a <<Union>>");
				return false;
			}
			if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ListStereotypeName))){
				//QvtCommonAction.log("Client can not be a <<List>>");
				setStatusText("Client can not be a <<List>>");
				return false;
			}
			if(!isInInformationModel(specificElement)){
				//QvtCommonAction.log("Client must be in an <<InformationModel>>");
				setStatusText("Client must be in an <<InformationModel>>");
				return false;
			}
			/*
			if(Enumeration.class.isInstance(specificElement)){
				if(NIEMHelper.isEnumerationComplexType((Enumeration)specificElement)){
					//QvtCommonAction.log("Client Enumeration must be a SimpleType");
					setStatusText("Client Enumeration must be a SimpleType");
					return false;
				}
			}
			*/
			/*
			else if(DataType.class.isInstance(specificElement)){
				if(!NIEMHelper.isDataTypeSimpleType((DataType)specificElement)){
					//QvtCommonAction.log("Client DataType must be a SimpleType");
					setStatusText("Client DataType must be a SimpleType");
					return false;
				}
			}
			*/
		}
		//if(generalElement==null)return true;
		if(generalElement!=null){
			// check supplier now
			if(!isClassifierAllowed(generalElement)){
				return false;
			}
			//String generalMetaClassName=generalElement.eClass().getName();
			//String specificMetaClassName=specificElement.eClass().getName();
			if(!(isInInformationModel(generalElement)||isInXmlTypeLibrary(generalElement))){
				//QvtCommonAction.log("Supplier must be in an <<InformationModel>> or XML Type Library");
				setStatusText("Supplier must be in an <<InformationModel>> or XML Type Library");
				return false;
			}
			// now do NIEM checking
				Classifier generalClassifier=(Classifier)generalElement;
				if(specificElement!=null){
					Classifier specificClassifier=(Classifier)specificElement;
					
					if(
							(Class.class.isInstance(specificElement)&&!Class.class.isInstance(generalElement))
							||(DataType.class.isInstance(specificElement)&&!DataType.class.isInstance(generalElement))){
						//QvtCommonAction.log("Client and Supplier must be both Classes or both DataTypes");
						setStatusText("Client and Supplier must be both Classes or both DataTypes");
						return false;
					}
					
					// both specific and general should be InformationModel, 
					//  except general may be primitive library
					// if one is AssociationType then other must be too
					if(NIEMHelper.isAssociationType(specificClassifier)
							!=NIEMHelper.isAssociationType(generalClassifier)
							){
						//QvtCommonAction.log("<<AssociationType>> can only <<Restriction>> other <<AssociationType>>s");
						setStatusText("<<AssociationType>> can only <<Restriction>> other <<AssociationType>>s");
						return false;
					}
					if(NIEMHelper.isAugmentationType(specificClassifier)
							!=NIEMHelper.isAugmentationType(generalClassifier)
							){
						//QvtCommonAction.log("<<AugmentationType>> can only <<Restriction>> other <<AugmentationType>>s");
						setStatusText("<<AugmentationType>> can only <<Restriction>> other <<AugmentationType>>s");
						return false;
					}
					// a simpleType can not extend a complexType
					/* it would become complex, so let it be
					if(!NIEMHelper.isComplexType(specificClassifier)&&NIEMHelper.isComplexType(generalClassifier)){
						//QvtCommonAction.log("A SimpleType can not extend a Complex Type");
						setStatusText("A SimpleType can not extend a Complex Type");
						return false;
					}
					*/
					/*
					if(DataType.class.isInstance(generalClassifier)&&isInXmlTypeLibrary(generalElement)){
						
					}else{
						if(Enumeration.class.isInstance(specificElement)){
							if(
									(Enumeration.class.isInstance(generalElement)&&NIEMHelper.isEnumerationComplexType((Enumeration)generalElement))
									||(!Enumeration.class.isInstance(generalElement)&&!NIEMHelper.isDataTypeSimpleType((DataType)generalElement))
									){
								//QvtCommonAction.log("Supplier of Enumeration must be a SimpleType");
								setStatusText("Supplier of Enumeration must be a SimpleType");
								return false;
							}
						}else if(DataType.class.isInstance(specificElement)){
							if(!NIEMHelper.isDataTypeSimpleType((DataType)specificElement)){
								//QvtCommonAction.log("Supplier of DataType must be a SimpleType");
								setStatusText("Supplier of DataType must be a SimpleType");
								return false;
							}
						}
					}
					*/
				}
		}
		return true;
	}
	protected boolean isClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
			setStatusText("<<MetaType>> can not be part of a <<Restriction>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName))){
			setStatusText("<<AdapterType>> can not be part of a <<Restriction>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be part of a <<Restriction>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be part of a <<Restriction>>");
			return false;
		}
		return true;
	}
}
