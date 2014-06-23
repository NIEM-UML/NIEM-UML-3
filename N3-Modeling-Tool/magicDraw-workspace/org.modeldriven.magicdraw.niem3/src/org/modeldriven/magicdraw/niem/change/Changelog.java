/**
 * 
 */
package org.modeldriven.magicdraw.niem.change;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.DiagramDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.symbol.PresentationElementUtility;
import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.project.ProjectDescriptor;
import com.nomagic.magicdraw.core.project.ProjectDescriptorsFactory;
import com.nomagic.magicdraw.core.project.ProjectsManager;
import com.nomagic.magicdraw.diff.ChangeOwnerInfo;
import com.nomagic.magicdraw.diff.Difference;
import com.nomagic.magicdraw.diff.ElementAddition;
import com.nomagic.magicdraw.diff.ElementDeletion;
import com.nomagic.magicdraw.diff.ElementDifference;
import com.nomagic.magicdraw.diff.ElementModification;
import com.nomagic.magicdraw.diff.GenericOrderModificationInfo;
import com.nomagic.magicdraw.diff.ModificationInfo;
import com.nomagic.magicdraw.diff.OrderModificationInfo;
import com.nomagic.magicdraw.diff.PrimitiveMultiValueModificationInfo;
import com.nomagic.magicdraw.diff.PrimitiveValueModificationInfo;
import com.nomagic.magicdraw.diff.ReferenceModificationInfo;
import com.nomagic.magicdraw.diff.StereotypeModification;
import com.nomagic.magicdraw.diff.TagValueModification;
import com.nomagic.magicdraw.diff.ValueModificationInfo;
import com.nomagic.magicdraw.diff.ValueOrderModificationInfo;
import com.nomagic.magicdraw.diff.macro.MacroDifference;
import com.nomagic.magicdraw.diff.symbols.MultiplePersistentPropertyDifference;
import com.nomagic.magicdraw.diff.symbols.PersistentPropertyOrderDifference;
import com.nomagic.magicdraw.merge.Change;
import com.nomagic.magicdraw.merge.MergeUtil;
import com.nomagic.magicdraw.merge.ProjectDifference;
import com.nomagic.magicdraw.merge.macro.MacroChange;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.pathvariables.PathVariable;
import com.nomagic.magicdraw.properties.BooleanProperty;
import com.nomagic.magicdraw.properties.ChoiceProperty;
import com.nomagic.magicdraw.properties.PropertyID;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.OpaqueExpression;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.TypedElement;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.deployments.mdartifacts.Artifact;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.impl.ElementsFactory;
import com.nomagic.uml2.impl.PropertyNames;
import com.nomagic.utils.ErrorHandler;

/**
 * changelog as a whole represented by package whose uri is the "source" project (and has MPDFile from MPD Component)
 * is uri ok?   use path variables?  
 * or should we use a project option?
 * 
 * Dialog to get target model when changelog is created;
 * Subsequent action to update changelog??????
 * Provisioning changelog ? - try via qvt
 * 
 * do difference, 
 * use to merge in changelog entries:
 *    assume one changeentry element as an artifact
 *    contains Realizations to properties, classes, packages (namespaces),
 *    		stereotype/tag (facets) representing added elements
 *    contains nested artifacts with fileName as URI to represent removed elements
 *    contains nested artifacts which have realizations to represent modified elements
 *    
 *    additional changeentry as artifacts, move as required the nested artifacts/Realizations
 *    postpone the changeentry properties for now
 *    
 * @author tom
 *
 */
public class Changelog implements NIEM_ProfileConstants,ChangelogConstants,ToolTipConstants{
	static protected Changelog INSTANCE=new Changelog();
	public static void addChangelogAction(MDMenuAction category,final PresentationElement pe,final Package browserPackage,String niemGroupName){
		DiagramPresentationElement diagram=null;
		Package clientPackage=browserPackage;
		if(DiagramPresentationElement.class.isInstance(pe)){
			diagram=(DiagramPresentationElement)pe;
			Element diagramOwner=diagram.getElement().getOwner();
			if(!Package.class.isInstance(diagramOwner))return;
			clientPackage=(Package)diagramOwner;
		}
		else if (pe!=null) {
			diagram=pe.getDiagramPresentationElement();
			Element diagramPackage=pe.getElement();
			if(!Package.class.isInstance(diagramPackage))return;
			clientPackage=(Package)diagramPackage;
		}
		if(clientPackage==null)return;
		
		// changelog, if it does not already exist
		Package changelogPackage=NIEMHelper.getChangelog(clientPackage);
		if(changelogPackage!=null)return;

		MDAction testAction=new DefaultDiagramAction("addChangelog","add MPD Changelog",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				Changelog.INSTANCE.ChangelogDialog(pe, browserPackage,null);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(ADD_MPD_CHANGELOG_ACTION_TOOLTIP);
		category.addAction(testAction);
		testAction=new DefaultDiagramAction("addInitialVersionChangelog","add Initial Version MPD Changelog",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
		    	try {
					Changelog.INSTANCE.initialVersionChangeLog(pe);
				} catch (ReadOnlyElementException error) {
					// TODO Auto-generated catch block
					error.printStackTrace();
				}
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(ADD_MPD_INITIALVERSION_CHANGELOG_ACTION_TOOLTIP);
		category.addAction(testAction);
	}
	public static void refreshChangelogAction(MDMenuAction category,final PresentationElement pe,final Package browserPackage,String niemGroupName){
		DiagramPresentationElement diagram=null;
		Package clientPackage=browserPackage;
		if(DiagramPresentationElement.class.isInstance(pe)){
			diagram=(DiagramPresentationElement)pe;
			Element diagramOwner=diagram.getElement().getOwner();
			if(!Package.class.isInstance(diagramOwner))return;
			clientPackage=(Package)diagramOwner;
		}
		else if (pe!=null) {
			diagram=pe.getDiagramPresentationElement();
			Element diagramPackage=pe.getElement();
			if(!Package.class.isInstance(diagramPackage))return;
			clientPackage=(Package)diagramPackage;
		}
		if(clientPackage==null)return;
		if(!NIEMHelper.isChangelog(clientPackage))return;
		final Package changelogPackage=clientPackage;
		// offer to change URI
		{
			MDAction testAction=new DefaultDiagramAction("resetChangelogBaseline","set/change MPD Changelog Baseline Project",null,niemGroupName){
				@Override
				public void updateState() {
					setEnabled(true);
				}
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e){
					Changelog.INSTANCE.ChangelogDialog(pe, browserPackage,changelogPackage);
				}
			};
			testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
			testAction.setDescription(RESET_CHANGELOG_BASELINE_ACTION_TOOLTIP);
			category.addAction(testAction);
			
		}
		// no refresh option if this is an initial version
		if((changelogPackage.getURI()!=null)&&!"".equals(changelogPackage.getURI())){
	
			MDAction testAction=new DefaultDiagramAction("refreshChangelog","refresh MPD Changelog",null,niemGroupName){
				@Override
				public void updateState() {
					setEnabled(true);
				}
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e){
	//				Changelog.INSTANCE.ChangelogDialog(pe, browserPackage);
					Application application=Application.getInstance();
					final Project targetProject=application.getProject();
					ProjectDescriptor sourceProjectDescriptor=ChangelogUtility.getSourceProjectDescriptor(changelogPackage, targetProject);
					/*
					String relativeURIString=changelogPackage.getURI();
					URI relativeURI=null;
					try {
						relativeURI = new URI(relativeURIString);
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						return;
					}
					URI sourceURI=null;
					if(relativeURI.isAbsolute()){
						sourceURI=relativeURI;
					}else{
				    	File targetFile=targetProject.getFile().getAbsoluteFile();
				    	URI targetURI=targetFile.toURI();
				    	sourceURI=targetURI.resolve(relativeURI);
					}
			    	ProjectDescriptor sourceProjectDescriptor=ProjectDescriptorsFactory.createProjectDescriptor(sourceURI);
			    	QvtCommonAction.log("Changelog Refresh "+sourceURI+", "+relativeURI);
			    	*/
			    	try {
			    		Changelog.INSTANCE.refreshProjectDiff(targetProject,sourceProjectDescriptor,changelogPackage);
					} catch (ReadOnlyElementException error) {
						// TODO Auto-generated catch block
						error.printStackTrace();
					}
				}
			};
			testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
			testAction.setDescription(REFRESH_CHANGELOG_ACTION_TOOLTIP);
			category.addAction(testAction);
			
		}
	}
	
	public void ChangelogDialog(final PresentationElement requestor,final Package browserPackage,final Package changelogPackage){
		Application application=Application.getInstance();
		final Project targetProject=application.getProject();
		Frame frame=application.getMainFrame();
    	String fileNameSuffix=".mdzip";
    	String fileName="*"+fileNameSuffix;
    	FileDialog fd=new FileDialog(frame,"open previous version of model: "+fileName);
    	fd.setFile(fileName);
    	fd.setVisible(true);
    	if((fd.getFile()==null)||(fd.getDirectory()==null)){
	    	return;
    	}
    	if(!fd.getFile().endsWith(fileNameSuffix)){
	    	javax.swing.JOptionPane.showMessageDialog( frame, "Illegal filename for import: "+fd.getFile()+" should be a "+fileName);
	    	return;
    	}
    	final File sourceFile=new File(fd.getDirectory()+fd.getFile());
    	ProjectDescriptor source = getProjectDescriptor(sourceFile);
    	File targetFile=targetProject.getFile().getAbsoluteFile();
    	final String relativeURI=getRelativeURI(targetFile,sourceFile);
    	QvtCommonAction.log("Changelog "+sourceFile+", "+targetFile+", "+relativeURI);
    	try {
			projectDiff(targetProject,sourceFile,relativeURI,requestor,changelogPackage);
		} catch (ReadOnlyElementException e) {
			e.printStackTrace();
		}
	}
	static protected String getRelativeURI(File targetFile,File sourceFile){
		File targetParent=targetFile.getParentFile();
		File sourceParent=sourceFile.getParentFile();
		File commonRoot=getCommonRootFile(targetParent,sourceParent);
		if(commonRoot==null)return sourceFile.toURI().toASCIIString();
		String toRoot="./";
		while(!commonRoot.equals(targetParent)){
			toRoot+="../";
			targetParent=targetParent.getParentFile();
		}
		URI commonURI=commonRoot.toURI();
		URI sourceURI=sourceFile.toURI();
		//toRoot+=sourceParent.getAbsolutePath().substring(commonRoot.getAbsolutePath().length()).replace('\\','/');
		toRoot+=sourceURI.toASCIIString().substring(commonURI.toASCIIString().length());
		return (toRoot);
	}
	static protected File getCommonRootFile(File targetFile,File sourceFile){
		if((targetFile==null)||(sourceFile==null))return null;
		if(targetFile.equals(sourceFile))return targetFile;
		File sourceParent=sourceFile.getParentFile();
		while(sourceParent!=null){
			if(targetFile.equals(sourceParent))return targetFile;
			sourceParent=sourceParent.getParentFile();
		}
		return getCommonRootFile(targetFile.getParentFile(),sourceFile);
	}
	protected  ElementsFactory targetElementsFactory;
	protected  ElementsFactory getTargetElementsFactory(){return targetElementsFactory;}
	protected Project targetProject;
	protected Project getTargetProject(){return targetProject;}
	protected Project sourceProject;
	protected Project getSourceProject(){return sourceProject;}
	protected Package defaultChangeInformation;
	protected Package getDefaultChangeInformation(){return defaultChangeInformation;}
	  protected Set<Artifact> allArtifacts=new HashSet<Artifact>();
	  protected Set<Artifact> getAllArtifacts(){return allArtifacts;}
	  protected Set<Realization> allRealizations=new HashSet<Realization>();
	  protected Set<Realization> getAllRealizations(){return allRealizations;}
	  protected Package changelog;
	  protected Package getChangelog(){return changelog;}
	  protected void clearWorkingProperties(){
		  allArtifacts.clear();
		  allRealizations.clear();
		  targetElementsFactory=null;
		  sourceProject=null;
		  targetProject=null;
		  defaultChangeInformation=null;
		  changelog=null;
	  }
	  protected void initialVersionChangeLog(PresentationElement pe) throws ReadOnlyElementException
	  {
			Application application=Application.getInstance();
			Project targetProjectIn=application.getProject();
		  targetProject=targetProjectIn;
		    Component mpd=QvtCommonAction.getMpdComponent();
		    if(mpd==null)return;
		    Package mpdTopLevel=NIEMHelper.getNearestAppliedProfilePackage(mpd);
		    if(mpdTopLevel==null)return;
		  targetElementsFactory=targetProject.getElementsFactory();
	    boolean isSessionCreated=NIEMHelper.createSession("changelog");
	    try{
	    
	    // lets make the changelog package now
	    changelog=targetElementsFactory.createPackageInstance();
	    mpdTopLevel.getPackagedElement().add(changelog);
	    changelog.setName(changelogPackageName);
	    // setURI of package to sourceModel
	    changelog.setURI("");
	    // informational comment
	    Comment changelogComment=targetElementsFactory.createCommentInstance();
	    changelog.getOwnedComment().add(changelogComment);
	    changelogComment.getAnnotatedElement().add(changelog);
	    changelogComment.setBody("changelog for initial version of MPD."  );
	    
	    
	    // hook it up with mpd via mpdfile, set nature/purpose
	    Usage mpdFile=createModelPackageDescriptionFileChangelog( mpd, changelog,getTargetProject());
	    }finally{
	    	NIEMHelper.closeSession(isSessionCreated);
	    }
	    // create diagram add elements we just created
	    createChangelogDiagram(changelog,getTargetProject(),pe);
//	    ChangelogUtility.testCreateChangelog(changelog);
	  }
	  
	  /**
	   * Project diff - find elements that changed name.
	   *
	   * @param targetProject target project.
	   * @param sourceFile  source project file.
	 * @throws ReadOnlyElementException 
	   */
	  protected void projectDiff(Project targetProjectIn, File sourceFile,String relativeURI,PresentationElement pe,Package changelogPackage) throws ReadOnlyElementException
	  {
		  targetProject=targetProjectIn;
		    Component mpd=QvtCommonAction.getMpdComponent();
		    if(mpd==null)return;
		    Package mpdTopLevel=NIEMHelper.getNearestAppliedProfilePackage(mpd);
		    if(mpdTopLevel==null)return;
		  targetElementsFactory=targetProject.getElementsFactory();
	    final ProjectDescriptor source = getProjectDescriptor(sourceFile);
	      final ProjectsManager projectsManager = Application.getInstance().getProjectsManager();

	    // if you are going access the target or source projects after diff - use MergeUtil.Optimization.PERFORMANCE,
	    // when using MergeUtil.Optimization.MEMORY - source project is closed to reduce memory usage.
	    final MergeUtil.Optimization optimization = MergeUtil.Optimization.PERFORMANCE;
	    // get differences
	    //progressStatus.setDescription("Start Difference Analysis");
	    QvtCommonAction.log("changelog start project differencing");
	    final ProjectDifference projectDifference = MergeUtil.getDifference(targetProject, source, null,
	                                      new SimpleErrorHandler(), optimization);
	    QvtCommonAction.log("Start Changelog model construction");
	    //progressStatus.setDescription("Start Changelog model construction");
	    boolean isSessionCreated=NIEMHelper.createSession("changelog");
	    try{
	    
	    // lets make the changelog package now
	    	//changelog=getCurrentChangelog(mpdTopLevel);
	    	changelog=changelogPackage;
	    	if(changelog==null){
			    changelog=targetElementsFactory.createPackageInstance();
			    mpdTopLevel.getPackagedElement().add(changelog);
			    changelog.setName(changelogPackageName);
			    // informational comment
			    Comment changelogComment=targetElementsFactory.createCommentInstance();
			    changelog.getOwnedComment().add(changelogComment);
			    changelogComment.getAnnotatedElement().add(changelog);
			    changelogComment.setBody("changelog contains one or more ChangeInformation Packages.  Each ChangeInformation Package has Realization to new or modified Elements of this model, plus contained Artifacts representing removed elements from original model."  );
			    
			    
			    // hook it up with mpd via mpdfile, set nature/purpose
			    Usage mpdFile=createModelPackageDescriptionFileChangelog( mpd, changelog,getTargetProject());
	    	}else{
	    		// clear contents of existing package
	    		for(PackageableElement packagedElement:changelog.getPackagedElement()){
	  	    	  NIEMHelper.removeElement(packagedElement);
	    		}
	    	}
		    // create default change information artifact
		    defaultChangeInformation=targetElementsFactory.createPackageInstance();
		    changelog.getPackagedElement().add(defaultChangeInformation);
		    defaultChangeInformation.setName("DefaultChangeInformation");
		    // setURI of package to sourceModel
		    changelog.setURI(relativeURI);
	    if (projectDifference != null)
	    {
           // /*final Project*/ 
	    	sourceProject = projectsManager.findProject(source);// set global
		    QvtCommonAction.log("Start processing project differences");
           processProjectDiff(projectDifference);
		    QvtCommonAction.log("Completed processing project differences");
	    }else{
	    	  QvtCommonAction.log("Changelog : no differences");
	      }
	    }finally{
	    	NIEMHelper.closeSession(isSessionCreated);
	    }
	    // create diagram add elements we just created
	    createChangelogDiagram(changelog,getTargetProject(),pe);
//	    ChangelogUtility.testCreateChangelog(changelog);
	  }
	  /*
	  protected Package getCurrentChangelog(Package mpdTopLevel){
		  for(PackageableElement test:mpdTopLevel.getPackagedElement()){
			  if(Package.class.isInstance(test)&&changelogPackageName.equals(test.getName())){
				  // also needs to be hooked to mpd
				  for(Dependency d:test.getSupplierDependency()){
					  if(NIEMHelper.isModelPackageDescriptionFile(d)){
						  EnumerationLiteral nature=NIEMHelper.getMpdFileNature(d);
						  EnumerationLiteral purpose=NIEMHelper.getMpdFilePurpose(d);
						  if((nature!=null)&&(purpose!=null)
								  &&xmlLiteralName.equals(nature.getName())
								  &&changelogLiteralName.equals(purpose.getName())
								  ){
							  return (Package)test;
						  }
					  }
				  }
			  }
		  }
		  return null;
	  }
	  */
	  protected void refreshProjectDiff(Project targetProjectIn, ProjectDescriptor source,Package changelogIn) throws ReadOnlyElementException
	  {
		  changelog=changelogIn;
		  targetProject=targetProjectIn;
		  targetElementsFactory=targetProject.getElementsFactory();
	      final ProjectsManager projectsManager = Application.getInstance().getProjectsManager();
	    final MergeUtil.Optimization optimization = MergeUtil.Optimization.PERFORMANCE;
	    // get differences
	      QvtCommonAction.log("Changelog start difference ");
	    final ProjectDifference projectDifference = MergeUtil.getDifference(targetProject, source, null,
	                                      new SimpleErrorHandler(), optimization);
	      QvtCommonAction.log("Changelog difference end "+projectDifference);
	    // lets find a defaultChangeInformation now
	    defaultChangeInformation=null;
	    for(Package changeInformation:changelog.getNestedPackage()){
	    	defaultChangeInformation=changeInformation;
	    }
	    if(defaultChangeInformation==null)return;
	    
	    if (projectDifference != null)
	    {
           sourceProject = projectsManager.findProject(source);// set global
           processProjectDiff(projectDifference);
		    // create diagram add elements we just created
		    createChangelogDiagram(changelog,getTargetProject(),null);
	    }else{
	    	  QvtCommonAction.log("Changelog : no differences");
	      }
	  }

	  protected void processProjectDiff(ProjectDifference projectDifference) throws ReadOnlyElementException
	  {
		  getAllArtifacts().clear();
		  getAllRealizations().clear();
		  // get current changelog deltas
		  for(Package changeInformation:getChangelog().getNestedPackage()){
			  for(PackageableElement artifact:changeInformation.getPackagedElement()){
				  if(Artifact.class.isInstance(artifact))getAllArtifacts().add((Artifact)artifact);
			  }
			  for(Dependency realization:changeInformation.getClientDependency()){
					if(Realization.class.isInstance(realization)){
						 getAllRealizations().add((Realization)realization);
					}
			  }
		  }
		  		  
	      List<NamedElement> elements = new ArrayList<NamedElement>();
	      // when ancestor is null - only source differences are discovered.
	      for (Change change : projectDifference.getSourceChanges())
	      {
	    	  
	        final MacroDifference macroDifference = ((MacroChange) change).getDifference();
	        for (Difference difference : macroDifference.getDifferences())
	        {
	        	 if(ElementAddition.class.isInstance(difference)){
	        		 elementAddition((ElementAddition)difference);
	        	 }else if(ElementDeletion.class.isInstance(difference)){
	        		 elementDeletion((ElementDeletion)difference);
	        	 }else if(ElementModification.class.isInstance(difference)){
	        		 elementModification((ElementModification)difference);
	        	 }else if(StereotypeModification.class.isInstance(difference)){
	        		 stereotypeModification((StereotypeModification)difference);
	        	 }else if(TagValueModification.class.isInstance(difference)){
	        		 tagValueModification((TagValueModification)difference);
	        	 }else{
	        	 }
	        }
	      }
	      // remove items no longer referenced
	      for(Artifact artifact:getAllArtifacts()){
	    	  QvtCommonAction.log("Changelog removing obsolete artifact "+artifact.getQualifiedName());
	    	  NIEMHelper.removeElement(artifact);
	      }
	      for(Realization realization:getAllRealizations()){
	    	  QvtCommonAction.log("Changelog removing obsolete realization "+realization.getQualifiedName());
	    	  NIEMHelper.removeElement(realization);
	      }

	      // on diff MagicDraw loads projects, locks teamwork elements so need to restore previous state after diff
	      //QvtCommonAction.log("Changelog start restore ");
	      //MergeUtil.restore(projectDifference);
	      //QvtCommonAction.log("Changelog restore complete");
	      clearWorkingProperties();
	      // we sometimes get an error: Project  was already disposed(closed) and can not be activated again.
	      targetProject=Application.getInstance().getProject();
	      changelog=NIEMHelper.getChangelog(QvtCommonAction.getMpdComponent());
	      //
	      //System.out.println("Changelog after restore "+targetProject+", "+changelog+", "+QvtCommonAction.getMpdComponent());
	      
	  }
	  protected Set<Realization> getSupplierChanges(NamedElement namedElement,String type){
			Set<Realization> result=new HashSet<Realization>();
			for(Dependency realization:namedElement.getSupplierDependency()){
				if(Realization.class.isInstance(realization)&&realization.getName().startsWith(type)){
					result.add((Realization)realization);
				}
			}
			return result;
		}
  protected void elementDeletion(ElementDeletion difference){
    	//QvtCommonAction.log("ElementDeletion difference "+elementDeletion.getElementID()+", "+elementDeletion.getModuleURI());
	  Package changeInformation=getDefaultChangeInformation();
      BaseElement elementByID = getTargetProject().getElementByID(difference.getElementID());
    	if(NamedElement.class.isInstance(elementByID)){
    		NamedElement namedElement=(NamedElement)elementByID;
    		// must be Package, Classifier, Property in an InformationModel
    		if(!(
    				Package.class.isInstance(namedElement)
    				||Classifier.class.isInstance(namedElement)
    				||Property.class.isInstance(namedElement)
    				||EnumerationLiteral.class.isInstance(namedElement)
    				))return;
    		if(!ChangelogUtility.isInInformationModel(namedElement,getTargetProject()))return;
/*
                                         <xsd:element ref="log:NewPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewTypeEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewTypeContainsPropertyEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewFacetEntry" minOccurs="0" maxOccurs="unbounded"/>
                                        <xsd:element ref="log:NewNamespaceEntry" minOccurs="0" maxOccurs="unbounded"/>
    		
 */
        	QvtCommonAction.log("ElementDeletion name "+namedElement.getQualifiedName());
        	// for now, create a NewEntry Realization from default to element
        	Realization existingEntry=findExistingElementDeletion(namedElement,difference,NEW_ENTRY_PREFIX);
        	if(existingEntry!=null)return;
    	    Realization newEntry=getTargetElementsFactory().createRealizationInstance();
    	    changeInformation.getOwningPackage().getPackagedElement().add(newEntry);
    	    newEntry.getClient().add(changeInformation);
    	    newEntry.getSupplier().add(namedElement);
    	    newEntry.setName(NEW_ENTRY_PREFIX+" "+namedElement.getHumanName());
        	
    	}		  
  }
  protected void elementAddition(ElementAddition difference){
	  Package changeInformation=getDefaultChangeInformation();

	//QvtCommonAction.log("ElementAddition difference "+elementAddition.getElementID()+", "+elementAddition.getModuleURI());
   BaseElement elementByID = getSourceProject().getElementByID(difference.getElementID());
	if(NamedElement.class.isInstance(elementByID)){
  		NamedElement namedElement=(NamedElement)elementByID;
		// must be Package, Classifier, Property in an InformationModel
		if(!(
				Package.class.isInstance(namedElement)
				||Classifier.class.isInstance(namedElement)
				||Property.class.isInstance(namedElement)
				||EnumerationLiteral.class.isInstance(namedElement)
				))return;
		if(!ChangelogUtility.isInInformationModel(namedElement,getSourceProject()))return;
	  	QvtCommonAction.log("ElementAddition name "+namedElement.getQualifiedName());
	  	Artifact existingEntry=findExistingElementAddition(namedElement,difference,REMOVED_ENTRY_PREFIX);
    	if(existingEntry!=null)return;
	    Artifact removedEntry=getTargetElementsFactory().createArtifactInstance();
//		  changeInformation.getNestedArtifact().add(removedEntry);
//		changeInformation.setFileName(difference.getElementID());
	    
		  changeInformation.getPackagedElement().add(removedEntry);
		  removedEntry.setFileName(difference.getElementID());
		removedEntry.setName(REMOVED_ENTRY_PREFIX+" "+namedElement.getHumanName());
	}
}
protected void elementModification(ElementModification difference){
	  Package changeInformation=getDefaultChangeInformation();
 	//QvtCommonAction.log("ElementModification difference "+difference.getElementID()+", "+difference.getModuleURI()+", "+difference.getChangedPropertyName()+", "+getModificationInfo(difference.getModificationInfo()));
    BaseElement elementByID = getTargetProject().getElementByID(difference.getElementID());
	if(NamedElement.class.isInstance(elementByID)){
  		NamedElement namedElement=(NamedElement)elementByID;
		// must be Package, Classifier, Property in an InformationModel
		if(!(
				Package.class.isInstance(namedElement)
				||Classifier.class.isInstance(namedElement)
				||Property.class.isInstance(namedElement)
				||EnumerationLiteral.class.isInstance(namedElement)
				))return;
		if(!ChangelogUtility.isInInformationModel(namedElement,getTargetProject()))return;
		QvtCommonAction.log("ElementModification name "+namedElement.getQualifiedName()+", property="+difference.getChangedPropertyName()+", "+getModificationInfo(difference.getModificationInfo()));
		// changedPropertyName, value, kind, order, index
		Realization existingEntry=findExistingElementModification(namedElement,difference,MODIFIED_ENTRY_PREFIX);
    	if(existingEntry!=null)return;
    	// for now, create a ModifiedEntry Realization from default to element
	    Realization modifiedEntry=getTargetElementsFactory().createRealizationInstance();
	    changeInformation.getOwningPackage().getPackagedElement().add(modifiedEntry);
	    modifiedEntry.getClient().add(changeInformation);
	    modifiedEntry.getSupplier().add(namedElement);
	    modifiedEntry.setName(MODIFIED_ENTRY_PREFIX+" "+namedElement.getHumanName());

	    setChangedPropertyName(modifiedEntry,difference.getChangedPropertyName());
		ModificationInfo modificationInfo=difference.getModificationInfo();
		setModification(modifiedEntry,modificationInfo);
	    
	}
}
protected void stereotypeModification(StereotypeModification difference){
	  Package changeInformation=getDefaultChangeInformation();
 	//QvtCommonAction.log("ElementModification difference "+difference.getElementID()+", "+difference.getModuleURI()+", "+difference.getChangedPropertyName()+", "+getModificationInfo(difference.getModificationInfo()));
    BaseElement elementByID = getTargetProject().getElementByID(difference.getElementID());
	if(NamedElement.class.isInstance(elementByID)){
  		NamedElement namedElement=(NamedElement)elementByID;
		// must be Package, Classifier, Property in an InformationModel
		if(!(
				Package.class.isInstance(namedElement)
				||Classifier.class.isInstance(namedElement)
				||Property.class.isInstance(namedElement)
				||EnumerationLiteral.class.isInstance(namedElement)
				))return;
		if(!
				ChangelogUtility.isInInformationModel(namedElement,getTargetProject()))return;
     	QvtCommonAction.log("StereotypeModification name "+namedElement.getQualifiedName()+", "+getModificationInfo(difference.getModificationInfo()));
		Realization existingEntry=findExistingStereotypeModification(namedElement,difference,STEREOTYPE_ENTRY_PREFIX);
    	if(existingEntry!=null)return;
    	// for now, create a StereotypeEntry Realization from default to element
	    Realization modifiedEntry=getTargetElementsFactory().createRealizationInstance();
	    changeInformation.getOwningPackage().getPackagedElement().add(modifiedEntry);
	    modifiedEntry.getClient().add(changeInformation);
	    modifiedEntry.getSupplier().add(namedElement);
	    modifiedEntry.setName(STEREOTYPE_ENTRY_PREFIX+" "+namedElement.getHumanName());
		ModificationInfo modificationInfo=difference.getModificationInfo();
		setModification(modifiedEntry,modificationInfo);
		
	}
}
protected void tagValueModification(TagValueModification difference){
	  Package changeInformation=getDefaultChangeInformation();
 	//QvtCommonAction.log("ElementModification difference "+difference.getElementID()+", "+difference.getModuleURI()+", "+difference.getChangedPropertyName()+", "+getModificationInfo(difference.getModificationInfo()));
    BaseElement elementByID = getTargetProject().getElementByID(difference.getElementID());
	if(NamedElement.class.isInstance(elementByID)){
  		NamedElement namedElement=(NamedElement)elementByID;
		// must be Package, Classifier, Property in an InformationModel
		if(!(
				Package.class.isInstance(namedElement)
				||Classifier.class.isInstance(namedElement)
				||Property.class.isInstance(namedElement)
				||EnumerationLiteral.class.isInstance(namedElement)
				))return;
		if(!ChangelogUtility.isInInformationModel(namedElement,getTargetProject()))return;
     	QvtCommonAction.log("TagValueModification name "+namedElement.getQualifiedName()+", "+getModificationInfo(difference.getModificationInfo()));
		Realization existingEntry=findExistingTagValueModification(namedElement,difference,TAG_VALUE_ENTRY_PREFIX);
    	if(existingEntry!=null)return;
    	// for now, create a TagValueEntry Realization from default to element
	    Realization modifiedEntry=getTargetElementsFactory().createRealizationInstance();
	    changeInformation.getOwningPackage().getPackagedElement().add(modifiedEntry);
	    modifiedEntry.getClient().add(changeInformation);
	    modifiedEntry.getSupplier().add(namedElement);
	    modifiedEntry.setName(TAG_VALUE_ENTRY_PREFIX+" "+namedElement.getHumanName());
		setTVPropertyID(modifiedEntry,difference.getTVPropertyID());

		ModificationInfo modificationInfo=difference.getModificationInfo();
		setModification(modifiedEntry,modificationInfo);
		
	}
}
protected Set<Artifact> getArtifactChanges(NamedElement namedElement,String type){
	  Set<Artifact> result=new HashSet<Artifact>();
	  for(Artifact artifact:getAllArtifacts()){
		  if(artifact.getName().startsWith(type)&& namedElement.getID().equals(artifact.getFileName())){
			  result.add(artifact);
		  }
	  }
	  return result;
}
protected Artifact findExistingElementAddition(NamedElement namedElement,ElementAddition difference,String type){
	  // scan all existing artifacts for match
		for(Artifact artifact:getArtifactChanges(namedElement,type)){
			if(isExistingElementAddition(artifact,difference,type)){
				return artifact;
			}
		}
		return null;
	}
protected Realization findExistingTagValueModification(NamedElement namedElement,TagValueModification difference,String type){
	for(Realization realization:getSupplierChanges(namedElement,type)){
		if(isExistingTagValueModification(realization,difference,type)){
			return realization;
		}
	}
	return null;
}
protected Realization findExistingElementModification(NamedElement namedElement,ElementModification difference,String type){
	for(Realization realization:getSupplierChanges(namedElement,type)){
		if(isExistingElementModification(realization,difference,type)){
			return realization;
		}
	}
	return null;
}
protected Realization findExistingElementDeletion(NamedElement namedElement,ElementDeletion difference,String type){
	for(Realization realization:getSupplierChanges(namedElement,type)){
		if(isExistingElementDeletion(realization,difference,type)){
			return realization;
		}
	}
	return null;
}
protected Realization findExistingStereotypeModification(NamedElement namedElement,StereotypeModification difference,String type){
	for(Realization realization:getSupplierChanges(namedElement,type)){
		if(isExistingStereotypeModification(realization,difference,type)){
			return realization;
		}
	}
	return null;
}
////////////////////////////TODO:   parameterize values?; elaborate following; transform???
/// Realization: use mapping language/body for name/value
/// Artifact: ownedRule/specification->OpaqueExpression for name/value
protected boolean isExistingElementAddition(Artifact realization,ElementAddition difference,String type){
	boolean result=difference.getElementID().equals(realization.getFileName());
	if(result){
		getAllArtifacts().remove(realization);
	}
	return result;
}
protected boolean isExistingElementDeletion(Realization realization,ElementDeletion difference,String type){
	boolean result=true;
	if(result){
		getAllRealizations().remove(realization);
	}
	return result;
}
protected boolean isEqual(String arg1,String arg2){
	if(arg1==arg2)return true;
	if((arg1==null)||(arg2==null))return false;
	return arg1.equals(arg2);
}
protected void setMappingValue(Realization realization,String body,String language){
	if((body==null)||(language==null))return;
	OpaqueExpression opaqueExpression=realization.getMapping();
	if(opaqueExpression==null){
		opaqueExpression=getTargetElementsFactory().createOpaqueExpressionInstance();
		realization.setMapping(opaqueExpression);
	}
	List<String> languages=opaqueExpression.getLanguage();
	List<String> bodies=opaqueExpression.getBody();
	bodies.add(body);
	languages.add(language);
}

protected boolean isExistingModification(Realization realization,ModificationInfo modificationInfo){
	boolean result=true;
	// changedPropertyName, value, kind, order, index
	String existingValue=ChangelogUtility.getValue(realization);
	String existingKind=ChangelogUtility.getKind(realization);
	String existingOrder=ChangelogUtility.getOrder(realization);
	String existingIndex=ChangelogUtility.getIndex(realization);
	if(!isEqual(getValue(modificationInfo),existingValue))result=false;
	else if(!isEqual(getKind(modificationInfo),existingKind))result=false;
	else if(!isEqual(getOrder(modificationInfo),existingOrder))result=false;
	else if(!isEqual(getIndex(modificationInfo),existingIndex))result=false;
	return result;
}
protected void setChangedPropertyName(Realization realization,String changedPropertyName){
	setMappingValue(realization,changedPropertyName,"changedPropertyName");
}
protected void setValue(Realization realization,ModificationInfo modificationInfo){
	setMappingValue(realization,getValue(modificationInfo),"value");
}
protected void setKind(Realization realization,ModificationInfo modificationInfo){
	setMappingValue(realization,getKind(modificationInfo),"kind");
}
protected void setOrder(Realization realization,ModificationInfo modificationInfo){
	setMappingValue(realization,getOrder(modificationInfo),"order");
}
protected void setIndex(Realization realization,ModificationInfo modificationInfo){
	setMappingValue(realization,getIndex(modificationInfo),"index");
}

protected void setTVPropertyID(Realization realization,String TVPropertyID){
	setMappingValue(realization,TVPropertyID,"TVPropertyID");
}

protected void setModification(Realization realization,ModificationInfo modificationInfo){
	// changedPropertyName, value, kind, order, index
	setValue(realization,modificationInfo);
	setKind(realization,modificationInfo);
	setOrder(realization,modificationInfo);
	setIndex(realization,modificationInfo);
}

protected boolean isExistingElementModification(Realization realization,ElementModification difference,String type){
	boolean result=true;
	// changedPropertyName, value, kind, order, index
	String existingChangedPropertyName=ChangelogUtility.getChangedPropertyName(realization);
	if(!isEqual(difference.getChangedPropertyName(),existingChangedPropertyName))result=false;
	else{
		ModificationInfo modificationInfo=difference.getModificationInfo();
		result=isExistingModification(realization,modificationInfo);
	}
	if(result){
		getAllRealizations().remove(realization);
	}
	return result;
}
protected boolean isExistingTagValueModification(Realization realization,TagValueModification difference,String type){
	boolean result=true;
	String existingTVPropertyID=ChangelogUtility.getTVPropertyID(realization);
	if(!isEqual(difference.getTVPropertyID(),existingTVPropertyID))result=false;
	else{

	ModificationInfo modificationInfo=difference.getModificationInfo();
	result=isExistingModification(realization,modificationInfo);
	}
	if(result){
		getAllRealizations().remove(realization);
	}
	return result;
}
protected boolean isExistingStereotypeModification(Realization realization,StereotypeModification difference,String type){
	boolean result=true;
	ModificationInfo modificationInfo=difference.getModificationInfo();
	result=isExistingModification(realization,modificationInfo);
	if(result){
		getAllRealizations().remove(realization);
	}
	return result;
}
//////////////////////////////////
// value, kind, order, index
protected String getIndex(ModificationInfo info){
	if(PrimitiveMultiValueModificationInfo.class.isInstance(info)){
		PrimitiveMultiValueModificationInfo modInfo=(PrimitiveMultiValueModificationInfo)info;
		return new Integer(modInfo.getIndex()).toString();
	}
	return null;
}
protected String getOrder(ModificationInfo info){
	if(GenericOrderModificationInfo.class.isInstance(info)){
		GenericOrderModificationInfo modInfo=(GenericOrderModificationInfo)info;
		if(modInfo.getOrder()!=null)
		return modInfo.getOrder().toString();
	}
	return null;
}
protected String getValue(ModificationInfo info){
	if(ReferenceModificationInfo.class.isInstance(info)){
		ReferenceModificationInfo modInfo=(ReferenceModificationInfo)info;
		return modInfo.getValue();
	}
	else if(ValueModificationInfo.class.isInstance(info)){
		ValueModificationInfo modInfo=(ValueModificationInfo)info;
		if(modInfo.getValue()!=null)
			return modInfo.getValue().toString();
	}
	return null;
}
protected String getKind(ModificationInfo info){
	if(ValueModificationInfo.class.isInstance(info)){
		ValueModificationInfo modInfo=(ValueModificationInfo)info;
		if(modInfo.getModificationKind()!=null)
		return modInfo.getModificationKind().name();
	}
	return null;
}

protected String getModificationInfo(ModificationInfo info){
	if(ChangeOwnerInfo.class.isInstance(info)){
		ChangeOwnerInfo modInfo=(ChangeOwnerInfo)info;
		return "value="+modInfo.getValue()+", kind="+modInfo.getModificationKind();
		/*
	}else if(GenericOrderModificationInfo.class.isInstance(info)){
		ChangeOwnerInfo modInfo=(ChangeOwnerInfo)info;
		return modInfo.getValue()+", "+modInfo.getModificationKind();
	    */
		   //OrderModificationInfo, PrimitiveMultiValueModificationInfo, PrimitiveValueModificationInfo, ReferenceModificationInfo, ValueModificationInfo, ValueOrderModificationInfo
	}else if(OrderModificationInfo.class.isInstance(info)){
		OrderModificationInfo modInfo=(OrderModificationInfo)info;
		return "order="+modInfo.getOrder().toString();
	}else if(PrimitiveMultiValueModificationInfo.class.isInstance(info)){
		PrimitiveMultiValueModificationInfo modInfo=(PrimitiveMultiValueModificationInfo)info;
		return "value="+modInfo.getValue()+", kind="+modInfo.getModificationKind()+", index="+modInfo.getIndex();
	}else if(PrimitiveValueModificationInfo.class.isInstance(info)){
		PrimitiveValueModificationInfo modInfo=(PrimitiveValueModificationInfo)info;
		return "value="+modInfo.getValue()+", kind="+modInfo.getModificationKind();
	}else if(ReferenceModificationInfo.class.isInstance(info)){
		ReferenceModificationInfo modInfo=(ReferenceModificationInfo)info;
		return "value="+modInfo.getValue()+", kind="+modInfo.getModificationKind();
		/*
	}else if(ValueModificationInfo.class.isInstance(info)){
		ValueModificationInfo modInfo=(ValueModificationInfo)info;
		return modInfo.getValue()+", "+modInfo.getModificationKind();
		*/
	}else if(ValueOrderModificationInfo.class.isInstance(info)){
		ValueOrderModificationInfo modInfo=(ValueOrderModificationInfo)info;
		return "order="+modInfo.getOrder().toString();
		
	}
	return "";
}
	  private static ProjectDescriptor getProjectDescriptor(File sourceFile)
	  {
	    return ProjectDescriptorsFactory.createProjectDescriptor(sourceFile.toURI());
	  }
	  private static class SimpleErrorHandler implements ErrorHandler<Exception>
	  {
	    @Override
	    public void error(Exception ex) throws Exception
	    {
	      // just print stack trace
	      ex.printStackTrace();
	    }
	  }
		static protected Usage createModelPackageDescriptionFileChangelog(Component mpd,Package changelog,Project project) {
			Usage niemType = Application.getInstance().getProject().getElementsFactory().createUsageInstance();
			// apply stereotype, set tags, set default name, etc.
			Stereotype stereotype=ChangelogUtility.getMpdStereotype(ModelPackageDescriptionFileStereotypeName,project);
			NIEMHelper.addStereotype(niemType,stereotype);
			Profile mpdProfile=ChangelogUtility.getMpdProfile(project);
			Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,changelogLiteralName);
			EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xmlLiteralName);
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,natureCodeTagName,defaultNature);
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,purposeCodeTagName,defaultPurpose);
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,relativePathNameTagName,"");
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"Serves the purpose of a change log.");
			mpd.getPackagedElement().add(niemType);
			niemType.getClient().add(mpd);
			niemType.getSupplier().add(changelog);
			return niemType;
		}
	
////////////////////////////////////////////////////////////////
		static public DiagramPresentationElement createDiagram(Package model,Project project,String suffix) throws ReadOnlyElementException{
			// check if we already have a diagram
			for(Diagram diagramTest:model.getOwnedDiagram()){
				if(model.getName().equals(diagramTest.getName())){
					DiagramPresentationElement dpe=project.getDiagram(diagramTest);
					dpe.open();
					return dpe;
					
				}
			}
			Diagram diagram= ModelElementsManager.getInstance().createDiagram(DiagramTypeConstants.UML_CLASS_DIAGRAM, model);
			diagram.setName(model.getName());
			DiagramPresentationElement dpe=project.getDiagram(diagram);
			dpe.open();
			dpe.addProperty(Psm2PimAction.ownerDisplayProperty);
			//Psm2PimAction.element2presentation.clear();
			return dpe;
		}
//		public static BooleanProperty showInnerElementsListProperty=new BooleanProperty("Show Inner Elements List",true);
		public static BooleanProperty showInnerElementsListProperty=new BooleanProperty(PropertyID.SHOW_ELEMENTS_LIST,true);

		static public void createChangelogDiagram(Package model,Project project,PresentationElement pe) throws ReadOnlyElementException{
			if(project==null){
				QvtCommonAction.log("ERROR: Changelog Failed to create diagram, lost current project");
				return;
			}
			if(model==null){
				QvtCommonAction.log("ERROR: Changelog Failed to create diagram, lost changelog package");
				return;
			}
			DiagramPresentationElement dpe=null;
			Set<PresentationElement> newElements=new HashSet<PresentationElement>();
			Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
			DiagramPresentationElement diagram=null;
			Set<PresentationElement> mpdnewElements=new HashSet<PresentationElement>();
			Map<Element,PresentationElement> mpdelement2presentation=new HashMap<Element,PresentationElement>();
			
			 boolean isSessionCreated=NIEMHelper.createSession("changelog.diagram");			
			try{
				// if presentation element contains <<MPD>>, then add changelog and <<MPDFile>> to that diagram
				if(DiagramPresentationElement.class.isInstance(pe)){
					diagram=(DiagramPresentationElement)pe;
				}
				else if (pe!=null) {
					diagram=pe.getDiagramPresentationElement();
				}
				if(diagram!=null){
					for(Dependency realization:model.getSupplierDependency()){
						if(NIEMHelper.isModelPackageDescriptionFile(realization))
						for(NamedElement supplier:realization.getClient()){
							if(!NIEMHelper.isModelPackageDescription(supplier))continue;
							PresentationElement specificPE=PresentationElementUtility.getPresentationElement(diagram,supplier,mpdelement2presentation,mpdnewElements);
							if(specificPE==null)continue;
							PresentationElement supplierPE=PresentationElementUtility.getPresentationElement(diagram,model,mpdelement2presentation,mpdnewElements);
							if(supplierPE==null){
								QvtCommonAction.log("ERROR: Failed to get presentation element for "+model.getQualifiedName());
								continue;
							}
							PresentationElement pathElement=PresentationElementUtility.getPathPresentationElement(diagram, specificPE, supplierPE,realization,mpdelement2presentation,mpdnewElements);
							if(pathElement==null){
								QvtCommonAction.log("ERROR: Failed to create path element for "+realization.getQualifiedName()+" from "+supplier.getQualifiedName()+" to "+model.getQualifiedName());
								continue;
							}
							pathElement.setSelected(false);
						}
					}
					
				}
				
				
				dpe= createDiagram(model,project,"");
				for(Comment comment:model.getOwnedComment()){
					PresentationElement artifactPE=PresentationElementUtility.getPresentationElement(dpe,comment,element2presentation,newElements);
					if(artifactPE==null){
						QvtCommonAction.log("ERROR: Changelog Failed to get presentation element for comment of "+model.getQualifiedName());
						continue;
					}
					
				}
				// for each nestedPackage, do the realizations and embedded artifacts
				for(Package nestedPackage:model.getNestedPackage()){
						PresentationElement specificPE=PresentationElementUtility.getPresentationElement(dpe,nestedPackage,element2presentation,newElements);
						if(specificPE==null){
							QvtCommonAction.log("ERROR: Failed to get presentation element for "+nestedPackage.getQualifiedName());
							continue;
						}
						/*
						for(com.nomagic.magicdraw.properties.Property displayProperty:specificPE.getPropertyManager().getProperties()){
							QvtCommonAction.log("displayProperty "+displayProperty.getName()+", "+displayProperty.getValue());
							
						}
						*/
						specificPE.addProperty(showInnerElementsListProperty);

						for(PackageableElement artifact:nestedPackage.getPackagedElement()){
							if(!Artifact.class.isInstance(artifact))continue;
							PresentationElement artifactPE=PresentationElementUtility.getPresentationElement(dpe,artifact,element2presentation,newElements);
							if(artifactPE==null){
								QvtCommonAction.log("ERROR: Failed to get presentation element for "+artifact.getQualifiedName());
								continue;
							}
							
						}
						
						for(Dependency realization:nestedPackage.getClientDependency()){
							for(NamedElement supplier:realization.getSupplier()){
								PresentationElement supplierPE=PresentationElementUtility.getPresentationElement(dpe,supplier,element2presentation,newElements);
								if(supplierPE==null){
									QvtCommonAction.log("ERROR: Failed to get presentation element for "+supplier.getQualifiedName());
									continue;
								}
								PresentationElement pathElement=PresentationElementUtility.getPathPresentationElement(dpe, specificPE, supplierPE,realization,element2presentation,newElements);
								if(pathElement==null){
									QvtCommonAction.log("ERROR: Failed to create path element for "+realization.getQualifiedName()+" from "+nestedPackage.getQualifiedName()+" to "+supplier.getQualifiedName());
									continue;
								}
								pathElement.setSelected(false);
							}
						}
				}
						} catch (Throwable eee) {
							eee.printStackTrace();
							QvtCommonAction.log("ERROR during changelog diagram gen "+" : "+eee);
						}finally{
							  // apply changes and add command into command history.
							NIEMHelper.closeSession(isSessionCreated);
						}

			//Psm2PimAction.layout(dpe);
			SubsetDialogHelper.layoutNewItems(dpe, newElements);
			if((diagram!=null)&&(mpdnewElements.size()>0)){
				SubsetDialogHelper.layoutNewItems(diagram, mpdnewElements);
			}
	}
		
}
