/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a number or code assigned to a system to uniquely identify the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemIdentificationType#getSystemName <em>System Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemIdentificationType#getSystemIdentificationAugmentationPointGroup <em>System Identification Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SystemIdentificationType#getSystemIdentificationAugmentationPoint <em>System Identification Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemIdentificationType()
 * @model extendedMetaData="name='SystemIdentificationType' kind='elementOnly'"
 * @generated
 */
public interface SystemIdentificationType extends IdentificationType {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of the kind or the source of a system identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemIdentificationType_SystemName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SystemName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getSystemName();

	/**
	 * Returns the value of the '<em><b>System Identification Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SystemIdentificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Identification Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemIdentificationType_SystemIdentificationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SystemIdentificationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSystemIdentificationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>System Identification Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SystemIdentificationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Identification Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSystemIdentificationType_SystemIdentificationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemIdentificationAugmentationPoint' namespace='##targetNamespace' group='SystemIdentificationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getSystemIdentificationAugmentationPoint();

} // SystemIdentificationType
