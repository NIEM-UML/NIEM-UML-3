/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intellectual Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for property that results from original thought or creativity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyRegistrationIdentification <em>Intellectual Property Registration Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyCreationDate <em>Intellectual Property Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyCreationEventText <em>Intellectual Property Creation Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyRegistrationDate <em>Intellectual Property Registration Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyTerminationDate <em>Intellectual Property Termination Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyTerminationEventText <em>Intellectual Property Termination Event Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyAugmentationPointGroup <em>Intellectual Property Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IntellectualPropertyType#getIntellectualPropertyAugmentationPoint <em>Intellectual Property Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType()
 * @model extendedMetaData="name='IntellectualPropertyType' kind='elementOnly'"
 * @generated
 */
public interface IntellectualPropertyType extends IntangibleItemType {
	/**
	 * Returns the value of the '<em><b>Intellectual Property Registration Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a piece of intellectual property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Registration Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyRegistrationIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyRegistrationIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getIntellectualPropertyRegistrationIdentification();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Creation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date that a piece of intellectual property came into existence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Creation Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyCreationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyCreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIntellectualPropertyCreationDate();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Creation Event Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An event that led to the creation of intellectual property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Creation Event Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyCreationEventText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyCreationEventText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIntellectualPropertyCreationEventText();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Registration Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date when intellectual property rights began for the registered owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Registration Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyRegistrationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyRegistrationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIntellectualPropertyRegistrationDate();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Termination Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date when intellectual property is destroyed and/or property or registration rights cease to exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Termination Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyTerminationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyTerminationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getIntellectualPropertyTerminationDate();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Termination Event Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An event that led to the destruction of a piece of intellectual property and/or the termination of registration rights.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Termination Event Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyTerminationEventText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyTerminationEventText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIntellectualPropertyTerminationEventText();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IntellectualPropertyType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IntellectualPropertyAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIntellectualPropertyAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Intellectual Property Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IntellectualPropertyType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intellectual Property Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIntellectualPropertyType_IntellectualPropertyAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IntellectualPropertyAugmentationPoint' namespace='##targetNamespace' group='IntellectualPropertyAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getIntellectualPropertyAugmentationPoint();

} // IntellectualPropertyType
