/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewPropertyEntryTypeImpl#getNewProperty <em>New Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewPropertyEntryTypeImpl extends ChangeLogEntryTypeImpl implements NewPropertyEntryType {
	/**
	 * The cached value of the '{@link #getNewProperty() <em>New Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyObjectType newProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewPropertyEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NEW_PROPERTY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getNewProperty() {
		return newProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewProperty(PropertyObjectType newNewProperty, NotificationChain msgs) {
		PropertyObjectType oldNewProperty = newProperty;
		newProperty = newNewProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY, oldNewProperty, newNewProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewProperty(PropertyObjectType newNewProperty) {
		if (newNewProperty != newProperty) {
			NotificationChain msgs = null;
			if (newProperty != null)
				msgs = ((InternalEObject)newProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY, null, msgs);
			if (newNewProperty != null)
				msgs = ((InternalEObject)newNewProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY, null, msgs);
			msgs = basicSetNewProperty(newNewProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY, newNewProperty, newNewProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY:
				return basicSetNewProperty(null, msgs);
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
			case _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY:
				return getNewProperty();
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
			case _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY:
				setNewProperty((PropertyObjectType)newValue);
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
			case _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY:
				setNewProperty((PropertyObjectType)null);
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
			case _1Package.NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY:
				return newProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //NewPropertyEntryTypeImpl
