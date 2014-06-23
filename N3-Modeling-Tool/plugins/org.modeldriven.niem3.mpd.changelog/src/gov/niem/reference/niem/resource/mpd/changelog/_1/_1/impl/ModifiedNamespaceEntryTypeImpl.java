/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.NamespaceType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modified Namespace Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedNamespaceEntryTypeImpl#getOriginalNamespace <em>Original Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.impl.ModifiedNamespaceEntryTypeImpl#getUpdatedNamespace <em>Updated Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifiedNamespaceEntryTypeImpl extends ChangeLogEntryTypeImpl implements ModifiedNamespaceEntryType {
	/**
	 * The cached value of the '{@link #getOriginalNamespace() <em>Original Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalNamespace()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType originalNamespace;

	/**
	 * The cached value of the '{@link #getUpdatedNamespace() <em>Updated Namespace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedNamespace()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType updatedNamespace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifiedNamespaceEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.MODIFIED_NAMESPACE_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getOriginalNamespace() {
		return originalNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalNamespace(NamespaceType newOriginalNamespace, NotificationChain msgs) {
		NamespaceType oldOriginalNamespace = originalNamespace;
		originalNamespace = newOriginalNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE, oldOriginalNamespace, newOriginalNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalNamespace(NamespaceType newOriginalNamespace) {
		if (newOriginalNamespace != originalNamespace) {
			NotificationChain msgs = null;
			if (originalNamespace != null)
				msgs = ((InternalEObject)originalNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE, null, msgs);
			if (newOriginalNamespace != null)
				msgs = ((InternalEObject)newOriginalNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE, null, msgs);
			msgs = basicSetOriginalNamespace(newOriginalNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE, newOriginalNamespace, newOriginalNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getUpdatedNamespace() {
		return updatedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdatedNamespace(NamespaceType newUpdatedNamespace, NotificationChain msgs) {
		NamespaceType oldUpdatedNamespace = updatedNamespace;
		updatedNamespace = newUpdatedNamespace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE, oldUpdatedNamespace, newUpdatedNamespace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedNamespace(NamespaceType newUpdatedNamespace) {
		if (newUpdatedNamespace != updatedNamespace) {
			NotificationChain msgs = null;
			if (updatedNamespace != null)
				msgs = ((InternalEObject)updatedNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE, null, msgs);
			if (newUpdatedNamespace != null)
				msgs = ((InternalEObject)newUpdatedNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE, null, msgs);
			msgs = basicSetUpdatedNamespace(newUpdatedNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE, newUpdatedNamespace, newUpdatedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE:
				return basicSetOriginalNamespace(null, msgs);
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE:
				return basicSetUpdatedNamespace(null, msgs);
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
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE:
				return getOriginalNamespace();
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE:
				return getUpdatedNamespace();
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
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE:
				setOriginalNamespace((NamespaceType)newValue);
				return;
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE:
				setUpdatedNamespace((NamespaceType)newValue);
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
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE:
				setOriginalNamespace((NamespaceType)null);
				return;
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE:
				setUpdatedNamespace((NamespaceType)null);
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
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE:
				return originalNamespace != null;
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE:
				return updatedNamespace != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifiedNamespaceEntryTypeImpl
