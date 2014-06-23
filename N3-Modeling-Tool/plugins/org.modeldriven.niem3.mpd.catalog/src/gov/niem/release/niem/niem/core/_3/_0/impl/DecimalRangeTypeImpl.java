/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DecimalRangeType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.Decimal;

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
 * An implementation of the model object '<em><b>Decimal Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecimalRangeTypeImpl#getRangeMinimumDecimalValue <em>Range Minimum Decimal Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecimalRangeTypeImpl#getRangeMaximumDecimalValue <em>Range Maximum Decimal Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecimalRangeTypeImpl#getDecimalRangeAugmentationPointGroup <em>Decimal Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DecimalRangeTypeImpl#getDecimalRangeAugmentationPoint <em>Decimal Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalRangeTypeImpl extends ObjectTypeImpl implements DecimalRangeType {
	/**
	 * The cached value of the '{@link #getRangeMinimumDecimalValue() <em>Range Minimum Decimal Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMinimumDecimalValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> rangeMinimumDecimalValue;

	/**
	 * The cached value of the '{@link #getRangeMaximumDecimalValue() <em>Range Maximum Decimal Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMaximumDecimalValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> rangeMaximumDecimalValue;

	/**
	 * The cached value of the '{@link #getDecimalRangeAugmentationPointGroup() <em>Decimal Range Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimalRangeAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap decimalRangeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDecimalRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decimal> getRangeMinimumDecimalValue() {
		if (rangeMinimumDecimalValue == null) {
			rangeMinimumDecimalValue = new EObjectContainmentEList<Decimal>(Decimal.class, this, _0Package.DECIMAL_RANGE_TYPE__RANGE_MINIMUM_DECIMAL_VALUE);
		}
		return rangeMinimumDecimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decimal> getRangeMaximumDecimalValue() {
		if (rangeMaximumDecimalValue == null) {
			rangeMaximumDecimalValue = new EObjectContainmentEList<Decimal>(Decimal.class, this, _0Package.DECIMAL_RANGE_TYPE__RANGE_MAXIMUM_DECIMAL_VALUE);
		}
		return rangeMaximumDecimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDecimalRangeAugmentationPointGroup() {
		if (decimalRangeAugmentationPointGroup == null) {
			decimalRangeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT_GROUP);
		}
		return decimalRangeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDecimalRangeAugmentationPoint() {
		return getDecimalRangeAugmentationPointGroup().list(_0Package.eINSTANCE.getDecimalRangeType_DecimalRangeAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MINIMUM_DECIMAL_VALUE:
				return ((InternalEList<?>)getRangeMinimumDecimalValue()).basicRemove(otherEnd, msgs);
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MAXIMUM_DECIMAL_VALUE:
				return ((InternalEList<?>)getRangeMaximumDecimalValue()).basicRemove(otherEnd, msgs);
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDecimalRangeAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDecimalRangeAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MINIMUM_DECIMAL_VALUE:
				return getRangeMinimumDecimalValue();
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MAXIMUM_DECIMAL_VALUE:
				return getRangeMaximumDecimalValue();
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDecimalRangeAugmentationPointGroup();
				return ((FeatureMap.Internal)getDecimalRangeAugmentationPointGroup()).getWrapper();
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT:
				return getDecimalRangeAugmentationPoint();
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
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MINIMUM_DECIMAL_VALUE:
				getRangeMinimumDecimalValue().clear();
				getRangeMinimumDecimalValue().addAll((Collection<? extends Decimal>)newValue);
				return;
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MAXIMUM_DECIMAL_VALUE:
				getRangeMaximumDecimalValue().clear();
				getRangeMaximumDecimalValue().addAll((Collection<? extends Decimal>)newValue);
				return;
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDecimalRangeAugmentationPointGroup()).set(newValue);
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
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MINIMUM_DECIMAL_VALUE:
				getRangeMinimumDecimalValue().clear();
				return;
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MAXIMUM_DECIMAL_VALUE:
				getRangeMaximumDecimalValue().clear();
				return;
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT_GROUP:
				getDecimalRangeAugmentationPointGroup().clear();
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
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MINIMUM_DECIMAL_VALUE:
				return rangeMinimumDecimalValue != null && !rangeMinimumDecimalValue.isEmpty();
			case _0Package.DECIMAL_RANGE_TYPE__RANGE_MAXIMUM_DECIMAL_VALUE:
				return rangeMaximumDecimalValue != null && !rangeMaximumDecimalValue.isEmpty();
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT_GROUP:
				return decimalRangeAugmentationPointGroup != null && !decimalRangeAugmentationPointGroup.isEmpty();
			case _0Package.DECIMAL_RANGE_TYPE__DECIMAL_RANGE_AUGMENTATION_POINT:
				return !getDecimalRangeAugmentationPoint().isEmpty();
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
		result.append(" (decimalRangeAugmentationPointGroup: ");
		result.append(decimalRangeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DecimalRangeTypeImpl
