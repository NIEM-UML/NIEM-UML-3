/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.Location3DGeospatialCoordinateType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Location3 DGeospatial Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location3DGeospatialCoordinateTypeImpl#getLocationHeightGroup <em>Location Height Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location3DGeospatialCoordinateTypeImpl#getLocationHeight <em>Location Height</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location3DGeospatialCoordinateTypeImpl#getLocation3DGeospatialCoordinateAugmentationPointGroup <em>Location3 DGeospatial Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location3DGeospatialCoordinateTypeImpl#getLocation3DGeospatialCoordinateAugmentationPoint <em>Location3 DGeospatial Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Location3DGeospatialCoordinateTypeImpl extends Location2DGeospatialCoordinateTypeImpl implements Location3DGeospatialCoordinateType {
	/**
	 * The cached value of the '{@link #getLocationHeightGroup() <em>Location Height Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationHeightGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationHeightGroup;

	/**
	 * The cached value of the '{@link #getLocation3DGeospatialCoordinateAugmentationPointGroup() <em>Location3 DGeospatial Coordinate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation3DGeospatialCoordinateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap location3DGeospatialCoordinateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location3DGeospatialCoordinateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLocation3DGeospatialCoordinateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationHeightGroup() {
		if (locationHeightGroup == null) {
			locationHeightGroup = new BasicFeatureMap(this, _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT_GROUP);
		}
		return locationHeightGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationHeight() {
		return getLocationHeightGroup().list(_0Package.eINSTANCE.getLocation3DGeospatialCoordinateType_LocationHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocation3DGeospatialCoordinateAugmentationPointGroup() {
		if (location3DGeospatialCoordinateAugmentationPointGroup == null) {
			location3DGeospatialCoordinateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP);
		}
		return location3DGeospatialCoordinateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocation3DGeospatialCoordinateAugmentationPoint() {
		return getLocation3DGeospatialCoordinateAugmentationPointGroup().list(_0Package.eINSTANCE.getLocation3DGeospatialCoordinateType_Location3DGeospatialCoordinateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT_GROUP:
				return ((InternalEList<?>)getLocationHeightGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT:
				return ((InternalEList<?>)getLocationHeight()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLocation3DGeospatialCoordinateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLocation3DGeospatialCoordinateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT_GROUP:
				if (coreType) return getLocationHeightGroup();
				return ((FeatureMap.Internal)getLocationHeightGroup()).getWrapper();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT:
				return getLocationHeight();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLocation3DGeospatialCoordinateAugmentationPointGroup();
				return ((FeatureMap.Internal)getLocation3DGeospatialCoordinateAugmentationPointGroup()).getWrapper();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT:
				return getLocation3DGeospatialCoordinateAugmentationPoint();
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
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT_GROUP:
				((FeatureMap.Internal)getLocationHeightGroup()).set(newValue);
				return;
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLocation3DGeospatialCoordinateAugmentationPointGroup()).set(newValue);
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
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT_GROUP:
				getLocationHeightGroup().clear();
				return;
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				getLocation3DGeospatialCoordinateAugmentationPointGroup().clear();
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
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT_GROUP:
				return locationHeightGroup != null && !locationHeightGroup.isEmpty();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION_HEIGHT:
				return !getLocationHeight().isEmpty();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				return location3DGeospatialCoordinateAugmentationPointGroup != null && !location3DGeospatialCoordinateAugmentationPointGroup.isEmpty();
			case _0Package.LOCATION3_DGEOSPATIAL_COORDINATE_TYPE__LOCATION3_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT:
				return !getLocation3DGeospatialCoordinateAugmentationPoint().isEmpty();
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
		result.append(" (locationHeightGroup: ");
		result.append(locationHeightGroup);
		result.append(", location3DGeospatialCoordinateAugmentationPointGroup: ");
		result.append(location3DGeospatialCoordinateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //Location3DGeospatialCoordinateTypeImpl
