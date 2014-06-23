/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FacilitySubFacilityAssociationType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
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
 * An implementation of the model object '<em><b>Facility Sub Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilitySubFacilityAssociationTypeImpl#getParentFacility <em>Parent Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilitySubFacilityAssociationTypeImpl#getSubFacility <em>Sub Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilitySubFacilityAssociationTypeImpl#getFacilitySubFacilityAssociationAugmentationPointGroup <em>Facility Sub Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilitySubFacilityAssociationTypeImpl#getFacilitySubFacilityAssociationAugmentationPoint <em>Facility Sub Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilitySubFacilityAssociationTypeImpl extends AssociationTypeImpl implements FacilitySubFacilityAssociationType {
	/**
	 * The cached value of the '{@link #getParentFacility() <em>Parent Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> parentFacility;

	/**
	 * The cached value of the '{@link #getSubFacility() <em>Sub Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> subFacility;

	/**
	 * The cached value of the '{@link #getFacilitySubFacilityAssociationAugmentationPointGroup() <em>Facility Sub Facility Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySubFacilityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilitySubFacilityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilitySubFacilityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFacilitySubFacilityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getParentFacility() {
		if (parentFacility == null) {
			parentFacility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__PARENT_FACILITY);
		}
		return parentFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getSubFacility() {
		if (subFacility == null) {
			subFacility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__SUB_FACILITY);
		}
		return subFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilitySubFacilityAssociationAugmentationPointGroup() {
		if (facilitySubFacilityAssociationAugmentationPointGroup == null) {
			facilitySubFacilityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return facilitySubFacilityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilitySubFacilityAssociationAugmentationPoint() {
		return getFacilitySubFacilityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getFacilitySubFacilityAssociationType_FacilitySubFacilityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__PARENT_FACILITY:
				return ((InternalEList<?>)getParentFacility()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__SUB_FACILITY:
				return ((InternalEList<?>)getSubFacility()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFacilitySubFacilityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFacilitySubFacilityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__PARENT_FACILITY:
				return getParentFacility();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__SUB_FACILITY:
				return getSubFacility();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFacilitySubFacilityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getFacilitySubFacilityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return getFacilitySubFacilityAssociationAugmentationPoint();
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
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__PARENT_FACILITY:
				getParentFacility().clear();
				getParentFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__SUB_FACILITY:
				getSubFacility().clear();
				getSubFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFacilitySubFacilityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__PARENT_FACILITY:
				getParentFacility().clear();
				return;
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__SUB_FACILITY:
				getSubFacility().clear();
				return;
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getFacilitySubFacilityAssociationAugmentationPointGroup().clear();
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
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__PARENT_FACILITY:
				return parentFacility != null && !parentFacility.isEmpty();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__SUB_FACILITY:
				return subFacility != null && !subFacility.isEmpty();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return facilitySubFacilityAssociationAugmentationPointGroup != null && !facilitySubFacilityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.FACILITY_SUB_FACILITY_ASSOCIATION_TYPE__FACILITY_SUB_FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getFacilitySubFacilityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (facilitySubFacilityAssociationAugmentationPointGroup: ");
		result.append(facilitySubFacilityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FacilitySubFacilityAssociationTypeImpl
