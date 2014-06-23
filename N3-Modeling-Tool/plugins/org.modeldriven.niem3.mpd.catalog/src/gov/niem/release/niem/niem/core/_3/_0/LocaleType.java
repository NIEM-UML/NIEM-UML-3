/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locale Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a geopolitical area.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleCensusBlockID <em>Locale Census Block ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleCensusTractID <em>Locale Census Tract ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleCommunityName <em>Locale Community Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleDescriptionText <em>Locale Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleDistrictName <em>Locale District Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleEmergencyServicesName <em>Locale Emergency Services Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleFireJurisdictionID <em>Locale Fire Jurisdiction ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleJudicialDistrictGroup <em>Locale Judicial District Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleJudicialDistrict <em>Locale Judicial District</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleJudicialDistrictName <em>Locale Judicial District Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleNeighborhoodName <em>Locale Neighborhood Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocalePoliceBeatText <em>Locale Police Beat Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocalePoliceGridText <em>Locale Police Grid Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocalePoliceJurisdictionID <em>Locale Police Jurisdiction ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleRegionName <em>Locale Region Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleSubdivisionName <em>Locale Subdivision Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleZoneName <em>Locale Zone Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleEmergencyServicesJurisdictionID <em>Locale Emergency Services Jurisdiction ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleAugmentationPointGroup <em>Locale Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocaleType#getLocaleAugmentationPoint <em>Locale Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType()
 * @model extendedMetaData="name='LocaleType' kind='elementOnly'"
 * @generated
 */
public interface LocaleType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Locale Census Block ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of the smallest subdivision of an area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Census Block ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleCensusBlockID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleCensusBlockID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleCensusBlockID();

	/**
	 * Returns the value of the '<em><b>Locale Census Tract ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a designated census tract area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Census Tract ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleCensusTractID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleCensusTractID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleCensusTractID();

	/**
	 * Returns the value of the '<em><b>Locale Community Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a specific community.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Community Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleCommunityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleCommunityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleCommunityName();

	/**
	 * Returns the value of the '<em><b>Locale Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a geopolitical area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleDescriptionText();

	/**
	 * Returns the value of the '<em><b>Locale District Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name given to an area defined for administrative or official purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale District Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleDistrictName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleDistrictName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleDistrictName();

	/**
	 * Returns the value of the '<em><b>Locale Emergency Services Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an organization providing emergency services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Emergency Services Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleEmergencyServicesName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleEmergencyServicesName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleEmergencyServicesName();

	/**
	 * Returns the value of the '<em><b>Locale Fire Jurisdiction ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a fire department jurisdiction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Fire Jurisdiction ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleFireJurisdictionID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleFireJurisdictionID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleFireJurisdictionID();

	/**
	 * Returns the value of the '<em><b>Locale Judicial District Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a judicial district.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Judicial District Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleJudicialDistrictGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocaleJudicialDistrict:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocaleJudicialDistrictGroup();

	/**
	 * Returns the value of the '<em><b>Locale Judicial District</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a judicial district.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Judicial District</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleJudicialDistrict()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocaleJudicialDistrict' namespace='##targetNamespace' group='LocaleJudicialDistrict:group'"
	 * @generated
	 */
	EList<EObject> getLocaleJudicialDistrict();

	/**
	 * Returns the value of the '<em><b>Locale Judicial District Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the judicial district.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Judicial District Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleJudicialDistrictName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleJudicialDistrictName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleJudicialDistrictName();

	/**
	 * Returns the value of the '<em><b>Locale Neighborhood Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a neighborhood.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Neighborhood Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleNeighborhoodName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleNeighborhoodName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleNeighborhoodName();

	/**
	 * Returns the value of the '<em><b>Locale Police Beat Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A police beat that encompasses a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Police Beat Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocalePoliceBeatText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalePoliceBeatText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocalePoliceBeatText();

	/**
	 * Returns the value of the '<em><b>Locale Police Grid Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A police grid coordinate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Police Grid Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocalePoliceGridText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalePoliceGridText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocalePoliceGridText();

	/**
	 * Returns the value of the '<em><b>Locale Police Jurisdiction ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a police jurisdiction that encompasses a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Police Jurisdiction ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocalePoliceJurisdictionID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocalePoliceJurisdictionID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocalePoliceJurisdictionID();

	/**
	 * Returns the value of the '<em><b>Locale Region Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Region Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleRegionName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleRegionName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleRegionName();

	/**
	 * Returns the value of the '<em><b>Locale Subdivision Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a subdivision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Subdivision Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleSubdivisionName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleSubdivisionName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleSubdivisionName();

	/**
	 * Returns the value of the '<em><b>Locale Zone Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a zone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Zone Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleZoneName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleZoneName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getLocaleZoneName();

	/**
	 * Returns the value of the '<em><b>Locale Emergency Services Jurisdiction ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of an emergency services jurisdiction that encompasses a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Emergency Services Jurisdiction ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleEmergencyServicesJurisdictionID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocaleEmergencyServicesJurisdictionID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleEmergencyServicesJurisdictionID();

	/**
	 * Returns the value of the '<em><b>Locale Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocaleType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocaleAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocaleAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Locale Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocaleType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocaleType_LocaleAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocaleAugmentationPoint' namespace='##targetNamespace' group='LocaleAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLocaleAugmentationPoint();

} // LocaleType
