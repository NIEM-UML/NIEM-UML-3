/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.metadata.MdkernelFactory;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.ext.magicdraw.metadata.UMLFactory;

/**
 * @author Tom
 *
 */
public class NIEMTypeAction extends CommonProfileAction {

	public NIEMTypeAction(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		setLargeIcon(getUmlIcon("class"));
		//setDescription("TEST NIEMTypeAction");
		setName(name);
	}
	/*
public String getDescription(){
	return "TEST NIEMTypeAction";
}
*/
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction#createElement()
	 */
	@Override
	protected Element createElement() {
		Element result=createNIEMType(this.getFirstSelected(),this.getDiagram(),getName());
		return result;
		/*
//		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class niemType= UMLFactory.eINSTANCE.createClass();
//		addPackagedElement(niemType);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class niemType = Application.getInstance().getProject().getElementsFactory().createClassInstance();
//		niemType.setName(this.getName());
//		if(ChoiceStereotypeName.equals(getName())){
		DiagramPresentationElement diagram=this.getDiagram();
		if(diagram!=null){
			Element element=diagram.getElement();
			if(element!=null){
				Element owner=element.getOwner();
				if(Package.class.isInstance(owner)){
					((Package)owner).getPackagedElement().add(niemType);
				}
			}
		}
		if(getName().endsWith(TYPE_SUFFIX) || PropertyHolderStereotypeName.equals(getName())){
			setClassifierName(niemType,getName().replace("Object","").replace("PropertyHolder",""));
		}else{
			setTypeName(niemType);
		}
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(getName());
//		applyStereotype(niemType,stereotype);
		NIEMHelper.addStereotype(niemType,stereotype);
		return niemType;
		*/
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class createNIEMType(PresentationElement pe,DiagramPresentationElement diagram,String name) {
		boolean isSessionCreated=NIEMHelper.createSession("Edit class A");
		Package owningPackage=getSelectedPackage(pe,diagram);
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class niemType = Application.getInstance().getProject().getElementsFactory().createClassInstance();
		
		// test
		//QvtCommonAction.getProject().getRepository().getEventSupport().setEnableEventFiring(true);

		
//		if(addToPackage)
//			if(owningPackage!=null)owningPackage.getPackagedElement().add(niemType);
			
			if(owningPackage!=null)
				try {
					ModelElementsManager.getInstance().addElement(niemType, owningPackage);
				} catch (ReadOnlyElementException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					QvtCommonAction.log("ERROR: NIEMTypeAction during attach NIEMType to Package: "+e);
				}			
			
		//niemType.setName("unnamed");// setting an initial name to enable catching real name change event from setting name below?
		if(name.endsWith(TYPE_SUFFIX) || PropertyHolderStereotypeName.equals(name)){
			//setClassifierName(niemType,name.replace("Object","").replace("PropertyHolder",""));
			NameHelper.fixClassifierName(niemType, "My"+name, name.replace("Object","").replace("PropertyHolder",""));

		}else{
			//setTypeName(niemType);
			NameHelper.fixClassifierName(niemType, "My"+name, TYPE_SUFFIX);

		}
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getCommonStereotype(name);
		NIEMHelper.addStereotype(niemType,stereotype);
		// force validation check?
		/*
		niemType.firePropertyChange("name",
                "",
                niemType.getName());
                */
		NIEMHelper.closeSession(isSessionCreated);
		return niemType;
	}
	protected boolean isSubsettingModel(Element informationModel){
		if(PropertyHolderStereotypeName.equals(getName()))return false;
		return super.isSubsettingModel(informationModel);
	}

}
