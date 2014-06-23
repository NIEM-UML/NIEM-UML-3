/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0.WeaponType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Weapon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.WeaponTypeImpl#getRoleOfItem <em>Role Of Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.WeaponTypeImpl#getWeaponUser <em>Weapon User</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.WeaponTypeImpl#getWeaponInvolvedInActivity <em>Weapon Involved In Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.WeaponTypeImpl#getWeaponUsageText <em>Weapon Usage Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.WeaponTypeImpl#getWeaponAugmentationPointGroup <em>Weapon Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.WeaponTypeImpl#getWeaponAugmentationPoint <em>Weapon Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaponTypeImpl extends ObjectTypeImpl implements WeaponType {
	/**
	 * The cached value of the '{@link #getRoleOfItem() <em>Role Of Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleOfItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> roleOfItem;

	/**
	 * The cached value of the '{@link #getWeaponUser() <em>Weapon User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaponUser()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> weaponUser;

	/**
	 * The cached value of the '{@link #getWeaponInvolvedInActivity() <em>Weapon Involved In Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaponInvolvedInActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> weaponInvolvedInActivity;

	/**
	 * The cached value of the '{@link #getWeaponUsageText() <em>Weapon Usage Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaponUsageText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> weaponUsageText;

	/**
	 * The cached value of the '{@link #getWeaponAugmentationPointGroup() <em>Weapon Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeaponAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap weaponAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaponTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getWeaponType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getRoleOfItem() {
		if (roleOfItem == null) {
			roleOfItem = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.WEAPON_TYPE__ROLE_OF_ITEM);
		}
		return roleOfItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getWeaponUser() {
		if (weaponUser == null) {
			weaponUser = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.WEAPON_TYPE__WEAPON_USER);
		}
		return weaponUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getWeaponInvolvedInActivity() {
		if (weaponInvolvedInActivity == null) {
			weaponInvolvedInActivity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.WEAPON_TYPE__WEAPON_INVOLVED_IN_ACTIVITY);
		}
		return weaponInvolvedInActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getWeaponUsageText() {
		if (weaponUsageText == null) {
			weaponUsageText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.WEAPON_TYPE__WEAPON_USAGE_TEXT);
		}
		return weaponUsageText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getWeaponAugmentationPointGroup() {
		if (weaponAugmentationPointGroup == null) {
			weaponAugmentationPointGroup = new BasicFeatureMap(this, _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT_GROUP);
		}
		return weaponAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getWeaponAugmentationPoint() {
		return getWeaponAugmentationPointGroup().list(_0Package.eINSTANCE.getWeaponType_WeaponAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.WEAPON_TYPE__ROLE_OF_ITEM:
				return ((InternalEList<?>)getRoleOfItem()).basicRemove(otherEnd, msgs);
			case _0Package.WEAPON_TYPE__WEAPON_USER:
				return ((InternalEList<?>)getWeaponUser()).basicRemove(otherEnd, msgs);
			case _0Package.WEAPON_TYPE__WEAPON_INVOLVED_IN_ACTIVITY:
				return ((InternalEList<?>)getWeaponInvolvedInActivity()).basicRemove(otherEnd, msgs);
			case _0Package.WEAPON_TYPE__WEAPON_USAGE_TEXT:
				return ((InternalEList<?>)getWeaponUsageText()).basicRemove(otherEnd, msgs);
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getWeaponAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT:
				return ((InternalEList<?>)getWeaponAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.WEAPON_TYPE__ROLE_OF_ITEM:
				return getRoleOfItem();
			case _0Package.WEAPON_TYPE__WEAPON_USER:
				return getWeaponUser();
			case _0Package.WEAPON_TYPE__WEAPON_INVOLVED_IN_ACTIVITY:
				return getWeaponInvolvedInActivity();
			case _0Package.WEAPON_TYPE__WEAPON_USAGE_TEXT:
				return getWeaponUsageText();
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT_GROUP:
				if (coreType) return getWeaponAugmentationPointGroup();
				return ((FeatureMap.Internal)getWeaponAugmentationPointGroup()).getWrapper();
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT:
				return getWeaponAugmentationPoint();
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
			case _0Package.WEAPON_TYPE__ROLE_OF_ITEM:
				getRoleOfItem().clear();
				getRoleOfItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.WEAPON_TYPE__WEAPON_USER:
				getWeaponUser().clear();
				getWeaponUser().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.WEAPON_TYPE__WEAPON_INVOLVED_IN_ACTIVITY:
				getWeaponInvolvedInActivity().clear();
				getWeaponInvolvedInActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.WEAPON_TYPE__WEAPON_USAGE_TEXT:
				getWeaponUsageText().clear();
				getWeaponUsageText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getWeaponAugmentationPointGroup()).set(newValue);
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
			case _0Package.WEAPON_TYPE__ROLE_OF_ITEM:
				getRoleOfItem().clear();
				return;
			case _0Package.WEAPON_TYPE__WEAPON_USER:
				getWeaponUser().clear();
				return;
			case _0Package.WEAPON_TYPE__WEAPON_INVOLVED_IN_ACTIVITY:
				getWeaponInvolvedInActivity().clear();
				return;
			case _0Package.WEAPON_TYPE__WEAPON_USAGE_TEXT:
				getWeaponUsageText().clear();
				return;
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT_GROUP:
				getWeaponAugmentationPointGroup().clear();
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
			case _0Package.WEAPON_TYPE__ROLE_OF_ITEM:
				return roleOfItem != null && !roleOfItem.isEmpty();
			case _0Package.WEAPON_TYPE__WEAPON_USER:
				return weaponUser != null && !weaponUser.isEmpty();
			case _0Package.WEAPON_TYPE__WEAPON_INVOLVED_IN_ACTIVITY:
				return weaponInvolvedInActivity != null && !weaponInvolvedInActivity.isEmpty();
			case _0Package.WEAPON_TYPE__WEAPON_USAGE_TEXT:
				return weaponUsageText != null && !weaponUsageText.isEmpty();
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT_GROUP:
				return weaponAugmentationPointGroup != null && !weaponAugmentationPointGroup.isEmpty();
			case _0Package.WEAPON_TYPE__WEAPON_AUGMENTATION_POINT:
				return !getWeaponAugmentationPoint().isEmpty();
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
		result.append(" (weaponAugmentationPointGroup: ");
		result.append(weaponAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //WeaponTypeImpl
