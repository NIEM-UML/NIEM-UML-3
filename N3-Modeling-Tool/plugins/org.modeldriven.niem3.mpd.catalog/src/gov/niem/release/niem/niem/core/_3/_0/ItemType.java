/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.GYear;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an article or thing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemName <em>Item Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemActionText <em>Item Action Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemBarCodeIdentification <em>Item Bar Code Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemConditionText <em>Item Condition Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemDealerIdentification <em>Item Dealer Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemDescriptionText <em>Item Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemDisposition <em>Item Disposition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemOtherIdentification <em>Item Other Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemOwner <em>Item Owner</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemOwnerAppliedID <em>Item Owner Applied ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemOwnerPurchasedValue <em>Item Owner Purchased Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemPossessionDescriptionText <em>Item Possession Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemPossessor <em>Item Possessor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemReceiptIdentification <em>Item Receipt Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemRFIdentification <em>Item RF Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemSerialIdentification <em>Item Serial Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemStateIdentification <em>Item State Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemStatus <em>Item Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemUsageText <em>Item Usage Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemValue <em>Item Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemVisibleID <em>Item Visible ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getWeaponIndicator <em>Weapon Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getWeaponUsageIndicator <em>Weapon Usage Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getConveyanceSalesTaxPercent <em>Conveyance Sales Tax Percent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemAgeMeasure <em>Item Age Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemBinary <em>Item Binary</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemBrandName <em>Item Brand Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemCategoryGroup <em>Item Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemCategory <em>Item Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemColorGroup <em>Item Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemColor <em>Item Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemCurrentResaleValue <em>Item Current Resale Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemFirstSoldYearDate <em>Item First Sold Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemHeightMeasure <em>Item Height Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemImage <em>Item Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemLeaseIndicator <em>Item Lease Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemLengthMeasure <em>Item Length Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemMakeName <em>Item Make Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemModelName <em>Item Model Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemModelYearDate <em>Item Model Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemOwnershipCategoryText <em>Item Ownership Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemQuantity <em>Item Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemRentalIndicator <em>Item Rental Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemSizeDescriptionText <em>Item Size Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemStyleGroup <em>Item Style Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemStyle <em>Item Style</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemWeightMeasure <em>Item Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemWidthMeasure <em>Item Width Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemAugmentationPointGroup <em>Item Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemType#getItemAugmentationPoint <em>Item Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType()
 * @model extendedMetaData="name='ItemType' kind='elementOnly'"
 * @generated
 */
public interface ItemType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemName();

	/**
	 * Returns the value of the '<em><b>Item Action Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action that was taken against a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Action Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemActionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemActionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemActionText();

	/**
	 * Returns the value of the '<em><b>Item Bar Code Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bar code identification assigned to a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Bar Code Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemBarCodeIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemBarCodeIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemBarCodeIdentification();

	/**
	 * Returns the value of the '<em><b>Item Condition Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state or appearance of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Condition Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemConditionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemConditionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemConditionText();

	/**
	 * Returns the value of the '<em><b>Item Dealer Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification assigned to an item by a dealer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Dealer Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemDealerIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemDealerIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemDealerIdentification();

	/**
	 * Returns the value of the '<em><b>Item Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemDescriptionText();

	/**
	 * Returns the value of the '<em><b>Item Disposition</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A result or outcome that happens to an item after it has been handled or processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Disposition</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemDisposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemDisposition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemDispositionType> getItemDisposition();

	/**
	 * Returns the value of the '<em><b>Item Other Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification assigned to an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Other Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemOtherIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemOtherIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemOtherIdentification();

	/**
	 * Returns the value of the '<em><b>Item Owner</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which owns a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Owner</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemOwner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemOwner' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getItemOwner();

	/**
	 * Returns the value of the '<em><b>Item Owner Applied ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier applied to an item by the owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Owner Applied ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemOwnerAppliedID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemOwnerAppliedID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getItemOwnerAppliedID();

	/**
	 * Returns the value of the '<em><b>Item Owner Purchased Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money a current owner paid to purchase a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Owner Purchased Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemOwnerPurchasedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemOwnerPurchasedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemValueType> getItemOwnerPurchasedValue();

	/**
	 * Returns the value of the '<em><b>Item Possession Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of how or why a party other than the owner came to possess a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Possession Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemPossessionDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemPossessionDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemPossessionDescriptionText();

	/**
	 * Returns the value of the '<em><b>Item Possessor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity other than the owner which has possession of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Possessor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemPossessor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemPossessor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getItemPossessor();

	/**
	 * Returns the value of the '<em><b>Item Receipt Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification issued to an item when taken into possession for official purposes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Receipt Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemReceiptIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemReceiptIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemReceiptIdentification();

	/**
	 * Returns the value of the '<em><b>Item RF Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of an item based on radio waves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item RF Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemRFIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemRFIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemRFIdentification();

	/**
	 * Returns the value of the '<em><b>Item Serial Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification inscribed on or attached to a part, collection of parts, or complete unit by the manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Serial Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemSerialIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemSerialIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemSerialIdentification();

	/**
	 * Returns the value of the '<em><b>Item State Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A state-assigned identification for an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item State Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemStateIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemStateIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getItemStateIdentification();

	/**
	 * Returns the value of the '<em><b>Item Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getItemStatus();

	/**
	 * Returns the value of the '<em><b>Item Usage Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manner or way in which an item is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Usage Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemUsageText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemUsageText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemUsageText();

	/**
	 * Returns the value of the '<em><b>Item Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An evaluation of the monetary worth of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemValueType> getItemValue();

	/**
	 * Returns the value of the '<em><b>Item Visible ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of an item that is visible on the item itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Visible ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemVisibleID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemVisibleID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getItemVisibleID();

	/**
	 * Returns the value of the '<em><b>Weapon Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an item is traditionally considered to be a weapon; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_WeaponIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeaponIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getWeaponIndicator();

	/**
	 * Returns the value of the '<em><b>Weapon Usage Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an item not traditionally considered to be a weapon is used as such; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weapon Usage Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_WeaponUsageIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WeaponUsageIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getWeaponUsageIndicator();

	/**
	 * Returns the value of the '<em><b>Conveyance Sales Tax Percent</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PercentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A tax rate as a percentage used for computing the sales tax on the purchase of a conveyance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Sales Tax Percent</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ConveyanceSalesTaxPercent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyanceSalesTaxPercent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PercentType> getConveyanceSalesTaxPercent();

	/**
	 * Returns the value of the '<em><b>Item Age Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An age of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Age Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemAgeMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemAgeMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getItemAgeMeasure();

	/**
	 * Returns the value of the '<em><b>Item Binary</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.BinaryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binary representation of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Binary</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemBinary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemBinary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BinaryType> getItemBinary();

	/**
	 * Returns the value of the '<em><b>Item Brand Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distinctive name that identifies a manufacturer of a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Brand Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemBrandName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemBrandName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getItemBrandName();

	/**
	 * Returns the value of the '<em><b>Item Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Item Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemCategory' namespace='##targetNamespace' group='ItemCategory:group'"
	 * @generated
	 */
	EList<EObject> getItemCategory();

	/**
	 * Returns the value of the '<em><b>Item Color Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Color Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemColorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemColor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemColorGroup();

	/**
	 * Returns the value of the '<em><b>Item Color</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a color of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Color</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemColor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemColor' namespace='##targetNamespace' group='ItemColor:group'"
	 * @generated
	 */
	EList<EObject> getItemColor();

	/**
	 * Returns the value of the '<em><b>Item Current Resale Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money for which an item could currently be sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Current Resale Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemCurrentResaleValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemCurrentResaleValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemValueType> getItemCurrentResaleValue();

	/**
	 * Returns the value of the '<em><b>Item First Sold Year Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.GYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A calendar year in which an item was first sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item First Sold Year Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemFirstSoldYearDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemFirstSoldYearDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GYear> getItemFirstSoldYearDate();

	/**
	 * Returns the value of the '<em><b>Item Height Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the height of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Height Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemHeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemHeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getItemHeightMeasure();

	/**
	 * Returns the value of the '<em><b>Item Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binary representation of an image of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemImage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getItemImage();

	/**
	 * Returns the value of the '<em><b>Item Lease Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an item is leased; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Lease Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemLeaseIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemLeaseIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getItemLeaseIndicator();

	/**
	 * Returns the value of the '<em><b>Item Length Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the length of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Length Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemLengthMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemLengthMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getItemLengthMeasure();

	/**
	 * Returns the value of the '<em><b>Item Make Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the manufacturer that produced an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Make Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemMakeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemMakeName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getItemMakeName();

	/**
	 * Returns the value of the '<em><b>Item Model Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ProperNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a specific design or kind of item made by a manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Model Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemModelName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemModelName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProperNameTextType> getItemModelName();

	/**
	 * Returns the value of the '<em><b>Item Model Year Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.GYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year in which an item was manufactured or produced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Model Year Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemModelYearDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemModelYearDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GYear> getItemModelYearDate();

	/**
	 * Returns the value of the '<em><b>Item Ownership Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of ownership of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Ownership Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemOwnershipCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemOwnershipCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemOwnershipCategoryText();

	/**
	 * Returns the value of the '<em><b>Item Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.QuantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of the individual units which make up an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuantityType> getItemQuantity();

	/**
	 * Returns the value of the '<em><b>Item Rental Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if an item is rented; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Rental Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemRentalIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemRentalIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getItemRentalIndicator();

	/**
	 * Returns the value of the '<em><b>Item Size Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the size or physical dimensions of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Size Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemSizeDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemSizeDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getItemSizeDescriptionText();

	/**
	 * Returns the value of the '<em><b>Item Style Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a style of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Style Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemStyleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemStyle:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemStyleGroup();

	/**
	 * Returns the value of the '<em><b>Item Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a style of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Style</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemStyle()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemStyle' namespace='##targetNamespace' group='ItemStyle:group'"
	 * @generated
	 */
	EList<EObject> getItemStyle();

	/**
	 * Returns the value of the '<em><b>Item Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the weight of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getItemWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Item Width Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A measurement of the width of an item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Width Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemWidthMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemWidthMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getItemWidthMeasure();

	/**
	 * Returns the value of the '<em><b>Item Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemType_ItemAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemAugmentationPoint' namespace='##targetNamespace' group='ItemAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemAugmentationPoint();

} // ItemType
