/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a single or set of related actions, events, or process steps.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityIdentification <em>Activity Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityCategoryText <em>Activity Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityDateRepresentationGroup <em>Activity Date Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityDateRepresentation <em>Activity Date Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityDescriptionText <em>Activity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityStatus <em>Activity Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityReasonText <em>Activity Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityDispositionGroup <em>Activity Disposition Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityDisposition <em>Activity Disposition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityAugmentationPointGroup <em>Activity Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityType#getActivityAugmentationPoint <em>Activity Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType()
 * @model extendedMetaData="name='ActivityType' kind='elementOnly'"
 * @generated
 */
public interface ActivityType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Activity Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification that references an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getActivityIdentification();

	/**
	 * Returns the value of the '<em><b>Activity Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getActivityCategoryText();

	/**
	 * Returns the value of the '<em><b>Activity Date Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a date an activity occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Date Representation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityDateRepresentationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityDateRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityDateRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Activity Date Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a date an activity occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Date Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityDateRepresentation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityDateRepresentation' namespace='##targetNamespace' group='ActivityDateRepresentation:group'"
	 * @generated
	 */
	EList<EObject> getActivityDateRepresentation();

	/**
	 * Returns the value of the '<em><b>Activity Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getActivityDescriptionText();

	/**
	 * Returns the value of the '<em><b>Activity Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getActivityName();

	/**
	 * Returns the value of the '<em><b>Activity Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getActivityStatus();

	/**
	 * Returns the value of the '<em><b>Activity Reason Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reason for an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Reason Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityReasonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getActivityReasonText();

	/**
	 * Returns the value of the '<em><b>Activity Disposition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A result or outcome of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Disposition Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityDispositionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityDisposition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityDispositionGroup();

	/**
	 * Returns the value of the '<em><b>Activity Disposition</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DispositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A result or outcome of an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Disposition</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityDisposition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityDisposition' namespace='##targetNamespace' group='ActivityDisposition:group'"
	 * @generated
	 */
	EList<DispositionType> getActivityDisposition();

	/**
	 * Returns the value of the '<em><b>Activity Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityType_ActivityAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityAugmentationPoint' namespace='##targetNamespace' group='ActivityAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityAugmentationPoint();

} // ActivityType
