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
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;

/**
 * @author tom
 *
 */
public class AddSubsetEnumerationLiteralAction extends AddSubsetClassifierAction {

	public AddSubsetEnumerationLiteralAction() {
		super("ADD_SUBSET_ENUMERATION_LITERAL","Add Subset EnumerationLiteral");
		setDescription(LUCENE_ADD_SUBSET_ENUMERATION_LITERAL_ACTION_TOOLTIP);
	}
	public void actionPerformed(ActionEvent actionEvent)
	{
		BaseElement baseElement=getFirstElement();
		if(EnumerationLiteral.class.isInstance(baseElement)){
			// add the subset Property, Classifier (and namespace if required)
			EnumerationLiteral referenceProperty=(EnumerationLiteral)baseElement;
			Package referenceModel=NIEMHelper.getNearestInformationModel(referenceProperty);
			if(referenceModel==null)return;
			// add the subset Classifier (and namespace if required)
			 boolean isSessionCreated=NIEMHelper.createSession("searchAddSubsetEnumerationLiteral");
			 try{
				 EnumerationLiteral subsetProperty=findOrCreateSubsetEnumerationLiteral(referenceProperty);
			 }finally{
		  // apply changes and add command into command history.
				 NIEMHelper.closeSession(isSessionCreated);
			 }
				updateNewElement();
		}
	}
	protected EnumerationLiteral findOrCreateSubsetEnumerationLiteral(EnumerationLiteral referenceProperty){
		EnumerationLiteral subsetEnumerationLiteral=findSubsetEnumerationLiteral( referenceProperty);
		if(subsetEnumerationLiteral!=null)return subsetEnumerationLiteral;
		Classifier referenceClassifier=referenceProperty.getEnumeration();
		if(referenceClassifier==null)return null;
		Classifier subsetClassifier=findOrCreateSubsetClassifier(referenceClassifier);
		if(subsetClassifier==null)return null;
		if(!Enumeration.class.isInstance(subsetClassifier))return null;
		subsetEnumerationLiteral=NameHelper.addEnumerationLiteral(referenceProperty,(Enumeration)subsetClassifier);
		 if(subsetEnumerationLiteral!=null){
	 	 		QvtCommonAction.log("created subsetEnumerationLiteral "+subsetEnumerationLiteral.getQualifiedName());
		 		setNewElement(subsetEnumerationLiteral);
	 		 }
    	 return subsetEnumerationLiteral;
	}
	
	public void updateState()
	{
		BaseElement baseElement=getFirstElement();
		// enabled if element exists in model and there is an mpd component and subset does not already exist
		Boolean enabled=(baseElement!=null)&&(EnumerationLiteral.class.isInstance(baseElement));
		if(enabled){
			EnumerationLiteral subsetEnumerationLiteral=findSubsetEnumerationLiteral((EnumerationLiteral)baseElement);
			enabled=subsetEnumerationLiteral==null;
		}
	    setEnabled(enabled);
		
	}	
	protected EnumerationLiteral findSubsetEnumerationLiteral(EnumerationLiteral referenceEnumerationLiteral){
		Classifier referenceClassifier=referenceEnumerationLiteral.getEnumeration();
		Classifier subsetClassifier=findSubsetClassifier(referenceClassifier);
		if(Enumeration.class.isInstance(subsetClassifier)){
			return NameHelper.getSubsetEnumerationLiteral( referenceEnumerationLiteral, (Enumeration)subsetClassifier);
		}
		return null;
	}
	
}
