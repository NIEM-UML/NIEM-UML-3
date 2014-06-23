/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.OrganizationType;
import gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType;
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
 * An implementation of the model object '<em><b>Person Organization Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonOrganizationAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonOrganizationAssociationTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonOrganizationAssociationTypeImpl#getPersonOrganizationAssociationAugmentationPointGroup <em>Person Organization Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonOrganizationAssociationTypeImpl#getPersonOrganizationAssociationAugmentationPoint <em>Person Organization Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonOrganizationAssociationTypeImpl extends AssociationTypeImpl implements PersonOrganizationAssociationType {
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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> organization;

	/**
	 * The cached value of the '{@link #getPersonOrganizationAssociationAugmentationPointGroup() <em>Person Organization Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOrganizationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personOrganizationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonOrganizationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonOrganizationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonOrganizationAssociationAugmentationPointGroup() {
		if (personOrganizationAssociationAugmentationPointGroup == null) {
			personOrganizationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personOrganizationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonOrganizationAssociationAugmentationPoint() {
		return getPersonOrganizationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonOrganizationAssociationType_PersonOrganizationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonOrganizationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonOrganizationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return getOrganization();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonOrganizationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonOrganizationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonOrganizationAssociationAugmentationPoint();
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
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonOrganizationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonOrganizationAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personOrganizationAssociationAugmentationPointGroup != null && !personOrganizationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_ORGANIZATION_ASSOCIATION_TYPE__PERSON_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonOrganizationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personOrganizationAssociationAugmentationPointGroup: ");
		result.append(personOrganizationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonOrganizationAssociationTypeImpl
