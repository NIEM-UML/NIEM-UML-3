/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
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
 * An implementation of the model object '<em><b>Item Entity Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemEntityAssociationTypeImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemEntityAssociationTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemEntityAssociationTypeImpl#getItemEntityAssociationAugmentationPointGroup <em>Item Entity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemEntityAssociationTypeImpl#getItemEntityAssociationAugmentationPoint <em>Item Entity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemEntityAssociationTypeImpl extends AssociationTypeImpl implements ItemEntityAssociationType {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> entity;

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
	 * The cached value of the '{@link #getItemEntityAssociationAugmentationPointGroup() <em>Item Entity Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemEntityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemEntityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemEntityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemEntityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemEntityAssociationAugmentationPointGroup() {
		if (itemEntityAssociationAugmentationPointGroup == null) {
			itemEntityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return itemEntityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemEntityAssociationAugmentationPoint() {
		return getItemEntityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getItemEntityAssociationType_ItemEntityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemEntityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemEntityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ENTITY:
				return getEntity();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM:
				return getItem();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemEntityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemEntityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT:
				return getItemEntityAssociationAugmentationPoint();
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
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemEntityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ENTITY:
				getEntity().clear();
				return;
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getItemEntityAssociationAugmentationPointGroup().clear();
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
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ENTITY:
				return entity != null && !entity.isEmpty();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return itemEntityAssociationAugmentationPointGroup != null && !itemEntityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_ENTITY_ASSOCIATION_TYPE__ITEM_ENTITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getItemEntityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (itemEntityAssociationAugmentationPointGroup: ");
		result.append(itemEntityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemEntityAssociationTypeImpl
