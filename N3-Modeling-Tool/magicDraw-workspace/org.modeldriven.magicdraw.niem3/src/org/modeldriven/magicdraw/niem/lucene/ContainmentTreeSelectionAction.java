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
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;

/**
 * @author tom
 *
 */
public class ContainmentTreeSelectionAction extends DefaultSearchTableAction {

	public ContainmentTreeSelectionAction() {
		super("CONTAINMENT_TREE_SELECTION","Select in Containment Tree");
		setDescription(LUCENE_CONTAINMENT_TREE_SELECTION_ACTION_TOOLTIP);
	}
	protected ContainmentTreeSelectionAction(String id,String name) {
		super(id,name);
		
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		BaseElement baseElement=getFirstElement();
		if(NamedElement.class.isInstance(baseElement)){
			selectElementInContainmentTree((NamedElement)baseElement);
		}
	}
	static public void selectElementInContainmentTree(NamedElement baseElement)
	{
			Browser browser=getBrowser();
			if(browser!=null){
				selectElement(browser.getContainmentTree(),baseElement);
			}
	}
	static public void selectElement(BrowserTabTree containmentTree,NamedElement baseElement)
	{
		if(containmentTree!=null){
			TreePath treepath=containmentTree.findTreePathFor(baseElement);
			JTree tree=containmentTree.getTree();
			//QvtCommonAction.log("actionPerformed treepath "+treepath+", "+tree+", "+baseElement.getQualifiedName());
			if((treepath!=null)&&(tree!=null)){
				tree.scrollPathToVisible(treepath);
				tree.setSelectionPath(treepath);
			}
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
