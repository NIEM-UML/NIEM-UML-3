/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.impl;

import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegate System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl#getId <em>Id</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl#getSystemIdStartString <em>System Id Start String</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DelegateSystemImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegateSystemImpl extends MinimalEObjectImpl.Container implements DelegateSystem {
	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemIdStartString() <em>System Id Start String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdStartString()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_ID_START_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemIdStartString() <em>System Id Start String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemIdStartString()
	 * @generated
	 * @ordered
	 */
	protected String systemIdStartString = SYSTEM_ID_START_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegateSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.DELEGATE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DELEGATE_SYSTEM__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DELEGATE_SYSTEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemIdStartString() {
		return systemIdStartString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemIdStartString(String newSystemIdStartString) {
		String oldSystemIdStartString = systemIdStartString;
		systemIdStartString = newSystemIdStartString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.DELEGATE_SYSTEM__SYSTEM_ID_START_STRING, oldSystemIdStartString, systemIdStartString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CatalogPackage.DELEGATE_SYSTEM__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.DELEGATE_SYSTEM__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case CatalogPackage.DELEGATE_SYSTEM__CATALOG:
				return getCatalog();
			case CatalogPackage.DELEGATE_SYSTEM__ID:
				return getId();
			case CatalogPackage.DELEGATE_SYSTEM__SYSTEM_ID_START_STRING:
				return getSystemIdStartString();
			case CatalogPackage.DELEGATE_SYSTEM__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case CatalogPackage.DELEGATE_SYSTEM__CATALOG:
				setCatalog((String)newValue);
				return;
			case CatalogPackage.DELEGATE_SYSTEM__ID:
				setId((String)newValue);
				return;
			case CatalogPackage.DELEGATE_SYSTEM__SYSTEM_ID_START_STRING:
				setSystemIdStartString((String)newValue);
				return;
			case CatalogPackage.DELEGATE_SYSTEM__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case CatalogPackage.DELEGATE_SYSTEM__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case CatalogPackage.DELEGATE_SYSTEM__ID:
				setId(ID_EDEFAULT);
				return;
			case CatalogPackage.DELEGATE_SYSTEM__SYSTEM_ID_START_STRING:
				setSystemIdStartString(SYSTEM_ID_START_STRING_EDEFAULT);
				return;
			case CatalogPackage.DELEGATE_SYSTEM__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case CatalogPackage.DELEGATE_SYSTEM__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case CatalogPackage.DELEGATE_SYSTEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CatalogPackage.DELEGATE_SYSTEM__SYSTEM_ID_START_STRING:
				return SYSTEM_ID_START_STRING_EDEFAULT == null ? systemIdStartString != null : !SYSTEM_ID_START_STRING_EDEFAULT.equals(systemIdStartString);
			case CatalogPackage.DELEGATE_SYSTEM__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (catalog: ");
		result.append(catalog);
		result.append(", id: ");
		result.append(id);
		result.append(", systemIdStartString: ");
		result.append(systemIdStartString);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DelegateSystemImpl
