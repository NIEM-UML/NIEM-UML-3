/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DoubleRangeType;
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
 * An implementation of the model object '<em><b>Double Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DoubleRangeTypeImpl#getRangeMaximumDoubleValue <em>Range Maximum Double Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DoubleRangeTypeImpl#getRangeMinimumDoubleValue <em>Range Minimum Double Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DoubleRangeTypeImpl#getDoubleRangeAugmentationPointGroup <em>Double Range Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DoubleRangeTypeImpl#getDoubleRangeAugmentationPoint <em>Double Range Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleRangeTypeImpl extends ObjectTypeImpl implements DoubleRangeType {
	/**
	 * The cached value of the '{@link #getRangeMaximumDoubleValue() <em>Range Maximum Double Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMaximumDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Double> rangeMaximumDoubleValue;

	/**
	 * The cached value of the '{@link #getRangeMinimumDoubleValue() <em>Range Minimum Double Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeMinimumDoubleValue()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Double> rangeMinimumDoubleValue;

	/**
	 * The cached value of the '{@link #getDoubleRangeAugmentationPointGroup() <em>Double Range Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleRangeAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap doubleRangeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDoubleRangeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Double> getRangeMaximumDoubleValue() {
		if (rangeMaximumDoubleValue == null) {
			rangeMaximumDoubleValue = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Double>(gov.niem.release.niem.proxy.xsd._3._0.Double.class, this, _0Package.DOUBLE_RANGE_TYPE__RANGE_MAXIMUM_DOUBLE_VALUE);
		}
		return rangeMaximumDoubleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Double> getRangeMinimumDoubleValue() {
		if (rangeMinimumDoubleValue == null) {
			rangeMinimumDoubleValue = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Double>(gov.niem.release.niem.proxy.xsd._3._0.Double.class, this, _0Package.DOUBLE_RANGE_TYPE__RANGE_MINIMUM_DOUBLE_VALUE);
		}
		return rangeMinimumDoubleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDoubleRangeAugmentationPointGroup() {
		if (doubleRangeAugmentationPointGroup == null) {
			doubleRangeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT_GROUP);
		}
		return doubleRangeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDoubleRangeAugmentationPoint() {
		return getDoubleRangeAugmentationPointGroup().list(_0Package.eINSTANCE.getDoubleRangeType_DoubleRangeAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MAXIMUM_DOUBLE_VALUE:
				return ((InternalEList<?>)getRangeMaximumDoubleValue()).basicRemove(otherEnd, msgs);
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MINIMUM_DOUBLE_VALUE:
				return ((InternalEList<?>)getRangeMinimumDoubleValue()).basicRemove(otherEnd, msgs);
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDoubleRangeAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDoubleRangeAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MAXIMUM_DOUBLE_VALUE:
				return getRangeMaximumDoubleValue();
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MINIMUM_DOUBLE_VALUE:
				return getRangeMinimumDoubleValue();
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDoubleRangeAugmentationPointGroup();
				return ((FeatureMap.Internal)getDoubleRangeAugmentationPointGroup()).getWrapper();
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT:
				return getDoubleRangeAugmentationPoint();
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
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MAXIMUM_DOUBLE_VALUE:
				getRangeMaximumDoubleValue().clear();
				getRangeMaximumDoubleValue().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Double>)newValue);
				return;
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MINIMUM_DOUBLE_VALUE:
				getRangeMinimumDoubleValue().clear();
				getRangeMinimumDoubleValue().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Double>)newValue);
				return;
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDoubleRangeAugmentationPointGroup()).set(newValue);
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
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MAXIMUM_DOUBLE_VALUE:
				getRangeMaximumDoubleValue().clear();
				return;
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MINIMUM_DOUBLE_VALUE:
				getRangeMinimumDoubleValue().clear();
				return;
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT_GROUP:
				getDoubleRangeAugmentationPointGroup().clear();
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
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MAXIMUM_DOUBLE_VALUE:
				return rangeMaximumDoubleValue != null && !rangeMaximumDoubleValue.isEmpty();
			case _0Package.DOUBLE_RANGE_TYPE__RANGE_MINIMUM_DOUBLE_VALUE:
				return rangeMinimumDoubleValue != null && !rangeMinimumDoubleValue.isEmpty();
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT_GROUP:
				return doubleRangeAugmentationPointGroup != null && !doubleRangeAugmentationPointGroup.isEmpty();
			case _0Package.DOUBLE_RANGE_TYPE__DOUBLE_RANGE_AUGMENTATION_POINT:
				return !getDoubleRangeAugmentationPoint().isEmpty();
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
		result.append(" (doubleRangeAugmentationPointGroup: ");
		result.append(doubleRangeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DoubleRangeTypeImpl
