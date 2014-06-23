/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityItemAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
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
 * An implementation of the model object '<em><b>Activity Item Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityItemAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityItemAssociationTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityItemAssociationTypeImpl#getActivityItemAssociationAugmentationPointGroup <em>Activity Item Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityItemAssociationTypeImpl#getActivityItemAssociationAugmentationPoint <em>Activity Item Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityItemAssociationTypeImpl extends AssociationTypeImpl implements ActivityItemAssociationType {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> activity;

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
	 * The cached value of the '{@link #getActivityItemAssociationAugmentationPointGroup() <em>Activity Item Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityItemAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityItemAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityItemAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityItemAssociationAugmentationPointGroup() {
		if (activityItemAssociationAugmentationPointGroup == null) {
			activityItemAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activityItemAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityItemAssociationAugmentationPoint() {
		return getActivityItemAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityItemAssociationType_ActivityItemAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityItemAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityItemAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ITEM:
				return getItem();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityItemAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityItemAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT:
				return getActivityItemAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityItemAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivityItemAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activityItemAssociationAugmentationPointGroup != null && !activityItemAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_ITEM_ASSOCIATION_TYPE__ACTIVITY_ITEM_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivityItemAssociationAugmentationPoint().isEmpty();
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
		result.append(" (activityItemAssociationAugmentationPointGroup: ");
		result.append(activityItemAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityItemAssociationTypeImpl