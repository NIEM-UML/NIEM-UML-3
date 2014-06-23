/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class AddXsdAnyProperty extends CommonDiagramAction {
	public AddXsdAnyProperty(){
		super("add"+XSDAnyPropertyStereotypeName,"add "+XSDAnyPropertyStereotypeName,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		setDescription(XSDANYPROPERTY_ACTION_TOOLTIP);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		 boolean isSessionCreated=NIEMHelper.createSession("subset");								 
		// create and add to selected mpd
		// may need name adjustment too
		PresentationElement pe=this.getFirstSelected();
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class clazz=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)pe.getElement();
//		Property property=NIEMPropertyAction.createRoleOfProperty(RoleOfStereotypeName);
//		Property property= UMLFactory.eINSTANCE.createProperty();
		Property property = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		//property.setName("My"+XSDAnyPropertyStereotypeName);
		// let NIEMTransactionListener handle properties
		/*
		NameHelper.fixPropertyName(property, "My", XSDAnyPropertyStereotypeName);
		
		property.setAggregation(AggregationKindEnum.SHARED);
		property.setVisibility(VisibilityKindEnum.PUBLIC);
		ModelHelper.setMultiplicity(0, -1, property);
		// add a comment
		 NIEMHelper.addComment(property);
		*/
		
			// apply stereotype, set tags, set default name, etc.
			Stereotype stereotype=NIEMHelper.getPsmStereotype(XSDAnyPropertyStereotypeName);
			NIEMHelper.addStereotype(property,stereotype);
		clazz.getOwnedAttribute().add(property);
		/*
		if(ClassView.class.isInstance(pe)){
			ClassView classView=(ClassView)pe;
			// adjust display so we see it?
		}
*/
		NIEMHelper.closeSession(isSessionCreated);
	}
	
}
