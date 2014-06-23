/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AngularMinuteType;
import gov.niem.release.niem.niem.core._3._0.AngularSecondType;
import gov.niem.release.niem.niem.core._3._0.LatitudeCoordinateType;
import gov.niem.release.niem.niem.core._3._0.LatitudeDegreeType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

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
 * An implementation of the model object '<em><b>Latitude Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LatitudeCoordinateTypeImpl#getLatitudeDegreeValue <em>Latitude Degree Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LatitudeCoordinateTypeImpl#getLatitudeMinuteValue <em>Latitude Minute Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LatitudeCoordinateTypeImpl#getLatitudeSecondValue <em>Latitude Second Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LatitudeCoordinateTypeImpl#getLatitudeCoordinateAugmentationPointGroup <em>Latitude Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LatitudeCoordinateTypeImpl#getLatitudeCoordinateAugmentationPoint <em>Latitude Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatitudeCoordinateTypeImpl extends ObjectTypeImpl implements LatitudeCoordinateType {
	/**
	 * The cached value of the '{@link #getLatitudeDegreeValue() <em>Latitude Degree Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeDegreeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<LatitudeDegreeType> latitudeDegreeValue;

	/**
	 * The cached value of the '{@link #getLatitudeMinuteValue() <em>Latitude Minute Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeMinuteValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AngularMinuteType> latitudeMinuteValue;

	/**
	 * The cached value of the '{@link #getLatitudeSecondValue() <em>Latitude Second Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeSecondValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AngularSecondType> latitudeSecondValue;

	/**
	 * The cached value of the '{@link #getLatitudeCoordinateAugmentationPointGroup() <em>Latitude Coordinate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitudeCoordinateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap latitudeCoordinateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatitudeCoordinateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLatitudeCoordinateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LatitudeDegreeType> getLatitudeDegreeValue() {
		if (latitudeDegreeValue == null) {
			latitudeDegreeValue = new EObjectContainmentEList<LatitudeDegreeType>(LatitudeDegreeType.class, this, _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_DEGREE_VALUE);
		}
		return latitudeDegreeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AngularMinuteType> getLatitudeMinuteValue() {
		if (latitudeMinuteValue == null) {
			latitudeMinuteValue = new EObjectContainmentEList<AngularMinuteType>(AngularMinuteType.class, this, _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_MINUTE_VALUE);
		}
		return latitudeMinuteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AngularSecondType> getLatitudeSecondValue() {
		if (latitudeSecondValue == null) {
			latitudeSecondValue = new EObjectContainmentEList<AngularSecondType>(AngularSecondType.class, this, _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_SECOND_VALUE);
		}
		return latitudeSecondValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLatitudeCoordinateAugmentationPointGroup() {
		if (latitudeCoordinateAugmentationPointGroup == null) {
			latitudeCoordinateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT_GROUP);
		}
		return latitudeCoordinateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLatitudeCoordinateAugmentationPoint() {
		return getLatitudeCoordinateAugmentationPointGroup().list(_0Package.eINSTANCE.getLatitudeCoordinateType_LatitudeCoordinateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_DEGREE_VALUE:
				return ((InternalEList<?>)getLatitudeDegreeValue()).basicRemove(otherEnd, msgs);
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_MINUTE_VALUE:
				return ((InternalEList<?>)getLatitudeMinuteValue()).basicRemove(otherEnd, msgs);
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_SECOND_VALUE:
				return ((InternalEList<?>)getLatitudeSecondValue()).basicRemove(otherEnd, msgs);
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLatitudeCoordinateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLatitudeCoordinateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_DEGREE_VALUE:
				return getLatitudeDegreeValue();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_MINUTE_VALUE:
				return getLatitudeMinuteValue();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_SECOND_VALUE:
				return getLatitudeSecondValue();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLatitudeCoordinateAugmentationPointGroup();
				return ((FeatureMap.Internal)getLatitudeCoordinateAugmentationPointGroup()).getWrapper();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT:
				return getLatitudeCoordinateAugmentationPoint();
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
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_DEGREE_VALUE:
				getLatitudeDegreeValue().clear();
				getLatitudeDegreeValue().addAll((Collection<? extends LatitudeDegreeType>)newValue);
				return;
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_MINUTE_VALUE:
				getLatitudeMinuteValue().clear();
				getLatitudeMinuteValue().addAll((Collection<? extends AngularMinuteType>)newValue);
				return;
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_SECOND_VALUE:
				getLatitudeSecondValue().clear();
				getLatitudeSecondValue().addAll((Collection<? extends AngularSecondType>)newValue);
				return;
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLatitudeCoordinateAugmentationPointGroup()).set(newValue);
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
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_DEGREE_VALUE:
				getLatitudeDegreeValue().clear();
				return;
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_MINUTE_VALUE:
				getLatitudeMinuteValue().clear();
				return;
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_SECOND_VALUE:
				getLatitudeSecondValue().clear();
				return;
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				getLatitudeCoordinateAugmentationPointGroup().clear();
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
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_DEGREE_VALUE:
				return latitudeDegreeValue != null && !latitudeDegreeValue.isEmpty();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_MINUTE_VALUE:
				return latitudeMinuteValue != null && !latitudeMinuteValue.isEmpty();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_SECOND_VALUE:
				return latitudeSecondValue != null && !latitudeSecondValue.isEmpty();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				return latitudeCoordinateAugmentationPointGroup != null && !latitudeCoordinateAugmentationPointGroup.isEmpty();
			case _0Package.LATITUDE_COORDINATE_TYPE__LATITUDE_COORDINATE_AUGMENTATION_POINT:
				return !getLatitudeCoordinateAugmentationPoint().isEmpty();
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
		result.append(" (latitudeCoordinateAugmentationPointGroup: ");
		result.append(latitudeCoordinateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //LatitudeCoordinateTypeImpl
