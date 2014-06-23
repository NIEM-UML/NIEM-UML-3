/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Organization Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a person and an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType#getPersonOrganizationAssociationAugmentationPointGroup <em>Person Organization Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonOrganizationAssociationType#getPersonOrganizationAssociationAugmentationPoint <em>Person Organization Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonOrganizationAssociationType()
 * @model extendedMetaData="name='PersonOrganizationAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonOrganizationAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human being.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonOrganizationAssociationType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit which conducts some sort of business or operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonOrganizationAssociationType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

	/**
	 * Returns the value of the '<em><b>Person Organization Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonOrganizationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Organization Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonOrganizationAssociationType_PersonOrganizationAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonOrganizationAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonOrganizationAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Organization Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonOrganizationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Organization Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonOrganizationAssociationType_PersonOrganizationAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonOrganizationAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonOrganizationAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonOrganizationAssociationAugmentationPoint();

} // PersonOrganizationAssociationType
