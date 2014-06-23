/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Container Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an item and something in which it is held.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType#getContainer <em>Container</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType#getItemContainerAssociationAugmentationPointGroup <em>Item Container Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemContainerAssociationType#getItemContainerAssociationAugmentationPoint <em>Item Container Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemContainerAssociationType()
 * @model extendedMetaData="name='ItemContainerAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ItemContainerAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An article or thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemContainerAssociationType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An item that holds something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemContainerAssociationType_Container()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Container' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getContainer();

	/**
	 * Returns the value of the '<em><b>Item Container Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemContainerAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Container Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemContainerAssociationType_ItemContainerAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemContainerAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemContainerAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Container Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemContainerAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Container Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemContainerAssociationType_ItemContainerAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemContainerAssociationAugmentationPoint' namespace='##targetNamespace' group='ItemContainerAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemContainerAssociationAugmentationPoint();

} // ItemContainerAssociationType
