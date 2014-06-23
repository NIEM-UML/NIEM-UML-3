/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Type Contains Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewTypeContainsPropertyEntryTypeImpl#getNewTypeContainsProperty <em>New Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewTypeContainsPropertyEntryTypeImpl extends ChangeLogEntryTypeImpl implements NewTypeContainsPropertyEntryType {
	/**
	 * The cached value of the '{@link #getNewTypeContainsProperty() <em>New Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewTypeContainsProperty()
	 * @generated
	 * @ordered
	 */
	protected TypeContainsPropertyType newTypeContainsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewTypeContainsPropertyEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getNewTypeContainsProperty() {
		return newTypeContainsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewTypeContainsProperty(TypeContainsPropertyType newNewTypeContainsProperty, NotificationChain msgs) {
		TypeContainsPropertyType oldNewTypeContainsProperty = newTypeContainsProperty;
		newTypeContainsProperty = newNewTypeContainsProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY, oldNewTypeContainsProperty, newNewTypeContainsProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewTypeContainsProperty(TypeContainsPropertyType newNewTypeContainsProperty) {
		if (newNewTypeContainsProperty != newTypeContainsProperty) {
			NotificationChain msgs = null;
			if (newTypeContainsProperty != null)
				msgs = ((InternalEObject)newTypeContainsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY, null, msgs);
			if (newNewTypeContainsProperty != null)
				msgs = ((InternalEObject)newNewTypeContainsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY, null, msgs);
			msgs = basicSetNewTypeContainsProperty(newNewTypeContainsProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY, newNewTypeContainsProperty, newNewTypeContainsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY:
				return basicSetNewTypeContainsProperty(null, msgs);
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
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY:
				return getNewTypeContainsProperty();
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
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY:
				setNewTypeContainsProperty((TypeContainsPropertyType)newValue);
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
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY:
				setNewTypeContainsProperty((TypeContainsPropertyType)null);
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
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY:
				return newTypeContainsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //NewTypeContainsPropertyEntryTypeImpl
