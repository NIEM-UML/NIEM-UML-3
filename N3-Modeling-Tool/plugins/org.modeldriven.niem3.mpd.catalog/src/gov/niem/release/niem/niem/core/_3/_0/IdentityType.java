/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a set of known aspects or characteristics by which a person is defined or recognized.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityPersonRepresentation <em>Identity Person Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityCreationDate <em>Identity Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityCreationEventText <em>Identity Creation Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityTerminationDate <em>Identity Termination Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityTerminationEventText <em>Identity Termination Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityAugmentationPointGroup <em>Identity Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IdentityType#getIdentityAugmentationPoint <em>Identity Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType()
 * @model extendedMetaData="name='IdentityType' kind='elementOnly'"
 * @generated
 */
public interface IdentityType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Identity Person Representation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of person characteristics used as an identification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Person Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityPersonRepresentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityPersonRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getIdentityPersonRepresentation();

	/**
	 * Returns the value of the '<em><b>Identity Creation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date an identity is created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Creation Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityCreationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityCreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIdentityCreationDate();

	/**
	 * Returns the value of the '<em><b>Identity Creation Event Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An occurrence that leads to the creation of an identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Creation Event Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityCreationEventText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityCreationEventText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIdentityCreationEventText();

	/**
	 * Returns the value of the '<em><b>Identity Termination Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date an identity is cancelled or terminated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Termination Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityTerminationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityTerminationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIdentityTerminationDate();

	/**
	 * Returns the value of the '<em><b>Identity Termination Event Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An occurrence that leads to the termination of an identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Termination Event Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityTerminationEventText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IdentityTerminationEventText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIdentityTerminationEventText();

	/**
	 * Returns the value of the '<em><b>Identity Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IdentityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IdentityAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIdentityAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Identity Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IdentityType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIdentityType_IdentityAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IdentityAugmentationPoint' namespace='##targetNamespace' group='IdentityAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getIdentityAugmentationPoint();

} // IdentityType
