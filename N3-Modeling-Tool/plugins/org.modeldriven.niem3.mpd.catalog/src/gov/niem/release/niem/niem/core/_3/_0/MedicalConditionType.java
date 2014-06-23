/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medical Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a state of health, on-going or present.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionText <em>Medical Condition Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionCauseText <em>Medical Condition Cause Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionDescriptionText <em>Medical Condition Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionPresentIndicator <em>Medical Condition Present Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionSeverityText <em>Medical Condition Severity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionAugmentationPointGroup <em>Medical Condition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MedicalConditionType#getMedicalConditionAugmentationPoint <em>Medical Condition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType()
 * @model extendedMetaData="name='MedicalConditionType' kind='elementOnly'"
 * @generated
 */
public interface MedicalConditionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Medical Condition Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state of health, on-going or present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicalConditionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMedicalConditionText();

	/**
	 * Returns the value of the '<em><b>Medical Condition Cause Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A trigger that can initiate the onset of a medical condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Cause Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionCauseText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicalConditionCauseText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMedicalConditionCauseText();

	/**
	 * Returns the value of the '<em><b>Medical Condition Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a medical condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicalConditionDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMedicalConditionDescriptionText();

	/**
	 * Returns the value of the '<em><b>Medical Condition Present Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a medical condition currently exists; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Present Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionPresentIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicalConditionPresentIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMedicalConditionPresentIndicator();

	/**
	 * Returns the value of the '<em><b>Medical Condition Severity Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A degree to which a medical condition is affecting a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Severity Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionSeverityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MedicalConditionSeverityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMedicalConditionSeverityText();

	/**
	 * Returns the value of the '<em><b>Medical Condition Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MedicalConditionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MedicalConditionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMedicalConditionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Medical Condition Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MedicalConditionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medical Condition Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMedicalConditionType_MedicalConditionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicalConditionAugmentationPoint' namespace='##targetNamespace' group='MedicalConditionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getMedicalConditionAugmentationPoint();

} // MedicalConditionType
