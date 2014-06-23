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
public class NIEMDirectedAggregationAction extends DrawPathActionCommon {

	public NIEMDirectedAggregationAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("directedaggregation"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		try{
		//QvtCommonAction.log("NIEMDirectedAssociationAction.createElement ");
		Association niemType = Application.getInstance().getProject().getElementsFactory().createAssociationInstance();
		/*
		Property clientProperty = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		Property supplierProperty = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		niemType.getOwnedEnd().add(supplierProperty);
		niemType.getMemberEnd().add(supplierProperty);
		niemType.getMemberEnd().add(clientProperty);
		*/
		/* we need to apply stereotype to the source property, flag this as a roleOf for now
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getPimStereotype(getName());
		applyStereotype(niemType,stereotype);
		*/
		niemType.setName(getName());
		
		//QvtCommonAction.log("NIEMDirectedAssociationAction.createElement "+niemType);
		return niemType;
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: NIEMDirectedAssociationAction.createElement "+t);
			
		}
		return null;
	}
	//public boolean isEnabled(){return isInformationModelEnabled();}

}
