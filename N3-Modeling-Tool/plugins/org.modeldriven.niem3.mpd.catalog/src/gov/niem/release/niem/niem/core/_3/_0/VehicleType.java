/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a conveyance designed to carry an operator, passengers and/or cargo, over land.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleCMVIndicator <em>Vehicle CMV Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleColorInteriorText <em>Vehicle Color Interior Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleDoorQuantity <em>Vehicle Door Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleIdentification <em>Vehicle Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleMakeGroup <em>Vehicle Make Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleMake <em>Vehicle Make</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleModelGroup <em>Vehicle Model Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleMSRPAmount <em>Vehicle MSRP Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleOdometerReadingMeasure <em>Vehicle Odometer Reading Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehiclePassengerSafeQuantity <em>Vehicle Passenger Safe Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleSeatingQuantity <em>Vehicle Seating Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleTransmissionCategoryGroup <em>Vehicle Transmission Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleTransmissionCategory <em>Vehicle Transmission Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleAxleQuantity <em>Vehicle Axle Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleCurrentWeightMeasure <em>Vehicle Current Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleGrossLadenSumWeightMeasure <em>Vehicle Gross Laden Sum Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleGrossLadenUnitWeightMeasure <em>Vehicle Gross Laden Unit Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleMaximumLoadWeightMeasure <em>Vehicle Maximum Load Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleUnladenWeightMeasure <em>Vehicle Unladen Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleAugmentationPointGroup <em>Vehicle Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.VehicleType#getVehicleAugmentationPoint <em>Vehicle Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType()
 * @model extendedMetaData="name='VehicleType' kind='elementOnly'"
 * @generated
 */
public interface VehicleType extends ConveyanceType {
	/**
	 * Returns the value of the '<em><b>Vehicle CMV Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a vehicle is a commercial motor vehicle; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle CMV Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleCMVIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleCMVIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getVehicleCMVIndicator();

	/**
	 * Returns the value of the '<em><b>Vehicle Color Interior Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A color of the interior of a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Color Interior Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleColorInteriorText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleColorInteriorText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getVehicleColorInteriorText();

	/**
	 * Returns the value of the '<em><b>Vehicle Door Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number of doors on a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Door Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleDoorQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleDoorQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getVehicleDoorQuantity();

	/**
	 * Returns the value of the '<em><b>Vehicle Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identification for a specific vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getVehicleIdentification();

	/**
	 * Returns the value of the '<em><b>Vehicle Make Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manufacturer of a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Make Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleMakeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VehicleMake:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVehicleMakeGroup();

	/**
	 * Returns the value of the '<em><b>Vehicle Make</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a manufacturer of a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Make</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleMake()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VehicleMake' namespace='##targetNamespace' group='VehicleMake:group'"
	 * @generated
	 */
	EList<EObject> getVehicleMake();

	/**
	 * Returns the value of the '<em><b>Vehicle Model Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a specific design or class of vehicle made by a manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Model Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleModelGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VehicleModel:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVehicleModelGroup();

	/**
	 * Returns the value of the '<em><b>Vehicle Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a specific design or class of vehicle made by a manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Model</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleModel()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VehicleModel' namespace='##targetNamespace' group='VehicleModel:group'"
	 * @generated
	 */
	EList<EObject> getVehicleModel();

	/**
	 * Returns the value of the '<em><b>Vehicle MSRP Amount</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.AmountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manufacturer's suggested retail price of a vehicle; a price at which a manufacturer recommends a vehicle be sold.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle MSRP Amount</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleMSRPAmount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleMSRPAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AmountType> getVehicleMSRPAmount();

	/**
	 * Returns the value of the '<em><b>Vehicle Odometer Reading Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reading of a vehicle odometer to the nearest mile or kilometer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Odometer Reading Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleOdometerReadingMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleOdometerReadingMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getVehicleOdometerReadingMeasure();

	/**
	 * Returns the value of the '<em><b>Vehicle Passenger Safe Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total number of people a vehicle is designed to safely transport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Passenger Safe Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehiclePassengerSafeQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehiclePassengerSafeQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getVehiclePassengerSafeQuantity();

	/**
	 * Returns the value of the '<em><b>Vehicle Seating Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A total number of seats available in a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Seating Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleSeatingQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleSeatingQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getVehicleSeatingQuantity();

	/**
	 * Returns the value of the '<em><b>Vehicle Transmission Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of transmission unit in a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Transmission Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleTransmissionCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VehicleTransmissionCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVehicleTransmissionCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Vehicle Transmission Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of transmission unit in a vehicle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Transmission Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleTransmissionCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VehicleTransmissionCategory' namespace='##targetNamespace' group='VehicleTransmissionCategory:group'"
	 * @generated
	 */
	EList<EObject> getVehicleTransmissionCategory();

	/**
	 * Returns the value of the '<em><b>Vehicle Axle Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of common axles of rotation of one or more wheels of a vehicle, whether power driven or freely rotating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Axle Quantity</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleAxleQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleAxleQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NonNegativeInteger> getVehicleAxleQuantity();

	/**
	 * Returns the value of the '<em><b>Vehicle Current Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An observed, estimated, or measured weight of the conveyance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Current Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleCurrentWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleCurrentWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getVehicleCurrentWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Vehicle Gross Laden Sum Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sum of values specified by the manufacturer(s) for a truck tractor or trailer for the units that make up a combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Gross Laden Sum Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleGrossLadenSumWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleGrossLadenSumWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getVehicleGrossLadenSumWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Vehicle Gross Laden Unit Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value specified by the manufacturer for a single unit truck, truck tractor, or trailer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Gross Laden Unit Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleGrossLadenUnitWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleGrossLadenUnitWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getVehicleGrossLadenUnitWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Vehicle Maximum Load Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum load weight intended for the vehicle to transport, assigned at the point of manufacture.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Maximum Load Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleMaximumLoadWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleMaximumLoadWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getVehicleMaximumLoadWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Vehicle Unladen Weight Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A weight of a vehicle fully equipped for service, not including the weight of the payload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Unladen Weight Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleUnladenWeightMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleUnladenWeightMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getVehicleUnladenWeightMeasure();

	/**
	 * Returns the value of the '<em><b>Vehicle Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for VehicleType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='VehicleAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getVehicleAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Vehicle Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for VehicleType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getVehicleType_VehicleAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VehicleAugmentationPoint' namespace='##targetNamespace' group='VehicleAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getVehicleAugmentationPoint();

} // VehicleType
