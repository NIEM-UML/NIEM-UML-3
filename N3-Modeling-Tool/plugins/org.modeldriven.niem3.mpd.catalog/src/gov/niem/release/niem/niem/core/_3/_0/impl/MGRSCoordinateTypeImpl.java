/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.MGRSCoordinateType;
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
 * An implementation of the model object '<em><b>MGRS Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSCoordinateID <em>MGRS Coordinate ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSEastingValue <em>MGRS Easting Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSNorthingValue <em>MGRS Northing Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getGeographicDatumGroup <em>Geographic Datum Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getGeographicDatum <em>Geographic Datum</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSGridZoneID <em>MGRS Grid Zone ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSGridZoneSquareID <em>MGRS Grid Zone Square ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSCoordinateAugmentationPointGroup <em>MGRS Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MGRSCoordinateTypeImpl#getMGRSCoordinateAugmentationPoint <em>MGRS Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MGRSCoordinateTypeImpl extends ObjectTypeImpl implements MGRSCoordinateType {
	/**
	 * The cached value of the '{@link #getMGRSCoordinateID() <em>MGRS Coordinate ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGRSCoordinateID()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.release.niem.proxy.xsd._3._0.String mGRSCoordinateID;

	/**
	 * This is true if the MGRS Coordinate ID containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mGRSCoordinateIDESet;

	/**
	 * The cached value of the '{@link #getMGRSEastingValue() <em>MGRS Easting Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGRSEastingValue()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> mGRSEastingValue;

	/**
	 * The cached value of the '{@link #getMGRSNorthingValue() <em>MGRS Northing Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGRSNorthingValue()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> mGRSNorthingValue;

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
	 * The cached value of the '{@link #getMGRSGridZoneID() <em>MGRS Grid Zone ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGRSGridZoneID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> mGRSGridZoneID;

	/**
	 * The cached value of the '{@link #getMGRSGridZoneSquareID() <em>MGRS Grid Zone Square ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGRSGridZoneSquareID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> mGRSGridZoneSquareID;

	/**
	 * The cached value of the '{@link #getMGRSCoordinateAugmentationPointGroup() <em>MGRS Coordinate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGRSCoordinateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mGRSCoordinateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGRSCoordinateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMGRSCoordinateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getMGRSCoordinateID() {
		return mGRSCoordinateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMGRSCoordinateID(gov.niem.release.niem.proxy.xsd._3._0.String newMGRSCoordinateID, NotificationChain msgs) {
		gov.niem.release.niem.proxy.xsd._3._0.String oldMGRSCoordinateID = mGRSCoordinateID;
		mGRSCoordinateID = newMGRSCoordinateID;
		boolean oldMGRSCoordinateIDESet = mGRSCoordinateIDESet;
		mGRSCoordinateIDESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, oldMGRSCoordinateID, newMGRSCoordinateID, !oldMGRSCoordinateIDESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMGRSCoordinateID(gov.niem.release.niem.proxy.xsd._3._0.String newMGRSCoordinateID) {
		if (newMGRSCoordinateID != mGRSCoordinateID) {
			NotificationChain msgs = null;
			if (mGRSCoordinateID != null)
				msgs = ((InternalEObject)mGRSCoordinateID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, null, msgs);
			if (newMGRSCoordinateID != null)
				msgs = ((InternalEObject)newMGRSCoordinateID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, null, msgs);
			msgs = basicSetMGRSCoordinateID(newMGRSCoordinateID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMGRSCoordinateIDESet = mGRSCoordinateIDESet;
			mGRSCoordinateIDESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, newMGRSCoordinateID, newMGRSCoordinateID, !oldMGRSCoordinateIDESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetMGRSCoordinateID(NotificationChain msgs) {
		gov.niem.release.niem.proxy.xsd._3._0.String oldMGRSCoordinateID = mGRSCoordinateID;
		mGRSCoordinateID = null;
		boolean oldMGRSCoordinateIDESet = mGRSCoordinateIDESet;
		mGRSCoordinateIDESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, oldMGRSCoordinateID, null, oldMGRSCoordinateIDESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMGRSCoordinateID() {
		if (mGRSCoordinateID != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)mGRSCoordinateID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, null, msgs);
			msgs = basicUnsetMGRSCoordinateID(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldMGRSCoordinateIDESet = mGRSCoordinateIDESet;
			mGRSCoordinateIDESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID, null, null, oldMGRSCoordinateIDESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMGRSCoordinateID() {
		return mGRSCoordinateIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getMGRSEastingValue() {
		if (mGRSEastingValue == null) {
			mGRSEastingValue = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.MGRS_COORDINATE_TYPE__MGRS_EASTING_VALUE);
		}
		return mGRSEastingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getMGRSNorthingValue() {
		if (mGRSNorthingValue == null) {
			mGRSNorthingValue = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.MGRS_COORDINATE_TYPE__MGRS_NORTHING_VALUE);
		}
		return mGRSNorthingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeographicDatumGroup() {
		if (geographicDatumGroup == null) {
			geographicDatumGroup = new BasicFeatureMap(this, _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP);
		}
		return geographicDatumGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getGeographicDatum() {
		return getGeographicDatumGroup().list(_0Package.eINSTANCE.getMGRSCoordinateType_GeographicDatum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMGRSGridZoneID() {
		if (mGRSGridZoneID == null) {
			mGRSGridZoneID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_ID);
		}
		return mGRSGridZoneID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMGRSGridZoneSquareID() {
		if (mGRSGridZoneSquareID == null) {
			mGRSGridZoneSquareID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_SQUARE_ID);
		}
		return mGRSGridZoneSquareID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMGRSCoordinateAugmentationPointGroup() {
		if (mGRSCoordinateAugmentationPointGroup == null) {
			mGRSCoordinateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT_GROUP);
		}
		return mGRSCoordinateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMGRSCoordinateAugmentationPoint() {
		return getMGRSCoordinateAugmentationPointGroup().list(_0Package.eINSTANCE.getMGRSCoordinateType_MGRSCoordinateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID:
				return basicUnsetMGRSCoordinateID(msgs);
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_EASTING_VALUE:
				return ((InternalEList<?>)getMGRSEastingValue()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_NORTHING_VALUE:
				return ((InternalEList<?>)getMGRSNorthingValue()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				return ((InternalEList<?>)getGeographicDatumGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return ((InternalEList<?>)getGeographicDatum()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_ID:
				return ((InternalEList<?>)getMGRSGridZoneID()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_SQUARE_ID:
				return ((InternalEList<?>)getMGRSGridZoneSquareID()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getMGRSCoordinateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getMGRSCoordinateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID:
				return getMGRSCoordinateID();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_EASTING_VALUE:
				return getMGRSEastingValue();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_NORTHING_VALUE:
				return getMGRSNorthingValue();
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				if (coreType) return getGeographicDatumGroup();
				return ((FeatureMap.Internal)getGeographicDatumGroup()).getWrapper();
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return getGeographicDatum();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_ID:
				return getMGRSGridZoneID();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_SQUARE_ID:
				return getMGRSGridZoneSquareID();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getMGRSCoordinateAugmentationPointGroup();
				return ((FeatureMap.Internal)getMGRSCoordinateAugmentationPointGroup()).getWrapper();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT:
				return getMGRSCoordinateAugmentationPoint();
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
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID:
				setMGRSCoordinateID((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_EASTING_VALUE:
				getMGRSEastingValue().clear();
				getMGRSEastingValue().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_NORTHING_VALUE:
				getMGRSNorthingValue().clear();
				getMGRSNorthingValue().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				((FeatureMap.Internal)getGeographicDatumGroup()).set(newValue);
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_ID:
				getMGRSGridZoneID().clear();
				getMGRSGridZoneID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_SQUARE_ID:
				getMGRSGridZoneSquareID().clear();
				getMGRSGridZoneSquareID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getMGRSCoordinateAugmentationPointGroup()).set(newValue);
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
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID:
				unsetMGRSCoordinateID();
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_EASTING_VALUE:
				getMGRSEastingValue().clear();
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_NORTHING_VALUE:
				getMGRSNorthingValue().clear();
				return;
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				getGeographicDatumGroup().clear();
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_ID:
				getMGRSGridZoneID().clear();
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_SQUARE_ID:
				getMGRSGridZoneSquareID().clear();
				return;
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT_GROUP:
				getMGRSCoordinateAugmentationPointGroup().clear();
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
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_ID:
				return isSetMGRSCoordinateID();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_EASTING_VALUE:
				return mGRSEastingValue != null && !mGRSEastingValue.isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_NORTHING_VALUE:
				return mGRSNorthingValue != null && !mGRSNorthingValue.isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM_GROUP:
				return geographicDatumGroup != null && !geographicDatumGroup.isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__GEOGRAPHIC_DATUM:
				return !getGeographicDatum().isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_ID:
				return mGRSGridZoneID != null && !mGRSGridZoneID.isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_GRID_ZONE_SQUARE_ID:
				return mGRSGridZoneSquareID != null && !mGRSGridZoneSquareID.isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT_GROUP:
				return mGRSCoordinateAugmentationPointGroup != null && !mGRSCoordinateAugmentationPointGroup.isEmpty();
			case _0Package.MGRS_COORDINATE_TYPE__MGRS_COORDINATE_AUGMENTATION_POINT:
				return !getMGRSCoordinateAugmentationPoint().isEmpty();
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
		result.append(", mGRSCoordinateAugmentationPointGroup: ");
		result.append(mGRSCoordinateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //MGRSCoordinateTypeImpl
