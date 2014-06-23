/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a full telephone number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType#getTelephoneNumberFullID <em>Telephone Number Full ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType#getTelephoneSuffixID <em>Telephone Suffix ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType#getFullTelephoneNumberAugmentationPointGroup <em>Full Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FullTelephoneNumberType#getFullTelephoneNumberAugmentationPoint <em>Full Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFullTelephoneNumberType()
 * @model extendedMetaData="name='FullTelephoneNumberType' kind='elementOnly'"
 * @generated
 */
public interface FullTelephoneNumberType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Telephone Number Full ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complete telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Full ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFullTelephoneNumberType_TelephoneNumberFullID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumberFullID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneNumberFullID();

	/**
	 * Returns the value of the '<em><b>Telephone Suffix ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional sequence of numbers to be entered after a call connects to be directed to the appropriate place.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Suffix ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFullTelephoneNumberType_TelephoneSuffixID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TelephoneSuffixID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getTelephoneSuffixID();

	/**
	 * Returns the value of the '<em><b>Full Telephone Number Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FullTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Telephone Number Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFullTelephoneNumberType_FullTelephoneNumberAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FullTelephoneNumberAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFullTelephoneNumberAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Full Telephone Number Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FullTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Full Telephone Number Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFullTelephoneNumberType_FullTelephoneNumberAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FullTelephoneNumberAugmentationPoint' namespace='##targetNamespace' group='FullTelephoneNumberAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFullTelephoneNumberAugmentationPoint();

} // FullTelephoneNumberType
