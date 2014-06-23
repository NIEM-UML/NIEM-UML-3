/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Organization Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType#getActivityInvolvementGroup <em>Activity Involvement Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType#getActivityInvolvement <em>Activity Involvement</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType#getActivityOrganizationAssociationAugmentationPointGroup <em>Activity Organization Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType#getActivityOrganizationAssociationAugmentationPoint <em>Activity Organization Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType()
 * @model extendedMetaData="name='ActivityOrganizationAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivityOrganizationAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit which conducts some sort of business or operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

	/**
	 * Returns the value of the '<em><b>Activity Involvement Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a description of the involvement of an entity in an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Involvement Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType_ActivityInvolvementGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityInvolvement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityInvolvementGroup();

	/**
	 * Returns the value of the '<em><b>Activity Involvement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a description of the involvement of an entity in an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Involvement</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType_ActivityInvolvement()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityInvolvement' namespace='##targetNamespace' group='ActivityInvolvement:group'"
	 * @generated
	 */
	EList<EObject> getActivityInvolvement();

	/**
	 * Returns the value of the '<em><b>Activity Organization Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityOrganizationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Organization Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType_ActivityOrganizationAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityOrganizationAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityOrganizationAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Organization Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityOrganizationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Organization Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityOrganizationAssociationType_ActivityOrganizationAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityOrganizationAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivityOrganizationAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityOrganizationAssociationAugmentationPoint();

} // ActivityOrganizationAssociationType
