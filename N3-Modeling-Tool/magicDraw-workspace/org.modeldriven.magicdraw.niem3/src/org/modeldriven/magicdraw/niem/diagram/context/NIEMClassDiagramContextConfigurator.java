/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;


import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.modeldriven.magicdraw.niem.change.Changelog;
import org.modeldriven.magicdraw.niem.definition.Definition;
import org.modeldriven.magicdraw.niem.diagram.relation.NIEMRelationMapDiagramAction;
import org.modeldriven.magicdraw.niem.diagram.symbol.DefineSubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMBaseTypeDiagramAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMBusinessRuleAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMEntityDiagramAction;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.instance.InstanceHelper;
import org.modeldriven.magicdraw.niem.lucene.SearchReferenceModels;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.rule.BusinessRuleSuite;
import org.modeldriven.magicdraw.niem.selection.ElementSubtypingDialogHelper;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupRestrictionDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.selection.WildcardDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.selection.WildcardRestrictionDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.table.TableHelper;
import org.modeldriven.magicdraw.niem.table.UnusedElementsFromExchangeTableHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.ActionsID;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.ui.actions.ClassDiagramContextAMConfigurator;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.impl.ClassImpl;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;

/**
 * @author Tom
 *
 */
public class NIEMClassDiagramContextConfigurator extends
		ClassDiagramContextAMConfigurator implements NIEM_ProfileConstants{

	/**
	 * 
	 */
	public NIEMClassDiagramContextConfigurator() {
		// TODO Auto-generated constructor stub
	}
	public static String niemGroupName=null;//"NIEMGROUP";
	static protected MDAction addXsdAnyProperty=new AddXsdAnyProperty();
	static protected MDAction addXsdProperty=new AddXsdProperty();
	static protected MDAction addSequenceID=new AddSequenceID();
	/*
	protected MDAction entityDiagramAction = new NIEMEntityDiagramAction(
			"niemEntityDiagramAction", "NIEM Entity Diagram");
	protected MDAction baseTypeDiagramAction = new NIEMBaseTypeDiagramAction(
			"niemBaseTypeDiagramAction", "NIEM Base Type Diagram");
	*/
	//static protected MDAction addModelPackageDescriptionFileSet= new AddModelPackageDescriptionFileSet();
	
	 public void 	configure(ActionsManager mngr, DiagramPresentationElement diagram, PresentationElement[] selected, final PresentationElement requestor) {
		 try{
		 //log("NIEMClassDiagramContextConfigurator requestor="+requestor+", "+diagram);
			Profile pimProfile=NIEMHelper.getPimProfile();
			Profile mpdProfile=NIEMHelper.getMpdProfile();
			if((pimProfile==null)||(mpdProfile==null))return;
		 
		 if(requestor==null){
			 // add to diagram menu as appropriate
			 //  subset Reference Models
			 Element diagramElement=diagram.getElement();
			 if(diagramElement==null)return;
			 configureNiemContext(mngr, diagramElement.getOwner(), diagram);
/*			 
				boolean isPim=NIEMHelper.isProfileApplied(diagramElement, pimProfile);
				boolean isMpd=NIEMHelper.isProfileApplied(diagramElement, mpdProfile);
				if(!isPim&&!isMpd)return;
			 if(
					 diagramElement.isEditable()
					 &&(isPim||isMpd)
					 
					 ){
					MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
					MDMenuAction category = new MDMenuAction("NIEM", "NIEM",null,niemGroupName);
					category.setSmallIcon(QvtCommonAction.getNiemIcon());
					category.setNested(true);
					categoryDummy.addAction(category);
					if(Package.class.isInstance(diagramElement.getOwner())
							&&!NIEMHelper.isInformationModel((Package)diagramElement.getOwner())
							&&!NIEMHelper.isChangelog((Package)diagramElement.getOwner())
							&&isPim
							){
						DefineSubsetDialogHelper.defineSubsetsAction(category, diagram, null,niemGroupName);
						SubsetDialogHelper.addSubsetAction(category, diagram,null, niemGroupName);
						SubsetDialogHelper.addConstraintAction(category, diagram,null, niemGroupName);
						Changelog.addChangelogAction(category, diagram, null, niemGroupName);
					}
					if(Package.class.isInstance(diagramElement.getOwner())
							&&NIEMHelper.isChangelog((Package)diagramElement.getOwner())
							){
						Changelog.refreshChangelogAction(category, diagram, null, niemGroupName);
					}
					boolean isSubsettingModel=NIEMHelper.isSubsettingModel(diagramElement.getOwner());
					if(isSubsettingModel){
						SubsetDialogHelper.addSubsetClassifierAction(category, diagram, null,niemGroupName);
					}
					Element diagramOwner=diagramElement.getOwner();
					if (NIEMHelper.isInInformationModel(diagramOwner)) {
						Package informationModel=(Package)NIEMHelper.getNearestInformationModel(diagramOwner);
						if (Classifier.class.isInstance(diagramOwner)
								||Package.class.isInstance(diagramOwner)
								) {
							if (NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)) {
								InstanceHelper.addXmlInstanceDocumentDiagramAction(category,diagram, niemGroupName);
							}
						}
					}

					if(!isSubsettingModel && Package.class.isInstance(diagramElement.getOwner())
							&&NIEMHelper.isInformationModel((Package)diagramElement.getOwner())){
						// add all those Classifiers which can be added
						//SubsetDialogHelper.addSubsetAction(category, diagram,null, niemGroupName);
						addClassifiers(category);
					}
					mngr.addCategory(categoryDummy);
			 }
		 */
			 return ;
		 }
		 Element element=requestor.getElement();
		 if(element==null)return;
		 configureNiemContext(mngr, element, requestor);
		 /*
			boolean isPim=NIEMHelper.isProfileApplied(element, pimProfile);
			boolean isMpd=NIEMHelper.isProfileApplied(element, mpdProfile);
			if(!isPim&&!isMpd)return;
		 //if(!NIEMHelper.isProfileApplied(element, pimProfile)) return;
		 if(!element.isEditable())return;
		 //log("NIEMClassDiagramContextConfigurator element="+element);
			MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
			MDMenuAction category = new MDMenuAction("NIEM", "NIEM",null,niemGroupName);
			category.setSmallIcon(QvtCommonAction.getNiemIcon());
			category.setNested(true);
//			category.setEnabled(true);
		
			categoryDummy.addAction(category);
			if(NIEMHelper.isModelPackageDescription(element)){
				category.addAction(addModelPackageDescriptionFileSet);
				AddPOCActionHelper.addPOCDiagramAction(category,requestor, niemGroupName);
			}
			if(Package.class.isInstance(element)
					&&!NIEMHelper.isInformationModel((Package)element)
					&&!NIEMHelper.isChangelog((Package)element)
					&&isPim
					){
				DefineSubsetDialogHelper.defineSubsetsAction(category, requestor, null,niemGroupName);
				SubsetDialogHelper.addSubsetAction(category, requestor, null,niemGroupName);
				SubsetDialogHelper.addConstraintAction(category, requestor, null,niemGroupName);
				Changelog.addChangelogAction(category, requestor, null, niemGroupName);
			}
			if(Package.class.isInstance(element)
					&&NIEMHelper.isChangelog((Package)element)
					){
				Changelog.refreshChangelogAction(category, requestor, null, niemGroupName);
			}
			if (NIEMHelper.isInInformationModel(element)) {
				Package informationModel=(Package)NIEMHelper.getNearestInformationModel(element);
				if (Classifier.class.isInstance(element)
						||Property.class.isInstance(element)
						||Package.class.isInstance(element)
						) {
					if (NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)) {
						InstanceHelper.addXmlInstanceDocumentDiagramAction(category, requestor,niemGroupName);
					}
				}
				if (Classifier.class.isInstance(element)
						||Property.class.isInstance(element)
						||EnumerationLiteral.class.isInstance(element)
						) {
					//category.addAction(NIEMQVTPlugin.searchReferenceModelsAction);
					category.addAction(new SearchReferenceModels((NamedElement) element));

				}
			}
			boolean isSubsettingModel=NIEMHelper.isSubsettingModel(element);
			if(!isSubsettingModel&&Package.class.isInstance(element)&&NIEMHelper.isInformationModel((Package)element)){
				// add all those Classifiers which can be added
				addClassifiers(category);
			}
			if(isSubsettingModel){
				SubsetDialogHelper.addSubsetClassifierAction(category, requestor, null,niemGroupName);
			}
			boolean isInSubsettingModel=NIEMHelper.isSubsettingModel(NIEMHelper.getNearestInformationModel(element));
			if(isPim&&(ClassImpl.class==element.getClass())){
					// Restriction Properties
					Class  elementClass=(Class)element;
					for(Dependency test:elementClass.getClientDependency()){
						if(NIEMHelper.isRestriction(test)){
							SubsetDialogHelper.addRestrictionPropertyAction(category, requestor, null,niemGroupName);
							break;
						}
					}
			}
			if(isInSubsettingModel){
				if(Classifier.class.isInstance(element)){
					SubsetDialogHelper.addSubsetPropertyAction(category, requestor, null,niemGroupName);
					mngr.removeAction(ActionsID.INSERT_NEW_ATTRIBUTE);
				}
				if(Property.class.isInstance(element)){
					Property property=(Property)element;
					Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
					if(propertyHolderProperty!=null){
						if(!propertyHolderProperty.get_propertyOfSubsettedProperty().isEmpty()
								||!propertyHolderProperty.getSubsettedProperty().isEmpty()){
							
							SubstitutionGroupDecompositionDialogHelper.substitutionGroupDecompositionAction(category,property,niemGroupName);
						}
					}
				}				
			}
			else 
			if(isPim){
				if(Property.class.isInstance(element)
						&&NIEMHelper.isInInformationModel(element)
						&&NIEMHelper.isPropertyHolder(((Property)element).getClassifier())
						){
					SubsetDialogHelper.addSetSubstitutionGroupAction(category, requestor, null,niemGroupName);
				}
				
				if(ClassImpl.class==element.getClass()){
					// Property actions
					// Restriction Properties
					Class  elementClass=(Class)element;
					for(Dependency test:elementClass.getClientDependency()){
						if(NIEMHelper.isReferences(test)){
							// only if target is editable
							boolean isEditable=false;
							for(Element ne:test.getSupplier()){
								if(ne.isEditable()&&Class.class.isInstance(ne)){
									isEditable=true;
									break;
								}
							}
							if(isEditable){
							SubsetDialogHelper.addReferencesPropertyAction(category, requestor, null,niemGroupName);
							break;
							}
						}
					}
					for(DirectedRelationship test:elementClass.get_directedRelationshipOfTarget()){
						if(NIEMHelper.isReferences(test)){
							// only if source is editable
							boolean isEditable=false;
							for(Element ne:test.getSource()){
								if(ne.isEditable()&&Class.class.isInstance(ne)){
									isEditable=true;
									break;
								}
							}
							if(isEditable){
							SubsetDialogHelper.addInverseReferencesPropertyAction(category, requestor, null,niemGroupName);
							break;
							}
						}
					}
					category.addAction(addXsdAnyProperty);
					category.addAction(addXsdProperty);
					category.addAction(addSequenceID);
					SubsetDialogHelper.addPrimitivePropertyAction(category, requestor, null,niemGroupName);
				
					
				}
			}
			// add category into manager.
			// Category isn't displayed in context menu.
			mngr.addCategory(categoryDummy);
			*/
		 }catch(Throwable t){
			 log("ERROR:NIEMClassDiagramContextConfigurator failed with "+t);
		 }
	 }
	 public void 	configureNiemContext(ActionsManager mngr, Element element,  final PresentationElement requestor) {
		 try{
		 //log("NIEMClassDiagramContextConfigurator requestor="+requestor+", "+diagram);
			Profile pimProfile=NIEMHelper.getPimProfile();
			Profile mpdProfile=NIEMHelper.getMpdProfile();
			if((pimProfile==null)||(mpdProfile==null))return;
		 
			 if(element==null)return;
				boolean isPim=NIEMHelper.isProfileApplied(element, pimProfile);
				boolean isMpd=NIEMHelper.isProfileApplied(element, mpdProfile);
				if(!isPim&&!isMpd)return;
				if(!element.isEditable())return;
				for(EObject child:element.eContents()){
					if(Element.class.isInstance(child)&&!((Element)child).isEditable())return;
				}
					MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
					MDMenuAction category = new MDMenuAction("NIEM", "NIEM",null,niemGroupName);
					category.setSmallIcon(QvtCommonAction.getNiemIcon());
					category.setNested(true);
					categoryDummy.addAction(category);
					if(NIEMHelper.isModelPackageDescription(element)){
						MDAction addModelPackageDescriptionFileSet= new AddModelPackageDescriptionFileSet(element,requestor);
						category.addAction(addModelPackageDescriptionFileSet);
						if(requestor==null){
							AddPOCActionHelper.addPOCAction(category, niemGroupName);
							
						}else{
						AddPOCActionHelper.addPOCDiagramAction(category,requestor, niemGroupName);
						}
					}
					if(Package.class.isInstance(element)
							&&!NIEMHelper.isInformationModel((Package)element)
							&&!NIEMHelper.isChangelog((Package)element)
							&&isPim
							){
						DefineSubsetDialogHelper.defineSubsetsAction(category, requestor, (Package)element,niemGroupName);
						SubsetDialogHelper.addSubsetAction(category, requestor,(Package)element, niemGroupName);
						SubsetDialogHelper.addConstraintAction(category, requestor,(Package)element, niemGroupName);
						Changelog.addChangelogAction(category, requestor, (Package)element, niemGroupName);
						BusinessRuleSuite.addBusinessRuleSuiteAction(category, niemGroupName);
						//Definition.INSTANCE.refreshSubsetDefinitionsAction(category,requestor,(Package)element,niemGroupName);
					}
					if(Package.class.isInstance(element)
							&&NIEMHelper.isChangelog((Package)element)
							){
						Changelog.refreshChangelogAction(category, requestor, (Package)element, niemGroupName);
					}
					boolean isSubsettingModel=NIEMHelper.isSubsettingModel(element);
					if(isSubsettingModel){
						SubsetDialogHelper.addSubsetClassifierAction(category, requestor, (Package)element,niemGroupName);
					}
					if (Package.class.isInstance(element)
							&&NIEMHelper.isInformationModel((Package) element)){
						Package informationModel=(Package)element;
						TableHelper.newNIEMPackageDependenciesTableAction(category, requestor,(Package) element, niemGroupName);
						TableHelper.newNIEMUsedByPackageDependenciesTableAction(category, requestor,(Package) element, niemGroupName);
					}
					//Element diagramOwner=diagramElement.getOwner();
					if (NIEMHelper.isInInformationModel(element)) {
						Package informationModel=(Package)NIEMHelper.getNearestInformationModel(element);
						if (Classifier.class.isInstance(element)
								||Property.class.isInstance(element)
								||Package.class.isInstance(element)
								) {
							
							if (NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)) {
								if(requestor==null){
									InstanceHelper.addXmlInstanceDocumentAction(category, niemGroupName);
								}else{
									InstanceHelper.addXmlInstanceDocumentDiagramAction(category,requestor, niemGroupName);
								}
							}
							if(requestor==null){
								MDAction relationDiagramAction=new NIEMRelationMapDiagramAction(element);
								category.addAction(relationDiagramAction);
							}
						}
						
						if (Classifier.class.isInstance(element)
								||Property.class.isInstance(element)
								||EnumerationLiteral.class.isInstance(element)
								||Package.class.isInstance(element)
								) {
							TableHelper.newNIEMCommentTableAction(category, requestor,(NamedElement) element, niemGroupName);
						}
						boolean isAssociation=(Association.class.isInstance(element)&&!AssociationClass.class.isInstance(element));
						if (Classifier.class.isInstance(element)
								||Property.class.isInstance(element)
								||EnumerationLiteral.class.isInstance(element)
								) {
							//category.addAction(NIEMQVTPlugin.searchReferenceModelsAction);
							category.addAction(new SearchReferenceModels((NamedElement) element));

						}
							if (Classifier.class.isInstance(element)
									&&!isAssociation) {
								// EntityDiagram
//								category.addAction(entityDiagramAction);
//								category.addAction(baseTypeDiagramAction);
								category.addAction(new NIEMEntityDiagramAction(
										"niemEntityDiagramAction", "NIEM Entity Diagram",(Classifier)element));
								category.addAction(new NIEMBaseTypeDiagramAction(
										"niemBaseTypeDiagramAction", "NIEM Base Type Diagram",(Classifier)element));
								category.addAction(new NIEMBusinessRuleAction(
										"niemBusinessRuleAction", "add NIEM Business Rule",(Classifier)element));
								

								//category.addAction(searchReferenceModelsAction);
							}
					}

					if(!isSubsettingModel && Package.class.isInstance(element)
							&&NIEMHelper.isInformationModel((Package)element)){
						// add all those Classifiers which can be added
						//SubsetDialogHelper.addSubsetAction(category, diagram,null, niemGroupName);
						if(requestor!=null){
						addClassifiers(category);
						}
					}
					/////////////////////////////////////////////////////////////////////////////////
					boolean isInSubsettingModel=NIEMHelper.isSubsettingModel(NIEMHelper.getNearestInformationModel(element));
					boolean isInConstraintModel=NIEMHelper.isInformationModelDefaultPurposeConstraint(NIEMHelper.getNearestInformationModel(element));
					if(isPim&&(ClassImpl.class==element.getClass())){
							// Restriction Properties
							Class  elementClass=(Class)element;
							if(NIEMHelper.isBaseTypeRestriction(elementClass)){
								SubsetDialogHelper.addRestrictionPropertyAction(category, requestor,elementClass,niemGroupName);
							}
					}
					if(isPim&&(element instanceof Enumeration)){
						// Restriction Enumeration Literals
						Enumeration baseEnumeration=(Enumeration)element;
						if(NIEMHelper.isBaseTypeRestriction(baseEnumeration)){
							Classifier test=NIEMHelper.getBaseClassifier(baseEnumeration);
							if(test instanceof Enumeration){
								SubsetDialogHelper.addRestrictionEnumerationAction(category, requestor,baseEnumeration,niemGroupName);
							}
						}
				}
					if (Property.class.isInstance(element)
							||Classifier.class.isInstance(element)
							||Package.class.isInstance(element)
							) {
						if(requestor==null){
						TableHelper.newNIEMPropertyTableAction(category, requestor,(NamedElement) element, niemGroupName);
						}
					}
					if (Classifier.class.isInstance(element)
							||Package.class.isInstance(element)
							) {
						if(requestor==null){
							TableHelper.newNIEMTypeTableAction(category, requestor,(NamedElement) element, niemGroupName);
							UnusedElementsFromExchangeTableHelper.newNIEMUsedByPackageDependenciesTableAction(category, requestor,(NamedElement)element, niemGroupName);
						}
					}
					if(isInSubsettingModel){
						if(Classifier.class.isInstance(element)){
							// not sure why this is not allowed in constraint model? because we want to encourage type constraints in base-schema
							if(!isInConstraintModel){
								SubsetDialogHelper.addSubsetPropertyAction(category, requestor, (Classifier)element,niemGroupName);
								if(element instanceof Enumeration){
									SubsetDialogHelper.addSubsetEnumerationAction(category, requestor, (Enumeration)element,niemGroupName);
								}
							}
							mngr.removeAction(ActionsID.INSERT_NEW_ATTRIBUTE);
						}
						
						if(!isInConstraintModel&&Property.class.isInstance(element)&&!NIEMHelper.isPropertyHolder(element.getOwner())){
							Property property=(Property)element;
							Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
							if(propertyHolderProperty!=null){
								if(!propertyHolderProperty.get_propertyOfSubsettedProperty().isEmpty()
										||!propertyHolderProperty.getSubsettedProperty().isEmpty()){
									
									SubstitutionGroupDecompositionDialogHelper.INSTANCE.substitutionGroupDecompositionAction(category,property,niemGroupName);
								}
							}
							// check if this is related to an xsd:any decomposition
							Classifier referenceClassifier=
									NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(NameHelper.getOwningClassifier(property));
							//QvtCommonAction.log("TEST any referenceClassifier "+referenceClassifier);
							if(NIEMHelper.hasAny(referenceClassifier)){
									WildcardDecompositionDialogHelper.INSTANCE.wildcardDecompositionAction(category,property,niemGroupName);
							}
						}
//						else 
						if(Property.class.isInstance(element)){
							Property property=(Property)element;
							if(isSubtypeableElement(property)){
								ElementSubtypingDialogHelper.INSTANCE.elementSubtypingConstraintAction(category,property,niemGroupName);
								
							}
						}				
					}
					else 
					if(isPim){
						if(Property.class.isInstance(element)
								&&NIEMHelper.isInInformationModel(element)
								){
							Property property=(Property)element;
							Classifier classifier=NameHelper.getOwningClassifier(property);
							
							if(NIEMHelper.isPropertyHolder(classifier)
									){
								SubsetDialogHelper.addSetSubstitutionGroupAction(category, requestor, property,niemGroupName);
							}
							if(NIEMHelper.isBaseTypeRestriction(classifier)){
								// check if property is for substitutable or any
								Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
								if(propertyHolderProperty!=null){
									if(!propertyHolderProperty.get_propertyOfSubsettedProperty().isEmpty()
											||!propertyHolderProperty.getSubsettedProperty().isEmpty()){
										
										SubstitutionGroupRestrictionDecompositionDialogHelper.INSTANCE.substitutionGroupRestrictionDecompositionAction(category,property,niemGroupName);
									}
								}
								// check if this is related to an xsd:any decomposition
								Classifier referenceClassifier=WildcardRestrictionDecompositionDialogHelper.INSTANCE.getDecompositionReferenceClassifier(NameHelper.getOwningClassifier(property));
									if(NIEMHelper.hasAny(referenceClassifier)){
										WildcardRestrictionDecompositionDialogHelper.INSTANCE.wildcardRestrictionDecompositionAction(category,property,niemGroupName);
										
									}
							}
						}
						
						if(ClassImpl.class==element.getClass()){
							// Property actions
							// Restriction Properties
							Class  elementClass=(Class)element;
							for(Dependency test:elementClass.getClientDependency()){
								if(NIEMHelper.isReferences(test)){
									// only if target is editable
									boolean isEditable=false;
									for(Element ne:test.getSupplier()){
										if(ne.isEditable()&&Class.class.isInstance(ne)){
											isEditable=true;
											break;
										}
									}
									if(isEditable){
									SubsetDialogHelper.addReferencesPropertyAction(category, requestor, (Class)element,niemGroupName);
									break;
									}
								}
							}
							for(DirectedRelationship test:elementClass.get_directedRelationshipOfTarget()){
								if(NIEMHelper.isReferences(test)){
									// only if source is editable
									boolean isEditable=false;
									for(Element ne:test.getSource()){
										if(ne.isEditable()&&Class.class.isInstance(ne)){
											isEditable=true;
											break;
										}
									}
									if(isEditable){
									SubsetDialogHelper.addInverseReferencesPropertyAction(category, requestor, (Class)element,niemGroupName);
									break;
									}
								}
							}
							if(requestor!=null){
								category.addAction(addXsdAnyProperty);
								category.addAction(addXsdProperty);
								category.addAction(addSequenceID);
							}
							SubsetDialogHelper.addPrimitivePropertyAction(category, requestor, (Class)element,niemGroupName);
						
							
						}
					}
					///////////////////////////////////////////////////////////////////////////////
					mngr.addCategory(categoryDummy);
			 return ;
		 }catch(Throwable t){
			 log("ERROR:NIEMClassDiagramContextConfigurator failed with "+t);
		 }
	 }
	 static protected boolean isSubtypeableElement(Property property){
		 return NIEMHelper.isNiemSubsetTypeOverrideable(property);
		 /*
			// subtype constraint; may be in PropertyHolder or otherwise a Property with no references to PropertyHolder Property
			// must be subtypes (based on reference level property) available; 
			// must not contradict any substitutionGroup currently referencing;
			// must not contradict its substitutionGroup
			// should propagate changes to any uses of this property
			Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
			if(!(NIEMHelper.isPropertyHolder(property.getOwner())||(propertyHolderProperty==null)))return false;
				Property referenceModelProperty=NIEMHelper.getReferenceProperty(property);
				if("InsuranceApplicantQualifiedNonCitizenStatus".equals(property.getName())){
					System.out.println("DEBUG isSubtypeableElement "+property.getQualifiedName()+", "+referenceModelProperty+", "+propertyHolderProperty+", "+NIEMHelper.isPropertyHolder(property.getOwner()));
				}
				if(referenceModelProperty==null)return false;

				Classifier referenceModelType=(Classifier)referenceModelProperty.getType();
				
					Classifier currentSubsetModelType=(Classifier)property.getType();
					// currentSubsetModelType either corresponds to referenceModelType or some parent of currentSubsetModelType does
					
//					Classifier subsetType=getSubsetType(referenceModelProperty,property);
//					Classifier subsetType=getSubsetType(referenceModelProperty,property);
					
					Classifier subsetModelType=currentSubsetModelType;
					// can not offer supertype if any subsettedProperty at same type
					Classifier subsetModelTypeLimit=null;
					for(Property subsettedProperty:property.getSubsettedProperty()){
						subsetModelTypeLimit=(Classifier)subsettedProperty.getType();
					}
	        		if(NIEMHelper.isXMLPrimitiveType(subsetModelType)){}
	        		else {
	        			// find subset type which matches reference type by climbing subset type inheritance, if necessary
	        			subsetModelType=NIEMHelper.getSubsetModelClassifierForReferenceModelClassifier(subsetModelType,referenceModelType);
	        		}
					if(subsetModelTypeLimit!=null){
						// subsetModelType must be subtype of subsetModelTypeLimit
						if((subsetModelType==null)||!NIEMHelper.isSubTypeOf(subsetModelType, subsetModelTypeLimit)){
							subsetModelType=subsetModelTypeLimit;
						}
					}
					
					
					boolean isSubtypingPossible=false;
					if(subsetModelType==null){
						isSubtypingPossible=true;
					}else{
						Set<Classifier> subTypes=NIEMHelper.getDerivedClassifiers(subsetModelType);
						if(!subTypes.isEmpty())isSubtypingPossible=true;
					}
					// can not subtype if any referencing substitutionGroup at same type
					// an abstract property can only be subtyped if there is some common type amongst all substitution groups
					Set<Classifier> allCommonTypes=null;
					for(Property subsettingProperty:property.get_propertyOfSubsettedProperty()){
						Type subsettingPropertyType=subsettingProperty.getType();
						if(subsetModelType==null){
							if(subsettingPropertyType==null){
								//isSubtypingPossible=false;
								//break;
							}else{
								// get all types
								Set<Classifier> allTypes=new HashSet<Classifier>();
								NIEMHelper.getAllBaseClassifiers((Classifier)subsettingPropertyType, allTypes);
								if(allCommonTypes==null){
									allCommonTypes=allTypes;
								}else{
									allCommonTypes.retainAll(allTypes);
								}
								if(allCommonTypes.size()<=1)return false;
							}
						}
						else if(subsetModelType.equals(subsettingPropertyType)){
							isSubtypingPossible=false;
							break;
						}
					}
					return isSubtypingPossible;
					*/
	 }

		static public MDAction ObjectTypeAction = new AddNIEMTypeAction(
				ObjectTypeStereotypeName);
		static public MDAction AdapterTypeAction = new AddNIEMTypeAction(
				AdapterTypeStereotypeName);
		static public MDAction AssociationTypeAction = new AddNIEMTypeAction(
				AssociationTypeStereotypeName);
		static public MDAction AugmentationTypeAction = new AddNIEMTypeAction(
				AugmentationTypeStereotypeName);
		static public MDAction MetadataTypeAction = new AddNIEMTypeAction(
				MetadataTypeStereotypeName);

		static public MDAction ChoiceAction = new AddNIEMTypeAction(
				ChoiceStereotypeName);
		static public MDAction PropertyHolderAction = new AddNIEMTypeAction(
				PropertyHolderStereotypeName);
		static public MDAction ClassAction = new AddClassAction();
		
		static public MDAction ListAction = new AddNIEMDataTypeAction(ListStereotypeName);
		static public MDAction UnionAction = new AddNIEMDataTypeAction(UnionStereotypeName);

		static public MDAction ValueRestrictionAction = new AddNIEMPrimitiveTypeAction(
				ValueRestrictionStereotypeName);
		static public MDAction dataTypeAction = new AddDataTypeAction();
		static public MDAction primitiveTypeAction = new AddPrimitiveTypeAction();
		static public MDAction enumerationAction = new AddEnumerationAction();
		static public MDAction complexEnumerationAction = new AddComplexEnumerationAction();
	 
	 protected void addClassifiers(MDMenuAction category){
		 category.addAction(ObjectTypeAction);
		 category.addAction(AdapterTypeAction);
		 category.addAction(AssociationTypeAction);
		 category.addAction(AugmentationTypeAction);
		 category.addAction(MetadataTypeAction);
		 category.addAction(ChoiceAction);
		 category.addAction(PropertyHolderAction);
		 // ClassAction
		 category.addAction(ClassAction);
		 category.addAction(ValueRestrictionAction);
		 category.addAction(ListAction);
		 category.addAction(UnionAction);

		 category.addAction(dataTypeAction);
		 category.addAction(primitiveTypeAction);
		 category.addAction(enumerationAction);
		 category.addAction(complexEnumerationAction);
	 }
/////////////////////////////////
	 
		static public void log(String text){
			Application.getInstance().getGUILog().log(text);
		}
		/*
		protected Collection<Property> getAllAttributes(Classifier c){
			Set<Property> properties=new HashSet<Property>();
			properties.addAll(c.getAttribute());
			for(Classifier general:getAllParents(c))properties.addAll(general.getAttribute());
			return properties;
		}
		protected Collection<Classifier> getAllParents(Classifier c){
			Set<Classifier> classifiers=new HashSet<Classifier>();
			for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
			return classifiers;
		}
		protected void addAllParents(Classifier c,Collection<Classifier> classifiers){
			classifiers.add(c);
			for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
		}
		*/
		protected boolean isSuperTypeOf(Classifier general,Classifier specific){
			if(specific==null)return false;
			if(specific.equals(general))return true;
			for(Classifier specificSuper:specific.getGeneral()){
				if(isSuperTypeOf(general,specificSuper))return true;
			}
			return false;
		}
		/*
		protected Stereotype getMpdStereotype(String stereotypeName){
			return StereotypesHelper.getStereotype(getProject(),stereotypeName,getMpdProfile()); 
		}
		protected Stereotype getPimStereotype(String stereotypeName){
			return StereotypesHelper.getStereotype(getProject(),stereotypeName,getPimProfile()); 
		}
		protected Stereotype getPsmStereotype(String stereotypeName){
			return StereotypesHelper.getStereotype(getProject(),stereotypeName,getPsmProfile()); 
		}
		protected Stereotype getCommonStereotype(String stereotypeName){
			return StereotypesHelper.getStereotype(getProject(),stereotypeName,getCommonProfile()); 
		}
		protected Profile getPimProfile(){
			return getProfile(PimProfileName); 
		}
		protected Profile getPsmProfile(){
			return getProfile(PsmProfileName); 
		}
		protected Profile getMpdProfile(){
			return getProfile(MpdProfileName); 
		}
		protected Profile getCommonProfile(){
			return getProfile(CommonProfileName); 
		}
		protected Profile getProfile(String profileName){
			return StereotypesHelper.getProfile(getProject(),profileName);
		}
		protected Project getProject(){
			return Application.getInstance().getProject();
		}
		*/
		/*
		protected com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getXmlTypePackage(){
			for(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package test:NIEMHelper.getProject().getModel().getNestedPackage()){
				if("Integer".equalsIgnoreCase(test.getName())) 
						return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)test;
			}
			return null;
		}
		*/
}
