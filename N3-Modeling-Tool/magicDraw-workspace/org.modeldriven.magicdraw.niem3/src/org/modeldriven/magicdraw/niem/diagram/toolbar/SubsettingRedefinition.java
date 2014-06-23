package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.util.List;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;

public class SubsettingRedefinition {
	public static SubsettingRedefinition INSTANCE=new SubsettingRedefinition();
	protected SubsettingRedefinition(){}
    public void resequenceClassifierSubsetProperties(Classifier subsetClassifier){
     	if(subsetClassifier==null)return;
		Classifier referenceClassifier=NIEMHelper.getReferencesReferenceModelClassifier(subsetClassifier);
		resequenceClassifierProperties(subsetClassifier,referenceClassifier);
     }
    public void resequenceSubsetProperties(Property subsetProperty){
    	if(subsetProperty==null)return;
     	//Property referenceProperty=getReferenceProperty(subsetProperty);
    	//if(referenceProperty==null)return;
     	// check sequence: prior property in subset must correspond to A prior property in reference
 		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
    	if(subsetClassifier==null)return;
    	resequenceClassifierSubsetProperties(subsetClassifier);
    }
    protected Property getReferenceProperty(Property orderedSubsetProperty,Classifier referenceClassifier){
    	return NIEMHelper.getReferenceProperty(orderedSubsetProperty);
    }
    protected List<Property> getOrderedReferenceProperties(Classifier referenceClassifier){
    	return NIEMHelper.getOrderedProperties(referenceClassifier);
    }
    public void resequenceClassifierProperties(Classifier subsetClassifier,Classifier referenceClassifier){
      	if(subsetClassifier==null)return;
      	if(NIEMHelper.isPropertyHolder(subsetClassifier))return;
     	if(referenceClassifier==null)return;
//if(true)return;// TODO test
      	List<Property> subsetProperties=NIEMHelper.getOrderedProperties(subsetClassifier);
      	List<Property> referenceProperties=getOrderedReferenceProperties(referenceClassifier);
      	List<Property> orderedSubsetProperties=new Vector<Property>();
      	
      	//System.out.println("resequenceClassifierProperties start "+referenceProperties+", "+subsetProperties);
      	for(Property orderedReferenceProperty:referenceProperties){
          	for(Property orderedSubsetProperty:subsetProperties){
              	Property orderedReferencePropertyTest=getReferenceProperty(orderedSubsetProperty,referenceClassifier);
              	if(orderedReferenceProperty.equals(orderedReferencePropertyTest)){
              		orderedSubsetProperties.add(orderedSubsetProperty);
              	}
          	}
      	}
      	//System.out.println("resequenceClassifierProperties "+subsetClassifier.getQualifiedName()+", "+referenceClassifier.getQualifiedName());
      	// some properties may be cleared by this action
      	// remove properties which were not matched
      	for(Property orderedSubsetProperty:new Vector<Property>(subsetProperties)){
      		if(orderedSubsetProperties.contains(orderedSubsetProperty))continue;
      		// remove the property
      		QvtCommonAction.log("WARNING: Property remove during resequence: "+orderedSubsetProperty.getQualifiedName());
      		System.out.println("WARNING: Property remove during resequence: "+orderedSubsetProperty.getQualifiedName()+", "+orderedSubsetProperty.getClientDependency());
      		NIEMHelper.removeElement(orderedSubsetProperty);
      		
      	}
      	// this is not the actual property list anymore...............
      	NIEMHelper.clearOrderedProperties(subsetClassifier);
      	NIEMHelper.addAllOrderedProperties(subsetClassifier, orderedSubsetProperties);
      }
	
}
