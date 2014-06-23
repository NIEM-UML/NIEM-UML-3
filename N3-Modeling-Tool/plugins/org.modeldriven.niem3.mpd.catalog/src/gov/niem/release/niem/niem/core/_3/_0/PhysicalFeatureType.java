/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a prominent or easily identifiable aspect of something or someone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureGeneralCategoryText <em>Physical Feature General Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureCategoryGroup <em>Physical Feature Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureCategory <em>Physical Feature Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureDescriptionText <em>Physical Feature Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureImage <em>Physical Feature Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureLocationText <em>Physical Feature Location Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureAugmentationPointGroup <em>Physical Feature Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType#getPhysicalFeatureAugmentationPoint <em>Physical Feature Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType()
 * @model extendedMetaData="name='PhysicalFeatureType' kind='elementOnly'"
 * @generated
 */
public interface PhysicalFeatureType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Physical Feature General Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general kind of physical feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature General Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureGeneralCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysicalFeatureGeneralCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPhysicalFeatureGeneralCategoryText();

	/**
	 * Returns the value of the '<em><b>Physical Feature Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a specific kind of physical feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PhysicalFeatureCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPhysicalFeatureCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Physical Feature Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a specific kind of physical feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhysicalFeatureCategory' namespace='##targetNamespace' group='PhysicalFeatureCategory:group'"
	 * @generated
	 */
	EList<EObject> getPhysicalFeatureCategory();

	/**
	 * Returns the value of the '<em><b>Physical Feature Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a physical feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysicalFeatureDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPhysicalFeatureDescriptionText();

	/**
	 * Returns the value of the '<em><b>Physical Feature Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A digital image of a physical feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysicalFeatureImage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getPhysicalFeatureImage();

	/**
	 * Returns the value of the '<em><b>Physical Feature Location Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location on a person's body of a physical feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Location Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureLocationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhysicalFeatureLocationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPhysicalFeatureLocationText();

	/**
	 * Returns the value of the '<em><b>Physical Feature Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PhysicalFeatureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PhysicalFeatureAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPhysicalFeatureAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Physical Feature Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PhysicalFeatureType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Feature Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPhysicalFeatureType_PhysicalFeatureAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhysicalFeatureAugmentationPoint' namespace='##targetNamespace' group='PhysicalFeatureAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPhysicalFeatureAugmentationPoint();

} // PhysicalFeatureType
