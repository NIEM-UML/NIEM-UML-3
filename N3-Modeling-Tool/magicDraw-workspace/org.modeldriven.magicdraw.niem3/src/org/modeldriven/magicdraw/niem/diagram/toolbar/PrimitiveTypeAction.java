/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class PrimitiveTypeAction extends DrawActionCommon {

	public PrimitiveTypeAction() {
		super("PrimitiveType");
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("primitive"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		return createPrimitiveType(this.getFirstSelected(),this.getDiagram(),getName());
		/*
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType niemType= UMLFactory.eINSTANCE.createPrimitiveType();
//		addPackagedElement(niemType);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType niemType = Application.getInstance().getProject().getElementsFactory().createPrimitiveTypeInstance();
//		niemType.setName(this.getName());
		setSimpleTypeName(niemType);
		return niemType;
		*/
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType createPrimitiveType(PresentationElement pe,DiagramPresentationElement diagram,String name) {
		Package owningPackage=getSelectedPackage(pe,diagram);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType niemType = Application.getInstance().getProject().getElementsFactory().createPrimitiveTypeInstance();
		if(owningPackage!=null)owningPackage.getPackagedElement().add(niemType);
		NameHelper.fixClassifierName(niemType, "My"+name, SIMPLETYPE_SUFFIX);
		return niemType;
	}
	public boolean isEnabled(){return isInformationModelEnabled();}

}
