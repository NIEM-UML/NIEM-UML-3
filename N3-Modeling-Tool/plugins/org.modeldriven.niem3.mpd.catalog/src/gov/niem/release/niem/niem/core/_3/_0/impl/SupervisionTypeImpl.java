/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ReleaseType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.SupervisionType;
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
 * An implementation of the model object '<em><b>Supervision Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionCurrentIndicator <em>Supervision Current Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionCustodyStatus <em>Supervision Custody Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionFacility <em>Supervision Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionMandatoryIndicator <em>Supervision Mandatory Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionRelease <em>Supervision Release</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionPerson <em>Supervision Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionPersonStatus <em>Supervision Person Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionSupervisor <em>Supervision Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionAugmentationPointGroup <em>Supervision Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SupervisionTypeImpl#getSupervisionAugmentationPoint <em>Supervision Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupervisionTypeImpl extends ActivityTypeImpl implements SupervisionType {
	/**
	 * The cached value of the '{@link #getSupervisionCurrentIndicator() <em>Supervision Current Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionCurrentIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> supervisionCurrentIndicator;

	/**
	 * The cached value of the '{@link #getSupervisionCustodyStatus() <em>Supervision Custody Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionCustodyStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> supervisionCustodyStatus;

	/**
	 * The cached value of the '{@link #getSupervisionFacility() <em>Supervision Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> supervisionFacility;

	/**
	 * The cached value of the '{@link #getSupervisionMandatoryIndicator() <em>Supervision Mandatory Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionMandatoryIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> supervisionMandatoryIndicator;

	/**
	 * The cached value of the '{@link #getSupervisionRelease() <em>Supervision Release</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionRelease()
	 * @generated
	 * @ordered
	 */
	protected EList<ReleaseType> supervisionRelease;

	/**
	 * The cached value of the '{@link #getSupervisionPerson() <em>Supervision Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> supervisionPerson;

	/**
	 * The cached value of the '{@link #getSupervisionPersonStatus() <em>Supervision Person Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionPersonStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> supervisionPersonStatus;

	/**
	 * The cached value of the '{@link #getSupervisionSupervisor() <em>Supervision Supervisor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionSupervisor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> supervisionSupervisor;

	/**
	 * The cached value of the '{@link #getSupervisionAugmentationPointGroup() <em>Supervision Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap supervisionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupervisionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSupervisionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getSupervisionCurrentIndicator() {
		if (supervisionCurrentIndicator == null) {
			supervisionCurrentIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_CURRENT_INDICATOR);
		}
		return supervisionCurrentIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getSupervisionCustodyStatus() {
		if (supervisionCustodyStatus == null) {
			supervisionCustodyStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_CUSTODY_STATUS);
		}
		return supervisionCustodyStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getSupervisionFacility() {
		if (supervisionFacility == null) {
			supervisionFacility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_FACILITY);
		}
		return supervisionFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getSupervisionMandatoryIndicator() {
		if (supervisionMandatoryIndicator == null) {
			supervisionMandatoryIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_MANDATORY_INDICATOR);
		}
		return supervisionMandatoryIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReleaseType> getSupervisionRelease() {
		if (supervisionRelease == null) {
			supervisionRelease = new EObjectContainmentEList<ReleaseType>(ReleaseType.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_RELEASE);
		}
		return supervisionRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getSupervisionPerson() {
		if (supervisionPerson == null) {
			supervisionPerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON);
		}
		return supervisionPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getSupervisionPersonStatus() {
		if (supervisionPersonStatus == null) {
			supervisionPersonStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON_STATUS);
		}
		return supervisionPersonStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getSupervisionSupervisor() {
		if (supervisionSupervisor == null) {
			supervisionSupervisor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.SUPERVISION_TYPE__SUPERVISION_SUPERVISOR);
		}
		return supervisionSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSupervisionAugmentationPointGroup() {
		if (supervisionAugmentationPointGroup == null) {
			supervisionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT_GROUP);
		}
		return supervisionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSupervisionAugmentationPoint() {
		return getSupervisionAugmentationPointGroup().list(_0Package.eINSTANCE.getSupervisionType_SupervisionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CURRENT_INDICATOR:
				return ((InternalEList<?>)getSupervisionCurrentIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CUSTODY_STATUS:
				return ((InternalEList<?>)getSupervisionCustodyStatus()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_FACILITY:
				return ((InternalEList<?>)getSupervisionFacility()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_MANDATORY_INDICATOR:
				return ((InternalEList<?>)getSupervisionMandatoryIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_RELEASE:
				return ((InternalEList<?>)getSupervisionRelease()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON:
				return ((InternalEList<?>)getSupervisionPerson()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON_STATUS:
				return ((InternalEList<?>)getSupervisionPersonStatus()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_SUPERVISOR:
				return ((InternalEList<?>)getSupervisionSupervisor()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getSupervisionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getSupervisionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CURRENT_INDICATOR:
				return getSupervisionCurrentIndicator();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CUSTODY_STATUS:
				return getSupervisionCustodyStatus();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_FACILITY:
				return getSupervisionFacility();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_MANDATORY_INDICATOR:
				return getSupervisionMandatoryIndicator();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_RELEASE:
				return getSupervisionRelease();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON:
				return getSupervisionPerson();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON_STATUS:
				return getSupervisionPersonStatus();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_SUPERVISOR:
				return getSupervisionSupervisor();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getSupervisionAugmentationPointGroup();
				return ((FeatureMap.Internal)getSupervisionAugmentationPointGroup()).getWrapper();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT:
				return getSupervisionAugmentationPoint();
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
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CURRENT_INDICATOR:
				getSupervisionCurrentIndicator().clear();
				getSupervisionCurrentIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CUSTODY_STATUS:
				getSupervisionCustodyStatus().clear();
				getSupervisionCustodyStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_FACILITY:
				getSupervisionFacility().clear();
				getSupervisionFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_MANDATORY_INDICATOR:
				getSupervisionMandatoryIndicator().clear();
				getSupervisionMandatoryIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_RELEASE:
				getSupervisionRelease().clear();
				getSupervisionRelease().addAll((Collection<? extends ReleaseType>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON:
				getSupervisionPerson().clear();
				getSupervisionPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON_STATUS:
				getSupervisionPersonStatus().clear();
				getSupervisionPersonStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_SUPERVISOR:
				getSupervisionSupervisor().clear();
				getSupervisionSupervisor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getSupervisionAugmentationPointGroup()).set(newValue);
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
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CURRENT_INDICATOR:
				getSupervisionCurrentIndicator().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CUSTODY_STATUS:
				getSupervisionCustodyStatus().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_FACILITY:
				getSupervisionFacility().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_MANDATORY_INDICATOR:
				getSupervisionMandatoryIndicator().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_RELEASE:
				getSupervisionRelease().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON:
				getSupervisionPerson().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON_STATUS:
				getSupervisionPersonStatus().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_SUPERVISOR:
				getSupervisionSupervisor().clear();
				return;
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT_GROUP:
				getSupervisionAugmentationPointGroup().clear();
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
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CURRENT_INDICATOR:
				return supervisionCurrentIndicator != null && !supervisionCurrentIndicator.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_CUSTODY_STATUS:
				return supervisionCustodyStatus != null && !supervisionCustodyStatus.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_FACILITY:
				return supervisionFacility != null && !supervisionFacility.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_MANDATORY_INDICATOR:
				return supervisionMandatoryIndicator != null && !supervisionMandatoryIndicator.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_RELEASE:
				return supervisionRelease != null && !supervisionRelease.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON:
				return supervisionPerson != null && !supervisionPerson.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_PERSON_STATUS:
				return supervisionPersonStatus != null && !supervisionPersonStatus.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_SUPERVISOR:
				return supervisionSupervisor != null && !supervisionSupervisor.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT_GROUP:
				return supervisionAugmentationPointGroup != null && !supervisionAugmentationPointGroup.isEmpty();
			case _0Package.SUPERVISION_TYPE__SUPERVISION_AUGMENTATION_POINT:
				return !getSupervisionAugmentationPoint().isEmpty();
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
		result.append(" (supervisionAugmentationPointGroup: ");
		result.append(supervisionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //SupervisionTypeImpl
