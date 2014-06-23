/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class AddXsdProperty extends CommonDiagramAction {
	public AddXsdProperty(){
		super("addAbstract"+XSDPropertyStereotypeName,"add "+XSDPropertyStereotypeName,null,NIEMClassDiagramContextConfigurator.niemGroupName);
		setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		setDescription(XSDPROPERTY_ACTION_TOOLTIP);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		PresentationElement pe=this.getFirstSelected();
		 boolean isSessionCreated=NIEMHelper.createSession("subset");								 
		
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class clazz=(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class)pe.getElement();
		Property property = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		// let NIEMTransactionListener set these
		/*
		property.setVisibility(VisibilityKindEnum.PUBLIC);
		property.setAggregation(AggregationKindEnum.SHARED);

		property.setDerivedUnion(true);
		NameHelper.fixPropertyName(property, "MyAbstract", XSDPropertyStereotypeName);
		*/
		
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=NIEMHelper.getPsmStereotype(XSDPropertyStereotypeName);
		NIEMHelper.addStereotype(property,stereotype);
		
		
		clazz.getOwnedAttribute().add(property);
		  // apply changes and add command into command history.
		NIEMHelper.closeSession(isSessionCreated);
	}
	
}
