/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highway Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a major public road.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.HighwayType#getHighwayFullText <em>Highway Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.HighwayType#getHighwayName <em>Highway Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.HighwayType#getHighwayID <em>Highway ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.HighwayType#getHighwayPositionText <em>Highway Position Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.HighwayType#getHighwayAugmentationPointGroup <em>Highway Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.HighwayType#getHighwayAugmentationPoint <em>Highway Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType()
 * @model extendedMetaData="name='HighwayType' kind='elementOnly'"
 * @generated
 */
public interface HighwayType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Highway Full Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A complete reference to a highway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highway Full Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType_HighwayFullText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HighwayFullText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getHighwayFullText();

	/**
	 * Returns the value of the '<em><b>Highway Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a highway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highway Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType_HighwayName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HighwayName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getHighwayName();

	/**
	 * Returns the value of the '<em><b>Highway ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of a highway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highway ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType_HighwayID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HighwayID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getHighwayID();

	/**
	 * Returns the value of the '<em><b>Highway Position Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A designation of a specific place on a highway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highway Position Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType_HighwayPositionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HighwayPositionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getHighwayPositionText();

	/**
	 * Returns the value of the '<em><b>Highway Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for HighwayType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highway Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType_HighwayAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='HighwayAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getHighwayAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Highway Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for HighwayType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highway Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getHighwayType_HighwayAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HighwayAugmentationPoint' namespace='##targetNamespace' group='HighwayAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getHighwayAugmentationPoint();

} // HighwayType
