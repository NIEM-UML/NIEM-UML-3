/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ItemLocationAssociationType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
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
 * An implementation of the model object '<em><b>Item Location Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemLocationAssociationTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemLocationAssociationTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemLocationAssociationTypeImpl#getItemLocationAssociationAugmentationPointGroup <em>Item Location Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemLocationAssociationTypeImpl#getItemLocationAssociationAugmentationPoint <em>Item Location Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemLocationAssociationTypeImpl extends AssociationTypeImpl implements ItemLocationAssociationType {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> location;

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
	 * The cached value of the '{@link #getItemLocationAssociationAugmentationPointGroup() <em>Item Location Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemLocationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemLocationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemLocationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemLocationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemLocationAssociationAugmentationPointGroup() {
		if (itemLocationAssociationAugmentationPointGroup == null) {
			itemLocationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return itemLocationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemLocationAssociationAugmentationPoint() {
		return getItemLocationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getItemLocationAssociationType_ItemLocationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemLocationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemLocationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return getLocation();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM:
				return getItem();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemLocationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemLocationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return getItemLocationAssociationAugmentationPoint();
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
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemLocationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				return;
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getItemLocationAssociationAugmentationPointGroup().clear();
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
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return location != null && !location.isEmpty();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return itemLocationAssociationAugmentationPointGroup != null && !itemLocationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_LOCATION_ASSOCIATION_TYPE__ITEM_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getItemLocationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (itemLocationAssociationAugmentationPointGroup: ");
		result.append(itemLocationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemLocationAssociationTypeImpl
