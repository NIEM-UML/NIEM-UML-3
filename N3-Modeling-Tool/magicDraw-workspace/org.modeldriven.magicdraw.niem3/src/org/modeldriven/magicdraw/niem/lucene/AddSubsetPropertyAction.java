/**
 * 
 */
package org.modeldriven.magicdraw.niem.lucene;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JTree;
import javax.swing.tree.TreePath;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.SubsettingRedefinition;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.ContainmentTree;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author tom
 *
 */
public class AddSubsetPropertyAction extends AddSubsetClassifierAction {

	public AddSubsetPropertyAction() {
		super("ADD_SUBSET_PROPERTY","Add Subset Property");
		setDescription(LUCENE_ADD_SUBSET_PROPERTY_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		BaseElement baseElement=getFirstElement();
 		//QvtCommonAction.log("AddSubsetProperty entered "+baseElement);
		if(Property.class.isInstance(baseElement)){
			// add the subset Property, Classifier (and namespace if required)
			Property referenceProperty=(Property)baseElement;
			Package referenceModel=NIEMHelper.getNearestInformationModel(referenceProperty);
	 		//QvtCommonAction.log("AddSubsetProperty referenceModel "+referenceModel);
			if(referenceModel==null)return;
			// add the subset Classifier (and namespace if required)
			 boolean isSessionCreated=NIEMHelper.createSession("searchAddSubsetClassifier");
			 try{
				 Property subsetProperty=findOrCreateSubsetProperty(referenceProperty);
			 }finally{
		  // apply changes and add command into command history.
				 NIEMHelper.closeSession(isSessionCreated);
			 }
			updateNewElement();
		}
	}
	protected Property findOrCreateSubsetProperty(Property referenceProperty){
		Property subsetProperty=findSubsetProperty( referenceProperty);
	 	//	QvtCommonAction.log("findOrCreateSubsetProperty entered "+referenceProperty.getQualifiedName()+", "+subsetProperty);
		if(subsetProperty!=null)return subsetProperty;
		Classifier referenceClassifier=referenceProperty.getClassifier();
 		//QvtCommonAction.log("findOrCreateSubsetProperty referenceClassifier "+referenceClassifier);
		if(referenceClassifier==null)return null;
		Classifier subsetClassifier=findOrCreateSubsetClassifier(referenceClassifier);
 		//QvtCommonAction.log("findOrCreateSubsetProperty subsetClassifier "+subsetClassifier);
		if(subsetClassifier==null)return null;
		subsetProperty=NameHelper.addProperty(referenceProperty,subsetClassifier);
		 if(subsetProperty!=null){
 	 		QvtCommonAction.log("created subsetProperty "+subsetProperty.getQualifiedName());
		     SubsettingRedefinition.INSTANCE.resequenceClassifierSubsetProperties(subsetClassifier);
	 		setNewElement(subsetProperty);
 		 }else{
  	 		QvtCommonAction.log("failed to create property for reference "+referenceClassifier.getQualifiedName()+", and subset classifier "+subsetClassifier.getQualifiedName());
 			 
 		 }
    	 return subsetProperty;
	}
	public void updateState()
	{
		BaseElement baseElement=getFirstElement();
		// enabled if element exists in model and there is an mpd component and subset does not already exist
		Boolean enabled=(baseElement!=null)&&(Property.class.isInstance(baseElement));
		if(enabled){
				Property subsetProperty=findSubsetProperty((Property)baseElement);
				enabled=subsetProperty==null;
		}
	    setEnabled(enabled);
		
	}	
	protected Property findSubsetProperty(Property referenceProperty){
		Classifier referenceClassifier=referenceProperty.getClassifier();
		Classifier subsetClassifier=findSubsetClassifier(referenceClassifier);
		if(subsetClassifier==null)return null;
		return NameHelper.getSubsetProperty( referenceProperty, subsetClassifier);
	}
	
}
