/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Namespace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.NewNamespaceEntryTypeImpl#getNewNamespace <em>New Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewNamespaceEntryTypeImpl extends ChangeLogEntryTypeImpl implements NewNamespaceEntryType {
	/**
	 * The cached value of the '{@link #getNewNamespace() <em>New Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewNamespace()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType newNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewNamespaceEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.NEW_NAMESPACE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getNewNamespace() {
		return newNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewNamespace(NamespaceType newNewNamespace, NotificationChain msgs) {
		NamespaceType oldNewNamespace = newNamespace;
		newNamespace = newNewNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE, oldNewNamespace, newNewNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewNamespace(NamespaceType newNewNamespace) {
		if (newNewNamespace != newNamespace) {
			NotificationChain msgs = null;
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE, null, msgs);
			if (newNewNamespace != null)
				msgs = ((InternalEObject)newNewNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE, null, msgs);
			msgs = basicSetNewNamespace(newNewNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE, newNewNamespace, newNewNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE:
				return basicSetNewNamespace(null, msgs);
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
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE:
				return getNewNamespace();
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
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE:
				setNewNamespace((NamespaceType)newValue);
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
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE:
				setNewNamespace((NamespaceType)null);
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
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE:
				return newNamespace != null;
		}
		return super.eIsSet(featureID);
	}

} //NewNamespaceEntryTypeImpl
