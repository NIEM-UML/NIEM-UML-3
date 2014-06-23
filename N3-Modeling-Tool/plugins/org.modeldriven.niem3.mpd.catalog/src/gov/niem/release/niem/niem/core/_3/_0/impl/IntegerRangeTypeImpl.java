/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.IntegerRangeType;
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
 * An implementation of the model object '<em><b>Integer Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntegerRangeTypeImpl#getRangeMaximumIntegerValue <em>Range Maximum Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntegerRangeTypeImpl#getRangeMinimumIntegerValue <em>Range Minimum Integer Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntegerRangeTypeImpl#getIntegerRangeAugmentationPointGroup <em>Integer Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IntegerRangeTypeImpl#getIntegerRangeAugmentationPoint <em>Integer Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerRangeTypeImpl extends ObjectTypeImpl implements IntegerRangeType {
	/**
	 * The cached value of the '{@link #getRangeMaximumIntegerValue() <em>Range Maximum Integer Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMaximumIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> rangeMaximumIntegerValue;

	/**
	 * The cached value of the '{@link #getRangeMinimumIntegerValue() <em>Range Minimum Integer Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMinimumIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> rangeMinimumIntegerValue;

	/**
	 * The cached value of the '{@link #getIntegerRangeAugmentationPointGroup() <em>Integer Range Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerRangeAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap integerRangeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getIntegerRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getRangeMaximumIntegerValue() {
		if (rangeMaximumIntegerValue == null) {
			rangeMaximumIntegerValue = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Integer>(gov.niem.release.niem.proxy.xsd._3._0.Integer.class, this, _0Package.INTEGER_RANGE_TYPE__RANGE_MAXIMUM_INTEGER_VALUE);
		}
		return rangeMaximumIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getRangeMinimumIntegerValue() {
		if (rangeMinimumIntegerValue == null) {
			rangeMinimumIntegerValue = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Integer>(gov.niem.release.niem.proxy.xsd._3._0.Integer.class, this, _0Package.INTEGER_RANGE_TYPE__RANGE_MINIMUM_INTEGER_VALUE);
		}
		return rangeMinimumIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIntegerRangeAugmentationPointGroup() {
		if (integerRangeAugmentationPointGroup == null) {
			integerRangeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT_GROUP);
		}
		return integerRangeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIntegerRangeAugmentationPoint() {
		return getIntegerRangeAugmentationPointGroup().list(_0Package.eINSTANCE.getIntegerRangeType_IntegerRangeAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MAXIMUM_INTEGER_VALUE:
				return ((InternalEList<?>)getRangeMaximumIntegerValue()).basicRemove(otherEnd, msgs);
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MINIMUM_INTEGER_VALUE:
				return ((InternalEList<?>)getRangeMinimumIntegerValue()).basicRemove(otherEnd, msgs);
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getIntegerRangeAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getIntegerRangeAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MAXIMUM_INTEGER_VALUE:
				return getRangeMaximumIntegerValue();
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MINIMUM_INTEGER_VALUE:
				return getRangeMinimumIntegerValue();
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getIntegerRangeAugmentationPointGroup();
				return ((FeatureMap.Internal)getIntegerRangeAugmentationPointGroup()).getWrapper();
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT:
				return getIntegerRangeAugmentationPoint();
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
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MAXIMUM_INTEGER_VALUE:
				getRangeMaximumIntegerValue().clear();
				getRangeMaximumIntegerValue().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Integer>)newValue);
				return;
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MINIMUM_INTEGER_VALUE:
				getRangeMinimumIntegerValue().clear();
				getRangeMinimumIntegerValue().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Integer>)newValue);
				return;
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getIntegerRangeAugmentationPointGroup()).set(newValue);
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
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MAXIMUM_INTEGER_VALUE:
				getRangeMaximumIntegerValue().clear();
				return;
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MINIMUM_INTEGER_VALUE:
				getRangeMinimumIntegerValue().clear();
				return;
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				getIntegerRangeAugmentationPointGroup().clear();
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
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MAXIMUM_INTEGER_VALUE:
				return rangeMaximumIntegerValue != null && !rangeMaximumIntegerValue.isEmpty();
			case _0Package.INTEGER_RANGE_TYPE__RANGE_MINIMUM_INTEGER_VALUE:
				return rangeMinimumIntegerValue != null && !rangeMinimumIntegerValue.isEmpty();
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT_GROUP:
				return integerRangeAugmentationPointGroup != null && !integerRangeAugmentationPointGroup.isEmpty();
			case _0Package.INTEGER_RANGE_TYPE__INTEGER_RANGE_AUGMENTATION_POINT:
				return !getIntegerRangeAugmentationPoint().isEmpty();
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
		result.append(" (integerRangeAugmentationPointGroup: ");
		result.append(integerRangeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //IntegerRangeTypeImpl
