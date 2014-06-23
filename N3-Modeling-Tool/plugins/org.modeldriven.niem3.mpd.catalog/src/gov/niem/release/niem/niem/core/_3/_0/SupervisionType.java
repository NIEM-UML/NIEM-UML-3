/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supervision Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an act of officially overseeing, supervising, or keeping track in some capacity of a person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionCurrentIndicator <em>Supervision Current Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionCustodyStatus <em>Supervision Custody Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionFacility <em>Supervision Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionMandatoryIndicator <em>Supervision Mandatory Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionRelease <em>Supervision Release</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionPerson <em>Supervision Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionPersonStatus <em>Supervision Person Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionSupervisor <em>Supervision Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionAugmentationPointGroup <em>Supervision Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SupervisionType#getSupervisionAugmentationPoint <em>Supervision Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType()
 * @model extendedMetaData="name='SupervisionType' kind='elementOnly'"
 * @generated
 */
public interface SupervisionType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Supervision Current Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a subject is currently under supervision; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Current Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionCurrentIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionCurrentIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getSupervisionCurrentIndicator();

	/**
	 * Returns the value of the '<em><b>Supervision Custody Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of the custody of a person under supervision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Custody Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionCustodyStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionCustodyStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getSupervisionCustodyStatus();

	/**
	 * Returns the value of the '<em><b>Supervision Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A facility at which a subject is being supervised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionFacility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionFacility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getSupervisionFacility();

	/**
	 * Returns the value of the '<em><b>Supervision Mandatory Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a supervision of a person is required; false if a supervision is optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Mandatory Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionMandatoryIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionMandatoryIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getSupervisionMandatoryIndicator();

	/**
	 * Returns the value of the '<em><b>Supervision Release</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ReleaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complete and unrestricted release of a subject from a supervision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Release</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionRelease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionRelease' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReleaseType> getSupervisionRelease();

	/**
	 * Returns the value of the '<em><b>Supervision Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is being supervised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getSupervisionPerson();

	/**
	 * Returns the value of the '<em><b>Supervision Person Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of a person under supervision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Person Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionPersonStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionPersonStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getSupervisionPersonStatus();

	/**
	 * Returns the value of the '<em><b>Supervision Supervisor</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that supervises a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Supervisor</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionSupervisor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupervisionSupervisor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getSupervisionSupervisor();

	/**
	 * Returns the value of the '<em><b>Supervision Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SupervisionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SupervisionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSupervisionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Supervision Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SupervisionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supervision Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSupervisionType_SupervisionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupervisionAugmentationPoint' namespace='##targetNamespace' group='SupervisionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getSupervisionAugmentationPoint();

} // SupervisionType
