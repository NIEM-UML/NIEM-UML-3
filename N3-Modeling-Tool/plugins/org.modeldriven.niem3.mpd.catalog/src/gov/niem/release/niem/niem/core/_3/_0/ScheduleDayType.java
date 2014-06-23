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
 * A representation of the model object '<em><b>Schedule Day Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a plan or agenda for the activities of a day.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleActivityText <em>Schedule Activity Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayRepresentationGroup <em>Schedule Day Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayRepresentation <em>Schedule Day Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayStatus <em>Schedule Day Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleTimeRange <em>Schedule Time Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getSchedulePerson <em>Schedule Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayStartTime <em>Schedule Day Start Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayEndTime <em>Schedule Day End Time</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayAugmentationPointGroup <em>Schedule Day Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType#getScheduleDayAugmentationPoint <em>Schedule Day Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType()
 * @model extendedMetaData="name='ScheduleDayType' kind='elementOnly'"
 * @generated
 */
public interface ScheduleDayType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Schedule Activity Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity planned to occur on a certain date and time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Activity Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleActivityText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleActivityText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getScheduleActivityText();

	/**
	 * Returns the value of the '<em><b>Schedule Day Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a day or days with the given schedule information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day Representation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayRepresentationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScheduleDayRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScheduleDayRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Schedule Day Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a day or days with the given schedule information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayRepresentation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScheduleDayRepresentation' namespace='##targetNamespace' group='ScheduleDayRepresentation:group'"
	 * @generated
	 */
	EList<EObject> getScheduleDayRepresentation();

	/**
	 * Returns the value of the '<em><b>Schedule Day Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A schedule status for a particular day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleDayStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getScheduleDayStatus();

	/**
	 * Returns the value of the '<em><b>Schedule Time Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TimeRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time range for the schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Time Range</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleTimeRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleTimeRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeRangeType> getScheduleTimeRange();

	/**
	 * Returns the value of the '<em><b>Schedule Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person for whom an activity is scheduled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_SchedulePerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SchedulePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getSchedulePerson();

	/**
	 * Returns the value of the '<em><b>Schedule Day Start Time</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time at which an activity is scheduled to begin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day Start Time</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayStartTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleDayStartTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Time> getScheduleDayStartTime();

	/**
	 * Returns the value of the '<em><b>Schedule Day End Time</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A time at which an activity is scheduled to end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day End Time</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayEndTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleDayEndTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Time> getScheduleDayEndTime();

	/**
	 * Returns the value of the '<em><b>Schedule Day Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ScheduleDayType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScheduleDayAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScheduleDayAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Schedule Day Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ScheduleDayType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleDayType_ScheduleDayAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScheduleDayAugmentationPoint' namespace='##targetNamespace' group='ScheduleDayAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getScheduleDayAugmentationPoint();

} // ScheduleDayType
