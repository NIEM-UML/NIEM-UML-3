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

import org.oclc.purl.dsdl.schematron.DiagnosticType;
import org.oclc.purl.dsdl.schematron.DirType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.SpanType;
import org.oclc.purl.dsdl.schematron.ValueOfType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DiagnosticTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticTypeImpl extends EObjectImpl implements DiagnosticType {
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
	protected DiagnosticTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.DIAGNOSTIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SchematronPackage.DIAGNOSTIC_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueOfType> getValueOf() {
		return getGroup().list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__VALUE_OF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmph() {
		return getGroup().list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__EMPH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirType> getDir() {
		return getGroup().list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__DIR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(SchematronPackage.Literals.DIAGNOSTIC_TYPE__SPAN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.DIAGNOSTIC_TYPE__FPI, oldFpi, fpi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.DIAGNOSTIC_TYPE__ICON, oldIcon, icon));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.DIAGNOSTIC_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.DIAGNOSTIC_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.DIAGNOSTIC_TYPE__SEE, oldSee, see));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.DIAGNOSTIC_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchematronPackage.DIAGNOSTIC_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.DIAGNOSTIC_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.DIAGNOSTIC_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__VALUE_OF:
				return ((InternalEList<?>)getValueOf()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__DIR:
				return ((InternalEList<?>)getDir()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.DIAGNOSTIC_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SchematronPackage.DIAGNOSTIC_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.DIAGNOSTIC_TYPE__VALUE_OF:
				return getValueOf();
			case SchematronPackage.DIAGNOSTIC_TYPE__EMPH:
				return getEmph();
			case SchematronPackage.DIAGNOSTIC_TYPE__DIR:
				return getDir();
			case SchematronPackage.DIAGNOSTIC_TYPE__SPAN:
				return getSpan();
			case SchematronPackage.DIAGNOSTIC_TYPE__FPI:
				return getFpi();
			case SchematronPackage.DIAGNOSTIC_TYPE__ICON:
				return getIcon();
			case SchematronPackage.DIAGNOSTIC_TYPE__ID:
				return getId();
			case SchematronPackage.DIAGNOSTIC_TYPE__LANG:
				return getLang();
			case SchematronPackage.DIAGNOSTIC_TYPE__SEE:
				return getSee();
			case SchematronPackage.DIAGNOSTIC_TYPE__SPACE:
				return getSpace();
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.DIAGNOSTIC_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__VALUE_OF:
				getValueOf().clear();
				getValueOf().addAll((Collection<? extends ValueOfType>)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__EMPH:
				getEmph().clear();
				getEmph().addAll((Collection<? extends String>)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__DIR:
				getDir().clear();
				getDir().addAll((Collection<? extends DirType>)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__FPI:
				setFpi((String)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ID:
				setId((String)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__LANG:
				setLang((String)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__SEE:
				setSee((String)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.DIAGNOSTIC_TYPE__MIXED:
				getMixed().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__VALUE_OF:
				getValueOf().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__EMPH:
				getEmph().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__DIR:
				getDir().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__SPAN:
				getSpan().clear();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__FPI:
				setFpi(FPI_EDEFAULT);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__SEE:
				setSee(SEE_EDEFAULT);
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__SPACE:
				unsetSpace();
				return;
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.DIAGNOSTIC_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__GROUP:
				return !getGroup().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__VALUE_OF:
				return !getValueOf().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__EMPH:
				return !getEmph().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__DIR:
				return !getDir().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__SPAN:
				return !getSpan().isEmpty();
			case SchematronPackage.DIAGNOSTIC_TYPE__FPI:
				return FPI_EDEFAULT == null ? fpi != null : !FPI_EDEFAULT.equals(fpi);
			case SchematronPackage.DIAGNOSTIC_TYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case SchematronPackage.DIAGNOSTIC_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SchematronPackage.DIAGNOSTIC_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case SchematronPackage.DIAGNOSTIC_TYPE__SEE:
				return SEE_EDEFAULT == null ? see != null : !SEE_EDEFAULT.equals(see);
			case SchematronPackage.DIAGNOSTIC_TYPE__SPACE:
				return isSetSpace();
			case SchematronPackage.DIAGNOSTIC_TYPE__ANY_ATTRIBUTE:
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
		result.append(", fpi: ");
		result.append(fpi);
		result.append(", icon: ");
		result.append(icon);
		result.append(", id: ");
		result.append(id);
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

} //DiagnosticTypeImpl
