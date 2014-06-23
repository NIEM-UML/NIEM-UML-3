/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.TelephoneNumberType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelephoneNumberTypeImpl#getTelephoneNumberRepresentationGroup <em>Telephone Number Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelephoneNumberTypeImpl#getTelephoneNumberRepresentation <em>Telephone Number Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelephoneNumberTypeImpl#getTelephoneNumberCategoryGroup <em>Telephone Number Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelephoneNumberTypeImpl#getTelephoneNumberCategory <em>Telephone Number Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelephoneNumberTypeImpl#getTelephoneNumberAugmentationPointGroup <em>Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TelephoneNumberTypeImpl#getTelephoneNumberAugmentationPoint <em>Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TelephoneNumberTypeImpl extends ObjectTypeImpl implements TelephoneNumberType {
	/**
	 * The cached value of the '{@link #getTelephoneNumberRepresentationGroup() <em>Telephone Number Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap telephoneNumberRepresentationGroup;

	/**
	 * The cached value of the '{@link #getTelephoneNumberCategoryGroup() <em>Telephone Number Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap telephoneNumberCategoryGroup;

	/**
	 * The cached value of the '{@link #getTelephoneNumberAugmentationPointGroup() <em>Telephone Number Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumberAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap telephoneNumberAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getTelephoneNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTelephoneNumberRepresentationGroup() {
		if (telephoneNumberRepresentationGroup == null) {
			telephoneNumberRepresentationGroup = new BasicFeatureMap(this, _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION_GROUP);
		}
		return telephoneNumberRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTelephoneNumberRepresentation() {
		return getTelephoneNumberRepresentationGroup().list(_0Package.eINSTANCE.getTelephoneNumberType_TelephoneNumberRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTelephoneNumberCategoryGroup() {
		if (telephoneNumberCategoryGroup == null) {
			telephoneNumberCategoryGroup = new BasicFeatureMap(this, _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY_GROUP);
		}
		return telephoneNumberCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTelephoneNumberCategory() {
		return getTelephoneNumberCategoryGroup().list(_0Package.eINSTANCE.getTelephoneNumberType_TelephoneNumberCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTelephoneNumberAugmentationPointGroup() {
		if (telephoneNumberAugmentationPointGroup == null) {
			telephoneNumberAugmentationPointGroup = new BasicFeatureMap(this, _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP);
		}
		return telephoneNumberAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTelephoneNumberAugmentationPoint() {
		return getTelephoneNumberAugmentationPointGroup().list(_0Package.eINSTANCE.getTelephoneNumberType_TelephoneNumberAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getTelephoneNumberRepresentationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION:
				return ((InternalEList<?>)getTelephoneNumberRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY_GROUP:
				return ((InternalEList<?>)getTelephoneNumberCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY:
				return ((InternalEList<?>)getTelephoneNumberCategory()).basicRemove(otherEnd, msgs);
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getTelephoneNumberAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getTelephoneNumberAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION_GROUP:
				if (coreType) return getTelephoneNumberRepresentationGroup();
				return ((FeatureMap.Internal)getTelephoneNumberRepresentationGroup()).getWrapper();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION:
				return getTelephoneNumberRepresentation();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY_GROUP:
				if (coreType) return getTelephoneNumberCategoryGroup();
				return ((FeatureMap.Internal)getTelephoneNumberCategoryGroup()).getWrapper();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY:
				return getTelephoneNumberCategory();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getTelephoneNumberAugmentationPointGroup();
				return ((FeatureMap.Internal)getTelephoneNumberAugmentationPointGroup()).getWrapper();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return getTelephoneNumberAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getTelephoneNumberRepresentationGroup()).set(newValue);
				return;
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY_GROUP:
				((FeatureMap.Internal)getTelephoneNumberCategoryGroup()).set(newValue);
				return;
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getTelephoneNumberAugmentationPointGroup()).set(newValue);
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
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION_GROUP:
				getTelephoneNumberRepresentationGroup().clear();
				return;
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY_GROUP:
				getTelephoneNumberCategoryGroup().clear();
				return;
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				getTelephoneNumberAugmentationPointGroup().clear();
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
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION_GROUP:
				return telephoneNumberRepresentationGroup != null && !telephoneNumberRepresentationGroup.isEmpty();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_REPRESENTATION:
				return !getTelephoneNumberRepresentation().isEmpty();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY_GROUP:
				return telephoneNumberCategoryGroup != null && !telephoneNumberCategoryGroup.isEmpty();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_CATEGORY:
				return !getTelephoneNumberCategory().isEmpty();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT_GROUP:
				return telephoneNumberAugmentationPointGroup != null && !telephoneNumberAugmentationPointGroup.isEmpty();
			case _0Package.TELEPHONE_NUMBER_TYPE__TELEPHONE_NUMBER_AUGMENTATION_POINT:
				return !getTelephoneNumberAugmentationPoint().isEmpty();
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
		result.append(" (telephoneNumberRepresentationGroup: ");
		result.append(telephoneNumberRepresentationGroup);
		result.append(", telephoneNumberCategoryGroup: ");
		result.append(telephoneNumberCategoryGroup);
		result.append(", telephoneNumberAugmentationPointGroup: ");
		result.append(telephoneNumberAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //TelephoneNumberTypeImpl
