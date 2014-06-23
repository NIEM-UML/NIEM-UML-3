/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.BinaryType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.ImageType;
import gov.niem.release.niem.niem.core._3._0.ItemDispositionType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.ItemValueType;
import gov.niem.release.niem.niem.core._3._0.MeasureType;
import gov.niem.release.niem.niem.core._3._0.PercentType;
import gov.niem.release.niem.niem.core._3._0.ProperNameTextType;
import gov.niem.release.niem.niem.core._3._0.QuantityType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.GYear;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemName <em>Item Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemActionText <em>Item Action Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemBarCodeIdentification <em>Item Bar Code Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemConditionText <em>Item Condition Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemDealerIdentification <em>Item Dealer Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemDescriptionText <em>Item Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemDisposition <em>Item Disposition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemOtherIdentification <em>Item Other Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemOwner <em>Item Owner</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemOwnerAppliedID <em>Item Owner Applied ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemOwnerPurchasedValue <em>Item Owner Purchased Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemPossessionDescriptionText <em>Item Possession Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemPossessor <em>Item Possessor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemReceiptIdentification <em>Item Receipt Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemRFIdentification <em>Item RF Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemSerialIdentification <em>Item Serial Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemStateIdentification <em>Item State Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemStatus <em>Item Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemUsageText <em>Item Usage Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemValue <em>Item Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemVisibleID <em>Item Visible ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getWeaponIndicator <em>Weapon Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getWeaponUsageIndicator <em>Weapon Usage Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getConveyanceSalesTaxPercent <em>Conveyance Sales Tax Percent</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemAgeMeasure <em>Item Age Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemBinary <em>Item Binary</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemBrandName <em>Item Brand Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemCategoryGroup <em>Item Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemCategory <em>Item Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemColorGroup <em>Item Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemColor <em>Item Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemCurrentResaleValue <em>Item Current Resale Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemFirstSoldYearDate <em>Item First Sold Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemHeightMeasure <em>Item Height Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemImage <em>Item Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemLeaseIndicator <em>Item Lease Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemLengthMeasure <em>Item Length Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemMakeName <em>Item Make Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemModelName <em>Item Model Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemModelYearDate <em>Item Model Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemOwnershipCategoryText <em>Item Ownership Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemQuantity <em>Item Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemRentalIndicator <em>Item Rental Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemSizeDescriptionText <em>Item Size Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemStyleGroup <em>Item Style Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemStyle <em>Item Style</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemWeightMeasure <em>Item Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemWidthMeasure <em>Item Width Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemAugmentationPointGroup <em>Item Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTypeImpl#getItemAugmentationPoint <em>Item Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTypeImpl extends ObjectTypeImpl implements ItemType {
	/**
	 * The cached value of the '{@link #getItemName() <em>Item Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemName;

	/**
	 * The cached value of the '{@link #getItemActionText() <em>Item Action Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemActionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemActionText;

	/**
	 * The cached value of the '{@link #getItemBarCodeIdentification() <em>Item Bar Code Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemBarCodeIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemBarCodeIdentification;

	/**
	 * The cached value of the '{@link #getItemConditionText() <em>Item Condition Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemConditionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemConditionText;

	/**
	 * The cached value of the '{@link #getItemDealerIdentification() <em>Item Dealer Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDealerIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemDealerIdentification;

	/**
	 * The cached value of the '{@link #getItemDescriptionText() <em>Item Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemDescriptionText;

	/**
	 * The cached value of the '{@link #getItemDisposition() <em>Item Disposition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDisposition()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemDispositionType> itemDisposition;

	/**
	 * The cached value of the '{@link #getItemOtherIdentification() <em>Item Other Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOtherIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemOtherIdentification;

	/**
	 * The cached value of the '{@link #getItemOwner() <em>Item Owner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> itemOwner;

	/**
	 * The cached value of the '{@link #getItemOwnerAppliedID() <em>Item Owner Applied ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOwnerAppliedID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> itemOwnerAppliedID;

	/**
	 * The cached value of the '{@link #getItemOwnerPurchasedValue() <em>Item Owner Purchased Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOwnerPurchasedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemValueType> itemOwnerPurchasedValue;

	/**
	 * The cached value of the '{@link #getItemPossessionDescriptionText() <em>Item Possession Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPossessionDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemPossessionDescriptionText;

	/**
	 * The cached value of the '{@link #getItemPossessor() <em>Item Possessor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPossessor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> itemPossessor;

	/**
	 * The cached value of the '{@link #getItemReceiptIdentification() <em>Item Receipt Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemReceiptIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemReceiptIdentification;

	/**
	 * The cached value of the '{@link #getItemRFIdentification() <em>Item RF Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemRFIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemRFIdentification;

	/**
	 * The cached value of the '{@link #getItemSerialIdentification() <em>Item Serial Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSerialIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemSerialIdentification;

	/**
	 * The cached value of the '{@link #getItemStateIdentification() <em>Item State Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemStateIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> itemStateIdentification;

	/**
	 * The cached value of the '{@link #getItemStatus() <em>Item Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> itemStatus;

	/**
	 * The cached value of the '{@link #getItemUsageText() <em>Item Usage Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemUsageText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemUsageText;

	/**
	 * The cached value of the '{@link #getItemValue() <em>Item Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemValueType> itemValue;

	/**
	 * The cached value of the '{@link #getItemVisibleID() <em>Item Visible ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemVisibleID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> itemVisibleID;

	/**
	 * The cached value of the '{@link #getWeaponIndicator() <em>Weapon Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaponIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> weaponIndicator;

	/**
	 * The cached value of the '{@link #getWeaponUsageIndicator() <em>Weapon Usage Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaponUsageIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> weaponUsageIndicator;

	/**
	 * The cached value of the '{@link #getConveyanceSalesTaxPercent() <em>Conveyance Sales Tax Percent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceSalesTaxPercent()
	 * @generated
	 * @ordered
	 */
	protected EList<PercentType> conveyanceSalesTaxPercent;

	/**
	 * The cached value of the '{@link #getItemAgeMeasure() <em>Item Age Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemAgeMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> itemAgeMeasure;

	/**
	 * The cached value of the '{@link #getItemBinary() <em>Item Binary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemBinary()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryType> itemBinary;

	/**
	 * The cached value of the '{@link #getItemBrandName() <em>Item Brand Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemBrandName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> itemBrandName;

	/**
	 * The cached value of the '{@link #getItemCategoryGroup() <em>Item Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemCategoryGroup;

	/**
	 * The cached value of the '{@link #getItemColorGroup() <em>Item Color Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemColorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemColorGroup;

	/**
	 * The cached value of the '{@link #getItemCurrentResaleValue() <em>Item Current Resale Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCurrentResaleValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemValueType> itemCurrentResaleValue;

	/**
	 * The cached value of the '{@link #getItemFirstSoldYearDate() <em>Item First Sold Year Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemFirstSoldYearDate()
	 * @generated
	 * @ordered
	 */
	protected EList<GYear> itemFirstSoldYearDate;

	/**
	 * The cached value of the '{@link #getItemHeightMeasure() <em>Item Height Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemHeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> itemHeightMeasure;

	/**
	 * The cached value of the '{@link #getItemImage() <em>Item Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> itemImage;

	/**
	 * The cached value of the '{@link #getItemLeaseIndicator() <em>Item Lease Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemLeaseIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> itemLeaseIndicator;

	/**
	 * The cached value of the '{@link #getItemLengthMeasure() <em>Item Length Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> itemLengthMeasure;

	/**
	 * The cached value of the '{@link #getItemMakeName() <em>Item Make Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemMakeName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> itemMakeName;

	/**
	 * The cached value of the '{@link #getItemModelName() <em>Item Model Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemModelName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> itemModelName;

	/**
	 * The cached value of the '{@link #getItemModelYearDate() <em>Item Model Year Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemModelYearDate()
	 * @generated
	 * @ordered
	 */
	protected EList<GYear> itemModelYearDate;

	/**
	 * The cached value of the '{@link #getItemOwnershipCategoryText() <em>Item Ownership Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemOwnershipCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemOwnershipCategoryText;

	/**
	 * The cached value of the '{@link #getItemQuantity() <em>Item Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantityType> itemQuantity;

	/**
	 * The cached value of the '{@link #getItemRentalIndicator() <em>Item Rental Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemRentalIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> itemRentalIndicator;

	/**
	 * The cached value of the '{@link #getItemSizeDescriptionText() <em>Item Size Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSizeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> itemSizeDescriptionText;

	/**
	 * The cached value of the '{@link #getItemStyleGroup() <em>Item Style Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemStyleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemStyleGroup;

	/**
	 * The cached value of the '{@link #getItemWeightMeasure() <em>Item Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> itemWeightMeasure;

	/**
	 * The cached value of the '{@link #getItemWidthMeasure() <em>Item Width Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemWidthMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> itemWidthMeasure;

	/**
	 * The cached value of the '{@link #getItemAugmentationPointGroup() <em>Item Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemName() {
		if (itemName == null) {
			itemName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_NAME);
		}
		return itemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemActionText() {
		if (itemActionText == null) {
			itemActionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_ACTION_TEXT);
		}
		return itemActionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemBarCodeIdentification() {
		if (itemBarCodeIdentification == null) {
			itemBarCodeIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_BAR_CODE_IDENTIFICATION);
		}
		return itemBarCodeIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemConditionText() {
		if (itemConditionText == null) {
			itemConditionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_CONDITION_TEXT);
		}
		return itemConditionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemDealerIdentification() {
		if (itemDealerIdentification == null) {
			itemDealerIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_DEALER_IDENTIFICATION);
		}
		return itemDealerIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemDescriptionText() {
		if (itemDescriptionText == null) {
			itemDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_DESCRIPTION_TEXT);
		}
		return itemDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemDispositionType> getItemDisposition() {
		if (itemDisposition == null) {
			itemDisposition = new EObjectContainmentEList<ItemDispositionType>(ItemDispositionType.class, this, _0Package.ITEM_TYPE__ITEM_DISPOSITION);
		}
		return itemDisposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemOtherIdentification() {
		if (itemOtherIdentification == null) {
			itemOtherIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_OTHER_IDENTIFICATION);
		}
		return itemOtherIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getItemOwner() {
		if (itemOwner == null) {
			itemOwner = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_TYPE__ITEM_OWNER);
		}
		return itemOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getItemOwnerAppliedID() {
		if (itemOwnerAppliedID == null) {
			itemOwnerAppliedID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.ITEM_TYPE__ITEM_OWNER_APPLIED_ID);
		}
		return itemOwnerAppliedID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemValueType> getItemOwnerPurchasedValue() {
		if (itemOwnerPurchasedValue == null) {
			itemOwnerPurchasedValue = new EObjectContainmentEList<ItemValueType>(ItemValueType.class, this, _0Package.ITEM_TYPE__ITEM_OWNER_PURCHASED_VALUE);
		}
		return itemOwnerPurchasedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemPossessionDescriptionText() {
		if (itemPossessionDescriptionText == null) {
			itemPossessionDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_POSSESSION_DESCRIPTION_TEXT);
		}
		return itemPossessionDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getItemPossessor() {
		if (itemPossessor == null) {
			itemPossessor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_TYPE__ITEM_POSSESSOR);
		}
		return itemPossessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemReceiptIdentification() {
		if (itemReceiptIdentification == null) {
			itemReceiptIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_RECEIPT_IDENTIFICATION);
		}
		return itemReceiptIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemRFIdentification() {
		if (itemRFIdentification == null) {
			itemRFIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_RF_IDENTIFICATION);
		}
		return itemRFIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemSerialIdentification() {
		if (itemSerialIdentification == null) {
			itemSerialIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_SERIAL_IDENTIFICATION);
		}
		return itemSerialIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getItemStateIdentification() {
		if (itemStateIdentification == null) {
			itemStateIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ITEM_TYPE__ITEM_STATE_IDENTIFICATION);
		}
		return itemStateIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getItemStatus() {
		if (itemStatus == null) {
			itemStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.ITEM_TYPE__ITEM_STATUS);
		}
		return itemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemUsageText() {
		if (itemUsageText == null) {
			itemUsageText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_USAGE_TEXT);
		}
		return itemUsageText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemValueType> getItemValue() {
		if (itemValue == null) {
			itemValue = new EObjectContainmentEList<ItemValueType>(ItemValueType.class, this, _0Package.ITEM_TYPE__ITEM_VALUE);
		}
		return itemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getItemVisibleID() {
		if (itemVisibleID == null) {
			itemVisibleID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.ITEM_TYPE__ITEM_VISIBLE_ID);
		}
		return itemVisibleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getWeaponIndicator() {
		if (weaponIndicator == null) {
			weaponIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.ITEM_TYPE__WEAPON_INDICATOR);
		}
		return weaponIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getWeaponUsageIndicator() {
		if (weaponUsageIndicator == null) {
			weaponUsageIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.ITEM_TYPE__WEAPON_USAGE_INDICATOR);
		}
		return weaponUsageIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PercentType> getConveyanceSalesTaxPercent() {
		if (conveyanceSalesTaxPercent == null) {
			conveyanceSalesTaxPercent = new EObjectContainmentEList<PercentType>(PercentType.class, this, _0Package.ITEM_TYPE__CONVEYANCE_SALES_TAX_PERCENT);
		}
		return conveyanceSalesTaxPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getItemAgeMeasure() {
		if (itemAgeMeasure == null) {
			itemAgeMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.ITEM_TYPE__ITEM_AGE_MEASURE);
		}
		return itemAgeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryType> getItemBinary() {
		if (itemBinary == null) {
			itemBinary = new EObjectContainmentEList<BinaryType>(BinaryType.class, this, _0Package.ITEM_TYPE__ITEM_BINARY);
		}
		return itemBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getItemBrandName() {
		if (itemBrandName == null) {
			itemBrandName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.ITEM_TYPE__ITEM_BRAND_NAME);
		}
		return itemBrandName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemCategoryGroup() {
		if (itemCategoryGroup == null) {
			itemCategoryGroup = new BasicFeatureMap(this, _0Package.ITEM_TYPE__ITEM_CATEGORY_GROUP);
		}
		return itemCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemCategory() {
		return getItemCategoryGroup().list(_0Package.eINSTANCE.getItemType_ItemCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemColorGroup() {
		if (itemColorGroup == null) {
			itemColorGroup = new BasicFeatureMap(this, _0Package.ITEM_TYPE__ITEM_COLOR_GROUP);
		}
		return itemColorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemColor() {
		return getItemColorGroup().list(_0Package.eINSTANCE.getItemType_ItemColor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemValueType> getItemCurrentResaleValue() {
		if (itemCurrentResaleValue == null) {
			itemCurrentResaleValue = new EObjectContainmentEList<ItemValueType>(ItemValueType.class, this, _0Package.ITEM_TYPE__ITEM_CURRENT_RESALE_VALUE);
		}
		return itemCurrentResaleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GYear> getItemFirstSoldYearDate() {
		if (itemFirstSoldYearDate == null) {
			itemFirstSoldYearDate = new EObjectContainmentEList<GYear>(GYear.class, this, _0Package.ITEM_TYPE__ITEM_FIRST_SOLD_YEAR_DATE);
		}
		return itemFirstSoldYearDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getItemHeightMeasure() {
		if (itemHeightMeasure == null) {
			itemHeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.ITEM_TYPE__ITEM_HEIGHT_MEASURE);
		}
		return itemHeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getItemImage() {
		if (itemImage == null) {
			itemImage = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.ITEM_TYPE__ITEM_IMAGE);
		}
		return itemImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getItemLeaseIndicator() {
		if (itemLeaseIndicator == null) {
			itemLeaseIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.ITEM_TYPE__ITEM_LEASE_INDICATOR);
		}
		return itemLeaseIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getItemLengthMeasure() {
		if (itemLengthMeasure == null) {
			itemLengthMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.ITEM_TYPE__ITEM_LENGTH_MEASURE);
		}
		return itemLengthMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getItemMakeName() {
		if (itemMakeName == null) {
			itemMakeName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.ITEM_TYPE__ITEM_MAKE_NAME);
		}
		return itemMakeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getItemModelName() {
		if (itemModelName == null) {
			itemModelName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.ITEM_TYPE__ITEM_MODEL_NAME);
		}
		return itemModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GYear> getItemModelYearDate() {
		if (itemModelYearDate == null) {
			itemModelYearDate = new EObjectContainmentEList<GYear>(GYear.class, this, _0Package.ITEM_TYPE__ITEM_MODEL_YEAR_DATE);
		}
		return itemModelYearDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemOwnershipCategoryText() {
		if (itemOwnershipCategoryText == null) {
			itemOwnershipCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_OWNERSHIP_CATEGORY_TEXT);
		}
		return itemOwnershipCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantityType> getItemQuantity() {
		if (itemQuantity == null) {
			itemQuantity = new EObjectContainmentEList<QuantityType>(QuantityType.class, this, _0Package.ITEM_TYPE__ITEM_QUANTITY);
		}
		return itemQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getItemRentalIndicator() {
		if (itemRentalIndicator == null) {
			itemRentalIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.ITEM_TYPE__ITEM_RENTAL_INDICATOR);
		}
		return itemRentalIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getItemSizeDescriptionText() {
		if (itemSizeDescriptionText == null) {
			itemSizeDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ITEM_TYPE__ITEM_SIZE_DESCRIPTION_TEXT);
		}
		return itemSizeDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemStyleGroup() {
		if (itemStyleGroup == null) {
			itemStyleGroup = new BasicFeatureMap(this, _0Package.ITEM_TYPE__ITEM_STYLE_GROUP);
		}
		return itemStyleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemStyle() {
		return getItemStyleGroup().list(_0Package.eINSTANCE.getItemType_ItemStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getItemWeightMeasure() {
		if (itemWeightMeasure == null) {
			itemWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.ITEM_TYPE__ITEM_WEIGHT_MEASURE);
		}
		return itemWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getItemWidthMeasure() {
		if (itemWidthMeasure == null) {
			itemWidthMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.ITEM_TYPE__ITEM_WIDTH_MEASURE);
		}
		return itemWidthMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemAugmentationPointGroup() {
		if (itemAugmentationPointGroup == null) {
			itemAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT_GROUP);
		}
		return itemAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemAugmentationPoint() {
		return getItemAugmentationPointGroup().list(_0Package.eINSTANCE.getItemType_ItemAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_TYPE__ITEM_NAME:
				return ((InternalEList<?>)getItemName()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_ACTION_TEXT:
				return ((InternalEList<?>)getItemActionText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_BAR_CODE_IDENTIFICATION:
				return ((InternalEList<?>)getItemBarCodeIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_CONDITION_TEXT:
				return ((InternalEList<?>)getItemConditionText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_DEALER_IDENTIFICATION:
				return ((InternalEList<?>)getItemDealerIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getItemDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_DISPOSITION:
				return ((InternalEList<?>)getItemDisposition()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_OTHER_IDENTIFICATION:
				return ((InternalEList<?>)getItemOtherIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_OWNER:
				return ((InternalEList<?>)getItemOwner()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_OWNER_APPLIED_ID:
				return ((InternalEList<?>)getItemOwnerAppliedID()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_OWNER_PURCHASED_VALUE:
				return ((InternalEList<?>)getItemOwnerPurchasedValue()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_POSSESSION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getItemPossessionDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_POSSESSOR:
				return ((InternalEList<?>)getItemPossessor()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_RECEIPT_IDENTIFICATION:
				return ((InternalEList<?>)getItemReceiptIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_RF_IDENTIFICATION:
				return ((InternalEList<?>)getItemRFIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_SERIAL_IDENTIFICATION:
				return ((InternalEList<?>)getItemSerialIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_STATE_IDENTIFICATION:
				return ((InternalEList<?>)getItemStateIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_STATUS:
				return ((InternalEList<?>)getItemStatus()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_USAGE_TEXT:
				return ((InternalEList<?>)getItemUsageText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_VALUE:
				return ((InternalEList<?>)getItemValue()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_VISIBLE_ID:
				return ((InternalEList<?>)getItemVisibleID()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__WEAPON_INDICATOR:
				return ((InternalEList<?>)getWeaponIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__WEAPON_USAGE_INDICATOR:
				return ((InternalEList<?>)getWeaponUsageIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__CONVEYANCE_SALES_TAX_PERCENT:
				return ((InternalEList<?>)getConveyanceSalesTaxPercent()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_AGE_MEASURE:
				return ((InternalEList<?>)getItemAgeMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_BINARY:
				return ((InternalEList<?>)getItemBinary()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_BRAND_NAME:
				return ((InternalEList<?>)getItemBrandName()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_CATEGORY_GROUP:
				return ((InternalEList<?>)getItemCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_CATEGORY:
				return ((InternalEList<?>)getItemCategory()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_COLOR_GROUP:
				return ((InternalEList<?>)getItemColorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_COLOR:
				return ((InternalEList<?>)getItemColor()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_CURRENT_RESALE_VALUE:
				return ((InternalEList<?>)getItemCurrentResaleValue()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_FIRST_SOLD_YEAR_DATE:
				return ((InternalEList<?>)getItemFirstSoldYearDate()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_HEIGHT_MEASURE:
				return ((InternalEList<?>)getItemHeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_IMAGE:
				return ((InternalEList<?>)getItemImage()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_LEASE_INDICATOR:
				return ((InternalEList<?>)getItemLeaseIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_LENGTH_MEASURE:
				return ((InternalEList<?>)getItemLengthMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_MAKE_NAME:
				return ((InternalEList<?>)getItemMakeName()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_MODEL_NAME:
				return ((InternalEList<?>)getItemModelName()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_MODEL_YEAR_DATE:
				return ((InternalEList<?>)getItemModelYearDate()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_OWNERSHIP_CATEGORY_TEXT:
				return ((InternalEList<?>)getItemOwnershipCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_QUANTITY:
				return ((InternalEList<?>)getItemQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_RENTAL_INDICATOR:
				return ((InternalEList<?>)getItemRentalIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_SIZE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getItemSizeDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_STYLE_GROUP:
				return ((InternalEList<?>)getItemStyleGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_STYLE:
				return ((InternalEList<?>)getItemStyle()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_WEIGHT_MEASURE:
				return ((InternalEList<?>)getItemWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_WIDTH_MEASURE:
				return ((InternalEList<?>)getItemWidthMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemAugmentationPoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.ITEM_TYPE__ITEM_NAME:
				return getItemName();
			case _0Package.ITEM_TYPE__ITEM_ACTION_TEXT:
				return getItemActionText();
			case _0Package.ITEM_TYPE__ITEM_BAR_CODE_IDENTIFICATION:
				return getItemBarCodeIdentification();
			case _0Package.ITEM_TYPE__ITEM_CONDITION_TEXT:
				return getItemConditionText();
			case _0Package.ITEM_TYPE__ITEM_DEALER_IDENTIFICATION:
				return getItemDealerIdentification();
			case _0Package.ITEM_TYPE__ITEM_DESCRIPTION_TEXT:
				return getItemDescriptionText();
			case _0Package.ITEM_TYPE__ITEM_DISPOSITION:
				return getItemDisposition();
			case _0Package.ITEM_TYPE__ITEM_OTHER_IDENTIFICATION:
				return getItemOtherIdentification();
			case _0Package.ITEM_TYPE__ITEM_OWNER:
				return getItemOwner();
			case _0Package.ITEM_TYPE__ITEM_OWNER_APPLIED_ID:
				return getItemOwnerAppliedID();
			case _0Package.ITEM_TYPE__ITEM_OWNER_PURCHASED_VALUE:
				return getItemOwnerPurchasedValue();
			case _0Package.ITEM_TYPE__ITEM_POSSESSION_DESCRIPTION_TEXT:
				return getItemPossessionDescriptionText();
			case _0Package.ITEM_TYPE__ITEM_POSSESSOR:
				return getItemPossessor();
			case _0Package.ITEM_TYPE__ITEM_RECEIPT_IDENTIFICATION:
				return getItemReceiptIdentification();
			case _0Package.ITEM_TYPE__ITEM_RF_IDENTIFICATION:
				return getItemRFIdentification();
			case _0Package.ITEM_TYPE__ITEM_SERIAL_IDENTIFICATION:
				return getItemSerialIdentification();
			case _0Package.ITEM_TYPE__ITEM_STATE_IDENTIFICATION:
				return getItemStateIdentification();
			case _0Package.ITEM_TYPE__ITEM_STATUS:
				return getItemStatus();
			case _0Package.ITEM_TYPE__ITEM_USAGE_TEXT:
				return getItemUsageText();
			case _0Package.ITEM_TYPE__ITEM_VALUE:
				return getItemValue();
			case _0Package.ITEM_TYPE__ITEM_VISIBLE_ID:
				return getItemVisibleID();
			case _0Package.ITEM_TYPE__WEAPON_INDICATOR:
				return getWeaponIndicator();
			case _0Package.ITEM_TYPE__WEAPON_USAGE_INDICATOR:
				return getWeaponUsageIndicator();
			case _0Package.ITEM_TYPE__CONVEYANCE_SALES_TAX_PERCENT:
				return getConveyanceSalesTaxPercent();
			case _0Package.ITEM_TYPE__ITEM_AGE_MEASURE:
				return getItemAgeMeasure();
			case _0Package.ITEM_TYPE__ITEM_BINARY:
				return getItemBinary();
			case _0Package.ITEM_TYPE__ITEM_BRAND_NAME:
				return getItemBrandName();
			case _0Package.ITEM_TYPE__ITEM_CATEGORY_GROUP:
				if (coreType) return getItemCategoryGroup();
				return ((FeatureMap.Internal)getItemCategoryGroup()).getWrapper();
			case _0Package.ITEM_TYPE__ITEM_CATEGORY:
				return getItemCategory();
			case _0Package.ITEM_TYPE__ITEM_COLOR_GROUP:
				if (coreType) return getItemColorGroup();
				return ((FeatureMap.Internal)getItemColorGroup()).getWrapper();
			case _0Package.ITEM_TYPE__ITEM_COLOR:
				return getItemColor();
			case _0Package.ITEM_TYPE__ITEM_CURRENT_RESALE_VALUE:
				return getItemCurrentResaleValue();
			case _0Package.ITEM_TYPE__ITEM_FIRST_SOLD_YEAR_DATE:
				return getItemFirstSoldYearDate();
			case _0Package.ITEM_TYPE__ITEM_HEIGHT_MEASURE:
				return getItemHeightMeasure();
			case _0Package.ITEM_TYPE__ITEM_IMAGE:
				return getItemImage();
			case _0Package.ITEM_TYPE__ITEM_LEASE_INDICATOR:
				return getItemLeaseIndicator();
			case _0Package.ITEM_TYPE__ITEM_LENGTH_MEASURE:
				return getItemLengthMeasure();
			case _0Package.ITEM_TYPE__ITEM_MAKE_NAME:
				return getItemMakeName();
			case _0Package.ITEM_TYPE__ITEM_MODEL_NAME:
				return getItemModelName();
			case _0Package.ITEM_TYPE__ITEM_MODEL_YEAR_DATE:
				return getItemModelYearDate();
			case _0Package.ITEM_TYPE__ITEM_OWNERSHIP_CATEGORY_TEXT:
				return getItemOwnershipCategoryText();
			case _0Package.ITEM_TYPE__ITEM_QUANTITY:
				return getItemQuantity();
			case _0Package.ITEM_TYPE__ITEM_RENTAL_INDICATOR:
				return getItemRentalIndicator();
			case _0Package.ITEM_TYPE__ITEM_SIZE_DESCRIPTION_TEXT:
				return getItemSizeDescriptionText();
			case _0Package.ITEM_TYPE__ITEM_STYLE_GROUP:
				if (coreType) return getItemStyleGroup();
				return ((FeatureMap.Internal)getItemStyleGroup()).getWrapper();
			case _0Package.ITEM_TYPE__ITEM_STYLE:
				return getItemStyle();
			case _0Package.ITEM_TYPE__ITEM_WEIGHT_MEASURE:
				return getItemWeightMeasure();
			case _0Package.ITEM_TYPE__ITEM_WIDTH_MEASURE:
				return getItemWidthMeasure();
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT:
				return getItemAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.ITEM_TYPE__ITEM_NAME:
				getItemName().clear();
				getItemName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_ACTION_TEXT:
				getItemActionText().clear();
				getItemActionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_BAR_CODE_IDENTIFICATION:
				getItemBarCodeIdentification().clear();
				getItemBarCodeIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_CONDITION_TEXT:
				getItemConditionText().clear();
				getItemConditionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_DEALER_IDENTIFICATION:
				getItemDealerIdentification().clear();
				getItemDealerIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_DESCRIPTION_TEXT:
				getItemDescriptionText().clear();
				getItemDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_DISPOSITION:
				getItemDisposition().clear();
				getItemDisposition().addAll((Collection<? extends ItemDispositionType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_OTHER_IDENTIFICATION:
				getItemOtherIdentification().clear();
				getItemOtherIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNER:
				getItemOwner().clear();
				getItemOwner().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNER_APPLIED_ID:
				getItemOwnerAppliedID().clear();
				getItemOwnerAppliedID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNER_PURCHASED_VALUE:
				getItemOwnerPurchasedValue().clear();
				getItemOwnerPurchasedValue().addAll((Collection<? extends ItemValueType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_POSSESSION_DESCRIPTION_TEXT:
				getItemPossessionDescriptionText().clear();
				getItemPossessionDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_POSSESSOR:
				getItemPossessor().clear();
				getItemPossessor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_RECEIPT_IDENTIFICATION:
				getItemReceiptIdentification().clear();
				getItemReceiptIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_RF_IDENTIFICATION:
				getItemRFIdentification().clear();
				getItemRFIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_SERIAL_IDENTIFICATION:
				getItemSerialIdentification().clear();
				getItemSerialIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_STATE_IDENTIFICATION:
				getItemStateIdentification().clear();
				getItemStateIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_STATUS:
				getItemStatus().clear();
				getItemStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_USAGE_TEXT:
				getItemUsageText().clear();
				getItemUsageText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_VALUE:
				getItemValue().clear();
				getItemValue().addAll((Collection<? extends ItemValueType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_VISIBLE_ID:
				getItemVisibleID().clear();
				getItemVisibleID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.ITEM_TYPE__WEAPON_INDICATOR:
				getWeaponIndicator().clear();
				getWeaponIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.ITEM_TYPE__WEAPON_USAGE_INDICATOR:
				getWeaponUsageIndicator().clear();
				getWeaponUsageIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.ITEM_TYPE__CONVEYANCE_SALES_TAX_PERCENT:
				getConveyanceSalesTaxPercent().clear();
				getConveyanceSalesTaxPercent().addAll((Collection<? extends PercentType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_AGE_MEASURE:
				getItemAgeMeasure().clear();
				getItemAgeMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_BINARY:
				getItemBinary().clear();
				getItemBinary().addAll((Collection<? extends BinaryType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_BRAND_NAME:
				getItemBrandName().clear();
				getItemBrandName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_CATEGORY_GROUP:
				((FeatureMap.Internal)getItemCategoryGroup()).set(newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_COLOR_GROUP:
				((FeatureMap.Internal)getItemColorGroup()).set(newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_CURRENT_RESALE_VALUE:
				getItemCurrentResaleValue().clear();
				getItemCurrentResaleValue().addAll((Collection<? extends ItemValueType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_FIRST_SOLD_YEAR_DATE:
				getItemFirstSoldYearDate().clear();
				getItemFirstSoldYearDate().addAll((Collection<? extends GYear>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_HEIGHT_MEASURE:
				getItemHeightMeasure().clear();
				getItemHeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_IMAGE:
				getItemImage().clear();
				getItemImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_LEASE_INDICATOR:
				getItemLeaseIndicator().clear();
				getItemLeaseIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_LENGTH_MEASURE:
				getItemLengthMeasure().clear();
				getItemLengthMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_MAKE_NAME:
				getItemMakeName().clear();
				getItemMakeName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_MODEL_NAME:
				getItemModelName().clear();
				getItemModelName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_MODEL_YEAR_DATE:
				getItemModelYearDate().clear();
				getItemModelYearDate().addAll((Collection<? extends GYear>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNERSHIP_CATEGORY_TEXT:
				getItemOwnershipCategoryText().clear();
				getItemOwnershipCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_QUANTITY:
				getItemQuantity().clear();
				getItemQuantity().addAll((Collection<? extends QuantityType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_RENTAL_INDICATOR:
				getItemRentalIndicator().clear();
				getItemRentalIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_SIZE_DESCRIPTION_TEXT:
				getItemSizeDescriptionText().clear();
				getItemSizeDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_STYLE_GROUP:
				((FeatureMap.Internal)getItemStyleGroup()).set(newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_WEIGHT_MEASURE:
				getItemWeightMeasure().clear();
				getItemWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_WIDTH_MEASURE:
				getItemWidthMeasure().clear();
				getItemWidthMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemAugmentationPointGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.ITEM_TYPE__ITEM_NAME:
				getItemName().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_ACTION_TEXT:
				getItemActionText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_BAR_CODE_IDENTIFICATION:
				getItemBarCodeIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_CONDITION_TEXT:
				getItemConditionText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_DEALER_IDENTIFICATION:
				getItemDealerIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_DESCRIPTION_TEXT:
				getItemDescriptionText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_DISPOSITION:
				getItemDisposition().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_OTHER_IDENTIFICATION:
				getItemOtherIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNER:
				getItemOwner().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNER_APPLIED_ID:
				getItemOwnerAppliedID().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNER_PURCHASED_VALUE:
				getItemOwnerPurchasedValue().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_POSSESSION_DESCRIPTION_TEXT:
				getItemPossessionDescriptionText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_POSSESSOR:
				getItemPossessor().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_RECEIPT_IDENTIFICATION:
				getItemReceiptIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_RF_IDENTIFICATION:
				getItemRFIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_SERIAL_IDENTIFICATION:
				getItemSerialIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_STATE_IDENTIFICATION:
				getItemStateIdentification().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_STATUS:
				getItemStatus().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_USAGE_TEXT:
				getItemUsageText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_VALUE:
				getItemValue().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_VISIBLE_ID:
				getItemVisibleID().clear();
				return;
			case _0Package.ITEM_TYPE__WEAPON_INDICATOR:
				getWeaponIndicator().clear();
				return;
			case _0Package.ITEM_TYPE__WEAPON_USAGE_INDICATOR:
				getWeaponUsageIndicator().clear();
				return;
			case _0Package.ITEM_TYPE__CONVEYANCE_SALES_TAX_PERCENT:
				getConveyanceSalesTaxPercent().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_AGE_MEASURE:
				getItemAgeMeasure().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_BINARY:
				getItemBinary().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_BRAND_NAME:
				getItemBrandName().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_CATEGORY_GROUP:
				getItemCategoryGroup().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_COLOR_GROUP:
				getItemColorGroup().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_CURRENT_RESALE_VALUE:
				getItemCurrentResaleValue().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_FIRST_SOLD_YEAR_DATE:
				getItemFirstSoldYearDate().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_HEIGHT_MEASURE:
				getItemHeightMeasure().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_IMAGE:
				getItemImage().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_LEASE_INDICATOR:
				getItemLeaseIndicator().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_LENGTH_MEASURE:
				getItemLengthMeasure().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_MAKE_NAME:
				getItemMakeName().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_MODEL_NAME:
				getItemModelName().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_MODEL_YEAR_DATE:
				getItemModelYearDate().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_OWNERSHIP_CATEGORY_TEXT:
				getItemOwnershipCategoryText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_QUANTITY:
				getItemQuantity().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_RENTAL_INDICATOR:
				getItemRentalIndicator().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_SIZE_DESCRIPTION_TEXT:
				getItemSizeDescriptionText().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_STYLE_GROUP:
				getItemStyleGroup().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_WEIGHT_MEASURE:
				getItemWeightMeasure().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_WIDTH_MEASURE:
				getItemWidthMeasure().clear();
				return;
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT_GROUP:
				getItemAugmentationPointGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.ITEM_TYPE__ITEM_NAME:
				return itemName != null && !itemName.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_ACTION_TEXT:
				return itemActionText != null && !itemActionText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_BAR_CODE_IDENTIFICATION:
				return itemBarCodeIdentification != null && !itemBarCodeIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_CONDITION_TEXT:
				return itemConditionText != null && !itemConditionText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_DEALER_IDENTIFICATION:
				return itemDealerIdentification != null && !itemDealerIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_DESCRIPTION_TEXT:
				return itemDescriptionText != null && !itemDescriptionText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_DISPOSITION:
				return itemDisposition != null && !itemDisposition.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_OTHER_IDENTIFICATION:
				return itemOtherIdentification != null && !itemOtherIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_OWNER:
				return itemOwner != null && !itemOwner.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_OWNER_APPLIED_ID:
				return itemOwnerAppliedID != null && !itemOwnerAppliedID.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_OWNER_PURCHASED_VALUE:
				return itemOwnerPurchasedValue != null && !itemOwnerPurchasedValue.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_POSSESSION_DESCRIPTION_TEXT:
				return itemPossessionDescriptionText != null && !itemPossessionDescriptionText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_POSSESSOR:
				return itemPossessor != null && !itemPossessor.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_RECEIPT_IDENTIFICATION:
				return itemReceiptIdentification != null && !itemReceiptIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_RF_IDENTIFICATION:
				return itemRFIdentification != null && !itemRFIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_SERIAL_IDENTIFICATION:
				return itemSerialIdentification != null && !itemSerialIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_STATE_IDENTIFICATION:
				return itemStateIdentification != null && !itemStateIdentification.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_STATUS:
				return itemStatus != null && !itemStatus.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_USAGE_TEXT:
				return itemUsageText != null && !itemUsageText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_VALUE:
				return itemValue != null && !itemValue.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_VISIBLE_ID:
				return itemVisibleID != null && !itemVisibleID.isEmpty();
			case _0Package.ITEM_TYPE__WEAPON_INDICATOR:
				return weaponIndicator != null && !weaponIndicator.isEmpty();
			case _0Package.ITEM_TYPE__WEAPON_USAGE_INDICATOR:
				return weaponUsageIndicator != null && !weaponUsageIndicator.isEmpty();
			case _0Package.ITEM_TYPE__CONVEYANCE_SALES_TAX_PERCENT:
				return conveyanceSalesTaxPercent != null && !conveyanceSalesTaxPercent.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_AGE_MEASURE:
				return itemAgeMeasure != null && !itemAgeMeasure.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_BINARY:
				return itemBinary != null && !itemBinary.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_BRAND_NAME:
				return itemBrandName != null && !itemBrandName.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_CATEGORY_GROUP:
				return itemCategoryGroup != null && !itemCategoryGroup.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_CATEGORY:
				return !getItemCategory().isEmpty();
			case _0Package.ITEM_TYPE__ITEM_COLOR_GROUP:
				return itemColorGroup != null && !itemColorGroup.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_COLOR:
				return !getItemColor().isEmpty();
			case _0Package.ITEM_TYPE__ITEM_CURRENT_RESALE_VALUE:
				return itemCurrentResaleValue != null && !itemCurrentResaleValue.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_FIRST_SOLD_YEAR_DATE:
				return itemFirstSoldYearDate != null && !itemFirstSoldYearDate.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_HEIGHT_MEASURE:
				return itemHeightMeasure != null && !itemHeightMeasure.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_IMAGE:
				return itemImage != null && !itemImage.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_LEASE_INDICATOR:
				return itemLeaseIndicator != null && !itemLeaseIndicator.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_LENGTH_MEASURE:
				return itemLengthMeasure != null && !itemLengthMeasure.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_MAKE_NAME:
				return itemMakeName != null && !itemMakeName.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_MODEL_NAME:
				return itemModelName != null && !itemModelName.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_MODEL_YEAR_DATE:
				return itemModelYearDate != null && !itemModelYearDate.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_OWNERSHIP_CATEGORY_TEXT:
				return itemOwnershipCategoryText != null && !itemOwnershipCategoryText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_QUANTITY:
				return itemQuantity != null && !itemQuantity.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_RENTAL_INDICATOR:
				return itemRentalIndicator != null && !itemRentalIndicator.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_SIZE_DESCRIPTION_TEXT:
				return itemSizeDescriptionText != null && !itemSizeDescriptionText.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_STYLE_GROUP:
				return itemStyleGroup != null && !itemStyleGroup.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_STYLE:
				return !getItemStyle().isEmpty();
			case _0Package.ITEM_TYPE__ITEM_WEIGHT_MEASURE:
				return itemWeightMeasure != null && !itemWeightMeasure.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_WIDTH_MEASURE:
				return itemWidthMeasure != null && !itemWidthMeasure.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT_GROUP:
				return itemAugmentationPointGroup != null && !itemAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_TYPE__ITEM_AUGMENTATION_POINT:
				return !getItemAugmentationPoint().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (itemCategoryGroup: ");
		result.append(itemCategoryGroup);
		result.append(", itemColorGroup: ");
		result.append(itemColorGroup);
		result.append(", itemStyleGroup: ");
		result.append(itemStyleGroup);
		result.append(", itemAugmentationPointGroup: ");
		result.append(itemAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
