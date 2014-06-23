/**
 */
package gov.niem.niem.wantlist._2.impl;

import gov.niem.niem.wantlist._2.ElementInTypeType;
import gov.niem.niem.wantlist._2.wantlistPackage;

import java.math.BigInteger;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element In Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementInTypeTypeImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementInTypeTypeImpl extends MinimalEObjectImpl.Container implements ElementInTypeType {
	/**
	 * The default value of the '{@link #getChoice() <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> CHOICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> choice = CHOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReference()
	 * @generated
	 * @ordered
	 */
	protected boolean isReference = IS_REFERENCE_EDEFAULT;

	/**
	 * This is true if the Is Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isReferenceESet;

	/**
	 * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final Object MAX_OCCURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOccurs()
	 * @generated
	 * @ordered
	 */
	protected Object maxOccurs = MAX_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_OCCURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinOccurs()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minOccurs = MIN_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final QName NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected QName name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected String qualifier = QUALIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementInTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return wantlistPackage.Literals.ELEMENT_IN_TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getChoice() {
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(List<BigInteger> newChoice) {
		List<BigInteger> oldChoice = choice;
		choice = newChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__CHOICE, oldChoice, choice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReference() {
		return isReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReference(boolean newIsReference) {
		boolean oldIsReference = isReference;
		isReference = newIsReference;
		boolean oldIsReferenceESet = isReferenceESet;
		isReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__IS_REFERENCE, oldIsReference, isReference, !oldIsReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsReference() {
		boolean oldIsReference = isReference;
		boolean oldIsReferenceESet = isReferenceESet;
		isReference = IS_REFERENCE_EDEFAULT;
		isReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__IS_REFERENCE, oldIsReference, IS_REFERENCE_EDEFAULT, oldIsReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsReference() {
		return isReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxOccurs() {
		return maxOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxOccurs(Object newMaxOccurs) {
		Object oldMaxOccurs = maxOccurs;
		maxOccurs = newMaxOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__MAX_OCCURS, oldMaxOccurs, maxOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinOccurs() {
		return minOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinOccurs(BigInteger newMinOccurs) {
		BigInteger oldMinOccurs = minOccurs;
		minOccurs = newMinOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__MIN_OCCURS, oldMinOccurs, minOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(QName newName) {
		QName oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifier() {
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifier(String newQualifier) {
		String oldQualifier = qualifier;
		qualifier = newQualifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_IN_TYPE_TYPE__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__CHOICE:
				return getChoice();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__IS_REFERENCE:
				return isIsReference();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MAX_OCCURS:
				return getMaxOccurs();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MIN_OCCURS:
				return getMinOccurs();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__NAME:
				return getName();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__QUALIFIER:
				return getQualifier();
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
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__CHOICE:
				setChoice((List<BigInteger>)newValue);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__IS_REFERENCE:
				setIsReference((Boolean)newValue);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MAX_OCCURS:
				setMaxOccurs(newValue);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MIN_OCCURS:
				setMinOccurs((BigInteger)newValue);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__NAME:
				setName((QName)newValue);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__QUALIFIER:
				setQualifier((String)newValue);
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
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__CHOICE:
				setChoice(CHOICE_EDEFAULT);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__IS_REFERENCE:
				unsetIsReference();
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MAX_OCCURS:
				setMaxOccurs(MAX_OCCURS_EDEFAULT);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MIN_OCCURS:
				setMinOccurs(MIN_OCCURS_EDEFAULT);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__QUALIFIER:
				setQualifier(QUALIFIER_EDEFAULT);
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
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__CHOICE:
				return CHOICE_EDEFAULT == null ? choice != null : !CHOICE_EDEFAULT.equals(choice);
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__IS_REFERENCE:
				return isSetIsReference();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MAX_OCCURS:
				return MAX_OCCURS_EDEFAULT == null ? maxOccurs != null : !MAX_OCCURS_EDEFAULT.equals(maxOccurs);
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__MIN_OCCURS:
				return MIN_OCCURS_EDEFAULT == null ? minOccurs != null : !MIN_OCCURS_EDEFAULT.equals(minOccurs);
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE__QUALIFIER:
				return QUALIFIER_EDEFAULT == null ? qualifier != null : !QUALIFIER_EDEFAULT.equals(qualifier);
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
		result.append(" (choice: ");
		result.append(choice);
		result.append(", isReference: ");
		if (isReferenceESet) result.append(isReference); else result.append("<unset>");
		result.append(", maxOccurs: ");
		result.append(maxOccurs);
		result.append(", minOccurs: ");
		result.append(minOccurs);
		result.append(", name: ");
		result.append(name);
		result.append(", qualifier: ");
		result.append(qualifier);
		result.append(')');
		return result.toString();
	}

} //ElementInTypeTypeImpl
