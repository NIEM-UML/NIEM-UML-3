/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.QuantityType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.QuantityTypeImpl#getQuantityUnitText <em>Quantity Unit Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantityTypeImpl extends NumericTypeImpl implements QuantityType {
	/**
	 * The default value of the '{@link #getQuantityUnitText() <em>Quantity Unit Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUnitText()
	 * @generated
	 * @ordered
	 */
	protected static final String QUANTITY_UNIT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityUnitText() <em>Quantity Unit Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUnitText()
	 * @generated
	 * @ordered
	 */
	protected String quantityUnitText = QUANTITY_UNIT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getQuantityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuantityUnitText() {
		return quantityUnitText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityUnitText(String newQuantityUnitText) {
		String oldQuantityUnitText = quantityUnitText;
		quantityUnitText = newQuantityUnitText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.QUANTITY_TYPE__QUANTITY_UNIT_TEXT, oldQuantityUnitText, quantityUnitText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.QUANTITY_TYPE__QUANTITY_UNIT_TEXT:
				return getQuantityUnitText();
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
			case _0Package.QUANTITY_TYPE__QUANTITY_UNIT_TEXT:
				setQuantityUnitText((String)newValue);
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
			case _0Package.QUANTITY_TYPE__QUANTITY_UNIT_TEXT:
				setQuantityUnitText(QUANTITY_UNIT_TEXT_EDEFAULT);
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
			case _0Package.QUANTITY_TYPE__QUANTITY_UNIT_TEXT:
				return QUANTITY_UNIT_TEXT_EDEFAULT == null ? quantityUnitText != null : !QUANTITY_UNIT_TEXT_EDEFAULT.equals(quantityUnitText);
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
		result.append(" (quantityUnitText: ");
		result.append(quantityUnitText);
		result.append(')');
		return result.toString();
	}

} //QuantityTypeImpl
