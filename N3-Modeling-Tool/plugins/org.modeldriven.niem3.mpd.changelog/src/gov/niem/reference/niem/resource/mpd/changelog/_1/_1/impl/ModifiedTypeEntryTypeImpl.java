/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Type Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeEntryTypeImpl#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeEntryTypeImpl#getUpdatedType <em>Updated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifiedTypeEntryTypeImpl extends ChangeLogEntryTypeImpl implements ModifiedTypeEntryType {
	/**
	 * The cached value of the '{@link #getOriginalType() <em>Original Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalType()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectType originalType;

	/**
	 * The cached value of the '{@link #getUpdatedType() <em>Updated Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedType()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectType updatedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedTypeEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.MODIFIED_TYPE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getOriginalType() {
		return originalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalType(TypeObjectType newOriginalType, NotificationChain msgs) {
		TypeObjectType oldOriginalType = originalType;
		originalType = newOriginalType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE, oldOriginalType, newOriginalType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalType(TypeObjectType newOriginalType) {
		if (newOriginalType != originalType) {
			NotificationChain msgs = null;
			if (originalType != null)
				msgs = ((InternalEObject)originalType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE, null, msgs);
			if (newOriginalType != null)
				msgs = ((InternalEObject)newOriginalType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE, null, msgs);
			msgs = basicSetOriginalType(newOriginalType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE, newOriginalType, newOriginalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getUpdatedType() {
		return updatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedType(TypeObjectType newUpdatedType, NotificationChain msgs) {
		TypeObjectType oldUpdatedType = updatedType;
		updatedType = newUpdatedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE, oldUpdatedType, newUpdatedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedType(TypeObjectType newUpdatedType) {
		if (newUpdatedType != updatedType) {
			NotificationChain msgs = null;
			if (updatedType != null)
				msgs = ((InternalEObject)updatedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE, null, msgs);
			if (newUpdatedType != null)
				msgs = ((InternalEObject)newUpdatedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE, null, msgs);
			msgs = basicSetUpdatedType(newUpdatedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE, newUpdatedType, newUpdatedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE:
				return basicSetOriginalType(null, msgs);
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE:
				return basicSetUpdatedType(null, msgs);
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
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE:
				return getOriginalType();
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE:
				return getUpdatedType();
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
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE:
				setOriginalType((TypeObjectType)newValue);
				return;
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE:
				setUpdatedType((TypeObjectType)newValue);
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
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE:
				setOriginalType((TypeObjectType)null);
				return;
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE:
				setUpdatedType((TypeObjectType)null);
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
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE:
				return originalType != null;
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE:
				return updatedType != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifiedTypeEntryTypeImpl
