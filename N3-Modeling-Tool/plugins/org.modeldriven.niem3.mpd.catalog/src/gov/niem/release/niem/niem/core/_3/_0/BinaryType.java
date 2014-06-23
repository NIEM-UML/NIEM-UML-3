/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.AnyURI;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a digital representation of an object encoded in a binary format.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryID <em>Binary ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryCategoryGroup <em>Binary Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryCategory <em>Binary Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryLocationText <em>Binary Location Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryAvailableIndicator <em>Binary Available Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryObjectGroup <em>Binary Object Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryObject <em>Binary Object</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryCaptureDate <em>Binary Capture Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryCapturer <em>Binary Capturer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryDescriptionText <em>Binary Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryFormatText <em>Binary Format Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryFormatStandardName <em>Binary Format Standard Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryURI <em>Binary URI</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinarySizeValue <em>Binary Size Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryAugmentationPointGroup <em>Binary Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.BinaryType#getBinaryAugmentationPoint <em>Binary Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType()
 * @model extendedMetaData="name='BinaryType' kind='elementOnly'"
 * @generated
 */
public interface BinaryType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Binary ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that references a binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getBinaryID();

	/**
	 * Returns the value of the '<em><b>Binary Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BinaryCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Binary Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryCategory' namespace='##targetNamespace' group='BinaryCategory:group'"
	 * @generated
	 */
	EList<EObject> getBinaryCategory();

	/**
	 * Returns the value of the '<em><b>Binary Location Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A physical location of a binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Location Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryLocationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryLocationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getBinaryLocationText();

	/**
	 * Returns the value of the '<em><b>Binary Available Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a binary is available; false if it is not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Available Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryAvailableIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryAvailableIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getBinaryAvailableIndicator();

	/**
	 * Returns the value of the '<em><b>Binary Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a binary encoding of data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Object Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BinaryObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryObjectGroup();

	/**
	 * Returns the value of the '<em><b>Binary Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a binary encoding of data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Object</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryObject()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryObject' namespace='##targetNamespace' group='BinaryObject:group'"
	 * @generated
	 */
	EList<EObject> getBinaryObject();

	/**
	 * Returns the value of the '<em><b>Binary Capture Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date on which a binary object is captured or created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Capture Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryCaptureDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryCaptureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getBinaryCaptureDate();

	/**
	 * Returns the value of the '<em><b>Binary Capturer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which captured or created a binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Capturer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryCapturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryCapturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getBinaryCapturer();

	/**
	 * Returns the value of the '<em><b>Binary Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of a binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getBinaryDescriptionText();

	/**
	 * Returns the value of the '<em><b>Binary Format Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A file format or content type of a binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Format Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryFormatText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryFormatText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getBinaryFormatText();

	/**
	 * Returns the value of the '<em><b>Binary Format Standard Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a standard or protocol used to classify binary content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Format Standard Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryFormatStandardName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryFormatStandardName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getBinaryFormatStandardName();

	/**
	 * Returns the value of the '<em><b>Binary URI</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.AnyURI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URL or file reference of a binary object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary URI</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryURI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryURI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnyURI> getBinaryURI();

	/**
	 * Returns the value of the '<em><b>Binary Size Value</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.NonNegativeDecimalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A size of a binary object in kilobytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Size Value</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinarySizeValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinarySizeValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeDecimalType> getBinarySizeValue();

	/**
	 * Returns the value of the '<em><b>Binary Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for BinaryType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BinaryAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBinaryAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Binary Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for BinaryType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getBinaryType_BinaryAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryAugmentationPoint' namespace='##targetNamespace' group='BinaryAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getBinaryAugmentationPoint();

} // BinaryType
