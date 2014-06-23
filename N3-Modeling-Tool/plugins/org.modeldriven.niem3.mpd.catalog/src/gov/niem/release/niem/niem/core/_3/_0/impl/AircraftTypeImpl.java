/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AircraftType;
import gov.niem.release.niem.niem.core._3._0.AirportType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0._0Package;

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
 * An implementation of the model object '<em><b>Aircraft Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftTailIdentification <em>Aircraft Tail Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftMakeGroup <em>Aircraft Make Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftMake <em>Aircraft Make</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftModelGroup <em>Aircraft Model Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftModel <em>Aircraft Model</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftStyleGroup <em>Aircraft Style Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftStyle <em>Aircraft Style</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftFuselageColorGroup <em>Aircraft Fuselage Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftFuselageColor <em>Aircraft Fuselage Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftWingColorGroup <em>Aircraft Wing Color Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftWingColor <em>Aircraft Wing Color</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftBaseAirport <em>Aircraft Base Airport</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftAugmentationPointGroup <em>Aircraft Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AircraftTypeImpl#getAircraftAugmentationPoint <em>Aircraft Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AircraftTypeImpl extends ConveyanceTypeImpl implements AircraftType {
	/**
	 * The cached value of the '{@link #getAircraftTailIdentification() <em>Aircraft Tail Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftTailIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> aircraftTailIdentification;

	/**
	 * The cached value of the '{@link #getAircraftMakeGroup() <em>Aircraft Make Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftMakeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aircraftMakeGroup;

	/**
	 * The cached value of the '{@link #getAircraftModelGroup() <em>Aircraft Model Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftModelGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aircraftModelGroup;

	/**
	 * The cached value of the '{@link #getAircraftStyleGroup() <em>Aircraft Style Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftStyleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aircraftStyleGroup;

	/**
	 * The cached value of the '{@link #getAircraftFuselageColorGroup() <em>Aircraft Fuselage Color Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftFuselageColorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aircraftFuselageColorGroup;

	/**
	 * The cached value of the '{@link #getAircraftWingColorGroup() <em>Aircraft Wing Color Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftWingColorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aircraftWingColorGroup;

	/**
	 * The cached value of the '{@link #getAircraftBaseAirport() <em>Aircraft Base Airport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftBaseAirport()
	 * @generated
	 * @ordered
	 */
	protected EList<AirportType> aircraftBaseAirport;

	/**
	 * The cached value of the '{@link #getAircraftAugmentationPointGroup() <em>Aircraft Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAircraftAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap aircraftAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAircraftType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getAircraftTailIdentification() {
		if (aircraftTailIdentification == null) {
			aircraftTailIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_TAIL_IDENTIFICATION);
		}
		return aircraftTailIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAircraftMakeGroup() {
		if (aircraftMakeGroup == null) {
			aircraftMakeGroup = new BasicFeatureMap(this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE_GROUP);
		}
		return aircraftMakeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAircraftMake() {
		return getAircraftMakeGroup().list(_0Package.eINSTANCE.getAircraftType_AircraftMake());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAircraftModelGroup() {
		if (aircraftModelGroup == null) {
			aircraftModelGroup = new BasicFeatureMap(this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL_GROUP);
		}
		return aircraftModelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAircraftModel() {
		return getAircraftModelGroup().list(_0Package.eINSTANCE.getAircraftType_AircraftModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAircraftStyleGroup() {
		if (aircraftStyleGroup == null) {
			aircraftStyleGroup = new BasicFeatureMap(this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE_GROUP);
		}
		return aircraftStyleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAircraftStyle() {
		return getAircraftStyleGroup().list(_0Package.eINSTANCE.getAircraftType_AircraftStyle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAircraftFuselageColorGroup() {
		if (aircraftFuselageColorGroup == null) {
			aircraftFuselageColorGroup = new BasicFeatureMap(this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR_GROUP);
		}
		return aircraftFuselageColorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAircraftFuselageColor() {
		return getAircraftFuselageColorGroup().list(_0Package.eINSTANCE.getAircraftType_AircraftFuselageColor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAircraftWingColorGroup() {
		if (aircraftWingColorGroup == null) {
			aircraftWingColorGroup = new BasicFeatureMap(this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR_GROUP);
		}
		return aircraftWingColorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAircraftWingColor() {
		return getAircraftWingColorGroup().list(_0Package.eINSTANCE.getAircraftType_AircraftWingColor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AirportType> getAircraftBaseAirport() {
		if (aircraftBaseAirport == null) {
			aircraftBaseAirport = new EObjectContainmentEList<AirportType>(AirportType.class, this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_BASE_AIRPORT);
		}
		return aircraftBaseAirport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAircraftAugmentationPointGroup() {
		if (aircraftAugmentationPointGroup == null) {
			aircraftAugmentationPointGroup = new BasicFeatureMap(this, _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT_GROUP);
		}
		return aircraftAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAircraftAugmentationPoint() {
		return getAircraftAugmentationPointGroup().list(_0Package.eINSTANCE.getAircraftType_AircraftAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_TAIL_IDENTIFICATION:
				return ((InternalEList<?>)getAircraftTailIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE_GROUP:
				return ((InternalEList<?>)getAircraftMakeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE:
				return ((InternalEList<?>)getAircraftMake()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL_GROUP:
				return ((InternalEList<?>)getAircraftModelGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL:
				return ((InternalEList<?>)getAircraftModel()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE_GROUP:
				return ((InternalEList<?>)getAircraftStyleGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE:
				return ((InternalEList<?>)getAircraftStyle()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR_GROUP:
				return ((InternalEList<?>)getAircraftFuselageColorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR:
				return ((InternalEList<?>)getAircraftFuselageColor()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR_GROUP:
				return ((InternalEList<?>)getAircraftWingColorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR:
				return ((InternalEList<?>)getAircraftWingColor()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_BASE_AIRPORT:
				return ((InternalEList<?>)getAircraftBaseAirport()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAircraftAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAircraftAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_TAIL_IDENTIFICATION:
				return getAircraftTailIdentification();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE_GROUP:
				if (coreType) return getAircraftMakeGroup();
				return ((FeatureMap.Internal)getAircraftMakeGroup()).getWrapper();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE:
				return getAircraftMake();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL_GROUP:
				if (coreType) return getAircraftModelGroup();
				return ((FeatureMap.Internal)getAircraftModelGroup()).getWrapper();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL:
				return getAircraftModel();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE_GROUP:
				if (coreType) return getAircraftStyleGroup();
				return ((FeatureMap.Internal)getAircraftStyleGroup()).getWrapper();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE:
				return getAircraftStyle();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR_GROUP:
				if (coreType) return getAircraftFuselageColorGroup();
				return ((FeatureMap.Internal)getAircraftFuselageColorGroup()).getWrapper();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR:
				return getAircraftFuselageColor();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR_GROUP:
				if (coreType) return getAircraftWingColorGroup();
				return ((FeatureMap.Internal)getAircraftWingColorGroup()).getWrapper();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR:
				return getAircraftWingColor();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_BASE_AIRPORT:
				return getAircraftBaseAirport();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAircraftAugmentationPointGroup();
				return ((FeatureMap.Internal)getAircraftAugmentationPointGroup()).getWrapper();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT:
				return getAircraftAugmentationPoint();
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
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_TAIL_IDENTIFICATION:
				getAircraftTailIdentification().clear();
				getAircraftTailIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE_GROUP:
				((FeatureMap.Internal)getAircraftMakeGroup()).set(newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL_GROUP:
				((FeatureMap.Internal)getAircraftModelGroup()).set(newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE_GROUP:
				((FeatureMap.Internal)getAircraftStyleGroup()).set(newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR_GROUP:
				((FeatureMap.Internal)getAircraftFuselageColorGroup()).set(newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR_GROUP:
				((FeatureMap.Internal)getAircraftWingColorGroup()).set(newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_BASE_AIRPORT:
				getAircraftBaseAirport().clear();
				getAircraftBaseAirport().addAll((Collection<? extends AirportType>)newValue);
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAircraftAugmentationPointGroup()).set(newValue);
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
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_TAIL_IDENTIFICATION:
				getAircraftTailIdentification().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE_GROUP:
				getAircraftMakeGroup().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL_GROUP:
				getAircraftModelGroup().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE_GROUP:
				getAircraftStyleGroup().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR_GROUP:
				getAircraftFuselageColorGroup().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR_GROUP:
				getAircraftWingColorGroup().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_BASE_AIRPORT:
				getAircraftBaseAirport().clear();
				return;
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT_GROUP:
				getAircraftAugmentationPointGroup().clear();
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
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_TAIL_IDENTIFICATION:
				return aircraftTailIdentification != null && !aircraftTailIdentification.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE_GROUP:
				return aircraftMakeGroup != null && !aircraftMakeGroup.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MAKE:
				return !getAircraftMake().isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL_GROUP:
				return aircraftModelGroup != null && !aircraftModelGroup.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_MODEL:
				return !getAircraftModel().isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE_GROUP:
				return aircraftStyleGroup != null && !aircraftStyleGroup.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_STYLE:
				return !getAircraftStyle().isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR_GROUP:
				return aircraftFuselageColorGroup != null && !aircraftFuselageColorGroup.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_FUSELAGE_COLOR:
				return !getAircraftFuselageColor().isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR_GROUP:
				return aircraftWingColorGroup != null && !aircraftWingColorGroup.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_WING_COLOR:
				return !getAircraftWingColor().isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_BASE_AIRPORT:
				return aircraftBaseAirport != null && !aircraftBaseAirport.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT_GROUP:
				return aircraftAugmentationPointGroup != null && !aircraftAugmentationPointGroup.isEmpty();
			case _0Package.AIRCRAFT_TYPE__AIRCRAFT_AUGMENTATION_POINT:
				return !getAircraftAugmentationPoint().isEmpty();
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
		result.append(" (aircraftMakeGroup: ");
		result.append(aircraftMakeGroup);
		result.append(", aircraftModelGroup: ");
		result.append(aircraftModelGroup);
		result.append(", aircraftStyleGroup: ");
		result.append(aircraftStyleGroup);
		result.append(", aircraftFuselageColorGroup: ");
		result.append(aircraftFuselageColorGroup);
		result.append(", aircraftWingColorGroup: ");
		result.append(aircraftWingColorGroup);
		result.append(", aircraftAugmentationPointGroup: ");
		result.append(aircraftAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AircraftTypeImpl
