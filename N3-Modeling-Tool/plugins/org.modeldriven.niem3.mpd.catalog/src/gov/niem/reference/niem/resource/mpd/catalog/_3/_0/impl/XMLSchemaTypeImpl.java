/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl#getXMLCatalog <em>XML Catalog</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.XMLSchemaTypeImpl#getXMLSchemaDocument <em>XML Schema Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLSchemaTypeImpl extends ObjectTypeImpl implements XMLSchemaType {
	/**
	 * The cached value of the '{@link #getDescriptionText() <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected TextType descriptionText;

	/**
	 * This is true if the Description Text containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionTextESet;

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
	 * The cached value of the '{@link #getXMLSchemaDocument() <em>XML Schema Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLSchemaDocument()
	 * @generated
	 * @ordered
	 */
	protected FileType xMLSchemaDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLSchemaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.XML_SCHEMA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextType getDescriptionText() {
		return descriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptionText(TextType newDescriptionText, NotificationChain msgs) {
		TextType oldDescriptionText = descriptionText;
		descriptionText = newDescriptionText;
		boolean oldDescriptionTextESet = descriptionTextESet;
		descriptionTextESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionText(TextType newDescriptionText) {
		if (newDescriptionText != descriptionText) {
			NotificationChain msgs = null;
			if (descriptionText != null)
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDescriptionText(NotificationChain msgs) {
		TextType oldDescriptionText = descriptionText;
		descriptionText = null;
		boolean oldDescriptionTextESet = descriptionTextESet;
		descriptionTextESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescriptionText() {
		if (descriptionText != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescriptionText() {
		return descriptionTextESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.XML_SCHEMA_TYPE__XML_CATALOG, oldXMLCatalog, newXMLCatalog);
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
				msgs = ((InternalEObject)xMLCatalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__XML_CATALOG, null, msgs);
			if (newXMLCatalog != null)
				msgs = ((InternalEObject)newXMLCatalog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__XML_CATALOG, null, msgs);
			msgs = basicSetXMLCatalog(newXMLCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.XML_SCHEMA_TYPE__XML_CATALOG, newXMLCatalog, newXMLCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType getXMLSchemaDocument() {
		return xMLSchemaDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMLSchemaDocument(FileType newXMLSchemaDocument, NotificationChain msgs) {
		FileType oldXMLSchemaDocument = xMLSchemaDocument;
		xMLSchemaDocument = newXMLSchemaDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT, oldXMLSchemaDocument, newXMLSchemaDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMLSchemaDocument(FileType newXMLSchemaDocument) {
		if (newXMLSchemaDocument != xMLSchemaDocument) {
			NotificationChain msgs = null;
			if (xMLSchemaDocument != null)
				msgs = ((InternalEObject)xMLSchemaDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT, null, msgs);
			if (newXMLSchemaDocument != null)
				msgs = ((InternalEObject)newXMLSchemaDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT, null, msgs);
			msgs = basicSetXMLSchemaDocument(newXMLSchemaDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT, newXMLSchemaDocument, newXMLSchemaDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
			case _0Package.XML_SCHEMA_TYPE__XML_CATALOG:
				return basicSetXMLCatalog(null, msgs);
			case _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT:
				return basicSetXMLSchemaDocument(null, msgs);
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
			case _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.XML_SCHEMA_TYPE__XML_CATALOG:
				return getXMLCatalog();
			case _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT:
				return getXMLSchemaDocument();
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
			case _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.XML_SCHEMA_TYPE__XML_CATALOG:
				setXMLCatalog((FileType)newValue);
				return;
			case _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT:
				setXMLSchemaDocument((FileType)newValue);
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
			case _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.XML_SCHEMA_TYPE__XML_CATALOG:
				setXMLCatalog((FileType)null);
				return;
			case _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT:
				setXMLSchemaDocument((FileType)null);
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
			case _0Package.XML_SCHEMA_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.XML_SCHEMA_TYPE__XML_CATALOG:
				return xMLCatalog != null;
			case _0Package.XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT:
				return xMLSchemaDocument != null;
		}
		return super.eIsSet(featureID);
	}

} //XMLSchemaTypeImpl
