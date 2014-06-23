/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.impl;

import java.util.Collection;

import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI;
import oasis.names.tc.entity.xmlns.xml.catalog.Group;
import oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Public;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI;
import oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getPublic <em>Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getSystem <em>System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getRewriteSystem <em>Rewrite System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getRewriteURI <em>Rewrite URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getDelegatePublic <em>Delegate Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getDelegateSystem <em>Delegate System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getDelegateURI <em>Delegate URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getNextCatalog <em>Next Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getId <em>Id</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getPrefer <em>Prefer</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogImpl extends MinimalEObjectImpl.Container implements Catalog {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getPrefer() <em>Prefer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefer()
	 * @generated
	 * @ordered
	 */
	protected static final SystemOrPublic PREFER_EDEFAULT = SystemOrPublic.SYSTEM;

	/**
	 * The cached value of the '{@link #getPrefer() <em>Prefer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefer()
	 * @generated
	 * @ordered
	 */
	protected SystemOrPublic prefer = PREFER_EDEFAULT;

	/**
	 * This is true if the Prefer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preferESet;

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
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.CATALOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CatalogPackage.CATALOG__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Public> getPublic() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__PUBLIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<oasis.names.tc.entity.xmlns.xml.catalog.System> getSystem() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getUri() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RewriteSystem> getRewriteSystem() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__REWRITE_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RewriteURI> getRewriteURI() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__REWRITE_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegatePublic> getDelegatePublic() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__DELEGATE_PUBLIC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegateSystem> getDelegateSystem() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__DELEGATE_SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelegateURI> getDelegateURI() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__DELEGATE_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NextCatalog> getNextCatalog() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__NEXT_CATALOG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroup1() {
		return getGroup().list(CatalogPackage.Literals.CATALOG__GROUP1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CatalogPackage.Literals.CATALOG__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOrPublic getPrefer() {
		return prefer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefer(SystemOrPublic newPrefer) {
		SystemOrPublic oldPrefer = prefer;
		prefer = newPrefer == null ? PREFER_EDEFAULT : newPrefer;
		boolean oldPreferESet = preferESet;
		preferESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.CATALOG__PREFER, oldPrefer, prefer, !oldPreferESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrefer() {
		SystemOrPublic oldPrefer = prefer;
		boolean oldPreferESet = preferESet;
		prefer = PREFER_EDEFAULT;
		preferESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CatalogPackage.CATALOG__PREFER, oldPrefer, PREFER_EDEFAULT, oldPreferESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrefer() {
		return preferESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CatalogPackage.CATALOG__ANY_ATTRIBUTE);
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
			case CatalogPackage.CATALOG__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__PUBLIC:
				return ((InternalEList<?>)getPublic()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__SYSTEM:
				return ((InternalEList<?>)getSystem()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__URI:
				return ((InternalEList<?>)getUri()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__REWRITE_SYSTEM:
				return ((InternalEList<?>)getRewriteSystem()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__REWRITE_URI:
				return ((InternalEList<?>)getRewriteURI()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__DELEGATE_PUBLIC:
				return ((InternalEList<?>)getDelegatePublic()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__DELEGATE_SYSTEM:
				return ((InternalEList<?>)getDelegateSystem()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__DELEGATE_URI:
				return ((InternalEList<?>)getDelegateURI()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__NEXT_CATALOG:
				return ((InternalEList<?>)getNextCatalog()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case CatalogPackage.CATALOG__ANY_ATTRIBUTE:
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
			case CatalogPackage.CATALOG__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CatalogPackage.CATALOG__PUBLIC:
				return getPublic();
			case CatalogPackage.CATALOG__SYSTEM:
				return getSystem();
			case CatalogPackage.CATALOG__URI:
				return getUri();
			case CatalogPackage.CATALOG__REWRITE_SYSTEM:
				return getRewriteSystem();
			case CatalogPackage.CATALOG__REWRITE_URI:
				return getRewriteURI();
			case CatalogPackage.CATALOG__DELEGATE_PUBLIC:
				return getDelegatePublic();
			case CatalogPackage.CATALOG__DELEGATE_SYSTEM:
				return getDelegateSystem();
			case CatalogPackage.CATALOG__DELEGATE_URI:
				return getDelegateURI();
			case CatalogPackage.CATALOG__NEXT_CATALOG:
				return getNextCatalog();
			case CatalogPackage.CATALOG__GROUP1:
				return getGroup1();
			case CatalogPackage.CATALOG__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case CatalogPackage.CATALOG__ID:
				return getId();
			case CatalogPackage.CATALOG__PREFER:
				return getPrefer();
			case CatalogPackage.CATALOG__ANY_ATTRIBUTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CatalogPackage.CATALOG__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CatalogPackage.CATALOG__PUBLIC:
				getPublic().clear();
				getPublic().addAll((Collection<? extends Public>)newValue);
				return;
			case CatalogPackage.CATALOG__SYSTEM:
				getSystem().clear();
				getSystem().addAll((Collection<? extends oasis.names.tc.entity.xmlns.xml.catalog.System>)newValue);
				return;
			case CatalogPackage.CATALOG__URI:
				getUri().clear();
				getUri().addAll((Collection<? extends Uri>)newValue);
				return;
			case CatalogPackage.CATALOG__REWRITE_SYSTEM:
				getRewriteSystem().clear();
				getRewriteSystem().addAll((Collection<? extends RewriteSystem>)newValue);
				return;
			case CatalogPackage.CATALOG__REWRITE_URI:
				getRewriteURI().clear();
				getRewriteURI().addAll((Collection<? extends RewriteURI>)newValue);
				return;
			case CatalogPackage.CATALOG__DELEGATE_PUBLIC:
				getDelegatePublic().clear();
				getDelegatePublic().addAll((Collection<? extends DelegatePublic>)newValue);
				return;
			case CatalogPackage.CATALOG__DELEGATE_SYSTEM:
				getDelegateSystem().clear();
				getDelegateSystem().addAll((Collection<? extends DelegateSystem>)newValue);
				return;
			case CatalogPackage.CATALOG__DELEGATE_URI:
				getDelegateURI().clear();
				getDelegateURI().addAll((Collection<? extends DelegateURI>)newValue);
				return;
			case CatalogPackage.CATALOG__NEXT_CATALOG:
				getNextCatalog().clear();
				getNextCatalog().addAll((Collection<? extends NextCatalog>)newValue);
				return;
			case CatalogPackage.CATALOG__GROUP1:
				getGroup1().clear();
				getGroup1().addAll((Collection<? extends Group>)newValue);
				return;
			case CatalogPackage.CATALOG__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case CatalogPackage.CATALOG__ID:
				setId((String)newValue);
				return;
			case CatalogPackage.CATALOG__PREFER:
				setPrefer((SystemOrPublic)newValue);
				return;
			case CatalogPackage.CATALOG__ANY_ATTRIBUTE:
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
			case CatalogPackage.CATALOG__GROUP:
				getGroup().clear();
				return;
			case CatalogPackage.CATALOG__PUBLIC:
				getPublic().clear();
				return;
			case CatalogPackage.CATALOG__SYSTEM:
				getSystem().clear();
				return;
			case CatalogPackage.CATALOG__URI:
				getUri().clear();
				return;
			case CatalogPackage.CATALOG__REWRITE_SYSTEM:
				getRewriteSystem().clear();
				return;
			case CatalogPackage.CATALOG__REWRITE_URI:
				getRewriteURI().clear();
				return;
			case CatalogPackage.CATALOG__DELEGATE_PUBLIC:
				getDelegatePublic().clear();
				return;
			case CatalogPackage.CATALOG__DELEGATE_SYSTEM:
				getDelegateSystem().clear();
				return;
			case CatalogPackage.CATALOG__DELEGATE_URI:
				getDelegateURI().clear();
				return;
			case CatalogPackage.CATALOG__NEXT_CATALOG:
				getNextCatalog().clear();
				return;
			case CatalogPackage.CATALOG__GROUP1:
				getGroup1().clear();
				return;
			case CatalogPackage.CATALOG__ANY:
				getAny().clear();
				return;
			case CatalogPackage.CATALOG__ID:
				setId(ID_EDEFAULT);
				return;
			case CatalogPackage.CATALOG__PREFER:
				unsetPrefer();
				return;
			case CatalogPackage.CATALOG__ANY_ATTRIBUTE:
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
			case CatalogPackage.CATALOG__GROUP:
				return group != null && !group.isEmpty();
			case CatalogPackage.CATALOG__PUBLIC:
				return !getPublic().isEmpty();
			case CatalogPackage.CATALOG__SYSTEM:
				return !getSystem().isEmpty();
			case CatalogPackage.CATALOG__URI:
				return !getUri().isEmpty();
			case CatalogPackage.CATALOG__REWRITE_SYSTEM:
				return !getRewriteSystem().isEmpty();
			case CatalogPackage.CATALOG__REWRITE_URI:
				return !getRewriteURI().isEmpty();
			case CatalogPackage.CATALOG__DELEGATE_PUBLIC:
				return !getDelegatePublic().isEmpty();
			case CatalogPackage.CATALOG__DELEGATE_SYSTEM:
				return !getDelegateSystem().isEmpty();
			case CatalogPackage.CATALOG__DELEGATE_URI:
				return !getDelegateURI().isEmpty();
			case CatalogPackage.CATALOG__NEXT_CATALOG:
				return !getNextCatalog().isEmpty();
			case CatalogPackage.CATALOG__GROUP1:
				return !getGroup1().isEmpty();
			case CatalogPackage.CATALOG__ANY:
				return !getAny().isEmpty();
			case CatalogPackage.CATALOG__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CatalogPackage.CATALOG__PREFER:
				return isSetPrefer();
			case CatalogPackage.CATALOG__ANY_ATTRIBUTE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", prefer: ");
		if (preferESet) result.append(prefer); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //CatalogImpl
