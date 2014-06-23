/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.InsuranceType;
import gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType;
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
 * An implementation of the model object '<em><b>Item Insurance Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemInsuranceAssociationTypeImpl#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemInsuranceAssociationTypeImpl#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemInsuranceAssociationTypeImpl#getInsurancePolicyHolder <em>Insurance Policy Holder</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemInsuranceAssociationTypeImpl#getRelatedActivity <em>Related Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemInsuranceAssociationTypeImpl#getItemInsuranceAssociationAugmentationPointGroup <em>Item Insurance Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ItemInsuranceAssociationTypeImpl#getItemInsuranceAssociationAugmentationPoint <em>Item Insurance Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemInsuranceAssociationTypeImpl extends AssociationTypeImpl implements ItemInsuranceAssociationType {
	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<InsuranceType> insurance;

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
	 * The cached value of the '{@link #getInsurancePolicyHolder() <em>Insurance Policy Holder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurancePolicyHolder()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> insurancePolicyHolder;

	/**
	 * The cached value of the '{@link #getRelatedActivity() <em>Related Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> relatedActivity;

	/**
	 * The cached value of the '{@link #getItemInsuranceAssociationAugmentationPointGroup() <em>Item Insurance Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemInsuranceAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap itemInsuranceAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemInsuranceAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getItemInsuranceAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsuranceType> getInsurance() {
		if (insurance == null) {
			insurance = new EObjectContainmentEList<InsuranceType>(InsuranceType.class, this, _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE);
		}
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getInsurancePolicyHolder() {
		if (insurancePolicyHolder == null) {
			insurancePolicyHolder = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE_POLICY_HOLDER);
		}
		return insurancePolicyHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getRelatedActivity() {
		if (relatedActivity == null) {
			relatedActivity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__RELATED_ACTIVITY);
		}
		return relatedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getItemInsuranceAssociationAugmentationPointGroup() {
		if (itemInsuranceAssociationAugmentationPointGroup == null) {
			itemInsuranceAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return itemInsuranceAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getItemInsuranceAssociationAugmentationPoint() {
		return getItemInsuranceAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getItemInsuranceAssociationType_ItemInsuranceAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE:
				return ((InternalEList<?>)getInsurance()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE_POLICY_HOLDER:
				return ((InternalEList<?>)getInsurancePolicyHolder()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__RELATED_ACTIVITY:
				return ((InternalEList<?>)getRelatedActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getItemInsuranceAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getItemInsuranceAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE:
				return getInsurance();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM:
				return getItem();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE_POLICY_HOLDER:
				return getInsurancePolicyHolder();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__RELATED_ACTIVITY:
				return getRelatedActivity();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getItemInsuranceAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getItemInsuranceAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT:
				return getItemInsuranceAssociationAugmentationPoint();
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
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE:
				getInsurance().clear();
				getInsurance().addAll((Collection<? extends InsuranceType>)newValue);
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE_POLICY_HOLDER:
				getInsurancePolicyHolder().clear();
				getInsurancePolicyHolder().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__RELATED_ACTIVITY:
				getRelatedActivity().clear();
				getRelatedActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getItemInsuranceAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE:
				getInsurance().clear();
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM:
				getItem().clear();
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE_POLICY_HOLDER:
				getInsurancePolicyHolder().clear();
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__RELATED_ACTIVITY:
				getRelatedActivity().clear();
				return;
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getItemInsuranceAssociationAugmentationPointGroup().clear();
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
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE:
				return insurance != null && !insurance.isEmpty();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM:
				return item != null && !item.isEmpty();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__INSURANCE_POLICY_HOLDER:
				return insurancePolicyHolder != null && !insurancePolicyHolder.isEmpty();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__RELATED_ACTIVITY:
				return relatedActivity != null && !relatedActivity.isEmpty();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return itemInsuranceAssociationAugmentationPointGroup != null && !itemInsuranceAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ITEM_INSURANCE_ASSOCIATION_TYPE__ITEM_INSURANCE_ASSOCIATION_AUGMENTATION_POINT:
				return !getItemInsuranceAssociationAugmentationPoint().isEmpty();
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
		result.append(" (itemInsuranceAssociationAugmentationPointGroup: ");
		result.append(itemInsuranceAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ItemInsuranceAssociationTypeImpl
