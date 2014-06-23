/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electronic Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an Internet Protocol (IP) address or Uniform Resource Locator (URL) that uniquely identifies a specific site on the Internet or another network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ElectronicAddressType#getElectronicAddressDescriptionText <em>Electronic Address Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ElectronicAddressType#getElectronicAddressMACNumberID <em>Electronic Address MAC Number ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ElectronicAddressType#getElectronicAddressAugmentationPointGroup <em>Electronic Address Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ElectronicAddressType#getElectronicAddressAugmentationPoint <em>Electronic Address Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getElectronicAddressType()
 * @model extendedMetaData="name='ElectronicAddressType' kind='elementOnly'"
 * @generated
 */
public interface ElectronicAddressType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Electronic Address Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a network address, such as what the site is used for or a name of an online forum or group that is reached at the address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Address Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getElectronicAddressType_ElectronicAddressDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ElectronicAddressDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getElectronicAddressDescriptionText();

	/**
	 * Returns the value of the '<em><b>Electronic Address MAC Number ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code assigned to a hardware device that connects to the Internet, (i.e., MAC address, physical address, Ethernet address), and uniquely identifies that hardware device on a LAN thereby allowing data to be passed among hardware devices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Address MAC Number ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getElectronicAddressType_ElectronicAddressMACNumberID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ElectronicAddressMACNumberID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getElectronicAddressMACNumberID();

	/**
	 * Returns the value of the '<em><b>Electronic Address Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ElectronicAddressType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Address Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getElectronicAddressType_ElectronicAddressAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ElectronicAddressAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getElectronicAddressAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Electronic Address Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ElectronicAddressType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electronic Address Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getElectronicAddressType_ElectronicAddressAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ElectronicAddressAugmentationPoint' namespace='##targetNamespace' group='ElectronicAddressAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getElectronicAddressAugmentationPoint();

} // ElectronicAddressType
