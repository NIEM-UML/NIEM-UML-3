/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Insurance Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between an item and its insurance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType#getInsurance <em>Insurance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType#getItem <em>Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType#getInsurancePolicyHolder <em>Insurance Policy Holder</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType#getRelatedActivity <em>Related Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType#getItemInsuranceAssociationAugmentationPointGroup <em>Item Insurance Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.ItemInsuranceAssociationType#getItemInsuranceAssociationAugmentationPoint <em>Item Insurance Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType()
 * @model extendedMetaData="name='ItemInsuranceAssociationType' kind='elementOnly'"
 * @generated
 */
public interface ItemInsuranceAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.InsuranceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A coverage by a contract whereby one party agrees to indemnify or guarantee another against loss by a specified contingent event or peril.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsuranceType> getInsurance();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An article or thing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getItem();

	/**
	 * Returns the value of the '<em><b>Insurance Policy Holder</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which holds an insurance policy for a property item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insurance Policy Holder</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType_InsurancePolicyHolder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsurancePolicyHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getInsurancePolicyHolder();

	/**
	 * Returns the value of the '<em><b>Related Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity having some relationship or association to another activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Activity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType_RelatedActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelatedActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getRelatedActivity();

	/**
	 * Returns the value of the '<em><b>Item Insurance Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemInsuranceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Insurance Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType_ItemInsuranceAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ItemInsuranceAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getItemInsuranceAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Item Insurance Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for ItemInsuranceAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Insurance Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getItemInsuranceAssociationType_ItemInsuranceAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ItemInsuranceAssociationAugmentationPoint' namespace='##targetNamespace' group='ItemInsuranceAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getItemInsuranceAssociationAugmentationPoint();

} // ItemInsuranceAssociationType
