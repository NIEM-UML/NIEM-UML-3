/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getMPDInformation <em>MPD Information</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getIEPConformanceTarget <em>IEP Conformance Target</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getMpdClassCode <em>Mpd Class Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getMpdName <em>Mpd Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getMpdURI <em>Mpd URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDTypeImpl#getMpdVersionID <em>Mpd Version ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPDTypeImpl extends ObjectTypeImpl implements MPDType {
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
	 * The cached value of the '{@link #getMPDInformation() <em>MPD Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPDInformation()
	 * @generated
	 * @ordered
	 */
	protected MPDInformationType mPDInformation;

	/**
	 * The cached value of the '{@link #getIEPConformanceTarget() <em>IEP Conformance Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIEPConformanceTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<IEPConformanceTargetType> iEPConformanceTarget;

	/**
	 * The cached value of the '{@link #getArtifactOrArtifactSetGroup() <em>Artifact Or Artifact Set Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactOrArtifactSetGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap artifactOrArtifactSetGroup;

	/**
	 * The default value of the '{@link #getMpdClassCode() <em>Mpd Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final List<Object> MPD_CLASS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdClassCode() <em>Mpd Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdClassCode()
	 * @generated
	 * @ordered
	 */
	protected List<Object> mpdClassCode = MPD_CLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdName() <em>Mpd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdName()
	 * @generated
	 * @ordered
	 */
	protected static final String MPD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdName() <em>Mpd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdName()
	 * @generated
	 * @ordered
	 */
	protected String mpdName = MPD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdURI() <em>Mpd URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdURI()
	 * @generated
	 * @ordered
	 */
	protected static final String MPD_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdURI() <em>Mpd URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdURI()
	 * @generated
	 * @ordered
	 */
	protected String mpdURI = MPD_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getMpdVersionID() <em>Mpd Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdVersionID()
	 * @generated
	 * @ordered
	 */
	protected static final String MPD_VERSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMpdVersionID() <em>Mpd Version ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMpdVersionID()
	 * @generated
	 * @ordered
	 */
	protected String mpdVersionID = MPD_VERSION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.MPD_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__DESCRIPTION_TEXT, oldDescriptionText, newDescriptionText, !oldDescriptionTextESet);
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
				msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_TYPE__DESCRIPTION_TEXT, null, msgs);
			if (newDescriptionText != null)
				msgs = ((InternalEObject)newDescriptionText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicSetDescriptionText(newDescriptionText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__DESCRIPTION_TEXT, newDescriptionText, newDescriptionText, !oldDescriptionTextESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.MPD_TYPE__DESCRIPTION_TEXT, oldDescriptionText, null, oldDescriptionTextESet);
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
			msgs = ((InternalEObject)descriptionText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_TYPE__DESCRIPTION_TEXT, null, msgs);
			msgs = basicUnsetDescriptionText(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDescriptionTextESet = descriptionTextESet;
			descriptionTextESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.MPD_TYPE__DESCRIPTION_TEXT, null, null, oldDescriptionTextESet));
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
	public MPDInformationType getMPDInformation() {
		return mPDInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPDInformation(MPDInformationType newMPDInformation, NotificationChain msgs) {
		MPDInformationType oldMPDInformation = mPDInformation;
		mPDInformation = newMPDInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__MPD_INFORMATION, oldMPDInformation, newMPDInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPDInformation(MPDInformationType newMPDInformation) {
		if (newMPDInformation != mPDInformation) {
			NotificationChain msgs = null;
			if (mPDInformation != null)
				msgs = ((InternalEObject)mPDInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_TYPE__MPD_INFORMATION, null, msgs);
			if (newMPDInformation != null)
				msgs = ((InternalEObject)newMPDInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_TYPE__MPD_INFORMATION, null, msgs);
			msgs = basicSetMPDInformation(newMPDInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__MPD_INFORMATION, newMPDInformation, newMPDInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEPConformanceTargetType> getIEPConformanceTarget() {
		if (iEPConformanceTarget == null) {
			iEPConformanceTarget = new EObjectContainmentEList<IEPConformanceTargetType>(IEPConformanceTargetType.class, this, _0Package.MPD_TYPE__IEP_CONFORMANCE_TARGET);
		}
		return iEPConformanceTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getArtifactOrArtifactSetGroup() {
		if (artifactOrArtifactSetGroup == null) {
			artifactOrArtifactSetGroup = new BasicFeatureMap(this, _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP);
		}
		return artifactOrArtifactSetGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getArtifactOrArtifactSet() {
		return getArtifactOrArtifactSetGroup().list(_0Package.Literals.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> getMpdClassCode() {
		return mpdClassCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdClassCode(List<Object> newMpdClassCode) {
		List<Object> oldMpdClassCode = mpdClassCode;
		mpdClassCode = newMpdClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__MPD_CLASS_CODE, oldMpdClassCode, mpdClassCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMpdName() {
		return mpdName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdName(String newMpdName) {
		String oldMpdName = mpdName;
		mpdName = newMpdName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__MPD_NAME, oldMpdName, mpdName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMpdURI() {
		return mpdURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdURI(String newMpdURI) {
		String oldMpdURI = mpdURI;
		mpdURI = newMpdURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__MPD_URI, oldMpdURI, mpdURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMpdVersionID() {
		return mpdVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMpdVersionID(String newMpdVersionID) {
		String oldMpdVersionID = mpdVersionID;
		mpdVersionID = newMpdVersionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_TYPE__MPD_VERSION_ID, oldMpdVersionID, mpdVersionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MPD_TYPE__DESCRIPTION_TEXT:
				return basicUnsetDescriptionText(msgs);
			case _0Package.MPD_TYPE__MPD_INFORMATION:
				return basicSetMPDInformation(null, msgs);
			case _0Package.MPD_TYPE__IEP_CONFORMANCE_TARGET:
				return ((InternalEList<?>)getIEPConformanceTarget()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				return ((InternalEList<?>)getArtifactOrArtifactSetGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET:
				return ((InternalEList<?>)getArtifactOrArtifactSet()).basicRemove(otherEnd, msgs);
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
			case _0Package.MPD_TYPE__DESCRIPTION_TEXT:
				return getDescriptionText();
			case _0Package.MPD_TYPE__MPD_INFORMATION:
				return getMPDInformation();
			case _0Package.MPD_TYPE__IEP_CONFORMANCE_TARGET:
				return getIEPConformanceTarget();
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				if (coreType) return getArtifactOrArtifactSetGroup();
				return ((FeatureMap.Internal)getArtifactOrArtifactSetGroup()).getWrapper();
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET:
				return getArtifactOrArtifactSet();
			case _0Package.MPD_TYPE__MPD_CLASS_CODE:
				return getMpdClassCode();
			case _0Package.MPD_TYPE__MPD_NAME:
				return getMpdName();
			case _0Package.MPD_TYPE__MPD_URI:
				return getMpdURI();
			case _0Package.MPD_TYPE__MPD_VERSION_ID:
				return getMpdVersionID();
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
			case _0Package.MPD_TYPE__DESCRIPTION_TEXT:
				setDescriptionText((TextType)newValue);
				return;
			case _0Package.MPD_TYPE__MPD_INFORMATION:
				setMPDInformation((MPDInformationType)newValue);
				return;
			case _0Package.MPD_TYPE__IEP_CONFORMANCE_TARGET:
				getIEPConformanceTarget().clear();
				getIEPConformanceTarget().addAll((Collection<? extends IEPConformanceTargetType>)newValue);
				return;
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				((FeatureMap.Internal)getArtifactOrArtifactSetGroup()).set(newValue);
				return;
			case _0Package.MPD_TYPE__MPD_CLASS_CODE:
				setMpdClassCode((List<Object>)newValue);
				return;
			case _0Package.MPD_TYPE__MPD_NAME:
				setMpdName((String)newValue);
				return;
			case _0Package.MPD_TYPE__MPD_URI:
				setMpdURI((String)newValue);
				return;
			case _0Package.MPD_TYPE__MPD_VERSION_ID:
				setMpdVersionID((String)newValue);
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
			case _0Package.MPD_TYPE__DESCRIPTION_TEXT:
				unsetDescriptionText();
				return;
			case _0Package.MPD_TYPE__MPD_INFORMATION:
				setMPDInformation((MPDInformationType)null);
				return;
			case _0Package.MPD_TYPE__IEP_CONFORMANCE_TARGET:
				getIEPConformanceTarget().clear();
				return;
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				getArtifactOrArtifactSetGroup().clear();
				return;
			case _0Package.MPD_TYPE__MPD_CLASS_CODE:
				setMpdClassCode(MPD_CLASS_CODE_EDEFAULT);
				return;
			case _0Package.MPD_TYPE__MPD_NAME:
				setMpdName(MPD_NAME_EDEFAULT);
				return;
			case _0Package.MPD_TYPE__MPD_URI:
				setMpdURI(MPD_URI_EDEFAULT);
				return;
			case _0Package.MPD_TYPE__MPD_VERSION_ID:
				setMpdVersionID(MPD_VERSION_ID_EDEFAULT);
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
			case _0Package.MPD_TYPE__DESCRIPTION_TEXT:
				return isSetDescriptionText();
			case _0Package.MPD_TYPE__MPD_INFORMATION:
				return mPDInformation != null;
			case _0Package.MPD_TYPE__IEP_CONFORMANCE_TARGET:
				return iEPConformanceTarget != null && !iEPConformanceTarget.isEmpty();
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP:
				return artifactOrArtifactSetGroup != null && !artifactOrArtifactSetGroup.isEmpty();
			case _0Package.MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET:
				return !getArtifactOrArtifactSet().isEmpty();
			case _0Package.MPD_TYPE__MPD_CLASS_CODE:
				return MPD_CLASS_CODE_EDEFAULT == null ? mpdClassCode != null : !MPD_CLASS_CODE_EDEFAULT.equals(mpdClassCode);
			case _0Package.MPD_TYPE__MPD_NAME:
				return MPD_NAME_EDEFAULT == null ? mpdName != null : !MPD_NAME_EDEFAULT.equals(mpdName);
			case _0Package.MPD_TYPE__MPD_URI:
				return MPD_URI_EDEFAULT == null ? mpdURI != null : !MPD_URI_EDEFAULT.equals(mpdURI);
			case _0Package.MPD_TYPE__MPD_VERSION_ID:
				return MPD_VERSION_ID_EDEFAULT == null ? mpdVersionID != null : !MPD_VERSION_ID_EDEFAULT.equals(mpdVersionID);
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
		result.append(" (artifactOrArtifactSetGroup: ");
		result.append(artifactOrArtifactSetGroup);
		result.append(", mpdClassCode: ");
		result.append(mpdClassCode);
		result.append(", mpdName: ");
		result.append(mpdName);
		result.append(", mpdURI: ");
		result.append(mpdURI);
		result.append(", mpdVersionID: ");
		result.append(mpdVersionID);
		result.append(')');
		return result.toString();
	}

} //MPDTypeImpl
