/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removed Type Contains Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedTypeContainsPropertyEntryTypeImpl#getRemovedTypeContainsProperty <em>Removed Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemovedTypeContainsPropertyEntryTypeImpl extends ChangeLogEntryTypeImpl implements RemovedTypeContainsPropertyEntryType {
	/**
	 * The cached value of the '{@link #getRemovedTypeContainsProperty() <em>Removed Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedTypeContainsProperty()
	 * @generated
	 * @ordered
	 */
	protected TypeContainsPropertyType removedTypeContainsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovedTypeContainsPropertyEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getRemovedTypeContainsProperty() {
		return removedTypeContainsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedTypeContainsProperty(TypeContainsPropertyType newRemovedTypeContainsProperty, NotificationChain msgs) {
		TypeContainsPropertyType oldRemovedTypeContainsProperty = removedTypeContainsProperty;
		removedTypeContainsProperty = newRemovedTypeContainsProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY, oldRemovedTypeContainsProperty, newRemovedTypeContainsProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedTypeContainsProperty(TypeContainsPropertyType newRemovedTypeContainsProperty) {
		if (newRemovedTypeContainsProperty != removedTypeContainsProperty) {
			NotificationChain msgs = null;
			if (removedTypeContainsProperty != null)
				msgs = ((InternalEObject)removedTypeContainsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY, null, msgs);
			if (newRemovedTypeContainsProperty != null)
				msgs = ((InternalEObject)newRemovedTypeContainsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY, null, msgs);
			msgs = basicSetRemovedTypeContainsProperty(newRemovedTypeContainsProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY, newRemovedTypeContainsProperty, newRemovedTypeContainsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY:
				return basicSetRemovedTypeContainsProperty(null, msgs);
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
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY:
				return getRemovedTypeContainsProperty();
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
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY:
				setRemovedTypeContainsProperty((TypeContainsPropertyType)newValue);
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
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY:
				setRemovedTypeContainsProperty((TypeContainsPropertyType)null);
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
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY:
				return removedTypeContainsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //RemovedTypeContainsPropertyEntryTypeImpl
