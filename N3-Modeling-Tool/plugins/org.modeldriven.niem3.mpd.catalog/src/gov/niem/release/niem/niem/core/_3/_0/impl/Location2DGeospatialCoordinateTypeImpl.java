/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType;
import gov.niem.release.niem.niem.core._3._0.Location2DGeospatialCoordinateType;
import gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location2 DGeospatial Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location2DGeospatialCoordinateTypeImpl#getGeographicDatumGroup <em>Geographic Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location2DGeospatialCoordinateTypeImpl#getGeographicDatum <em>Geographic Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location2DGeospatialCoordinateTypeImpl#getGeographicCoordinateLatitude <em>Geographic Coordinate Latitude</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location2DGeospatialCoordinateTypeImpl#getGeographicCoordinateLongitude <em>Geographic Coordinate Longitude</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location2DGeospatialCoordinateTypeImpl#getLocation2DGeospatialCoordinateAugmentationPointGroup <em>Location2 DGeospatial Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.Location2DGeospatialCoordinateTypeImpl#getLocation2DGeospatialCoordinateAugmentationPoint <em>Location2 DGeospatial Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Location2DGeospatialCoordinateTypeImpl extends ObjectTypeImpl implements Location2DGeospatialCoordinateType {
	/**
	 * The cached value of the '{@link #getGeographicDatumGroup() <em>Geographic Datum Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicDatumGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap geographicDatumGroup;

	/**
	 * The cached value of the '{@link #getGeographicCoordinateLatitude() <em>Geographic Coordinate Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicCoordinateLatitude()
	 * @generated
	 * @ordered
	 */
	protected LatitudeCoordinateType geographicCoordinateLatitude;

	/**
	 * This is true if the Geographic Coordinate Latitude containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geographicCoordinateLatitudeESet;

	/**
	 * The cached value of the '{@link #getGeographicCoordinateLongitude() <em>Geographic Coordinate Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicCoordinateLongitude()
	 * @generated
	 * @ordered
	 */
	protected LongitudeCoordinateType geographicCoordinateLongitude;

	/**
	 * This is true if the Geographic Coordinate Longitude containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geographicCoordinateLongitudeESet;

	/**
	 * The cached value of the '{@link #getLocation2DGeospatialCoordinateAugmentationPointGroup() <em>Location2 DGeospatial Coordinate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation2DGeospatialCoordinateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap location2DGeospatialCoordinateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Location2DGeospatialCoordinateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLocation2DGeospatialCoordinateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeographicDatumGroup() {
		if (geographicDatumGroup == null) {
			geographicDatumGroup = new BasicFeatureMap(this, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP);
		}
		return geographicDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGeographicDatum() {
		return (EObject)getGeographicDatumGroup().get(_0Package.eINSTANCE.getLocation2DGeospatialCoordinateType_GeographicDatum(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicDatum(EObject newGeographicDatum, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGeographicDatumGroup()).basicAdd(_0Package.eINSTANCE.getLocation2DGeospatialCoordinateType_GeographicDatum(), newGeographicDatum, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatitudeCoordinateType getGeographicCoordinateLatitude() {
		return geographicCoordinateLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCoordinateLatitude(LatitudeCoordinateType newGeographicCoordinateLatitude, NotificationChain msgs) {
		LatitudeCoordinateType oldGeographicCoordinateLatitude = geographicCoordinateLatitude;
		geographicCoordinateLatitude = newGeographicCoordinateLatitude;
		boolean oldGeographicCoordinateLatitudeESet = geographicCoordinateLatitudeESet;
		geographicCoordinateLatitudeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, oldGeographicCoordinateLatitude, newGeographicCoordinateLatitude, !oldGeographicCoordinateLatitudeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicCoordinateLatitude(LatitudeCoordinateType newGeographicCoordinateLatitude) {
		if (newGeographicCoordinateLatitude != geographicCoordinateLatitude) {
			NotificationChain msgs = null;
			if (geographicCoordinateLatitude != null)
				msgs = ((InternalEObject)geographicCoordinateLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, null, msgs);
			if (newGeographicCoordinateLatitude != null)
				msgs = ((InternalEObject)newGeographicCoordinateLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, null, msgs);
			msgs = basicSetGeographicCoordinateLatitude(newGeographicCoordinateLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGeographicCoordinateLatitudeESet = geographicCoordinateLatitudeESet;
			geographicCoordinateLatitudeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, newGeographicCoordinateLatitude, newGeographicCoordinateLatitude, !oldGeographicCoordinateLatitudeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetGeographicCoordinateLatitude(NotificationChain msgs) {
		LatitudeCoordinateType oldGeographicCoordinateLatitude = geographicCoordinateLatitude;
		geographicCoordinateLatitude = null;
		boolean oldGeographicCoordinateLatitudeESet = geographicCoordinateLatitudeESet;
		geographicCoordinateLatitudeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, oldGeographicCoordinateLatitude, null, oldGeographicCoordinateLatitudeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGeographicCoordinateLatitude() {
		if (geographicCoordinateLatitude != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)geographicCoordinateLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, null, msgs);
			msgs = basicUnsetGeographicCoordinateLatitude(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGeographicCoordinateLatitudeESet = geographicCoordinateLatitudeESet;
			geographicCoordinateLatitudeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE, null, null, oldGeographicCoordinateLatitudeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeographicCoordinateLatitude() {
		return geographicCoordinateLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LongitudeCoordinateType getGeographicCoordinateLongitude() {
		return geographicCoordinateLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicCoordinateLongitude(LongitudeCoordinateType newGeographicCoordinateLongitude, NotificationChain msgs) {
		LongitudeCoordinateType oldGeographicCoordinateLongitude = geographicCoordinateLongitude;
		geographicCoordinateLongitude = newGeographicCoordinateLongitude;
		boolean oldGeographicCoordinateLongitudeESet = geographicCoordinateLongitudeESet;
		geographicCoordinateLongitudeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, oldGeographicCoordinateLongitude, newGeographicCoordinateLongitude, !oldGeographicCoordinateLongitudeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicCoordinateLongitude(LongitudeCoordinateType newGeographicCoordinateLongitude) {
		if (newGeographicCoordinateLongitude != geographicCoordinateLongitude) {
			NotificationChain msgs = null;
			if (geographicCoordinateLongitude != null)
				msgs = ((InternalEObject)geographicCoordinateLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, null, msgs);
			if (newGeographicCoordinateLongitude != null)
				msgs = ((InternalEObject)newGeographicCoordinateLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, null, msgs);
			msgs = basicSetGeographicCoordinateLongitude(newGeographicCoordinateLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGeographicCoordinateLongitudeESet = geographicCoordinateLongitudeESet;
			geographicCoordinateLongitudeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, newGeographicCoordinateLongitude, newGeographicCoordinateLongitude, !oldGeographicCoordinateLongitudeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetGeographicCoordinateLongitude(NotificationChain msgs) {
		LongitudeCoordinateType oldGeographicCoordinateLongitude = geographicCoordinateLongitude;
		geographicCoordinateLongitude = null;
		boolean oldGeographicCoordinateLongitudeESet = geographicCoordinateLongitudeESet;
		geographicCoordinateLongitudeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, oldGeographicCoordinateLongitude, null, oldGeographicCoordinateLongitudeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGeographicCoordinateLongitude() {
		if (geographicCoordinateLongitude != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)geographicCoordinateLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, null, msgs);
			msgs = basicUnsetGeographicCoordinateLongitude(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldGeographicCoordinateLongitudeESet = geographicCoordinateLongitudeESet;
			geographicCoordinateLongitudeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE, null, null, oldGeographicCoordinateLongitudeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeographicCoordinateLongitude() {
		return geographicCoordinateLongitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocation2DGeospatialCoordinateAugmentationPointGroup() {
		if (location2DGeospatialCoordinateAugmentationPointGroup == null) {
			location2DGeospatialCoordinateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP);
		}
		return location2DGeospatialCoordinateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocation2DGeospatialCoordinateAugmentationPoint() {
		return getLocation2DGeospatialCoordinateAugmentationPointGroup().list(_0Package.eINSTANCE.getLocation2DGeospatialCoordinateType_Location2DGeospatialCoordinateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				return ((InternalEList<?>)getGeographicDatumGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return basicSetGeographicDatum(null, msgs);
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE:
				return basicUnsetGeographicCoordinateLatitude(msgs);
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE:
				return basicUnsetGeographicCoordinateLongitude(msgs);
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLocation2DGeospatialCoordinateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLocation2DGeospatialCoordinateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				if (coreType) return getGeographicDatumGroup();
				return ((FeatureMap.Internal)getGeographicDatumGroup()).getWrapper();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return getGeographicDatum();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE:
				return getGeographicCoordinateLatitude();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE:
				return getGeographicCoordinateLongitude();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLocation2DGeospatialCoordinateAugmentationPointGroup();
				return ((FeatureMap.Internal)getLocation2DGeospatialCoordinateAugmentationPointGroup()).getWrapper();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT:
				return getLocation2DGeospatialCoordinateAugmentationPoint();
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
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				((FeatureMap.Internal)getGeographicDatumGroup()).set(newValue);
				return;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE:
				setGeographicCoordinateLatitude((LatitudeCoordinateType)newValue);
				return;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE:
				setGeographicCoordinateLongitude((LongitudeCoordinateType)newValue);
				return;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLocation2DGeospatialCoordinateAugmentationPointGroup()).set(newValue);
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
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				getGeographicDatumGroup().clear();
				return;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE:
				unsetGeographicCoordinateLatitude();
				return;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE:
				unsetGeographicCoordinateLongitude();
				return;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				getLocation2DGeospatialCoordinateAugmentationPointGroup().clear();
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
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				return geographicDatumGroup != null && !geographicDatumGroup.isEmpty();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return getGeographicDatum() != null;
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LATITUDE:
				return isSetGeographicCoordinateLatitude();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__GEOGRAPHIC_COORDINATE_LONGITUDE:
				return isSetGeographicCoordinateLongitude();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT_GROUP:
				return location2DGeospatialCoordinateAugmentationPointGroup != null && !location2DGeospatialCoordinateAugmentationPointGroup.isEmpty();
			case _0Package.LOCATION2_DGEOSPATIAL_COORDINATE_TYPE__LOCATION2_DGEOSPATIAL_COORDINATE_AUGMENTATION_POINT:
				return !getLocation2DGeospatialCoordinateAugmentationPoint().isEmpty();
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
		result.append(" (geographicDatumGroup: ");
		result.append(geographicDatumGroup);
		result.append(", location2DGeospatialCoordinateAugmentationPointGroup: ");
		result.append(location2DGeospatialCoordinateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //Location2DGeospatialCoordinateTypeImpl
