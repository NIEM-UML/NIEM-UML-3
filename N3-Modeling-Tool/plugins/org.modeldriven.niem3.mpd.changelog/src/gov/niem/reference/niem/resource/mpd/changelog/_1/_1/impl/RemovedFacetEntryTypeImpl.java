/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.FacetType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removed Facet Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedFacetEntryTypeImpl#getRemovedFacet <em>Removed Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemovedFacetEntryTypeImpl extends ChangeLogEntryTypeImpl implements RemovedFacetEntryType {
	/**
	 * The cached value of the '{@link #getRemovedFacet() <em>Removed Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedFacet()
	 * @generated
	 * @ordered
	 */
	protected FacetType removedFacet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovedFacetEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REMOVED_FACET_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getRemovedFacet() {
		return removedFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedFacet(FacetType newRemovedFacet, NotificationChain msgs) {
		FacetType oldRemovedFacet = removedFacet;
		removedFacet = newRemovedFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET, oldRemovedFacet, newRemovedFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedFacet(FacetType newRemovedFacet) {
		if (newRemovedFacet != removedFacet) {
			NotificationChain msgs = null;
			if (removedFacet != null)
				msgs = ((InternalEObject)removedFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET, null, msgs);
			if (newRemovedFacet != null)
				msgs = ((InternalEObject)newRemovedFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET, null, msgs);
			msgs = basicSetRemovedFacet(newRemovedFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET, newRemovedFacet, newRemovedFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET:
				return basicSetRemovedFacet(null, msgs);
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
			case _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET:
				return getRemovedFacet();
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
			case _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET:
				setRemovedFacet((FacetType)newValue);
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
			case _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET:
				setRemovedFacet((FacetType)null);
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
			case _1Package.REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET:
				return removedFacet != null;
		}
		return super.eIsSet(featureID);
	}

} //RemovedFacetEntryTypeImpl
