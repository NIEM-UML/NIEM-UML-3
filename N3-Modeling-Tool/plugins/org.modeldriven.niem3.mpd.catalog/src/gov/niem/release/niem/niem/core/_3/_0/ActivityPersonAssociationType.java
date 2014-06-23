/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Person Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and a person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType#getActivityInvolvementGroup <em>Activity Involvement Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType#getActivityInvolvement <em>Activity Involvement</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType#getActivityPersonAssociationAugmentationPointGroup <em>Activity Person Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType#getActivityPersonAssociationAugmentationPoint <em>Activity Person Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType()
 * @model extendedMetaData="name='ActivityPersonAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivityPersonAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human being.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Activity Involvement Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a description of the involvement of an entity in an activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Involvement Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType_ActivityInvolvementGroup()
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
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType_ActivityInvolvement()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityInvolvement' namespace='##targetNamespace' group='ActivityInvolvement:group'"
	 * @generated
	 */
	EList<EObject> getActivityInvolvement();

	/**
	 * Returns the value of the '<em><b>Activity Person Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityPersonAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Person Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType_ActivityPersonAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityPersonAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityPersonAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Person Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityPersonAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Person Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityPersonAssociationType_ActivityPersonAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityPersonAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivityPersonAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityPersonAssociationAugmentationPoint();

} // ActivityPersonAssociationType
