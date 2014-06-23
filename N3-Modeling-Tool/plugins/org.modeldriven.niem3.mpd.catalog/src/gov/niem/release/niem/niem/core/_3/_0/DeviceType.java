/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceCategoryGroup <em>Device Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceCategory <em>Device Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceESNIdentification <em>Device ESN Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceIMEIIdentification <em>Device IMEI Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceElectronicAddress <em>Device Electronic Address</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceAugmentationPointGroup <em>Device Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceType#getDeviceAugmentationPoint <em>Device Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType()
 * @model extendedMetaData="name='DeviceType' kind='elementOnly'"
 * @generated
 */
public interface DeviceType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Device Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of communication device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Device Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of communication device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceCategory' namespace='##targetNamespace' group='DeviceCategory:group'"
	 * @generated
	 */
	EList<EObject> getDeviceCategory();

	/**
	 * Returns the value of the '<em><b>Device ESN Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification number of a device specified as an electronic serial number assigned to every GSM and UMTS cellular phone by the specific manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device ESN Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceESNIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceESNIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getDeviceESNIdentification();

	/**
	 * Returns the value of the '<em><b>Device IMEI Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification number of a device specified as an International Mobile Equipment Identity assigned to every mobile phone by the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device IMEI Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceIMEIIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceIMEIIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getDeviceIMEIIdentification();

	/**
	 * Returns the value of the '<em><b>Device Electronic Address</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ElectronicAddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Internet Protocol (IP) address or Uniform Resource Locator (URL) of a device that uniquely identifies a specific site on the Internet or another network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Electronic Address</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceElectronicAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceElectronicAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElectronicAddressType> getDeviceElectronicAddress();

	/**
	 * Returns the value of the '<em><b>Device Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:DeviceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Device Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:DeviceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceType_DeviceAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceAugmentationPoint' namespace='##targetNamespace' group='DeviceAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDeviceAugmentationPoint();

} // DeviceType
