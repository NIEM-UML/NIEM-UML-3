/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NANP Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a North American Numbering Plan telephone number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType#getTelephoneAreaCodeID <em>Telephone Area Code ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType#getTelephoneExchangeID <em>Telephone Exchange ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType#getTelephoneLineID <em>Telephone Line ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType#getTelephoneSuffixID <em>Telephone Suffix ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType#getNANPTelephoneNumberAugmentationPointGroup <em>NANP Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.NANPTelephoneNumberType#getNANPTelephoneNumberAugmentationPoint <em>NANP Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType()
 * @model extendedMetaData="name='NANPTelephoneNumberType' kind='elementOnly'"
 * @generated
 */
public interface NANPTelephoneNumberType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Telephone Area Code ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A dialing code for a state or province for phone numbers in the USA, Canada, Mexico, and the Caribbean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Area Code ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType_TelephoneAreaCodeID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneAreaCodeID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneAreaCodeID();

	/**
	 * Returns the value of the '<em><b>Telephone Exchange ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A portion of a telephone number that usually represents a central telephone switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Exchange ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType_TelephoneExchangeID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneExchangeID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneExchangeID();

	/**
	 * Returns the value of the '<em><b>Telephone Line ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A portion of a telephone number that identifies the individual circuit within an exchange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Line ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType_TelephoneLineID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneLineID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneLineID();

	/**
	 * Returns the value of the '<em><b>Telephone Suffix ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional sequence of numbers to be entered after a call connects to be directed to the appropriate place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Suffix ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType_TelephoneSuffixID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneSuffixID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneSuffixID();

	/**
	 * Returns the value of the '<em><b>NANP Telephone Number Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for NANPTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NANP Telephone Number Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType_NANPTelephoneNumberAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='NANPTelephoneNumberAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getNANPTelephoneNumberAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>NANP Telephone Number Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for NANPTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NANP Telephone Number Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getNANPTelephoneNumberType_NANPTelephoneNumberAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NANPTelephoneNumberAugmentationPoint' namespace='##targetNamespace' group='NANPTelephoneNumberAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getNANPTelephoneNumberAugmentationPoint();

} // NANPTelephoneNumberType
