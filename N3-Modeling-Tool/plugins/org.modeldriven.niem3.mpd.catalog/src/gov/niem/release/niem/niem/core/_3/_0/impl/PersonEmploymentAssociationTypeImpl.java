/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Person Employment Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployer <em>Employer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeDepartmentName <em>Employee Department Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeePositionName <em>Employee Position Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeOccupationGroup <em>Employee Occupation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeOccupation <em>Employee Occupation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeOccupationCategoryGroup <em>Employee Occupation Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeOccupationCategory <em>Employee Occupation Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeRankText <em>Employee Rank Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeIdentification <em>Employee Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmploymentContactInformation <em>Employment Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmploymentLocation <em>Employment Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeShiftText <em>Employee Shift Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeEarningsRateText <em>Employee Earnings Rate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmploymentStatus <em>Employment Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getEmployeeSupervisor <em>Employee Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getPersonEmploymentAssociationAugmentationPointGroup <em>Person Employment Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEmploymentAssociationTypeImpl#getPersonEmploymentAssociationAugmentationPoint <em>Person Employment Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonEmploymentAssociationTypeImpl extends AssociationTypeImpl implements PersonEmploymentAssociationType {
	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> employee;

	/**
	 * The cached value of the '{@link #getEmployer() <em>Employer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> employer;

	/**
	 * The cached value of the '{@link #getEmployeeDepartmentName() <em>Employee Department Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeDepartmentName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> employeeDepartmentName;

	/**
	 * The cached value of the '{@link #getEmployeePositionName() <em>Employee Position Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeePositionName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> employeePositionName;

	/**
	 * The cached value of the '{@link #getEmployeeOccupationGroup() <em>Employee Occupation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeOccupationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap employeeOccupationGroup;

	/**
	 * The cached value of the '{@link #getEmployeeOccupationCategoryGroup() <em>Employee Occupation Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeOccupationCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap employeeOccupationCategoryGroup;

	/**
	 * The cached value of the '{@link #getEmployeeRankText() <em>Employee Rank Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeRankText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> employeeRankText;

	/**
	 * The cached value of the '{@link #getEmployeeIdentification() <em>Employee Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> employeeIdentification;

	/**
	 * The cached value of the '{@link #getEmploymentContactInformation() <em>Employment Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> employmentContactInformation;

	/**
	 * The cached value of the '{@link #getEmploymentLocation() <em>Employment Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> employmentLocation;

	/**
	 * The cached value of the '{@link #getEmployeeShiftText() <em>Employee Shift Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeShiftText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> employeeShiftText;

	/**
	 * The cached value of the '{@link #getEmployeeEarningsRateText() <em>Employee Earnings Rate Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeEarningsRateText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> employeeEarningsRateText;

	/**
	 * The cached value of the '{@link #getEmploymentStatus() <em>Employment Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> employmentStatus;

	/**
	 * The cached value of the '{@link #getEmployeeSupervisor() <em>Employee Supervisor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeSupervisor()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> employeeSupervisor;

	/**
	 * The cached value of the '{@link #getPersonEmploymentAssociationAugmentationPointGroup() <em>Person Employment Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEmploymentAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personEmploymentAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonEmploymentAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonEmploymentAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getEmployee() {
		if (employee == null) {
			employee = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE);
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getEmployer() {
		if (employer == null) {
			employer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYER);
		}
		return employer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getEmployeeDepartmentName() {
		if (employeeDepartmentName == null) {
			employeeDepartmentName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_DEPARTMENT_NAME);
		}
		return employeeDepartmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getEmployeePositionName() {
		if (employeePositionName == null) {
			employeePositionName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_POSITION_NAME);
		}
		return employeePositionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEmployeeOccupationGroup() {
		if (employeeOccupationGroup == null) {
			employeeOccupationGroup = new BasicFeatureMap(this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_GROUP);
		}
		return employeeOccupationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEmployeeOccupation() {
		return getEmployeeOccupationGroup().list(_0Package.eINSTANCE.getPersonEmploymentAssociationType_EmployeeOccupation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getEmployeeOccupationCategoryGroup() {
		if (employeeOccupationCategoryGroup == null) {
			employeeOccupationCategoryGroup = new BasicFeatureMap(this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY_GROUP);
		}
		return employeeOccupationCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEmployeeOccupationCategory() {
		return getEmployeeOccupationCategoryGroup().list(_0Package.eINSTANCE.getPersonEmploymentAssociationType_EmployeeOccupationCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getEmployeeRankText() {
		if (employeeRankText == null) {
			employeeRankText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_RANK_TEXT);
		}
		return employeeRankText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getEmployeeIdentification() {
		if (employeeIdentification == null) {
			employeeIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_IDENTIFICATION);
		}
		return employeeIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getEmploymentContactInformation() {
		if (employmentContactInformation == null) {
			employmentContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_CONTACT_INFORMATION);
		}
		return employmentContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getEmploymentLocation() {
		if (employmentLocation == null) {
			employmentLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_LOCATION);
		}
		return employmentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getEmployeeShiftText() {
		if (employeeShiftText == null) {
			employeeShiftText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SHIFT_TEXT);
		}
		return employeeShiftText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getEmployeeEarningsRateText() {
		if (employeeEarningsRateText == null) {
			employeeEarningsRateText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_EARNINGS_RATE_TEXT);
		}
		return employeeEarningsRateText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getEmploymentStatus() {
		if (employmentStatus == null) {
			employmentStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_STATUS);
		}
		return employmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getEmployeeSupervisor() {
		if (employeeSupervisor == null) {
			employeeSupervisor = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SUPERVISOR);
		}
		return employeeSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonEmploymentAssociationAugmentationPointGroup() {
		if (personEmploymentAssociationAugmentationPointGroup == null) {
			personEmploymentAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personEmploymentAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonEmploymentAssociationAugmentationPoint() {
		return getPersonEmploymentAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonEmploymentAssociationType_PersonEmploymentAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE:
				return ((InternalEList<?>)getEmployee()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYER:
				return ((InternalEList<?>)getEmployer()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_DEPARTMENT_NAME:
				return ((InternalEList<?>)getEmployeeDepartmentName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_POSITION_NAME:
				return ((InternalEList<?>)getEmployeePositionName()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_GROUP:
				return ((InternalEList<?>)getEmployeeOccupationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION:
				return ((InternalEList<?>)getEmployeeOccupation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY_GROUP:
				return ((InternalEList<?>)getEmployeeOccupationCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY:
				return ((InternalEList<?>)getEmployeeOccupationCategory()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_RANK_TEXT:
				return ((InternalEList<?>)getEmployeeRankText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_IDENTIFICATION:
				return ((InternalEList<?>)getEmployeeIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_CONTACT_INFORMATION:
				return ((InternalEList<?>)getEmploymentContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_LOCATION:
				return ((InternalEList<?>)getEmploymentLocation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SHIFT_TEXT:
				return ((InternalEList<?>)getEmployeeShiftText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_EARNINGS_RATE_TEXT:
				return ((InternalEList<?>)getEmployeeEarningsRateText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_STATUS:
				return ((InternalEList<?>)getEmploymentStatus()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SUPERVISOR:
				return ((InternalEList<?>)getEmployeeSupervisor()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonEmploymentAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonEmploymentAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE:
				return getEmployee();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYER:
				return getEmployer();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_DEPARTMENT_NAME:
				return getEmployeeDepartmentName();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_POSITION_NAME:
				return getEmployeePositionName();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_GROUP:
				if (coreType) return getEmployeeOccupationGroup();
				return ((FeatureMap.Internal)getEmployeeOccupationGroup()).getWrapper();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION:
				return getEmployeeOccupation();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY_GROUP:
				if (coreType) return getEmployeeOccupationCategoryGroup();
				return ((FeatureMap.Internal)getEmployeeOccupationCategoryGroup()).getWrapper();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY:
				return getEmployeeOccupationCategory();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_RANK_TEXT:
				return getEmployeeRankText();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_IDENTIFICATION:
				return getEmployeeIdentification();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_CONTACT_INFORMATION:
				return getEmploymentContactInformation();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_LOCATION:
				return getEmploymentLocation();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SHIFT_TEXT:
				return getEmployeeShiftText();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_EARNINGS_RATE_TEXT:
				return getEmployeeEarningsRateText();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_STATUS:
				return getEmploymentStatus();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SUPERVISOR:
				return getEmployeeSupervisor();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonEmploymentAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonEmploymentAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonEmploymentAssociationAugmentationPoint();
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
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE:
				getEmployee().clear();
				getEmployee().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYER:
				getEmployer().clear();
				getEmployer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_DEPARTMENT_NAME:
				getEmployeeDepartmentName().clear();
				getEmployeeDepartmentName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_POSITION_NAME:
				getEmployeePositionName().clear();
				getEmployeePositionName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_GROUP:
				((FeatureMap.Internal)getEmployeeOccupationGroup()).set(newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY_GROUP:
				((FeatureMap.Internal)getEmployeeOccupationCategoryGroup()).set(newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_RANK_TEXT:
				getEmployeeRankText().clear();
				getEmployeeRankText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_IDENTIFICATION:
				getEmployeeIdentification().clear();
				getEmployeeIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_CONTACT_INFORMATION:
				getEmploymentContactInformation().clear();
				getEmploymentContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_LOCATION:
				getEmploymentLocation().clear();
				getEmploymentLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SHIFT_TEXT:
				getEmployeeShiftText().clear();
				getEmployeeShiftText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_EARNINGS_RATE_TEXT:
				getEmployeeEarningsRateText().clear();
				getEmployeeEarningsRateText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_STATUS:
				getEmploymentStatus().clear();
				getEmploymentStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SUPERVISOR:
				getEmployeeSupervisor().clear();
				getEmployeeSupervisor().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonEmploymentAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE:
				getEmployee().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYER:
				getEmployer().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_DEPARTMENT_NAME:
				getEmployeeDepartmentName().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_POSITION_NAME:
				getEmployeePositionName().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_GROUP:
				getEmployeeOccupationGroup().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY_GROUP:
				getEmployeeOccupationCategoryGroup().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_RANK_TEXT:
				getEmployeeRankText().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_IDENTIFICATION:
				getEmployeeIdentification().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_CONTACT_INFORMATION:
				getEmploymentContactInformation().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_LOCATION:
				getEmploymentLocation().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SHIFT_TEXT:
				getEmployeeShiftText().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_EARNINGS_RATE_TEXT:
				getEmployeeEarningsRateText().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_STATUS:
				getEmploymentStatus().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SUPERVISOR:
				getEmployeeSupervisor().clear();
				return;
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonEmploymentAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE:
				return employee != null && !employee.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYER:
				return employer != null && !employer.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_DEPARTMENT_NAME:
				return employeeDepartmentName != null && !employeeDepartmentName.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_POSITION_NAME:
				return employeePositionName != null && !employeePositionName.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_GROUP:
				return employeeOccupationGroup != null && !employeeOccupationGroup.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION:
				return !getEmployeeOccupation().isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY_GROUP:
				return employeeOccupationCategoryGroup != null && !employeeOccupationCategoryGroup.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_OCCUPATION_CATEGORY:
				return !getEmployeeOccupationCategory().isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_RANK_TEXT:
				return employeeRankText != null && !employeeRankText.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_IDENTIFICATION:
				return employeeIdentification != null && !employeeIdentification.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_CONTACT_INFORMATION:
				return employmentContactInformation != null && !employmentContactInformation.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_LOCATION:
				return employmentLocation != null && !employmentLocation.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SHIFT_TEXT:
				return employeeShiftText != null && !employeeShiftText.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_EARNINGS_RATE_TEXT:
				return employeeEarningsRateText != null && !employeeEarningsRateText.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYMENT_STATUS:
				return employmentStatus != null && !employmentStatus.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__EMPLOYEE_SUPERVISOR:
				return employeeSupervisor != null && !employeeSupervisor.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personEmploymentAssociationAugmentationPointGroup != null && !personEmploymentAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_EMPLOYMENT_ASSOCIATION_TYPE__PERSON_EMPLOYMENT_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonEmploymentAssociationAugmentationPoint().isEmpty();
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
		result.append(" (employeeOccupationGroup: ");
		result.append(employeeOccupationGroup);
		result.append(", employeeOccupationCategoryGroup: ");
		result.append(employeeOccupationCategoryGroup);
		result.append(", personEmploymentAssociationAugmentationPointGroup: ");
		result.append(personEmploymentAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonEmploymentAssociationTypeImpl
