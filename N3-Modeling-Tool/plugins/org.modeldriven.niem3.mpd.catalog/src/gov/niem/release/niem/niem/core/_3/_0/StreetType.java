/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Street Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a road, thoroughfare, or highway.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetFullText <em>Street Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetNumberText <em>Street Number Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetPredirectionalText <em>Street Predirectional Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetCategoryText <em>Street Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetPostdirectionalText <em>Street Postdirectional Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetExtensionText <em>Street Extension Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetAugmentationPointGroup <em>Street Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StreetType#getStreetAugmentationPoint <em>Street Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType()
 * @model extendedMetaData="name='StreetType' kind='elementOnly'"
 * @generated
 */
public interface StreetType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Street Full Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complete reference for a street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Full Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetFullText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetFullText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStreetFullText();

	/**
	 * Returns the value of the '<em><b>Street Number Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number that identifies a particular unit or location within a street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Number Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetNumberText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetNumberText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStreetNumberText();

	/**
	 * Returns the value of the '<em><b>Street Predirectional Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A direction that appears before a street name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Predirectional Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetPredirectionalText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetPredirectionalText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStreetPredirectionalText();

	/**
	 * Returns the value of the '<em><b>Street Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getStreetName();

	/**
	 * Returns the value of the '<em><b>Street Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStreetCategoryText();

	/**
	 * Returns the value of the '<em><b>Street Postdirectional Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A direction that appears after a street name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Postdirectional Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetPostdirectionalText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetPostdirectionalText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStreetPostdirectionalText();

	/**
	 * Returns the value of the '<em><b>Street Extension Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An additional part of a street reference that follows the street category and post directional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Extension Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetExtensionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StreetExtensionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStreetExtensionText();

	/**
	 * Returns the value of the '<em><b>Street Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for StreetType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StreetAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStreetAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Street Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for StreetType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStreetType_StreetAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StreetAugmentationPoint' namespace='##targetNamespace' group='StreetAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getStreetAugmentationPoint();

} // StreetType
