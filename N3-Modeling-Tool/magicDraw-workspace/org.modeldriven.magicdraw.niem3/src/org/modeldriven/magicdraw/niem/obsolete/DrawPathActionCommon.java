/**
 * 
 */
package org.modeldriven.magicdraw.niem.obsolete;

import java.io.File;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.awt.ActionIconProvider;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.actions.DrawPathDiagramAction;
import com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
abstract public class DrawPathActionCommon extends DrawPathDiagramAction implements NIEM_ProfileConstants{
	public DrawPathActionCommon(String name){
		super(name,name,null);
		
	}
	public DrawPathActionCommon(String id,String name){
		super(id,name,null);
	}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	/*
	protected void setName(NamedElement element){
		element.setName("My"+getName());
	}
	protected void setSimpleTypeName(NamedElement element){
		element.setName("My"+getName()+"SimpleType");
	}
	protected void setCodeSimpleTypeName(NamedElement element){
		element.setName("My"+getName()+"CodeSimpleType");
	}
	protected void setTypeName(NamedElement element){
		element.setName("My"+getName()+"Type");
	}
	*/
	protected EnumerationLiteral getOwnedLiteral(Enumeration p,String name){
		return NIEMHelper.getOwnedLiteral(p, name);
		/*
		for(EnumerationLiteral type:p.getOwnedLiteral()){
			if(name.equals(type.getName()))return type;
		}
		return null;
		*/
	}
	protected Icon getUmlIcon(String name){
		return NIEMHelper.getUmlIcon(name);
	}
	
	protected Type getType(Profile p,String name){
		return NIEMHelper.getType(p, name);
	}
	protected void setStereotypePropertyValue(Element element,Stereotype stereotype,java.lang.String propertyName,java.lang.Object value,Boolean append){
		StereotypesHelper.setStereotypePropertyValue(element,stereotype,propertyName,value,append);
	}
	protected void setStereotypePropertyValue(Element element,Stereotype stereotype,java.lang.String propertyName,java.lang.Object value){
		NIEMHelper.setStereotypePropertyValue(element, stereotype, propertyName, value);
	}

	public // activate when profile present
	 void 	updateState() {
		super.updateState();
//		 setEnabled(isEnabled());
		 setEnabled(true);
	 }

	static protected void createDefaultValues(Element element, Stereotype stereotype,boolean createAll){
		StereotypesHelper.createDefaultValues(element,stereotype,createAll);
	}
	/*
	protected void addStereotype(Element element, Stereotype stereotype){
		StereotypesHelper.addStereotype(element,stereotype);
	}
	*/
	/*
	protected void addPackagedElement(PackageableElement pe){
		DiagramPresentationElement dpe=getDiagram();
		if(dpe==null){
			System.out.println("ERROR: addPackagedElement failed to locate diagram for "+pe);
			return;
		}
		Element diagramElement=dpe.getElement();
		if(diagramElement==null){
			System.out.println("ERROR: addPackagedElement failed to locate element for "+dpe);
			return;
		}
//		Element element=diagramElement.getOwner();
		Package element=NIEMHelper.getNearestPackage(diagramElement);
		if(element==null){
			System.out.println("ERROR: addPackagedElement failed to get owner of diagram for "+diagramElement);
			return;
		}
		element.getPackagedElement().add(pe);
//		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)){
//			((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element).getPackagedElement().add(pe);
			//QvtCommonAction.log("createElement "+pe.getQualifiedName());
//		}
//		else{
//			System.out.println("ERROR: addPackagedElement failed to locate Package for "+diagramElement);
//		}
	}
	*/
	static protected void applyStereotype(Element element,Stereotype stereotype){
		NIEMHelper.addStereotype(element, stereotype);
		/*
		if(stereotype==null){
			QvtCommonAction.log("ERROR: applyStereotype with null stereotype "+element);
			return;
		}
		try{
		StereotypesHelper.addStereotype(element,stereotype);
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: applyStereotype "+element+", "+stereotype.getQualifiedName()+" : "+t);
		}
		createDefaultValues(element,stereotype,true);
		*/
	}
	/*
	public boolean isInformationModelEnabled(){
		// must be in an InformationModel
//		return super.isEnabled()&&(getCommonProfile()!=null);
			DiagramPresentationElement dpe=this.getDiagram();
			if(dpe==null)return false;
			Diagram diagram=dpe.getDiagram();
			if(diagram==null)return false;
			return super.isEnabled()&&NIEMHelper.isInInformationModel(diagram);
		
	}
	public boolean isMpdEnabled(){
		DiagramPresentationElement dpe=this.getDiagram();
		if(dpe==null)return false;
		Diagram diagram=dpe.getDiagram();
		if(diagram==null)return false;
		return super.isEnabled()&&NIEMHelper.isProfileApplied(diagram, NIEMHelper.getMpdProfile());
		}
*/
}
