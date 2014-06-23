/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.OrganizationAssociationType;
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
 * An implementation of the model object '<em><b>Organization Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationAssociationTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationAssociationTypeImpl#getOrganizationAssociationAugmentationPointGroup <em>Organization Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationAssociationTypeImpl#getOrganizationAssociationAugmentationPoint <em>Organization Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationAssociationTypeImpl extends AssociationTypeImpl implements OrganizationAssociationType {
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
	 * The cached value of the '{@link #getOrganizationAssociationAugmentationPointGroup() <em>Organization Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getOrganizationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationAssociationAugmentationPointGroup() {
		if (organizationAssociationAugmentationPointGroup == null) {
			organizationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return organizationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationAssociationAugmentationPoint() {
		return getOrganizationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getOrganizationAssociationType_OrganizationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getOrganizationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getOrganizationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return getOrganization();
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getOrganizationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getOrganizationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return getOrganizationAssociationAugmentationPoint();
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
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getOrganizationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getOrganizationAssociationAugmentationPointGroup().clear();
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
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return organizationAssociationAugmentationPointGroup != null && !organizationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getOrganizationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (organizationAssociationAugmentationPointGroup: ");
		result.append(organizationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //OrganizationAssociationTypeImpl
