/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a requirement or stipulation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionGroupID <em>Condition Group ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionSetDate <em>Condition Set Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionDisciplinaryAction <em>Condition Disciplinary Action</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionMandatoryIndicator <em>Condition Mandatory Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionViolatedIndicator <em>Condition Violated Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionViolationText <em>Condition Violation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionViolationDate <em>Condition Violation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionAugmentationPointGroup <em>Condition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ConditionType#getConditionAugmentationPoint <em>Condition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType()
 * @model extendedMetaData="name='ConditionType' kind='elementOnly'"
 * @generated
 */
public interface ConditionType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Condition Group ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a group of conditions to which this condition belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Group ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionGroupID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionGroupID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getConditionGroupID();

	/**
	 * Returns the value of the '<em><b>Condition Set Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a condition was set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Set Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionSetDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionSetDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getConditionSetDate();

	/**
	 * Returns the value of the '<em><b>Condition Disciplinary Action</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A corrective action that is specified as part of a condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Disciplinary Action</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionDisciplinaryAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionDisciplinaryAction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DisciplinaryActionType> getConditionDisciplinaryAction();

	/**
	 * Returns the value of the '<em><b>Condition Mandatory Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a condition is strictly required; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Mandatory Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionMandatoryIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionMandatoryIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConditionMandatoryIndicator();

	/**
	 * Returns the value of the '<em><b>Condition Violated Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a condition has been violated; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Violated Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionViolatedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionViolatedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConditionViolatedIndicator();

	/**
	 * Returns the value of the '<em><b>Condition Violation Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A violation of a condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Violation Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionViolationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionViolationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getConditionViolationText();

	/**
	 * Returns the value of the '<em><b>Condition Violation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a condition was violated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Violation Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionViolationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConditionViolationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getConditionViolationDate();

	/**
	 * Returns the value of the '<em><b>Condition Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ConditionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ConditionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getConditionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Condition Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ConditionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getConditionType_ConditionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConditionAugmentationPoint' namespace='##targetNamespace' group='ConditionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getConditionAugmentationPoint();

} // ConditionType
