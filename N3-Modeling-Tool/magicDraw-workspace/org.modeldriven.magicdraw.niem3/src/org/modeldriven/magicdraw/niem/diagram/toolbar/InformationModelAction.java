/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.net.URL;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
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
public class InformationModelAction extends PimProfileAction {

	public InformationModelAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		//this.setSmallIcon(getUmlIcon("package"));
		this.setLargeIcon(getUmlIcon("package"));
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		Package result= NIEMFactory.instance.createInformationModel();
		result.setName(InformationModelStereotypeName);
		
		return result;
		/*
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel= UMLFactory.eINSTANCE.createPackage();
		
		// do we need an owner now?
//		addPackagedElement(informationModel);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package informationModel = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		
		//informationModel.setName(InformationModelStereotypeName);
		setName(informationModel);
		
		//URL location=getClass().getResource("/com/nomagic/magicdraw/icons/icons16/package.gif");
		//informationModel.setName(location+"");
		
		
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getPimStereotype(InformationModelStereotypeName);
		Profile pimProfile=getPimProfile();
//		applyStereotype(informationModel,stereotype);
		NIEMHelper.addStereotype(informationModel,stereotype);
		Enumeration defaultPurposeCode=(Enumeration)getType(pimProfile,DefaultPurposeCodeTypeName);
		EnumerationLiteral defaultPurpose=getOwnedLiteral(defaultPurposeCode,subsetLiteralName);
		setStereotypePropertyValue(informationModel,stereotype,defaultPurposeTagName,defaultPurpose);
		setStereotypePropertyValue(informationModel,stereotype,targetNamespaceTagName,"http://niem.gov/niem/"+InformationModelStereotypeName);
		
		return informationModel;
		*/
	}
	public boolean isEnabled(){
		Profile pimProfile=NIEMHelper.getPimProfile();
		if(pimProfile==null)return false;
		DiagramPresentationElement dpe=this.getDiagram();
		if(dpe==null){
			// default
			return super.isEnabled();
			//QvtCommonAction.log("InformationModelAction failed to resolve diagram presentation element");
			//return false;
		}
		Diagram diagram=dpe.getDiagram();
		
		if(diagram==null){
			QvtCommonAction.log("InformationModelAction failed to resolve diagram");
			return false;
		}
		if(NIEMHelper.isInInformationModel(diagram))return false;
//		return true;
		return super.isEnabled()&&NIEMHelper.isProfileApplied(diagram, pimProfile);
	}

}
