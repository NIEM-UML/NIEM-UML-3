/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Image Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a facility and an image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType#getImage <em>Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType#getFacilityImageAssociationAugmentationPointGroup <em>Facility Image Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType#getFacilityImageAssociationAugmentationPoint <em>Facility Image Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityImageAssociationType()
 * @model extendedMetaData="name='FacilityImageAssociationType' kind='elementOnly'"
 * @generated
 */
public interface FacilityImageAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A building, place, or structure that provides a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityImageAssociationType_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getFacility();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A picture or visual representation of something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityImageAssociationType_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Image' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getImage();

	/**
	 * Returns the value of the '<em><b>Facility Image Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityImageAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Image Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityImageAssociationType_FacilityImageAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='FacilityImageAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFacilityImageAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Facility Image Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for FacilityImageAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Image Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getFacilityImageAssociationType_FacilityImageAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FacilityImageAssociationAugmentationPoint' namespace='##targetNamespace' group='FacilityImageAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getFacilityImageAssociationAugmentationPoint();

} // FacilityImageAssociationType
