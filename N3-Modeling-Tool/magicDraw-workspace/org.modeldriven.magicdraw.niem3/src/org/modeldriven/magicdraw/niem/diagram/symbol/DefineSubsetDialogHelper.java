/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.Frame;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.SubsettingRedefinition;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
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
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author Tom
 *
 */
public class DefineSubsetDialogHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	
	
	static public void DefineSubsetPackageDialog(PresentationElement pe,Package browserPackage){
		try{
			// selection dialog consisting of available reference models;
			// extend this to include subsetting of subset and exchange models, but they must be not-editable
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
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,
					 "Select Reference/Subset/Extension Model Elements to be included in Subsets",
					 "niem_uml_modeling_workingwithmodelelements_selectinganelement_definesubset");
			
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
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
					if(baseElement.isEditable())return false;
					if(!Package.class.isInstance(baseElement)
							&& !Classifier.class.isInstance(baseElement)
							&& !Property.class.isInstance(baseElement)
							)return false;
					if(Property.class.isInstance(baseElement)&&
//								Association.class.isInstance(((Property)baseElement).getOwner())
							(((Property)baseElement).getOwningAssociation()!=null)
								)return false;
					Package referencePackage=NIEMHelper.getNearestInformationModel((Element)baseElement);
					if(referencePackage==null)return false;
					return NIEMHelper.isInformationModelDefaultPurposeReference(referencePackage)
							||NIEMHelper.isInformationModelDefaultPurposeSubset(referencePackage)
							||NIEMHelper.isInformationModelDefaultPurposeExtension(referencePackage)
							;
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
//						types.add(Classifier.class);
						types.add(Property.class);
						types.add(Package.class);
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
//			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);
			 ElementSelectionDlgFactory.initMultipleAsMultipleInitial(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,DEFINE_SUBSET_DIALOG_DESCRIPTION_TITLE,DEFINE_SUBSET_DIALOG_DESCRIPTION);

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
				Set<PresentationElement> newElements=new HashSet<PresentationElement>();
			     // Get selected elements in multiple selection mode.
				// gather the unique models; classes
				Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
				Set<Package> models=new HashSet<Package>();
				Set<Classifier> classifiers=new HashSet<Classifier>();
				Set<Property> properties=new HashSet<Property>();
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 if(!Element.class.isInstance(baseElement))continue;
			    	 Element element=(Element)baseElement;
			    	 if(Package.class.isInstance(element)){
			    		 models.add((Package)element);
			    		 continue;
			    	 }
			    	 Package model=NIEMHelper.getNearestInformationModel(element);
			    	 models.add(model);
			    	 if(Classifier.class.isInstance(element)){
			    		 classifiers.add((Classifier)element);
			    		 continue;
			    	 }
			    	 if(Classifier.class.isInstance(element.getOwner())){
			    		 classifiers.add((Classifier)element.getOwner());
			    	 }
			    	 if(Property.class.isInstance(element)){
			    		 properties.add((Property)element);
			    		 continue;
			    	 }
			     }
			     // mpdRootDirectory
			     Package mpdRootDirectory=NIEMHelper.getMpdRootDirectory(clientPackage);
			     // make packages
			     for(Package referencePackage:models){
			    	 // each of these is a reference model;
			    	 //  create corresponding subset model in this context;
			    	 //  add to presentation element context
			    	 //String referenceNamespace=NIEMHelper.getNamespaceTargetNamespace(referencePackage);
			    	 Package newSubsetModel=NameHelper.findOrCreateSubsetPackage(referencePackage, clientPackage);
			    	 if(newSubsetModel==null){
			    		 QvtCommonAction.log("Failed to find or create subset package for reference "+referencePackage.getQualifiedName()+", in context of "+clientPackage.getQualifiedName());
			    		 continue;
			    	 }
			    	 /*
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
			    					 &&NIEMHelper.isInformationModelDefaultPurposeSubset(nestedPackage)
			    					 ){
						    	 String subsetNamespace=NIEMHelper.getNamespaceTargetNamespace(nestedPackage);
			    				 if((subsetNamespace!=null)&&subsetNamespace.equals(referenceNamespace)){
			    					 newSubsetModel=nestedPackage;
			    					 break;
			    				 }
			    			 }
			    		 }
			    	 }
			    	 if(newSubsetModel==null){
			    		 // try to align package structure with mpd........
			    		 Package mpdPackage=NameHelper.createMpdPackage(referencePackage,mpdRootDirectory);
			    		 newSubsetModel=NameHelper.createSubsetModel(referencePackage,mpdPackage);			    	 
						if(pe!=null){
							SubsetDialogHelper.createShape(newSubsetModel,diagram,pe);
						}
			    	 }
			    	 */
				     // make Classifiers within the package
				     for(Classifier referenceClassifier:classifiers){
				    	 if(!referencePackage.equals(referenceClassifier.getOwner()))continue;
				    	 //boolean alreadyExists=false;
				    	 Type newType=NameHelper.getSubsetClassifier(referenceClassifier,newSubsetModel);
				    	 if(newType==null){
				    		 newType=NameHelper.addClassifier(referenceClassifier,newSubsetModel);
							// the ui could get messy at this point, lets focus on the model updates for now 
						
							if(pe!=null){
//								SubsetDialogHelper.createShape(newType,diagram,pe);
								SubsetDialogHelper.createClassifierPresentation( newType, diagram, pe,element2presentation,newElements);

							}
				    	 }
				    	 if(!Classifier.class.isInstance(newType))continue;
				    	 Classifier newClassifer=(Classifier)newType;
					     // make Properties
					     for(Property referenceProperty:properties){
					    	 if(!referenceClassifier.equals(referenceProperty.getOwner()))continue;
					    	 Property newProperty=NameHelper.getSubsetProperty(referenceProperty,newClassifer);
					    	 if(newProperty==null){
							    	 newProperty=NameHelper.addProperty(referenceProperty,newClassifer);
					    	 }
					     }
					     SubsettingRedefinition.INSTANCE.resequenceClassifierSubsetProperties(newClassifer);

				     }
			    	 
			     }
			     
			     
			  // apply changes and add command into command history.
					if (!isSessionCreated)
					{
						SessionManager.getInstance().closeSession();
					}								 
			 }
			}catch(Throwable t){
				t.printStackTrace();
				QvtCommonAction.log("ERROR:During subset definition "+t);
			}
	}
	public static void defineSubsetsAction(MDMenuAction category,final PresentationElement requestor,final Package browserPackage,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("defineSubsets","define Subsets...",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available reference models;
				//  after selection, create subset models copies from reference, with change to defaultPurpose
				
					DefineSubsetDialogHelper.DefineSubsetPackageDialog(requestor, browserPackage);
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("package"));
		testAction.setDescription(DEFINE_SUBSET_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	
	/*
	static protected boolean isDesiredId(String id){
		for(String desiredId:desiredIds){
			if(id.endsWith(":"+desiredId))return true;
		}
		return false;
	}
	*/
	
}
