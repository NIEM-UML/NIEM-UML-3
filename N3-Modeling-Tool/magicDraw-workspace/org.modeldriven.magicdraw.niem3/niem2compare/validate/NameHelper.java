/**
 * 
 */
package org.modeldriven.magicdraw.niem.validate;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameValidationRule.FixPropertyNameSuffixAction;


import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.copypaste.CopyPasting;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
//import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Constraint;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class NameHelper implements NIEM_ProfileConstants{
	protected static Set<Package> findAllSubsetPackagesContained(Package subsetContext,Set<Package> result){
		if(result.contains(subsetContext))return result;
		if(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetContext)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetContext)
			){
			result.add(subsetContext);
			return result;
		}
		for(Package nested:subsetContext.getNestedPackage()){
			findAllSubsetPackagesContained(nested,result);
		}
   	 	return result;			    	 

	}
	protected static Set<Package> findAllSubsetPackagesReferenced(Package subsetContext,Set<Package> result){
		if(result.contains(subsetContext))return result;
		if(!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetContext)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetContext)
			)) return result;
		result.add(subsetContext);
		// search dependencies, classifiers and their generalizations/dependencies, properties and their types/dependencies
		findAllSubsetPackagesReferencedViaDependency(subsetContext,result);
		for(Type t:subsetContext.getOwnedType()){
			if(Classifier.class.isInstance(t)){
				Classifier c=(Classifier)t;
				findAllSubsetPackagesReferencedViaDependency(c,result);
				for(Classifier superClassifier:c.getGeneral()){
					findAllSubsetPackagesReferenced(NIEMHelper.getNearestInformationModel(superClassifier),result);
				}
				for(Property p:c.getAttribute()){
					Type type=p.getType();
					if(type!=null)findAllSubsetPackagesReferenced(NIEMHelper.getNearestInformationModel(type),result);
					findAllSubsetPackagesReferencedViaDependency(p,result);
				}
			}
		}
   	 	return result;			    	 

	}
	public static void findAllSubsetPackagesReferencedViaDependency(NamedElement subsetContext,Set<Package> result){
		for(Dependency d:subsetContext.getClientDependency()){
			for(NamedElement ne:d.getSupplier()){
				// do not add <<References>> which is used for Package subsetting
				if(Package.class.isInstance(subsetContext)
						&&Package.class.isInstance(ne)
						&&NIEMHelper.isInformationModel((Package)subsetContext)
						&&NIEMHelper.isInformationModel((Package)ne)
						&&(NIEMHelper.getNamespaceTargetNamespace((Package)subsetContext)!=null)
						&&NIEMHelper.getNamespaceTargetNamespace((Package)subsetContext).equals(NIEMHelper.getNamespaceTargetNamespace((Package)ne))
						){
					continue;
				}
				findAllSubsetPackagesReferenced(NIEMHelper.getNearestInformationModel(ne),result);
			}
		}
	}
	protected static Package createMpdPackage(Package referenceModel,Package mpdRootPackage,boolean isConstraintSchema){
//		Package xmlSchemas=getMpdXmlSchemasPackage(mpdRootPackage);
		if((referenceModel==null)||(mpdRootPackage==null))return null;
		Package xmlSchemas=getMpdSubsetsPackage(mpdRootPackage,isConstraintSchema);
		
		List<Package> niemContainmentSequence=getNIEMContainmentSequence(referenceModel.getNestingPackage(),new Vector<Package>());
		Package basePackage=xmlSchemas;
		for(Package niemContainment:niemContainmentSequence){
			basePackage=getOrCreateNiemSubsetPackage(niemContainment,basePackage);
		}
		return basePackage;
	}
	static public List<Package> getNIEMContainmentSequence(Package referenceModel,List<Package> nestingPackages){
		if(referenceModel==null)return nestingPackages;
		nestingPackages.add(0, referenceModel);
		if(NIEM_PAKAGENAME.equals(referenceModel.getName()))return nestingPackages;
		Package nestingPackage=referenceModel.getNestingPackage();
		if(nestingPackage==null)return nestingPackages;
		if(!nestingPackage.getProfileApplication().isEmpty())return nestingPackages;
		return getNIEMContainmentSequence(nestingPackage,nestingPackages);
	}

	public static Package getMpdXmlSchemasPackage(Package mpdParentPackage){
		for(Package subsetPackage:mpdParentPackage.getNestedPackage()){
			if(subsetPackage.getName().equals(XMLSCHEMA_DIRECTORYNAME))return subsetPackage;
		}
		// create one
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package newSubsetPackage = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		newSubsetPackage.setName(XMLSCHEMA_DIRECTORYNAME);
		newSubsetPackage.setVisibility(VisibilityKindEnum.PUBLIC);
		mpdParentPackage.getPackagedElement().add(newSubsetPackage);
		return newSubsetPackage;
	}
	public static Package getMpdXmlSamplesPackage(Package mpdParentPackage){
		for(Package subsetPackage:mpdParentPackage.getNestedPackage()){
			if(subsetPackage.getName().equals(XMLSAMPLES_DIRECTORYNAME))return subsetPackage;
		}
		// create one
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package newSubsetPackage = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		newSubsetPackage.setName(XMLSAMPLES_DIRECTORYNAME);
		newSubsetPackage.setVisibility(VisibilityKindEnum.PUBLIC);
		mpdParentPackage.getPackagedElement().add(newSubsetPackage);
		return newSubsetPackage;
	}
	public static Package createXmlSamplePackage(Property property){
	     Package mpdParentPackage=NIEMHelper.getMpdRootDirectory(property);
		Package xmlSamples=getMpdXmlSamplesPackage(mpdParentPackage);
		// create one
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package newSubsetPackage = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		newSubsetPackage.setVisibility(VisibilityKindEnum.PUBLIC);
		xmlSamples.getPackagedElement().add(newSubsetPackage);
		String name=getUniquePackageName(newSubsetPackage,property.getName(),"");
		newSubsetPackage.setName(name);
		return newSubsetPackage;
	}

	protected static Package getMpdSubsetsPackage(Package mpdParentPackage,boolean isConstraint){
		String subsetPackageName=SUBSET_DIRECTORYNAME;
		if(isConstraint)subsetPackageName=CONSTRAINT_DIRECTORYNAME;
		Package xmlSchemasPackage=getMpdXmlSchemasPackage(mpdParentPackage);
		for(Package subsetPackage:xmlSchemasPackage.getNestedPackage()){
			if(subsetPackage.getName().equals(subsetPackageName))return subsetPackage;
		}
		// create one
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package newSubsetPackage = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		newSubsetPackage.setName(subsetPackageName);
		newSubsetPackage.setVisibility(VisibilityKindEnum.PUBLIC);
		xmlSchemasPackage.getPackagedElement().add(newSubsetPackage);
		return newSubsetPackage;
	}

	public static Package getOrCreateNiemSubsetPackage(Package referenceModel,Package mpdParentPackage){
		for(Package subsetPackage:mpdParentPackage.getNestedPackage()){
			if(subsetPackage.getName().equals(referenceModel.getName()))return subsetPackage;
		}
		// create one
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package newSubsetPackage = Application.getInstance().getProject().getElementsFactory().createPackageInstance();
		newSubsetPackage.setName(referenceModel.getName());
		newSubsetPackage.setVisibility(referenceModel.getVisibility());
		mpdParentPackage.getPackagedElement().add(newSubsetPackage);
		return newSubsetPackage;
	}
	public static Package createSubsetModel(Package referenceModel,Package subsetPackageOwner,boolean isConstraintSchema){
		// update defaultKind to subsets
		String defaultPurpose=subsetLiteralName;
		if(isConstraintSchema)defaultPurpose=constraintLiteralName;
		else if(NIEMHelper.isInformationModelDefaultPurposeExtension(referenceModel))defaultPurpose=extensionLiteralName;
		return createPurposeModel(referenceModel,subsetPackageOwner,defaultPurpose);
	}
	public static Package createPurposeModel(Package referenceModel,Package subsetPackageOwner,String defaultPurpose){
		Package newClientPackage=NIEMFactory.instance.shallowPackageCopy(referenceModel);
		NIEMHelper.setInformationModelDefaultPurpose(newClientPackage,defaultPurpose);
		// add References Realization
		subsetPackageOwner.getPackagedElement().add(newClientPackage);
		NIEMFactory.instance.createReferences(newClientPackage,referenceModel);
		return newClientPackage;
	}
	public static Package findSubsetPackage(Package referencePackage,Set<Package> subsetContexts){
		// ok if targetNamespace match; otherwise start searching for existing subset; 
		Set<Package> allSubsetPackages=new HashSet<Package>();
	     Set<Package> mpdRootDirectories=new HashSet<Package>();
		String referenceTargetNamespace=NIEMHelper.getNamespaceTargetNamespace(referencePackage);
		if(referenceTargetNamespace==null)return null;
		boolean isConstraint=false;
		for(Package subsetContext:subsetContexts){
			String subsetTargetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetContext);
			if(referenceTargetNamespace.equals(subsetTargetNamespace))return subsetContext;
			findAllSubsetPackagesReferenced(subsetContext,allSubsetPackages);
			if(NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetContext))isConstraint=true;
		}
		// start searching:look in current subsetContext for references to another subsetContext
		// make sure the subsetContexts included in mpdeRootDirectories
		allSubsetPackages.addAll(subsetContexts);
		for(Package subsetContextTest:allSubsetPackages){
			String subsetTargetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetContextTest);
			if(referenceTargetNamespace.equals(subsetTargetNamespace))return subsetContextTest;
		     Package mpdRootDirectoryTest=NIEMHelper.getMpdRootDirectory(subsetContextTest);
		     if(mpdRootDirectoryTest!=null)mpdRootDirectories.add(mpdRootDirectoryTest);
		}
		
		// search the mpd
   	 Package newSubsetModel=null;
	     //Package mpdRootDirectory=NIEMHelper.getMpdRootDirectory(subsetContext);
    	 // search for an existing model:
    	 //		(backlink) via <<References>>
    	 //		all packages for matching targetNamespace

    	 for(DirectedRelationship dr:referencePackage.get_directedRelationshipOfTarget()){
    		 if(NIEMHelper.isReferences(dr)){
    			 for(Element subsetElement:dr.getSource()){
    				 if(Package.class.isInstance(subsetElement)){
    					 // must be contained by 
    					 for(Package mpdRootDirectory:mpdRootDirectories){
	    					 if(NIEMHelper.getAllNestingPackages(subsetElement,new Vector<Package>()).contains(mpdRootDirectory)){
	    						 newSubsetModel=(Package)subsetElement;
	    					 }
    					 }
    				 }
    			 }
    		 }
    	 }
    	 if(newSubsetModel==null){
    		 // search for targetNamespace match
			 for(Package mpdRootDirectory:mpdRootDirectories){
	    		 for(Package nestedPackage:NIEMHelper.getAllNesedPackages(mpdRootDirectory, new Vector<Package>())){
	    			 if(NIEMHelper.isInformationModel(nestedPackage)
	    					 &&(
	    							 (isConstraint && NIEMHelper.isInformationModelDefaultPurposeConstraint(nestedPackage))
	    							 ||(!isConstraint
	    									 &&(
			    							 NIEMHelper.isInformationModelDefaultPurposeSubset(nestedPackage)
			    							 ||NIEMHelper.isInformationModelDefaultPurposeExtension(nestedPackage)
			    							 )
			    					)
	    					 )){
				    	 String subsetNamespace=NIEMHelper.getNamespaceTargetNamespace(nestedPackage);
	    				 if((subsetNamespace!=null)&&subsetNamespace.equals(referenceTargetNamespace)){
	    					 newSubsetModel=nestedPackage;
	    					 break;
	    				 }
	    			 }
	    		 }
			 }
    	 }
	     return newSubsetModel;
	}
	
	public static Package findOrCreateSubsetPackage(Package referencePackage,Package subsetContext){
		// ok if targetNamespace match; otherwise start searching for existing subset; if not found, then create one
		if(referencePackage==null)return null;
		Set<Package> subsetContexts=new HashSet<Package>();
		if(subsetContext!=null)subsetContexts.add(subsetContext);
		Package newSubsetModel=findSubsetPackage( referencePackage,subsetContexts);
		/*
		String referenceTargetNamespace=NIEMHelper.getNamespaceTargetNamespace(referencePackage);
		String subsetTargetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetContext);
		if(referenceTargetNamespace==null)return null;
		if(referenceTargetNamespace.equals(subsetTargetNamespace))return subsetContext;
		// start searching:look in current subsetContext for references to another subsetContext
		for(Package subsetContextTest:findAllSubsetPackagesReferenced(subsetContext,new HashSet<Package>())){
			subsetTargetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetContextTest);
			if(referenceTargetNamespace.equals(subsetTargetNamespace))return subsetContextTest;
		}
		
		// search the mpd
	     Package mpdRootDirectory=NIEMHelper.getMpdRootDirectory(subsetContext);
    	 Package newSubsetModel=null;
    	 // search for an existing model:
    	 //		(backlink) via <<References>>
    	 //		all packages for matching targetNamespace

    	 for(DirectedRelationship dr:referencePackage.get_directedRelationshipOfTarget()){
    		 if(NIEMHelper.isReferences(dr)){
    			 for(Element subsetElement:dr.getSource()){
    				 if(Package.class.isInstance(subsetElement)){
    					 // must be contained by 
    					 if(NIEMHelper.getAllNestingPackages(subsetElement,new Vector<Package>()).contains(mpdRootDirectory)){
    						 newSubsetModel=(Package)subsetElement;
    					 }
    				 }
    			 }
    		 }
    	 }
    	 if(newSubsetModel==null){
    		 // search for targetNamespace match
    		 for(Package nestedPackage:NIEMHelper.getAllNesedPackages(mpdRootDirectory, new Vector<Package>())){
    			 if(NIEMHelper.isInformationModel(nestedPackage)
    					 &&(
    							 NIEMHelper.isInformationModelDefaultPurposeSubset(nestedPackage)
    							 ||NIEMHelper.isInformationModelDefaultPurposeExtension(nestedPackage)
    					)
    					 ){
			    	 String subsetNamespace=NIEMHelper.getNamespaceTargetNamespace(nestedPackage);
    				 if((subsetNamespace!=null)&&subsetNamespace.equals(referenceTargetNamespace)){
    					 newSubsetModel=nestedPackage;
    					 break;
    				 }
    			 }
    		 }
    	 }
    	 */
    	 /*
    	 for(PackageableElement test:clientPackage.getPackagedElement()){
    		 if(Package.class.isInstance(test)&&referencePackage.getName().equals(test.getName())){
    			 newSubsetModel=(Package)test;
    			 break;
    		 }
    	 }
    	 if(newSubsetModel==null){
    		 // try to align package structure with mpd........
    		 newSubsetModel=NameHelper.createSubsetModel(referencePackage,clientPackage);			    	 
			if(pe!=null){
				SubsetDialogHelper.createShape(newSubsetModel,diagram,pe);
			}
    	 }
    	 */
    	 if(newSubsetModel==null){
    			Set<Package> allSubsetPackages=new HashSet<Package>();
    		     Set<Package> mpdRootDirectories=new HashSet<Package>();
    		     boolean isConstraint=false;
    				for(Package subsetContextTest:subsetContexts){
    					if(NIEMHelper.isInformationModel(subsetContextTest)&&NIEMHelper.isInformationModelDefaultPurposeConstraint(subsetContextTest))isConstraint=true;
    					findAllSubsetPackagesContained(subsetContextTest,allSubsetPackages);
    				}
    			for(Package subsetContextTest:subsetContexts){
    				findAllSubsetPackagesReferenced(subsetContextTest,allSubsetPackages);
    			}
    			for(Package subsetContextTest:allSubsetPackages){
    			     Package mpdRootDirectoryTest=NIEMHelper.getMpdRootDirectory(subsetContextTest);
    			     if(mpdRootDirectoryTest!=null)mpdRootDirectories.add(mpdRootDirectoryTest);
    			}
    		 // try to align package structure with mpd........
    			for(Package mpdRootDirectory:mpdRootDirectories){
		    		 Package mpdPackage=NameHelper.createMpdPackage(referencePackage,mpdRootDirectory,isConstraint);
		    		 if(mpdPackage==null){
		    			 QvtCommonAction.log("Failed to create mpd package for reference "+referencePackage.getQualifiedName()+", in root "+mpdRootDirectory.getQualifiedName());
		    			 continue;
		    		 }
		    		 newSubsetModel=NameHelper.createSubsetModel(referencePackage,mpdPackage,isConstraint);	
		    		 if(newSubsetModel==null){
		    			 QvtCommonAction.log("Failed to create subset model for reference "+referencePackage.getQualifiedName()+", in mpdPackage "+mpdPackage.getQualifiedName());
		    			 continue;
		    		 }
		    		 break;
    			}
    		 /*
			if(pe!=null){
				SubsetDialogHelper.createShape(newSubsetModel,diagram,pe);
			}
			*/
    	 }
	     
	     return newSubsetModel;
	     
		// not found, create a sibling package based on referencePackage
//   	 	return createSubsetModel(referencePackage,subsetContext.getNestingPackage());			    	 

	}
	public static Type getSubsetClassifier(Type referenceClassifier,Package subsetPackage){
//		String referenceName=referenceClassifier.getName();
		if(subsetPackage==null)return null;
		if(!Classifier.class.isInstance(referenceClassifier))return null;
		Type type=NameHelper.getMatchingType((Classifier)referenceClassifier, subsetPackage);
		return type;
		/*
		String referenceName=NameHelper.getNIEMName((Classifier)referenceClassifier);
		if(referenceName==null)return null;
		for(Type type:subsetPackage.getOwnedType()){
			if(Classifier.class.isInstance(type)&&referenceName.equals(NameHelper.getNIEMName((Classifier)type)))return type;
		}
		return null;
		*/
	}
	
	public static Type addClassifier(Classifier referenceClassifier,Package subsetContext){
		if(referenceClassifier==null)return null;
		Package subsetPackage=NameHelper.findOrCreateSubsetPackage(NIEMHelper.getNearestInformationModel(referenceClassifier),subsetContext);
		if(subsetPackage==null)return referenceClassifier;// type library references
		// does it already exist?
		Type subsetClassifierTest=getSubsetClassifier(referenceClassifier,subsetPackage);
		if(subsetClassifierTest!=null)return subsetClassifierTest;
		//if(doesSubsetClassifierExist(referenceClassifier,subsetPackage))return;
		Classifier subsetClassifier=NIEMFactory.instance.shallowClassifierCopy(referenceClassifier);
		subsetPackage.getPackagedElement().add(subsetClassifier);
		if(Enumeration.class.isInstance(subsetClassifier)){
			Enumeration subsetEnumeration=(Enumeration)subsetClassifier;
			Enumeration referenceEnumeration=(Enumeration)referenceClassifier;
			// this function should only be for subsetting, therfore only do owned literals
//			for(EnumerationLiteral referenceLiteral:NIEMHelper.getAllLiterals(referenceEnumeration)){
			for(EnumerationLiteral referenceLiteral:referenceEnumeration.getOwnedLiteral()){
				EnumerationLiteral subsetLiteral=NIEMFactory.instance.shallowEnumerationLiteralCopy(referenceLiteral);
				subsetEnumeration.getOwnedLiteral().add(subsetLiteral);
			}
		}
		// check inherited....and any other references at this level.....
		for(Generalization g:referenceClassifier.getGeneralization()){
			if(g.getGeneral()==null)continue;
		//for(Classifier c:referenceClassifier.getGeneral()){
//			Type test=addClassifier(c,subsetPackage);
			// need temporary generalization due to NIEM name generation logic
			Generalization tempGeneralization=Application.getInstance().getProject().getElementsFactory().createGeneralizationInstance();
			Type test=null;
			try{
			tempGeneralization.setSpecific(subsetClassifier);
			 test=addClassifier(g.getGeneral(),subsetPackage);
			}finally{
			tempGeneralization.setOwner(null);
			}
			if(test!=null){
				NIEMFactory.instance.createGeneralizationInstance(g, subsetClassifier,(Classifier) test);
			}
		}
		for(Dependency d:referenceClassifier.getClientDependency()){
			for(NamedElement ne:d.getSupplier()){
				// are other dependencies needed?
				if(Classifier.class.isInstance(ne)){
					Type test=addClassifier((Classifier)ne,subsetPackage);
					NIEMFactory.instance.createDependencyInstance(d, subsetClassifier, test);
				}
			}
		}
		if(AssociationClass.class.isInstance(referenceClassifier)){
			// MD has already created ownedEnd properties, we need to update those with name/type etc.
			AssociationClass referenceAssociationClass=(AssociationClass)referenceClassifier;
			AssociationClass subsetAssociationClass=(AssociationClass)subsetClassifier;
			Property subsetClientProperty=subsetAssociationClass.getMemberEnd().get(0);
			Property subsetSupplierProperty=subsetAssociationClass.getMemberEnd().get(1);
			Property referenceClientProperty=referenceAssociationClass.getMemberEnd().get(0);
			Property referenceSupplierProperty=referenceAssociationClass.getMemberEnd().get(1);
			propagateAssociationEnd(referenceClientProperty,subsetClientProperty,subsetAssociationClass);
			propagateAssociationEnd(referenceSupplierProperty,subsetSupplierProperty,subsetAssociationClass);
			/*
			// populate memberType properties
			((AssociationClass)subsetClassifier).getOwnedEnd().clear();
			for(Property referenceEnd:((AssociationClass)referenceClassifier).getOwnedEnd()){
//if(true)QvtCommonAction.log("TEST SUPPRESS ownedEnd "+referenceEnd.getQualifiedName());else	{			
				Property subsetEnd=addOwnedEnd(referenceEnd,(AssociationClass)subsetClassifier);
//}				
			}
			*/
		}
		return subsetClassifier;
	}
	public static void propagateAssociationEnd(Property referenceProperty,Property subsetProperty,Classifier subsetContext){
		//Property subsetProperty=NIEMFactory.instance.shallowPropertyCopy(referenceProperty);
		NIEMFactory.populateProperty(referenceProperty, subsetProperty);
		setPropertyContent(referenceProperty, subsetContext, subsetProperty);
		// check type....and any other references at this level.....
	}
	/*
		public static Property addOwnedEnd(Property referenceProperty,AssociationClass subsetContext){
			return NameHelper.addOwnedEndToSubsetAssociationClass(referenceProperty, subsetContext);
		}
		public static Property addOwnedEndToSubsetAssociationClass(Property referenceProperty,AssociationClass subsetContext){
			// does it already exist?
			Property existingProperty=NameHelper.getSubsetOwnedEnd(referenceProperty,subsetContext);
			if(existingProperty!=null)return existingProperty;
			Property subsetProperty=NIEMFactory.instance.shallowPropertyCopy(referenceProperty);
			subsetProperty.setAssociation(subsetContext);
			subsetProperty.setOwningAssociation(subsetContext);
		
			
			setPropertyContent(referenceProperty, subsetContext, subsetProperty);
			// check type....and any other references at this level.....
			return subsetProperty;
		}
		*/
		public static Property setPropertyContent(Property referenceProperty,Classifier subsetContext,Property subsetProperty){
			return setPropertyContentBasic(referenceProperty,subsetContext,subsetProperty,true);
		}
		protected static Property setPropertyContentBasic(Property referenceProperty,Classifier subsetContext,Property subsetProperty,boolean isSubsetting){
			// check type....and any other references at this level.....
			Type type=referenceProperty.getType();
			if(type!=null){
				// is this an <<InformationModel>> ref or a primitive?
//				if(NIEMHelper.isInformationModelDefaultPurposeReference(NIEMHelper.getNearestInformationModel(type))){
				if(NIEMHelper.isInInformationModel(type)){
					Package subsetPackage=isSubsetting?
							findOrCreateSubsetPackage( NIEMHelper.getNearestInformationModel(type), NIEMHelper.getNearestInformationModel(subsetContext))
							:NIEMHelper.getNearestInformationModel(type);
					if(subsetPackage!=null){
						// find corresponding subsetClassifier
						Type subsetType=isSubsetting?addClassifier((Classifier)type,subsetPackage):type;
						if(subsetType!=null){
							subsetProperty.setType(subsetType);
						}else{
							QvtCommonAction.log("Failed to add subset Classifier for "+type.getQualifiedName());
							
						}
					}else{
						QvtCommonAction.log("Failed to findOrCreateSubsetPackage for "+type.getQualifiedName());
					}
				}else{
					subsetProperty.setType(type);
				}
			}
			boolean hasExplicitReferences=false;

			for(Dependency d:referenceProperty.getClientDependency()){
				if(NIEMHelper.isReferences(d))hasExplicitReferences=true;
				for(NamedElement ne:d.getSupplier()){
					Package referenceReferencesPackage=NIEMHelper.getNearestInformationModel(ne);
					if(Classifier.class.isInstance(ne)){
						Package subsetPackage=isSubsetting?
								findOrCreateSubsetPackage(referenceReferencesPackage , NIEMHelper.getNearestInformationModel(subsetContext))
								:referenceReferencesPackage;
						Type subsettype=isSubsetting?addClassifier((Classifier)ne,subsetPackage):(Classifier)ne;
						NIEMFactory.instance.createDependencyInstance(d, subsetProperty, subsettype);
					}
					else if(Property.class.isInstance(ne)){
						Package subsetPackage=isSubsetting?
								findOrCreateSubsetPackage(referenceReferencesPackage, NIEMHelper.getNearestInformationModel(subsetContext))
								:referenceReferencesPackage;
						Type subsettype=isSubsetting?addClassifier((Classifier)ne.getOwner(),subsetPackage):(Classifier)ne.getOwner();
						Property targetProperty=addPropertyToSubsetClassifier((Property)ne,(Classifier)subsettype,isSubsetting);
						NIEMFactory.instance.createDependencyInstance(d, subsetProperty, targetProperty);
					}
				}
			}
			
			//  make sure there is a references if we cross namespaces from subsetContext to referenceProperty
			
			if(!hasExplicitReferences){
				if(!NIEMHelper.isPropertyHolder(referenceProperty.getClassifier())){
					// check if implicit reference to a propertyholder
					Property subsetPropertyHolderProperty=getSubsetPropertyHolderProperty(subsetProperty);
					if(subsetPropertyHolderProperty==null){
						Property referencePropertyHolderProperty=getSubsetPropertyHolderProperty(referenceProperty);
						if(referencePropertyHolderProperty!=null){
							Classifier subsetPropertyHolderContext=isSubsetting?
								(Classifier)addClassifier(referencePropertyHolderProperty.getClassifier(),NIEMHelper.getNearestInformationModel(subsetProperty))
								:referencePropertyHolderProperty.getClassifier()
									;
							if(subsetPropertyHolderContext!=null){
								subsetPropertyHolderProperty= addPropertyToSubsetClassifier(referencePropertyHolderProperty,subsetPropertyHolderContext,isSubsetting);
								// if we are not subsetting, and subsetPropertyHolderProperty is in a different namespace,
								// then we need to add <<References>> to the Property directly
								if(!isSubsetting){
									conditionallyReferenceForeignProperty(subsetProperty,subsetPropertyHolderProperty);
								}
							}
						}else{
							// referenceProperty has no <<PropertyHolder>>, is it in a different namespace?
							// if so, and we are not subsetting, then we need to add <<References>> to the Property directly
							if(!isSubsetting){
								conditionallyReferenceForeignProperty(subsetProperty,referenceProperty);
							}
						}
					}
				}
			}
			// check subsets
			
			if(NIEMHelper.isPropertyHolder(referenceProperty.getClassifier())){
				Package subsetContextPackage=isSubsetting
						?findOrCreateSubsetPackage( NIEMHelper.getNearestInformationModel(referenceProperty), NIEMHelper.getNearestInformationModel(subsetContext))
								: NIEMHelper.getNearestInformationModel(referenceProperty);
				if(subsetContextPackage!=null){		
					Type subsetContextType=isSubsetting
							?addClassifier(referenceProperty.getClassifier(),subsetContextPackage)
									:referenceProperty.getClassifier();
					Property targetContextProperty=addPropertyToSubsetClassifier(referenceProperty,(Classifier)subsetContextType,isSubsetting);
					if(!hasExplicitReferences&&!NIEMHelper.isPropertyHolder(subsetProperty.getClassifier())){
						// make a references
						//System.out.println("setPropertyContentBasic realization "+subsetProperty.getQualifiedName()+" to "+targetContextProperty.getQualifiedName());
						Realization realization=NIEMFactory.instance.createReferences(subsetProperty,targetContextProperty);
					}
					for(Property ne:referenceProperty.getSubsettedProperty()){
						Package subsetPackage=isSubsetting
								?findOrCreateSubsetPackage( NIEMHelper.getNearestInformationModel(ne), NIEMHelper.getNearestInformationModel(subsetContext))
										: NIEMHelper.getNearestInformationModel(ne);
						Type subsettype=isSubsetting
								?addClassifier((Classifier)ne.getOwner(),subsetPackage)
										:(Classifier)ne.getOwner();
						Property targetProperty=addPropertyToSubsetClassifier((Property)ne,(Classifier)subsettype,isSubsetting);
						if(targetContextProperty.equals(targetProperty)){
							// the subsetting property may be returned from addProperty
							//QvtCommonAction.log("ERROR: Internal, SubsetDialogHelper.addProperty subsetting self "+referenceProperty.getQualifiedName()+", "+ne.getQualifiedName());
						}else{
						targetContextProperty.getSubsettedProperty().add(targetProperty);
						}
					}
				}
			}
			return subsetProperty;
		}
		protected static Realization conditionallyReferenceForeignProperty(Property subsetProperty,Property referenceProperty){
			if(subsetProperty==null)return null;
			if(referenceProperty==null)return null;
			Realization realization=NIEMFactory.instance.createReferences(subsetProperty,referenceProperty);
			return realization;
		}

		public static EnumerationLiteral addEnumerationLiteral(EnumerationLiteral referenceProperty,Enumeration subsetContext){
			return NameHelper.addEnumerationLiteralToSubsetClassifier(referenceProperty, subsetContext);
		}
		public static EnumerationLiteral addEnumerationLiteralToSubsetClassifier(EnumerationLiteral referenceProperty,Enumeration subsetContext){
			// does it already exist?
			EnumerationLiteral existingProperty=NameHelper.getSubsetEnumerationLiteral(referenceProperty,subsetContext);
			if(existingProperty!=null)return existingProperty;
			//if(doesSubsetPropertyExist(referenceProperty,subsetContext))return;
			EnumerationLiteral subsetProperty=NIEMFactory.instance.shallowEnumerationLiteralCopy(referenceProperty);
			subsetContext.getOwnedLiteral().add(subsetProperty);
			return subsetProperty;
		}
		
	public static Property addProperty(Property referenceProperty,Classifier subsetContext){
		return NameHelper.addPropertyToSubsetClassifier(referenceProperty, subsetContext,true);
	}
	protected static void forceNillable(Property subsetProperty){
		Stereotype stereotype=NIEMHelper.getPsmStereotype(XSDPropertyStereotypeName);

		if(!NIEMHelper.hasStereotype(subsetProperty, stereotype)){
			NIEMHelper.addStereotype(subsetProperty,stereotype);
		}
		StereotypesHelper.setStereotypePropertyValue(subsetProperty, stereotype, "nillable", Boolean.TRUE);
	}
	
	public static Property addPropertyToSubsetClassifier(Property referenceProperty,Classifier subsetContext,boolean isSubsetting){
		// does it already exist?
		Property existingProperty=NameHelper.getSubsetProperty(referenceProperty,subsetContext);
		if(existingProperty!=null)return existingProperty;
		//if(doesSubsetPropertyExist(referenceProperty,subsetContext))return;
		Property subsetProperty=NIEMFactory.instance.shallowPropertyCopy(referenceProperty);
		if(DataType.class.isInstance(subsetContext))((DataType)subsetContext).getOwnedAttribute().add(subsetProperty);
		else ((Class)subsetContext).getOwnedAttribute().add(subsetProperty);
		// force nillable if we are subsetting a reference model
		if(isSubsetting && (subsetContext!=null)){
			Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetContext);
			Package referenceInformationModel=NIEMHelper.getNearestInformationModel(referenceProperty);
			if((subsetInformationModel!=null)&&(referenceInformationModel!=null)
					&&NIEMHelper.isInformationModelDefaultPurposeSubset(subsetInformationModel)
					&&NIEMHelper.isInformationModelDefaultPurposeReference(referenceInformationModel)
					){
				forceNillable(subsetProperty);
			}
		}
		// check type....and any other references at this level.....
		setPropertyContentBasic(referenceProperty, subsetContext, subsetProperty,isSubsetting);
		// if populated non PropertyHolder from PropertyHolder, then double check that we have the reference model Property
		if(NIEMHelper.isPropertyHolder(referenceProperty.getClassifier())&&!NIEMHelper.isPropertyHolder(subsetContext)){
			Property actualReferenceProperty=NIEMHelper.getReferenceProperty(subsetProperty);
//			QvtCommonAction.log("addPropertyToSubsetClassifier PropertyHolder "+actualReferenceProperty);
			if(actualReferenceProperty!=null){
				//referenceProperty=actualReferenceProperty;
				subsetProperty.setLowerValue((ValueSpecification)CopyPasting.copyPasteElement(actualReferenceProperty.getLowerValue(),subsetProperty));
				subsetProperty.setUpperValue((ValueSpecification)CopyPasting.copyPasteElement(actualReferenceProperty.getUpperValue(),subsetProperty));
			}
		}
		// check type....and any other references at this level.....
		// move up to prevent invalid cache info via getReferenceProperty :setPropertyContentBasic(referenceProperty, subsetContext, subsetProperty,isSubsetting);
		// if we just created a Property based on PropertyHolder, see if we need to align cardinality based on reference model
		/*
		Type type=referenceProperty.getType();
		if(type!=null){
			// is this an <<InformationModel>> ref or a primitive?
			if(NIEMHelper.isInformationModelDefaultPurposeReference(NIEMHelper.getNearestInformationModel(type))){
				
				Package subsetPackage=findSubsetPackage( NIEMHelper.getNearestInformationModel(type), NIEMHelper.getNearestInformationModel(subsetContext));
				
				// find corresponding subsetClassifier
				Type subsetType=addClassifier((Classifier)type,subsetPackage);
				subsetProperty.setType(subsetType);
			}else{
				subsetProperty.setType(type);
			}
		}
		boolean hasExplicitReferences=false;
		for(Dependency d:referenceProperty.getClientDependency()){
			if(NIEMHelper.isReferences(d))hasExplicitReferences=true;
			for(NamedElement ne:d.getSupplier()){
				if(Classifier.class.isInstance(ne)){
					Package subsetPackage=findSubsetPackage( NIEMHelper.getNearestInformationModel(ne), NIEMHelper.getNearestInformationModel(subsetContext));
					Type subsettype=addClassifier((Classifier)ne,subsetPackage);
					NIEMFactory.instance.createDependencyInstance(d, subsetProperty, subsettype);
					
				}
				else if(Property.class.isInstance(ne)){
					Package subsetPackage=findSubsetPackage( NIEMHelper.getNearestInformationModel(ne), NIEMHelper.getNearestInformationModel(subsetContext));
					Type subsettype=addClassifier((Classifier)ne.getOwner(),subsetPackage);
					Property targetProperty=addProperty((Property)ne,(Classifier)subsettype);
					NIEMFactory.instance.createDependencyInstance(d, subsetProperty, targetProperty);
				}
			}
		}
		if(!hasExplicitReferences&&!NIEMHelper.isPropertyHolder(referenceProperty.getClassifier())){
			// check if implicit reference to a propertyholder
			Property subsetPropertyHolderProperty=getSubsetPropertyHolderProperty(subsetProperty);
			if(subsetPropertyHolderProperty==null){
				Property referencePropertyHolderProperty=getSubsetPropertyHolderProperty(referenceProperty);
				if(referencePropertyHolderProperty!=null){
					Classifier subsetPropertyHolderContext=
						(Classifier)addClassifier(referencePropertyHolderProperty.getClassifier(),NIEMHelper.getNearestInformationModel(subsetProperty));
					if(subsetPropertyHolderContext!=null){
						subsetPropertyHolderProperty= addPropertyToSubsetClassifier(referencePropertyHolderProperty,subsetPropertyHolderContext);
					}
				}
			}
		}
		// check subsets
		if(NIEMHelper.isPropertyHolder(referenceProperty.getClassifier())){
			Package subsetContextPackage=findSubsetPackage( NIEMHelper.getNearestInformationModel(referenceProperty), NIEMHelper.getNearestInformationModel(subsetContext));
			Type subsetContextType=addClassifier(referenceProperty.getClassifier(),subsetContextPackage);
			Property targetContextProperty=addProperty(referenceProperty,(Classifier)subsetContextType);
			if(!hasExplicitReferences&&!NIEMHelper.isPropertyHolder(subsetProperty.getClassifier())){
				// make a references
				Realization realization=NIEMFactory.instance.createReferences(subsetProperty,targetContextProperty);
			}
			for(Property ne:referenceProperty.getSubsettedProperty()){
				Package subsetPackage=findSubsetPackage( NIEMHelper.getNearestInformationModel(ne), NIEMHelper.getNearestInformationModel(subsetContext));
				Type subsettype=addClassifier((Classifier)ne.getOwner(),subsetPackage);
				Property targetProperty=addProperty((Property)ne,(Classifier)subsettype);
				if(targetContextProperty.equals(targetProperty)){
					// the subsetting property may be returned from addProperty
					//QvtCommonAction.log("ERROR: Internal, SubsetDialogHelper.addProperty subsetting self "+referenceProperty.getQualifiedName()+", "+ne.getQualifiedName());
				}else{
				targetContextProperty.getSubsettedProperty().add(targetProperty);
				}
			}
		}
		*/
		// associations
		Association referenceAssociation=referenceProperty.getAssociation();
		if(referenceAssociation!=null){
			/* this should never be an AssociationClass
			// if this is an AssociationClass, find out if it already exists
			if(AssociationClass.class.isInstance(referenceAssociation)){
				Package subsetPackage=findSubsetPackage( NIEMHelper.getNearestInformationModel(referenceAssociation), NIEMHelper.getNearestInformationModel(subsetContext));
				
				// find corresponding subsetClassifier
				AssociationClass subsetAssociation=(AssociationClass)addClassifier(referenceAssociation,subsetPackage);
				
				subsetAssociation.getMemberEnd().add(subsetProperty);
				
			}else{
			*/
			// clone association, add to subset model, add owned property, if any; set subsetProperty Association
			Association subsetAssociation=NIEMFactory.instance.shallowAssociationCopy(referenceAssociation,subsetProperty);
			//}
		}
		return subsetProperty;
	}
	
	public static boolean isPropertyHolderPropertySubsettingTypeProperty(
			Property referenceModelPropertyHolderProperty,Classifier referenceClassifier,boolean isMostDerived){
		return isPropertyHolderPropertySubsettingTypePropertyNested(referenceModelPropertyHolderProperty,referenceClassifier,isMostDerived,new HashSet<Property>());
	}	
	public static boolean isPropertyHolderPropertySubsettingTypePropertyNested(
			Property referenceModelPropertyHolderProperty,Classifier referenceClassifier,boolean isMostDerived,Set<Property> didThat){
		if(didThat.contains(referenceModelPropertyHolderProperty))return false;
		didThat.add(referenceModelPropertyHolderProperty);
		// if this property <<References>> by a referenceClassifier Property
		// NOT NECESSARY: or this property's classifier <<References>> by  referenceClassifier and property matches property in referenceClassifier
		// or any of above for any subsetsProperty
		for(DirectedRelationship dr:referenceModelPropertyHolderProperty.get_directedRelationshipOfTarget()){
			if(NIEMHelper.isReferences(dr)){
				for(Element sourceElement:dr.getSource()){
					if(Property.class.isInstance(sourceElement)){
						Property referenceClassifierProperty=(Property)sourceElement;
						if(referenceClassifier.equals(NameHelper.getOwningClassifier(referenceClassifierProperty))){
//							return true;
							return !isMostDerived;
						}
					}
				}
			}
		}
		// implicit <<References>> within same <<InformationModel>>
		Package referencePropertyModel=NIEMHelper.getNearestInformationModel(referenceModelPropertyHolderProperty);
		Package referenceClassifierModel=NIEMHelper.getNearestInformationModel(referenceClassifier);
		if((referencePropertyModel!=null)&&referencePropertyModel.equals(referenceClassifierModel)){
			Property referenceNameMatchingProperty=NameHelper.getNameMatchingProperty(referenceModelPropertyHolderProperty,referenceClassifier);
			if(referenceNameMatchingProperty!=null){
				// should not have a <<References>> to another namespace, otherwise would have been caught above
				for(Dependency d:referenceNameMatchingProperty.getClientDependency()){
					for(NamedElement ne:d.getSupplier()){
						if(Property.class.isInstance(ne)){
							return false;
						}
					}
				}
				return !isMostDerived;
			}
			
		}
		for(Property subsettedReferenceProperty:referenceModelPropertyHolderProperty.getSubsettedProperty()){
			if(isPropertyHolderPropertySubsettingTypePropertyNested(subsettedReferenceProperty,referenceClassifier,false,didThat))return true;
		}
		/*
		Classifier referencePropertyClassifier=referenceProperty.getClassifier();
		if(referencePropertyClassifier!=null){
			for(DirectedRelationship dr:referencePropertyClassifier.get_directedRelationshipOfTarget()){
				if(NIEMHelper.isReferences(dr)){
					for(Element sourceElement:dr.getSource()){
						if(Classifier.class.isInstance(sourceElement)){
							Classifier referenceClassifierTest=(Classifier)sourceElement;
							if(referenceClassifier.equals(referenceClassifierTest)){
								for(Property t:referenceClassifier.getAttribute()){
									if(NameHelper.isMatchingProperty(referenceProperty,t)){
										return true;
									}
								}
							}
						}
					}
				}
			}
			
		}
		*/
		return false;
	}
	public static boolean doesSubsetPropertyExist(Property referenceProperty,Classifier subsetClassifier){
		//String referenceName=referenceProperty.getName();
		//if(referenceName==null)return true;
		return getSubsetProperty(referenceProperty,subsetClassifier)!=null;
	}
	public static Property getSubsetProperty(Property referenceProperty,Classifier subsetClassifier){
		if(subsetClassifier==null)return null;
		String referenceName=referenceProperty.getName();
		if(referenceName==null)return null;
		for(Property subsetPropertyTest:subsetClassifier.getAttribute()){
			if(NameHelper.isMatchingProperty(subsetPropertyTest,referenceProperty))return subsetPropertyTest;
			// the following should not be done; we expect an exact match
			// 
			// TODO: verify that this is not really needed
			//if(NameHelper.isMatchingSubstitutionGroupProperty(subsetPropertyTest,referenceProperty))return subsetPropertyTest;
			//if(referenceName.equals(subsetPropertyTest.getName()))return subsetPropertyTest;
		}
		return null;
		
	}
	public static EnumerationLiteral getSubsetEnumerationLiteral(EnumerationLiteral referenceEnumerationLiteral,Enumeration subsetClassifier){
		String referenceName=referenceEnumerationLiteral.getName();
		if(referenceName==null)return null;
//		for(EnumerationLiteral subsetEnumerationLiteralTest:NIEMHelper.getAllLiterals(subsetClassifier)){
		for(EnumerationLiteral subsetEnumerationLiteralTest:subsetClassifier.getOwnedLiteral()){
			if(NameHelper.isMatchingEnumerationLiteral(subsetEnumerationLiteralTest,referenceEnumerationLiteral))return subsetEnumerationLiteralTest;
		}
		return null;
		
	}
		/*
	public static Property getSubsetOwnedEnd(Property referenceProperty,AssociationClass subsetClassifier){
		String referenceName=referenceProperty.getName();
		if(referenceName==null)return null;
		for(Property subsetPropertyTest:subsetClassifier.getOwnedEnd()){
			if(NameHelper.isMatchingProperty(subsetPropertyTest,referenceProperty))return subsetPropertyTest;
			if(NameHelper.isMatchingSubstitutionGroupProperty(subsetPropertyTest,referenceProperty))return subsetPropertyTest;
			//if(referenceName.equals(subsetPropertyTest.getName()))return subsetPropertyTest;
		}
		return null;
		
	}
	*/
	static public Property getNameMatchingProperty(Property subsetProperty,Classifier referenceClassifier){
		Property referenceProperty=null;
		if(referenceClassifier==null)return null;
		//String subsetName=NameHelper.getNIEMName(subsetProperty);
		for(Property t:referenceClassifier.getAttribute()){
			if(isMatchingProperty(subsetProperty,t)){
				referenceProperty=(Property)t;
				break;
			}
		}
		return referenceProperty;
	}
	static public Property getMatchingProperty(Property subsetProperty,Classifier referenceClassifier){
		if(referenceClassifier==null)return null;
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return null;
		Property result=projectCache.getMatchingProperty(subsetProperty,referenceClassifier);
		if(result!=null)return result;
		if(projectCache.containsMatchingProperty(subsetProperty,referenceClassifier))return null;
		Property referenceProperty=getNameMatchingProperty(subsetProperty,referenceClassifier);
		// if not exact match, check for matching subset/ substitutionGroup
		if(referenceProperty==null){
			for(Property t:referenceClassifier.getAttribute()){
				if(isMatchingSubstitutionGroupProperty(subsetProperty,t)){
					referenceProperty=(Property)t;
					break;
				}
			}
		}
		projectCache.setMatchingProperty(subsetProperty,referenceClassifier,referenceProperty);
		return referenceProperty;
	}
	
	static public Property getResolvedSubstitutionGroupProperty(Property subsetProperty,Property referenceProperty){
		if((subsetProperty==null)||(referenceProperty==null))return null;
		Property resolvedReferenceProperty=getSubsetPropertyHolderProperty(referenceProperty);
		return getResolvedSubstitutionGroupPropertyNested(subsetProperty,resolvedReferenceProperty,new HashSet<Property>());
	}
	static public Property getResolvedSubstitutionGroupPropertyNested(Property subsetProperty,Property referenceProperty,Set<Property> didThat){
		if((subsetProperty==null)||(referenceProperty==null))return null;
		if(didThat.contains(referenceProperty))return null;
		// if the subsetProperty has a <<References>> to a PropertyHolder property, then
		//	we can do the transitive closure of "subsettedProperty" to check for a 
		// match on the referenceClassifier's referenceProperty
		
		if(isMatchingProperty(subsetProperty,referenceProperty))return referenceProperty;
		for(Property subsettedProperty:referenceProperty.get_propertyOfSubsettedProperty()){
			Property resolvedReferenceProperty=getResolvedSubstitutionGroupPropertyNested(subsetProperty,subsettedProperty,didThat);
			if(resolvedReferenceProperty!=null)return resolvedReferenceProperty;
		}
		return null;
	}
	static public boolean isMatchingSubstitutionGroupProperty(Property subsetProperty,Property referenceProperty){
		return isMatchingSubstitutionGroupPropertyNested(subsetProperty,referenceProperty,new HashSet<Property>());
	}
	static public boolean isMatchingSubstitutionGroupPropertyNested(Property subsetProperty,Property referenceProperty,Set<Property> didThat){
		if((subsetProperty==null)||(referenceProperty==null))return false;
		if(didThat.contains(subsetProperty))return false;
		// if the subsetProperty has a <<References>> to a PropertyHolder property, then
		//	we can do the transitive closure of "subsettedProperty" to check for a 
		// match on the referenceClassifier's referenceProperty
//		Property subsetPropertyHolderProperty=getSubsetPropertyHolderProperty(subsetProperty);
//		if(subsetPropertyHolderProperty==null)return false;
		Property resolvedSubsetProperty=getSubsetPropertyHolderProperty(subsetProperty);
		Property resolvedReferenceProperty=getSubsetPropertyHolderProperty(referenceProperty);
		if(resolvedSubsetProperty==null)resolvedSubsetProperty=subsetProperty;
		if(resolvedReferenceProperty==null)resolvedReferenceProperty=referenceProperty;

		if(isMatchingProperty(resolvedSubsetProperty,resolvedReferenceProperty))return true;
		for(Property subsettedProperty:resolvedSubsetProperty.getSubsettedProperty()){
			if(isMatchingSubstitutionGroupPropertyNested(subsettedProperty,resolvedReferenceProperty,didThat))return true;
		}
		return false;
	}
	static public Property getSubsetPropertyHolderProperty(Property subsetProperty){
		if(NIEMHelper.isPropertyHolder(subsetProperty.getClassifier()))return subsetProperty;
 		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return null;
		Map<Property,Property> propertyToPropertyHolderPropertyMap=projectCache.getPropertyToPropertyHolderPropertyMap();
		Property result=propertyToPropertyHolderPropertyMap.get(subsetProperty);
		if(result!=null)return result;
		if(propertyToPropertyHolderPropertyMap.containsKey(subsetProperty))return null;
		propertyToPropertyHolderPropertyMap.put(subsetProperty, null);
		
		//boolean hasExplicitPropertyHolder=false;
		Property propertyHolderPropertyTest=getReferencesPropertyHolderProperty(subsetProperty);
		//System.out.println("getSubsetPropertyHolderProperty "+propertyHolderPropertyTest+", "+subsetProperty.getQualifiedName());
		if(propertyHolderPropertyTest!=null){
			propertyToPropertyHolderPropertyMap.put(subsetProperty,propertyHolderPropertyTest);
			return propertyHolderPropertyTest;
		}
		// implicit PropertyHolder
		//if(!hasExplicitPropertyHolder){
			// check all property holders for match
	    	Package informationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
	    	if(informationModel!=null){
	    		Property propertyHolderProperty=getNameToPropertyHolderPropertyMap(informationModel).get(subsetProperty.getName());
	    		if(propertyHolderProperty!=null){
					propertyToPropertyHolderPropertyMap.put(subsetProperty, propertyHolderProperty);
					return propertyHolderProperty;
	    		}
	    		/*
	    		for(Type propertyHolderType:informationModel.getOwnedType()){
					boolean referenceIsPropertyHolder=NIEMHelper.isPropertyHolder(propertyHolderType);
					if(referenceIsPropertyHolder){
						for(Property propertyHolderProperty:((Classifier)propertyHolderType).getAttribute()){
							if(NameHelper.isMatchingProperty(subsetProperty, propertyHolderProperty)){
								propertyToPropertyHolderPropertyMap.put(subsetProperty, propertyHolderProperty);
								return propertyHolderProperty;
							}
						}
					}
	    		}
	    		*/
	    	}
		//}
		return null;
	}
	static public Map<String,Property> getNameToPropertyHolderPropertyMap(Package referencePackage){
 		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return new HashMap<String,Property>();
		Map<Package,Map<String,Property>> propertyToPropertyHolderPropertyMap=projectCache.getNameToPropertyHolderPropertyMap();
		Map<String,Property> referenceNameToPropertyHolderPropertyMap=propertyToPropertyHolderPropertyMap.get(referencePackage);
		if(referenceNameToPropertyHolderPropertyMap!=null)return referenceNameToPropertyHolderPropertyMap;

		referenceNameToPropertyHolderPropertyMap=new HashMap<String,Property>();
		propertyToPropertyHolderPropertyMap.put(referencePackage, referenceNameToPropertyHolderPropertyMap);
		for(Type type:referencePackage.getOwnedType()){
			if(NIEMHelper.isPropertyHolder(type)){
				for(Property referencePropertyHolderProperty:((Classifier)type).getAttribute()){
					referenceNameToPropertyHolderPropertyMap.put(referencePropertyHolderProperty.getName(), referencePropertyHolderProperty);
				}
			}
		}
		return referenceNameToPropertyHolderPropertyMap;
	}
	
	static public Property getReferencesPropertyHolderProperty(Property subsetProperty){
    	//Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
    	//if(subsetInformationModel==null)return null;
    	//String subsetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetInformationModel);
    	//if(subsetNamespace==null)return null;
		//System.out.println("getReferencesPropertyHolderProperty "+subsetProperty.getClientDependency());
		for(Dependency test:subsetProperty.getClientDependency()){
			if(NIEMHelper.isReferences(test)){
				for(NamedElement supplier:test.getSupplier()){
					if(Property.class.isInstance(supplier)){
						//System.out.println("getReferencesPropertyHolderProperty supplier "+supplier.getQualifiedName());
				    	Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
				    	if(informationModel==null)continue;
				    	// it does not need to be a <<PropertyHolder>> or in another namespace
						return (Property)supplier;
				    	
				    	/*
						boolean referenceIsPropertyHolder=NIEMHelper.isPropertyHolder(((Property)supplier).getClassifier());
						if(referenceIsPropertyHolder){
							return (Property)supplier;
						}else{
							// it does not need to be a <<PropertyHolder>>, if it is in another namespace
							if(!subsetNamespace.equals(NIEMHelper.getNamespaceTargetNamespace(informationModel))){
								return (Property)supplier;
							}
						}
						*/
					}
				}
			}
		}
		return null;
	}
	static public Set<Property> getSubsetPropertyHolderPropertyUsage(Property subsetProperty){
    	Set<Property> result=new HashSet<Property>();
		if(!NIEMHelper.isPropertyHolder(subsetProperty.getClassifier()))return result;
		boolean hasExplicitPropertyHolder=false;
		for(DirectedRelationship test:subsetProperty.get_directedRelationshipOfTarget()){
			if(NIEMHelper.isReferences(test)){
				for(NamedElement supplier:((Dependency)test).getClient()){
					if(Property.class.isInstance(supplier)){
				    	Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
				    	if(informationModel==null)continue;
						boolean referenceIsPropertyHolder=NIEMHelper.isPropertyHolder(((Property)supplier).getClassifier());
						if(!referenceIsPropertyHolder)result.add((Property)supplier);
						hasExplicitPropertyHolder=true;
					}
				}
			}
		}
		// implicit PropertyHolder
		if(!hasExplicitPropertyHolder){
			// check all property holders for match
	    	Package informationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
	    	if(informationModel!=null){
	    		for(Type propertyHolderType:informationModel.getOwnedType()){
					boolean referenceIsPropertyHolder=NIEMHelper.isPropertyHolder(propertyHolderType);
					if(!referenceIsPropertyHolder){
						for(Property propertyHolderProperty:((Classifier)propertyHolderType).getAttribute()){
							if(NameHelper.isMatchingProperty(subsetProperty, propertyHolderProperty)){
								result.add( propertyHolderProperty);
							}
						}
					}
	    		}
	    	}
		}
		return result;
	}
	static public Classifier getOwningClassifier(Property property){
		Association association=property.getAssociation();
		if(AssociationClass.class.isInstance(association))return association;
		Classifier result=property.getClassifier();
		if(result==null){
			result=property.getOwningAssociation();
		}
		return result;
	}
	static public boolean isMatchingProperty(Property subsetProperty,Property referenceProperty){
		if((subsetProperty==null)||(referenceProperty==null))return false;
		if(subsetProperty.equals(referenceProperty))return true;
		// assuming max of one xsd:any
		if(NIEMHelper.isXSDAny(subsetProperty)&&NIEMHelper.isXSDAny(referenceProperty))return true;
		if(NIEMHelper.isXSDAny(referenceProperty))return true;
		if(NIEMHelper.isXSDAny(subsetProperty))return false;
		if(NIEMHelper.isXSDElement(subsetProperty)!=NIEMHelper.isXSDElement(referenceProperty))return false;
		// make sure we test the resolved property
		Property resolvedSubsetProperty=getSubsetPropertyHolderProperty(subsetProperty);
		Property resolvedReferenceProperty=getSubsetPropertyHolderProperty(referenceProperty);
		if(resolvedSubsetProperty==null)resolvedSubsetProperty=subsetProperty;
		if(resolvedReferenceProperty==null)resolvedReferenceProperty=referenceProperty;
		String clientName=NameHelper.getNIEMName(resolvedSubsetProperty);
		//System.out.println("isMatchingProperty "+clientName+", "+resolvedSubsetProperty.getQualifiedName()+", "+resolvedReferenceProperty.getQualifiedName());
		if (!clientName.equals(NameHelper.getNIEMName(resolvedReferenceProperty))){
			return false;
		}
		// need to check namespace.........................
		if(!getPropertyNamespace(resolvedSubsetProperty).equals(getPropertyNamespace(resolvedReferenceProperty))){
			return false;
		}
		return true;
	}
	static public boolean isMatchingEnumerationLiteral(EnumerationLiteral subsetEnumerationLiteral,EnumerationLiteral referenceEnumerationLiteral){
		if((subsetEnumerationLiteral==null)||(referenceEnumerationLiteral==null))return false;
		if(subsetEnumerationLiteral.equals(referenceEnumerationLiteral))return true;
		String clientName=NameHelper.getNIEMName(subsetEnumerationLiteral);
		return (clientName.equals(NameHelper.getNIEMName(referenceEnumerationLiteral)));
	}
	static protected String getPropertyNamespace(Property property){
		Package propertyInformationModel=getPropertyInformationModel(property);
		if(propertyInformationModel==null)return "UNKNOWN";
		String result= NIEMHelper.getNamespaceTargetNamespace(propertyInformationModel);
		if(result==null)return "UNKNOWN";
		return result;
	}
	static public Package getPropertyInformationModel(Property property){
		// either explicit references or owning model
		for(Dependency d:property.getClientDependency()){
			if(NIEMHelper.isReferences(d)){
				for(Element supplier:d.getSupplier()){
					if(Property.class.isInstance(supplier)){
						Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
						if(informationModel!=null)return informationModel;
					}
				}
			}
		}
		return NIEMHelper.getNearestInformationModel(property);
	}
	static public Classifier getMatchingType(Classifier clientClassifier,Package referenceModel){
		if(referenceModel==null)return null;
		Classifier referenceClassifier=getMatchingTypeQuick(clientClassifier,referenceModel);
		if(referenceClassifier!=null)return referenceClassifier;
		//String clientName=NameHelper.getNIEMName(clientClassifier);
		for(Type t:referenceModel.getOwnedType()){
			if(isMatchingType(clientClassifier,t)){
				referenceClassifier=(Classifier)t;
				break;
			}
			// check for anonymous types
			if(!(t instanceof Class))continue;
			Class c=(Class)t;
			for(Classifier nested:c.getNestedClassifier()){
				if(isMatchingType(clientClassifier,nested)){
					referenceClassifier=(Classifier)nested;
					break;
				}
			}
			if(referenceClassifier!=null)break;
		}
		if(referenceClassifier==null){
			// check if this is an attributeGroupDefinition
			Package attributeGroupDefinition=clientClassifier.getOwningPackage();
			if(isAttributeGroupDefinition(attributeGroupDefinition)){
				for(Package referenceAttributeGroupDefinition:referenceModel.getNestedPackage()){
					if(isAttributeGroupDefinition(referenceAttributeGroupDefinition)){
						for(Type t:referenceAttributeGroupDefinition.getOwnedType()){
							if(isMatchingType(clientClassifier,t)){
								referenceClassifier=(Classifier)t;
								break;
							}
						}
						if(referenceClassifier!=null)break;
					}
				}
			}
		}
		return referenceClassifier;
	}
	static protected boolean isAttributeGroupDefinition(Package p){
		return("attributeGroupDefinition".equals(p.getName()));
	}
	static public Classifier getMatchingTypeQuick(Classifier clientClassifier,Package referenceModel){
		if(clientClassifier==null)return null;
		if(referenceModel==null)return null;
		String clientName=clientClassifier.getName();
		if(clientName==null)return null;
		for(Type t:referenceModel.getOwnedType()){
			if(clientName.equals(t.getName())&&Classifier.class.isInstance(t))return (Classifier)t;
		}
		return null;
	}
	static public boolean isMatchingType(Classifier subsetClassifier,Type referenceType){
		String clientName=NameHelper.getNIEMName(subsetClassifier);
		return (Classifier.class.isInstance(referenceType)&&clientName.equals(NameHelper.getNIEMName((Classifier)referenceType)));
	}
	static public String getNIEMName(Property property){
		String niemName=NIEMHelper.getDeclaredNIEMName(property);
		if(niemName!=null)return niemName;
		String suffix="";//NameHelper.getRepresentationTerm(property);
		//String baseName=property.getName();
    	String result=getNIEMName(property,suffix);
		return result;
	}
	static public String getNIEMName(EnumerationLiteral property){
		String niemName=NIEMHelper.getDeclaredNIEMName(property);
		if(niemName!=null)return niemName;
		return property.getName();
	}
	
	static public String getNIEMName(Classifier classifier){
		String niemName=NIEMHelper.getDeclaredNIEMName(classifier);
		if(niemName!=null)return niemName;
		String suffix="";
		String baseName=classifier.getName();
		if(!NIEMHelper.isInInformationModel(classifier))return baseName;
		if(PrimitiveType.class.isInstance(classifier)){
			// probably SimpleType if enhanced with ValueRestriction
			// otherwise Type
			if(NIEMHelper.isInXmlTypeLibrary(classifier)){
				//  no name change
				return baseName;
			//}else if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(ValueRestrictionStereotypeName))){
			}else if(NIEMHelper.isPimSimpleTypeDefinitionBase((PrimitiveType)classifier)){
				suffix=SIMPLETYPE_SUFFIX;
			}else{
				suffix=TYPE_SUFFIX;
			}
		}else if(Enumeration.class.isInstance(classifier)){
			// could be CodeSimpleType or CodeType-->depends on general and existence of ownedLiteral
			if(!NIEMHelper.isEnumerationComplexType((Enumeration)classifier)){
				suffix=CODESIMPLETYPE_SUFFIX;
			}else{
				suffix=CODETYPE_SUFFIX;
			}
		}else if(DataType.class.isInstance(classifier)){
			// could be List or Union or SimpleType or Type general
			if(NIEMHelper.isDataTypeSimpleType((DataType)classifier)){
//			if(classifier.getGeneral().isEmpty()||NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(ValueRestrictionStereotypeName))){
				suffix=SIMPLETYPE_SUFFIX;
			}else{
				suffix=TYPE_SUFFIX;
			}
		}else{
			// could be PropertyHolder, Augmentation, Association,  or Type depending upon general
			// propagate stereotype
			if(NIEMHelper.isAssociationType(classifier)){
				suffix=ASSOCIATION_SUFFIX;
			}
			else if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName))){
				suffix=TYPE_SUFFIX;
			}
			else if(NIEMHelper.isAugmentationType(classifier)){
				suffix=AUGMENTATION_SUFFIX;
			}
			else if(NIEMHelper.isMetadataType(classifier)){
				suffix=METADATA_SUFFIX;
			}
			else if(NIEMHelper.isAdapterType(classifier)){
				suffix=ADAPTER_SUFFIX;
			}
			else if(NIEMHelper.isChoice(classifier)){
				//  no name change
				return baseName;
			}
			else if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
				//  no name change
				return baseName;
			}else{
				suffix=TYPE_SUFFIX;
			}
		}
		
    	String result=getNIEMName(classifier,suffix);
		return result;
	}
	static protected String getNIEMName(Classifier classifier,String suffix){
		String baseName=classifier.getName();
    	String result=getBaseClassifierName(baseName);
    	result=result+suffix;
		return result;
	}
	static protected String getNIEMName(Property property,String suffix){
		String baseName=property.getName();
    	String result=getBasePropertyName(baseName);
//    	String suffix=NameHelper.getRepresentationTerm(clientProperty);
//    	String uniqueName=NameHelper.getUniquePropertyName(clientProperty,baseName,suffix);
    	
    	result=result+suffix;
		return result;
	}
	
	public static void fixClassifierName(Classifier classifier,String suffix){
    	//classifier.setName(classifier.getName()+suffix);
		String baseName=classifier.getName();
		if((baseName==null)||"".equals(baseName))baseName="My";
		fixClassifierName(classifier,baseName,suffix);
		/*
    	String baseName=getBaseClassifierName(classifier.getName());
    	String uniqueName=getUniqueClassifierName(classifier,baseName,suffix);
    	classifier.setName(uniqueName);
    	*/
	}
	public static void fixClassifierName(Classifier classifier,String prefix,String suffix){
    	//classifier.setName(classifier.getName()+suffix);
    	String baseName=getBaseClassifierName(prefix);
    	String uniqueName=getUniqueClassifierName(classifier,baseName,suffix);
    	classifier.setName(uniqueName);
	}
	public static void fixPropertyName(Property property,String prefix,String suffix){
    	//classifier.setName(classifier.getName()+suffix);
    	String baseName=getBasePropertyName(prefix);
    	String uniqueName=getUniquePropertyName(property,baseName,suffix);
    	property.setName(uniqueName);
	}
	public static  String getRepresentationTerm(Property property)
    {
		Type typeTest=property.getType();
		if((typeTest==null)||!Classifier.class.isInstance(typeTest))return "";
		Classifier type=(Classifier)typeTest;
    	String term="";
		if(!(PrimitiveType.class.isInstance(type)||Enumeration.class.isInstance(type))){
			if(NIEMHelper.isAugmentationType(type))term="Augmentation";
			else if(NIEMHelper.isAssociationType(type))term="Association";
			else if(NIEMHelper.isMetadataType(type))term="Metadata";
			if(NIEMHelper.isReferenceProperty(property))term=term+REFERENCE_SUFFIX;
			return term;
		}
    	term="Text";
    	if(Enumeration.class.isInstance(type))term="Code";
    	else if(isBoolean(type))term="Indicator";
    	else if(isNumeric(type))term="Numeric";
    	else if(isDate(type))term="Date";
    	else if(isDateTime(type))term="DateTime";
    	else if(isBinary(type))term="BinaryObject";
    	else if(isID(type))term="ID";
    	else if(isAnyURI(type))term="URI";
    	return term;
    }
	static public boolean isBoolean(Classifier type){
    	if("boolean".equals(type.getName()))return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isBoolean(parent))return true;
    	}
    	return false;
    }
	static protected boolean isAnyURI(Classifier type){
    	String name=type.getName();
    	if("anyURI".equals(name))return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isAnyURI(parent))return true;
    	}
    	return false;
    }
	static protected boolean isID(Classifier type){
    	String name=type.getName();
    	if("ID".equals(name))return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isID(parent))return true;
    	}
    	return false;
    }
	static protected boolean isBinary(Classifier type){
    	String name=type.getName();
    	if("base64Binary".equals(name)||"hexBinary".equals(name))return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isBinary(parent))return true;
    	}
    	return false;
    }
	static protected boolean isNumeric(Classifier type){
    	String name=type.getName();
    	if("float".equals(name)||"double".equals(name)||"decimal".equals(name))return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isNumeric(parent))return true;
    	}
    	return false;
    }
	static protected boolean isDateTime(Classifier type){
    	String name=type.getName();
    	if("duration".equals(name)
    			||"dateTime".equals(name)
    			||"time".equals(name)
    			||"date".equals(name)
    			||"gYearMonth".equals(name)
    			||"gYear".equals(name)
    			||"gMonthDay".equals(name)
    			||"gDay".equals(name)
    			||"gMonth".equals(name)
    			)return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isDateTime(parent))return true;
    	}
    	return false;
    }
	static protected boolean isDate(Classifier type){
    	String name=type.getName();
    	if("date".equals(name)
    			||"gYearMonth".equals(name)
    			||"gYear".equals(name)
    			||"gMonthDay".equals(name)
    			||"gDay".equals(name)
    			||"gMonth".equals(name)
    			)return true;
    	for(Classifier parent:type.getGeneral()){
    		if(isDate(parent))return true;
    	}
    	return false;
    }
	
	public static String getBaseClassifierName(String name){
    	//  clear name of any standard modifiers
		/*
		String result=name.replace(TYPE_SUFFIX, "")
			.replace(SIMPLE_MODIFIER, "")
			.replace(CODE_MODIFIER, "")
			.replace(AUGMENTATION_MODIFIER, "")
			.replace(METADATA_MODIFIER, "")
			.replace(ASSOCIATION_MODIFIER, "")
			.replace(ADAPTER_MODIFIER, "");
		result=toNCName(result);
		result=toUpperFirstLetter(result);
		return result;
		*/
		return getSimpleBaseClassifierName(name).replace(CODE_MODIFIER, "")
				.replace(AUGMENTATION_MODIFIER, "")
				.replace(METADATA_MODIFIER, "")
				.replace(ASSOCIATION_MODIFIER, "")
				.replace(ADAPTER_MODIFIER, "");
	}
	public static String getSimpleBaseClassifierName(String name){
    	//  clear name of any standard modifiers
		String result=name.replace(TYPE_SUFFIX, "")
			.replace(SIMPLE_MODIFIER, "")
			;
		result=toNCName(result);
		result=toUpperFirstLetter(result);
		return result;
	}
	public static String getBasePropertyName(String name){
    	//  clear name of any standard modifiers
		/*
    	String term="Text";
    	if(Enumeration.class.isInstance(type))term="Code";
    	else if(isBoolean(type))term="Indicator";
    	else if(isNumeric(type))term="Numeric";
    	else if(isDateTime(type))term="DateTime";
    	else if(isBinary(type))term="BinaryObject";
    	else if(isID(type))term="ID";
    	else if(isAnyURI(type))term="URI";
    	*/
    	String result=name;
    	/*
		String result=name.replace(TYPE_SUFFIX, "")
			.replace(SIMPLE_MODIFIER, "")
			.replace(CODE_MODIFIER, "")
			.replace(AUGMENTATION_MODIFIER, "")
			.replace(METADATA_MODIFIER, "")
			.replace(ASSOCIATION_MODIFIER, "")
			.replace(ADAPTER_MODIFIER, "");
			*/
		result=toNCName(result);
		//result=toUpperFirstLetter(result);
		return result;
	}
	public static String toNCName(String name){
		String result=name.replace("/","_").replace(" ","")
		.replace("<","_").replace(">","_").replace("(","_").replace(")","_").replace(",","_").replace("=","");
		if(result.length()>0){
			char first=result.charAt(0);
			if(!Character.isLetter(first)){
				result="A"+result;
			}
		}
		return result;
	}
	public static String toUpperFirstLetter(String name){
		String result=name;
		if(name.length()>1){
			result=name.substring(0,1).toUpperCase()+name.substring(1);
		}else if(name.length()>0){
			result=name.toUpperCase();
		}
		return result;
	}
	public static String toLowerFirstLetter(String name){
		String result=name;
		if(name.length()>1){
			result=name.substring(0,1).toLowerCase()+name.substring(1);
		}else if(name.length()>0){
			result=name.toLowerCase();
		}
		return result;
	}
	public static String getUniqueClassifierName(Classifier classifier,String baseName,String suffix){
    	//  make sure unique
		String proposedName=baseName+suffix;
		if(isClassifierNameUnique(classifier,proposedName))return proposedName;
		int index=1;
		while(true){
			proposedName=baseName+index+suffix;
			if(isClassifierNameUnique(classifier,proposedName))return proposedName;
			index++;
		}
	}
	protected static boolean isClassifierNameUnique(Classifier classifier,String name){
		Element owner=classifier.getOwner();
		if(Package.class.isInstance(owner)){
			for(Type t:((Package)owner).getOwnedType()){
				if(t.equals(classifier))continue;
				if(name.equals(t.getName()))return false;
			}
		}
		return true;
		
	}
	public static String getUniquePackageName(Package property,String baseName,String suffix){
    	//  make sure unique
		String proposedName=baseName+suffix;
		if(isPackageNameUnique(property,proposedName))return proposedName;
		int index=1;
		while(true){
			proposedName=baseName+index+suffix;
			if(isPackageNameUnique(property,proposedName))return proposedName;
			index++;
		}
	}
	protected static boolean isPackageNameUnique(Package classifier,String name){
		Package owner=classifier.getNestingPackage();
		if(owner!=null){
			for(Package t:owner.getNestedPackage()){
				if(t.equals(classifier))continue;
				if(name.equals(t.getName()))return false;
			}
		}
		return true;
		
	}
	public static String getUniquePropertyName(Property property,String baseName,String suffix){
    	//  make sure unique
		String proposedName=baseName+suffix;
		if(isPropertyNameUnique(property,proposedName))return proposedName;
		int index=1;
		while(true){
			proposedName=baseName+index+suffix;
			if(isPropertyNameUnique(property,proposedName))return proposedName;
			index++;
		}
	}
	protected static boolean isPropertyNameUnique(Property classifier,String name){
		Element owner=classifier.getOwner();
		if(Classifier.class.isInstance(owner)){
			for(Property t:((Classifier)owner).getAttribute()){
				if(t.equals(classifier))continue;
				if(name.equals(t.getName()))return false;
			}
		}
		return true;
		
	}
	public static String getUniqueInstanceSpecificationName(Package owner,String baseName){
    	//  make sure unique
		String proposedName=baseName;
		if(isInstanceSpecificationNameUnique(owner,proposedName))return proposedName;
		int index=1;
		while(true){
			proposedName=baseName+index;
			if(isInstanceSpecificationNameUnique(owner,proposedName))return proposedName;
			index++;
		}
	}
	protected static boolean isInstanceSpecificationNameUnique(Package owner,String name){
			for(PackageableElement t:owner.getPackagedElement()){
				if(!InstanceSpecification.class.isInstance(t))continue;
				if(name.equals(t.getName()))return false;
			}
		return true;
		
	}
	public static String getUniqueConstraintName(Namespace owner,String baseName){
    	//  make sure unique
		String proposedName=baseName;
		if(isConstraintNameUnique(owner,proposedName))return proposedName;
		int index=1;
		while(true){
			proposedName=baseName+index;
			if(isConstraintNameUnique(owner,proposedName))return proposedName;
			index++;
		}
	}
	protected static boolean isConstraintNameUnique(Namespace owner,String name){
			for(Constraint t:owner.getOwnedRule()){
				if(name.equals(t.getName()))return false;
			}
		return true;
		
	}
}
