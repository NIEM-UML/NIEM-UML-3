/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a telephone number for a telecommunication device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType#getTelephoneNumberRepresentationGroup <em>Telephone Number Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType#getTelephoneNumberRepresentation <em>Telephone Number Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType#getTelephoneNumberCategoryGroup <em>Telephone Number Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType#getTelephoneNumberCategory <em>Telephone Number Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType#getTelephoneNumberAugmentationPointGroup <em>Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TelephoneNumberType#getTelephoneNumberAugmentationPoint <em>Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType()
 * @model extendedMetaData="name='TelephoneNumberType' kind='elementOnly'"
 * @generated
 */
public interface TelephoneNumberType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Telephone Number Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Representation Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType_TelephoneNumberRepresentationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TelephoneNumberRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTelephoneNumberRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Telephone Number Representation</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Representation</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType_TelephoneNumberRepresentation()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumberRepresentation' namespace='##targetNamespace' group='TelephoneNumberRepresentation:group'"
	 * @generated
	 */
	EList<EObject> getTelephoneNumberRepresentation();

	/**
	 * Returns the value of the '<em><b>Telephone Number Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType_TelephoneNumberCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TelephoneNumberCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTelephoneNumberCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Telephone Number Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType_TelephoneNumberCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumberCategory' namespace='##targetNamespace' group='TelephoneNumberCategory:group'"
	 * @generated
	 */
	EList<EObject> getTelephoneNumberCategory();

	/**
	 * Returns the value of the '<em><b>Telephone Number Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType_TelephoneNumberAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TelephoneNumberAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTelephoneNumberAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Telephone Number Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTelephoneNumberType_TelephoneNumberAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumberAugmentationPoint' namespace='##targetNamespace' group='TelephoneNumberAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getTelephoneNumberAugmentationPoint();

} // TelephoneNumberType
