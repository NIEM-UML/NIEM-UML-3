/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.Time;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a start and end time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TimeRangeType#getBeginTime <em>Begin Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TimeRangeType#getEndTime <em>End Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TimeRangeType#getTimeRangeAugmentationPointGroup <em>Time Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TimeRangeType#getTimeRangeAugmentationPoint <em>Time Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTimeRangeType()
 * @model extendedMetaData="name='TimeRangeType' kind='elementOnly'"
 * @generated
 */
public interface TimeRangeType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Begin Time</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A start or begin time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin Time</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTimeRangeType_BeginTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BeginTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Time> getBeginTime();

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An end time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTimeRangeType_EndTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Time> getEndTime();

	/**
	 * Returns the value of the '<em><b>Time Range Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TimeRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Range Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTimeRangeType_TimeRangeAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TimeRangeAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimeRangeAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Time Range Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TimeRangeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Range Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTimeRangeType_TimeRangeAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeRangeAugmentationPoint' namespace='##targetNamespace' group='TimeRangeAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getTimeRangeAugmentationPoint();

} // TimeRangeType
