/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JTree;
import javax.swing.tree.TreePath;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.BrowserTabTree;
import com.nomagic.magicdraw.ui.browser.ContainmentTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.ui.dialogs.specifications.SpecificationDialogManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;

/**
 * @author tom
 *
 */
public class SpecificationSelectionAction extends DefaultSearchTableAction {

	public SpecificationSelectionAction() {
		super("SPECIFICATION_SELECTION","Specification");
		setDescription(LUCENE_SPECIFICATION_SELECTION_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		BaseElement baseElement=getFirstElement();
		if(NamedElement.class.isInstance(baseElement)){
			SpecificationDialogManager.getManager().editSpecification((NamedElement)baseElement);
		}
	}
	public void updateState()
	{
		BaseElement baseElement=getFirstElement();
		// enabled if element exists in model
		Boolean enabled=baseElement!=null;
	    setEnabled(enabled);
		
	}	
	
}
