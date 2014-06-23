/**
 * 
 */
package org.modeldriven.magicdraw.niem.table;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.actions.ActionsManager;
import com.nomagic.diagramtable.DTConfigurator;
import com.nomagic.diagramtable.TablesConstants;
import com.nomagic.generictable.GenericTableManager;
import com.nomagic.generictable.GenericTableSettings;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;

/**
 * @author tom
 *
 */
public class TableHelper implements NIEM_ProfileConstants,ToolTipConstants{
	static public String RefreshableTableSuffix="NIEMDependenciesTable";
	static public String UsesTableSuffix="Uses"+RefreshableTableSuffix;
	static public String UsedByTableSuffix="UsedBy"+RefreshableTableSuffix;
	static public void configureGenericTableToolbar(){
	    GenericTableSettings.addGenericTableToolbarConfigurator(new DTConfigurator()
	    {
	      @Override
	      public void configure(ActionsManager manager)
	      {
	        MDAction action = new MDAction("REFRESH_DEPENDENCIES_ACTION_ID", "Refresh", null, "")
	        {
	          @Override
	          public void actionPerformed(ActionEvent e)
	          {
	              Diagram diagram=getCurrentDiagram();
	              //System.out.println("TableHelper.actionPerformed diagram : " + diagram);
	              if(diagram==null)return;
	              //System.out.println("TableHelper.actionPerformed diagram name: " + diagram.getName());
	              String diagramName=diagram.getName();
	              if(diagramName.endsWith(UsesTableSuffix)){
	            	  
	            	  Package informationModel=NIEMHelper.getNearestInformationModel(diagram);
	            	  if(informationModel!=null){
	    	              if(diagramName.endsWith(UsedByTableSuffix)){
	            		  refreshUsedByPackageDependenciesTable(informationModel,diagram,null);
	    	              }else{
	            		  refreshPackageDependenciesTable(informationModel,diagram,null);
	    	              }
	            	  }
	              }
	          }
	          protected Diagram getCurrentDiagram(){
	        	  Project project=Application.getInstance().getProject();
	        	  if(project==null)return null;
	        	  DiagramPresentationElement dpe=project.getActiveDiagram();
	              //System.out.println("TableHelper.actionPerformed : " + dpe);
	              if(dpe==null)return null;
	              Diagram diagram=dpe.getDiagram();
	              if(diagram==null)return null;
	              if(diagram.getName().endsWith(RefreshableTableSuffix))return diagram;
	              return null;
	        	  
	          }
	     	 public void 	updateState() {
	     		super.updateState();
	     		 setEnabled(isEnabled());
	     	 }
	          
	          @Override
	          public boolean isEnabled()
	          {
	        	  boolean result= super.isEnabled()&&(getCurrentDiagram()!=null);
	        	  return result;
	          }
	        };
	        action.setSmallIcon(QvtCommonAction.getNiemIcon());
	        action.setDescription("Refresh NIEM dependency table");
	        manager.addActionNearTheGiven(TablesConstants.ADD_EXISTING_BUTTON, true, action);
	      }
	    });
	}
	protected static void refreshUsedByPackageDependenciesTable(Package informationModel,Diagram createdDiagram,ProgressStatus progressStatus){
		GenericTableManager.getRowElements(createdDiagram).clear();
        //Add elements to table
        for(Type type:informationModel.getOwnedType()){
        	if(progressStatus!=null){
        	progressStatus.setDescription("usedBy for "+type.getQualifiedName());
        	}
        	addUsedByDependencyType(createdDiagram,type,informationModel);
        }
    }
	protected static void refreshCommentTable(NamedElement element,Diagram createdDiagram,ProgressStatus progressStatus){
		GenericTableManager.getRowElements(createdDiagram).clear();
        //Add elements to table
		boolean hasComment=false;
        for(Comment comment:element.getOwnedComment()){
			GenericTableManager.addRowElement(createdDiagram, comment);
			hasComment=true;
        }
        if(!hasComment 
        		&& NIEMHelper.isInInformationModel(element)
        		&& (Package.class.isInstance(element)||Classifier.class.isInstance(element)||Property.class.isInstance(element)||EnumerationLiteral.class.isInstance(element))
        		){
        	NIEMHelper.addComment(element);
        }
        progressStatus.setDescription("Comments for "+element.getQualifiedName());
        for(Element ownedElement:element.getOwnedElement()){
        	if(!NamedElement.class.isInstance(ownedElement))continue;
        	refreshCommentTable((NamedElement)ownedElement,createdDiagram,progressStatus);
        }
    }
	static protected void addUsedByDependencyType(Diagram createdDiagram, Type type,Package informationModel) {

		if(Classifier.class.isInstance(type)){
			Classifier classifier=(Classifier)type;
			boolean isExternalPackageReference=false;
			// check subtypes
			for(Element test:classifier.get_directedRelationshipOfTarget()){
				if(Generalization.class.isInstance(test)){
					Classifier specific=((Generalization)test).getSpecific();
	    			Package generalModel=NIEMHelper.getNearestInformationModel(specific);
	    			if(generalModel==null)continue;
	    			if(!informationModel.equals(generalModel)){
	    				isExternalPackageReference=true;
	    				break;
	    			}
				}
				else if(Dependency.class.isInstance(test)&&(NIEMHelper.isRestriction(test)||NIEMHelper.hasStereotype(test,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName)))){
					Dependency dependency=((Dependency)test);
					for(NamedElement supplier:dependency.getClient()){
						if(Classifier.class.isInstance(supplier)){
							Classifier general=(Classifier)supplier;
			    			Package generalModel=NIEMHelper.getNearestInformationModel(general);
			    			if(generalModel==null)continue;
			    			if(!informationModel.equals(generalModel)){
			    				isExternalPackageReference=true;
			    				break;
			    			}
						}
					}
				}
			}
			for(TypedElement typedElement:classifier.get_typedElementOfType()){
				if(!Property.class.isInstance(typedElement))continue;
    			Package generalModel=NIEMHelper.getNearestInformationModel(typedElement);
    			if(generalModel==null)continue;
    			if(!informationModel.equals(generalModel)){
    				isExternalPackageReference=true;
    				break;
    			}
    		}
    		if(isExternalPackageReference){
				GenericTableManager.addRowElement(createdDiagram, classifier);
    		}
			for(Property property:classifier.getAttribute()){
				addUsedByDependencyProperty(createdDiagram,property,informationModel);
			}
			if(AssociationClass.class.isInstance(classifier)){
				for(Property property:((AssociationClass)classifier).getOwnedEnd()){
					addUsedByDependencyProperty(createdDiagram,property,informationModel);
				}
			}
		}
		
	}
	static protected void addUsedByDependencyProperty(Diagram createdDiagram, Property property,Package informationModel) {
		boolean isExternalPackageReference=false;
		for(Property substitution:property.get_propertyOfSubsettedProperty()){
			Package generalModel=NIEMHelper.getNearestInformationModel(substitution);
			if(generalModel!=null){
    			if(!informationModel.equals(generalModel)){
    				isExternalPackageReference=true;
    				break;
    			}
			}
		}
		for(Dependency dependency:property.getSupplierDependency()){
			if(NIEMHelper.isReferences(dependency)){
				for(NamedElement client:dependency.getClient()){
					if(Property.class.isInstance(client)){
						Package generalModel=NIEMHelper.getNearestInformationModel(client);
						if(generalModel!=null){
			    			if(!informationModel.equals(generalModel)){
			    				isExternalPackageReference=true;
			    				break;
			    			}
						}
						
					}
				}
			}
		}
		if(isExternalPackageReference){
			GenericTableManager.addRowElement(createdDiagram, property);
		}
		
	}
	
	protected static void refreshPackageDependenciesTable(Package informationModel,Diagram createdDiagram,ProgressStatus progressStatus){
		GenericTableManager.getRowElements(createdDiagram).clear();
		//System.out.println("refreshPackageDependenciesTable "+GenericTableManager.getRowElements(createdDiagram).size());
                //Add elements to table
                for(Type type:informationModel.getOwnedType()){
                	if(progressStatus!=null){
                		progressStatus.setDescription("Dependencies for "+type.getQualifiedName());
                	}
                	addDependencyType(createdDiagram,type,informationModel);
                }
	        }
	public static void newNIEMCommentTableAction(MDMenuAction category,final PresentationElement requestor,final NamedElement browserPackage,String niemGroupName){
		new GenericTableAction("niemCommentTable","Comment Table",null,niemGroupName,
				"CommentTable",browserPackage,NIEM_COMMENT_TABLE_DIAGRAM_ACTION_TOOLTIP,category){
					private static final long serialVersionUID = 1L;

			@Override
			protected void initializeTable(Project project,Diagram createdDiagram,
					ProgressStatus progressStatus) {
                //Create table element types
                //Can add multiple table element types
                List<Object> tableElementTypes = new ArrayList<Object>();
                tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"Comment"));

                //Set table element types for shown elements
                GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
                

                //Add elements to table
                refreshCommentTable(browserPackage,createdDiagram,progressStatus);
                    //Add columns to table
                List<String> fewColumns = new ArrayList<String>();
                for(String desiredId:desiredCommentIds){
                	fewColumns.add("QPROP:Element:"+desiredId);
                }

                    GenericTableManager.addColumnsById(createdDiagram, fewColumns);
                    
			}
			
		};
		/*
		DefaultBrowserAction testAction=new DefaultBrowserAction("niemCommentTable","Comment Table",null,niemGroupName){
	        @Override
	        public void actionPerformed(ActionEvent evt)
	        {
	            SessionManager sessionManager = SessionManager.getInstance();
	            sessionManager.createSession("Create NIEM Comment Table");

	            //Get first selected element
	            BaseElement baseElement = browserPackage;
	            if (baseElement instanceof NamedElement)
	            {
	            	NamedElement informationModel = (NamedElement) baseElement;
	                Project project = Project.getProject(informationModel);
	                //Create Generic table diagram
	                try
	                {
	                    Diagram createdDiagram = createGenericTable(project, informationModel,UsedByTableSuffix);
	                    //Create table element types
	                    //Can add multiple table element types
	                    List<Object> tableElementTypes = new ArrayList<Object>();
	                    tableElementTypes.add(StereotypesHelper.getUML2MetaClassByName(project,"Comment"));

	                    //Set table element types for shown elements
	                    GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
	                    

	                    //Add elements to table
	                    refreshCommentTable(informationModel,createdDiagram);
	                    //List<Element> elements = new ArrayList<Element>();
	                    //for(Object elementType:tableElementTypes)elements.add((Element)elementType);
	                        //Add columns to table
                        List<String> fewColumns = new ArrayList<String>();
                        for(String desiredId:desiredCommentIds){
                        	fewColumns.add("QPROP:Element:"+desiredId);
                        }

	                        GenericTableManager.addColumnsById(createdDiagram, fewColumns);
	                        
	                        project.getDiagram(createdDiagram).open(true);
	                }
	                catch (ReadOnlyElementException e)
	                {
	                    e.printStackTrace();
	                }
	            }
	            sessionManager.closeSession();
	        }

		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(NIEM_COMMENT_TABLE_DIAGRAM_ACTION_TOOLTIP);
		category.addAction(testAction);
		*/
	}
	static protected String desiredCommentIds[]={
		"owner",
		"body",
		
	};
	
	public static void newNIEMUsedByPackageDependenciesTableAction(MDMenuAction category,final PresentationElement requestor,final Package browserPackage,String niemGroupName){
		new GenericTableAction("niemUsedByPackageDependenciesTable","Types/Properties used by another <<InformationModel>> Table",null,niemGroupName,
				UsedByTableSuffix,browserPackage,NIEM_USAGES_OF_TABLE_DIAGRAM_ACTION_TOOLTIP,category){
					private static final long serialVersionUID = 1L;

			@Override
			protected void initializeTable(Project project,Diagram createdDiagram,
					ProgressStatus progressStatus) {
				Package informationModel=(Package)browserPackage;
                //Create table element types
                //Can add multiple table element types
                List<Object> tableElementTypes = new ArrayList<Object>();
                addClassifierTableTypes(project,tableElementTypes);
                addPropertyTableTypes(project,tableElementTypes);
                //Set table element types for shown elements
                GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
                

                //Add elements to table
                refreshUsedByPackageDependenciesTable(informationModel,createdDiagram,progressStatus);
                //List<Element> elements = new ArrayList<Element>();
                //for(Object elementType:tableElementTypes)elements.add((Element)elementType);
                    //Add columns to table
                List<String> fewColumns = new ArrayList<String>();
                for(String desiredId:desiredUsedByDependencyIds){
                	fewColumns.add("QPROP:Element:"+desiredId);
                }

                    GenericTableManager.addColumnsById(createdDiagram, fewColumns);
                    
			}
			
		};
		/*
		DefaultBrowserAction testAction=new DefaultBrowserAction("niemUsedByPackageDependenciesTable","Types/Properties used by another <<InformationModel>> Table",null,niemGroupName){
	        @Override
	        public void actionPerformed(ActionEvent evt)
	        {
	            SessionManager sessionManager = SessionManager.getInstance();
	            sessionManager.createSession("Create NIEM Used By Package Dependencies Table");

	            //Get first selected element
	            BaseElement baseElement = browserPackage;//getFirstElement();
	            if (baseElement instanceof Package)
	            {
	            	Package informationModel = (Package) baseElement;
	                Project project = Project.getProject(informationModel);
	                //Create Generic table diagram
	                try
	                {
//	                    Diagram createdDiagram = GenericTableManager.createGenericTable(project, informationModel.getName()+UsedByTableSuffix);
//	                    createdDiagram.setOwner(informationModel);
	                    Diagram createdDiagram = createGenericTable(project, informationModel,UsedByTableSuffix);
	                    //Create table element types
	                    //Can add multiple table element types
	                    List<Object> tableElementTypes = new ArrayList<Object>();
	                    addClassifierTableTypes(project,tableElementTypes);
	                    addPropertyTableTypes(project,tableElementTypes);
	                    //Set table element types for shown elements
	                    GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
	                    

	                    //Add elements to table
	                    refreshUsedByPackageDependenciesTable(informationModel,createdDiagram);
	                    //List<Element> elements = new ArrayList<Element>();
	                    //for(Object elementType:tableElementTypes)elements.add((Element)elementType);
	                        //Add columns to table
                        List<String> fewColumns = new ArrayList<String>();
                        for(String desiredId:desiredUsedByDependencyIds){
                        	fewColumns.add("QPROP:Element:"+desiredId);
                        }

	                        GenericTableManager.addColumnsById(createdDiagram, fewColumns);
	                        
	                        project.getDiagram(createdDiagram).open(true);
	                }
	                catch (ReadOnlyElementException e)
	                {
	                    e.printStackTrace();
	                }
	            }
	            sessionManager.closeSession();
	        }

		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(NIEM_USAGES_OF_TABLE_DIAGRAM_ACTION_TOOLTIP);
		category.addAction(testAction);
		*/
	}
	static protected String desiredUsedByDependencyIds[]={
		"name",
		"owner",
		"niemTypedElementOfType",
		"niemDerivedType",
//		"type",
		"topLevelPropertyUsage",
		"niemSubstitutionGroups",
		
	};
	
	public static void newNIEMPackageDependenciesTableAction(MDMenuAction category,final PresentationElement requestor,final Package browserPackage,String niemGroupName){
		new GenericTableAction("niemProjectDependenciesTable","Types/Properties using another <<InformationModel>> Table",null,niemGroupName,
				UsesTableSuffix,browserPackage,NIEM_USED_BY_TABLE_DIAGRAM_ACTION_TOOLTIP,category){
					private static final long serialVersionUID = 1L;

			@Override
			protected void initializeTable(Project project,Diagram createdDiagram,
					ProgressStatus progressStatus) {
				Package informationModel=(Package)browserPackage;
                //Create table element types
                //Can add multiple table element types
                List<Object> tableElementTypes = new ArrayList<Object>();
                addClassifierTableTypes(project,tableElementTypes);
                addPropertyTableTypes(project,tableElementTypes);
                //Set table element types for shown elements
                GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
                

                //Add elements to table
                refreshPackageDependenciesTable(informationModel,createdDiagram,progressStatus);
                    //Add columns to table
                List<String> fewColumns = new ArrayList<String>();
                for(String desiredId:desiredDependencyIds){
                	fewColumns.add("QPROP:Element:"+desiredId);
                }

                    GenericTableManager.addColumnsById(createdDiagram, fewColumns);
                    
			}
			
		};
		/*
		DefaultBrowserAction testAction=new DefaultBrowserAction("niemProjectDependenciesTable","Types/Properties using another <<InformationModel>> Table",null,niemGroupName){
	        @Override
	        public void actionPerformed(ActionEvent evt)
	        {
	            SessionManager sessionManager = SessionManager.getInstance();
	            sessionManager.createSession("Create NIEM Package Dependencies Table");

	            //Get first selected element
	            BaseElement baseElement = browserPackage;//getFirstElement();
	            if (baseElement instanceof Package)
	            {
	            	Package informationModel = (Package) baseElement;
	                Project project = Project.getProject(informationModel);
	                //Create Generic table diagram
	                try
	                {
	                    Diagram createdDiagram = createGenericTable(project, informationModel,UsesTableSuffix);
	                    //Create table element types
	                    //Can add multiple table element types
	                    List<Object> tableElementTypes = new ArrayList<Object>();
	                    addClassifierTableTypes(project,tableElementTypes);
	                    addPropertyTableTypes(project,tableElementTypes);
	                    //Set table element types for shown elements
	                    GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
	                    

	                    //Add elements to table
	                    refreshPackageDependenciesTable(informationModel,createdDiagram);
	                        //Add columns to table
                        List<String> fewColumns = new ArrayList<String>();
                        for(String desiredId:desiredDependencyIds){
                        	fewColumns.add("QPROP:Element:"+desiredId);
                        }

	                        GenericTableManager.addColumnsById(createdDiagram, fewColumns);
	                    //}
	                        
	                        project.getDiagram(createdDiagram).open(true);
	                }
	                catch (ReadOnlyElementException e)
	                {
	                    e.printStackTrace();
	                }
	            }
	            sessionManager.closeSession();
	        }

		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(NIEM_USED_BY_TABLE_DIAGRAM_ACTION_TOOLTIP);

		category.addAction(testAction);
		*/
	}
	static protected void addDependencyType(Diagram createdDiagram, Type type,Package informationModel) {
		if(Classifier.class.isInstance(type)){
			Classifier classifier=(Classifier)type;
			boolean isExternalPackageReference=false;
    		for(Classifier general:classifier.getGeneral()){
    			Package generalModel=NIEMHelper.getNearestInformationModel(general);
    			if(generalModel==null)continue;
    			if(!informationModel.equals(generalModel)){
    				isExternalPackageReference=true;
    				break;
    			}
    		}
    		if(!isExternalPackageReference){
    			for(Dependency dependency:classifier.getClientDependency()){
    				if(NIEMHelper.isRestriction(dependency)
    						||NIEMHelper.hasStereotype(dependency,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName))
    						){
    					for(NamedElement supplier:dependency.getSupplier()){
    						if(Classifier.class.isInstance(supplier)){
    							Classifier general=(Classifier)supplier;
    			    			Package generalModel=NIEMHelper.getNearestInformationModel(general);
    			    			if(generalModel==null)continue;
    			    			if(!informationModel.equals(generalModel)){
    			    				isExternalPackageReference=true;
    			    				break;
    			    			}
    						}
    					}
    				}
    			}
    		}
    		if(isExternalPackageReference){
				GenericTableManager.addRowElement(createdDiagram, classifier);
    		}
			for(Property property:classifier.getAttribute()){
				addDependencyProperty(createdDiagram,property,informationModel);
			}
			if(AssociationClass.class.isInstance(classifier)){
				for(Property property:((AssociationClass)classifier).getOwnedEnd()){
					addDependencyProperty(createdDiagram,property,informationModel);
				}
			}
		}
		
	}
	static protected void addDependencyProperty(Diagram createdDiagram, Property property,Package informationModel) {
		Type propertyType=property.getType();
		boolean isExternalPackageReference=false;
		if(propertyType!=null){
			Package generalModel=NIEMHelper.getNearestInformationModel(propertyType);
			if(generalModel!=null){
    			if(!informationModel.equals(generalModel)){
    				isExternalPackageReference=true;
    			}
			}
		}
		for(Property substitution:property.getSubsettedProperty()){
			Package generalModel=NIEMHelper.getNearestInformationModel(substitution);
			if(generalModel!=null){
    			if(!informationModel.equals(generalModel)){
    				isExternalPackageReference=true;
    				break;
    			}
			}
		}
		Package propertyInformationModel=NameHelper.getPropertyInformationModel(property);
		if(propertyInformationModel!=null){
			if(!informationModel.equals(propertyInformationModel)){
				isExternalPackageReference=true;
			}
		}
		if(isExternalPackageReference){
			GenericTableManager.addRowElement(createdDiagram, property);
		}
		
	}

	static protected String desiredDependencyIds[]={
		"name",
		"owner",
//		"humanType",
		"niemBaseType",
		"niemNamespaceOfBaseType",
		"niemRoleOf",
		"niemAugmentationAppliesTo",
		"topLevelProperty",
		"niemNamespaceOfTopLevelProperty",
		"type",
		"niemNamespaceOfType",
		"niemSubstitutionGroupAffiliation",
		
	};
	
	public static void newNIEMTypeTableAction(MDMenuAction category,final PresentationElement requestor,final NamedElement browserPackage,String niemGroupName){
		new GenericTableAction("niemTypeTable","NIEM Type Table",null,niemGroupName,
				"TypeTable",browserPackage,NIEM_TYPE_TABLE_DIAGRAM_ACTION_TOOLTIP,category){
					private static final long serialVersionUID = 1L;

			@Override
			protected void initializeTable(Project project,Diagram createdDiagram,
					ProgressStatus progressStatus) {
                List<Object> tableElementTypes = new ArrayList<Object>();
                addClassifierTableTypes(project,tableElementTypes);
                //Set table element types for shown elements
                GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);

                //Add element to table
                addClassifierRows(browserPackage,createdDiagram,progressStatus);
      
                //Get possible columns to show for element
                    //Add columns to table
                List<String> fewColumns = new ArrayList<String>();
                for(String desiredId:desiredIds){
                	fewColumns.add("QPROP:Element:"+desiredId);
                }

                    GenericTableManager.addColumnsById(createdDiagram, fewColumns);
                    
			}
			
		};
/*		
		DefaultBrowserAction testAction=new DefaultBrowserAction("niemTypeTable","NIEM Type Table",null,niemGroupName){
	        @Override
	        public void actionPerformed(ActionEvent evt)
	        {
	            {
	            SessionManager sessionManager = SessionManager.getInstance();
	            sessionManager.createSession("Create NIEM Type Table");
	                Project project = Project.getProject(browserPackage);
	                //Create Generic table diagram
	                try
	                {
	                	Diagram createdDiagram =createGenericTable(project,  browserPackage,"TypeTable");
	                    //Create table element types
	                    //Can add multiple table element types
	                    List<Object> tableElementTypes = new ArrayList<Object>();
	                    addClassifierTableTypes(project,tableElementTypes);
	                    //Set table element types for shown elements
	                    GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);

	                    //Add element to table
	                    addClassifierRows(browserPackage,createdDiagram);
              
	                    //Get possible columns to show for element
	                        //Add columns to table
                        List<String> fewColumns = new ArrayList<String>();
                        for(String desiredId:desiredIds){
                        	fewColumns.add("QPROP:Element:"+desiredId);
                        }

	                        GenericTableManager.addColumnsById(createdDiagram, fewColumns);
	                    //}
	                        
	                        project.getDiagram(createdDiagram).open(true);
	                }
	                catch (ReadOnlyElementException e)
	                {
	                    e.printStackTrace();
	                }
		            sessionManager.closeSession();
	            	}
	        }
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(NIEM_TYPE_TABLE_DIAGRAM_ACTION_TOOLTIP);
		category.addAction(testAction);
	*/	
	}
	static protected String desiredIds[]={
		"name",
		"owner",
		"niemName",
		"niemTypedElementOfType",
		"subsetsNiemReferenceType",
		"niemRoleOf",
		"niemAugmentationElements",
		"niemBaseType",
		"niemReferencedInformationModels",
		"niemAllReferencedInformationModels"
		
	};
	protected static void 	addPropertyRows(NamedElement baseElement,Diagram createdDiagram,ProgressStatus progressStatus){
		if(Property.class.isInstance(baseElement)){
			Property property=(Property)baseElement;
			
			if(property.isNavigable()){
				//System.out.println("addPropertyRow "+property.getQualifiedName());
				GenericTableManager.addRowElement(createdDiagram,(Element) baseElement);
			}
		}else{
			progressStatus.setDescription("Properties from "+baseElement.getQualifiedName());
			for(Element element:baseElement.getOwnedElement()){
				if(NamedElement.class.isInstance(element)){
					addPropertyRows((NamedElement)element,createdDiagram,progressStatus);
				}
			}
		}
	}
	protected static void 	addClassifierRows(NamedElement baseElement,Diagram createdDiagram,ProgressStatus progressStatus){
		boolean isAssociation=(Association.class.isInstance(baseElement)&&!AssociationClass.class.isInstance(baseElement));
		if(Classifier.class.isInstance(baseElement)&&!isAssociation){
			Classifier property=(Classifier)baseElement;
				GenericTableManager.addRowElement(createdDiagram,(Element) baseElement);
		}else{
			progressStatus.setDescription("Classifiers for "+baseElement.getQualifiedName());
			for(Element element:baseElement.getOwnedElement()){
				if(NamedElement.class.isInstance(element)){
					addClassifierRows((NamedElement)element,createdDiagram,progressStatus);
				}
			}
		}
	}
	public static void newNIEMPropertyTableAction(MDMenuAction category,final PresentationElement requestorNotUsed,final NamedElement browserPackage,String niemGroupName){
		new GenericTableAction("niemPropertyTable","Property Table",null,niemGroupName,
				"PropertyTable",browserPackage,NIEM_PROPERTY_TABLE_DIAGRAM_ACTION_TOOLTIP,category){
					private static final long serialVersionUID = 1L;

			@Override
			protected void initializeTable(Project project,Diagram createdDiagram,
					ProgressStatus progressStatus) {
                //Create table element types
                //Can add multiple table element types
                List<Object> tableElementTypes = new ArrayList<Object>();
                addPropertyTableTypes(project,tableElementTypes);
                
                //Set table element types for shown elements
                GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);

                //Add element to table
                addPropertyRows(browserPackage,createdDiagram,progressStatus);
                //Get possible columns to show for element
                    //Add columns to table
                List<String> fewColumns = new ArrayList<String>();
                for(String desiredId:desiredPropertyIds){
                	fewColumns.add("QPROP:Element:"+desiredId);
                }
                    GenericTableManager.addColumnsById(createdDiagram, fewColumns);
                    
			}
			
		};
	}
	
	static protected String desiredPropertyIds[]={
		"name",
		"owner",
		"multiplicity",
		"aggregation",
		"isDerivedUnion",
		"niemName",
		"subsetsNiemReferenceProperty",
		"topLevelPropertyUsage",
		"topLevelProperty",
		"type",
		"niemSubsettingTypeConstraint",
		"isNiemTypeOverrideConstraint",
		"isNiemSubsetTypeOverrideable",
		"niemSubstitutionGroups",
		"niemSubstitutionGroupAffiliation",
		"classifier",
		"niemReferencedInformationModels",
		"niemAllReferencedInformationModels"
		
	};
}
