/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.TableModel;
import javax.swing.tree.TreePath;

import org.eclipse.m2m.qvt.oml.util.Log;
import org.modeldriven.magicdraw.niem.qvt.MDLog;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.modules.ModulesService;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.BrowserTabTree;
import com.nomagic.magicdraw.ui.browser.ContainmentTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;

/**
 * @author tom
 *
 */
public class LoadModuleSelectionAction extends DefaultSearchTableAction {

	public LoadModuleSelectionAction() {
		super("LOAD_MODULE_SELECTION","Load Module");
		setDescription(LUCENE_LOAD_MODULE_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		JTable table=getTable();
		if(table==null)return ;
		int rowIndex=table.getSelectedRow();
		if(rowIndex<0)return ;
		TableModel model=table.getModel();
        int modelRowIndex=table.convertRowIndexToModel(rowIndex);
		String module=(String)model.getValueAt(modelRowIndex, MODULE_COLUMN_INDEX);
		// 
		ProjectsManager projectsManager=getProjectsManager();
		//useModule(String psmmoduleFilePath,Log log,Project psmProject)
		// load referenced library (and all dependents?)
		try {
			useReferenceLibrary(module,getProject());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void useReferenceLibrary(String module,Project project) throws IOException{
        String profilesdir = getLibraryDir();
        	String baseFileName=module+".mdzip";
            String moduleFilePath = profilesdir+baseFileName;
            File absoluteFile=new File(getAbsoluteLibraryDir()+baseFileName);
	        if(!absoluteFile.exists()){
	    		    log("ERROR: could not locate referenced module at "+absoluteFile);
	    		    return;
	        }
            //useModule(psmmoduleFilePath,log,project);
    	    log("project loading Module "+moduleFilePath);
    	    ModulesService.findOrLoadLocalModule(project, moduleFilePath,false) ;

	}
	
	public void updateState()
	{
		BaseElement baseElement=getFirstElement();
		// enabled if element does not exist in model
		Boolean enabled=baseElement==null;
	    setEnabled(enabled);
		
	}	
	
}
