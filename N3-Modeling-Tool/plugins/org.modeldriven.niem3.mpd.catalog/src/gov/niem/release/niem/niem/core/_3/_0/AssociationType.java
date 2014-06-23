/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association, connection, relationship, or involvement somehow linking people, things, and/or activities together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssociationType#getAssociationDateRange <em>Association Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssociationType#getAssociationDescriptionText <em>Association Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssociationType#getAssociationAugmentationPointGroup1 <em>Association Augmentation Point Group1</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AssociationType#getAssociationAugmentationPoint1 <em>Association Augmentation Point1</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssociationType()
 * @model extendedMetaData="name='AssociationType' kind='elementOnly'"
 * @generated
 */
public interface AssociationType extends gov.niem.release.niem.structures._3._0.AssociationType {
	/**
	 * Returns the value of the '<em><b>Association Date Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date range in which an association occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Date Range</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssociationType_AssociationDateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssociationDateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateRangeType> getAssociationDateRange();

	/**
	 * Returns the value of the '<em><b>Association Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of an association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssociationType_AssociationDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AssociationDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAssociationDescriptionText();

	/**
	 * Returns the value of the '<em><b>Association Augmentation Point Group1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Augmentation Point Group1</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssociationType_AssociationAugmentationPointGroup1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAssociationAugmentationPointGroup1();

	/**
	 * Returns the value of the '<em><b>Association Augmentation Point1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Augmentation Point1</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAssociationType_AssociationAugmentationPoint1()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationAugmentationPoint' namespace='##targetNamespace' group='AssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAssociationAugmentationPoint1();

} // AssociationType
