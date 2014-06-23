/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.toolbar;

import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.jmi.reflect.RefObject;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.modeldriven.magicdraw.niem.listener.ProjectCache;
import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;
import org.modeldriven.magicdraw.niem.qvt.QvtCommonAction;
import org.modeldriven.magicdraw.niem.validate.NameHelper;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.core.options.ProjectOptions;
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager;
import com.nomagic.magicdraw.openapi.uml.ReadOnlyElementException;
import com.nomagic.magicdraw.openapi.uml.SessionManager;
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Dependency;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Realization;
import com.nomagic.uml2.ext.magicdraw.classes.mddependencies.Usage;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.AggregationKindEnum;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Association;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Classifier;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Comment;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DataType;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.DirectedRelationship;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.ElementImport;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Generalization;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceSpecification;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.InstanceValue;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.NamedElement;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace;
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
import com.nomagic.uml2.ext.magicdraw.mdprofiles.ProfileApplication;
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype;

/**
 * @author Tom
 *
 */
public class NIEMHelper implements NIEM_ProfileConstants{
	static public String getDeclaredNIEMName(Element classifier){
		return (String)getStereotypePropertyFirst(classifier,getCommonStereotype(ReferenceNameStereotypeName),NIEMNameTagName);
	}
	static public boolean isInXmlTypeLibrary(Element clientElement){
		Package specificModel=NIEMHelper.getNearestPackage(clientElement);
		return(
				(specificModel!=null)
				&&	NIEMHelper.isXMLPrimitiveTypesLibrary(specificModel)
		);
		
	}
	static public Collection<Classifier> getGeneral(Classifier namedElement){
		Collection<Generalization> generalizations=getGeneralization(namedElement);	
		Collection<Classifier> result=new HashSet<Classifier>();	
   	 for(Generalization generalization:generalizations){
   		 result.add(generalization.getGeneral());
   	 }
   	 return result;
    }
	static public Collection<Generalization> getGeneralization(Classifier namedElement){
		Collection<Generalization> result=new HashSet<Generalization>();	
   	 for(Generalization generalization:namedElement.getGeneralization()){
   		 if(isAugments(generalization)|| isRolePlayedBy(generalization))continue;
   		 result.add(generalization);
   	 }
   	 return result;
    }
	
	static public PrimitiveType getStringType(){
		Package xmlTypeLibrary=getXMLLibrary();
		if(xmlTypeLibrary!=null)
    	for(Type pe:xmlTypeLibrary.getOwnedType()){
    		if("string".equals(pe.getName()))return (PrimitiveType)pe;
    	}
    	return null;
    }
	
	static public boolean createSession(String name){
		boolean isSessionCreated=QvtCommonAction.isLoggingDisabled();
		if(!isSessionCreated){
		  isSessionCreated=SessionManager.getInstance().isSessionCreated();
			if (!isSessionCreated)
			{
			// create new session.
			SessionManager.getInstance().createSession(name);
			}					
		}
			return isSessionCreated;
	}
	static public void closeSession(boolean isSessionCreated){
		if (!isSessionCreated)
		{
			SessionManager.getInstance().closeSession();
		}								 
		
	}
	static public void cancelSession(boolean isSessionCreated){
		if (!isSessionCreated)
		{
			SessionManager.getInstance().cancelSession();
		}								 
	}
	static public boolean isNamed(NamedElement element){
		return (element!=null)&&!"".equals(element.getName());
	}
	static public boolean isDefaultProperty(Property property){
		return !isNamed(property)
				||property.getName().startsWith("unnamed")
//				||VisibilityKindEnum.PRIVATE.equals(property.getVisibility())
				;
	}
	static public Comment addComment(Element ne){
 	    Comment comment = Application.getInstance().getProject().getElementsFactory().createCommentInstance();
    	comment.setBody("A Documented Component");
    	comment.getAnnotatedElement().add(ne);
    	ne.getOwnedComment().add(comment);
    	return comment;
     }
	
	static public PrimitiveType getXMLTypeString(){
		Package xmlLibrary=getXMLLibrary();
		if(xmlLibrary!=null){
			for(Type type:xmlLibrary.getOwnedType()){
				if("string".equals(type.getName().toLowerCase())){
					return (PrimitiveType)type;
				}
			}
		}
		return null;
	}
	static public Package getXMLLibrary(){
		for(Package p:getProject().getModel().getNestedPackage()){
			if(isXMLPrimitiveTypesLibrary(p))return p;
		}
		return null;
	}
	/*
	static public boolean canBeUnionOfSupplier(Element element){
		//if(!element.isEditable())return false;
		//if(NIEMHelper.isElementProxy(element))return false;
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package nearestPackage = null;
		//if (Package.class.isInstance(element))
		//	nearestPackage = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) element;
		//else
//			nearestPackage = NIEMHelper.getNearestInformationModel(element);
			nearestPackage = NIEMHelper.getNearestPackage(element);
		if (nearestPackage != null){
		if(DataType.class.isInstance(element)&&(
//				NIEMHelper.isXMLPrimitiveTypesLibrary(nearestPackage)||
				//(NIEMHelper.isInformationModel(nearestPackage)&&
						(
							NIEMHelper.isDataTypeSimpleType((DataType)element)
							||(Enumeration.class.isInstance(element)&&!NIEMHelper.isEnumerationComplexType((Enumeration)element))
						)
					)
				)){
			return true;
		}
		}
		return false;
	}
	*/
	static public boolean canBeDirectedAggregation(Element element){
		return canBeRoleOf(element);
	}
	static public boolean canBeDirectedAssociation(Element element){
		return canBeRoleOf(element);
	}
	static public boolean canBeAssociationClass(Element element){
		return canBeRoleOf(element);
	}
	static public boolean canBeAssociation(Element element){
		return canBeRoleOf(element);
	}
	static public boolean canBeRoleOf(Element element){
//		return canBeAugmentation(element);
		if(!element.isEditable())return false;
		if(NIEMHelper.isElementProxy(element))return false;
		if(!Class.class.isInstance(element)) return false;
		Class testClass=(Class)element;
		com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package nearestPackage = null;
		if (Package.class.isInstance(element))
			nearestPackage = (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package) element;
		else
			nearestPackage = NIEMHelper.getNearestInformationModel(element);
		if (nearestPackage == null)return false;
		if(!NIEMHelper.isInformationModel(nearestPackage)) return false;
//		if(isAugmentationType(testClass))return false;
//		if(NIEMHelper.hasStereotype(testClass, NIEMHelper.getCommonStereotype(NIEMTypeStereotypeName)))return false;
		if(NIEMHelper.hasStereotype(testClass, NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName)))return false;
//		if(NIEMHelper.hasStereotype(testClass, NIEMHelper.getCommonStereotype(ChoiceStereotypeName)))return false;
		return true;
	}
	static public boolean canBeAugmentation(Element element){
		if(!canBeRoleOf(element))return false;
		Class testClass=(Class)element;
		if(NIEMHelper.hasStereotype(testClass, NIEMHelper.getCommonStereotype(ChoiceStereotypeName)))return false;
		if(isAugmentationType(testClass))return false;
		if(NIEMHelper.hasStereotype(testClass, NIEMHelper.getCommonStereotype(NIEMTypeStereotypeName)))return false;
		return true;
	}
	static public boolean canBeMetadataApplicationSupplier(Element element){
		if(!element.isEditable())return false;
		if(NIEMHelper.isElementProxy(element))return false;
		if(!Classifier.class.isInstance(element)) return false;
		Classifier testClass=(Classifier)element;
		if(!isInInformationModel(testClass))return false;
		if(isPropertyHolder(testClass))return false;
		if(isChoice(testClass))return false;
		if(!NIEMHelper.isComplexType(testClass)){
			return false; 
		}
		return true;
	}
	static public boolean canBeAugmentationApplicationSupplier(Element element){
		if(!element.isEditable())return false;
		if(NIEMHelper.isElementProxy(element))return false;
		if(!Class.class.isInstance(element)) return false;
		Class testClass=(Class)element;
		if(!isInInformationModel(testClass))return false;
		
		if(isPropertyHolder(testClass))return false;
		if(isChoice(testClass))return false;
		return true;
	}
	
	static public boolean canBeUnionOfSupplier(Element element){
		if(!element.isEditable())return false;
		if(NIEMHelper.isElementProxy(element))return false;
		if(!isInInformationModel(element))return false;
		
		if(DataType.class.isInstance(element)&&(
				NIEMHelper.isDataTypeSimpleType((DataType)element)
				||(Enumeration.class.isInstance(element)&&!NIEMHelper.isEnumerationComplexType((Enumeration)element))
				)
				){
		}else{
			return false;
		}
		return true;
	}
	static public boolean canBeRolePlayedBySupplier(Element element){
		if(!element.isEditable())return false;
		if(NIEMHelper.isElementProxy(element))return false;
		if(!isInInformationModel(element))return false;
		
		if(NIEMHelper.isChoice(element)){
			return false;
		}
		if(isPropertyHolder(element)){
			return false;
		}
		
		if(isMetadataType(element)){
			return false;
		}
		if(isAdapterType(element)){
			return false;
		}
		if(isAssociationType(element)){
			return false;
		}
		return true;
	}
	
	static public boolean canBeAugmentsSupplier(Element element){
		if(!element.isEditable())return false;
		if(NIEMHelper.isElementProxy(element))return false;
		if(!isInInformationModel(element))return false;
		
		if(NIEMHelper.isChoice(element)){
			return false;
		}
		if(isPropertyHolder(element)){
			return false;
		}
		return true;
	}
	static public boolean isRelayoutSubsetDiagram(){
		Project project=getProject();
		boolean result=false;
		if(project==null)return result;
		com.nomagic.magicdraw.properties.Property property =
			project.getOptions().getProperty(ProjectOptions.PROJECT_GENERAL_PROPERTIES,RELAYOUT_SUBSET_DIAGRAMS_OPTION);
			if (property != null)
			{
				result = (Boolean)property.getValue();
			}
			return result;
	}
	
	static public boolean isRoleOf(Property classifier){
		if(classifier.getName().startsWith(ROLEOF_PREFIX))return true;
		if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getPimStereotype(RoleOfStereotypeName)))return true;
		return false;
	}
	static public boolean isRoleType(Class classifier){
		for(Property property:classifier.getOwnedAttribute()){
			if(isRoleOf(property))return true;
		}
		return false;
	}
	static public boolean isChoice(Element classifier){
		if(classifier==null)return false;
		return(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(ChoiceStereotypeName)));
	}
	static public boolean isAugmentationType(Classifier classifier){
		if(classifier==null)return false;
		if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(AugmentationTypeStereotypeName)))return true;
		for(Generalization generalization:classifier.getGeneralization()){
			if(isAugments(generalization))return true;
		}
		return false;
	}
	static public boolean isAugments(Generalization generalization){
		return(NIEMHelper.hasStereotype(generalization, NIEMHelper.getPimStereotype(AugmentsStereotypeName)));
	}
	static public boolean isRolePlayedBy(Element generalization){
		return(NIEMHelper.hasStereotype(generalization, NIEMHelper.getPimStereotype(RolePlayedByStereotypeName)));
	}
	static public boolean isAdapterType(Element classifier){
		return(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(AdapterTypeStereotypeName)));
	}
	static public boolean isAssociationType(Element classifier){
		//if(!isInInformationModel(classifier))return false;
		if(com.nomagic.uml2.ext.magicdraw.classes.mdassociationclasses.AssociationClass.class.isInstance(classifier))return true;
		if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(AssociationTypeStereotypeName)))return true;
		return false;
	}
	static public boolean isMetadataType(Element classifier){
		//if(!isInInformationModel(classifier))return false;
		if(NIEMHelper.hasStereotype(classifier, NIEMHelper.getCommonStereotype(MetadataTypeStereotypeName)))return true;
		return false;
	}
	static public boolean isUnionOf(Element element){
		return NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(UnionOfStereotypeName));
	}
	  static public List<Classifier> getUnionOfMembers(Classifier clientClassifier)
	    {
	    	
	    	List<Classifier> result=new Vector<Classifier>();
				for(Dependency dependency:clientClassifier.getClientDependency()){
					if(NIEMHelper.isUnionOf(dependency)
							){
						for(NamedElement supplier:dependency.getSupplier()){
							if(Classifier.class.isInstance(supplier)){
								result.add((Classifier)supplier);
							}
						}
					}
				}
	    	return result;
	    }

	
	static public Icon getUmlIcon(String name){
		//File file=new File(getPropertiesDir()+"mds.small.gif");
		URL location=NIEMHelper.class.getResource("/com/nomagic/magicdraw/icons/icons16/"+name.toLowerCase()+".gif");
		ImageIcon image=new ImageIcon(location) ;
		return image;
	}
	static public boolean isAbstractElement(Property property){
		if(isXSDAny(property))return false;
		return isXSDElement(property)&&(property.getType()==null)
//				&&property.isDerivedUnion()  // still count it as abstract if not an xsd any
				;
	}
	static public boolean isXSDElement(Property property){
		if(isXSDAny(property))return false;
		Stereotype stereotype=getPsmStereotype(XSDPropertyStereotypeName);
		String name=NameHelper.getNIEMName(property);
		if(hasStereotype(property,stereotype)){
			return "element".equals(getXSDPropertyKind(property).getName());
		}else{
			return (
					startsWithUpperCase(name)
					|| (property.getType() instanceof Class)
					);
		}
	}
	static public boolean isXSDAny(Property property){
		if(property==null)return false;
		Stereotype anystereotype=getPsmStereotype(XSDAnyPropertyStereotypeName);
		if(hasStereotype(property,anystereotype)){
			return true;
		}
		if(hasStereotype(property,getPsmStereotype(XSDPropertyStereotypeName)))return false;
		if((property.getType()==null)&&!property.isDerivedUnion())return true;
		return false;
	}
	static public boolean isXSDAttribute(Property property){
		if(isXSDAny(property))return false;
		Type type=property.getType();
		if(isChoice(type))return false;
		Stereotype stereotype=getPsmStereotype(XSDPropertyStereotypeName);
		String name=NameHelper.getNIEMName(property);
		
		if(hasStereotype(property,stereotype)){
			return "attribute".equals(getXSDPropertyKind(property).getName());
		}else{
			return startsWithLowerCase(name)
//					&&(property.getType() instanceof Classifier)
					&&(type instanceof DataType)
					&&(
							isXMLPrimitiveType((Classifier)type)
							|| isUnion(type)
							|| isList(type)
							)
					;
		}
	}
	static public boolean isLegalName(String name){
		return (name!=null)&&(name.length()>0)&&name.matches("[\\w\\-]*");
	}
	static public String toLegalName(String name){
		return name.replaceAll("[^\\w\\-]","");
	}
	static public boolean startsWithLowerCase(String name){
		if(name.length()<1)return false;
		String first=name.substring(0, 1);
		return first.toLowerCase().equals(first);
	}
	static public boolean startsWithUpperCase(String name){
		if(name.length()<1)return false;
		String first=name.substring(0, 1);
		return first.toUpperCase().equals(first);
	}
	static public EnumerationLiteral getXSDPropertyKind(Property element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getPsmStereotype(XSDPropertyStereotypeName),"kind");
	}
	static public Boolean getXSDPropertyNillable(Property element){
		return (Boolean)getStereotypePropertyFirst(element,getPsmStereotype(XSDPropertyStereotypeName),"nillable");
	}
	static public String getXSDPropertyFixed(Property element){
		return (String)getStereotypePropertyFirst(element,getPsmStereotype(XSDPropertyStereotypeName),"fixed");
	}
	static public EnumerationLiteral getXSDAnyPropertyProcessContents(Property element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getPsmStereotype(XSDAnyPropertyStereotypeName),"processContents");
	}
	static public String getXSDAnyPropertyValueNamespace(Property element){
		return (String)getStereotypePropertyFirst(element,getPsmStereotype(XSDAnyPropertyStereotypeName),"valueNamespace");
	}
	static public boolean isComplexType(Classifier element){
		if(hasStereotype(element,getCommonStereotype(ChoiceStereotypeName)))return false;
		if(hasStereotype(element,getCommonStereotype(PropertyHolderStereotypeName)))return false;
		if(Class.class.isInstance(element))return true;
		else if(Enumeration.class.isInstance(element)){
			return isEnumerationComplexType((Enumeration)element);
		}
		else if(DataType.class.isInstance(element)){
			return !isDataTypeSimpleType((DataType)element);
		}
		else return false;
	}
	static public boolean isUnion(Element element){
		return hasStereotype(element,getCommonStereotype(UnionStereotypeName));
	}
	static public boolean isValueRestriction(Element dataType){
		return hasStereotype(dataType,getCommonStereotype(ValueRestrictionStereotypeName));
	}
	static public boolean isXSDRepresentationRestriction(Element dataType){
		return hasStereotype(dataType,getPsmStereotype(XSDRepresentationRestrictionStereotypeName));
	}
	static public boolean isDataTypeSimpleType(DataType dataType){
		if(dataType==null)return false;
//		Classifier base=getBaseExtensionClassifier(dataType);
		Classifier base=getBaseClassifier(dataType);
		String name=dataType.getName();
		if(name==null)return false;
		return
				((
				isValueRestriction(dataType)
				||isXSDRepresentationRestriction(dataType)
				)
				&&(base!=null)
				&&DataType.class.isInstance(base)
				&&(isDataTypeSimpleType((DataType)base))
				)
//		||hasStereotype(dataType,getCommonStereotype(ListStereotypeName))
		||isList(dataType)
		||isUnion(dataType)
		||isXMLPrimitiveTypesLibrary(getNearestPackage(dataType))
		||(Enumeration.class.isInstance(dataType)&&!isEnumerationComplexType((Enumeration)dataType))
		||name.endsWith("Simple")
		||name.endsWith("SimpleType")
		;
	}
	static public boolean isPimSimpleTypeDefinition(PrimitiveType dataType){
		if(dataType==null)return false;
		String name=NameHelper.getNIEMName(dataType);
		/*
		return isValueRestriction(dataType)
				||isXSDRepresentationRestriction(dataType)
		||hasStereotype(dataType,getCommonStereotype(ListStereotypeName))
		||isUnion(dataType)
		||isXMLPrimitiveTypesLibrary(getNearestPackage(dataType))
		||(Enumeration.class.isInstance(dataType)&&!isEnumerationComplexType((Enumeration)dataType))
		||name.endsWith("Simple")
		||name.endsWith("SimpleType");
		*/
		/*
		if(hasStereotype(dataType,getCommonStereotype(ListStereotypeName))
		||isUnion(dataType)
		||isXMLPrimitiveTypesLibrary(getNearestPackage(dataType))
		||(Enumeration.class.isInstance(dataType)&&!isEnumerationComplexType((Enumeration)dataType))
		||name.endsWith("Simple")
		||name.endsWith("SimpleType"))return true;
		if(isValueRestriction(dataType)
				||isXSDRepresentationRestriction(dataType)){
			Classifier baseExtension=getBaseExtensionClassifier(dataType);
			if(PrimitiveType.class.isInstance(baseExtension)){
				return isPimSimpleTypeDefinition((PrimitiveType)baseExtension);
			}
		}
		*/
		if(isXMLPrimitiveTypesLibrary(getNearestPackage(dataType))
				||name.endsWith("Simple")
				||name.endsWith("SimpleType"))return true;
		return false;
	}
	static public boolean isPimSimpleTypeDefinitionBase(PrimitiveType dataType){
//		if(hasStereotype(dataType,getCommonStereotype(ListStereotypeName))
		if(isList(dataType)
			||isUnion(dataType)
			||isXMLPrimitiveTypesLibrary(getNearestPackage(dataType))
			||(Enumeration.class.isInstance(dataType)&&!isEnumerationComplexType((Enumeration)dataType))
			)return true;
		if(isValueRestriction(dataType)
				||isXSDRepresentationRestriction(dataType)){
			Classifier baseExtension=getBaseClassifier(dataType);
			if(PrimitiveType.class.isInstance(baseExtension)){
				return isPimSimpleTypeDefinition((PrimitiveType)baseExtension);
			}
		}
		// also if a restriction, other than proxy restriction, of a isPimSimpleTypeDefinition
		if(!isProxyRestriction(dataType)
				&&isBaseTypeRestriction(dataType)
				){
			Classifier baseExtension=getBaseClassifier(dataType);
			if(PrimitiveType.class.isInstance(baseExtension)){
				return isPimSimpleTypeDefinition((PrimitiveType)baseExtension);
			}
			
		}
		return false;
	}
	static public boolean isEnumerationComplexType(Enumeration enumeration){
		if( enumeration.getOwnedLiteral().isEmpty()&&!(enumeration.getGeneralization().isEmpty()))return true;
		if(enumeration.isLeaf())return true;
		if(isProxyRestriction(enumeration))return true;
		Classifier base=NIEMHelper.getBaseClassifier(enumeration);
		if((base!=null)&&(base instanceof Enumeration)){
			return isEnumerationComplexType((Enumeration)base);
		}
		return false;
	}
	static public boolean isProxyRestriction(Classifier classifier){
     	DirectedRelationship dr=NIEMHelper.getBaseTypeRelation(classifier);
     	if((dr!=null)&&(NIEMHelper.isRestriction(dr))){
     		Realization realization=(Realization)dr;
			if(realization.getMapping()!=null)return true;
		}
		return false;
	}

	static public boolean isSequenceID(Element element){
		return NIEMHelper.hasStereotype(element, NIEMHelper.getPsmStereotype(SequenceIDStereotypeName));
	}

	static public boolean hasStereotype(Element element, Stereotype stereotype){
		//log("hasStereotype "+element+", "+stereotype);
//		return StereotypesHelper.hasStereotype(element,stereotype);
		if(stereotype==null)return false;
		if(element==null)return false;
		return StereotypesHelper.hasStereotypeOrDerived(element,stereotype);
	}
	static public Model getModelRoot(){
		return getProject().getModel();
	}
	static public boolean isProfileApplied(Element element,Profile profile){
		for(Profile profileTest:getAllAppliedProfiles(element)){
			if(profileTest==null)continue;
			if(profileTest.equals(profile))return true;
		}
		return false;
	}
	static public Set<Profile> getAllAppliedProfiles(Element element){
		return StereotypesHelper.getAllAppliedProfiles(getAllNestingPackages(element,new Vector<Package>()));
	}
	static public Collection<Package> getAllNestingPackages(Element element,Collection<Package> nestingPackages){
		if(element==null)return nestingPackages;
		Package basePackage=null;
		if(Package.class.isInstance(element)){
			basePackage=(Package)element;
		}else{
			basePackage=getNearestPackage(element);
		}
		if(basePackage==null)return nestingPackages;
		nestingPackages.add(basePackage);
		Package nestingPackage=basePackage.getNestingPackage();
		getAllNestingPackages(nestingPackage,nestingPackages);
		return nestingPackages;
	}
	static public Collection<Package> getAllNesedPackages(Package basePackage,Collection<Package> nestedPackages){
		if(basePackage==null)return nestedPackages;
		nestedPackages.add(basePackage);
		for(Package nestedPackage:basePackage.getNestedPackage()){
			getAllNesedPackages(nestedPackage,nestedPackages);
		}
		return nestedPackages;
	}
	static public Stereotype getMpdStereotype(String stereotypeName){
		Profile profile=getMpdProfile();
		if(profile==null)return null;
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,profile); 
	}
	static public  Project getProject(){
		return Application.getInstance().getProject();
	}
	static public  Profile getMpdProfile(){
		return getProfile(MpdProfileName); 
	}
	static public  Profile getProfile(String profileName){
		Project project=getProject();
		if(project==null)return null;
		try{
		return StereotypesHelper.getProfile(project,profileName);
		}catch(NullPointerException e){// magicdraw bug on open project?
			return null;
		}
	}
	static public Integer getValueRestrictionFractionDigits(DataType element){
		return (Integer)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),fractionDigitsTagName);
	}
	static public Integer getValueRestrictionLength(DataType element){
		return (Integer)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),lengthTagName);
	}
	static public Integer getValueRestrictionMaxLength(DataType element){
		return (Integer)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),maxLengthTagName);
	}
	static public Integer getValueRestrictionMinLength(DataType element){
		return (Integer)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),minLengthTagName);
	}
	static public Integer getValueRestrictionTotalDigits(DataType element){
		return (Integer)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),totalDigitsTagName);
	}
	static public String getValueRestrictionMaxInclusive(DataType element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),maxInclusiveTagName);
	}
	static public String getValueRestrictionMinExclusive(DataType element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),minExclusiveTagName);
	}
	static public String getValueRestrictionMinInclusive(DataType element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),minInclusiveTagName);
	}
	static public List getValueRestrictionPattern(DataType element){
		return getStereotypePropertyValue(element,getCommonStereotype(ValueRestrictionStereotypeName),patternTagName);
	}
	
	static public String getValueRestrictionMaxExclusive(DataType element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(ValueRestrictionStereotypeName),maxExclusiveTagName);
	}
	static public String getNamespaceTargetNamespace(Package element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName),targetNamespaceTagName);
	}
	static public String getNamespaceDefaultPrefix(Package element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName),defaultPrefixTagName);
	}
	static public Boolean getNamespaceIsConformant(Package element){
		Object result=getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName),isConformantTagName);
		if((result==null)||!Boolean.class.isInstance(result))return false;
		return  (Boolean)result;
	}
	static public void setNamespaceIsConformant(Package informationModel,Boolean isConformant){
		Stereotype stereotype=getPimStereotype(InformationModelStereotypeName);
		setStereotypePropertyValue(informationModel,stereotype,isConformantTagName,isConformant);
	}
	static public void setNamespaceTargetNamespace(Package informationModel,String namespace){
		Stereotype stereotype=getPimStereotype(InformationModelStereotypeName);
		setStereotypePropertyValue(informationModel,stereotype,targetNamespaceTagName,namespace);
	}
	static public String getNamespaceVersion(Package element){
		return (String)getStereotypePropertyFirst(element,getCommonStereotype(NamespaceStereotypeName),versionTagName);
	}
	static public String getMpdBaseURI(Component element){
		return (String)getStereotypePropertyFirst(element,getMpdStereotype(ModelPackageDescriptionStereotypeName),mpdBaseURITagName);
	}
	static public String getMpdVersionID(Component element){
		return (String)getStereotypePropertyFirst(element,getMpdStereotype(ModelPackageDescriptionStereotypeName),mpdVersionIDTagName);
	}
	
	static public String getMpdURI(Component element){
		return getMpdBaseURI(element)+getMpdVersionID(element)+"/";
	}
	static public void setNamespaceVersion(Package informationModel,String version){
		Stereotype stereotype=getPimStereotype(InformationModelStereotypeName);
		setStereotypePropertyValue(informationModel,stereotype,versionTagName,version);
	}
	static public EnumerationLiteral getInformationModelDefaultPurpose(Package element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getPimStereotype(InformationModelStereotypeName),"defaultPurpose");
	}
	static public EnumerationLiteral getXSDRepresentationRestrictionWhiteSpace(DataType element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getPsmStereotype(XSDRepresentationRestrictionStereotypeName),"whiteSpace");
	}
	static public EnumerationLiteral getMpdClassCode(Component element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getMpdStereotype(ModelPackageDescriptionStereotypeName),"mpdClassCode");
	}
	static public EnumerationLiteral getMpdRelationshipCode(Dependency element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getMpdStereotype(ModelPackageDescriptionRelationshipStereotypeName),"relationshipCode");
	}
	
	static public boolean isInInformationModel(Element clientElement){
		Package specificModel=NIEMHelper.getNearestInformationModel(clientElement);
		return(
				(specificModel!=null)
				&&	NIEMHelper.isInformationModel(specificModel)
		);
		
	}
	static public boolean isInConformantModel(Element clientElement){
		Package specificModel=NIEMHelper.getNearestInformationModel(clientElement);
		return(
				(specificModel!=null)
				&&	NIEMHelper.getNamespaceIsConformant(specificModel)
		);
		
	}
	static public boolean isList(Element element){
		return hasStereotype(element,getCommonStereotype(ListStereotypeName));
	}
	
	static public boolean isInformationModel(Package element){
		return NIEMHelper.hasStereotype(element,NIEMHelper.getPimStereotype(InformationModelStereotypeName));
	}
	static public boolean isNamespacePackage(Element element){
		return NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(NamespaceStereotypeName));
	}

	static public boolean isReferences(Element element){
		return NIEMHelper.hasStereotype(element,getReferencesStereotype());
	}
	
	static public Stereotype getReferencesStereotype(){
		return NIEMHelper.getCommonStereotype(ReferencesStereotypeName);
	}

	static public boolean isReferenceProperty(Property property){
   	 return AggregationKindEnum.NONE.equals(property.getAggregation());

	}
	static public Classifier getReferenceModelClassifierForSubsetModelClassifier(Classifier subsetClassifier){
		return getReferencesReferenceModelClassifier(subsetClassifier);
		/*
		Package subsetPackage=NIEMHelper.getNearestInformationModel(subsetClassifier);
		if((subsetPackage==null)||!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetPackage)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetPackage)				
				))return null;
		// get the explicitly referenced model
		Package referenceModel=null;
		for(Dependency test:subsetPackage.getClientDependency()){
			if(NIEMHelper.isReferences(test)){
				for(NamedElement supplier:test.getSupplier()){
//					if(Package.class.isInstance(supplier)){
					if(Package.class.isInstance(supplier)
							//&&NIEMHelper.isInformationModelDefaultPurposeReference((Package)supplier)
							&&isInformationModelSubsettable((Package)supplier)

							){
						referenceModel=(Package)supplier;
					}
				}
			}
		}
		if(referenceModel==null){
			// expect the subset package to explicitly <<Refereces>> to reference package;
			// could possibly bubble up lower-level references? - probably prone to errors, so abandon hunt for now
			return null;
		}
		// determine reference model classifier
		Classifier referenceClassifier=null;
		referenceClassifier=NameHelper.getMatchingType(subsetClassifier,referenceModel);
		return referenceClassifier;
		*/
	}
	static public Set<NamedElement> getReferences(NamedElement namedElement){
		Set<NamedElement> result=new HashSet<NamedElement>();
		for(Dependency test:namedElement.getClientDependency()){
			if(isReferences(test)){
				for(NamedElement supplier:test.getSupplier()){
					result.add(supplier);
				}
			}
		}
		return result;
	}
	static public Classifier getReferencesReferenceModelClassifier(Classifier subsetClassifier){
		if(subsetClassifier==null)return null;
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return null;
		Map<Classifier,Classifier> subsetToReferenceMap=projectCache.getSubsetToReferenceMap();
		Classifier result=subsetToReferenceMap.get(subsetClassifier);
		if(result!=null)return result;
		if(subsetToReferenceMap.containsKey(subsetClassifier))return null;
		subsetToReferenceMap.put(subsetClassifier, null);
		Package subsetPackage=NIEMHelper.getNearestInformationModel(subsetClassifier);
		if((subsetPackage==null)||!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetPackage)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting(subsetPackage)				
				))return null;
//		for(Dependency test:subsetClassifier.getClientDependency()){
//			if(isReferences(test)){
//				for(NamedElement supplier:test.getSupplier()){
				for(NamedElement supplier:getReferences(subsetClassifier)){
					if(Classifier.class.isInstance(supplier)){
				    	Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
				    	if(informationModel==null)continue;
						//if(!NIEMHelper.isInformationModelDefaultPurposeReference(informationModel))continue;
				    	subsetToReferenceMap.put(subsetClassifier, (Classifier)supplier);
						return (Classifier)supplier;
					}
				}
//			}
//		}
		// if fall through, no direct <<References>>
 				// get via the reference model
//     	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetClassifier);
//			if(subsetInformationModel==null)return null;

		Package referenceInformationModel=NIEMHelper.getReferencesReferenceModelInformationModel(subsetPackage);
		if(referenceInformationModel==null)return null;
		// find matching classifier
		Classifier referenceClassifier=NameHelper.getMatchingType(subsetClassifier, referenceInformationModel);
		subsetToReferenceMap.put(subsetClassifier, referenceClassifier);
		return referenceClassifier;
	}
	static public EnumerationLiteral getReferencesEnumerationLiteralForSubsetEnumerationLiteral(EnumerationLiteral subsetEnumerationLiteral){
		EnumerationLiteral result=null;
		if(subsetEnumerationLiteral==null)return result;
		Element test=subsetEnumerationLiteral.getOwner();
		if(!(test instanceof Enumeration))return result;
		Enumeration subsetEnumeration=(Enumeration)test;
		Classifier test2=getReferenceModelClassifierForSubsetModelClassifier(subsetEnumeration);
		if(test2==null)return result;
		if(!(test2 instanceof Enumeration))return result;
		Enumeration referenceEnumeration=(Enumeration)test2;
		for(EnumerationLiteral referenceLiteral:referenceEnumeration.getOwnedLiteral()){
			if(NameHelper.isMatchingEnumerationLiteral(subsetEnumerationLiteral, referenceLiteral))return referenceLiteral;
		}
		return result;
	}
	static public Set<Classifier> getReferencedByReferenceModelClassifier(Classifier subsetClassifier){
		Set<Classifier> result=new HashSet<Classifier>();
		if(subsetClassifier==null)return result;
		//ProjectCache projectCache=ProjectCache.getProjectCache();
		//if(projectCache==null)return null;
		//Map<Classifier,Classifier> subsetToReferenceMap=projectCache.getSubsetToReferenceMap();
		//Classifier result=subsetToReferenceMap.get(subsetClassifier);
		//if(result!=null)return result;
		//if(subsetToReferenceMap.containsKey(subsetClassifier))return null;
		//subsetToReferenceMap.put(subsetClassifier, null);
		Package subsetPackage=NIEMHelper.getNearestInformationModel(subsetClassifier);
		if((subsetPackage==null)||!(
				NIEMHelper.isInformationModelDefaultPurposeSubset(subsetPackage)
				||isInformationModelDefaultPurposeReference(subsetPackage)
				||isInformationModelDefaultPurposeExtension(subsetPackage)
				))return result;
		for(Dependency test:subsetClassifier.getSupplierDependency()){
			if(isReferences(test)){
				for(NamedElement supplier:test.getClient()){
//				for(NamedElement supplier:getReferences(subsetClassifier)){
					if(Classifier.class.isInstance(supplier)){
				    	Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
				    	if(informationModel==null)continue;
//				    	subsetToReferenceMap.put(subsetClassifier, (Classifier)supplier);
						result.add((Classifier)supplier);
					}
				}
			}
		}
		// if fall through, no direct <<References>>
 				// get via the reference model

		for(Package referenceInformationModel:NIEMHelper.getReferencedBySubsetModelInformationModel(subsetPackage)){
		//if(referenceInformationModel==null)return null;
		// find matching classifier
		Classifier referenceClassifier=NameHelper.getMatchingType(subsetClassifier, referenceInformationModel);
		if(referenceClassifier==null)continue;
		result.add(referenceClassifier);
		//subsetToReferenceMap.put(subsetClassifier, referenceClassifier);
		}
		return result;
	}
	static public Property getReferencesReferenceModelProperty(Property subsetProperty){
    	Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
    	if(subsetInformationModel==null)return null;
    	String subsetNamespace=NIEMHelper.getNamespaceTargetNamespace(subsetInformationModel);
    	if(subsetNamespace==null)return null;
		boolean subsetIsPropertyHolder=NIEMHelper.isPropertyHolder(subsetProperty.getClassifier());
//		for(Dependency test:subsetProperty.getClientDependency()){
//			if(isReferences(test)){
//				for(NamedElement supplier:test.getSupplier()){
				for(NamedElement supplier:getReferences(subsetProperty)){
					if(Property.class.isInstance(supplier)){
				    	Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
				    	if(informationModel==null)continue;
				    	if(informationModel.equals(subsetInformationModel))continue;
				    	String referenceNamespace=NIEMHelper.getNamespaceTargetNamespace(informationModel);
				    	if(!subsetNamespace.equals(referenceNamespace))continue;
				    	// "reference" could be any purpose, but the namespaces should be same and informationModel should be different
						//if(!NIEMHelper.isInformationModelDefaultPurposeReference(informationModel))continue;
						// neither subset nor reference should be in PropertyHolder, or both should be
						boolean referenceIsPropertyHolder=NIEMHelper.isPropertyHolder(((Property)supplier).getClassifier());
						if(referenceIsPropertyHolder!=subsetIsPropertyHolder)continue;
						return (Property)supplier;
					}
				}
//			}
//		}
		return null;
	}
	static public Set<Property> getReferencedByReferenceModelProperty(Property subsetProperty){
		Set<Property> result=new HashSet<Property>();
		boolean subsetIsPropertyHolder=NIEMHelper.isPropertyHolder(subsetProperty.getClassifier());
		for(Dependency test:subsetProperty.getSupplierDependency()){
			if(isReferences(test)){
				for(NamedElement supplier:test.getClient()){
//				for(NamedElement supplier:getReferences(subsetProperty)){
					if(Property.class.isInstance(supplier)){
						Property referenceProperty=(Property)supplier;
				    	Package informationModel=NIEMHelper.getNearestInformationModel(supplier);
				    	if(informationModel==null)continue;
						//if(!NIEMHelper.isInformationModelDefaultPurposeReference(informationModel))continue;
						// neither subset nor reference should be in PropertyHolder, or both should be
						boolean referenceIsPropertyHolder=NIEMHelper.isPropertyHolder(((Property)supplier).getClassifier());
						if(referenceIsPropertyHolder!=subsetIsPropertyHolder)continue;
			 	 		if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
			 	 			if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
			 	 				continue;
			 	 			}
			 	 		}
						
						result.add( referenceProperty);
					}
				}
			}
		}
		return result;
	}
	
	static public boolean isRestriction(Element element){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(RestrictionStereotypeName));
	}
	static public Collection<Class> getAllPropertyHolders(Package informationModel){
		Collection<Class> result=new Vector<Class>();
		for(Type test:informationModel.getOwnedType()){
			if(isPropertyHolder(test))result.add((Class)test);
		}
		return result;
	}
	static public boolean isPropertyHolder(Element element){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,NIEMHelper.getCommonStereotype(PropertyHolderStereotypeName));
	}
	
	static public boolean isModelPackageDescriptionRelationship(Element element){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,NIEMHelper.getMpdStereotype(ModelPackageDescriptionRelationshipStereotypeName));
	}
	static public boolean isModelPackageDescriptionFile(Element element){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,getModelPackageDescriptionFileStereotype());
	}
	static public boolean isModelPackageDescriptionFileSet(Element element){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,NIEMHelper.getMpdStereotype(ModelPackageDescriptionFileSetStereotypeName));
	}
	static public boolean isModelPackageDescription(Element element){
		if(element==null)return false;
		return NIEMHelper.hasStereotype(element,NIEMHelper.getMpdStereotype(ModelPackageDescriptionStereotypeName));
	}
	static public Set<Dependency> getModelPackageDescriptionRelationships(Component element){
		Set<Dependency> result=new HashSet<Dependency>();
		for(Dependency dependency:element.getClientDependency()){
			if(isModelPackageDescriptionRelationship(dependency))result.add(dependency);
		}
		return result;
	}
	static public Set<Usage> getModelPackageDescriptionFiles(Component element){
		Set<Usage> result=new HashSet<Usage>();
		for(Dependency dependency:element.getClientDependency()){
			if(isModelPackageDescriptionFile(dependency))result.add((Usage)dependency);
		}
		return result;
	}
	static public Usage createModelPackageDescriptionFile(Component mpd,NamedElement file,String nature,String purpose,String description) {
		Usage mpdFile = Application.getInstance().getProject().getElementsFactory().createUsageInstance();
		// apply stereotype, set tags, set default name, etc.
		Stereotype stereotype=getModelPackageDescriptionFileStereotype();
		NIEMHelper.addStereotype(mpdFile,stereotype);
		Profile mpdProfile=getMpdProfile();
		Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
		Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
		EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,purpose);
		EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,nature);
		NIEMHelper.setStereotypePropertyValue(mpdFile,stereotype,natureCodeTagName,defaultNature);
		NIEMHelper.setStereotypePropertyValue(mpdFile,stereotype,purposeCodeTagName,defaultPurpose);
		NIEMHelper.setStereotypePropertyValue(mpdFile,stereotype,relativePathNameTagName,"");
		NIEMHelper.setStereotypePropertyValue(mpdFile,stereotype,descriptionTextTagName,description);
		mpd.getPackagedElement().add(mpdFile);
		mpdFile.getClient().add(mpd);
		mpdFile.getSupplier().add(file);
		return mpdFile;
	}
	
	static public Set<Package> getModelPackageDescriptionInformationModels(Component element){
		Set<Package> result=new HashSet<Package>();
		for(ElementImport elementImport:element.getElementImport()){
			PackageableElement test=elementImport.getImportedElement();
			if(!Package.class.isInstance(test))continue;
			if(isInformationModel((Package)test))result.add((Package)test);
		}
		for(Dependency dependency:getModelPackageDescriptionFiles(element)){
			for(NamedElement test:dependency.getSupplier()){
				if(!Package.class.isInstance(test))continue;
				if(isInformationModel((Package)test))result.add((Package)test);
				
			}
		}
		return result;
	}
	static public Set<Package> getModelPackageDescriptionXmlInstances(Component element){
		Set<Package> result=new HashSet<Package>();
		Profile mpdProfile=NIEMHelper.getMpdProfile();
		Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
		Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
		EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,sample_instanceLiteralName);
		EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xmlLiteralName);
		//Stereotype stereotype=NIEMHelper.getMpdStereotype(ModelPackageDescriptionFileStereotypeName);
		for(Dependency dependency:element.getClientDependency()){
			if(!isModelPackageDescriptionFile(dependency))continue;
			if(defaultPurpose.equals(getMpdFilePurpose(dependency))
					&&defaultNature.equals(getMpdFileNature(dependency))){
				for(NamedElement test:dependency.getSupplier()){
					if(!Package.class.isInstance(test))continue;
					result.add((Package)test);
				}
				
			}
		}
		return result;
	}
	static public String getMpdFileRelativePathName(Dependency element){
		return (String)getStereotypePropertyFirst(element,getModelPackageDescriptionFileStereotype(),relativePathNameTagName);
	}

	static public EnumerationLiteral getMpdFileNature(Dependency element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getModelPackageDescriptionFileStereotype(),natureCodeTagName);
	}
	static public EnumerationLiteral getMpdFilePurpose(Dependency element){
		return (EnumerationLiteral)getStereotypePropertyFirst(element,getModelPackageDescriptionFileStereotype(),purposeCodeTagName);
	}
	static public Stereotype getModelPackageDescriptionFileStereotype(){
		return getMpdStereotype(ModelPackageDescriptionFileStereotypeName);
	}

	static public boolean isMpdRelationshipCodeUpdates(Dependency element){
		EnumerationLiteral defaultPurpose=getMpdRelationshipCode(element);
		return (defaultPurpose!=null)&& updatesLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isMpdRelationshipCodeConformsTo(Dependency element){
		EnumerationLiteral defaultPurpose=getMpdRelationshipCode(element);
		return (defaultPurpose!=null)&& conformsToLiteralName.equals(defaultPurpose.getName());
	}
	
	static public boolean isMpdClassCodeEIEM(Component element){
		EnumerationLiteral defaultPurpose=getMpdClassCode(element);
		return (defaultPurpose!=null)&& eiemLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isMpdClassCodeIEPD(Component element){
		EnumerationLiteral defaultPurpose=getMpdClassCode(element);
		return (defaultPurpose!=null)&& iepdLiteralName.equals(defaultPurpose.getName());
	}
	
	static public boolean isMpdClassCodeDU(Component element){
		EnumerationLiteral defaultPurpose=getMpdClassCode(element);
		return (defaultPurpose!=null)&& domain_updateLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isInformationModelDefaultPurposeExtensionOrReference(Package element){
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& (
				extensionLiteralName.equals(defaultPurpose.getName())
				||exchangeLiteralName.equals(defaultPurpose.getName())
				||referenceLiteralName.equals(defaultPurpose.getName())
		);
	}
	static public boolean isInformationModelDefaultPurposeConstraint(Package element){
		if(element==null)return false;
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& constraintLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isInformationModelDefaultPurposeExchange(Package element){
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& exchangeLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isInformationModelDefaultPurposeExtension(Package element){
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& extensionLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isInformationModelDefaultPurposeReference(Package element){
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& referenceLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isInformationModelDefaultPurposeSubset(Package element){
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& subsetLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isInformationModelReferencable(Package informationModel){
		if(isInformationModel(informationModel)){
			if(isInformationModelDefaultPurposeReference(informationModel)
					||isInformationModelDefaultPurposeSubset(informationModel)
					||isInformationModelDefaultPurposeExtension(informationModel)
					)
				return true;
		}
		return false;
	}
	static public boolean isInformationModelConstrainable(Package informationModel){
		if((informationModel.isEditable())&&isInformationModelReferencable(informationModel)){
				return true;
		}
		return false;
	}
	static public boolean isInformationModelSubsettable(Package informationModel){
		if((!informationModel.isEditable())&&isInformationModelReferencable(informationModel)){
				return true;
		}
		return false;
	}
	static public boolean isInformationModelDefaultPurposeSubsetting(Package element){
		return getInformationModelSubsetted(element)!=null;
	}
	static public boolean isSubsettingModel(Element element){
		return Package.class.isInstance(element)&&(
				NIEMHelper.isInformationModelDefaultPurposeSubset((Package)element)
				||NIEMHelper.isInformationModelDefaultPurposeSubsetting((Package)element)				
				)
				&&(NIEMHelper.getReferencesReferenceModelInformationModel((Package)element)!=null)
				;
		
	}
	static public Package getInformationModelSubsetted(Package element){
		boolean isConstraint=isInformationModelDefaultPurposeConstraint(element);
		if( isInformationModelDefaultPurposeExtension(element)
				||isInformationModelDefaultPurposeSubset(element)
				||isInformationModelDefaultPurposeReference(element)
				||isConstraint
				){
//			for(Dependency dependency:element.getClientDependency()){
//				if(isReferences(dependency)){
//				if(Realization.class.isInstance(dependency)){
//					for(NamedElement supplier:dependency.getSupplier()){
					for(NamedElement supplier:getReferences(element)){
						if(Package.class.isInstance(supplier)){
							Package subsettedModel=(Package)supplier;
							if(isConstraint){
								if(isInformationModelConstrainable(subsettedModel))return subsettedModel;
								
							}else{
							if(isInformationModelSubsettable(subsettedModel))return subsettedModel;
							}
							
						}
					}
				}
//			}
//		}
		return null;
	}
	static public Set<Package> getInformationModelSubsetting(Package element){
		Set<Package> result=new HashSet<Package>();
		if( isInformationModelDefaultPurposeExtension(element)
				||isInformationModelDefaultPurposeSubset(element)
				||isInformationModelDefaultPurposeReference(element)
				){
			for(Dependency dependency:element.getSupplierDependency()){
				if(isReferences(dependency)){
					for(NamedElement supplier:dependency.getClient()){
//					for(NamedElement supplier:getReferences(element)){
						if(Package.class.isInstance(supplier)){
							Package subsettedModel=(Package)supplier;
							result.add( subsettedModel);
							
						}
					}
				}
			}
		}
		return result;
	}
	static public Package getReferencesReferenceModelInformationModel(Package subsetInformationModel){
		return getInformationModelSubsetted(subsetInformationModel);
		/*
		for(Dependency test:subsetInformationModel.getClientDependency()){
			if(isReferences(test)){
				for(NamedElement supplier:test.getSupplier()){
					if(Package.class.isInstance(supplier)){
				    	Package referenceInformationModel=(Package)supplier;
						//if(!NIEMHelper.isInformationModelDefaultPurposeReference(referenceInformationModel))continue;
						if(!isInformationModelSubsettable((Package)supplier))continue;
						return referenceInformationModel;
					}
				}
			}
		}
		return null;
		*/
	}
	
	static public Set<Package> getReferencedBySubsetModelInformationModel(Package subsetInformationModel){
		return getInformationModelSubsetting(subsetInformationModel);
	}
	static public boolean isInformationModelExtension(Package element){
		EnumerationLiteral defaultPurpose=getInformationModelDefaultPurpose(element);
		return (defaultPurpose!=null)&& extensionLiteralName.equals(defaultPurpose.getName());
	}
	static public boolean isElementProxy(Element element){
		return getProject().getProxyManager().isElementProxy(element);
	}
	static public void setInformationModelDefaultPurpose(Element element,String defaultPurposeString){
		Enumeration defaultPurposeCode=(Enumeration)getType(getPimProfile(),DefaultPurposeCodeTypeName);
		EnumerationLiteral defaultPurpose=getOwnedLiteral(defaultPurposeCode,defaultPurposeString);
		setStereotypePropertyValue(element,getPimStereotype(InformationModelStereotypeName),defaultPurposeTagName,defaultPurpose);
	}
	static public EnumerationLiteral getOwnedLiteral(Enumeration p,String name){
		for(EnumerationLiteral type:p.getOwnedLiteral()){
			if(name.equals(type.getName()))return type;
		}
		return null;
	}
	static public Type getType(Profile p,String name){
		if(p==null)return null;
		for(Type type:p.getOwnedType()){
			if(name.equals(type.getName()))return type;
		}
		return null;
	}
	
	static public void setStereotypePropertyValue(Element element,Stereotype stereotype,java.lang.String propertyName,java.lang.Object value){
//		QvtCommonAction.log("setStereotypePropertyValue "+element+", "+stereotype.getQualifiedName()+", "+propertyName+", "+value);
		try{
		StereotypesHelper.setStereotypePropertyValue(element,stereotype,propertyName,value);
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: setStereotypePropertyValue "+element+", "+stereotype.getQualifiedName()+", "+propertyName+", "+value+" : "+t);
			
		}
	}
	 
	static public List getStereotypePropertyValue(Element element,Stereotype stereotype,String property){
		if((stereotype==null)||(element==null))return null;
		return StereotypesHelper.getStereotypePropertyValue(element, stereotype, property);
	}
	static public Object getStereotypePropertyFirst(Element element,Stereotype stereotype,String property){
		if((stereotype==null)||(element==null))return null;
		return StereotypesHelper.getStereotypePropertyFirst(element, stereotype, property);
	}

	static public Stereotype getPimStereotype(String stereotypeName){
		Profile profile=getPimProfile();
		if(profile==null)return null;
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,profile); 
	}
	static public Stereotype getPsmStereotype(String stereotypeName){
		Profile profile=getPsmProfile();
		if(profile==null)return null;
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,profile); 
	}
	static public Stereotype getCommonStereotype(String stereotypeName){
		Profile profile=getCommonProfile();
		if(profile==null)return null;
		return StereotypesHelper.getStereotype(getProject(),stereotypeName,profile); 
	}
	static public Profile getPimProfile(){
		return getProfile(PimProfileName); 
	}
	static public Profile getPsmProfile(){
		return getProfile(PsmProfileName); 
	}
	static public Profile getCommonProfile(){
		return getProfile(CommonProfileName); 
	}
	static public void addStereotype(Element element, Stereotype stereotype){
		/*
		if(stereotype==null){
			QvtCommonAction.log("ERROR: NIEMHelper.addStereotype illegal argument, null stereotype on "+element);
			return;
		}
		StereotypesHelper.addStereotype(element,stereotype);
		*/
		if(stereotype==null){
			QvtCommonAction.log("ERROR: applyStereotype with null stereotype "+element);
			return;
		}
		try{
		StereotypesHelper.addStereotype(element,stereotype);
		}catch(Throwable t){
			QvtCommonAction.log("ERROR: applyStereotype "+element+", "+stereotype.getQualifiedName()+" : "+t);
		}
		createDefaultValues(element,stereotype,true);
		
	}
	static protected void createDefaultValues(Element element, Stereotype stereotype,boolean createAll){
		StereotypesHelper.createDefaultValues(element,stereotype,createAll);
		// debug: check if base_ slot was created
		InstanceSpecification applied=element.getAppliedStereotypeInstance();
		for(Slot slot:applied.getSlot()){
			StructuralFeature feature=slot.getDefiningFeature();
			if(feature==null)continue;
			if(feature.getName()==null)continue;
			if(feature.getName().startsWith("base_")){
				//System.out.println("createDefaultValues with _base: "+feature.getQualifiedName()+", "+stereotype.getQualifiedName()+", "+((NamedElement)element).getQualifiedName()+", "+slot.getValue());
				
			}
		}
	}
	static public boolean isInPSM(Package p){
		if(p==null)return false;
		if("PSM".equals(p.getName()))return true;
		return isInPSM(p.getNestingPackage());
	}
	
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getNearestPackage(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		if(element==null){
			QvtCommonAction.log("ERROR: getNearestPackage null element");
			return null;
		}
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element))
			return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element;
		Element owner=element.getOwner();
		if(owner==null)return null;// may occur before there is any owner
		return getNearestPackage(owner);
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getNearestAppliedProfilePackage(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		if(element==null){
			//QvtCommonAction.log("ERROR: getNearestAppliedProfilePackage null element");
			return null;
		}
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)){
			for(ProfileApplication pa:((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element).getProfileApplication()){
				Profile profile=pa.getAppliedProfile();
				if(profile==null)continue;
				return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element;
			}
		}
		Element owner=element.getOwner();
		if(owner==null)return null;// may occur before there is any owner
		return getNearestAppliedProfilePackage(owner);
	}
	static public boolean isXMLPrimitiveTypesLibrary(Package p){
		return "XMLPrimitiveTypes".equals(p.getName())
		|| "PrimitiveTypes".equals(p.getName())
		;
	}
	static public boolean isXMLPrimitiveType(Classifier classifier){
		if(classifier==null)return false;
		return isXMLPrimitiveTypesLibrary(getNearestPackage(classifier));
	}
	static public boolean isDerivedFromXmlSimpleType(Classifier classifier){
		return getXmlSimpleType(classifier)!=null;
		/*
		if(!PrimitiveType.class.isInstance(classifier))return false;
		if(isXMLPrimitiveType(classifier))return true;
		for(Classifier general:classifier.getGeneral()){
			if(isDerivedFromXmlSimpleType(general))return true;
		}
		return false;
		*/
	}
	static public PrimitiveType getXmlSimpleType(Classifier classifier){
		if(!PrimitiveType.class.isInstance(classifier))return null;
		if(isXMLPrimitiveType(classifier))return (PrimitiveType)classifier;
		Classifier baseType=getBaseClassifier(classifier);
		if(baseType!=null){
			PrimitiveType primitiveType=getXmlSimpleType(baseType);
			if(primitiveType!=null)return primitiveType;
		}
		/*
		for(Classifier general:classifier.getGeneral()){
			PrimitiveType primitiveType=getXmlSimpleType(general);
			if(primitiveType!=null)return primitiveType;
		}
		*/
		return null;
	}
	static public boolean isDerivedFromXmlList(Classifier classifier){
		if(!PrimitiveType.class.isInstance(classifier))return false;
		if(isXMLPrimitiveType(classifier)){
			return classifier.getName().endsWith("S");
		}
		for(Classifier general:classifier.getGeneral()){
			if(isDerivedFromXmlList(general))return true;
		}
		return false;
	}
	
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getNearestInformationModel(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		if(element==null){
			QvtCommonAction.log("ERROR: getNearestInformationModel null element");
			return null;
		}
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)
				&&isInformationModel((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element))
			return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element;
		Element owner=element.getOwner();
		if(owner==null)return null;// may occur before there is any owner
		return getNearestInformationModel(owner);
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getNearestNamespacePackage(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		if(element==null){
			QvtCommonAction.log("ERROR: getNearestNamespacePackage null element");
			return null;
		}
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)
				&&isNamespacePackage((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element))
			return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element;
		Element owner=element.getOwner();
		if(owner==null)return null;// may occur before there is any owner
		return getNearestNamespacePackage(owner);
	}
	static public com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package getMpdRootDirectory(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element element){
		if(element==null){
			QvtCommonAction.log("ERROR: getMpdRootDirectory null element");
			return null;
		}
		if(com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package.class.isInstance(element)){
		if(!((com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element).getProfileApplication().isEmpty())
			return (com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package)element;
		}
		Element owner=element.getOwner();
		if(owner==null)return null;// may occur before there is any owner
		return getMpdRootDirectory(owner);
	}
	 static public List<Realization> getRealizations(NamedElement type){
		 List<Realization> result=new Vector<Realization>();
		 for(Dependency dependency:type.getClientDependency()){
			 if(Realization.class.isInstance(dependency)){
				 result.add((Realization)dependency);
			 }
		 }
		 return result;
	 }
	 static public List<Usage> getUsages(NamedElement type){
		 List<Usage> result=new Vector<Usage>();
		 for(Dependency dependency:type.getClientDependency()){
			 if(Usage.class.isInstance(dependency)){
				 result.add((Usage)dependency);
			 }
		 }
		 return result;
	 }

	 static public List<Usage> getMetadataApplications(Type type){
		 List<Usage> result=new Vector<Usage>();
		 for(Usage dependency:getUsages(type)){
//		 for(Dependency dependency:type.getClientDependency()){
//			 if(Usage.class.isInstance(dependency)){
				 Stereotype stereotype=NIEMHelper.getCommonStereotype(MetadataApplicationStereotypeName);
				 if(NIEMHelper.hasStereotype(dependency, stereotype)){
					 result.add((Usage)dependency);
				 }
//			 }
		 }
		 return result;
	 }
	 static public Set<Classifier> getMetadataApplicationTypes(Type type){
		 Set<Classifier> result=new HashSet<Classifier>();
		 for(Usage metadataApplication:getMetadataApplications(type)){
			 for(NamedElement test:metadataApplication.getSupplier()){
				 if(!Classifier.class.isInstance(test))continue;
				 result.add((Classifier)test);
			 }
		 }
		 return result;
	 }
	 static public List<Usage> getAugmentationApplications(Property type){
		 List<Usage> result=new Vector<Usage>();
		 getAugmentationApplications(type,result);
		 // check if this has a <<PropertyHolder>>
		 Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(type);
		 if((propertyHolderProperty!=null)&&!propertyHolderProperty.equals(type)){
			 getAugmentationApplications(propertyHolderProperty,result);
		 }
		 return result;
	 }
	 static protected void getAugmentationApplications(Property type,List<Usage> result){
		 for(Usage dependency:getUsages(type)){
//		 for(Dependency dependency:type.getClientDependency()){
//			 if(Usage.class.isInstance(dependency)){
				 Stereotype stereotype=NIEMHelper.getCommonStereotype(AugmentationApplicationStereotypeName);
				 if(NIEMHelper.hasStereotype(dependency, stereotype)){
					 result.add((Usage)dependency);
				 }
//			 }
		 }
	 }
	 static public boolean isSubTypeOf(Classifier subtype,Classifier supertype){
		 if(subtype==null)return false;
		 if(subtype.equals(supertype))return true;
		 Classifier test=getBaseClassifier(subtype);
		 if(test!=null)return isSubTypeOf(test,supertype);
		 /*
		 for(Classifier test:subtype.getGeneral()){
			 if(isSubTypeOf(test,supertype))return true;
		 }
		 */
		 return false;
	 }
	 static public boolean isPropertyHolderSubTypeOf(Classifier subtype,Classifier supertype){
		 if(subtype==null)return false;
		 if(subtype.equals(supertype))return true;
		 for(Classifier superType:subtype.getGeneral()){
			 if(isPropertyHolderSubTypeOf(superType,supertype))return true;
		 }
		 return false;
	 }
	 static public void getAllBaseExtensionClassifiers(Classifier object,Set<Classifier> result)
     {
	 if(object==null)return;
	 if(result.contains(object))return;
	 result.add(object);
	 getAllBaseExtensionClassifiers(getBaseExtensionClassifier(object),result);
     }
	 static public Classifier getBaseExtensionClassifier(Classifier object)
     {
 		Classifier baseClassifier=null;
     	DirectedRelationship dr=NIEMHelper.getBaseTypeRelation(object);
     	if((dr!=null)&&(!NIEMHelper.isRestriction(dr))){
 			for(Element supplier:dr.getTarget()){
 				if(Classifier.class.isInstance(supplier)){
 					baseClassifier=(Classifier)supplier;
 					break;
 				}
 			}
     		
     	}
     	return baseClassifier;
     }
	 static public Collection<Class> getRestrictedClasses(Classifier clientClassifier){
			 Collection<Class> result=new HashSet<Class>();
			for(Dependency test:clientClassifier.getClientDependency()){
				if(NIEMHelper.isRestriction(test)){
					for(NamedElement supplier:test.getSupplier()){
						if(Class.class.isInstance(supplier)&&NIEMHelper.isComplexType((Class)supplier)){
							result.add((Class)supplier);
						}
					}
				}
			}
			return result;
		 }
	 
 static public void getAllBaseClassifiers(Classifier object,Set<Classifier> result)
     {
	 if(object==null)return;
	 if(result.contains(object))return;
	 result.add(object);
	 getAllBaseClassifiers(getBaseClassifier(object),result);
     }
static public Classifier getBaseClassifier(Classifier object)
	      {
	  		Classifier baseClassifier=null;
	      	DirectedRelationship dr=NIEMHelper.getBaseTypeRelation(object);
	      	if(dr!=null){
	  			for(Element supplier:dr.getTarget()){
	  				if(Classifier.class.isInstance(supplier)){
	  					baseClassifier=(Classifier)supplier;
	  					break;
	  				}
	  			}
	      		
	      	}
	      	return baseClassifier;
	      }
	public static boolean isImplicitAugmentationProperty(Generalization generalization){
		return NIEMHelper.isAugmentationType(generalization.getGeneral())&&!NIEMHelper.isAugmentationType(generalization.getSpecific());
	}
	static public boolean isBaseTypeRestriction(Classifier clientClassifier){
		return isRestriction(getBaseTypeRelation(clientClassifier));
	}
	static public boolean hasAny(Classifier referenceClassifier){
		if(referenceClassifier==null)return false;
		for(Property testProperty:referenceClassifier.getAttribute()){
			if(NIEMHelper.isXSDAny(testProperty)){
				return true;
			}
		}
		return false;
		
	}
	 static   public DirectedRelationship getBaseTypeRelation(Classifier clientClassifier)
	    {
		 if(clientClassifier==null)return null;
		 DirectedRelationship result=null;
		for(Generalization generalization:clientClassifier.getGeneralization()){
			if(NIEMHelper.isRolePlayedBy(generalization))continue;
			if(NIEMHelper.isAugments(generalization))continue;
			//Classifier general=generalization.getGeneral();
			if(NIEMHelper.isImplicitAugmentationProperty(generalization))continue;
			result=generalization;
			break;
		}
		if(result==null){
			for(Dependency dependency:clientClassifier.getClientDependency()){
				if(NIEMHelper.isRestriction(dependency)
						||NIEMHelper.hasStereotype(dependency,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName))
						){
					for(NamedElement supplier:dependency.getSupplier()){
						if(Classifier.class.isInstance(supplier)){
							result=dependency;
							break;
						}
					}
				}
				if(result!=null)break;
			}
		}
		return result;
	    }
	 
	static public void removeElement(Element element){
		if((element==null)||(element.getOwner()==null))return;
		try {
		Element toBeRemoved=element;
		ModelElementsManager modelElementsManager=ModelElementsManager.getInstance();
		if(Generalization.class.isInstance(element)){
			Generalization g=(Generalization)element;
			g.setSpecific(null);
			//g.setGeneral(null);
			modelElementsManager.removeElement(g);
			return;
		}
		if(Association.class.isInstance(element)){
			Association a=(Association)element;
			List<Property> ownedEnds=new Vector<Property>(a.getOwnedEnd());
			for(Property ownedEnd:ownedEnds){
				removeElement(ownedEnd);
			}
			a.getMemberEnd().clear();
		}
		if(Class.class.isInstance(element)){
			Class c=(Class)element;
			List<Property> ownedAttributes=new Vector<Property>(c.getOwnedAttribute());
			for(Property ownedEnd:ownedAttributes){
				removeElement(ownedEnd);
			}
		}
		if(DataType.class.isInstance(element)){
			DataType c=(DataType)element;
			List<Property> ownedAttributes=new Vector<Property>(c.getOwnedAttribute());
			for(Property ownedEnd:ownedAttributes){
				removeElement(ownedEnd);
			}
		}
		if(Classifier.class.isInstance(element)){
			Classifier c=(Classifier)element;
			List<Generalization> generalizations=new Vector<Generalization>(c.getGeneralization());
			for(Generalization g:generalizations){
				removeElement(g);
			}
		}
		if(Property.class.isInstance(element)){
			Property p=(Property)element;
			Association owningAssociation=p.getOwningAssociation();
			if(owningAssociation==null){
				Association association=p.getAssociation();
				if(association!=null){
					removeElement(association);
				}
				p.setAssociation(null);
			}
			p.getSubsettedProperty().clear();
			p.get_propertyOfSubsettedProperty().clear();
			p.setType(null);
		}
		if(DirectedRelationship.class.isInstance(element)){
			DirectedRelationship p=(DirectedRelationship)element;
			p.getSource().clear();
			p.getTarget().clear();
		}
		if(Slot.class.isInstance(element)){
			Slot p=(Slot)element;
			for(ValueSpecification vs:new Vector<ValueSpecification>(p.getValue())){
				removeElement(vs);
			}
			p.getValue().clear();
			p.setDefiningFeature(null);
			p.setOwningInstance(null);
		}
		if(ValueSpecification.class.isInstance(element)){
			ValueSpecification p=(ValueSpecification)element;
			Slot slot=p.getOwningSlot();
			Property property=null;
			if(slot!=null){
				StructuralFeature sf=slot.getDefiningFeature();
				if(Property.class.isInstance(sf)){
					property=(Property)sf;
				}
			}
			// if this is an InstanceValue and containment, then remove the instance, 
			// if it is in same package and is not an EnumerationLiteral
			if(InstanceValue.class.isInstance(p)){
				InstanceValue i=(InstanceValue)p;
				InstanceSpecification instanceSpecification=i.getInstance();
				if(instanceSpecification!=null){
					if(property!=null){
						if(!isReferenceProperty(property)
								&&!EnumerationLiteral.class.isInstance(instanceSpecification)
								){
							i.setInstance(null);
							removeElement(instanceSpecification);
						}
					}
				}
			}
			p.setOwningSlot(null);
		}
		if(InstanceSpecification.class.isInstance(element)&&!(element instanceof EnumerationLiteral)){
			InstanceSpecification p=(InstanceSpecification)element;
			for(Slot slot:new Vector<Slot>(p.getSlot())){
				removeElement(slot);
			}
			List<InstanceValue> instanceValues=new Vector<InstanceValue>(p.get_instanceValueOfInstance());
			p.get_instanceValueOfInstance().clear();
			for(InstanceValue instanceValue:instanceValues){
				instanceValue.setInstance(null);
				removeElement(instanceValue);
			}
			ValueSpecification valueSpecification=p.getSpecification();
			if(valueSpecification!=null){
				removeElement(valueSpecification);
			}
			p.setSpecification(null);
			p.getSlot().clear();
			p.getClassifier().clear();
		}
		if(Package.class.isInstance(element)){
			Package c=(Package)element;
			for(PackageableElement ownedEnd:new Vector<PackageableElement>(c.getPackagedElement())){
				removeElement(ownedEnd);
			}
		}
			
			// if any relations, remove those as well
		List<DirectedRelationship> targets=new Vector<DirectedRelationship>(toBeRemoved.get_directedRelationshipOfTarget());
		for(DirectedRelationship dr:targets){
			removeElement(dr);
		}
		List<DirectedRelationship> sources=new Vector<DirectedRelationship>(toBeRemoved.get_directedRelationshipOfSource());
		for(DirectedRelationship dr:sources){
			removeElement(dr);
		}
		//toBeRemoved.setOwner(null);
		if(toBeRemoved.getOwner()!=null){
     		//QvtCommonAction.log("Removing : "+((NamedElement)toBeRemoved).getQualifiedName());
			modelElementsManager.removeElement(toBeRemoved);
     		//toBeRemoved.dispose();
     		//QvtCommonAction.log("Removed ");
		}
		} catch (ReadOnlyElementException e) {
     		QvtCommonAction.log("ERROR: During Element remove: "+e);
		}
			return;
		}

     static public List<Property> getOrderedProperties(Classifier classifier){
    	 List<Property> result=new Vector<Property>(getOwnedAttribute(classifier));
      	 List<Property> resultCopy=new Vector<Property>(result);
      	 for(Property property:resultCopy){
      		 Association association=property.getAssociation();
      		 if(AssociationClass.class.isInstance(association)){
      			 result.remove(property);
      		 }
      	 }
      	 if(AssociationClass.class.isInstance(classifier)){
      		AssociationClass associationClass=(AssociationClass)classifier;
      		 result.addAll(associationClass.getMemberEnd());
      		 //result.addAll(associationClass.getOwnedEnd());
      	 }
     	return result;
     }
     static public List<Property> getAllOrderedProperties(Classifier classifier){
    	 List<Property> result=new Vector<Property>();
    	 getAllOrderedProperties(classifier,result);
     	return result;
     }
     static protected void getAllOrderedProperties(Classifier classifier,List<Property> result){
    	 Classifier extension=NIEMHelper.getBaseExtensionClassifier(classifier);
    	 if(extension!=null)getAllOrderedProperties(extension,result);
    	 result.addAll(getOrderedProperties(classifier));
     }
     static public List<Property> getOwnedAttribute(Classifier classifier){
     	if(DataType.class.isInstance(classifier)){
     		return ((DataType)classifier).getOwnedAttribute();
     	}
     	else if(Class.class.isInstance(classifier)){
     		return ((Class)classifier).getOwnedAttribute();
     	}
     	else return new Vector<Property>();
     }
     static public void clearOrderedProperties(Classifier classifier){
    	 List<Property> result=getOwnedAttribute(classifier);
      	 List<Property> resultCopy=new Vector<Property>(result);
      	 for(Property property:resultCopy){
      		 Association association=property.getAssociation();
      		 if(!AssociationClass.class.isInstance(association)){
      			 result.remove(property);
      		 }
      	 }
      	 if(AssociationClass.class.isInstance(classifier)){
      		AssociationClass associationClass=(AssociationClass)classifier;
      		associationClass.getOwnedEnd().clear();
      		associationClass.getMemberEnd().clear();
      	 }
     }
     static public void addAllOrderedProperties(Classifier classifier,List<Property> toAdd){
    	 List<Property> result=getOwnedAttribute(classifier);
      	 for(Property property:toAdd){
      		 Association association=property.getAssociation();
      		 if(!AssociationClass.class.isInstance(association)){
      			 result.add(property);
      		 }
      	 }
      	 if(AssociationClass.class.isInstance(classifier)){
      		AssociationClass associationClass=(AssociationClass)classifier;
         	 for(Property property:toAdd){
          		 Association association=property.getAssociation();
          		 if(associationClass.equals(association)){
          			 // by this point, we do not know if it was originally owned or just a member
          			 // we will now make it owned
               		associationClass.getMemberEnd().add(property);
               		associationClass.getOwnedEnd().add(property);
          		 }
          	 }
      	 }
     }
     static public Property getReferenceProperty(Property subsetProperty){
     	// a Classifier in a subset schema: name must match reference schema
     		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
     		if(subsetClassifier==null)return null;
     		ProjectCache projectCache=ProjectCache.getProjectCache();
    		if(projectCache==null)return null;
    		Map<Property,Property> subsetToReferenceMap=projectCache.getReferencePropertyMap();
    		Property result=subsetToReferenceMap.get(subsetProperty);
    		if(result!=null)return result;
    		if(subsetToReferenceMap.containsKey(subsetProperty))return null;
    		subsetToReferenceMap.put(subsetProperty, null);
         	//Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
 		Property referenceProperty=NIEMHelper.getReferencesReferenceModelProperty(subsetProperty);
 		//System.out.println("getReferenceProperty "+referenceProperty+", "+subsetProperty.getName());
 		if(referenceProperty==null){
 	    	// reference model via <<references>> on classifier or informationModel
 			Classifier referenceClassifier=NIEMHelper.getReferencesReferenceModelClassifier(subsetClassifier);
 	 		//System.out.println("getReferenceProperty referenceClassifier "+referenceClassifier+", "+subsetClassifier.getQualifiedName());
 			if(referenceClassifier==null)return null;
			 referenceProperty=NameHelper.getMatchingProperty(subsetProperty, referenceClassifier);
	 	 	//	System.out.println("getReferenceProperty referenceProperty "+referenceProperty+", "+referenceClassifier.getQualifiedName()+", "+subsetProperty.getQualifiedName());
 			if(referenceProperty==null)return null;
 	 		//System.out.println("getReferenceProperty result "+referenceProperty.getQualifiedName()+", "+subsetProperty.getQualifiedName());
 		}else{
	
	 		if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
	 			if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
	 				return null;
	 			}
	 		}
 		}
		subsetToReferenceMap.put(subsetProperty, referenceProperty);
 		return referenceProperty;
 	 	}
     static public Property getResolvedReferenceProperty(Property subsetProperty){
    	 Property referenceProperty=getReferenceProperty(subsetProperty);
    	 if(referenceProperty==null)return null;
	 		if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
	 			referenceProperty=NameHelper.getResolvedSubstitutionGroupProperty(subsetProperty,referenceProperty);
	 			return referenceProperty;
 	 		}
  		return referenceProperty;
  	 	}
     static public Set<Property> getReferencedByProperty(Property subsetProperty){
    	 Set<Property> result=new HashSet<Property>();
      	// a Classifier in a subset schema: name must match reference schema
      		Classifier subsetClassifier=NameHelper.getOwningClassifier(subsetProperty);
      		if(subsetClassifier==null)return result;
      		//ProjectCache projectCache=ProjectCache.getProjectCache();
     		//if(projectCache==null)return null;
     		//Map<Property,Property> subsetToReferenceMap=projectCache.getReferencePropertyMap();
     		//Property result=subsetToReferenceMap.get(subsetProperty);
     		//if(result!=null)return result;
     		//if(subsetToReferenceMap.containsKey(subsetProperty))return null;
     		//subsetToReferenceMap.put(subsetProperty, null);
          	//Package subsetInformationModel=NIEMHelper.getNearestInformationModel(subsetProperty);
  		//Property referenceProperty=NIEMHelper.getReferencedByReferenceModelProperty(subsetProperty);
  		result.addAll(NIEMHelper.getReferencedByReferenceModelProperty(subsetProperty));
  		//if(referenceProperty==null){
  	    	// reference model via <<references>> on classifier or informationModel
  			for(Classifier referenceClassifier:NIEMHelper.getReferencedByReferenceModelClassifier(subsetClassifier)){
  			//if(referenceClassifier==null)return null;
  	  		if(referenceClassifier==null)continue;
 			 Property referenceProperty=NameHelper.getMatchingProperty(subsetProperty, referenceClassifier);
  			if(referenceProperty==null)continue;
  			result.add(referenceProperty);
  			}
  		/*}else{
 	
 	 		if( !NameHelper.isMatchingProperty(subsetProperty, referenceProperty)){
 	 			if(!NameHelper.isMatchingSubstitutionGroupProperty(subsetProperty,referenceProperty)){
 	 				return null;
 	 			}
 	 		}
  		}*/
 		//subsetToReferenceMap.put(subsetProperty, referenceProperty);
  		return result;
  	 	}
 	static public Set<Package> getAllModelPackageDescriptionInformationModels(Component element){
		Set<Package> result=new HashSet<Package>();
		Set<NamedElement> didThat=new HashSet<NamedElement>();
		for(Package topPackage:getModelPackageDescriptionInformationModels(element)){
			findAllInformationModelsReferenced(topPackage,result,didThat);
		}
		return result;
	}
     
 	public static Set<Package> findAllInformationModelsReferenced(Package subsetContext,Set<Package> result,Set<NamedElement> didThat){
 		if(subsetContext==null)return result;
		if(result.contains(subsetContext))return result;
		if(!isInformationModel(subsetContext)) return result;
		if(!getNamespaceIsConformant(subsetContext))return result;
		if(didThat.contains(subsetContext))return result;
		didThat.add(subsetContext);
		ProjectCache projectCache=ProjectCache.getProjectCache();
		if(projectCache==null)return result;
		Map<Package,Set<Package>> infoMap=projectCache.getInformationModelToReferencedModels();
		Set<Package> packages=infoMap.get(subsetContext);
		if(packages!=null){
			result.addAll(packages);
			return result;
		}
		Set<Package> originalResult=new HashSet<Package>(result);
		result.add(subsetContext);
		// search dependencies, classifiers and their generalizations/dependencies, properties and their types/dependencies
		findAllInformationModelsReferencedViaDependency(subsetContext,result,didThat);
		for(Type t:subsetContext.getOwnedType()){
			findAllInformationModelsReferencedByType(t,result,didThat);
		}
		Set<Package> myResult=new HashSet<Package>(result);
		myResult.removeAll(originalResult);
		infoMap.put(subsetContext, myResult);
   	 	return result;			    	 

	}
 	public static Set<Package> findInformationModelsReferencedByType(Type t,Set<Package> result){
		if(Classifier.class.isInstance(t)){
			Classifier c=(Classifier)t;
			findInformationModelsReferencedViaDependency(c,result);
			for(Classifier superClassifier:c.getGeneral()){
				Package informationModel=NIEMHelper.getNearestInformationModel(superClassifier);
				if(informationModel!=null)result.add(informationModel);
			}
			for(Property p:c.getAttribute()){
				findInformationModelsReferencedByProperty(p,result);
			}
		}
	 	return result;			    	 
}
 	public static Set<Package> findInformationModelsReferencedByProperty(Property p,Set<Package> result){
				Type type=p.getType();
//				if(type!=null)findAllInformationModelsReferenced(NIEMHelper.getNearestInformationModel(type),result);
				if(type!=null){
					Package informationModel=NIEMHelper.getNearestInformationModel(type);
					if(informationModel!=null)result.add(informationModel);
				}
				findInformationModelsReferencedViaDependency(p,result);
	 	return result;			    	 

}
	protected static void findInformationModelsReferencedViaDependency(NamedElement subsetContext,Set<Package> result){
		for(Dependency d:subsetContext.getClientDependency()){
			// do not include <<References>> at package or class level
			if(NIEMHelper.isReferences(d)){
				if(Package.class.isInstance(subsetContext)|| Classifier.class.isInstance(subsetContext))continue;
			}
			
			// do not include Usage at Package level
			// do include*** since may be override to reference model
			//if(Usage.class.isInstance(d)&&Package.class.isInstance(subsetContext))continue;
			for(NamedElement ne:d.getSupplier()){
				Package informationModel=NIEMHelper.getNearestInformationModel(ne);
				if(informationModel!=null)result.add(informationModel);
			}
		}
	}
 	public static Set<Package> findAllInformationModelsReferencedByType(Type t,Set<Package> result,Set<NamedElement> didThat){
			if(Classifier.class.isInstance(t)){
				Classifier c=(Classifier)t;
				if(didThat.contains(c))return result;
				didThat.add(c);
				findAllInformationModelsReferencedViaDependency(c,result,didThat);
				for(Classifier superClassifier:c.getGeneral()){
					findAllInformationModelsReferenced(NIEMHelper.getNearestInformationModel(superClassifier),result,didThat);
				}
				for(Property p:c.getAttribute()){
					findAllInformationModelsReferencedByProperty(p,result,didThat);
				}
			}
   	 	return result;			    	 

	}
 	public static Set<Package> findAllInformationModelsReferencedByProperty(Property p,Set<Package> result,Set<NamedElement> didThat){
 		if(didThat.contains(p))return result;
 		didThat.add(p);
				Type type=p.getType();
//				if(type!=null)findAllInformationModelsReferenced(NIEMHelper.getNearestInformationModel(type),result);
				if(type!=null)findAllInformationModelsReferencedByType(type,result,didThat);
				findAllInformationModelsReferencedViaDependency(p,result,didThat);
	 	return result;			    	 

}
	protected static void findAllInformationModelsReferencedViaDependency(NamedElement subsetContext,Set<Package> result,Set<NamedElement> didThat){
		for(Dependency d:subsetContext.getClientDependency()){
			// do not include <<References>> at package or class level
			if(NIEMHelper.isReferences(d)){
				if(Package.class.isInstance(subsetContext)|| Classifier.class.isInstance(subsetContext))continue;
			}
			
			// do not include Usage at Package level
			// do include*** since may be override to reference model
			//if(Usage.class.isInstance(d)&&Package.class.isInstance(subsetContext))continue;
			for(NamedElement ne:d.getSupplier()){
				findAllInformationModelsReferenced(NIEMHelper.getNearestInformationModel(ne),result,didThat);
			}
		}
	}
	 static public Class getRestrictedClass(Classifier clientClassifier){
		 if(clientClassifier!=null)
		for(Dependency test:clientClassifier.getClientDependency()){
			if(NIEMHelper.hasStereotype(test, NIEMHelper.getCommonStereotype(RestrictionStereotypeName))){
				for(NamedElement supplier:test.getSupplier()){
					if(Class.class.isInstance(supplier)&&NIEMHelper.isComplexType((Class)supplier)){
						return (Class)supplier;
					}
				}
			}
		}
		return null;
	 }
		static public Set<Property> getSubstitutableProperties(Property referenceProperty){
			Set<Property> result=new HashSet<Property>();
			Property topLevelElement= NameHelper.getSubsetPropertyHolderProperty(referenceProperty);
			if(topLevelElement==null)return result;
			if(!NIEMHelper.isPropertyHolder(topLevelElement.getClassifier()))return result;
			getAllSubstitutableProperties(topLevelElement,result,new HashSet<Property>());
			return result;
		}
		static protected void getAllSubstitutableProperties(Property referenceProperty,Set<Property> allSubstitutable,Set<Property> didThat){
			if(didThat.contains(referenceProperty))return;
			didThat.add(referenceProperty);
			if(!referenceProperty.isDerivedUnion()){
				allSubstitutable.add(referenceProperty);
			}
			
			for(Property substitute:referenceProperty.get_propertyOfSubsettedProperty()){
				getAllSubstitutableProperties(substitute,allSubstitutable,didThat);
			}
		}
/*
		static public void applyStereotype(Element element,Stereotype stereotype){
			if(stereotype==null){
				QvtCommonAction.log("ERROR: applyStereotype with null stereotype "+element);
				return;
			}
			try{
			StereotypesHelper.addStereotype(element,stereotype);
			}catch(Throwable t){
				QvtCommonAction.log("ERROR: applyStereotype "+element+", "+stereotype.getQualifiedName()+" : "+t);
			}
			createDefaultValues(element,stereotype,true);
		}
*/
	    static public boolean isInstancePackage(Package instancePackage){
			Profile mpdProfile=NIEMHelper.getMpdProfile();
			if(mpdProfile==null)return false;
			Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,sample_instanceLiteralName);
			EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xmlLiteralName);
	    	for(Dependency mpdFile:getSupplierModelPackageDescriptionFiles(instancePackage)){
				if(defaultPurpose.equals(NIEMHelper.getMpdFilePurpose(mpdFile))
						&&defaultNature.equals(NIEMHelper.getMpdFileNature(mpdFile))){
					return true;
				}
	    		
	    	}
	    	return false;
	    }
		static public Set<Dependency> getSupplierModelPackageDescriptionFiles(Package element){
			Set<Dependency> result=new HashSet<Dependency>();
			for(Dependency dependency:element.getSupplierDependency()){
				if(isModelPackageDescriptionFile(dependency))result.add(dependency);
			}
			return result;
		}
		static public boolean isChangelog(Package somePackage){
	    	for(Dependency mpdFile:getSupplierModelPackageDescriptionFiles(somePackage)){
	    		EnumerationLiteral filePurpose=NIEMHelper.getMpdFilePurpose(mpdFile);
	    		EnumerationLiteral fileNature=NIEMHelper.getMpdFileNature(mpdFile);
	    		if((filePurpose==null)||(fileNature==null))continue;
				if(changelogLiteralName.equals(filePurpose.getName())
						&&xmlLiteralName.equals(fileNature.getName())){
					return true;
				}
	    		
	    	}
	    	return false;
		}
	    
		static public Package getChangelog(Package somePackage){
			return getChangelog(QvtCommonAction.getMpdComponent());
		}
		static public Package getChangelog(Component component){
			if(component==null)return null;
			for(Dependency mpdFile:NIEMHelper.getModelPackageDescriptionFiles(component)){
					for(NamedElement test:mpdFile.getSupplier()){
						if(!Package.class.isInstance(test))continue;
						if(isChangelog((Package)test))return (Package)test;
					}
			}
			/*
			Profile mpdProfile=NIEMHelper.getMpdProfile();
			Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,changelogLiteralName);
			EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xmlLiteralName);
			for(Dependency mpdFile:NIEMHelper.getModelPackageDescriptionFiles(component)){
				if(defaultPurpose.equals(getMpdFilePurpose(mpdFile))
						&&defaultNature.equals(getMpdFileNature(mpdFile))){
					for(NamedElement test:mpdFile.getSupplier()){
						if(!Package.class.isInstance(test))continue;
						if(changelogPackageName.equals(test.getName()))return (Package)test;
					}
					
				}
				
			}
			*/
			return null;
			
		}
		static public Package getBusinessRuleSuite(){
			return getBusinessRuleSuite(QvtCommonAction.getMpdComponent());
		}
		static public Package getBusinessRuleSuite(Component component){
			if(component==null)return null;
			Profile mpdProfile=NIEMHelper.getMpdProfile();
			Enumeration natureCode=(Enumeration)NIEMHelper.getType(mpdProfile,NatureCodeName);
			Enumeration purposeCode=(Enumeration)NIEMHelper.getType(mpdProfile,PurposeCodeName);
			EnumerationLiteral defaultPurpose=NIEMHelper.getOwnedLiteral(purposeCode,business_rulesLiteralName);
			//EnumerationLiteral defaultNature=NIEMHelper.getOwnedLiteral(natureCode,xmlLiteralName);
			for(Dependency mpdFile:NIEMHelper.getModelPackageDescriptionFiles(component)){
				if(defaultPurpose.equals(getMpdFilePurpose(mpdFile))
						//&&defaultNature.equals(getMpdFileNature(mpdFile))
						){
					for(NamedElement test:mpdFile.getSupplier()){
						if(!Package.class.isInstance(test))continue;
						//if(changelogPackageName.equals(test.getName()))
						return (Package)test;
					}
					
				}
				
			}
			return null;
			
		}
		static public Property getSubstitutionGroupProperty(Property substitutable){
    		for(Property subGroup:substitutable.getSubsettedProperty()){
    			return subGroup;
    		}
			return null;
		}
		static public Set<EnumerationLiteral> getAllLiterals(Enumeration p){
			Set<EnumerationLiteral> result=new HashSet<EnumerationLiteral>(p.getOwnedLiteral());
			Classifier base=NIEMHelper.getBaseExtensionClassifier(p);
			// get literals via base extensions, back to last restriction
			if(base instanceof Enumeration)result.addAll(getAllLiterals((Enumeration)base));
			return result;
		}
		 static public Set<Classifier> getDerivedClassifiers(Classifier object)
	     {
			 Set<Classifier> result=new HashSet<Classifier>();
	     	for(DirectedRelationship dr:getDerivedTypeRelations(object)){
		 			for(Element supplier:dr.getSource()){
		 				if(Classifier.class.isInstance(supplier)){
		 					result.add((Classifier)supplier);
		 					break;
		 				}
		 			}
	     	}
	     	return result;
	     }
		 static   protected Set<DirectedRelationship> getDerivedTypeRelations(Classifier clientClassifier)
		    {
			 Set<DirectedRelationship> result=new HashSet<DirectedRelationship>();
			 if(clientClassifier==null)return result;
			for(Generalization generalization:clientClassifier.get_generalizationOfGeneral()){
				if(NIEMHelper.isRolePlayedBy(generalization))continue;
				if(NIEMHelper.isAugments(generalization))continue;
				if(NIEMHelper.isImplicitAugmentationProperty(generalization))continue;
				result.add(generalization);
				break;
			}
				for(Dependency dependency:clientClassifier.getSupplierDependency()){
					if(NIEMHelper.isRestriction(dependency)
							||NIEMHelper.hasStereotype(dependency,NIEMHelper.getPsmStereotype(XSDSimpleContentStereotypeName))
							){
						for(NamedElement supplier:dependency.getClient()){
							if(Classifier.class.isInstance(supplier)){
								result.add(dependency);
							}
						}
					}
				}
			return result;
		    }
		 // retrieves subset model type corresponding to referenceModelType, assuming that subset model type is properly based on reference model type 
		 static public Classifier getSubsetModelClassifierForReferenceModelClassifier(Classifier subsetModelType,Classifier referenceModelType){
			 if(referenceModelType==null)return null;
			 Classifier referenceTest=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(subsetModelType);
			 // referenceTest may be null if subsetModelType not in reference model
			 if(referenceTest!=null){
				 if(referenceTest.equals(referenceModelType))return subsetModelType;
			 }
			 Classifier subsetBaseType=NIEMHelper.getBaseClassifier(subsetModelType);
			 if(subsetBaseType==null)return subsetModelType;
			 return getSubsetModelClassifierForReferenceModelClassifier(subsetBaseType,referenceModelType);
		 }
		 static public Set<Classifier> getAllCommonSubtypes(Property clientProperty){
				// get common types based on substitution groups
				Set<Classifier> allCommonTypes=null;
				for(Property subsettingProperty:clientProperty.get_propertyOfSubsettedProperty()){
					Type subsettingPropertyType=subsettingProperty.getType();
					Set<Classifier> allTypes=new HashSet<Classifier>();
						if(subsettingPropertyType==null){
							allTypes=getAllCommonSubtypes(subsettingProperty);
						}else{
							// get all types
							NIEMHelper.getAllBaseClassifiers((Classifier)subsettingPropertyType, allTypes);
						}
						if(allCommonTypes==null){
							allCommonTypes=allTypes;
						}else{
							allCommonTypes.retainAll(allTypes);
						}
				}
				if(allCommonTypes==null)allCommonTypes=new HashSet<Classifier>();
				return allCommonTypes;
			}
		  static public boolean isNiemTypeOverrideConstraint(Property subsetProperty)
		    {
		    	Boolean result=false;
		    	if(subsetProperty==null)return result;
		    		// need to use propertyholder property if possible, due to substitutiongroup not being in normal classifier
		    		Property subsetPropertyTest=NameHelper.getSubsetPropertyHolderProperty(subsetProperty);
		    		if(subsetPropertyTest!=null)subsetProperty=subsetPropertyTest;
		    		Property referenceModelProperty=NIEMHelper.getReferenceProperty(subsetProperty);
		    		if(referenceModelProperty!=null){
			    		Classifier referenceModelType=(Classifier)referenceModelProperty.getType();
			    		Classifier currentSubsetModelType=(Classifier)subsetProperty.getType();
			    		Classifier referenceTest=null;
			    		if(currentSubsetModelType!=null){
				    		if(NIEMHelper.isXMLPrimitiveType((Classifier)currentSubsetModelType))referenceTest=(Classifier)currentSubsetModelType;
				    		else {
				    			// find reference type for subset type
				    			referenceTest=NIEMHelper.getReferenceModelClassifierForSubsetModelClassifier(currentSubsetModelType);
				    		}
				    		if(referenceTest==null)result=true;
				    		else{
				    			result=!(referenceTest.equals(referenceModelType));
				    		}
			    		}
			    		
		    		}
		    	return result;
		    }
		
		  static public boolean isNiemSubsetTypeOverrideable(Property property)
		    {
				// subtype constraint; may be in PropertyHolder or otherwise a Property with no references to PropertyHolder Property
				// must be subtypes (based on reference level property) available; 
				// must not contradict any substitutionGroup currently referencing;
				// must not contradict its substitutionGroup
				// should propagate changes to any uses of this property
				Property propertyHolderProperty=NameHelper.getSubsetPropertyHolderProperty(property);
				if(!(NIEMHelper.isPropertyHolder(property.getOwner())||(propertyHolderProperty==null)))return false;
					Property referenceModelProperty=NIEMHelper.getReferenceProperty(property);
					//if("InsuranceApplicantQualifiedNonCitizenStatus".equals(property.getName())){
					//	System.out.println("DEBUG isSubtypeableElement "+property.getQualifiedName()+", "+referenceModelProperty+", "+propertyHolderProperty+", "+NIEMHelper.isPropertyHolder(property.getOwner()));
					//}
					if(referenceModelProperty==null)return false;

					Classifier referenceModelType=(Classifier)referenceModelProperty.getType();
					
						Classifier currentSubsetModelType=(Classifier)property.getType();
						// currentSubsetModelType either corresponds to referenceModelType or some parent of currentSubsetModelType does
						
//						Classifier subsetType=getSubsetType(referenceModelProperty,property);
//						Classifier subsetType=getSubsetType(referenceModelProperty,property);
						
						Classifier subsetModelType=currentSubsetModelType;
						// can not offer supertype if any subsettedProperty at same type
						Classifier subsetModelTypeLimit=null;
						for(Property subsettedProperty:property.getSubsettedProperty()){
							subsetModelTypeLimit=(Classifier)subsettedProperty.getType();
						}
		        		if(NIEMHelper.isXMLPrimitiveType(subsetModelType)){}
		        		else {
		        			// find subset type which matches reference type by climbing subset type inheritance, if necessary
		        			subsetModelType=NIEMHelper.getSubsetModelClassifierForReferenceModelClassifier(subsetModelType,referenceModelType);
		        		}
						if(subsetModelTypeLimit!=null){
							// subsetModelType must be subtype of subsetModelTypeLimit
							if((subsetModelType==null)||!NIEMHelper.isSubTypeOf(subsetModelType, subsetModelTypeLimit)){
								subsetModelType=subsetModelTypeLimit;
							}
						}
						
						
						boolean isSubtypingPossible=false;
						if(subsetModelType==null){
							isSubtypingPossible=true;
						}else{
							Set<Classifier> subTypes=NIEMHelper.getDerivedClassifiers(subsetModelType);
							if(!subTypes.isEmpty())isSubtypingPossible=true;
						}
						// can not subtype if any referencing substitutionGroup at same type
						// an abstract property can only be subtyped if there is some common type amongst all substitution groups
						Set<Classifier> allCommonTypes=null;
						for(Property subsettingProperty:property.get_propertyOfSubsettedProperty()){
							Type subsettingPropertyType=subsettingProperty.getType();
							if(subsetModelType==null){
								if(subsettingPropertyType==null){
									//isSubtypingPossible=false;
									//break;
								}else{
									// get all types
									Set<Classifier> allTypes=new HashSet<Classifier>();
									NIEMHelper.getAllBaseClassifiers((Classifier)subsettingPropertyType, allTypes);
									if(allCommonTypes==null){
										allCommonTypes=allTypes;
									}else{
										allCommonTypes.retainAll(allTypes);
									}
									if(allCommonTypes.size()<=1)return false;
								}
							}
							else if(subsetModelType.equals(subsettingPropertyType)){
								isSubtypingPossible=false;
								break;
							}
						}
						return isSubtypingPossible;
		    }
			public static String getBaseNiemName(Element element,String umlName){
				String niemName=NIEMHelper.getDeclaredNIEMName(element);
				if(niemName==null)niemName=umlName;
				return niemName;
			}
			public static Property findPropertyHolderProperty(Element element,String name){
				Package informationModel=NIEMHelper.getNearestInformationModel(element);
				Map<String,Property> map=NameHelper.getNameToPropertyHolderPropertyMap(informationModel);
				return map.get(name);
			}
			public static String toRoleOfName(String name){
				if(name.startsWith("RoleOf"))return name;
				return "RoleOf"+name;
			}
			public static String toReferenceName(String name){
				if(name.endsWith(REFERENCE_SUFFIX))return name;
				return name+REFERENCE_SUFFIX;
			}
			
			public static  Collection<Classifier> getAllParents(Classifier c){
				Set<Classifier> classifiers=new HashSet<Classifier>();
				for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
				return classifiers;
			}
			protected static void addAllParents(Classifier c,Collection<Classifier> classifiers){
				classifiers.add(c);
				for(Classifier general:c.getGeneral())addAllParents(general,classifiers);
			}
}
