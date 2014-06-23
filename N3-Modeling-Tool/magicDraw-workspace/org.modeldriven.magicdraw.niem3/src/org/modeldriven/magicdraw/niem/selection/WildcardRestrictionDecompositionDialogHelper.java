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
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
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
public class WildcardRestrictionDecompositionDialogHelper extends SubstitutionGroupRestrictionDecompositionDialogHelper{
	public static WildcardRestrictionDecompositionDialogHelper INSTANCE=new WildcardRestrictionDecompositionDialogHelper();
	public void wildcardRestrictionDecompositionAction(MDMenuAction category,final Property selectedProperty,String niemGroupName){
		decompositionAction(category,selectedProperty,niemGroupName,"wildcardRestrictionDecomposition","Wildcard Restriction Decomposition",WILDCARD_RESTRICTION_DECOMPOSITION_ACTION_TOOLTIP);
	}
	 
	 protected void resequenceClassifierSubsetProperties(Classifier clientClassifier){
	 }
	 protected Set<Property> getDecompositionSubstitutes(Property clientProperty,Property referenceProperty){
			Set<Property> substitutes=new HashSet<Property>();
			return substitutes;
			
		}
	 protected String getDialogTitle(Property referenceProperty){	 
		 return "Select and Order Properties to be Included in Wildcard Group";
	}
	 
	 protected boolean acceptDecompositionElement(BaseElement referenceElement,Set<Property> substitutes){
			// may as well accept any property for now, if they are in an information model
			if(!(referenceElement instanceof Property)) return false;
			Package referencePackage=NIEMHelper.getNearestInformationModel((Property)referenceElement);
			if(referencePackage==null)return false;
			return true;
}
	 protected boolean isSubstitutable(Property classifierProperty,Set<Property> propertyHolderProperties){
		 // not if non-navigable
		 if(!classifierProperty.isNavigable())return false;
		 // not if a reference model
		 Package informationModel=NIEMHelper.getNearestInformationModel(classifierProperty);
		 if(informationModel==null)return false;
		 if(NIEMHelper.isInformationModelDefaultPurposeReference(informationModel))return false;
		return true;
	}
	 protected String getDialogDescriptionTitle(){	 
		 return WILDCARD_RESTRICTION_DECOMPOSITION_DIALOG_DESCRIPTION_TITLE;
	}
	 protected String getDialogDescription(){	 
		 return WILDCARD_RESTRICTION_DECOMPOSITION_DIALOG_DESCRIPTION;
	}
	 
		protected void addPropertyReferences(Property addedProperty,Property baseElement){
	    	 boolean hasReferences=false;
	    	 // make sure there is a <<References>> to baseElement
				for(Dependency d:addedProperty.getClientDependency()){
					for(NamedElement ne:d.getSupplier()){
						if(NIEMHelper.isReferences(d)&&Property.class.isInstance(ne)){
							hasReferences=true;
						}
					}
				}
				if(!hasReferences){
					NIEMFactory.instance.createReferences(addedProperty, (Property)baseElement);
				}
		}
		 protected String getDialogHelpId(){	 
			 return "niem_uml_modeling_workingwithmodelelements_selectinganelement_restrictionwildcarddecomposition";
		}	 
	 
		
}
