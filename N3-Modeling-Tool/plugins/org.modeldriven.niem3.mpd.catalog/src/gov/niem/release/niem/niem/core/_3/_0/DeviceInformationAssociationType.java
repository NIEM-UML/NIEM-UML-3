/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Information Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a device and a message, website, binary, or other kind of information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getTelecommunicationDevice <em>Telecommunication Device</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceUser <em>Device User</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceReceivedInformationGroup <em>Device Received Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceReceivedInformation <em>Device Received Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceSentInformationGroup <em>Device Sent Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceSentInformation <em>Device Sent Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceStoredInformationGroup <em>Device Stored Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceStoredInformation <em>Device Stored Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceVisitedInformationGroup <em>Device Visited Information Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceVisitedInformation <em>Device Visited Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceInformationAssociationAugmentationPointGroup <em>Device Information Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DeviceInformationAssociationType#getDeviceInformationAssociationAugmentationPoint <em>Device Information Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType()
 * @model extendedMetaData="name='DeviceInformationAssociationType' kind='elementOnly'"
 * @generated
 */
public interface DeviceInformationAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Telecommunication Device</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device used for communication over a distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecommunication Device</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_TelecommunicationDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelecommunicationDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceType> getTelecommunicationDevice();

	/**
	 * Returns the value of the '<em><b>Device User</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who uses a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device User</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceUser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceUser' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getDeviceUser();

	/**
	 * Returns the value of the '<em><b>Device Received Information Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a call, message, file, communication, or other kind of information received by a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Received Information Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceReceivedInformationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceReceivedInformation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceReceivedInformationGroup();

	/**
	 * Returns the value of the '<em><b>Device Received Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a call, message, file, communication, or other kind of information received by a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Received Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceReceivedInformation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceReceivedInformation' namespace='##targetNamespace' group='DeviceReceivedInformation:group'"
	 * @generated
	 */
	EList<EObject> getDeviceReceivedInformation();

	/**
	 * Returns the value of the '<em><b>Device Sent Information Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a call, message, file, communication, or other kind of information sent from a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Sent Information Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceSentInformationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceSentInformation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceSentInformationGroup();

	/**
	 * Returns the value of the '<em><b>Device Sent Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a call, message, file, communication, or other kind of information sent from a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Sent Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceSentInformation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceSentInformation' namespace='##targetNamespace' group='DeviceSentInformation:group'"
	 * @generated
	 */
	EList<EObject> getDeviceSentInformation();

	/**
	 * Returns the value of the '<em><b>Device Stored Information Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a call, message, file, communication, or other kind of information stored on a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Stored Information Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceStoredInformationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceStoredInformation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceStoredInformationGroup();

	/**
	 * Returns the value of the '<em><b>Device Stored Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a call, message, file, communication, or other kind of information stored on a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Stored Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceStoredInformation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceStoredInformation' namespace='##targetNamespace' group='DeviceStoredInformation:group'"
	 * @generated
	 */
	EList<EObject> getDeviceStoredInformation();

	/**
	 * Returns the value of the '<em><b>Device Visited Information Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a website or other kind of information visited or accessed by a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Visited Information Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceVisitedInformationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceVisitedInformation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceVisitedInformationGroup();

	/**
	 * Returns the value of the '<em><b>Device Visited Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a website or other kind of information visited or accessed by a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Visited Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceVisitedInformation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceVisitedInformation' namespace='##targetNamespace' group='DeviceVisitedInformation:group'"
	 * @generated
	 */
	EList<EObject> getDeviceVisitedInformation();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Device Information Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:DeviceInformationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Information Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceInformationAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DeviceInformationAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDeviceInformationAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Device Information Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:DeviceInformationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Information Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDeviceInformationAssociationType_DeviceInformationAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceInformationAssociationAugmentationPoint' namespace='##targetNamespace' group='DeviceInformationAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDeviceInformationAssociationAugmentationPoint();

} // DeviceInformationAssociationType
