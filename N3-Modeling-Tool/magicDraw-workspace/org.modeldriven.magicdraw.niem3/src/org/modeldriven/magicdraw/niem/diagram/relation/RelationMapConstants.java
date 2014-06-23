/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.relation;

import org.modeldriven.magicdraw.niem.qvt.NIEM_ProfileConstants;

/**
 * @author tom
 *
 */
public interface RelationMapConstants extends NIEM_ProfileConstants{
	public static String SUBSET_FILTER="NIEM_SUBSET_FILTER";
	public static String SUBSET_FILTER_NAME="model subsetting";
	public static String SUBSETTEDBY_FILTER="NIEM_SUBSETTEDBY_FILTER";
	public static String SUBSETTEDBY_FILTER_NAME="subsetted by";
	public static String TOPLEVELELEMENT_FILTER="NIEM_TOPLEVELELEMENT_FILTER";
	public static String TOPLEVELELEMENT_FILTER_NAME="top level elements";
	public static String TOPLEVELELEMENTUSAGE_FILTER="NIEM_TOPLEVELELEMENTUSAGE_FILTER";
	public static String TOPLEVELELEMENTUSAGE_FILTER_NAME="top level element usage";
	public static String BASETYPE_FILTER="NIEM_BASETYPE_FILTER";
	public static String BASETYPE_FILTER_NAME="base types";
	public static String DERIVEDTYPE_FILTER="NIEM_DERIVEDTYPE_FILTER";
	public static String DERIVEDTYPE_FILTER_NAME="derived types";
	public static String CONTAINMENT_FILTER="NIEM_CONTAINMENT_FILTER";
	public static String CONTAINMENT_FILTER_NAME="contained";
	public static String CONTAINER_FILTER="NIEM_CONTAINER_FILTER";
	public static String CONTAINER_FILTER_NAME="container";
	public static String TYPE_FILTER="NIEM_TYPE_FILTER";
	public static String TYPE_FILTER_NAME="type";
	public static String TYPEOF_FILTER="NIEM_TYPEOF_FILTER";
	public static String TYPEOF_FILTER_NAME="type of";
	
	public static String filters[]={SUBSET_FILTER};
	public static String NIEM_Common_Profile="NIEM_Common_Profile::";
	public static String NIEM_PSM_Profile="NIEM_PSM_Profile::";
	public static String NIEM_PIM_Profile="NIEM_PIM_Profile::";
	public static Object[] subsetElementTypes={"Classifier","AssociationClass","Class","DataType",
		"Enumeration","PrimitiveType","EnumerationLiteral","Property",
		NIEM_PIM_Profile+InformationModelStereotypeName,NIEM_PIM_Profile+RoleOfStereotypeName,
		NIEM_Common_Profile+ListStereotypeName,NIEM_Common_Profile+AdapterTypeStereotypeName,
		NIEM_Common_Profile+AssociationTypeStereotypeName,NIEM_Common_Profile+AugmentationTypeStereotypeName,
		NIEM_Common_Profile+ChoiceStereotypeName,NIEM_Common_Profile+MetadataTypeStereotypeName,
		NIEM_Common_Profile+NIEMTypeStereotypeName,NIEM_Common_Profile+ObjectTypeStereotypeName,
		NIEM_Common_Profile+PropertyHolderStereotypeName,NIEM_Common_Profile+UnionStereotypeName,
		NIEM_Common_Profile+ValueRestrictionStereotypeName,NIEM_PSM_Profile+XSDRepresentationRestrictionStereotypeName,
		NIEM_PSM_Profile+SequenceIDStereotypeName,NIEM_PSM_Profile+XSDAnyPropertyStereotypeName,
		NIEM_PSM_Profile+XSDPropertyStereotypeName};

	static public String SUBSETS_NIEM_REFERENCE_MODEL="Subsets Niem Reference Model;Property;/NIEM_PIM_Profile::InformationModel.subsetsNiemReferenceModel;Source to target;;";
	static public String TOP_LEVEL_PROPERTY_USAGE="Top Level Property Usage;Property;Property.topLevelPropertyUsage;Source to target;;";
	static public String TOP_LEVEL_PROPERTY="Top Level Property;Property;Property.topLevelProperty;Source to target;;";
	static public String TYPE_PACKAGE="Package;Property;Type.package;Source to target;;";
	//static protected String PACKAGE_TYPE="Owned Type;Package;Package.ownedType;Target to source;;";
	static public String PROPERTY_CLASSIFIER="Classifier;Property;Property.classifier;Source to target;;";
	//static protected String CLASSIFIER_ATTRIBUTE="Attribute;Classifier;Classifier.attribute;Target to source;;";
//	static protected String PROPERTY_CLASSIFIER="Classifier;Property;Property.classifier;Any;;";
	static public String NIEM_PROPERTY_CONTAINER="Niem Property Container;Property;Property.niemPropertyContainer;Source to target;;";
	static public String SUBSETTED_PROPERTY="Subsetted Property;Property;Property.subsettedProperty;Source to target;;";
	static public String SUBSETS_NIEM_REFERENCE_TYPE="Subsets Niem Reference Type;Property;Classifier.subsetsNiemReferenceType;Source to target;;";
	static public String SUBSETS_NIEM_REFERENCE_PROPERTY="Subsets Niem Reference Property;Property;Property.subsetsNiemReferenceProperty;Source to target;;";
	static public String DEFAULT_PURPOSE="Default Purpose;Tag;NIEM_PIM_Profile::InformationModel.defaultPurpose;Source to target;;";
	static public String NIEM_SUBSTITUTION_GROUPS="Niem Substitution Groups;Property;Property.niemSubstitutionGroups;Source to target;;";
	static public String NIEM_SUBSTITUTION_GROUP_AFFILIATION="Niem Substitution Group Affiliation;Property;Property.niemSubstitutionGroupAffiliation;Source to target;;";
	static public String NIEM_BASE_TYPE="Niem Base Type;Property;Classifier.niemBaseType;Source to target;;";
	static public String NIEM_DERIVED_TYPE="Niem Derived Type;Property;Classifier.niemDerivedType;Source to target;;";
	
	
	static public String OWNED_MEMBER="Owned Member;Property;Namespace.ownedMember;Source to target;;";
	static public String OWNER="Owner;Property;Element.owner;Source to target;;";
	static public String CLASSIFIER_ATTRIBUTE="Attribute;Property;Classifier.attribute;Source to target;;";
	static public String TYPEDELEMENT_TYPE="Type;Property;TypedElement.type;Source to target;;";
	static public String NIEM_TYPED_ELEMENT_OF_TYPE="Niem Typed Element Of Type;Property;Classifier.niemTypedElementOfType;Source to target;;";
	static public String SUBSETTEDBY_NIEM_REFERENCE_TYPE="Subsetted By Niem Subset Type;Property;Classifier.subsettedByNiemSubsetType;Source to target;;";
	static public String SUBSETTEDBY_NIEM_REFERENCE_MODEL="Subsetted By Niem Subset Model;Property;/NIEM_PIM_Profile::InformationModel.subsettedByNiemSubsetModel;Source to target;;";
	static public String SUBSETTEDBY_NIEM_REFERENCE_PROPERTY="Subsetted By Niem Subset Property;Property;Property.subsettedByNiemSubsetProperty;Source to target;;";
	static public String[] subsetRelationCriterion={
		SUBSETS_NIEM_REFERENCE_TYPE,
		TYPE_PACKAGE,
		TOP_LEVEL_PROPERTY,
		NIEM_SUBSTITUTION_GROUPS,
		SUBSETS_NIEM_REFERENCE_MODEL,
		SUBSETS_NIEM_REFERENCE_PROPERTY,
		DEFAULT_PURPOSE,
		NIEM_BASE_TYPE,
		PROPERTY_CLASSIFIER};
	static public String[] subsettedByRelationCriterion={
		SUBSETTEDBY_NIEM_REFERENCE_TYPE,
		SUBSETTEDBY_NIEM_REFERENCE_MODEL,
		SUBSETTEDBY_NIEM_REFERENCE_PROPERTY,
		TYPE_PACKAGE,
		TOP_LEVEL_PROPERTY_USAGE,
		SUBSETTED_PROPERTY,
		DEFAULT_PURPOSE,
		PROPERTY_CLASSIFIER};
	static public String[] topLevelElementRelationCriterion={NIEM_SUBSTITUTION_GROUPS,
		TYPE_PACKAGE,TOP_LEVEL_PROPERTY,NIEM_PROPERTY_CONTAINER,
		DEFAULT_PURPOSE,
		PROPERTY_CLASSIFIER};
	static public String[] topLevelElementUsageRelationCriterion={NIEM_SUBSTITUTION_GROUP_AFFILIATION,
		TYPE_PACKAGE,TOP_LEVEL_PROPERTY_USAGE,NIEM_PROPERTY_CONTAINER,
		DEFAULT_PURPOSE,
		PROPERTY_CLASSIFIER};
	static public String[] basetypeRelationCriterion={PROPERTY_CLASSIFIER,
		TYPE_PACKAGE,
		DEFAULT_PURPOSE,
		
		SUBSETS_NIEM_REFERENCE_TYPE,
		SUBSETS_NIEM_REFERENCE_MODEL,
		SUBSETS_NIEM_REFERENCE_PROPERTY,

		NIEM_BASE_TYPE};
	static public String[] derivedTypeRelationCriterion={PROPERTY_CLASSIFIER,
		TYPE_PACKAGE,
		DEFAULT_PURPOSE,
		NIEM_DERIVED_TYPE};
	
	static public String[] containedRelationCriterion={OWNED_MEMBER,
		DEFAULT_PURPOSE
		};
	static public String[] containerRelationCriterion={OWNER
		};
	static public String[] typeRelationCriterion={CLASSIFIER_ATTRIBUTE,
		TYPEDELEMENT_TYPE,
		DEFAULT_PURPOSE,
		TYPE_PACKAGE};
	static public String[] typeofRelationCriterion={PROPERTY_CLASSIFIER,
		NIEM_TYPED_ELEMENT_OF_TYPE,
		DEFAULT_PURPOSE,
		TYPE_PACKAGE};
	

}
