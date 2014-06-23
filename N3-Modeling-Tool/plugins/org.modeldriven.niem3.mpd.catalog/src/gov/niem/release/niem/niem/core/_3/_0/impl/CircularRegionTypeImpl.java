/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CircularRegionType;
import gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType;
import gov.niem.release.niem.niem.core._3._0.MeasureType;
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
 * An implementation of the model object '<em><b>Circular Region Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CircularRegionTypeImpl#getCircularRegionCenterCoordinate <em>Circular Region Center Coordinate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CircularRegionTypeImpl#getCircularRegionRadiusLengthMeasure <em>Circular Region Radius Length Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CircularRegionTypeImpl#getCircularRegionAugmentationPointGroup <em>Circular Region Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CircularRegionTypeImpl#getCircularRegionAugmentationPoint <em>Circular Region Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircularRegionTypeImpl extends ObjectTypeImpl implements CircularRegionType {
	/**
	 * The cached value of the '{@link #getCircularRegionCenterCoordinate() <em>Circular Region Center Coordinate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircularRegionCenterCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<Location2DGeospatialCoordinateType> circularRegionCenterCoordinate;

	/**
	 * The cached value of the '{@link #getCircularRegionRadiusLengthMeasure() <em>Circular Region Radius Length Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircularRegionRadiusLengthMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> circularRegionRadiusLengthMeasure;

	/**
	 * The cached value of the '{@link #getCircularRegionAugmentationPointGroup() <em>Circular Region Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircularRegionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap circularRegionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircularRegionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCircularRegionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location2DGeospatialCoordinateType> getCircularRegionCenterCoordinate() {
		if (circularRegionCenterCoordinate == null) {
			circularRegionCenterCoordinate = new EObjectContainmentEList<Location2DGeospatialCoordinateType>(Location2DGeospatialCoordinateType.class, this, _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_CENTER_COORDINATE);
		}
		return circularRegionCenterCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getCircularRegionRadiusLengthMeasure() {
		if (circularRegionRadiusLengthMeasure == null) {
			circularRegionRadiusLengthMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_RADIUS_LENGTH_MEASURE);
		}
		return circularRegionRadiusLengthMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCircularRegionAugmentationPointGroup() {
		if (circularRegionAugmentationPointGroup == null) {
			circularRegionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT_GROUP);
		}
		return circularRegionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCircularRegionAugmentationPoint() {
		return getCircularRegionAugmentationPointGroup().list(_0Package.eINSTANCE.getCircularRegionType_CircularRegionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_CENTER_COORDINATE:
				return ((InternalEList<?>)getCircularRegionCenterCoordinate()).basicRemove(otherEnd, msgs);
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_RADIUS_LENGTH_MEASURE:
				return ((InternalEList<?>)getCircularRegionRadiusLengthMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCircularRegionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCircularRegionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_CENTER_COORDINATE:
				return getCircularRegionCenterCoordinate();
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_RADIUS_LENGTH_MEASURE:
				return getCircularRegionRadiusLengthMeasure();
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCircularRegionAugmentationPointGroup();
				return ((FeatureMap.Internal)getCircularRegionAugmentationPointGroup()).getWrapper();
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT:
				return getCircularRegionAugmentationPoint();
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
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_CENTER_COORDINATE:
				getCircularRegionCenterCoordinate().clear();
				getCircularRegionCenterCoordinate().addAll((Collection<? extends Location2DGeospatialCoordinateType>)newValue);
				return;
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_RADIUS_LENGTH_MEASURE:
				getCircularRegionRadiusLengthMeasure().clear();
				getCircularRegionRadiusLengthMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCircularRegionAugmentationPointGroup()).set(newValue);
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
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_CENTER_COORDINATE:
				getCircularRegionCenterCoordinate().clear();
				return;
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_RADIUS_LENGTH_MEASURE:
				getCircularRegionRadiusLengthMeasure().clear();
				return;
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT_GROUP:
				getCircularRegionAugmentationPointGroup().clear();
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
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_CENTER_COORDINATE:
				return circularRegionCenterCoordinate != null && !circularRegionCenterCoordinate.isEmpty();
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_RADIUS_LENGTH_MEASURE:
				return circularRegionRadiusLengthMeasure != null && !circularRegionRadiusLengthMeasure.isEmpty();
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT_GROUP:
				return circularRegionAugmentationPointGroup != null && !circularRegionAugmentationPointGroup.isEmpty();
			case _0Package.CIRCULAR_REGION_TYPE__CIRCULAR_REGION_AUGMENTATION_POINT:
				return !getCircularRegionAugmentationPoint().isEmpty();
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
		result.append(" (circularRegionAugmentationPointGroup: ");
		result.append(circularRegionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CircularRegionTypeImpl
