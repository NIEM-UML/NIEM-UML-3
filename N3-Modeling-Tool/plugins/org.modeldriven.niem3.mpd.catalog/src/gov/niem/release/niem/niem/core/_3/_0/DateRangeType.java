/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a range of dates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateRangeType#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateRangeType#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateRangeType#getDateRangeAugmentationPointGroup <em>Date Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DateRangeType#getDateRangeAugmentationPoint <em>Date Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateRangeType()
 * @model extendedMetaData="name='DateRangeType' kind='elementOnly'"
 * @generated
 */
public interface DateRangeType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date on which something begins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateRangeType_StartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getStartDate();

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An end date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateRangeType_EndDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getEndDate();

	/**
	 * Returns the value of the '<em><b>Date Range Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DateRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Range Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateRangeType_DateRangeAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DateRangeAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDateRangeAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Date Range Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DateRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Range Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDateRangeType_DateRangeAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateRangeAugmentationPoint' namespace='##targetNamespace' group='DateRangeAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDateRangeAugmentationPoint();

} // DateRangeType
