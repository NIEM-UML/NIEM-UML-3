/**
 *
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.openapi.uml.PresentationElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.manipulators.ViewManipulator;
import com.nomagic.magicdraw.uml.symbols.manipulators.actions.CompoundManipulatorActionManager;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.magicdraw.uml.symbols.paths.RealizationView;
import com.nomagic.magicdraw.uml.symbols.shapes.ShapeElement;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;

/**
 * @author Tom
 *
 */
public class ReferencesDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public ReferencesDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public void update(PresentationElement pe){
		//System.out.println("References update "+pe);
//	public void beforeUpdate(PresentationElement pe){
		// abort if meta-class ends are not same
		Realization element=(Realization)pe.getElement();
//		("Realization update start "+pe);
		//element.set_representationText(null);
		 
		RealizationView view=(RealizationView)pe;
		
		PresentationElement clientPE=view.getClient();
		PresentationElement supplierPE=view.getSupplier();
		//System.out.println("References update clientPE "+clientPE);
		// no client at this stage if there is no supplier
		if((clientPE==null)){
			// client not yet selected or operation aborted
			//QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed to get client presentation "+element.getQualifiedName());
			return;
			}
		//System.out.println("References update supplier "+supplierPE);
		if((supplierPE==null)){QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed to get supplier presentation "+element.getQualifiedName());return;}
		DiagramPresentationElement dpe=pe.getDiagramPresentationElement();
		Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
		Set<PresentationElement> newElements=new HashSet<PresentationElement>();
		if(element==null)return;
//		 boolean isSessionCreated=NIEMHelper.createSession("subset");								 
		try{
		for(NamedElement client:element.getClient()){
			for(NamedElement supplier:element.getSupplier()){
				if(Property.class.isInstance(client)&&Classifier.class.isInstance(supplier)){
					// either find existing or create new and hook up to Realization
					Property clientProperty=((Property)client);
					Classifier supplierClassifier=(Classifier)supplier;
					String clientName=(clientProperty.getName()==null)?"":clientProperty.getName();
					boolean isExistingProperty=false;
					for(Property supplierProperty:supplierClassifier.getAttribute()){
						if(clientName.equals(supplierProperty.getName())){
							//setStatusText("<<References>> Supplier will become existing Property named "+clientName);
							
							element.getSupplier().clear();
							element.getSupplier().add(supplierProperty);
							isExistingProperty=true;
							//ShapeElement shape=PresentationElementsManager.getInstance().createShapeElement(supplierClassifier, pe.getDiagramPresentationElement());
							PresentationElement shape=SubsetDialogHelper.getOrCreateShape(supplierProperty,dpe,pe,element2presentation,newElements);
							if(shape==null){
								QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed to create shape for "+supplierProperty.getQualifiedName());
								break;
							}
							//supplierPE.addPresentationElementWithoutResize(shape);
//							view.setSupplier(shape);
							//PresentationElement pathElement=SubsetDialogHelper.getOrCreatePath(element,clientPE,shape, dpe,pe,element2presentation);
							PresentationElement child=PresentationElementUtility.createPathElement(element,clientPE,shape,false,element2presentation);
							
							break;
						}
					}
					if(!isExistingProperty){
						//setStatusText("<<References>> Supplier will be added Property named "+clientName);
						Property newSupplierProperty=NIEMFactory.instance.shallowPropertyCopy(clientProperty);
						newSupplierProperty.setType(clientProperty.getType());
						if(Class.class.isInstance(supplierClassifier))((Class)supplierClassifier).getOwnedAttribute().add(newSupplierProperty);
						else ((DataType)supplierClassifier).getOwnedAttribute().add(newSupplierProperty);
						element.getSupplier().clear();
						element.getSupplier().add(newSupplierProperty);
						
						// for some reason why can not create the new path element here
						PresentationElement shape=SubsetDialogHelper.getOrCreateShape(newSupplierProperty,dpe,pe,element2presentation,newElements);
						if(shape==null){
							QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed to create shape for "+newSupplierProperty.getQualifiedName());
							break;
						}
						//supplierPE.addPresentationElementWithoutResize(shape);
						//view.setSupplier(shape);
						
						//PresentationElement pathElement=SubsetDialogHelper.getOrCreatePath(element,clientPE,shape, dpe,pe,element2presentation);
						//NIEMHelper.closeSession(isSessionCreated);
						//isSessionCreated=NIEMHelper.createSession("subset");	
						PresentationElement child=PresentationElementUtility.createPathElement(element,clientPE,shape,false,element2presentation);
					}
					
					/*
					// check for PropertyHolder as supplier
					StereotypesHelper.removeStereotypeByString(element, ReferencesStereotypeName);
					element.setName("Invalid References from Property to Class");
					QvtCommonAction.log("<<References>> removed from Realization between Property and Class ");
					*/
					break;
//					return;
				}
				if(Property.class.isInstance(supplier)&&Classifier.class.isInstance(client)){
					// either find existing or create new and hook up to Realization
					Property supplierProperty=((Property)supplier);
					Classifier clientClassifier=(Classifier)client;
					String supplierName=(supplierProperty.getName()==null)?"":supplierProperty.getName();
					boolean isExistingProperty=false;
					for(Property clientProperty:clientClassifier.getAttribute()){
						if(supplierName.equals(clientProperty.getName())){
							//setStatusText("<<References>> Supplier will become existing Property named "+clientName);
							element.getClient().clear();
							element.getClient().add(clientProperty);
							isExistingProperty=true;
							PresentationElement shape=SubsetDialogHelper.getOrCreateShape(clientProperty,dpe,pe,element2presentation,newElements);
							if(shape==null){
								QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed to create shape for "+clientProperty.getQualifiedName());
								break;
							}
							//clientPE.addPresentationElementWithoutResize(shape);
//							view.setClient(shape);
							PresentationElement child=PresentationElementUtility.createPathElement(element,shape,supplierPE,false,element2presentation);
							//PresentationElement pathElement=SubsetDialogHelper.getOrCreatePath(element,shape,supplierPE, dpe,pe,element2presentation);
							break;
						}
					}
					if(!isExistingProperty){
						//setStatusText("<<References>> Supplier will be added Property named "+clientName);
						Property newClientProperty=NIEMFactory.instance.shallowPropertyCopy(supplierProperty);
						newClientProperty.setType(supplierProperty.getType());
						if(Class.class.isInstance(clientClassifier))((Class)clientClassifier).getOwnedAttribute().add(newClientProperty);
						else ((DataType)clientClassifier).getOwnedAttribute().add(newClientProperty);
						
						element.getClient().clear();
						element.getClient().add(newClientProperty);
						PresentationElement shape=SubsetDialogHelper.getOrCreateShape(newClientProperty,dpe,pe,element2presentation,newElements);
						if(shape==null){
							QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed to create shape for "+newClientProperty.getQualifiedName());
							break;
						}
						/*						
						//clientPE.addPresentationElementWithoutResize(shape);
						view.setClient(shape);
//						element.getClient().remove(clientPE);
*/						
						PresentationElement child=PresentationElementUtility.createPathElement(element,shape,supplierPE,false,element2presentation);
						//PresentationElement pathElement=SubsetDialogHelper.getOrCreatePath(element,shape,supplierPE, dpe,pe,element2presentation);
					}
					
					/*
					// check for PropertyHolder as supplier
					StereotypesHelper.removeStereotypeByString(element, ReferencesStereotypeName);
					element.setName("Invalid References from Property to Class");
					QvtCommonAction.log("<<References>> removed from Realization between Property and Class ");
					*/
					break;
//					return;
				}
				// check for Classifier to Property
			}
		}
		}catch(Throwable e){
			QvtCommonAction.log("ERROR: ReferencesDecoratorAdapter failed "+e);
			e.printStackTrace();
			/*
		}finally{
			NIEMHelper.closeSession(isSessionCreated);
			*/
		}
		super.update(pe);
	}
	// no adjustments on update
	/*
	public void update(PresentationElement pe){
		super.update(pe);
		if(pe==null)return;
		Realization element=(Realization)pe.getElement();
		if(element==null)return;
		if(!"inverse".equals(element.getName()))return;
		log("Realization update start "+pe);
		//element.set_representationText(null);
		RealizationView view=(RealizationView)pe;
		// swap uml elements
		Collection<NamedElement> clients=new Vector<NamedElement>(element.getClient());
		Collection<NamedElement> suppliers=new Vector<NamedElement>(element.getSupplier());
		element.getClient().clear();
		element.getClient().addAll(suppliers);
		element.getSupplier().clear();
		element.getSupplier().addAll(clients);
		element.setName("");
		view.swapEnds();// this does not seem to do what we want
		super.update(pe);
		////////////////
		////////////
		// make adjustements:
		//   create additional elements as required, adjust view targets, propagate stereotypes and properties
		PresentationElement clientPE=view.getClient();
		PresentationElement supplierPE=view.getSupplier();

		if((clientPE==null)||(supplierPE==null))return;
		Element clientElement=clientPE.getElement();
		Element supplierElement=supplierPE.getElement();
		if((clientElement==null)||(supplierElement==null))return;
		log("references update client "+((NamedElement)clientElement).getQualifiedName()+", "+((NamedElement)supplierElement).getQualifiedName());
		if(true){
		Package supplierPackage=null;
		if(Package.class.isInstance(supplierElement))supplierPackage=(Package)supplierElement;
		else supplierPackage=NIEMHelper.getNearestPackage(supplierElement);
		Package clientPackage=null;
		try {
		if(Package.class.isInstance(clientElement))clientPackage=(Package)clientElement;
		else clientPackage=NIEMHelper.getNearestPackage(clientElement);
		if(Property.class.isInstance(supplierElement)){
			if(Property.class.isInstance(clientElement)){
				// update name and tags from supplier

			}else{

				// create a Property inside the Classifier , switch the uml client and view client
			}

		}
		else if(Classifier.class.isInstance(element)){
			if(Classifier.class.isInstance(clientElement)){
				// update name and tags from supplier

			}else{
				// create a Classifier inside the <<InformationModel>> , switch the uml client and view client
				Classifier newClientClassifier=NIEMFactory.instance.shallowClassifierCopy((Classifier)element);
				clientPackage.getPackagedElement().add(newClientClassifier);
				element.getClient().clear();
				element.getClient().add(newClientClassifier);

					ShapeElement shape=PresentationElementsManager.getInstance().createShapeElement(newClientClassifier, pe.getDiagramPresentationElement());
					clientPE.addPresentationElement(shape);
					view.setClient(shape);
			}

		}else{
			// from information model
			if(NIEMHelper.isInformationModel(clientElement)){
				// update name and tags from supplier
			}else{
				// create an <<InformationModel>> inside the client package, switch the uml client and view client
				Package newClientPackage=NIEMFactory.instance.shallowPackageCopy(supplierPackage);
				// update defaultKind to subsets
				NIEMHelper.setInformationModelDefaultPurpose(newClientPackage,subsetLiteralName);

				clientPackage.getPackagedElement().add(newClientPackage);
				element.getClient().clear();
				element.getClient().add(newClientPackage);

					ShapeElement shape=PresentationElementsManager.getInstance().createShapeElement(newClientPackage, pe.getDiagramPresentationElement());
					clientPE.addPresentationElementWithoutResize(shape);
					view.setClient(shape);
			}
		}
		} catch (ReadOnlyElementException e) {
			// TODO Auto-generated catch block
			log("ERROR: NIEMSymbolDecorator creating Shape "+e);
		}

}
		log("Realization update complete "+pe);
	}
	*/
	// does not seem to matter
	/*
	public boolean canAddInstance(PresentationElement pres,PresentationElement pres2){
		if(true)return true;
		
		if((pres2==null)
				||(pres2.getElement()==null)
				){
			return false;
		}
		Element clientElement=pres2.getElement();
		if(!(clientElement instanceof Property))return false;
		if((pres==null)||(pres.getElement()==null)){
			System.out.println("canAddInstance");
			return true;
		}
		
		boolean result=super.canAddInstance(pres, pres2);
		return result;
	}
*/
	public boolean isConnectable2Obj(PathElement pe,PresentationElement pres,PresentationElement pres2){
		// should probably check if Package is namespace, and other types are in a namespace
		// there are no opposites for realizations
//		ViewManipulator manipulator=this.getManipulator(pe);
//		CompoundManipulatorActionManager x;
//		manipulator.
		if((pres2==null)
				||(pres2.getElement()==null)
				){
			setStatusText("No Client selected");
			return false;
		}
		Element clientElement=pres2.getElement();
		String metaClassName=clientElement.eClass().getName();
		if(!(
				Package.class.isInstance(clientElement)
//				||"Class".equals(metaClassName)
				||Classifier.class.isInstance(clientElement)
				||Property.class.isInstance(clientElement)

			)){
			setStatusText("<<References>> Client must be a Package, Classifier, or Property");
			return false;
		}
	    // Package must be an InformationModel; Class or Property must be in an InformationModel
		// but what about a <<References>> from a <<MessageType>>?
		// seems we have too many checks here to allow that to happen
		Package clientPackage=null;
		if(Package.class.isInstance(clientElement))clientPackage=(Package)clientElement;
		else clientPackage=NIEMHelper.getNearestInformationModel(clientElement);
		if((clientPackage==null)||!NIEMHelper.isInformationModel(clientPackage)){
			setStatusText("<<References>> Client must be an <<InformationModel>> or contained by one");
			return false;
		}
		if(!clientElement.isEditable()){
			setStatusText("<<References>> Client must be editable");
			return false;

		}
		// client must not be a reference model
		/*
		EnumerationLiteral defaultPurpose=NIEMHelper.getInformationModelDefaultPurpose(clientPackage);

		boolean isClientReference=(defaultPurpose!=null)&&referenceLiteralName.equals(defaultPurpose.getName());
		if(Package.class.isInstance(clientElement)&&isClientReference){
			setStatusText("<<References>> Client must not be a NIEM Reference Model");
			return false;
		}
		*/
		if((pres==null)||(pres.getElement()==null))return true;
		// source and target must be same metaclass:or allow to drop on container
		Element supplierElement=pres.getElement();
		if(NIEMHelper.isElementProxy(supplierElement)){
			setStatusText("<<References>> Supplier must NOT be a proxy");
			QvtCommonAction.log("<<References>> Supplier must NOT be a proxy");
			return false;
		}

		Package supplierPackage=null;
		if(Package.class.isInstance(supplierElement))supplierPackage=(Package)supplierElement;
		else supplierPackage=NIEMHelper.getNearestInformationModel(supplierElement);
		if((supplierPackage==null)||!NIEMHelper.isInformationModel(supplierPackage)){
			setStatusText("<<References>> Supplier must be an <<InformationModel>> or contained by one");
			QvtCommonAction.log("<<References>> Supplier must be an <<InformationModel>> or contained by one");
			return false;
		}
		
		if(NamedElement.class.isInstance(clientElement)
				&&NamedElement.class.isInstance(supplierElement)
				&&hasExistingReferences((NamedElement)clientElement,(NamedElement)supplierElement)){
			setStatusText("<<References>> Client-Supplier already exists for "+((NamedElement)clientElement).getQualifiedName());
			// continue on in case this was just a renderining integrity check
			//return false;
		}
		if(supplierElement.equals(clientElement)){
			setStatusText("<<References>> Supplier and Client must not be same Element ");
			return false;
		}

		//
		// check for drop on appropriate container
			// targetPackage is an information model: check for same metaclass level or an allowable target container

		// TODO: fixup handling of Class then property for client property?
//			if(!supplierElement.getClass().equals(clientElement.getClass())){
/* need to allow class selection for client property so that navigation to property possible	*/
//		if(!("Class".equals(supplierElement.eClass().getName())&&"Property".equals(clientElement.eClass().getName())))
			if(!(Classifier.class.isInstance(supplierElement)&&"Property".equals(clientElement.eClass().getName()))){
				// allow connection from classifier to property: allow creation of property at client end;
				// double check that property does not already exist at client end
				boolean isMetaClassChecked=true;
				if(Classifier.class.isInstance(clientElement)&&Property.class.isInstance(supplierElement)){
					isMetaClassChecked=false;
					Property supplierProperty=((Property)supplierElement);
					String supplierName=(supplierProperty.getName()==null)?"":supplierProperty.getName();
					boolean isExistingProperty=false;
					Classifier clientClassifier=(Classifier)clientElement;
					Classifier supplierClassifier=NameHelper.getOwningClassifier(supplierProperty);
					if(clientClassifier.equals(supplierClassifier)){
						setStatusText("<<References>> Client Classifier and Supplier Property owner must not be same Classifier ");
						return false;
					}
					for(Property clientProperty:clientClassifier.getAttribute()){
						if(supplierName.equals(clientProperty.getName())){
							if(hasExistingReferences(clientProperty,supplierProperty)){
								setStatusText("<<References>> Client-Supplier already exists for Property named "+supplierName);
								// continue on
								//return false;
							}else{
							setStatusText("<<References>> Client will become existing Property named "+supplierName);
							}
							isExistingProperty=true;
							break;
						}
					}
					if(!isExistingProperty){
					setStatusText("<<References>> Client will become added Property named "+supplierName);
					}
				}
				if(isMetaClassChecked&&!supplierElement.eClass().getName().equals(clientElement.eClass().getName())
						){
				setStatusText("<<References>> Supplier and Client must be same meta-class ("
						+supplierElement.eClass().getName()
						+" vs "+clientElement.eClass().getName()
						+")");
				/*
				QvtCommonAction.log("ERROR: <<References>> Supplier and Client must be same meta-class ("
					+supplierElement.eClass().getName()
						+" vs "+clientElement.eClass().getName()
						+")");
						*/
				return false;
				}
			}
			// allow connection from Property to a Classifier (e.g., <<PropertyHolder>> or other)
			if(Classifier.class.isInstance(supplierElement)&&Property.class.isInstance(clientElement)
//					&&NIEMHelper.isPropertyHolder(supplierElement)
					){
				Property clientProperty=((Property)clientElement);
				String clientName=(clientProperty.getName()==null)?"":clientProperty.getName();
				boolean isExistingProperty=false;
				Classifier supplierClassifier=(Classifier)supplierElement;
				Classifier clientClassifier=NameHelper.getOwningClassifier(clientProperty);
				if(supplierClassifier.equals(clientClassifier)){
					setStatusText("<<References>> Supplier Classifier and Client Property owner must not be same Classifier ");
					return false;
				}
				for(Property supplierProperty:supplierClassifier.getAttribute()){
					if(clientName.equals(supplierProperty.getName())){
						if(hasExistingReferences(clientProperty,supplierProperty)){
							setStatusText("<<References>> Client-Supplier already exists for Property named "+clientName);
							// continue on
							//return false;
							break;
						}
						setStatusText("<<References>> Supplier will become existing Property named "+clientName);
						isExistingProperty=true;
						break;
					}
				}
				if(!isExistingProperty){
				setStatusText("<<References>> Supplier will be added Property named "+clientName);
				}
			}
			
			// Packages must have same namespace
			String clientNamespace=NIEMHelper.getNamespaceTargetNamespace(clientPackage);
			String supplierNamespace=NIEMHelper.getNamespaceTargetNamespace(supplierPackage);
			if(Package.class.isInstance(supplierElement)&&Package.class.isInstance(clientElement)){
				if(!clientNamespace.equals(supplierNamespace)){
					setStatusText("<<References>> Supplier Namespace and Client Namespace must have same targetNamespace");
					//QvtCommonAction.log("<<References>> Supplier Namespace and Client Namespace must have same targetNamespace");
					return false;
				}
			}
			boolean isSubset=NIEMHelper.isInformationModelDefaultPurposeReference(supplierPackage)
				&& (
						NIEMHelper.isInformationModelDefaultPurposeSubset(clientPackage)
						||NIEMHelper.isInformationModelDefaultPurposeSubsetting(clientPackage)				
						);
			// Classes must either reference a propertyHolder or match name and namespace
			if(Class.class.isInstance(supplierElement)&&Class.class.isInstance(clientElement)){
				if(isSubset)
				if(!NIEMHelper.hasStereotype(supplierElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
//					String supplierName=((Class)supplierElement).getName();
					String supplierName=NameHelper.getNIEMName((Class)supplierElement);
					String clientName=NameHelper.getNIEMName((Class)clientElement);
					if(!supplierName.equals(clientName)){
						setStatusText("Subset <<References>> Non-<<PropertyHolder>> Supplier must match NIEM name of Client "+clientName);
            //QvtCommonAction.log("Subset <<References>> Non-<<PropertyHolder>> Supplier "+supplierName+" must match NIEM name of Client "+clientName);
						return false;
					}
					if(!clientNamespace.equals(supplierNamespace)){
						setStatusText("Subset <<References>> Non-<<PropertyHolder>> Supplier and Client must have same targetNamespace");
						//QvtCommonAction.log("Subset <<References>> Non-<<PropertyHolder>> Supplier and Client must have same targetNamespace");
						return false;
					}
				}
			}
			// Properties must have same name, type, kind, aggregation
			if(Property.class.isInstance(supplierElement)&&Property.class.isInstance(clientElement)){
				Property supplierProperty=(Property)supplierElement;
				Property clientProperty=(Property)clientElement;
				String supplierName=NameHelper.getNIEMName(supplierProperty);
				String clientName=NameHelper.getNIEMName(clientProperty);
				// for subset references reference property,
				if(!clientName.equals(supplierName)){
					if(isSubset){
						// in this case, allow substitutionGroup replacement
						boolean foundMatch=false;
						boolean foundReferences=false;
						for(Dependency supplierReferences:supplierProperty.getClientDependency()){
							if(NIEMHelper.isReferences(supplierReferences)){
								foundReferences=true;
								for(NamedElement topLevelSupplierProperty:supplierReferences.getSupplier()){
									if(Property.class.isInstance(topLevelSupplierProperty)){
										if(isSubsettedPropertyMatch((Property)topLevelSupplierProperty,clientName)){
												foundMatch=true;
												break;
											}
									}
								}
							}
						}
						if(!foundReferences){
							// get all supplier PropertyHolders, look for match with supplier Property, then do same test on it
							for(Class propertyHolder:NIEMHelper.getAllPropertyHolders(supplierPackage)){
								for(Property topLevelSupplierProperty:propertyHolder.getAttribute()){
									String topLevelName=NameHelper.getNIEMName((Property)topLevelSupplierProperty);
									if(supplierName.equals(topLevelName)){
										if(isSubsettedPropertyMatch((Property)topLevelSupplierProperty,clientName)){
											foundMatch=true;
											break;
										}

									}
								}
							}
						}
						if(!foundMatch){
							setStatusText("Subsetting <<References>> Property Supplier or one of its subseting Properties must match NIEM name of Client "+clientName);
							return false;

						}
					}else{
					setStatusText("<<References>> Property Supplier must match NIEM name of Client "+clientName);
					// add validation check instead
					//return false;
					}
				}
				Type supplierType=supplierProperty.getType();
				Type clientType=supplierProperty.getType();
				if(supplierType==null){
					if(clientType!=null){
						setStatusText("<<References>> Property Supplier type must match type of Client");
						// add validation check instead
						//return false;
					}
				}else if (!supplierType.equals(clientType)){
					setStatusText("<<References>> Property Supplier type must match type of Client");
					// add validation check instead
					//return false;
				}
				boolean isSupplierAggregate=!NIEMHelper.isReferenceProperty(supplierProperty);
				boolean isClientAggregate=!NIEMHelper.isReferenceProperty(clientProperty);
//				if(!supplierProperty.getAggregation().equals(clientProperty.getAggregation())){
				if(isSupplierAggregate!=isClientAggregate){
					setStatusText("<<References>> Property Supplier Aggregation must match Aggregation of Client");
					// add validation check instead
					//return false;
				}
				if(NIEMHelper.isXSDElement(supplierProperty)!=NIEMHelper.isXSDElement(clientProperty)){
					setStatusText("<<References>> Property Supplier Kind must match Kind of Client");
					// add validation check instead
					//return false;
				}
			}
			return true;
	}
	protected boolean isSubsettedPropertyMatch(Property topLevelSupplierProperty,String clientName){
		for(Property subsettedProperty:topLevelSupplierProperty.get_propertyOfSubsettedProperty()){
			String subsettedName=NameHelper.getNIEMName(subsettedProperty);
			if(subsettedName.equals(clientName)){
				return true;
			}
			if(isSubsettedPropertyMatch(subsettedProperty,clientName))return true;
		}
		return false;
	}
	protected boolean hasExistingReferences(NamedElement clientProperty,NamedElement supplierProperty){
		for(Dependency test:clientProperty.getClientDependency()){
			if(NIEMHelper.isReferences(test)){
				for(NamedElement supplier:test.getSupplier()){
					if(supplier.equals(supplierProperty))return true;
				}
			}
		}
		return false;
	}

}
