/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
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
public class PSMRealizationAction extends DrawPathActionCommon {

	public PSMRealizationAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("realize"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		//Realization niemType= UMLFactory.eINSTANCE.createRealization();
		//addPackagedElement(niemType);
		Realization niemType = Application.getInstance().getProject().getElementsFactory().createRealizationInstance();
		
		//setName(niemType);
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getPsmStereotype(getName());
		applyStereotype(niemType,stereotype);
		return niemType;
	}

}
