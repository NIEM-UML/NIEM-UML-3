/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.relation;

import org.modeldriven.magicdraw.niem.qvt.NIEMQVTPlugin;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.visualization.relationshipmap.actions.RMActionsConfigurator;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;

/**
 * @author Tom
 *
 */
public class NIEMRelationMapDiagramConfigurator implements RMActionsConfigurator, NIEM_ProfileConstants,RelationMapConstants{


	@Override
	public void configureContextActions(ActionsManager mngr,
			Element userElement) {
		MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
		String currentFilter=ChangeRelationMapDiagramFilterAction.getCurrentFilterName();
		MDMenuAction category = new MDMenuAction("NIEM", "NIEM filter("+currentFilter+")", null,NIEMQVTPlugin.niemGroupName);
		category.setSmallIcon(QvtCommonAction.getNiemIcon());
		category.setNested(true);
		categoryDummy.addAction(category);
		
		// options to change filter for current context
		// subsetting, *subsetted, topLevelElement, topLevelElement Usage,
		// basetype inheritance, *descendence, contained, container
		// type, typeOf
		// need to display current filter...............perhaps in menu
		MDAction relationDiagramAction=new ChangeRelationMapDiagramFilterAction(SUBSET_FILTER,SUBSET_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		 relationDiagramAction=new ChangeRelationMapDiagramFilterAction(SUBSETTEDBY_FILTER,SUBSETTEDBY_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(TOPLEVELELEMENT_FILTER,TOPLEVELELEMENT_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(TOPLEVELELEMENTUSAGE_FILTER,TOPLEVELELEMENTUSAGE_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(BASETYPE_FILTER,BASETYPE_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(DERIVEDTYPE_FILTER,DERIVEDTYPE_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(CONTAINMENT_FILTER,CONTAINMENT_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(CONTAINER_FILTER,CONTAINER_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(TYPE_FILTER,TYPE_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		relationDiagramAction=new ChangeRelationMapDiagramFilterAction(TYPEOF_FILTER,TYPEOF_FILTER_NAME,userElement);
		category.addAction(relationDiagramAction);
		
		mngr.addCategory(categoryDummy);
		
	}

	@Override
	public void configureDiagramContextActions(ActionsManager mngr,
			Diagram arg1) {
		MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
		MDMenuAction category = new MDMenuAction("NIEM", "NIEM", null,NIEMQVTPlugin.niemGroupName);
		category.setSmallIcon(QvtCommonAction.getNiemIcon());
		category.setNested(true);
		categoryDummy.addAction(category);
		// similar to above, for selected element? or other variant?
		
		mngr.addCategory(categoryDummy);
		
	}

	@Override
	public void configureShortcutActions(ActionsManager arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureToolBarActions(ActionsManager mngr) {
		String id="";
		for(NMAction action:mngr.getAllActions()){
			id=action.getID();
			break;
		}
		// similar to above, for selected element
		//mngr.addActionNearTheGiven(id, true, RoleOfAction);
		/*
		mngr.addAction(RoleOfAction);
		MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
		MDMenuAction category = new MDMenuAction("NIEM", "NIEM", null,niemGroupName);
		category.setSmallIcon(QvtCommonAction.getNiemIcon());
		category.setNested(true);
		categoryDummy.addAction(category);
		
		mngr.addCategory(categoryDummy);
		*/
	}
	
}
