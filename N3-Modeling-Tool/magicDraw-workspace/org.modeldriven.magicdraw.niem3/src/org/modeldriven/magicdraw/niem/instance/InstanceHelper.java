/**
 * 
 */
package org.modeldriven.magicdraw.niem.instance;

import java.awt.Frame;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.symbol.SubsetDialogHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.expression.NiemBaseClassifierUsageExpression;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.CancelError;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.actions.ActionsCategory;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.properties.NumberProperty;
import com.nomagic.magicdraw.ui.actions.DefaultDiagramAction;
import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.ui.dialogs.SelectElementInfo;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlgFactory;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.ui.dialogs.specifications.SpecificationDialogManager;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ProgressStatusRunner;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.LiteralSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PackageableElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.VisibilityKindEnum;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class InstanceHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	public static void addXmlInstanceDocumentAction(ActionsCategory manager,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("addXmlInstanceDocumentAction","Add XML Instance Document",null,niemGroupName){
			@Override
			public void updateState() {
				// model needs <<ModelPackageDescription>>, exchange schema...
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				Object test=getSelectedObject();
				if(test instanceof BaseElement){
					xmlInstanceDocumentActionPerformed((BaseElement)test,null);
				}
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("instance"));
		testAction.setDescription(ADD_XML_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		manager.addAction(testAction);
	}
	public static void addXmlInstanceDocumentDiagramAction(ActionsCategory manager,final PresentationElement pe,String niemGroupName){
		MDAction testAction=new DefaultDiagramAction("addXmlInstanceDocumentAction","Add XML Instance Document",null,niemGroupName){
			@Override
			public void updateState() {
				// model needs <<ModelPackageDescription>>, exchange schema...
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				if(getSelected().isEmpty()){
					xmlInstanceDocumentActionPerformed(null,pe);
				}else{
				for(BaseElement selected:getSelected()){
					xmlInstanceDocumentActionPerformed(selected,pe);
				}
				}
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("instance"));
		testAction.setDescription(ADD_XML_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		manager.addAction(testAction);
	}
	static protected void xmlInstanceDocumentActionPerformed(BaseElement test,PresentationElement pe){
		// specification dialog for an InstanceSpecification
		// if selection is an exchange property, do it
		// if selection is exchange <<PropertyHolder>>, do it for all properties
		// if selection is exchange <<InformationModel>>, do it for all properties
		// if no selection, bring up selection dialog for exchange properties
		if(test==null){
			// do after selection dialog
			ExchangeElementDialog();
		}else if((test instanceof BaseElement)||(pe!=null)){
			List<BaseElement> elements=new Vector<BaseElement>();
			elements.add((BaseElement)test);
			xmlInstanceDocumentActionProgress(elements,pe,null,null);
		}
	}
	static protected void xmlInstanceDocumentActionProgress(List<BaseElement> elements,PresentationElement pe,
			InstanceSpecification instanceSpecificationIn,Slot slot){
		// run with progress, wrap in a single transaction
	    // create runnable
	    RunnableWithProgress runnable = new InstanceDocumentRunnable(elements,pe,instanceSpecificationIn,slot);
	    // run with progress
	    ProgressStatusRunner.runWithProgressStatus(runnable,"Instance Document progress", true, 0);
	}
	/////////////////////////////////////////////////////////////////////////////////
	static public class InstanceDocumentRunnable implements RunnableWithProgress{
		protected List<BaseElement> elements=null;
		protected PresentationElement pe=null;
		protected InstanceSpecification instanceSpecification=null;
		protected Slot slot=null;
		public InstanceDocumentRunnable(List<BaseElement> elementsIn,PresentationElement peIn,
				InstanceSpecification instanceSpecificationIn,Slot slotIn){
			elements=elementsIn;
			pe=peIn;
			instanceSpecification=instanceSpecificationIn;
			slot=slotIn;
		}
        public void run(ProgressStatus progressStatus)
        {
                int max = Integer.MAX_VALUE;
                progressStatus.init("Start...", 0, max);
	   			 boolean isSessionCreated=NIEMHelper.createSession("instance");
	   			 try{
	   		  // apply changes and add command into command history.
	   				 if((instanceSpecification==null)&&(slot!=null)){
					     for(BaseElement baseElement:elements){
					    	 if(!(baseElement instanceof InstanceSpecification))continue;
					    	 addReferenceInstanceValue((InstanceSpecification)baseElement,slot,getInstanceSpecificationClassifier((InstanceSpecification)baseElement),progressStatus);
					     }
	   				 }else{
	   				 
	   				 
	    				for(BaseElement selected:elements){
	                    	performXmlInstanceDocumentAction(selected,pe,progressStatus,instanceSpecification,slot);
	    				}
	    				if(instanceSpecification!=null){
	    				     resolveReferences(instanceSpecification,progressStatus);
	    					
	    				}
	   				 }
					}catch(CancelError e){
					} catch (Throwable e) {
						e.printStackTrace();
	   			 }finally{
	   				 if(progressStatus.isCancel()){
	   					 NIEMHelper.cancelSession(isSessionCreated);
	   				 }else{
	   					 progressStatus.setDescription("closing session");
	   					 NIEMHelper.closeSession(isSessionCreated);
	   					 progressStatus.setDescription("Instance Document action complete");
	   					
	   				 }
	   			 }
        }
	}
	/////////////////////////////////////////////////////////////////////////////////
	static protected void performXmlInstanceDocumentAction(BaseElement test,PresentationElement pe,
			ProgressStatus progressStatus,InstanceSpecification instanceSpecification,Slot slot) throws ReadOnlyElementException{
		// specification dialog for an InstanceSpecification
		// if selection is an exchange property, do it
		// if selection is exchange <<PropertyHolder>>, do it for all properties
		// if selection is exchange <<InformationModel>>, do it for all properties
		// if no selection, bring up selection dialog for exchange properties
		//QvtCommonAction.log("XML Instance Document "+test);
//		if(test==null){
			// do after selection dialog
//			ExchangeElementDialog();
//		}else if(Diagram.class.isInstance(test)){
//		}else
		if(slot!=null){
		    	 Set<Classifier> didThat=new HashSet<Classifier>();
		    	 addInstanceValue((Classifier)test,slot,didThat,progressStatus,0);
	    	 return;
			}
		if(instanceSpecification!=null){
			Set<Classifier> didThat=new HashSet<Classifier>();
	    	 addSlot((Property)test,instanceSpecification,didThat,progressStatus);
	    	 return;
		}
			if(Diagram.class.isInstance(test)||(pe!=null)){
				Element clientElement=null;
				DiagramPresentationElement diagram=null;
				if(DiagramPresentationElement.class.isInstance(pe)){
					diagram=(DiagramPresentationElement)pe;
					Element diagramOwner=diagram.getElement().getOwner();
					clientElement=diagramOwner;
				}
				else if (pe!=null) {
					diagram=pe.getDiagramPresentationElement();
					Element diagramPackage=pe.getElement();
					//if(!Package.class.isInstance(diagramPackage))return;
					clientElement=diagramPackage;
				}
				if(!(Package.class.isInstance(clientElement)||Classifier.class.isInstance(clientElement)||Property.class.isInstance(clientElement)))return;
				if(diagram==null)return;
				if(pe==null)return;
				Set<PresentationElement> newElements=new HashSet<PresentationElement>();
	//			 boolean isSessionCreated=NIEMHelper.createSession("instance");
	//			 try{
			  // apply changes and add command into command history.
				Set<Package> xmlDocuments=buildXmlDocuments((NamedElement)clientElement,progressStatus);
				Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
				for(Package xmlDocument:xmlDocuments){
					// add the package, component, and mpdFile relation to diagram
					Dependency mpdFile=null;
					for(Dependency testMpdFile:xmlDocument.getSupplierDependency()){
						if(NIEMHelper.isModelPackageDescriptionFile(testMpdFile)){
							mpdFile=testMpdFile;
							break;
						}
					}
					if(mpdFile==null)continue;
					Component mpd=null;
					for(Element mpdTest:mpdFile.getClient()){
						if(NIEMHelper.isModelPackageDescription(mpdTest)){
							mpd=(Component)mpdTest;
							break;
						}
					}
					if(mpd==null)continue;
					// we have the elements, now draw them
					PresentationElement supplierPE=SubsetDialogHelper.getOrCreateShape(xmlDocument,diagram,pe,element2presentation,newElements);
					PresentationElement clientPE=SubsetDialogHelper.getOrCreateShape(mpd,diagram,pe,element2presentation,newElements);
						if((supplierPE==null)||(clientPE==null)){
							QvtCommonAction.log("ERROR:Failed to draw <<ModelPackageDescriptionFile>> for "+mpd.getQualifiedName()+" to "+xmlDocument.getQualifiedName());
						}else{	
							PresentationElement pathElement=SubsetDialogHelper.getOrCreatePath(mpdFile,clientPE,supplierPE, diagram,pe,element2presentation,newElements);
							if(pathElement==null){
								QvtCommonAction.log("ERROR drawing <<ModelPackageDescriptionFile>>, failed to create PathElement "+mpd.getQualifiedName()+", "+xmlDocument.getQualifiedName()+", "+clientPE+", "+supplierPE);
								
							}else{
								pathElement.setSelected(false);
							}
						}
					
				}
	//			 } catch (ReadOnlyElementException e1) {
	//				e1.printStackTrace();
	//			}finally{
	//			     NIEMHelper.closeSession(isSessionCreated);
	//				 }
					
		}else if(NamedElement.class.isInstance(test)){
			NamedElement namedElement=(NamedElement)test;
//			 boolean isSessionCreated=NIEMHelper.createSession("instance");
//			 try{
		  // apply changes and add command into command history.
				buildXmlDocuments(namedElement,progressStatus);
//			 }finally{
//		     NIEMHelper.closeSession(isSessionCreated);
//			 }
		}
		
	}

	static protected Set<Package> buildXmlDocuments(NamedElement namedElement,ProgressStatus progressStatus){
		Set<Package> result=new HashSet<Package>();
		if (NIEMHelper.isInInformationModel(namedElement)) {
			Package informationModel=(Package)NIEMHelper.getNearestInformationModel(namedElement);
			if (NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)) {
				if(Property.class.isInstance(namedElement)){
					// basic unit of work for xml instance document:
					// create a package; 
					// hook to mpd
					// create the root node for document and build from there
					Package xmlDocument=buildXmlDocumentInstance((Property)namedElement,informationModel,progressStatus);
					if(xmlDocument!=null)result.add(xmlDocument);
				}
				else if(Classifier.class.isInstance(namedElement)){
					Set<Property> exchangeProperties=new HashSet<Property>(getOrderedProperties((Classifier)namedElement));
					for(Property property:exchangeProperties){
						Package xmlDocument=buildXmlDocumentInstance(property,informationModel,progressStatus);
						if(xmlDocument!=null)result.add(xmlDocument);
					}
				}
				else if(Package.class.isInstance(namedElement)){
					Set<Property> exchangeProperties=new HashSet<Property>();
					for(Type type:((Package)namedElement).getOwnedType()){
						if(Classifier.class.isInstance(type)){
							exchangeProperties.addAll(getOrderedProperties((Classifier)type));
						}
					}
					for(Property property:exchangeProperties){
						Package xmlDocument=buildXmlDocumentInstance(property,informationModel,progressStatus);
						if(xmlDocument!=null)result.add(xmlDocument);
					}
				}
			}
		}
		return result;
	}
	static public void ExchangeElementDialog(){
		try{
			// selection dialog consisting of
			//    all exchange properties
			Set<Property> exchangeProperties=new HashSet<Property>();
			
   		 for(Package nestedPackage:NIEMHelper.getAllNesedPackages(NIEMHelper.getModelRoot(), new Vector<Package>())){
			 if(NIEMHelper.isInformationModel(nestedPackage)
					 &&NIEMHelper.isInformationModelDefaultPurposeExchange(nestedPackage)
					&&nestedPackage.isEditable()
					 ){
				 Package informationModel=nestedPackage;
					for(Type type:nestedPackage.getOwnedType()){
						if(Classifier.class.isInstance(type)){
							for(Property property:getOrderedProperties((Classifier)type)){
								if(isExchangeProperty(property,informationModel)){
									exchangeProperties.add(property);
								}
							}
						}
					}
			 }
		 }

			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Exchange Element Properties  ","niem_uml_modeling_workingwithmodelelements_selectinganelement_exchangeelement");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 final Set<Property> niemSubtypes=new HashSet<Property>(exchangeProperties);
			 // 
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement referenceElement) {
					if( niemSubtypes.contains(referenceElement)){
						return true;
					}
					return false;
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

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,EXCHANGE_ELEMENT_DIALOG_DESCRIPTION_TITLE,EXCHANGE_ELEMENT_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 /*
				 boolean isSessionCreated=NIEMHelper.createSession("instance");		
				 try{
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
						Package informationModel=NIEMHelper.getNearestInformationModel((Property)baseElement);
						if (NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)) {
							buildXmlDocumentInstance((Property)baseElement,informationModel);
						}
			     }
				 }finally{
			  // apply changes and add command into command history.
			     NIEMHelper.closeSession(isSessionCreated);
				 }
				 */
				 List<BaseElement> elements=new Vector<BaseElement>();
			     for(BaseElement baseElement:dlg.getSelectedElements()){
						Package informationModel=NIEMHelper.getNearestInformationModel((Property)baseElement);
						if (NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)) {
							elements.add(baseElement);// Property
						}
			     }
				xmlInstanceDocumentActionProgress(elements,null,null,null);
				 
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}

	protected static Usage createModelPackageDescriptionFile(Component source, Package target){
		return NIEMHelper.createModelPackageDescriptionFile(source, target, xmlLiteralName, sample_instanceLiteralName, "Serves the purpose of an XML Document Instance use for Exchange.");
		/*
			Usage niemType = Application.getInstance().getProject().getElementsFactory().createUsageInstance();
			niemType.getClient().add(source);
			niemType.getSupplier().add(target);
			source.getPackagedElement().add(niemType);
			// apply stereotype, set tags, set default name, etc.
			Stereotype stereotype=NIEMHelper.getModelPackageDescriptionFileStereotype();
			NIEMHelper.addStereotype(niemType,stereotype);
			Profile mpdProfile=NIEMHelper.getMpdProfile();
			Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,sample_instanceLiteralName);
			EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xmlLiteralName);
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,natureCodeTagName,defaultNature);
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,purposeCodeTagName,defaultPurpose);
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,relativePathNameTagName,"");
			NIEMHelper.setStereotypePropertyValue(niemType,stereotype,descriptionTextTagName,"Serves the purpose of an XML Document Instance use for Exchange.");
			//QvtCommonAction.log("createModelPackageDescriptionFile "+defaultPurpose+", "+defaultNature+", "+purposeCode+", "+natureCode);
			return niemType;
			*/
		
	}
	protected static boolean isExchangeProperty(Property property,Package informationModel){
		Property topElement=NameHelper.getSubsetPropertyHolderProperty(property);
		if(topElement==null)topElement=property;
		if(!NIEMHelper.isXSDElement(topElement))return false;

		Package elementInformationModel=NIEMHelper.getNearestInformationModel(topElement);
		return informationModel.equals(elementInformationModel);
		
	}
	protected static Package buildXmlDocumentInstance(Property property,Package informationModel,ProgressStatus progressStatus){
		if(!isExchangeProperty(property,informationModel))return null;
//		Type type=property.getType();
//		if(!Classifier.class.isInstance(type))return null;
//		Classifier referenceClassifier=(Classifier)type;
		Classifier referenceClassifier=NameHelper.getOwningClassifier(property);
		if(referenceClassifier==null)return null;
		// basic unit of work for xml instance document:
		// create a package; 
		// hook to mpd
		// create the root node for document and build from there

		Component mpdComponent=QvtCommonAction.getMpdComponent();
		if(mpdComponent==null)return null;
		Package xmlPackage=NameHelper.createXmlSamplePackage(property);
		if(xmlPackage==null)return null;
		// an MPDFile to the package
		createModelPackageDescriptionFile(mpdComponent,xmlPackage);
		
		InstanceSpecification instanceSpecification=NIEMFactory.instance.createInstanceSpecification(referenceClassifier,xmlPackage,property.getName());
		// we could populate with slots at this time - prevent recursion
		Set<Classifier> didThatToo=new HashSet<Classifier>();
		addSlot(property, instanceSpecification,didThatToo,progressStatus);
		/*
		List<Property> orderedProperties=getOrderedProperties(referenceClassifier);
		for(Property typeProperty:orderedProperties){
			Set<Classifier> didThatToo=new HashSet<Classifier>();
			addSlot(typeProperty, instanceSpecification,didThatToo);
		}
		*/
	     resolveReferences(instanceSpecification,progressStatus);
	     return xmlPackage;
	}
	public static void instanceSpecificationAction(MDMenuAction category,final PresentationElement requestor,final Element instanceSpecification,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("instanceSpecificationAction","Open InstanceSpecification",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// specification dialog for an InstanceSpecification
				Object test=getSelectedObject();
				if(test==null)return;
				InstanceSpecification instanceSpecification=null;
				if(InstanceSpecification.class.isInstance(test)){
					instanceSpecification=(InstanceSpecification)test;
				}
				else if(Slot.class.isInstance(test)){
					instanceSpecification=((Slot)test).getOwningInstance();
				}
				else if(InstanceValue.class.isInstance(test)&&(((InstanceValue)test).getInstance()!=null)){
					instanceSpecification=((InstanceValue)test).getInstance();
				}
				else if(ValueSpecification.class.isInstance(test)){
					Slot slot=((ValueSpecification)test).getOwningSlot();
					if(slot!=null){
						instanceSpecification=slot.getOwningInstance();
					}
				}
				if(instanceSpecification==null)return;
				SpecificationDialogManager.getManager().editSpecification(instanceSpecification) ;
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(OPEN_INSTANCE_SPECIFICATION_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}
	
	public static void instanceTypeAction(MDMenuAction category,final PresentationElement requestor,final Element instanceSpecification,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("setInstanceTypeAction","set Instance Type",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				Object test=getSelectedObject();
				if(test==null)return;
				if(!(test instanceof InstanceValue))return;
				InstanceTypeDialog( (InstanceValue)test);
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(SET_INSTANCE_TYPE_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}	
	public static void addValueSpecificationAction(MDMenuAction category,final PresentationElement requestor,final Element instanceSpecification,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("addValueSpecificationAction","add Value",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// specification dialog for an InstanceSpecification
				Object test=getSelectedObject();
				//System.out.println("addValueSpecificationAction "+test);
				if(test==null)return;
				Slot slot=null;
				if(Slot.class.isInstance(test)){
					slot=((Slot)test);
				}
				else if(ValueSpecification.class.isInstance(test)){
					slot=((ValueSpecification)test).getOwningSlot();
				}
				if(slot==null)return;
				// selection dialog which includes restrictions
				// first we need to be able to add Property/Slot for NIEM typed Properties
				StructuralFeature structuralFeature=slot.getDefiningFeature();
				if(Property.class.isInstance(structuralFeature)){
					Property property=(Property)structuralFeature;
					if(NIEMHelper.isReferenceProperty(property)){
						ReferenceValueDialog( slot);
						
					}else{
						ValueDialog( slot);
					}
				}
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(ADD_VALUE_SPECIFICATION_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}	
	public static void addSlotSpecificationAction(MDMenuAction category,final PresentationElement requestor,final Element instanceSpecification,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("addSlotSpecificationAction","add Instance Property",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// specification dialog for an InstanceSpecification
				Object test=getSelectedObject();
				if(test==null)return;
				InstanceSpecification instanceSpecification=null;
				if(InstanceSpecification.class.isInstance(test)){
					instanceSpecification=((InstanceSpecification)test);
				}
				else if(InstanceValue.class.isInstance(test)){
					instanceSpecification=((InstanceValue)test).getInstance();
				}
				if(instanceSpecification==null)return;
				// selection dialog which includes Properties which are subsetted
				
				SlotDialog( instanceSpecification);
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(ADD_INSTANCE_PROPERTY_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}	
	static public Classifier getRootClassifier(InstanceSpecification instanceSpecification){
		Classifier referenceClassifier=null;
		boolean isExchange=false;
		for(Classifier classifier:instanceSpecification.getClassifier()){
			if(!NIEMHelper.isPropertyHolder(classifier)){
				referenceClassifier=classifier;
				break;
			}else{
				Package informationModel=NIEMHelper.getNearestInformationModel(classifier);
				if(informationModel!=null){
					if(NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel)){
						isExchange=true;
					}
				}
			}
		}
		if((referenceClassifier==null)&&!isExchange){
			//QvtCommonAction.log("ERROR: Did not locate type for instanceSpecification "+instanceSpecification.getQualifiedName());
		}
		return referenceClassifier;
	}
	static public Set<Property> getConcreteProperties(Classifier referenceClassifier){
		 Set<Property> preselectedProperties=new HashSet<Property>(InstanceHelper.getOrderedProperties(referenceClassifier));
		 // expand preselectedOptions to include derived
		 for(Property preselectedProperty:new Vector<Property>(preselectedProperties)){
			 preselectedProperties.addAll(getSubstitutableProperties(preselectedProperty));
			 if(preselectedProperty.isDerivedUnion()){
				 preselectedProperties.remove(preselectedProperty);
			 }
		 }
		return preselectedProperties;
	}
	static public void SlotDialog(final InstanceSpecification instanceSpecification){
		try{
			// selection dialog consisting of primary classifier properties plus subsetted properties;
			//  after selection, create slots, perhaps some with initialed results
			// primary classifier is not a property holder
			Classifier referenceClassifier=getRootClassifier(instanceSpecification);
			if(referenceClassifier==null)return;
			if(NIEMHelper.isPropertyHolder(referenceClassifier))return;
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Properties to be included in "+instanceSpecification.getName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_slotproperty");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Element root=NIEMHelper.getModelRoot();
			 
			 // changes:  show current selection; pre-selected options including implicit and derived; resequence at end
			 final Set<Property> preselectedProperties=getConcreteProperties(referenceClassifier);//new HashSet<Property>(InstanceHelper.getOrderedProperties(referenceClassifier));
			 /*
			 // expand preselectedOptions to include derived
			 for(Property preselectedProperty:new Vector<Property>(preselectedProperties)){
				 preselectedProperties.addAll(getSubstitutableProperties(preselectedProperty));
				 if(preselectedProperty.isDerivedUnion()){
					 preselectedProperties.remove(preselectedProperty);
				 }
			 }
			 */
			 
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 final Classifier referenceModelTest=referenceClassifier;
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement referenceElement) {
					return preselectedProperties.contains(referenceElement);
					/*
					if(!Property.class.isInstance(referenceElement))return false;
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
					if(NIEMHelper.isPropertyHolder(referenceModelClassifier)){
						//	  in cases where the property subsetsProperty which is in referenceModelTest
						if(NameHelper.isPropertyHolderPropertySubsettingTypeProperty(referenceProperty,referenceModelTest,true)){
							return !doesSlotExist(referenceProperty,instanceSpecification);
						}
					}
					
					if(!referenceModelTest.equals(referenceModelClassifier))return false;
					return !doesSlotExist(referenceProperty,instanceSpecification);
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
			 java.util.List<Property> selection=new Vector<Property>();
			 for(Slot slot:instanceSpecification.getSlot()){
				 StructuralFeature feature=slot.getDefiningFeature();
				 if(feature instanceof Property)selection.add((Property)feature);
			 }
			 // do we need to sort slots?
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,SLOT_DIALOG_DESCRIPTION_TITLE,SLOT_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				 xmlInstanceDocumentActionProgress(dlg.getSelectedElements(),null,instanceSpecification,null);
				 
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("instance");
				 try{
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:dlg.getSelectedElements()){
//			    	 Property addedProperty=NameHelper.addProperty((Property)baseElement,clientClassifier);
						Set<Classifier> didThat=new HashSet<Classifier>();
			    	 addSlot((Property)baseElement,instanceSpecification,didThat,null);
			     }
			     //resequenceSlots(instanceSpecification,referenceClassifier);
			     resolveReferences(instanceSpecification,null);
				 }finally{
			  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
				 
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}
	/*
	 // NOTE: we can not sequence slots, they are a collection; must be done dynamically for presentation of nodes in tree
	 
	static protected void resequenceSlots(InstanceSpecification parent,Classifier classifier){
		// sequence should match the sequence of properties in inheritance chain;
		//List<Slot> savedChildNodes=new Vector<Slot>(parent.getSlot());
		List<Slot> orderedChildNodes=getOrderedSlots(parent,classifier);
		List<Property> orderedProperties=getOrderedProperties(classifier);
		// for each orderedProperty, find saved child and add to result
		for(Property childProperty:orderedProperties){
//			List<Slot> matchingChildNode=findMatchingSlot(childProperty,savedChildNodes);
//			orderedChildNodes.addAll(matchingChildNode);
				orderedChildNodes.addAll(getExistingSlots(childProperty,parent));
			/ *
			Slot matchingChildNode=getExistingSlots(childProperty,parent);
			if(matchingChildNode!=null){
				orderedChildNodes.add(matchingChildNode);
			}
			* /
		}
		
		parent.getSlot().clear();
		parent.getSlot().addAll(orderedChildNodes);
	}
	static public List<Slot> getOrderedSlots(InstanceSpecification parent,Classifier classifier){
		// sequence should match the sequence of properties in inheritance chain;
		List<Slot> orderedChildNodes=new Vector<Slot>();
		if(classifier!=null){
		List<Property> orderedProperties=getOrderedProperties(classifier);
		// for each orderedProperty, find saved child and add to result
		for(Property childProperty:orderedProperties){
				orderedChildNodes.addAll(getExistingSlots(childProperty,parent));
			/ *
			Slot matchingChildNode=getExistingSlots(childProperty,parent);
			if(matchingChildNode!=null){
				orderedChildNodes.add(matchingChildNode);
			}
			* /
		}
		}
		return orderedChildNodes;
	}
	*/
	static public List<Slot> getBestOrderedSlots(InstanceSpecification parent,Classifier classifier){
				// sequence should match the sequence of properties in inheritance chain;
		// is this failing????????????????????????????????????????????????????????
		
				List<Slot> savedChildNodes=new Vector<Slot>(parent.getSlot());
//if(true)return savedChildNodes;				
				List<Slot> orderedChildNodes=new Vector<Slot>();
				List<Property> orderedProperties=getOrderedProperties(classifier);
				Set<Slot> didThat=new HashSet<Slot>();
				// for each orderedProperty, find saved child and add to result
				for(Property childProperty:orderedProperties){
					Set<Slot> matchingChildNode=getExistingSlots(childProperty,parent,didThat);
						orderedChildNodes.addAll(matchingChildNode);
						savedChildNodes.removeAll(matchingChildNode);
					/*
					Slot matchingChildNode=getExistingSlots(childProperty,parent);
					if(matchingChildNode!=null){
						orderedChildNodes.add(matchingChildNode);
						savedChildNodes.remove(matchingChildNode);
					}
					*/
				}
				
				if(!savedChildNodes.isEmpty()){
					QvtCommonAction.log("InstanceBrowser: Warning, failed to sequence instance document slots "+savedChildNodes+" for classifier "+classifier.getQualifiedName());
					for(Slot child:savedChildNodes){
						orderedChildNodes.add(child);
					}
				}
				return orderedChildNodes;
			}

	static public List<Property> getOrderedProperties(Classifier classifier){
		List<Property> result=new Vector<Property>();
			if(Class.class.isInstance(classifier))InstanceHelper.getOrderedProperties((Class)classifier,result);
			else if(DataType.class.isInstance(classifier))InstanceHelper.getOrderedProperties((DataType)classifier,result);
		return result;
	}

	public static void getOrderedProperties(Class parent,List<Property> result){
		// this should only be used for Instance construction/validation; it collapses choice and adds pseudo-properties for augmentation, role-of
		Class baseType=getBaseType(parent);
		if(baseType!=null)getOrderedProperties(baseType,result);
		for(Property property:parent.getOwnedAttribute()){
			Type type=property.getType();
			if((type!=null)&&NIEMHelper.isChoice(type)&&Class.class.isInstance(type)){
				getOrderedProperties((Class)type,result);
			}else{
				result.add(property);
			}
		}
		addImplicitProperties(parent,result);
	}
	protected static void addImplicitProperties(Class parent,List<Property> result){
		// check if generalizations should be materialized in instance as properties
//		for(Generalization generalization:parent.getGeneralization()){
		for(Generalization generalization:getOrderedGeneralizations(parent)){
			if(NIEMHelper.isImplicitAugmentationProperty(generalization)){
				addImplicitAugmentationProperty(generalization,result);
			}else	if(NIEMHelper.isRolePlayedBy(generalization)){
					addImplicitRoleOfProperty(generalization,result);
			}
		}
	}
	protected static Collection<Generalization> getOrderedGeneralizations(Class parent){
		// order by qualifiedName of general
		TreeSet<Generalization> result=new TreeSet<Generalization>(new Comparator<Object>(){
			@Override
			public int compare(Object arg0, Object arg1) {
				if(arg0==arg1)return 0;
				if((arg0==null)||!(arg0 instanceof Generalization)||(((Generalization)arg0).getGeneral()==null)||(((Generalization)arg0).getGeneral().getQualifiedName()==null))return -1;
				if((arg1==null)||!(arg1 instanceof Generalization)||(((Generalization)arg1).getGeneral()==null)||(((Generalization)arg1).getGeneral().getQualifiedName()==null))return 1;
				 return ((Generalization)arg0).getGeneral().getQualifiedName().compareTo(((Generalization)arg1).getGeneral().getQualifiedName());
			}
		});
		result.addAll(parent.getGeneralization());
		return result;
	}
	protected static void addImplicitAugmentationProperty(Generalization generalization,List<Property> result){
		// find or create a PropertyHolder property and add to result
		// use transform naming  and PropertyHolder allocation algorithm
		/*
		aggregation:=UML::AggregationKind::shared;
	var topElement:UML::Property=self.resolveImplicitPropertyReference(result,domainContext);

		 */
		String name=getBaseNiemName(generalization,generalization.getGeneral().getName());
		name=NameHelper.toUpperFirstLetter(name);
		name=NameHelper.toNCName(name);
		Property propertyHolderProperty=findPropertyHolderProperty(generalization,name);
		if(propertyHolderProperty==null){
			propertyHolderProperty=createImplicitProperty(generalization,name);
			propertyHolderProperty.setAggregation(AggregationKindEnum.SHARED);
		}
		result.add(propertyHolderProperty);
	}
	protected static void addImplicitRoleOfProperty(Generalization generalization,List<Property> result){
		/*
		 * 		name:=self.getBaseNiemName(self.general.name).firstToUpper().toNCName().toRoleOfName().toReferenceName();

	// this property owned by a non-PropertyHolder, make sure there is a resolved reference
	self.resolveImplicitPropertyReference(result,domainContext);

		 */
		String name=getBaseNiemName(generalization,generalization.getGeneral().getName());
		name=NameHelper.toUpperFirstLetter(name);
		name=NameHelper.toNCName(name);
		name=toRoleOfName(name);
		name=toReferenceName(name);
		Property propertyHolderProperty=findPropertyHolderProperty(generalization,name);
		if(propertyHolderProperty==null){
			propertyHolderProperty=createImplicitProperty(generalization,name);
		}
		result.add(propertyHolderProperty);
	}
	protected static Property findPropertyHolderProperty(Element element,String name){
		return NIEMHelper.findPropertyHolderProperty(element, name);
	}
	protected static String toRoleOfName(String name){
		return NIEMHelper.toRoleOfName(name);
	}
	protected static String toReferenceName(String name){
		return NIEMHelper.toReferenceName(name);
	}
	protected static Class createOrFindPropertyHolder(Package informationModel){
		Class result=null;
		Class standBy=null;
		for(Type type:informationModel.getOwnedType()){
			if(NIEMHelper.isPropertyHolder(type)){
				// is this the generic one?
				standBy=(Class)type;
				if("NamespaceElementPropertyHolder".equals(type.getName())){
					result=(Class)type;
					break;
				}
			}
		}
		if(result==null){
			if(standBy==null){
				// need to create a PropertyHolder
				Class propertyHolder = Application.getInstance().getProject().getElementsFactory().createClassInstance();
				propertyHolder.setName("NamespaceElementPropertyHolder");
				propertyHolder.setVisibility(VisibilityKindEnum.PUBLIC);
				propertyHolder.setAbstract(false);
				informationModel.getPackagedElement().add(propertyHolder);
				NIEMHelper.addStereotype(propertyHolder, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName));
				result=propertyHolder;
			}else{
				result=standBy;
			}
		}
		return result;
	}
	protected static Property createImplicitProperty(Generalization generalization,String name){
		// wrap this in a transaction
		boolean isSessionCreated=NIEMHelper.createSession("createImplicitProperty");
		try{
		Package informationModel=NIEMHelper.getNearestInformationModel(generalization);
		Class propertyHolder=createOrFindPropertyHolder(informationModel);
		Property result=Application.getInstance().getProject().getElementsFactory().createPropertyInstance();
		result.setName(name);
		result.setVisibility(VisibilityKindEnum.PUBLIC);
		ModelHelper.setMultiplicity(1,1, result);

		result.setDerived(false);
		result.setDerivedUnion(false);
		result.setReadOnly(false);
		result.setOrdered(true);
		result.setUnique(true);
		result.setAggregation(AggregationKindEnum.NONE);
		result.setType(generalization.getGeneral());
		for(Comment generalizationComment:generalization.getOwnedComment()){
			Comment propertyComment=NIEMHelper.addComment(result);
			propertyComment.setBody(generalizationComment.getBody());
		}
		propertyHolder.getOwnedAttribute().add(result);
		updatePropertyHolderPropertyMap(informationModel,result);
		return result;
		}finally{
			NIEMHelper.closeSession(isSessionCreated);
		}
	}
	static protected void updatePropertyHolderPropertyMap(Package referencePackage,Property referencePropertyHolderProperty){
		// only called after map has been established, so projectCache is always there as well as package map
 		ProjectCache projectCache=ProjectCache.getProjectCache();
		Map<Package,Map<String,Property>> propertyToPropertyHolderPropertyMap=projectCache.getNameToPropertyHolderPropertyMap();
		Map<String,Property> referenceNameToPropertyHolderPropertyMap=propertyToPropertyHolderPropertyMap.get(referencePackage);
		referenceNameToPropertyHolderPropertyMap.put(NameHelper.getPropertyMapName(referencePropertyHolderProperty), referencePropertyHolderProperty);
	}

	protected static String getBaseNiemName(Element element,String umlName){
		return NIEMHelper.getBaseNiemName(element, umlName);
	}
	public static void getOrderedProperties(DataType parent,List<Property> result){
		DataType baseType=getBaseType(parent);
		if(baseType!=null)getOrderedProperties(baseType,result);
		result.addAll(parent.getOwnedAttribute());
	}
	static public List<Property> getRawOrderedElements(Classifier classifier){
		List<Property> result=new Vector<Property>();
		getRawOrderedElements(classifier,result);
		return result;
	}
	static public List<Property> getRawOrderedAttributes(Classifier classifier){
		List<Property> result=new Vector<Property>();
		getRawOrderedAttributes(classifier,result);
		return result;
	}
	public static void getRawOrderedAttributes(Classifier classifier,List<Property> result){
		if(Class.class.isInstance(classifier))InstanceHelper.getRawOrderedAttributes((Class)classifier,result);
		else if(DataType.class.isInstance(classifier))InstanceHelper.getRawOrderedAttributes((DataType)classifier,result);
	}
	public static void getRawOrderedAttributes(Class parent,List<Property> result){
		// do we really follow base type or extension?  is this used for selection of inaccessible stuff?
		// this function should be used for instance creation, validation and not by other services requiring property accessors
		Classifier baseType=getBaseType(parent);
		if(baseType!=null)getRawOrderedAttributes(baseType,result);
		for(Property property:parent.getOwnedAttribute()){
			if(NIEMHelper.isXSDAttribute(property)){
				result.add(property);
			}
		}
	}
	public static void getRawOrderedAttributes(DataType parent,List<Property> result){
		Classifier baseType=getBaseType(parent);
		if(baseType!=null)getRawOrderedAttributes(baseType,result);
		for(Property property:parent.getOwnedAttribute()){
			if(NIEMHelper.isXSDElement(property)||NIEMHelper.isXSDAny(property)){
				result.add(property);
			}
		}
	}
	public static void getRawOrderedElements(Classifier classifier,List<Property> result){
		if(Class.class.isInstance(classifier))InstanceHelper.getRawOrderedElements((Class)classifier,result);
		else if(DataType.class.isInstance(classifier))InstanceHelper.getRawOrderedElements((DataType)classifier,result);
	}

	public static void getRawOrderedElements(Class parent,List<Property> result){
		// do we really follow base type or extension?  is this used for selection of inaccessible stuff?
		// this function should be used for instance creation, validation and not by other services requiring property accessors
		Classifier baseType=getBaseType(parent);
		if(baseType!=null)getRawOrderedElements(baseType,result);
		for(Property property:parent.getOwnedAttribute()){
			if(NIEMHelper.isXSDElement(property)||NIEMHelper.isXSDAny(property)){
				result.add(property);
			}
		}
		// pick up the generalizations: augmentation, roleOf
		// is this the right place, or do we use getOrderedProperties?
		// can we reliably track a property in a PropertyHolder which corresponds to augmentation/roleof?
		// what is impact on existing code of either of these?
		addImplicitProperties(parent,result);
	}
	public static void getRawOrderedElements(DataType parent,List<Property> result){
		// no elements here
	}
	static protected Class getBaseType(Class parent){
//		return (Class)NIEMHelper.getBaseClassifier(parent);
		return (Class)NIEMHelper.getBaseExtensionClassifier(parent);
		/*
    	DirectedRelationship dr=NiemBaseClassifierExpression.getBaseTypeRelation(parent);
    	if(Generalization.class.isInstance(dr)){
    		return (Class)((Generalization)dr).getGeneral();
    	}
    	return null;
    	*/
	}
	static protected DataType getBaseType(DataType parent){
//		return (DataType)NIEMHelper.getBaseClassifier(parent);
		return (DataType)NIEMHelper.getBaseExtensionClassifier(parent);
		/*
    	DirectedRelationship dr=NiemBaseClassifierExpression.getBaseTypeRelation(parent);
    	if(Generalization.class.isInstance(dr)){
    		return (DataType)((Generalization)dr).getGeneral();
    	}
    	return null;
    	*/
	}

	static protected void addSlot(Property referenceProperty,InstanceSpecification instanceSpecification,Set<Classifier> didThat,ProgressStatus progressStatus){
		// create a slot for given property;
		// add to instanceSpecification
		// make sure instanceSpecification classifiers include property classifier ????
   		XSDSchema schema=null;
		Package informationModel=NIEMHelper.getNearestInformationModel(referenceProperty);
		if(informationModel==null)return;
   		schema=SimpleType.createOrFindSchema( informationModel);
   		if(schema==null)return;
		Set<Slot> existingSlots=getExistingSlots(referenceProperty,instanceSpecification,new HashSet<Slot>());
		if(!existingSlots.isEmpty())return;
		if(progressStatus!=null){
		progressStatus.setDescription("adding Slot "+referenceProperty.getName()+" to "+instanceSpecification.getName());
	    if(progressStatus.isCancel()){
	    	throw new CancelError();
	    }
		}
		if(NIEMHelper.isChoice(referenceProperty.getType())){
			// create one or more choice properties, depending on cardinality
			Class choiceClass=(Class)referenceProperty.getType();
			int lower=referenceProperty.getLower();
			int upper=referenceProperty.getUpper();
			int count=0;
			if(upper!=0){
				while(true){
					for(Property choiceProperty:getRawOrderedElements(choiceClass)){
						addSlot(choiceProperty,instanceSpecification,didThat,progressStatus);
						count++;
						if(upper<0)continue;
						if(count>=upper)break;
					}
					if(count>=lower)break;
				}
			}
			return;
		}
		Property topLevelElement= NameHelper.getSubsetPropertyHolderProperty(referenceProperty);
		
		if(!Classifier.class.isInstance(referenceProperty.getType())
				||referenceProperty.isDerivedUnion()
				||((topLevelElement!=null)&&topLevelElement.isDerivedUnion())
				){
			// could be abstract element - we could find substitution
			Property saveProperty=referenceProperty;
			Set<Property> substitutableProperties=getSubstitutableProperties(referenceProperty);
			// do as many as possible
			boolean isSlotCreated=false;
			int upper=referenceProperty.getUpper();
			for(Property substitute:substitutableProperties){
				if(Classifier.class.isInstance(substitute.getType())&&!substitute.isDerivedUnion()){
					referenceProperty=substitute;
					isSlotCreated=true;
					Slot slot=createSlot(referenceProperty,instanceSpecification,didThat,progressStatus);		
					if(upper<0)continue;
					int slotValues=slot.getValue().size();
					if(slotValues>0){
						upper=upper-slotValues;
					}else{
						upper--;
					}
					if(upper>0)continue;
					break;
				}
			}
			if(!isSlotCreated){
			//if(!Classifier.class.isInstance(referenceProperty.getType())||referenceProperty.isDerivedUnion()){
				// just bypass if not required
				if(referenceProperty.getLower()>0){
					System.out.println("Failed to find substitutable Property for abstract "+saveProperty.getQualifiedName()+" in "+instanceSpecification.getName());
				}
//				return;
			}
			return;
		}
		Slot slot=createSlot(referenceProperty,instanceSpecification,didThat,progressStatus);		
		return;// slot;
	}
	static protected int getExampleInstanceCount(){
		int result=2;
		Project project=NIEMHelper.getProject();
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					DOCUMENT_ELEMENT_INSTANCES_OPTION);
			if ((property != null)&&(property instanceof NumberProperty))
			{
				result =((NumberProperty)property).getInteger();
			}
			return result;
	}
	protected boolean isPsmProjectMerged(Project project){
		boolean result=false;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,
					MERGE_PSM_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
			
		
	}

	static protected Slot createSlot(Property referenceProperty,InstanceSpecification instanceSpecification,Set<Classifier> didThat,ProgressStatus progressStatus){
		Slot slot=NIEMFactory.instance.createSlot(referenceProperty,instanceSpecification);
		// we could populate the slot at this point, if it is containment..................
		
		StructuralFeature structuralFeature=slot.getDefiningFeature();
		if(Property.class.isInstance(structuralFeature)){
			Property property=(Property)structuralFeature;
			int lower=property.getLower();
			int upper=property.getUpper();
			int exampleInstances=getExampleInstanceCount();
			Type type=property.getType();
			while(true){
				// for containment, lets create the Value
				if(Classifier.class.isInstance(type)){
					Set<Classifier> classifiers=getConcreteClassifiers((Classifier)type);
					Classifier classifier=(Classifier)type;
					if(classifier.isAbstract())
					for(Classifier first:classifiers){
						classifier=first;
						if(!classifier.isAbstract())break;
					}
					/*
					
					if(NIEMHelper.isReferenceProperty(property)){
						// perhaps if it is reference we could find an instance?
						Set<InstanceSpecification> referenceables=getReferenceables(slot);
					     for(InstanceSpecification baseElement:referenceables){
					    	 addReferenceInstanceValue(baseElement,slot);
								lower--;
								if(lower<=0)break;
					     }
						if(lower<=0)break;
						continue;
					}
					*/
//				   		XSDSimpleTypeDefinition simpleType=SimpleType.createOrFindXSDSimpleTypeDefinition( classifier,schema);
					
					
					PrimitiveType primitiveType=NIEMHelper.getXmlSimpleType(classifier);
					if(primitiveType!=null){
						addLiteralSpecification(primitiveType,slot,classifier);
					}else if (isEnumeration(classifier)){
						EnumerationLiteral literal=getAnEnumerationLiteral(classifier,exampleInstances-1);
						if(literal!=null){
							NIEMFactory.instance.createInstanceValue(literal,slot,"",classifier);
						}else{
							QvtCommonAction.log("addSlot no literal for enumeration "+classifier.getQualifiedName());
						}
					}else if(NIEMHelper.isComplexType(classifier)){
						if(!NIEMHelper.isReferenceProperty(property)){
							for(Classifier aClassifier:classifiers){
								Set<Classifier> didThatToo=new HashSet<Classifier>(didThat);
								addInstanceValue(aClassifier, slot,didThatToo,progressStatus,exampleInstances-1);
								lower--;
								exampleInstances--;
								// for containment, lets get all the classifiers we can so that references can be resolved
								if(upper<0){
									continue;
								}
								upper--;
								if(upper>0)continue;
								if(lower<=0)break;
							}
							if(!classifiers.isEmpty()){
								lower++;
								if(upper>=0)upper++;
								exampleInstances++;
							}
						}else{
							// perhaps if it is reference we could find an instance?
							/* defer this until reference processing following instantiation
							Set<InstanceSpecification> referenceables=getReferenceables(slot);
						     for(InstanceSpecification baseElement:referenceables){
						    	 addReferenceInstanceValue(baseElement,slot,getInstanceSpecificationClassifier(baseElement),progressStatus);
									lower--;
									if(lower<=0)break;
						     }
							if(!referenceables.isEmpty())	lower++;
							*/
						}
					}
				}else{
				}
				lower--;
				exampleInstances--;
				if(upper>=0)upper--;
				if(upper==0)break;
				if(exampleInstances>0)continue;
				if(lower<=0)break;
			}
		}
		
		
		return slot;
	}
	static protected Package getConstraintModel(Package referenceModel){
		String referenceNamespace=NIEMHelper.getNamespaceTargetNamespace(referenceModel);
		if(referenceNamespace==null)return null;
		for(Dependency d:referenceModel.getSupplierDependency()){
			if(NIEMHelper.isReferences(d)){
				for(NamedElement ne:d.getClient()){
					if((ne instanceof Package)
							&&NIEMHelper.isInformationModel((Package)ne)
							&&referenceNamespace.equals(NIEMHelper.getNamespaceTargetNamespace((Package)ne))
							&&NIEMHelper.isInformationModelDefaultPurposeConstraint((Package)ne)
							){
						return (Package)ne;
					}
				}
			}
		}
		return null;
	}
	static protected Classifier getConstraintClassifier(Classifier referenceClassifier){
		// either inverse dependency from reference to constraint, or from reference <<InformationModel>> to constraint
		Package referenceModel=NIEMHelper.getNearestInformationModel(referenceClassifier);
		if(referenceModel==null)return null;
		Package constraintModel=getConstraintModel(referenceModel);
		if(constraintModel==null)return null;
		Type type=NameHelper.getSubsetClassifier(referenceClassifier, constraintModel);
		if(!(type instanceof Classifier))return null;
		return (Classifier)type;
	}
	static public Set<Property> getSubstitutableProperties(Property referenceProperty){
		Set<Property> substitutableProperties=NIEMHelper.getSubstitutableProperties(referenceProperty);
		if(!substitutableProperties.isEmpty())return substitutableProperties;
		// for an xsd:any, check if there is a constraint schema which narrows this down
		if(NIEMHelper.isXSDAny(referenceProperty)){
			// if there is a constraint classifier, then it may indicate which properties can be used
			Classifier constraintClassifier=getConstraintClassifier(referenceProperty.getClassifier());
			if(constraintClassifier!=null){
				// find properties which may correspond to the any
				List<Property> orderedProperties=getRawOrderedElements(constraintClassifier);
				for(Property constraintProperty:orderedProperties){
					if(NameHelper.isMatchingProperty(constraintProperty, referenceProperty)){
						// go back to base schema set and resolve property
						Property constraintPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(constraintProperty);
						if(constraintPropertyHolderProperty==null)constraintPropertyHolderProperty=constraintProperty;
						Property resolvedProperty=null;
						if(!NIEMHelper.isInformationModelDefaultPurposeConstraint(NIEMHelper.getNearestInformationModel(constraintPropertyHolderProperty))){
							// we have already resolved to a base schema set
							resolvedProperty=constraintPropertyHolderProperty;
						}else{
							// get corresponding from base schema set:
							// this should get a resolved reference model property via property <<References>> or from classifier <<References>> or <<InformationModel>>
							// it should always be resolvable this way (an appropriate combination of <<References>> should be in the model)
							resolvedProperty=NIEMHelper.getResolvedReferenceProperty(constraintPropertyHolderProperty);
						}
						if(resolvedProperty!=null){
							substitutableProperties.add(resolvedProperty);
						}else{
							// if that did not work, then the model is not consistent, perhaps additional validation required?
						}
					}
				}
			}
			
		}
		return substitutableProperties;
	}
	static protected Classifier getInstanceSpecificationClassifier(InstanceSpecification instanceSpecification){
		for(Classifier classifier:instanceSpecification.getClassifier()){
			if(NIEMHelper.isPropertyHolder(classifier))continue;
			return classifier;
		}
		return null;
	}
	static protected void addLiteralSpecification(PrimitiveType primitiveType,Slot slot,Type type){
		// this could also be a reference????????????
		//  if we have literals here, how would they be referenced?
		// we could have an indirection via InstanceSpecification-->ValueSpecification
		// theoretically this would be required, but does a reference actually occur for these simpleType derived types?
		
		 //LiteralBoolean, LiteralInteger, , LiteralReal, LiteralString
		//System.out.println("addLiteralSpecification "+primitiveType.getQualifiedName());
		if(NameHelper.isBoolean(primitiveType)){
			NIEMFactory.instance.createLiteralBoolean(slot,false,"",type);
			
		}else if(isInteger(primitiveType)){
			NIEMFactory.instance.createLiteralInteger(slot,0,"",type);
			
		}else if(isReal(primitiveType)){
			NIEMFactory.instance.createLiteralReal(slot,0.0,"",type);
		}else{
			String value="";
			if(isDate(primitiveType)){
				String pattern="yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
//				value=new Date(System.currentTimeMillis()).toString();
				// 2002-10-10+13:00
			}else if(isDateTime(primitiveType)){
				String pattern="yyyy-MM-dd'T'hh:mm:ss.SSS";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isTime(primitiveType)){
				String pattern="hh:mm:ss.SSS";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isGYearMonth(primitiveType)){
				String pattern="yyyy-MM";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isGYear(primitiveType)){
				String pattern="yyyy";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isGMonthDay(primitiveType)){
				String pattern="MM-dd";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isGDay(primitiveType)){
				String pattern="dd";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isGMonth(primitiveType)){
				String pattern="MM";
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat( pattern) ;
				value=simpleDateFormat.format(new Date(System.currentTimeMillis()));
			}else if(isDuration(primitiveType)){
				value="P0Y0M0DT0H0M";
			}else if(isHexBinary(primitiveType)){
				value="00";
			}else if(isQName(primitiveType)){
				value="localPart";
			}else if(isNCName(primitiveType)){
				value="NCName";
			}
			
			NIEMFactory.instance.createLiteralString(slot,value,"",type);
		}
			
		
	}
static protected Set<Classifier> getConcreteClassifiers(Classifier classifier){
	// if possible
	Set<Classifier> result=new HashSet<Classifier>();
	if(classifier==null)return result;
//	if(!classifier.isAbstract())return classifier;
	 Set<Classifier> niemSubtypes=new HashSet<Classifier>();
	 getAllNiemSubtypes(classifier,niemSubtypes);
	 for(Classifier test:niemSubtypes){
			if(!test.isAbstract())result.add(test) ;
	 }
	 if(result.isEmpty())result.add(classifier);
	return result;// something better then nothing
}
	static protected boolean isEnumeration(Classifier classifier){
		if( Enumeration.class.isInstance(classifier))return true;
		if(NIEMHelper.isUnion(classifier)){
			for(Classifier unionMember:NIEMHelper.getUnionOfMembers(classifier)){
				
				boolean result=isEnumeration(unionMember);
				if(result)return result;
			}
		}
		for(Classifier general:classifier.getGeneral()){
			boolean result=isEnumeration(general);
			if(result)return result;
		}
		return false;
	}
	static protected EnumerationLiteral getAnEnumerationLiteral(Classifier classifier,int index){
		if(Enumeration.class.isInstance(classifier)){
			// need all here to pick up literals across intervening extensions, back to original restriction
			List<EnumerationLiteral> enumerationLiterals=new Vector<EnumerationLiteral>(NIEMHelper.getAllLiterals((Enumeration)classifier));
			if(enumerationLiterals.size()>index)return enumerationLiterals.get(index);
			for(EnumerationLiteral literal:enumerationLiterals){
				return literal;
			}
		}
		if(NIEMHelper.isUnion(classifier)){
			for(Classifier unionMember:NIEMHelper.getUnionOfMembers(classifier)){
				EnumerationLiteral result=getAnEnumerationLiteral(unionMember,index);
				if(result!=null)return result;
			}
		}
		for(Classifier general:classifier.getGeneral()){
			EnumerationLiteral result=getAnEnumerationLiteral(general,index);
			if(result!=null)return result;
		}
		return null;
	}
	static protected boolean isInteger(PrimitiveType primitiveType){
		if(primitiveType==null)return false;
		if("integer".equalsIgnoreCase(primitiveType.getName())) return true;
		for(Classifier general:primitiveType.getGeneral()){
			if(PrimitiveType.class.isInstance(general)){
				if(isInteger((PrimitiveType)general))return true;
			}
		}
		return false;
	}
	static protected boolean isReal(PrimitiveType primitiveType){
		if(primitiveType==null)return false;
		if("float".equalsIgnoreCase(primitiveType.getName())) return true;
		if("decimal".equalsIgnoreCase(primitiveType.getName())) return true;
		if("double".equalsIgnoreCase(primitiveType.getName())) return true;
		if("Real".equalsIgnoreCase(primitiveType.getName())) return true;
		Classifier base=NIEMHelper.getBaseClassifier(primitiveType);
		if(base instanceof PrimitiveType)return isReal((PrimitiveType)base);
		return false;
	}
	static protected boolean isDate(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"date");
	}
	static protected boolean isXmlPrimitiveNamed(PrimitiveType primitiveType,String name){
		if(primitiveType==null)return false;
		if(name.equalsIgnoreCase(primitiveType.getName())) return true;
		Classifier base=NIEMHelper.getBaseClassifier(primitiveType);
		if(base instanceof PrimitiveType)return isXmlPrimitiveNamed((PrimitiveType)base,name);
		return false;
	}
	static protected boolean isDateTime(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"dateTime");
	}
	static protected boolean isTime(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"time");
	}
	static protected boolean isGYearMonth(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"gYearMonth");
	}
	static protected boolean isGYear(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"gYear");
	}
	static protected boolean isGMonthDay(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"gMonthDay");
	}
	static protected boolean isGDay(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"gDay");
	}
	static protected boolean isGMonth(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"gMonth");
	}
	static protected boolean isDuration(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"duration");
	}
	static protected boolean isHexBinary(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"hexBinary");
	}
	static protected boolean isQName(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"QName");
	}
	static protected boolean isNCName(PrimitiveType primitiveType){
		return isXmlPrimitiveNamed(primitiveType,"NCName");
	}
	
	protected static boolean doesSlotExist(Property referenceProperty,InstanceSpecification subsetClassifier){
		return !getExistingSlots(referenceProperty,subsetClassifier,new HashSet<Slot>()).isEmpty();
	}
	protected static Set<Slot> getExistingSlots(Property referenceProperty,InstanceSpecification subsetClassifier,Set<Slot> didThat){
		Set<Slot> result=new HashSet<Slot>();
		if((referenceProperty==null)||(subsetClassifier==null))return result;
		String referenceName=referenceProperty.getName();
		if(referenceName==null)return result;
		for(Slot slotTest:subsetClassifier.getSlot()){
			if(didThat.contains(slotTest))continue;
			StructuralFeature feature=slotTest.getDefiningFeature();
			if(Property.class.isInstance(feature)){
				Property propertyTest=(Property)feature;
				if(NameHelper.isMatchingProperty(propertyTest,referenceProperty)){
					result.add(slotTest);
					didThat.add(slotTest);
				}else
				if(NameHelper.isMatchingSubstitutionGroupProperty(propertyTest,referenceProperty)){
					result.add(slotTest);
					didThat.add(slotTest);
				}
			}
		}
		return result;
		
	}

	static public void ValueDialog(Slot slot){
		try{
			// selection dialog consisting of
			//    Classifier choices via NIEM inheritance
			//		consider subsetting properties here too
			StructuralFeature structuralFeature=slot.getDefiningFeature();
			if(!Property.class.isInstance(structuralFeature))return;
			Property property=(Property)structuralFeature;
			Type type=property.getType();
			if(!Classifier.class.isInstance(type))return;
			Classifier referenceClassifier=(Classifier)type;
			 final Classifier referenceModelTest=referenceClassifier;
			 final Set<Classifier> niemSubtypes=new HashSet<Classifier>();
			 Set<Classifier> allNiemSubtypes=new HashSet<Classifier>();
			 getAllNiemSubtypes(referenceModelTest,allNiemSubtypes);
			 for(Classifier subType:allNiemSubtypes){
				 if(!((Classifier)subType).isAbstract())niemSubtypes.add(subType);
			 }
			 int subtypeCount=niemSubtypes.size();
				//System.out.println("ValueDialog "+subtypeCount+", "+niemSubtypes+", "+allNiemSubtypes);
			 if(subtypeCount==0)return;
			 boolean isOkClicked=false;
			InstanceSpecification instanceSpecification=slot.getOwningInstance();
			if(instanceSpecification==null)return;
			List<BaseElement> selectedElements=new Vector<BaseElement>();

			 if(subtypeCount>1){
				Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
				 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Type for  "+property.getName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_instancecontainmentvalue");
				 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
				 Element root=NIEMHelper.getModelRoot();
				 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
				 // 
				 TypeFilter visibleElementsFilter=new TypeFilter(){
					@Override
					public boolean accept(BaseElement referenceElement) {
						return niemSubtypes.contains(referenceElement);
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
	
				 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,VALUE_DIALOG_DESCRIPTION_TITLE,VALUE_DIALOG_DESCRIPTION);
				 isOkClicked=dlg.isOkClicked();
				 selectedElements=dlg.getSelectedElements();
			 }else  if(subtypeCount==1){
				 // may want enumeration selection here, if the classifier is an enumeration
				 isOkClicked=true;
				 selectedElements.addAll(niemSubtypes);
				if(referenceClassifier instanceof Enumeration){
					InstanceSpecification defaultLiteral=getAnEnumerationLiteral(referenceClassifier,0);
					if(defaultLiteral!=null){
						InstanceValue instanceValue=addReferenceInstanceValue(defaultLiteral,slot,referenceClassifier,null);
						EnumerationLiteralDialog(instanceValue);
						return;// done
					}
				}

			 }
			 // Check if the user has clicked "Ok".
			 if (isOkClicked)
			 {
				 xmlInstanceDocumentActionProgress(selectedElements,null,instanceSpecification,slot);
				 /*
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("instance");
				 try{
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:selectedElements){
//			    	 Property addedProperty=NameHelper.addProperty((Property)baseElement,clientClassifier);
			    	 Set<Classifier> didThat=new HashSet<Classifier>();
			    	 addInstanceValue((Classifier)baseElement,slot,didThat);
			     }
			     resolveReferences(instanceSpecification);
				 }finally{
			  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
				 */
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}
	static protected void 			     resolveReferences(InstanceSpecification instanceSpecification,ProgressStatus progressStatus){
		// recursively search for any slots with reference properties which do not have value specification
		// we could also check for metadata references at this point

		Collection<Slot> slots=new Vector<Slot>(instanceSpecification.getSlot());
		for(Slot slot:slots){
			StructuralFeature structuralFeature=slot.getDefiningFeature();
			if(!Property.class.isInstance(structuralFeature))continue;
			Property property=(Property)structuralFeature;
			boolean isReference=NIEMHelper.isReferenceProperty(property);
			if(slot.getValue().isEmpty()){
				if(isReference){
					// try to resolve it
					Set<InstanceSpecification> referenceables=getReferenceables(slot);
					int minimum=property.getLower();
				     if(referenceables.isEmpty()){
				    	 // unresolved, can we eliminate it?
				    	 if(minimum==0){
				    		 NIEMHelper.removeElement(slot);
				    	 }
				     }
				     else{
				    	 // keep going until we have minimum
				    	 while(true){
						     for(InstanceSpecification baseElement:referenceables){
						    	 addReferenceInstanceValue(baseElement,slot,getInstanceSpecificationClassifier(baseElement),progressStatus);
						    	 minimum--;
						    	 if(minimum<=0){
						    		 break;
						    	 }
						     }
						     if(minimum<=0)break;
					     }
				     }
				}
			}else if (!isReference){
				for(ValueSpecification test:slot.getValue()){
					if(InstanceValue.class.isInstance(test)){
						InstanceSpecification childInstance=((InstanceValue)test).getInstance();
						if(childInstance!=null){
							resolveReferences(childInstance,progressStatus);
						}
					}
				}
			}
			// check for any metadata reference possibiities
			for(ValueSpecification valueSpecification:slot.getValue()){
				// if already has metadata, bypass
//				 Dependency metadataDependency=getMetadataDependency(valueSpecification);
//				 if(metadataDependency!=null)continue;
				 if(!getMetadataDependency(valueSpecification).isEmpty())continue;
				// if candidate for metadata, search for qualifying metadata and add
				 Set<InstanceSpecification> applicableInstances=getApplicableMetadataInstances(valueSpecification,true);
				 for(InstanceSpecification applicableInstance:applicableInstances){
					 createMetadataDependency(valueSpecification,applicableInstance);
					 break;
				 }
			}
		}
	}

	static protected String getNamePath(Slot slot){
		String result=slot.getDefiningFeature().getName();
		InstanceSpecification instanceSpecification=slot.getOwningInstance();
		if(instanceSpecification!=null){
			result=instanceSpecification.getName()+"."+result;
		}			
		return result;
		/*
		Slot parentSlot=getParentSlot(slot);
		String result=slot.getDefiningFeature().getName();
		if(parentSlot!=null){
			result=getNamePath(parentSlot)+"."+result;
		}else{
			InstanceSpecification instanceSpecification=slot.getOwningInstance();
			if(instanceSpecification!=null){
				result=instanceSpecification.getName()+"."+result;
			}			
		}
		return result;
		*/
	}
	/*
	static protected Slot getParentSlot(Slot slot){
		InstanceSpecification instanceSpecification=slot.getOwningInstance();
		if(instanceSpecification!=null){
			for(InstanceValue instanceValue:instanceSpecification.get_instanceValueOfInstance()){
				Slot parentSlot=instanceValue.getOwningSlot();
				StructuralFeature structuralFeature=parentSlot.getDefiningFeature();
				if(Property.class.isInstance(structuralFeature)){
					Property property=(Property)structuralFeature;
					if(!NIEMHelper.isReferenceProperty(property)){
						return parentSlot;
					}
				}
			}
		}
		return null;
	}
	*/
	static protected InstanceValue addInstanceValue(Classifier referenceClassifier,Slot slot,Set<Classifier> didThat,ProgressStatus progressStatus,int index){
		if(didThat.contains(referenceClassifier))return null;
		didThat.add(referenceClassifier);
		// create an InstanceSpecification, InstanceValue
		Package owner=NIEMHelper.getNearestPackage(slot);
		// name as list of features from top
		String name=getNamePath(slot);
		// need to adjust name to avoid name clash
		name=getUniqueInstanceSpecificationName(name,slot);
		// if this is Enumeration, then get the literal; otherwise create an instanceSpecification
		InstanceSpecification instanceSpecification=null;
		if(referenceClassifier instanceof Enumeration){
			instanceSpecification=getAnEnumerationLiteral(referenceClassifier,index);
		}else{
			instanceSpecification=NIEMFactory.instance.createInstanceSpecification(referenceClassifier,owner,name);
		}
		if(instanceSpecification==null)return null;
		InstanceValue instanceValue=addReferenceInstanceValue(instanceSpecification,slot,referenceClassifier,progressStatus);
		// we could populate with slots at this time - prevent recursion
//		List<Property> orderedProperties=getOrderedProperties(referenceClassifier);
		List<Property> orderedAttributes=getRawOrderedAttributes(referenceClassifier);
		for(Property property:orderedAttributes){
			Set<Classifier> didThatToo=new HashSet<Classifier>(didThat);
			addSlot(property, instanceSpecification,didThatToo,progressStatus);
		}
		List<Property> orderedProperties=getRawOrderedElements(referenceClassifier);
		for(Property property:orderedProperties){
			Set<Classifier> didThatToo=new HashSet<Classifier>(didThat);
			addSlot(property, instanceSpecification,didThatToo,progressStatus);
		}
		return instanceValue;
	}
	static protected String getUniqueInstanceSpecificationName(String name,Slot slot){
		Package instancePackage=NIEMHelper.getNearestPackage(slot);
		if(instancePackage!=null){
			Set<String> names=new HashSet<String>();
			for(PackageableElement pe:instancePackage.getPackagedElement()){
				names.add(pe.getName());
			}
			int index=0;
			String useName=name;
			while(true){
				if(!names.contains(useName))return useName;
				useName=name+index;
				index++;
			}
		}
		return "unpackaged";
	}
	static protected String getValueName(Slot slot){
		// name is slot name plus index
		String valueName=slot.getDefiningFeature().getName();
		if(!slot.getValue().isEmpty())valueName=valueName+"."+slot.getValue().size();
		return valueName;
	}
	
	static protected InstanceValue addReferenceInstanceValue(InstanceSpecification instanceSpecification,Slot slot,Type type,ProgressStatus progressStatus){
		// name is slot name plus index
		String valueName=getValueName(slot);
		if(progressStatus!=null){
			progressStatus.setDescription("add to slot "+slot.getDefiningFeature().getName()+" reference to "+instanceSpecification.getName());
		}
		InstanceValue instanceValue=NIEMFactory.instance.createInstanceValue(instanceSpecification,slot,valueName,type);
		return instanceValue;
	}
	  protected static void getAllNiemSubtypes(Classifier classifier,Set<Classifier> niemSubtypes)
	    {
		  if(niemSubtypes.contains(classifier))return;
		  niemSubtypes.add(classifier);
	   	 Collection <Classifier> result=new HashSet<Classifier>();
	    	for(DirectedRelationship dr:NiemBaseClassifierUsageExpression.getBaseTypeUsageRelations(classifier)){
				for(Element supplier:dr.getSource()){
					if(Classifier.class.isInstance(supplier)){
						getAllNiemSubtypes((Classifier)supplier,niemSubtypes);
					}
				}
	    	}
	    }
	
	static protected boolean isReferenceableInstanceSpecification(InstanceSpecification instanceSpecification,Property property){
		// type of Property must be consistent with Classifier of instanceSpecification
		Classifier instanceClassifier=getRootClassifier(instanceSpecification);
		if(instanceClassifier==null)return false;
		Type type=property.getType();
		if(!Classifier.class.isInstance(type))return false;
		Classifier requiredClassifier=(Classifier)type;
		return NIEMHelper.isSubTypeOf(instanceClassifier, requiredClassifier);
	}
	
	static public Set<InstanceSpecification> getReferenceables(Slot slot){
		Set<InstanceSpecification> referenceables=new HashSet<InstanceSpecification>();
		Package owner=NIEMHelper.getNearestPackage(slot);
		if(owner==null)return referenceables;
		StructuralFeature structuralFeature=slot.getDefiningFeature();
		if(!Property.class.isInstance(structuralFeature))return referenceables;
		Property property=(Property)structuralFeature;
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return referenceables;
		Map<Property,Set<InstanceSpecification>> map=projectCache.getPropertyToInstanceSpecificationMap(owner);
		Set<InstanceSpecification> testExisting=map.get(property);
		if(testExisting!=null)return testExisting;
		for(PackageableElement test:owner.getPackagedElement()){
			if(InstanceSpecification.class.isInstance(test)){
				InstanceSpecification instanceSpecification=(InstanceSpecification)test;
				if(isReferenceableInstanceSpecification(instanceSpecification,property)){
					referenceables.add(instanceSpecification);
				}
			}
		}
		map.put(property, referenceables);
		return referenceables;
	}
	
	static public void InstanceTypeDialog(InstanceValue instanceValue){
		try{
			// selection dialog consisting of valid types for owning feature
			Slot slot=instanceValue.getOwningSlot();
			if(slot==null)return;
			StructuralFeature feature=slot.getDefiningFeature();
			if(feature==null)return;
			Type type=feature.getType();
			final Set<Classifier> derivedClassifiers=new HashSet<Classifier>();
			if(type==null){
				// typing based on substitutionGroups
				for(Property subProperty:((Property)feature).get_propertyOfSubsettedProperty()){
					Type subType=subProperty.getType();
					derivedClassifiers.add((Classifier)subType);
					derivedClassifiers.addAll(NIEMHelper.getAllCommonSubtypes(subProperty));
				}
			}else{
				derivedClassifiers.addAll(NIEMHelper.getDerivedClassifiers((Classifier)type));
				derivedClassifiers.add((Classifier)type);
			}
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Type of "+type.getName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_instancerefvalue");
			 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement referenceElement) {
					return derivedClassifiers.contains(referenceElement);
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

			 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,type);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,INSTANCE_TYPE_DIALOG_DESCRIPTION_TITLE,INSTANCE_TYPE_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
	   			 boolean isSessionCreated=NIEMHelper.createSession("instanceType");
	   			 try{
	   				 // selected types to InstanceValue, InstanceSpecification, and any other instanceValues referencing that
	   				 for(Object test:dlg.getSelectedElements()){
	   					 if(!(test instanceof Classifier))continue;
	   					Classifier classifier=(Classifier)test;
	   					 instanceValue.setType(classifier);
	   					 InstanceSpecification is=instanceValue.getInstance();
	   					 if(is==null)continue;
	   					 is.getClassifier().clear();
	   					 is.getClassifier().add(classifier);
	   					 for(InstanceValue referencingInstanceValue:is.get_instanceValueOfInstance()){
	   						referencingInstanceValue.setType(classifier);
	   					 }
	   				 }
					}catch(CancelError e){
					} catch (Throwable e) {
						e.printStackTrace();
	   			 }finally{
	   					 NIEMHelper.closeSession(isSessionCreated);
	   			 }
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}
	static public void ReferenceValueDialog(Slot slot){
		try{
			// selection dialog consisting of
			//    list of existing, qualifying instances within same xml document
			if(slot==null)return;
			Package owner=NIEMHelper.getNearestPackage(slot);
			if(owner==null)return;
			StructuralFeature structuralFeature=slot.getDefiningFeature();
			if(!Property.class.isInstance(structuralFeature))return;
			Property property=(Property)structuralFeature;
			
			final Set<InstanceSpecification> referenceables=getReferenceables(slot);
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select Referenceable Instances to be included in "+property.getName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_instancerefvalue");
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement referenceElement) {
					return referenceables.contains(referenceElement);
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
						types.add(InstanceSpecification.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<?> selection=new Vector();
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,REFERENCE_VALUE_DIALOG_DESCRIPTION_TITLE,REFERENCE_VALUE_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				 xmlInstanceDocumentActionProgress(dlg.getSelectedElements(),null,null,slot);
				 /*
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("instance");
				 try{
			     // Get selected elements in multiple selection mode.
				//  Make sure inherited Classifiers included, do shallow copy for each, 
				//  other relations required? cross-schema refs?
				//  double-check to see if Classifier already exists
			     for(BaseElement baseElement:dlg.getSelectedElements()){
//			    	 Property addedProperty=NameHelper.addProperty((Property)baseElement,clientClassifier);
			    	 addReferenceInstanceValue((InstanceSpecification)baseElement,slot,getInstanceSpecificationClassifier((InstanceSpecification)baseElement));
			     }
				 }finally{
			  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
				 */
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During subsetting "+t);
			}
	}
//	public static Set<InstanceSpecification> getApplicableMetadataInstances(InstanceValue instanceValue){
	public static Set<InstanceSpecification> getApplicableMetadataInstances(ValueSpecification instanceValue,boolean isApplicabilityRequired){
		Set<InstanceSpecification> result=new HashSet<InstanceSpecification>();
		Package owner=NIEMHelper.getNearestPackage(instanceValue);
		if(owner==null)return result;
		//InstanceSpecification valueInstance=instanceValue.getInstance();
		for(PackageableElement test:owner.getPackagedElement()){
			if(InstanceSpecification.class.isInstance(test)){
				InstanceSpecification instanceSpecification=(InstanceSpecification)test;
//				if(isApplicableMetadataInstanceSpecification(instanceSpecification,valueInstance)){
				if(isApplicableMetadataInstanceSpecification(instanceSpecification,instanceValue,isApplicabilityRequired)){
					result.add(instanceSpecification);
				}
			}
		}
		return result;
	}		
//	static protected boolean isApplicableMetadataInstanceSpecification(InstanceSpecification instanceSpecification,InstanceSpecification valueInstance){
	static protected boolean isApplicableMetadataInstanceSpecification(InstanceSpecification instanceSpecification,ValueSpecification valueInstance,boolean isApplicabilityRequired){
		// type of Property must be consistent with Classifier of instanceSpecification
		Classifier metadataClassifier=getRootClassifier(instanceSpecification);
		if(metadataClassifier==null)return false;
		if(!NIEMHelper.isMetadataType(metadataClassifier))return false;
//		Classifier valueClassifier=getRootClassifier(valueInstance);
		Type valueType=valueInstance.getType();
		if((valueType==null)||!(valueType instanceof Classifier))return false;
		Classifier valueClassifier=(Classifier)valueType;
		//if(valueClassifier==null)return false;
		// check for any applicable
		Set<Classifier> applicableTypes=NIEMHelper.getMetadataApplicationTypes(metadataClassifier);
		if(!isApplicabilityRequired && applicableTypes.isEmpty())return true;
		for(Classifier requiredClassifier:applicableTypes){
			if(NIEMHelper.isSubTypeOf(valueClassifier, requiredClassifier))return true;
		}
		return false;
	}
	public static void addSimpleValueSpecificationAction(MDMenuAction category,final PresentationElement requestor,final Element instanceSpecification,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("addSimpleValueSpecificationAction","add Literal Value",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// simply add a new value
				Object test=getSelectedObject();
				System.out.println("addSimpleValueSpecificationAction "+test);
				if(test==null)return;
				Slot literalSlot=null;
				// context must be LiteralSpecification or Slot
				if(LiteralSpecification.class.isInstance(test)){
					literalSlot=((LiteralSpecification)test).getOwningSlot();
				}
				else if(Slot.class.isInstance(test)){
					literalSlot=(Slot)test;
				}
				if(literalSlot==null)return;
				StructuralFeature feature=literalSlot.getDefiningFeature();
				Type type=feature.getType();
				if(!(type instanceof Classifier))return;
				Classifier classifier=(Classifier)type;
				// add a value
				PrimitiveType primitiveType=NIEMHelper.getXmlSimpleType(classifier);
				if(primitiveType!=null){
					boolean isSessionCreated=NIEMHelper.createSession("addSimpleValueSpecification");
					try{
					addLiteralSpecification(primitiveType,literalSlot,classifier);
					}finally{
						NIEMHelper.closeSession(isSessionCreated);
					}
				}
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(ADD_SIMPLE_VALUE_SPECIFICATION_ACTION_TOOLTIP);
		category.addAction(testAction);
		
	}		
	public static void setEnumerationLiteralAction(MDMenuAction category,final PresentationElement requestor,final InstanceValue instanceValue,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("setEnumerationLiteralAction","set EnumerationLiteral",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// specification dialog for an InstanceSpecification
						EnumerationLiteralDialog(instanceValue);
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(SET_ENUMERATION_LITERAL_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
	}		
//	public static void setMetadataValueSpecificationAction(MDMenuAction category,final PresentationElement requestor,final InstanceValue instanceValue,String niemGroupName){
	public static void setMetadataValueSpecificationAction(MDMenuAction category,final PresentationElement requestor,final ValueSpecification instanceValue,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("setMetadataValueSpecificationAction","set Metadata reference",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				MetadataReferenceDialog(instanceValue);
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(SET_METADATA_REFERENCE_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
	}		
	
	public static void setReferenceValueAction(MDMenuAction category,final PresentationElement requestor,final InstanceValue instanceValue,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("setReferenceValueAction","set Reference Value",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				SetReferenceDialog(instanceValue);
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(SET_REFERENCE_VALUE_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
	}		
	
	public static void slotFeatureChangeAction(MDMenuAction category,final PresentationElement requestor,final Slot slot,String niemGroupName){
		MDAction testAction=new DefaultBrowserAction("slotFeatureChangeAction","change Slot Feature",null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				ChangeSlotFeatureDialog(slot);
			}
		};
		testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
		testAction.setDescription(SLOT_FEATURE_CHANGE_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
		category.addAction(testAction);
	}		
	static public void EnumerationLiteralDialog(final InstanceValue instanceValue){
		try{
			Slot slot=instanceValue.getOwningSlot();
			if(slot==null)return;
			StructuralFeature structuralFeature=slot.getDefiningFeature();
			Enumeration enumeration=null;
			if(Property.class.isInstance(structuralFeature)){
				Property property=(Property)structuralFeature;
				Type type=property.getType();
				if(type instanceof Enumeration){
					enumeration=(Enumeration)type;
				}
			}

			// selection dialog consisting of valid enumeration literals
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select an EnumerationLiteral as value for "+instanceValue.getQualifiedName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_enumerationliteralref");
			 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
			 
			 // changes:  show current selection; pre-selected options including implicit and derived; resequence at end
//			 final Set<EnumerationLiteral> preselectedProperties=new HashSet<EnumerationLiteral>(InstanceHelper.getEnumerationLiterals(enumeration));
			 // we need to pick up  literals from extensions, back to original restriction
			 final Set<EnumerationLiteral> preselectedProperties=new HashSet<EnumerationLiteral>(NIEMHelper.getAllLiterals(enumeration));
			 
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
				@Override
				public boolean accept(BaseElement referenceElement) {
					return preselectedProperties.contains(referenceElement);
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
			 java.util.List<EnumerationLiteral> selection=new Vector<EnumerationLiteral>();
			 InstanceSpecification testForLiteral=instanceValue.getInstance();
			 if(testForLiteral instanceof EnumerationLiteral)selection.add((EnumerationLiteral)testForLiteral);
			 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ENUMERATION_LITERAL_DIALOG_DESCRIPTION_TITLE,ENUMERATION_LITERAL_DIALOG_DESCRIPTION);

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("instance");
				 try{
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 if(baseElement instanceof EnumerationLiteral){
			    	 instanceValue.setInstance((EnumerationLiteral)baseElement);
			    	 }
			     }
				 }finally{
			  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
			 }
			}catch(Throwable t){
				QvtCommonAction.log("ERROR:During enumeration literal selection "+t);
			}
	}

	 /*
	 protected static Set<EnumerationLiteral> getEnumerationLiterals(Enumeration enumeration){
		 Set<EnumerationLiteral> result=new HashSet<EnumerationLiteral>();
			DataType baseType=getBaseType(enumeration);
			if(baseType instanceof Enumeration)result.addAll(getEnumerationLiterals((Enumeration)baseType));
			result.addAll(enumeration.getOwnedLiteral());
			return result;
	 }
	 */
	static protected void createMetadataDependency(ValueSpecification instanceValue,InstanceSpecification baseElement){
		 // need a new Dependency
			Dependency result=Application.getInstance().getProject().getElementsFactory().createDependencyInstance();
			result.getClient().add(instanceValue);
			result.getSupplier().add(baseElement);
			NIEMHelper.getNearestPackage(instanceValue).getPackagedElement().add(result);
			result.setName("metadata");
		
	}
//	static public void MetadataReferenceDialog(final InstanceValue instanceValue){
		static public void MetadataReferenceDialog(final ValueSpecification instanceValue){
			try{
				Slot slot=instanceValue.getOwningSlot();
				if(slot==null)return;
				StructuralFeature structuralFeature=slot.getDefiningFeature();
				Type type=structuralFeature.getType();
				if(!(type instanceof Classifier))return;

				// selection dialog consisting of valid metadata
				Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
				 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select an Metadata Instance to be referenced by "+instanceValue.getQualifiedName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_metadataref");
				 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
				 
				 final Set<InstanceSpecification> preselectedProperties=getApplicableMetadataInstances(instanceValue,false);
				 Element root=NIEMHelper.getNearestPackage(instanceValue);
				 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
				 TypeFilter visibleElementsFilter=new TypeFilter(){
					@Override
					public boolean accept(BaseElement referenceElement) {
						return preselectedProperties.contains(referenceElement);
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
							types.add(InstanceSpecification.class);
						}
						return types;
					}
					 
				 };
				 TypeFilter selectableElementsFilter=visibleElementsFilter;
				 java.util.Collection<?> creatableTypes=new Vector();
				 java.util.List<InstanceSpecification> selection=new Vector<InstanceSpecification>();
				 /*
				 Dependency metadataDependency=getMetadataDependency(instanceValue);
				 if(metadataDependency!=null){
						 for(NamedElement ne:metadataDependency.getSupplier()){
							 if(ne instanceof InstanceSpecification){
								 selection.add((InstanceSpecification)ne);
								 break;
							 }
						 }
				 }
				 */
				 Set<Dependency> metadataDependencies=getMetadataDependency(instanceValue);
				 for(Dependency metadataDependency:metadataDependencies){
						 for(NamedElement ne:metadataDependency.getSupplier()){
							 if(ne instanceof InstanceSpecification){
								 selection.add((InstanceSpecification)ne);
								 break;
							 }
						 }
						 if(!selection.isEmpty())break;
				 }
				 
				 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

				 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,METADATA_INSTANCE_DIALOG_DESCRIPTION_TITLE,METADATA_INSTANCE_DIALOG_DESCRIPTION);

				 // Check if the user has clicked "Ok".
				 if (dlg.isOkClicked())
				 {
					// only one session can be active, so check this.
					 boolean isSessionCreated=NIEMHelper.createSession("instance");
					 try{
				     for(BaseElement baseElement:dlg.getSelectedElements()){
				    	 if(baseElement instanceof InstanceSpecification){
				    		 /*
							 if(metadataDependency!=null){
								 metadataDependency.getSupplier().clear();
								 metadataDependency.getSupplier().add((InstanceSpecification)baseElement);
								 */
				    		 if(!metadataDependencies.isEmpty()){
				    			 // adjust first, remove others
				    			 boolean isFirst=true;
				    			 for(Dependency metadataDependency:metadataDependencies){
				    				 if(isFirst){
										 metadataDependency.getSupplier().clear();
										 metadataDependency.getSupplier().add((InstanceSpecification)baseElement);
										 isFirst=false;
				    				 }else{
				    					 NIEMHelper.removeElement(metadataDependency);
				    				 }
				    			 }
							 }else{
								 // need a new Dependency
								 createMetadataDependency(instanceValue,(InstanceSpecification) baseElement);
								 /*
									Dependency result=Application.getInstance().getProject().getElementsFactory().createDependencyInstance();
									result.getClient().add(instanceValue);
									result.getSupplier().add((InstanceSpecification)baseElement);
									NIEMHelper.getNearestPackage(instanceValue).getPackagedElement().add(result);
									result.setName("metadata");
									*/
							 }
				    	 }
				     }
					 }finally{
				  // apply changes and add command into command history.
						 NIEMHelper.closeSession(isSessionCreated);
					 }
				 }
				}catch(Throwable t){
					QvtCommonAction.log("ERROR:During enumeration literal selection "+t);
				}
		}
//		 protected static Dependency getMetadataDependency(InstanceValue instanceValue){
//		 protected static Dependency getMetadataDependency(ValueSpecification instanceValue){
	 public static Set<Dependency> getMetadataDependency(ValueSpecification instanceValue){
		 Set<Dependency> result=new HashSet<Dependency>();
		 for(Dependency dependency:instanceValue.getClientDependency()){
			 if("metadata".equals(dependency.getName())){
				 for(NamedElement ne:dependency.getSupplier()){
					 if(ne instanceof InstanceSpecification){
						 //return dependency;
						 result.add(dependency);
					 }
				 }
			 }
		 }
		 return result;
	 }
	 
		static public void SetReferenceDialog(final InstanceValue instanceValue){
			try{
				Slot slot=instanceValue.getOwningSlot();
				if(slot==null)return;
				StructuralFeature structuralFeature=slot.getDefiningFeature();
				Type type=structuralFeature.getType();
				if(!(type instanceof Classifier))return;

				// selection dialog consisting of valid instances
				Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
				 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select an Instance to be referenced by "+instanceValue.getQualifiedName(),"niem_uml_modeling_workingwithmodelelements_selectinganelement_instanceref");
				 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
				 
				 final Set<InstanceSpecification> preselectedProperties=getReferenceables(slot);

				 Element root=NIEMHelper.getNearestPackage(instanceValue);
				 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
				 TypeFilter visibleElementsFilter=new TypeFilter(){
					@Override
					public boolean accept(BaseElement referenceElement) {
						return preselectedProperties.contains(referenceElement);
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
							types.add(InstanceSpecification.class);
						}
						return types;
					}
					 
				 };
				 TypeFilter selectableElementsFilter=visibleElementsFilter;
				 java.util.Collection<?> creatableTypes=new Vector();
				 java.util.List<InstanceSpecification> selection=new Vector<InstanceSpecification>();
				 InstanceSpecification test=instanceValue.getInstance();
				 if(test!=null)selection.add(test);
				 /*
				 Dependency metadataDependency=getMetadataDependency(instanceValue);
				 if(metadataDependency!=null){
						 for(NamedElement ne:metadataDependency.getSupplier()){
							 if(ne instanceof InstanceSpecification){
								 selection.add((InstanceSpecification)ne);
								 break;
							 }
						 }
				 }
				 */
				 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

				 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,REFERENCE_INSTANCE_DIALOG_DESCRIPTION_TITLE,REFERENCE_INSTANCE_DIALOG_DESCRIPTION);

				 // Check if the user has clicked "Ok".
				 if (dlg.isOkClicked())
				 {
					// only one session can be active, so check this.
					 boolean isSessionCreated=NIEMHelper.createSession("instance");
					 try{
				     for(BaseElement baseElement:dlg.getSelectedElements()){
				    	 if(baseElement instanceof InstanceSpecification){
				    		 instanceValue.setInstance((InstanceSpecification)baseElement);
				    	 }
				     }
					 }finally{
				  // apply changes and add command into command history.
						 NIEMHelper.closeSession(isSessionCreated);
					 }
				 }
				}catch(Throwable t){
					QvtCommonAction.log("ERROR:During enumeration literal selection "+t);
				}
		}
		
		static public void ChangeSlotFeatureDialog(final Slot slot){
			try{
				if(slot==null)return;
				StructuralFeature structuralFeature=slot.getDefiningFeature();
				if(!(structuralFeature instanceof Property))return;
				Property preselectedProperty=(Property)structuralFeature;
				// selection dialog consisting of valid feature
				Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
				 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,"Select a Property for the feature of the Slot","niem_uml_modeling_workingwithmodelelements_selectinganelement_instanceref");
				 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
				 
				 final Set<Property> preselectedProperties=	new HashSet<Property>();
				 preselectedProperties.add(preselectedProperty);
				 preselectedProperties.addAll(getSubstitutableProperties(preselectedProperty));
				 if(preselectedProperty.isDerivedUnion()){
					 preselectedProperties.remove(preselectedProperty);
				 }

				 Element root=NIEMHelper.getModelRoot();

				 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
				 TypeFilter visibleElementsFilter=new TypeFilter(){
					@Override
					public boolean accept(BaseElement referenceElement) {
						return preselectedProperties.contains(referenceElement);
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
				 java.util.List<Property> selection=new Vector<Property>();
				 //InstanceSpecification test=instanceValue.getInstance();
				 //if(test!=null)selection.add(test);
				 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

				 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,CHANGE_SLOT_FEATURE_DIALOG_DESCRIPTION_TITLE,CHANGE_SLOT_DIALOG_DESCRIPTION);

				 // Check if the user has clicked "Ok".
				 if (dlg.isOkClicked())
				 {
					// only one session can be active, so check this.
					 boolean isSessionCreated=NIEMHelper.createSession("slotFeature");
					 try{
				     for(BaseElement baseElement:dlg.getSelectedElements()){
				    	 if(baseElement instanceof Property){
				    		 slot.setDefiningFeature((Property)baseElement);
				    	 }
				     }
					 }finally{
				  // apply changes and add command into command history.
						 NIEMHelper.closeSession(isSessionCreated);
					 }
				 }
				}catch(Throwable t){
					QvtCommonAction.log("ERROR:During slot feature selection "+t);
				}
		}
public static void removeValueSpecificationAction(MDMenuAction category,final PresentationElement requestor,final Element instanceSpecification,String niemGroupName){
	MDAction testAction=new DefaultBrowserAction("removeValueSpecificationAction","Delete",null,niemGroupName){
		@Override
		public void updateState() {
			setEnabled(true);
		}
		@Override
		public void actionPerformed(java.awt.event.ActionEvent e){
			Object test=getSelectedObject();
			if(test==null)return;
			if(!(test instanceof ValueSpecification))return;
			ValueSpecification valueSpecification=(ValueSpecification)test;
			Slot slot=valueSpecification.getOwningSlot();
			if(slot==null)return;
			// remove the value specification, along with all its contained items
			 boolean isSessionCreated=NIEMHelper.createSession("valueSpecificationDelete");
			 try{
				 NIEMHelper.removeElement(valueSpecification);
			 }finally{
		  // apply changes and add command into command history.
				 NIEMHelper.closeSession(isSessionCreated);
			 }
		}
	};
	testAction.setSmallIcon(QvtCommonAction.getNiemIcon());
	testAction.setDescription(REMOVE_VALUE_SPECIFICATION_INSTANCE_DOCUMENT_ACTION_TOOLTIP);
	category.addAction(testAction);
	
}	
}
