/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a set of projects, activities, or services intended to meet a need.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramPerson <em>Program Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramAction <em>Program Action</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramCapacityQuantity <em>Program Capacity Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramCondition <em>Program Condition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramFacility <em>Program Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramPubliclyRunIndicator <em>Program Publicly Run Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramPurposeText <em>Program Purpose Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramReferral <em>Program Referral</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramAdministrator <em>Program Administrator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramRelease <em>Program Release</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramSupervisor <em>Program Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramResidentialIndicator <em>Program Residential Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramSupervisedIndicator <em>Program Supervised Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramAugmentationPointGroup <em>Program Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgramType#getProgramAugmentationPoint <em>Program Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType()
 * @model extendedMetaData="name='ProgramType' kind='elementOnly'"
 * @generated
 */
public interface ProgramType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Program Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who attends a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getProgramPerson();

	/**
	 * Returns the value of the '<em><b>Program Action</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A project or service of a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Action</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getProgramAction();

	/**
	 * Returns the value of the '<em><b>Program Capacity Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum number of people that can be enrolled in a program at a time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Capacity Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramCapacityQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramCapacityQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getProgramCapacityQuantity();

	/**
	 * Returns the value of the '<em><b>Program Condition</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A condition that must be met in order for a person to remain in a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Condition</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConditionType> getProgramCondition();

	/**
	 * Returns the value of the '<em><b>Program Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A place where a program is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramFacility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramFacility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getProgramFacility();

	/**
	 * Returns the value of the '<em><b>Program Publicly Run Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a program is run in the public sector; false if the program is run privately.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Publicly Run Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramPubliclyRunIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramPubliclyRunIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgramPubliclyRunIndicator();

	/**
	 * Returns the value of the '<em><b>Program Purpose Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A purpose or reason for a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Purpose Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramPurposeText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramPurposeText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getProgramPurposeText();

	/**
	 * Returns the value of the '<em><b>Program Referral</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ReferralType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A recommendation or mandate for a person to attend a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Referral</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramReferral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramReferral' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferralType> getProgramReferral();

	/**
	 * Returns the value of the '<em><b>Program Administrator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that runs a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Administrator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramAdministrator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramAdministrator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getProgramAdministrator();

	/**
	 * Returns the value of the '<em><b>Program Release</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ReleaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manner by which a person left a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Release</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramRelease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramRelease' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReleaseType> getProgramRelease();

	/**
	 * Returns the value of the '<em><b>Program Supervisor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that oversees and manages a program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Supervisor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramSupervisor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramSupervisor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getProgramSupervisor();

	/**
	 * Returns the value of the '<em><b>Program Residential Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person resides at a program facility; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Residential Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramResidentialIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramResidentialIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgramResidentialIndicator();

	/**
	 * Returns the value of the '<em><b>Program Supervised Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person will be officially supervised through the duration of a program; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Supervised Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramSupervisedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgramSupervisedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgramSupervisedIndicator();

	/**
	 * Returns the value of the '<em><b>Program Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ProgramType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ProgramAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getProgramAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Program Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ProgramType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgramType_ProgramAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProgramAugmentationPoint' namespace='##targetNamespace' group='ProgramAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getProgramAugmentationPoint();

} // ProgramType
