/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Activity Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between related activities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType#getActivityRelationText <em>Activity Relation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType#getRelatedActivityAssociationAugmentationPointGroup <em>Related Activity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType#getRelatedActivityAssociationAugmentationPoint <em>Related Activity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelatedActivityAssociationType()
 * @model extendedMetaData="name='RelatedActivityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface RelatedActivityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelatedActivityAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Activity Relation Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A relationship between activities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Relation Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelatedActivityAssociationType_ActivityRelationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ActivityRelationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getActivityRelationText();

	/**
	 * Returns the value of the '<em><b>Related Activity Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for RelatedActivityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Activity Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelatedActivityAssociationType_RelatedActivityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RelatedActivityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getRelatedActivityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Related Activity Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for RelatedActivityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Activity Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelatedActivityAssociationType_RelatedActivityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatedActivityAssociationAugmentationPoint' namespace='##targetNamespace' group='RelatedActivityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getRelatedActivityAssociationAugmentationPoint();

} // RelatedActivityAssociationType
