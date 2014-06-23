/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.CatalogTypeImpl#getMPD <em>MPD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogTypeImpl extends ObjectTypeImpl implements CatalogType {
	/**
	 * The cached value of the '{@link #getMPD() <em>MPD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPD()
	 * @generated
	 * @ordered
	 */
	protected MPDType mPD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.CATALOG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDType getMPD() {
		return mPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPD(MPDType newMPD, NotificationChain msgs) {
		MPDType oldMPD = mPD;
		mPD = newMPD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.CATALOG_TYPE__MPD, oldMPD, newMPD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPD(MPDType newMPD) {
		if (newMPD != mPD) {
			NotificationChain msgs = null;
			if (mPD != null)
				msgs = ((InternalEObject)mPD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.CATALOG_TYPE__MPD, null, msgs);
			if (newMPD != null)
				msgs = ((InternalEObject)newMPD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.CATALOG_TYPE__MPD, null, msgs);
			msgs = basicSetMPD(newMPD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.CATALOG_TYPE__MPD, newMPD, newMPD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CATALOG_TYPE__MPD:
				return basicSetMPD(null, msgs);
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
			case _0Package.CATALOG_TYPE__MPD:
				return getMPD();
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
			case _0Package.CATALOG_TYPE__MPD:
				setMPD((MPDType)newValue);
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
			case _0Package.CATALOG_TYPE__MPD:
				setMPD((MPDType)null);
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
			case _0Package.CATALOG_TYPE__MPD:
				return mPD != null;
		}
		return super.eIsSet(featureID);
	}

} //CatalogTypeImpl
