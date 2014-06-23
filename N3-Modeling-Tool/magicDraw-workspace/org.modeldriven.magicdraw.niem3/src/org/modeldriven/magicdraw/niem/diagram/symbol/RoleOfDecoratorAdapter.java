/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.AssociationView;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKind;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;

/**
 * @author Tom
 *
 */
public class RoleOfDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public RoleOfDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	/*
	public void update(PresentationElement pe){
		//QvtCommonAction.log("RoleOfDecoratorAdapter.update "+pe);
		super.update(pe);
		if(pe==null)return;
		if(!AssociationView.class.isInstance(pe))return;
		AssociationView associationView=(AssociationView)pe;
		Association association=(Association)associationView.getElement();
		PresentationElement clientPE=associationView.getClient();
		PresentationElement supplierPE=associationView.getSupplier();
		if((association==null)||(clientPE==null)||(supplierPE==null))return;
		Class client=(Class)clientPE.getElement();
		Class supplier=(Class)supplierPE.getElement();
		if((client==null)||(supplier==null))return;
//		QvtCommonAction.log("RoleOfDecoratorAdapter.update "+client.getQualifiedName()+", "+supplier.getQualifiedName()+", "+association.getMemberEnd()+", "+association.getOwnedEnd());
		if(association.getOwnedEnd().size()!=2)return;// already done
		// client should own a property, its name should be RoleOf...Reference
		// supplier should be owned by Association, no aggregation, 0..*
		// no aggregation on client property, cardinality ...0..1
		// client stereotyped
		Property clientProperty=association.getMemberEnd().get(0);
		Property supplierProperty=association.getMemberEnd().get(1);
		clientProperty.setVisibility(VisibilityKindEnum.PUBLIC);
		supplierProperty.setVisibility(VisibilityKindEnum.PUBLIC);
		client.getOwnedAttribute().add(clientProperty);
		// may want to verify that this is unique
		String baseClassifierName=NameHelper.getBaseClassifierName(supplier.getName());
		String baseName=NameHelper.getBasePropertyName(baseClassifierName);
		clientProperty.setName("RoleOf"+baseName+REFERENCE_SUFFIX);
//		clientProperty.setName("RoleOf"+NameHelper.getBasePropertyName(supplier.getName())+"Reference");
		clientProperty.setAggregation(AggregationKindEnum.NONE);
		ModelHelper.setMultiplicity(0, 1, clientProperty);
		supplierProperty.setAggregation(AggregationKindEnum.NONE);
		ModelHelper.setMultiplicity(0, -1, supplierProperty);
		NIEMHelper.addStereotype(clientProperty, NIEMHelper.getPimStereotype(RoleOfStereotypeName));
		Package associationOwner=NIEMHelper.getNearestPackage(clientProperty);
		if(associationOwner!=null){
			associationOwner.getPackagedElement().add(association);
		}
	}
	*/
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		//QvtCommonAction.log("RoleOfDecoratorAdapter.isConnectable2Obj "+pe+", "+general+", "+specific);
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
			if(specificElement==null)return false;
			if(!Class.class.isInstance(specificElement)){
				setStatusText("Client must be a Class");
				return false;
			}
			if(!isClassifierAllowed(specificElement))return false;
			if(!isInInformationModel(specificElement)){
				setStatusText("Client must be in an <<InformationModel>>");
				return false;
			}
			if(generalElement==null)return true; 
			if(!Class.class.isInstance(generalElement)){
				setStatusText("Supplier must be a Class");
				return false;
			}
			if(!isClassifierAllowed(generalElement))return false;
			if(!isInInformationModel(generalElement)){
				setStatusText("Supplier must be in an <<InformationModel>>");
				return false;
			}
			// both specific and general should be InformationModel, 
		return true;
	}
	protected boolean isClassifierAllowed(Element specificElement){
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
			setStatusText("<<Metadata>> can not be part of a <<RoleOf>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
			setStatusText("<<PropertyHolder>> can not be part of a <<RoleOf>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be part of a <<RoleOf>>");
			return false;
		}
		/*
		*/
		return true;
	}
}
