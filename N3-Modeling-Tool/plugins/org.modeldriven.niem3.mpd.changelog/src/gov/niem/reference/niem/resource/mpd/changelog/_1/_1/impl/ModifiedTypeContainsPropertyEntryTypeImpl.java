/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Type Contains Property Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeContainsPropertyEntryTypeImpl#getOriginalTypeContainsProperty <em>Original Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedTypeContainsPropertyEntryTypeImpl#getUpdatedTypeContainsProperty <em>Updated Type Contains Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifiedTypeContainsPropertyEntryTypeImpl extends ChangeLogEntryTypeImpl implements ModifiedTypeContainsPropertyEntryType {
	/**
	 * The cached value of the '{@link #getOriginalTypeContainsProperty() <em>Original Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalTypeContainsProperty()
	 * @generated
	 * @ordered
	 */
	protected TypeContainsPropertyType originalTypeContainsProperty;

	/**
	 * The cached value of the '{@link #getUpdatedTypeContainsProperty() <em>Updated Type Contains Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedTypeContainsProperty()
	 * @generated
	 * @ordered
	 */
	protected TypeContainsPropertyType updatedTypeContainsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedTypeContainsPropertyEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getOriginalTypeContainsProperty() {
		return originalTypeContainsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalTypeContainsProperty(TypeContainsPropertyType newOriginalTypeContainsProperty, NotificationChain msgs) {
		TypeContainsPropertyType oldOriginalTypeContainsProperty = originalTypeContainsProperty;
		originalTypeContainsProperty = newOriginalTypeContainsProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY, oldOriginalTypeContainsProperty, newOriginalTypeContainsProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalTypeContainsProperty(TypeContainsPropertyType newOriginalTypeContainsProperty) {
		if (newOriginalTypeContainsProperty != originalTypeContainsProperty) {
			NotificationChain msgs = null;
			if (originalTypeContainsProperty != null)
				msgs = ((InternalEObject)originalTypeContainsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY, null, msgs);
			if (newOriginalTypeContainsProperty != null)
				msgs = ((InternalEObject)newOriginalTypeContainsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY, null, msgs);
			msgs = basicSetOriginalTypeContainsProperty(newOriginalTypeContainsProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY, newOriginalTypeContainsProperty, newOriginalTypeContainsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getUpdatedTypeContainsProperty() {
		return updatedTypeContainsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedTypeContainsProperty(TypeContainsPropertyType newUpdatedTypeContainsProperty, NotificationChain msgs) {
		TypeContainsPropertyType oldUpdatedTypeContainsProperty = updatedTypeContainsProperty;
		updatedTypeContainsProperty = newUpdatedTypeContainsProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY, oldUpdatedTypeContainsProperty, newUpdatedTypeContainsProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedTypeContainsProperty(TypeContainsPropertyType newUpdatedTypeContainsProperty) {
		if (newUpdatedTypeContainsProperty != updatedTypeContainsProperty) {
			NotificationChain msgs = null;
			if (updatedTypeContainsProperty != null)
				msgs = ((InternalEObject)updatedTypeContainsProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY, null, msgs);
			if (newUpdatedTypeContainsProperty != null)
				msgs = ((InternalEObject)newUpdatedTypeContainsProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY, null, msgs);
			msgs = basicSetUpdatedTypeContainsProperty(newUpdatedTypeContainsProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY, newUpdatedTypeContainsProperty, newUpdatedTypeContainsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				return basicSetOriginalTypeContainsProperty(null, msgs);
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY:
				return basicSetUpdatedTypeContainsProperty(null, msgs);
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
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				return getOriginalTypeContainsProperty();
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY:
				return getUpdatedTypeContainsProperty();
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
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				setOriginalTypeContainsProperty((TypeContainsPropertyType)newValue);
				return;
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY:
				setUpdatedTypeContainsProperty((TypeContainsPropertyType)newValue);
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
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				setOriginalTypeContainsProperty((TypeContainsPropertyType)null);
				return;
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY:
				setUpdatedTypeContainsProperty((TypeContainsPropertyType)null);
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
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY:
				return originalTypeContainsProperty != null;
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY:
				return updatedTypeContainsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifiedTypeContainsPropertyEntryTypeImpl
