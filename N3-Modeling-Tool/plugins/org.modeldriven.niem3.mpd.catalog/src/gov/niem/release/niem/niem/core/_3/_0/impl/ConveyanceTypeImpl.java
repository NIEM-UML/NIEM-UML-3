/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ConveyanceType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Conveyance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceCargoText <em>Conveyance Cargo Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceEngineQuantity <em>Conveyance Engine Quantity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceMotorizedIndicator <em>Conveyance Motorized Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceTowedIndicator <em>Conveyance Towed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceUseGroup <em>Conveyance Use Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceUse <em>Conveyance Use</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceAugmentationPointGroup <em>Conveyance Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ConveyanceTypeImpl#getConveyanceAugmentationPoint <em>Conveyance Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConveyanceTypeImpl extends ItemTypeImpl implements ConveyanceType {
	/**
	 * The cached value of the '{@link #getConveyanceCargoText() <em>Conveyance Cargo Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceCargoText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> conveyanceCargoText;

	/**
	 * The cached value of the '{@link #getConveyanceEngineQuantity() <em>Conveyance Engine Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceEngineQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> conveyanceEngineQuantity;

	/**
	 * The cached value of the '{@link #getConveyanceMotorizedIndicator() <em>Conveyance Motorized Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceMotorizedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> conveyanceMotorizedIndicator;

	/**
	 * The cached value of the '{@link #getConveyanceTowedIndicator() <em>Conveyance Towed Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceTowedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> conveyanceTowedIndicator;

	/**
	 * The cached value of the '{@link #getConveyanceUseGroup() <em>Conveyance Use Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceUseGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap conveyanceUseGroup;

	/**
	 * The cached value of the '{@link #getConveyanceAugmentationPointGroup() <em>Conveyance Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyanceAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap conveyanceAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getConveyanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getConveyanceCargoText() {
		if (conveyanceCargoText == null) {
			conveyanceCargoText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CONVEYANCE_TYPE__CONVEYANCE_CARGO_TEXT);
		}
		return conveyanceCargoText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getConveyanceEngineQuantity() {
		if (conveyanceEngineQuantity == null) {
			conveyanceEngineQuantity = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.CONVEYANCE_TYPE__CONVEYANCE_ENGINE_QUANTITY);
		}
		return conveyanceEngineQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConveyanceMotorizedIndicator() {
		if (conveyanceMotorizedIndicator == null) {
			conveyanceMotorizedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.CONVEYANCE_TYPE__CONVEYANCE_MOTORIZED_INDICATOR);
		}
		return conveyanceMotorizedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getConveyanceTowedIndicator() {
		if (conveyanceTowedIndicator == null) {
			conveyanceTowedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.CONVEYANCE_TYPE__CONVEYANCE_TOWED_INDICATOR);
		}
		return conveyanceTowedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getConveyanceUseGroup() {
		if (conveyanceUseGroup == null) {
			conveyanceUseGroup = new BasicFeatureMap(this, _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE_GROUP);
		}
		return conveyanceUseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getConveyanceUse() {
		return getConveyanceUseGroup().list(_0Package.eINSTANCE.getConveyanceType_ConveyanceUse());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getConveyanceAugmentationPointGroup() {
		if (conveyanceAugmentationPointGroup == null) {
			conveyanceAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT_GROUP);
		}
		return conveyanceAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getConveyanceAugmentationPoint() {
		return getConveyanceAugmentationPointGroup().list(_0Package.eINSTANCE.getConveyanceType_ConveyanceAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_CARGO_TEXT:
				return ((InternalEList<?>)getConveyanceCargoText()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_ENGINE_QUANTITY:
				return ((InternalEList<?>)getConveyanceEngineQuantity()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_MOTORIZED_INDICATOR:
				return ((InternalEList<?>)getConveyanceMotorizedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_TOWED_INDICATOR:
				return ((InternalEList<?>)getConveyanceTowedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE_GROUP:
				return ((InternalEList<?>)getConveyanceUseGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE:
				return ((InternalEList<?>)getConveyanceUse()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getConveyanceAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getConveyanceAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_CARGO_TEXT:
				return getConveyanceCargoText();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_ENGINE_QUANTITY:
				return getConveyanceEngineQuantity();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_MOTORIZED_INDICATOR:
				return getConveyanceMotorizedIndicator();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_TOWED_INDICATOR:
				return getConveyanceTowedIndicator();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE_GROUP:
				if (coreType) return getConveyanceUseGroup();
				return ((FeatureMap.Internal)getConveyanceUseGroup()).getWrapper();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE:
				return getConveyanceUse();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getConveyanceAugmentationPointGroup();
				return ((FeatureMap.Internal)getConveyanceAugmentationPointGroup()).getWrapper();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT:
				return getConveyanceAugmentationPoint();
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
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_CARGO_TEXT:
				getConveyanceCargoText().clear();
				getConveyanceCargoText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_ENGINE_QUANTITY:
				getConveyanceEngineQuantity().clear();
				getConveyanceEngineQuantity().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_MOTORIZED_INDICATOR:
				getConveyanceMotorizedIndicator().clear();
				getConveyanceMotorizedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_TOWED_INDICATOR:
				getConveyanceTowedIndicator().clear();
				getConveyanceTowedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE_GROUP:
				((FeatureMap.Internal)getConveyanceUseGroup()).set(newValue);
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getConveyanceAugmentationPointGroup()).set(newValue);
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
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_CARGO_TEXT:
				getConveyanceCargoText().clear();
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_ENGINE_QUANTITY:
				getConveyanceEngineQuantity().clear();
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_MOTORIZED_INDICATOR:
				getConveyanceMotorizedIndicator().clear();
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_TOWED_INDICATOR:
				getConveyanceTowedIndicator().clear();
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE_GROUP:
				getConveyanceUseGroup().clear();
				return;
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT_GROUP:
				getConveyanceAugmentationPointGroup().clear();
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
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_CARGO_TEXT:
				return conveyanceCargoText != null && !conveyanceCargoText.isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_ENGINE_QUANTITY:
				return conveyanceEngineQuantity != null && !conveyanceEngineQuantity.isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_MOTORIZED_INDICATOR:
				return conveyanceMotorizedIndicator != null && !conveyanceMotorizedIndicator.isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_TOWED_INDICATOR:
				return conveyanceTowedIndicator != null && !conveyanceTowedIndicator.isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE_GROUP:
				return conveyanceUseGroup != null && !conveyanceUseGroup.isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_USE:
				return !getConveyanceUse().isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT_GROUP:
				return conveyanceAugmentationPointGroup != null && !conveyanceAugmentationPointGroup.isEmpty();
			case _0Package.CONVEYANCE_TYPE__CONVEYANCE_AUGMENTATION_POINT:
				return !getConveyanceAugmentationPoint().isEmpty();
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
		result.append(" (conveyanceUseGroup: ");
		result.append(conveyanceUseGroup);
		result.append(", conveyanceAugmentationPointGroup: ");
		result.append(conveyanceAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ConveyanceTypeImpl
