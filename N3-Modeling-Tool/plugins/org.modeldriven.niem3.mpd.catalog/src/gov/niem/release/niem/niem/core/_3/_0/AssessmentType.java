/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an evaluation, appraisal, or assessment of something or someone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentAssessor <em>Assessment Assessor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentScoreText <em>Assessment Score Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentFee <em>Assessment Fee</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentProgram <em>Assessment Program</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentReferral <em>Assessment Referral</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentPerson <em>Assessment Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentAugmentationPointGroup <em>Assessment Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssessmentType#getAssessmentAugmentationPoint <em>Assessment Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType()
 * @model extendedMetaData="name='AssessmentType' kind='elementOnly'"
 * @generated
 */
public interface AssessmentType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Assessment Assessor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who performs an assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Assessor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentAssessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssessmentAssessor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getAssessmentAssessor();

	/**
	 * Returns the value of the '<em><b>Assessment Score Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An evaluation score of an assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Score Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentScoreText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssessmentScoreText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAssessmentScoreText();

	/**
	 * Returns the value of the '<em><b>Assessment Fee</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ObligationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money charged to perform an assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Fee</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentFee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssessmentFee' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObligationType> getAssessmentFee();

	/**
	 * Returns the value of the '<em><b>Assessment Program</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProgramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A program a person attends or undergoes in which an assessment is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Program</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentProgram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssessmentProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProgramType> getAssessmentProgram();

	/**
	 * Returns the value of the '<em><b>Assessment Referral</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ReferralType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An order or direction for an assessment to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Referral</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentReferral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssessmentReferral' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferralType> getAssessmentReferral();

	/**
	 * Returns the value of the '<em><b>Assessment Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who undergoes an assessment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssessmentPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getAssessmentPerson();

	/**
	 * Returns the value of the '<em><b>Assessment Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AssessmentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AssessmentAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAssessmentAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Assessment Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AssessmentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessment Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssessmentType_AssessmentAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssessmentAugmentationPoint' namespace='##targetNamespace' group='AssessmentAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAssessmentAugmentationPoint();

} // AssessmentType
