/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.IdentityType;
import gov.niem.release.niem.niem.core._3._0.PersonIdentityAssociationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Identity Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonIdentityAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonIdentityAssociationTypeImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonIdentityAssociationTypeImpl#getIdentityStolenIndicator <em>Identity Stolen Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonIdentityAssociationTypeImpl#getPersonIdentityAssociationAugmentationPointGroup <em>Person Identity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonIdentityAssociationTypeImpl#getPersonIdentityAssociationAugmentationPoint <em>Person Identity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonIdentityAssociationTypeImpl extends AssociationTypeImpl implements PersonIdentityAssociationType {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> person;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentityType> identity;

	/**
	 * The cached value of the '{@link #getIdentityStolenIndicator() <em>Identity Stolen Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentityStolenIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> identityStolenIndicator;

	/**
	 * The cached value of the '{@link #getPersonIdentityAssociationAugmentationPointGroup() <em>Person Identity Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonIdentityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personIdentityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonIdentityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonIdentityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentityType> getIdentity() {
		if (identity == null) {
			identity = new EObjectContainmentEList<IdentityType>(IdentityType.class, this, _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY);
		}
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getIdentityStolenIndicator() {
		if (identityStolenIndicator == null) {
			identityStolenIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY_STOLEN_INDICATOR);
		}
		return identityStolenIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonIdentityAssociationAugmentationPointGroup() {
		if (personIdentityAssociationAugmentationPointGroup == null) {
			personIdentityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personIdentityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonIdentityAssociationAugmentationPoint() {
		return getPersonIdentityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonIdentityAssociationType_PersonIdentityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY:
				return ((InternalEList<?>)getIdentity()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY_STOLEN_INDICATOR:
				return ((InternalEList<?>)getIdentityStolenIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonIdentityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonIdentityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY:
				return getIdentity();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY_STOLEN_INDICATOR:
				return getIdentityStolenIndicator();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonIdentityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonIdentityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonIdentityAssociationAugmentationPoint();
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
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY:
				getIdentity().clear();
				getIdentity().addAll((Collection<? extends IdentityType>)newValue);
				return;
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY_STOLEN_INDICATOR:
				getIdentityStolenIndicator().clear();
				getIdentityStolenIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonIdentityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY:
				getIdentity().clear();
				return;
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY_STOLEN_INDICATOR:
				getIdentityStolenIndicator().clear();
				return;
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonIdentityAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY:
				return identity != null && !identity.isEmpty();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__IDENTITY_STOLEN_INDICATOR:
				return identityStolenIndicator != null && !identityStolenIndicator.isEmpty();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personIdentityAssociationAugmentationPointGroup != null && !personIdentityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_IDENTITY_ASSOCIATION_TYPE__PERSON_IDENTITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonIdentityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personIdentityAssociationAugmentationPointGroup: ");
		result.append(personIdentityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonIdentityAssociationTypeImpl
