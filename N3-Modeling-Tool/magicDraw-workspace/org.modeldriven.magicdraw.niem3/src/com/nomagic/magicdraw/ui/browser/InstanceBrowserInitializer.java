/**
 * 
 */
package com.nomagic.magicdraw.ui.browser;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import org.eclipse.emf.ecore.EObject;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.instance.InstanceHelper;
import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.actions.ActionsManager;
import com.nomagic.magicdraw.actions.ActionsID;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.annotation.Annotation;
import com.nomagic.magicdraw.annotation.AnnotationManager;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.WindowComponentInfo;
import com.nomagic.magicdraw.ui.browser.Browser;
import com.nomagic.magicdraw.ui.browser.Browser.BrowserInitializer;
import com.nomagic.magicdraw.ui.browser.BrowserTabTree;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.validation.RuleViolationResult;
import com.nomagic.magicdraw.validation.ValidationResultProvider;
import com.nomagic.magicdraw.validation.ValidationResultProviderEvent;
import com.nomagic.magicdraw.validation.ValidationResultProviderListener;
import com.nomagic.uml2.ext.jmi.helpers.ModelHelper;
import com.nomagic.uml2.ext.jmi.smartlistener.SmartListenerConfig;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Slot;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.StructuralFeature;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile;

/**
 * @author tom
 *
 */
public class InstanceBrowserInitializer implements BrowserInitializer {
	protected WindowComponentInfoRegistration windowComponentInfoRegistration=null;
	protected BrowserComponentInfo browserComponentInfo=null;
	public BrowserComponentInfo getBrowserComponentInfo() {
		if(browserComponentInfo==null){
		java.lang.String id="NIEM_INSTANCE_BROWSER";
		java.lang.String name="NIEM XML Instances";
		javax.swing.Icon icon=QvtCommonAction.getNiemIcon();
		browserComponentInfo=new BrowserComponentInfo(id,name, icon) ;
		
		}
		return browserComponentInfo;
	}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.browser.Browser.BrowserInitializer#getInfo()
	 */
	@Override
	public WindowComponentInfoRegistration getInfo() {
		if(windowComponentInfoRegistration==null){
			WindowComponentInfo info=getBrowserComponentInfo() ;
	        java.lang.String nextTo=null;
			windowComponentInfoRegistration=new WindowComponentInfoRegistration(info,nextTo);
		}
		
		return windowComponentInfoRegistration;
	}
	protected boolean isTopLevelInstanceSpecification(InstanceSpecification instanceSpecification){
    	Package instancePackage=NIEMHelper.getNearestPackage(instanceSpecification);
    	if(instancePackage==null)return false;
    	if(!NIEMHelper.isInstancePackage(instancePackage))return false;
    	// there should only be a single slot and its feature should be defined in an exchange schema
    	if(instanceSpecification.getSlot().size()!=1){return false;}
    	for(Slot slot:instanceSpecification.getSlot()){
    		StructuralFeature sf=slot.getDefiningFeature();
    		if(!Property.class.isInstance(sf)) return false;
    		Property property=(Property)sf;
    		Package informationModel=NIEMHelper.getNearestInformationModel(property);
    		if(informationModel==null)return false;
    		if(!NIEMHelper.isInformationModelDefaultPurposeExchange(informationModel))return false;
    	}
		return( instanceSpecification.isEditable()
				&&instanceSpecification.get_instanceValueOfInstance().isEmpty()
				&&(instanceSpecification.getStereotypedElement()==null)
				);
		
	}
	//protected NiemInstanceBrowserTabTree browserTabTree=null;
	public NiemInstanceBrowserTabTree getBrowserTabTree(){
		Project project=Application.getInstance().getProject();
		if(project==null)return null;
		Browser browser=project.getBrowser();
		if(browser==null)return null;
		for(BrowserTabTree tree:browser.getTrees()){
			if(tree instanceof NiemInstanceBrowserTabTree)return (NiemInstanceBrowserTabTree)tree;
		}
		return null;
		}
	/* (non-Javadoc)
	 * @see com.nomagic.magicdraw.ui.browser.Browser.BrowserInitializer#init(com.nomagic.magicdraw.ui.browser.Browser, com.nomagic.magicdraw.core.Project)
	 */
	@Override
	public void init(Browser browser, Project project) {
		//System.out.println("init Browser  listeners "+project.getName());
		//browserTabTree=
				initBrowserTree(browser);
		
		listenForModelChanges(
				//browserTabTree,browser,
				project);

	}
	////////////////////////////
	public class NiemInstanceBrowserTabTree extends BrowserTabTree implements ToolTipConstants{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public NiemInstanceBrowserTabTree(Browser arg0,
				BrowserComponentInfo arg1, String arg2) {
			super(arg0, arg1, arg2);
			this.setToolTipText(XML_INSTANCE_DOCUMENT_BROWSER_TOOLTIP);
		}
		protected String niemGroupName = null;// "NIEMGROUP";
		public NodeCreator getNodeCreator(){
			return super.getNodeCreator();
		}
		/*
		public JTree getTree(){
			com.nomagic.awt.NMTree x;
			x.
			new NMTree
			JTree result=super.getTree();
			if(result!=null){
				QvtCommonAction.log("getTree "+result+", "+result.getClass().getName());
			}
			return result;
		}
*/
		@Override
		protected void configureContextActions(ActionsManager mngr) {
//if(true)return;				
			Node node = getSelectedNode();
			//QvtCommonAction.log("configureContextActions "+node);
			if (node == null)
				return;
			Object userObject = node.getUserObject();
			//QvtCommonAction.log("configureContextActions userObject "+userObject);
			if(!Element.class.isInstance(userObject))return;
			Element userElement=(Element)userObject;
			// if selected element, or any of its children, are not editable do nothing
			if(!userElement.isEditable())return;
			for(EObject child:userElement.eContents()){
				if(Element.class.isInstance(child)&&!((Element)child).isEditable())return;
			}
			// if not profiled as pim, do nothing
			Profile pimProfile=NIEMHelper.getPimProfile();
			if(pimProfile==null)return;
			//QvtCommonAction.log("configureContextActions pimProfile "+pimProfile);
			if(!NIEMHelper.isProfileApplied(userElement, pimProfile))return;
			
			// get rid of delete? and maybe some other things
			mngr.removeAction(ActionsID.DELETE);
			mngr.removeAction(ActionsID.DELETE_IN_BROWSER);

			
			MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
			MDMenuAction category = new MDMenuAction("NIEM", "NIEM", null,niemGroupName);
			category.setSmallIcon(QvtCommonAction.getNiemIcon());
			category.setNested(true);
			categoryDummy.addAction(category);
			// log("Browser object "+userObject);
			
				if (InstanceSpecification.class.isInstance(userElement)
						||Slot.class.isInstance(userElement)
						||ValueSpecification.class.isInstance(userElement)
						) {
					if(userElement instanceof InstanceValue){
						InstanceHelper.instanceSpecificationAction(category, null,userElement,niemGroupName);
						// we may be able to change type if type is subtypeable or is wrong
						if(isSubtypeable((InstanceValue)userElement)){
							InstanceHelper.instanceTypeAction(category, null,userElement,niemGroupName);
						}
					}
					// Properties whose types are restricted need to have an extended selection option
					//  include containment properties which are elements/typed by complex types  
					if (Slot.class.isInstance(userElement)||ValueSpecification.class.isInstance(userElement)) {
						Slot slot=null;
						ValueSpecification valueSpecification=null;
						if(userElement instanceof ValueSpecification)valueSpecification=(ValueSpecification)userElement;
						if(Slot.class.isInstance(userElement))slot=(Slot)userElement;
						else slot=valueSpecification.getOwningSlot();
						if(slot!=null){
							StructuralFeature structuralFeature=slot.getDefiningFeature();
							if(Property.class.isInstance(structuralFeature)){
								Property property=(Property)structuralFeature;
								int upper=structuralFeature.getUpper();
								int lower=structuralFeature.getLower();
								int slotValues=slot.getValue().size();
								Type type=structuralFeature.getType();
								if((upper<0)||(slotValues<upper)){
									
									if((type instanceof Classifier)&&NIEMHelper.isComplexType((Classifier)type)){
//									if(!(PrimitiveType.class.isInstance(type)||Enumeration.class.isInstance(type))){
										// includes References and containment
										InstanceHelper.addValueSpecificationAction(category, null,userElement,niemGroupName);
									}else{
										// give choice for add simpleType; populate with some value 
										InstanceHelper.addSimpleValueSpecificationAction(category, null,userElement,niemGroupName);
									}
								}
								if((valueSpecification!=null)&&(slotValues>lower)&&isRemoveable(valueSpecification)){
									InstanceHelper.removeValueSpecificationAction(category, null,userElement,niemGroupName);
								}
								if((type instanceof Enumeration)&&(userElement instanceof InstanceValue)){
									//  enumeration literal selection
									InstanceHelper.setEnumerationLiteralAction(category, null,(InstanceValue)userElement,niemGroupName);
								}
								if((NIEMHelper.isReferenceProperty(property))&&(userElement instanceof InstanceValue)){
									//  reference selection
									InstanceHelper.setReferenceValueAction(category, null,(InstanceValue)userElement,niemGroupName);
								}
								// we may be able to change feature if feature is substitutable or is wrong
								if(isSlotFeatureChangeable(slot)){
									InstanceHelper.slotFeatureChangeAction(category, null,slot,niemGroupName);
								}
								//  Metadata: may exist for not only InstanceValue, but also Literals
//								if(userElement instanceof InstanceValue){
								if(userElement instanceof ValueSpecification){
//									InstanceValue instanceValue=(InstanceValue)userElement;
									ValueSpecification instanceValue=(ValueSpecification)userElement;
									Set<InstanceSpecification> metadataInstances=InstanceHelper.getApplicableMetadataInstances(instanceValue,false);
									if(metadataInstances.size()>0){
										InstanceHelper.setMetadataValueSpecificationAction(category, null,instanceValue,niemGroupName);
									}
								}
								
							}
						}
					}
					boolean isSlotAddable=InstanceSpecification.class.isInstance(userElement);
					boolean isReference=false;
					if (InstanceValue.class.isInstance(userElement)) {
						InstanceValue instanceValue=(InstanceValue)userElement;
						Slot slot=instanceValue.getOwningSlot();
						if(slot!=null){
							StructuralFeature feature=slot.getDefiningFeature();
							if(feature instanceof Property){
								if(!NIEMHelper.isReferenceProperty((Property)feature)){
									isSlotAddable=true;
								}else{
									isReference=true;
								}
							}
						}
					}
					InstanceSpecification instanceSpecification=null;
					if(userElement instanceof InstanceSpecification)instanceSpecification=(InstanceSpecification)userElement;
					//else if(userElement instanceof Slot)instanceSpecification=((Slot)userElement).getOwningInstance();
						else if(userElement instanceof InstanceValue){
							instanceSpecification=((InstanceValue)userElement).getInstance();
					}
					if(instanceSpecification==null)isSlotAddable=false;
					if (isSlotAddable) {
						// also check if all slots already defined
						Set<Property> slotProperties=getSlotProperties(instanceSpecification);
						Set<Property> candidateProperties=getCandidateProperties(instanceSpecification);
						boolean isCompletelyDefined=true;
						for(Property candidateProperty:candidateProperties){
							if(!slotProperties.contains(candidateProperty)){
								isCompletelyDefined=false;
								break;
							}
						}
						if(!isCompletelyDefined){
							InstanceHelper.addSlotSpecificationAction(category, null,userElement,niemGroupName);
						}
					}
					
					
				}
				mngr.addCategory(categoryDummy);
		}
		protected boolean isRemoveable(ValueSpecification valueSpecification){
			// check if any contained InstanceSpecifications referenced by non-container
			if(!(valueSpecification instanceof InstanceValue))return true;
			if(isInstanceReference(valueSpecification))return true;
			InstanceSpecification is=((InstanceValue)valueSpecification).getInstance();
			return isRemoveable(is);
		}
		protected boolean isInstanceReference(ValueSpecification valueSpecification){
			Slot slot=valueSpecification.getOwningSlot();
			Property property=null;
			if(slot!=null){
				StructuralFeature sf=slot.getDefiningFeature();
				if(Property.class.isInstance(sf)){
					property=(Property)sf;
				}
			}
			if(property==null)return false;
			return(NIEMHelper.isReferenceProperty(property));
			
		}
		protected boolean isRemoveable(InstanceSpecification is){
			if((is==null)||(is instanceof EnumerationLiteral))return true;
			for(Slot slot:is.getSlot()){
				if(!isRemoveable(slot))return false;
			}
			// must not be referenced by non-containment
			for(InstanceValue instanceValue:is.get_instanceValueOfInstance()){
				if(isInstanceReference(instanceValue))return false;
			}
			return true;
		}
		protected boolean isRemoveable(Slot slot){
			if(slot==null)return true;
			for(ValueSpecification valueSpecification:slot.getValue()){
				if(!isRemoveable(valueSpecification))return false;
			}
			return true;
		}
		protected boolean isSubtypeable(InstanceValue instanceValue){
			boolean result=false;
			// if type of feature is subtypeable, or type is wrong
			Slot slot=instanceValue.getOwningSlot();
			if(slot==null)return false;
			StructuralFeature feature=slot.getDefiningFeature();
			if(feature==null)return false;
			Type type=feature.getType();
			if(type==null)return true;// resolve this via substitutionGroups
			if(!NIEMHelper.getDerivedClassifiers((Classifier)type).isEmpty())return true;
			// check if type mismatch
			if(!type.equals(instanceValue.getType()))return true;// corrective typing
			// type is adjustable if instanceSpecification not matching type
			InstanceSpecification instanceSpecification=instanceValue.getInstance();
			if((instanceSpecification!=null)&&!(instanceSpecification instanceof EnumerationLiteral)){
				List<Classifier> classifiers=instanceSpecification.getClassifier();
				boolean isIsDerivedFromVs=false;
				for(Classifier classifier:classifiers){
					if(classifier.equals(type)){
						isIsDerivedFromVs=true;
						break;
					}
				}
				if(!isIsDerivedFromVs){
					return true;
				}
			}
			
			return result;
		}
		
		protected boolean isSlotFeatureChangeable(Slot slot){
			boolean result=false;
			// if property is substitutable or property is wrong
			if(slot==null)return false;
			StructuralFeature feature=slot.getDefiningFeature();
			if(feature==null)return false;
			if(!(feature instanceof Property))return false;
			
			// 
			InstanceSpecification instanceSpecification=slot.getOwningInstance();
			if(instanceSpecification==null)return false;
			Set<Property> slotProperties=getSlotProperties(instanceSpecification);
			Set<Property> candidateProperties=getCandidateChangeableProperties((Property)feature);
			for(Property candidateProperty:candidateProperties){
				if(!slotProperties.contains(candidateProperty)){
					result=true;
					break;
				}
			}
			return result;
		}
		protected Set<Property> getCandidateChangeableProperties(Property property){
			// TODO: this might include subsetted Properties as well, if we knew the original Property this property corresponds to
			 Set<Property> preselectedProperties=new HashSet<Property>();
			 // expand preselectedOptions to include derived
			 preselectedProperties.addAll(InstanceHelper.getSubstitutableProperties(property));
			return preselectedProperties;
		}
		protected Set<Property> getSlotProperties(InstanceSpecification instanceSpecification){
			Set<Property> result=new HashSet<Property>();
			for(Slot slot:instanceSpecification.getSlot()){
				StructuralFeature feature=slot.getDefiningFeature();
				if(feature instanceof Property){
					result.add((Property)feature);
				}
			}
			return result;
		}
		protected Set<Property> getCandidateProperties(InstanceSpecification instanceSpecification){
			Set<Property> result=new HashSet<Property>();
			for(Classifier classifier:instanceSpecification.getClassifier()){
				//result.addAll(InstanceHelper.getOrderedProperties(classifier));
				result.addAll(InstanceHelper.getConcreteProperties(classifier));
			}
			return result;
		}
		@Override
		protected void configureToolbarActions(ActionsManager mngr) {
			MDActionsCategory categoryDummy = new MDActionsCategory("NIEMCAT", "NIEMCAT");
			InstanceHelper.addXmlInstanceDocumentAction(categoryDummy, niemGroupName);
			mngr.addCategory(categoryDummy);

		}
		@Override public void initTree(){
			//System.out.println("initTree");
			Node result=getRootNode();
			if(result==null)return;
			TreeModel treeModel=getTreeModel();
			List<Node> nodes=new Vector<Node>(result.getChildren());
			for(Node node:nodes){
				if(node instanceof MutableTreeNode){
					treeModel.removeNodeFromParent((MutableTreeNode)node);
					//System.out.println("removed from tree "+node);
				}
			}
			result.getChildren().clear();// in case we have residuals from another project
			result.removeAllChildren();// or will this clear the children
			result.removeRecursively();// or will this clear the children
			Map<Object,Node> objectToNodeMap=getObjectToNodeMap();
			objectToNodeMap.clear();
				Model model=Application.getInstance().getProject().getModel();
				if(model==null)return;
					java.lang.Class[] types={InstanceSpecification.class};
					Collection<? extends Element> instanceSpecifications=ModelHelper.getElementsOfType(model,types,false);
					for(Element test:instanceSpecifications){
						if(InstanceSpecification.class.isInstance(test)){
							InstanceSpecification instanceSpecification=(InstanceSpecification)test;
							if(isTopLevelInstanceSpecification(instanceSpecification)){
								Node nodeTest=getNodeForElement(instanceSpecification,result,objectToNodeMap);
								//QvtCommonAction.log("topLevel Instance TEST "+instanceSpecification.getQualifiedName()+", "+nodeTest);
								//System.out.println("topLevel Instance TEST "+instanceSpecification.getQualifiedName()+", "+nodeTest+", "+result);
								if(nodeTest!=null)continue;
								Node instanceNode=getInstanceSpecificationNode(instanceSpecification,getTreeModel(),objectToNodeMap);
								
								if(instanceNode!=null){
									//QvtCommonAction.log("topLevel Instance "+instanceSpecification.getQualifiedName()+", "+instanceNode);
//								result.add(instanceNode);
								treeModel.insertNodeInto(instanceNode, result,0);
								
								}
								
							}
						}
					}
					result.setHidden(true);
			
		}
		
	}
	////////////////////////////
	protected NiemInstanceBrowserTabTree initBrowserTree(Browser browser) {
		// can not instantiate browserTabTree
		BrowserComponentInfo browserComponentInfo=getBrowserComponentInfo();
		String arg="arg";

		NiemInstanceBrowserTabTree tree=new NiemInstanceBrowserTabTree(browser, browserComponentInfo, arg);
		tree.setAutoExpandMode(true);
		boolean drag=false;
		boolean drop=false;
		browser. 	addTree( tree,  drag,  drop) ;
		//QvtCommonAction.log("initBrowserTree complete ");
		return tree;
	}
	protected void listenForModelChanges(
			//BrowserTabTree tree,
			//Browser browser, 
			Project project){
		if(project==null)return;
		/*
		PropertyChangeListener listener=new InstancePropertyChangeListener(tree,browser);
		//QvtCommonAction.log("listenForModelChanges "+tree);
		Collection<SmartListenerConfig> configs= new ArrayList<SmartListenerConfig>();
        configs.add(SmartListenerConfig.INSTANCE_SLOT_VALUE_CONFIG);
        configs.add(SmartListenerConfig.INSTANCE_SPECIFICATION_CLASSIFIER_CONFIG);
        configs.add(SmartListenerConfig.SLOT_VALUE_CONFIG);
        configs.add(SmartListenerConfig.VALUE_SPECIFICATION_CONFIG);
     	 */
		ValidationResultProvider provider=project.getValidationResultProvider();
		if(provider!=null){
			ValidationResultProviderListener providerListener=new NIEMValidationResultProviderListener(
					project,provider
					//,configs,listener
					);
			provider.addValidationResultProviderListener(providerListener);
		}
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////
public class NIEMValidationResultProviderListener implements ValidationResultProviderListener{
	protected Project project;
	protected ValidationResultProvider provider;
	//protected Collection<SmartListenerConfig> configs;
	//protected PropertyChangeListener listener;
	public NIEMValidationResultProviderListener(Project projectIn,
			ValidationResultProvider providerIn
			//Collection<SmartListenerConfig> configsIn,PropertyChangeListener listenerIn
			){
		project=projectIn;
		provider=providerIn;

		//configs=configsIn;
		//listener=listenerIn;
		//project.getSmartEventSupport().registerConfig(InstanceSpecification.class, configs, listener);
		//project.getSmartEventSupport().registerConfig(ValueSpecification.class, configs, listener);
		//project.getSmartEventSupport().registerConfig(Slot.class, configs, listener);
	}
		@Override
		public void validationResultChanged(
				ValidationResultProviderEvent event) {
			//System.out.println("validationResultChanged "+project.getName()+", "+event.getSource());
			//  deregister config listener above;
			//   deregister this listener
			//   check if project closing
			// we are not seeing the project closing?
			if(project.isClosing()||project.isProjectClosed()){
				System.out.println("validationResultChanged project closing, shutting down listeners ");
				provider.removeValidationResultProviderListener(this);
//				project.getSmartEventSupport().unregisterConfig(InstanceSpecification.class, configs, listener);
//				project.getSmartEventSupport().unregisterConfig(ValueSpecification.class, configs, listener);
//				project.getSmartEventSupport().unregisterConfig(Slot.class, configs, listener);
				return;
			}
			ValidationResultProvider provider=event.getSource();
//			System.out.println("validationResultChanged provider SUPPRESS "+provider+", "+event.getGroup().getGroupId());
//if(false)					
			if(provider!=null){
				//QvtCommonAction.log("validationResultChanged results "+provider.getActiveValidationResults(false));
				//QvtCommonAction.log("validationResultChanged annotations "+RuleViolationResult.getAnnotations(provider.getActiveValidationResults(false)));
				BrowserTabTree tree=getBrowserTabTree();
				if(tree!=null)try{
					TreeRefreshRunnable treeManipulatingRunnable=new TreeRefreshRunnable();
		            try {
		        		if(SwingUtilities.isEventDispatchThread()){
		        			treeManipulatingRunnable.run();
		        		}else{
						SwingUtilities.invokeAndWait(treeManipulatingRunnable);
		        		}
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					
					/*
					for(Annotation annotation:RuleViolationResult.getAnnotations(provider.getActiveValidationResults(false))){
						BaseElement baseElement=annotation.getTarget();
						if(InstanceSpecification.class.isInstance(baseElement)
								||Slot.class.isInstance(baseElement)
								||ValueSpecification.class.isInstance(baseElement)){
							Node node=getNodeForObject(baseElement,treeNode);
							QvtCommonAction.log("validationResultChanged node "+node+", "+baseElement);
							if(node!=null){
								delegateUpdateNodeItself(node,true);
							}
						}
					}
					*/
				}catch(Throwable t){
					// ignore
				}
			}
		}
}	
	//////////////////////////////////////////////////////////////////////////////////////////////
//	protected boolean delegateUpdateNodeItself(Node node,boolean isCheckAnnotations){
	protected boolean delegateUpdateNodeItself(Node node){
		if(InstanceModelElementNode.class.isInstance(node)){
			return ((InstanceModelElementNode)node).delegateUpdateNodeItself();
		}
		return false;
	}
	protected Node getNodeForElement(Element object,Node node,Map<Object,Node> objectToNodeMap){
		return getNodeForObject(object,node,objectToNodeMap);
	}
	protected Node getNodeForObject(Object object,Node node,Map<Object,Node> objectToNodeMap){
		Node result=objectToNodeMap.get(object);
		if(result!=null)return result;
		Object nodeObject=node.getUserObject();
		objectToNodeMap.put(nodeObject, node);
		if(object.equals(nodeObject)){
			return node;
		}
		// if nodeObject is ValueSpectification, track back to slot
		if(ValueSpecification.class.isInstance(nodeObject)){
			nodeObject=((ValueSpecification)nodeObject).getOwningSlot();
			if(object.equals(nodeObject)){
				objectToNodeMap.put(object, node);
				return node;
			}
		}
		// if nodeObject is slot, track back to InstanceSpecification
		if(Slot.class.isInstance(nodeObject)){
			nodeObject=((Slot)nodeObject).getOwningInstance();
			if(object.equals(nodeObject)){
				objectToNodeMap.put(object, node);
				return node;
			}
		}
		for(Node child:node.getChildren()){
			Node test=getNodeForObject(object,child,objectToNodeMap);
			if(test!=null){
				return test;
			}
		}
		return null;
	}
	
	protected void createChangeNode(Element element,Node parentNode,Map<Object,Node> objectToNodeMap){
		// create subnodes
		if(Slot.class.isInstance(element)){
			addSlotNodes((Slot)element,parentNode,objectToNodeMap);
		}
		else	if(ValueSpecification.class.isInstance(element)){
				addValueSpecification((ValueSpecification)element,parentNode,objectToNodeMap);
		}else{
			Node result=createNode(element,objectToNodeMap);
			BrowserTabTree tree=getBrowserTabTree();
			TreeModel treeModel=tree.getTreeModel();
				treeModel.insertNodeInto(result, parentNode, 0);
			
		}
	}
protected Node createNode(Element element,Map<Object,Node> objectToNodeMap){
	ModelElementNode result=new InstanceModelElementNode(element, false);
	result.setAutoExpandable(true);
	result.setCompactable(true);
	objectToNodeMap.put(element, result);
	return result;
}
	protected Node getInstanceSpecificationNode(InstanceSpecification element,TreeModel treeModel,Map<Object,Node> objectToNodeMap){
		Node result=createNode(element,objectToNodeMap);
		//TreeModel treeModel=getTreeModel();
		//treeModel.insertNodeInto(result, result,0);
		
		// add all slots
		for(Slot slot:element.getSlot()){
			addSlotNodes(slot,result,objectToNodeMap);
		}
		sequenceNodeChildren(result);
		return result;
	}
	protected void addSlotNodes(Slot slot,Node parent,Map<Object,Node> objectToNodeMap){
	
		// should we be doing the valueSpecification instead of Slot??????????????????????????????????
		Node treeNode=getRootNode();
		if(treeNode==null)return;
		BrowserTabTree tree=getBrowserTabTree();
		TreeModel treeModel=tree.getTreeModel();
		/*
		Node treeNode=null;
		try{
			treeNode=tree.getRootNode();
		}catch(Throwable t){
			QvtCommonAction.log("InstanceBrowser.addSlotNodes Failed to get root tree node : "+t);
			return;
		}
		*/						
		if(slot.getValue().isEmpty()){
			Node nodeTest=getNodeForElement(slot,treeNode,objectToNodeMap);
			if(nodeTest!=null)return;

			Node result=createNode(slot,objectToNodeMap);
			int index=getNodeIndex(slot,parent);
			treeModel.insertNodeInto(result, parent, index);
			
		}else{
			for(ValueSpecification valueSpecification:slot.getValue()){
				addValueSpecification(valueSpecification,parent,objectToNodeMap);
			}
		}
		
		
	}
	protected Node getRootNode(){
		try{
			return getBrowserTabTree().getRootNode();
		}catch(Throwable t){
			QvtCommonAction.log("InstanceBrowser.addSlotNodes Failed to get root tree node : "+t);
			return null;
		}
		
	}
	protected void removeNodeFromParent(Node node,Map<Object,Node> objectToNodeMap){
		objectToNodeMap.remove(node.getUserObject());
		Node parentNode=node.getParent();
		if(parentNode==null)return;
		BrowserTabTree tree=getBrowserTabTree();
		TreeModel treeModel=tree.getTreeModel();
		treeModel.removeNodeFromParent(node);
	}
	protected void addValueSpecification(ValueSpecification valueSpecification,Node parent,Map<Object,Node> objectToNodeMap){
				Slot slot=valueSpecification.getOwningSlot();
				if(slot==null)return;
				//Node result=createNode(valueSpecification);
				Node valueSpecificationNode=null;
				
				BrowserTabTree tree=getBrowserTabTree();
				TreeModel treeModel=tree.getTreeModel();
				//Node treeNode=tree.getRootNode();
				
				Node treeNode=getRootNode();
				Node nodeTest=getNodeForElement(valueSpecification,treeNode,objectToNodeMap);
				if((nodeTest!=null)&&(valueSpecification.equals(nodeTest.getUserObject())))return;
				
				
				
					Node slotNode=getNodeForObject(slot,treeNode,objectToNodeMap);
					if((slotNode!=null)&&(slot.equals(slotNode.getUserObject()))){
						// remove current slotNode and replace with ValueSpecification Node
						Node parentNode=slotNode.getParent();
						int index=parentNode.getIndex(slotNode);
						//System.out.println("removing slotNode for valueSpecification "+valueSpecification.getQualifiedName()+", "+slotNode);
						removeNodeFromParent(slotNode,objectToNodeMap);
						 valueSpecificationNode=createNode(valueSpecification,objectToNodeMap);
						//createChangeNode(valueSpecification,parentNode);
						treeModel.insertNodeInto(valueSpecificationNode, parentNode, index);
					}else{
						// find node for prior sibling ValueSpecification and insert after that
						List<ValueSpecification> valueSpecifications=slot.getValue();
						if(!valueSpecifications.isEmpty()){
							int index=valueSpecifications.indexOf(valueSpecification);
							if(index>=0){
								if(index>0){
									ValueSpecification prior=valueSpecifications.get(index-1);
									Node priorNode=getNodeForObject(prior,treeNode,objectToNodeMap);
									if((prior!=null)
											&&(priorNode!=null)
											&&(prior.equals(priorNode.getUserObject()))){
										Node parentNode=priorNode.getParent();
										if(parentNode!=null){
										 valueSpecificationNode=createNode(valueSpecification,objectToNodeMap);
										index=parentNode.getIndex(priorNode);
										//QvtCommonAction.log("insrtNodeInfo "+valueSpecificationNode+", "+parentNode+", "+index);
										//System.out.println("insrtNodeInfo "+valueSpecificationNode+", "+parentNode+", "+index);
										treeModel.insertNodeInto(valueSpecificationNode, parentNode, index+1);
										}
									}else{
										int nodeindex=getNodeIndex(slot,parent);
										 valueSpecificationNode=createNode(valueSpecification,objectToNodeMap);
										treeModel.insertNodeInto(valueSpecificationNode, parent, nodeindex);
										
									}
								}else if(valueSpecifications.size()>1){
									ValueSpecification after=valueSpecifications.get(1);
									Node afterNode=getNodeForObject(after,treeNode,objectToNodeMap);
									if(afterNode!=null){
										Node parentNode=afterNode.getParent();
										if(parentNode!=null){
										 valueSpecificationNode=createNode(valueSpecification,objectToNodeMap);
										treeModel.insertNodeInto(valueSpecificationNode, parentNode, 0);
										}
									}else{
										int nodeindex=getNodeIndex(slot,parent);
										 valueSpecificationNode=createNode(valueSpecification,objectToNodeMap);
										treeModel.insertNodeInto(valueSpecificationNode, parent, nodeindex);
									}
									
								}else{
									int nodeindex=getNodeIndex(slot,parent);
									 valueSpecificationNode=createNode(valueSpecification,objectToNodeMap);
									 if(valueSpecificationNode!=null){
									treeModel.insertNodeInto(valueSpecificationNode, parent, nodeindex);
									 }else{
										 QvtCommonAction.log("addValueSpecification failed to create tree node "+valueSpecification);
									 }
									
								}
							}
						}
					}
				
				
				//	QvtCommonAction.log("insrtNodeInfo "+valueSpecificationNode+", "+valueSpecification+", "+parent);
				if(valueSpecificationNode==null)return;
				boolean isReference=false;
				StructuralFeature structuralFeature=slot.getDefiningFeature();
				if(structuralFeature==null)return;
				if(Property.class.isInstance(structuralFeature)){
					if(NIEMHelper.isReferenceProperty((Property)structuralFeature)){
						isReference=true;
					}
				}
				
				if(!isReference)
						if(InstanceValue.class.isInstance(valueSpecification)){
							InstanceValue instanceValue=(InstanceValue)valueSpecification;
							InstanceSpecification instance=instanceValue.getInstance();
							if((instance!=null)&&!EnumerationLiteral.class.isInstance(instance)){
								// add all slots
								// this could be problematic, if the property changed from reference to containment:
								// we could have what is perceived as multiple containments, perhaps recursive
								// so lets first check if we have multiple containers before expanding this
								int containers=0;
								for(InstanceValue ivTest:instance.get_instanceValueOfInstance()){
									Slot owningSlot=ivTest.getOwningSlot();
									if(owningSlot!=null){
										StructuralFeature sfTest=owningSlot.getDefiningFeature();
										if(Property.class.isInstance(sfTest)){
											if(!NIEMHelper.isReferenceProperty((Property)sfTest)){
												containers++;
											}
										}
									}
								}
								if(containers==1){
									for(Slot childslot:instance.getSlot()){
										addSlotNodes(childslot,valueSpecificationNode,objectToNodeMap);
									}
									
									sequenceNodeChildren(valueSpecificationNode);
								}else{
									QvtCommonAction.log("InstanceBrowser: Illegal InstanceSpecification containment at "+instance.getQualifiedName()+", container count="+containers);
								}
							}
						}
	}

	protected int getNodeIndex(Slot slot,Node parent){
		// sequence should match the sequence of properties in inheritance chain;
		// the slot may be replaced later by a ValueSpecification
		// for each property, locate index of matching child
		//  when this slot's property processed, the next index may be used
		StructuralFeature slotFeature=slot.getDefiningFeature();
		List<Node> originalChildNodes=new Vector<Node>(parent.getChildren());
		List<Node> savedChildNodes=new Vector<Node>(originalChildNodes);
		List<Property> orderedProperties=getOrderedProperties(parent);
		// for each orderedProperty, find saved child and add to result
		int result=0;
		for(Property childProperty:orderedProperties){
			List<Node> matchingChildNode=findMatchingChildNode(childProperty,savedChildNodes);
			result+=matchingChildNode.size();
			if(childProperty.equals(slotFeature))break;
		}
		// result should not exceed number of nodes, how does this happen?
		if(result>originalChildNodes.size())result=originalChildNodes.size();
		return result;
	}

	protected void sequenceNodeChildren(Node parent){
//if(true)return;// TODO timing test		
		// sequence should match the sequence of properties in inheritance chain;
		//Object parentObject=parent.getUserObject();
		List<Node> savedChildNodes=new Vector<Node>(parent.getChildren());
		List<Node> orderedChildNodes=new Vector<Node>();
		List<Property> orderedProperties=getOrderedProperties(parent);
		// for each orderedProperty, find saved child and add to result
		for(Property childProperty:orderedProperties){
			List<Node> matchingChildNode=findMatchingChildNode(childProperty,savedChildNodes);
			orderedChildNodes.addAll(matchingChildNode);
		}
		
		parent.removeAllChildren();
		for(Node child:orderedChildNodes){
			parent.add(child);
		}
		if(!savedChildNodes.isEmpty()){
			QvtCommonAction.log("InstanceBrowser: Warning, failed to sequence nodes "+savedChildNodes);
			for(Node child:savedChildNodes){
				parent.add(child);
			}
		}
		
	}
	protected List<Property> getOrderedProperties(Node parent){
		List<Property> result=new Vector<Property>();
		List<Classifier> classifiers=getClassifier(parent);
		for(Classifier classifier:classifiers){
			if(Class.class.isInstance(classifier))InstanceHelper.getOrderedProperties((Class)classifier,result);
			if(DataType.class.isInstance(classifier))InstanceHelper.getOrderedProperties((DataType)classifier,result);
		}
		return result;
	}
	protected List<Classifier> getClassifier(Node parent) {
		// via InstanceSpecification classifier
		List<Classifier> result=new Vector<Classifier>();
		InstanceSpecification instanceSpecification=getInstanceSpecification(parent);
		if(instanceSpecification!=null)return instanceSpecification.getClassifier();
		return result;
	}
	protected InstanceSpecification getInstanceSpecification(Node parent) {
		Object test=parent.getUserObject();
		if(InstanceSpecification.class.isInstance(test))return (InstanceSpecification)test;
		else if(InstanceValue.class.isInstance(test)){
			 return ((InstanceValue)test).getInstance();
			
		}
		return null;
	}
	protected List<Node> findMatchingChildNode(Property referenceProperty,List<Node> originalChildNodes){
		// match property with property of node
		List<Node> matchingNodes=new Vector<Node>();
		List<Node> savedChildNodes=new Vector<Node>(originalChildNodes);
		for(Node child:savedChildNodes){
			StructuralFeature nodeProperty=getNodeProperty(child);
			if(!Property.class.isInstance(nodeProperty))continue;
				Property propertyTest=(Property)nodeProperty;
				if(!NameHelper.isMatchingProperty(propertyTest,referenceProperty)){
					if(!NameHelper.isMatchingSubstitutionGroupProperty(propertyTest,referenceProperty))continue;
				}
			
//			if(childProperty.equals(nodeProperty)){
				matchingNodes.add( child);
				originalChildNodes.remove(child);
//			}
		}
		return matchingNodes;
	}
	protected StructuralFeature getNodeProperty(Node child){
		// property via Slot
		Slot slot=getSlot(child);
		if(slot!=null)return slot.getDefiningFeature();
		return null;
	}
	protected Slot getSlot(Node child){
		Object test=child.getUserObject();
		if(Slot.class.isInstance(test))return (Slot)test;
		else if(ValueSpecification.class.isInstance(test))return ((ValueSpecification)test).getOwningSlot();
		return null;
	}
	public Map<Object,Node> getObjectToNodeMap(){
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache!=null){
			return projectCache.getObjectToNodeMap();
		}
		return new HashMap<Object,Node>();
	}
	protected void initObjectToNodeMap(Node node,Map<Object,Node> objectToNodeMap){
			Object nodeObject=node.getUserObject();
			objectToNodeMap.put(nodeObject, node);
			for(Node child:node.getChildren()){
				initObjectToNodeMap(child,objectToNodeMap);
			}
	}
	public void treeElementChanged(Element nodeElement){
		//System.out.println("treeElementChanged "+nodeElement);
		Map<Object,Node> objectToNodeMap=getObjectToNodeMap();
		if(objectToNodeMap.isEmpty()){
			Node node=getRootNode();
			if(node!=null){			
				initObjectToNodeMap(node,objectToNodeMap);
			}
		}
		TreeManipulatingRunnable treeManipulatingRunnable=new TreeManipulatingRunnable(nodeElement,objectToNodeMap);
        try {
    		if(SwingUtilities.isEventDispatchThread()){
    			treeManipulatingRunnable.run();
    		}else{
			SwingUtilities.invokeAndWait(treeManipulatingRunnable);
    		}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	//////////////////////////////////////////////////////////////////
	/*
	public class InstancePropertyChangeListener implements PropertyChangeListener{
			protected BrowserTabTree tree=null;
			protected Browser browser=null;
			public InstancePropertyChangeListener(BrowserTabTree treeIn,Browser browserIn){
				tree=treeIn;
				browser=browserIn;
			}
			protected Browser getBrowser(){return browser;}
			protected BrowserTabTree getBrowserTabTree(){return tree;}
			protected void redoTree(){
			}
			@Override
			public void propertyChange(PropertyChangeEvent changeEvent) {
				Project project=Application.getInstance().getProject();
				System.out.println("InstancePropertyChangeListener "+changeEvent.getSource()+", "+project);
				if(project==null)return;
				if(project.isClosing()||project.isProjectClosed())return;
				Object source=changeEvent.getSource();
				BrowserTabTree tree=getBrowserTabTree();
				TreeModel treeModel=tree.getTreeModel();
				//QvtCommonAction.log("propertyChange source "+source);
				if((tree!=null)&&Element.class.isInstance(source)){
					Element nodeElement=(Element)source;
					TreeManipulatingRunnable treeManipulatingRunnable=new TreeManipulatingRunnable(nodeElement);
		            try {
		        		if(SwingUtilities.isEventDispatchThread()){
		        			treeManipulatingRunnable.run();
		        		}else{
						SwingUtilities.invokeAndWait(treeManipulatingRunnable);
		        		}
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			
			}
		
	}
	*/
////////////////
	public class TreeManipulatingRunnable implements Runnable{
		protected Element nodeElement=null;
		protected Map<Object,Node> objectToNodeMap=null;
		public TreeManipulatingRunnable(Element nodeElementIn,Map<Object,Node> objectToNodeMapIn){
			nodeElement=nodeElementIn;
			objectToNodeMap=objectToNodeMapIn;
		}
		@Override
		public void run() {
			BrowserTabTree tree=getBrowserTabTree();
			if((tree==null)||(tree.getProject()==null)||tree.getProject().isProjectClosed()){
				//System.out.println("InstanceBrowserInitializer project is closed");
				return;
			}
			
			
			TreeModel treeModel=tree.getTreeModel();
			Node treeNode=null;
			try{
				treeNode=tree.getRootNode();
			}catch(NullPointerException e){
				System.out.println("InstanceBrowserInitializer failed to get root node");
				return;
			}
			Node node=getNodeForObject(nodeElement,treeNode,objectToNodeMap);
			//System.out.println("TreeManipulatingRunnable nodeElement "+nodeElement+", "+node+", "+((node==null)?"null node":node.getUserObject()));
			
//			if(nodeElement instanceof NamedElement)System.out.println("InstanceBrowserInitializer  node "+((NamedElement)nodeElement).getQualifiedName()+", "+node);
			if(node!=null){
				if(nodeElement.getOwner()==null){
					// remove this node
					//System.out.println("TreeManipulatingRunnable removing "+nodeElement);
					removeNodeFromParent(node,objectToNodeMap);
					return;
				}else{
					if(InstanceSpecification.class.isInstance(nodeElement)
							&&(nodeElement.equals(node.getUserObject()))
							){
						// if this is not a top level, remove the node,  since we only show the InstanceValue
						InstanceSpecification instanceSpecification=(InstanceSpecification)nodeElement;
						if(!isTopLevelInstanceSpecification(instanceSpecification)){
							// remove this node
							//System.out.println("TreeManipulatingRunnable removing "+instanceSpecification.getQualifiedName());
							removeNodeFromParent(node,objectToNodeMap);
							return;
						}
					}
				delegateUpdateNodeItself(node); 
				}
			}else{
				// check for addition.......
				if(nodeElement.getOwner()==null)return;
				if(InstanceSpecification.class.isInstance(nodeElement)
						){
					// if this is a top level, then add a new Node to root node;
					InstanceSpecification instanceSpecification=(InstanceSpecification)nodeElement;
					if(isTopLevelInstanceSpecification(instanceSpecification)){
						Node parentNode=treeNode;
						//createChangeNode(instanceSpecification,parentNode,objectToNodeMap);
						// may as well try to expand it now
							Node instanceNode=getInstanceSpecificationNode(instanceSpecification,treeModel,objectToNodeMap);
							
							if(instanceNode!=null){
								treeModel.insertNodeInto(instanceNode, parentNode,0);
							}
						
						
						//Node nodeTes=getNodeForObject(instanceSpecification,treeNode);
						//QvtCommonAction.log("InstanceSpecification node "+instanceSpecification.getQualifiedName()+", "+nodeTes);

					}
				}
				else if(Slot.class.isInstance(nodeElement)
						){
					// may have been added via InstanceValue; add a new Node to the InstanceValue node  
					// may also be slot of InstanceSpecification
					Slot slot=((Slot)nodeElement);
					// but if it has valueSpecifications and they are nodes, then do nothing

					for(ValueSpecification valueSpecification:slot.getValue()){
						Node valueNode=getNodeForObject(valueSpecification,treeNode,objectToNodeMap);
						if(valueNode!=null){
							return;
						}
					}

					InstanceSpecification instanceSpecification=slot.getOwningInstance();
					if(instanceSpecification!=null){
						Node instanceNode=getNodeForObject(instanceSpecification,treeNode,objectToNodeMap);
						if((instanceNode!=null)
								&&(instanceSpecification.equals(instanceNode.getUserObject()))){
							//Node slotNode=
							createChangeNode(slot,instanceNode,objectToNodeMap);
							//int index=getNodeIndex(slot,instanceNode);
							//treeModel.insertNodeInto(slotNode, instanceNode, index);
						}else{
							// check if InstanceValue
							Collection<InstanceValue> instanceValues=instanceSpecification.get_instanceValueOfInstance();
							// must be via containment
							for(InstanceValue instanceValue:instanceValues){
								Node instanceValueNode=getNodeForObject(instanceValue,treeNode,objectToNodeMap);
								if(instanceValueNode!=null){
									Slot owningSlot=instanceValue.getOwningSlot();
									if(owningSlot!=null){
										StructuralFeature structuralFeature=owningSlot.getDefiningFeature();
										if(Property.class.isInstance(structuralFeature)){
											if(!NIEMHelper.isReferenceProperty((Property)structuralFeature)){
												//Node slotNode=
												createChangeNode(slot,instanceValueNode,objectToNodeMap);
												//int index=getNodeIndex(slot,instanceValueNode);
												//treeModel.insertNodeInto(slotNode, instanceValueNode, index);
											}
										}
									}
								}
							}
						}
						
					}
				}
				else if(ValueSpecification.class.isInstance(nodeElement)){
					// may have been previously a slot; change the node to be ValueSpecification
					Slot slotElement=((ValueSpecification)nodeElement).getOwningSlot();
					if(slotElement!=null){
						Node slotNode=getNodeForObject(slotElement,treeNode,objectToNodeMap);
						if((slotNode!=null)&&(slotElement.equals(slotNode.getUserObject()))){
							// remove current slotNode and replace with ValueSpecification Node
							Node parentNode=slotNode.getParent();
//							int index=parentNode.getIndex(slotNode);
							//System.out.println("TreeManipulatingRunnable removing slotNode "+slotNode);
							removeNodeFromParent(slotNode,objectToNodeMap);
							//Node valueSpecificationNode=
							createChangeNode(nodeElement,parentNode,objectToNodeMap);
//							treeModel.insertNodeInto(valueSpecificationNode, parentNode, index);
						}else{
							// find node for prior sibling ValueSpecification and insert after that
							List<ValueSpecification> valueSpecifications=slotElement.getValue();
							if(!valueSpecifications.isEmpty()){
								int index=valueSpecifications.indexOf(nodeElement);
								//System.out.println("valueSpecificaiton "+((ValueSpecification)nodeElement).getQualifiedName()+", "+index+"/"+valueSpecifications.size());
								if(index>=0){
									if(index>0){
										ValueSpecification prior=valueSpecifications.get(index-1);
										Node priorNode=getNodeForObject(prior,treeNode,objectToNodeMap);
										//System.out.println("valueSpecificaiton priorNode "+priorNode);
										if(priorNode!=null){
											Node parentNode=priorNode.getParent();
											//Node valueSpecificationNode=
											createChangeNode(nodeElement,parentNode,objectToNodeMap);
											//index=parentNode.getIndex(priorNode);
											//treeModel.insertNodeInto(valueSpecificationNode, parentNode, index+1);
										}
									}else // the valueSpecification is first in slot 
										if(valueSpecifications.size()>1){
											// there are other valueSpecifications in slot
											ValueSpecification after=valueSpecifications.get(1);
											Node afterNode=getNodeForObject(after,treeNode,objectToNodeMap);
											if(afterNode!=null){
												Node parentNode=afterNode.getParent();
												//Node valueSpecificationNode=
												createChangeNode(nodeElement,parentNode,objectToNodeMap);
												//treeModel.insertNodeInto(valueSpecificationNode, parentNode, 0);
											}
										
										}else{
											// this must be a new valueSpecification in a new slot of an InstanceSpecification
											// track back to find node for containing ValueSpecificaiton of that InstanceSpecification
											InstanceSpecification owningInstance=slotElement.getOwningInstance();
											InstanceValue owningInstanceValue=getOwningInstanceValue(owningInstance);
											if(owningInstanceValue!=null){
												Node parentNode=getNodeForObject(owningInstanceValue,treeNode,objectToNodeMap);
												if(parentNode!=null){
													createChangeNode(nodeElement,parentNode,objectToNodeMap);
												}
												
											}
											
										}
									}
								}
							}
						}
				}else{
				}
			}
		}
		
	}
	protected InstanceValue getOwningInstanceValue(InstanceSpecification instanceSpecification){
		if(instanceSpecification!=null){
			for(InstanceValue instanceValue:instanceSpecification.get_instanceValueOfInstance()){
				Slot parentSlot=instanceValue.getOwningSlot();
				StructuralFeature structuralFeature=parentSlot.getDefiningFeature();
				if(Property.class.isInstance(structuralFeature)){
					Property property=(Property)structuralFeature;
					if(!NIEMHelper.isReferenceProperty(property)){
						return instanceValue;
					}
				}
			}
		}
		return null;
	}
	
////////////////
public class TreeRefreshRunnable implements Runnable{
public TreeRefreshRunnable(){
}
@Override
public void run() {
	BrowserTabTree tree=getBrowserTabTree();
	if((tree.getProject()==null)||tree.getProject().isProjectClosed()){
		return;
	}
	TreeModel treeModel=tree.getTreeModel();
	try{
		Node treeNode=tree.getRootNode();// may cause null ptr exception
		// lets just update the whole tree
		//System.out.println("TreeRefreshRunnable delegateUpdateNodeItself root node "+treeNode);
		for(Node child:treeNode.getChildren()){
			delegateUpdateNodeItself(child);
		}
		
	}catch(NullPointerException e){
		System.out.println("TreeRefreshRunnable failed to get root node");
		return;
	}
	
}

}
///////////////			
	public class InstanceModelElementNode extends ModelElementNode{
		public InstanceModelElementNode(Element element,boolean arg){
			super(element,arg);
		}
		/*
		public boolean updateNodeStructure(){
			setText(constructText());
			Object test=getUserObject();
			QvtCommonAction.log("updateNodeStructure "+test);

			return super.updateNodeStructure();
		}
		public boolean updateNodeItself(){
			setText(constructText());
//			Object test=getUserObject();
			//QvtCommonAction.log("updateNodeItself "+test);

			return super.updateNodeItself();
		}
		public Icon getIcon(){
			Icon defaultIcon=getDefaultIcon();
			Icon icon=super.getIcon();
			QvtCommonAction.log("getIcon "+defaultIcon+", "+icon);
			return icon;
		}
		// no listener here
		public void propertyChange(PropertyChangeEvent event){
			Object source=event.getSource();
			if(Element.class.isInstance(source)){
				Element nodeElement=(Element)source;
				QvtCommonAction.log("propertyChange node "+nodeElement);
			}
			super.propertyChange(event);
		}
		*/
		//protected boolean isDoCheckAnnotations=false;
//		public boolean delegateUpdateNodeItself(boolean isCheckAnnotations){
		public boolean delegateUpdateNodeItself(){
			//isDoCheckAnnotations=isCheckAnnotations;
			boolean result= updateNodeItself();
			for(Node child:getChildren()){
				if(child instanceof InstanceModelElementNode){
					((InstanceModelElementNode)child).delegateUpdateNodeItself();
				}
			}
			
			return result;
		}
		public boolean updateNodeItself(){
//			setText(constructText());
//			doUpdateNode();
			//Object test=getUserObject();
			//QvtCommonAction.log("updateNodeItself "+test);

			boolean result= super.updateNodeItself();
			doUpdateNode();
			return result;
		}
		public Icon getIcon(){
			if(Element.class.isInstance(getUserObject())){
				Element elementObject=(Element)getUserObject();
				List<Annotation> annotations=AnnotationManager.getInstance().getAnnotations(elementObject);
				// after a long delay, we may see annotations
				// but do not know how to adorn the original icon with the annotation?????????
				Icon icon=getNodeIcon(annotations);
				if(icon!=null)return icon;
				if(ValueSpecification.class.isInstance(elementObject)){
					elementObject=((ValueSpecification)elementObject).getOwningSlot();
					annotations=AnnotationManager.getInstance().getAnnotations(elementObject);
					icon=getNodeIcon(annotations);
					if(icon!=null)return icon;
				}
				if(Slot.class.isInstance(elementObject)){
					elementObject=((Slot)elementObject).getOwningInstance();
					annotations=AnnotationManager.getInstance().getAnnotations(elementObject);
					icon=getNodeIcon(annotations);
					if(icon!=null)return icon;
				}
			}
			
			return super.getIcon();
		}
		public Icon getNodeIcon(List<Annotation> annotations){
			if(!annotations.isEmpty()){
				for(Annotation annotation:annotations){
					Icon icon=Annotation.getIcon(annotation);
					//QvtCommonAction.log("getNodeIcon  "+annotation+", "+getUserObject()+", "+icon);
					if(icon!=null){
						return icon;
					}
				}
			}
			return null;
		}

		protected void doUpdateNode(){
			setText(constructText()); // TEST
		}
		protected String getNameText(NamedElement namedElement){
			String name=namedElement.getName();
			if(name==null)name="";
			return name;
		}
		public String constructText(){
			Object test=getUserObject();
			//QvtCommonAction.log("constructText "+test);
			if(InstanceSpecification.class.isInstance(test)){
				return getNameText((InstanceSpecification)test);
			}
			else if(Slot.class.isInstance(test)){
				StructuralFeature structuralFeature=((Slot)test).getDefiningFeature();
				if(structuralFeature!=null){
					return getNameText(structuralFeature);
				}
			}
			else if(ValueSpecification.class.isInstance(test)){
				ValueSpecification valueSpecification=(ValueSpecification)test;
				InstanceSpecification instanceSpecification=null;
				if(InstanceValue.class.isInstance(valueSpecification)){
					instanceSpecification=((InstanceValue)valueSpecification).getInstance();
				}
				Slot owningSlot=valueSpecification.getOwningSlot();
				if(owningSlot!=null){
					StructuralFeature structuralFeature=((Slot)owningSlot).getDefiningFeature();
					if(structuralFeature!=null){
						String featureName= getNameText(structuralFeature);
						boolean isReference=false;
						if(Property.class.isInstance(structuralFeature)){
							if(NIEMHelper.isReferenceProperty((Property)structuralFeature)){
								isReference=true;
							}
							String metadata="";
							for(Dependency dependency:valueSpecification.getClientDependency()){
								if("metadata".equals(dependency.getName())){
									for(NamedElement metadatatest:dependency.getSupplier()){
										if(InstanceSpecification.class.isInstance(metadatatest)){
											metadata="metadata="+metadatatest.getName();
											break;
										}
									}
								}
							}
							if(isReference||(instanceSpecification==null)){
								if((instanceSpecification!=null)&&(!EnumerationLiteral.class.isInstance(instanceSpecification))){
									return featureName+" : (ref="+super.constructText()+
											(metadata.length()>0?" "+metadata:"")
											+")";
								}else{
									return featureName+" : "+super.constructText()
											+(metadata.length()>0?"("+metadata+")":"");
								}
							}else
								if(EnumerationLiteral.class.isInstance(instanceSpecification)){
									return featureName+" : "+super.constructText()
											+(metadata.length()>0?"("+metadata+")":"")
											;
								}
								else {
									if((instanceSpecification.get_instanceValueOfInstance().size()>1)
											||(!instanceSpecification.getSupplierDependency().isEmpty())
											){
										return featureName+" : (id="+super.constructText()+
												(metadata.length()>0?" "+metadata:"")
												+")";
									}else{
										return featureName
												+(metadata.length()>0?"("+metadata+")":"")
												;
									}
							}
						}
					}
				}else{
				}
			}
			return super.constructText();
		}
	};
	
}
