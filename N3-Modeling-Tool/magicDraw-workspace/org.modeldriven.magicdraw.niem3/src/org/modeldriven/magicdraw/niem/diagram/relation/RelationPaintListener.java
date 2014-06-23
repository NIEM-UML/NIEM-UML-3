/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.relation;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.PopupMenu;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JLabel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.derivedproperty.DerivedPropertyManager;
import com.nomagic.magicdraw.derivedproperty.PropertyDescriptor;
import com.nomagic.magicdraw.ui.DiagramWindowPanel;
import com.nomagic.magicdraw.ui.dsl.DSLManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramType;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.visualization.relationshipmap.RelationMapManager;
import com.nomagic.magicdraw.visualization.relationshipmap.model.settings.GraphSettings;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.body.MVBrowsePanel;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.body.RelationMapDiagramComponent;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.AbstractGraphDisplay;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.jmi.reflect.Expression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

import prefuse.Display;
import prefuse.Visualization;
import prefuse.controls.ToolTipControl;
import prefuse.data.Edge;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.util.display.PaintListener;
import prefuse.visual.VisualItem;
import prefuse.visual.tuple.TableEdgeItem;

/**
 * @author tom
 *
 */
public class RelationPaintListener implements PaintListener {
	//protected AbstractGraphDisplay agd;
	protected Diagram diagram;
	protected AbstractGraphDisplay agd;
	public RelationPaintListener(Diagram diagramIn){
		diagram=diagramIn;
		Project project=QvtCommonAction.getProject();
			DiagramPresentationElement dpe=project.getDiagram(diagram);
//			getActiveDiagram()
			if(dpe!=null){
//				QvtCommonAction.log("RelationPaint diagramtype "+dpe.getDiagramType().getType()+", "+DiagramType.getAllDiagramTypes());
//				QvtCommonAction.log("RelationPaint actionProviders "+ActionsConfiguratorsManager.getInstance().getDiagramToolbarActionProviders("Relation Map Diagram"));
				
				agd=RelationMapManager.getGraphDisplay(dpe);
				
				
				RelationMapDiagramComponent diagramComponent=RelationMapManager.getActiveRMDiagramComponent();
				if((agd==null)||(diagramComponent==null))return;
				//diagramComponent.getSettings().
				//Container container=diagramComponent.getParent();
//				DiagramWindowPanel dwp;
//				dwp.
//				com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.RelationMapDiagramWindowPanel rmdwp;
//				rmdwp.get
				//RelationMapManager.getActiveRMDiagramComponent().add(new JLabel("TEST"));
				
				agd.addPaintListener(this);
				// override the MD implementation of toolTip , back to using prefuse
				ToolTipControl toolTipControl=new ToolTipControl("_label");
				agd.addControlListener(toolTipControl);
			}		
	}
	/* (non-Javadoc)
	 * @see prefuse.util.display.PaintListener#postPaint(prefuse.Display, java.awt.Graphics2D)
	 */
	@Override
	public void postPaint(Display arg0, Graphics2D arg1) {
		//prefuse.Display.InputEventCapturer pdi;
	}

	/* (non-Javadoc)
	 * @see prefuse.util.display.PaintListener#prePaint(prefuse.Display, java.awt.Graphics2D)
	 */
	@Override
	public void prePaint(Display arg0, Graphics2D arg1) {
		// this should get all edges
		Graph graph=agd.getGraph();
		Visualization visualization=agd.getVisualization();
		Iterator iter=visualization.visibleItems();
		while(iter.hasNext()){
			Object test=iter.next();
			//QvtCommonAction.log("visibleItems "+test.getClass().getName());
			if(TableEdgeItem.class.isInstance(test)){
				VisualItem visualItem=(VisualItem)test;
//				visualItem.setSize(5.0);
				visualItem.setSize(3.0);
			}
		}
		/*
		Stereotype relationMap=NIEMSubsettingRelationDiagramAction.getRelationMapStereotype(diagram);

		List<String> newRelationCriterion=StereotypesHelper.getStereotypePropertyValue(diagram,relationMap, "relationCriterion");
		*/
		GraphSettings graphSettings=ChangeRelationMapDiagramFilterAction.getGraphSettings();
		if(graphSettings!=null){
		List<String> newRelationCriterion=graphSettings.getDependencyCriterion();
		for(int edgeIndex=0;edgeIndex<graph.getEdgeCount();edgeIndex++){
			Edge edge=graph.getEdge(edgeIndex);
			Node sourceNode=graph.getSourceNode(edge);
			Node targetNode=graph.getTargetNode(edge);
			if((sourceNode==null)||(targetNode==null))continue;
			String toolTipLabel=getRelationUsed(newRelationCriterion,sourceNode,targetNode);
			edge.setString("_label",toolTipLabel);// "TESTING");
		}
		}
	}
	protected String getRelationUsed(List<String> newRelationCriterion,
			Node sourceNode, Node targetNode) {
		// get source/target elements
		// check which relation used (could there be multiple?)
		String result="";
		Element sourceElement=getElement(sourceNode);
		Element targetElement=getElement(targetNode);
		//QvtCommonAction.log("TEST getRelationUsed "+sourceElement+", "+targetElement);
		if((sourceElement!=null)&&(targetElement!=null))
		for(String relation:newRelationCriterion){
			//QvtCommonAction.log("TEST getRelationUsed relation "+relation);
			if(isRelation(relation,sourceElement,targetElement)){
				String relationName= getRelationName(relation);
				if(result.length()!=0)result+=", ";
				result+=relationName;
			}
		}
		if(result.length()==0)result="UNKNOWN RELATION";
		return result;
	}
	protected String getRelationName(String relation){
		String parts[]=relation.split(";");
		return parts[0];
	}
	protected Element getElement(Node node){
		Project project=Application.getInstance().getProject();
		if(project!=null){
			BaseElement baseElement=project.getElementByID(node.getString("REF_ID"));
			if(Element.class.isInstance(baseElement))return (Element)baseElement;
		}
		return null;
	}
	protected boolean isRelation(String relation,Element source,Element target){
		String parts[]=relation.split(";");
		Project project=Application.getInstance().getProject();
		DSLManager dsl=project.getDSLManager();
		//QvtCommonAction.log("TEST isRelation dsl "+dsl);
		if(dsl==null)return false;
		DerivedPropertyManager dpm=dsl.getDerivedPropertyManager();
		//QvtCommonAction.log("TEST isRelation dpm "+dpm);
		if(dpm==null)return false;
		String propertySpecification=parts[2];
		//String typeSpecification=parts[1];
		// are we looking for a stereotype?
		Class metaclass=null;
		if(isStereotypeRelation(propertySpecification)){
			metaclass=StereotypesHelper.getAppliedStereotypeByString(source, getMetaName(propertySpecification));
		}else{
			metaclass=StereotypesHelper.getBaseClass(source);
		}
        if(metaclass==null)return false;   
        return isRelationMatch(source,target,metaclass,dpm,propertySpecification,new HashSet<Class>());
	}
	protected boolean isRelationMatch(Element source,Element target,Class metaclass,DerivedPropertyManager dpm,String propertySpecification,Set<Class>didThat){
		if(didThat.contains(metaclass))return false;
		didThat.add(metaclass);
		//QvtCommonAction.log("TEST isRelation metaclass "+metaclass.getQualifiedName()+", "+propertySpecification);
		String metaNameSought=getMetaName(propertySpecification);
		if(metaclass.getName().equals(metaNameSought)){
			String propertyNameSought=getPropertyName(propertySpecification);
			//QvtCommonAction.log("TEST isRelation property "+metaclass.getQualifiedName()+", "+propertySpecification+", "+propertyNameSought);
			List<PropertyDescriptor> propertyDescriptors=dpm.getPropertyDescriptorsByCustomizationTarget(metaclass);
			if(propertyDescriptors!=null)
			for(PropertyDescriptor propertyDescriptor:propertyDescriptors){
				String propertyName=propertyDescriptor.getPropertyName();
				if(!propertyName.equals(propertyNameSought))continue;
				Expression expression=propertyDescriptor.getExpression();
				if(expression==null)continue;
				Object test=expression.getValue(source);
				//QvtCommonAction.log("TEST isRelation "+propertyName+", "+propertySpecification+", "+test);
				if(target.equals(test))return true;
				if(Collection.class.isInstance(test)){
					for(Object object:(Collection)test){
						if(target.equals(object))return true;
					}
				}
			}
			// check if a normal property of stereotype
			for(Property property:metaclass.getAttribute()){
				if(propertyNameSought.equals(property.getName())){
					//QvtCommonAction.log("TEST isRelation normal  "+propertySpecification);
					if(Stereotype.class.isInstance(metaclass)){
						for(Object test:StereotypesHelper.getStereotypePropertyValue(source, (Stereotype)metaclass,propertyNameSought)){
							if(target.equals(test))return true;
						}
						/*
					}else{
						Object test=source.refGetValue(property);
						QvtCommonAction.log("TEST isRelation ref  "+test);
						if(target.equals(test))return true;
						if(Collection.class.isInstance(test)){
							for(Object object:(Collection)test){
								if(target.equals(object))return true;
							}
						}
						*/
					}
				}
			}
			// check if normal property of class
			EClass eClass=source.eClass();
			if(eClass!=null){
				for(EReference reference:eClass.getEAllReferences()){
					if(propertyNameSought.equals(reference.getName())){
						Object test=source.eGet(reference);
						//QvtCommonAction.log("TEST isRelation ref  "+test);
						if(target.equals(test))return true;
						if(Collection.class.isInstance(test)){
							for(Object object:(Collection)test){
								if(target.equals(object))return true;
							}
						}
					}
				}
			}
			return false;
		}
		for(Classifier classifier:metaclass.getGeneral()){
			if(Class.class.isInstance(classifier)){
				if(isRelationMatch(source,target,(Class)classifier,dpm,propertySpecification,didThat))return true;
			}
		}
		return false;
		
	}
	protected boolean isStereotypeRelation(String propertySpecification){
		String metaName= propertySpecification.split("\\.")[0];
		return (metaName.contains("::"));
	}
	protected String getMetaName(String propertySpecification){
		String metaName= propertySpecification.split("\\.")[0];
		if(metaName.contains("::")){
			metaName=metaName.split("::")[1];
		}
		return metaName;
	}
	protected String getPropertyName(String propertySpecification){
		return propertySpecification.split("\\.")[1];
	}

}
