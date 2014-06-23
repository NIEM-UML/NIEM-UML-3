/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.awt.ActionIconProvider;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
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
abstract public class DrawActionCommon extends DrawShapeDiagramAction implements NIEM_ProfileConstants,ToolTipConstants{
	public DrawActionCommon(String name){
		super(name,name,null);
	}
	public DrawActionCommon(String name,KeyStroke keyStroke){
		super(name,name,keyStroke);
	}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
static	protected void setName(NamedElement element,String name){
		element.setName("My"+name);
	}
	protected void setName(NamedElement element){
//		element.setName("My"+getName());
		setName(element,getName());
	}
	protected void setSimpleTypeName(Classifier classifier){
//		element.setName("My"+getName()+SIMPLETYPE_SUFFIX);
		NameHelper.fixClassifierName(classifier, "My"+getName(), SIMPLETYPE_SUFFIX);
	}
	protected void setCodeSimpleTypeName(Classifier classifier){
//		element.setName("My"+getName()+CODESIMPLETYPE_SUFFIX);
		NameHelper.fixClassifierName(classifier, "My"+getName(), CODESIMPLETYPE_SUFFIX);
	}
	protected void setTypeName(Classifier classifier){
		//element.setName("My"+getName()+TYPE_SUFFIX);
		NameHelper.fixClassifierName(classifier, "My"+getName(), TYPE_SUFFIX);
	}
	protected void setClassifierName(Classifier classifier,String suffix){
		//element.setName("My"+getName()+TYPE_SUFFIX);
		NameHelper.fixClassifierName(classifier, "My"+getName(), suffix);
	}
	static protected EnumerationLiteral getOwnedLiteral(Enumeration p,String name){
		if(p!=null)
		for(EnumerationLiteral type:p.getOwnedLiteral()){
			if(name.equals(type.getName()))return type;
		}
		return null;
	}
	static public Icon getUmlIcon(String name){
		//File file=new File(getPropertiesDir()+"mds.small.gif");
		URL location=DrawActionCommon.class.getResource("/com/nomagic/magicdraw/icons/icons16/"+name.toLowerCase()+".gif");
		ImageIcon image=new ImageIcon(location) ;
		return image;
	}
	static public Image getUmlImage(String name){
		//File file=new File(getPropertiesDir()+"mds.small.gif");
		URL location=DrawActionCommon.class.getResource("/com/nomagic/magicdraw/icons/icons16/"+name.toLowerCase()+".gif");
		Image image=Toolkit.getDefaultToolkit().getImage(location); ;
		return image;
	}
	
	static protected Type getType(Profile p,String name){
		for(Type type:p.getOwnedType()){
			if(name.equals(type.getName()))return type;
		}
		return null;
	}
	/*
	protected void addPackagedElement(PackageableElement pe){
		Element diagramElement=this.getDiagram().getElement();
		Element element=diagramElement.getOwner();
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)){
			((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element).getPackagedElement().add(pe);
			//QvtCommonAction.log("createElement "+pe.getQualifiedName());
		}else{
			QvtCommonAction.log("ERROR: addPackagedElement failed to locate Package for "+diagramElement);
		}
	}
	static protected void applyStereotype(Element element,Stereotype stereotype){
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
	}
	*/
	static protected void setStereotypePropertyValue(Element element,Stereotype stereotype,java.lang.String propertyName,java.lang.Object value,Boolean append){
		StereotypesHelper.setStereotypePropertyValue(element,stereotype,propertyName,value,append);
	}
	static protected void setStereotypePropertyValue(Element element,Stereotype stereotype,java.lang.String propertyName,java.lang.Object value){
//		QvtCommonAction.log("setStereotypePropertyValue "+element+", "+stereotype.getQualifiedName()+", "+propertyName+", "+value);
		/*
		try{
		StereotypesHelper.setStereotypePropertyValue(element,stereotype,propertyName,value);
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: setStereotypePropertyValue "+element+", "+stereotype.getQualifiedName()+", "+propertyName+", "+value+" : "+t);
			
		}
		*/
		NIEMHelper.setStereotypePropertyValue(element, stereotype, propertyName, value);
	}
	public // activate when profile present
	 void 	updateState() {
		 setEnabled(isEnabled());
	 }
	/*
	static protected void createDefaultValues(Element element, Stereotype stereotype,boolean createAll){
		StereotypesHelper.createDefaultValues(element,stereotype,createAll);
	}
	
	static protected void addStereotype(Element element, Stereotype stereotype){
		StereotypesHelper.addStereotype(element,stereotype);
	}
	*/
	static protected Stereotype getMpdStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getMpdProfile()); 
	}
	static protected Stereotype getPimStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getPimProfile()); 
	}
	static protected Stereotype getCommonStereotype(String stereotypeName){
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,getCommonProfile()); 
	}
	static protected Profile getPimProfile(){
		return getProfile(PimProfileName); 
	}
	static protected Profile getPsmProfile(){
		return getProfile(PsmProfileName); 
	}
	static protected Profile getMpdProfile(){
		return getProfile(MpdProfileName); 
	}
	static protected Profile getCommonProfile(){
		return getProfile(CommonProfileName); 
	}
	static protected Profile getProfile(String profileName){
		return StereotypesHelper.getProfile(getProject(),profileName);
	}
	static protected Project getProject(){
		return Application.getInstance().getProject();
	}
	static protected Package getSelectedPackage(PresentationElement pe,DiagramPresentationElement diagram){
		Package owningPackage=null;
		if((pe!=null)&&!DiagramPresentationElement.class.isInstance(pe)){
			Element element=pe.getElement();
			owningPackage=NIEMHelper.getNearestInformationModel(element);
			/*
				if(Package.class.isInstance(element)){
					owningPackage=((Package)element);
				}else if(element!=null){
					owningPackage=NIEMHelper.getNearestInformationModel(element);
				}
				*/
		}
		if((owningPackage==null)&&(diagram!=null)){
			Element element=diagram.getElement();
			owningPackage=NIEMHelper.getNearestInformationModel(element);
			/*
			if(element!=null){
				Element owner=element.getOwner();
				if(Package.class.isInstance(owner)){
					owningPackage=((Package)owner);
				}
			}
			*/
		}
		return owningPackage;
	}
	public boolean isInformationModelEnabled(){
		// must be in an InformationModel
//		return super.isEnabled()&&(getCommonProfile()!=null);
			DiagramPresentationElement dpe=this.getDiagram();
			if(dpe==null){
				return super.isEnabled();
			}
			Diagram diagram=dpe.getDiagram();
			if(diagram==null)return false;
			
			Package informationModel=NIEMHelper.getNearestInformationModel(diagram);
			if(informationModel==null)return false;
			if(isSubsettingModel(informationModel))return false;
			return super.isEnabled()&&NIEMHelper.isInInformationModel(diagram);
		
	}
	public Package getInformationModel(){
			DiagramPresentationElement dpe=this.getDiagram();
			if(dpe==null){
				return null;
			}
			Diagram diagram=dpe.getDiagram();
			if(diagram==null)return null;
			
			return NIEMHelper.getNearestInformationModel(diagram);
	}
	protected boolean isSubsettingModel(Element informationModel){
		return NIEMHelper.isSubsettingModel(informationModel);
	}

}
