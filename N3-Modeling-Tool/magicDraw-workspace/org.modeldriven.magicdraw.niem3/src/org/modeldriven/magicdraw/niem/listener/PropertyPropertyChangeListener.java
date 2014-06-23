/**
 * 
 */
package org.modeldriven.magicdraw.niem.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.ExtendedPropertyNames;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.shapes.AttributeView;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.impl.PropertyNames;

/**
 * This is no longer used.
 * @author tom
 *
 */
public class PropertyPropertyChangeListener implements PropertyChangeListener {

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		String propertyName = evt.getPropertyName();
		
	//	if (ExtendedPropertyNames.VIEW_ADDED.equals(propertyName) ||ExtendedPropertyNames.VIEW_REMOVED.equals(propertyName))
//		QvtCommonAction.log("PropertyPropertyChangeListener "+propertyName+", "+evt.getSource()+", "+evt.getNewValue()+", "+evt.getOldValue());
		QvtCommonAction.log("PropertyPropertyChangeListener "+propertyName+", "+evt.getSource());
		if(true)return;
//		if (ExtendedPropertyNames.VIEW_ADDED.equals(propertyName) )
		if(!(PropertyNames.TYPE.equals(propertyName)||PropertyNames.NAME.equals(propertyName)))return;
		Object test=evt.getSource();
		if(!Property.class.isInstance(test))return;
		Property property=(Property)test;
		{
				// check if this is in an InformationModel, it was done by magicdraw, etc.
				//
				Type type=property.getType();
				if(NIEMHelper.isDefaultProperty(property)
						&&NIEMHelper.isInInformationModel(property)
//						&&(type!=null)
						&&((type==null)||(NIEMHelper.isInInformationModel(type)||NIEMHelper.isInXmlTypeLibrary(type)))
						){
					if(type==null){
						// try to get a type
					}
					// adjust the name etc.
					property.setAggregation(AggregationKindEnum.SHARED);
					property.setVisibility(VisibilityKindEnum.PUBLIC);
		//			NameHelper.fixPropertyName(property,NameHelper.getBasePropertyName(property.getType().getName()),NameHelper.getRepresentationTerm(property));
					NameHelper.fixPropertyName(property,NameHelper.getBasePropertyName(NameHelper.getBaseClassifierName(property.getType().getName())),NameHelper.getRepresentationTerm(property));
				}
		}
	}

}
