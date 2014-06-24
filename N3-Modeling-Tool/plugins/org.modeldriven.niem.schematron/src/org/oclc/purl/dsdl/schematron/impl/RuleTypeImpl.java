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

import org.oclc.purl.dsdl.schematron.AbstractType1;
import org.oclc.purl.dsdl.schematron.AssertType;
import org.oclc.purl.dsdl.schematron.ExtendsType;
import org.oclc.purl.dsdl.schematron.IncludeType;
import org.oclc.purl.dsdl.schematron.LetType;
import org.oclc.purl.dsdl.schematron.ReportType;
import org.oclc.purl.dsdl.schematron.RuleType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getLet1 <em>Let1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getAssert1 <em>Assert1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getReport1 <em>Report1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getExtends1 <em>Extends1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.RuleTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleTypeImpl extends EObjectImpl implements RuleType {
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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final AbstractType1 ABSTRACT_EDEFAULT = AbstractType1.TRUE;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected AbstractType1 abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

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
	protected RuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.RULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SchematronPackage.RULE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.RULE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.RULE_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LetType> getLet() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__LET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertType> getAssert() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__ASSERT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportType> getReport() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__REPORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendsType> getExtends() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__EXTENDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LetType> getLet1() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__LET1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertType> getAssert1() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__ASSERT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportType> getReport1() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__REPORT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendsType> getExtends1() {
		return getGroup().list(SchematronPackage.Literals.RULE_TYPE__EXTENDS1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType1 getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractType1 newAbstract) {
		AbstractType1 oldAbstract = abstract_;
		abstract_ = newAbstract == null ? ABSTRACT_EDEFAULT : newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		AbstractType1 oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.RULE_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__FLAG, oldFlag, flag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__FPI, oldFpi, fpi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__SEE, oldSee, see));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.RULE_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.RULE_TYPE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.RULE_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.RULE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__LET:
				return ((InternalEList<?>)getLet()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__ASSERT:
				return ((InternalEList<?>)getAssert()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__REPORT:
				return ((InternalEList<?>)getReport()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__LET1:
				return ((InternalEList<?>)getLet1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__ASSERT1:
				return ((InternalEList<?>)getAssert1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__REPORT1:
				return ((InternalEList<?>)getReport1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__EXTENDS1:
				return ((InternalEList<?>)getExtends1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.RULE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.RULE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.RULE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.RULE_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.RULE_TYPE__INCLUDE:
				return getInclude();
			case SchematronPackage.RULE_TYPE__LET:
				return getLet();
			case SchematronPackage.RULE_TYPE__ASSERT:
				return getAssert();
			case SchematronPackage.RULE_TYPE__REPORT:
				return getReport();
			case SchematronPackage.RULE_TYPE__EXTENDS:
				return getExtends();
			case SchematronPackage.RULE_TYPE__LET1:
				return getLet1();
			case SchematronPackage.RULE_TYPE__ASSERT1:
				return getAssert1();
			case SchematronPackage.RULE_TYPE__REPORT1:
				return getReport1();
			case SchematronPackage.RULE_TYPE__EXTENDS1:
				return getExtends1();
			case SchematronPackage.RULE_TYPE__ABSTRACT:
				return getAbstract();
			case SchematronPackage.RULE_TYPE__CONTEXT:
				return getContext();
			case SchematronPackage.RULE_TYPE__FLAG:
				return getFlag();
			case SchematronPackage.RULE_TYPE__FPI:
				return getFpi();
			case SchematronPackage.RULE_TYPE__ICON:
				return getIcon();
			case SchematronPackage.RULE_TYPE__ID:
				return getId();
			case SchematronPackage.RULE_TYPE__LANG:
				return getLang();
			case SchematronPackage.RULE_TYPE__ROLE:
				return getRole();
			case SchematronPackage.RULE_TYPE__SEE:
				return getSee();
			case SchematronPackage.RULE_TYPE__SPACE:
				return getSpace();
			case SchematronPackage.RULE_TYPE__SUBJECT:
				return getSubject();
			case SchematronPackage.RULE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.RULE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.RULE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.RULE_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.RULE_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__LET:
				getLet().clear();
				getLet().addAll((Collection<? extends LetType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ASSERT:
				getAssert().clear();
				getAssert().addAll((Collection<? extends AssertType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__REPORT:
				getReport().clear();
				getReport().addAll((Collection<? extends ReportType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends ExtendsType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__LET1:
				getLet1().clear();
				getLet1().addAll((Collection<? extends LetType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ASSERT1:
				getAssert1().clear();
				getAssert1().addAll((Collection<? extends AssertType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__REPORT1:
				getReport1().clear();
				getReport1().addAll((Collection<? extends ReportType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__EXTENDS1:
				getExtends1().clear();
				getExtends1().addAll((Collection<? extends ExtendsType>)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ABSTRACT:
				setAbstract((AbstractType1)newValue);
				return;
			case SchematronPackage.RULE_TYPE__CONTEXT:
				setContext((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__FLAG:
				setFlag((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__FPI:
				setFpi((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ID:
				setId((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__LANG:
				setLang((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ROLE:
				setRole((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__SEE:
				setSee((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case SchematronPackage.RULE_TYPE__SUBJECT:
				setSubject((String)newValue);
				return;
			case SchematronPackage.RULE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.RULE_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.RULE_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.RULE_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.RULE_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case SchematronPackage.RULE_TYPE__LET:
				getLet().clear();
				return;
			case SchematronPackage.RULE_TYPE__ASSERT:
				getAssert().clear();
				return;
			case SchematronPackage.RULE_TYPE__REPORT:
				getReport().clear();
				return;
			case SchematronPackage.RULE_TYPE__EXTENDS:
				getExtends().clear();
				return;
			case SchematronPackage.RULE_TYPE__LET1:
				getLet1().clear();
				return;
			case SchematronPackage.RULE_TYPE__ASSERT1:
				getAssert1().clear();
				return;
			case SchematronPackage.RULE_TYPE__REPORT1:
				getReport1().clear();
				return;
			case SchematronPackage.RULE_TYPE__EXTENDS1:
				getExtends1().clear();
				return;
			case SchematronPackage.RULE_TYPE__ABSTRACT:
				unsetAbstract();
				return;
			case SchematronPackage.RULE_TYPE__CONTEXT:
				setContext(CONTEXT_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__FLAG:
				setFlag(FLAG_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__FPI:
				setFpi(FPI_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__SEE:
				setSee(SEE_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__SPACE:
				unsetSpace();
				return;
			case SchematronPackage.RULE_TYPE__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case SchematronPackage.RULE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.RULE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SchematronPackage.RULE_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.RULE_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.RULE_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case SchematronPackage.RULE_TYPE__LET:
				return !getLet().isEmpty();
			case SchematronPackage.RULE_TYPE__ASSERT:
				return !getAssert().isEmpty();
			case SchematronPackage.RULE_TYPE__REPORT:
				return !getReport().isEmpty();
			case SchematronPackage.RULE_TYPE__EXTENDS:
				return !getExtends().isEmpty();
			case SchematronPackage.RULE_TYPE__LET1:
				return !getLet1().isEmpty();
			case SchematronPackage.RULE_TYPE__ASSERT1:
				return !getAssert1().isEmpty();
			case SchematronPackage.RULE_TYPE__REPORT1:
				return !getReport1().isEmpty();
			case SchematronPackage.RULE_TYPE__EXTENDS1:
				return !getExtends1().isEmpty();
			case SchematronPackage.RULE_TYPE__ABSTRACT:
				return isSetAbstract();
			case SchematronPackage.RULE_TYPE__CONTEXT:
				return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
			case SchematronPackage.RULE_TYPE__FLAG:
				return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
			case SchematronPackage.RULE_TYPE__FPI:
				return FPI_EDEFAULT == null ? fpi != null : !FPI_EDEFAULT.equals(fpi);
			case SchematronPackage.RULE_TYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case SchematronPackage.RULE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SchematronPackage.RULE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SchematronPackage.RULE_TYPE__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case SchematronPackage.RULE_TYPE__SEE:
				return SEE_EDEFAULT == null ? see != null : !SEE_EDEFAULT.equals(see);
			case SchematronPackage.RULE_TYPE__SPACE:
				return isSetSpace();
			case SchematronPackage.RULE_TYPE__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case SchematronPackage.RULE_TYPE__ANY_ATTRIBUTE:
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
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", context: ");
		result.append(context);
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
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //RuleTypeImpl
