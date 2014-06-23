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
public class SubstitutionGroupDecompositionDialogHelper  implements NIEM_ProfileConstants,ToolTipConstants{
	public static SubstitutionGroupDecompositionDialogHelper INSTANCE=new SubstitutionGroupDecompositionDialogHelper();
	public  void substitutionGroupDecompositionAction(MDMenuAction category,final Property selectedProperty,String niemGroupName){
		decompositionAction(category,selectedProperty,niemGroupName,"substitutionGroupDecomposition","SubstitutionGroup Decomposition",SUBSTITUTION_GROUP_DECOMPOSITION_ACTION_TOOLTIP);
	}
	protected  void decompositionAction(MDMenuAction category,final Property selectedProperty,String niemGroupName,
			String actionID,String actionName,String toolTip){
		MDAction testAction=new DefaultDiagramAction(actionID,actionName,null,niemGroupName){
			@Override
			public void updateState() {
				setEnabled(true);
			}
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e){
				// selection dialog consisting of available substitutions
				//  after selection, replace current properties representing a reference property with multi selection, in sequence
				//	validate that cardinality, unique particle attribution
				decompositionDialog(selectedProperty);
					
			}
		};
		testAction.setSmallIcon(DrawActionCommon.getUmlIcon("abc"));
		testAction.setDescription(toolTip);
		category.addAction(testAction);
		
	}
	 public void decompositionDialog(Property selectedProperty){
		try{
			// selection dialog consisting of available reference models substitutionGroup properties;
			// populate selection with current values
			//  after selection, create subset properties copied from reference
			DiagramPresentationElement diagram=null;
			Property clientProperty=selectedProperty;
			Classifier clientClassifier=clientProperty.getClassifier();
			if(clientClassifier==null)return;
			Classifier referenceClassifier=getDecompositionReferenceClassifier(clientClassifier);
			if(referenceClassifier==null){
				QvtCommonAction.log("ERROR: Did not locate reference model type for subset Property "+selectedProperty.getQualifiedName());
				return;
			}
			Property referenceProperty=getDecompositionReferenceProperty(clientProperty,referenceClassifier);
			if(referenceProperty==null)return;
			Package referencePackage=NIEMHelper.getNearestInformationModel(referenceClassifier);
			Package subsetPackage=NIEMHelper.getNearestInformationModel(clientClassifier);
			if(referencePackage==null)return;
			if(subsetPackage==null)return;
			
			
			// determine properties here: for reference Property: get corresponding <<PropertyHolder>> Property and all substitutes
			final Set<Property> substitutes=getDecompositionSubstitutes( clientProperty, referenceProperty);
			if(substitutes==null)return;
			
			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,
					 getDialogTitle(referenceProperty),
					 getDialogHelpId());

			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			 Element root=NIEMHelper.getModelRoot();
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,root,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same reference model classifier
				@Override
				public boolean accept(BaseElement referenceElement) {
					return acceptDecompositionElement(referenceElement,substitutes);
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
			 java.util.List<Property> originals=new Vector<Property>();
			 for(Property testSelectedProperty:NIEMHelper.getOwnedAttribute(clientClassifier)){
				 if(isSubstitutable(testSelectedProperty,substitutes)){
					 originals.add(testSelectedProperty);
						Property selectedPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(testSelectedProperty);
						if(selectedPropertyHolderProperty!=null){
							selection.add(selectedPropertyHolderProperty);
						}
				 }
			 }
			 //QvtCommonAction.log("Current items "+selection+", "+substitutes);
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);
			 setSelectionDescriptionAndShow(dlg,getDialogDescriptionTitle(),getDialogDescription());

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// only one session can be active, so check this.
				 boolean isSessionCreated=NIEMHelper.createSession("substitutionGroupDecomposition");
				 try{
					 NIEMHelper.getOwnedAttribute(clientClassifier).removeAll(originals);
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 Property currentProperty=getCurrentProperty((Property)baseElement,originals);
			    	 if(currentProperty!=null){
			    		 NIEMHelper.getOwnedAttribute(clientClassifier).add(currentProperty);
			    		 continue;
			    	 }
			    	 //System.out.println("decompositionDialog addProperty "+((Property)baseElement).getQualifiedName()+", "+clientClassifier.getQualifiedName());
			    	 //Property addedProperty=NameHelper.addProperty((Property)baseElement,clientClassifier);
			    	 Property addedProperty=NameHelper.addPropertyToSubsetClassifier((Property)baseElement,clientClassifier,false);
			    	 addPropertyReferences(addedProperty,(Property)baseElement);
			     }
					//ModelElementsManager modelElementsManager=ModelElementsManager.getInstance();

				 for(Property original:originals){
					 if(original.getOwner()==null){
						 NIEMHelper.getOwnedAttribute(clientClassifier).add(original);
						 NIEMHelper.removeElement(original);
					 }
				 }
			     resequenceClassifierSubsetProperties(clientClassifier);
				 }finally{
					 NIEMHelper.closeSession(isSessionCreated);
				 }
			 }
			}catch(Throwable t){
				t.printStackTrace();
				QvtCommonAction.log("ERROR:During Property group decomposition "+t);
			}
	}
	 protected Classifier getDecompositionReferenceClassifier(Classifier clientClassifier){
			return NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(clientClassifier);
	 }
	 protected Property getDecompositionReferenceProperty(Property clientProperty,Classifier referenceClassifier){
			return NIEMHelper.getReferenceProperty(clientProperty);
	 }
	 protected void resequenceClassifierSubsetProperties(Classifier clientClassifier){
		 SubsettingRedefinition.INSTANCE.resequenceClassifierSubsetProperties(clientClassifier);
	 }
	 protected boolean acceptDecompositionElement(BaseElement referenceElement,Set<Property> substitutes){
				return substitutes.contains(referenceElement);
	 }
	 
	 protected String getDialogDescriptionTitle(){	 
		 return SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION_TITLE;
	}
	 protected String getDialogDescription(){	 
		 return SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION;
	}
	 
	 
protected String getDialogTitle(Property referenceProperty){	 
	 return "Select and Order <<PropertyHolder>> Properties to be Included in Group "+referenceProperty.getName();
}
protected String getDialogHelpId(){	 
	 return "niem_uml_modeling_workingwithmodelelements_selectinganelement_substitutiongroupdecomposition";
}	 
protected Set<Property> getDecompositionSubstitutes(Property clientProperty,Property referenceProperty){
	Property clientPropertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(clientProperty);
	if(clientPropertyHolderProperty==null){
		QvtCommonAction.log("ERROR: Did not locate <<PropertyHolder>> Property for subset Property "+clientProperty.getQualifiedName());
		return null;
	}

	Property propertyHolderHead=getPropertyHolderHead(clientPropertyHolderProperty,referenceProperty);
	if(propertyHolderHead==null){
		QvtCommonAction.log("ERROR: Did not locate <<PropertyHolder>> SubstitutionGroup head for subset Property "+clientProperty.getQualifiedName());
		return null;
	}
	Set<Property> substitutes=new HashSet<Property>();
	getAllSubstitutes(propertyHolderHead,substitutes);
	return substitutes;
	
}
		 public Property getCurrentProperty(Property propertyHolderProperty,List<Property> substitutes){
			for(Property substitutable:substitutes){
				if(NameHelper.isMatchingProperty(substitutable, propertyHolderProperty)){
					return substitutable;
				}
			}
			return null;
		}
		
				 protected boolean isSubstitutable(Property classifierProperty,Set<Property> propertyHolderProperties){
					for(Property propertyHolderProperty:propertyHolderProperties){
						if(NameHelper.isMatchingProperty(classifierProperty, propertyHolderProperty)){
							return true;
						}
					}
					return false;
				}
static public void setSelectionDescriptionAndShow(ElementSelectionDlg dlg,String title,String descriptionBase){
	 dlg.getDescriptionPanel().setDescriptionTitle(title);
	 String description=descriptionBase.replace("<html>","")
			 .replace("</html>","")
			 .replace("</ul>","")
			 .replace("</li>","")
			 .replace("</p>","")
			 .replace("<ul>","")
			 .replace("<li>","")
			 .replace("<p>","")
			 .replace("&lt;","<")
			 ;
	 dlg.getDescriptionPanel().setDescriptionText(description);
	 dlg.getDescriptionPanel().setDescriptionTextIcon(QvtCommonAction.getNiemIcon());
	 dlg.getDescriptionPanel().setToolTipText(descriptionBase);
	 /*
	 JPanel panel=dlg.getDescriptionPanel().getTextPanel();
	 for(Component component:panel.getComponents()){
		 QvtCommonAction.log("Component "+component);
		 if(JLabel.class.isInstance(component)){
			 ((JLabel)component).setText(SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION);
		 }
	 }
	 */
	 /*
	 JLabel label=dlg.getDescriptionPanel().getIconLabel();
	 if(label!=null){
		 label.setText(SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION);
	 }
	 */
	 // Display dialog for the user to select elements.
	 dlg.show();
	
}
	 public void getAllSubstitutes(Property property,Set<Property> substitutes){
		substitutes.add(property);
		for(Property substitutable:property.get_propertyOfSubsettedProperty()){
			getAllSubstitutes(substitutable,substitutes);
		}
	}
	
	 protected Property getPropertyHolderHead(Property clientPropertyHolderProperty,Property referenceProperty){
		// find <<PropertyHolder>> Property in subsetProperty's or related namespace corresponding to referenceProperty 
		// we can find <<PropertyHolder>> Property for subsetProperty, climb the subsettedProperty until we find match with referenceProperty
		if(NameHelper.isMatchingProperty(clientPropertyHolderProperty, referenceProperty)){
			return clientPropertyHolderProperty;
		}
		for(Property substitutionGroup:clientPropertyHolderProperty.getSubsettedProperty()){
			Property test=getPropertyHolderHead(substitutionGroup,referenceProperty);
			if(test!=null)return test;
		}
		return null;
	}
	protected void addPropertyReferences(Property addedProperty,Property baseElement){
	}
}
