package org.modeldriven.magicdraw.niem.qvt;

import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Vector;

import javax.swing.KeyStroke;
import org.modeldriven.magicdraw.niem.diagram.context.NIEMClassDiagramContextConfigurator;
import org.modeldriven.magicdraw.niem.diagram.relation.NIEMRelationMapDiagramConfigurator;
import org.modeldriven.magicdraw.niem.diagram.symbol.NIEMDiagramDescriptor;
import org.modeldriven.magicdraw.niem.diagram.symbol.NIEMSymbolDecoratorProvider;
import org.modeldriven.magicdraw.niem.diagram.symbol.NIEM_EntityDiagramsAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.ClassAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DataTypeAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.EnumerationAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.ComplexEnumerationAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.InformationModelAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.ModelAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMComponentAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMDataTypeAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMPrimitiveTypeAction;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMTypeAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.PackageAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.PrimitiveTypeAction;
import org.modeldriven.magicdraw.niem.listener.DiagramPropertyPropertyChangeListener;
import org.modeldriven.magicdraw.niem.listener.NIEMTransactionListener;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.lucene.DiagramSelectionListenerRouter;
import org.modeldriven.magicdraw.niem.lucene.IndexReferenceModels;
import org.modeldriven.magicdraw.niem.lucene.SearchReferenceModels;
import org.modeldriven.magicdraw.niem.table.TableHelper;
import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.actions.ActionsID;
import com.nomagic.magicdraw.actions.BrowserContextAMConfigurator;
import com.nomagic.magicdraw.actions.DiagramContextToolbarAMConfigurator;
import com.nomagic.magicdraw.actions.DiagramInnerToolbarConfiguration;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.GUILog;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.core.options.ProjectOptionsConfigurator;
import com.nomagic.magicdraw.core.project.ProjectEventListenerAdapter;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.evaluation.EvaluationConfigurator;
import com.nomagic.magicdraw.plugins.LicensedPlugin;
import com.nomagic.magicdraw.properties.BooleanProperty;
import com.nomagic.magicdraw.properties.FileProperty;
import com.nomagic.magicdraw.properties.NumberProperty;
import com.nomagic.magicdraw.properties.PropertyResourceProvider;
import com.nomagic.magicdraw.ui.actions.BaseDiagramToolbarConfigurator;
import com.nomagic.magicdraw.ui.actions.DiagramActionsExecuter;
import com.nomagic.magicdraw.ui.actions.DiagramActionsExecuter.ElementCreatorInfo;
import com.nomagic.magicdraw.ui.actions.DiagramContextToolbarAction;
import com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction;
import com.nomagic.magicdraw.ui.actions.PresentationElementConfigurator;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.InstanceBrowserInitializer;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.ui.browser.Tree;
import com.nomagic.magicdraw.ui.diagrams.BaseCustomizableDiagramAction;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramListenerAdapter;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.SymbolRendererManager;
import com.nomagic.magicdraw.uml.symbols.shapes.ClassView;
import com.nomagic.magicdraw.uml.symbols.shapes.NoteView;
import com.nomagic.magicdraw.visualization.relationshipmap.actions.RMActionsConfigurator;
import com.nomagic.magicdraw.visualization.relationshipmap.actions.RelationMapActionRegistry;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.transaction.TransactionManager;

public class NIEMQVTPlugin extends com.nomagic.magicdraw.plugins.Plugin
		implements NIEM_ProfileConstants, LicensedPlugin {
	static public String getPluginID() {
		return "org.modeldriven.magicdraw.niem.qvt";
	}
	static  private boolean mReader;

	protected MDAction pim2psmAction = new Pim2PsmAction("pim2psm","NIEM MPD");
//	protected MDAction pim2schematronAction = new Pim2SchematronAction("pim2schematron","Schematron");
	
	static protected MasterDocumentAction masterDocumentationAction = new MasterDocumentAction("masterDocument","NIEM MPD Master Document");
	static public MasterDocumentAction getMasterDocumentAction(){return masterDocumentationAction;}
	static public 		InstanceBrowserInitializer instanceBrowserInitializer=new InstanceBrowserInitializer();

	protected MDAction mpd2psmAction = new Mpd2PsmAction("mpd2psmAction","NIEM MPD");
	protected MDAction iepd2psmAction = new Iepd2PimAction("iepd2psmAction",
	"NIEM IEPD");
	protected MDAction libBuildAction = new LibBuildAction("libBuildAction",
			"NIEM Library Build Step");
	protected MDAction testAction = new TestAction("testAction",
			"Tom Test");
	protected MDAction rfp2docAction = new Rfp2DocAction("rdfp2docAction","OMG RFP to DOC");
	protected MDAction referenceToLuceneAction = new IndexReferenceModels("referenceToLuceneAction","NIEM Reference Models to Lucene");
	
	protected MDAction mpdCompareAction = new MpdCompareAction(
			"mpdcompareAction", "NIEM MPD Compare");
	protected MDAction mpdEntityDiagramsAction = new NIEM_EntityDiagramsAction(
			"mpdEntityDiagramsAction", "NIEM Entity Diagrams");
	static public NIEMAboutAction niemAboutAction = new NIEMAboutAction(
			"niemAboutAction", "About NIEM");
/*
	protected MDAction entityDiagramAction = new NIEMEntityDiagramAction(
			"niemEntityDiagramAction", "NIEM Entity Diagram");
	protected MDAction baseTypeDiagramAction = new NIEMBaseTypeDiagramAction(
			"niemBaseTypeDiagramAction", "NIEM Base Type Diagram");
			*/
	protected NIEMClassDiagramContextConfigurator diagramContextConfigurator = new NIEMClassDiagramContextConfigurator();

//	public static MDAction searchReferenceModelsAction = new SearchReferenceModels("searchReferenceModelsAction", "Search NIEM Reference Models for similar");
	
	  // license plugin methods

	  @Override
	  public void setReaderMode(boolean reader)
	  {
	    // remember mode
	    mReader = reader;
	  }

	  @Override
	  public boolean isReaderMode()
	  {
	    // return mode
	    return mReader;
	  }

	  @Override
	  public String getEULA()
	  {
	    // may return null
		  return "NIEM UML\n"
+"Copyright (c) 2011, Data Access Technologies, Inc and Tom Digre, all rights reserved worldwide.\n"
/*
+"This program is free software: you can redistribute it and/or modify\n"
+"it under the terms of the GNU General Public License as published by\n"
+"the Free Software Foundation, either version 3 of the License, or\n"
+"(at your option) any later version.\n"

+"This program is distributed in the hope that it will be useful,\n"
+"but WITHOUT ANY WARRANTY; without even the implied warranty of\n"
+"MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n"
+"GNU General Public License for more details.\n"

+"You should have received a copy of the GNU General Public License\n"
+"along with this program.  If not, see http://www.gnu.org/licenses/gpl-3.0-standalone.html.\n"

+"There are also commercial licenses available for this software.\n"
+"Contact ModelDriven.org for more information.\n"
*/
+"";
	  }

	  @Override
	  public String getActivationInstructions()
	  {
	    // may return null
//	    return "Activation instructions";
	    return null;
	  }

	  @Override
	  public String getBuildInfo()
	  {
	    // may return null
//	    return "build info";
		  
//	    return "2012.10.19";// does nothing?
	    return null;
	  }
	  // license plugin methods end

	 protected MDAction niemValidateAction = new NIEMValidateAction("niemvalidateAction","NIEM Validation");// suppress
	// for now, use active Validation
	// protected MDActionsCategory niemNewProjectAction = null;//new
	// NIEMNewProjectAction("niemNewProjectAction","new NIEM Project");

	public void init() {
		if(isReaderMode())return;
		// prepare validation implementation
		EvaluationConfigurator.getInstance().registerBinaryImplementers(
				NIEMQVTPlugin.class.getClassLoader());
		// /////////////////////////////////////////////////////////////////////////
		configureBrowserTabs();
		configureToolbar();
		configureBrowser();
		configureMainMenu();
		configureDiagram();
		// configureNewProject();
		// PresentationElementRendererManager.getInstance().addProvider(new
		// NIEMRendererProvider());

		configureDiagramToolbar();
		configureDiagramToolbarActionsProvider() ;
		SymbolRendererManager.getManager().addProvider(new NIEMSymbolDecoratorProvider());
		configureDiagramContextMenus();
		configureDiagramContextToolbar();
		configureDiagramListener();
		configurePropertyListener();
		configureTransactionCommitListener();
		configureProjectCache();
		configureProjectOptions();
		configureEnvironmentOptions();
		TableHelper.configureGenericTableToolbar();
	}
	////////////////////////start projectOptions
	//protected String PRESERVE_PSM_OPTION_DESCRIPTION=PRESERVE_PSM_OPTION+"_DESCRIPTION";
	protected String MERGE_PSM_OPTION_DESCRIPTION=MERGE_PSM_OPTION+"_DESCRIPTION";
	protected String DOCUMENT_ELEMENT_INSTANCES_OPTION_DESCRIPTION=DOCUMENT_ELEMENT_INSTANCES_OPTION+"_DESCRIPTION";
	
	protected String PROVISION_MASTERDOCUMENT_OPTION_DESCRIPTION=PROVISION_MASTERDOCUMENT_OPTION+"_DESCRIPTION";
	protected String PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION_DESCRIPTION=PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION+"_DESCRIPTION";
	protected String RELAYOUT_SUBSET_DIAGRAMS_OPTION_DESCRIPTION=RELAYOUT_SUBSET_DIAGRAMS_OPTION+"_DESCRIPTION";
	protected String MPD_WORKING_DIRECTORY_OPTION_DESCRIPTION=MPD_WORKING_DIRECTORY_OPTION+"_DESCRIPTION";
	protected String PROVISION_SCHEMATRON_OPTION_DESCRIPTION=PROVISION_SCHEMATRON_OPTION+"_DESCRIPTION";
	

	protected String NIEM_GROUP="NIEM_GROUP";
	protected String NIEM_GROUP_DESCRIPTION=NIEM_GROUP+"_DESCRIPTION";
	public String getCommonNiemPropertyOptionString(String string)
	{
		if (NIEM_GROUP.equals(string))
		{
		// translate group
		return "NIEM-UML";
		}
		if (NIEM_GROUP_DESCRIPTION.equals(string))
		{
		// translate description
		return "Project-specific options for NIEM-UML.";
		}
		return string;
	}

	protected void configureProjectOptions(){
		ProjectOptions.addConfigurator(new ProjectOptionsConfigurator(){
			public void configure(ProjectOptions projectOptions)
			{
				//configure_preserve(projectOptions);
				configure_merge(projectOptions);
				configure_masterDocument(projectOptions);
				configure_masterDocumentDiagrams(projectOptions);
				configure_workingDirectory(projectOptions);
				configure_documentElementInstances(projectOptions);
				configure_schematron(projectOptions);
				configure_relayoutSubsetDiagrams(projectOptions);
			}
		      protected void configure_workingDirectory(ProjectOptions projectOptions)
				{
					com.nomagic.magicdraw.properties.Property property =
						projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
								MPD_WORKING_DIRECTORY_OPTION);
					if (property == null)
					{
						// create property, if does not exist
//	          property = new BooleanProperty(PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION,true);
						property = new FileProperty(MPD_WORKING_DIRECTORY_OPTION,
			                    "<project.dir>/mpd.fromPIM~",
			                    FileProperty.DIRECTORIES_ONLY);
	         // property = new FileProperty();
						// group
						property.setGroup(NIEM_GROUP);
						((FileProperty)property).setFileType(FileProperty.FILE_TYPE_ANY);
						//((FileProperty)property).setSelectionMode(FileProperty.DIRECTORIES_ONLY);
						
						//property.setID(MPD_WORKING_DIRECTORY_OPTION);
						// custom resource provider
						property.setResourceProvider(new PropertyResourceProvider(){
							public String getString(String string, com.nomagic.magicdraw.properties.Property property)
							{
	              if (MPD_WORKING_DIRECTORY_OPTION.equals(string))
								{
								// translate ID
	              return "MPD Export Working Directory";
								}
	              if (MPD_WORKING_DIRECTORY_OPTION_DESCRIPTION.equals(string))
								{
								// translate description
	              return "Working directory for MPD Export action.  "
	            		  +"The MPD root directory(s) and any working directories will be contained by this working directory.  "
	            		  +"This may be an absolute file location, location relative to MD install directory, or use path variables such as <project.dir>.";
								}
	              return getCommonNiemPropertyOptionString(string);
							}

						});
					// add property
					projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
					}
				}
		      protected void configure_relayoutSubsetDiagrams(ProjectOptions projectOptions)
				{
		    	  
					com.nomagic.magicdraw.properties.Property property =
						projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
								RELAYOUT_SUBSET_DIAGRAMS_OPTION);
					if (property == null)
					{
						// create property, if does not exist
						property = new BooleanProperty(RELAYOUT_SUBSET_DIAGRAMS_OPTION,false);
						// group
						property.setGroup(NIEM_GROUP);
						// custom resource provider
						property.setResourceProvider(new PropertyResourceProvider(){
							public String getString(String string, com.nomagic.magicdraw.properties.Property property)
							{
								if (RELAYOUT_SUBSET_DIAGRAMS_OPTION.equals(string))
								{
								// translate ID
									return "Layout New Shapes on Subset Diagrams";
								}
								if (RELAYOUT_SUBSET_DIAGRAMS_OPTION_DESCRIPTION.equals(string))
								{
								// translate description
	            	  			return "When performing subset actions from a diagram, shapes and paths may be added to the diagram.  "
	            	  					+"If this option is true, newly added shapes will be layed out.  "
	            	  					+"This may cause other shapes to change their positions as well.  "
	            	  					+"Disabling this option will result in not laying out new shapes, which may cause new shapes to overlap other shapes.";
								}
	              				return getCommonNiemPropertyOptionString(string);
							}

						});
					// add property
					projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
					}
				}
		      
		      protected void configure_masterDocumentDiagrams(ProjectOptions projectOptions)
				{
					com.nomagic.magicdraw.properties.Property property =
						projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
								PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION);
					if (property == null)
					{
						// create property, if does not exist
//	          property = new BooleanProperty(PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION,true);
	          property = new BooleanProperty(PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION,false);
						// group
						property.setGroup(NIEM_GROUP);
						// custom resource provider
						property.setResourceProvider(new PropertyResourceProvider(){
							public String getString(String string, com.nomagic.magicdraw.properties.Property property)
							{
	              if (PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION.equals(string))
								{
								// translate ID
	              return "Provision Master Document Diagrams";
								}
	              if (PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION_DESCRIPTION.equals(string))
								{
								// translate description
	              return "Provision Master Document Diagrams during PIM to MPD Transformation";
								}
	              return getCommonNiemPropertyOptionString(string);
							}

						});
					// add property
					projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
					}
				}
		      
		      
		      protected void configure_schematron(ProjectOptions projectOptions)
				{
					com.nomagic.magicdraw.properties.Property property =
						projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,PROVISION_SCHEMATRON_OPTION);
					if (property == null)
					{
						// create property, if does not exist
	          property = new BooleanProperty(PROVISION_SCHEMATRON_OPTION,false);
						// group
						property.setGroup(NIEM_GROUP);
						// custom resource provider
						property.setResourceProvider(new PropertyResourceProvider(){
							public String getString(String string, com.nomagic.magicdraw.properties.Property property)
							{
	              if (PROVISION_SCHEMATRON_OPTION.equals(string))
								{
								// translate ID
	              return "Provision Schematron Artifacts";
								}
	              if (PROVISION_SCHEMATRON_OPTION_DESCRIPTION.equals(string))
								{
								// translate description
	              return "Provision Schematron and related artifacts during PIM to MPD Transformation";
								}
	              return getCommonNiemPropertyOptionString(string);
							}

						});
					// add property
					projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
					}
				}
      protected void configure_masterDocument(ProjectOptions projectOptions)
			{
				com.nomagic.magicdraw.properties.Property property =
					projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
              PROVISION_MASTERDOCUMENT_OPTION);
				if (property == null)
				{
					// create property, if does not exist
//          property = new BooleanProperty(PROVISION_MASTERDOCUMENT_OPTION,true);
          property = new BooleanProperty(PROVISION_MASTERDOCUMENT_OPTION,false);
					// group
					property.setGroup(NIEM_GROUP);
					// custom resource provider
					property.setResourceProvider(new PropertyResourceProvider(){
						public String getString(String string, com.nomagic.magicdraw.properties.Property property)
						{
              if (PROVISION_MASTERDOCUMENT_OPTION.equals(string))
							{
							// translate ID
              return "Provision Master Document";
							}
              if (PROVISION_MASTERDOCUMENT_OPTION_DESCRIPTION.equals(string))
							{
							// translate description
              return "Provision Master Document during PIM to MPD Transformation";
							}
              return getCommonNiemPropertyOptionString(string);
						}

					});
				// add property
				projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
				}
			}
      /*
			protected void configure_preserve(ProjectOptions projectOptions)
			{
				com.nomagic.magicdraw.properties.Property property =
					projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
							PRESERVE_PSM_OPTION);
				if (property == null)
				{
					// create property, if does not exist
					property = new BooleanProperty(PRESERVE_PSM_OPTION,false);
					// group
					property.setGroup(NIEM_GROUP);
					// custom resource provider
					property.setResourceProvider(new PropertyResourceProvider(){
						public String getString(String string, com.nomagic.magicdraw.properties.Property property)
						{
							if (PRESERVE_PSM_OPTION.equals(string))
							{
							// translate ID
							return "Preserve PSM";
							}
							if (PRESERVE_PSM_OPTION_DESCRIPTION.equals(string))
							{
							// translate description
							return "Preserve PSM during PIM to MPD (non-merge) Transformation.  "
									+"If true, a model containing the merged PIM and PSM will be saved as a separate MD Project.  "
									+"If false, the interim model containing the merged PIM and PSM will be discarded.  "
									+"This option is ignored if Merge PSM is enabled."
									;
							}
							if (NIEM_GROUP.equals(string))
							{
							// translate group
							return "NIEM-UML";
							}
							if (NIEM_GROUP_DESCRIPTION.equals(string))
							{
							// translate description
							return "Project-specific options for NIEM-UML.";
							}
							return string;
						}

					});
				// add property
				projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
				}
			}
			*/
      
		protected void configure_documentElementInstances(ProjectOptions projectOptions)
		{
			com.nomagic.magicdraw.properties.Property property =
				projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
						DOCUMENT_ELEMENT_INSTANCES_OPTION);
			if (property == null)
			{
				// create property, if does not exist
				property = new NumberProperty(DOCUMENT_ELEMENT_INSTANCES_OPTION,2,1.0,20.0);
				// group
				property.setGroup(NIEM_GROUP);
				// custom resource provider
				property.setResourceProvider(new PropertyResourceProvider(){
					public String getString(String string, com.nomagic.magicdraw.properties.Property property)
					{
						if (DOCUMENT_ELEMENT_INSTANCES_OPTION.equals(string))
						{
						// translate ID
						return "Document Element Instance Count";
						}
						if (DOCUMENT_ELEMENT_INSTANCES_OPTION_DESCRIPTION.equals(string))
						{
						// translate description
						return "Document Element Instance Count.  "
								+"Within cardinality constraints, the number of element instances created."
								;
						}
			              return getCommonNiemPropertyOptionString(string);
					}

				});
			// add property
			projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
			}
		}
      
			protected void configure_merge(ProjectOptions projectOptions)
			{
				com.nomagic.magicdraw.properties.Property property =
					projectOptions.getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
							MERGE_PSM_OPTION);
				if (property == null)
				{
					// create property, if does not exist
//					property = new BooleanProperty(MERGE_PSM_OPTION,false);
					property = new BooleanProperty(MERGE_PSM_OPTION,true);
					// group
					property.setGroup(NIEM_GROUP);
					// custom resource provider
					property.setResourceProvider(new PropertyResourceProvider(){
						public String getString(String string, com.nomagic.magicdraw.properties.Property property)
						{
							if (MERGE_PSM_OPTION.equals(string))
							{
							// translate ID
							return "Merge PSM";
							}
							if (MERGE_PSM_OPTION_DESCRIPTION.equals(string))
							{
							// translate description
							return "Merge PSM with PIM during PIM to MPD Transformation.  "
									+"If true, the intermediate PSM representation is preserved as a top-level 'PSM' Model.  "
									+"Prior to transformation, any previous 'PSM' Package will be removed."
									//+"This selection has the best PIM to MPD Transformation performance.  "
									+"If false, the intermediate 'PSM' Model is removed following transformation.  "
									;
							}
				              return getCommonNiemPropertyOptionString(string);
						}

					});
				// add property
				projectOptions.addProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES, property);
				}
			}

			@Override
			public void afterLoad(ProjectOptions arg0) {
				// TODO Auto-generated method stub

			}
		});
	}



	/////////////////end project Options
	protected void configureEnvironmentOptions(){
		/* let user control keyboard options*/
	}
	//////////////////////configure Diagram
	protected void configureDiagram() {
		try{
			
	    Application.getInstance().addNewDiagramType(new NIEMDiagramDescriptor());
		}catch(Throwable t){
			t.printStackTrace();
		}
	}
	protected void configurePropertyListener() {
/* insufficient information at event time?????????????
		final PropertyChangeListener listener=new PropertyPropertyChangeListener();
		//QvtCommonAction.log("listenForModelChanges "+tree);
		final Collection<SmartListenerConfig> configs= new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.NAME_CONFIG);
        configs.add(new SmartListenerConfig(PropertyNames.TYPE));
        configs.add(new SmartListenerConfig(PropertyNames.OWNER));
        
        configs.add(new SmartListenerConfig(PropertyNames.ASSOCIATION));
        configs.add(new SmartListenerConfig(PropertyNames.AGGREGATION));
        configs.add(new SmartListenerConfig(PropertyNames.VISIBILITY));
        configs.add(new SmartListenerConfig(PropertyNames.CLASSIFIER));
        configs.add(new SmartListenerConfig(PropertyNames.OWNING_ASSOCIATION));
     	 
		// When the adapter is no longer needed, uninstall it.
		// listen for project events, then add the diagram listener
		ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		projectsManager.addProjectListener(new ProjectEventListenerAdapter(){
			public void 	projectClosed(Project project){
				project.getSmartEventSupport().unregisterConfig(Property.class, configs, listener);
			}
			public void 	projectOpened(Project project){
				project.getSmartEventSupport().registerConfig(Property.class, configs, listener);
			}
		});
     	 */

	}
	protected void configureDiagramListener() {
		final DiagramListenerAdapter adapter = new DiagramListenerAdapter(new DiagramPropertyPropertyChangeListener());
				// When the adapter is no longer needed, uninstall it.
		// listen for project events, then add the diagram listener
		ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		projectsManager.addProjectListener(new ProjectEventListenerAdapter(){
			public void 	projectClosed(Project project){
				adapter.uninstall(project);
			}
			public void 	projectOpened(Project project){
				adapter.install(project);
			}
		});
	}
	protected void configureTransactionCommitListener(){
		final NIEMTransactionListener transactionListener = new NIEMTransactionListener();
		// When the adapter is no longer needed, uninstall it.
		// listen for project events, then add the diagram listener
		ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		projectsManager.addProjectListener(new ProjectEventListenerAdapter(){
			public void 	projectClosed(Project project){
				TransactionManager transactionManager = project.getRepository().getTransactionManager();
				transactionManager.removeTransactionCommitListener(transactionListener);		
			}
			public void 	projectOpened(Project project){
				TransactionManager transactionManager = project.getRepository().getTransactionManager();
				transactionManager.addTransactionCommitListener(transactionListener);		
			}
		});
	}
	protected void configureProjectCache(){
		// When the adapter is no longer needed, uninstall it.
		ProjectsManager projectsManager=Application.getInstance().getProjectsManager();
		projectsManager.addProjectListener(new ProjectEventListenerAdapter(){
			public void 	projectClosed(Project project){
				ProjectCache.removeProject(project);
			}
			public void 	projectOpened(Project project){
				ProjectCache.getProjectCache(project);
			}
		});
	}
	static public void log(String text) {
		if (Application.getInstance() == null)
			return;
		GUILog log = Application.getInstance().getGUILog();
		if (log != null)
			log.log(text);
	}

	protected void configureDiagramContextToolbar() {

		DiagramContextToolbarAMConfigurator diagramContextConfigurator = new DiagramContextToolbarAMConfigurator() {
			@Override
			public void configure(ActionsManager mngr, PresentationElement pe) {
				if (pe == null)
					return;
				Element element = pe.getElement();
				//System.out.println("configureDiagramContextToolbar "+element+", "+pe);
				MDMenuAction category = new MDMenuAction("NIEM", "NIEM", null,null);
				boolean isNIEMDiagram=false;
				DiagramPresentationElement dpe=pe.getDiagramPresentationElement();
				if(dpe!=null)isNIEMDiagram=NIEMDiagramDescriptor.NIEM_DIAGRAM.equals(dpe.getDiagramType().getType());
				if (element == null){
					// if diagram is NIEM
					if(isNIEMDiagram&&
					 (pe instanceof NoteView)){
						NoteView noteView=(NoteView)pe;
						DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
								ActionsID.ADD_NOTE_ANCHOR, "Note Anchor",
								NIEMHelper.getUmlIcon("noteanchor"));
						category.addAction(contextAction);
						mngr.addCategory(category);

//						noteView.configureContextActions(contextAction);
//						noteView.configureContextActions(mngr);
					}
					return;
				}
					
				DiagramSelectionListenerRouter.INSTANCE.setSelection(pe, element);
				// ///////////

				category.setSmallIcon(QvtCommonAction.getNiemIcon());
				String metaClassName = element.eClass().getName();
				
				if(isNIEMDiagram&&(pe instanceof ClassView)){
					/* does not work
					ClassView classView=(ClassView)pe;
					ActionsCategory actionsCategory=new MDActionsCategory(ActionsID.INSERT_NEW_ATTRIBUTE, "Insert New Attribute");
					MacroCommand macroCommand=classView.getCommandForAppending();
					if(macroCommand!=null){
						System.out.println("Insert New Attribute macroCommand "+macroCommand+", "+((macroCommand==null)?"null":macroCommand.getClass().getName())+", "+classView);
						for(Object commandTest:macroCommand.getCommands()){
							System.out.println("Insert New Attribute command "+commandTest+", "+commandTest.getClass().getName()+", "+classView);
						}
					}
					*/
					/*
					com.nomagic.magicdraw.uml.symbols.shapes.CompartmentHelper compartmentHelper=classView.getCompartmentHelper(Property.class);
					System.out.println("Insert New Attribute compartmentHelper "+compartmentHelper+", "+classView);
					if(compartmentHelper!=null){
							compartmentHelper.configureContextActions(actionsCategory);
							for(NMAction nmAction:actionsCategory.getActions()){
								System.out.println("Insert New Attribute "+nmAction+", "+nmAction.getClass().getName()+", "+classView);
								if(nmAction instanceof ActionsCategory){
									for(NMAction nmAction2:((ActionsCategory)nmAction).getActions()){
										System.out.println("Insert New Attribute "+nmAction2+", "+nmAction2.getClass().getName());
									}
									
								}
							}
					}
					*/
					/*
					classView.getAttributesCompartmentHelper().
					//classView.getStructureCompartmentHelper().
					classView.getAttributesCompartmentHelper().configureContextActions(actionsCategory);
					*/
					/*
					classView.getAttributesCompartmentHelper().configureContextActions(actionsCategory);
					for(NMAction nmAction:actionsCategory.getActions()){
						System.out.println("Insert New Attribute "+nmAction+", "+nmAction.getClass().getName()+", "+classView);
						if(nmAction instanceof ActionsCategory){
							for(NMAction nmAction2:((ActionsCategory)nmAction).getActions()){
								System.out.println("Insert New Attribute "+nmAction2+", "+nmAction2.getClass().getName());
							}
							
						}
					}
					*/
				}
				if (NIEMHelper.isModelPackageDescription(element)) {
					DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
							ActionsID.ADD_ELEMENT_IMPORT, "Element Import",
							NIEMHelper.getUmlIcon("elementimport"));
					category.addAction(contextAction);
					/*
					DiagramContextToolbarAction contextAction1 = new DiagramContextToolbarAction(
							mpdFileAction.getID(), mpdFileAction.getName(),
							mpdFileAction.getLargeIcon());
					category.addAction(contextAction1);
					*/
					addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE,ModelPackageDescriptionFileStereotypeName,ModelPackageDescriptionFileStereotypeName);
					/*
					DiagramContextToolbarAction contextAction2 = new DiagramContextToolbarAction(
							mpdRelationshipAction.getID(),
							mpdRelationshipAction.getName(),
							mpdRelationshipAction.getLargeIcon());
					category.addAction(contextAction2);
					*/
					addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_DEPENDENCY,ModelPackageDescriptionRelationshipStereotypeName,ModelPackageDescriptionRelationshipStereotypeName);

				}
				// for a union realization
				com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package nearestPackage = null;
				if (Package.class.isInstance(element))
					nearestPackage = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) element;
				else
					nearestPackage = NIEMHelper.getNearestInformationModel(element);
				if (nearestPackage != null){
//					if(NIEMHelper.canBeUnionClient(element)){
				if(NIEMHelper.isUnion(element)){
					/*
					DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
							UnionOfAction.getID(),
							UnionOfAction.getName(),
							UnionOfAction.getLargeIcon());
					UnionOfStereotypeName
					
					category.addAction(contextAction);
					*/
					addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE,UnionOfStereotypeName,UnionOfStereotypeName);
				}
				// remaining must be in context of an InformationModel
				boolean isSubsetModel=false;
				if (NIEMHelper
								.hasStereotype(
										nearestPackage,
										NIEMHelper
												.getPimStereotype(InformationModelStereotypeName))) {
					Package informationModel=NIEMHelper.getNearestInformationModel(element);
					 isSubsetModel=Classifier.class.isInstance(element)
							&& (
									NIEMHelper
								.isInformationModelDefaultPurposeSubset(informationModel)
								||NIEMHelper.isInformationModelDefaultPurposeSubsetting(informationModel)				
								
								);
					
					if (element.isEditable()&&(Property.class.isInstance(element)
							|| com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class
									.isInstance(element))) {
						DiagramContextToolbarAction contextActionRealization = new DiagramContextToolbarAction(
								ActionsID.ADD_REALIZATION, "Realization",
								NIEMHelper.getUmlIcon("realize"));
						category.addAction(contextActionRealization);
					}
					 
					if (element.isEditable()
							&& Classifier.class.isInstance(element)
							&&!isSubsetModel
							) {
							// include some opposites
							DiagramContextToolbarAction contextActionUsageOpposite = new DiagramContextToolbarAction(
									ActionsID.ADD_USAGE_OPPOSITE, "Usage",
									NIEMHelper.getUmlIcon("usage_opposite"));
							category.addAction(contextActionUsageOpposite);
							if (NIEMHelper.isComplexType((Classifier) element)
									|| (Enumeration.class.isInstance(element) && !NIEMHelper
											.isEnumerationComplexType((Enumeration) element))) {
								/*
								DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
										RestrictionAction.getID(),
										RestrictionAction.getName(),
										RestrictionAction.getLargeIcon());
								category.addAction(contextAction);
								*/
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_REALIZATION,RestrictionStereotypeName,RestrictionStereotypeName);
								// }
							}
							
							
							if ((element instanceof DataType)
									&& (NIEMHelper.getBaseClassifier((DataType)element)!=null)
									&&!NIEMHelper.isUnion(element)
									&&!NIEMHelper.isList(element)
									&&!NIEMHelper.isInformationModelDefaultPurposeReference(informationModel)
									) {
								/*
								DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
										simpleContentRestrictionAction.getID(),
										simpleContentRestrictionAction.getName(),
										simpleContentRestrictionAction.getLargeIcon());
								category.addAction(contextAction);
								*/
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_REALIZATION,"ProxyRestriction","ProxyRestriction");
								// }
							}
							if ("Class".equals(metaClassName)) {
								// Augments if not stereotyped explicitly as something
								if(NIEMHelper.canBeAugmentation(element)){
									/*
								DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
								AugmentsAction.getID(),
								AugmentsAction.getName(),
								AugmentsAction.getLargeIcon());
								category.addAction(contextAction);
								*/
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_GENERALIZATION,AugmentsStereotypeName,AugmentsStereotypeName);
								}
								if(NIEMHelper.canBeAssociationClass(element)){
									DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
											ActionsID.ADD_ASSOCIATION_CLASS, "Association Class",
											NIEMHelper.getUmlIcon("associationclass"));
									category.addAction(contextAction);
	
								}
								if(NIEMHelper.canBeRoleOf(element)){
									/*
									DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
											RoleOfAction.getID(),
											RoleOfAction.getName(),
											RoleOfAction.getLargeIcon());
									category.addAction(contextAction);
									*/
									addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_DIRECTED_ASSOCIATION,RoleOfStereotypeName,RoleOfStereotypeName);
									
									}
								if(NIEMHelper.canBeDirectedAssociation(element)){
									/*
									DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
											ReferenceAction.getID(),
											ReferenceAction.getName(),
											ReferenceAction.getLargeIcon());
									category.addAction(contextAction);
									*/
									addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_DIRECTED_ASSOCIATION,REFERENCE,REFERENCE);
									
									}
								if(NIEMHelper.canBeDirectedAggregation(element)){
									/*
									DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
											ContentAction.getID(),
											ContentAction.getName(),
											ContentAction.getLargeIcon());
									category.addAction(contextAction);
									*/
									addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_DIRECTED_AGGREGATION,CONTENT,CONTENT);
									}
								if(NIEMHelper.canBeAssociation(element)){
									/*
									DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
											AssociationAction.getID(),
											AssociationAction.getName(),
											AssociationAction.getLargeIcon());
									category.addAction(contextAction);
									*/
									addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_ASSOCIATION,ASSOCIATION,ASSOCIATION);
									}
	/*
								DiagramContextToolbarAction contextAction2 = new DiagramContextToolbarAction(
										RolePlayedByAction.getID(),
										RolePlayedByAction.getName(),
										RolePlayedByAction.getLargeIcon());
								category.addAction(contextAction2);
								*/
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_GENERALIZATION,RolePlayedByStereotypeName,RolePlayedByStereotypeName);
							}
							if (NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))) {
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE,MetadataApplicationStereotypeName,MetadataApplicationStereotypeName);
							}
							if (NIEMHelper.canBeMetadataApplicationSupplier(element)) {
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE_OPPOSITE,MetadataApplicationStereotypeName+"_OPPOSITE",MetadataApplicationStereotypeName);
							}
							
							if (NIEMHelper.canBeAugmentationApplicationSupplier(element)) {
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE_OPPOSITE,AugmentationApplicationStereotypeName+"_OPPOSITE",AugmentationApplicationStereotypeName);
							}
							if (NIEMHelper.canBeUnionOfSupplier(element)) {
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE_OPPOSITE,UnionOfStereotypeName+"_OPPOSITE",UnionOfStereotypeName);
							}
							if (NIEMHelper.canBeRolePlayedBySupplier(element)) {
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_GENERALIZATION_OPPOSITE,RolePlayedByStereotypeName+"_OPPOSITE",RolePlayedByStereotypeName);
							}
							if (NIEMHelper.canBeAugmentsSupplier(element)) {
								addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_GENERALIZATION_OPPOSITE,AugmentsStereotypeName+"_OPPOSITE",AugmentsStereotypeName);
							}
						}
					}
				// Classifier case not showing up?
					if (Property.class.isInstance(element)
							|| com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element) 
//							|| "Class".equals(metaClassName))
							|| (element instanceof Classifier)
							) {
						if (element.isEditable()) {
							/*
							DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
									ReferencesAction.getID(),
									ReferencesAction.getName(),
									ReferencesAction.getLargeIcon());
							category.addAction(contextAction);
							*/
							addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_REALIZATION,ReferencesStereotypeName,ReferencesStereotypeName);
						}
					}
					if(Property.class.isInstance(element)
							&&NIEMHelper.isInInformationModel(element)
							&&!isSubsetModel
							&&element.isEditable()){
						Property property=(Property)element;
						Type type=property.getType();
						if((type!=null)&&Classifier.class.isInstance(type)&&NIEMHelper.isAugmentationType((Classifier)type)){
							addDiagramContextToolbarAction( mngr,category,ActionsID.ADD_USAGE,AugmentationApplicationStereotypeName,AugmentationApplicationStereotypeName);
							/*
							DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
									AugmentationApplicationAction.getID(),
									AugmentationApplicationAction.getName(),
									AugmentationApplicationAction
											.getLargeIcon());
							category.addAction(contextAction);
							*/
						}
					}

				}
				// add category into manager.
				// Category is not displayed in context menu.
				// mngr.addCategory(categoryDummy);
				mngr.addCategory(category);
			}

			@Override
			public int getPriority() {
				// TODO Auto-generated method stub
				return 0;
			}

		};
		ActionsConfiguratorsManager.getInstance().addDiagramContextToolbarConfigurator(DiagramTypeConstants.UML_CLASS_DIAGRAM,diagramContextConfigurator);
		ActionsConfiguratorsManager.getInstance().addDiagramContextToolbarConfigurator(NIEMDiagramDescriptor.NIEM_DIAGRAM,diagramContextConfigurator);
	}

	protected void configureDiagramContextMenus() {
		
		//DiagramContextAMConfigurator diagramContextConfigurator = new NIEMClassDiagramContextConfigurator();
		ActionsConfiguratorsManager.getInstance().addDiagramContextConfigurator(DiagramTypeConstants.UML_CLASS_DIAGRAM,diagramContextConfigurator);
		ActionsConfiguratorsManager.getInstance().addDiagramContextConfigurator(NIEMDiagramDescriptor.NIEM_DIAGRAM,diagramContextConfigurator);
		// doest nothing?  ActionsConfiguratorsManager.getInstance().addDiagramContextConfigurator("Relation Map Diagram",diagramContextConfigurator);
	}
	

	protected void configureToolbar() {
		AMConfigurator toolBarConfigurator = new AMConfigurator() {
			public void configure(ActionsManager mngr) {
				// niemNewProjectAction=new
				// MDActionsCategory("niemNewProjectActions","new NIEM Project");
				// niemNewProjectAction.setSmallIcon(QvtCommonAction.getNiemIcon());
				// searching for action after which insert should be done.
				NMAction found = mngr.getActionFor(ActionsID.NEW_PROJECT);
				// action found, inserting
				if (found != null) {
					// find category of "New Project" action.
					ActionsCategory category = (ActionsCategory) mngr
							.getActionParent(found);
					// get all actions from this category (menu).
					List actionsInCategory = category.getActions();
					// add action after "New Project" action.
					int indexOfFound = actionsInCategory.indexOf(found);
					// set all actions.
					category.setActions(actionsInCategory);
				}
			}

			public int getPriority() {
				return AMConfigurator.MEDIUM_PRIORITY;
			}
		};
		ActionsConfiguratorsManager.getInstance().addMainToolbarConfigurator(
				toolBarConfigurator);

	}

	static public String niemGroupName = null;// "NIEMGROUP";

	protected void configureBrowser() {
		BrowserContextAMConfigurator browserConfigurator = new BrowserContextAMConfigurator() {
			public int getPriority() {
				return AMConfigurator.MEDIUM_PRIORITY;
			}

			@Override
			public void configure(ActionsManager mngr, Tree tree) {
				Node node = tree.getSelectedNode();
				if (node == null)
					return;
				Object userObject = node.getUserObject();
				if(!Element.class.isInstance(userObject))return;
				Element userElement=(Element)userObject;
				diagramContextConfigurator.configureNiemContext(mngr, userElement, null);
			}
		};
		ActionsConfiguratorsManager.getInstance()
				.addContainmentBrowserContextConfigurator(browserConfigurator);
	
	}
protected boolean isDevelopment(){
	return "Tom".equals(System.getProperty("user.name"))
			||"tom".equals(System.getProperty("user.name"));
}
	protected void configureMainMenu() {
		AMConfigurator menuConfigurator = new AMConfigurator() {
			public void configure(ActionsManager mngr) {
				// searching for action after which insert should be done.
				NMAction found = mngr.getActionFor(ActionsID.IMPORT_CATEGORY);
				// action found, inserting
				if (found != null) {
					// find category of "New Project" action.
					ActionsCategory category = (ActionsCategory) found;
					// get all actions from this category (menu).
					List actionsInCategory = category.getActions();
					// add action after "New Project" action.
					int indexOfFound = 0;
					actionsInCategory.add(indexOfFound + 1, mpd2psmAction);
					actionsInCategory.add(indexOfFound + 2, iepd2psmAction);
					if(isDevelopment()){
					actionsInCategory.add(indexOfFound + 3, libBuildAction);
					actionsInCategory.add(indexOfFound + 4, testAction);
					}
					// set all actions.
					category.setActions(actionsInCategory);
				}
				found = mngr.getActionFor(ActionsID.EXPORT);
				// action found, inserting
				if (found != null) {
					ActionsCategory category = (ActionsCategory) found;
					// get all actions from this category (menu).
					List actionsInCategory = category.getActions();
					// add action after "New Project" action.
					int indexOfFound = 0;
					actionsInCategory.add(indexOfFound + 1, pim2psmAction);
					//actionsInCategory.add(indexOfFound + 2, masterDocumentationAction);
					if(isDevelopment()){
					actionsInCategory.add(indexOfFound + 2, rfp2docAction);
					actionsInCategory.add(indexOfFound + 3, referenceToLuceneAction);
					//actionsInCategory.add(indexOfFound + 4, pim2schematronAction);
					
					}

					// set all actions.
					category.setActions(actionsInCategory);
				}
				found = mngr.getActionFor(ActionsID.ANALYZE);
				// action found, inserting
				if (found != null) {
					ActionsCategory category = (ActionsCategory) found;
					// get all actions from this category (menu).
					List actionsInCategory = category.getActions();
					// add action after "New Project" action.
					int indexOfFound = 0;
					actionsInCategory.add(indexOfFound + 1, mpdCompareAction);
					actionsInCategory.add(indexOfFound + 2, new SearchReferenceModels(null));
					// reactivate and test validation
					//actionsInCategory.add(indexOfFound + 3, niemValidateAction);
					
					// set all actions.
					category.setActions(actionsInCategory);
				}
				found = mngr.getActionFor(ActionsID.DIAGRAMS);
				// action found, inserting
				if (found != null) {
					ActionsCategory category = (ActionsCategory) found;
					// get all actions from this category (menu).
					List actionsInCategory = category.getActions();
					// add action after "New Project" action.
					int indexOfFound = 0;
					actionsInCategory.add(indexOfFound + 1, mpdEntityDiagramsAction);

					// set all actions.
					category.setActions(actionsInCategory);
				}
				found = mngr.getActionFor(ActionsID.HELP);
				// action found, inserting
				if (found != null) {
					ActionsCategory category = (ActionsCategory) found;
					// get all actions from this category (menu).
					List<NMAction> actionsInCategory = category.getActions();
					// add action after "About" action.
					int indexOfFound = 0;
					for(NMAction test:actionsInCategory){
						indexOfFound++;
						if(ActionsID.ABOUT.equals(test.getID())){
							break;
						}
					}
					actionsInCategory.add(indexOfFound, niemAboutAction);
					// set all actions.
					category.setActions(actionsInCategory);
				}
			}

			public int getPriority() {
				return AMConfigurator.MEDIUM_PRIORITY;
			}
		};
		ActionsConfiguratorsManager.getInstance().addMainMenuConfigurator(
				menuConfigurator);

	}

	//static public DrawPathDiagramAction simpleContentRestrictionAction = new SimpleContentRestrictionAction();
//	static public DrawPathDiagramAction RestrictionAction = new CommonRealizationAction(RestrictionStereotypeName);
	//static public DrawPathDiagramAction AugmentsAction = new NIEMGeneralizationAction(AugmentsStereotypeName);
	//static public DrawPathDiagramAction RoleOfAction = new NIEMDirectedAssociationAction(RoleOfStereotypeName);
	//static public DrawPathDiagramAction AssociationAction = new NIEMAssociationAction(ASSOCIATION);
	//static public DrawPathDiagramAction ReferenceAction = new NIEMDirectedAssociationAction(REFERENCE);
	//static public DrawPathDiagramAction ContentAction = new NIEMDirectedAggregationAction(CONTENT);
	//static public DrawPathDiagramAction RolePlayedByAction = new NIEMGeneralizationAction(RolePlayedByStereotypeName);
	// static public DrawPathDiagramAction XSDSimpleContentAction=new
	// PSMRealizationAction(XSDSimpleContentStereotypeName);// no need for this

	//static public DrawPathDiagramAction mpdFileAction = new ModelPackageDescriptionFileAction();
	//static public DrawPathDiagramAction mpdRelationshipAction = new ModelPackageDescriptionRelationshipAction();
	//static public DrawPathDiagramAction AugmentationApplicationAction = new CommonUsageAction(AugmentationApplicationStereotypeName);
	//static public DrawPathDiagramAction MetadataApplicationAction = new CommonUsageAction(MetadataApplicationStereotypeName);
//	static public DrawPathDiagramAction ReferencesAction = new CommonRealizationAction(ReferencesStereotypeName);
//	static public DrawPathDiagramAction UnionOfAction = new CommonUsageAction(UnionOfStereotypeName);
/*
	static public DrawPathDiagramAction newsimpleContentRestrictionAction(){return new SimpleContentRestrictionAction();}
	static public DrawPathDiagramAction newRestrictionAction(){return new CommonRealizationAction(RestrictionStereotypeName);}
	static public DrawPathDiagramAction newAugmentsAction(){return new NIEMGeneralizationAction(
			AugmentsStereotypeName);}
	static public DrawPathDiagramAction newRoleOfAction(){return new NIEMDirectedAssociationAction(RoleOfStereotypeName);}
	static public DrawPathDiagramAction newAssociationAction(){return new NIEMAssociationAction(ASSOCIATION);}
	static public DrawPathDiagramAction newReferenceAction(){return new NIEMDirectedAssociationAction(REFERENCE);}
	static public DrawPathDiagramAction newContentAction(){return new NIEMDirectedAggregationAction(CONTENT);}
	static public DrawPathDiagramAction newRolePlayedByAction(){return new NIEMGeneralizationAction(
			RolePlayedByStereotypeName);}
	// static public DrawPathDiagramAction XSDSimpleContentAction=new
	// PSMRealizationAction(XSDSimpleContentStereotypeName);// no need for this

	static public DrawPathDiagramAction newmpdFileAction(){return new ModelPackageDescriptionFileAction();}
	static public DrawPathDiagramAction newmpdRelationshipAction(){return new ModelPackageDescriptionRelationshipAction();}
	static public DrawPathDiagramAction newAugmentationApplicationAction(){return new CommonUsageAction(
			AugmentationApplicationStereotypeName);}
	static public DrawPathDiagramAction newMetadataApplicationAction(){return new CommonUsageAction(
			MetadataApplicationStereotypeName);}
	static public DrawPathDiagramAction newReferencesAction(){return new CommonRealizationAction(
			ReferencesStereotypeName);}
	static public DrawPathDiagramAction newUnionOfAction(){return new CommonUsageAction(
			UnionOfStereotypeName);}
			*/
	static protected boolean isPimProfileInProject(){
		Profile pimProfile=	NIEMHelper.getPimProfile();
		return (pimProfile!=null);
	}
	/*
	 static public DiagramInnerToolbarConfiguration newdiagramToolbarConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEM", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newpackageConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMPackageConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newmodelConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMModelConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemTypeConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMTypeConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static{
		//niemTypeConfiguration.addShotcut(ClassAction.keyStroke);
		//diagramToolbarConfiguration.addShotcut(ClassAction.keyStroke);
	}
	static public DiagramInnerToolbarConfiguration newniemPropertyHolderConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMPropertyHolderConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemDataTypeConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMDataTypeConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemComplexDataTypeConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMComplexDataTypeConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemComponentConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMComponentConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemGeneralizationConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(),
			"NIEMGeneralizationConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemUsageConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMUsageConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemDependencyConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMDependencyConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemRealizationConfiguration(){return  new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMRealizationConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemImportConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMImportConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	static public DiagramInnerToolbarConfiguration newniemAssociationConfiguration(){return new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMAssociationConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(isEnabled()&&isPimProfileInProject());
		}
	};}
	*/
	
	static public DiagramInnerToolbarConfiguration diagramToolbarConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEM", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration packageConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMPackageConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration modelConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMModelConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemTypeConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMTypeConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static{
		//niemTypeConfiguration.addShotcut(ClassAction.keyStroke);
		//diagramToolbarConfiguration.addShotcut(ClassAction.keyStroke);
	}
	static public DiagramInnerToolbarConfiguration niemPropertyHolderConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMPropertyHolderConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemDataTypeConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMDataTypeConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemComplexDataTypeConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMComplexDataTypeConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemComponentConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMComponentConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemGeneralizationConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(),
			"NIEMGeneralizationConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemUsageConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMUsageConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemDependencyConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMDependencyConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemRealizationConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMRealizationConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemImportConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMImportConfiguration", true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	static public DiagramInnerToolbarConfiguration niemAssociationConfiguration = new DiagramInnerToolbarConfiguration(
			QvtCommonAction.getNiemIcon(), "NIEMAssociationConfiguration",
			true) {
		public void updateState(){
			super.updateState();
			setEnabled(
					//isEnabled()&&
					isPimProfileInProject());
		}
	};
	

	static public DrawShapeDiagramAction informationModelAction = new InformationModelAction(
			InformationModelStereotypeName);
	static public DrawShapeDiagramAction packageAction = new PackageAction();
	static public DrawShapeDiagramAction modelAction = new ModelAction();

	static public DrawShapeDiagramAction ObjectTypeAction = new NIEMTypeAction(
			ObjectTypeStereotypeName);
	static public DrawShapeDiagramAction AdapterTypeAction = new NIEMTypeAction(
			AdapterTypeStereotypeName);
	static public DrawShapeDiagramAction AssociationTypeAction = new NIEMTypeAction(
			AssociationTypeStereotypeName);
	static public DrawShapeDiagramAction AugmentationTypeAction = new NIEMTypeAction(
			AugmentationTypeStereotypeName);
	static public DrawShapeDiagramAction MetadataTypeAction = new NIEMTypeAction(
			MetadataTypeStereotypeName);

	static public DrawShapeDiagramAction ChoiceAction = new NIEMTypeAction(
			ChoiceStereotypeName);
	static public DrawShapeDiagramAction PropertyHolderAction = new NIEMTypeAction(
			PropertyHolderStereotypeName);

	static public DrawShapeDiagramAction ListAction = new NIEMDataTypeAction(
			ListStereotypeName);
	static public DrawShapeDiagramAction UnionAction = new NIEMDataTypeAction(
			UnionStereotypeName);

	static public DrawShapeDiagramAction ValueRestrictionAction = new NIEMPrimitiveTypeAction(
			ValueRestrictionStereotypeName);

	static public DrawShapeDiagramAction classAction = new ClassAction();
	
	static public DrawShapeDiagramAction dataTypeAction = new DataTypeAction();
	static public DrawShapeDiagramAction primitiveTypeAction = new PrimitiveTypeAction();
	static public DrawShapeDiagramAction enumerationAction = new EnumerationAction();
	static public DrawShapeDiagramAction complexEnumerationAction = new ComplexEnumerationAction();

	static public DrawShapeDiagramAction MpdAction = new NIEMComponentAction(
			ModelPackageDescriptionStereotypeName);
	static public DrawShapeDiagramAction MpdFileSetAction = new NIEMComponentAction(
			ModelPackageDescriptionFileSetStereotypeName);
/*	
	static public DrawShapeDiagramAction newinformationModelAction(){return new InformationModelAction(
			InformationModelStereotypeName);}
	static public DrawShapeDiagramAction newpackageAction (){return  new PackageAction();}
	static public DrawShapeDiagramAction newmodelAction (){return  new ModelAction();}

	static public DrawShapeDiagramAction newObjectTypeAction (){return  new NIEMTypeAction(
			ObjectTypeStereotypeName);}
	static public DrawShapeDiagramAction newAdapterTypeAction(){return  new NIEMTypeAction(
			AdapterTypeStereotypeName);}
	static public DrawShapeDiagramAction newAssociationTypeAction(){return  new NIEMTypeAction(
			AssociationTypeStereotypeName);}
	static public DrawShapeDiagramAction newAugmentationTypeAction (){return  new NIEMTypeAction(
			AugmentationTypeStereotypeName);}
	static public DrawShapeDiagramAction newMetadataTypeAction (){return  new NIEMTypeAction(
			MetadataTypeStereotypeName);}

	static public DrawShapeDiagramAction newChoiceAction(){return  new NIEMTypeAction(
			ChoiceStereotypeName);}
	static public DrawShapeDiagramAction newPropertyHolderAction (){return  new NIEMTypeAction(
			PropertyHolderStereotypeName);}

	static public DrawShapeDiagramAction newListAction (){return  new NIEMDataTypeAction(
			ListStereotypeName);}
	static public DrawShapeDiagramAction newUnionAction(){return  new NIEMDataTypeAction(
			UnionStereotypeName);}

	static public DrawShapeDiagramAction newValueRestrictionAction (){return  new NIEMPrimitiveTypeAction(
			ValueRestrictionStereotypeName);}

	static public DrawShapeDiagramAction newclassAction (){return  new ClassAction();}
	static public DrawShapeDiagramAction newdataTypeAction(){return  new DataTypeAction();}
	static public DrawShapeDiagramAction newprimitiveTypeAction (){return  new PrimitiveTypeAction();}
	static public DrawShapeDiagramAction newenumerationAction (){return  new EnumerationAction();}
	static public DrawShapeDiagramAction newcomplexEnumerationAction (){return  new ComplexEnumerationAction();}

	static public DrawShapeDiagramAction newMpdAction (){return  new NIEMComponentAction(
			ModelPackageDescriptionStereotypeName);}
	static public DrawShapeDiagramAction newMpdFileSetAction (){return  new NIEMComponentAction(
			ModelPackageDescriptionFileSetStereotypeName);}
			*/
	protected void configureDiagramToolbar() {
		BaseDiagramToolbarConfigurator diagramToolbarConfigurator = new BaseDiagramToolbarConfigurator() {
			public void configure(ActionsManager mngr) {
try{				
				int index=1;
				if(mngr.getCategories().size()==0)index=0;
				//DiagramInnerToolbarConfiguration diagramToolbarConfiguration=newdiagramToolbarConfiguration();
				mngr.addCategory(index, diagramToolbarConfiguration);
				// do not put actions at top level unless they are always enabled
//				diagramToolbarConfiguration.addAction(modelAction);
				//DiagramInnerToolbarConfiguration modelConfiguration=newmodelConfiguration();
				diagramToolbarConfiguration.addAction(modelConfiguration);
//				modelConfiguration.addAction(newmodelAction());
				modelConfiguration.addAction(modelAction);
				//modelConfiguration.addAction(informationModelAction);
				//diagramToolbarConfiguration.addAction(informationModelAction);
//				diagramToolbarConfiguration.addAction(newpackageAction());
				diagramToolbarConfiguration.addAction(packageAction);
				//DiagramInnerToolbarConfiguration packageConfiguration=newpackageConfiguration();
				diagramToolbarConfiguration.addAction(packageConfiguration);
//				packageConfiguration.addAction(newinformationModelAction());
				packageConfiguration.addAction(informationModelAction);
				/*
				packageConfiguration.addAction(modelAction);
				packageConfiguration.addAction(packageAction);
*/
//				DiagramInnerToolbarConfiguration niemTypeConfiguration=newniemTypeConfiguration();
				diagramToolbarConfiguration.addAction(niemTypeConfiguration);
//				niemTypeConfiguration.addAction(newObjectTypeAction());
//				niemTypeConfiguration.addAction(newAdapterTypeAction());
//				niemTypeConfiguration.addAction(newAssociationTypeAction());
//				niemTypeConfiguration.addAction(newAugmentationTypeAction());
//				niemTypeConfiguration.addAction(newMetadataTypeAction());

//				niemTypeConfiguration.addAction(newChoiceAction());
//				niemTypeConfiguration.addAction(PropertyHolderAction);
//				niemTypeConfiguration.addAction(newclassAction());
				
				niemTypeConfiguration.addAction(ObjectTypeAction);
				niemTypeConfiguration.addAction(AdapterTypeAction);
				niemTypeConfiguration.addAction(AssociationTypeAction);
				niemTypeConfiguration.addAction(AugmentationTypeAction);
				niemTypeConfiguration.addAction(MetadataTypeAction);

				niemTypeConfiguration.addAction(ChoiceAction);
//				niemTypeConfiguration.addAction(PropertyHolderAction);
				niemTypeConfiguration.addAction(classAction);
//				diagramToolbarConfiguration.addAction(classAction);
				
//				DiagramInnerToolbarConfiguration niemPropertyHolderConfiguration=newniemPropertyHolderConfiguration();
				diagramToolbarConfiguration.addAction(niemPropertyHolderConfiguration);
				
				
//				niemPropertyHolderConfiguration.addAction(newPropertyHolderAction());
				niemPropertyHolderConfiguration.addAction(PropertyHolderAction);
//				DiagramInnerToolbarConfiguration niemDataTypeConfiguration=newniemDataTypeConfiguration();
				diagramToolbarConfiguration
						.addAction(niemDataTypeConfiguration);
//				niemDataTypeConfiguration.addAction(newValueRestrictionAction());
//				niemDataTypeConfiguration.addAction(newListAction());
//				niemDataTypeConfiguration.addAction(newUnionAction());
//				niemDataTypeConfiguration.addAction(newdataTypeAction());
//				niemDataTypeConfiguration.addAction(newprimitiveTypeAction());
//				niemDataTypeConfiguration.addAction(newenumerationAction());
				
				niemDataTypeConfiguration.addAction(ValueRestrictionAction);
				niemDataTypeConfiguration.addAction(ListAction);
				niemDataTypeConfiguration.addAction(UnionAction);
				niemDataTypeConfiguration.addAction(dataTypeAction);
				niemDataTypeConfiguration.addAction(primitiveTypeAction);
				niemDataTypeConfiguration.addAction(enumerationAction);
				
//				DiagramInnerToolbarConfiguration niemComplexDataTypeConfiguration=newniemComplexDataTypeConfiguration();
				diagramToolbarConfiguration.addAction(niemComplexDataTypeConfiguration);
//				niemComplexDataTypeConfiguration.addAction(newcomplexEnumerationAction());
				niemComplexDataTypeConfiguration.addAction(complexEnumerationAction);
//				DiagramInnerToolbarConfiguration niemComponentConfiguration=newniemComponentConfiguration();
				diagramToolbarConfiguration
						.addAction(niemComponentConfiguration);
//				niemComponentConfiguration.addAction(newMpdAction());
//				niemComponentConfiguration.addAction(newMpdFileSetAction());
				niemComponentConfiguration.addAction(MpdAction);
				niemComponentConfiguration.addAction(MpdFileSetAction);
//				DiagramInnerToolbarConfiguration niemGeneralizationConfiguration=newniemGeneralizationConfiguration();
				diagramToolbarConfiguration.addAction(niemGeneralizationConfiguration);
				addActions(mngr, niemGeneralizationConfiguration,
						"Generalization");
				////////////////
//				niemGeneralizationConfiguration.addAction(newRestrictionAction());
//				niemGeneralizationConfiguration.addAction(newsimpleContentRestrictionAction());
//				niemGeneralizationConfiguration.addAction(newAugmentsAction());
//				niemGeneralizationConfiguration.addAction(newRolePlayedByAction());

				//niemGeneralizationConfiguration.addAction(RestrictionAction);
				addBaseCustomizableDiagramAction(mngr,niemGeneralizationConfiguration,"Realization",RestrictionStereotypeName,Realization.class,NIEMHelper.getCommonStereotype(RestrictionStereotypeName));
				//niemGeneralizationConfiguration.addAction(simpleContentRestrictionAction);
				addBaseCustomizableDiagramAction(mngr,niemGeneralizationConfiguration,"Realization","ProxyRestriction",Realization.class,NIEMHelper.getCommonStereotype(RestrictionStereotypeName));
//				niemGeneralizationConfiguration.addAction(AugmentsAction);
//				niemGeneralizationConfiguration.addAction(RolePlayedByAction);
				addBaseCustomizableDiagramAction(mngr,niemGeneralizationConfiguration,"Generalization",AugmentsStereotypeName,Generalization.class,NIEMHelper.getPimStereotype(AugmentsStereotypeName));
				addBaseCustomizableDiagramAction(mngr,niemGeneralizationConfiguration,"Generalization",RolePlayedByStereotypeName,Generalization.class,NIEMHelper.getPimStereotype(RolePlayedByStereotypeName));
				
				// niemGeneralizationConfiguration.addAction(XSDSimpleContentAction);

				// usage, realization, element import
//				DiagramInnerToolbarConfiguration niemUsageConfiguration=newniemUsageConfiguration();
				diagramToolbarConfiguration.addAction(niemUsageConfiguration);
//				niemUsageConfiguration.addAction(mpdFileAction);
//				niemUsageConfiguration.addAction(newAugmentationApplicationAction());
//				niemUsageConfiguration.addAction(newMetadataApplicationAction());
// model corruption if close or save project before completing the relationship				
				addBaseCustomizableDiagramAction(mngr,niemUsageConfiguration,"Usage",AugmentationApplicationStereotypeName,Usage.class,NIEMHelper.getCommonStereotype(AugmentationApplicationStereotypeName));
				//addBaseCustomizableDiagramAction(mngr,niemUsageConfiguration,"Usage",MetadataApplicationStereotypeName,Usage.class,NIEMHelper.getCommonStereotype(MetadataApplicationStereotypeName));
				
				addBaseCustomizableDiagramAction(mngr,niemUsageConfiguration,"Usage",MetadataApplicationStereotypeName,Usage.class,NIEMHelper.getCommonStereotype(MetadataApplicationStereotypeName));								
				//niemUsageConfiguration.addAction(AugmentationApplicationAction);
				//niemUsageConfiguration.addAction(MetadataApplicationAction);
				
				
				//baseAugmentationApplicationAction.getElementCreatorInfo().getElementConfigurator().
//				augmentationApplicationElementCreatorInfo.setElementConfigurator(arg0)
				
//				DiagramInnerToolbarConfiguration niemDependencyConfiguration=newniemDependencyConfiguration();
				diagramToolbarConfiguration
						.addAction(niemDependencyConfiguration);
//				niemDependencyConfiguration.addAction(newmpdFileAction());
//				niemDependencyConfiguration.addAction(newmpdRelationshipAction());
//				niemDependencyConfiguration.addAction(mpdFileAction);
//				addBaseCustomizableDiagramAction(mngr,niemDependencyConfiguration,"Usage",ModelPackageDescriptionStereotypeName,Usage.class,NIEMHelper.getMpdStereotype(ModelPackageDescriptionStereotypeName));
				addBaseCustomizableDiagramAction(mngr,niemDependencyConfiguration,"Usage",ModelPackageDescriptionFileStereotypeName,Usage.class,NIEMHelper.getMpdStereotype(ModelPackageDescriptionFileStereotypeName));
//				niemDependencyConfiguration.addAction(mpdRelationshipAction);
				addBaseCustomizableDiagramAction(mngr,niemDependencyConfiguration,"Dependency",ModelPackageDescriptionRelationshipStereotypeName,Dependency.class,NIEMHelper.getMpdStereotype(ModelPackageDescriptionRelationshipStereotypeName));
//				DiagramInnerToolbarConfiguration niemRealizationConfiguration=newniemRealizationConfiguration();
				diagramToolbarConfiguration
						.addAction(niemRealizationConfiguration);
//				niemRealizationConfiguration.addAction(newReferencesAction());
//				niemRealizationConfiguration.addAction(newUnionOfAction());
//				niemRealizationConfiguration.addAction(ReferencesAction);
				addBaseCustomizableDiagramAction(mngr,niemRealizationConfiguration,"Realization",ReferencesStereotypeName,Realization.class,NIEMHelper.getCommonStereotype(ReferencesStereotypeName));
//				niemRealizationConfiguration.addAction(UnionOfAction);
				addBaseCustomizableDiagramAction(mngr,niemRealizationConfiguration,"Usage",UnionOfStereotypeName,Usage.class,NIEMHelper.getCommonStereotype(UnionOfStereotypeName));								
//				addActions(mngr, niemRealizationConfiguration, "Realization");
//				addActions(mngr, niemRealizationConfiguration, "Usage");
//				DiagramInnerToolbarConfiguration niemImportConfiguration=newniemImportConfiguration();
				diagramToolbarConfiguration.addAction(niemImportConfiguration);
				addActions(mngr, niemImportConfiguration, "Element Import");
				addActions(mngr, niemImportConfiguration, "Realization");
				addActions(mngr, niemImportConfiguration, "Usage");
//				DiagramInnerToolbarConfiguration niemAssociationConfiguration=newniemAssociationConfiguration();
				diagramToolbarConfiguration
						.addAction(niemAssociationConfiguration);
				addActions(mngr, niemAssociationConfiguration,"Association Class");
//				niemAssociationConfiguration.addAction(newRoleOfAction());
//				niemAssociationConfiguration.addAction(newReferenceAction());
//				niemAssociationConfiguration.addAction(newContentAction());
//				niemAssociationConfiguration.addAction(newAssociationAction());
				//niemAssociationConfiguration.addAction(RoleOfAction);
				//niemAssociationConfiguration.addAction(ReferenceAction);
				
				addBaseCustomizableDiagramAction(mngr,niemAssociationConfiguration,"Directed Association",RoleOfStereotypeName,Association.class,null);								
				addBaseCustomizableDiagramAction(mngr,niemAssociationConfiguration,"Directed Association",REFERENCE,Association.class,null);								
				
				//static public DrawPathDiagramAction RoleOfAction = new NIEMDirectedAssociationAction(RoleOfStereotypeName);
				//static public DrawPathDiagramAction ReferenceAction = new NIEMDirectedAssociationAction(REFERENCE);
				
//				niemAssociationConfiguration.addAction(ContentAction);
				addBaseCustomizableDiagramAction(mngr,niemAssociationConfiguration,"Directed Aggregation",CONTENT,Association.class,null);								
//				niemAssociationConfiguration.addAction(AssociationAction);
				addBaseCustomizableDiagramAction(mngr,niemAssociationConfiguration,"Association",ASSOCIATION,Association.class,null);								
								/* does not get it
				NMAction actionTest=mngr.getActionFor(ClassAction.keyStroke);
				System.out.println("configureDiagramToolbar "+actionTest);
				*/
}catch(Throwable t){
	t.printStackTrace();
}
			}

			public int getPriority() {
				return AMConfigurator.MEDIUM_PRIORITY;
			}
		};
		ActionsConfiguratorsManager.getInstance().addDiagramToolbarConfigurator(DiagramTypeConstants.UML_CLASS_DIAGRAM,diagramToolbarConfigurator);
 ActionsConfiguratorsManager.getInstance().addDiagramToolbarConfigurator(NIEMDiagramDescriptor.NIEM_DIAGRAM,diagramToolbarConfigurator);
 /*
		BaseDiagramToolbarConfigurator diagramToolbarConfigurator2 = new BaseDiagramToolbarConfigurator() {
			public void configure(ActionsManager mngr) {
			}
		};
		ActionsConfiguratorsManager.getInstance().addDiagramToolbarConfigurator(NIEMDiagramDescriptor.NIEM_DIAGRAM,diagramToolbarConfigurator2);
		*/
		/*
		 * we are still not getting proper action of generalization, etc.
		 * will remove "NIEM Information Model Diagram" from suggestedOwnedDiagrams
		// add class diagram to NIEM_DIAGRAM
		BaseDiagramToolbarConfigurator diagramToolbarConfigurator2 = new BaseDiagramToolbarConfigurator() {
			public void configure(ActionsManager mngr) {
				com.nomagic.magicdraw.actions.ActionsManager actionsManager=Application.getInstance().getActionsManager();
				if(actionsManager==null)return;
				DiagramsActionsManager diagramsActionsManager=actionsManager.getDiagramActionsManager();
				if(diagramsActionsManager==null)return;
				ActionsManager actionsManager2=diagramsActionsManager.getManager(DiagramTypeConstants.UML_CLASS_DIAGRAM);
				if(actionsManager2==null)return;
				ActionsCategory actionsCategory=actionsManager2.getCategory(ActionsID.CLASS_DIAGRAM_ELEMENTS);
				System.out.println("TEST DIAGRAM actions "+actionsCategory+", "+actionsCategory.getClass().getName());
				mngr.addCategory(2, actionsCategory);
			}

			public int getPriority() {
				return AMConfigurator.MEDIUM_PRIORITY;
			}
		};
		ActionsConfiguratorsManager.getInstance().addDiagramToolbarConfigurator(NIEMDiagramDescriptor.NIEM_DIAGRAM,diagramToolbarConfigurator2);
*/
		
		// does not work ActionsConfiguratorsManager.getInstance().addDiagramToolbarConfigurator("Relation Map Diagram",diagramToolbarConfigurator);// see if we can do this?
	}
	protected void configureDiagramToolbarActionsProvider() {
		RMActionsConfigurator configurator=new NIEMRelationMapDiagramConfigurator();
		RelationMapActionRegistry.getInstance().addCustomConfigurator(configurator);
	}

	// we are not always finding these actions
	protected void addActions(ActionsManager mngr,
			DiagramInnerToolbarConfiguration niemGeneralizationConfiguration,
			String mdActionName) {
		try {
			for (NMAction action : mngr.getAllActions()) {
				if (BaseCustomizableDiagramAction.class.isInstance(action)) {
					BaseCustomizableDiagramAction baseAction = (BaseCustomizableDiagramAction) action;
					if (mdActionName.equals(action.getName())) {
						ElementCreatorInfo elementCreatorInfo=baseAction.getElementCreatorInfo();
						// seems like all of them are BaseCustomizableDiagramAction
						if(elementCreatorInfo!=null){
//							System.out.println("addAction "+mdActionName+", "+elementCreatorInfo.getClass().getName()+", "+elementCreatorInfo.getElementClass()+", "+elementCreatorInfo.getSymbolClass()+", "+elementCreatorInfo.getStereotypesNames());
						}
						niemGeneralizationConfiguration.addAction(action);
					}
				}
			}
		} catch (Throwable ignore) {
			QvtCommonAction.log("TEST Generalization ERROR " + ignore);

		}
	}
	
	protected void addDiagramContextToolbarAction(ActionsManager mngr,MDMenuAction category,String mdID,String niemID,String niemActionName) {
		/*
		DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
				niemID,
				niemActionName
//				,action.getLargeIcon()
				);
		//contextAction.setDescription("description test");
		
		category.addAction(contextAction);
*/
	
		try {
			boolean foundAction=false;
			List<String> ids=new Vector<String>();
			for (NMAction action : mngr.getAllActions()) {
				if(action==null)continue;
				//System.out.println("addDiagramContextToolbarAction "+action+", "+action.getName()+", "+action.getID()+", "+niemActionName+", "+action.getClass().getName());
				ids.add(action.getID());
				if (DiagramContextToolbarAction.class.isInstance(action)) {
					DiagramContextToolbarAction baseAction = (DiagramContextToolbarAction) action;
					
					if (mdID.equals(action.getID())) {
						DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
								niemID,
								//action.getID(),
								niemActionName,
								action.getLargeIcon());
						//contextAction.setDescription("description test");
						
						category.addAction(contextAction);
						foundAction=true;
					}
				}
			}
			if(!foundAction){
				for (NMAction action : category.getActions()) {
					if(action==null)continue;
					//System.out.println("addDiagramContextToolbarAction "+action+", "+action.getName()+", "+action.getID()+", "+niemActionName+", "+action.getClass().getName());
					if (DiagramContextToolbarAction.class.isInstance(action)) {
						DiagramContextToolbarAction baseAction = (DiagramContextToolbarAction) action;
						
						if (mdID.equals(action.getID())) {
							DiagramContextToolbarAction contextAction = new DiagramContextToolbarAction(
									niemID,
									niemActionName,
									action.getLargeIcon());
							category.addAction(contextAction);
							foundAction=true;
						}
					}
				}
				if(!foundAction){
				System.out.println("addDiagramContextToolbarAction did not find action "+mdID+", "+niemID+", "+niemActionName+", "+ids);
				}
			}
		} catch (Throwable ignore) {
			QvtCommonAction.log("TEST Generalization ERROR " + ignore);

		}

	}
	
	protected void addBaseCustomizableDiagramAction(ActionsManager mngr,
			DiagramInnerToolbarConfiguration niemGeneralizationConfiguration,
			String mdActionName,String niemActionName,java.lang.Class elementClass,Stereotype stereotype) {
		try {
			// check if the niemAction already there
			
			for (NMAction action :niemGeneralizationConfiguration.getActions()){
				if(niemActionName.equals(action.getName()))return;
			}
			
			for (NMAction action : mngr.getAllActions()) {
				if (BaseCustomizableDiagramAction.class.isInstance(action)) {
					BaseCustomizableDiagramAction baseAction = (BaseCustomizableDiagramAction) action;
					if (mdActionName.equals(action.getName())) {
						String mdID=action.getID();
						String niemID=niemActionName;
						boolean isOpposite=false;
						if(mdID.endsWith("_OPPOSITE")){
							niemID+="_OPPOSITE";
							isOpposite=true;
						}
						ElementCreatorInfo baseelementCreatorInfo=(ElementCreatorInfo)baseAction.getElementCreatorInfo();
						BaseCustomizableDiagramAction cloneAction =new NiemBaseCustomizableDiagramAction(niemID,niemActionName,
								null,elementClass,baseelementCreatorInfo,stereotype,baseAction,isOpposite);
						/*
						ElementCreatorInfo elementCreatorInfo=(ElementCreatorInfo)cloneAction.getElementCreatorInfo();
						if(elementCreatorInfo!=null){
//							elementCreatorInfo.setAdditionalDrawAction(baseelementCreatorInfo.getAdditionalDrawAction());// base is null anyway
							PresentationElementConfigurator pec=new StereotypedDependencyPresentationElementConfigurator(elementClass,stereotype);
							elementCreatorInfo.setElementConfigurator(pec);
							
							System.out.println("addAction "+mdActionName+", "+cloneAction.getStyle()+", "+cloneAction.getID()+", "+elementCreatorInfo.getClass().getName()+", "+elementCreatorInfo.getElementClass()+", "+elementCreatorInfo.getMEProperties()+", "+elementCreatorInfo.getSymbolProperties()+", "+elementCreatorInfo.getAdditionalDrawAction()+", "+baseAction.getActions());
						}
						*/
					/*
						BaseCustomizableDiagramAction cloneAction =(BaseCustomizableDiagramAction)baseAction.clone();
//						cloneAction.setName(cloneAction.getName()+" <<Augmentation Application>>");
						cloneAction.setName(niemActionName);
						ElementCreatorInfo elementCreatorInfo=cloneAction.getElementCreatorInfo();
						if(elementCreatorInfo!=null){
//							PresentationElementConfigurator pec=new StereotypedDependencyPresentationElementConfigurator(Usage.class,NIEMHelper.getCommonStereotype(AugmentationApplicationStereotypeName));
							PresentationElementConfigurator pec=new StereotypedDependencyPresentationElementConfigurator(elementClass,stereotype);
							elementCreatorInfo.setElementConfigurator(pec);
							
							System.out.println("addAction "+mdActionName+", "+cloneAction.getStyle()+", "+cloneAction.getID()+", "+elementCreatorInfo.getClass().getName()+", "+elementCreatorInfo.getElementClass()+", "+elementCreatorInfo.getMEProperties()+", "+elementCreatorInfo.getSymbolProperties()+", "+elementCreatorInfo.getAdditionalDrawAction());
						}
					*/
						niemGeneralizationConfiguration.addAction(cloneAction);
					}
				}
			}
		} catch (Throwable ignore) {
			QvtCommonAction.log("TEST Generalization ERROR " + ignore);

		}
	}
	///////////////////////////////////////////////
	public class NiemBaseCustomizableDiagramAction extends BaseCustomizableDiagramAction{
		protected ElementCreatorInfo elementCreatorInfo;
		protected java.lang.Class elementClass;
		protected ElementCreatorInfo baseelementCreatorInfo;
		protected Stereotype stereotype;
		protected BaseCustomizableDiagramAction baseAction;
		protected DiagramActionsExecuter diagramActionsExecuter;
		protected boolean isOpposite;
		
		public NiemBaseCustomizableDiagramAction(String arg0, String niemActionName,
				KeyStroke arg2,java.lang.Class elementClassIn,ElementCreatorInfo baseelementCreatorInfoIn,Stereotype stereotypeIn,
				BaseCustomizableDiagramAction baseActionIn,boolean isOppositeIn) {
			super(arg0, niemActionName, arg2);
			elementClass=elementClassIn;
			baseelementCreatorInfo=baseelementCreatorInfoIn;
			stereotype=stereotypeIn;
			baseAction=baseActionIn;
			isOpposite=isOppositeIn;
			
			this.setLargeIcon(baseAction.getLargeIcon());
			this.setSmallIcon(baseAction.getSmallIcon());
			this.setDistinguish(baseAction.isDistinguish());
			this.setGrouped(baseAction.isGrouped());
			this.setGroup(baseAction.getGroup());
			this.setState(baseAction.getState());
			
		
		}
		public ElementCreatorInfo getElementCreatorInfo(){
			if(elementCreatorInfo==null){
				elementCreatorInfo=new ElementCreatorInfo(elementClass, null, null, null, null, null, null, baseelementCreatorInfo.getDefaultSize(), isOpposite);
				PresentationElementConfigurator pec=new StereotypedDependencyPresentationElementConfigurator(elementClass,stereotype,this.getName());
				elementCreatorInfo.setElementConfigurator(pec);
				
				//System.out.println("getElementCreatorInfo "+elementCreatorInfo.getClass().getName()+", "+elementCreatorInfo.getElementClass()+", "+elementCreatorInfo.getMEProperties()+", "+elementCreatorInfo.getSymbolProperties()+", "+elementCreatorInfo.getAdditionalDrawAction());
				
			}
			return elementCreatorInfo;
		}
		protected DiagramActionsExecuter getDiagramActionsExecuter(){
			if(diagramActionsExecuter==null){
				Project project=Application.getInstance().getProject();
				diagramActionsExecuter=new DiagramActionsExecuter(project){
					public ElementCreatorInfo getElementCreatorInfoByActionID(String id){
						return getElementCreatorInfo();
					}
				};
			}
			return diagramActionsExecuter;
		}
		public void actionPerformed(ActionEvent event){
			super.actionPerformed(event);
		}

	}
	////////////////////////////////////////////
public class StereotypedDependencyPresentationElementConfigurator implements PresentationElementConfigurator{
	protected java.lang.Class elementClass=null;
	protected Stereotype stereotype;
	protected String name;
	public StereotypedDependencyPresentationElementConfigurator(java.lang.Class elementClassIn,Stereotype stereotypeIn,String nameIn){
		elementClass=elementClassIn;
		stereotype=stereotypeIn;
		name=nameIn;
	}
	@Override
	public void configureElement(Element element) {
		if(elementClass.isInstance(element)){
			if(stereotype==null){
				if(element instanceof NamedElement){
					((NamedElement)element).setName(name);
				}
			}else{
				NIEMHelper.addStereotype(element,stereotype);
				if("ProxyRestriction".equals(name)){
					Realization realization=(Realization)element;
					realization.setName("ProxyRestriction");
					OpaqueExpression opaqueExpression=Application.getInstance().getProject().getElementsFactory().createOpaqueExpressionInstance();
					opaqueExpression.getLanguage().add("English");
					opaqueExpression.getBody().add("via Proxy");
					realization.setMapping(opaqueExpression);

				}else if (ModelPackageDescriptionStereotypeName.equals(name)){
					Usage usage=(Usage)element;
					Profile mpdProfile=NIEMHelper.getMpdProfile();
					Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
					Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
					EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,subset_schemaLiteralName);
					EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xsdLiteralName);
					NIEMHelper.setStereotypePropertyValue(usage,stereotype,natureCodeTagName,defaultNature);
					NIEMHelper.setStereotypePropertyValue(usage,stereotype,purposeCodeTagName,defaultPurpose);
					NIEMHelper.setStereotypePropertyValue(usage,stereotype,relativePathNameTagName,"");
					NIEMHelper.setStereotypePropertyValue(usage,stereotype,descriptionTextTagName,"Serves the purpose of an XML schema that has been derived from a NIEM reference schema and represents a subset of the reference schema.");
					
				}
			}
		}
	}
	
}
//////////////////////////////////////////
	protected void configureBrowserTabs(){
		/*
		EnvironmentOptions eo;
		KeyboardOptionsGroup kog=eo.getKeyboardOptions();
		kog.getOptions().getPropertyByName("").setValue(arg0);
		*/
		// there is a problem with browser??? causes validation to freeze up
		Browser.addBrowserInitializer(instanceBrowserInitializer);
	}
	
	// //////////////////////////////
	// /////////////////////////////
	public boolean close() {
		return true;
	}

	public boolean isSupported() {
		// plugin can check here for specific conditions
		// if false is returned plugin is not loaded.
		return true;
	}
}
