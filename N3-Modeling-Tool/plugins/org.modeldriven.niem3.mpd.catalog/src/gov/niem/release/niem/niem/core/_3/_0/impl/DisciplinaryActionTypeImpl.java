/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.DisciplinaryActionType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ObligationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ProgramType;
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
 * An implementation of the model object '<em><b>Disciplinary Action Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionPerson <em>Disciplinary Action Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionAssigner <em>Disciplinary Action Assigner</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionCommunityService <em>Disciplinary Action Community Service</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionEnforcer <em>Disciplinary Action Enforcer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionCounseling <em>Disciplinary Action Counseling</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionFee <em>Disciplinary Action Fee</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionProgram <em>Disciplinary Action Program</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionRestitution <em>Disciplinary Action Restitution</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionAugmentationPointGroup <em>Disciplinary Action Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DisciplinaryActionTypeImpl#getDisciplinaryActionAugmentationPoint <em>Disciplinary Action Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisciplinaryActionTypeImpl extends ActivityTypeImpl implements DisciplinaryActionType {
	/**
	 * The cached value of the '{@link #getDisciplinaryActionPerson() <em>Disciplinary Action Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> disciplinaryActionPerson;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionAssigner() <em>Disciplinary Action Assigner</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionAssigner()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> disciplinaryActionAssigner;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionCommunityService() <em>Disciplinary Action Community Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionCommunityService()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> disciplinaryActionCommunityService;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionEnforcer() <em>Disciplinary Action Enforcer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionEnforcer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> disciplinaryActionEnforcer;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionCounseling() <em>Disciplinary Action Counseling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionCounseling()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> disciplinaryActionCounseling;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionFee() <em>Disciplinary Action Fee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionFee()
	 * @generated
	 * @ordered
	 */
	protected EList<ObligationType> disciplinaryActionFee;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionProgram() <em>Disciplinary Action Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramType> disciplinaryActionProgram;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionRestitution() <em>Disciplinary Action Restitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionRestitution()
	 * @generated
	 * @ordered
	 */
	protected EList<ObligationType> disciplinaryActionRestitution;

	/**
	 * The cached value of the '{@link #getDisciplinaryActionAugmentationPointGroup() <em>Disciplinary Action Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplinaryActionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap disciplinaryActionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisciplinaryActionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDisciplinaryActionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getDisciplinaryActionPerson() {
		if (disciplinaryActionPerson == null) {
			disciplinaryActionPerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PERSON);
		}
		return disciplinaryActionPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDisciplinaryActionAssigner() {
		if (disciplinaryActionAssigner == null) {
			disciplinaryActionAssigner = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ASSIGNER);
		}
		return disciplinaryActionAssigner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getDisciplinaryActionCommunityService() {
		if (disciplinaryActionCommunityService == null) {
			disciplinaryActionCommunityService = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COMMUNITY_SERVICE);
		}
		return disciplinaryActionCommunityService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDisciplinaryActionEnforcer() {
		if (disciplinaryActionEnforcer == null) {
			disciplinaryActionEnforcer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ENFORCER);
		}
		return disciplinaryActionEnforcer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getDisciplinaryActionCounseling() {
		if (disciplinaryActionCounseling == null) {
			disciplinaryActionCounseling = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COUNSELING);
		}
		return disciplinaryActionCounseling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObligationType> getDisciplinaryActionFee() {
		if (disciplinaryActionFee == null) {
			disciplinaryActionFee = new EObjectContainmentEList<ObligationType>(ObligationType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_FEE);
		}
		return disciplinaryActionFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramType> getDisciplinaryActionProgram() {
		if (disciplinaryActionProgram == null) {
			disciplinaryActionProgram = new EObjectContainmentEList<ProgramType>(ProgramType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PROGRAM);
		}
		return disciplinaryActionProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObligationType> getDisciplinaryActionRestitution() {
		if (disciplinaryActionRestitution == null) {
			disciplinaryActionRestitution = new EObjectContainmentEList<ObligationType>(ObligationType.class, this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_RESTITUTION);
		}
		return disciplinaryActionRestitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDisciplinaryActionAugmentationPointGroup() {
		if (disciplinaryActionAugmentationPointGroup == null) {
			disciplinaryActionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT_GROUP);
		}
		return disciplinaryActionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDisciplinaryActionAugmentationPoint() {
		return getDisciplinaryActionAugmentationPointGroup().list(_0Package.eINSTANCE.getDisciplinaryActionType_DisciplinaryActionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PERSON:
				return ((InternalEList<?>)getDisciplinaryActionPerson()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ASSIGNER:
				return ((InternalEList<?>)getDisciplinaryActionAssigner()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COMMUNITY_SERVICE:
				return ((InternalEList<?>)getDisciplinaryActionCommunityService()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ENFORCER:
				return ((InternalEList<?>)getDisciplinaryActionEnforcer()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COUNSELING:
				return ((InternalEList<?>)getDisciplinaryActionCounseling()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_FEE:
				return ((InternalEList<?>)getDisciplinaryActionFee()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PROGRAM:
				return ((InternalEList<?>)getDisciplinaryActionProgram()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_RESTITUTION:
				return ((InternalEList<?>)getDisciplinaryActionRestitution()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDisciplinaryActionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDisciplinaryActionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PERSON:
				return getDisciplinaryActionPerson();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ASSIGNER:
				return getDisciplinaryActionAssigner();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COMMUNITY_SERVICE:
				return getDisciplinaryActionCommunityService();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ENFORCER:
				return getDisciplinaryActionEnforcer();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COUNSELING:
				return getDisciplinaryActionCounseling();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_FEE:
				return getDisciplinaryActionFee();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PROGRAM:
				return getDisciplinaryActionProgram();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_RESTITUTION:
				return getDisciplinaryActionRestitution();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDisciplinaryActionAugmentationPointGroup();
				return ((FeatureMap.Internal)getDisciplinaryActionAugmentationPointGroup()).getWrapper();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT:
				return getDisciplinaryActionAugmentationPoint();
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
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PERSON:
				getDisciplinaryActionPerson().clear();
				getDisciplinaryActionPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ASSIGNER:
				getDisciplinaryActionAssigner().clear();
				getDisciplinaryActionAssigner().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COMMUNITY_SERVICE:
				getDisciplinaryActionCommunityService().clear();
				getDisciplinaryActionCommunityService().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ENFORCER:
				getDisciplinaryActionEnforcer().clear();
				getDisciplinaryActionEnforcer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COUNSELING:
				getDisciplinaryActionCounseling().clear();
				getDisciplinaryActionCounseling().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_FEE:
				getDisciplinaryActionFee().clear();
				getDisciplinaryActionFee().addAll((Collection<? extends ObligationType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PROGRAM:
				getDisciplinaryActionProgram().clear();
				getDisciplinaryActionProgram().addAll((Collection<? extends ProgramType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_RESTITUTION:
				getDisciplinaryActionRestitution().clear();
				getDisciplinaryActionRestitution().addAll((Collection<? extends ObligationType>)newValue);
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDisciplinaryActionAugmentationPointGroup()).set(newValue);
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
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PERSON:
				getDisciplinaryActionPerson().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ASSIGNER:
				getDisciplinaryActionAssigner().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COMMUNITY_SERVICE:
				getDisciplinaryActionCommunityService().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ENFORCER:
				getDisciplinaryActionEnforcer().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COUNSELING:
				getDisciplinaryActionCounseling().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_FEE:
				getDisciplinaryActionFee().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PROGRAM:
				getDisciplinaryActionProgram().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_RESTITUTION:
				getDisciplinaryActionRestitution().clear();
				return;
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT_GROUP:
				getDisciplinaryActionAugmentationPointGroup().clear();
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
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PERSON:
				return disciplinaryActionPerson != null && !disciplinaryActionPerson.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ASSIGNER:
				return disciplinaryActionAssigner != null && !disciplinaryActionAssigner.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COMMUNITY_SERVICE:
				return disciplinaryActionCommunityService != null && !disciplinaryActionCommunityService.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_ENFORCER:
				return disciplinaryActionEnforcer != null && !disciplinaryActionEnforcer.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_COUNSELING:
				return disciplinaryActionCounseling != null && !disciplinaryActionCounseling.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_FEE:
				return disciplinaryActionFee != null && !disciplinaryActionFee.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_PROGRAM:
				return disciplinaryActionProgram != null && !disciplinaryActionProgram.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_RESTITUTION:
				return disciplinaryActionRestitution != null && !disciplinaryActionRestitution.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT_GROUP:
				return disciplinaryActionAugmentationPointGroup != null && !disciplinaryActionAugmentationPointGroup.isEmpty();
			case _0Package.DISCIPLINARY_ACTION_TYPE__DISCIPLINARY_ACTION_AUGMENTATION_POINT:
				return !getDisciplinaryActionAugmentationPoint().isEmpty();
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
		result.append(" (disciplinaryActionAugmentationPointGroup: ");
		result.append(disciplinaryActionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DisciplinaryActionTypeImpl
