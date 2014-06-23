/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and a facility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityFacilityAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityFacilityAssociationType#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityFacilityAssociationType#getActivityFacilityAssociationAugmentationPointGroup <em>Activity Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityFacilityAssociationType#getActivityFacilityAssociationAugmentationPoint <em>Activity Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityFacilityAssociationType()
 * @model extendedMetaData="name='ActivityFacilityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivityFacilityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityFacilityAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A building, place, or structure that provides a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityFacilityAssociationType_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getFacility();

	/**
	 * Returns the value of the '<em><b>Activity Facility Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityFacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Facility Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityFacilityAssociationType_ActivityFacilityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityFacilityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityFacilityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Facility Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityFacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Facility Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityFacilityAssociationType_ActivityFacilityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityFacilityAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivityFacilityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityFacilityAssociationAugmentationPoint();

} // ActivityFacilityAssociationType
