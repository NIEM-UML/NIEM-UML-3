/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Sub Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a facility and its sub-facility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType#getParentFacility <em>Parent Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType#getSubFacility <em>Sub Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType#getFacilitySubFacilityAssociationAugmentationPointGroup <em>Facility Sub Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType#getFacilitySubFacilityAssociationAugmentationPoint <em>Facility Sub Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySubFacilityAssociationType()
 * @model extendedMetaData="name='FacilitySubFacilityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface FacilitySubFacilityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Parent Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A facility that contains another facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySubFacilityAssociationType_ParentFacility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParentFacility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getParentFacility();

	/**
	 * Returns the value of the '<em><b>Sub Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A facility within another facility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySubFacilityAssociationType_SubFacility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubFacility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getSubFacility();

	/**
	 * Returns the value of the '<em><b>Facility Sub Facility Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilitySubFacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Sub Facility Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySubFacilityAssociationType_FacilitySubFacilityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilitySubFacilityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilitySubFacilityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Facility Sub Facility Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilitySubFacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Sub Facility Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilitySubFacilityAssociationType_FacilitySubFacilityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilitySubFacilityAssociationAugmentationPoint' namespace='##targetNamespace' group='FacilitySubFacilityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFacilitySubFacilityAssociationAugmentationPoint();

} // FacilitySubFacilityAssociationType
