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
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class CommonRealizationAction extends DrawPathActionCommon {

	public CommonRealizationAction(String name) {
		super(name);
		this.setLargeIcon(getUmlIcon("realize"));
	}
	/*
	protected x createCreatableShapeElements(){
		x result=super.createCreatableShapeElements();
		  try{
			  QvtCommonAction.log("CommonRealizationAction.createCreatableShapeElements "+result);
			  }catch(Throwable t){}
		return result;
	}
	@Override
	  protected boolean isAllowedToCreateSymbol(){
		  boolean result=false;
		  try{
		   result=super.isAllowedToCreateSymbol();
		  }catch(Throwable t){}
		  try{
		  QvtCommonAction.log("CommonRealizationAction.isAllowedToCreateSymbol "+result);
		  }catch(Throwable t){}
		  return result;
	  }
*/
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		Realization niemType = Application.getInstance().getProject().getElementsFactory().createRealizationInstance();
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getCommonStereotype(getName());
		NIEMHelper.addStereotype(niemType,stereotype);
		return niemType;
	}
	/*
	public boolean isEnabled(){
//		return isInformationModelEnabled();
		DiagramPresentationElement dpe=this.getDiagram();
		if(dpe==null)return false;
		Diagram diagram=dpe.getDiagram();
		if(diagram==null)return false;
		return super.isEnabled()&&NIEMHelper.isProfileApplied(diagram, NIEMHelper.getCommonProfile());
		}
*/
}
