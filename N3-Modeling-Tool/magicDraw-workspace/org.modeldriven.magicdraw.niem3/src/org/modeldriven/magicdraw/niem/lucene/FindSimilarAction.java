/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.TableModel;
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
public class FindSimilarAction extends DefaultSearchTableAction {

	public FindSimilarAction() {
		super("FIND_SIMILAR","Find Similar in NIEM Reference Models");
		setDescription(LUCENE_FIND_SIMILAR_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		JTable table=getTable();
		if(table==null)return ;
		int rowIndex=table.getSelectedRow();
		if(rowIndex<0)return ;
		TableModel model=table.getModel();
        int modelRowIndex=table.convertRowIndexToModel(rowIndex);
		String inputValue=(String)model.getValueAt(modelRowIndex, TEXT_COLUMN_INDEX);
		// remove html marking, if any
		inputValue=inputValue.replace("<","").replace(">","");
		SearchDialog searchDialog=getSearchDialog();
		
		searchDialog.textSearch(inputValue);
		
	}
	public void updateState()
	{
		Boolean enabled=true;
	    setEnabled(enabled);
		
	}	
	
}
