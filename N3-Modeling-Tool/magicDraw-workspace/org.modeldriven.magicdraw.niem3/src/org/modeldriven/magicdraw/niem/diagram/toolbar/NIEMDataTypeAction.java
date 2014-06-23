/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.copypaste.CopyPasting;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.shapes.DataTypeView;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralInteger;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralUnlimitedNatural;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class NIEMDataTypeAction extends CommonProfileAction {

	public NIEMDataTypeAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("datatype"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		return createNIEMDataType(this.getFirstSelected(),this.getDiagram(),getName());
		/*
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType niemType= UMLFactory.eINSTANCE.createDataType();
//		niemType.setName(this.getName());
//		addPackagedElement(niemType);
		DataType niemType = Application.getInstance().getProject().getElementsFactory().createDataTypeInstance();
		setSimpleTypeName(niemType);

		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(getName());
//		applyStereotype(niemType,stereotype);
		NIEMHelper.addStereotype(niemType,stereotype);
		// for a list, add a property
		if(ListStereotypeName.equals(getName())){
			Property result = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
			result.setVisibility(VisibilityKindEnum.PUBLIC);
			result.setName("item");
			LiteralInteger lowerValue = Application.getInstance().getProject().getElementsFactory().createLiteralIntegerInstance();
			lowerValue.setValue(0);
			LiteralUnlimitedNatural upperValue = Application.getInstance().getProject().getElementsFactory().createLiteralUnlimitedNaturalInstance();
			upperValue.setValue(-1);
			result.setLowerValue(lowerValue);
			result.setUpperValue(upperValue);
			niemType.getOwnedAttribute().add(result);
			// by default, set type to string
			PrimitiveType defaultType=NIEMHelper.getXMLTypeString();
			if(defaultType!=null)
				result.setType(defaultType);
		}
		return niemType;
		*/
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType createNIEMDataType(PresentationElement pe,DiagramPresentationElement diagram,String name) {
		Package owningPackage=getSelectedPackage(pe,diagram);
		DataType niemType = Application.getInstance().getProject().getElementsFactory().createDataTypeInstance();
		if(owningPackage!=null)owningPackage.getPackagedElement().add(niemType);
		//setSimpleTypeName(niemType);
		NameHelper.fixClassifierName(niemType, "My"+name, SIMPLETYPE_SUFFIX);

		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(name);
//		applyStereotype(niemType,stereotype);
		NIEMHelper.addStereotype(niemType,stereotype);
		// for a list, add a property
		if(ListStereotypeName.equals(name)){
			Property result = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
			result.setVisibility(VisibilityKindEnum.PUBLIC);
			result.setName("item");
			LiteralInteger lowerValue = Application.getInstance().getProject().getElementsFactory().createLiteralIntegerInstance();
			lowerValue.setValue(0);
			LiteralUnlimitedNatural upperValue = Application.getInstance().getProject().getElementsFactory().createLiteralUnlimitedNaturalInstance();
			upperValue.setValue(-1);
			result.setLowerValue(lowerValue);
			result.setUpperValue(upperValue);
			result.setAggregation(AggregationKindEnum.SHARED);
			// add a comment
       	 NIEMHelper.addComment(result);
			
			niemType.getOwnedAttribute().add(result);
			// by default, set type to string
			PrimitiveType defaultType=NIEMHelper.getXMLTypeString();
			if(defaultType!=null)
				result.setType(defaultType);
		}
		return niemType;
	}
}
