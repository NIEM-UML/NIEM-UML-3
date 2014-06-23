/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.impl;

import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI;
import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Group;
import oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Public;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getDelegatePublic <em>Delegate Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getDelegateSystem <em>Delegate System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getDelegateURI <em>Delegate URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getNextCatalog <em>Next Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getPublic <em>Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getRewriteSystem <em>Rewrite System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getRewriteURI <em>Rewrite URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getSystem <em>System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.impl.DocumentRootImpl#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CatalogPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CatalogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CatalogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog getCatalog() {
		return (Catalog)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(Catalog newCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__CATALOG, newCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(Catalog newCatalog) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__CATALOG, newCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatePublic getDelegatePublic() {
		return (DelegatePublic)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_PUBLIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegatePublic(DelegatePublic newDelegatePublic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_PUBLIC, newDelegatePublic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegatePublic(DelegatePublic newDelegatePublic) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_PUBLIC, newDelegatePublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateSystem getDelegateSystem() {
		return (DelegateSystem)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateSystem(DelegateSystem newDelegateSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_SYSTEM, newDelegateSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateSystem(DelegateSystem newDelegateSystem) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_SYSTEM, newDelegateSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateURI getDelegateURI() {
		return (DelegateURI)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateURI(DelegateURI newDelegateURI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_URI, newDelegateURI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateURI(DelegateURI newDelegateURI) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__DELEGATE_URI, newDelegateURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return (Group)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__GROUP, newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextCatalog getNextCatalog() {
		return (NextCatalog)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__NEXT_CATALOG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextCatalog(NextCatalog newNextCatalog, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__NEXT_CATALOG, newNextCatalog, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextCatalog(NextCatalog newNextCatalog) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__NEXT_CATALOG, newNextCatalog);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Public getPublic() {
		return (Public)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__PUBLIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublic(Public newPublic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__PUBLIC, newPublic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(Public newPublic) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__PUBLIC, newPublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteSystem getRewriteSystem() {
		return (RewriteSystem)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__REWRITE_SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRewriteSystem(RewriteSystem newRewriteSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__REWRITE_SYSTEM, newRewriteSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewriteSystem(RewriteSystem newRewriteSystem) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__REWRITE_SYSTEM, newRewriteSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteURI getRewriteURI() {
		return (RewriteURI)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__REWRITE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRewriteURI(RewriteURI newRewriteURI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__REWRITE_URI, newRewriteURI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewriteURI(RewriteURI newRewriteURI) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__REWRITE_URI, newRewriteURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oasis.names.tc.entity.xmlns.xml.catalog.System getSystem() {
		return (oasis.names.tc.entity.xmlns.xml.catalog.System)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__SYSTEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(oasis.names.tc.entity.xmlns.xml.catalog.System newSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__SYSTEM, newSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(oasis.names.tc.entity.xmlns.xml.catalog.System newSystem) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__SYSTEM, newSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUri() {
		return (Uri)getMixed().get(CatalogPackage.Literals.DOCUMENT_ROOT__URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(Uri newUri, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CatalogPackage.Literals.DOCUMENT_ROOT__URI, newUri, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(Uri newUri) {
		((FeatureMap.Internal)getMixed()).set(CatalogPackage.Literals.DOCUMENT_ROOT__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CatalogPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CatalogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CatalogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CatalogPackage.DOCUMENT_ROOT__CATALOG:
				return basicSetCatalog(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_PUBLIC:
				return basicSetDelegatePublic(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_SYSTEM:
				return basicSetDelegateSystem(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_URI:
				return basicSetDelegateURI(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__NEXT_CATALOG:
				return basicSetNextCatalog(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__PUBLIC:
				return basicSetPublic(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_SYSTEM:
				return basicSetRewriteSystem(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_URI:
				return basicSetRewriteURI(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__SYSTEM:
				return basicSetSystem(null, msgs);
			case CatalogPackage.DOCUMENT_ROOT__URI:
				return basicSetUri(null, msgs);
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
			case CatalogPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CatalogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CatalogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CatalogPackage.DOCUMENT_ROOT__CATALOG:
				return getCatalog();
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_PUBLIC:
				return getDelegatePublic();
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_SYSTEM:
				return getDelegateSystem();
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_URI:
				return getDelegateURI();
			case CatalogPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case CatalogPackage.DOCUMENT_ROOT__NEXT_CATALOG:
				return getNextCatalog();
			case CatalogPackage.DOCUMENT_ROOT__PUBLIC:
				return getPublic();
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_SYSTEM:
				return getRewriteSystem();
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_URI:
				return getRewriteURI();
			case CatalogPackage.DOCUMENT_ROOT__SYSTEM:
				return getSystem();
			case CatalogPackage.DOCUMENT_ROOT__URI:
				return getUri();
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
			case CatalogPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__CATALOG:
				setCatalog((Catalog)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_PUBLIC:
				setDelegatePublic((DelegatePublic)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_SYSTEM:
				setDelegateSystem((DelegateSystem)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_URI:
				setDelegateURI((DelegateURI)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__NEXT_CATALOG:
				setNextCatalog((NextCatalog)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__PUBLIC:
				setPublic((Public)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_SYSTEM:
				setRewriteSystem((RewriteSystem)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_URI:
				setRewriteURI((RewriteURI)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__SYSTEM:
				setSystem((oasis.names.tc.entity.xmlns.xml.catalog.System)newValue);
				return;
			case CatalogPackage.DOCUMENT_ROOT__URI:
				setUri((Uri)newValue);
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
			case CatalogPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CatalogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CatalogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CatalogPackage.DOCUMENT_ROOT__CATALOG:
				setCatalog((Catalog)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_PUBLIC:
				setDelegatePublic((DelegatePublic)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_SYSTEM:
				setDelegateSystem((DelegateSystem)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_URI:
				setDelegateURI((DelegateURI)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__NEXT_CATALOG:
				setNextCatalog((NextCatalog)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__PUBLIC:
				setPublic((Public)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_SYSTEM:
				setRewriteSystem((RewriteSystem)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_URI:
				setRewriteURI((RewriteURI)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__SYSTEM:
				setSystem((oasis.names.tc.entity.xmlns.xml.catalog.System)null);
				return;
			case CatalogPackage.DOCUMENT_ROOT__URI:
				setUri((Uri)null);
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
			case CatalogPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CatalogPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CatalogPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CatalogPackage.DOCUMENT_ROOT__CATALOG:
				return getCatalog() != null;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_PUBLIC:
				return getDelegatePublic() != null;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_SYSTEM:
				return getDelegateSystem() != null;
			case CatalogPackage.DOCUMENT_ROOT__DELEGATE_URI:
				return getDelegateURI() != null;
			case CatalogPackage.DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case CatalogPackage.DOCUMENT_ROOT__NEXT_CATALOG:
				return getNextCatalog() != null;
			case CatalogPackage.DOCUMENT_ROOT__PUBLIC:
				return getPublic() != null;
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_SYSTEM:
				return getRewriteSystem() != null;
			case CatalogPackage.DOCUMENT_ROOT__REWRITE_URI:
				return getRewriteURI() != null;
			case CatalogPackage.DOCUMENT_ROOT__SYSTEM:
				return getSystem() != null;
			case CatalogPackage.DOCUMENT_ROOT__URI:
				return getUri() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
