/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.util.Collection;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;
//import com.nomagic.uml2.ext.magicdraw.mdprofiles.metadata.MdprofilesFactory;

/**
 * @author Tom
 *
 */
public class ModelAction extends DrawActionCommon {

	public ModelAction() {
		super("Model");
		// TODO Auto-generated constructor stub
		this.setLargeIcon(getUmlIcon("model"));
		
	}

	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package niemModel= UMLFactory.eINSTANCE.createPackage();
//		addPackagedElement(niemModel);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package niemModel = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		//niemModel.setName(this.getName());
		setName(niemModel);

		// apply profiles 
		applyProfile(getPimProfile(),niemModel);
		applyProfile(getPsmProfile(),niemModel);
		applyProfile(getCommonProfile(),niemModel);
		applyProfile(getMpdProfile(),niemModel);
		return niemModel;
	}
	protected void applyProfile(Profile profile,com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package applyingPackage){
		//ProfileApplication pimApplication= UMLFactory.eINSTANCE.createProfileApplication();
		ProfileApplication pimApplication = Application.getInstance().getProject().getElementsFactory().createProfileApplicationInstance();
		pimApplication.setAppliedProfile(profile);
		pimApplication.setApplyingPackage(applyingPackage);
	}
	public boolean isEnabled(){
		DiagramPresentationElement dpe=this.getDiagram();
		if(dpe==null)return false;
		Diagram diagram=dpe.getDiagram();
		if(diagram==null)return false;
		if(NIEMHelper.isProfileApplied(diagram, NIEMHelper.getMpdProfile())||NIEMHelper.isProfileApplied(diagram, NIEMHelper.getPimProfile())){
			return false;
		}
		return super.isEnabled()
				&&(getCommonProfile()!=null)
				&&(getPimProfile()!=null)
				&&(getPsmProfile()!=null)
				&&(getMpdProfile()!=null);
	}

}
