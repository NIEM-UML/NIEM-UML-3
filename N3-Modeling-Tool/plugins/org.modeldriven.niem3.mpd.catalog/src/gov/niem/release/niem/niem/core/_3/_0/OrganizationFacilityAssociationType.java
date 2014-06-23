/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Facility Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an organization and a facility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType#getOrganizationFacilityAssociationAugmentationPointGroup <em>Organization Facility Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.OrganizationFacilityAssociationType#getOrganizationFacilityAssociationAugmentationPoint <em>Organization Facility Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationFacilityAssociationType()
 * @model extendedMetaData="name='OrganizationFacilityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface OrganizationFacilityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Facility</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.FacilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A building, place, or structure that provides a particular service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationFacilityAssociationType_Facility()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facility' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FacilityType> getFacility();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit which conducts some sort of business or operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationFacilityAssociationType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getOrganization();

	/**
	 * Returns the value of the '<em><b>Organization Facility Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:OrganizationFacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Facility Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationFacilityAssociationType_OrganizationFacilityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='OrganizationFacilityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOrganizationFacilityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Organization Facility Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for nc:OrganizationFacilityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Facility Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getOrganizationFacilityAssociationType_OrganizationFacilityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganizationFacilityAssociationAugmentationPoint' namespace='##targetNamespace' group='OrganizationFacilityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getOrganizationFacilityAssociationAugmentationPoint();

} // OrganizationFacilityAssociationType
