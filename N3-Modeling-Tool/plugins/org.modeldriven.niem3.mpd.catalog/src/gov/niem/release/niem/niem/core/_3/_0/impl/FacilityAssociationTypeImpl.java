/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FacilityAssociationType;
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
 * An implementation of the model object '<em><b>Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityAssociationTypeImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityAssociationTypeImpl#getFacilityAssociationAugmentationPointGroup <em>Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityAssociationTypeImpl#getFacilityAssociationAugmentationPoint <em>Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilityAssociationTypeImpl extends AssociationTypeImpl implements FacilityAssociationType {
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
	 * The cached value of the '{@link #getFacilityAssociationAugmentationPointGroup() <em>Facility Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFacilityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getFacility() {
		if (facility == null) {
			facility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY);
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityAssociationAugmentationPointGroup() {
		if (facilityAssociationAugmentationPointGroup == null) {
			facilityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return facilityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityAssociationAugmentationPoint() {
		return getFacilityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getFacilityAssociationType_FacilityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY:
				return ((InternalEList<?>)getFacility()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFacilityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFacilityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY:
				return getFacility();
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFacilityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getFacilityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return getFacilityAssociationAugmentationPoint();
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
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				getFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFacilityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				return;
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getFacilityAssociationAugmentationPointGroup().clear();
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
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY:
				return facility != null && !facility.isEmpty();
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return facilityAssociationAugmentationPointGroup != null && !facilityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.FACILITY_ASSOCIATION_TYPE__FACILITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getFacilityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (facilityAssociationAugmentationPointGroup: ");
		result.append(facilityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FacilityAssociationTypeImpl
