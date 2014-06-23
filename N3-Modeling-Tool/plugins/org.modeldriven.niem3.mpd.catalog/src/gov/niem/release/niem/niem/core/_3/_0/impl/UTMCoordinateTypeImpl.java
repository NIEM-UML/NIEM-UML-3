/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.UTMCoordinateType;
import gov.niem.release.niem.niem.core._3._0.UTMZoneNumericType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UTM Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMCoordinateID <em>UTM Coordinate ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMEastingValue <em>UTM Easting Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMNorthingValue <em>UTM Northing Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMZoneNumeric <em>UTM Zone Numeric</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMHemisphereGroup <em>UTM Hemisphere Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMHemisphere <em>UTM Hemisphere</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getGeographicDatumGroup <em>Geographic Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getGeographicDatum <em>Geographic Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMCoordinateAugmentationPointGroup <em>UTM Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.UTMCoordinateTypeImpl#getUTMCoordinateAugmentationPoint <em>UTM Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UTMCoordinateTypeImpl extends ObjectTypeImpl implements UTMCoordinateType {
	/**
	 * The cached value of the '{@link #getUTMCoordinateID() <em>UTM Coordinate ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTMCoordinateID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> uTMCoordinateID;

	/**
	 * The cached value of the '{@link #getUTMEastingValue() <em>UTM Easting Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTMEastingValue()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger uTMEastingValue;

	/**
	 * This is true if the UTM Easting Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uTMEastingValueESet;

	/**
	 * The cached value of the '{@link #getUTMNorthingValue() <em>UTM Northing Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTMNorthingValue()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeInteger uTMNorthingValue;

	/**
	 * This is true if the UTM Northing Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uTMNorthingValueESet;

	/**
	 * The cached value of the '{@link #getUTMZoneNumeric() <em>UTM Zone Numeric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTMZoneNumeric()
	 * @generated
	 * @ordered
	 */
	protected EList<UTMZoneNumericType> uTMZoneNumeric;

	/**
	 * The cached value of the '{@link #getUTMHemisphereGroup() <em>UTM Hemisphere Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTMHemisphereGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap uTMHemisphereGroup;

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
	 * The cached value of the '{@link #getUTMCoordinateAugmentationPointGroup() <em>UTM Coordinate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUTMCoordinateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap uTMCoordinateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UTMCoordinateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getUTMCoordinateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getUTMCoordinateID() {
		if (uTMCoordinateID == null) {
			uTMCoordinateID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_ID);
		}
		return uTMCoordinateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getUTMEastingValue() {
		return uTMEastingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUTMEastingValue(NonNegativeInteger newUTMEastingValue, NotificationChain msgs) {
		NonNegativeInteger oldUTMEastingValue = uTMEastingValue;
		uTMEastingValue = newUTMEastingValue;
		boolean oldUTMEastingValueESet = uTMEastingValueESet;
		uTMEastingValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, oldUTMEastingValue, newUTMEastingValue, !oldUTMEastingValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUTMEastingValue(NonNegativeInteger newUTMEastingValue) {
		if (newUTMEastingValue != uTMEastingValue) {
			NotificationChain msgs = null;
			if (uTMEastingValue != null)
				msgs = ((InternalEObject)uTMEastingValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, null, msgs);
			if (newUTMEastingValue != null)
				msgs = ((InternalEObject)newUTMEastingValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, null, msgs);
			msgs = basicSetUTMEastingValue(newUTMEastingValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUTMEastingValueESet = uTMEastingValueESet;
			uTMEastingValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, newUTMEastingValue, newUTMEastingValue, !oldUTMEastingValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUTMEastingValue(NotificationChain msgs) {
		NonNegativeInteger oldUTMEastingValue = uTMEastingValue;
		uTMEastingValue = null;
		boolean oldUTMEastingValueESet = uTMEastingValueESet;
		uTMEastingValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, oldUTMEastingValue, null, oldUTMEastingValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUTMEastingValue() {
		if (uTMEastingValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)uTMEastingValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, null, msgs);
			msgs = basicUnsetUTMEastingValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUTMEastingValueESet = uTMEastingValueESet;
			uTMEastingValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE, null, null, oldUTMEastingValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUTMEastingValue() {
		return uTMEastingValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeInteger getUTMNorthingValue() {
		return uTMNorthingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUTMNorthingValue(NonNegativeInteger newUTMNorthingValue, NotificationChain msgs) {
		NonNegativeInteger oldUTMNorthingValue = uTMNorthingValue;
		uTMNorthingValue = newUTMNorthingValue;
		boolean oldUTMNorthingValueESet = uTMNorthingValueESet;
		uTMNorthingValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, oldUTMNorthingValue, newUTMNorthingValue, !oldUTMNorthingValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUTMNorthingValue(NonNegativeInteger newUTMNorthingValue) {
		if (newUTMNorthingValue != uTMNorthingValue) {
			NotificationChain msgs = null;
			if (uTMNorthingValue != null)
				msgs = ((InternalEObject)uTMNorthingValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, null, msgs);
			if (newUTMNorthingValue != null)
				msgs = ((InternalEObject)newUTMNorthingValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, null, msgs);
			msgs = basicSetUTMNorthingValue(newUTMNorthingValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUTMNorthingValueESet = uTMNorthingValueESet;
			uTMNorthingValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, newUTMNorthingValue, newUTMNorthingValue, !oldUTMNorthingValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetUTMNorthingValue(NotificationChain msgs) {
		NonNegativeInteger oldUTMNorthingValue = uTMNorthingValue;
		uTMNorthingValue = null;
		boolean oldUTMNorthingValueESet = uTMNorthingValueESet;
		uTMNorthingValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, oldUTMNorthingValue, null, oldUTMNorthingValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUTMNorthingValue() {
		if (uTMNorthingValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)uTMNorthingValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, null, msgs);
			msgs = basicUnsetUTMNorthingValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldUTMNorthingValueESet = uTMNorthingValueESet;
			uTMNorthingValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE, null, null, oldUTMNorthingValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUTMNorthingValue() {
		return uTMNorthingValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UTMZoneNumericType> getUTMZoneNumeric() {
		if (uTMZoneNumeric == null) {
			uTMZoneNumeric = new EObjectContainmentEList<UTMZoneNumericType>(UTMZoneNumericType.class, this, _0Package.UTM_COORDINATE_TYPE__UTM_ZONE_NUMERIC);
		}
		return uTMZoneNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getUTMHemisphereGroup() {
		if (uTMHemisphereGroup == null) {
			uTMHemisphereGroup = new BasicFeatureMap(this, _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE_GROUP);
		}
		return uTMHemisphereGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUTMHemisphere() {
		return getUTMHemisphereGroup().list(_0Package.eINSTANCE.getUTMCoordinateType_UTMHemisphere());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeographicDatumGroup() {
		if (geographicDatumGroup == null) {
			geographicDatumGroup = new BasicFeatureMap(this, _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP);
		}
		return geographicDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGeographicDatum() {
		return getGeographicDatumGroup().list(_0Package.eINSTANCE.getUTMCoordinateType_GeographicDatum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getUTMCoordinateAugmentationPointGroup() {
		if (uTMCoordinateAugmentationPointGroup == null) {
			uTMCoordinateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT_GROUP);
		}
		return uTMCoordinateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUTMCoordinateAugmentationPoint() {
		return getUTMCoordinateAugmentationPointGroup().list(_0Package.eINSTANCE.getUTMCoordinateType_UTMCoordinateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_ID:
				return ((InternalEList<?>)getUTMCoordinateID()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE:
				return basicUnsetUTMEastingValue(msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE:
				return basicUnsetUTMNorthingValue(msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_ZONE_NUMERIC:
				return ((InternalEList<?>)getUTMZoneNumeric()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE_GROUP:
				return ((InternalEList<?>)getUTMHemisphereGroup()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE:
				return ((InternalEList<?>)getUTMHemisphere()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				return ((InternalEList<?>)getGeographicDatumGroup()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return ((InternalEList<?>)getGeographicDatum()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getUTMCoordinateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getUTMCoordinateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_ID:
				return getUTMCoordinateID();
			case _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE:
				return getUTMEastingValue();
			case _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE:
				return getUTMNorthingValue();
			case _0Package.UTM_COORDINATE_TYPE__UTM_ZONE_NUMERIC:
				return getUTMZoneNumeric();
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE_GROUP:
				if (coreType) return getUTMHemisphereGroup();
				return ((FeatureMap.Internal)getUTMHemisphereGroup()).getWrapper();
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE:
				return getUTMHemisphere();
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				if (coreType) return getGeographicDatumGroup();
				return ((FeatureMap.Internal)getGeographicDatumGroup()).getWrapper();
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return getGeographicDatum();
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getUTMCoordinateAugmentationPointGroup();
				return ((FeatureMap.Internal)getUTMCoordinateAugmentationPointGroup()).getWrapper();
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT:
				return getUTMCoordinateAugmentationPoint();
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
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_ID:
				getUTMCoordinateID().clear();
				getUTMCoordinateID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE:
				setUTMEastingValue((NonNegativeInteger)newValue);
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE:
				setUTMNorthingValue((NonNegativeInteger)newValue);
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_ZONE_NUMERIC:
				getUTMZoneNumeric().clear();
				getUTMZoneNumeric().addAll((Collection<? extends UTMZoneNumericType>)newValue);
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE_GROUP:
				((FeatureMap.Internal)getUTMHemisphereGroup()).set(newValue);
				return;
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				((FeatureMap.Internal)getGeographicDatumGroup()).set(newValue);
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getUTMCoordinateAugmentationPointGroup()).set(newValue);
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
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_ID:
				getUTMCoordinateID().clear();
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE:
				unsetUTMEastingValue();
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE:
				unsetUTMNorthingValue();
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_ZONE_NUMERIC:
				getUTMZoneNumeric().clear();
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE_GROUP:
				getUTMHemisphereGroup().clear();
				return;
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				getGeographicDatumGroup().clear();
				return;
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT_GROUP:
				getUTMCoordinateAugmentationPointGroup().clear();
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
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_ID:
				return uTMCoordinateID != null && !uTMCoordinateID.isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__UTM_EASTING_VALUE:
				return isSetUTMEastingValue();
			case _0Package.UTM_COORDINATE_TYPE__UTM_NORTHING_VALUE:
				return isSetUTMNorthingValue();
			case _0Package.UTM_COORDINATE_TYPE__UTM_ZONE_NUMERIC:
				return uTMZoneNumeric != null && !uTMZoneNumeric.isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE_GROUP:
				return uTMHemisphereGroup != null && !uTMHemisphereGroup.isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__UTM_HEMISPHERE:
				return !getUTMHemisphere().isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				return geographicDatumGroup != null && !geographicDatumGroup.isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return !getGeographicDatum().isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT_GROUP:
				return uTMCoordinateAugmentationPointGroup != null && !uTMCoordinateAugmentationPointGroup.isEmpty();
			case _0Package.UTM_COORDINATE_TYPE__UTM_COORDINATE_AUGMENTATION_POINT:
				return !getUTMCoordinateAugmentationPoint().isEmpty();
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
		result.append(" (uTMHemisphereGroup: ");
		result.append(uTMHemisphereGroup);
		result.append(", geographicDatumGroup: ");
		result.append(geographicDatumGroup);
		result.append(", uTMCoordinateAugmentationPointGroup: ");
		result.append(uTMCoordinateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //UTMCoordinateTypeImpl
