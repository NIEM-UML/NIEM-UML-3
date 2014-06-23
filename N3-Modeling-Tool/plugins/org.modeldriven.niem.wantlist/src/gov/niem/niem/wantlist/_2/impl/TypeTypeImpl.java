/**
 */
package gov.niem.niem.wantlist._2.impl;

import gov.niem.niem.wantlist._2.AttributeInTypeType;
import gov.niem.niem.wantlist._2.ElementInTypeType;
import gov.niem.niem.wantlist._2.FacetType;
import gov.niem.niem.wantlist._2.TypeType;
import gov.niem.niem.wantlist._2.UnionMemberType;
import gov.niem.niem.wantlist._2.wantlistPackage;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl#getAttributeInType <em>Attribute In Type</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl#getElementInType <em>Element In Type</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl#getFacet <em>Facet</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl#getUnionMember <em>Union Member</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl#isIsRequested <em>Is Requested</em>}</li>
 *   <li>{@link gov.niem.niem.wantlist._2.impl.TypeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeImpl extends MinimalEObjectImpl.Container implements TypeType {
	/**
	 * The cached value of the '{@link #getAttributeInType() <em>Attribute In Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeInType()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeInTypeType> attributeInType;

	/**
	 * The cached value of the '{@link #getElementInType() <em>Element In Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementInType()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementInTypeType> elementInType;

	/**
	 * The cached value of the '{@link #getFacet() <em>Facet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacet()
	 * @generated
	 * @ordered
	 */
	protected EList<FacetType> facet;

	/**
	 * The cached value of the '{@link #getUnionMember() <em>Union Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionMember()
	 * @generated
	 * @ordered
	 */
	protected EList<UnionMemberType> unionMember;

	/**
	 * The default value of the '{@link #isIsRequested() <em>Is Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequested()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUESTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequested() <em>Is Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequested()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequested = IS_REQUESTED_EDEFAULT;

	/**
	 * This is true if the Is Requested attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRequestedESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return wantlistPackage.Literals.TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeInTypeType> getAttributeInType() {
		if (attributeInType == null) {
			attributeInType = new EObjectContainmentEList<AttributeInTypeType>(AttributeInTypeType.class, this, wantlistPackage.TYPE_TYPE__ATTRIBUTE_IN_TYPE);
		}
		return attributeInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementInTypeType> getElementInType() {
		if (elementInType == null) {
			elementInType = new EObjectContainmentEList<ElementInTypeType>(ElementInTypeType.class, this, wantlistPackage.TYPE_TYPE__ELEMENT_IN_TYPE);
		}
		return elementInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacetType> getFacet() {
		if (facet == null) {
			facet = new EObjectContainmentEList<FacetType>(FacetType.class, this, wantlistPackage.TYPE_TYPE__FACET);
		}
		return facet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnionMemberType> getUnionMember() {
		if (unionMember == null) {
			unionMember = new EObjectContainmentEList<UnionMemberType>(UnionMemberType.class, this, wantlistPackage.TYPE_TYPE__UNION_MEMBER);
		}
		return unionMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequested() {
		return isRequested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequested(boolean newIsRequested) {
		boolean oldIsRequested = isRequested;
		isRequested = newIsRequested;
		boolean oldIsRequestedESet = isRequestedESet;
		isRequestedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.TYPE_TYPE__IS_REQUESTED, oldIsRequested, isRequested, !oldIsRequestedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRequested() {
		boolean oldIsRequested = isRequested;
		boolean oldIsRequestedESet = isRequestedESet;
		isRequested = IS_REQUESTED_EDEFAULT;
		isRequestedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, wantlistPackage.TYPE_TYPE__IS_REQUESTED, oldIsRequested, IS_REQUESTED_EDEFAULT, oldIsRequestedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRequested() {
		return isRequestedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, wantlistPackage.TYPE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case wantlistPackage.TYPE_TYPE__ATTRIBUTE_IN_TYPE:
				return ((InternalEList<?>)getAttributeInType()).basicRemove(otherEnd, msgs);
			case wantlistPackage.TYPE_TYPE__ELEMENT_IN_TYPE:
				return ((InternalEList<?>)getElementInType()).basicRemove(otherEnd, msgs);
			case wantlistPackage.TYPE_TYPE__FACET:
				return ((InternalEList<?>)getFacet()).basicRemove(otherEnd, msgs);
			case wantlistPackage.TYPE_TYPE__UNION_MEMBER:
				return ((InternalEList<?>)getUnionMember()).basicRemove(otherEnd, msgs);
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
			case wantlistPackage.TYPE_TYPE__ATTRIBUTE_IN_TYPE:
				return getAttributeInType();
			case wantlistPackage.TYPE_TYPE__ELEMENT_IN_TYPE:
				return getElementInType();
			case wantlistPackage.TYPE_TYPE__FACET:
				return getFacet();
			case wantlistPackage.TYPE_TYPE__UNION_MEMBER:
				return getUnionMember();
			case wantlistPackage.TYPE_TYPE__IS_REQUESTED:
				return isIsRequested();
			case wantlistPackage.TYPE_TYPE__NAME:
				return getName();
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
			case wantlistPackage.TYPE_TYPE__ATTRIBUTE_IN_TYPE:
				getAttributeInType().clear();
				getAttributeInType().addAll((Collection<? extends AttributeInTypeType>)newValue);
				return;
			case wantlistPackage.TYPE_TYPE__ELEMENT_IN_TYPE:
				getElementInType().clear();
				getElementInType().addAll((Collection<? extends ElementInTypeType>)newValue);
				return;
			case wantlistPackage.TYPE_TYPE__FACET:
				getFacet().clear();
				getFacet().addAll((Collection<? extends FacetType>)newValue);
				return;
			case wantlistPackage.TYPE_TYPE__UNION_MEMBER:
				getUnionMember().clear();
				getUnionMember().addAll((Collection<? extends UnionMemberType>)newValue);
				return;
			case wantlistPackage.TYPE_TYPE__IS_REQUESTED:
				setIsRequested((Boolean)newValue);
				return;
			case wantlistPackage.TYPE_TYPE__NAME:
				setName((QName)newValue);
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
			case wantlistPackage.TYPE_TYPE__ATTRIBUTE_IN_TYPE:
				getAttributeInType().clear();
				return;
			case wantlistPackage.TYPE_TYPE__ELEMENT_IN_TYPE:
				getElementInType().clear();
				return;
			case wantlistPackage.TYPE_TYPE__FACET:
				getFacet().clear();
				return;
			case wantlistPackage.TYPE_TYPE__UNION_MEMBER:
				getUnionMember().clear();
				return;
			case wantlistPackage.TYPE_TYPE__IS_REQUESTED:
				unsetIsRequested();
				return;
			case wantlistPackage.TYPE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case wantlistPackage.TYPE_TYPE__ATTRIBUTE_IN_TYPE:
				return attributeInType != null && !attributeInType.isEmpty();
			case wantlistPackage.TYPE_TYPE__ELEMENT_IN_TYPE:
				return elementInType != null && !elementInType.isEmpty();
			case wantlistPackage.TYPE_TYPE__FACET:
				return facet != null && !facet.isEmpty();
			case wantlistPackage.TYPE_TYPE__UNION_MEMBER:
				return unionMember != null && !unionMember.isEmpty();
			case wantlistPackage.TYPE_TYPE__IS_REQUESTED:
				return isSetIsRequested();
			case wantlistPackage.TYPE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (isRequested: ");
		if (isRequestedESet) result.append(isRequested); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TypeTypeImpl
