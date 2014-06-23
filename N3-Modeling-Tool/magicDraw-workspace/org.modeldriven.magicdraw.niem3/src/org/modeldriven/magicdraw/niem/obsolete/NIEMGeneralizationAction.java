/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
//import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.metadata.MddependenciesFactory;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class NIEMGeneralizationAction extends DrawPathActionCommon {

	public NIEMGeneralizationAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("generalization"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		/*
		PresentationElement pe=this.getFirstSelected();
		if(pe==null){
			QvtCommonAction.log("ERROR: NIEMGeneralizationAction.createElement with no selection ");
			return null;
		}
		Element element=pe.getElement();
		Classifier classifier=null;
		if(Classifier.class.isInstance(element)){
			classifier=(Classifier)element;
		}else{
			QvtCommonAction.log("ERROR: NIEMGeneralizationAction.createElement.createElement selection is not classifier "+element);
			return null;
		}
		
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization niemType= UMLFactory.eINSTANCE.createGeneralization();
		//addPackagedElement(niemType);
		niemType.setSpecific(classifier);
		*/
		Generalization niemType = Application.getInstance().getProject().getElementsFactory().createGeneralizationInstance();
		
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getPimStereotype(getName());
		applyStereotype(niemType,stereotype);
		return niemType;
	}
	//public boolean isEnabled(){return isInformationModelEnabled();}

}
