/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Contact Information Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a location and contact information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType#getLocationContactInformationAssociationAugmentationPointGroup <em>Location Contact Information Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType#getLocationContactInformationAssociationAugmentationPoint <em>Location Contact Information Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationContactInformationAssociationType()
 * @model extendedMetaData="name='LocationContactInformationAssociationType' kind='elementOnly'"
 * @generated
 */
public interface LocationContactInformationAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A geospatial location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationContactInformationAssociationType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getLocation();

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ContactInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details about how to contact a person or an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationContactInformationAssociationType_ContactInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactInformationType> getContactInformation();

	/**
	 * Returns the value of the '<em><b>Location Contact Information Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocationContactInformationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Contact Information Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationContactInformationAssociationType_LocationContactInformationAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LocationContactInformationAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLocationContactInformationAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Location Contact Information Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for LocationContactInformationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Contact Information Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getLocationContactInformationAssociationType_LocationContactInformationAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocationContactInformationAssociationAugmentationPoint' namespace='##targetNamespace' group='LocationContactInformationAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getLocationContactInformationAssociationAugmentationPoint();

} // LocationContactInformationAssociationType
