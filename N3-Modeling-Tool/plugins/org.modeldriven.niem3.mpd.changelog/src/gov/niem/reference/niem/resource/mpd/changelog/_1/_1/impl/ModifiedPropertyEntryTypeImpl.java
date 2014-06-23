/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedPropertyEntryTypeImpl#getOriginalProperty <em>Original Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedPropertyEntryTypeImpl#getUpdatedProperty <em>Updated Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifiedPropertyEntryTypeImpl extends ChangeLogEntryTypeImpl implements ModifiedPropertyEntryType {
	/**
	 * The cached value of the '{@link #getOriginalProperty() <em>Original Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyObjectType originalProperty;

	/**
	 * The cached value of the '{@link #getUpdatedProperty() <em>Updated Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedProperty()
	 * @generated
	 * @ordered
	 */
	protected PropertyObjectType updatedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedPropertyEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.MODIFIED_PROPERTY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getOriginalProperty() {
		return originalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalProperty(PropertyObjectType newOriginalProperty, NotificationChain msgs) {
		PropertyObjectType oldOriginalProperty = originalProperty;
		originalProperty = newOriginalProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY, oldOriginalProperty, newOriginalProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalProperty(PropertyObjectType newOriginalProperty) {
		if (newOriginalProperty != originalProperty) {
			NotificationChain msgs = null;
			if (originalProperty != null)
				msgs = ((InternalEObject)originalProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY, null, msgs);
			if (newOriginalProperty != null)
				msgs = ((InternalEObject)newOriginalProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY, null, msgs);
			msgs = basicSetOriginalProperty(newOriginalProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY, newOriginalProperty, newOriginalProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getUpdatedProperty() {
		return updatedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedProperty(PropertyObjectType newUpdatedProperty, NotificationChain msgs) {
		PropertyObjectType oldUpdatedProperty = updatedProperty;
		updatedProperty = newUpdatedProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY, oldUpdatedProperty, newUpdatedProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedProperty(PropertyObjectType newUpdatedProperty) {
		if (newUpdatedProperty != updatedProperty) {
			NotificationChain msgs = null;
			if (updatedProperty != null)
				msgs = ((InternalEObject)updatedProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY, null, msgs);
			if (newUpdatedProperty != null)
				msgs = ((InternalEObject)newUpdatedProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY, null, msgs);
			msgs = basicSetUpdatedProperty(newUpdatedProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY, newUpdatedProperty, newUpdatedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY:
				return basicSetOriginalProperty(null, msgs);
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY:
				return basicSetUpdatedProperty(null, msgs);
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
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY:
				return getOriginalProperty();
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY:
				return getUpdatedProperty();
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
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY:
				setOriginalProperty((PropertyObjectType)newValue);
				return;
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY:
				setUpdatedProperty((PropertyObjectType)newValue);
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
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY:
				setOriginalProperty((PropertyObjectType)null);
				return;
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY:
				setUpdatedProperty((PropertyObjectType)null);
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
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY:
				return originalProperty != null;
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY:
				return updatedProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifiedPropertyEntryTypeImpl
