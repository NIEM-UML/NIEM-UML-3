/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.symbol;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMHelper;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.uml.symbols.PresentationElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathDecoratorAdapter;
import com.nomagic.magicdraw.uml.symbols.paths.PathElement;
import com.nomagic.magicdraw.uml.symbols.paths.PathRenderer;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.PrimitiveType;

/**
 * @author Tom
 *
 */
public class GeneralizationDecoratorAdapter extends NIEMDecoratorAdapter {

	/**
	 * @param arg0
	 */
	public GeneralizationDecoratorAdapter(PathRenderer arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	public void update(PresentationElement pe){
		super.update(pe);
		if(pe==null)return;
		Generalization generalization=(Generalization)pe.getElement();
		if(generalization==null)return;
		Classifier general=generalization.getGeneral();
		Classifier specific=generalization.getSpecific();
		//QvtCommonAction.log("GeneralizationDecoratorAdapter.update "+general+", "+specific);
		if((general==null)||(specific==null))return;
		try{
		// additional enhancements: when informationModel
		if(isInformationModel(specific,general)){
			// if unnamed, then it was just created: set a valid name and stereotype
			// use same name logic as validation...............
			if(!isNamed(specific)){
				String generalName=general.getName();
				// remove any existing suffix of general, verify that name is unique, append suffix 
				if(PrimitiveType.class.isInstance(specific)){
					// probably SimpleType if general is XMLPrimitive, enhanced with ValueRestriction
					// otherwise Type, no Stereotype
					if(isInXmlTypeLibrary(general)){
						NIEMHelper.addStereotype(specific, NIEMHelper.getCommonStereotype(ValueRestrictionStereotypeName));
						NameHelper.fixClassifierName(specific, generalName, SIMPLETYPE_SUFFIX);
					}else{
						NameHelper.fixClassifierName(specific, generalName, TYPE_SUFFIX);
					}
				}else if(Enumeration.class.isInstance(specific)){
					// could be CodeSimpleType or CodeType-->probably CodeType, no Stereotype
					NameHelper.fixClassifierName(specific, generalName, CODETYPE_SUFFIX);
				}else if(DataType.class.isInstance(specific)){
					// could be List or Union or SimpleType or Type general, assume this becomes Type, no Stereotype
					NameHelper.fixClassifierName(specific, generalName, TYPE_SUFFIX);
				}else{
					// could be PropertyHolder, Augmentation, Association,  or Type depending upon general
					// propagate stereotype
					if(NIEMHelper.hasStereotype(general, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName))){
						NIEMHelper.addStereotype(specific, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName));
						NameHelper.fixClassifierName(specific, generalName, ASSOCIATION_SUFFIX);
					}
					else if(NIEMHelper.hasStereotype(general, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName))){
						NIEMHelper.addStereotype(specific, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName));
						NameHelper.fixClassifierName(specific, generalName, TYPE_SUFFIX);
					}
					else if(NIEMHelper.isAugmentationType(general)){
						NIEMHelper.addStereotype(specific, NIEMHelper.getCommonStereotype(AugmentationTypeStereotypeName));
						NameHelper.fixClassifierName(specific, generalName, AUGMENTATION_SUFFIX);
					}
					else if(NIEMHelper.hasStereotype(general, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
						NIEMHelper.addStereotype(specific, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName));
						NameHelper.fixClassifierName(specific, generalName, PROPERTYHOLDER_SUFFIX);
					}else{
						NameHelper.fixClassifierName(specific, generalName, TYPE_SUFFIX);
					}
				}
			}
			else if(!isNamed(general)){
				String specificName=specific.getName();
				// remove any existing suffix of general, verify that name is unique, append suffix 
				if(PrimitiveType.class.isInstance(general)){
					// probably SimpleType, enhanced with ValueRestriction
						NIEMHelper.addStereotype(general, NIEMHelper.getCommonStereotype(ValueRestrictionStereotypeName));
						NameHelper.fixClassifierName(general, specificName, SIMPLETYPE_SUFFIX);
				}else if(Enumeration.class.isInstance(general)){
					// could be CodeSimpleType or CodeType-->probably CodeSimpleType, no Stereotype
					NameHelper.fixClassifierName(general, specificName, CODESIMPLETYPE_SUFFIX);
				}else if(DataType.class.isInstance(general)){
					// specific could be SimpleType or Type , assume this becomes SimpleType, ValueRestriction Stereotype
					NIEMHelper.addStereotype(general, NIEMHelper.getCommonStereotype(ValueRestrictionStereotypeName));
					NameHelper.fixClassifierName(general, specificName, SIMPLETYPE_SUFFIX);
				}else{
					// could be PropertyHolder, Augmentation, Association,  or Type depending upon specific
					// propagate stereotype
					if(NIEMHelper.hasStereotype(specific, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName))){
						NIEMHelper.addStereotype(general, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName));
						NameHelper.fixClassifierName(general, specificName, ASSOCIATION_SUFFIX);
					}
					else if(NIEMHelper.hasStereotype(specific, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName))){
						NIEMHelper.addStereotype(general, NIEMHelper.getCommonStereotype(ObjectTypeStereotypeName));
						NameHelper.fixClassifierName(general, specificName, TYPE_SUFFIX);
					}
					else if(NIEMHelper.isAugmentationType(specific)){
						NIEMHelper.addStereotype(general, NIEMHelper.getCommonStereotype(AugmentationTypeStereotypeName));
						NameHelper.fixClassifierName(general, specificName, AUGMENTATION_SUFFIX);
					}
					else if(NIEMHelper.hasStereotype(specific, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))){
						NIEMHelper.addStereotype(general, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName));
						NameHelper.fixClassifierName(general, specificName, PROPERTYHOLDER_SUFFIX);
					}else{
						NameHelper.fixClassifierName(general, specificName, TYPE_SUFFIX);
					}
				}
				
			}
		}
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: GeneralizationDecoratorAdapter.update "+general+", "+specific+" : "+t);
			
		}
	}
	public boolean isConnectable2Obj(PathElement pe,PresentationElement general,PresentationElement specific){
		
		//QvtCommonAction.log("Generalization test1 "+general+", "+specific);
		/* specific/general never set at this stage
		Generalization g=((GeneralizationView)pe).getGeneralization();
		if(g!=null){
			log("Generalization test "+g.getSpecific()+", "+g.getGeneral());
		}
		*/
		
		// for inverse, specific may be null
		Element generalElement=((general==null)?null:general.getElement());
		Element specificElement=((specific==null)?null:specific.getElement());
		if(generalElement instanceof Generalization){
			generalElement=((Generalization)generalElement).getGeneral();
		}
		if(general!=null){
			if(generalElement==null)return false;
			if(!Classifier.class.isInstance(generalElement)){
				setStatusText("General must be a Classifier");
				return false;
			}
			if(!isClassifierAllowed(generalElement))return false;
			if(specificElement==null)return true; 
			if(!isClassifierAllowed(specificElement))return false;
			
		}else{
			if(specificElement==null)return false;
			if(!Classifier.class.isInstance(specificElement)){
				setStatusText("Specific must be a Classifier");
				return false;
			}
			if(!isClassifierAllowed(specificElement))return false;
			if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(UnionStereotypeName))){
				setStatusText("Client can not be a <<Union>>");
				return false;
			}
			/*
			if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ListStereotypeName))){
				setStatusText("Client can not be a <<List>>");
				return false;
			}
			*/
			if(generalElement==null)return true; 
			if(!isClassifierAllowed(generalElement))return false;
		}
		String generalMetaClassName=generalElement.eClass().getName();
		String specificMetaClassName=specificElement.eClass().getName();
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(UnionStereotypeName))){
			setStatusText("Client can not be a <<Union>>");
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ListStereotypeName))
				&&NIEMHelper.isDerivedFromXmlSimpleType((Classifier)generalElement)
				){
			// allow derivation from List types NMTOKENS, etc.
			if(!NIEMHelper.isDerivedFromXmlList((Classifier)generalElement)){
			setStatusText(" <<List>> Client must not be derived from a non-List XML primitive");
			return false;
			}
		}
		// now do NIEM checking
		if(isInformationModel(specificElement,generalElement)){
			if(!generalMetaClassName.equals(specificMetaClassName)){
				// allow specific to be AssociationClass and general to be Class
				if(!(AssociationClass.class.isInstance(specificElement)&&Class.class.isInstance(generalElement))){
				setStatusText("Client and Supplier must be same Meta-Type");
				return false;
				}
			}
			Classifier generalClassifier=(Classifier)generalElement;
			Classifier specificClassifier=(Classifier)specificElement;
			// both specific and general should be InformationModel, 
			//  except general may be primitive library
			if(!isInInformationModel(specificElement)){
				setStatusText("Client must be in an <<InformationModel>>");
				return false;
			}
			if(!isInXmlTypeLibrary(generalElement)&&!isInInformationModel(generalElement)){
				setStatusText("Supplier must be in an <<InformationModel>>");
				return false;
			}
			// if one is AssociationType then other must be too
			if(NIEMHelper.isAssociationType(specificClassifier)
					!=NIEMHelper.isAssociationType(generalClassifier)
					){
				// allow the general of an association type to be an augmentation type
				if(NIEMHelper.isAssociationType(specificClassifier) && NIEMHelper.isAugmentationType(generalClassifier)){
					// allow this combination as implicit representation of augmentation element
				}else{
					setStatusText("<<AssociationType>> can only generalize/specialize other <<AssociationType>>s");
					return false;
				}
			}
			// for a PIM, allow a Class to specialize an augmentationType
			if(
//					NIEMHelper.isAugmentationType(specificClassifier)!=NIEMHelper.isAugmentationType(generalClassifier)
					(NIEMHelper.isAugmentationType(generalClassifier)&&(
							//(Class.class.isInstance(specificClassifier)&&NIEMHelper.isRoleType((Class)specificClassifier))
							NIEMHelper.isPropertyHolder(specificClassifier)
							)
					)		
					||(NIEMHelper.isAugmentationType(specificClassifier)&&!NIEMHelper.isAugmentationType(generalClassifier))
					){
				setStatusText("<<AugmentationType>> can only generalize/specialize other <<AugmentationType>>s");
				return false;
			}
//			if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))
//					!=NIEMHelper.hasStereotype(generalElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))
			if(!NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))
				&&NIEMHelper.hasStereotype(generalElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName))
					){
//				setStatusText("<<PropertyHolder>> can only generalize/specialize other <<PropertyHolder>>s");
				// note that the pim of a schema may not have placed everything in PropertyHolder
				setStatusText("<<PropertyHolder>> can not generalize a non-<<PropertyHolder>>");
				return false;
			}
			// a simpleType can not extend a complexType
			if(!NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName)))
			if(!NIEMHelper.isComplexType(specificClassifier)&&NIEMHelper.isComplexType(generalClassifier)){
				setStatusText("A SimpleType can not extend a Complex Type");
				return false;
			}
		}
		//QvtCommonAction.log("Generalization test1 complete ");
		return true;
	}
	protected boolean isClassifierAllowed(Element specificElement){

		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName))){
			setStatusText("<<MetadataType>> can not be part of a Generalization");
			//QvtCommonAction.log("ERROR: <<MetadataType>> can not be part of a Generalization at "+((NamedElement)specificElement).getQualifiedName());
			return false;
		}

		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName))){
			setStatusText("<<AdapterType>> can not be part of a Generalization");
			//QvtCommonAction.log("ERROR: <<AdapterType>> can not be part of a Generalization at "+((NamedElement)specificElement).getQualifiedName());
			return false;
		}
		if(NIEMHelper.hasStereotype(specificElement, NIEMHelper.getCommonStereotype(ChoiceStereotypeName))){
			setStatusText("<<Choice>> can not be part of a Generalization");
			//QvtCommonAction.log("ERROR: <<Choice>> can not be part of a Generalization at "+((NamedElement)specificElement).getQualifiedName());
			return false;
		}
		return true;
	}
}
