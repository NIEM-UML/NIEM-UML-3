/**
 */
package gov.niem.niem.wantlist._2.impl;

import gov.niem.niem.wantlist._2.ElementType;
import gov.niem.niem.wantlist._2.wantlistPackage;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementTypeImpl#isIsReference <em>Is Reference</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementTypeImpl#isNillable <em>Nillable</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.ElementTypeImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTypeImpl extends MinimalEObjectImpl.Container implements ElementType {
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
	 * The default value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NILLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected boolean nillable = NILLABLE_EDEFAULT;

	/**
	 * This is true if the Nillable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nillableESet;

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
	protected ElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return wantlistPackage.Literals.ELEMENT_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_TYPE__IS_REFERENCE, oldIsReference, isReference, !oldIsReferenceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, wantlistPackage.ELEMENT_TYPE__IS_REFERENCE, oldIsReference, IS_REFERENCE_EDEFAULT, oldIsReferenceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNillable() {
		return nillable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNillable(boolean newNillable) {
		boolean oldNillable = nillable;
		nillable = newNillable;
		boolean oldNillableESet = nillableESet;
		nillableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_TYPE__NILLABLE, oldNillable, nillable, !oldNillableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNillable() {
		boolean oldNillable = nillable;
		boolean oldNillableESet = nillableESet;
		nillable = NILLABLE_EDEFAULT;
		nillableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, wantlistPackage.ELEMENT_TYPE__NILLABLE, oldNillable, NILLABLE_EDEFAULT, oldNillableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNillable() {
		return nillableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.ELEMENT_TYPE__QUALIFIER, oldQualifier, qualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case wantlistPackage.ELEMENT_TYPE__IS_REFERENCE:
				return isIsReference();
			case wantlistPackage.ELEMENT_TYPE__NAME:
				return getName();
			case wantlistPackage.ELEMENT_TYPE__NILLABLE:
				return isNillable();
			case wantlistPackage.ELEMENT_TYPE__QUALIFIER:
				return getQualifier();
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
			case wantlistPackage.ELEMENT_TYPE__IS_REFERENCE:
				setIsReference((Boolean)newValue);
				return;
			case wantlistPackage.ELEMENT_TYPE__NAME:
				setName((QName)newValue);
				return;
			case wantlistPackage.ELEMENT_TYPE__NILLABLE:
				setNillable((Boolean)newValue);
				return;
			case wantlistPackage.ELEMENT_TYPE__QUALIFIER:
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
			case wantlistPackage.ELEMENT_TYPE__IS_REFERENCE:
				unsetIsReference();
				return;
			case wantlistPackage.ELEMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case wantlistPackage.ELEMENT_TYPE__NILLABLE:
				unsetNillable();
				return;
			case wantlistPackage.ELEMENT_TYPE__QUALIFIER:
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
			case wantlistPackage.ELEMENT_TYPE__IS_REFERENCE:
				return isSetIsReference();
			case wantlistPackage.ELEMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case wantlistPackage.ELEMENT_TYPE__NILLABLE:
				return isSetNillable();
			case wantlistPackage.ELEMENT_TYPE__QUALIFIER:
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
		result.append(" (isReference: ");
		if (isReferenceESet) result.append(isReference); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nillable: ");
		if (nillableESet) result.append(nillable); else result.append("<unset>");
		result.append(", qualifier: ");
		result.append(qualifier);
		result.append(')');
		return result.toString();
	}

} //ElementTypeImpl
