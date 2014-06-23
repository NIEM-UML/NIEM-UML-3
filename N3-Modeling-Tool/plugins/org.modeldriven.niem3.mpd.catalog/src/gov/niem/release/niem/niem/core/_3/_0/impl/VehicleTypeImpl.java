/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AmountType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.MeasureType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0.VehicleType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleCMVIndicator <em>Vehicle CMV Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleColorInteriorText <em>Vehicle Color Interior Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleDoorQuantity <em>Vehicle Door Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleIdentification <em>Vehicle Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleMakeGroup <em>Vehicle Make Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleMake <em>Vehicle Make</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleModelGroup <em>Vehicle Model Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleMSRPAmount <em>Vehicle MSRP Amount</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleOdometerReadingMeasure <em>Vehicle Odometer Reading Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehiclePassengerSafeQuantity <em>Vehicle Passenger Safe Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleSeatingQuantity <em>Vehicle Seating Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleTransmissionCategoryGroup <em>Vehicle Transmission Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleTransmissionCategory <em>Vehicle Transmission Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleAxleQuantity <em>Vehicle Axle Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleCurrentWeightMeasure <em>Vehicle Current Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleGrossLadenSumWeightMeasure <em>Vehicle Gross Laden Sum Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleGrossLadenUnitWeightMeasure <em>Vehicle Gross Laden Unit Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleMaximumLoadWeightMeasure <em>Vehicle Maximum Load Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleUnladenWeightMeasure <em>Vehicle Unladen Weight Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleAugmentationPointGroup <em>Vehicle Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VehicleTypeImpl#getVehicleAugmentationPoint <em>Vehicle Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleTypeImpl extends ConveyanceTypeImpl implements VehicleType {
	/**
	 * The cached value of the '{@link #getVehicleCMVIndicator() <em>Vehicle CMV Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleCMVIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> vehicleCMVIndicator;

	/**
	 * The cached value of the '{@link #getVehicleColorInteriorText() <em>Vehicle Color Interior Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleColorInteriorText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> vehicleColorInteriorText;

	/**
	 * The cached value of the '{@link #getVehicleDoorQuantity() <em>Vehicle Door Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleDoorQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> vehicleDoorQuantity;

	/**
	 * The cached value of the '{@link #getVehicleIdentification() <em>Vehicle Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> vehicleIdentification;

	/**
	 * The cached value of the '{@link #getVehicleMakeGroup() <em>Vehicle Make Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMakeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vehicleMakeGroup;

	/**
	 * The cached value of the '{@link #getVehicleModelGroup() <em>Vehicle Model Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleModelGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vehicleModelGroup;

	/**
	 * The cached value of the '{@link #getVehicleMSRPAmount() <em>Vehicle MSRP Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMSRPAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<AmountType> vehicleMSRPAmount;

	/**
	 * The cached value of the '{@link #getVehicleOdometerReadingMeasure() <em>Vehicle Odometer Reading Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleOdometerReadingMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> vehicleOdometerReadingMeasure;

	/**
	 * The cached value of the '{@link #getVehiclePassengerSafeQuantity() <em>Vehicle Passenger Safe Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehiclePassengerSafeQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> vehiclePassengerSafeQuantity;

	/**
	 * The cached value of the '{@link #getVehicleSeatingQuantity() <em>Vehicle Seating Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleSeatingQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> vehicleSeatingQuantity;

	/**
	 * The cached value of the '{@link #getVehicleTransmissionCategoryGroup() <em>Vehicle Transmission Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleTransmissionCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vehicleTransmissionCategoryGroup;

	/**
	 * The cached value of the '{@link #getVehicleAxleQuantity() <em>Vehicle Axle Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleAxleQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> vehicleAxleQuantity;

	/**
	 * The cached value of the '{@link #getVehicleCurrentWeightMeasure() <em>Vehicle Current Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleCurrentWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> vehicleCurrentWeightMeasure;

	/**
	 * The cached value of the '{@link #getVehicleGrossLadenSumWeightMeasure() <em>Vehicle Gross Laden Sum Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleGrossLadenSumWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> vehicleGrossLadenSumWeightMeasure;

	/**
	 * The cached value of the '{@link #getVehicleGrossLadenUnitWeightMeasure() <em>Vehicle Gross Laden Unit Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleGrossLadenUnitWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> vehicleGrossLadenUnitWeightMeasure;

	/**
	 * The cached value of the '{@link #getVehicleMaximumLoadWeightMeasure() <em>Vehicle Maximum Load Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleMaximumLoadWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> vehicleMaximumLoadWeightMeasure;

	/**
	 * The cached value of the '{@link #getVehicleUnladenWeightMeasure() <em>Vehicle Unladen Weight Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleUnladenWeightMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> vehicleUnladenWeightMeasure;

	/**
	 * The cached value of the '{@link #getVehicleAugmentationPointGroup() <em>Vehicle Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vehicleAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getVehicleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getVehicleCMVIndicator() {
		if (vehicleCMVIndicator == null) {
			vehicleCMVIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.VEHICLE_TYPE__VEHICLE_CMV_INDICATOR);
		}
		return vehicleCMVIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getVehicleColorInteriorText() {
		if (vehicleColorInteriorText == null) {
			vehicleColorInteriorText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_COLOR_INTERIOR_TEXT);
		}
		return vehicleColorInteriorText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getVehicleDoorQuantity() {
		if (vehicleDoorQuantity == null) {
			vehicleDoorQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.VEHICLE_TYPE__VEHICLE_DOOR_QUANTITY);
		}
		return vehicleDoorQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getVehicleIdentification() {
		if (vehicleIdentification == null) {
			vehicleIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_IDENTIFICATION);
		}
		return vehicleIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVehicleMakeGroup() {
		if (vehicleMakeGroup == null) {
			vehicleMakeGroup = new BasicFeatureMap(this, _0Package.VEHICLE_TYPE__VEHICLE_MAKE_GROUP);
		}
		return vehicleMakeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVehicleMake() {
		return getVehicleMakeGroup().list(_0Package.eINSTANCE.getVehicleType_VehicleMake());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVehicleModelGroup() {
		if (vehicleModelGroup == null) {
			vehicleModelGroup = new BasicFeatureMap(this, _0Package.VEHICLE_TYPE__VEHICLE_MODEL_GROUP);
		}
		return vehicleModelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVehicleModel() {
		return getVehicleModelGroup().list(_0Package.eINSTANCE.getVehicleType_VehicleModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmountType> getVehicleMSRPAmount() {
		if (vehicleMSRPAmount == null) {
			vehicleMSRPAmount = new EObjectContainmentEList<AmountType>(AmountType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_MSRP_AMOUNT);
		}
		return vehicleMSRPAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getVehicleOdometerReadingMeasure() {
		if (vehicleOdometerReadingMeasure == null) {
			vehicleOdometerReadingMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_ODOMETER_READING_MEASURE);
		}
		return vehicleOdometerReadingMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getVehiclePassengerSafeQuantity() {
		if (vehiclePassengerSafeQuantity == null) {
			vehiclePassengerSafeQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.VEHICLE_TYPE__VEHICLE_PASSENGER_SAFE_QUANTITY);
		}
		return vehiclePassengerSafeQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getVehicleSeatingQuantity() {
		if (vehicleSeatingQuantity == null) {
			vehicleSeatingQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.VEHICLE_TYPE__VEHICLE_SEATING_QUANTITY);
		}
		return vehicleSeatingQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVehicleTransmissionCategoryGroup() {
		if (vehicleTransmissionCategoryGroup == null) {
			vehicleTransmissionCategoryGroup = new BasicFeatureMap(this, _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY_GROUP);
		}
		return vehicleTransmissionCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVehicleTransmissionCategory() {
		return getVehicleTransmissionCategoryGroup().list(_0Package.eINSTANCE.getVehicleType_VehicleTransmissionCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getVehicleAxleQuantity() {
		if (vehicleAxleQuantity == null) {
			vehicleAxleQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.VEHICLE_TYPE__VEHICLE_AXLE_QUANTITY);
		}
		return vehicleAxleQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getVehicleCurrentWeightMeasure() {
		if (vehicleCurrentWeightMeasure == null) {
			vehicleCurrentWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_CURRENT_WEIGHT_MEASURE);
		}
		return vehicleCurrentWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getVehicleGrossLadenSumWeightMeasure() {
		if (vehicleGrossLadenSumWeightMeasure == null) {
			vehicleGrossLadenSumWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_SUM_WEIGHT_MEASURE);
		}
		return vehicleGrossLadenSumWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getVehicleGrossLadenUnitWeightMeasure() {
		if (vehicleGrossLadenUnitWeightMeasure == null) {
			vehicleGrossLadenUnitWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_UNIT_WEIGHT_MEASURE);
		}
		return vehicleGrossLadenUnitWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getVehicleMaximumLoadWeightMeasure() {
		if (vehicleMaximumLoadWeightMeasure == null) {
			vehicleMaximumLoadWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_MAXIMUM_LOAD_WEIGHT_MEASURE);
		}
		return vehicleMaximumLoadWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getVehicleUnladenWeightMeasure() {
		if (vehicleUnladenWeightMeasure == null) {
			vehicleUnladenWeightMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.VEHICLE_TYPE__VEHICLE_UNLADEN_WEIGHT_MEASURE);
		}
		return vehicleUnladenWeightMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVehicleAugmentationPointGroup() {
		if (vehicleAugmentationPointGroup == null) {
			vehicleAugmentationPointGroup = new BasicFeatureMap(this, _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT_GROUP);
		}
		return vehicleAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVehicleAugmentationPoint() {
		return getVehicleAugmentationPointGroup().list(_0Package.eINSTANCE.getVehicleType_VehicleAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.VEHICLE_TYPE__VEHICLE_CMV_INDICATOR:
				return ((InternalEList<?>)getVehicleCMVIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_COLOR_INTERIOR_TEXT:
				return ((InternalEList<?>)getVehicleColorInteriorText()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_DOOR_QUANTITY:
				return ((InternalEList<?>)getVehicleDoorQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_IDENTIFICATION:
				return ((InternalEList<?>)getVehicleIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE_GROUP:
				return ((InternalEList<?>)getVehicleMakeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE:
				return ((InternalEList<?>)getVehicleMake()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL_GROUP:
				return ((InternalEList<?>)getVehicleModelGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL:
				return ((InternalEList<?>)getVehicleModel()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_MSRP_AMOUNT:
				return ((InternalEList<?>)getVehicleMSRPAmount()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_ODOMETER_READING_MEASURE:
				return ((InternalEList<?>)getVehicleOdometerReadingMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_PASSENGER_SAFE_QUANTITY:
				return ((InternalEList<?>)getVehiclePassengerSafeQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_SEATING_QUANTITY:
				return ((InternalEList<?>)getVehicleSeatingQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY_GROUP:
				return ((InternalEList<?>)getVehicleTransmissionCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY:
				return ((InternalEList<?>)getVehicleTransmissionCategory()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_AXLE_QUANTITY:
				return ((InternalEList<?>)getVehicleAxleQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_CURRENT_WEIGHT_MEASURE:
				return ((InternalEList<?>)getVehicleCurrentWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_SUM_WEIGHT_MEASURE:
				return ((InternalEList<?>)getVehicleGrossLadenSumWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_UNIT_WEIGHT_MEASURE:
				return ((InternalEList<?>)getVehicleGrossLadenUnitWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_MAXIMUM_LOAD_WEIGHT_MEASURE:
				return ((InternalEList<?>)getVehicleMaximumLoadWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_UNLADEN_WEIGHT_MEASURE:
				return ((InternalEList<?>)getVehicleUnladenWeightMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getVehicleAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getVehicleAugmentationPoint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _0Package.VEHICLE_TYPE__VEHICLE_CMV_INDICATOR:
				return getVehicleCMVIndicator();
			case _0Package.VEHICLE_TYPE__VEHICLE_COLOR_INTERIOR_TEXT:
				return getVehicleColorInteriorText();
			case _0Package.VEHICLE_TYPE__VEHICLE_DOOR_QUANTITY:
				return getVehicleDoorQuantity();
			case _0Package.VEHICLE_TYPE__VEHICLE_IDENTIFICATION:
				return getVehicleIdentification();
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE_GROUP:
				if (coreType) return getVehicleMakeGroup();
				return ((FeatureMap.Internal)getVehicleMakeGroup()).getWrapper();
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE:
				return getVehicleMake();
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL_GROUP:
				if (coreType) return getVehicleModelGroup();
				return ((FeatureMap.Internal)getVehicleModelGroup()).getWrapper();
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL:
				return getVehicleModel();
			case _0Package.VEHICLE_TYPE__VEHICLE_MSRP_AMOUNT:
				return getVehicleMSRPAmount();
			case _0Package.VEHICLE_TYPE__VEHICLE_ODOMETER_READING_MEASURE:
				return getVehicleOdometerReadingMeasure();
			case _0Package.VEHICLE_TYPE__VEHICLE_PASSENGER_SAFE_QUANTITY:
				return getVehiclePassengerSafeQuantity();
			case _0Package.VEHICLE_TYPE__VEHICLE_SEATING_QUANTITY:
				return getVehicleSeatingQuantity();
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY_GROUP:
				if (coreType) return getVehicleTransmissionCategoryGroup();
				return ((FeatureMap.Internal)getVehicleTransmissionCategoryGroup()).getWrapper();
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY:
				return getVehicleTransmissionCategory();
			case _0Package.VEHICLE_TYPE__VEHICLE_AXLE_QUANTITY:
				return getVehicleAxleQuantity();
			case _0Package.VEHICLE_TYPE__VEHICLE_CURRENT_WEIGHT_MEASURE:
				return getVehicleCurrentWeightMeasure();
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_SUM_WEIGHT_MEASURE:
				return getVehicleGrossLadenSumWeightMeasure();
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_UNIT_WEIGHT_MEASURE:
				return getVehicleGrossLadenUnitWeightMeasure();
			case _0Package.VEHICLE_TYPE__VEHICLE_MAXIMUM_LOAD_WEIGHT_MEASURE:
				return getVehicleMaximumLoadWeightMeasure();
			case _0Package.VEHICLE_TYPE__VEHICLE_UNLADEN_WEIGHT_MEASURE:
				return getVehicleUnladenWeightMeasure();
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getVehicleAugmentationPointGroup();
				return ((FeatureMap.Internal)getVehicleAugmentationPointGroup()).getWrapper();
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT:
				return getVehicleAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.VEHICLE_TYPE__VEHICLE_CMV_INDICATOR:
				getVehicleCMVIndicator().clear();
				getVehicleCMVIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_COLOR_INTERIOR_TEXT:
				getVehicleColorInteriorText().clear();
				getVehicleColorInteriorText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_DOOR_QUANTITY:
				getVehicleDoorQuantity().clear();
				getVehicleDoorQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_IDENTIFICATION:
				getVehicleIdentification().clear();
				getVehicleIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE_GROUP:
				((FeatureMap.Internal)getVehicleMakeGroup()).set(newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL_GROUP:
				((FeatureMap.Internal)getVehicleModelGroup()).set(newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MSRP_AMOUNT:
				getVehicleMSRPAmount().clear();
				getVehicleMSRPAmount().addAll((Collection<? extends AmountType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_ODOMETER_READING_MEASURE:
				getVehicleOdometerReadingMeasure().clear();
				getVehicleOdometerReadingMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_PASSENGER_SAFE_QUANTITY:
				getVehiclePassengerSafeQuantity().clear();
				getVehiclePassengerSafeQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_SEATING_QUANTITY:
				getVehicleSeatingQuantity().clear();
				getVehicleSeatingQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY_GROUP:
				((FeatureMap.Internal)getVehicleTransmissionCategoryGroup()).set(newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_AXLE_QUANTITY:
				getVehicleAxleQuantity().clear();
				getVehicleAxleQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_CURRENT_WEIGHT_MEASURE:
				getVehicleCurrentWeightMeasure().clear();
				getVehicleCurrentWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_SUM_WEIGHT_MEASURE:
				getVehicleGrossLadenSumWeightMeasure().clear();
				getVehicleGrossLadenSumWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_UNIT_WEIGHT_MEASURE:
				getVehicleGrossLadenUnitWeightMeasure().clear();
				getVehicleGrossLadenUnitWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MAXIMUM_LOAD_WEIGHT_MEASURE:
				getVehicleMaximumLoadWeightMeasure().clear();
				getVehicleMaximumLoadWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_UNLADEN_WEIGHT_MEASURE:
				getVehicleUnladenWeightMeasure().clear();
				getVehicleUnladenWeightMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getVehicleAugmentationPointGroup()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _0Package.VEHICLE_TYPE__VEHICLE_CMV_INDICATOR:
				getVehicleCMVIndicator().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_COLOR_INTERIOR_TEXT:
				getVehicleColorInteriorText().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_DOOR_QUANTITY:
				getVehicleDoorQuantity().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_IDENTIFICATION:
				getVehicleIdentification().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE_GROUP:
				getVehicleMakeGroup().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL_GROUP:
				getVehicleModelGroup().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MSRP_AMOUNT:
				getVehicleMSRPAmount().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_ODOMETER_READING_MEASURE:
				getVehicleOdometerReadingMeasure().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_PASSENGER_SAFE_QUANTITY:
				getVehiclePassengerSafeQuantity().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_SEATING_QUANTITY:
				getVehicleSeatingQuantity().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY_GROUP:
				getVehicleTransmissionCategoryGroup().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_AXLE_QUANTITY:
				getVehicleAxleQuantity().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_CURRENT_WEIGHT_MEASURE:
				getVehicleCurrentWeightMeasure().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_SUM_WEIGHT_MEASURE:
				getVehicleGrossLadenSumWeightMeasure().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_UNIT_WEIGHT_MEASURE:
				getVehicleGrossLadenUnitWeightMeasure().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_MAXIMUM_LOAD_WEIGHT_MEASURE:
				getVehicleMaximumLoadWeightMeasure().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_UNLADEN_WEIGHT_MEASURE:
				getVehicleUnladenWeightMeasure().clear();
				return;
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT_GROUP:
				getVehicleAugmentationPointGroup().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _0Package.VEHICLE_TYPE__VEHICLE_CMV_INDICATOR:
				return vehicleCMVIndicator != null && !vehicleCMVIndicator.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_COLOR_INTERIOR_TEXT:
				return vehicleColorInteriorText != null && !vehicleColorInteriorText.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_DOOR_QUANTITY:
				return vehicleDoorQuantity != null && !vehicleDoorQuantity.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_IDENTIFICATION:
				return vehicleIdentification != null && !vehicleIdentification.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE_GROUP:
				return vehicleMakeGroup != null && !vehicleMakeGroup.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_MAKE:
				return !getVehicleMake().isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL_GROUP:
				return vehicleModelGroup != null && !vehicleModelGroup.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_MODEL:
				return !getVehicleModel().isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_MSRP_AMOUNT:
				return vehicleMSRPAmount != null && !vehicleMSRPAmount.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_ODOMETER_READING_MEASURE:
				return vehicleOdometerReadingMeasure != null && !vehicleOdometerReadingMeasure.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_PASSENGER_SAFE_QUANTITY:
				return vehiclePassengerSafeQuantity != null && !vehiclePassengerSafeQuantity.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_SEATING_QUANTITY:
				return vehicleSeatingQuantity != null && !vehicleSeatingQuantity.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY_GROUP:
				return vehicleTransmissionCategoryGroup != null && !vehicleTransmissionCategoryGroup.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_TRANSMISSION_CATEGORY:
				return !getVehicleTransmissionCategory().isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_AXLE_QUANTITY:
				return vehicleAxleQuantity != null && !vehicleAxleQuantity.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_CURRENT_WEIGHT_MEASURE:
				return vehicleCurrentWeightMeasure != null && !vehicleCurrentWeightMeasure.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_SUM_WEIGHT_MEASURE:
				return vehicleGrossLadenSumWeightMeasure != null && !vehicleGrossLadenSumWeightMeasure.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_GROSS_LADEN_UNIT_WEIGHT_MEASURE:
				return vehicleGrossLadenUnitWeightMeasure != null && !vehicleGrossLadenUnitWeightMeasure.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_MAXIMUM_LOAD_WEIGHT_MEASURE:
				return vehicleMaximumLoadWeightMeasure != null && !vehicleMaximumLoadWeightMeasure.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_UNLADEN_WEIGHT_MEASURE:
				return vehicleUnladenWeightMeasure != null && !vehicleUnladenWeightMeasure.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT_GROUP:
				return vehicleAugmentationPointGroup != null && !vehicleAugmentationPointGroup.isEmpty();
			case _0Package.VEHICLE_TYPE__VEHICLE_AUGMENTATION_POINT:
				return !getVehicleAugmentationPoint().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vehicleMakeGroup: ");
		result.append(vehicleMakeGroup);
		result.append(", vehicleModelGroup: ");
		result.append(vehicleModelGroup);
		result.append(", vehicleTransmissionCategoryGroup: ");
		result.append(vehicleTransmissionCategoryGroup);
		result.append(", vehicleAugmentationPointGroup: ");
		result.append(vehicleAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //VehicleTypeImpl
