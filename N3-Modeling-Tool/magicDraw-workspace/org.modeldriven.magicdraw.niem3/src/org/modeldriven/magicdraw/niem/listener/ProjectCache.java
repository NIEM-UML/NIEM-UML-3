/**
 * 
 */
package org.modeldriven.magicdraw.niem.listener;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSchema;
import org.modeldriven.magicdraw.niem.validation.NIEMValidator;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.browser.Node;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;

/**
 * @author tom
 *
 */
public class ProjectCache {
	protected static Map<Project,ProjectCache> projectCacheMap=new HashMap<Project,ProjectCache>();
	public static void removeProject(Project project){
		projectCacheMap.remove(project);
	}
	public static ProjectCache getProjectCache(Project project){
		ProjectCache projectCache= projectCacheMap.get(project);
		if(projectCache==null){
			projectCache=new ProjectCache();
			projectCacheMap.put(project,projectCache);
		}
		return projectCache;
	}
	public static ProjectCache getProjectCache(){
		Project project=Application.getInstance().getProjectsManager().getActiveProject();
		if(project==null)return null;
		return getProjectCache(project);
	}
	//////////////////////////////////////////
	public void clear(){
		subsetToReferenceMap=new HashMap<Classifier,Classifier>();
		subsetToReferencePropertyMap=new HashMap<Property,Property>();
		propertyToPropertyHolderPropertyMap=new HashMap<Property,Property>();
		matchingPropertyMap=new HashMap<Property,Map<Classifier,Property>>();
		nameToPropertyHolderPropertyMap=new HashMap<Package,Map<String,Property>>();
		 informationModelToReferencedModels=new HashMap<Package,Set<Package>>();
		 informationModelToSchemaMap=new HashMap<Package,XSDSchema>();
		 packageToPropertyToInstanceSpecificationMap=new HashMap<Package,Map<Property,Set<InstanceSpecification>>>();
		 elementToResolvedElementMap=new HashMap<XSDElementDeclaration,XSDElementDeclaration>();
		 classBodyMap=new HashMap<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>>();
		 //objectToNodeMap=new HashMap<Object,Node>();// this should be updated as changes occur
		// validationContext=new HashMap<Object,Object>();
		 //niemValidator=new NIEMValidator();
	}
	protected Map<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> classBodyMap=new HashMap<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>>();
	protected Map<XSDElementDeclaration,XSDElementDeclaration> elementToResolvedElementMap=new HashMap<XSDElementDeclaration,XSDElementDeclaration>();
	protected Map<Package,XSDSchema> informationModelToSchemaMap=new HashMap<Package,XSDSchema>();
	protected Map<Classifier,Classifier> subsetToReferenceMap=new HashMap<Classifier,Classifier>();
	protected Map<Property,Property> subsetToReferencePropertyMap=new HashMap<Property,Property>();
	protected Map<Property,Property> propertyToPropertyHolderPropertyMap=new HashMap<Property,Property>();
	protected Map<Property,Map<Classifier,Property>> matchingPropertyMap=new HashMap<Property,Map<Classifier,Property>>();
	protected Map<Package,Map<String,Property>> nameToPropertyHolderPropertyMap=new HashMap<Package,Map<String,Property>>();
	protected Map<Package,Set<Package>> informationModelToReferencedModels=new HashMap<Package,Set<Package>>();
	protected Map<Package,Map<Property,Set<InstanceSpecification>>> packageToPropertyToInstanceSpecificationMap=new HashMap<Package,Map<Property,Set<InstanceSpecification>>>();
	protected Map<Object,Node> objectToNodeMap=new HashMap<Object,Node>();

	//protected Map<Object,Object> validationContext=new HashMap<Object,Object>();
	protected NIEMValidator niemValidator=new NIEMValidator();
	
//    public NIEMValidator getNIEMValidator(){return NIEMValidator.INSTANCE;}
    public NIEMValidator getNIEMValidator(){return niemValidator;}
    public Map<Classifier,Map<String,org.eclipse.ocl.Query<Classifier, Class, EObject>>> getClassBodyMap(){return classBodyMap;}
	
    public Map<Object,Object> getValidationContext(){return new HashMap<Object,Object>();}


    public Map<Object,Node> getObjectToNodeMap(){
		return objectToNodeMap;
	}
	public Map<XSDElementDeclaration,XSDElementDeclaration> getElementToResolvedElementMap(){return elementToResolvedElementMap;}
	public Map<Package,Set<Package>> getInformationModelToReferencedModels(){return informationModelToReferencedModels;}
	public Map<Classifier,Classifier> getSubsetToReferenceMap(){return subsetToReferenceMap;}
	public Map<Property,Property> getReferencePropertyMap(){return subsetToReferencePropertyMap;}
	public Map<Property,Property> getPropertyToPropertyHolderPropertyMap(){return propertyToPropertyHolderPropertyMap;}
	public Map<Package,Map<String,Property>> getNameToPropertyHolderPropertyMap(){return nameToPropertyHolderPropertyMap;}
	public Map<Package,XSDSchema> getInformationModelToSchemaMap(){return informationModelToSchemaMap;}
	
	
	public Map<Property,Set<InstanceSpecification>> getPropertyToInstanceSpecificationMap(Package owner){
		Map<Property,Set<InstanceSpecification>> test=packageToPropertyToInstanceSpecificationMap.get(owner);
		if(test!=null)return test;
		test=new HashMap<Property,Set<InstanceSpecification>>();
		packageToPropertyToInstanceSpecificationMap.put(owner, test);
		return test;
	}
	public Property getMatchingProperty(Property subsetProperty,Classifier referenceClassifier){
		Map<Classifier,Property> referencePropertyMap=getReferencePropertyMap(subsetProperty);
		Property result=referencePropertyMap.get(referenceClassifier);
		return result;
	}
	
	public boolean containsMatchingProperty(Property subsetProperty,Classifier referenceClassifier){
		Map<Classifier,Property> referencePropertyMap=getReferencePropertyMap(subsetProperty);
		boolean result=referencePropertyMap.containsKey(referenceClassifier);
		return result;
	}
	public void setMatchingProperty(Property subsetProperty,Classifier referenceClassifier,Property referenceProperty){
		Map<Classifier,Property> referencePropertyMap=getReferencePropertyMap(subsetProperty);
		referencePropertyMap.put(referenceClassifier,referenceProperty);
	}
	protected Map<Classifier,Property> getReferencePropertyMap(Property subsetProperty){
		Map<Classifier,Property> referencePropertyMap=matchingPropertyMap.get(subsetProperty);
		if(referencePropertyMap==null){
			referencePropertyMap=new HashMap<Classifier,Property>();
			matchingPropertyMap.put(subsetProperty, referencePropertyMap);
		}
		return referencePropertyMap;
	}
	
}
