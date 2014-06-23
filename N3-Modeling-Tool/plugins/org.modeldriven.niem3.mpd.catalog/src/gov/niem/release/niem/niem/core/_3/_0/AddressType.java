/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a geophysical location described by postal information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressFullText <em>Address Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressPrivateMailboxText <em>Address Private Mailbox Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressSecondaryUnitText <em>Address Secondary Unit Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressDeliveryPointGroup <em>Address Delivery Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressDeliveryPoint <em>Address Delivery Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressRecipientName <em>Address Recipient Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationCityName <em>Location City Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationCountyGroup <em>Location County Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationCounty <em>Location County</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationStateGroup <em>Location State Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationState <em>Location State</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationCountryGroup <em>Location Country Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationCountry <em>Location Country</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationPostalCode <em>Location Postal Code</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getLocationPostalExtensionCode <em>Location Postal Extension Code</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressUrbanizationName <em>Address Urbanization Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressAugmentationPointGroup <em>Address Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressType#getAddressAugmentationPoint <em>Address Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType()
 * @model extendedMetaData="name='AddressType' kind='elementOnly'"
 * @generated
 */
public interface AddressType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Address Full Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complete address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Full Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressFullText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressFullText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAddressFullText();

	/**
	 * Returns the value of the '<em><b>Address Private Mailbox Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A private mailbox within a company.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Private Mailbox Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressPrivateMailboxText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressPrivateMailboxText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAddressPrivateMailboxText();

	/**
	 * Returns the value of the '<em><b>Address Secondary Unit Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A particular unit within a larger unit or grouping at a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Secondary Unit Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressSecondaryUnitText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressSecondaryUnitText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAddressSecondaryUnitText();

	/**
	 * Returns the value of the '<em><b>Address Delivery Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a single place or unit at which mail is delivered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Delivery Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressDeliveryPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AddressDeliveryPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAddressDeliveryPointGroup();

	/**
	 * Returns the value of the '<em><b>Address Delivery Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a single place or unit at which mail is delivered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Delivery Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressDeliveryPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressDeliveryPoint' namespace='##targetNamespace' group='AddressDeliveryPoint:group'"
	 * @generated
	 */
	EList<EObject> getAddressDeliveryPoint();

	/**
	 * Returns the value of the '<em><b>Address Recipient Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a person, organization, or other recipient to whom physical mail may be sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Recipient Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressRecipientName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressRecipientName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAddressRecipientName();

	/**
	 * Returns the value of the '<em><b>Location City Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a city or town.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location City Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationCityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationCityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getLocationCityName();

	/**
	 * Returns the value of the '<em><b>Location County Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a county, parish, vicinage, or other such geopolitical subdivision of a state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location County Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationCountyGroup()
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationCounty()
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationStateGroup()
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationState()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationState' namespace='##targetNamespace' group='LocationState:group'"
	 * @generated
	 */
	EList<EObject> getLocationState();

	/**
	 * Returns the value of the '<em><b>Location Country Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country, territory, dependency, or other such geopolitical subdivision of a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Country Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationCountryGroup()
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationCountry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationCountry' namespace='##targetNamespace' group='LocationCountry:group'"
	 * @generated
	 */
	EList<EObject> getLocationCountry();

	/**
	 * Returns the value of the '<em><b>Location Postal Code</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a post office-assigned zone for an address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Postal Code</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationPostalCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationPostalCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocationPostalCode();

	/**
	 * Returns the value of the '<em><b>Location Postal Extension Code</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a smaller area within a post office-assigned zone for an address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Postal Extension Code</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_LocationPostalExtensionCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LocationPostalExtensionCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocationPostalExtensionCode();

	/**
	 * Returns the value of the '<em><b>Address Urbanization Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An urbanization denotes an area, sector, or residential development within a geographic area. Commonly used in Puerto Rican urban areas, it is an important part of the addressing format, as it describes the location of a specific street whose name may occur multiple times within the same ZIP Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Urbanization Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressUrbanizationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressUrbanizationName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAddressUrbanizationName();

	/**
	 * Returns the value of the '<em><b>Address Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AddressType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AddressAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAddressAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Address Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AddressType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressType_AddressAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressAugmentationPoint' namespace='##targetNamespace' group='AddressAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAddressAugmentationPoint();

} // AddressType
