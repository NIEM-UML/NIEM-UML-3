/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.oclc.purl.dsdl.schematron.DiagnosticsType;
import org.oclc.purl.dsdl.schematron.IncludeType;
import org.oclc.purl.dsdl.schematron.LetType;
import org.oclc.purl.dsdl.schematron.NsType;
import org.oclc.purl.dsdl.schematron.PType;
import org.oclc.purl.dsdl.schematron.PatternType;
import org.oclc.purl.dsdl.schematron.PhaseType;
import org.oclc.purl.dsdl.schematron.SchemaType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getDefaultPhase <em>Default Phase</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getQueryBinding <em>Query Binding</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SchemaTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaTypeImpl extends EObjectImpl implements SchemaType {
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
	 * The default value of the '{@link #getDefaultPhase() <em>Default Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPhase() <em>Default Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPhase()
	 * @generated
	 * @ordered
	 */
	protected String defaultPhase = DEFAULT_PHASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFpi() <em>Fpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpi()
	 * @generated
	 * @ordered
	 */
	protected static final String FPI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFpi() <em>Fpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpi()
	 * @generated
	 * @ordered
	 */
	protected String fpi = FPI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueryBinding() <em>Query Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryBinding() <em>Query Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryBinding()
	 * @generated
	 * @ordered
	 */
	protected String queryBinding = QUERY_BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected String schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSee() <em>See</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSee()
	 * @generated
	 * @ordered
	 */
	protected static final String SEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSee() <em>See</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSee()
	 * @generated
	 * @ordered
	 */
	protected String see = SEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.DEFAULT_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

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
	protected SchemaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.SCHEMA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SchematronPackage.SCHEMA_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.SCHEMA_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.SCHEMA_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__TITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NsType> getNs() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__NS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LetType> getLet() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__LET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhaseType> getPhase() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__PHASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatternType> getPattern() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__PATTERN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP1() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__P1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagnosticsType> getDiagnostics() {
		return getGroup().list(SchematronPackage.Literals.SCHEMA_TYPE__DIAGNOSTICS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultPhase() {
		return defaultPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPhase(String newDefaultPhase) {
		String oldDefaultPhase = defaultPhase;
		defaultPhase = newDefaultPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__DEFAULT_PHASE, oldDefaultPhase, defaultPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFpi() {
		return fpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFpi(String newFpi) {
		String oldFpi = fpi;
		fpi = newFpi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__FPI, oldFpi, fpi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryBinding() {
		return queryBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryBinding(String newQueryBinding) {
		String oldQueryBinding = queryBinding;
		queryBinding = newQueryBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__QUERY_BINDING, oldQueryBinding, queryBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(String newSchemaVersion) {
		String oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__SCHEMA_VERSION, oldSchemaVersion, schemaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSee() {
		return see;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSee(String newSee) {
		String oldSee = see;
		see = newSee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__SEE, oldSee, see));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SCHEMA_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.SCHEMA_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpace() {
		return spaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.SCHEMA_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.SCHEMA_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__NS:
				return ((InternalEList<?>)getNs()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__LET:
				return ((InternalEList<?>)getLet()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__PHASE:
				return ((InternalEList<?>)getPhase()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__PATTERN:
				return ((InternalEList<?>)getPattern()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__P1:
				return ((InternalEList<?>)getP1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__DIAGNOSTICS:
				return ((InternalEList<?>)getDiagnostics()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SCHEMA_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SCHEMA_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.SCHEMA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.SCHEMA_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.SCHEMA_TYPE__INCLUDE:
				return getInclude();
			case SchematronPackage.SCHEMA_TYPE__TITLE:
				return getTitle();
			case SchematronPackage.SCHEMA_TYPE__NS:
				return getNs();
			case SchematronPackage.SCHEMA_TYPE__P:
				return getP();
			case SchematronPackage.SCHEMA_TYPE__LET:
				return getLet();
			case SchematronPackage.SCHEMA_TYPE__PHASE:
				return getPhase();
			case SchematronPackage.SCHEMA_TYPE__PATTERN:
				return getPattern();
			case SchematronPackage.SCHEMA_TYPE__P1:
				return getP1();
			case SchematronPackage.SCHEMA_TYPE__DIAGNOSTICS:
				return getDiagnostics();
			case SchematronPackage.SCHEMA_TYPE__DEFAULT_PHASE:
				return getDefaultPhase();
			case SchematronPackage.SCHEMA_TYPE__FPI:
				return getFpi();
			case SchematronPackage.SCHEMA_TYPE__ICON:
				return getIcon();
			case SchematronPackage.SCHEMA_TYPE__ID:
				return getId();
			case SchematronPackage.SCHEMA_TYPE__LANG:
				return getLang();
			case SchematronPackage.SCHEMA_TYPE__QUERY_BINDING:
				return getQueryBinding();
			case SchematronPackage.SCHEMA_TYPE__SCHEMA_VERSION:
				return getSchemaVersion();
			case SchematronPackage.SCHEMA_TYPE__SEE:
				return getSee();
			case SchematronPackage.SCHEMA_TYPE__SPACE:
				return getSpace();
			case SchematronPackage.SCHEMA_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SCHEMA_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__NS:
				getNs().clear();
				getNs().addAll((Collection<? extends NsType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__LET:
				getLet().clear();
				getLet().addAll((Collection<? extends LetType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__PHASE:
				getPhase().clear();
				getPhase().addAll((Collection<? extends PhaseType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__PATTERN:
				getPattern().clear();
				getPattern().addAll((Collection<? extends PatternType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__P1:
				getP1().clear();
				getP1().addAll((Collection<? extends PType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__DIAGNOSTICS:
				getDiagnostics().clear();
				getDiagnostics().addAll((Collection<? extends DiagnosticsType>)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__DEFAULT_PHASE:
				setDefaultPhase((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__FPI:
				setFpi((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__ID:
				setId((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__LANG:
				setLang((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__QUERY_BINDING:
				setQueryBinding((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__SCHEMA_VERSION:
				setSchemaVersion((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__SEE:
				setSee((String)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case SchematronPackage.SCHEMA_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SCHEMA_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__TITLE:
				getTitle().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__NS:
				getNs().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__P:
				getP().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__LET:
				getLet().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__PHASE:
				getPhase().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__PATTERN:
				getPattern().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__P1:
				getP1().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__DIAGNOSTICS:
				getDiagnostics().clear();
				return;
			case SchematronPackage.SCHEMA_TYPE__DEFAULT_PHASE:
				setDefaultPhase(DEFAULT_PHASE_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__FPI:
				setFpi(FPI_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__QUERY_BINDING:
				setQueryBinding(QUERY_BINDING_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__SCHEMA_VERSION:
				setSchemaVersion(SCHEMA_VERSION_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__SEE:
				setSee(SEE_EDEFAULT);
				return;
			case SchematronPackage.SCHEMA_TYPE__SPACE:
				unsetSpace();
				return;
			case SchematronPackage.SCHEMA_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SCHEMA_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SchematronPackage.SCHEMA_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__TITLE:
				return !getTitle().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__NS:
				return !getNs().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__P:
				return !getP().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__LET:
				return !getLet().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__PHASE:
				return !getPhase().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__PATTERN:
				return !getPattern().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__P1:
				return !getP1().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__DIAGNOSTICS:
				return !getDiagnostics().isEmpty();
			case SchematronPackage.SCHEMA_TYPE__DEFAULT_PHASE:
				return DEFAULT_PHASE_EDEFAULT == null ? defaultPhase != null : !DEFAULT_PHASE_EDEFAULT.equals(defaultPhase);
			case SchematronPackage.SCHEMA_TYPE__FPI:
				return FPI_EDEFAULT == null ? fpi != null : !FPI_EDEFAULT.equals(fpi);
			case SchematronPackage.SCHEMA_TYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case SchematronPackage.SCHEMA_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SchematronPackage.SCHEMA_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SchematronPackage.SCHEMA_TYPE__QUERY_BINDING:
				return QUERY_BINDING_EDEFAULT == null ? queryBinding != null : !QUERY_BINDING_EDEFAULT.equals(queryBinding);
			case SchematronPackage.SCHEMA_TYPE__SCHEMA_VERSION:
				return SCHEMA_VERSION_EDEFAULT == null ? schemaVersion != null : !SCHEMA_VERSION_EDEFAULT.equals(schemaVersion);
			case SchematronPackage.SCHEMA_TYPE__SEE:
				return SEE_EDEFAULT == null ? see != null : !SEE_EDEFAULT.equals(see);
			case SchematronPackage.SCHEMA_TYPE__SPACE:
				return isSetSpace();
			case SchematronPackage.SCHEMA_TYPE__ANY_ATTRIBUTE:
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
		result.append(", defaultPhase: ");
		result.append(defaultPhase);
		result.append(", fpi: ");
		result.append(fpi);
		result.append(", icon: ");
		result.append(icon);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", queryBinding: ");
		result.append(queryBinding);
		result.append(", schemaVersion: ");
		result.append(schemaVersion);
		result.append(", see: ");
		result.append(see);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SchemaTypeImpl
