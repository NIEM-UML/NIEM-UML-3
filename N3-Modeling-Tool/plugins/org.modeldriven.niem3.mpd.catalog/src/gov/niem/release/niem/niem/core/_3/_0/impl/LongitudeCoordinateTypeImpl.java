/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AngularMinuteType;
import gov.niem.release.niem.niem.core._3._0.AngularSecondType;
import gov.niem.release.niem.niem.core._3._0.LongitudeCoordinateType;
import gov.niem.release.niem.niem.core._3._0.LongitudeDegreeType;
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
 * An implementation of the model object '<em><b>Longitude Coordinate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LongitudeCoordinateTypeImpl#getLongitudeDegreeValue <em>Longitude Degree Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LongitudeCoordinateTypeImpl#getLongitudeMinuteValue <em>Longitude Minute Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LongitudeCoordinateTypeImpl#getLongitudeSecondValue <em>Longitude Second Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LongitudeCoordinateTypeImpl#getLongitudeCoordinateAugmentationPointGroup <em>Longitude Coordinate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LongitudeCoordinateTypeImpl#getLongitudeCoordinateAugmentationPoint <em>Longitude Coordinate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LongitudeCoordinateTypeImpl extends ObjectTypeImpl implements LongitudeCoordinateType {
	/**
	 * The cached value of the '{@link #getLongitudeDegreeValue() <em>Longitude Degree Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeDegreeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<LongitudeDegreeType> longitudeDegreeValue;

	/**
	 * The cached value of the '{@link #getLongitudeMinuteValue() <em>Longitude Minute Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeMinuteValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AngularMinuteType> longitudeMinuteValue;

	/**
	 * The cached value of the '{@link #getLongitudeSecondValue() <em>Longitude Second Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeSecondValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AngularSecondType> longitudeSecondValue;

	/**
	 * The cached value of the '{@link #getLongitudeCoordinateAugmentationPointGroup() <em>Longitude Coordinate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudeCoordinateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap longitudeCoordinateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongitudeCoordinateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLongitudeCoordinateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LongitudeDegreeType> getLongitudeDegreeValue() {
		if (longitudeDegreeValue == null) {
			longitudeDegreeValue = new EObjectContainmentEList<LongitudeDegreeType>(LongitudeDegreeType.class, this, _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_DEGREE_VALUE);
		}
		return longitudeDegreeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AngularMinuteType> getLongitudeMinuteValue() {
		if (longitudeMinuteValue == null) {
			longitudeMinuteValue = new EObjectContainmentEList<AngularMinuteType>(AngularMinuteType.class, this, _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_MINUTE_VALUE);
		}
		return longitudeMinuteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AngularSecondType> getLongitudeSecondValue() {
		if (longitudeSecondValue == null) {
			longitudeSecondValue = new EObjectContainmentEList<AngularSecondType>(AngularSecondType.class, this, _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_SECOND_VALUE);
		}
		return longitudeSecondValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLongitudeCoordinateAugmentationPointGroup() {
		if (longitudeCoordinateAugmentationPointGroup == null) {
			longitudeCoordinateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT_GROUP);
		}
		return longitudeCoordinateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLongitudeCoordinateAugmentationPoint() {
		return getLongitudeCoordinateAugmentationPointGroup().list(_0Package.eINSTANCE.getLongitudeCoordinateType_LongitudeCoordinateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_DEGREE_VALUE:
				return ((InternalEList<?>)getLongitudeDegreeValue()).basicRemove(otherEnd, msgs);
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_MINUTE_VALUE:
				return ((InternalEList<?>)getLongitudeMinuteValue()).basicRemove(otherEnd, msgs);
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_SECOND_VALUE:
				return ((InternalEList<?>)getLongitudeSecondValue()).basicRemove(otherEnd, msgs);
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLongitudeCoordinateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLongitudeCoordinateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_DEGREE_VALUE:
				return getLongitudeDegreeValue();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_MINUTE_VALUE:
				return getLongitudeMinuteValue();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_SECOND_VALUE:
				return getLongitudeSecondValue();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLongitudeCoordinateAugmentationPointGroup();
				return ((FeatureMap.Internal)getLongitudeCoordinateAugmentationPointGroup()).getWrapper();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT:
				return getLongitudeCoordinateAugmentationPoint();
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
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_DEGREE_VALUE:
				getLongitudeDegreeValue().clear();
				getLongitudeDegreeValue().addAll((Collection<? extends LongitudeDegreeType>)newValue);
				return;
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_MINUTE_VALUE:
				getLongitudeMinuteValue().clear();
				getLongitudeMinuteValue().addAll((Collection<? extends AngularMinuteType>)newValue);
				return;
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_SECOND_VALUE:
				getLongitudeSecondValue().clear();
				getLongitudeSecondValue().addAll((Collection<? extends AngularSecondType>)newValue);
				return;
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLongitudeCoordinateAugmentationPointGroup()).set(newValue);
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
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_DEGREE_VALUE:
				getLongitudeDegreeValue().clear();
				return;
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_MINUTE_VALUE:
				getLongitudeMinuteValue().clear();
				return;
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_SECOND_VALUE:
				getLongitudeSecondValue().clear();
				return;
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				getLongitudeCoordinateAugmentationPointGroup().clear();
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
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_DEGREE_VALUE:
				return longitudeDegreeValue != null && !longitudeDegreeValue.isEmpty();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_MINUTE_VALUE:
				return longitudeMinuteValue != null && !longitudeMinuteValue.isEmpty();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_SECOND_VALUE:
				return longitudeSecondValue != null && !longitudeSecondValue.isEmpty();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT_GROUP:
				return longitudeCoordinateAugmentationPointGroup != null && !longitudeCoordinateAugmentationPointGroup.isEmpty();
			case _0Package.LONGITUDE_COORDINATE_TYPE__LONGITUDE_COORDINATE_AUGMENTATION_POINT:
				return !getLongitudeCoordinateAugmentationPoint().isEmpty();
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
		result.append(" (longitudeCoordinateAugmentationPointGroup: ");
		result.append(longitudeCoordinateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //LongitudeCoordinateTypeImpl
