/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Schedule Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and its schedule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType#getScheduleDay <em>Schedule Day</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType#getActivityScheduleAssociationAugmentationPointGroup <em>Activity Schedule Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityScheduleAssociationType#getActivityScheduleAssociationAugmentationPoint <em>Activity Schedule Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityScheduleAssociationType()
 * @model extendedMetaData="name='ActivityScheduleAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivityScheduleAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityScheduleAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Schedule Day</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan or agenda for the activities of a day or dates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityScheduleAssociationType_ScheduleDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleDay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScheduleDayType> getScheduleDay();

	/**
	 * Returns the value of the '<em><b>Activity Schedule Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityScheduleAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Schedule Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityScheduleAssociationType_ActivityScheduleAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityScheduleAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityScheduleAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Schedule Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityScheduleAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Schedule Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityScheduleAssociationType_ActivityScheduleAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityScheduleAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivityScheduleAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityScheduleAssociationAugmentationPoint();

} // ActivityScheduleAssociationType
