/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.Blackbox;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class AddSequenceID extends CommonDiagramAction {
	public AddSequenceID(){
		super("add"+SequenceIDStereotypeName,"add "+SequenceIDStereotypeName,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		setDescription(SEQUENCEID_ACTION_TOOLTIP);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		// create and add to selected mpd
		// may need name adjustment too
		 boolean isSessionCreated=NIEMHelper.createSession("subset");								 
		PresentationElement pe=this.getFirstSelected();
		
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class clazz=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)pe.getElement();
//		Property property=NIEMPropertyAction.createRoleOfProperty(RoleOfStereotypeName);
//		Property property= UMLFactory.eINSTANCE.createProperty();
		Property property = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		// let NIEMTransactionListener handle these
		/*
		property.setName("sequenceId");
		//ModelHelper.setMultiplicity("1..1", property);
		Blackbox.setUpper(property, 1);
		Blackbox.setLower(property, 1);
		property.setAggregation(AggregationKindEnum.SHARED);
		property.setVisibility(VisibilityKindEnum.PUBLIC);
		// add a comment
		 NIEMHelper.addComment(property);

		
		property.setType(getIntegerType());
		*/
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getPsmStereotype(SequenceIDStereotypeName);
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
