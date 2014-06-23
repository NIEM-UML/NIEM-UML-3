/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a schedule providing the beginning and ending hours of operation by weekday, for a designated time period.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleDay <em>Schedule Day</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleDescriptionText <em>Schedule Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleExceptionsDescriptionText <em>Schedule Exceptions Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleNonStopIndicator <em>Schedule Non Stop Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleStatus <em>Schedule Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleAugmentationPointGroup <em>Schedule Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ScheduleType#getScheduleAugmentationPoint <em>Schedule Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType()
 * @model extendedMetaData="name='ScheduleType' kind='elementOnly'"
 * @generated
 */
public interface ScheduleType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Schedule Day</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ScheduleDayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan or agenda for the activities of a day or dates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Day</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleDay()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleDay' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScheduleDayType> getScheduleDay();

	/**
	 * Returns the value of the '<em><b>Schedule Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getScheduleDescriptionText();

	/**
	 * Returns the value of the '<em><b>Schedule Exceptions Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of special exceptions to the given schedule, such as holiday hours or closings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Exceptions Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleExceptionsDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleExceptionsDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getScheduleExceptionsDescriptionText();

	/**
	 * Returns the value of the '<em><b>Schedule Non Stop Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the schedule applies 24 hours a day, 7 days a week; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Non Stop Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleNonStopIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleNonStopIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getScheduleNonStopIndicator();

	/**
	 * Returns the value of the '<em><b>Schedule Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An overall status for the schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ScheduleStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getScheduleStatus();

	/**
	 * Returns the value of the '<em><b>Schedule Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ScheduleType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScheduleAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScheduleAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Schedule Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ScheduleType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getScheduleType_ScheduleAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScheduleAugmentationPoint' namespace='##targetNamespace' group='ScheduleAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getScheduleAugmentationPoint();

} // ScheduleType
