/**
 * 
 */
package org.modeldriven.magicdraw.niem.definition;

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
 * definition refresh
 * Refresh all MPD subset model components with definitions from reference model component definition counterparts
 * As required by NDR:
 * Neither constraint schemas nor subset schemas serve as the primary (cardinal) definitions for components they define. 
 * The primary definitions come from reference schemas, exchange schemas, and extension schemas.
 *    
 * @author tom
 *
 */
public class Definition implements NIEM_ProfileConstants,ToolTipConstants{
	// it may also be possible to do this while provisioning
	static public Definition INSTANCE=new Definition();
	/* make this part of provisioning instead of an action
	public void refreshSubsetDefinitionsAction(MDMenuAction category,final PresentationElement pe,final Package browserPackage,String niemGroupName){
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
		
		MDAction testAction=new DefaultDiagramAction("refreshSubsetDefinitions","refresh all MPD Subset Data Definitions",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				Definition.INSTANCE.refreshSubsetDefinitions(pe, browserPackage);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("comment"));
		testAction.setDescription(REFRESH_SUBSET_DEFINITIONS_ACTION_TOOLTIP);
		category.addAction(testAction);
	}
	*/
	
	public void refreshSubsetDefinitions(){
		Application application=Application.getInstance();
		//Project targetProject=application.getProject();
	    Component mpd=QvtCommonAction.getMpdComponent();
	    if(mpd==null)return;
	    Package mpdTopLevel=NIEMHelper.getNearestAppliedProfilePackage(mpd);
	    if(mpdTopLevel==null)return;
	    boolean isSessionCreated=NIEMHelper.createSession("refreshDefinitions");
	    try{
		    // recursively refreshPackages, <<InformationModel>>s, Classiiers, Properties
	    	refreshPackageDefinitions(mpdTopLevel);
	    }finally{
	    	NIEMHelper.closeSession(isSessionCreated);
	    }
	}
	public void refreshPackageDefinitions(Package aPackage){
		    // recursively refreshPackages, <<InformationModel>>s, Classifiers, Properties, Literals
		for(Package subPackage:aPackage.getNestedPackage()){
			if(NIEMHelper.isInformationModel(subPackage)){
				boolean isConstraint=NIEMHelper.isInformationModelDefaultPurposeConstraint(subPackage);
				if(isConstraint)continue;// ignore constraint model
				Package referenceInformationModel=NIEMHelper.getReferencesReferenceModelInformationModel(subPackage);
				if(referenceInformationModel==null)continue;
				refreshInformationModelDefinitions(subPackage,referenceInformationModel);
			}else{
				refreshPackageDefinitions(subPackage);
			}
		}
	}
	protected void refreshInformationModelDefinitions(Package subsetInformationModel,Package referenceInformationModel){
	    // update the <<InformationModel>> comment;
		updateComment(subsetInformationModel,referenceInformationModel);
		// process content (may have packages, <<PropertyHolder>>, <<Choice>>, as well as Classifiers)
		for(Element subElement:subsetInformationModel.getOwnedElement()){
			refreshElementDefinitions(subElement);
		}
}
	protected void refreshElementDefinitions(Element subsetElement){
		Element referenceElement=null;
		if(
				(subsetElement instanceof Classifier)
				&&!(NIEMHelper.isPropertyHolder(subsetElement)||NIEMHelper.isChoice((Classifier)subsetElement))
			){
			referenceElement=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier((Classifier)subsetElement);
		}
		else if(
				(subsetElement instanceof Property)
				&&(((Property)subsetElement).isNavigable())
			){
			referenceElement=NIEMHelper.getReferenceProperty((Property)subsetElement);
			// if subsetProperty is not in a PropertyHolder, but there is a subset property holder, then use that
			if(!NIEMHelper.isPropertyHolder(subsetElement.getOwner())){
				Property test=NameHelper.getSubsetPropertyHolderProperty((Property)subsetElement);
				if(test!=null){
					referenceElement=test;
				}
			}
		}
		else if(
				(subsetElement instanceof EnumerationLiteral)
				&&(subsetElement.getOwner() instanceof Enumeration)
			){
		    // update the comment;
			//updateComment(subsetElement,referenceElement);
			referenceElement=NIEMHelper.getReferencesEnumerationLiteralForSubsetEnumerationLiteral((EnumerationLiteral)subsetElement);
		}
		if(referenceElement!=null){
		    // update the comment;
			updateComment(subsetElement,referenceElement);
		}
		// process content (may have packages, <<PropertyHolder>>, <<Choice>>, as well as Classifiers)
		if((subsetElement instanceof Enumeration)&&(referenceElement instanceof Enumeration)){
			// get reference model literals
			Map<String,EnumerationLiteral> referenceLiteralMap=new HashMap<String,EnumerationLiteral>();
			for(EnumerationLiteral referenceLiteral:((Enumeration)referenceElement).getOwnedLiteral()){
				referenceLiteralMap.put(referenceLiteral.getName(), referenceLiteral);
			}
			for(EnumerationLiteral subsetLiteral:((Enumeration)subsetElement).getOwnedLiteral()){
				EnumerationLiteral referenceLiteral=referenceLiteralMap.get(subsetLiteral.getName());
				if(referenceLiteral!=null){
					updateComment(subsetLiteral,referenceLiteral);
				}
			}
			for(Element subElement:((Enumeration)subsetElement).getOwnedAttribute()){
				refreshElementDefinitions(subElement);
			}
		}else if ((subsetElement instanceof Classifier)
				||(subsetElement instanceof Package)
				){
			for(Element subElement:subsetElement.getOwnedElement()){
				refreshElementDefinitions(subElement);
			}
		}
}
	protected void updateComment(Element subset,Element reference){
		if(reference.getOwnedComment().isEmpty())return;
		Comment subsetComment=null;
		for(Comment subsetCommentTest:subset.getOwnedComment()){
			subsetComment=subsetCommentTest;
			break;
		}
		if(subsetComment==null){
		    subsetComment=NIEMHelper.addComment(subset);
		}
		for(Comment referenceComment:reference.getOwnedComment()){
			String referenceBody=referenceComment.getBody();
			if(referenceBody==null)continue;
			String subsetBody=subsetComment.getBody();
			if(referenceBody.equals(subsetBody))break;
			QvtCommonAction.log("updated subset "+((NamedElement)subset).getQualifiedName()+" comment from \""+subsetBody+"\" to \""+referenceBody+"\"");
			subsetComment.setBody(referenceBody);
			break;
		}
	}
}
