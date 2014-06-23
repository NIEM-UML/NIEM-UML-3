/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AngularMeasureType;
import gov.niem.release.niem.niem.core._3._0.AngularMinuteType;
import gov.niem.release.niem.niem.core._3._0.AngularSecondType;
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
 * An implementation of the model object '<em><b>Angular Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AngularMeasureTypeImpl#getAngularDegreeValue <em>Angular Degree Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AngularMeasureTypeImpl#getAngularMinuteValue <em>Angular Minute Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AngularMeasureTypeImpl#getAngularSecondValue <em>Angular Second Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AngularMeasureTypeImpl#getAngularMeasureAugmentationPointGroup <em>Angular Measure Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AngularMeasureTypeImpl#getAngularMeasureAugmentationPoint <em>Angular Measure Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AngularMeasureTypeImpl extends ObjectTypeImpl implements AngularMeasureType {
	/**
	 * The cached value of the '{@link #getAngularDegreeValue() <em>Angular Degree Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularDegreeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> angularDegreeValue;

	/**
	 * The cached value of the '{@link #getAngularMinuteValue() <em>Angular Minute Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularMinuteValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AngularMinuteType> angularMinuteValue;

	/**
	 * The cached value of the '{@link #getAngularSecondValue() <em>Angular Second Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularSecondValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AngularSecondType> angularSecondValue;

	/**
	 * The cached value of the '{@link #getAngularMeasureAugmentationPointGroup() <em>Angular Measure Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularMeasureAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap angularMeasureAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularMeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAngularMeasureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getAngularDegreeValue() {
		if (angularDegreeValue == null) {
			angularDegreeValue = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Integer>(gov.niem.release.niem.proxy.xsd._3._0.Integer.class, this, _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_DEGREE_VALUE);
		}
		return angularDegreeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AngularMinuteType> getAngularMinuteValue() {
		if (angularMinuteValue == null) {
			angularMinuteValue = new EObjectContainmentEList<AngularMinuteType>(AngularMinuteType.class, this, _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MINUTE_VALUE);
		}
		return angularMinuteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AngularSecondType> getAngularSecondValue() {
		if (angularSecondValue == null) {
			angularSecondValue = new EObjectContainmentEList<AngularSecondType>(AngularSecondType.class, this, _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_SECOND_VALUE);
		}
		return angularSecondValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAngularMeasureAugmentationPointGroup() {
		if (angularMeasureAugmentationPointGroup == null) {
			angularMeasureAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT_GROUP);
		}
		return angularMeasureAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAngularMeasureAugmentationPoint() {
		return getAngularMeasureAugmentationPointGroup().list(_0Package.eINSTANCE.getAngularMeasureType_AngularMeasureAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_DEGREE_VALUE:
				return ((InternalEList<?>)getAngularDegreeValue()).basicRemove(otherEnd, msgs);
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MINUTE_VALUE:
				return ((InternalEList<?>)getAngularMinuteValue()).basicRemove(otherEnd, msgs);
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_SECOND_VALUE:
				return ((InternalEList<?>)getAngularSecondValue()).basicRemove(otherEnd, msgs);
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAngularMeasureAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAngularMeasureAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_DEGREE_VALUE:
				return getAngularDegreeValue();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MINUTE_VALUE:
				return getAngularMinuteValue();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_SECOND_VALUE:
				return getAngularSecondValue();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAngularMeasureAugmentationPointGroup();
				return ((FeatureMap.Internal)getAngularMeasureAugmentationPointGroup()).getWrapper();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT:
				return getAngularMeasureAugmentationPoint();
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
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_DEGREE_VALUE:
				getAngularDegreeValue().clear();
				getAngularDegreeValue().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Integer>)newValue);
				return;
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MINUTE_VALUE:
				getAngularMinuteValue().clear();
				getAngularMinuteValue().addAll((Collection<? extends AngularMinuteType>)newValue);
				return;
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_SECOND_VALUE:
				getAngularSecondValue().clear();
				getAngularSecondValue().addAll((Collection<? extends AngularSecondType>)newValue);
				return;
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAngularMeasureAugmentationPointGroup()).set(newValue);
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
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_DEGREE_VALUE:
				getAngularDegreeValue().clear();
				return;
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MINUTE_VALUE:
				getAngularMinuteValue().clear();
				return;
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_SECOND_VALUE:
				getAngularSecondValue().clear();
				return;
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT_GROUP:
				getAngularMeasureAugmentationPointGroup().clear();
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
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_DEGREE_VALUE:
				return angularDegreeValue != null && !angularDegreeValue.isEmpty();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MINUTE_VALUE:
				return angularMinuteValue != null && !angularMinuteValue.isEmpty();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_SECOND_VALUE:
				return angularSecondValue != null && !angularSecondValue.isEmpty();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT_GROUP:
				return angularMeasureAugmentationPointGroup != null && !angularMeasureAugmentationPointGroup.isEmpty();
			case _0Package.ANGULAR_MEASURE_TYPE__ANGULAR_MEASURE_AUGMENTATION_POINT:
				return !getAngularMeasureAugmentationPoint().isEmpty();
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
		result.append(" (angularMeasureAugmentationPointGroup: ");
		result.append(angularMeasureAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AngularMeasureTypeImpl
