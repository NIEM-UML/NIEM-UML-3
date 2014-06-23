/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Entity Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an item and an entity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType#getEntity <em>Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType#getItemEntityAssociationAugmentationPointGroup <em>Item Entity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemEntityAssociationType#getItemEntityAssociationAugmentationPoint <em>Item Entity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemEntityAssociationType()
 * @model extendedMetaData="name='ItemEntityAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ItemEntityAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person, organization, or thing capable of bearing legal rights and responsibilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemEntityAssociationType_Entity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Entity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getEntity();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An article or thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemEntityAssociationType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Item Entity Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemEntityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Entity Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemEntityAssociationType_ItemEntityAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemEntityAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemEntityAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Entity Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemEntityAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Entity Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemEntityAssociationType_ItemEntityAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemEntityAssociationAugmentationPoint' namespace='##targetNamespace' group='ItemEntityAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemEntityAssociationAugmentationPoint();

} // ItemEntityAssociationType
