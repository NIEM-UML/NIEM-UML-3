/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ItemDispositionType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationType;
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
 * An implementation of the model object '<em><b>Item Disposition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemDispositionTypeImpl#getItemDispositionLocation <em>Item Disposition Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemDispositionTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemDispositionTypeImpl#getItemHoldingOrganization <em>Item Holding Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemDispositionTypeImpl#getItemMovingOrganization <em>Item Moving Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemDispositionTypeImpl#getItemDispositionAugmentationPointGroup <em>Item Disposition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemDispositionTypeImpl#getItemDispositionAugmentationPoint <em>Item Disposition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemDispositionTypeImpl extends DispositionTypeImpl implements ItemDispositionType {
	/**
	 * The cached value of the '{@link #getItemDispositionLocation() <em>Item Disposition Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDispositionLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> itemDispositionLocation;

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
	 * The cached value of the '{@link #getItemHoldingOrganization() <em>Item Holding Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemHoldingOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> itemHoldingOrganization;

	/**
	 * The cached value of the '{@link #getItemMovingOrganization() <em>Item Moving Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemMovingOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> itemMovingOrganization;

	/**
	 * The cached value of the '{@link #getItemDispositionAugmentationPointGroup() <em>Item Disposition Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDispositionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemDispositionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDispositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemDispositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getItemDispositionLocation() {
		if (itemDispositionLocation == null) {
			itemDispositionLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_LOCATION);
		}
		return itemDispositionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_DISPOSITION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getItemHoldingOrganization() {
		if (itemHoldingOrganization == null) {
			itemHoldingOrganization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ITEM_DISPOSITION_TYPE__ITEM_HOLDING_ORGANIZATION);
		}
		return itemHoldingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getItemMovingOrganization() {
		if (itemMovingOrganization == null) {
			itemMovingOrganization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ITEM_DISPOSITION_TYPE__ITEM_MOVING_ORGANIZATION);
		}
		return itemMovingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemDispositionAugmentationPointGroup() {
		if (itemDispositionAugmentationPointGroup == null) {
			itemDispositionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT_GROUP);
		}
		return itemDispositionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemDispositionAugmentationPoint() {
		return getItemDispositionAugmentationPointGroup().list(_0Package.eINSTANCE.getItemDispositionType_ItemDispositionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_LOCATION:
				return ((InternalEList<?>)getItemDispositionLocation()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_HOLDING_ORGANIZATION:
				return ((InternalEList<?>)getItemHoldingOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_MOVING_ORGANIZATION:
				return ((InternalEList<?>)getItemMovingOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemDispositionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemDispositionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_LOCATION:
				return getItemDispositionLocation();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM:
				return getItem();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_HOLDING_ORGANIZATION:
				return getItemHoldingOrganization();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_MOVING_ORGANIZATION:
				return getItemMovingOrganization();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemDispositionAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemDispositionAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT:
				return getItemDispositionAugmentationPoint();
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
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_LOCATION:
				getItemDispositionLocation().clear();
				getItemDispositionLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_HOLDING_ORGANIZATION:
				getItemHoldingOrganization().clear();
				getItemHoldingOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_MOVING_ORGANIZATION:
				getItemMovingOrganization().clear();
				getItemMovingOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemDispositionAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_LOCATION:
				getItemDispositionLocation().clear();
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_HOLDING_ORGANIZATION:
				getItemHoldingOrganization().clear();
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_MOVING_ORGANIZATION:
				getItemMovingOrganization().clear();
				return;
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT_GROUP:
				getItemDispositionAugmentationPointGroup().clear();
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
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_LOCATION:
				return itemDispositionLocation != null && !itemDispositionLocation.isEmpty();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_HOLDING_ORGANIZATION:
				return itemHoldingOrganization != null && !itemHoldingOrganization.isEmpty();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_MOVING_ORGANIZATION:
				return itemMovingOrganization != null && !itemMovingOrganization.isEmpty();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT_GROUP:
				return itemDispositionAugmentationPointGroup != null && !itemDispositionAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_DISPOSITION_TYPE__ITEM_DISPOSITION_AUGMENTATION_POINT:
				return !getItemDispositionAugmentationPoint().isEmpty();
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
		result.append(" (itemDispositionAugmentationPointGroup: ");
		result.append(itemDispositionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemDispositionTypeImpl
