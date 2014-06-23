/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.UnsignedIntegerRangeType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt;

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
 * An implementation of the model object '<em><b>Unsigned Integer Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UnsignedIntegerRangeTypeImpl#getRangeMaximumUnsignedIntegerValue <em>Range Maximum Unsigned Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UnsignedIntegerRangeTypeImpl#getRangeMinimumUnsignedIntegerValue <em>Range Minimum Unsigned Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UnsignedIntegerRangeTypeImpl#getUnsignedIntegerRangeAugmentationPointGroup <em>Unsigned Integer Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UnsignedIntegerRangeTypeImpl#getUnsignedIntegerRangeAugmentationPoint <em>Unsigned Integer Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnsignedIntegerRangeTypeImpl extends ObjectTypeImpl implements UnsignedIntegerRangeType {
	/**
	 * The cached value of the '{@link #getRangeMaximumUnsignedIntegerValue() <em>Range Maximum Unsigned Integer Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMaximumUnsignedIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> rangeMaximumUnsignedIntegerValue;

	/**
	 * The cached value of the '{@link #getRangeMinimumUnsignedIntegerValue() <em>Range Minimum Unsigned Integer Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMinimumUnsignedIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> rangeMinimumUnsignedIntegerValue;

	/**
	 * The cached value of the '{@link #getUnsignedIntegerRangeAugmentationPointGroup() <em>Unsigned Integer Range Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsignedIntegerRangeAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap unsignedIntegerRangeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsignedIntegerRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getUnsignedIntegerRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getRangeMaximumUnsignedIntegerValue() {
		if (rangeMaximumUnsignedIntegerValue == null) {
			rangeMaximumUnsignedIntegerValue = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MAXIMUM_UNSIGNED_INTEGER_VALUE);
		}
		return rangeMaximumUnsignedIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getRangeMinimumUnsignedIntegerValue() {
		if (rangeMinimumUnsignedIntegerValue == null) {
			rangeMinimumUnsignedIntegerValue = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MINIMUM_UNSIGNED_INTEGER_VALUE);
		}
		return rangeMinimumUnsignedIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getUnsignedIntegerRangeAugmentationPointGroup() {
		if (unsignedIntegerRangeAugmentationPointGroup == null) {
			unsignedIntegerRangeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT_GROUP);
		}
		return unsignedIntegerRangeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUnsignedIntegerRangeAugmentationPoint() {
		return getUnsignedIntegerRangeAugmentationPointGroup().list(_0Package.eINSTANCE.getUnsignedIntegerRangeType_UnsignedIntegerRangeAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MAXIMUM_UNSIGNED_INTEGER_VALUE:
				return ((InternalEList<?>)getRangeMaximumUnsignedIntegerValue()).basicRemove(otherEnd, msgs);
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MINIMUM_UNSIGNED_INTEGER_VALUE:
				return ((InternalEList<?>)getRangeMinimumUnsignedIntegerValue()).basicRemove(otherEnd, msgs);
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getUnsignedIntegerRangeAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getUnsignedIntegerRangeAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MAXIMUM_UNSIGNED_INTEGER_VALUE:
				return getRangeMaximumUnsignedIntegerValue();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MINIMUM_UNSIGNED_INTEGER_VALUE:
				return getRangeMinimumUnsignedIntegerValue();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getUnsignedIntegerRangeAugmentationPointGroup();
				return ((FeatureMap.Internal)getUnsignedIntegerRangeAugmentationPointGroup()).getWrapper();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT:
				return getUnsignedIntegerRangeAugmentationPoint();
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
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MAXIMUM_UNSIGNED_INTEGER_VALUE:
				getRangeMaximumUnsignedIntegerValue().clear();
				getRangeMaximumUnsignedIntegerValue().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MINIMUM_UNSIGNED_INTEGER_VALUE:
				getRangeMinimumUnsignedIntegerValue().clear();
				getRangeMinimumUnsignedIntegerValue().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getUnsignedIntegerRangeAugmentationPointGroup()).set(newValue);
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
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MAXIMUM_UNSIGNED_INTEGER_VALUE:
				getRangeMaximumUnsignedIntegerValue().clear();
				return;
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MINIMUM_UNSIGNED_INTEGER_VALUE:
				getRangeMinimumUnsignedIntegerValue().clear();
				return;
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				getUnsignedIntegerRangeAugmentationPointGroup().clear();
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
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MAXIMUM_UNSIGNED_INTEGER_VALUE:
				return rangeMaximumUnsignedIntegerValue != null && !rangeMaximumUnsignedIntegerValue.isEmpty();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__RANGE_MINIMUM_UNSIGNED_INTEGER_VALUE:
				return rangeMinimumUnsignedIntegerValue != null && !rangeMinimumUnsignedIntegerValue.isEmpty();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				return unsignedIntegerRangeAugmentationPointGroup != null && !unsignedIntegerRangeAugmentationPointGroup.isEmpty();
			case _0Package.UNSIGNED_INTEGER_RANGE_TYPE__UNSIGNED_INTEGER_RANGE_AUGMENTATION_POINT:
				return !getUnsignedIntegerRangeAugmentationPoint().isEmpty();
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
		result.append(" (unsignedIntegerRangeAugmentationPointGroup: ");
		result.append(unsignedIntegerRangeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //UnsignedIntegerRangeTypeImpl
