/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Document Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl#getXMLCatalog <em>XML Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl#getWantlist <em>Wantlist</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.SchemaDocumentSetTypeImpl#getXMLSchemaDocument <em>XML Schema Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaDocumentSetTypeImpl extends FileSetTypeImpl implements SchemaDocumentSetType {
	/**
	 * The cached value of the '{@link #getXMLCatalog() <em>XML Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLCatalog()
	 * @generated
	 * @ordered
	 */
	protected FileType xMLCatalog;

	/**
	 * The cached value of the '{@link #getWantlist() <em>Wantlist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWantlist()
	 * @generated
	 * @ordered
	 */
	protected FileType wantlist;

	/**
	 * The cached value of the '{@link #getXMLSchemaDocument() <em>XML Schema Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLSchemaDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<FileType> xMLSchemaDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaDocumentSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.SCHEMA_DOCUMENT_SET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getXMLCatalog() {
		return xMLCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMLCatalog(FileType newXMLCatalog, NotificationChain msgs) {
		FileType oldXMLCatalog = xMLCatalog;
		xMLCatalog = newXMLCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG, oldXMLCatalog, newXMLCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLCatalog(FileType newXMLCatalog) {
		if (newXMLCatalog != xMLCatalog) {
			NotificationChain msgs = null;
			if (xMLCatalog != null)
				msgs = ((InternalEObject)xMLCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG, null, msgs);
			if (newXMLCatalog != null)
				msgs = ((InternalEObject)newXMLCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG, null, msgs);
			msgs = basicSetXMLCatalog(newXMLCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG, newXMLCatalog, newXMLCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getWantlist() {
		return wantlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWantlist(FileType newWantlist, NotificationChain msgs) {
		FileType oldWantlist = wantlist;
		wantlist = newWantlist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST, oldWantlist, newWantlist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWantlist(FileType newWantlist) {
		if (newWantlist != wantlist) {
			NotificationChain msgs = null;
			if (wantlist != null)
				msgs = ((InternalEObject)wantlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST, null, msgs);
			if (newWantlist != null)
				msgs = ((InternalEObject)newWantlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST, null, msgs);
			msgs = basicSetWantlist(newWantlist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST, newWantlist, newWantlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileType> getXMLSchemaDocument() {
		if (xMLSchemaDocument == null) {
			xMLSchemaDocument = new EObjectContainmentEList<FileType>(FileType.class, this, _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT);
		}
		return xMLSchemaDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG:
				return basicSetXMLCatalog(null, msgs);
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST:
				return basicSetWantlist(null, msgs);
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT:
				return ((InternalEList<?>)getXMLSchemaDocument()).basicRemove(otherEnd, msgs);
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
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG:
				return getXMLCatalog();
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST:
				return getWantlist();
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT:
				return getXMLSchemaDocument();
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
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG:
				setXMLCatalog((FileType)newValue);
				return;
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST:
				setWantlist((FileType)newValue);
				return;
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT:
				getXMLSchemaDocument().clear();
				getXMLSchemaDocument().addAll((Collection<? extends FileType>)newValue);
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
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG:
				setXMLCatalog((FileType)null);
				return;
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST:
				setWantlist((FileType)null);
				return;
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT:
				getXMLSchemaDocument().clear();
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
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG:
				return xMLCatalog != null;
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__WANTLIST:
				return wantlist != null;
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT:
				return xMLSchemaDocument != null && !xMLSchemaDocument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SchemaDocumentSetTypeImpl
