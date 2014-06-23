/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disciplinary Action Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an activity assigned to a person for the purpose of self-improvement, punishment, or restitution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionPerson <em>Disciplinary Action Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionAssigner <em>Disciplinary Action Assigner</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionCommunityService <em>Disciplinary Action Community Service</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionEnforcer <em>Disciplinary Action Enforcer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionCounseling <em>Disciplinary Action Counseling</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionFee <em>Disciplinary Action Fee</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionProgram <em>Disciplinary Action Program</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionRestitution <em>Disciplinary Action Restitution</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionAugmentationPointGroup <em>Disciplinary Action Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType#getDisciplinaryActionAugmentationPoint <em>Disciplinary Action Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType()
 * @model extendedMetaData="name='DisciplinaryActionType' kind='elementOnly'"
 * @generated
 */
public interface DisciplinaryActionType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Disciplinary Action Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person to whom a disciplinary action is assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getDisciplinaryActionPerson();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Assigner</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which assigns a disciplinary action to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Assigner</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionAssigner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionAssigner' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDisciplinaryActionAssigner();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Community Service</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A recommendation or requirement for a person to perform community service as a disciplinary action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Community Service</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionCommunityService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionCommunityService' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getDisciplinaryActionCommunityService();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Enforcer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity responsible for ensuring a person performs the assigned disciplinary action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Enforcer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionEnforcer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionEnforcer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getDisciplinaryActionEnforcer();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Counseling</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A recommendation or requirement for a person to attend counseling as a disciplinary action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Counseling</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionCounseling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionCounseling' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getDisciplinaryActionCounseling();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Fee</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ObligationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A monetary fine assigned to a person as a disciplinary action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Fee</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionFee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionFee' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObligationType> getDisciplinaryActionFee();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Program</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProgramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A recommendation or requirement for a person to attend a program as a disciplinary action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Program</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionProgram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProgramType> getDisciplinaryActionProgram();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Restitution</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ObligationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A requirement for a person to financially or otherwise compensate another person as  a disciplinary action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Restitution</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionRestitution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionRestitution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObligationType> getDisciplinaryActionRestitution();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DisciplinaryActionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DisciplinaryActionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDisciplinaryActionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Disciplinary Action Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DisciplinaryActionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disciplinary Action Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDisciplinaryActionType_DisciplinaryActionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DisciplinaryActionAugmentationPoint' namespace='##targetNamespace' group='DisciplinaryActionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDisciplinaryActionAugmentationPoint();

} // DisciplinaryActionType
