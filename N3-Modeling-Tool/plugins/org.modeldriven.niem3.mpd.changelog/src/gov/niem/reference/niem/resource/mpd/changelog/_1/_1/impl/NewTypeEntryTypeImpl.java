/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Type Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeEntryTypeImpl#getNewType <em>New Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewTypeEntryTypeImpl extends ChangeLogEntryTypeImpl implements NewTypeEntryType {
	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected TypeObjectType newType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewTypeEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NEW_TYPE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewType(TypeObjectType newNewType, NotificationChain msgs) {
		TypeObjectType oldNewType = newType;
		newType = newNewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE, oldNewType, newNewType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewType(TypeObjectType newNewType) {
		if (newNewType != newType) {
			NotificationChain msgs = null;
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE, null, msgs);
			if (newNewType != null)
				msgs = ((InternalEObject)newNewType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE, null, msgs);
			msgs = basicSetNewType(newNewType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE, newNewType, newNewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE:
				return basicSetNewType(null, msgs);
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
			case _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE:
				return getNewType();
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
			case _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE:
				setNewType((TypeObjectType)newValue);
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
			case _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE:
				setNewType((TypeObjectType)null);
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
			case _1Package.NEW_TYPE_ENTRY_TYPE__NEW_TYPE:
				return newType != null;
		}
		return super.eIsSet(featureID);
	}

} //NewTypeEntryTypeImpl
