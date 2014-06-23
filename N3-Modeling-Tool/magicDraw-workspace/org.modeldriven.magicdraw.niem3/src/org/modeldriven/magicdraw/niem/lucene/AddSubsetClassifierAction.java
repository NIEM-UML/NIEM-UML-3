/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.JTree;
import javax.swing.tree.TreePath;

import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.SubsettingRedefinition;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.ContainmentTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;

/**
 * @author tom
 *
 */
public class AddSubsetClassifierAction extends ContainmentTreeSelectionAction {

	public AddSubsetClassifierAction() {
		super("ADD_SUBSET_CLASSIFIER","Add Subset Classifier");
		setDescription(LUCENE_ADD_SUBSET_CLASSIFIER_ACTION_TOOLTIP);
	}
	protected AddSubsetClassifierAction(String id,String name) {
		super(id,name);
		
	}
	protected Set<Package> getSubsetContexts(){
		 Component mpd=getMpdComponent();
			Set<Package> subsetContexts=new HashSet<Package>();
		 if(mpd==null){
				QvtCommonAction.log("getSubsetContexts failed to locate <<ModelPackageDescription>> ");
			 return subsetContexts;
		 }
		Set<Package> informationModels=NIEMHelper.getModelPackageDescriptionInformationModels(mpd);
		for(Package informationModel:informationModels){
			if(NIEMHelper.isInformationModelDefaultPurposeConstraint(informationModel))continue;
			subsetContexts.add(informationModel);
		}
		return subsetContexts;
	}
	protected Package findSubsetModel(Package referenceModel){
		return NameHelper.findSubsetPackage(referenceModel, getSubsetContexts());
	}
	protected Package findOrCreateSubsetModel(Package referenceModel){
		Package subsetModel=findSubsetModel(referenceModel);
		if(subsetModel!=null)return subsetModel;
		//QvtCommonAction.log("findOrCreateSubsetModel subsetContexts "+getSubsetContexts());
		for(Package subsetContext:getSubsetContexts()){
			subsetModel= NameHelper.findOrCreateSubsetPackage(referenceModel,subsetContext);
			if(subsetModel==null)continue;
			QvtCommonAction.log("create subsetModel "+subsetModel.getQualifiedName()+", from reference "+referenceModel.getQualifiedName()+", in context "+subsetContext.getQualifiedName());
			return subsetModel;
		}
		QvtCommonAction.log("failed to find or create subsetModel  from reference "+referenceModel.getQualifiedName());
		return null;
	}
	protected Classifier findOrCreateSubsetClassifier(Classifier referenceClassifier){
		Package referenceModel=NIEMHelper.getNearestInformationModel(referenceClassifier);
		if(referenceModel==null)return null;
		Package subsetModel=findOrCreateSubsetModel(referenceModel);
		//QvtCommonAction.log("findOrCreateSubsetClassifier "+referenceModel+", "+subsetModel);
		if(subsetModel==null)return null;
		// make Classifiers within the package
    	 Type newType=NameHelper.getSubsetClassifier(referenceClassifier,subsetModel);
    	 if(newType==null){
    		 newType=NameHelper.addClassifier(referenceClassifier,subsetModel);
    		 if(newType!=null){
    	 		QvtCommonAction.log("created newType "+newType.getQualifiedName());
    	 		setNewElement(newType);
    		 }else{
     	 		QvtCommonAction.log("failed to create classifier for reference "+referenceClassifier.getQualifiedName()+", and subset model "+subsetModel.getQualifiedName());
    		 }
    	 }
    	 if(Classifier.class.isInstance(newType))return (Classifier)newType;
    	 return null;
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		BaseElement baseElement=getFirstElement();
		if(Classifier.class.isInstance(baseElement)){
			Classifier referenceClassifier=(Classifier)baseElement;
			Package referenceModel=NIEMHelper.getNearestInformationModel(referenceClassifier);
			if(referenceModel==null)return;
			// add the subset Classifier (and namespace if required)
			 boolean isSessionCreated=NIEMHelper.createSession("searchAddSubsetClassifier");
			 try{
				 findOrCreateSubsetClassifier(referenceClassifier);
			 }finally{
		  // apply changes and add command into command history.
				 NIEMHelper.closeSession(isSessionCreated);
			 }
				updateNewElement();
		}
	}
	public void updateState()
	{
		BaseElement baseElement=getFirstElement();
		// enabled if element exists in model and there is an mpd component and subset does not already exist
		Boolean enabled=(baseElement!=null)&&(Classifier.class.isInstance(baseElement));
		if(enabled){
			Classifier subsetClassifier=findSubsetClassifier((Classifier)baseElement);
			enabled=subsetClassifier==null;
		}
	    setEnabled(enabled);
		
	}	
	protected Classifier findSubsetClassifier(Classifier referenceClassifier){
		Package referenceInformationModel=NIEMHelper.getNearestInformationModel(referenceClassifier);
		if(referenceInformationModel==null)return null;
		Package subsetInformationModel=NameHelper.findSubsetPackage(referenceInformationModel, getSubsetContexts());
		if(subsetInformationModel==null)return null;
		Type newType=NameHelper.getSubsetClassifier(referenceClassifier,subsetInformationModel);
		if(Classifier.class.isInstance(newType))return (Classifier)newType;
		return null;
	}
	
}
