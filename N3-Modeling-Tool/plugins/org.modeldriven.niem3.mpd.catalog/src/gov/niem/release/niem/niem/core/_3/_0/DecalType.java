/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.GMonth;
import gov.niem.release.niem.proxy.xsd._3._0.GYear;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a sticker.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalID <em>Decal ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalColorText <em>Decal Color Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalPeriodGroup <em>Decal Period Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalPeriod <em>Decal Period</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalYearDate <em>Decal Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalMonthDate <em>Decal Month Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalAugmentationPointGroup <em>Decal Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DecalType#getDecalAugmentationPoint <em>Decal Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType()
 * @model extendedMetaData="name='DecalType' kind='elementOnly'"
 * @generated
 */
public interface DecalType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Decal ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier assigned to a decal in a given year.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DecalID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDecalID();

	/**
	 * Returns the value of the '<em><b>Decal Color Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A color of a decal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Color Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalColorText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DecalColorText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDecalColorText();

	/**
	 * Returns the value of the '<em><b>Decal Period Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a lifespan of a decal for which it is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Period Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalPeriodGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DecalPeriod:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDecalPeriodGroup();

	/**
	 * Returns the value of the '<em><b>Decal Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a lifespan of a decal for which it is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Period</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalPeriod()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DecalPeriod' namespace='##targetNamespace' group='DecalPeriod:group'"
	 * @generated
	 */
	EList<EObject> getDecalPeriod();

	/**
	 * Returns the value of the '<em><b>Decal Year Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.GYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A year displayed on a decal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Year Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalYearDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DecalYearDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GYear> getDecalYearDate();

	/**
	 * Returns the value of the '<em><b>Decal Month Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.GMonth}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A month displayed on a decal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Month Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalMonthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DecalMonthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GMonth> getDecalMonthDate();

	/**
	 * Returns the value of the '<em><b>Decal Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DecalType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DecalAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDecalAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Decal Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DecalType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decal Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDecalType_DecalAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DecalAugmentationPoint' namespace='##targetNamespace' group='DecalAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDecalAugmentationPoint();

} // DecalType
