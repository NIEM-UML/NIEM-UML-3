/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removed Type Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeEntryTypeImpl#getRemovedType <em>Removed Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemovedTypeEntryTypeImpl extends ChangeLogEntryTypeImpl implements RemovedTypeEntryType {
	/**
	 * The cached value of the '{@link #getRemovedType() <em>Removed Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedType()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectType removedType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovedTypeEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REMOVED_TYPE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getRemovedType() {
		return removedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedType(TypeObjectType newRemovedType, NotificationChain msgs) {
		TypeObjectType oldRemovedType = removedType;
		removedType = newRemovedType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE, oldRemovedType, newRemovedType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedType(TypeObjectType newRemovedType) {
		if (newRemovedType != removedType) {
			NotificationChain msgs = null;
			if (removedType != null)
				msgs = ((InternalEObject)removedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE, null, msgs);
			if (newRemovedType != null)
				msgs = ((InternalEObject)newRemovedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE, null, msgs);
			msgs = basicSetRemovedType(newRemovedType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE, newRemovedType, newRemovedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE:
				return basicSetRemovedType(null, msgs);
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
			case _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE:
				return getRemovedType();
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
			case _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE:
				setRemovedType((TypeObjectType)newValue);
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
			case _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE:
				setRemovedType((TypeObjectType)null);
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
			case _1Package.REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE:
				return removedType != null;
		}
		return super.eIsSet(featureID);
	}

} //RemovedTypeEntryTypeImpl
