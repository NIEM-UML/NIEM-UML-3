/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class NIEMPrimitiveTypeAction extends CommonProfileAction {

	public NIEMPrimitiveTypeAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("primitive"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		return createNIEMPrimitiveType(this.getFirstSelected(),this.getDiagram(),getName());
		/*
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType niemType= UMLFactory.eINSTANCE.createPrimitiveType();
//		addPackagedElement(niemType);
		PrimitiveType niemType = Application.getInstance().getProject().getElementsFactory().createPrimitiveTypeInstance();
//		niemType.setName(this.getName());
		setSimpleTypeName(niemType);

		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(getName());
//		applyStereotype(niemType,stereotype);
		NIEMHelper.addStereotype(niemType,stereotype);
		return niemType;
		*/
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType createNIEMPrimitiveType(PresentationElement pe,DiagramPresentationElement diagram,String name) {
		Package owningPackage=getSelectedPackage(pe,diagram);
		PrimitiveType niemType = Application.getInstance().getProject().getElementsFactory().createPrimitiveTypeInstance();
		if(owningPackage!=null)owningPackage.getPackagedElement().add(niemType);
		//setSimpleTypeName(niemType);
		NameHelper.fixClassifierName(niemType, "My"+name, SIMPLETYPE_SUFFIX);

		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(name);
//		applyStereotype(niemType,stereotype);
		NIEMHelper.addStereotype(niemType,stereotype);
		return niemType;
	}
}
