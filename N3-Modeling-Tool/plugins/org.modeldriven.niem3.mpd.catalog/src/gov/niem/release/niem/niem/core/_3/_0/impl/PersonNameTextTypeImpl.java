/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.PersonNameTextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Name Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTextTypeImpl#isPersonNameInitialIndicator <em>Person Name Initial Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonNameTextTypeImpl#getSequenceID <em>Sequence ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonNameTextTypeImpl extends ProperNameTextTypeImpl implements PersonNameTextType {
	/**
	 * The default value of the '{@link #isPersonNameInitialIndicator() <em>Person Name Initial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersonNameInitialIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSON_NAME_INITIAL_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersonNameInitialIndicator() <em>Person Name Initial Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPersonNameInitialIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean personNameInitialIndicator = PERSON_NAME_INITIAL_INDICATOR_EDEFAULT;

	/**
	 * This is true if the Person Name Initial Indicator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean personNameInitialIndicatorESet;

	/**
	 * The default value of the '{@link #getSequenceID() <em>Sequence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SEQUENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequenceID() <em>Sequence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sequenceID = SEQUENCE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonNameTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonNameTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersonNameInitialIndicator() {
		return personNameInitialIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonNameInitialIndicator(boolean newPersonNameInitialIndicator) {
		boolean oldPersonNameInitialIndicator = personNameInitialIndicator;
		personNameInitialIndicator = newPersonNameInitialIndicator;
		boolean oldPersonNameInitialIndicatorESet = personNameInitialIndicatorESet;
		personNameInitialIndicatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME_TEXT_TYPE__PERSON_NAME_INITIAL_INDICATOR, oldPersonNameInitialIndicator, personNameInitialIndicator, !oldPersonNameInitialIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersonNameInitialIndicator() {
		boolean oldPersonNameInitialIndicator = personNameInitialIndicator;
		boolean oldPersonNameInitialIndicatorESet = personNameInitialIndicatorESet;
		personNameInitialIndicator = PERSON_NAME_INITIAL_INDICATOR_EDEFAULT;
		personNameInitialIndicatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.PERSON_NAME_TEXT_TYPE__PERSON_NAME_INITIAL_INDICATOR, oldPersonNameInitialIndicator, PERSON_NAME_INITIAL_INDICATOR_EDEFAULT, oldPersonNameInitialIndicatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersonNameInitialIndicator() {
		return personNameInitialIndicatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSequenceID() {
		return sequenceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceID(BigInteger newSequenceID) {
		BigInteger oldSequenceID = sequenceID;
		sequenceID = newSequenceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _0Package.PERSON_NAME_TEXT_TYPE__SEQUENCE_ID, oldSequenceID, sequenceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.PERSON_NAME_TEXT_TYPE__PERSON_NAME_INITIAL_INDICATOR:
				return isPersonNameInitialIndicator();
			case _0Package.PERSON_NAME_TEXT_TYPE__SEQUENCE_ID:
				return getSequenceID();
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
			case _0Package.PERSON_NAME_TEXT_TYPE__PERSON_NAME_INITIAL_INDICATOR:
				setPersonNameInitialIndicator((Boolean)newValue);
				return;
			case _0Package.PERSON_NAME_TEXT_TYPE__SEQUENCE_ID:
				setSequenceID((BigInteger)newValue);
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
			case _0Package.PERSON_NAME_TEXT_TYPE__PERSON_NAME_INITIAL_INDICATOR:
				unsetPersonNameInitialIndicator();
				return;
			case _0Package.PERSON_NAME_TEXT_TYPE__SEQUENCE_ID:
				setSequenceID(SEQUENCE_ID_EDEFAULT);
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
			case _0Package.PERSON_NAME_TEXT_TYPE__PERSON_NAME_INITIAL_INDICATOR:
				return isSetPersonNameInitialIndicator();
			case _0Package.PERSON_NAME_TEXT_TYPE__SEQUENCE_ID:
				return SEQUENCE_ID_EDEFAULT == null ? sequenceID != null : !SEQUENCE_ID_EDEFAULT.equals(sequenceID);
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
		result.append(" (personNameInitialIndicator: ");
		if (personNameInitialIndicatorESet) result.append(personNameInitialIndicator); else result.append("<unset>");
		result.append(", sequenceID: ");
		result.append(sequenceID);
		result.append(')');
		return result.toString();
	}

} //PersonNameTextTypeImpl
