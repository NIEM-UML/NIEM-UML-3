/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obligation Recurrence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a periodic basis on which an obligation must be met.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType#getObligationPeriodText <em>Obligation Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType#getObligationDateRange <em>Obligation Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType#getObligationRecurrenceAugmentationPointGroup <em>Obligation Recurrence Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ObligationRecurrenceType#getObligationRecurrenceAugmentationPoint <em>Obligation Recurrence Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationRecurrenceType()
 * @model extendedMetaData="name='ObligationRecurrenceType' kind='elementOnly'"
 * @generated
 */
public interface ObligationRecurrenceType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Obligation Period Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An interval or period at which an obligation is required to be fulfilled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Period Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationRecurrenceType_ObligationPeriodText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationPeriodText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getObligationPeriodText();

	/**
	 * Returns the value of the '<em><b>Obligation Date Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date range of an obligation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Date Range</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationRecurrenceType_ObligationDateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObligationDateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateRangeType> getObligationDateRange();

	/**
	 * Returns the value of the '<em><b>Obligation Recurrence Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObligationRecurrenceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Recurrence Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationRecurrenceType_ObligationRecurrenceAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObligationRecurrenceAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObligationRecurrenceAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Obligation Recurrence Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ObligationRecurrenceType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obligation Recurrence Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getObligationRecurrenceType_ObligationRecurrenceAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObligationRecurrenceAugmentationPoint' namespace='##targetNamespace' group='ObligationRecurrenceAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getObligationRecurrenceAugmentationPoint();

} // ObligationRecurrenceType
