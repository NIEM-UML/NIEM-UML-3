/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.impl;

import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI;

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
 * An implementation of the model object '<em><b>Rewrite URI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl#getId <em>Id</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl#getRewritePrefix <em>Rewrite Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl#getUriIdStartString <em>Uri Id Start String</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.RewriteURIImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RewriteURIImpl extends MinimalEObjectImpl.Container implements RewriteURI {
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
	 * The default value of the '{@link #getRewritePrefix() <em>Rewrite Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewritePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String REWRITE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRewritePrefix() <em>Rewrite Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewritePrefix()
	 * @generated
	 * @ordered
	 */
	protected String rewritePrefix = REWRITE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriIdStartString() <em>Uri Id Start String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriIdStartString()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_ID_START_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriIdStartString() <em>Uri Id Start String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriIdStartString()
	 * @generated
	 * @ordered
	 */
	protected String uriIdStartString = URI_ID_START_STRING_EDEFAULT;

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
	protected RewriteURIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.REWRITE_URI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REWRITE_URI__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRewritePrefix() {
		return rewritePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewritePrefix(String newRewritePrefix) {
		String oldRewritePrefix = rewritePrefix;
		rewritePrefix = newRewritePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REWRITE_URI__REWRITE_PREFIX, oldRewritePrefix, rewritePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriIdStartString() {
		return uriIdStartString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriIdStartString(String newUriIdStartString) {
		String oldUriIdStartString = uriIdStartString;
		uriIdStartString = newUriIdStartString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.REWRITE_URI__URI_ID_START_STRING, oldUriIdStartString, uriIdStartString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CatalogPackage.REWRITE_URI__ANY_ATTRIBUTE);
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
			case CatalogPackage.REWRITE_URI__ANY_ATTRIBUTE:
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
			case CatalogPackage.REWRITE_URI__ID:
				return getId();
			case CatalogPackage.REWRITE_URI__REWRITE_PREFIX:
				return getRewritePrefix();
			case CatalogPackage.REWRITE_URI__URI_ID_START_STRING:
				return getUriIdStartString();
			case CatalogPackage.REWRITE_URI__ANY_ATTRIBUTE:
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
			case CatalogPackage.REWRITE_URI__ID:
				setId((String)newValue);
				return;
			case CatalogPackage.REWRITE_URI__REWRITE_PREFIX:
				setRewritePrefix((String)newValue);
				return;
			case CatalogPackage.REWRITE_URI__URI_ID_START_STRING:
				setUriIdStartString((String)newValue);
				return;
			case CatalogPackage.REWRITE_URI__ANY_ATTRIBUTE:
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
			case CatalogPackage.REWRITE_URI__ID:
				setId(ID_EDEFAULT);
				return;
			case CatalogPackage.REWRITE_URI__REWRITE_PREFIX:
				setRewritePrefix(REWRITE_PREFIX_EDEFAULT);
				return;
			case CatalogPackage.REWRITE_URI__URI_ID_START_STRING:
				setUriIdStartString(URI_ID_START_STRING_EDEFAULT);
				return;
			case CatalogPackage.REWRITE_URI__ANY_ATTRIBUTE:
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
			case CatalogPackage.REWRITE_URI__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CatalogPackage.REWRITE_URI__REWRITE_PREFIX:
				return REWRITE_PREFIX_EDEFAULT == null ? rewritePrefix != null : !REWRITE_PREFIX_EDEFAULT.equals(rewritePrefix);
			case CatalogPackage.REWRITE_URI__URI_ID_START_STRING:
				return URI_ID_START_STRING_EDEFAULT == null ? uriIdStartString != null : !URI_ID_START_STRING_EDEFAULT.equals(uriIdStartString);
			case CatalogPackage.REWRITE_URI__ANY_ATTRIBUTE:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", rewritePrefix: ");
		result.append(rewritePrefix);
		result.append(", uriIdStartString: ");
		result.append(uriIdStartString);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //RewriteURIImpl
