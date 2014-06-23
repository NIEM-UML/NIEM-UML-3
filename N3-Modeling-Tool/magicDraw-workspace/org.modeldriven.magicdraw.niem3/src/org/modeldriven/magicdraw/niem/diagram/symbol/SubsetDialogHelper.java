/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.SubsettingRedefinition;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.options.HierarchicLayouterOptionsGroup;
import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.properties.ChoiceProperty;
import com.nomagic.magicdraw.properties.PropertyID;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.ui.dialogs.SelectElementInfo;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlgFactory;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.layout.HierarchicDiagramLayouter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Relationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class SubsetDialogHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	
	static public void SubsetPackageDialog(PresentationElement pe,Package browserPackage){
		try{
			// selection dialog consisting of available reference models;
			//  after selection, create subset models copies from reference, with change to defaultPurpose
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
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
//			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent);
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Reference Models to be Subsetted","niem_uml_profile_common_packageSubset");
			 
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
//			 dlg.setTitle("Select Reference Models to be Subsetted");
			 Package root=NIEMHelper.getModelRoot();
			 /*
			 for(Package niem:root.getNestedPackage()){
				 if("niem".equals(niem.getName())){
					 root=niem;
					 break;
				 }
			 }
			 */
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){

				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Package.class.isInstance(baseElement))return false;
					//return NIEMHelper.isInformationModelDefaultPurposeReference((Package)baseElement);
					return NIEMHelper.isInformationModelSubsettable((Package)baseElement);
				}

				@Override
				public boolean accept(BaseElement baseElement,
						boolean arg1) {
					// TODO Auto-generated method stub
					return accept(baseElement);
				}
				protected Collection<?> types=new Vector();
				@Override
				public Collection<?> getTypes() {
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_SUBSET_PACKAGE_DIALOG_DESCRIPTION_TITLE,ADD_SUBSET_PACKAGE_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
				if (!isSessionCreated)
				{
				// create new session.
				SessionManager.getInstance().createSession("subset");
				}								 
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 // each of these is a reference model;
			    	 //  create corresponding subset model in this context;
			    	 //  add to presentation element context
			    	 /*
			    	 Package supplierPackage=(Package)baseElement;
						Package newClientPackage=NIEMFactory.instance.shallowPackageCopy(supplierPackage);
						// update defaultKind to subsets
						NIEMHelper.setInformationModelDefaultPurpose(newClientPackage,subsetLiteralName);
						// add References Realization

						clientPackage.getPackagedElement().add(newClientPackage);
						NIEMFactory.instance.createReferences(newClientPackage,supplierPackage);
						*/
			    	 Package newSubsetModel=NameHelper.createSubsetModel((Package)baseElement,clientPackage,false);			    	 
						if(pe!=null){
							createShape(newSubsetModel,diagram,pe);
							/*
							ShapeElement shape=PresentationElementsManager.getInstance().createShapeElement(newSubsetModel, diagram);
							pe.addPresentationElementWithoutResize(shape);
							*/
						}
			     }
			  // apply changes and add command into command history.
					if (!isSessionCreated)
					{
						SessionManager.getInstance().closeSession();
					}								 
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During <<InformationModel>> subsetting "+t);
			}
	}
	static public void ConstraintPackageDialog(PresentationElement pe,Package browserPackage){
		try{
			// selection dialog consisting of available editable extension/subset/reference models;
			//  after selection, create constraint models copies from reference, with change to defaultPurpose
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
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Editable Models to be Constrained","niem_uml_modeling_workingwithmodelelements_selectinganelement_constraintsubset");
			 
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Package root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){

				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Package.class.isInstance(baseElement))return false;
					return NIEMHelper.isInformationModelConstrainable((Package)baseElement);
				}

				@Override
				public boolean accept(BaseElement baseElement,
						boolean arg1) {
					// TODO Auto-generated method stub
					return accept(baseElement);
				}
				protected Collection<?> types=new Vector();
				@Override
				public Collection<?> getTypes() {
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_CONSTRAINT_PACKAGE_DIALOG_DESCRIPTION_TITLE,ADD_CONSTRAINT_PACKAGE_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				Set<PresentationElement> newElements=new HashSet<PresentationElement>();
				 boolean isSessionCreated=NIEMHelper.createSession("constraint");
				try{
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 // each of these is a reference model;
			    	 //  create corresponding subset model in this context;
			    	 //  add to presentation element context
			    	 Package newSubsetModel=NameHelper.createPurposeModel((Package)baseElement,clientPackage,constraintLiteralName);	
			    	 // we need to tie this into the <<ModelPackageDescription>>??? or perhaps the <<References>> is sufficient at the PIM level
						if(pe!=null){
							createShape(newSubsetModel,diagram,pe);
						}
			     }
			  // apply changes and add command into command history.
				}finally{
					NIEMHelper.closeSession(isSessionCreated);
				}
				optionalLayoutNewItems(diagram,newElements);
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During constraining "+t);
			}
	}
	static public PresentationElement addPropertyPresentationElements(Property addedProperty,PresentationElement pe,DiagramPresentationElement diagram,Map<Element,PresentationElement> element2presentation,Set<PresentationElement> newElements) throws ReadOnlyElementException{
		// make sure added elements on diagram:
	 	//    make sure dependencies and targets are on diagram
		PresentationElement result=null;
		if((addedProperty!=null)&&(pe!=null)){
			boolean hasExplicitReferences=false;
			for(Dependency d:addedProperty.getClientDependency()){
				if(NIEMHelper.isReferences(d)){
					for(NamedElement supplier:d.getSupplier()){
						if(Property.class.isInstance(supplier)){
							hasExplicitReferences=true;
							Property referencedProperty=(Property)supplier;
							//Classifier referencedPropertyClassifier=referencedProperty.getClassifier();
//							PresentationElement shapeElement=getOrCreateShape(referencedPropertyClassifier,diagram,pe,element2presentation);
							PresentationElement supplierPE=getOrCreateShape(referencedProperty,diagram,pe,element2presentation,newElements);
							PresentationElement clientPE=getOrCreateShape(addedProperty,diagram,pe,element2presentation,newElements);
								if((supplierPE==null)||(clientPE==null)){
									QvtCommonAction.log("ERROR:Failed to draw realization for "+addedProperty.getQualifiedName()+" to "+supplier.getQualifiedName());
								}else{	
//									PathElement pathElement=PresentationElementsManager.getInstance().createPathElement(d, clientPE, supplierPE);
//									PresentationElement pathElement=getOrCreateShape(d, diagram,pe,element2presentation);
									PresentationElement pathElement=getOrCreatePath(d,clientPE,supplierPE, diagram,pe,element2presentation,newElements);
//QvtCommonAction.log("TEST: addPropertyPresentationElements "+addedProperty.getQualifiedName()+" to "+referencedProperty.getQualifiedName()+", "+d.getQualifiedName());
									
									if(pathElement==null){
										QvtCommonAction.log("ERROR during Realization diagram, failed to create PathElement "+((NamedElement)addedProperty).getQualifiedName()+", "+((NamedElement)supplier).getQualifiedName()+", "+clientPE+", "+supplierPE);
										
									}else{
										pathElement.setSelected(false);
									}
								}
						}
					}
				}
			}
			Type referencedType=addedProperty.getType();
			Classifier addedPropertyClassifier=NameHelper.getOwningClassifier(addedProperty);
			Association association=addedProperty.getAssociation();
			if((referencedType!=null)&&(addedPropertyClassifier!=null)&&(association!=null)){
				PresentationElement supplierPE=getOrCreateShape(referencedType,diagram,pe,element2presentation,newElements);
				PresentationElement clientPE=getOrCreateShape(addedPropertyClassifier,diagram,pe,element2presentation,newElements);
				if((supplierPE==null)||(clientPE==null)){
					QvtCommonAction.log("ERROR:Failed to draw association for "+addedProperty.getQualifiedName()+" to "+referencedType.getQualifiedName());
				}else{	
					PresentationElement pathElement=getOrCreatePath(association,clientPE,supplierPE, diagram,pe,element2presentation,newElements);
					if(pathElement==null){
						QvtCommonAction.log("ERROR : failed to create Association PathElement for property "+((NamedElement)addedProperty).getQualifiedName()+", "+((NamedElement)referencedType).getQualifiedName()+", "+clientPE+", "+supplierPE);
						
					}else{
						pathElement.setSelected(false);
						result=pathElement;
					}
				}
			}else if(addedPropertyClassifier!=null){
				PresentationElement clientPE=getOrCreateShape(addedPropertyClassifier,diagram,pe,element2presentation,newElements);
				if((clientPE==null)){
					QvtCommonAction.log("ERROR:Failed to draw owning classifier for "+addedProperty.getQualifiedName());
				}
				result=clientPE;
				
			}
			if(!hasExplicitReferences&&!NIEMHelper.isPropertyHolder(addedPropertyClassifier)){
				// check if implicit reference to a propertyholder
				Property subsetPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(addedProperty);
				if(subsetPropertyHolderProperty!=null){
					Classifier propertyHolderClassifier=subsetPropertyHolderProperty.getClassifier();
					if(propertyHolderClassifier!=null){
						boolean shapeExists=PresentationElementUtility.findPresentationElement(pe,propertyHolderClassifier,element2presentation)!=null;
						if(!shapeExists){
							PresentationElement propertyHolderPE=getOrCreateShape(propertyHolderClassifier,diagram,pe,element2presentation,newElements);
							//propertyHolderPE.addProperty(PresentationElementUtility.associationEndsModeProperty);
//							com.nomagic.magicdraw.properties.Property showAssociationEnds=propertyHolderPE.getProperty(PropertyID.SHOW_ASSOCIATION_ENDS_MODE);
							ChoiceProperty showAssociationEnds=(ChoiceProperty)propertyHolderPE.getProperty(PropertyID.SHOW_ASSOCIATION_ENDS_MODE);
							if(showAssociationEnds!=null){
								showAssociationEnds.setValue("ALL");
							}
						}
					}
				}
			}

		}
		return result;
	}
	static public void optionalLayoutNewItems(DiagramPresentationElement dpe,Set<PresentationElement> newElements){
		if(NIEMHelper.isRelayoutSubsetDiagram()){
			layoutNewItems(dpe,newElements);
		}
	}
	static public void layoutNewItems(DiagramPresentationElement dpe,Set<PresentationElement> newElements){
		// layout works if we close and create a new session
		/*
if(true){
	QvtCommonAction.log("TEST: suppress layoutNewItems");
	return;
}
*/
		if(dpe==null)return;
		 boolean isSessionCreated=NIEMHelper.createSession("layoutNewItems");
		try{
			dpe.setSelected(false);
			dpe.setAllSelected(false);
			dpe.open();
			// make sure sizes are ok
			HierarchicLayouterOptionsGroup options2=new HierarchicLayouterOptionsGroup();
			options2.setDefaultValues();
			// select the new presentationElements
			for(PresentationElement pe:newElements){
				pe.setSelected(true);
			}
			
			dpe.layout(false,new HierarchicDiagramLayouter(),options2);
		}finally{
			  // apply changes and add command into command history.
			NIEMHelper.closeSession(isSessionCreated);
		}	
	}
	
	//static public PresentationElement getOrCreatePath(DirectedRelationship type,PresentationElement source,PresentationElement target,DiagramPresentationElement dpe,PresentationElement firstSelected,Map<Element,PresentationElement> element2presentation) throws ReadOnlyElementException{
	static public PresentationElement getOrCreatePath(Relationship type,PresentationElement source,PresentationElement target,DiagramPresentationElement dpe,PresentationElement firstSelected,Map<Element,PresentationElement> element2presentation,Set<PresentationElement> newElements) throws ReadOnlyElementException{
		if(dpe==null)return null;
		return PresentationElementUtility.getPathPresentationElement( dpe,source,target,type,element2presentation,newElements);
		/*
		for(PresentationElement pe:dpe.getPresentationElements()){
			if(ShapeElement.class.isInstance(pe)&&type.equals(pe.getElement())){
				return (ShapeElement)pe;
			}
		}
		return createShape(type,dpe,firstSelected);
		*/
	}
	static public PresentationElement getOrCreateShape(NamedElement type,DiagramPresentationElement dpe,PresentationElement firstSelected,Map<Element,PresentationElement> element2presentation,Set<PresentationElement> newElements) throws ReadOnlyElementException{
		if(dpe==null)return null;
		return PresentationElementUtility.getPresentationElement( dpe,type,element2presentation,newElements);
		/*
		for(PresentationElement pe:dpe.getPresentationElements()){
			if(ShapeElement.class.isInstance(pe)&&type.equals(pe.getElement())){
				return (ShapeElement)pe;
			}
		}
		return createShape(type,dpe,firstSelected);
		*/
	}
	static protected ShapeElement createShape(NamedElement type,DiagramPresentationElement dpe,PresentationElement firstSelected){
		// this will only end up getting the very first of possibly many added classes
		try{
	ShapeElement shapeElement=PresentationElementsManager.getInstance().createShapeElement(type,dpe);
	shapeElement.addProperty(Psm2PimAction.ownerDisplayProperty);
	shapeElement.setSelected(false);
//      PresentationElement element = getFirstSelected();
      PresentationElement element = firstSelected;
      int x=0;
      int y=0;
      if((element==null)||DiagramPresentationElement.class.isInstance(element)){
//    	  Rectangle refbounds = dpe.getVisibleBounds();
    	  Rectangle refbounds = dpe.getBounds();
    	  //x=dpe.getCenterlinePointX();
    	  //y=dpe.getCenterlinePointY();
    	  if(refbounds!=null){
	          x = refbounds.x + (refbounds.width/2);
	          y=refbounds.y+(refbounds.height/2);
    		  
    	  }
      }else{
    	  element.addPresentationElementWithoutResize(shapeElement);
    	  return shapeElement;
			/*
          Rectangle refbounds = element.getBounds();
          if(refbounds!=null){
          x = refbounds.x + refbounds.width+100;
          y=refbounds.y;
          }
          */
      }

		//QvtCommonAction.log("Set location for add Classifier "+x+", "+y+", "+element);
      shapeElement.setLocation(x,y);
      return shapeElement;
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: failed to complete creation of Classifier shape for "+type.getQualifiedName());
			return null;
		}
	}

	public static void addSubsetAction(MDMenuAction category,final PresentationElement requestor,final Package browserPackage,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addSubsetModels","add SubsetModels...",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
				
					SubsetDialogHelper.SubsetPackageDialog(requestor, browserPackage);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(ADD_SUBSET_MODELS_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addConstraintAction(MDMenuAction category,final PresentationElement requestor,final Package browserPackage,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addConstraintModels","add Constraint Models",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
				
					SubsetDialogHelper.ConstraintPackageDialog(requestor, browserPackage);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(ADD_CONSTRAINT_MODELS_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	static public void SubsetClassifierDialog(PresentationElement pe,Package browserPackage){
		try{
			// selection dialog consisting of available reference models;
			//  after selection, create subset models copies from reference, with change to defaultPurpose
			DiagramPresentationElement diagram=null;
			Package clientPackage=browserPackage;
			//if(browserClassifier!=null)clientPackage=NIEMHelper.getNearestPackage(browserClassifier);
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
			Package referenceModel=NIEMHelper.getInformationModelSubsetted(clientPackage);
			if(referenceModel==null)return;
			
			/*
			if((clientPackage==null)||!(
					NIEMHelper.isInformationModelDefaultPurposeSubset(clientPackage)
					||NIEMHelper.isInformationModelDefaultPurposeSubsetting(clientPackage)				
					))return;
			// get the reference model
			Package referenceModel=null;
			for(Dependency test:clientPackage.getClientDependency()){
				if(NIEMHelper.isReferences(test)){
					for(NamedElement supplier:test.getSupplier()){
//						if(Package.class.isInstance(supplier)){
						if(Package.class.isInstance(supplier)
								//&&NIEMHelper.isInformationModelDefaultPurposeReference((Package)supplier)
								&&NIEMHelper.isInformationModelSubsettable((Package)supplier)
								){
							referenceModel=(Package)supplier;
						}
					}
				}
			}
			if(referenceModel==null){
				QvtCommonAction.log("ERROR: NO <<References>> to reference <<InformationModel>>");
				return;
			}
			*/
			final Package referenceModelTest=referenceModel;
			final Package referenceModelClientTest=clientPackage;
			//QvtCommonAction.log("SubsetClassifiers "+referenceModelTest.getQualifiedName()+", "+referenceModelClientTest.getQualifiedName());
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
//			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent);
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Classifiers to be Subsetted","niem_uml_profile_common_classifierSubset");
//			 dlg.setTitle("Select Reference Classifiers to be Subsetted");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Element root=referenceModelTest;//NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same reference model
				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Classifier.class.isInstance(baseElement))return false;
					Package referenceModelPackage=NIEMHelper.getNearestInformationModel((Classifier)baseElement);
					//QvtCommonAction.log("SubsetClassifier test "+referenceModelPackage.getQualifiedName()+", "+referenceModelPackage.getQualifiedName());
					if(!referenceModelTest.equals(referenceModelPackage))return false;
					return !doesSubsetClassifierExist((Classifier)baseElement,referenceModelClientTest);
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
//						types.add(Classifier.class);
						types.add(Class.class);
						types.add(DataType.class);
						types.add(Enumeration.class);
						types.add(PrimitiveType.class);
						types.add(AssociationClass.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_SUBSET_CLASSIFIER_DIALOG_DESCRIPTION_TITLE,ADD_SUBSET_CLASSIFIER_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("subset");
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
					Set<PresentationElement> newElements=new HashSet<PresentationElement>();

				 try{
				Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
				
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 Type newType=NameHelper.addClassifier((Classifier)baseElement,clientPackage);
			    	 /*
			    	 // each of these is a reference model;
			    	 //  create corresponding subset model in this context;
			    	 //  add to presentation element context
			    	 Classifier supplierPackage=(Classifier)baseElement;
			    	 Classifier newClientPackage=NIEMFactory.instance.shallowClassifierCopy(supplierPackage);
						clientPackage.getPackagedElement().add(newClientPackage);
						*/
						// the ui could get messy at this point, lets focus on the model updates for now 
					
						if(pe!=null){
							createClassifierPresentation( newType, diagram, pe,element2presentation,newElements);
						}
						
			     }
			 }finally{
				  // apply changes and add command into command history.
		    	 NIEMHelper.closeSession(isSessionCreated);
		     }
				 optionalLayoutNewItems(diagram,newElements);
			 }			 
		 }catch(Throwable t){
				QvtCommonAction.log("ERROR:During Classifier subsetting "+t);
		 }
	}
	public static PresentationElement createClassifierPresentation(Type newType,DiagramPresentationElement diagram,PresentationElement pe,Map<Element,PresentationElement> element2presentation,Set<PresentationElement> newElements) throws ReadOnlyElementException{
		if(AssociationClass.class.isInstance(newType)){
//			createPath(newType,diagram,pe);
			AssociationClass subsetAssociationClass=(AssociationClass)newType;
//			if(subsetAssociationClass.getOwnedEnd().size()!=2){
			if(subsetAssociationClass.getMemberEnd().size()!=2){
				QvtCommonAction.log("ERROR:AssociationClass does not have 2 member ends "+subsetAssociationClass.getQualifiedName());
				return null;
			}
//			Property clientProperty=subsetAssociationClass.getOwnedEnd().get(0);
//			Property supplierProperty=subsetAssociationClass.getOwnedEnd().get(1);
//			Property clientProperty=subsetAssociationClass.getOwnedEnd().get(1);
//			Property supplierProperty=subsetAssociationClass.getOwnedEnd().get(0);
			Property clientProperty=subsetAssociationClass.getMemberEnd().get(1);
			Property supplierProperty=subsetAssociationClass.getMemberEnd().get(0);
			Type clientType=clientProperty.getType();
			Type supplierType=supplierProperty.getType();
			if((clientType==null)||(supplierType==null)){
				QvtCommonAction.log("ERROR:an memberEnd of AssociationClass is not typed "+subsetAssociationClass.getQualifiedName());
				return null;
			}
			PresentationElement supplierPE=getOrCreateShape(supplierType,diagram,pe,element2presentation,newElements);
			PresentationElement clientPE=getOrCreateShape(clientType,diagram,pe,element2presentation,newElements);
				if((supplierPE==null)||(clientPE==null)){
					QvtCommonAction.log("ERROR:Failed to draw AssociationClass for "+clientType.getQualifiedName()+" to "+supplierType.getQualifiedName());
				}else{	
					PresentationElement pathElement=getOrCreatePath(subsetAssociationClass,clientPE,supplierPE, diagram,pe,element2presentation,newElements);
					if(pathElement==null){
						QvtCommonAction.log("ERROR during Entity diagram, failed to create PathElement "+((NamedElement)clientType).getQualifiedName()+", "+((NamedElement)supplierType).getQualifiedName()+", "+clientPE+", "+supplierPE);
						
					}else{
						pathElement.setSelected(false);
						return pathElement;
					}
				}
				return null;
			
		}else{
			PresentationElement classifierShape=getOrCreateShape(newType,diagram,pe,element2presentation,newElements);
			return classifierShape;
//			return createShape(newType,diagram,pe);
		}
		
	}
	public static boolean doesSubsetClassifierExist(Type referenceClassifier,Package subsetPackage){
		String referenceName=referenceClassifier.getName();
		if(referenceName==null)return true;
		return NameHelper.getSubsetClassifier(referenceClassifier,subsetPackage)!=null;
	}
	public static void addSubsetClassifierAction(MDMenuAction category,final PresentationElement requestor,final Package browserPackage,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addSubsetClassifiers","add SubsetClassifiers",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					SubsetDialogHelper.SubsetClassifierDialog(requestor, browserPackage);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(ADD_SUBSET_CLASSIFIERS_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addSetSubstitutionGroupAction(MDMenuAction category,final PresentationElement requestor,final Property browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("setSubstitutionGroup","set SubstitutionGroup",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					SubsetDialogHelper.SetSubstitutionGroupDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(SET_SUBSTITUION_GROUP_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addSubsetEnumerationAction(MDMenuAction category,final PresentationElement requestor,final Enumeration browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addEnumerationLiterals","add SubsetEnumerationLiterals",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					SubsetDialogHelper.SubsetEnumerationDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("enumeration"));
		testAction.setDescription(ADD_SUBSET_ENUMERATION_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addSubsetPropertyAction(MDMenuAction category,final PresentationElement requestor,final Classifier browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addSubsetProperties","add SubsetProperties",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					SubsetDialogHelper.SubsetPropertyDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		testAction.setDescription(ADD_SUBSET_PROPERTIES_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addRestrictionPropertyAction(MDMenuAction category,final PresentationElement requestor,final Class browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addRestrictionProperties","add RestrictionProperties",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					//SubsetDialogHelper.RestrictionPropertyDialog(requestor, browserClassifier);
					new RestrictionPropertyDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("realize"));
		testAction.setDescription(ADD_RESTRICTION_PROPERTY_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addRestrictionEnumerationAction(MDMenuAction category,final PresentationElement requestor,final Enumeration browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addRestrictionEnumeration","add Restriction Enumeration Literals",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					//SubsetDialogHelper.RestrictionPropertyDialog(requestor, browserClassifier);
					new RestrictionEnumerationDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("realize"));
		testAction.setDescription(ADD_RESTRICTION_ENUMERATION_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addReferencesPropertyAction(MDMenuAction category,final PresentationElement requestor,final Class browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addReferencesProperties","add ReferencesProperties",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
					new ReferencesPropertyDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("realize"));
		testAction.setDescription(ADD_REFERENCES_PROPERTY_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	public static void addInverseReferencesPropertyAction(MDMenuAction category,final PresentationElement requestor,final Class browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addInverseReferencesProperties","add InverseReferencesProperties",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					new InverseReferencesPropertyDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("realize_opposite"));
		testAction.setDescription(ADD_INVERSE_REFERENCES_PROPERTY_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	static public void SubsetPropertyDialog(PresentationElement pe,Classifier browserClassifier){
		try{
			// selection dialog consisting of available reference models;
			//  after selection, create subset models copies from reference, with change to defaultPurpose
			DiagramPresentationElement diagram=null;
			Classifier clientClassifier=browserClassifier;
			Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
			if(DiagramPresentationElement.class.isInstance(pe)){
				diagram=(DiagramPresentationElement)pe;
				Element diagramOwner=diagram.getElement().getOwner();
				if(!Classifier.class.isInstance(diagramOwner))return;
				clientClassifier=(Classifier)diagramOwner;
			}
			else if (pe!=null) {
				diagram=pe.getDiagramPresentationElement();
				Element diagramPackage=pe.getElement();
				if(!Classifier.class.isInstance(diagramPackage))return;
				clientClassifier=(Classifier)diagramPackage;
			}
			Classifier referenceClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(clientClassifier);
			Package referencePackage=NIEMHelper.getNearestInformationModel(referenceClassifier);
			Package subsetPackage=NIEMHelper.getNearestInformationModel(clientClassifier);
			
			if(referenceClassifier==null){
				QvtCommonAction.log("ERROR: Did not locate reference model type for subset "+clientClassifier.getQualifiedName());
				return;
			}
			
			// determine properties here: get all reference model properties; exclude those which already exist
			// characterize the subset: namespace:NIEMname for each resolved property plus any subsetted properties
			Set<String> subsetNamespaceName=new HashSet<String>();
			Map<String,Property> subsetNameToPropertyHolderPropertyMap=NameHelper.getNameToPropertyHolderPropertyMap(subsetPackage);
			for(Property subsetProperty:clientClassifier.getAttribute()){
				Property resolvedProperty=getResolvedProperty(subsetProperty,subsetNameToPropertyHolderPropertyMap);
				subsetNamespaceName.add(toNamespaceName(resolvedProperty));
				addSubsettedProperties(resolvedProperty,subsetNamespaceName);
			}
			
			Map<String,Property> referenceNameToPropertyHolderPropertyMap=NameHelper.getNameToPropertyHolderPropertyMap(referencePackage);
			Collection<Property> baseReferenceModelProperties=referenceClassifier.getAttribute();
			final Set<Property> referenceModelProperties=new HashSet<Property>();
			
			for(Property referenceModelProperty:baseReferenceModelProperties){
				// exclude properties already included
				Property resolvedProperty=getResolvedProperty(referenceModelProperty,referenceNameToPropertyHolderPropertyMap);
				if(subsetNamespaceName.contains(toNamespaceName(resolvedProperty)))continue;
				//if(NameHelper.doesSubsetPropertyExist(referenceModelProperty,clientClassifier))continue;
				referenceModelProperties.add(referenceModelProperty);
				// add any implicit or explicit PropertyHolder properties plus all of their substitutionGroups
				Property referencePropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(referenceModelProperty);
				if(referencePropertyHolderProperty==null){
					referencePropertyHolderProperty=referenceNameToPropertyHolderPropertyMap.get(NameHelper.getPropertyMapName(referenceModelProperty));
				}
				if(referencePropertyHolderProperty!=null){
					referenceModelProperties.add(referencePropertyHolderProperty);
					addAllSubstitutionGroups(referencePropertyHolderProperty,referenceModelProperties);
				}
				
			}
			
			final Classifier referenceModelTest=referenceClassifier;
			final Classifier subsetClassifierTest=clientClassifier;
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
//			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent);
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Reference Properties to be Subsetted by "+subsetClassifierTest.getName(),"niem_uml_profile_common_propertySubset");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
//			 dlg.setTitle("Select Reference Properties to be Subsetted");
			 Element root=referenceModelTest;//NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same reference model classifier
				@Override
				public boolean accept(BaseElement referenceElement) {
					if(!Property.class.isInstance(referenceElement))return false;
					return referenceModelProperties.contains(referenceElement);
					/*
					Property referenceProperty=((Property)referenceElement);
					Element test=referenceProperty.getOwner();
					if(!Classifier.class.isInstance(test))return false;
					Classifier referenceModelClassifier=(Classifier)test;
					if(AssociationClass.class.isInstance(referenceProperty.getAssociation())){
						// property should be ownedEnd, this property invalid
						return false;
					}
					// special case: 
					//	if the tested Property is in a PropertyHolder, but referenceModelClassifier is not a PropertyHolder
					if(NIEMHelper.isPropertyHolder(referenceModelClassifier)&&!NIEMHelper.isPropertyHolder(referenceModelTest)){
						//	  in cases where the property subsetsProperty which is in referenceModelTest
						if(NameHelper.isPropertyHolderPropertySubsettingTypeProperty(referenceProperty,referenceModelTest,true)){
							return !NameHelper.doesSubsetPropertyExist(referenceProperty,subsetClassifierTest);
						}
					}
					
					if(!referenceModelTest.equals(referenceModelClassifier))return false;
					return !NameHelper.doesSubsetPropertyExist(referenceProperty,subsetClassifierTest);
					*/
				}

				@Override
				public boolean accept(BaseElement baseElement,
						boolean arg1) {
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
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_SUBSET_PROPERTY_DIALOG_DESCRIPTION_TITLE,ADD_SUBSET_PROPERTY_DIALOG_DESCRIPTION);

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
			    	 // the property may be from a reference Classifier other then one corresponding to clientClassifier
			    	 Property referenceProperty=(Property)baseElement;
			    	 Classifier useReferenceClassifier=(Classifier)referenceProperty.getOwner();
			    	 Classifier subsetClassifier=clientClassifier;
			    	 if(NIEMHelper.isPropertyHolder(clientClassifier)){
						Package useSubsetPackage=NameHelper.findOrCreateSubsetPackage( NIEMHelper.getNearestInformationModel(referenceProperty), subsetPackage);
						if(useSubsetPackage!=null){
							// find corresponding subsetClassifier
							subsetClassifier=(Classifier)NameHelper.addClassifier(useReferenceClassifier,useSubsetPackage);
						}else{
							QvtCommonAction.log("Failed to findOrCreateSubsetPackage for "+useReferenceClassifier.getQualifiedName());
						}
			    	 }
						if(subsetClassifier!=null){
					    	 Property addedProperty=NameHelper.addProperty((Property)baseElement,subsetClassifier);
					    	 if(addedProperty!=null)addedProperties.add(addedProperty);
						}else{
							QvtCommonAction.log("Failed to add subset Classifier for "+useReferenceClassifier.getQualifiedName());
							
						}
			    	 
			     }
			     SubsettingRedefinition.INSTANCE.resequenceClassifierSubsetProperties(subsetClassifierTest);
				 }finally{
					 NIEMHelper.closeSession(isSessionCreated);
				 }
			  // apply changes and add command into command history.
				// let model updates propagate to current diagram elements, then start adding new stuff to diagram
					Set<PresentationElement> newElements=new HashSet<PresentationElement>();

				isSessionCreated=NIEMHelper.createSession("subset");
				try{
				     for(Property addedProperty:addedProperties){
							// make sure added elements on diagram:
				    	 	//    make sure dependencies and targets are on diagram
				    	 addPropertyPresentationElements(addedProperty,pe,diagram,element2presentation,newElements);
				     }
				}finally{
					NIEMHelper.closeSession(isSessionCreated);
				}
				optionalLayoutNewItems(diagram,newElements);

			 }
			}catch(Throwable t){
				t.printStackTrace();
				QvtCommonAction.log("ERROR:During Property subsetting "+t);
			}
	}
	static public Property getResolvedProperty(Property property,Map<String,Property> subsetNameToPropertyHolderPropertyMap){
		Property propertyHolderPropertyTest=NameHelper.getReferencesPropertyHolderProperty(property);
		if(propertyHolderPropertyTest!=null){
			return propertyHolderPropertyTest;
		}
		propertyHolderPropertyTest=subsetNameToPropertyHolderPropertyMap.get(NameHelper.getPropertyMapName(property));
		if(propertyHolderPropertyTest!=null){
			return propertyHolderPropertyTest;
		}
		return property;
	}
	static protected void addSubsettedProperties(Property property,Set<String> subsetNamespaceName){
		for(Property substitutable:property.getSubsettedProperty()){
			subsetNamespaceName.add(toNamespaceName(substitutable));
			addSubsettedProperties(substitutable,subsetNamespaceName);
		}
	}
	static public String toNamespaceName(Property property){
		Package informationModel=NIEMHelper.getNearestInformationModel(property);
		String namespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
		return namespace+":"+NameHelper.getNIEMName(property);
	}
	static public String toNamespaceName(EnumerationLiteral property){
		Package informationModel=NIEMHelper.getNearestInformationModel(property);
		String namespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
		return namespace+":"+NameHelper.getNIEMName(property);
	}

	static public void addAllSubstitutionGroups(Property property,Set<Property> referenceModelProperties ){
		for(Property substitutable:property.get_propertyOfSubsettedProperty()){
			referenceModelProperties.add(substitutable);
			addAllSubstitutionGroups(substitutable,referenceModelProperties);
		}
	}
	static public void SetSubstitutionGroupDialog(PresentationElement pe,Property browserClassifier){
		try{
			// selection dialog consisting of available reference models;
			//  after selection, create subset models copies from reference, with change to defaultPurpose
			DiagramPresentationElement diagram=null;
			Property clientProperty=browserClassifier;
			if (pe!=null) {
				diagram=pe.getDiagramPresentationElement();
				Element diagramPackage=pe.getElement();
				if(!Property.class.isInstance(diagramPackage))return;
				clientProperty=(Property)diagramPackage;
			}
			Package clientPackage=NIEMHelper.getNearestInformationModel(clientProperty);
			if((clientPackage==null)||!NIEMHelper.isInformationModel(clientPackage))return;
			// determine property classifier
			Element classifiertest=clientProperty.getOwner();
			if(!Classifier.class.isInstance(classifiertest))return;
			
			final Classifier referenceModelTest=(Classifier)classifiertest;
			final Property subsetPropertyTest=clientProperty;
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
//			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent);
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select substitutionGroup Property","niem_uml_profile_common_propertySubstitutionGroup");
			 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
			 //dlg.setTitle("Select substitutionGroup Property");
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for a Property in class hierarchy other than self
				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Property.class.isInstance(baseElement))return false;
					if(baseElement.equals(subsetPropertyTest))return false;
					if(NIEMHelper.isXSDAny((Property)baseElement))return false;
					Element test=((Property)baseElement).getOwner();
					if(!Classifier.class.isInstance(test))return false;
					Classifier referenceModelClassifier=(Classifier)test;
					if(!isA(referenceModelTest,referenceModelClassifier))return false;
					// and check the type of the property
					Type thisType=((Property)baseElement).getType();
					Type baseType=subsetPropertyTest.getType();
					if(thisType!=null){
						if(baseType==null)return false;
						if(!(Classifier.class.isInstance(baseType)&&Classifier.class.isInstance(thisType)))return false;
						if(!isA((Classifier)baseType,(Classifier)thisType))return false;
					}
					return true;
				}
				protected boolean isA(Classifier base,Classifier general){
					if(base.equals(general))return true;
					for(Classifier test:base.getGeneral()){
						if(isA(test,general))return true;
					}
					return false;
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
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,SET_SUBSTITUTION_GROUP_DIALOG_DESCRIPTION_TITLE,SET_SUBSTITUTION_GROUP_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
				if (!isSessionCreated)
				{
				// create new session.
				SessionManager.getInstance().createSession("subset");
				}								 
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
		    	 clientProperty.getSubsettedProperty().clear();
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 clientProperty.getSubsettedProperty().add((Property)baseElement);
			    	 break;
			     }
			  // apply changes and add command into command history.
					if (!isSessionCreated)
					{
						SessionManager.getInstance().closeSession();
					}								 
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During substitutionGroup subsetting "+t);
			}
	}
	/*
	static public void RestrictionPropertyDialog(PresentationElement pe,Class browserClassifier){
		try{
			// selection dialog consisting of available restriction properties;
			//  after selection, create restriction properties copied from base
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
			Package clientPackage=NIEMHelper.getNearestPackage(clientClassifier);
			if((clientPackage==null)||!NIEMHelper.isInformationModel(clientPackage))return;
			// get the restriction class
			Class restrictedClass=null;
			for(Dependency test:clientClassifier.getClientDependency()){
				if(NIEMHelper.hasStereotype(test, NIEMHelper.getCommonStereotype(RestrictionStereotypeName))){
					for(NamedElement supplier:test.getSupplier()){
						if(Class.class.isInstance(supplier)&&NIEMHelper.isComplexType((Class)supplier)){
							restrictedClass=(Class)supplier;
						}
					}
				}
			}
			if(restrictedClass==null){
				QvtCommonAction.log("ERROR: NO <<Restriction>> to ComplexType");
				return;
			}
			final Classifier referenceModelTest=restrictedClass;
			final Classifier subsetClassifierTest=clientClassifier;
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent);
			 dlg.setTitle("Select Restriction Properties");
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same restriction classifier
				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Property.class.isInstance(baseElement))return false;
					Element test=((Property)baseElement).getOwner();
					if(!Classifier.class.isInstance(test))return false;
					Classifier referenceModelClassifier=(Classifier)test;
					if(!referenceModelTest.equals(referenceModelClassifier))return false;
					return !doesSubsetPropertyExist((Property)baseElement,subsetClassifierTest);
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
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 // Display dialog for the user to select elements.
			 dlg.show();

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
				if (!isSessionCreated)
				{
				// create new session.
				SessionManager.getInstance().createSession("subset");
				}								 
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 addRestrictionProperty((Property)baseElement,clientClassifier);
			     }
			  // apply changes and add command into command history.
					if (!isSessionCreated)
					{
						SessionManager.getInstance().closeSession();
					}								 
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}
	*/
	public static void addPrimitivePropertyAction(MDMenuAction category,final PresentationElement requestor,final Class browserClassifier,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addPrimitiveProperties","add Primitive Properties",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
					SubsetDialogHelper.PrimitivePropertyDialog(requestor, browserClassifier);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		testAction.setDescription(ADD_PRIMITIVE_PROPERTY_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	static public void PrimitivePropertyDialog(PresentationElement pe,Class browserClassifier){
		try{
			// selection dialog consisting of available primitive types;
			//  after selection, create properties whose type is selection
			DiagramPresentationElement diagram=null;
			Class clientClassifier=browserClassifier;
			if (pe!=null) {
				diagram=pe.getDiagramPresentationElement();
				Element diagramPackage=pe.getElement();
				if(!Class.class.isInstance(diagramPackage))return;
				clientClassifier=(Class)diagramPackage;
			}
			Package clientPackage=NIEMHelper.getNearestInformationModel(clientClassifier);
			if((clientPackage==null)||!NIEMHelper.isInformationModel(clientPackage))return;
			
			final Class subsetClassifierTest=clientClassifier;
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
//			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent);
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Primitive Types for New Property(s)","niem_uml_profile_common_propertyPrimitiveType");
			 
			 //dlg.setTitle("Select Primitive Type for New Property");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Package root=NIEMHelper.getModelRoot();
			 for(Package packageTest:root.getNestedPackage()){
				 if(NIEMHelper.isXMLPrimitiveTypesLibrary((Package)packageTest)){
					 root=(Package)packageTest;
					 break;
				 }
			 }
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Classifier.class.isInstance(baseElement))return false;
					Element test=((Classifier)baseElement).getOwner();
					if(!Package.class.isInstance(test))return false;
					Package referenceModelClassifier=(Package)test;
					return NIEMHelper.isXMLPrimitiveTypesLibrary(referenceModelClassifier);
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
						types.add(PrimitiveType.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,PRIMITIVE_PROPERTY_DIALOG_DESCRIPTION_TITLE,PRIMITIVE_PROPERTY_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=SessionManager.getInstance().isSessionCreated();
				if (!isSessionCreated)
				{
				// create new session.
				SessionManager.getInstance().createSession("subset");
				}								 
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 if(!Type.class.isInstance(baseElement))continue;
			    	 	Type type=(Type)baseElement;
						Property property = Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
						property.setVisibility(VisibilityKindEnum.PUBLIC);
						property.setType(type);
						property.setAggregation(AggregationKindEnum.SHARED);
						ModelHelper.setMultiplicity(0, -1, property);
						NameHelper.fixPropertyName(property, "My"+type.getName(), NameHelper.getRepresentationTerm(property));
						// add a comment
			        	 NIEMHelper.addComment(property);
						subsetClassifierTest.getOwnedAttribute().add(property);
			     }
			  // apply changes and add command into command history.
					if (!isSessionCreated)
					{
						SessionManager.getInstance().closeSession();
					}								 
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During Primitive Property subsetting "+t);
			}
	}
	static public void SubsetEnumerationDialog(PresentationElement pe,Enumeration browserClassifier){
		try{
			// selection dialog consisting of available reference model enumerationLiterals;
			//  after selection, create subset enumerationLiteralss copies from reference
			DiagramPresentationElement diagram=null;
			Enumeration clientClassifier=browserClassifier;
			Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
			if(DiagramPresentationElement.class.isInstance(pe)){
				diagram=(DiagramPresentationElement)pe;
				Element diagramOwner=diagram.getElement().getOwner();
				if(!Enumeration.class.isInstance(diagramOwner))return;
				clientClassifier=(Enumeration)diagramOwner;
			}
			else if (pe!=null) {
				diagram=pe.getDiagramPresentationElement();
				Element diagramPackage=pe.getElement();
				if(!Enumeration.class.isInstance(diagramPackage))return;
				clientClassifier=(Enumeration)diagramPackage;
			}
			Classifier testreferenceClassifier=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(clientClassifier);
			if(!(testreferenceClassifier instanceof Enumeration)){
				QvtCommonAction.log("ERROR: subsetted reference model type is not an Enumeration;  "+clientClassifier.getQualifiedName());
				return;
			}
			Enumeration referenceClassifier=(Enumeration)testreferenceClassifier;
			
			if(referenceClassifier==null){
				QvtCommonAction.log("ERROR: Did not locate reference model type for subset "+clientClassifier.getQualifiedName());
				return;
			}
			
			// determine literals here: get all reference model literals; exclude those which already exist
			// characterize the subset: namespace:NIEMname for each resolved literals plus any subsetted literals
			Set<String> subsetNamespaceName=new HashSet<String>();
			for(EnumerationLiteral subsetProperty:clientClassifier.getOwnedLiteral()){
				subsetNamespaceName.add(toNamespaceName(subsetProperty));
			}
			Collection<EnumerationLiteral> baseReferenceModelProperties=referenceClassifier.getOwnedLiteral();
			final Set<EnumerationLiteral> referenceModelProperties=new HashSet<EnumerationLiteral>();
			for(EnumerationLiteral referenceModelProperty:baseReferenceModelProperties){
				// exclude EnumerationLiteral already included
				EnumerationLiteral resolvedProperty=referenceModelProperty;
				if(subsetNamespaceName.contains(toNamespaceName(resolvedProperty)))continue;
				referenceModelProperties.add(referenceModelProperty);
			}
			
			final Enumeration referenceModelTest=referenceClassifier;
			final Enumeration subsetClassifierTest=clientClassifier;
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Reference EnumerationLiterals to be Subsetted by "+subsetClassifierTest.getName(),"niem_uml_profile_common_propertySubset");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Element root=referenceModelTest;
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same reference model classifier
				@Override
				public boolean accept(BaseElement referenceElement) {
					if(!EnumerationLiteral.class.isInstance(referenceElement))return false;
					return referenceModelProperties.contains(referenceElement);
				}

				@Override
				public boolean accept(BaseElement baseElement,
						boolean arg1) {
					return accept(baseElement);
				}
				protected Collection<java.lang.Class> types=null;
				@Override
				public Collection<java.lang.Class> getTypes() {
					if(types==null){
						types=new Vector();
						types.add(EnumerationLiteral.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_SUBSET_ENUMERATIONLITERAL_DIALOG_DESCRIPTION_TITLE,ADD_SUBSET_ENUMERATIONLITERALS_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("subset");
				 try{
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
						NameHelper.addEnumerationLiteral((EnumerationLiteral)baseElement,clientClassifier);
			     }
				 }finally{
					 NIEMHelper.closeSession(isSessionCreated);
				 }

			 }
			}catch(Throwable t){
				t.printStackTrace();
				QvtCommonAction.log("ERROR:During EnumerationLiteral subsetting "+t);
			}
	}
	
}
