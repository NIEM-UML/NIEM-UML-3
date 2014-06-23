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

/**
 * @author Tom
 *
 */
public class UnionOfDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public UnionOfDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	// no update, check made by isConnectable
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		setStatusText(null);
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
		if((generalElement==null)&&(specificElement==null))return false;

		//if(specificElement==null)return false;
//		if(!NIEMHelper.canBeUnionClient(specificElement)){
		if(specificElement!=null){
			if(!NIEMHelper.isUnion(specificElement)){
				setStatusText("Client must be a <<Union>>");
				return false;
			}
			if(!isInInformationModel(specificElement)){
				setStatusText("Client must be in an <<InformationModel>>");
				return false;
			}
			if(!specificElement.isEditable()||NIEMHelper.isElementProxy(specificElement)){
				setStatusText("Client must be editable and NOT be a Proxy");
				return false;
			}
		}
//		if(generalElement==null)return true;
		if(generalElement!=null){
			if(!NIEMHelper.canBeUnionOfSupplier(generalElement)){
				setStatusText("Supplier must be a simple data type or enumeration in an <<InformationModel>> or Primtive Type library");
				return false;
			}
			/*
			// check supplier now
			Package nearestPackage=NIEMHelper.getNearestPackage(generalElement);
			if((nearestPackage==null)
					||!(NIEMHelper.isInformationModel(nearestPackage)||NIEMHelper.isXMLPrimitiveTypesLibrary(nearestPackage))
					){
				setStatusText("Supplier must be in an <<InformationModel>> or Primtive Type library");
				return false;
			}
			if(DataType.class.isInstance(generalElement)&&(
								NIEMHelper.isDataTypeSimpleType((DataType)generalElement)
								||(Enumeration.class.isInstance(generalElement)&&!NIEMHelper.isEnumerationComplexType((Enumeration)generalElement))
						)
					){
			}else{
				setStatusText("Supplier must be a simple data type or enumeration");
				return false;
			}
			*/
		}
		return true;
		/*
		if(!NIEMHelper.hasStereotype(generalElement, NIEMHelper.getCommonStereotype(UnionStereotypeName))){
			setStatusText("Supplier must be a <<Union>> for a union member Realization");
			return false;
		}

		if(!NIEMHelper.canBeUnionClient(generalElement)){
			setStatusText("Supplier must be a <<Union>> for a union member Realization");
			return false;
		}
		if(!isInInformationModel(generalElement)){
			setStatusText("Supplier must be in an <<InformationModel>>");
			return false;
		}

		Package specificModel=NIEMHelper.getNearestPackage(specificElement);
		Package generalModel=NIEMHelper.getNearestPackage(generalElement);
		if(!specificModel.equals(generalModel)){
			setStatusText("Client and Supplier must be in same <<InformationModel>>");
			return false;
		}
		*/
	}
}
