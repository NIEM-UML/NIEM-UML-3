/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.OrganizationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType;
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
 * An implementation of the model object '<em><b>Organization Unit Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationUnitAssociationTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationUnitAssociationTypeImpl#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationUnitAssociationTypeImpl#getOrganizationUnitAssociationAugmentationPointGroup <em>Organization Unit Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.OrganizationUnitAssociationTypeImpl#getOrganizationUnitAssociationAugmentationPoint <em>Organization Unit Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationUnitAssociationTypeImpl extends AssociationTypeImpl implements OrganizationUnitAssociationType {
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
	 * The cached value of the '{@link #getOrganizationUnit() <em>Organization Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> organizationUnit;

	/**
	 * The cached value of the '{@link #getOrganizationUnitAssociationAugmentationPointGroup() <em>Organization Unit Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationUnitAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap organizationUnitAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationUnitAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getOrganizationUnitAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganizationUnit() {
		if (organizationUnit == null) {
			organizationUnit = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT);
		}
		return organizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getOrganizationUnitAssociationAugmentationPointGroup() {
		if (organizationUnitAssociationAugmentationPointGroup == null) {
			organizationUnitAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return organizationUnitAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOrganizationUnitAssociationAugmentationPoint() {
		return getOrganizationUnitAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getOrganizationUnitAssociationType_OrganizationUnitAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT:
				return ((InternalEList<?>)getOrganizationUnit()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getOrganizationUnitAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getOrganizationUnitAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION:
				return getOrganization();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT:
				return getOrganizationUnit();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getOrganizationUnitAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getOrganizationUnitAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT:
				return getOrganizationUnitAssociationAugmentationPoint();
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
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT:
				getOrganizationUnit().clear();
				getOrganizationUnit().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getOrganizationUnitAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT:
				getOrganizationUnit().clear();
				return;
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getOrganizationUnitAssociationAugmentationPointGroup().clear();
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
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT:
				return organizationUnit != null && !organizationUnit.isEmpty();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return organizationUnitAssociationAugmentationPointGroup != null && !organizationUnitAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ORGANIZATION_UNIT_ASSOCIATION_TYPE__ORGANIZATION_UNIT_ASSOCIATION_AUGMENTATION_POINT:
				return !getOrganizationUnitAssociationAugmentationPoint().isEmpty();
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
		result.append(" (organizationUnitAssociationAugmentationPointGroup: ");
		result.append(organizationUnitAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //OrganizationUnitAssociationTypeImpl
