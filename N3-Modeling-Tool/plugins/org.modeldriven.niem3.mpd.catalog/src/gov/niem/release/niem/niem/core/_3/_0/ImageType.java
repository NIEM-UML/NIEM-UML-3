/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a picture or visual representation of something.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ImageType#getImageHeightValue <em>Image Height Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ImageType#getImageLocation <em>Image Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ImageType#getImageWidthValue <em>Image Width Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ImageType#getImageAugmentationPointGroup <em>Image Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ImageType#getImageAugmentationPoint <em>Image Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getImageType()
 * @model extendedMetaData="name='ImageType' kind='elementOnly'"
 * @generated
 */
public interface ImageType extends BinaryType {
	/**
	 * Returns the value of the '<em><b>Image Height Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A height of an image in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Height Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getImageType_ImageHeightValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageHeightValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getImageHeightValue();

	/**
	 * Returns the value of the '<em><b>Image Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical location where an image is stored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getImageType_ImageLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getImageLocation();

	/**
	 * Returns the value of the '<em><b>Image Width Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A width of an image in pixels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Width Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getImageType_ImageWidthValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageWidthValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getImageWidthValue();

	/**
	 * Returns the value of the '<em><b>Image Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ImageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getImageType_ImageAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ImageAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getImageAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Image Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ImageType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getImageType_ImageAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageAugmentationPoint' namespace='##targetNamespace' group='ImageAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getImageAugmentationPoint();

} // ImageType
