package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;

public class ReferencesPropertyDialog extends RestrictionPropertyDialog {

	public ReferencesPropertyDialog(PresentationElement pe,
			Class browserClassifier) {
		super(pe, browserClassifier);
	}
	 protected String getTitle(){
			return("Select References Properties to be added");

		 }
	 
	 protected Collection<Class> getRestrictedClasses(Classifier subsetClassifier){
//		 protected Class getRestrictedClasses(Classifier subsetClassifier){
			 Set<Class> result=new HashSet<Class>();
			 // could be via <<References>> from subsetClassifier;
			 //		or from subsetPackage
			 //		or from properties
			//Class restrictedClass=null;
			// boolean hasExplicityClassifierReferences=false;
			for(Dependency test:subsetClassifier.getClientDependency()){
				if(NIEMHelper.isReferences(test)){
					for(NamedElement supplier:test.getSupplier()){
						if(Class.class.isInstance(supplier)&&NIEMHelper.isInInformationModel(supplier)){
							//restrictedClass=(Class)supplier;
							result.add((Class)supplier);
							//return (Class)supplier;
							//hasExplicityClassifierReferences=true;
						}
					}
				}
			}
			Classifier referenceClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetClassifier);
			if((referenceClassifier!=null)&&Class.class.isInstance(referenceClassifier)){
				result.add((Class)referenceClassifier);
				//return (Class)referenceClassifier;
			}
			return result;
		 }
	
//			protected boolean acceptProperty(Property referenceProperty,
//					Classifier subsetClassifier,
//					Collection<Class> restrictedClassifiers
//					Class referenceClassifier
//					/*,Classifier referenceClassifierTest*/) {
// TODO: this does not appear to be used anymore		 
			protected boolean acceptProperty(Property referenceProperty,
					Classifier subsetClassifier,Collection<Class> referenceModelClassifiers,Classifier referenceClassifierTest) {
				Classifier referenceModelClassifier=NameHelper.getOwningClassifier(referenceProperty);
				if(referenceModelClassifier==null)return false;
//				Classifier referenceClassifierTest=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetClassifier);
//				if(!referenceClassifier.equals(referenceModelClassifier)){
				if(!referenceModelClassifiers.contains(referenceModelClassifier)){
					// check for implicit subset references reference model PropertyHolders
					//Classifier referenceClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetClassifier);
					if(referenceClassifierTest==null){
						return false;
					}
					//	if the tested Property is in a PropertyHolder, but referenceClassifier is not a PropertyHolder
					if(NIEMHelper.isPropertyHolder(referenceModelClassifier)&&!NIEMHelper.isPropertyHolder(referenceClassifierTest)){
						//	  in cases where the property subsetsProperty which is in referenceModel
						if(NameHelper.isPropertyHolderPropertySubsettingTypeProperty(referenceProperty,referenceClassifierTest,true)){
							return !NameHelper.doesSubsetPropertyExist(referenceProperty,subsetClassifier);
						}
						return false;
					}
					
					if(!referenceClassifierTest.equals(referenceModelClassifier))return false;
					
				}
				// for subset models, constrain/extend property check similar to subset property 
				if(referenceClassifierTest!=null){
					return !NameHelper.doesSubsetPropertyExist(referenceProperty,subsetClassifier);
				}
				// reference
				return !doesSubsetPropertyExist((Property)referenceProperty,subsetClassifier);
			}
			protected  Property addRestrictionProperty(Property referenceProperty,Class subsetContext,Classifier referenceClassifierTest){
				//Classifier referenceClassifierTest=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetContext);
				if(referenceClassifierTest==null)return super.addRestrictionProperty(referenceProperty, subsetContext, referenceClassifierTest);
				// for subset reference model, handle as per subset property
				return NameHelper.addPropertyToSubsetClassifier(referenceProperty, subsetContext,true);
			}
		     protected void resequenceClassifierRestrictionProperties(Classifier clientClassifier,Collection<Class> restrictedClass){
		    	 // no resequence
		     }

}
