/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>International Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an international telephone number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType#getTelephoneCountryCodeID <em>Telephone Country Code ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType#getTelephoneNumberID <em>Telephone Number ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType#getTelephoneSuffixID <em>Telephone Suffix ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType#getInternationalTelephoneNumberAugmentationPointGroup <em>International Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.InternationalTelephoneNumberType#getInternationalTelephoneNumberAugmentationPoint <em>International Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInternationalTelephoneNumberType()
 * @model extendedMetaData="name='InternationalTelephoneNumberType' kind='elementOnly'"
 * @generated
 */
public interface InternationalTelephoneNumberType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Telephone Country Code ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An international dialing code for a country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Country Code ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInternationalTelephoneNumberType_TelephoneCountryCodeID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneCountryCodeID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneCountryCodeID();

	/**
	 * Returns the value of the '<em><b>Telephone Number ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInternationalTelephoneNumberType_TelephoneNumberID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumberID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneNumberID();

	/**
	 * Returns the value of the '<em><b>Telephone Suffix ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional sequence of numbers to be entered after a call connects to be directed to the appropriate place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Suffix ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInternationalTelephoneNumberType_TelephoneSuffixID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneSuffixID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneSuffixID();

	/**
	 * Returns the value of the '<em><b>International Telephone Number Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InternationalTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>International Telephone Number Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInternationalTelephoneNumberType_InternationalTelephoneNumberAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='InternationalTelephoneNumberAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getInternationalTelephoneNumberAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>International Telephone Number Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for InternationalTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>International Telephone Number Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getInternationalTelephoneNumberType_InternationalTelephoneNumberAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InternationalTelephoneNumberAugmentationPoint' namespace='##targetNamespace' group='InternationalTelephoneNumberAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getInternationalTelephoneNumberAugmentationPoint();

} // InternationalTelephoneNumberType
