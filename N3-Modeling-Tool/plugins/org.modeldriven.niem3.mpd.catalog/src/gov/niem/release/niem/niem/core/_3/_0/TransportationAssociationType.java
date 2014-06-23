/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transportation Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a conveyance and the people and/or goods it transported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getConveyance <em>Conveyance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getConveyedItem <em>Conveyed Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getConveyanceOperator <em>Conveyance Operator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getConveyedPerson <em>Conveyed Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getConveyancePassengerQuantity <em>Conveyance Passenger Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getTransportationAssociationAugmentationPointGroup <em>Transportation Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.TransportationAssociationType#getTransportationAssociationAugmentationPoint <em>Transportation Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType()
 * @model extendedMetaData="name='TransportationAssociationType' kind='elementOnly'"
 * @generated
 */
public interface TransportationAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Conveyance</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ConveyanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A means of transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_Conveyance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conveyance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConveyanceType> getConveyance();

	/**
	 * Returns the value of the '<em><b>Conveyed Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An item that is specifically being conveyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed Item</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_ConveyedItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemType> getConveyedItem();

	/**
	 * Returns the value of the '<em><b>Conveyance Operator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who operates or drives a conveyance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Operator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_ConveyanceOperator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyanceOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getConveyanceOperator();

	/**
	 * Returns the value of the '<em><b>Conveyed Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person being conveyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyed Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_ConveyedPerson()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyedPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getConveyedPerson();

	/**
	 * Returns the value of the '<em><b>Conveyance Passenger Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.QuantityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of people in a conveyance excluding the driver.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conveyance Passenger Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_ConveyancePassengerQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConveyancePassengerQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuantityType> getConveyancePassengerQuantity();

	/**
	 * Returns the value of the '<em><b>Transportation Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TransportationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transportation Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_TransportationAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TransportationAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTransportationAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Transportation Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for TransportationAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transportation Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getTransportationAssociationType_TransportationAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransportationAssociationAugmentationPoint' namespace='##targetNamespace' group='TransportationAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getTransportationAssociationAugmentationPoint();

} // TransportationAssociationType
