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

import org.oclc.purl.dsdl.schematron.AbstractType;
import org.oclc.purl.dsdl.schematron.IncludeType;
import org.oclc.purl.dsdl.schematron.LetType;
import org.oclc.purl.dsdl.schematron.PType;
import org.oclc.purl.dsdl.schematron.ParamType;
import org.oclc.purl.dsdl.schematron.PatternType;
import org.oclc.purl.dsdl.schematron.RuleType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getLet1 <em>Let1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getTitle2 <em>Title2</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getP2 <em>P2</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getIsA <em>Is A</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.PatternTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternTypeImpl extends EObjectImpl implements PatternType {
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
	protected static final AbstractType ABSTRACT_EDEFAULT = AbstractType.TRUE;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected AbstractType abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

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
	 * The default value of the '{@link #getIsA() <em>Is A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsA()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsA() <em>Is A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsA()
	 * @generated
	 * @ordered
	 */
	protected String isA = IS_A_EDEFAULT;

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
	protected PatternTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.PATTERN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SchematronPackage.PATTERN_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.PATTERN_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.PATTERN_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludeType> getInclude() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__INCLUDE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__TITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LetType> getLet() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__LET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleType> getRule() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle1() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__TITLE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP1() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__P1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LetType> getLet1() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__LET1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleType> getRule1() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__RULE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TitleType> getTitle2() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__TITLE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP2() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__P2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getParam() {
		return getGroup().list(SchematronPackage.Literals.PATTERN_TYPE__PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractType newAbstract) {
		AbstractType oldAbstract = abstract_;
		abstract_ = newAbstract == null ? ABSTRACT_EDEFAULT : newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		AbstractType oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.PATTERN_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__FPI, oldFpi, fpi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsA() {
		return isA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsA(String newIsA) {
		String oldIsA = isA;
		isA = newIsA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__IS_A, oldIsA, isA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__SEE, oldSee, see));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.PATTERN_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.PATTERN_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.PATTERN_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.PATTERN_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__TITLE:
				return ((InternalEList<?>)getTitle()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__LET:
				return ((InternalEList<?>)getLet()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__TITLE1:
				return ((InternalEList<?>)getTitle1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__P1:
				return ((InternalEList<?>)getP1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__LET1:
				return ((InternalEList<?>)getLet1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__RULE1:
				return ((InternalEList<?>)getRule1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__TITLE2:
				return ((InternalEList<?>)getTitle2()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__P2:
				return ((InternalEList<?>)getP2()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case SchematronPackage.PATTERN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.PATTERN_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.PATTERN_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.PATTERN_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.PATTERN_TYPE__INCLUDE:
				return getInclude();
			case SchematronPackage.PATTERN_TYPE__TITLE:
				return getTitle();
			case SchematronPackage.PATTERN_TYPE__P:
				return getP();
			case SchematronPackage.PATTERN_TYPE__LET:
				return getLet();
			case SchematronPackage.PATTERN_TYPE__RULE:
				return getRule();
			case SchematronPackage.PATTERN_TYPE__TITLE1:
				return getTitle1();
			case SchematronPackage.PATTERN_TYPE__P1:
				return getP1();
			case SchematronPackage.PATTERN_TYPE__LET1:
				return getLet1();
			case SchematronPackage.PATTERN_TYPE__RULE1:
				return getRule1();
			case SchematronPackage.PATTERN_TYPE__TITLE2:
				return getTitle2();
			case SchematronPackage.PATTERN_TYPE__P2:
				return getP2();
			case SchematronPackage.PATTERN_TYPE__PARAM:
				return getParam();
			case SchematronPackage.PATTERN_TYPE__ABSTRACT:
				return getAbstract();
			case SchematronPackage.PATTERN_TYPE__FPI:
				return getFpi();
			case SchematronPackage.PATTERN_TYPE__ICON:
				return getIcon();
			case SchematronPackage.PATTERN_TYPE__ID:
				return getId();
			case SchematronPackage.PATTERN_TYPE__IS_A:
				return getIsA();
			case SchematronPackage.PATTERN_TYPE__LANG:
				return getLang();
			case SchematronPackage.PATTERN_TYPE__SEE:
				return getSee();
			case SchematronPackage.PATTERN_TYPE__SPACE:
				return getSpace();
			case SchematronPackage.PATTERN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.PATTERN_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends IncludeType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends TitleType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__LET:
				getLet().clear();
				getLet().addAll((Collection<? extends LetType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends RuleType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__TITLE1:
				getTitle1().clear();
				getTitle1().addAll((Collection<? extends TitleType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__P1:
				getP1().clear();
				getP1().addAll((Collection<? extends PType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__LET1:
				getLet1().clear();
				getLet1().addAll((Collection<? extends LetType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__RULE1:
				getRule1().clear();
				getRule1().addAll((Collection<? extends RuleType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__TITLE2:
				getTitle2().clear();
				getTitle2().addAll((Collection<? extends TitleType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__P2:
				getP2().clear();
				getP2().addAll((Collection<? extends PType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends ParamType>)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__FPI:
				setFpi((String)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__ID:
				setId((String)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__IS_A:
				setIsA((String)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__LANG:
				setLang((String)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__SEE:
				setSee((String)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case SchematronPackage.PATTERN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.PATTERN_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__INCLUDE:
				getInclude().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__TITLE:
				getTitle().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__P:
				getP().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__LET:
				getLet().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__RULE:
				getRule().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__TITLE1:
				getTitle1().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__P1:
				getP1().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__LET1:
				getLet1().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__RULE1:
				getRule1().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__TITLE2:
				getTitle2().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__P2:
				getP2().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__PARAM:
				getParam().clear();
				return;
			case SchematronPackage.PATTERN_TYPE__ABSTRACT:
				unsetAbstract();
				return;
			case SchematronPackage.PATTERN_TYPE__FPI:
				setFpi(FPI_EDEFAULT);
				return;
			case SchematronPackage.PATTERN_TYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case SchematronPackage.PATTERN_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SchematronPackage.PATTERN_TYPE__IS_A:
				setIsA(IS_A_EDEFAULT);
				return;
			case SchematronPackage.PATTERN_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SchematronPackage.PATTERN_TYPE__SEE:
				setSee(SEE_EDEFAULT);
				return;
			case SchematronPackage.PATTERN_TYPE__SPACE:
				unsetSpace();
				return;
			case SchematronPackage.PATTERN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.PATTERN_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SchematronPackage.PATTERN_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.PATTERN_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.PATTERN_TYPE__INCLUDE:
				return !getInclude().isEmpty();
			case SchematronPackage.PATTERN_TYPE__TITLE:
				return !getTitle().isEmpty();
			case SchematronPackage.PATTERN_TYPE__P:
				return !getP().isEmpty();
			case SchematronPackage.PATTERN_TYPE__LET:
				return !getLet().isEmpty();
			case SchematronPackage.PATTERN_TYPE__RULE:
				return !getRule().isEmpty();
			case SchematronPackage.PATTERN_TYPE__TITLE1:
				return !getTitle1().isEmpty();
			case SchematronPackage.PATTERN_TYPE__P1:
				return !getP1().isEmpty();
			case SchematronPackage.PATTERN_TYPE__LET1:
				return !getLet1().isEmpty();
			case SchematronPackage.PATTERN_TYPE__RULE1:
				return !getRule1().isEmpty();
			case SchematronPackage.PATTERN_TYPE__TITLE2:
				return !getTitle2().isEmpty();
			case SchematronPackage.PATTERN_TYPE__P2:
				return !getP2().isEmpty();
			case SchematronPackage.PATTERN_TYPE__PARAM:
				return !getParam().isEmpty();
			case SchematronPackage.PATTERN_TYPE__ABSTRACT:
				return isSetAbstract();
			case SchematronPackage.PATTERN_TYPE__FPI:
				return FPI_EDEFAULT == null ? fpi != null : !FPI_EDEFAULT.equals(fpi);
			case SchematronPackage.PATTERN_TYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case SchematronPackage.PATTERN_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SchematronPackage.PATTERN_TYPE__IS_A:
				return IS_A_EDEFAULT == null ? isA != null : !IS_A_EDEFAULT.equals(isA);
			case SchematronPackage.PATTERN_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SchematronPackage.PATTERN_TYPE__SEE:
				return SEE_EDEFAULT == null ? see != null : !SEE_EDEFAULT.equals(see);
			case SchematronPackage.PATTERN_TYPE__SPACE:
				return isSetSpace();
			case SchematronPackage.PATTERN_TYPE__ANY_ATTRIBUTE:
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
		result.append(", fpi: ");
		result.append(fpi);
		result.append(", icon: ");
		result.append(icon);
		result.append(", id: ");
		result.append(id);
		result.append(", isA: ");
		result.append(isA);
		result.append(", lang: ");
		result.append(lang);
		result.append(", see: ");
		result.append(see);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //PatternTypeImpl
