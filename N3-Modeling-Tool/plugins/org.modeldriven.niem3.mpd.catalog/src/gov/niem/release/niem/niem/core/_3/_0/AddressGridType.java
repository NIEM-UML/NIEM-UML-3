/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Grid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a location identified by a unit of a grid system overlaid on an area.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressGridType#getAddressGridID <em>Address Grid ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressGridType#getAddressGridText <em>Address Grid Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressGridType#getAddressGridAugmentationPointGroup <em>Address Grid Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.AddressGridType#getAddressGridAugmentationPoint <em>Address Grid Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressGridType()
 * @model extendedMetaData="name='AddressGridType' kind='elementOnly'"
 * @generated
 */
public interface AddressGridType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Address Grid ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that references a unique address grid system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Grid ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressGridType_AddressGridID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressGridID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getAddressGridID();

	/**
	 * Returns the value of the '<em><b>Address Grid Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unit, quadrant, or other subdivision of an address grid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Grid Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressGridType_AddressGridText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressGridText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getAddressGridText();

	/**
	 * Returns the value of the '<em><b>Address Grid Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AddressGridType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Grid Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressGridType_AddressGridAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AddressGridAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAddressGridAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Address Grid Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for AddressGridType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Grid Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getAddressGridType_AddressGridAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressGridAugmentationPoint' namespace='##targetNamespace' group='AddressGridAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getAddressGridAugmentationPoint();

} // AddressGridType
