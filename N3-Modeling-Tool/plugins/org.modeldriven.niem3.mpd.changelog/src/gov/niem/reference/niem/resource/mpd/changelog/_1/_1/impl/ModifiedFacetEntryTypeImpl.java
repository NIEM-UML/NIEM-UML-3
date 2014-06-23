/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.FacetType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Facet Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedFacetEntryTypeImpl#getOriginalFacet <em>Original Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedFacetEntryTypeImpl#getUpdatedFacet <em>Updated Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifiedFacetEntryTypeImpl extends ChangeLogEntryTypeImpl implements ModifiedFacetEntryType {
	/**
	 * The cached value of the '{@link #getOriginalFacet() <em>Original Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFacet()
	 * @generated
	 * @ordered
	 */
	protected FacetType originalFacet;

	/**
	 * The cached value of the '{@link #getUpdatedFacet() <em>Updated Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedFacet()
	 * @generated
	 * @ordered
	 */
	protected FacetType updatedFacet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedFacetEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.MODIFIED_FACET_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getOriginalFacet() {
		return originalFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalFacet(FacetType newOriginalFacet, NotificationChain msgs) {
		FacetType oldOriginalFacet = originalFacet;
		originalFacet = newOriginalFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET, oldOriginalFacet, newOriginalFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalFacet(FacetType newOriginalFacet) {
		if (newOriginalFacet != originalFacet) {
			NotificationChain msgs = null;
			if (originalFacet != null)
				msgs = ((InternalEObject)originalFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET, null, msgs);
			if (newOriginalFacet != null)
				msgs = ((InternalEObject)newOriginalFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET, null, msgs);
			msgs = basicSetOriginalFacet(newOriginalFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET, newOriginalFacet, newOriginalFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getUpdatedFacet() {
		return updatedFacet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedFacet(FacetType newUpdatedFacet, NotificationChain msgs) {
		FacetType oldUpdatedFacet = updatedFacet;
		updatedFacet = newUpdatedFacet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET, oldUpdatedFacet, newUpdatedFacet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedFacet(FacetType newUpdatedFacet) {
		if (newUpdatedFacet != updatedFacet) {
			NotificationChain msgs = null;
			if (updatedFacet != null)
				msgs = ((InternalEObject)updatedFacet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET, null, msgs);
			if (newUpdatedFacet != null)
				msgs = ((InternalEObject)newUpdatedFacet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET, null, msgs);
			msgs = basicSetUpdatedFacet(newUpdatedFacet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET, newUpdatedFacet, newUpdatedFacet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET:
				return basicSetOriginalFacet(null, msgs);
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET:
				return basicSetUpdatedFacet(null, msgs);
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
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET:
				return getOriginalFacet();
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET:
				return getUpdatedFacet();
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
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET:
				setOriginalFacet((FacetType)newValue);
				return;
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET:
				setUpdatedFacet((FacetType)newValue);
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
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET:
				setOriginalFacet((FacetType)null);
				return;
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET:
				setUpdatedFacet((FacetType)null);
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
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET:
				return originalFacet != null;
			case _1Package.MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET:
				return updatedFacet != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifiedFacetEntryTypeImpl
