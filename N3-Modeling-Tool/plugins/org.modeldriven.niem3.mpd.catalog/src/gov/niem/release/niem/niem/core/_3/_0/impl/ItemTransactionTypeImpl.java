/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ItemTransactionType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.ItemValueType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Item Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTransactionTypeImpl#getItemSeller <em>Item Seller</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTransactionTypeImpl#getItemPurchasePriceValue <em>Item Purchase Price Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTransactionTypeImpl#getItemBuyer <em>Item Buyer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTransactionTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTransactionTypeImpl#getItemTransactionAugmentationPointGroup <em>Item Transaction Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemTransactionTypeImpl#getItemTransactionAugmentationPoint <em>Item Transaction Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTransactionTypeImpl extends ActivityTypeImpl implements ItemTransactionType {
	/**
	 * The cached value of the '{@link #getItemSeller() <em>Item Seller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSeller()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> itemSeller;

	/**
	 * The cached value of the '{@link #getItemPurchasePriceValue() <em>Item Purchase Price Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemPurchasePriceValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemValueType> itemPurchasePriceValue;

	/**
	 * The cached value of the '{@link #getItemBuyer() <em>Item Buyer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemBuyer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> itemBuyer;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> item;

	/**
	 * The cached value of the '{@link #getItemTransactionAugmentationPointGroup() <em>Item Transaction Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemTransactionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemTransactionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemTransactionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getItemSeller() {
		if (itemSeller == null) {
			itemSeller = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_TRANSACTION_TYPE__ITEM_SELLER);
		}
		return itemSeller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemValueType> getItemPurchasePriceValue() {
		if (itemPurchasePriceValue == null) {
			itemPurchasePriceValue = new EObjectContainmentEList<ItemValueType>(ItemValueType.class, this, _0Package.ITEM_TRANSACTION_TYPE__ITEM_PURCHASE_PRICE_VALUE);
		}
		return itemPurchasePriceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getItemBuyer() {
		if (itemBuyer == null) {
			itemBuyer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_TRANSACTION_TYPE__ITEM_BUYER);
		}
		return itemBuyer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_TRANSACTION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemTransactionAugmentationPointGroup() {
		if (itemTransactionAugmentationPointGroup == null) {
			itemTransactionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT_GROUP);
		}
		return itemTransactionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemTransactionAugmentationPoint() {
		return getItemTransactionAugmentationPointGroup().list(_0Package.eINSTANCE.getItemTransactionType_ItemTransactionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_SELLER:
				return ((InternalEList<?>)getItemSeller()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_PURCHASE_PRICE_VALUE:
				return ((InternalEList<?>)getItemPurchasePriceValue()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_BUYER:
				return ((InternalEList<?>)getItemBuyer()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemTransactionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemTransactionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_SELLER:
				return getItemSeller();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_PURCHASE_PRICE_VALUE:
				return getItemPurchasePriceValue();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_BUYER:
				return getItemBuyer();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM:
				return getItem();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemTransactionAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemTransactionAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT:
				return getItemTransactionAugmentationPoint();
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
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_SELLER:
				getItemSeller().clear();
				getItemSeller().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_PURCHASE_PRICE_VALUE:
				getItemPurchasePriceValue().clear();
				getItemPurchasePriceValue().addAll((Collection<? extends ItemValueType>)newValue);
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_BUYER:
				getItemBuyer().clear();
				getItemBuyer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemTransactionAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_SELLER:
				getItemSeller().clear();
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_PURCHASE_PRICE_VALUE:
				getItemPurchasePriceValue().clear();
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_BUYER:
				getItemBuyer().clear();
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT_GROUP:
				getItemTransactionAugmentationPointGroup().clear();
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
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_SELLER:
				return itemSeller != null && !itemSeller.isEmpty();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_PURCHASE_PRICE_VALUE:
				return itemPurchasePriceValue != null && !itemPurchasePriceValue.isEmpty();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_BUYER:
				return itemBuyer != null && !itemBuyer.isEmpty();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT_GROUP:
				return itemTransactionAugmentationPointGroup != null && !itemTransactionAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_TRANSACTION_TYPE__ITEM_TRANSACTION_AUGMENTATION_POINT:
				return !getItemTransactionAugmentationPoint().isEmpty();
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
		result.append(" (itemTransactionAugmentationPointGroup: ");
		result.append(itemTransactionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemTransactionTypeImpl
