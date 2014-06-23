/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.impl.StringImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TextTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TextTypeImpl#isPartialIndicator <em>Partial Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.TextTypeImpl#isTruncationIndicator <em>Truncation Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextTypeImpl extends StringImpl implements TextType {
	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final Object LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected Object lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #isPartialIndicator() <em>Partial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartialIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIAL_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartialIndicator() <em>Partial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartialIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean partialIndicator = PARTIAL_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Partial Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean partialIndicatorESet;

	/**
	 * The default value of the '{@link #isTruncationIndicator() <em>Truncation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncationIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUNCATION_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTruncationIndicator() <em>Truncation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTruncationIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean truncationIndicator = TRUNCATION_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Truncation Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean truncationIndicatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(Object newLang) {
		Object oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.TEXT_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartialIndicator() {
		return partialIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartialIndicator(boolean newPartialIndicator) {
		boolean oldPartialIndicator = partialIndicator;
		partialIndicator = newPartialIndicator;
		boolean oldPartialIndicatorESet = partialIndicatorESet;
		partialIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.TEXT_TYPE__PARTIAL_INDICATOR, oldPartialIndicator, partialIndicator, !oldPartialIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartialIndicator() {
		boolean oldPartialIndicator = partialIndicator;
		boolean oldPartialIndicatorESet = partialIndicatorESet;
		partialIndicator = PARTIAL_INDICATOR_EDEFAULT;
		partialIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.TEXT_TYPE__PARTIAL_INDICATOR, oldPartialIndicator, PARTIAL_INDICATOR_EDEFAULT, oldPartialIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartialIndicator() {
		return partialIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTruncationIndicator() {
		return truncationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTruncationIndicator(boolean newTruncationIndicator) {
		boolean oldTruncationIndicator = truncationIndicator;
		truncationIndicator = newTruncationIndicator;
		boolean oldTruncationIndicatorESet = truncationIndicatorESet;
		truncationIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.TEXT_TYPE__TRUNCATION_INDICATOR, oldTruncationIndicator, truncationIndicator, !oldTruncationIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTruncationIndicator() {
		boolean oldTruncationIndicator = truncationIndicator;
		boolean oldTruncationIndicatorESet = truncationIndicatorESet;
		truncationIndicator = TRUNCATION_INDICATOR_EDEFAULT;
		truncationIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.TEXT_TYPE__TRUNCATION_INDICATOR, oldTruncationIndicator, TRUNCATION_INDICATOR_EDEFAULT, oldTruncationIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTruncationIndicator() {
		return truncationIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.TEXT_TYPE__LANG:
				return getLang();
			case _0Package.TEXT_TYPE__PARTIAL_INDICATOR:
				return isPartialIndicator();
			case _0Package.TEXT_TYPE__TRUNCATION_INDICATOR:
				return isTruncationIndicator();
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
			case _0Package.TEXT_TYPE__LANG:
				setLang(newValue);
				return;
			case _0Package.TEXT_TYPE__PARTIAL_INDICATOR:
				setPartialIndicator((Boolean)newValue);
				return;
			case _0Package.TEXT_TYPE__TRUNCATION_INDICATOR:
				setTruncationIndicator((Boolean)newValue);
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
			case _0Package.TEXT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case _0Package.TEXT_TYPE__PARTIAL_INDICATOR:
				unsetPartialIndicator();
				return;
			case _0Package.TEXT_TYPE__TRUNCATION_INDICATOR:
				unsetTruncationIndicator();
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
			case _0Package.TEXT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case _0Package.TEXT_TYPE__PARTIAL_INDICATOR:
				return isSetPartialIndicator();
			case _0Package.TEXT_TYPE__TRUNCATION_INDICATOR:
				return isSetTruncationIndicator();
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
		result.append(" (lang: ");
		result.append(lang);
		result.append(", partialIndicator: ");
		if (partialIndicatorESet) result.append(partialIndicator); else result.append("<unset>");
		result.append(", truncationIndicator: ");
		if (truncationIndicatorESet) result.append(truncationIndicator); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TextTypeImpl
