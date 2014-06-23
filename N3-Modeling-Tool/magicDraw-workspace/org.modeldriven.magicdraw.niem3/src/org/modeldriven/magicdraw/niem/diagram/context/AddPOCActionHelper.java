/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;


import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.magicdraw.ui.dialogs.specifications.SpecificationDialogManager;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;

/**
 * @author Tom
 *
 */
public class AddPOCActionHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	public static void addPOCAction(MDMenuAction category,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("addPOCAction","Add POC...",null,niemGroupName){
			@Override
			public void updateState() {
				// model needs <<ModelPackageDescription>>, exchange schema...
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				pocActionPerformed(getSelectedObject());
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("instance"));
//		manager.addAction(testAction);
		testAction.setDescription(POC_ACTION_TOOLTIP);
		category.addAction(testAction);
	}
	public static void addPOCDiagramAction(MDMenuAction category,final PresentationElement pe,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addPOCAction","Add POC...",null,niemGroupName){
			@Override
			public void updateState() {
				// model needs <<ModelPackageDescription>>, exchange schema...
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				for(Object selected:getSelected()){
					if(PresentationElement.class.isInstance(selected)){
						PresentationElement pe2=(PresentationElement)selected;
						selected=pe2.getElement();
						if(Diagram.class.isInstance(selected))selected=((Diagram)selected).getOwner();
					}
					pocActionPerformed(selected);
				}
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("instance"));
		testAction.setDescription(POC_ACTION_TOOLTIP);
//		manager.addAction(testAction);
		category.addAction(testAction);
	}
	static protected void pocActionPerformed(Object test){
		// create a unique InstanceSpecification named poc* in containing package
		// add that to the <<ModelPackageDescription>> POC
		// bring up specification editor for the new poc
		//QvtCommonAction.log("AddPOC "+test);
		if((test==null)||!Element.class.isInstance(test)||!NIEMHelper.isModelPackageDescription((Element)test))return;
		Component mpd=(Component)test;
		InstanceSpecification instanceSpecification=addPOC(mpd);
			 if(instanceSpecification!=null){
			 SpecificationDialogManager.getManager().editSpecification(instanceSpecification) ;				
			 }
	}
	static public InstanceSpecification addPOC(Component mpd){
		// create a unique InstanceSpecification named poc* in containing package
		// add that to the <<ModelPackageDescription>> POC
		InstanceSpecification instanceSpecification=null;
			 boolean isSessionCreated=NIEMHelper.createSession("POC");
			 try{
				 Package mpdPackage=NIEMHelper.getNearestPackage(mpd);
				 String pocName=NameHelper.getUniqueInstanceSpecificationName(mpdPackage,"poc");
				 // find POCType
				 Type type=NIEMHelper.getType(NIEMHelper.getMpdProfile(), "POCType");
				 if(Classifier.class.isInstance(type)){
					 Classifier POCType=(Classifier)type;
					instanceSpecification=NIEMFactory.instance.createInstanceSpecification(POCType,mpdPackage,pocName);
					// add required slots
					setSlotValue( POCType, instanceSpecification,"POCTelephone","POCTelephone","(888)888-8888");
					setSlotValue( POCType, instanceSpecification,"POCName","POCName","PointOfContact");
					setSlotValue( POCType, instanceSpecification,"POCEmail","POCEmail","poc@niem.org");
					
					//List<InstanceSpecification> instances=new Vector<InstanceSpecification>();
					//instances.add(instanceSpecification);
					//StereotypesHelper.setStereotypePropertyValue(mpd,NIEMHelper.getMpdStereotype(ModelPackageDescriptionStereotypeName),"POC", instances,true);
					Slot slot=StereotypesHelper.getSlot(mpd,NIEMHelper.getMpdStereotype(ModelPackageDescriptionStereotypeName),POCTagName,true);
					if(slot!=null){
						InstanceValue instanceValue=NIEMFactory.instance.createInstanceValue(instanceSpecification,slot,"poc",POCType);
						
					}
				 }
				 
			}finally{
			     NIEMHelper.closeSession(isSessionCreated);
				 }
			 return instanceSpecification;
	}
	static protected void setSlotValue(Classifier POCType,InstanceSpecification instanceSpecification,String propertyName,String name,String value){
		for(Property property:POCType.getAttribute()){
			if(propertyName.equals(property.getName())){
				if(property!=null){
					Slot slot=NIEMFactory.instance.createSlot(property, instanceSpecification);
					NIEMFactory.instance.createLiteralString(slot, value,name, property.getType());
					break;
				}
			}
		}
		
	}
}
