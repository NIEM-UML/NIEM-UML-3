/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.ConditionType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ProgramType;
import gov.niem.release.niem.niem.core._3._0.ReferralType;
import gov.niem.release.niem.niem.core._3._0.ReleaseType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

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
 * An implementation of the model object '<em><b>Program Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramPerson <em>Program Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramAction <em>Program Action</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramCapacityQuantity <em>Program Capacity Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramCondition <em>Program Condition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramFacility <em>Program Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramPubliclyRunIndicator <em>Program Publicly Run Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramPurposeText <em>Program Purpose Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramReferral <em>Program Referral</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramAdministrator <em>Program Administrator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramRelease <em>Program Release</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramSupervisor <em>Program Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramResidentialIndicator <em>Program Residential Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramSupervisedIndicator <em>Program Supervised Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramAugmentationPointGroup <em>Program Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ProgramTypeImpl#getProgramAugmentationPoint <em>Program Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramTypeImpl extends ActivityTypeImpl implements ProgramType {
	/**
	 * The cached value of the '{@link #getProgramPerson() <em>Program Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> programPerson;

	/**
	 * The cached value of the '{@link #getProgramAction() <em>Program Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> programAction;

	/**
	 * The cached value of the '{@link #getProgramCapacityQuantity() <em>Program Capacity Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCapacityQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> programCapacityQuantity;

	/**
	 * The cached value of the '{@link #getProgramCondition() <em>Program Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionType> programCondition;

	/**
	 * The cached value of the '{@link #getProgramFacility() <em>Program Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> programFacility;

	/**
	 * The cached value of the '{@link #getProgramPubliclyRunIndicator() <em>Program Publicly Run Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramPubliclyRunIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> programPubliclyRunIndicator;

	/**
	 * The cached value of the '{@link #getProgramPurposeText() <em>Program Purpose Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramPurposeText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> programPurposeText;

	/**
	 * The cached value of the '{@link #getProgramReferral() <em>Program Referral</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramReferral()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferralType> programReferral;

	/**
	 * The cached value of the '{@link #getProgramAdministrator() <em>Program Administrator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramAdministrator()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> programAdministrator;

	/**
	 * The cached value of the '{@link #getProgramRelease() <em>Program Release</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramRelease()
	 * @generated
	 * @ordered
	 */
	protected EList<ReleaseType> programRelease;

	/**
	 * The cached value of the '{@link #getProgramSupervisor() <em>Program Supervisor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramSupervisor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> programSupervisor;

	/**
	 * The cached value of the '{@link #getProgramResidentialIndicator() <em>Program Residential Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramResidentialIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> programResidentialIndicator;

	/**
	 * The cached value of the '{@link #getProgramSupervisedIndicator() <em>Program Supervised Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramSupervisedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> programSupervisedIndicator;

	/**
	 * The cached value of the '{@link #getProgramAugmentationPointGroup() <em>Program Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap programAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getProgramType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getProgramPerson() {
		if (programPerson == null) {
			programPerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_PERSON);
		}
		return programPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getProgramAction() {
		if (programAction == null) {
			programAction = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_ACTION);
		}
		return programAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getProgramCapacityQuantity() {
		if (programCapacityQuantity == null) {
			programCapacityQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.PROGRAM_TYPE__PROGRAM_CAPACITY_QUANTITY);
		}
		return programCapacityQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionType> getProgramCondition() {
		if (programCondition == null) {
			programCondition = new EObjectContainmentEList<ConditionType>(ConditionType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_CONDITION);
		}
		return programCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getProgramFacility() {
		if (programFacility == null) {
			programFacility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_FACILITY);
		}
		return programFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgramPubliclyRunIndicator() {
		if (programPubliclyRunIndicator == null) {
			programPubliclyRunIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PROGRAM_TYPE__PROGRAM_PUBLICLY_RUN_INDICATOR);
		}
		return programPubliclyRunIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getProgramPurposeText() {
		if (programPurposeText == null) {
			programPurposeText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_PURPOSE_TEXT);
		}
		return programPurposeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferralType> getProgramReferral() {
		if (programReferral == null) {
			programReferral = new EObjectContainmentEList<ReferralType>(ReferralType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_REFERRAL);
		}
		return programReferral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getProgramAdministrator() {
		if (programAdministrator == null) {
			programAdministrator = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_ADMINISTRATOR);
		}
		return programAdministrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReleaseType> getProgramRelease() {
		if (programRelease == null) {
			programRelease = new EObjectContainmentEList<ReleaseType>(ReleaseType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_RELEASE);
		}
		return programRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getProgramSupervisor() {
		if (programSupervisor == null) {
			programSupervisor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISOR);
		}
		return programSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgramResidentialIndicator() {
		if (programResidentialIndicator == null) {
			programResidentialIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PROGRAM_TYPE__PROGRAM_RESIDENTIAL_INDICATOR);
		}
		return programResidentialIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getProgramSupervisedIndicator() {
		if (programSupervisedIndicator == null) {
			programSupervisedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISED_INDICATOR);
		}
		return programSupervisedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getProgramAugmentationPointGroup() {
		if (programAugmentationPointGroup == null) {
			programAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT_GROUP);
		}
		return programAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getProgramAugmentationPoint() {
		return getProgramAugmentationPointGroup().list(_0Package.eINSTANCE.getProgramType_ProgramAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PROGRAM_TYPE__PROGRAM_PERSON:
				return ((InternalEList<?>)getProgramPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_ACTION:
				return ((InternalEList<?>)getProgramAction()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_CAPACITY_QUANTITY:
				return ((InternalEList<?>)getProgramCapacityQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_CONDITION:
				return ((InternalEList<?>)getProgramCondition()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_FACILITY:
				return ((InternalEList<?>)getProgramFacility()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_PUBLICLY_RUN_INDICATOR:
				return ((InternalEList<?>)getProgramPubliclyRunIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_PURPOSE_TEXT:
				return ((InternalEList<?>)getProgramPurposeText()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_REFERRAL:
				return ((InternalEList<?>)getProgramReferral()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_ADMINISTRATOR:
				return ((InternalEList<?>)getProgramAdministrator()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_RELEASE:
				return ((InternalEList<?>)getProgramRelease()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISOR:
				return ((InternalEList<?>)getProgramSupervisor()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_RESIDENTIAL_INDICATOR:
				return ((InternalEList<?>)getProgramResidentialIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISED_INDICATOR:
				return ((InternalEList<?>)getProgramSupervisedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getProgramAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT:
				return ((InternalEList<?>)getProgramAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PROGRAM_TYPE__PROGRAM_PERSON:
				return getProgramPerson();
			case _0Package.PROGRAM_TYPE__PROGRAM_ACTION:
				return getProgramAction();
			case _0Package.PROGRAM_TYPE__PROGRAM_CAPACITY_QUANTITY:
				return getProgramCapacityQuantity();
			case _0Package.PROGRAM_TYPE__PROGRAM_CONDITION:
				return getProgramCondition();
			case _0Package.PROGRAM_TYPE__PROGRAM_FACILITY:
				return getProgramFacility();
			case _0Package.PROGRAM_TYPE__PROGRAM_PUBLICLY_RUN_INDICATOR:
				return getProgramPubliclyRunIndicator();
			case _0Package.PROGRAM_TYPE__PROGRAM_PURPOSE_TEXT:
				return getProgramPurposeText();
			case _0Package.PROGRAM_TYPE__PROGRAM_REFERRAL:
				return getProgramReferral();
			case _0Package.PROGRAM_TYPE__PROGRAM_ADMINISTRATOR:
				return getProgramAdministrator();
			case _0Package.PROGRAM_TYPE__PROGRAM_RELEASE:
				return getProgramRelease();
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISOR:
				return getProgramSupervisor();
			case _0Package.PROGRAM_TYPE__PROGRAM_RESIDENTIAL_INDICATOR:
				return getProgramResidentialIndicator();
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISED_INDICATOR:
				return getProgramSupervisedIndicator();
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT_GROUP:
				if (coreType) return getProgramAugmentationPointGroup();
				return ((FeatureMap.Internal)getProgramAugmentationPointGroup()).getWrapper();
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT:
				return getProgramAugmentationPoint();
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
			case _0Package.PROGRAM_TYPE__PROGRAM_PERSON:
				getProgramPerson().clear();
				getProgramPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_ACTION:
				getProgramAction().clear();
				getProgramAction().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_CAPACITY_QUANTITY:
				getProgramCapacityQuantity().clear();
				getProgramCapacityQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_CONDITION:
				getProgramCondition().clear();
				getProgramCondition().addAll((Collection<? extends ConditionType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_FACILITY:
				getProgramFacility().clear();
				getProgramFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_PUBLICLY_RUN_INDICATOR:
				getProgramPubliclyRunIndicator().clear();
				getProgramPubliclyRunIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_PURPOSE_TEXT:
				getProgramPurposeText().clear();
				getProgramPurposeText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_REFERRAL:
				getProgramReferral().clear();
				getProgramReferral().addAll((Collection<? extends ReferralType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_ADMINISTRATOR:
				getProgramAdministrator().clear();
				getProgramAdministrator().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_RELEASE:
				getProgramRelease().clear();
				getProgramRelease().addAll((Collection<? extends ReleaseType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISOR:
				getProgramSupervisor().clear();
				getProgramSupervisor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_RESIDENTIAL_INDICATOR:
				getProgramResidentialIndicator().clear();
				getProgramResidentialIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISED_INDICATOR:
				getProgramSupervisedIndicator().clear();
				getProgramSupervisedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getProgramAugmentationPointGroup()).set(newValue);
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
			case _0Package.PROGRAM_TYPE__PROGRAM_PERSON:
				getProgramPerson().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_ACTION:
				getProgramAction().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_CAPACITY_QUANTITY:
				getProgramCapacityQuantity().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_CONDITION:
				getProgramCondition().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_FACILITY:
				getProgramFacility().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_PUBLICLY_RUN_INDICATOR:
				getProgramPubliclyRunIndicator().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_PURPOSE_TEXT:
				getProgramPurposeText().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_REFERRAL:
				getProgramReferral().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_ADMINISTRATOR:
				getProgramAdministrator().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_RELEASE:
				getProgramRelease().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISOR:
				getProgramSupervisor().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_RESIDENTIAL_INDICATOR:
				getProgramResidentialIndicator().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISED_INDICATOR:
				getProgramSupervisedIndicator().clear();
				return;
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT_GROUP:
				getProgramAugmentationPointGroup().clear();
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
			case _0Package.PROGRAM_TYPE__PROGRAM_PERSON:
				return programPerson != null && !programPerson.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_ACTION:
				return programAction != null && !programAction.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_CAPACITY_QUANTITY:
				return programCapacityQuantity != null && !programCapacityQuantity.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_CONDITION:
				return programCondition != null && !programCondition.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_FACILITY:
				return programFacility != null && !programFacility.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_PUBLICLY_RUN_INDICATOR:
				return programPubliclyRunIndicator != null && !programPubliclyRunIndicator.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_PURPOSE_TEXT:
				return programPurposeText != null && !programPurposeText.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_REFERRAL:
				return programReferral != null && !programReferral.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_ADMINISTRATOR:
				return programAdministrator != null && !programAdministrator.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_RELEASE:
				return programRelease != null && !programRelease.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISOR:
				return programSupervisor != null && !programSupervisor.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_RESIDENTIAL_INDICATOR:
				return programResidentialIndicator != null && !programResidentialIndicator.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_SUPERVISED_INDICATOR:
				return programSupervisedIndicator != null && !programSupervisedIndicator.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT_GROUP:
				return programAugmentationPointGroup != null && !programAugmentationPointGroup.isEmpty();
			case _0Package.PROGRAM_TYPE__PROGRAM_AUGMENTATION_POINT:
				return !getProgramAugmentationPoint().isEmpty();
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
		result.append(" (programAugmentationPointGroup: ");
		result.append(programAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ProgramTypeImpl
