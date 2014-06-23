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
public class SimpleContentRestrictionDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public SimpleContentRestrictionDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	// no update, check made by isConnectable
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		// no inverse
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
		if(specificElement==null)return false;
		if(!DataType.class.isInstance(specificElement))return false;
		DataType dataType=(DataType)specificElement;
		if(NIEMHelper.getBaseClassifier(dataType)!=null){
			setStatusText("Client can not already be a derived type");
			return false;
		}
		// only Enumerations, ValueRestrictions, and Classes other then PropertyHolder, Choice
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(UnionStereotypeName))){
			setStatusText("Client can not be a <<Union>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ListStereotypeName))){
			setStatusText("Client can not be a <<List>>");
			return false;
		}
		if(!isInInformationModel(specificElement)){
			setStatusText("Client must be in an <<InformationModel>>");
			return false;
		}
		Package informationModel=NIEMHelper.getNearestInformationModel(specificElement);
		if(NIEMHelper.isInformationModelDefaultPurposeReference(informationModel)){
			setStatusText("Client can not be in a reference model");
			return false;
		}
		if(generalElement==null)return true;
		
		// check supplier now
		if(!PrimitiveType.class.isInstance(generalElement)){
			setStatusText("Supplier must be a PrimitiveType");
			return false;
		}
		if(!(isInXmlTypeLibrary(generalElement))){
			setStatusText("Supplier must be in XML Type Library");
			return false;
		}
		// may want to check if proxy ok
		return true;
	}
}
