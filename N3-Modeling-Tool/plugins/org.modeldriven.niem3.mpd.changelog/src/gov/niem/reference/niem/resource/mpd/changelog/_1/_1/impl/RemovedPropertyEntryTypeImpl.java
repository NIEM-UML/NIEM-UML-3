/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removed Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedPropertyEntryTypeImpl#getRemovedProperty <em>Removed Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemovedPropertyEntryTypeImpl extends ChangeLogEntryTypeImpl implements RemovedPropertyEntryType {
	/**
	 * The cached value of the '{@link #getRemovedProperty() <em>Removed Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyObjectType removedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovedPropertyEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REMOVED_PROPERTY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getRemovedProperty() {
		return removedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedProperty(PropertyObjectType newRemovedProperty, NotificationChain msgs) {
		PropertyObjectType oldRemovedProperty = removedProperty;
		removedProperty = newRemovedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY, oldRemovedProperty, newRemovedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedProperty(PropertyObjectType newRemovedProperty) {
		if (newRemovedProperty != removedProperty) {
			NotificationChain msgs = null;
			if (removedProperty != null)
				msgs = ((InternalEObject)removedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY, null, msgs);
			if (newRemovedProperty != null)
				msgs = ((InternalEObject)newRemovedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY, null, msgs);
			msgs = basicSetRemovedProperty(newRemovedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY, newRemovedProperty, newRemovedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY:
				return basicSetRemovedProperty(null, msgs);
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
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY:
				return getRemovedProperty();
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
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY:
				setRemovedProperty((PropertyObjectType)newValue);
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
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY:
				setRemovedProperty((PropertyObjectType)null);
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
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY:
				return removedProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //RemovedPropertyEntryTypeImpl
