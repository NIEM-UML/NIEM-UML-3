/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
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
public class NIEMAssociationAction extends DrawPathActionCommon {

	public NIEMAssociationAction(String name) {
		super(name);
		this.setLargeIcon(getUmlIcon("association"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		try{
		Association niemType = Application.getInstance().getProject().getElementsFactory().createAssociationInstance();
		niemType.setName(getName());
		return niemType;
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: NIEMAssociationAction.createElement "+t);
		}
		return null;
	}
	//public boolean isEnabled(){return isInformationModelEnabled();}

}
