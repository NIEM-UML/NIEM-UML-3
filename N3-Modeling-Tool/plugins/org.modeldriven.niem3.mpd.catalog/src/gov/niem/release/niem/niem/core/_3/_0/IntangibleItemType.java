/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intangible Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an intellectual property item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntangibleItemType#getIntangibleItemCategoryGroup <em>Intangible Item Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntangibleItemType#getIntangibleItemCategory <em>Intangible Item Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntangibleItemType#getIntellectualItemBusinessAreaText <em>Intellectual Item Business Area Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntangibleItemType#getIntangibleItemAugmentationPointGroup <em>Intangible Item Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntangibleItemType#getIntangibleItemAugmentationPoint <em>Intangible Item Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntangibleItemType()
 * @model extendedMetaData="name='IntangibleItemType' kind='elementOnly'"
 * @generated
 */
public interface IntangibleItemType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Intangible Item Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of intangible item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intangible Item Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntangibleItemType_IntangibleItemCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IntangibleItemCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntangibleItemCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Intangible Item Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of intangible item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intangible Item Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntangibleItemType_IntangibleItemCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntangibleItemCategory' namespace='##targetNamespace' group='IntangibleItemCategory:group'"
	 * @generated
	 */
	EList<EObject> getIntangibleItemCategory();

	/**
	 * Returns the value of the '<em><b>Intellectual Item Business Area Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A business or functional area in which an intellectual item is useful.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Item Business Area Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntangibleItemType_IntellectualItemBusinessAreaText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualItemBusinessAreaText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIntellectualItemBusinessAreaText();

	/**
	 * Returns the value of the '<em><b>Intangible Item Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IntangibleItemType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intangible Item Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntangibleItemType_IntangibleItemAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IntangibleItemAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntangibleItemAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Intangible Item Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IntangibleItemType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intangible Item Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntangibleItemType_IntangibleItemAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntangibleItemAugmentationPoint' namespace='##targetNamespace' group='IntangibleItemAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getIntangibleItemAugmentationPoint();

} // IntangibleItemType
