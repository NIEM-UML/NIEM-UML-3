/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType;
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
 * An implementation of the model object '<em><b>Item Container Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemContainerAssociationTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemContainerAssociationTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemContainerAssociationTypeImpl#getItemContainerAssociationAugmentationPointGroup <em>Item Container Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemContainerAssociationTypeImpl#getItemContainerAssociationAugmentationPoint <em>Item Container Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemContainerAssociationTypeImpl extends AssociationTypeImpl implements ItemContainerAssociationType {
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
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> container;

	/**
	 * The cached value of the '{@link #getItemContainerAssociationAugmentationPointGroup() <em>Item Container Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemContainerAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemContainerAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemContainerAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemContainerAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemContainerAssociationAugmentationPointGroup() {
		if (itemContainerAssociationAugmentationPointGroup == null) {
			itemContainerAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return itemContainerAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemContainerAssociationAugmentationPoint() {
		return getItemContainerAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getItemContainerAssociationType_ItemContainerAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemContainerAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemContainerAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM:
				return getItem();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__CONTAINER:
				return getContainer();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemContainerAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemContainerAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT:
				return getItemContainerAssociationAugmentationPoint();
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
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemContainerAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__CONTAINER:
				getContainer().clear();
				return;
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getItemContainerAssociationAugmentationPointGroup().clear();
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
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__CONTAINER:
				return container != null && !container.isEmpty();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return itemContainerAssociationAugmentationPointGroup != null && !itemContainerAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_CONTAINER_ASSOCIATION_TYPE__ITEM_CONTAINER_ASSOCIATION_AUGMENTATION_POINT:
				return !getItemContainerAssociationAugmentationPoint().isEmpty();
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
		result.append(" (itemContainerAssociationAugmentationPointGroup: ");
		result.append(itemContainerAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemContainerAssociationTypeImpl
