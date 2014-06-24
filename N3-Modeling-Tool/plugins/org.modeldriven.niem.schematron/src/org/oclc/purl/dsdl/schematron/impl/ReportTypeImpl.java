/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import java.util.Collection;
import java.util.List;

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

import org.oclc.purl.dsdl.schematron.DirType;
import org.oclc.purl.dsdl.schematron.NameType;
import org.oclc.purl.dsdl.schematron.ReportType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.SpanType;
import org.oclc.purl.dsdl.schematron.ValueOfType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ReportTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportTypeImpl extends EObjectImpl implements ReportType {
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
	 * The default value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> DIAGNOSTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected List<String> diagnostics = DIAGNOSTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlag() <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected String flag = FLAG_EDEFAULT;

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
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected String test = TEST_EDEFAULT;

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
	protected ReportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.REPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SchematronPackage.REPORT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SchematronPackage.Literals.REPORT_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.REPORT_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.REPORT_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameType> getName() {
		return getGroup().list(SchematronPackage.Literals.REPORT_TYPE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueOfType> getValueOf() {
		return getGroup().list(SchematronPackage.Literals.REPORT_TYPE__VALUE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmph() {
		return getGroup().list(SchematronPackage.Literals.REPORT_TYPE__EMPH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirType> getDir() {
		return getGroup().list(SchematronPackage.Literals.REPORT_TYPE__DIR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(SchematronPackage.Literals.REPORT_TYPE__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getDiagnostics() {
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostics(List<String> newDiagnostics) {
		List<String> oldDiagnostics = diagnostics;
		diagnostics = newDiagnostics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__DIAGNOSTICS, oldDiagnostics, diagnostics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(String newFlag) {
		String oldFlag = flag;
		flag = newFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__FLAG, oldFlag, flag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__FPI, oldFpi, fpi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__SEE, oldSee, see));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.REPORT_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTest() {
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTest(String newTest) {
		String oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.REPORT_TYPE__TEST, oldTest, test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.REPORT_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.REPORT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__NAME:
				return ((InternalEList<?>)getName()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__VALUE_OF:
				return ((InternalEList<?>)getValueOf()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__DIR:
				return ((InternalEList<?>)getDir()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case SchematronPackage.REPORT_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.REPORT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SchematronPackage.REPORT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.REPORT_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.REPORT_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.REPORT_TYPE__NAME:
				return getName();
			case SchematronPackage.REPORT_TYPE__VALUE_OF:
				return getValueOf();
			case SchematronPackage.REPORT_TYPE__EMPH:
				return getEmph();
			case SchematronPackage.REPORT_TYPE__DIR:
				return getDir();
			case SchematronPackage.REPORT_TYPE__SPAN:
				return getSpan();
			case SchematronPackage.REPORT_TYPE__DIAGNOSTICS:
				return getDiagnostics();
			case SchematronPackage.REPORT_TYPE__FLAG:
				return getFlag();
			case SchematronPackage.REPORT_TYPE__FPI:
				return getFpi();
			case SchematronPackage.REPORT_TYPE__ICON:
				return getIcon();
			case SchematronPackage.REPORT_TYPE__ID:
				return getId();
			case SchematronPackage.REPORT_TYPE__LANG:
				return getLang();
			case SchematronPackage.REPORT_TYPE__ROLE:
				return getRole();
			case SchematronPackage.REPORT_TYPE__SEE:
				return getSee();
			case SchematronPackage.REPORT_TYPE__SPACE:
				return getSpace();
			case SchematronPackage.REPORT_TYPE__SUBJECT:
				return getSubject();
			case SchematronPackage.REPORT_TYPE__TEST:
				return getTest();
			case SchematronPackage.REPORT_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.REPORT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SchematronPackage.REPORT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.REPORT_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.REPORT_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.REPORT_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NameType>)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__VALUE_OF:
				getValueOf().clear();
				getValueOf().addAll((Collection<? extends ValueOfType>)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__EMPH:
				getEmph().clear();
				getEmph().addAll((Collection<? extends String>)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__DIR:
				getDir().clear();
				getDir().addAll((Collection<? extends DirType>)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__DIAGNOSTICS:
				setDiagnostics((List<String>)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__FLAG:
				setFlag((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__FPI:
				setFpi((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__ID:
				setId((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__LANG:
				setLang((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__SEE:
				setSee((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__SUBJECT:
				setSubject((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__TEST:
				setTest((String)newValue);
				return;
			case SchematronPackage.REPORT_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.REPORT_TYPE__MIXED:
				getMixed().clear();
				return;
			case SchematronPackage.REPORT_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.REPORT_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.REPORT_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.REPORT_TYPE__NAME:
				getName().clear();
				return;
			case SchematronPackage.REPORT_TYPE__VALUE_OF:
				getValueOf().clear();
				return;
			case SchematronPackage.REPORT_TYPE__EMPH:
				getEmph().clear();
				return;
			case SchematronPackage.REPORT_TYPE__DIR:
				getDir().clear();
				return;
			case SchematronPackage.REPORT_TYPE__SPAN:
				getSpan().clear();
				return;
			case SchematronPackage.REPORT_TYPE__DIAGNOSTICS:
				setDiagnostics(DIAGNOSTICS_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__FLAG:
				setFlag(FLAG_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__FPI:
				setFpi(FPI_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__SEE:
				setSee(SEE_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__SPACE:
				unsetSpace();
				return;
			case SchematronPackage.REPORT_TYPE__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__TEST:
				setTest(TEST_EDEFAULT);
				return;
			case SchematronPackage.REPORT_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.REPORT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SchematronPackage.REPORT_TYPE__GROUP:
				return !getGroup().isEmpty();
			case SchematronPackage.REPORT_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.REPORT_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.REPORT_TYPE__NAME:
				return !getName().isEmpty();
			case SchematronPackage.REPORT_TYPE__VALUE_OF:
				return !getValueOf().isEmpty();
			case SchematronPackage.REPORT_TYPE__EMPH:
				return !getEmph().isEmpty();
			case SchematronPackage.REPORT_TYPE__DIR:
				return !getDir().isEmpty();
			case SchematronPackage.REPORT_TYPE__SPAN:
				return !getSpan().isEmpty();
			case SchematronPackage.REPORT_TYPE__DIAGNOSTICS:
				return DIAGNOSTICS_EDEFAULT == null ? diagnostics != null : !DIAGNOSTICS_EDEFAULT.equals(diagnostics);
			case SchematronPackage.REPORT_TYPE__FLAG:
				return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
			case SchematronPackage.REPORT_TYPE__FPI:
				return FPI_EDEFAULT == null ? fpi != null : !FPI_EDEFAULT.equals(fpi);
			case SchematronPackage.REPORT_TYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case SchematronPackage.REPORT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SchematronPackage.REPORT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SchematronPackage.REPORT_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SchematronPackage.REPORT_TYPE__SEE:
				return SEE_EDEFAULT == null ? see != null : !SEE_EDEFAULT.equals(see);
			case SchematronPackage.REPORT_TYPE__SPACE:
				return isSetSpace();
			case SchematronPackage.REPORT_TYPE__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case SchematronPackage.REPORT_TYPE__TEST:
				return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
			case SchematronPackage.REPORT_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", diagnostics: ");
		result.append(diagnostics);
		result.append(", flag: ");
		result.append(flag);
		result.append(", fpi: ");
		result.append(fpi);
		result.append(", icon: ");
		result.append(icon);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", role: ");
		result.append(role);
		result.append(", see: ");
		result.append(see);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", subject: ");
		result.append(subject);
		result.append(", test: ");
		result.append(test);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ReportTypeImpl
