/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Disposition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a result or outcome that happens to a property item after it has been handled or processed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType#getItemDispositionLocation <em>Item Disposition Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType#getItemHoldingOrganization <em>Item Holding Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType#getItemMovingOrganization <em>Item Moving Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType#getItemDispositionAugmentationPointGroup <em>Item Disposition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemDispositionType#getItemDispositionAugmentationPoint <em>Item Disposition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType()
 * @model extendedMetaData="name='ItemDispositionType' kind='elementOnly'"
 * @generated
 */
public interface ItemDispositionType extends DispositionType {
	/**
	 * Returns the value of the '<em><b>Item Disposition Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of a property item after it has been processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Disposition Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType_ItemDispositionLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemDispositionLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getItemDispositionLocation();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An article or thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Item Holding Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is in possession of a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Holding Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType_ItemHoldingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemHoldingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getItemHoldingOrganization();

	/**
	 * Returns the value of the '<em><b>Item Moving Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that moves or relocates a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Moving Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType_ItemMovingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemMovingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getItemMovingOrganization();

	/**
	 * Returns the value of the '<em><b>Item Disposition Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemDispositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Disposition Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType_ItemDispositionAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemDispositionAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemDispositionAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Disposition Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemDispositionType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Disposition Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemDispositionType_ItemDispositionAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemDispositionAugmentationPoint' namespace='##targetNamespace' group='ItemDispositionAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemDispositionAugmentationPoint();

} // ItemDispositionType
