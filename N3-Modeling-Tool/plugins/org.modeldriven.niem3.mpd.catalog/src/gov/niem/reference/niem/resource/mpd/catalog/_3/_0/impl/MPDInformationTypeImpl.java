/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.release.niem.niem.core._3._0.EntityType;

import gov.niem.release.niem.proxy.xsd._3._0.Date;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>MPD Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getAuthoritativeSource <em>Authoritative Source</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getLastRevisionDate <em>Last Revision Date</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getStatusText <em>Status Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getKeywordText <em>Keyword Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getDomainText <em>Domain Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getPurposeText <em>Purpose Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getExchangePatternText <em>Exchange Pattern Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getExchangePartnerName <em>Exchange Partner Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getExtendedInformationGroup <em>Extended Information Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.impl.MPDInformationTypeImpl#getExtendedInformation <em>Extended Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPDInformationTypeImpl extends ObjectTypeImpl implements MPDInformationType {
	/**
	 * The cached value of the '{@link #getAuthoritativeSource() <em>Authoritative Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoritativeSource()
	 * @generated
	 * @ordered
	 */
	protected EntityType authoritativeSource;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate;

	/**
	 * The cached value of the '{@link #getLastRevisionDate() <em>Last Revision Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastRevisionDate;

	/**
	 * The cached value of the '{@link #getStatusText() <em>Status Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusText()
	 * @generated
	 * @ordered
	 */
	protected gov.niem.release.niem.proxy.xsd._3._0.String statusText;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> relationship;

	/**
	 * The cached value of the '{@link #getKeywordText() <em>Keyword Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordText()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> keywordText;

	/**
	 * The cached value of the '{@link #getDomainText() <em>Domain Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainText()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> domainText;

	/**
	 * The cached value of the '{@link #getPurposeText() <em>Purpose Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeText()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> purposeText;

	/**
	 * The cached value of the '{@link #getExchangePatternText() <em>Exchange Pattern Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePatternText()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> exchangePatternText;

	/**
	 * The cached value of the '{@link #getExchangePartnerName() <em>Exchange Partner Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangePartnerName()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> exchangePartnerName;

	/**
	 * The cached value of the '{@link #getExtendedInformationGroup() <em>Extended Information Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedInformationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap extendedInformationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPDInformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.Literals.MPD_INFORMATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getAuthoritativeSource() {
		return authoritativeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthoritativeSource(EntityType newAuthoritativeSource, NotificationChain msgs) {
		EntityType oldAuthoritativeSource = authoritativeSource;
		authoritativeSource = newAuthoritativeSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE, oldAuthoritativeSource, newAuthoritativeSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthoritativeSource(EntityType newAuthoritativeSource) {
		if (newAuthoritativeSource != authoritativeSource) {
			NotificationChain msgs = null;
			if (authoritativeSource != null)
				msgs = ((InternalEObject)authoritativeSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE, null, msgs);
			if (newAuthoritativeSource != null)
				msgs = ((InternalEObject)newAuthoritativeSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE, null, msgs);
			msgs = basicSetAuthoritativeSource(newAuthoritativeSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE, newAuthoritativeSource, newAuthoritativeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreationDate(Date newCreationDate, NotificationChain msgs) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__CREATION_DATE, oldCreationDate, newCreationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		if (newCreationDate != creationDate) {
			NotificationChain msgs = null;
			if (creationDate != null)
				msgs = ((InternalEObject)creationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__CREATION_DATE, null, msgs);
			if (newCreationDate != null)
				msgs = ((InternalEObject)newCreationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__CREATION_DATE, null, msgs);
			msgs = basicSetCreationDate(newCreationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__CREATION_DATE, newCreationDate, newCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastRevisionDate() {
		return lastRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastRevisionDate(Date newLastRevisionDate, NotificationChain msgs) {
		Date oldLastRevisionDate = lastRevisionDate;
		lastRevisionDate = newLastRevisionDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE, oldLastRevisionDate, newLastRevisionDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevisionDate(Date newLastRevisionDate) {
		if (newLastRevisionDate != lastRevisionDate) {
			NotificationChain msgs = null;
			if (lastRevisionDate != null)
				msgs = ((InternalEObject)lastRevisionDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE, null, msgs);
			if (newLastRevisionDate != null)
				msgs = ((InternalEObject)newLastRevisionDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE, null, msgs);
			msgs = basicSetLastRevisionDate(newLastRevisionDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE, newLastRevisionDate, newLastRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.release.niem.proxy.xsd._3._0.String getStatusText() {
		return statusText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusText(gov.niem.release.niem.proxy.xsd._3._0.String newStatusText, NotificationChain msgs) {
		gov.niem.release.niem.proxy.xsd._3._0.String oldStatusText = statusText;
		statusText = newStatusText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT, oldStatusText, newStatusText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusText(gov.niem.release.niem.proxy.xsd._3._0.String newStatusText) {
		if (newStatusText != statusText) {
			NotificationChain msgs = null;
			if (statusText != null)
				msgs = ((InternalEObject)statusText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT, null, msgs);
			if (newStatusText != null)
				msgs = ((InternalEObject)newStatusText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT, null, msgs);
			msgs = basicSetStatusText(newStatusText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT, newStatusText, newStatusText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipType> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<RelationshipType>(RelationshipType.class, this, _0Package.MPD_INFORMATION_TYPE__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getKeywordText() {
		if (keywordText == null) {
			keywordText = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MPD_INFORMATION_TYPE__KEYWORD_TEXT);
		}
		return keywordText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDomainText() {
		if (domainText == null) {
			domainText = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MPD_INFORMATION_TYPE__DOMAIN_TEXT);
		}
		return domainText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getPurposeText() {
		if (purposeText == null) {
			purposeText = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MPD_INFORMATION_TYPE__PURPOSE_TEXT);
		}
		return purposeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getExchangePatternText() {
		if (exchangePatternText == null) {
			exchangePatternText = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT);
		}
		return exchangePatternText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getExchangePartnerName() {
		if (exchangePartnerName == null) {
			exchangePartnerName = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME);
		}
		return exchangePartnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExtendedInformationGroup() {
		if (extendedInformationGroup == null) {
			extendedInformationGroup = new BasicFeatureMap(this, _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP);
		}
		return extendedInformationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getExtendedInformation() {
		return getExtendedInformationGroup().list(_0Package.Literals.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE:
				return basicSetAuthoritativeSource(null, msgs);
			case _0Package.MPD_INFORMATION_TYPE__CREATION_DATE:
				return basicSetCreationDate(null, msgs);
			case _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE:
				return basicSetLastRevisionDate(null, msgs);
			case _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT:
				return basicSetStatusText(null, msgs);
			case _0Package.MPD_INFORMATION_TYPE__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__KEYWORD_TEXT:
				return ((InternalEList<?>)getKeywordText()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__DOMAIN_TEXT:
				return ((InternalEList<?>)getDomainText()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__PURPOSE_TEXT:
				return ((InternalEList<?>)getPurposeText()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT:
				return ((InternalEList<?>)getExchangePatternText()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME:
				return ((InternalEList<?>)getExchangePartnerName()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP:
				return ((InternalEList<?>)getExtendedInformationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION:
				return ((InternalEList<?>)getExtendedInformation()).basicRemove(otherEnd, msgs);
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
			case _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE:
				return getAuthoritativeSource();
			case _0Package.MPD_INFORMATION_TYPE__CREATION_DATE:
				return getCreationDate();
			case _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE:
				return getLastRevisionDate();
			case _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT:
				return getStatusText();
			case _0Package.MPD_INFORMATION_TYPE__RELATIONSHIP:
				return getRelationship();
			case _0Package.MPD_INFORMATION_TYPE__KEYWORD_TEXT:
				return getKeywordText();
			case _0Package.MPD_INFORMATION_TYPE__DOMAIN_TEXT:
				return getDomainText();
			case _0Package.MPD_INFORMATION_TYPE__PURPOSE_TEXT:
				return getPurposeText();
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT:
				return getExchangePatternText();
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME:
				return getExchangePartnerName();
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP:
				if (coreType) return getExtendedInformationGroup();
				return ((FeatureMap.Internal)getExtendedInformationGroup()).getWrapper();
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION:
				return getExtendedInformation();
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
			case _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE:
				setAuthoritativeSource((EntityType)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE:
				setLastRevisionDate((Date)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT:
				setStatusText((gov.niem.release.niem.proxy.xsd._3._0.String)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends RelationshipType>)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__KEYWORD_TEXT:
				getKeywordText().clear();
				getKeywordText().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__DOMAIN_TEXT:
				getDomainText().clear();
				getDomainText().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__PURPOSE_TEXT:
				getPurposeText().clear();
				getPurposeText().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT:
				getExchangePatternText().clear();
				getExchangePatternText().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME:
				getExchangePartnerName().clear();
				getExchangePartnerName().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP:
				((FeatureMap.Internal)getExtendedInformationGroup()).set(newValue);
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
			case _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE:
				setAuthoritativeSource((EntityType)null);
				return;
			case _0Package.MPD_INFORMATION_TYPE__CREATION_DATE:
				setCreationDate((Date)null);
				return;
			case _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE:
				setLastRevisionDate((Date)null);
				return;
			case _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT:
				setStatusText((gov.niem.release.niem.proxy.xsd._3._0.String)null);
				return;
			case _0Package.MPD_INFORMATION_TYPE__RELATIONSHIP:
				getRelationship().clear();
				return;
			case _0Package.MPD_INFORMATION_TYPE__KEYWORD_TEXT:
				getKeywordText().clear();
				return;
			case _0Package.MPD_INFORMATION_TYPE__DOMAIN_TEXT:
				getDomainText().clear();
				return;
			case _0Package.MPD_INFORMATION_TYPE__PURPOSE_TEXT:
				getPurposeText().clear();
				return;
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT:
				getExchangePatternText().clear();
				return;
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME:
				getExchangePartnerName().clear();
				return;
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP:
				getExtendedInformationGroup().clear();
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
			case _0Package.MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE:
				return authoritativeSource != null;
			case _0Package.MPD_INFORMATION_TYPE__CREATION_DATE:
				return creationDate != null;
			case _0Package.MPD_INFORMATION_TYPE__LAST_REVISION_DATE:
				return lastRevisionDate != null;
			case _0Package.MPD_INFORMATION_TYPE__STATUS_TEXT:
				return statusText != null;
			case _0Package.MPD_INFORMATION_TYPE__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__KEYWORD_TEXT:
				return keywordText != null && !keywordText.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__DOMAIN_TEXT:
				return domainText != null && !domainText.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__PURPOSE_TEXT:
				return purposeText != null && !purposeText.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT:
				return exchangePatternText != null && !exchangePatternText.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME:
				return exchangePartnerName != null && !exchangePartnerName.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP:
				return extendedInformationGroup != null && !extendedInformationGroup.isEmpty();
			case _0Package.MPD_INFORMATION_TYPE__EXTENDED_INFORMATION:
				return !getExtendedInformation().isEmpty();
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
		result.append(" (extendedInformationGroup: ");
		result.append(extendedInformationGroup);
		result.append(')');
		return result.toString();
	}

} //MPDInformationTypeImpl
