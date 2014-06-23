/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Disunion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a legal termination of a Person Union.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType#getPersonDisunionDecreeIndicator <em>Person Disunion Decree Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType#getPersonDisunionPendingIndicator <em>Person Disunion Pending Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType#getPersonDisunionReasonText <em>Person Disunion Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType#getPersonDisunionAugmentationPointGroup <em>Person Disunion Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDisunionType#getPersonDisunionAugmentationPoint <em>Person Disunion Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDisunionType()
 * @model extendedMetaData="name='PersonDisunionType' kind='elementOnly'"
 * @generated
 */
public interface PersonDisunionType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Person Disunion Decree Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a legal document finalizing the Person Disunion exists (for example, a divorce decree); false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disunion Decree Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDisunionType_PersonDisunionDecreeIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDisunionDecreeIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonDisunionDecreeIndicator();

	/**
	 * Returns the value of the '<em><b>Person Disunion Pending Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the legal proceeding to terminate the Person Union is pending; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disunion Pending Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDisunionType_PersonDisunionPendingIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDisunionPendingIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonDisunionPendingIndicator();

	/**
	 * Returns the value of the '<em><b>Person Disunion Reason Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reason for the disunion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disunion Reason Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDisunionType_PersonDisunionReasonText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDisunionReasonText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getPersonDisunionReasonText();

	/**
	 * Returns the value of the '<em><b>Person Disunion Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonDisunionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disunion Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDisunionType_PersonDisunionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonDisunionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonDisunionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Disunion Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonDisunionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Disunion Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDisunionType_PersonDisunionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonDisunionAugmentationPoint' namespace='##targetNamespace' group='PersonDisunionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonDisunionAugmentationPoint();

} // PersonDisunionType
