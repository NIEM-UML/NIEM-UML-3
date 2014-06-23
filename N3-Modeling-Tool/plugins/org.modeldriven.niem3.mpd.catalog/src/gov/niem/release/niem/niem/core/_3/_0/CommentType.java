/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a comment, note, or remark providing additional information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CommentType#getCommentAuthorText <em>Comment Author Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CommentType#getCommentCreationDate <em>Comment Creation Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CommentType#getCommentText <em>Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CommentType#getCommentTitleText <em>Comment Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CommentType#getCommentAugmentationPointGroup <em>Comment Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.CommentType#getCommentAugmentationPoint <em>Comment Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType()
 * @model extendedMetaData="name='CommentType' kind='elementOnly'"
 * @generated
 */
public interface CommentType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Comment Author Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name or role of the author of a comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Author Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType_CommentAuthorText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommentAuthorText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCommentAuthorText();

	/**
	 * Returns the value of the '<em><b>Comment Creation Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a comment was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Creation Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType_CommentCreationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommentCreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getCommentCreationDate();

	/**
	 * Returns the value of the '<em><b>Comment Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment, note, or remark providing additional information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType_CommentText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommentText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCommentText();

	/**
	 * Returns the value of the '<em><b>Comment Title Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Title Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType_CommentTitleText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommentTitleText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getCommentTitleText();

	/**
	 * Returns the value of the '<em><b>Comment Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CommentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType_CommentAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CommentAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCommentAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Comment Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for CommentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getCommentType_CommentAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommentAugmentationPoint' namespace='##targetNamespace' group='CommentAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getCommentAugmentationPoint();

} // CommentType
