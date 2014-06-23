/**
 * 
 */
package org.modeldriven.magicdraw.niem.selection;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.DrawActionCommon;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.SubsettingRedefinition;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.Psm2PimAction;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.options.HierarchicLayouterOptionsGroup;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
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
import com.nomagic.ui.DescriptionPanel;
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
public class ElementSubtypingDialogHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	public static ElementSubtypingDialogHelper INSTANCE=new ElementSubtypingDialogHelper();
	public  void elementSubtypingConstraintAction(MDMenuAction category,final Property selectedProperty,String niemGroupName){
		elementSubtypingAction(category,selectedProperty,niemGroupName,"elementSubtypingConstraintAction","Element Subtyping Constraint",ELEMENT_SUBTYPING_CONSTRAINT_ACTION_TOOLTIP);
	}
	protected  void elementSubtypingAction(MDMenuAction category,final Property selectedProperty,String niemGroupName,
			String actionID,String actionName,String toolTip){
		MDAction testAction=new DefaultDiagramAction(actionID,actionName,null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available substitutions
				//  after selection, set type of property
				//	propagate type to any referencing properties
				elementSubtypingDialog(selectedProperty);
					
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		testAction.setDescription(toolTip);
		category.addAction(testAction);
		
	}
	 public void elementSubtypingDialog(Property selectedProperty){
		try{
			// selection dialog consisting of available types; these will be some range of types based on reference property type hierarchy,
			//  subsettedProperty, and subsetting Properties
			// populate selection with current value
			//  after selection, create subset properties copied from reference
			DiagramPresentationElement diagram=null;
			Property clientProperty=selectedProperty;
			
			// cycle through supertypes and subtypes to check validity
			
			// determine properties here: for reference Property: get corresponding <<PropertyHolder>> Property and all substitutes
			final Set<Classifier> substitutes=getElementSubtypes( clientProperty);
			if(substitutes==null)return;
			
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,
					 getDialogTitle(clientProperty),
					 getDialogHelpId());

			 dlg.setSelectionMode(SelectionMode.SINGLE_MODE);
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same reference model classifier
				@Override
				public boolean accept(BaseElement referenceElement) {
					return acceptElementSubtype(referenceElement,substitutes);
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
			 ElementSelectionDlgFactory.initSingle(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,clientProperty.getType());
			 SubstitutionGroupDecompositionDialogHelper.setSelectionDescriptionAndShow(dlg,getDialogDescriptionTitle(),getDialogDescription());

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("elementSubtypingConstraint");
				 try{
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 selectedProperty.setType((Type)baseElement);
			    	 // fixup any <<References>>
			    	 for(Property referencingProperty:getAllReferencingProperties(selectedProperty)){
			    		 referencingProperty.setType((Type)baseElement);
			    	 }
			    	 break;
			     }
				 }finally{
					 NIEMHelper.closeSession(isSessionCreated);
				 }
			 }
			}catch(Throwable t){
				t.printStackTrace();
				QvtCommonAction.log("ERROR:During Element Subtyping constraint "+t);
			}
	}
	 protected boolean acceptElementSubtype(BaseElement referenceElement,Set<Classifier> substitutes){
				return substitutes.contains(referenceElement);
	 }
	 
	 protected String getDialogDescriptionTitle(){	 
		 return ELEMENT_SUBTYPING_CONSTRAINT_DIALOG_DESCRIPTION_TITLE;
	}
	 protected String getDialogDescription(){	 
		 return ELEMENT_SUBTYPING_CONSTRAINT_DIALOG_DESCRIPTION;
	}
	 
	 
protected String getDialogTitle(Property referenceProperty){	 
	 return "Select Type constraint for subsetting property "+referenceProperty.getName();
}
protected String getDialogHelpId(){	 
	// TODO
	 return "niem_uml_modeling_workingwithmodelelements_selectinganelement_substitutiongroupdecomposition";
}	 
protected Set<Property> getAllReferencingProperties(Property clientProperty){
	Set<Property> result=new HashSet<Property>();
	for(Dependency dependency:clientProperty.getSupplierDependency()){
			if(NIEMHelper.isReferences(dependency)){
				for(NamedElement client:dependency.getClient()){
					if(Property.class.isInstance(client)){
						result.add((Property)client);
					}
				}
			}
	}
	// gather implicit references
	Package informationModel=NIEMHelper.getNearestInformationModel(clientProperty);
	if(informationModel!=null){
		for(Type type:informationModel.getOwnedType()){
			if(type instanceof Classifier){
				for(Property propertyTest:((Classifier)type).getAttribute()){
					if(propertyTest.equals(clientProperty))continue;
					if(!NIEMHelper.getReferences(propertyTest).isEmpty())continue;
					if(NameHelper.isMatchingProperty(propertyTest, clientProperty)){
						result.add(propertyTest);
					}
				}
			}
		}
	}
	return result;
}
protected Set<Classifier> getElementSubtypes(Property clientProperty){
	Set<Classifier> elementSubtypes=new HashSet<Classifier>();
	Property referenceModelProperty=NIEMHelper.getReferenceProperty(clientProperty);
	if(referenceModelProperty==null)return elementSubtypes;
	Classifier referenceModelType=(Classifier)referenceModelProperty.getType();
	Classifier currentSubsetModelType=(Classifier)clientProperty.getType();
	if((referenceModelType==null)||(currentSubsetModelType==null)){
		// get common types based on substitution groups
		return NIEMHelper.getAllCommonSubtypes(clientProperty);
	}else{
		// check currentSubsetModelType, its bases and derived for applicability (assuming it was ok at some point)
		if(isValidElementSubtype(currentSubsetModelType,referenceModelType,clientProperty))elementSubtypes.add(currentSubsetModelType);
		for(Classifier derived:NIEMHelper.getDerivedClassifiers(currentSubsetModelType)){
			getDerivedElementSubtypes(derived,referenceModelType,clientProperty,elementSubtypes,new HashSet<Classifier>());
		}
		Classifier base=NIEMHelper.getBaseClassifier(currentSubsetModelType);
		if(base!=null){
			getBaseElementSubtypes(base,referenceModelType,clientProperty,elementSubtypes);
		}
	}
	//
	return elementSubtypes;
	
}
protected boolean isValidElementSubtype(Classifier currentSubsetModelType,Classifier referenceModelType,Property clientProperty){
	// ok if does not violate substitutionGroup or referenceModelType
	if(referenceModelType!=null){
		if(currentSubsetModelType==null)return false;
		// need to check if this is a primitive type
		Classifier referenceTest=null;
		if(NIEMHelper.isXMLPrimitiveType((Classifier)currentSubsetModelType))referenceTest=(Classifier)currentSubsetModelType;
		else {
			// find reference type for subset type
			referenceTest=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(currentSubsetModelType);
		}
		// referenceTest may be null if type not in reference model
		if(referenceTest!=null){
			if(!NIEMHelper.isSubTypeOf(referenceTest, referenceModelType))return false;
		}
	}
	// check substitutionGroup constraints
	for(Property subsettingProperty:clientProperty.get_propertyOfSubsettedProperty()){
		Type subsettingPropertyType=subsettingProperty.getType();
		if(currentSubsetModelType==null){
		}else if(subsettingPropertyType==null){
			return false;
		}else if(!NIEMHelper.isSubTypeOf((Classifier)subsettingPropertyType, currentSubsetModelType))return false;
	}
	for(Property subsettingProperty:clientProperty.getSubsettedProperty()){
		Type subsettingPropertyType=subsettingProperty.getType();
		if(currentSubsetModelType==null){
			if(subsettingPropertyType!=null)return false;
		}else if(subsettingPropertyType==null)continue;
		else if(!NIEMHelper.isSubTypeOf(currentSubsetModelType,(Classifier)subsettingPropertyType))return false;
	}
	return true;
}
protected void getDerivedElementSubtypes(Classifier currentSubsetModelType,Classifier referenceModelType,Property clientProperty,Set<Classifier> elementSubtypes,Set<Classifier> didThat){
	if(didThat.contains(currentSubsetModelType))return;
	didThat.add(currentSubsetModelType);
	if(isValidElementSubtype(currentSubsetModelType,referenceModelType,clientProperty)){
		elementSubtypes.add(currentSubsetModelType);
		for(Classifier derived:NIEMHelper.getDerivedClassifiers(currentSubsetModelType)){
			getDerivedElementSubtypes(derived,referenceModelType,clientProperty,elementSubtypes,didThat);
		}
	}
}
protected void getBaseElementSubtypes(Classifier currentSubsetModelType,Classifier referenceModelType,Property clientProperty,Set<Classifier> elementSubtypes){
	if(isValidElementSubtype(currentSubsetModelType,referenceModelType,clientProperty)){
		elementSubtypes.add(currentSubsetModelType);
		Classifier base=NIEMHelper.getBaseClassifier(currentSubsetModelType);
		if(base!=null){
			getBaseElementSubtypes(base,referenceModelType,clientProperty,elementSubtypes);
		}
	}
}
}
