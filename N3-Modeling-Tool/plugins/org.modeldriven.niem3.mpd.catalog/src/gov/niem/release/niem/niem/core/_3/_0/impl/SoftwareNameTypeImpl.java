/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.SoftwareNameType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SoftwareNameTypeImpl#getSoftwareVersionText <em>Software Version Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareNameTypeImpl extends TextTypeImpl implements SoftwareNameType {
	/**
	 * The default value of the '{@link #getSoftwareVersionText() <em>Software Version Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersionText()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_VERSION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareVersionText() <em>Software Version Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersionText()
	 * @generated
	 * @ordered
	 */
	protected String softwareVersionText = SOFTWARE_VERSION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSoftwareNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoftwareVersionText() {
		return softwareVersionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareVersionText(String newSoftwareVersionText) {
		String oldSoftwareVersionText = softwareVersionText;
		softwareVersionText = newSoftwareVersionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.SOFTWARE_NAME_TYPE__SOFTWARE_VERSION_TEXT, oldSoftwareVersionText, softwareVersionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.SOFTWARE_NAME_TYPE__SOFTWARE_VERSION_TEXT:
				return getSoftwareVersionText();
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
			case _0Package.SOFTWARE_NAME_TYPE__SOFTWARE_VERSION_TEXT:
				setSoftwareVersionText((String)newValue);
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
			case _0Package.SOFTWARE_NAME_TYPE__SOFTWARE_VERSION_TEXT:
				setSoftwareVersionText(SOFTWARE_VERSION_TEXT_EDEFAULT);
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
			case _0Package.SOFTWARE_NAME_TYPE__SOFTWARE_VERSION_TEXT:
				return SOFTWARE_VERSION_TEXT_EDEFAULT == null ? softwareVersionText != null : !SOFTWARE_VERSION_TEXT_EDEFAULT.equals(softwareVersionText);
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
		result.append(" (softwareVersionText: ");
		result.append(softwareVersionText);
		result.append(')');
		return result.toString();
	}

} //SoftwareNameTypeImpl
