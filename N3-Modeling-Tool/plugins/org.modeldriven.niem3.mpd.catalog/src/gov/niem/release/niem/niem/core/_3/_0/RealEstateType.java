/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Estate Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a piece of land and any permanent structures and natural resources on it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RealEstateType#getRealEstateAcreageText <em>Real Estate Acreage Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RealEstateType#getRealEstateBoundaryDescriptionText <em>Real Estate Boundary Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RealEstateType#getRealEstateAttachedFacility <em>Real Estate Attached Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RealEstateType#getRealEstateAugmentationPointGroup <em>Real Estate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RealEstateType#getRealEstateAugmentationPoint <em>Real Estate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRealEstateType()
 * @model extendedMetaData="name='RealEstateType' kind='elementOnly'"
 * @generated
 */
public interface RealEstateType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Real Estate Acreage Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An area of land measured in acres.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Estate Acreage Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRealEstateType_RealEstateAcreageText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEstateAcreageText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getRealEstateAcreageText();

	/**
	 * Returns the value of the '<em><b>Real Estate Boundary Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the boundary or real property limits of a piece of real estate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Estate Boundary Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRealEstateType_RealEstateBoundaryDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEstateBoundaryDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getRealEstateBoundaryDescriptionText();

	/**
	 * Returns the value of the '<em><b>Real Estate Attached Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A permanent structure attached or affixed to real estate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Estate Attached Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRealEstateType_RealEstateAttachedFacility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RealEstateAttachedFacility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getRealEstateAttachedFacility();

	/**
	 * Returns the value of the '<em><b>Real Estate Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for RealEstateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Estate Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRealEstateType_RealEstateAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RealEstateAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getRealEstateAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Real Estate Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for RealEstateType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Real Estate Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRealEstateType_RealEstateAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RealEstateAugmentationPoint' namespace='##targetNamespace' group='RealEstateAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getRealEstateAugmentationPoint();

} // RealEstateType
