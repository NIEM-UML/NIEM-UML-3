/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Employment Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a person and an employment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployee <em>Employee</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployer <em>Employer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeDepartmentName <em>Employee Department Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeePositionName <em>Employee Position Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeOccupationGroup <em>Employee Occupation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeOccupation <em>Employee Occupation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeOccupationCategoryGroup <em>Employee Occupation Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeOccupationCategory <em>Employee Occupation Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeRankText <em>Employee Rank Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeIdentification <em>Employee Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmploymentContactInformation <em>Employment Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmploymentLocation <em>Employment Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeShiftText <em>Employee Shift Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeEarningsRateText <em>Employee Earnings Rate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmploymentStatus <em>Employment Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getEmployeeSupervisor <em>Employee Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getPersonEmploymentAssociationAugmentationPointGroup <em>Person Employment Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEmploymentAssociationType#getPersonEmploymentAssociationAugmentationPoint <em>Person Employment Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType()
 * @model extendedMetaData="name='PersonEmploymentAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonEmploymentAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Employee</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who works for a business or a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_Employee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Employee' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getEmployee();

	/**
	 * Returns the value of the '<em><b>Employer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A party/entity (organization or person) who employs a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_Employer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Employer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getEmployer();

	/**
	 * Returns the value of the '<em><b>Employee Department Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a department or other business unit associated with a job position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Department Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeDepartmentName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeeDepartmentName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getEmployeeDepartmentName();

	/**
	 * Returns the value of the '<em><b>Employee Position Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A job name or title of an employee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Position Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeePositionName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeePositionName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getEmployeePositionName();

	/**
	 * Returns the value of the '<em><b>Employee Occupation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a job of an employee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Occupation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeOccupationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='EmployeeOccupation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEmployeeOccupationGroup();

	/**
	 * Returns the value of the '<em><b>Employee Occupation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a job of an employee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Occupation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeOccupation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EmployeeOccupation' namespace='##targetNamespace' group='EmployeeOccupation:group'"
	 * @generated
	 */
	EList<EObject> getEmployeeOccupation();

	/**
	 * Returns the value of the '<em><b>Employee Occupation Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a general kind of job of an employee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Occupation Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeOccupationCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='EmployeeOccupationCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEmployeeOccupationCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Employee Occupation Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a general kind of job of an employee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Occupation Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeOccupationCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EmployeeOccupationCategory' namespace='##targetNamespace' group='EmployeeOccupationCategory:group'"
	 * @generated
	 */
	EList<EObject> getEmployeeOccupationCategory();

	/**
	 * Returns the value of the '<em><b>Employee Rank Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A rank, status, or promotion level of a person within an employment organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Rank Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeRankText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeeRankText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getEmployeeRankText();

	/**
	 * Returns the value of the '<em><b>Employee Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An employment identification number assigned to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeeIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getEmployeeIdentification();

	/**
	 * Returns the value of the '<em><b>Employment Contact Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ContactInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A means of contacting a person at work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Contact Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmploymentContactInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmploymentContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactInformationType> getEmploymentContactInformation();

	/**
	 * Returns the value of the '<em><b>Employment Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where a person works.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmploymentLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmploymentLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getEmploymentLocation();

	/**
	 * Returns the value of the '<em><b>Employee Shift Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of hours or time frame during which a person usually works.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Shift Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeShiftText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeeShiftText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getEmployeeShiftText();

	/**
	 * Returns the value of the '<em><b>Employee Earnings Rate Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A monetary compensation a person receives for employment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Earnings Rate Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeEarningsRateText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeeEarningsRateText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getEmployeeEarningsRateText();

	/**
	 * Returns the value of the '<em><b>Employment Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of employment for a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employment Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmploymentStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmploymentStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getEmploymentStatus();

	/**
	 * Returns the value of the '<em><b>Employee Supervisor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who oversees and manages an employee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Supervisor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_EmployeeSupervisor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EmployeeSupervisor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getEmployeeSupervisor();

	/**
	 * Returns the value of the '<em><b>Person Employment Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonEmploymentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Employment Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_PersonEmploymentAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonEmploymentAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonEmploymentAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Employment Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonEmploymentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Employment Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEmploymentAssociationType_PersonEmploymentAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonEmploymentAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonEmploymentAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonEmploymentAssociationAugmentationPoint();

} // PersonEmploymentAssociationType
