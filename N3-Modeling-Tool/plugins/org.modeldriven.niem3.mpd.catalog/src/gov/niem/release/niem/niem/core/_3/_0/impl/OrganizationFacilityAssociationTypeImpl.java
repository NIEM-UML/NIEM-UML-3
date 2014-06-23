/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FacilityType;
import gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationType;
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
 * An implementation of the model object '<em><b>Organization Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationFacilityAssociationTypeImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationFacilityAssociationTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationFacilityAssociationTypeImpl#getOrganizationFacilityAssociationAugmentationPointGroup <em>Organization Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationFacilityAssociationTypeImpl#getOrganizationFacilityAssociationAugmentationPoint <em>Organization Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationFacilityAssociationTypeImpl extends AssociationTypeImpl implements OrganizationFacilityAssociationType {
	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> facility;

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
	 * The cached value of the '{@link #getOrganizationFacilityAssociationAugmentationPointGroup() <em>Organization Facility Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationFacilityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationFacilityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationFacilityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getOrganizationFacilityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getFacility() {
		if (facility == null) {
			facility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__FACILITY);
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationFacilityAssociationAugmentationPointGroup() {
		if (organizationFacilityAssociationAugmentationPointGroup == null) {
			organizationFacilityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return organizationFacilityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationFacilityAssociationAugmentationPoint() {
		return getOrganizationFacilityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getOrganizationFacilityAssociationType_OrganizationFacilityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__FACILITY:
				return ((InternalEList<?>)getFacility()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getOrganizationFacilityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getOrganizationFacilityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__FACILITY:
				return getFacility();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION:
				return getOrganization();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getOrganizationFacilityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getOrganizationFacilityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return getOrganizationFacilityAssociationAugmentationPoint();
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
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				getFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getOrganizationFacilityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				return;
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getOrganizationFacilityAssociationAugmentationPointGroup().clear();
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
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__FACILITY:
				return facility != null && !facility.isEmpty();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return organizationFacilityAssociationAugmentationPointGroup != null && !organizationFacilityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ORGANIZATION_FACILITY_ASSOCIATION_TYPE__ORGANIZATION_FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getOrganizationFacilityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (organizationFacilityAssociationAugmentationPointGroup: ");
		result.append(organizationFacilityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //OrganizationFacilityAssociationTypeImpl
