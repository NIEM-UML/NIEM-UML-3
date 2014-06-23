package org.modeldriven.magicdraw.niem.diagram.symbol;

import java.awt.Frame;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMFactory;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.diagram.toolbar.RestrictionRedefinition;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.selection.SubstitutionGroupDecompositionDialogHelper;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.copypaste.CopyPasting;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.ui.dialogs.SelectElementInfo;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlgFactory;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.symbols.DiagramPresentationElement;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ValueSpecification;

public class RestrictionEnumerationDialog  implements NIEM_ProfileConstants,ToolTipConstants{
	 public RestrictionEnumerationDialog(PresentationElement pe,Enumeration browserClassifier){
		try{
			// selection dialog consisting of available restriction properties;
			//  after selection, create restriction properties copied from base
			Map<Element,PresentationElement> element2presentation=new HashMap<Element,PresentationElement>();
			DiagramPresentationElement diagram=null;
			Enumeration clientClassifier=browserClassifier;
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
			Package clientPackage=NIEMHelper.getNearestInformationModel(clientClassifier);
			if((clientPackage==null)||!NIEMHelper.isInformationModel(clientPackage))return;
			
			// pre-populate ordered selection;
			// determine available enumeration literals here instead of accept
			// merge results later, check if already present
			// 
			
			// get the restriction class
			Classifier test=NIEMHelper.getBaseClassifier(clientClassifier);
			if(!(test instanceof Enumeration))return;
			Enumeration restrictionBaseEnumeration=(Enumeration)test;

			Frame dialogParent = MDDialogParentProvider.getProvider().getDialogParent();
			 ElementSelectionDlg dlg = ElementSelectionDlgFactory.create(dialogParent,getTitle(),"niem_uml_profile_common_propertySelectionRestriction");
			 
			 dlg.setSelectionMode(SelectionMode.MULTIPLE_MODE);
			
			 //Element root=NIEMHelper.getModelRoot();
			 
//				final Set<EnumerationLiteral> restrictionBaseEnumerationLiterals=new HashSet<EnumerationLiteral>(restrictionBaseEnumeration.getOwnedLiteral());
			 // we need all here to pick up literals from intervening extensions, plus we may need original restriction
				final Set<EnumerationLiteral> restrictionBaseEnumerationLiterals=new HashSet<EnumerationLiteral>(NIEMHelper.getAllLiterals(restrictionBaseEnumeration));
				
			 
			 SelectElementInfo selectElementInfo=new SelectElementInfo(false,false,restrictionBaseEnumeration,true);
			 TypeFilter visibleElementsFilter=new TypeFilter(){
// must be for same restriction classifier
				@Override
				public boolean accept(BaseElement referenceElement) {
					if(!EnumerationLiteral.class.isInstance(referenceElement))return false;
					//return acceptProperty((Property)referenceElement,subsetClassifierTest,restrictedClassifierTest,referenceClassifierTest);
					return(restrictionBaseEnumerationLiterals.contains(referenceElement));
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
						types.add(EnumerationLiteral.class);
					}
					return types;
				}
				 
			 };
			 TypeFilter selectableElementsFilter=visibleElementsFilter;
			 java.util.Collection<?> creatableTypes=new Vector();
			 java.util.List<EnumerationLiteral> selection=new Vector<EnumerationLiteral>();
			 java.util.List<EnumerationLiteral> originals=new Vector<EnumerationLiteral>();
			 for(EnumerationLiteral restrictionProperty:clientClassifier.getOwnedLiteral()){
					 originals.add(restrictionProperty);
						for(EnumerationLiteral selectedProperty:restrictionBaseEnumerationLiterals){
							if(NameHelper.isMatchingEnumerationLiteral(restrictionProperty, selectedProperty)){
								selection.add(selectedProperty);
								break;
							}
						}
			 }
			 
			 ElementSelectionDlgFactory.initMultiple(dlg,selectElementInfo,visibleElementsFilter,selectableElementsFilter,creatableTypes,selection);

			 SubstitutionGroupDecompositionDialogHelper.INSTANCE.setSelectionDescriptionAndShow(dlg,ADD_RESTRICTION_ENUMERATION_DIALOG_DESCRIPTION_TITLE,ADD_RESTRICTION_ENUMERATION_DIALOG_DESCRIPTION);
			 

			 // Check if the user has clicked "Ok".
			 if (dlg.isOkClicked())
			 {
				// access singleton instance by using getInstance()
				// only one session can be active, so check this.
					Collection<EnumerationLiteral> addedProperties=new Vector<EnumerationLiteral>();
				 boolean isSessionCreated=NIEMHelper.createSession("subset");
				 try{
			     // Get selected elements in multiple selection mode.
			     for(BaseElement baseElement:dlg.getSelectedElements()){
			    	 EnumerationLiteral currentDerivedEnumerationLiteral=getCurrentDerivedEnumerationLiteral((EnumerationLiteral)baseElement,originals);
			    	 if(currentDerivedEnumerationLiteral!=null){
			    		 originals.remove(currentDerivedEnumerationLiteral);
			    		 clientClassifier.getOwnedLiteral().add(currentDerivedEnumerationLiteral);
			    		 continue;
			    	 }
			    	 EnumerationLiteral addedDerivedEnumerationLiteral=addEnumerationLiteralToRestrictionDerivedEnumeration((EnumerationLiteral)baseElement,clientClassifier);
		    		 //System.out.println("added Property "+addedProperty.getQualifiedName());
			    	 
			     }
				 clientClassifier.getOwnedLiteral().removeAll(originals);
				 for(EnumerationLiteral original:originals){
					 if(original.getOwner()==null){
						 clientClassifier.getOwnedLiteral().add(original);
			    		 System.out.println("remove original enumeration literal "+original.getQualifiedName());
						 NIEMHelper.removeElement(original);
					 }
				 }
		     
				 }finally{
					  // apply changes and add command into command history.
					 NIEMHelper.closeSession(isSessionCreated);
				 }
			 }
			}catch(Throwable t){
				t.printStackTrace();
				QvtCommonAction.log("ERROR:During Restriction of Enumeration "+t);
			}
	}
	 protected String getTitle(){
		return("Select Restriction Enumeration Literals");

	 }
		public  EnumerationLiteral addEnumerationLiteralToRestrictionDerivedEnumeration(EnumerationLiteral baseEnumerationLiteral,Enumeration derivedContext){
			// does it already exist?
			EnumerationLiteral existingDerivedEnumerationLiteral=getCurrentDerivedEnumerationLiteral(baseEnumerationLiteral,derivedContext.getOwnedLiteral());
			if(existingDerivedEnumerationLiteral!=null)return existingDerivedEnumerationLiteral;
			EnumerationLiteral newDerivedEnumerationLiteral=NIEMFactory.instance.shallowEnumerationLiteralCopy(baseEnumerationLiteral);
			derivedContext.getOwnedLiteral().add(newDerivedEnumerationLiteral);
			return newDerivedEnumerationLiteral;
		}
	 
	 public EnumerationLiteral getCurrentDerivedEnumerationLiteral(EnumerationLiteral base,List<EnumerationLiteral> deriveds){
		for(EnumerationLiteral derived:deriveds){
			if(NameHelper.isMatchingEnumerationLiteral(derived, base)){
				return derived;
			}
		}
		return null;
	}

	 
}
