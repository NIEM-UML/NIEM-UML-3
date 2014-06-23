/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Removed Namespace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.RemovedNamespaceEntryTypeImpl#getRemovedNamespace <em>Removed Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemovedNamespaceEntryTypeImpl extends ChangeLogEntryTypeImpl implements RemovedNamespaceEntryType {
	/**
	 * The cached value of the '{@link #getRemovedNamespace() <em>Removed Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemovedNamespace()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType removedNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemovedNamespaceEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.REMOVED_NAMESPACE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getRemovedNamespace() {
		return removedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemovedNamespace(NamespaceType newRemovedNamespace, NotificationChain msgs) {
		NamespaceType oldRemovedNamespace = removedNamespace;
		removedNamespace = newRemovedNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE, oldRemovedNamespace, newRemovedNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemovedNamespace(NamespaceType newRemovedNamespace) {
		if (newRemovedNamespace != removedNamespace) {
			NotificationChain msgs = null;
			if (removedNamespace != null)
				msgs = ((InternalEObject)removedNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE, null, msgs);
			if (newRemovedNamespace != null)
				msgs = ((InternalEObject)newRemovedNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE, null, msgs);
			msgs = basicSetRemovedNamespace(newRemovedNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE, newRemovedNamespace, newRemovedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE:
				return basicSetRemovedNamespace(null, msgs);
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
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE:
				return getRemovedNamespace();
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
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE:
				setRemovedNamespace((NamespaceType)newValue);
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
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE:
				setRemovedNamespace((NamespaceType)null);
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
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE:
				return removedNamespace != null;
		}
		return super.eIsSet(featureID);
	}

} //RemovedNamespaceEntryTypeImpl
