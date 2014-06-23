/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationLocationAssociationType;
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
 * An implementation of the model object '<em><b>Organization Location Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationLocationAssociationTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationLocationAssociationTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationLocationAssociationTypeImpl#getOrganizationLocationAssociationAugmentationPointGroup <em>Organization Location Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationLocationAssociationTypeImpl#getOrganizationLocationAssociationAugmentationPoint <em>Organization Location Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationLocationAssociationTypeImpl extends AssociationTypeImpl implements OrganizationLocationAssociationType {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> location;

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
	 * The cached value of the '{@link #getOrganizationLocationAssociationAugmentationPointGroup() <em>Organization Location Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationLocationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationLocationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationLocationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getOrganizationLocationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationLocationAssociationAugmentationPointGroup() {
		if (organizationLocationAssociationAugmentationPointGroup == null) {
			organizationLocationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return organizationLocationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationLocationAssociationAugmentationPoint() {
		return getOrganizationLocationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getOrganizationLocationAssociationType_OrganizationLocationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getOrganizationLocationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getOrganizationLocationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return getLocation();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION:
				return getOrganization();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getOrganizationLocationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getOrganizationLocationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return getOrganizationLocationAssociationAugmentationPoint();
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
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getOrganizationLocationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				return;
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getOrganizationLocationAssociationAugmentationPointGroup().clear();
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
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return location != null && !location.isEmpty();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return organizationLocationAssociationAugmentationPointGroup != null && !organizationLocationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ORGANIZATION_LOCATION_ASSOCIATION_TYPE__ORGANIZATION_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getOrganizationLocationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (organizationLocationAssociationAugmentationPointGroup: ");
		result.append(organizationLocationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //OrganizationLocationAssociationTypeImpl
