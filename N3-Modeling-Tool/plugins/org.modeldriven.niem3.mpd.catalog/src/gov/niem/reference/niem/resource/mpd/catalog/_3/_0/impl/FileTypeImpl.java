/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

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
 * An implementation of the model object '<em><b>File Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl#getRequiredFile <em>Required File</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl#getExternalURI <em>External URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl#getMimeMediaTypeText <em>Mime Media Type Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.FileTypeImpl#getPathURI <em>Path URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTypeImpl extends ObjectTypeImpl implements FileType {
	/**
	 * The cached value of the '{@link #getRequiredFile() <em>Required File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFile()
	 * @generated
	 * @ordered
	 */
	protected EList<FileType> requiredFile;

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
	 * The default value of the '{@link #getExternalURI() <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalURI()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalURI() <em>External URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalURI()
	 * @generated
	 * @ordered
	 */
	protected String externalURI = EXTERNAL_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeMediaTypeText() <em>Mime Media Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeMediaTypeText()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_MEDIA_TYPE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeMediaTypeText() <em>Mime Media Type Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeMediaTypeText()
	 * @generated
	 * @ordered
	 */
	protected String mimeMediaTypeText = MIME_MEDIA_TYPE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathURI() <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathURI()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathURI() <em>Path URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathURI()
	 * @generated
	 * @ordered
	 */
	protected String pathURI = PATH_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.FILE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileType> getRequiredFile() {
		if (requiredFile == null) {
			requiredFile = new EObjectContainmentEList<FileType>(FileType.class, this, _0Package.FILE_TYPE__REQUIRED_FILE);
		}
		return requiredFile;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.FILE_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
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
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.FILE_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.FILE_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FILE_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.FILE_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
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
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.FILE_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.FILE_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
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
	public String getExternalURI() {
		return externalURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalURI(String newExternalURI) {
		String oldExternalURI = externalURI;
		externalURI = newExternalURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FILE_TYPE__EXTERNAL_URI, oldExternalURI, externalURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeMediaTypeText() {
		return mimeMediaTypeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeMediaTypeText(String newMimeMediaTypeText) {
		String oldMimeMediaTypeText = mimeMediaTypeText;
		mimeMediaTypeText = newMimeMediaTypeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FILE_TYPE__MIME_MEDIA_TYPE_TEXT, oldMimeMediaTypeText, mimeMediaTypeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathURI() {
		return pathURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathURI(String newPathURI) {
		String oldPathURI = pathURI;
		pathURI = newPathURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.FILE_TYPE__PATH_URI, oldPathURI, pathURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FILE_TYPE__REQUIRED_FILE:
				return ((InternalEList<?>)getRequiredFile()).basicRemove(otherEnd, msgs);
			case _0Package.FILE_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
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
			case _0Package.FILE_TYPE__REQUIRED_FILE:
				return getRequiredFile();
			case _0Package.FILE_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.FILE_TYPE__EXTERNAL_URI:
				return getExternalURI();
			case _0Package.FILE_TYPE__MIME_MEDIA_TYPE_TEXT:
				return getMimeMediaTypeText();
			case _0Package.FILE_TYPE__PATH_URI:
				return getPathURI();
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
			case _0Package.FILE_TYPE__REQUIRED_FILE:
				getRequiredFile().clear();
				getRequiredFile().addAll((Collection<? extends FileType>)newValue);
				return;
			case _0Package.FILE_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.FILE_TYPE__EXTERNAL_URI:
				setExternalURI((String)newValue);
				return;
			case _0Package.FILE_TYPE__MIME_MEDIA_TYPE_TEXT:
				setMimeMediaTypeText((String)newValue);
				return;
			case _0Package.FILE_TYPE__PATH_URI:
				setPathURI((String)newValue);
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
			case _0Package.FILE_TYPE__REQUIRED_FILE:
				getRequiredFile().clear();
				return;
			case _0Package.FILE_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.FILE_TYPE__EXTERNAL_URI:
				setExternalURI(EXTERNAL_URI_EDEFAULT);
				return;
			case _0Package.FILE_TYPE__MIME_MEDIA_TYPE_TEXT:
				setMimeMediaTypeText(MIME_MEDIA_TYPE_TEXT_EDEFAULT);
				return;
			case _0Package.FILE_TYPE__PATH_URI:
				setPathURI(PATH_URI_EDEFAULT);
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
			case _0Package.FILE_TYPE__REQUIRED_FILE:
				return requiredFile != null && !requiredFile.isEmpty();
			case _0Package.FILE_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.FILE_TYPE__EXTERNAL_URI:
				return EXTERNAL_URI_EDEFAULT == null ? externalURI != null : !EXTERNAL_URI_EDEFAULT.equals(externalURI);
			case _0Package.FILE_TYPE__MIME_MEDIA_TYPE_TEXT:
				return MIME_MEDIA_TYPE_TEXT_EDEFAULT == null ? mimeMediaTypeText != null : !MIME_MEDIA_TYPE_TEXT_EDEFAULT.equals(mimeMediaTypeText);
			case _0Package.FILE_TYPE__PATH_URI:
				return PATH_URI_EDEFAULT == null ? pathURI != null : !PATH_URI_EDEFAULT.equals(pathURI);
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
		result.append(" (externalURI: ");
		result.append(externalURI);
		result.append(", mimeMediaTypeText: ");
		result.append(mimeMediaTypeText);
		result.append(", pathURI: ");
		result.append(pathURI);
		result.append(')');
		return result.toString();
	}

} //FileTypeImpl
