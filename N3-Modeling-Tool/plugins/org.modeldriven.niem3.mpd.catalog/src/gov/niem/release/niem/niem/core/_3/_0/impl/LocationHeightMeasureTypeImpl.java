/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LocationHeightMeasureType;
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
 * An implementation of the model object '<em><b>Location Height Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationHeightMeasureTypeImpl#getLocationHeightVerticalDatumGroup <em>Location Height Vertical Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationHeightMeasureTypeImpl#getLocationHeightVerticalDatum <em>Location Height Vertical Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationHeightMeasureTypeImpl#getLocationHeightMeasureAugmentationPointGroup <em>Location Height Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationHeightMeasureTypeImpl#getLocationHeightMeasureAugmentationPoint <em>Location Height Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationHeightMeasureTypeImpl extends MeasureTypeImpl implements LocationHeightMeasureType {
	/**
	 * The cached value of the '{@link #getLocationHeightVerticalDatumGroup() <em>Location Height Vertical Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationHeightVerticalDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationHeightVerticalDatumGroup;

	/**
	 * The cached value of the '{@link #getLocationHeightMeasureAugmentationPointGroup() <em>Location Height Measure Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationHeightMeasureAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationHeightMeasureAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationHeightMeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLocationHeightMeasureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationHeightVerticalDatumGroup() {
		if (locationHeightVerticalDatumGroup == null) {
			locationHeightVerticalDatumGroup = new BasicFeatureMap(this, _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM_GROUP);
		}
		return locationHeightVerticalDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationHeightVerticalDatum() {
		return getLocationHeightVerticalDatumGroup().list(_0Package.eINSTANCE.getLocationHeightMeasureType_LocationHeightVerticalDatum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationHeightMeasureAugmentationPointGroup() {
		if (locationHeightMeasureAugmentationPointGroup == null) {
			locationHeightMeasureAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT_GROUP);
		}
		return locationHeightMeasureAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationHeightMeasureAugmentationPoint() {
		return getLocationHeightMeasureAugmentationPointGroup().list(_0Package.eINSTANCE.getLocationHeightMeasureType_LocationHeightMeasureAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM_GROUP:
				return ((InternalEList<?>)getLocationHeightVerticalDatumGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM:
				return ((InternalEList<?>)getLocationHeightVerticalDatum()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLocationHeightMeasureAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLocationHeightMeasureAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM_GROUP:
				if (coreType) return getLocationHeightVerticalDatumGroup();
				return ((FeatureMap.Internal)getLocationHeightVerticalDatumGroup()).getWrapper();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM:
				return getLocationHeightVerticalDatum();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLocationHeightMeasureAugmentationPointGroup();
				return ((FeatureMap.Internal)getLocationHeightMeasureAugmentationPointGroup()).getWrapper();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT:
				return getLocationHeightMeasureAugmentationPoint();
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
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM_GROUP:
				((FeatureMap.Internal)getLocationHeightVerticalDatumGroup()).set(newValue);
				return;
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLocationHeightMeasureAugmentationPointGroup()).set(newValue);
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
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM_GROUP:
				getLocationHeightVerticalDatumGroup().clear();
				return;
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT_GROUP:
				getLocationHeightMeasureAugmentationPointGroup().clear();
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
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM_GROUP:
				return locationHeightVerticalDatumGroup != null && !locationHeightVerticalDatumGroup.isEmpty();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_VERTICAL_DATUM:
				return !getLocationHeightVerticalDatum().isEmpty();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT_GROUP:
				return locationHeightMeasureAugmentationPointGroup != null && !locationHeightMeasureAugmentationPointGroup.isEmpty();
			case _0Package.LOCATION_HEIGHT_MEASURE_TYPE__LOCATION_HEIGHT_MEASURE_AUGMENTATION_POINT:
				return !getLocationHeightMeasureAugmentationPoint().isEmpty();
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
		result.append(" (locationHeightVerticalDatumGroup: ");
		result.append(locationHeightVerticalDatumGroup);
		result.append(", locationHeightMeasureAugmentationPointGroup: ");
		result.append(locationHeightMeasureAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //LocationHeightMeasureTypeImpl
