/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Conveyance Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an activity and a conveyance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType#getConveyance <em>Conveyance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType#getActivityConveyanceAssociationAugmentationPointGroup <em>Activity Conveyance Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType#getActivityConveyanceAssociationAugmentationPoint <em>Activity Conveyance Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityConveyanceAssociationType()
 * @model extendedMetaData="name='ActivityConveyanceAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ActivityConveyanceAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single or set of related actions, events, or process steps.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityConveyanceAssociationType_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Activity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getActivity();

	/**
	 * Returns the value of the '<em><b>Conveyance</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ConveyanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A means of transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityConveyanceAssociationType_Conveyance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conveyance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConveyanceType> getConveyance();

	/**
	 * Returns the value of the '<em><b>Activity Conveyance Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityConveyanceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Conveyance Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityConveyanceAssociationType_ActivityConveyanceAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ActivityConveyanceAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getActivityConveyanceAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Activity Conveyance Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ActivityConveyanceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity Conveyance Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getActivityConveyanceAssociationType_ActivityConveyanceAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ActivityConveyanceAssociationAugmentationPoint' namespace='##targetNamespace' group='ActivityConveyanceAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getActivityConveyanceAssociationAugmentationPoint();

} // ActivityConveyanceAssociationType
