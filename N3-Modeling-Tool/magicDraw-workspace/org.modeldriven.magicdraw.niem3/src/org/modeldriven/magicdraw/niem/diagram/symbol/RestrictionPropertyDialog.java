package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.Frame;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.ui.dialogs.SelectElementInfo;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlgFactory;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

public class RestrictionPropertyDialog  implements NIEM_ProfileConstants,ToolTipConstants{
	 public RestrictionPropertyDialog(PresentationElement pe,Class browserClassifier){
		try{
			// selection dialog consisting of available restriction properties;
			//  after selection, create restriction properties copied from base
			Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
			DiagramPresentationElement diagram=null;
			Class clientClassifier=browserClassifier;
			if(DiagramPresentationElement.class.isInstance(pe)){
				diagram=(DiagramPresentationElement)pe;
				Element diagramOwner=diagram.getElement().getOwner();
				if(!Class.class.isInstance(diagramOwner))return;
				clientClassifier=(Class)diagramOwner;
			}
			else if (pe!=null) {
				diagram=pe.getDiagramPresentationElement();
				Element diagramPackage=pe.getElement();
				if(!Class.class.isInstance(diagramPackage))return;
				clientClassifier=(Class)diagramPackage;
			}
			Package clientPackage=NIEMHelper.getNearestInformationModel(clientClassifier);
			if((clientPackage==null)||!NIEMHelper.isInformationModel(clientPackage))return;
			
			// pre-populate ordered selection;
			// determine available properties here instead of accept
			// merge results later, check if already present
			// resequence: make sure to include particle attribution, etc
			// augmentation? roleOf?
			// 
			
			// get the restriction class
			Collection<Class> restrictedClass=getRestrictedClasses(clientClassifier);
			if(restrictedClass.size()==0){return;}
			//final Collection<Class> restrictedClassifierTest=restrictedClass;
			//final Classifier subsetClassifierTest=clientClassifier;
			//final Classifier referenceClassifierTest=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetClassifierTest);

			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,getTitle(),"niem_uml_profile_common_propertySelectionRestriction");
			 
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			
			 Element root=NIEMHelper.getModelRoot();
			 
				final Set<Property> restrictionModelProperties=new HashSet<Property>();

				// examine, in order, all properties from restriction and its generalization
				// for each property, also enable selection of its <<PropertyHolder>> counterpart and all substitutionGroups

				for(Class restricted:restrictedClass){
					Package restrictionPackage=NIEMHelper.getNearestInformationModel(restricted);
					if(restrictionPackage==null)continue;
					Map<String,Property> referenceNameToPropertyHolderPropertyMap=NameHelper.getNameToPropertyHolderPropertyMap(restrictionPackage);
					addRestrictionProperties(restricted,restrictionModelProperties,referenceNameToPropertyHolderPropertyMap);
				}
			 
			 
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same restriction classifier
				@Override
				public boolean accept(BaseElement referenceElement) {
					if(!Property.class.isInstance(referenceElement))return false;
					//return acceptProperty((Property)referenceElement,subsetClassifierTest,restrictedClassifierTest,referenceClassifierTest);
					return(restrictionModelProperties.contains(referenceElement));
				}

				@Override
				public boolean accept(BaseElement baseElement,
						boolean arg1) {
					// TODO Auto-generated method stub
					return accept(baseElement);
				}
				protected Collection<java.lang.Class> types=null;
				@Override
				public Collection<java.lang.Class> getTypes() {
					if(types==null){
						types=new Vector();
						types.add(Property.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
//			 java.util.List<?> selection=new Vector();
			 java.util.List<Property> selection=new Vector<Property>();
			 java.util.List<Property> originals=new Vector<Property>();
			 for(Property restrictionProperty:NIEMHelper.getOwnedAttribute(clientClassifier)){
					 originals.add(restrictionProperty);
						for(Property selectedProperty:restrictionModelProperties){
							if(NameHelper.isMatchingProperty(restrictionProperty, selectedProperty)){
								selection.add(selectedProperty);
								break;
							}
						}
			 }
			 
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_RESTRICTION_PROPERTY_DIALOG_DESCRIPTION_TITLE,ADD_RESTRICTION_PROPERTY_DIALOG_DESCRIPTION);
			 

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
					Collection<Property> addedProperties=new Vector<Property>();
				 boolean isSessionCreated=NIEMHelper.createSession("subset");
				 try{
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 /*
			    	 Property addedProperty=addRestrictionProperty((Property)baseElement,clientClassifier,referenceClassifierTest);
			    	 if(addedProperty!=null){
			    		 addedProperties.add(addedProperty);
			    		 
			    	 }
			    	 */
			    	 
			    	 Property currentProperty=SubstitutionGroupDecompositionDialogHelper.INSTANCE.getCurrentProperty((Property)baseElement,originals);
			    	 if(currentProperty!=null){
			    		 originals.remove(currentProperty);
			    		 NIEMHelper.getOwnedAttribute(clientClassifier).add(currentProperty);
			    		 //System.out.println("currentProperty "+currentProperty.getQualifiedName());
			    		 continue;
			    	 }
			    	 Property useTopLevelProperty=NameHelper.getSubsetPropertyHolderProperty((Property)baseElement);
			    	 if(useTopLevelProperty==null){
			    		 useTopLevelProperty=(Property)baseElement;
			    	 }
//			    	 Property addedProperty=NameHelper.addPropertyToSubsetClassifier((Property)baseElement,clientClassifier,false);
			    	 Property addedProperty=NameHelper.addPropertyToSubsetClassifier(useTopLevelProperty,clientClassifier,false);
		    		 //System.out.println("added Property "+addedProperty.getQualifiedName());
			    	 
			     }
				 NIEMHelper.getOwnedAttribute(clientClassifier).removeAll(originals);
				 for(Property original:originals){
					 if(original.getOwner()==null){
						 NIEMHelper.getOwnedAttribute(clientClassifier).add(original);
			    		 //System.out.println("remove original Property "+original.getQualifiedName());
						 NIEMHelper.removeElement(original);
					 }
				 }
		     
			     resequenceClassifierRestrictionProperties(clientClassifier,restrictedClass);
				 }finally{
					  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
					/*
					// let model updates propagate to current diagram elements, then start adding new stuff to diagram 	
					Set<PresentationElement> newElements=new HashSet<PresentationElement>();
					isSessionCreated=NIEMHelper.createSession("subset");
					try{
					     for(Property addedProperty:addedProperties){
								// make sure added elements on diagram:
					    	 	//    make sure dependencies and targets are on diagram
					    	 SubsetDialogHelper.addPropertyPresentationElements(addedProperty,pe,diagram,element2presentation,newElements);
					     }
					}finally{
						NIEMHelper.closeSession(isSessionCreated);
					}
					SubsetDialogHelper.layoutNewItems(diagram,newElements);
					*/
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}
	 protected void addRestrictionProperties(Class restrictedClass,Set<Property> restrictionModelProperties,
			 Map<String,Property> subsetNameToPropertyHolderPropertyMap){
		 Classifier extension=NIEMHelper.getBaseExtensionClassifier(restrictedClass);
		 if(extension instanceof Class)addRestrictionProperties((Class)extension,restrictionModelProperties,subsetNameToPropertyHolderPropertyMap);
		 
			for(Property referenceModelProperty:restrictedClass.getOwnedAttribute()){
				// exclude properties already included
				Property resolvedProperty=SubsetDialogHelper.getResolvedProperty(referenceModelProperty,subsetNameToPropertyHolderPropertyMap);
				//if(subsetNamespaceName.contains(SubsetDialogHelper.toNamespaceName(resolvedProperty)))continue;
				restrictionModelProperties.add(referenceModelProperty);
				// add any implicit or explicit PropertyHolder properties plus all of their substitutionGroups
				Property restrictionPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(referenceModelProperty);
				if(restrictionPropertyHolderProperty==null){
					restrictionPropertyHolderProperty=subsetNameToPropertyHolderPropertyMap.get(NameHelper.getPropertyMapName(referenceModelProperty));
				}
				if(restrictionPropertyHolderProperty!=null){
					restrictionModelProperties.add(restrictionPropertyHolderProperty);
					SubsetDialogHelper.addAllSubstitutionGroups(restrictionPropertyHolderProperty,restrictionModelProperties);
				}
				
			}
		 
	 }
	 
     protected void resequenceClassifierRestrictionProperties(Classifier clientClassifier,Collection<Class> restrictedClass){
    	 for(Class restricted:restrictedClass){
    		 RestrictionRedefinition.INSTANCE.resequenceClassifierRestrictionProperties(clientClassifier,restricted);
    	 }
     }
     /*
		protected boolean acceptProperty(Property restrictedProperty,
					Classifier subsetClassifier,
					Collection<Class> restrictedClassifiers
//					Class restrictedClassifiers
					,Classifier referenceClassifierTest) {
			Classifier restrictedClassifier=restrictedProperty.getClassifier();
			if(restrictedClassifier==null)return false;
			if(!restrictedClassifiers.contains(restrictedClassifier)){
//			if(!restrictedClassifier.equals(restrictedClassifiers)){
				return false;
			}
			return !doesSubsetPropertyExist((Property)restrictedProperty,subsetClassifier);
		}
		*/
	 protected String getTitle(){
		return("Select Restriction Properties");

	 }
	 protected Collection<Class> getRestrictedClasses(Classifier clientClassifier){
		 return NIEMHelper.getRestrictedClasses(clientClassifier);
	 }
	 
		protected  Property addRestrictionProperty(Property referenceProperty,Class subsetContext,Classifier referenceClassifierTest){
			// does it already exist?
			Property existingProperty=getSubsetProperty(referenceProperty,subsetContext);
			if(existingProperty!=null)return existingProperty;
			Property subsetProperty=NIEMFactory.instance.shallowPropertyCopy(referenceProperty);
			subsetContext.getOwnedAttribute().add(subsetProperty);
			// check type....and any other references at this level.....
			Type type=referenceProperty.getType();
			if(type!=null){
				subsetProperty.setType(type);
			}
			boolean hasReferences=false;
			Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
			String subsetNamespace="";
			if(subsetInformationModel!=null)subsetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetInformationModel);
			Package referenceInformationModel=NIEMHelper.getNearestInformationModel(referenceProperty);
			String referenceNamespace="";
			if(referenceInformationModel!=null)referenceNamespace=NIEMHelper.getNamespaceTargetNamespace(referenceInformationModel);
			for(Dependency d:referenceProperty.getClientDependency()){
				for(NamedElement ne:d.getSupplier()){
					if(NIEMHelper.isReferences(d)&&Property.class.isInstance(ne)){
						hasReferences=true;
					}
					NIEMFactory.instance.createDependencyInstance(d, subsetProperty, ne);
				}
			}
			//  check if we need to add a <<References>> here
			if(!hasReferences&&(subsetNamespace!=null)&&!subsetNamespace.equals(referenceNamespace)){
				// need to add <<References>>
				Realization references=Application.getInstance().getProject().getElementsFactory().createRealizationInstance();
				references.getClient().add(subsetProperty);
				references.getSupplier().add(referenceProperty);
				// get applied stereotypes on example and apply to new 
				NIEMHelper.addStereotype(references,NIEMHelper.getReferencesStereotype());
				references.setName(referenceProperty.getName());
				references.setVisibility(referenceProperty.getVisibility());
				NIEMHelper.getNearestPackage(subsetProperty).getPackagedElement().add(references);
				
			}
			return subsetProperty;
		}
		////////////////////////////////////////////////////////////////////////
		protected Property getSubsetProperty(Property referenceProperty,Classifier subsetClassifier){
			//return NameHelper.getMatchingProperty(subsetProperty, referenceClassifier);
			
			//String referenceName=referenceProperty.getName();
			//if(referenceName==null)return null;
			for(Property subsetProperty:subsetClassifier.getAttribute()){
				if(NameHelper.isMatchingProperty(subsetProperty, referenceProperty)) return subsetProperty;
				//if(referenceName.equals(propertyTest.getName()))return propertyTest;
			}
			return null;
			
		}
		protected boolean doesSubsetPropertyExist(Property referenceProperty,Classifier subsetClassifier){
			String referenceName=referenceProperty.getName();
			if(referenceName==null)return true;
			return getSubsetProperty(referenceProperty,subsetClassifier)!=null;
		}
	 
}
