/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.ci.persistence.IAttachedProject;
import com.nomagic.ci.persistence.IProject;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.ProjectUtilities;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.ui.MainFrame;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.ContainmentTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;

/**
 * @author tom
 *
 */
public class DefaultSearchTableAction extends QvtCommonAction implements SearchConstants,ToolTipConstants{
//	protected JTable table;
	protected SearchDialog searchDialog;
	public DefaultSearchTableAction(String id, String name) {
		super(id, name);
		
	}
	public SearchDialog getSearchDialog(){return searchDialog;}
	public JTable getTable(){
		return getSearchDialog().getTable();
		}
//	public void setTable(JTable tableIn){table=tableIn;}
	public void setSearchDialog(SearchDialog searchDialogIn){searchDialog=searchDialogIn;}
	protected NamedElement newElement;
	public void	setNewElement(NamedElement newType){
		newElement=newType;
	}
	public void	updateNewElement(){
		if(newElement==null)return;
		// set in containment tree and/or diagram
		if(isShowAddsInTree()){
			// refresh the containment tree
				ContainmentTreeSelectionAction.selectElementInContainmentTree(newElement);
		}
		if(isShowAddsInDiagram()){
			Project project=getProject();
			if(project!=null){
				DiagramPresentationElement dpe=project.getActiveDiagram();
				if(dpe!=null){
					//Diagram diagram=dpe.getDiagram();
					//if(diagram!=null){
										
						  // apply changes and add command into command history.
						// let model updates propagate to current diagram elements, then start adding new stuff to diagram
						Set<PresentationElement> newElements=new HashSet<PresentationElement>();
						Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
						PresentationElement pe=dpe;
							boolean isSessionCreated=NIEMHelper.createSession("search");
							try{
								if(Property.class.isInstance(newElement)){
									pe=SubsetDialogHelper.addPropertyPresentationElements((Property)newElement,pe,dpe,element2presentation,newElements);
								}else if(Classifier.class.isInstance(newElement)){
									pe=SubsetDialogHelper.createClassifierPresentation( (Classifier)newElement, dpe, pe,element2presentation,newElements);
								}else if(EnumerationLiteral.class.isInstance(newElement)){
									pe=SubsetDialogHelper.createClassifierPresentation( ((EnumerationLiteral)newElement).getEnumeration(), dpe, pe,element2presentation,newElements);
								}
								
							} catch (ReadOnlyElementException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}finally{
								NIEMHelper.closeSession(isSessionCreated);
							}
							SubsetDialogHelper.layoutNewItems(dpe,newElements);
							if(pe!=null)pe.onFind();
					//}
				}
			}
		}
		newElement=null;
	}
protected boolean isShowAddsInTree(){
	JCheckBox checkBox=getSearchDialog().getShowAddsInTree();
	return checkBox.isEnabled()&&checkBox.isSelected();
}
protected boolean isShowAddsInDiagram(){
	JCheckBox checkBox=getSearchDialog().getShowAddsInDiagram();
	return checkBox.isEnabled()&&checkBox.isSelected();
}
	public  BaseElement 	getFirstElement(){
		JTable table=getTable();
		if(table==null)return null;
		int rowIndex=table.getSelectedRow();
		if(rowIndex<0)return null;
		TableModel model=table.getModel();
        int modelRowIndex=table.convertRowIndexToModel(rowIndex);
		String id=(String)model.getValueAt(modelRowIndex, NAME_COLUMN_INDEX);
		String module=(String)model.getValueAt(modelRowIndex, MODULE_COLUMN_INDEX);
		// find element with id in module
        //IProject project=ProjectUtilities.getProject(namedElement);
		
		Project project=getProject();
		BaseElement baseElement=project.getElementByID(id);
		//QvtCommonAction.log("BaseElement "+baseElement+", "+id);
		return baseElement;
		/*
        IAttachedProject attachedProject=	ProjectUtilities.findAttachedProjectByName( project,module,true);
        attachedProject.get
        ProjectUtilities.getE
		IAttachedProject
		table.getC
		getMainFrame
		*/		
	}
	static public Browser getBrowser(){
		MainFrame mainframe=getMainFrame();
		if(mainframe==null)return null;
		return mainframe.getBrowser();
	}
	static public MainFrame getMainFrame(){
		return getApplication().getMainFrame();
	}
	static public Application getApplication(){
		return Application.getInstance();
	}
	protected Node getNodeForObject(Object object,Node node){
		Object userObject=node.getUserObject();
		QvtCommonAction.log("getNodeForObject userObject "+userObject+", "+node);
		if(object.equals(userObject))return node;
		for(Node child:node.getChildren()){
			Node test=getNodeForObject(object,child);
			if(test!=null)return test;
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.modeldriven.magicdraw.niem.qvt.QvtCommonAction#performTransform(com.nomagic.task.ProgressStatus)
	 */
	@Override
	public void performTransform(ProgressStatus progressStatus)
			throws IOException {
		// TODO Auto-generated method stub

	}

}
