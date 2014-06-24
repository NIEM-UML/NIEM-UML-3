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

import org.oclc.purl.dsdl.schematron.ActiveType;
import org.oclc.purl.dsdl.schematron.DirType;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.SpanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.ActiveTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActiveTypeImpl extends EObjectImpl implements ActiveType {
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
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

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
	protected ActiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.ACTIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SchematronPackage.ACTIVE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SchematronPackage.Literals.ACTIVE_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.ACTIVE_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(SchematronPackage.Literals.ACTIVE_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirType> getDir() {
		return getGroup().list(SchematronPackage.Literals.ACTIVE_TYPE__DIR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEmph() {
		return getGroup().list(SchematronPackage.Literals.ACTIVE_TYPE__EMPH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(SchematronPackage.Literals.ACTIVE_TYPE__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.ACTIVE_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.ACTIVE_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.ACTIVE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SchematronPackage.ACTIVE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SchematronPackage.ACTIVE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.ACTIVE_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.ACTIVE_TYPE__DIR:
				return ((InternalEList<?>)getDir()).basicRemove(otherEnd, msgs);
			case SchematronPackage.ACTIVE_TYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case SchematronPackage.ACTIVE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.ACTIVE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SchematronPackage.ACTIVE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SchematronPackage.ACTIVE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.ACTIVE_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.ACTIVE_TYPE__DIR:
				return getDir();
			case SchematronPackage.ACTIVE_TYPE__EMPH:
				return getEmph();
			case SchematronPackage.ACTIVE_TYPE__SPAN:
				return getSpan();
			case SchematronPackage.ACTIVE_TYPE__PATTERN:
				return getPattern();
			case SchematronPackage.ACTIVE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.ACTIVE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__DIR:
				getDir().clear();
				getDir().addAll((Collection<? extends DirType>)newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__EMPH:
				getEmph().clear();
				getEmph().addAll((Collection<? extends String>)newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case SchematronPackage.ACTIVE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.ACTIVE_TYPE__MIXED:
				getMixed().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__GROUP:
				getGroup().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__DIR:
				getDir().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__EMPH:
				getEmph().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__SPAN:
				getSpan().clear();
				return;
			case SchematronPackage.ACTIVE_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case SchematronPackage.ACTIVE_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.ACTIVE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SchematronPackage.ACTIVE_TYPE__GROUP:
				return !getGroup().isEmpty();
			case SchematronPackage.ACTIVE_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.ACTIVE_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.ACTIVE_TYPE__DIR:
				return !getDir().isEmpty();
			case SchematronPackage.ACTIVE_TYPE__EMPH:
				return !getEmph().isEmpty();
			case SchematronPackage.ACTIVE_TYPE__SPAN:
				return !getSpan().isEmpty();
			case SchematronPackage.ACTIVE_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case SchematronPackage.ACTIVE_TYPE__ANY_ATTRIBUTE:
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
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ActiveTypeImpl
