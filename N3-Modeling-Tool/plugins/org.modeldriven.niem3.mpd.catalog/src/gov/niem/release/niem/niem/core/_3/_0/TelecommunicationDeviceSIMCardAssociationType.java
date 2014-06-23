/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telecommunication Device SIM Card Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a telecommunication device and a SIM card.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType#getTelecommunicationDevice <em>Telecommunication Device</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType#getSIMCard <em>SIM Card</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType#getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup <em>Telecommunication Device SIM Card Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelecommunicationDeviceSIMCardAssociationType#getTelecommunicationDeviceSIMCardAssociationAugmentationPoint <em>Telecommunication Device SIM Card Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelecommunicationDeviceSIMCardAssociationType()
 * @model extendedMetaData="name='TelecommunicationDeviceSIMCardAssociationType' kind='elementOnly'"
 * @generated
 */
public interface TelecommunicationDeviceSIMCardAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Telecommunication Device</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A device used for communication over a distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecommunication Device</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDevice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelecommunicationDevice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceType> getTelecommunicationDevice();

	/**
	 * Returns the value of the '<em><b>SIM Card</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A smart card that identifies a mobile telephone service subscriber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SIM Card</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelecommunicationDeviceSIMCardAssociationType_SIMCard()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SIMCard' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeviceType> getSIMCard();

	/**
	 * Returns the value of the '<em><b>Telecommunication Device SIM Card Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TelecommunicationDeviceSIMCardAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecommunication Device SIM Card Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDeviceSIMCardAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TelecommunicationDeviceSIMCardAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTelecommunicationDeviceSIMCardAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Telecommunication Device SIM Card Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TelecommunicationDeviceSIMCardAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecommunication Device SIM Card Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelecommunicationDeviceSIMCardAssociationType_TelecommunicationDeviceSIMCardAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelecommunicationDeviceSIMCardAssociationAugmentationPoint' namespace='##targetNamespace' group='TelecommunicationDeviceSIMCardAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getTelecommunicationDeviceSIMCardAssociationAugmentationPoint();

} // TelecommunicationDeviceSIMCardAssociationType
