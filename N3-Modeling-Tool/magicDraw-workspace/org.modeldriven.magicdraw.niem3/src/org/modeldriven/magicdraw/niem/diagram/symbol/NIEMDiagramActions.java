/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.qvt.NIEMQVTPlugin;

import com.nomagic.actions.ActionsCategory;
import com.nomagic.magicdraw.actions.ActionsCreator;
import com.nomagic.magicdraw.actions.ActionsManager;
import com.nomagic.magicdraw.actions.ActionsProvider;
import com.nomagic.magicdraw.actions.MDActionsManager;

/**
 * @author Tom
 *
 */
public class NIEMDiagramActions {
	  public static MDActionsManager ACTIONS = new MDActionsManager(null);
	  static
	  {
	    ActionsCategory category = new ActionsCategory("NIEM_TEST", "NIEM_TEST");
	    ACTIONS.addCategory(category);
	    ActionsCreator creator = ActionsProvider.getInstance().getCreator();

	    creator.createCommonDiagramsActions(category);

	 
	    ACTIONS.addActionNearTheGiven("NIEM_TEST",false, NIEMQVTPlugin.classAction);
	    
	    /*
	    //category.addAction(NIEMQVTPlugin.classAction);
	    
	    creator.createClassDiagramActions();
	    creator.createGeneralActions();
	    creator.createDiagramContextToolbarActions();
	    creator.createDiagramsActionsManager();
	    creator.createAnyDiagramActions();
	    */
	    /*
	    ActionsManager classDiagramActions = (ActionsManager) creator.createClassDiagramActions().clone();

	    category.addAction(new EntityAction());
	    category.addAction(new MyClassAction());
	    category.addAction(classDiagramActions.getActionFor(ActionsID.ADD_PACKAGE));
	    */
	  }

}
