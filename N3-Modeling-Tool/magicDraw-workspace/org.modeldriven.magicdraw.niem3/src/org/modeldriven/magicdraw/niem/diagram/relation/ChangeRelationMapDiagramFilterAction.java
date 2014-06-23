/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.relation;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.visualization.relationshipmap.RelationMapManager;
import com.nomagic.magicdraw.visualization.relationshipmap.model.settings.GraphSettings;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.body.RelationMapDiagramComponent;
import com.nomagic.magicdraw.visualization.relationshipmap.ui.diagram.view.AbstractGraphDisplay;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;

/**
 * @author tom
 *
 */
public class ChangeRelationMapDiagramFilterAction extends QvtCommonAction implements RelationMapConstants{
	//protected Diagram relationMapDiagram;
	protected Element contextElement;
	public ChangeRelationMapDiagramFilterAction(String id, String name,Element element/*,Diagram diagram*/) {
		super(id, name);
		contextElement=element;
		//relationMapDiagram=diagram;
		setDescription(CHANGE_RELATION_MAP_DIAGRAM_FILTER_ACTION_TOOLTIP);
	}
	//protected Diagram getRelationMapDiagram(){return relationMapDiagram;}
	protected Element getContextElement(){return contextElement;}
	/* (non-Javadoc)
	 * @see org.modeldriven.magicdraw.niem.qvt.QvtCommonAction#performTransform(com.nomagic.task.ProgressStatus)
	 */
	@Override
	public void performTransform(ProgressStatus progressStatus)
			throws IOException {
		// TODO Auto-generated method stub

	}
	public void actionPerformed(ActionEvent actionEvent)
	{
			
			setContextElement(getContextElement());
			String filter=getFilter();
			setFilterSettings(filter);
	}
	public static void setContextElement(Element contextElement){
		GraphSettings graphSettings=getGraphSettings();
		if(graphSettings==null)return;
		if(contextElement!=null){
			graphSettings.setContextElement(contextElement);
		}
	}
	public static void setFilterSettings(String filter){
		GraphSettings graphSettings=getGraphSettings();
		if(graphSettings==null)return;
		graphSettings.setElementTypes(getElementTypes(filter));
		graphSettings.setDependencyCriterion(getRelationCriterion(filter));
	}
	public static GraphSettings getGraphSettings(){
		RelationMapDiagramComponent diagramComponent=RelationMapManager.getActiveRMDiagramComponent();
		if(diagramComponent==null)return null;
		GraphSettings graphSettings=diagramComponent.getSettings();
		return graphSettings;
	}
	public static String getCurrentFilterName(){
		GraphSettings graphSettings=getGraphSettings();
		if(graphSettings!=null){
			 List<String> criterion=graphSettings.getDependencyCriterion();
			 for(Map.Entry<String,List<String>> entry:getRelationCriterionMap().entrySet()){
//				 if(criterion.equals(entry.getValue()))return entry.getKey();
				 if(isListEqual(criterion,entry.getValue()))return entry.getKey();
			 }
			 return "custom";
		}
		 return "no graph settings";
	}
	static protected boolean isListEqual(List<String> list1,List<String> list2){
		for(String test:list1){
			if(!list2.contains(test))return false;
		}
		for(String test:list2){
			if(!list1.contains(test))return false;
		}
		return true;
	}
	static protected List<Object> getElementTypes(String filter){
		return elementTypesMap.get(filter);
	}
	static protected List<String> getRelationCriterion(String filter){
		return relationCriterionMap.get(filter);
		
	}
	protected static Map<String,List<String>> getRelationCriterionMap(){return relationCriterionMap;}
	protected String getFilter(){return getID();}
	protected static Map<String,List<Object>> elementTypesMap=new HashMap<String,List<Object>>();
	protected static Map<String,List<String>> relationCriterionMap=new HashMap<String,List<String>>();
	static{
		elementTypesMap.put(SUBSET_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(SUBSET_FILTER, Arrays.asList(subsetRelationCriterion));
		elementTypesMap.put(SUBSETTEDBY_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(SUBSETTEDBY_FILTER, Arrays.asList(subsettedByRelationCriterion));
		
		elementTypesMap.put(TOPLEVELELEMENT_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(TOPLEVELELEMENT_FILTER, Arrays.asList(topLevelElementRelationCriterion));
		elementTypesMap.put(TOPLEVELELEMENTUSAGE_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(TOPLEVELELEMENTUSAGE_FILTER, Arrays.asList(topLevelElementUsageRelationCriterion));
		elementTypesMap.put(BASETYPE_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(BASETYPE_FILTER, Arrays.asList(basetypeRelationCriterion));
		
		elementTypesMap.put(DERIVEDTYPE_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(DERIVEDTYPE_FILTER, Arrays.asList(derivedTypeRelationCriterion));

		elementTypesMap.put(CONTAINMENT_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(CONTAINMENT_FILTER, Arrays.asList(containedRelationCriterion));
		elementTypesMap.put(CONTAINER_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(CONTAINER_FILTER, Arrays.asList(containerRelationCriterion));
		elementTypesMap.put(TYPE_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(TYPE_FILTER, Arrays.asList(typeRelationCriterion));
		elementTypesMap.put(TYPEOF_FILTER, Arrays.asList(subsetElementTypes));
		relationCriterionMap.put(TYPEOF_FILTER, Arrays.asList(typeofRelationCriterion));
		
		
	}
}
