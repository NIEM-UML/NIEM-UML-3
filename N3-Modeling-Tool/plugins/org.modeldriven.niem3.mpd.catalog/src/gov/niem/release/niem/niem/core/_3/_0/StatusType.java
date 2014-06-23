/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a state of something or someone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusCommentText <em>Status Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusDateRepresentationGroup <em>Status Date Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusDateRepresentation <em>Status Date Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusDesignatorGroup <em>Status Designator Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusDesignator <em>Status Designator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusDescriptionText <em>Status Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusIssuerIdentification <em>Status Issuer Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusIssuerText <em>Status Issuer Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusAugmentationPointGroup <em>Status Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.StatusType#getStatusAugmentationPoint <em>Status Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType()
 * @model extendedMetaData="name='StatusType' kind='elementOnly'"
 * @generated
 */
public interface StatusType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Status Comment Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment regarding a status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Comment Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusCommentText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusCommentText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStatusCommentText();

	/**
	 * Returns the value of the '<em><b>Status Date Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a date a status is given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date Representation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusDateRepresentationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StatusDateRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStatusDateRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Status Date Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a date a status is given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Date Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusDateRepresentation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusDateRepresentation' namespace='##targetNamespace' group='StatusDateRepresentation:group'"
	 * @generated
	 */
	EList<EObject> getStatusDateRepresentation();

	/**
	 * Returns the value of the '<em><b>Status Designator Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a status or condition of something or someone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Designator Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusDesignatorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StatusDesignator:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStatusDesignatorGroup();

	/**
	 * Returns the value of the '<em><b>Status Designator</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a status or condition of something or someone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Designator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusDesignator()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusDesignator' namespace='##targetNamespace' group='StatusDesignator:group'"
	 * @generated
	 */
	EList<EObject> getStatusDesignator();

	/**
	 * Returns the value of the '<em><b>Status Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a status or condition of something or someone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStatusDescriptionText();

	/**
	 * Returns the value of the '<em><b>Status Issuer Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a person or organization which assigns a status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Issuer Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusIssuerIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusIssuerIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getStatusIssuerIdentification();

	/**
	 * Returns the value of the '<em><b>Status Issuer Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name, identifier, or other reference of a person or organization which assigns a status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Issuer Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusIssuerText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StatusIssuerText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getStatusIssuerText();

	/**
	 * Returns the value of the '<em><b>Status Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for StatusType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StatusAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStatusAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Status Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for StatusType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getStatusType_StatusAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StatusAugmentationPoint' namespace='##targetNamespace' group='StatusAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getStatusAugmentationPoint();

} // StatusType
