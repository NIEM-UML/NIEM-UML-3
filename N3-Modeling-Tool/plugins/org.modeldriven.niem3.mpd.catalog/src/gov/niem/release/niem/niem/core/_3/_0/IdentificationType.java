/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a representation of an identity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationID <em>Identification ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationJurisdiction <em>Identification Jurisdiction</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationCategoryGroup <em>Identification Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationCategory <em>Identification Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationCategoryDescriptionText <em>Identification Category Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationEffectiveDate <em>Identification Effective Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationExpirationDate <em>Identification Expiration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationSourceText <em>Identification Source Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationStatus <em>Identification Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationAugmentationPointGroup <em>Identification Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentificationType#getIdentificationAugmentationPoint <em>Identification Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType()
 * @model extendedMetaData="name='IdentificationType' kind='elementOnly'"
 * @generated
 */
public interface IdentificationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Identification ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getIdentificationID();

	/**
	 * Returns the value of the '<em><b>Identification Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.JurisdictionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An area, region, or unit where a unique identification is issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Jurisdiction</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationJurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationJurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JurisdictionType> getIdentificationJurisdiction();

	/**
	 * Returns the value of the '<em><b>Identification Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IdentificationCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIdentificationCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Identification Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IdentificationCategory' namespace='##targetNamespace' group='IdentificationCategory:group'"
	 * @generated
	 */
	EList<EObject> getIdentificationCategory();

	/**
	 * Returns the value of the '<em><b>Identification Category Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a kind of identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Category Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationCategoryDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationCategoryDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIdentificationCategoryDescriptionText();

	/**
	 * Returns the value of the '<em><b>Identification Effective Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date an identification takes effect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Effective Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationEffectiveDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationEffectiveDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIdentificationEffectiveDate();

	/**
	 * Returns the value of the '<em><b>Identification Expiration Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date after which an identification is no longer valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Expiration Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationExpirationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIdentificationExpirationDate();

	/**
	 * Returns the value of the '<em><b>Identification Source Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person, organization, or locale which issues an identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Source Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationSourceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationSourceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIdentificationSourceText();

	/**
	 * Returns the value of the '<em><b>Identification Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of an identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentificationStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getIdentificationStatus();

	/**
	 * Returns the value of the '<em><b>Identification Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IdentificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IdentificationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIdentificationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Identification Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IdentificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identification Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentificationType_IdentificationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IdentificationAugmentationPoint' namespace='##targetNamespace' group='IdentificationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getIdentificationAugmentationPoint();

} // IdentificationType
