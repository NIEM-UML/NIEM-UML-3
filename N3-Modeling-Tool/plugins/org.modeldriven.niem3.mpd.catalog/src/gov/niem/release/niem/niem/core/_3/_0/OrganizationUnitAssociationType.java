/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Unit Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an organization and another organization or unit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType#getOrganizationUnitAssociationAugmentationPointGroup <em>Organization Unit Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationUnitAssociationType#getOrganizationUnitAssociationAugmentationPoint <em>Organization Unit Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationUnitAssociationType()
 * @model extendedMetaData="name='OrganizationUnitAssociationType' kind='elementOnly'"
 * @generated
 */
public interface OrganizationUnitAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit which conducts some sort of business or operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationUnitAssociationType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

	/**
	 * Returns the value of the '<em><b>Organization Unit</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit of an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Unit</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationUnitAssociationType_OrganizationUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OrganizationUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getOrganizationUnit();

	/**
	 * Returns the value of the '<em><b>Organization Unit Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for OrganizationUnitAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Unit Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationUnitAssociationType_OrganizationUnitAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='OrganizationUnitAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOrganizationUnitAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Organization Unit Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for OrganizationUnitAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Unit Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationUnitAssociationType_OrganizationUnitAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationUnitAssociationAugmentationPoint' namespace='##targetNamespace' group='OrganizationUnitAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getOrganizationUnitAssociationAugmentationPoint();

} // OrganizationUnitAssociationType
