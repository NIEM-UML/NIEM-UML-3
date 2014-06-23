/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author tom
 *
 */
public class RestrictionRedefinition extends SubsettingRedefinition {
	public static RestrictionRedefinition INSTANCE=new RestrictionRedefinition();
	protected RestrictionRedefinition(){}
	
    public void resequenceClassifierRestrictionProperties(Classifier subsetClassifier,Classifier restrictedClassifier){
     	if(subsetClassifier==null)return;
		resequenceClassifierProperties(subsetClassifier,restrictedClassifier);
     }
    protected List<Property> getOrderedReferenceProperties(Classifier referenceClassifier){
    	return NIEMHelper.getAllOrderedProperties(referenceClassifier);
    }

    public Property getReferenceProperty(Property subsetProperty,Classifier referenceClassifier){
 			if(referenceClassifier==null)return null;
 			// we need to look at all extension classifiers
 			Classifier extension=NIEMHelper.getBaseExtensionClassifier(referenceClassifier);
 			Property extensionProperty=getReferenceProperty(subsetProperty,extension);
 			if(extensionProperty!=null)return extensionProperty;
			Property referenceProperty=NameHelper.getMatchingProperty(subsetProperty, referenceClassifier);
 			if(referenceProperty==null){
 				//System.out.println("getReferenceProperty not found "+subsetProperty.getQualifiedName()+", "+referenceClassifier.getQualifiedName());
 				// extend search into model group definitions
 				for(Property p:referenceClassifier.getAttribute()){
 					Type t=p.getType();
 					if((t!=null)&&(t instanceof Class)){
 	 					if(NIEMHelper.isModelGroupDefinition((Class)t)){
 	 			 			Property extensionProperty2=getReferenceProperty(subsetProperty,(Class)t);
 	 			 			if(extensionProperty2!=null)return extensionProperty2;
 	 					}
 						
 					}
 				}
 				
 				return null;
 			}

 		if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
 			if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
 				//System.out.println("getReferenceProperty not matched "+subsetProperty.getQualifiedName()+", "+referenceProperty.getQualifiedName());
 				return null;
 			}
 		}
 		return referenceProperty;
 	 	}
	
}
