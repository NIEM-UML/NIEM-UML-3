/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Language Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a language capability of a person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getLanguageGroup <em>Language Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getLanguage <em>Language</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getPersonComprehendsSpokenLanguageIndicator <em>Person Comprehends Spoken Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getPersonReadsLanguageIndicator <em>Person Reads Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getPersonSpeaksLanguageIndicator <em>Person Speaks Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getPersonWritesLanguageIndicator <em>Person Writes Language Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getPersonLanguageAugmentationPointGroup <em>Person Language Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonLanguageType#getPersonLanguageAugmentationPoint <em>Person Language Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType()
 * @model extendedMetaData="name='PersonLanguageType' kind='elementOnly'"
 * @generated
 */
public interface PersonLanguageType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Language Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a system of words or symbols used for communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_LanguageGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Language:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLanguageGroup();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a system of words or symbols used for communication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_Language()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Language' namespace='##targetNamespace' group='Language:group'"
	 * @generated
	 */
	EList<EObject> getLanguage();

	/**
	 * Returns the value of the '<em><b>Person Comprehends Spoken Language Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is able to grasp and understand the meaning of a language being spoken; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Comprehends Spoken Language Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_PersonComprehendsSpokenLanguageIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonComprehendsSpokenLanguageIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonComprehendsSpokenLanguageIndicator();

	/**
	 * Returns the value of the '<em><b>Person Reads Language Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is able to read a language; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Reads Language Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_PersonReadsLanguageIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonReadsLanguageIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonReadsLanguageIndicator();

	/**
	 * Returns the value of the '<em><b>Person Speaks Language Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is able to speak a language; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Speaks Language Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_PersonSpeaksLanguageIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSpeaksLanguageIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonSpeaksLanguageIndicator();

	/**
	 * Returns the value of the '<em><b>Person Writes Language Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is able to write a language; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Writes Language Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_PersonWritesLanguageIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonWritesLanguageIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonWritesLanguageIndicator();

	/**
	 * Returns the value of the '<em><b>Person Language Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonLanguageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Language Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_PersonLanguageAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonLanguageAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonLanguageAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Language Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonLanguageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Language Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonLanguageType_PersonLanguageAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonLanguageAugmentationPoint' namespace='##targetNamespace' group='PersonLanguageAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonLanguageAugmentationPoint();

} // PersonLanguageType
