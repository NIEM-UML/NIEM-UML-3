/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FacilityPersonAssociationType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
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
 * An implementation of the model object '<em><b>Facility Person Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityPersonAssociationTypeImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityPersonAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityPersonAssociationTypeImpl#getFacilityPersonAssociationAugmentationPointGroup <em>Facility Person Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityPersonAssociationTypeImpl#getFacilityPersonAssociationAugmentationPoint <em>Facility Person Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilityPersonAssociationTypeImpl extends AssociationTypeImpl implements FacilityPersonAssociationType {
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
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> person;

	/**
	 * The cached value of the '{@link #getFacilityPersonAssociationAugmentationPointGroup() <em>Facility Person Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityPersonAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityPersonAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityPersonAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFacilityPersonAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getFacility() {
		if (facility == null) {
			facility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY);
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityPersonAssociationAugmentationPointGroup() {
		if (facilityPersonAssociationAugmentationPointGroup == null) {
			facilityPersonAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return facilityPersonAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityPersonAssociationAugmentationPoint() {
		return getFacilityPersonAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getFacilityPersonAssociationType_FacilityPersonAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY:
				return ((InternalEList<?>)getFacility()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFacilityPersonAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFacilityPersonAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY:
				return getFacility();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFacilityPersonAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getFacilityPersonAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return getFacilityPersonAssociationAugmentationPoint();
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
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				getFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFacilityPersonAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				return;
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getFacilityPersonAssociationAugmentationPointGroup().clear();
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
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY:
				return facility != null && !facility.isEmpty();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return facilityPersonAssociationAugmentationPointGroup != null && !facilityPersonAssociationAugmentationPointGroup.isEmpty();
			case _0Package.FACILITY_PERSON_ASSOCIATION_TYPE__FACILITY_PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return !getFacilityPersonAssociationAugmentationPoint().isEmpty();
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
		result.append(" (facilityPersonAssociationAugmentationPointGroup: ");
		result.append(facilityPersonAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FacilityPersonAssociationTypeImpl
