/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class PackageAction extends DrawActionCommon {

	public PackageAction() {
		super("Package");
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("package"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package niemType= UMLFactory.eINSTANCE.createPackage();
//		addPackagedElement(niemType);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package niemType = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
//		niemType.setName(this.getName());
		setName(niemType);
		return niemType;
	}

}
