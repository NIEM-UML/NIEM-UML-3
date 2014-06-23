/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Dial Telephone Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a telephone number consisting of a shortened sequence of numbers that can be used within a local telephone system, such as a particular network or a corporate phone system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType#getDirectDialTelephoneNetworkText <em>Direct Dial Telephone Network Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType#getDirectDialTelephoneNumberID <em>Direct Dial Telephone Number ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType#getDirectDialTelephoneNumberAugmentationPointGroup <em>Direct Dial Telephone Number Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.DirectDialTelephoneNumberType#getDirectDialTelephoneNumberAugmentationPoint <em>Direct Dial Telephone Number Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDirectDialTelephoneNumberType()
 * @model extendedMetaData="name='DirectDialTelephoneNumberType' kind='elementOnly'"
 * @generated
 */
public interface DirectDialTelephoneNumberType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Direct Dial Telephone Network Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A network on which a shortened telephone number may be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Dial Telephone Network Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDirectDialTelephoneNumberType_DirectDialTelephoneNetworkText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectDialTelephoneNetworkText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getDirectDialTelephoneNetworkText();

	/**
	 * Returns the value of the '<em><b>Direct Dial Telephone Number ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A shortened sequence of numbers that can be used in place of a full telephone number within a local calling system such as a particular network or corporate phone system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Dial Telephone Number ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDirectDialTelephoneNumberType_DirectDialTelephoneNumberID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectDialTelephoneNumberID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getDirectDialTelephoneNumberID();

	/**
	 * Returns the value of the '<em><b>Direct Dial Telephone Number Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DirectDialTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Dial Telephone Number Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDirectDialTelephoneNumberType_DirectDialTelephoneNumberAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DirectDialTelephoneNumberAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDirectDialTelephoneNumberAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Direct Dial Telephone Number Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for DirectDialTelephoneNumberType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direct Dial Telephone Number Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getDirectDialTelephoneNumberType_DirectDialTelephoneNumberAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DirectDialTelephoneNumberAugmentationPoint' namespace='##targetNamespace' group='DirectDialTelephoneNumberAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getDirectDialTelephoneNumberAugmentationPoint();

} // DirectDialTelephoneNumberType
