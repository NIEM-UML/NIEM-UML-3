/**
 * 
 */
package org.modeldriven.magicdraw.niem.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.modeldriven.magicdraw.niem.diagram.relation.RelationPaintListener;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import prefuse.data.Edge;
import prefuse.data.Node;

import com.nomagic.ci.persistence.spi.graph.Graph;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.DiagramWindow;
import com.nomagic.magicdraw.uml.ExtendedPropertyNames;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.AssociationView;
import com.nomagic.magicdraw.uml.symbols.shapes.AttributeView;
import com.nomagic.magicdraw.visualization.relationshipmap.RelationMapManager;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.AbstractGraphDisplay;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.impl.PropertyNames;

/**
 * @author tom
 *
 */
public class DiagramPropertyPropertyChangeListener implements PropertyChangeListener {

	/* (non-Javadoc)
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt)
	{
		String propertyName = evt.getPropertyName();
//		QvtCommonAction.log("DiagramPropertyPropertyChangeListener "+propertyName+", "+evt.getNewValue());
		if (Project.DIAGRAM_OPENED.equals(propertyName)){
			//QvtCommonAction.log("DiagramPropertyPropertyChangeListener DIAGRAM_OPENED "+propertyName+", "+evt.getNewValue());
			Object test=evt.getNewValue();
			if(DiagramWindow.class.isInstance(test)){
				DiagramWindow diagramWindow=(DiagramWindow)test;
				DiagramPresentationElement dpe=diagramWindow.getDiagramPresentationElement();
				if(dpe!=null){
					AbstractGraphDisplay agd=RelationMapManager.getGraphDisplay(dpe);
					//QvtCommonAction.log("DiagramPropertyPropertyChangeListener DIAGRAM_OPENED dpe "+dpe+", "+agd);
					if(agd!=null){
						new RelationPaintListener(dpe.getDiagram());
					}
				}
			}
		}else if(ExtendedPropertyNames.DIAGRAM_LOADED.equals(propertyName)){
			//QvtCommonAction.log("DiagramPropertyPropertyChangeListener DIAGRAM_LOADED "+propertyName+", "+evt.getNewValue());
			Object test=evt.getNewValue();
			if(DiagramPresentationElement.class.isInstance(test)){
				DiagramPresentationElement dpe=(DiagramPresentationElement)test;
				if(dpe!=null){
					AbstractGraphDisplay agd=RelationMapManager.getGraphDisplay(dpe);
					//QvtCommonAction.log("DiagramPropertyPropertyChangeListener DIAGRAM_LOADED dpe "+dpe+", "+agd);
					if(agd!=null){
						new RelationPaintListener(dpe.getDiagram());
					}
				}
			}
			
		}
	}
public void propertyChangeNoLongerUsed(PropertyChangeEvent evt)
{
		String propertyName = evt.getPropertyName();
//		QvtCommonAction.log("DiagramPropertyPropertyChangeListener "+propertyName+", "+evt.getSource()+", "+evt.getNewValue()+", "+evt.getOldValue());
//		QvtCommonAction.log("DiagramPropertyPropertyChangeListener "+propertyName+", "+evt.getSource());
//	if (ExtendedPropertyNames.VIEW_ADDED.equals(propertyName) ||ExtendedPropertyNames.VIEW_REMOVED.equals(propertyName))
/*		
		com.nomagic.magicdraw.visualization.relationshipmap.GraphConstants r;
		com.nomagic.magicdraw.visualization.relationshipmap.options.RelationMapOptionsHelper h;
		com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.ProgressActivityAdapter a;
		com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.GraphVisualUtilities u;
		com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.controllers.RelationMapToolTipCtr t;
		com.nomagic.magicdraw.visualization.relationshipmap.model.settings.GraphSettingsHelper z;
		com.nomagic.magicdraw.visualization.relationshipmap.options.RelationMapOptionsHelper y;
		y.setDescriptionExpanded(true);
		com.nomagic.magicdraw.visualization.relationshipmap.resources.RelationMapResources w;
		com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.controllers.RelationMapToolTipCtr q;
		com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.body.RelationMapDiagramComponent p;
		com.nomagic.magicdraw.visualization.relationshipmap.model.SelectedTupleSet tt;
		com.nomagic.magicdraw.visualization.relationshipmap.model.GraphDataManager gdm;
		com.nomagic.magicdraw.visualization.relationshipmap.GraphUtils gu;
		com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.GraphVisualUtilities gvu;
		com.nomagic.magicdraw.visualization.relationshipmap.RelationMapUpdater rmu;
		com.nomagic.magicdraw.visualization.relationshipmap.RelationMapManager rmm;
		DiagramPresentationElement dpe;
		AbstractGraphDisplay agd=RelationMapManager.getGraphDisplay(dpe);
		gdm=agd.getDataManager();
		agd.getDescriptor().getGraphSettings();
		Node node=gdm.getRoot();
		node.getColumnCount();
		gdm.
		t.
		p.
		q.
		w.
		z.
		z.
		RelationMapManager x;
		DiagramPresentationElement arg0;
		prefuse.data.Graph g;
		Element e;
		x.
		x.createUsedElementsProvider().
		Node n=x.getGraphDisplay(arg0).getDataManager().createGraphNode(g, e);
		Edge edge;
		prefuse.
*/		
		if (ExtendedPropertyNames.VIEW_ADDED.equals(propertyName)
				||ExtendedPropertyNames.ADD.equals(propertyName)
				)
		{
			// added / removed symbol
			PresentationElement presentationElement = (PresentationElement)evt.getNewValue();
			// check if this is of interest to us, as a result of drag and drop for example
			if(AttributeView.class.isInstance(presentationElement)){
				AttributeView attributeView=(AttributeView)presentationElement;
				Property property=(Property)attributeView.getElement();
				// check if this is in an InformationModel, it was done by magicdraw, etc.
				//
				Type type=property.getType();
				if(NIEMHelper.isDefaultProperty(property)
						&&NIEMHelper.isInInformationModel(property)
//						&&(type!=null)
		//				&&((type==null)||NIEMHelper.isInInformationModel(type))
						&&((type==null)||NIEMHelper.isInInformationModel(type)||NIEMHelper.isInXmlTypeLibrary(type))
						){
					QvtCommonAction.log("DiagramPropertyPropertyChangeListener "+property.getName()+", "+type);
					if(type==null){
						// try to get a type from user
					}
					if(true)return;					
					// adjust the name etc.
					property.setAggregation(AggregationKindEnum.SHARED);
					property.setVisibility(VisibilityKindEnum.PUBLIC);
		//			NameHelper.fixPropertyName(property,NameHelper.getBasePropertyName(property.getType().getName()),NameHelper.getRepresentationTerm(property));
					NameHelper.fixPropertyName(property,NameHelper.getBasePropertyName(NameHelper.getBaseClassifierName(property.getType().getName())),NameHelper.getRepresentationTerm(property));
				}
			}
			else if(AssociationView.class.isInstance(presentationElement)){
				AssociationView associationView=(AssociationView)presentationElement;
				Association association=(Association)associationView.getElement();
				QvtCommonAction.log("DiagramPropertyPropertyChangeListener association "+association);
				for(Property memberEnd:association.getMemberEnd()){
					QvtCommonAction.log("DiagramPropertyPropertyChangeListener association "+memberEnd.getName()+", "+memberEnd.getType());
					
				}
			}
		}
	}

}
