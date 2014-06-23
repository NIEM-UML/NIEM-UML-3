/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.NumericType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.impl.DecimalImpl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NumericTypeImpl#getConfidenceNumeric <em>Confidence Numeric</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.NumericTypeImpl#getToleranceNumeric <em>Tolerance Numeric</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericTypeImpl extends DecimalImpl implements NumericType {
	/**
	 * The default value of the '{@link #getConfidenceNumeric() <em>Confidence Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceNumeric()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CONFIDENCE_NUMERIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfidenceNumeric() <em>Confidence Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidenceNumeric()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal confidenceNumeric = CONFIDENCE_NUMERIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getToleranceNumeric() <em>Tolerance Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceNumeric()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOLERANCE_NUMERIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToleranceNumeric() <em>Tolerance Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToleranceNumeric()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal toleranceNumeric = TOLERANCE_NUMERIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getNumericType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getConfidenceNumeric() {
		return confidenceNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfidenceNumeric(BigDecimal newConfidenceNumeric) {
		BigDecimal oldConfidenceNumeric = confidenceNumeric;
		confidenceNumeric = newConfidenceNumeric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NUMERIC_TYPE__CONFIDENCE_NUMERIC, oldConfidenceNumeric, confidenceNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getToleranceNumeric() {
		return toleranceNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToleranceNumeric(BigDecimal newToleranceNumeric) {
		BigDecimal oldToleranceNumeric = toleranceNumeric;
		toleranceNumeric = newToleranceNumeric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.NUMERIC_TYPE__TOLERANCE_NUMERIC, oldToleranceNumeric, toleranceNumeric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.NUMERIC_TYPE__CONFIDENCE_NUMERIC:
				return getConfidenceNumeric();
			case _0Package.NUMERIC_TYPE__TOLERANCE_NUMERIC:
				return getToleranceNumeric();
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
			case _0Package.NUMERIC_TYPE__CONFIDENCE_NUMERIC:
				setConfidenceNumeric((BigDecimal)newValue);
				return;
			case _0Package.NUMERIC_TYPE__TOLERANCE_NUMERIC:
				setToleranceNumeric((BigDecimal)newValue);
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
			case _0Package.NUMERIC_TYPE__CONFIDENCE_NUMERIC:
				setConfidenceNumeric(CONFIDENCE_NUMERIC_EDEFAULT);
				return;
			case _0Package.NUMERIC_TYPE__TOLERANCE_NUMERIC:
				setToleranceNumeric(TOLERANCE_NUMERIC_EDEFAULT);
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
			case _0Package.NUMERIC_TYPE__CONFIDENCE_NUMERIC:
				return CONFIDENCE_NUMERIC_EDEFAULT == null ? confidenceNumeric != null : !CONFIDENCE_NUMERIC_EDEFAULT.equals(confidenceNumeric);
			case _0Package.NUMERIC_TYPE__TOLERANCE_NUMERIC:
				return TOLERANCE_NUMERIC_EDEFAULT == null ? toleranceNumeric != null : !TOLERANCE_NUMERIC_EDEFAULT.equals(toleranceNumeric);
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
		result.append(" (confidenceNumeric: ");
		result.append(confidenceNumeric);
		result.append(", toleranceNumeric: ");
		result.append(toleranceNumeric);
		result.append(')');
		return result.toString();
	}

} //NumericTypeImpl
