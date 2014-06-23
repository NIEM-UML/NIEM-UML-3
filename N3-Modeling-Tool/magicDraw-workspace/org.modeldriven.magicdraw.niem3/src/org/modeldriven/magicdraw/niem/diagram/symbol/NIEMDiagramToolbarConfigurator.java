/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.qvt.NIEMQVTPlugin;

import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.DiagramInnerToolbarConfiguration;
import com.nomagic.magicdraw.actions.MDActionsManager;
import com.nomagic.magicdraw.ui.actions.BaseDiagramToolbarConfigurator;

/**
 * @author Tom
 *
 */
public class NIEMDiagramToolbarConfigurator extends
		BaseDiagramToolbarConfigurator {
	  private String superType;

	  public NIEMDiagramToolbarConfigurator(String superType)
	  {
	    this.superType = superType;
	  }


	/* (non-Javadoc)
	 * @see com.nomagic.actions.AMConfigurator#configure(com.nomagic.actions.ActionsManager)
	 */
	@Override
	public void configure(ActionsManager manager) {
	    MDActionsManager actions = NIEMDiagramActions.ACTIONS;
	    manager.addCategory(createSelectionStickyToolbar(actions, superType));
	    manager.addCategory(createCommonToolbarConfiguration(actions, superType));
	    
	    // TODO:  get Class Diagram .........
/*
	    DiagramInnerToolbarConfiguration category= new DiagramInnerToolbarConfiguration("NIEM_DIAGRAM_ELEMENTS", null,"NIEM Diagram Elements", true);
	    manager.addCategory(category);
	    */
/*
	    category.addAction(actions.getActionFor(EntityAction.DRAW_ENTITY_ACTION));
	    category.addAction(actions.getActionFor(MyClassAction.DRAW_MY_CLASS_ACTION));
	    category.addAction(actions.getActionFor(ActionsID.ADD_PACKAGE));
	    */
//	    manager.addCategory(1, NIEMQVTPlugin.diagramToolbarConfiguration);
/*
		diagramToolbarConfiguration.addAction(NIEMQVTPlugin.packageConfiguration);
		packageConfiguration.addAction(NIEMQVTPlugin.informationModelAction);
		packageConfiguration.addAction(NIEMQVTPlugin.modelAction);
		packageConfiguration.addAction(NIEMQVTPlugin.packageAction);

		diagramToolbarConfiguration.addAction(NIEMQVTPlugin.niemTypeConfiguration);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.ObjectTypeAction);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.AdapterTypeAction);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.AssociationTypeAction);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.AugmentationTypeAction);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.MetadataTypeAction);

		niemTypeConfiguration.addAction(NIEMQVTPlugin.ChoiceAction);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.PropertyHolderAction);
		niemTypeConfiguration.addAction(NIEMQVTPlugin.classAction);

		diagramToolbarConfiguration
				.addAction(NIEMQVTPlugin.niemDataTypeConfiguration);
		niemDataTypeConfiguration.addAction(NIEMQVTPlugin.ValueRestrictionAction);
		niemDataTypeConfiguration.addAction(NIEMQVTPlugin.ListAction);
		niemDataTypeConfiguration.addAction(NIEMQVTPlugin.UnionAction);
		niemDataTypeConfiguration.addAction(NIEMQVTPlugin.dataTypeAction);
		niemDataTypeConfiguration.addAction(NIEMQVTPlugin.primitiveTypeAction);
		niemDataTypeConfiguration.addAction(NIEMQVTPlugin.enumerationAction);

		diagramToolbarConfiguration
				.addAction(NIEMQVTPlugin.niemComponentConfiguration);
		niemComponentConfiguration.addAction(NIEMQVTPlugin.MpdAction);
		niemComponentConfiguration.addAction(NIEMQVTPlugin.MpdFileSetAction);

		diagramToolbarConfiguration
				.addAction(NIEMQVTPlugin.niemGeneralizationConfiguration);
		
		// niemGeneralizationConfiguration.addAction(generalizationAction);
		addActions(manager, NIEMQVTPlugin.niemGeneralizationConfiguration,
				"Generalization");
		
		niemGeneralizationConfiguration.addAction(NIEMQVTPlugin.RestrictionAction);
		niemGeneralizationConfiguration.addAction(NIEMQVTPlugin.AugmentsAction);
		niemGeneralizationConfiguration.addAction(NIEMQVTPlugin.RolePlayedByAction);
		// niemGeneralizationConfiguration.addAction(XSDSimpleContentAction);

		// usage, realization, element import
		diagramToolbarConfiguration.addAction(NIEMQVTPlugin.niemUsageConfiguration);
		niemUsageConfiguration.addAction(NIEMQVTPlugin.mpdFileAction);
		niemUsageConfiguration.addAction(NIEMQVTPlugin.AugmentationApplicationAction);
		niemUsageConfiguration.addAction(NIEMQVTPlugin.MetadataApplicationAction);
		// niemDependencyConfiguration.addAction(ReferencesInverseAction);
		// niemDependencyConfiguration.addAction(ElementImportAction);
		
		NIEMQVTPlugin.diagramToolbarConfiguration
				.addAction(NIEMQVTPlugin.niemDependencyConfiguration);
		NIEMQVTPlugin.niemDependencyConfiguration.addAction(NIEMQVTPlugin.mpdRelationshipAction);
		
		NIEMQVTPlugin.diagramToolbarConfiguration
				.addAction(NIEMQVTPlugin.niemRealizationConfiguration);
		NIEMQVTPlugin.niemRealizationConfiguration.addAction(NIEMQVTPlugin.ReferencesAction);
		addActions(mngr, NIEMQVTPlugin.niemRealizationConfiguration, "Realization");
		
		NIEMQVTPlugin.diagramToolbarConfiguration.addAction(NIEMQVTPlugin.niemImportConfiguration);
		
		addActions(manager, NIEMQVTPlugin.niemImportConfiguration, "Element Import");

		NIEMQVTPlugin.diagramToolbarConfiguration
				.addAction(NIEMQVTPlugin.niemAssociationConfiguration);

		//addActions(mngr, niemAssociationConfiguration, "Association");
		//addActions(mngr, niemAssociationConfiguration,"Directed Association");
		addActions(manager, NIEMQVTPlugin.niemAssociationConfiguration,"Association Class");

		NIEMQVTPlugin.niemAssociationConfiguration.addAction(NIEMQVTPlugin.RoleOfAction);
		NIEMQVTPlugin.niemAssociationConfiguration.addAction(NIEMQVTPlugin.ReferenceAction);
		NIEMQVTPlugin.niemAssociationConfiguration.addAction(NIEMQVTPlugin.ContentAction);

		//niemAssociationConfiguration.addAction(AssociationClassAction);
		/*
		diagramToolbarConfiguration.addAction(niemCompositionConfiguration);
		addActions(mngr, niemCompositionConfiguration, "Composition");
		addActions(mngr, niemCompositionConfiguration,"Directed Composition");
		
		diagramToolbarConfiguration.addAction(niemAggregationConfiguration);
		addActions(mngr, niemAggregationConfiguration, "Aggregation");
		addActions(mngr, niemAggregationConfiguration,"Directed Aggregation");
*/
		/*
		 * diagramToolbarConfiguration.addAction(niemPropertyConfiguration
		 * ); niemPropertyConfiguration.addAction(RoleOfAction);
		 * niemPropertyConfiguration.addAction(PropertyAction);
		 * niemPropertyConfiguration.addAction(SequenceIDAction);
		 * niemPropertyConfiguration.addAction(XSDAnyPropertyAction);
		 * niemPropertyConfiguration.addAction(XSDPropertyAction);
		 */

	}

}
