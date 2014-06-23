/**
 * 
 */
package org.modeldriven.magicdraw.niem.rule;

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
import org.modeldriven.magicdraw.niem.validate.NameHelper;

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
import com.nomagic.magicdraw.ui.dialogs.specifications.SpecificationDialogManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.DiagramTypeConstants;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.validation.ValidationSuiteHelper;
import com.nomagic.magicdraw.validation.ui.ValidationSuitesDlg;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageImport;
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
 * business rule suite.
 * containing package is business-rules
 * suite represented by <<activeValidationSuite>>
 * has <<ModelPackageDescriptionFile>> from <<ModelPackageDescription>> Component
 * has packageImport for top level editable model
 * bring up some form of validation suite dialog: a specification or ...
 * 
 * The suite will be provisioned as schematron (*.sch)
 * 
 *    
 * @author tom
 *
 */
public class BusinessRuleSuite implements NIEM_ProfileConstants,ToolTipConstants{
	static protected BusinessRuleSuite INSTANCE=new BusinessRuleSuite();
	public static void addBusinessRuleSuiteAction(MDMenuAction category,String niemGroupName){
		// businessSuite, if it does not already exist
		Package businessRuleSuitePackage=NIEMHelper.getBusinessRuleSuite();
		if(businessRuleSuitePackage!=null)return;
		if(QvtCommonAction.getMpdComponent()==null)return;

		MDAction testAction=new DefaultDiagramAction("addBusinessRuleSuite","add Business Rule Suite",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				try {
					BusinessRuleSuite.INSTANCE.createBusinessRuleSuite();
				} catch (ReadOnlyElementException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(ADD_BUSINESS_RULE_SUITE_ACTION_TOOLTIP);
		category.addAction(testAction);
	}
	  protected void createBusinessRuleSuite() throws ReadOnlyElementException
	  {
			Application application=Application.getInstance();
			Project targetProject=application.getProject();
		    Component mpd=QvtCommonAction.getMpdComponent();
		    if(mpd==null)return;
		    Package mpdTopLevel=NIEMHelper.getNearestAppliedProfilePackage(mpd);
		    if(mpdTopLevel==null)return;
		    ElementsFactory targetElementsFactory=targetProject.getElementsFactory();
	    boolean isSessionCreated=NIEMHelper.createSession("businessRuleSuite");
	    try{
	    	// create the business-rules package, if necessary
	    	Package businessRulesPackage=null;
	    	for(PackageableElement packagedElement:mpdTopLevel.getPackagedElement()){
	    		if((packagedElement instanceof Package)&&(businessRulesPackageName.equals(packagedElement.getName()))){
	    			businessRulesPackage=(Package)packagedElement;
	    			break;
	    		}
	    	}
	    	if(businessRulesPackage==null){
	    		businessRulesPackage=targetElementsFactory.createPackageInstance();
	    		businessRulesPackage.setName(businessRulesPackageName);
	    		mpdTopLevel.getPackagedElement().add(businessRulesPackage);
	    	}
	    // lets make the business rule suite package now; apply stereotype, hook up to mpd and packageImport
	    Package businessRuleSuitePackage=targetElementsFactory.createPackageInstance();
	    businessRulesPackage.getPackagedElement().add(businessRuleSuitePackage);
	    businessRuleSuitePackage.setName(NameHelper.getUniquePackageName(businessRuleSuitePackage, businessRuleSuitePackageName, ""));
	    // TODO: apply <<activeValidationSuite>>
	    StereotypesHelper.addStereotypeByString(businessRuleSuitePackage,"activeValidationSuite");
	    
	    // hook it up with mpd via mpdfile, set nature/purpose
	    Usage mpdFile=createModelPackageDescriptionFileChangelog( mpd, businessRuleSuitePackage);
	    // package import for rule scope
	    PackageImport businessRuleSuitePackageImport=targetElementsFactory.createPackageImportInstance();
	    businessRuleSuitePackageImport.setImportedPackage(mpdTopLevel);
	    businessRuleSuitePackageImport.setImportingNamespace(businessRuleSuitePackage);
	    Application.getInstance().getMainFrame().getBrowser().getContainmentTree().openNode(businessRuleSuitePackage,true,true,true);
	    }finally{
	    	NIEMHelper.closeSession(isSessionCreated);
	    }
	    // bring up a dialog for editing
	    // ActionsID.OPEN_VALIDATION_OPTIONS 
		 //SpecificationDialogManager.getManager().editSpecification(instanceSpecification) ;				

	    //ValidationSuiteHelper.
		 Frame frame=Application.getInstance().getMainFrame();
		 ValidationSuitesDlg validationSuitesDlg=new ValidationSuitesDlg(frame);
		 validationSuitesDlg.init();
		 validationSuitesDlg.show();
		 //Validation
	  }
	  
		static protected Usage createModelPackageDescriptionFileChangelog(Component mpd,Package businessRuleSuite) {
			return NIEMHelper.createModelPackageDescriptionFile(mpd, businessRuleSuite, schematronLiteralName, business_rulesLiteralName, "Serves the purpose of specifying business rules applied to this IEPD.");
		}
	
////////////////////////////////////////////////////////////////
		
}
