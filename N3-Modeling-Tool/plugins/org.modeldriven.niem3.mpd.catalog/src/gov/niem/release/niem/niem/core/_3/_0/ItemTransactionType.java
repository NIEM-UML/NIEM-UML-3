/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a transfer of ownership of an item.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType#getItemSeller <em>Item Seller</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType#getItemPurchasePriceValue <em>Item Purchase Price Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType#getItemBuyer <em>Item Buyer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType#getItemTransactionAugmentationPointGroup <em>Item Transaction Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemTransactionType#getItemTransactionAugmentationPoint <em>Item Transaction Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType()
 * @model extendedMetaData="name='ItemTransactionType' kind='elementOnly'"
 * @generated
 */
public interface ItemTransactionType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Item Seller</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that sells a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Seller</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType_ItemSeller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemSeller' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getItemSeller();

	/**
	 * Returns the value of the '<em><b>Item Purchase Price Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money a buyer paid a seller for a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Purchase Price Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType_ItemPurchasePriceValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemPurchasePriceValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemValueType> getItemPurchasePriceValue();

	/**
	 * Returns the value of the '<em><b>Item Buyer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A party that bought a property item in a property transaction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Buyer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType_ItemBuyer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemBuyer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getItemBuyer();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An article or thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Item Transaction Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemTransactionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Transaction Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType_ItemTransactionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemTransactionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemTransactionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Transaction Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemTransactionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Transaction Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemTransactionType_ItemTransactionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemTransactionAugmentationPoint' namespace='##targetNamespace' group='ItemTransactionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemTransactionAugmentationPoint();

} // ItemTransactionType
