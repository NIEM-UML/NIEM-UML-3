/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Radio Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a method of contacting a person or organization by messages over a radio.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactRadioType#getContactRadioCategoryText <em>Contact Radio Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactRadioType#getContactRadioChannelText <em>Contact Radio Channel Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactRadioType#getContactRadioCallSignID <em>Contact Radio Call Sign ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactRadioType#getContactRadioAugmentationPointGroup <em>Contact Radio Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactRadioType#getContactRadioAugmentationPoint <em>Contact Radio Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactRadioType()
 * @model extendedMetaData="name='ContactRadioType' kind='elementOnly'"
 * @generated
 */
public interface ContactRadioType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Contact Radio Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of wavelength or band of a radio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Radio Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactRadioType_ContactRadioCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactRadioCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getContactRadioCategoryText();

	/**
	 * Returns the value of the '<em><b>Contact Radio Channel Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A radio channel or frequency within the band.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Radio Channel Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactRadioType_ContactRadioChannelText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactRadioChannelText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getContactRadioChannelText();

	/**
	 * Returns the value of the '<em><b>Contact Radio Call Sign ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a person using a radio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Radio Call Sign ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactRadioType_ContactRadioCallSignID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactRadioCallSignID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getContactRadioCallSignID();

	/**
	 * Returns the value of the '<em><b>Contact Radio Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ContactRadioType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Radio Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactRadioType_ContactRadioAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContactRadioAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getContactRadioAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Contact Radio Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ContactRadioType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Radio Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactRadioType_ContactRadioAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactRadioAugmentationPoint' namespace='##targetNamespace' group='ContactRadioAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getContactRadioAugmentationPoint();

} // ContactRadioType
