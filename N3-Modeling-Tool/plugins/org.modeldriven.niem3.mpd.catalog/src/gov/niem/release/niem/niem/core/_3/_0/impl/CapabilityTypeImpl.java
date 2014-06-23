/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CapabilityType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Capability Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CapabilityTypeImpl#getCapabilityGeneralCategoryText <em>Capability General Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CapabilityTypeImpl#getCapabilityCategoryText <em>Capability Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CapabilityTypeImpl#getCapabilityDescriptionText <em>Capability Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CapabilityTypeImpl#getCapabilityIsLimitationIndicator <em>Capability Is Limitation Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CapabilityTypeImpl#getCapabilityAugmentationPointGroup <em>Capability Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CapabilityTypeImpl#getCapabilityAugmentationPoint <em>Capability Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CapabilityTypeImpl extends ObjectTypeImpl implements CapabilityType {
	/**
	 * The cached value of the '{@link #getCapabilityGeneralCategoryText() <em>Capability General Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityGeneralCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> capabilityGeneralCategoryText;

	/**
	 * The cached value of the '{@link #getCapabilityCategoryText() <em>Capability Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> capabilityCategoryText;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptionText() <em>Capability Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> capabilityDescriptionText;

	/**
	 * The cached value of the '{@link #getCapabilityIsLimitationIndicator() <em>Capability Is Limitation Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityIsLimitationIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> capabilityIsLimitationIndicator;

	/**
	 * The cached value of the '{@link #getCapabilityAugmentationPointGroup() <em>Capability Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap capabilityAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCapabilityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCapabilityGeneralCategoryText() {
		if (capabilityGeneralCategoryText == null) {
			capabilityGeneralCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CAPABILITY_TYPE__CAPABILITY_GENERAL_CATEGORY_TEXT);
		}
		return capabilityGeneralCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCapabilityCategoryText() {
		if (capabilityCategoryText == null) {
			capabilityCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CAPABILITY_TYPE__CAPABILITY_CATEGORY_TEXT);
		}
		return capabilityCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCapabilityDescriptionText() {
		if (capabilityDescriptionText == null) {
			capabilityDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CAPABILITY_TYPE__CAPABILITY_DESCRIPTION_TEXT);
		}
		return capabilityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getCapabilityIsLimitationIndicator() {
		if (capabilityIsLimitationIndicator == null) {
			capabilityIsLimitationIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.CAPABILITY_TYPE__CAPABILITY_IS_LIMITATION_INDICATOR);
		}
		return capabilityIsLimitationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCapabilityAugmentationPointGroup() {
		if (capabilityAugmentationPointGroup == null) {
			capabilityAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT_GROUP);
		}
		return capabilityAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCapabilityAugmentationPoint() {
		return getCapabilityAugmentationPointGroup().list(_0Package.eINSTANCE.getCapabilityType_CapabilityAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CAPABILITY_TYPE__CAPABILITY_GENERAL_CATEGORY_TEXT:
				return ((InternalEList<?>)getCapabilityGeneralCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CAPABILITY_TYPE__CAPABILITY_CATEGORY_TEXT:
				return ((InternalEList<?>)getCapabilityCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CAPABILITY_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getCapabilityDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.CAPABILITY_TYPE__CAPABILITY_IS_LIMITATION_INDICATOR:
				return ((InternalEList<?>)getCapabilityIsLimitationIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCapabilityAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCapabilityAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CAPABILITY_TYPE__CAPABILITY_GENERAL_CATEGORY_TEXT:
				return getCapabilityGeneralCategoryText();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_CATEGORY_TEXT:
				return getCapabilityCategoryText();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				return getCapabilityDescriptionText();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_IS_LIMITATION_INDICATOR:
				return getCapabilityIsLimitationIndicator();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCapabilityAugmentationPointGroup();
				return ((FeatureMap.Internal)getCapabilityAugmentationPointGroup()).getWrapper();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT:
				return getCapabilityAugmentationPoint();
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
			case _0Package.CAPABILITY_TYPE__CAPABILITY_GENERAL_CATEGORY_TEXT:
				getCapabilityGeneralCategoryText().clear();
				getCapabilityGeneralCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_CATEGORY_TEXT:
				getCapabilityCategoryText().clear();
				getCapabilityCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				getCapabilityDescriptionText().clear();
				getCapabilityDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_IS_LIMITATION_INDICATOR:
				getCapabilityIsLimitationIndicator().clear();
				getCapabilityIsLimitationIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCapabilityAugmentationPointGroup()).set(newValue);
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
			case _0Package.CAPABILITY_TYPE__CAPABILITY_GENERAL_CATEGORY_TEXT:
				getCapabilityGeneralCategoryText().clear();
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_CATEGORY_TEXT:
				getCapabilityCategoryText().clear();
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				getCapabilityDescriptionText().clear();
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_IS_LIMITATION_INDICATOR:
				getCapabilityIsLimitationIndicator().clear();
				return;
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT_GROUP:
				getCapabilityAugmentationPointGroup().clear();
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
			case _0Package.CAPABILITY_TYPE__CAPABILITY_GENERAL_CATEGORY_TEXT:
				return capabilityGeneralCategoryText != null && !capabilityGeneralCategoryText.isEmpty();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_CATEGORY_TEXT:
				return capabilityCategoryText != null && !capabilityCategoryText.isEmpty();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_DESCRIPTION_TEXT:
				return capabilityDescriptionText != null && !capabilityDescriptionText.isEmpty();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_IS_LIMITATION_INDICATOR:
				return capabilityIsLimitationIndicator != null && !capabilityIsLimitationIndicator.isEmpty();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT_GROUP:
				return capabilityAugmentationPointGroup != null && !capabilityAugmentationPointGroup.isEmpty();
			case _0Package.CAPABILITY_TYPE__CAPABILITY_AUGMENTATION_POINT:
				return !getCapabilityAugmentationPoint().isEmpty();
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
		result.append(" (capabilityAugmentationPointGroup: ");
		result.append(capabilityAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CapabilityTypeImpl
