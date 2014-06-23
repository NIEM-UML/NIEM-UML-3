/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Information Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between contact information and a an entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactGroup <em>Contact Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContact <em>Contact</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactEntityDescriptionText <em>Contact Entity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactInformationAvailabilityGroup <em>Contact Information Availability Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactInformationAvailability <em>Contact Information Availability</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactInformationAssociationAugmentationPointGroup <em>Contact Information Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationAssociationType#getContactInformationAssociationAugmentationPoint <em>Contact Information Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType()
 * @model extendedMetaData="name='ContactInformationAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ContactInformationAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Contact Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a person or organization to contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='Contact:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getContactGroup();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a person or organization to contact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_Contact()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contact' namespace='##targetNamespace' group='Contact:group'"
	 * @generated
	 */
	EList<EObject> getContact();

	/**
	 * Returns the value of the '<em><b>Contact Entity Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the entity being contacted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Entity Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactEntityDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactEntityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getContactEntityDescriptionText();

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ContactInformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of details about how to contact a person or an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactInformationType> getContactInformation();

	/**
	 * Returns the value of the '<em><b>Contact Information Availability Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a period of time or a situation in which an entity is available to be contacted with the given contact information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Availability Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactInformationAvailabilityGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContactInformationAvailability:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getContactInformationAvailabilityGroup();

	/**
	 * Returns the value of the '<em><b>Contact Information Availability</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a period of time or a situation in which an entity is available to be contacted with the given contact information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Availability</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactInformationAvailability()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactInformationAvailability' namespace='##targetNamespace' group='ContactInformationAvailability:group'"
	 * @generated
	 */
	EList<EObject> getContactInformationAvailability();

	/**
	 * Returns the value of the '<em><b>Contact Information Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ContactInformationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactInformationAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContactInformationAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getContactInformationAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Contact Information Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ContactInformationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationAssociationType_ContactInformationAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactInformationAssociationAugmentationPoint' namespace='##targetNamespace' group='ContactInformationAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getContactInformationAssociationAugmentationPoint();

} // ContactInformationAssociationType
