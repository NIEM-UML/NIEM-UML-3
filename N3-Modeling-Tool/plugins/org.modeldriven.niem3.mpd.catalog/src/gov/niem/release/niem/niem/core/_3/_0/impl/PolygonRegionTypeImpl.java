/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType;
import gov.niem.release.niem.niem.core._3._0.PolygonRegionType;
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
 * An implementation of the model object '<em><b>Polygon Region Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PolygonRegionTypeImpl#getPolygonCoordinate <em>Polygon Coordinate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PolygonRegionTypeImpl#getPolygonRegionAugmentationPointGroup <em>Polygon Region Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PolygonRegionTypeImpl#getPolygonRegionAugmentationPoint <em>Polygon Region Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonRegionTypeImpl extends ObjectTypeImpl implements PolygonRegionType {
	/**
	 * The cached value of the '{@link #getPolygonCoordinate() <em>Polygon Coordinate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonCoordinate()
	 * @generated
	 * @ordered
	 */
	protected EList<Location2DGeospatialCoordinateType> polygonCoordinate;

	/**
	 * The cached value of the '{@link #getPolygonRegionAugmentationPointGroup() <em>Polygon Region Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolygonRegionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap polygonRegionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonRegionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPolygonRegionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location2DGeospatialCoordinateType> getPolygonCoordinate() {
		if (polygonCoordinate == null) {
			polygonCoordinate = new EObjectContainmentEList<Location2DGeospatialCoordinateType>(Location2DGeospatialCoordinateType.class, this, _0Package.POLYGON_REGION_TYPE__POLYGON_COORDINATE);
		}
		return polygonCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPolygonRegionAugmentationPointGroup() {
		if (polygonRegionAugmentationPointGroup == null) {
			polygonRegionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT_GROUP);
		}
		return polygonRegionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPolygonRegionAugmentationPoint() {
		return getPolygonRegionAugmentationPointGroup().list(_0Package.eINSTANCE.getPolygonRegionType_PolygonRegionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.POLYGON_REGION_TYPE__POLYGON_COORDINATE:
				return ((InternalEList<?>)getPolygonCoordinate()).basicRemove(otherEnd, msgs);
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPolygonRegionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPolygonRegionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.POLYGON_REGION_TYPE__POLYGON_COORDINATE:
				return getPolygonCoordinate();
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPolygonRegionAugmentationPointGroup();
				return ((FeatureMap.Internal)getPolygonRegionAugmentationPointGroup()).getWrapper();
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT:
				return getPolygonRegionAugmentationPoint();
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
			case _0Package.POLYGON_REGION_TYPE__POLYGON_COORDINATE:
				getPolygonCoordinate().clear();
				getPolygonCoordinate().addAll((Collection<? extends Location2DGeospatialCoordinateType>)newValue);
				return;
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPolygonRegionAugmentationPointGroup()).set(newValue);
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
			case _0Package.POLYGON_REGION_TYPE__POLYGON_COORDINATE:
				getPolygonCoordinate().clear();
				return;
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT_GROUP:
				getPolygonRegionAugmentationPointGroup().clear();
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
			case _0Package.POLYGON_REGION_TYPE__POLYGON_COORDINATE:
				return polygonCoordinate != null && !polygonCoordinate.isEmpty();
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT_GROUP:
				return polygonRegionAugmentationPointGroup != null && !polygonRegionAugmentationPointGroup.isEmpty();
			case _0Package.POLYGON_REGION_TYPE__POLYGON_REGION_AUGMENTATION_POINT:
				return !getPolygonRegionAugmentationPoint().isEmpty();
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
		result.append(" (polygonRegionAugmentationPointGroup: ");
		result.append(polygonRegionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PolygonRegionTypeImpl
