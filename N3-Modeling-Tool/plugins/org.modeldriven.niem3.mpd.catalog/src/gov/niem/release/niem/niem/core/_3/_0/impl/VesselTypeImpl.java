/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.VehicleType;
import gov.niem.release.niem.niem.core._3._0.VesselType;
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
 * An implementation of the model object '<em><b>Vessel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselMakeGroup <em>Vessel Make Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselMake <em>Vessel Make</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselCategoryGroup <em>Vessel Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselCategory <em>Vessel Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselHullIdentification <em>Vessel Hull Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselHullMaterialGroup <em>Vessel Hull Material Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselHullMaterial <em>Vessel Hull Material</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselHullShapeGroup <em>Vessel Hull Shape Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselHullShape <em>Vessel Hull Shape</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselPropulsionGroup <em>Vessel Propulsion Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselPropulsion <em>Vessel Propulsion</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselTrailer <em>Vessel Trailer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselAugmentationPointGroup <em>Vessel Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.VesselTypeImpl#getVesselAugmentationPoint <em>Vessel Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VesselTypeImpl extends ConveyanceTypeImpl implements VesselType {
	/**
	 * The cached value of the '{@link #getVesselMakeGroup() <em>Vessel Make Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselMakeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vesselMakeGroup;

	/**
	 * The cached value of the '{@link #getVesselCategoryGroup() <em>Vessel Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vesselCategoryGroup;

	/**
	 * The cached value of the '{@link #getVesselHullIdentification() <em>Vessel Hull Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselHullIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> vesselHullIdentification;

	/**
	 * The cached value of the '{@link #getVesselHullMaterialGroup() <em>Vessel Hull Material Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselHullMaterialGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vesselHullMaterialGroup;

	/**
	 * The cached value of the '{@link #getVesselHullShapeGroup() <em>Vessel Hull Shape Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselHullShapeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vesselHullShapeGroup;

	/**
	 * The cached value of the '{@link #getVesselPropulsionGroup() <em>Vessel Propulsion Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselPropulsionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vesselPropulsionGroup;

	/**
	 * The cached value of the '{@link #getVesselTrailer() <em>Vessel Trailer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselTrailer()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleType> vesselTrailer;

	/**
	 * The cached value of the '{@link #getVesselAugmentationPointGroup() <em>Vessel Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap vesselAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VesselTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getVesselType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVesselMakeGroup() {
		if (vesselMakeGroup == null) {
			vesselMakeGroup = new BasicFeatureMap(this, _0Package.VESSEL_TYPE__VESSEL_MAKE_GROUP);
		}
		return vesselMakeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVesselMake() {
		return getVesselMakeGroup().list(_0Package.eINSTANCE.getVesselType_VesselMake());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVesselCategoryGroup() {
		if (vesselCategoryGroup == null) {
			vesselCategoryGroup = new BasicFeatureMap(this, _0Package.VESSEL_TYPE__VESSEL_CATEGORY_GROUP);
		}
		return vesselCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVesselCategory() {
		return getVesselCategoryGroup().list(_0Package.eINSTANCE.getVesselType_VesselCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getVesselHullIdentification() {
		if (vesselHullIdentification == null) {
			vesselHullIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.VESSEL_TYPE__VESSEL_HULL_IDENTIFICATION);
		}
		return vesselHullIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVesselHullMaterialGroup() {
		if (vesselHullMaterialGroup == null) {
			vesselHullMaterialGroup = new BasicFeatureMap(this, _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL_GROUP);
		}
		return vesselHullMaterialGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVesselHullMaterial() {
		return getVesselHullMaterialGroup().list(_0Package.eINSTANCE.getVesselType_VesselHullMaterial());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVesselHullShapeGroup() {
		if (vesselHullShapeGroup == null) {
			vesselHullShapeGroup = new BasicFeatureMap(this, _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE_GROUP);
		}
		return vesselHullShapeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVesselHullShape() {
		return getVesselHullShapeGroup().list(_0Package.eINSTANCE.getVesselType_VesselHullShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVesselPropulsionGroup() {
		if (vesselPropulsionGroup == null) {
			vesselPropulsionGroup = new BasicFeatureMap(this, _0Package.VESSEL_TYPE__VESSEL_PROPULSION_GROUP);
		}
		return vesselPropulsionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVesselPropulsion() {
		return getVesselPropulsionGroup().list(_0Package.eINSTANCE.getVesselType_VesselPropulsion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleType> getVesselTrailer() {
		if (vesselTrailer == null) {
			vesselTrailer = new EObjectContainmentEList<VehicleType>(VehicleType.class, this, _0Package.VESSEL_TYPE__VESSEL_TRAILER);
		}
		return vesselTrailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getVesselAugmentationPointGroup() {
		if (vesselAugmentationPointGroup == null) {
			vesselAugmentationPointGroup = new BasicFeatureMap(this, _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT_GROUP);
		}
		return vesselAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getVesselAugmentationPoint() {
		return getVesselAugmentationPointGroup().list(_0Package.eINSTANCE.getVesselType_VesselAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.VESSEL_TYPE__VESSEL_MAKE_GROUP:
				return ((InternalEList<?>)getVesselMakeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_MAKE:
				return ((InternalEList<?>)getVesselMake()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY_GROUP:
				return ((InternalEList<?>)getVesselCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY:
				return ((InternalEList<?>)getVesselCategory()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_HULL_IDENTIFICATION:
				return ((InternalEList<?>)getVesselHullIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL_GROUP:
				return ((InternalEList<?>)getVesselHullMaterialGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL:
				return ((InternalEList<?>)getVesselHullMaterial()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE_GROUP:
				return ((InternalEList<?>)getVesselHullShapeGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE:
				return ((InternalEList<?>)getVesselHullShape()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION_GROUP:
				return ((InternalEList<?>)getVesselPropulsionGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION:
				return ((InternalEList<?>)getVesselPropulsion()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_TRAILER:
				return ((InternalEList<?>)getVesselTrailer()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getVesselAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT:
				return ((InternalEList<?>)getVesselAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.VESSEL_TYPE__VESSEL_MAKE_GROUP:
				if (coreType) return getVesselMakeGroup();
				return ((FeatureMap.Internal)getVesselMakeGroup()).getWrapper();
			case _0Package.VESSEL_TYPE__VESSEL_MAKE:
				return getVesselMake();
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY_GROUP:
				if (coreType) return getVesselCategoryGroup();
				return ((FeatureMap.Internal)getVesselCategoryGroup()).getWrapper();
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY:
				return getVesselCategory();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_IDENTIFICATION:
				return getVesselHullIdentification();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL_GROUP:
				if (coreType) return getVesselHullMaterialGroup();
				return ((FeatureMap.Internal)getVesselHullMaterialGroup()).getWrapper();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL:
				return getVesselHullMaterial();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE_GROUP:
				if (coreType) return getVesselHullShapeGroup();
				return ((FeatureMap.Internal)getVesselHullShapeGroup()).getWrapper();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE:
				return getVesselHullShape();
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION_GROUP:
				if (coreType) return getVesselPropulsionGroup();
				return ((FeatureMap.Internal)getVesselPropulsionGroup()).getWrapper();
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION:
				return getVesselPropulsion();
			case _0Package.VESSEL_TYPE__VESSEL_TRAILER:
				return getVesselTrailer();
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT_GROUP:
				if (coreType) return getVesselAugmentationPointGroup();
				return ((FeatureMap.Internal)getVesselAugmentationPointGroup()).getWrapper();
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT:
				return getVesselAugmentationPoint();
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
			case _0Package.VESSEL_TYPE__VESSEL_MAKE_GROUP:
				((FeatureMap.Internal)getVesselMakeGroup()).set(newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY_GROUP:
				((FeatureMap.Internal)getVesselCategoryGroup()).set(newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_HULL_IDENTIFICATION:
				getVesselHullIdentification().clear();
				getVesselHullIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL_GROUP:
				((FeatureMap.Internal)getVesselHullMaterialGroup()).set(newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE_GROUP:
				((FeatureMap.Internal)getVesselHullShapeGroup()).set(newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION_GROUP:
				((FeatureMap.Internal)getVesselPropulsionGroup()).set(newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_TRAILER:
				getVesselTrailer().clear();
				getVesselTrailer().addAll((Collection<? extends VehicleType>)newValue);
				return;
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getVesselAugmentationPointGroup()).set(newValue);
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
			case _0Package.VESSEL_TYPE__VESSEL_MAKE_GROUP:
				getVesselMakeGroup().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY_GROUP:
				getVesselCategoryGroup().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_HULL_IDENTIFICATION:
				getVesselHullIdentification().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL_GROUP:
				getVesselHullMaterialGroup().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE_GROUP:
				getVesselHullShapeGroup().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION_GROUP:
				getVesselPropulsionGroup().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_TRAILER:
				getVesselTrailer().clear();
				return;
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT_GROUP:
				getVesselAugmentationPointGroup().clear();
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
			case _0Package.VESSEL_TYPE__VESSEL_MAKE_GROUP:
				return vesselMakeGroup != null && !vesselMakeGroup.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_MAKE:
				return !getVesselMake().isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY_GROUP:
				return vesselCategoryGroup != null && !vesselCategoryGroup.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_CATEGORY:
				return !getVesselCategory().isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_IDENTIFICATION:
				return vesselHullIdentification != null && !vesselHullIdentification.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL_GROUP:
				return vesselHullMaterialGroup != null && !vesselHullMaterialGroup.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_MATERIAL:
				return !getVesselHullMaterial().isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE_GROUP:
				return vesselHullShapeGroup != null && !vesselHullShapeGroup.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_HULL_SHAPE:
				return !getVesselHullShape().isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION_GROUP:
				return vesselPropulsionGroup != null && !vesselPropulsionGroup.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_PROPULSION:
				return !getVesselPropulsion().isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_TRAILER:
				return vesselTrailer != null && !vesselTrailer.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT_GROUP:
				return vesselAugmentationPointGroup != null && !vesselAugmentationPointGroup.isEmpty();
			case _0Package.VESSEL_TYPE__VESSEL_AUGMENTATION_POINT:
				return !getVesselAugmentationPoint().isEmpty();
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
		result.append(" (vesselMakeGroup: ");
		result.append(vesselMakeGroup);
		result.append(", vesselCategoryGroup: ");
		result.append(vesselCategoryGroup);
		result.append(", vesselHullMaterialGroup: ");
		result.append(vesselHullMaterialGroup);
		result.append(", vesselHullShapeGroup: ");
		result.append(vesselHullShapeGroup);
		result.append(", vesselPropulsionGroup: ");
		result.append(vesselPropulsionGroup);
		result.append(", vesselAugmentationPointGroup: ");
		result.append(vesselAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //VesselTypeImpl
