/**
 * 
 */
package org.modeldriven.magicdraw.niem.table;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.KeyStroke;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.CancelError;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.generictable.GenericTableManager;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
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
abstract public class GenericTableAction extends DefaultBrowserAction implements NIEM_ProfileConstants{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String diagramSuffix;
	protected NamedElement browserPackage;
	public GenericTableAction(String actionID, String actionName, KeyStroke stroke, String group,
			String diagramSuffix,NamedElement browserPackage,String tooltip,MDMenuAction category){
		super(actionID,actionName,stroke,group);
		this.diagramSuffix=diagramSuffix;
		this.browserPackage=browserPackage;
		setSmallIcon(QvtCommonAction.getNiemIcon());
		setDescription(tooltip);
		category.addAction(this);
	}
    @Override
    public void actionPerformed(ActionEvent evt)
    {
	    // create runnable
	    RunnableWithProgress runnable = new RunnableWithProgress()
		    {
		            public void run(ProgressStatus progressStatus)
		            {
		                    int max = Integer.MAX_VALUE;
		                    progressStatus.init("Start...", 0, max);
		        	            boolean isSessionCreated=NIEMHelper.createSession(diagramSuffix+browserPackage.getName());
		        	                Project project = Project.getProject(browserPackage);
		        	                //Create Generic table diagram
		        	                try
		        	                {
		        	                	Diagram createdDiagram =createGenericTable(project,  browserPackage,diagramSuffix);
		        	                	initializeTable(project,createdDiagram,progressStatus);
		        	                	progressStatus.setDescription("Opening Table Diagram");
		        	                        project.getDiagram(createdDiagram).open(true);
		        	                }
		        	                catch (ReadOnlyElementException e)
		        	                {
		        	                    e.printStackTrace();
	    							}catch(CancelError e){
		        	                }finally{
		        	                	NIEMHelper.closeSession(isSessionCreated);
		        	                }
		            }
		    };
	    // run with progress
	    ProgressStatusRunner.runWithProgressStatus(runnable,getName()+ " progress", true, 0);
    	
    }
    abstract protected void initializeTable(Project project,Diagram createdDiagram,ProgressStatus progressStatus);
    protected Diagram createGenericTable(Project project, NamedElement element,String suffix) throws ReadOnlyElementException{	
    	Namespace owner=(Namespace)element.getOwner();
    	if(element instanceof Namespace)owner=(Namespace)element;
    	String diagramName=getUniqueDiagramName(owner, element.getName(), suffix);
        Diagram createdDiagram = GenericTableManager.createGenericTable(project, diagramName);
//        createdDiagram.setOwner(element.getOwner());
        createdDiagram.setOwner(owner);
        InstanceSpecification diagramInstance=createdDiagram.getAppliedStereotypeInstance();
        if(diagramInstance!=null){
        	
        	Stereotype stereotype=getDiagramTableStereotype(diagramInstance);
        	if(stereotype!=null){
        		NIEMHelper.setStereotypePropertyValue(createdDiagram, stereotype, "showFullPath", Boolean.FALSE);
        		NIEMHelper.setStereotypePropertyValue(createdDiagram, stereotype, "autoResizeOn", Boolean.TRUE);
        	}
        }
        return createdDiagram;
    }
    public String getUniqueDiagramName(Namespace owner,String baseName,String suffix){
    	//  make sure unique
    	String proposedName=baseName+suffix;
    	if(isDiagramNameUnique(owner,proposedName))return proposedName;
    	int index=1;
    	while(true){
    		proposedName=baseName+index+suffix;
    		if(isDiagramNameUnique(owner,proposedName))return proposedName;
    		index++;
    	}
    }
    protected boolean isDiagramNameUnique(Namespace owner,String name){
		for(Element t:owner.getOwnedElement()){
			if(!Diagram.class.isInstance(t))continue;
			if(name.equals(((Diagram)t).getName()))return false;
		}
	return true;
	
}
    protected Stereotype getDiagramTableStereotype(InstanceSpecification diagramInstance){
    	for(Classifier classifier:diagramInstance.getClassifier()){
    		if("DiagramTable".equals(classifier.getName())&&(classifier instanceof Stereotype)){
    			return (Stereotype)classifier;
    		}
    	}
    	return null;
    }
    public static void addClassifierTableTypes(Project project,List<Object> tableElementTypes){
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"Classifier"));
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"AssociationClass"));
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"Class"));
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"DataType"));
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"Enumeration"));
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"PrimitiveType"));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(ListStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(AugmentationTypeStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(ChoiceStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName));
        
        tableElementTypes.add(NIEMHelper.getCommonStereotype(NIEMTypeStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(UnionStereotypeName));
        tableElementTypes.add(NIEMHelper.getCommonStereotype(ValueRestrictionStereotypeName));
        tableElementTypes.add(NIEMHelper.getPsmStereotype(XSDRepresentationRestrictionStereotypeName));
		
	}
	public static void addPropertyTableTypes(Project project,List<Object> tableElementTypes){
        tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"Property"));
        tableElementTypes.add(NIEMHelper.getPimStereotype(RoleOfStereotypeName));
        tableElementTypes.add(NIEMHelper.getPsmStereotype(SequenceIDStereotypeName));
        tableElementTypes.add(NIEMHelper.getPsmStereotype(XSDAnyPropertyStereotypeName));
        tableElementTypes.add(NIEMHelper.getPsmStereotype(XSDPropertyStereotypeName));
		
	}
	public static void addPackageTableTypes(Project project,List<Object> tableElementTypes){
        tableElementTypes.add(NIEMHelper.getPimStereotype(InformationModelStereotypeName));
	}
    

}
