/**
 * 
 */
package org.modeldriven.magicdraw.niem.listener;

import java.awt.Frame;
import java.beans.PropertyChangeEvent;
import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;
import java.util.Set;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEMQVTPlugin;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.browser.InstanceBrowserInitializer;
import com.nomagic.magicdraw.ui.browser.InstanceBrowserInitializer.NiemInstanceBrowserTabTree;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.ui.dialogs.SelectElementInfo;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlgFactory;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;
import com.nomagic.uml2.impl.PropertyNames;
import com.nomagic.uml2.transaction.TransactionCommitListener;

/**
 * @author tom
 *
 */
public class NIEMTransactionListener implements TransactionCommitListener,NIEM_ProfileConstants,ToolTipConstants {

	/* (non-Javadoc)
	 * @see com.nomagic.uml2.transaction.TransactionCommitListener#transactionCommited(java.util.Collection)
	 */
	@Override
	public Runnable transactionCommited(final Collection<PropertyChangeEvent> events){
		return new Runnable(){
			public void run(){
//System.out.println("transactionCommitted start");				
//if(true){QvtCommonAction.log("WARNING suppress transactionCommited");return;}				
				boolean isCacheCleared=false;
				Set didThatInstance=new HashSet();
				for (PropertyChangeEvent evt : events)
				{
					String propertyName = evt.getPropertyName();
					
					
					//	if (ExtendedPropertyNames.VIEW_ADDED.equals(propertyName) ||ExtendedPropertyNames.VIEW_REMOVED.equals(propertyName))
//						QvtCommonAction.log("PropertyPropertyChangeListener "+propertyName+", "+evt.getSource()+", "+evt.getNewValue()+", "+evt.getOldValue());
//						QvtCommonAction.log("NIEMTransactionListener "+propertyName+", "+evt.getSource());
//						if(true)return;
//						if (ExtendedPropertyNames.VIEW_ADDED.equals(propertyName) )
//						if(!(PropertyNames.TYPE.equals(propertyName)|| PropertyNames.NAME.equals(propertyName)))return;
						Object test=evt.getSource();
						if(!Element.class.isInstance(test))continue;
						Element element=(Element)test;
						if(!isCacheCleared)
						if(Package.class.isInstance(test)
								||DirectedRelationship.class.isInstance(test)
								||Classifier.class.isInstance(test)
								||Property.class.isInstance(test)
								||ValueSpecification.class.isInstance(test)
								||Slot.class.isInstance(test)
								||InstanceSpecification.class.isInstance(test)
								){
							isCacheCleared=true;
							ProjectCache projectCache=ProjectCache.getProjectCache();
							if(projectCache!=null){
								projectCache.clear();
							}
						}
						// for instance, update diagram
						if((element instanceof InstanceSpecification)
								||(element instanceof ValueSpecification)
								||(element instanceof Slot)
								){
							// if this is a new value, then initTree
							processInstanceChange(element,didThatInstance);
						}
						if(element.getOwner()==null){
							// any correction here is too late
							//System.out.println("TransactionListener element without owner "+element);
							continue;
						}
						if(AssociationClass.class.isInstance(test)){
							AssociationClass association=(AssociationClass)test;
							if(NIEMHelper.isNamed(association)) continue;// already done
							
							Property clientProperty=association.getMemberEnd().get(0);
							Property supplierProperty=association.getMemberEnd().get(1);
							if(!Class.class.isInstance(supplierProperty.getType()))continue;// should not happen
							if(!Class.class.isInstance(clientProperty.getType()))continue;// should not happen
							Class client=(Class)supplierProperty.getType();
							Class supplier=(Class)clientProperty.getType();
//							String associationName=NameHelper.getSimpleBaseClassifierName(client.getName()+supplier.getName());
							String associationName=NameHelper.getBaseClassifierName(client.getName()+supplier.getName());
							association.setName(associationName);
							//NameHelper.fixClassifierName(association, ASSOCIATION_SUFFIX);
					    	String uniqueName=NameHelper.getUniqueClassifierName(association,associationName,ASSOCIATION_SUFFIX);
					    	association.setName(uniqueName);

							clientProperty.setVisibility(VisibilityKindEnum.PUBLIC);
							supplierProperty.setVisibility(VisibilityKindEnum.PUBLIC);
							clientProperty.setAggregation(AggregationKindEnum.NONE);
							ModelHelper.setMultiplicity(0, -1, clientProperty);
							supplierProperty.setAggregation(AggregationKindEnum.NONE);
							ModelHelper.setMultiplicity(0, -1, supplierProperty);
							
							setPropertyName(clientProperty);
							setPropertyName(supplierProperty);
							// add a comment
				        	 NIEMHelper.addComment(association);
							
							association.getOwnedEnd().add(clientProperty);
							association.getOwnedEnd().add(supplierProperty);
							
						}else
						if(Association.class.isInstance(test)){
							Association association=(Association)test;
							// if all members are new
							boolean isNew=true;
							for(Property end:association.getMemberEnd()){
								if(!isNew(end)){
									isNew=false;
									break;
								}
							}
							if(!isNew)continue;
							if(association.getMemberEnd().size()!=2){
								//System.out.println("NIEMTransactionListener association does not have 2 members:"+association.getName()+", "+association.getMemberEnd().size());
								continue;
							}
							//QvtCommonAction.log("NIEMTransactionListener association "+association.getName()+", "+association.getOwnedEnd().size());
							String associationName=association.getName();
							if(REFERENCE.equals(associationName)
									||RoleOfStereotypeName.equals(associationName)
									||CONTENT.equals(associationName)
									||ASSOCIATION.equals(associationName)
									){
								if(association.getOwnedEnd().size()!=2)continue;// already done
								Property clientProperty=association.getMemberEnd().get(0);
								Property supplierProperty=association.getMemberEnd().get(1);
								if(!Class.class.isInstance(supplierProperty.getType()))continue;// should not happen
								if(!Class.class.isInstance(clientProperty.getType()))continue;// should not happen
								Class client=(Class)supplierProperty.getType();
								Class supplier=(Class)clientProperty.getType();
								client.getOwnedAttribute().add(clientProperty);
								clientProperty.setVisibility(VisibilityKindEnum.PUBLIC);
								supplierProperty.setVisibility(VisibilityKindEnum.PUBLIC);
								// may want to verify that this is unique
								//String baseClassifierName=NameHelper.getBaseClassifierName(supplier.getName());
								//String baseName=NameHelper.getBasePropertyName(baseClassifierName);
								clientProperty.setAggregation(AggregationKindEnum.NONE);
								if(CONTENT.equals(associationName)){
						    		clientProperty.setAggregation(AggregationKindEnum.SHARED);
						    		ModelHelper.setMultiplicity(0, -1, clientProperty);
						    		ModelHelper.setMultiplicity(0, 1, supplierProperty);
						        	//String suffix=NameHelper.getRepresentationTerm(clientProperty);
						        	//String uniqueName=NameHelper.getUniquePropertyName(clientProperty,baseName,suffix);
						    		//clientProperty.setName(uniqueName);
									setPropertyName(clientProperty);
									
								}else
								if(RoleOfStereotypeName.equals(associationName)){
						    		NIEMHelper.addStereotype(clientProperty, NIEMHelper.getPimStereotype(RoleOfStereotypeName));
//						        	String suffix=NameHelper.getRepresentationTerm(clientProperty);
//						    		//clientProperty.setName("RoleOf"+baseName+suffix);
//						        	String uniqueName=NameHelper.getUniquePropertyName(clientProperty,"RoleOf"+baseName,suffix);
//									clientProperty.setName(uniqueName);
						    		ModelHelper.setMultiplicity(0, 1, clientProperty);
									ModelHelper.setMultiplicity(0, -1, supplierProperty);
									setPropertyName(clientProperty);
								}else
								if(ASSOCIATION.equals(associationName)){
//						    		ModelHelper.setMultiplicity(0, 1, clientProperty);
						    		ModelHelper.setMultiplicity(0, -1, clientProperty);
									ModelHelper.setMultiplicity(0, -1, supplierProperty);
									supplier.getOwnedAttribute().add(supplierProperty);
									supplierProperty.setAggregation(AggregationKindEnum.NONE);
									setPropertyName(clientProperty);
									setPropertyName(supplierProperty);
									
								}else{
//						        	String suffix=NameHelper.getRepresentationTerm(clientProperty);
//						        	String uniqueName=NameHelper.getUniquePropertyName(clientProperty,baseName,suffix);
//									clientProperty.setName(uniqueName);
//									clientProperty.setName(baseName+suffix);
									ModelHelper.setMultiplicity(0, -1, clientProperty);
									ModelHelper.setMultiplicity(0, -1, supplierProperty);
									setPropertyName(clientProperty);
								}
								supplierProperty.setAggregation(AggregationKindEnum.NONE);
								// add a comment
//					        	 NIEMHelper.addComment(clientProperty);
					        	 
					    		Package associationOwner=NIEMHelper.getNearestInformationModel(clientProperty);
					    		if(associationOwner!=null){
					    			associationOwner.getPackagedElement().add(association);
					    		}
					        	 
								
							}else{
								Property clientProperty=association.getMemberEnd().get(0);
								Property supplierProperty=association.getMemberEnd().get(1);
								if(!Class.class.isInstance(supplierProperty.getType()))continue;// should not happen
								if(!Class.class.isInstance(clientProperty.getType()))continue;// should not happen
								Class client=(Class)supplierProperty.getType();
								Class supplier=(Class)clientProperty.getType();
								
								//client.getOwnedAttribute().add(clientProperty);
								clientProperty.setVisibility(VisibilityKindEnum.PUBLIC);
								supplierProperty.setVisibility(VisibilityKindEnum.PUBLIC);
								setAssociationPropertyName( supplierProperty, client, association);
								setAssociationPropertyName( clientProperty, supplier, association);
							}
						}
						if(!Property.class.isInstance(test))continue;
						Property property=(Property)test;
						if(property.getAssociation()!=null)continue;
						if(isNew(property))
						{
								Type type=property.getType();
//									QvtCommonAction.log("NIEMTransactionListener "+property.getName()+", "+type+", "+property.getAssociation()+", "+property.getOwningAssociation());
//									QvtCommonAction.log("NIEMTransactionListener changeable");
									Stereotype sequenceIDstereotype=NIEMHelper.getPsmStereotype(SequenceIDStereotypeName);
									Stereotype xsdPropertyStereotype=NIEMHelper.getPsmStereotype(XSDPropertyStereotypeName);
									Stereotype xsdAnyStereotype=NIEMHelper.getPsmStereotype(XSDAnyPropertyStereotypeName);
									boolean isSequenceID=NIEMHelper.isSequenceID(property);
									boolean isXsdProperty=NIEMHelper.hasStereotype(property, xsdPropertyStereotype);
									boolean isXsdAny=NIEMHelper.hasStereotype(property, xsdAnyStereotype);
									if((type==null)&&!isSequenceID&&!isXsdAny){
										// try to get a type
										type=TypeDialog();
										if(type!=null)property.setType(type);
									}
//									if(true)return;
									// adjust the name etc.
									//if(property.getAssociation()==null){
									property.setAggregation(AggregationKindEnum.SHARED);
									//}
									property.setVisibility(VisibilityKindEnum.PUBLIC);
						//			NameHelper.fixPropertyName(property,NameHelper.getBasePropertyName(property.getType().getName()),NameHelper.getRepresentationTerm(property));
									ModelHelper.setMultiplicity(0, -1, property);
									if(isXsdAny){
										NameHelper.fixPropertyName(property, "My", XSDAnyPropertyStereotypeName);
										
									}else if(isSequenceID){
										property.setName("sequenceId");
										ModelHelper.setMultiplicity(1,1, property);
										property.setType(getIntegerType());
										
									}else
									if(type==null){
										property.setDerivedUnion(true);
										NameHelper.fixPropertyName(property, "MyAbstract", "");
										
									}else{
//										NameHelper.fixPropertyName(property,NameHelper.getBasePropertyName(NameHelper.getBaseClassifierName(type.getName())),NameHelper.getRepresentationTerm(property));
										setPropertyName(property);
								}
									// add a comment
						        	 NIEMHelper.addComment(property);

									// what if there is already same property in <<InformationModel>>?
						}
				}
//System.out.println("transactionCommitted end");				
			}
			protected void processInstanceChange(Element element,Set didThat){
				if(!isInstanceBrowserChangeEnabled())return;		
				if(didThat.contains(element))return;
				didThat.add(element);
				// process this in instance browser tree
				InstanceBrowserInitializer instanceBrowser=findInstanceBrowser();
				if(instanceBrowser!=null){
					if((element instanceof Slot)&&(((Slot)element).getValue().size()>0))return;// should be handled at value level
					if((element instanceof InstanceSpecification)
							&&(
									(((InstanceSpecification)element).getSlot().size()>0)
								)
							&&	(((InstanceSpecification)element).get_instanceValueOfInstance().size()!=0)
							)return;// should be handled at value level
					//System.out.println("processInstanceChange "+element);
					// if this element not in tree, then initTree
					/*
					if(instanceBrowser.getObjectToNodeMap().get(element)==null){
						NiemInstanceBrowserTabTree tree=instanceBrowser.getBrowserTabTree();
						if(tree!=null){
							tree.initTree();
						}
					}else{
						// otherwise process change
						instanceBrowser.treeElementChanged(element);
					}
					*/
					instanceBrowser.treeElementChanged(element);
				}
			}
			protected InstanceBrowserInitializer findInstanceBrowser(){
				return NIEMQVTPlugin.instanceBrowserInitializer;
			}
			protected void setAssociationPropertyName(Property clientProperty,Classifier supplier,Association association){
				if(clientProperty.getOwningAssociation()==null){
					setPropertyName(clientProperty);
		    		Package associationOwner=NIEMHelper.getNearestInformationModel(clientProperty);
		    		if(associationOwner!=null){
		    			associationOwner.getPackagedElement().add(association);
		    		}
				}
				
			}
			protected void setPropertyName(Property clientProperty){
					// may want to verify that this is unique
					String baseClassifierName=NameHelper.getBaseClassifierName(clientProperty.getType().getName());
					String baseName=NameHelper.getBasePropertyName(baseClassifierName);
					String prefix="";

					if(NIEMHelper.isRoleOf(clientProperty)){
						prefix="RoleOf";
					}
					
		        	String suffix=NameHelper.getRepresentationTerm(clientProperty);
		        	String uniqueName=NameHelper.getUniquePropertyName(clientProperty,prefix+baseName,suffix);
		    		clientProperty.setName(uniqueName);
					// add a comment
		        	 NIEMHelper.addComment(clientProperty);
			}
			protected boolean isNew(Property property){
				if(property.getOwner()==null)return false;
//				if(!VisibilityKindEnum.PRIVATE.equals(property.getVisibility()))return false;
						// check if this is in an InformationModel, it was done by magicdraw, etc.
						//
						Type type=property.getType();
						if(NIEMHelper.isDefaultProperty(property)
								&&(NIEMHelper.isInInformationModel(property)||(property.getOwningAssociation()!=null))
//								&&(type!=null)
								&&((type==null)||(NIEMHelper.isInInformationModel(type)||NIEMHelper.isInXmlTypeLibrary(type)))
								){
							return true;
						}
						return false;
			}
		};
	}

	static public Type TypeDialog(){
		try{
			// selection dialog consisting of available primitive types;
			//  after selection, create properties whose type is selection
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Type for New Property (or none for abstract)","niem_uml_profile_common_propertyPrimitiveType");
			 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
			 Package root=NIEMHelper.getModelRoot();
			 /*
			 for(Package packageTest:root.getNestedPackage()){
				 if(NIEMHelper.isXMLPrimitiveTypesLibrary((Package)packageTest)){
					 root=(Package)packageTest;
					 break;
				 }
			 }
			 */
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement baseElement) {
					if(!Classifier.class.isInstance(baseElement))return false;
					Classifier classifier=(Classifier)baseElement;
					Element test=classifier.getOwner();
					if(Package.class.isInstance(test)){
						Package owningPackage=(Package)test;
						if(NIEMHelper.isXMLPrimitiveTypesLibrary(owningPackage))return true;
					}
					Package informationModel=NIEMHelper.getNearestInformationModel(classifier);
					if(informationModel==null)return false;
					if(NIEMHelper.isPropertyHolder(classifier))return false;
					// do not allow a subsetted <<InformationModel>>
					if(!classifier.isEditable()){
						if(NIEMHelper.isInformationModelDefaultPurposeReference(informationModel))return false;
						for(Dependency references:informationModel.getSupplierDependency()){
							if(NIEMHelper.isReferences(references)){
								return false;
							}
						}
					}
					return true;
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
						types.add(PrimitiveType.class);
						types.add(DataType.class);
						types.add(Class.class);
						types.add(AssociationClass.class);
						types.add(Enumeration.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);
			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,TYPE_DIALOG_DESCRIPTION_TITLE,TYPE_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("selectType");
				 try{
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 if(!Type.class.isInstance(baseElement))continue;
			    	 	Type type=(Type)baseElement;
			    	 	return type;
			     }
				 }finally{
			  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During type selection "+t);
			}
		return null;
	}
	protected PrimitiveType getIntegerType(){
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package p=NIEMHelper.getXMLLibrary();
		if(p!=null)
		for(Type test:p.getOwnedType()){
			if("Integer".equalsIgnoreCase(test.getName())) return (PrimitiveType)test;
		}
		return null;
	}
	static protected boolean isInstanceBrowserChangeEnabled=true;// TODO: test timing
	static public boolean isInstanceBrowserChangeEnabled(){
		return isInstanceBrowserChangeEnabled;
	}

}
