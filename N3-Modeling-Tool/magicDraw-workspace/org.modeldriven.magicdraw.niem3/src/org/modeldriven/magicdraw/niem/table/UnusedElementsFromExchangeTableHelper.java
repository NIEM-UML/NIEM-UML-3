/**
 * 
 */
package org.modeldriven.magicdraw.niem.table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.modeldriven.magicdraw.niem.diagram.context.ToolTipConstants;
import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.generictable.GenericTableManager;
import com.nomagic.magicdraw.actions.MDMenuAction;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Property;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Type;
import com.nomagic.uml2.ext.magicdraw.components.mdbasiccomponents.Component;

/**
 * @author tom
 *
 */
public class UnusedElementsFromExchangeTableHelper implements NIEM_ProfileConstants,ToolTipConstants{
	
	public static void newNIEMUsedByPackageDependenciesTableAction(MDMenuAction category,final PresentationElement requestor,final NamedElement browserPackage,String niemGroupName){
		new GenericTableAction("niemUnusedElementFromExchangeTable","Table of Types/Properties not used by any exchange",null,niemGroupName,
				"UnusedElements",browserPackage,NIEM_UNUSED_ELEMENTS_OF_EXCHANGE_TABLE_DIAGRAM_ACTION_TOOLTIP,category){
					private static final long serialVersionUID = 1L;

			@Override
			protected void initializeTable(Project project,Diagram createdDiagram,
					ProgressStatus progressStatus) {
                //Create table element types: packages, classifiers, properties
                List<Object> tableElementTypes = new ArrayList<Object>();
                addPackageTableTypes(project,tableElementTypes);
                addClassifierTableTypes(project,tableElementTypes);
                addPropertyTableTypes(project,tableElementTypes);
                //Set table element types for shown elements
                GenericTableManager.setTableElementTypes(createdDiagram, tableElementTypes);
                //Add elements to table
                refreshUnusedElementsTable(browserPackage,createdDiagram,progressStatus);
                    //Add columns to table
                List<String> fewColumns = new ArrayList<String>();
                for(String desiredId:desiredUnusedElementIds){
                	fewColumns.add("QPROP:Element:"+desiredId);
                }
                GenericTableManager.addColumnsById(createdDiagram, fewColumns);
                    
			}
			
		};
	}
	static protected String desiredUnusedElementIds[]={
		"name",
		"qualifiedName",
		"owner",
		"niemBaseType",
		"niemDerivedType",
		"type",
		"niemTypedElementOfType",
		"topLevelPropertyUsage",
		"niemSubstitutionGroupAffiliation",
		"niemSubstitutionGroups",
	};
	static protected void refreshUnusedElementsTable(NamedElement informationModel,Diagram createdDiagram,ProgressStatus progressStatus){
		GenericTableManager.getRowElements(createdDiagram).clear();
        //Add elements to table
		// get all exchange models;
		// transitive closure of all information models and their content starting with exchange models
		// during strict transitive closure from exchange model property types, exclude models and components from the composite
    	progressStatus.setDescription("get exchange models");
    	Component mpd=QvtCommonAction.getMpdComponent();
		Set<Package> allModels=NIEMHelper.getAllModelPackageDescriptionInformationModels(mpd);
		Set<Package> exchangeModels=new HashSet<Package>();
		for(Package modelTest:allModels){
			if (NIEMHelper.isInformationModelDefaultPurposeExchange(modelTest)) {
				exchangeModels.add(modelTest);
			}
		}
    	progressStatus.setDescription("get all modeled components");
		Set<NamedElement> allModeledComponents=getAllModeledComponents(allModels);
    	progressStatus.setDescription("get all components navigable from exchange models");
		excludeNavigableComponents(exchangeModels,allModeledComponents);
		for(NamedElement namedElement:allModeledComponents){
			GenericTableManager.addRowElement(createdDiagram, namedElement);
		}
    }
	static protected void excludeNavigableComponents(Set<Package> exchangeModels,Set<NamedElement> allModeledComponents){
		// for each exchange model, for each type, for each property, get property type and navigate further
		for(Package informationModel:exchangeModels){
			allModeledComponents.remove(informationModel);
			for(Type type:informationModel.getOwnedType()){
				//excludeNavigableType(type,allModeledComponents,true);
				allModeledComponents.remove(type);
				if(type instanceof Classifier){
					for(Property property:((Classifier)type).getAttribute()){
						excludeNavigableProperty(property,allModeledComponents,true);
						//allModeledComponents.remove(property);
						//excludeNavigableType(property.getType(),allModeledComponents);
					}
				}
			}
		}
		// for remaining allModeledComponents, 
		// for classifiers: check if supertype or derived type was removed; if so then remove it
		// for properties: check for substitutionGroup and remove if appropriate
		// eleminate derived first, then in second pass eliminate base
		for(NamedElement namedElement:new HashSet<NamedElement>(allModeledComponents)){
			if(namedElement instanceof Property){
				if(isDerivedPropertyRemoved((Property)namedElement,allModeledComponents)){
					excludeNavigableProperty((Property)namedElement,allModeledComponents,true);
				}
			}
			else if(namedElement instanceof Classifier){
				if(isDerivedClassifierRemoved((Classifier)namedElement,allModeledComponents)){
					excludeNavigableType((Classifier)namedElement,allModeledComponents,true);
				}
			}
		}
		
		/*
		// iterate until no changes
		Set<NamedElement> explicitComponentsRemoved=new HashSet<NamedElement>();
		int size=allModeledComponents.size();
		while(true){
			for(NamedElement namedElement:new HashSet<NamedElement>(allModeledComponents)){
				if(namedElement instanceof Property){
					if(isDerivedPropertyRemoved((Property)namedElement,allModeledComponents)){
						excludeNavigableProperty((Property)namedElement,allModeledComponents);
					}
				}
				else if(namedElement instanceof Classifier){
					if(isDerivedClassifierRemoved((Classifier)namedElement,allModeledComponents)){
						excludeNavigableType((Classifier)namedElement,allModeledComponents);
					}
				}
			}
			for(NamedElement namedElement:new HashSet<NamedElement>(allModeledComponents)){
				if(namedElement instanceof Property){
					if(isBasePropertyRemoved((Property)namedElement,allModeledComponents)){
						excludeNavigableProperty((Property)namedElement,allModeledComponents);
					}
				}
				else if(namedElement instanceof Classifier){
					if(isBaseClassifierRemoved((Classifier)namedElement,allModeledComponents)){
						excludeNavigableType((Classifier)namedElement,allModeledComponents);
					}
				}
			}
			int newSize=allModeledComponents.size();
			if(newSize==size)break;
			size=newSize;
		}
		*/
	}
	static protected boolean isDerivedPropertyRemoved(Property property,Set<NamedElement> allModeledComponents){
		for(Property derived:property.get_propertyOfSubsettedProperty()){
			if(!allModeledComponents.contains(derived))return true;
			if(isDerivedPropertyRemoved(derived,allModeledComponents))return true;
		}
		return false;
	}
	static protected boolean isDerivedClassifierRemoved(Classifier property,Set<NamedElement> allModeledComponents){
		for(Classifier derived:NIEMHelper.getDerivedClassifiers(property)){
			if(!allModeledComponents.contains(derived))return true;
			if(isDerivedClassifierRemoved(derived,allModeledComponents))return true;
		}
		return false;
	}
	/*
	static protected boolean isBasePropertyRemoved(Property property,Set<NamedElement> allModeledComponents){
		if(!allModeledComponents.contains(property))return true;
		for(Property derived:property.getSubsettedProperty()){
			if(isBasePropertyRemoved(derived,allModeledComponents))return true;
		}
		return false;
	}
	static protected boolean isBaseClassifierRemoved(Classifier property,Set<NamedElement> allModeledComponents){
		if(!allModeledComponents.contains(property))return true;
		Classifier derived=NIEMHelper.getBaseClassifier(property);
		if(derived!=null){
			if(isBaseClassifierRemoved(derived,allModeledComponents))return true;
		}
		return false;
	}
	*/
	static protected void excludeNavigableType(Type type,Set<NamedElement> allModeledComponents,boolean force){
		if(type==null)return;
		if(!allModeledComponents.contains(type))return;
		if(force){
			allModeledComponents.remove(type);
		}
		allModeledComponents.remove(type.getOwner());
		// for each exchange model, for each type, for each property, get property type and navigate further
		if(type instanceof Classifier){
			Classifier classifier=(Classifier)type;
			for(Property property:classifier.getAttribute()){
				excludeNavigableProperty(property,allModeledComponents,true);
			}
			for(Generalization generalization:classifier.getGeneralization()){
				if(NIEMHelper.isRolePlayedBy(generalization)
						||NIEMHelper.isAugments(generalization)
						||NIEMHelper.isImplicitAugmentationProperty(generalization)
						){
					excludeImplicitProperties(generalization,allModeledComponents);
					excludeNavigableType(generalization.getGeneral(),allModeledComponents,true);
				}
			}
			// forced removal of derived, conditional removal of base
			Classifier base=NIEMHelper.getBaseClassifier(classifier);
			if(base!=null){
				excludeNavigableType(base,allModeledComponents,false);
			}
			if(force){
				for(Classifier derived:NIEMHelper.getDerivedClassifiers(classifier)){
					excludeNavigableType(derived,allModeledComponents,true);
				}
			}
		}
	}
	static protected void excludeNavigableProperty(Property property,Set<NamedElement> allModeledComponents,boolean force){
		if(property==null)return;
		if(!allModeledComponents.contains(property))return;
		if(force){
			allModeledComponents.remove(property);
		}
		Package propertyModel=NIEMHelper.getNearestInformationModel(property);
		if(propertyModel!=null){
			allModeledComponents.remove(propertyModel);
		}
		excludeNavigableType(property.getType(),allModeledComponents,true);
		// if there is a property holder property, then remove that as well as its information model
		Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
		if((propertyHolderProperty!=null)&&!propertyHolderProperty.equals(property)){
			excludeNavigableProperty(propertyHolderProperty,allModeledComponents,true);
		}
		// forced removal of derived, conditional removal of base
		for(Property derived:property.getSubsettedProperty()){
			excludeNavigableProperty(derived,allModeledComponents,false);
		}
		if(force){
			for(Property derived:property.get_propertyOfSubsettedProperty()){
				excludeNavigableProperty(derived,allModeledComponents,true);
			}
		}
	}
	protected static void excludeImplicitProperties(Generalization generalization,Set<NamedElement> allModeledComponents){
		// check if generalizations correspond to instance properties
			if(NIEMHelper.isImplicitAugmentationProperty(generalization)){
				excludeImplicitAugmentationProperty(generalization,allModeledComponents);
			}else	if(NIEMHelper.isRolePlayedBy(generalization)){
					excludeImplicitRoleOfProperty(generalization,allModeledComponents);
			}
	}
	protected static void excludeImplicitAugmentationProperty(Generalization generalization,Set<NamedElement> allModeledComponents){
		// find oPropertyHolder property and exclude
		// use transform naming  and PropertyHolder allocation algorithm
		String name=NIEMHelper.getBaseNiemName(generalization,generalization.getGeneral().getName());
		name=NameHelper.toUpperFirstLetter(name);
		name=NameHelper.toNCName(name);
		Property propertyHolderProperty=NIEMHelper.findPropertyHolderProperty(generalization,name);
		if(propertyHolderProperty!=null){
			excludeNavigableProperty(propertyHolderProperty,allModeledComponents,true);
		}
	}
	protected static void excludeImplicitRoleOfProperty(Generalization generalization,Set<NamedElement> allModeledComponents){
		String name=NIEMHelper.getBaseNiemName(generalization,generalization.getGeneral().getName());
		name=NameHelper.toUpperFirstLetter(name);
		name=NameHelper.toNCName(name);
		name=NIEMHelper.toRoleOfName(name);
		name=NIEMHelper.toReferenceName(name);
		Property propertyHolderProperty=NIEMHelper.findPropertyHolderProperty(generalization,name);
		if(propertyHolderProperty!=null){
			excludeNavigableProperty(propertyHolderProperty,allModeledComponents,true);
		}
	}

	static protected Set<NamedElement> getAllModeledComponents(Set<Package> allModels){
		Set<NamedElement> result=new HashSet<NamedElement>();
		for(Package informationModel:allModels){
			result.add(informationModel);
			for(Type type:informationModel.getOwnedType()){
				if(!NIEMHelper.isPropertyHolder(type)){
					result.add(type);
				}
				if(type instanceof Classifier){
					result.addAll(((Classifier)type).getAttribute());
				}
			}
		}
		return result;
	}
}
