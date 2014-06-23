/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.DiagramDialogHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.foundation.diagram.AbstractDiagramRepresentationObject;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramDescriptor;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.visualization.relationshipmap.actions.CreateRelationMapDiagram;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author tom
 *
 */
public class NIEMEntityDiagramAction extends DefaultBrowserAction implements NIEM_ProfileConstants,ToolTipConstants{
	protected Classifier classifier=null;
	/**
	 * 
	 */
	public NIEMEntityDiagramAction(String id, String name,Classifier classifierIn)
	{
		super(id, name,null,null);
		classifier=classifierIn;
		this.setSmallIcon(QvtCommonAction.getNiemIcon());
		setDescription(NIEM_ENTITY_DIAGRAM_ACTION_TOOLTIP);
		setEnabled(false);
	}
		public void actionPerformed(ActionEvent actionEvent)
		{
//			BaseElement baseElement=this.getFirstElement();
			BaseElement baseElement=classifier;
			if(Classifier.class.isInstance(baseElement)){
			try {
				DiagramDialogHelper.createEntityDiagram((Classifier)baseElement,QvtCommonAction.getProject());
			} catch (ReadOnlyElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				QvtCommonAction.log("ERROR: during Entity Diagram Creation: "+e);
			}
			}
			
		}
		
		public void updateState()
		{
			// enabled when selection is Classifier and it meets the other criteria

//			Boolean enabled=DiagramDialogHelper.acceptEntityDiagramContext(getFirstElement());
			Boolean enabled=DiagramDialogHelper.acceptEntityDiagramContext(classifier);
			setEnabled(enabled);
		}
	
}
