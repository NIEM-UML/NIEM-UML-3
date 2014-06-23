/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.manipulators.x;
import com.nomagic.magicdraw.uml.symbols.manipulators.drawactions.AdditionalDrawAction;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class SimpleContentRestrictionAction extends DrawPathActionCommon {

	public SimpleContentRestrictionAction() {
		super("ProxyRestriction");
		this.setLargeIcon(getUmlIcon("realize"));
	}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		Realization niemType = Application.getInstance().getProject().getElementsFactory().createRealizationInstance();
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getCommonStereotype(RestrictionStereotypeName);
		NIEMHelper.addStereotype(niemType,stereotype);
		niemType.setName("ProxyRestriction");
		OpaqueExpression opaqueExpression=Application.getInstance().getProject().getElementsFactory().createOpaqueExpressionInstance();
		opaqueExpression.getLanguage().add("English");
		opaqueExpression.getBody().add("via Proxy");
		niemType.setMapping(opaqueExpression);
		return niemType;
	}


}
