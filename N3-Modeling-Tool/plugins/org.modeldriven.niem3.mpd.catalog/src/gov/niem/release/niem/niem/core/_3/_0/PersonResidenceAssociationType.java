/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Residence Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a person and a location where that person lives.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType#getResidenceDescriptionText <em>Residence Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType#getResidenceOccupancyCategoryText <em>Residence Occupancy Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType#getResidencePaymentAmount <em>Residence Payment Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType#getResidencePaymentPeriodText <em>Residence Payment Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType#getPersonResidenceAssociationAugmentationPointGroup <em>Person Residence Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonResidenceAssociationType#getPersonResidenceAssociationAugmentationPoint <em>Person Residence Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType()
 * @model extendedMetaData="name='PersonResidenceAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonResidenceAssociationType extends PersonLocationAssociationType {
	/**
	 * Returns the value of the '<em><b>Residence Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general description of a place in which a person lives.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residence Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType_ResidenceDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResidenceDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getResidenceDescriptionText();

	/**
	 * Returns the value of the '<em><b>Residence Occupancy Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of occupancy of a residence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residence Occupancy Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType_ResidenceOccupancyCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResidenceOccupancyCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getResidenceOccupancyCategoryText();

	/**
	 * Returns the value of the '<em><b>Residence Payment Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount of money a person pays each payment period to live at a residence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residence Payment Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType_ResidencePaymentAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResidencePaymentAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AmountType> getResidencePaymentAmount();

	/**
	 * Returns the value of the '<em><b>Residence Payment Period Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An interval or period for which a person is required to make regular residence payments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Residence Payment Period Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType_ResidencePaymentPeriodText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResidencePaymentPeriodText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getResidencePaymentPeriodText();

	/**
	 * Returns the value of the '<em><b>Person Residence Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonResidenceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Residence Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType_PersonResidenceAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonResidenceAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonResidenceAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Residence Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonResidenceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Residence Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonResidenceAssociationType_PersonResidenceAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonResidenceAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonResidenceAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonResidenceAssociationAugmentationPoint();

} // PersonResidenceAssociationType
