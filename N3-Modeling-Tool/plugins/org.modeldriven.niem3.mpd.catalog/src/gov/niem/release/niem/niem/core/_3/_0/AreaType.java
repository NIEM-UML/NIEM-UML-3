/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by geographic boundaries.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaDescriptionText <em>Area Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaGeographicGroup <em>Area Geographic Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaGeographic <em>Area Geographic</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaRegionGroup <em>Area Region Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaRegion <em>Area Region</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaAugmentationPointGroup <em>Area Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AreaType#getAreaAugmentationPoint <em>Area Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType()
 * @model extendedMetaData="name='AreaType' kind='elementOnly'"
 * @generated
 */
public interface AreaType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Area Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of an area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AreaDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAreaDescriptionText();

	/**
	 * Returns the value of the '<em><b>Area Geographic Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a local or map-specific geographically-based code used to describe an area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Geographic Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaGeographicGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AreaGeographic:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAreaGeographicGroup();

	/**
	 * Returns the value of the '<em><b>Area Geographic</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a local or map-specific geographically-based code used to describe an area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Geographic</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaGeographic()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AreaGeographic' namespace='##targetNamespace' group='AreaGeographic:group'"
	 * @generated
	 */
	EList<EObject> getAreaGeographic();

	/**
	 * Returns the value of the '<em><b>Area Region Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a location identified by geographic boundaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Region Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaRegionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AreaRegion:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAreaRegionGroup();

	/**
	 * Returns the value of the '<em><b>Area Region</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a location identified by geographic boundaries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Region</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaRegion()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AreaRegion' namespace='##targetNamespace' group='AreaRegion:group'"
	 * @generated
	 */
	EList<EObject> getAreaRegion();

	/**
	 * Returns the value of the '<em><b>Area Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AreaType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AreaAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAreaAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Area Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AreaType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAreaType_AreaAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AreaAugmentationPoint' namespace='##targetNamespace' group='AreaAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAreaAugmentationPoint();

} // AreaType
