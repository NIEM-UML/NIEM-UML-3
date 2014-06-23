/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Previous Activity Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and a previous activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PreviousActivityAssociationType#getPreviousActivity <em>Previous Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PreviousActivityAssociationType#getPreviousActivityAssociationAugmentationPointGroup <em>Previous Activity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PreviousActivityAssociationType#getPreviousActivityAssociationAugmentationPoint <em>Previous Activity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPreviousActivityAssociationType()
 * @model extendedMetaData="name='PreviousActivityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PreviousActivityAssociationType extends RelatedActivityAssociationType {
	/**
	 * Returns the value of the '<em><b>Previous Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity that occurred previously.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPreviousActivityAssociationType_PreviousActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PreviousActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getPreviousActivity();

	/**
	 * Returns the value of the '<em><b>Previous Activity Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:PreviousActivityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Activity Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPreviousActivityAssociationType_PreviousActivityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PreviousActivityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPreviousActivityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Previous Activity Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:PreviousActivityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Activity Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPreviousActivityAssociationType_PreviousActivityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PreviousActivityAssociationAugmentationPoint' namespace='##targetNamespace' group='PreviousActivityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPreviousActivityAssociationAugmentationPoint();

} // PreviousActivityAssociationType
