/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between facilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityAssociationType#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityAssociationType#getFacilityAssociationAugmentationPointGroup <em>Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityAssociationType#getFacilityAssociationAugmentationPoint <em>Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityAssociationType()
 * @model extendedMetaData="name='FacilityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface FacilityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A building, place, or structure that provides a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityAssociationType_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getFacility();

	/**
	 * Returns the value of the '<em><b>Facility Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityAssociationType_FacilityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Facility Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityAssociationType_FacilityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilityAssociationAugmentationPoint' namespace='##targetNamespace' group='FacilityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFacilityAssociationAugmentationPoint();

} // FacilityAssociationType
