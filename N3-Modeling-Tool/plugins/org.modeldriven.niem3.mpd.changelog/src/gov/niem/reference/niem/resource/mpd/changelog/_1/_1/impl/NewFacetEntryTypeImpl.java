/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.FacetType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Facet Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewFacetEntryTypeImpl#getNewFacet <em>New Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewFacetEntryTypeImpl extends ChangeLogEntryTypeImpl implements NewFacetEntryType {
	/**
	 * The cached value of the '{@link #getNewFacet() <em>New Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewFacet()
	 * @generated
	 * @ordered
	 */
	protected FacetType newFacet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewFacetEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NEW_FACET_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getNewFacet() {
		return newFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewFacet(FacetType newNewFacet, NotificationChain msgs) {
		FacetType oldNewFacet = newFacet;
		newFacet = newNewFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET, oldNewFacet, newNewFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewFacet(FacetType newNewFacet) {
		if (newNewFacet != newFacet) {
			NotificationChain msgs = null;
			if (newFacet != null)
				msgs = ((InternalEObject)newFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET, null, msgs);
			if (newNewFacet != null)
				msgs = ((InternalEObject)newNewFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET, null, msgs);
			msgs = basicSetNewFacet(newNewFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET, newNewFacet, newNewFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET:
				return basicSetNewFacet(null, msgs);
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
			case _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET:
				return getNewFacet();
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
			case _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET:
				setNewFacet((FacetType)newValue);
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
			case _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET:
				setNewFacet((FacetType)null);
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
			case _1Package.NEW_FACET_ENTRY_TYPE__NEW_FACET:
				return newFacet != null;
		}
		return super.eIsSet(featureID);
	}

} //NewFacetEntryTypeImpl
