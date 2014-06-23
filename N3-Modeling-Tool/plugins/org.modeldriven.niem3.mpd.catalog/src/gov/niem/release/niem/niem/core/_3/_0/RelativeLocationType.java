/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by its proximity to another location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationDescriptionText <em>Relative Location Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationDirectionGroup <em>Relative Location Direction Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationDirection <em>Relative Location Direction</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationDistanceText <em>Relative Location Distance Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationHeadingValue <em>Relative Location Heading Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationReferencePoint <em>Relative Location Reference Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationAugmentationPointGroup <em>Relative Location Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.RelativeLocationType#getRelativeLocationAugmentationPoint <em>Relative Location Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType()
 * @model extendedMetaData="name='RelativeLocationType' kind='elementOnly'"
 * @generated
 */
public interface RelativeLocationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Relative Location Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of how to reach a location from a certain starting point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativeLocationDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getRelativeLocationDescriptionText();

	/**
	 * Returns the value of the '<em><b>Relative Location Direction Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a relative location or movement from a starting point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Direction Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationDirectionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RelativeLocationDirection:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getRelativeLocationDirectionGroup();

	/**
	 * Returns the value of the '<em><b>Relative Location Direction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a relative location or movement from a starting point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Direction</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationDirection()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelativeLocationDirection' namespace='##targetNamespace' group='RelativeLocationDirection:group'"
	 * @generated
	 */
	EList<EObject> getRelativeLocationDirection();

	/**
	 * Returns the value of the '<em><b>Relative Location Distance Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A distance of a location from a starting point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Distance Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationDistanceText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativeLocationDistanceText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getRelativeLocationDistanceText();

	/**
	 * Returns the value of the '<em><b>Relative Location Heading Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.RelativeLocationHeadingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A heading of a direction from a starting point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Heading Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationHeadingValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativeLocationHeadingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelativeLocationHeadingType> getRelativeLocationHeadingValue();

	/**
	 * Returns the value of the '<em><b>Relative Location Reference Point</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A starting point used as a basis to determine the location of another point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Reference Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationReferencePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativeLocationReferencePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getRelativeLocationReferencePoint();

	/**
	 * Returns the value of the '<em><b>Relative Location Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for RelativeLocationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RelativeLocationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getRelativeLocationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Relative Location Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for RelativeLocationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Location Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getRelativeLocationType_RelativeLocationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelativeLocationAugmentationPoint' namespace='##targetNamespace' group='RelativeLocationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getRelativeLocationAugmentationPoint();

} // RelativeLocationType
