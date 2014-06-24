/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.SpanType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl#getForeignElement <em>Foreign Element</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.SpanTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanTypeImpl extends EObjectImpl implements SpanType {
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
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

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
	protected SpanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.SPAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SchematronPackage.SPAN_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getForeignElement() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(SchematronPackage.Literals.SPAN_TYPE__FOREIGN_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		return (FeatureMap)getForeignElement().<FeatureMap.Entry>list(SchematronPackage.Literals.SPAN_TYPE__ANY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny1() {
		return (FeatureMap)getForeignElement().<FeatureMap.Entry>list(SchematronPackage.Literals.SPAN_TYPE__ANY1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchematronPackage.SPAN_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, SchematronPackage.SPAN_TYPE__ANY_ATTRIBUTE);
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
			case SchematronPackage.SPAN_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SPAN_TYPE__FOREIGN_ELEMENT:
				return ((InternalEList<?>)getForeignElement()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SPAN_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SPAN_TYPE__ANY1:
				return ((InternalEList<?>)getAny1()).basicRemove(otherEnd, msgs);
			case SchematronPackage.SPAN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SPAN_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SchematronPackage.SPAN_TYPE__FOREIGN_ELEMENT:
				if (coreType) return getForeignElement();
				return ((FeatureMap.Internal)getForeignElement()).getWrapper();
			case SchematronPackage.SPAN_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case SchematronPackage.SPAN_TYPE__ANY1:
				if (coreType) return getAny1();
				return ((FeatureMap.Internal)getAny1()).getWrapper();
			case SchematronPackage.SPAN_TYPE__CLASS:
				return getClass_();
			case SchematronPackage.SPAN_TYPE__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchematronPackage.SPAN_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SchematronPackage.SPAN_TYPE__FOREIGN_ELEMENT:
				((FeatureMap.Internal)getForeignElement()).set(newValue);
				return;
			case SchematronPackage.SPAN_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case SchematronPackage.SPAN_TYPE__ANY1:
				((FeatureMap.Internal)getAny1()).set(newValue);
				return;
			case SchematronPackage.SPAN_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case SchematronPackage.SPAN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SPAN_TYPE__MIXED:
				getMixed().clear();
				return;
			case SchematronPackage.SPAN_TYPE__FOREIGN_ELEMENT:
				getForeignElement().clear();
				return;
			case SchematronPackage.SPAN_TYPE__ANY:
				getAny().clear();
				return;
			case SchematronPackage.SPAN_TYPE__ANY1:
				getAny1().clear();
				return;
			case SchematronPackage.SPAN_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case SchematronPackage.SPAN_TYPE__ANY_ATTRIBUTE:
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
			case SchematronPackage.SPAN_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SchematronPackage.SPAN_TYPE__FOREIGN_ELEMENT:
				return !getForeignElement().isEmpty();
			case SchematronPackage.SPAN_TYPE__ANY:
				return !getAny().isEmpty();
			case SchematronPackage.SPAN_TYPE__ANY1:
				return !getAny1().isEmpty();
			case SchematronPackage.SPAN_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case SchematronPackage.SPAN_TYPE__ANY_ATTRIBUTE:
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
		result.append(", class: ");
		result.append(class_);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SpanTypeImpl
