/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AreaType;
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
 * An implementation of the model object '<em><b>Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaDescriptionText <em>Area Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaGeographicGroup <em>Area Geographic Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaGeographic <em>Area Geographic</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaRegionGroup <em>Area Region Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaRegion <em>Area Region</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaAugmentationPointGroup <em>Area Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.AreaTypeImpl#getAreaAugmentationPoint <em>Area Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AreaTypeImpl extends ObjectTypeImpl implements AreaType {
	/**
	 * The cached value of the '{@link #getAreaDescriptionText() <em>Area Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> areaDescriptionText;

	/**
	 * The cached value of the '{@link #getAreaGeographicGroup() <em>Area Geographic Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaGeographicGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap areaGeographicGroup;

	/**
	 * The cached value of the '{@link #getAreaRegionGroup() <em>Area Region Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaRegionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap areaRegionGroup;

	/**
	 * The cached value of the '{@link #getAreaAugmentationPointGroup() <em>Area Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap areaAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getAreaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getAreaDescriptionText() {
		if (areaDescriptionText == null) {
			areaDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.AREA_TYPE__AREA_DESCRIPTION_TEXT);
		}
		return areaDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAreaGeographicGroup() {
		if (areaGeographicGroup == null) {
			areaGeographicGroup = new BasicFeatureMap(this, _0Package.AREA_TYPE__AREA_GEOGRAPHIC_GROUP);
		}
		return areaGeographicGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAreaGeographic() {
		return getAreaGeographicGroup().list(_0Package.eINSTANCE.getAreaType_AreaGeographic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAreaRegionGroup() {
		if (areaRegionGroup == null) {
			areaRegionGroup = new BasicFeatureMap(this, _0Package.AREA_TYPE__AREA_REGION_GROUP);
		}
		return areaRegionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAreaRegion() {
		return getAreaRegionGroup().list(_0Package.eINSTANCE.getAreaType_AreaRegion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAreaAugmentationPointGroup() {
		if (areaAugmentationPointGroup == null) {
			areaAugmentationPointGroup = new BasicFeatureMap(this, _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT_GROUP);
		}
		return areaAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAreaAugmentationPoint() {
		return getAreaAugmentationPointGroup().list(_0Package.eINSTANCE.getAreaType_AreaAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.AREA_TYPE__AREA_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getAreaDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC_GROUP:
				return ((InternalEList<?>)getAreaGeographicGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC:
				return ((InternalEList<?>)getAreaGeographic()).basicRemove(otherEnd, msgs);
			case _0Package.AREA_TYPE__AREA_REGION_GROUP:
				return ((InternalEList<?>)getAreaRegionGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AREA_TYPE__AREA_REGION:
				return ((InternalEList<?>)getAreaRegion()).basicRemove(otherEnd, msgs);
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getAreaAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT:
				return ((InternalEList<?>)getAreaAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.AREA_TYPE__AREA_DESCRIPTION_TEXT:
				return getAreaDescriptionText();
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC_GROUP:
				if (coreType) return getAreaGeographicGroup();
				return ((FeatureMap.Internal)getAreaGeographicGroup()).getWrapper();
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC:
				return getAreaGeographic();
			case _0Package.AREA_TYPE__AREA_REGION_GROUP:
				if (coreType) return getAreaRegionGroup();
				return ((FeatureMap.Internal)getAreaRegionGroup()).getWrapper();
			case _0Package.AREA_TYPE__AREA_REGION:
				return getAreaRegion();
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT_GROUP:
				if (coreType) return getAreaAugmentationPointGroup();
				return ((FeatureMap.Internal)getAreaAugmentationPointGroup()).getWrapper();
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT:
				return getAreaAugmentationPoint();
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
			case _0Package.AREA_TYPE__AREA_DESCRIPTION_TEXT:
				getAreaDescriptionText().clear();
				getAreaDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC_GROUP:
				((FeatureMap.Internal)getAreaGeographicGroup()).set(newValue);
				return;
			case _0Package.AREA_TYPE__AREA_REGION_GROUP:
				((FeatureMap.Internal)getAreaRegionGroup()).set(newValue);
				return;
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getAreaAugmentationPointGroup()).set(newValue);
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
			case _0Package.AREA_TYPE__AREA_DESCRIPTION_TEXT:
				getAreaDescriptionText().clear();
				return;
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC_GROUP:
				getAreaGeographicGroup().clear();
				return;
			case _0Package.AREA_TYPE__AREA_REGION_GROUP:
				getAreaRegionGroup().clear();
				return;
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT_GROUP:
				getAreaAugmentationPointGroup().clear();
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
			case _0Package.AREA_TYPE__AREA_DESCRIPTION_TEXT:
				return areaDescriptionText != null && !areaDescriptionText.isEmpty();
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC_GROUP:
				return areaGeographicGroup != null && !areaGeographicGroup.isEmpty();
			case _0Package.AREA_TYPE__AREA_GEOGRAPHIC:
				return !getAreaGeographic().isEmpty();
			case _0Package.AREA_TYPE__AREA_REGION_GROUP:
				return areaRegionGroup != null && !areaRegionGroup.isEmpty();
			case _0Package.AREA_TYPE__AREA_REGION:
				return !getAreaRegion().isEmpty();
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT_GROUP:
				return areaAugmentationPointGroup != null && !areaAugmentationPointGroup.isEmpty();
			case _0Package.AREA_TYPE__AREA_AUGMENTATION_POINT:
				return !getAreaAugmentationPoint().isEmpty();
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
		result.append(" (areaGeographicGroup: ");
		result.append(areaGeographicGroup);
		result.append(", areaRegionGroup: ");
		result.append(areaRegionGroup);
		result.append(", areaAugmentationPointGroup: ");
		result.append(areaAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //AreaTypeImpl
