/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a set of changes or advancements which bring someone closer to completing something.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgressType#getProgressComplianceIndicator <em>Progress Compliance Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgressType#getProgressComplianceText <em>Progress Compliance Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgressType#getProgressPaymentAmount <em>Progress Payment Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgressType#getProgressTimeQuantityText <em>Progress Time Quantity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgressType#getProgressAugmentationPointGroup <em>Progress Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ProgressType#getProgressAugmentationPoint <em>Progress Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType()
 * @model extendedMetaData="name='ProgressType' kind='elementOnly'"
 * @generated
 */
public interface ProgressType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Progress Compliance Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a reported progress is acceptable according to the terms set; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Compliance Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType_ProgressComplianceIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgressComplianceIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgressComplianceIndicator();

	/**
	 * Returns the value of the '<em><b>Progress Compliance Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the compliance or non-compliance of a person with an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Compliance Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType_ProgressComplianceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgressComplianceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getProgressComplianceText();

	/**
	 * Returns the value of the '<em><b>Progress Payment Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money paid towards completion of a requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Payment Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType_ProgressPaymentAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgressPaymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AmountType> getProgressPaymentAmount();

	/**
	 * Returns the value of the '<em><b>Progress Time Quantity Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quantity of time spent towards completion of a requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Time Quantity Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType_ProgressTimeQuantityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProgressTimeQuantityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getProgressTimeQuantityText();

	/**
	 * Returns the value of the '<em><b>Progress Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ProgressType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType_ProgressAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ProgressAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getProgressAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Progress Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ProgressType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getProgressType_ProgressAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProgressAugmentationPoint' namespace='##targetNamespace' group='ProgressAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getProgressAugmentationPoint();

} // ProgressType
