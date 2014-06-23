/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.table.TableHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectEventListener;
import com.nomagic.magicdraw.core.project.ProjectEventListenerAdapter;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.ContainmentTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.uml.ExtendedPropertyNames;
import com.nomagic.magicdraw.uml.symbols.DiagramListenerAdapter;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.impl.PropertyNames;


/**
 * @author tom
 *
 */
public class SearchDialog extends JDialog implements SearchConstants
	//implements ActionListener
	{
	protected ProjectEventListenerAdapter projectEventListenerAdapter=null;
	protected TreeSelectionListener containmentTreeSelectionListener=null;
	protected Project currentProject=null;
	protected JTable table=null;
	protected JPopupMenu popup=null;
	protected DefaultTableModel dataModel = null;
	protected JLabel description=null;
	//protected DiagramListenerAdapter diagramListenerAdapter; 
	
	protected PropertyChangeListener diagramSelectionListenerRouter=null;
	protected String lastSearch="";
	protected JCheckBox showAddsInTree=new JCheckBox("Show Adds in Tree");
	protected JCheckBox showAddsInDiagram=new JCheckBox("Show Adds in Diagram");


	protected Vector<String> columnNames=new Vector<String>();
	public SearchDialog(Frame frame,String title,Vector<Vector<String>> data){
		super(frame,title);
		currentProject=Application.getInstance().getProject();
		
		for(String columnName:columnNameValues)columnNames.add(columnName);
	    dataModel = new SearchTableModel(data,  columnNames);
	    
	    table = new JTable(dataModel){
	    	  //Implement table cell tool tips.
	    	    public String getToolTipText(MouseEvent e) {
	    	    	String tip="";
	    	    	try{
	    	        java.awt.Point p = e.getPoint();
	    	        int rowIndex = rowAtPoint(p);
	    	        int colIndex = columnAtPoint(p);
	    	        int realColumnIndex = convertColumnIndexToModel(colIndex);
	    	        int modelRowIndex=this.convertRowIndexToModel(rowIndex);
	    	    	int usedIndex=realColumnIndex;
	    	    	if(usedIndex==DISPLAYED_MODULE_COLUMN_INDEX)usedIndex=MODULE_COLUMN_INDEX;
	    	    	else if(usedIndex==DISPLAYED_NAME_COLUMN_INDEX)usedIndex=NAME_COLUMN_INDEX;
	    	    	else if(usedIndex==DISPLAYED_TEXT_COLUMN_INDEX)usedIndex=TEXT_COLUMN_INDEX;
	    	    	
	    	        tip =""+getModel().getValueAt(modelRowIndex, usedIndex);
	    	        if(usedIndex==NAME_COLUMN_INDEX){
	    	        	tip=tip.substring(1).replace("-","::");
	    	        }
	    	    	}catch(Throwable t){
	    	    		System.out.println("while resolving tooltip: "+t);
	    	    	}
	    	        return tip;
	    	    }	
	    	    //Implement table header tool tips.
	    	    protected JTableHeader createDefaultTableHeader() {
	    	        return new JTableHeader(columnModel) {
	    	            public String getToolTipText(MouseEvent e) {
	    	                String tip = null;
	    	                java.awt.Point p = e.getPoint();
	    	                int index = columnModel.getColumnIndexAtX(p.x);
	    	                int realIndex = 
	    	                        columnModel.getColumn(index).getModelIndex();
	    	                return columnToolTips[realIndex];
	    	            }
	    	        };
	    	    }	    	    
	      };
	      table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
	      table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	      Color gridColor=Color.BLUE;
	      table.setGridColor( gridColor) ;
	      RowSorter<? extends TableModel> sorter= new TableRowSorter(dataModel);
	      table.setRowSorter(sorter);
	      initColumnSizes(table);
	    //Add listener to components that can bring up popup menus.
	       popup=new JPopupMenu();
	       /*
	    	JMenuItem menuItem = new JMenuItem("Another popup menu item");
	        menuItem.addActionListener(this);
	        popup.add(menuItem);	    	
	    	*/
	    	table.add(popup);
	      MouseListener popupListener = new MouseAdapter(){
		    public void mousePressed(MouseEvent e) {
		        maybeShowPopup(e);
		    }

		    public void mouseReleased(MouseEvent e) {
		        maybeShowPopup(e);
		    }

		    private void maybeShowPopup(MouseEvent e) {
		        if (e.isPopupTrigger()) {
	    	        java.awt.Point p = e.getPoint();
	    	        int rowIndex = table.rowAtPoint(p);
	    	        if(rowIndex>=0){
	    	        	table.clearSelection();
	    	        	table.addRowSelectionInterval(rowIndex, rowIndex);
	    	        	configurePopup();
	    	        	popup.show(table, e.getX(), e.getY());
	    	        }
		        }
		    }
		};
	      table.addMouseListener(popupListener);
	    JScrollPane scrollpane = new JScrollPane(table);
	    
	    Box outerBox=new Box(BoxLayout.Y_AXIS);
	    Box buttonBox=new Box(BoxLayout.X_AXIS);
	    
	    description=new JLabel(descriptionText);
	    JButton ok=new JButton("Close");
	    // add manual search
	    JButton textSearch=new JButton("Text Search");
	    textSearch.setToolTipText("Replaces search table based on Search Expression");
	    final JCheckBox treeSearch=new JCheckBox("Track Tree Selection");
	   
	    treeSearch.setToolTipText("Replaces search table based on selected Containment Tree element");
	    final JCheckBox diagramSearch=new JCheckBox("Track Diagram Selection");
	    diagramSearch.setToolTipText("Replaces search table based on selected Diagram element");
	    //final JCheckBox showAddsInTree=new JCheckBox("Show Adds in Tree");
	    showAddsInTree.setToolTipText("Select primary result of add subset elements in Containment Tree");
	    //final JCheckBox showAddsInDiagram=new JCheckBox("Show Adds in Diagram");
	    showAddsInDiagram.setToolTipText("Add primary result of add subset elements to active diagram");
	    outerBox.add(description);
	    outerBox.add(scrollpane);
	    buttonBox.add(ok);
	    buttonBox.add(textSearch);
	    buttonBox.add(treeSearch);
	    buttonBox.add(diagramSearch);
	    buttonBox.add(showAddsInTree);
	    buttonBox.add(showAddsInDiagram);
	    outerBox.add(buttonBox);
	    
	    treeSearch.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent arg0) {
				showAddsInTree.setEnabled(!treeSearch.isSelected());
				
			}
	    	
	    });
	    diagramSearch.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent arg0) {
				showAddsInDiagram.setEnabled(!diagramSearch.isSelected());
				
			}
	    	
	    });
	    ok.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				closeSearchDialog();
			}
	    	
	    });
	    textSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// get text
				String inputValue = getSearchQuery(SearchDialog.this,getLastSearch());
				if(inputValue!=null){
					// redo search; clear table; new title; clear any previous selection
					textSearch(inputValue);
				}
			}
	    	
	    });
	    // switch these to MDActions...some may need to listen to tree/diagram for enable change?
	    // or should we just listen to changes ?
		Browser browser=DefaultSearchTableAction.getBrowser();
		if(browser!=null){
			final ContainmentTree containmentTree=browser.getContainmentTree();
			if(containmentTree!=null){
				JTree containmentJTree=containmentTree.getTree();
				if(containmentJTree!=null){
					containmentTreeSelectionListener=new TreeSelectionListener(){
	
						@Override
						public void valueChanged(TreeSelectionEvent arg0) {
							if(!isVisible())return;
							if(!treeSearch.isSelected())return;
							// pickup new selection and change model
							Node node=containmentTree.getSelectedNode();
							if(node!=null){
								refreshDataModel(node.getUserObject());
							}
						}
						
					};
					containmentJTree.addTreeSelectionListener(containmentTreeSelectionListener);
				}
			}
		}
		diagramSelectionListenerRouter=new PropertyChangeListener()
		 {
			
	        public void propertyChange(PropertyChangeEvent evt)
	        {
	        	if(!isVisible())return;
				if(!diagramSearch.isSelected())return;
				refreshDataModel(evt.getNewValue());
	        }
	 };
		DiagramSelectionListenerRouter.INSTANCE.addPropertyChangeListener(diagramSelectionListenerRouter);
		/*
		Project project=QvtCommonAction.getProject();
		if(project!=null){
			diagramListenerAdapter = new DiagramListenerAdapter(new PropertyChangeListener()
			 {
				
			        public void propertyChange(PropertyChangeEvent evt)
			        {
			        	
			                String propertyName = evt.getPropertyName();
		                	QvtCommonAction.log("DiagramListener propertyName "+propertyName);
			                if (PropertyNames.SELECTION.equals(propertyName))
			                {
			                	QvtCommonAction.log("DiagramListener selection "+evt.getNewValue());
			                        // added/removed symbol
			                        //PresentationElement presentationElement = (PresentationElement) evt.getNewValue();
			                }
			        }
			 });

			diagramListenerAdapter.install(project);
		}
		*/
	    /*
	    treeSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// get selected tree item
			}
	    	
	    });
	    diagramSearch.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// get selected tree item
				
			}
	    	
	    });
	    */
	    add(outerBox);
	    setResizable(true);
	    Dimension d=frame.getSize();
	    Rectangle r=frame.getBounds();
	    d.height=d.height/2;
	    d.width=(3*d.width)/4;
	    setSize(d);
	    setBounds(r.x+d.width/4, r.y+d.height/2, d.width, d.height);
	    // we better listen to the project coming and going
	    ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
	    projectEventListenerAdapter=new ProjectEventListenerAdapter(){
	    	public void 	projectActivated(Project project){
				 if(project.equals(currentProject)){
						setVisible(true);
				 }
	    		
	    	}
			public void 	projectClosed(Project project){
				 if(project.equals(currentProject)){
					 closeSearchDialog();
				 }
			 }
			public void 	projectDeActivated(Project project){
				 if(project.equals(currentProject)){
						setVisible(false);
				 }
				 
			 }
	    };
	    projectsManager.addProjectListener(projectEventListenerAdapter);
	    // this does not work:
	    addWindowStateListener(new WindowStateListener(){

			@Override
			public void windowStateChanged(WindowEvent event) {
				QvtCommonAction.log("windowStateChanged "+event.getNewState());
				if(event.getNewState()==WindowEvent.WINDOW_CLOSED){
					closeSearchDialog();
				}
				
			}
	    	
	    });
	    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    setVisible(true);
	}
    public static String namedElementTitle(NamedElement namedElement){
	   return "Reference Model Elements similar to "+namedElement.getQualifiedName();

    }
    public static String searchTitle(){
	   return "Reference Model Elements similar to Search Text";

    }
    public static String getSearchQuery(Component parentComponent,String lastSearch){
		String inputValue = (String)JOptionPane.showInputDialog(parentComponent,
				"Please enter search query expression","Search NIEM Reference Models",JOptionPane.QUESTION_MESSAGE,
				 QvtCommonAction.getNiemIcon(),
                 null,
                 lastSearch);
    	return inputValue;
    }
    public void setDescription(String text){
		description.setText(text);
    }
    public String getLastSearch(){return lastSearch;}
    public void setLastSearch(String text){
		lastSearch=text;
    }
    protected void refreshDataModel(Object userObject){
		boolean isAssociation=(Association.class.isInstance(userObject)&&!AssociationClass.class.isInstance(userObject));
		if((Classifier.class.isInstance(userObject)&&!isAssociation)
				||Property.class.isInstance(userObject)
				||EnumerationLiteral.class.isInstance(userObject)){
			NamedElement userElement=(NamedElement)userObject;
			if (NIEMHelper.isInInformationModel(userElement)) {
				SearchDialog.this.setTitle(namedElementTitle(userElement));
				description.setText(descriptionText);
				Vector<Vector<String>> data=SearchReferenceModels.elementSearchReferenceModels(userElement);
				dataModel.setDataVector(data, columnNames);
			      initColumnSizes(getTable());
				
			}
			
		}
    	
    }
    public void textSearch(String inputValue){
		setLastSearch(inputValue);
		SearchDialog.this.setTitle(searchTitle());
//		description.setText("Search: "+inputValue);
		setDescription("Search: "+inputValue);
		Vector<Vector<String>> data=SearchReferenceModels.textSearchReferenceModels(inputValue,null);
		dataModel.setDataVector(data, columnNames);
	      initColumnSizes(getTable());
    	
    }
	protected void closeSearchDialog(){
		//QvtCommonAction.log("closeSearchDialog");
		setVisible(false);
	    ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		if(projectEventListenerAdapter!=null){
			projectsManager.removeProjectListener(projectEventListenerAdapter);
			projectEventListenerAdapter=null;
		}
		currentProject=null;
		Browser browser=DefaultSearchTableAction.getBrowser();
		if(browser!=null){
			ContainmentTree containmentTree=browser.getContainmentTree();
			if(containmentTree!=null){
				JTree containmentJTree=containmentTree.getTree();
				if(containmentJTree!=null){
					if(containmentTreeSelectionListener!=null){
						containmentJTree.removeTreeSelectionListener(containmentTreeSelectionListener);
						containmentTreeSelectionListener=null;
					}
				}
			}
		}
		if(diagramSelectionListenerRouter!=null){
			DiagramSelectionListenerRouter.INSTANCE.removePropertyChangeListener(diagramSelectionListenerRouter);	
			diagramSelectionListenerRouter=null;
		}
		/*
		Project project=QvtCommonAction.getProject();
		if((project!=null)&&(diagramListenerAdapter!=null)){
			 // When it is no longer needed, uninstall it.
			diagramListenerAdapter.uninstall(project);		
		}
		diagramListenerAdapter=null;
		*/
		table=null;
		popup=null;
		dataModel = null;
		description=null;
		super.dispose();
	}
	public void dispose(){
		closeSearchDialog();
	}
	protected static FindSimilarAction findSimilarAction=new FindSimilarAction();
	protected static ContainmentTreeSelectionAction containmentTreeSelectionAction=new ContainmentTreeSelectionAction();
	protected static InheritanceTreeSelectionAction inheritanceTreeSelectionAction=new InheritanceTreeSelectionAction();
	protected static SpecificationSelectionAction specificationSelectionAction=new SpecificationSelectionAction();
	protected static LoadModuleSelectionAction loadModuleSelectionAction=new LoadModuleSelectionAction();
	protected static AddSubsetClassifierAction addSubsetClassifierAction=new AddSubsetClassifierAction();
	protected static AddSubsetPropertyAction addSubsetPropertyAction=new AddSubsetPropertyAction();
	protected static AddSubsetEnumerationLiteralAction addSubsetEnumerationLiteralAction=new AddSubsetEnumerationLiteralAction();
	protected void configurePopup(){
		popup.removeAll();
//    	JMenuItem menuItem = new JMenuItem("Another popup menu item");
 //       menuItem.addActionListener(this);
		//ContainmentTreeSelectionAction containmentTreeSelectionAction=new ContainmentTreeSelectionAction();
		addAction(containmentTreeSelectionAction);
		addAction(inheritanceTreeSelectionAction);
		addAction(specificationSelectionAction);
		addAction(findSimilarAction);
		addAction(addSubsetClassifierAction);
		addAction(addSubsetPropertyAction);
		addAction(addSubsetEnumerationLiteralAction);
		addAction(loadModuleSelectionAction);
		/*
    	JMenuItem menuItem = new JMenuItem(containmentTreeSelectionAction);
        popup.add(menuItem);	    	
        containmentTreeSelectionAction.updateState();
        containmentTreeSelectionAction.setTable(table);
        */
	}
	public JTable getTable(){return table;}
public JCheckBox getShowAddsInTree(){return showAddsInTree;}
public JCheckBox getShowAddsInDiagram(){return showAddsInDiagram;}
	protected void addAction(DefaultSearchTableAction containmentTreeSelectionAction){
    	JMenuItem menuItem = new JMenuItem(containmentTreeSelectionAction);
        popup.add(menuItem);	    	
//        containmentTreeSelectionAction.setTable(table);
        containmentTreeSelectionAction.setSearchDialog(this);
        containmentTreeSelectionAction.updateState();
		
	}
	  /*
     * This method picks good column sizes.
     * If all column heads are wider than the column's cells'
     * contents, then you can just use column.sizeWidthToFit().
     */
    private void initColumnSizes(JTable table) {
        TableModel model =table.getModel();
        
        TableColumn column = null;
        Component comp = null;
//        int headerWidth = 0;
//        int cellWidth = 0;
//        Object[] longValues = model.longValues;
        TableCellRenderer headerRenderer = table.getTableHeader().getDefaultRenderer();
 
        for (int i = 0; i < model.getColumnCount(); i++) {
            column = table.getColumnModel().getColumn(i);
 
            comp = headerRenderer.getTableCellRendererComponent(
                                 null, column.getHeaderValue(),
                                 false, false, 0, 0);
            int maxWidth = comp.getPreferredSize().width;
            for(int row=0;row<model.getRowCount();row++){
	            comp = table.getDefaultRenderer(model.getColumnClass(i)).
	                             getTableCellRendererComponent(
	                                 table, 
//	                                 longValues[i],
	                                 model.getValueAt(row, i),
	                                 false, false, 0, i);
	            maxWidth = Math.max(maxWidth,comp.getPreferredSize().width);
            }
//            column.setPreferredWidth(Math.max(headerWidth, cellWidth));
            //QvtCommonAction.log("SearchDialog column "+i+", "+maxWidth);
            column.setPreferredWidth(maxWidth);
        }
    }	
	///////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////
	// change this to MDAction and check if we can hook into  MD like actions
	/*
	@Override
	public void actionPerformed(ActionEvent event) {
		//QvtCommonAction.log("search menu"+event.getSource());
		if(JMenuItem.class.isInstance(event.getSource())){
			JMenuItem item=(JMenuItem)event.getSource();
			int rowIndex=table.getSelectedRow();
			QvtCommonAction.log("search menu row "+rowIndex);
		}
		
	}
	*/	
}
