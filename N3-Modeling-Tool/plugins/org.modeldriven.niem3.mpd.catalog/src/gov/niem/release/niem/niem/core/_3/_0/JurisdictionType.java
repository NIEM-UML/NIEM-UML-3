/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jurisdiction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a geopolitical area in which an organization, person, or object has a specific range of authority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getJurisdictionAbstractGroup <em>Jurisdiction Abstract Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getJurisdictionAbstract <em>Jurisdiction Abstract</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationCityName <em>Location City Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationCountryGroup <em>Location Country Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationCountry <em>Location Country</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationCountyGroup <em>Location County Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationCounty <em>Location County</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationStateGroup <em>Location State Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getLocationState <em>Location State</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getJurisdictionIdentification <em>Jurisdiction Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getJurisdictionAugmentationPointGroup <em>Jurisdiction Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.JurisdictionType#getJurisdictionAugmentationPoint <em>Jurisdiction Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType()
 * @model extendedMetaData="name='JurisdictionType' kind='elementOnly'"
 * @generated
 */
public interface JurisdictionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Jurisdiction Abstract Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an area, state, region, or other geographic unit over which some kind of authority exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction Abstract Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_JurisdictionAbstractGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='JurisdictionAbstract:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getJurisdictionAbstractGroup();

	/**
	 * Returns the value of the '<em><b>Jurisdiction Abstract</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for an area, state, region, or other geographic unit over which some kind of authority exists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction Abstract</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_JurisdictionAbstract()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JurisdictionAbstract' namespace='##targetNamespace' group='JurisdictionAbstract:group'"
	 * @generated
	 */
	EList<EObject> getJurisdictionAbstract();

	/**
	 * Returns the value of the '<em><b>Location City Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a city or town.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location City Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationCityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationCityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getLocationCityName();

	/**
	 * Returns the value of the '<em><b>Location Country Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country, territory, dependency, or other such geopolitical subdivision of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Country Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationCountryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationCountry:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationCountryGroup();

	/**
	 * Returns the value of the '<em><b>Location Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country, territory, dependency, or other such geopolitical subdivision of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Country</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationCountry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationCountry' namespace='##targetNamespace' group='LocationCountry:group'"
	 * @generated
	 */
	EList<EObject> getLocationCountry();

	/**
	 * Returns the value of the '<em><b>Location County Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a county, parish, vicinage, or other such geopolitical subdivision of a state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location County Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationCountyGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationCounty:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationCountyGroup();

	/**
	 * Returns the value of the '<em><b>Location County</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a county, parish, vicinage, or other such geopolitical subdivision of a state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location County</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationCounty()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationCounty' namespace='##targetNamespace' group='LocationCounty:group'"
	 * @generated
	 */
	EList<EObject> getLocationCounty();

	/**
	 * Returns the value of the '<em><b>Location State Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a state, commonwealth, province, or other such geopolitical subdivision of a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location State Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationStateGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationState:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationStateGroup();

	/**
	 * Returns the value of the '<em><b>Location State</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a state, commonwealth, province, or other such geopolitical subdivision of a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location State</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_LocationState()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationState' namespace='##targetNamespace' group='LocationState:group'"
	 * @generated
	 */
	EList<EObject> getLocationState();

	/**
	 * Returns the value of the '<em><b>Jurisdiction Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a jurisdiction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_JurisdictionIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JurisdictionIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getJurisdictionIdentification();

	/**
	 * Returns the value of the '<em><b>Jurisdiction Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for JurisdictionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_JurisdictionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='JurisdictionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getJurisdictionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Jurisdiction Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for JurisdictionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getJurisdictionType_JurisdictionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JurisdictionAugmentationPoint' namespace='##targetNamespace' group='JurisdictionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getJurisdictionAugmentationPoint();

} // JurisdictionType
