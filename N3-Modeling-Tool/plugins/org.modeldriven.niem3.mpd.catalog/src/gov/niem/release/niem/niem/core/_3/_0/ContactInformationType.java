/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Information Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for how to contact a person or an organization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactMeansGroup <em>Contact Means Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactMeans <em>Contact Means</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactEntity <em>Contact Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactEntityDescriptionText <em>Contact Entity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactInformationDescriptionText <em>Contact Information Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactResponder <em>Contact Responder</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactInformationAugmentationPointGroup <em>Contact Information Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ContactInformationType#getContactInformationAugmentationPoint <em>Contact Information Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType()
 * @model extendedMetaData="name='ContactInformationType' kind='elementOnly'"
 * @generated
 */
public interface ContactInformationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Contact Means Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a means of contacting someone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Means Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactMeansGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContactMeans:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getContactMeansGroup();

	/**
	 * Returns the value of the '<em><b>Contact Means</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a means of contacting someone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Means</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactMeans()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactMeans' namespace='##targetNamespace' group='ContactMeans:group'"
	 * @generated
	 */
	EList<EObject> getContactMeans();

	/**
	 * Returns the value of the '<em><b>Contact Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity that may be contacted by using the given contact information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Entity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactEntity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactEntity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getContactEntity();

	/**
	 * Returns the value of the '<em><b>Contact Entity Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the entity being contacted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Entity Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactEntityDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactEntityDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getContactEntityDescriptionText();

	/**
	 * Returns the value of the '<em><b>Contact Information Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the contact information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactInformationDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactInformationDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getContactInformationDescriptionText();

	/**
	 * Returns the value of the '<em><b>Contact Responder</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A third party person who answers a call and connects or directs the caller to the intended person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Responder</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactResponder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactResponder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getContactResponder();

	/**
	 * Returns the value of the '<em><b>Contact Information Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ContactInformationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactInformationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ContactInformationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getContactInformationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Contact Information Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ContactInformationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getContactInformationType_ContactInformationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactInformationAugmentationPoint' namespace='##targetNamespace' group='ContactInformationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getContactInformationAugmentationPoint();

} // ContactInformationType
