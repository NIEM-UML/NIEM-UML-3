/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a combination of names and/or titles by which a person is known.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNamePrefixText <em>Person Name Prefix Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonGivenName <em>Person Given Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonMiddleName <em>Person Middle Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonSurName <em>Person Sur Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameSuffixText <em>Person Name Suffix Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonMaidenName <em>Person Maiden Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonFullName <em>Person Full Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameCategoryGroup <em>Person Name Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameCategory <em>Person Name Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameSalutationText <em>Person Name Salutation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonOfficialGivenName <em>Person Official Given Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonPreferredName <em>Person Preferred Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonSurNamePrefixText <em>Person Sur Name Prefix Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameAugmentationPointGroup <em>Person Name Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameAugmentationPoint <em>Person Name Augmentation Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameCommentText <em>Person Name Comment Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType()
 * @model extendedMetaData="name='PersonNameType' kind='elementOnly'"
 * @generated
 */
public interface PersonNameType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Person Name Prefix Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A title or honorific used by a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Prefix Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNamePrefixText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonNamePrefixText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonNamePrefixText();

	/**
	 * Returns the value of the '<em><b>Person Given Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A first name of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Given Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonGivenName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonGivenName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameTextType> getPersonGivenName();

	/**
	 * Returns the value of the '<em><b>Person Middle Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A middle name of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Middle Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonMiddleName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMiddleName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameTextType> getPersonMiddleName();

	/**
	 * Returns the value of the '<em><b>Person Sur Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A last name or family name of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sur Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonSurName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSurName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameTextType> getPersonSurName();

	/**
	 * Returns the value of the '<em><b>Person Name Suffix Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A term appended after the family name that qualifies the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Suffix Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameSuffixText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonNameSuffixText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonNameSuffixText();

	/**
	 * Returns the value of the '<em><b>Person Maiden Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An original last name or surname of a person before changed by marriage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Maiden Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonMaidenName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonMaidenName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameTextType> getPersonMaidenName();

	/**
	 * Returns the value of the '<em><b>Person Full Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complete name of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Full Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonFullName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonFullName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameTextType> getPersonFullName();

	/**
	 * Returns the value of the '<em><b>Person Name Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of person name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonNameCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonNameCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Person Name Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of person name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonNameCategory' namespace='##targetNamespace' group='PersonNameCategory:group'"
	 * @generated
	 */
	EList<EObject> getPersonNameCategory();

	/**
	 * Returns the value of the '<em><b>Person Name Salutation Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal sign or expression of greeting that is appropriate for this person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Salutation Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameSalutationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonNameSalutationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonNameSalutationText();

	/**
	 * Returns the value of the '<em><b>Person Official Given Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name, out of possibly multiple given names, that a person selects to use as his or her official given name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Official Given Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonOfficialGivenName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonOfficialGivenName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameTextType> getPersonOfficialGivenName();

	/**
	 * Returns the value of the '<em><b>Person Preferred Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name by which this person prefers to be known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Preferred Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonPreferredName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonPreferredName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonPreferredName();

	/**
	 * Returns the value of the '<em><b>Person Sur Name Prefix Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A prefix that precedes this person's family name such as Van, Von.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sur Name Prefix Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonSurNamePrefixText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonSurNamePrefixText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonSurNamePrefixText();

	/**
	 * Returns the value of the '<em><b>Person Name Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonNameType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonNameAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonNameAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Name Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonNameType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonNameAugmentationPoint' namespace='##targetNamespace' group='PersonNameAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonNameAugmentationPoint();

	/**
	 * Returns the value of the '<em><b>Person Name Comment Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment about a kind of name for a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name Comment Text</em>' attribute.
	 * @see #setPersonNameCommentText(String)
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonNameType_PersonNameCommentText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='personNameCommentText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersonNameCommentText();

	/**
	 * Sets the value of the '{@link gov.niem.release.niem.niem.core._3._0.PersonNameType#getPersonNameCommentText <em>Person Name Comment Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name Comment Text</em>' attribute.
	 * @see #getPersonNameCommentText()
	 * @generated
	 */
	void setPersonNameCommentText(String value);

} // PersonNameType
