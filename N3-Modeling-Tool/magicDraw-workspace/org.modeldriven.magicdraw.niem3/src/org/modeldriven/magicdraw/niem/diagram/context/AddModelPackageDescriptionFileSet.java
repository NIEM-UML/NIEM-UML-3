/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMComponentAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ComponentView;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class AddModelPackageDescriptionFileSet extends CommonDiagramAction {
	protected PresentationElement requestor=null;
	protected Element containerElement;
	public AddModelPackageDescriptionFileSet(Element element,PresentationElement requestorIn){
		super("add"+ModelPackageDescriptionFileSetStereotypeName,"add"+ModelPackageDescriptionFileSetStereotypeName,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		requestor=requestorIn;
		containerElement=element;
		setSmallIcon(DrawActionCommon.getUmlIcon("component"));
		setDescription(MODEL_PACKAGE_DESCRIPTION_FILESET_TOOLTIP);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		 boolean isSessionCreated=NIEMHelper.createSession("subset");
		 Component filesetComponent = null;
		 try{
			Component component=null;
			// create and add to selected mpd
			// may need name adjustment too
			PresentationElement pe=this.getFirstSelected();
			if(pe!=null){
				component=(Component)pe.getElement();
			}
			if((component==null)&&(containerElement instanceof Component))component=(Component)containerElement;
			if(component!=null){
				//Component filesetComponent= UMLFactory.eINSTANCE.createComponent();
				filesetComponent = Application.getInstance().getProject().getElementsFactory().createComponentInstance();
				component.getPackagedElement().add(filesetComponent);
				component.getNestedClassifier().add(filesetComponent);
				
	//			Component filesetComponent=NIEMComponentAction.createComponent(ModelPackageDescriptionFileSetStereotypeName);
				NIEMComponentAction.initComponent(ModelPackageDescriptionFileSetStereotypeName,filesetComponent);
				if(ComponentView.class.isInstance(pe)){
					ComponentView componentView=(ComponentView)pe;
					// adjust display so we see it?
					//componentView.set
				}
			}
		 }finally{
			NIEMHelper.closeSession(isSessionCreated);
		 }
		 if((filesetComponent!=null)&&(requestor!=null)){
			addClassifierToDiagram(filesetComponent);
		 }
	}
	
}
