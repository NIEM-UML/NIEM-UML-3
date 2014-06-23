/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an evaluation of the monetary worth of an item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueAmount <em>Item Value Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueAssigningMethodGroup <em>Item Value Assigning Method Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueAssigningMethod <em>Item Value Assigning Method</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueDate <em>Item Value Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueDescriptionText <em>Item Value Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueTaxIncludedIndicator <em>Item Value Tax Included Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueAssigner <em>Item Value Assigner</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueAugmentationPointGroup <em>Item Value Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemValueType#getItemValueAugmentationPoint <em>Item Value Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType()
 * @model extendedMetaData="name='ItemValueType' kind='elementOnly'"
 * @generated
 */
public interface ItemValueType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Item Value Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A monetary value of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemValueAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AmountType> getItemValueAmount();

	/**
	 * Returns the value of the '<em><b>Item Value Assigning Method Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a method used to assign the value of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Assigning Method Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueAssigningMethodGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemValueAssigningMethod:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemValueAssigningMethodGroup();

	/**
	 * Returns the value of the '<em><b>Item Value Assigning Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a method used to assign the value of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Assigning Method</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueAssigningMethod()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemValueAssigningMethod' namespace='##targetNamespace' group='ItemValueAssigningMethod:group'"
	 * @generated
	 */
	EList<EObject> getItemValueAssigningMethod();

	/**
	 * Returns the value of the '<em><b>Item Value Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date an item value takes effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemValueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getItemValueDate();

	/**
	 * Returns the value of the '<em><b>Item Value Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the monetary worth of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemValueDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemValueDescriptionText();

	/**
	 * Returns the value of the '<em><b>Item Value Tax Included Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if taxes were included in the item value; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Tax Included Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueTaxIncludedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemValueTaxIncludedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getItemValueTaxIncludedIndicator();

	/**
	 * Returns the value of the '<em><b>Item Value Assigner</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which assigns a value to an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Assigner</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueAssigner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemValueAssigner' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getItemValueAssigner();

	/**
	 * Returns the value of the '<em><b>Item Value Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemValueType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemValueAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemValueAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Value Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemValueType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemValueType_ItemValueAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemValueAugmentationPoint' namespace='##targetNamespace' group='ItemValueAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemValueAugmentationPoint();

} // ItemValueType
