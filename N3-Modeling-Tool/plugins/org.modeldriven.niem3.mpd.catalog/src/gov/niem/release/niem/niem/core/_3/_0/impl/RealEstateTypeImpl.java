/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FacilityType;
import gov.niem.release.niem.niem.core._3._0.RealEstateType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Real Estate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RealEstateTypeImpl#getRealEstateAcreageText <em>Real Estate Acreage Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RealEstateTypeImpl#getRealEstateBoundaryDescriptionText <em>Real Estate Boundary Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RealEstateTypeImpl#getRealEstateAttachedFacility <em>Real Estate Attached Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RealEstateTypeImpl#getRealEstateAugmentationPointGroup <em>Real Estate Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RealEstateTypeImpl#getRealEstateAugmentationPoint <em>Real Estate Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealEstateTypeImpl extends ItemTypeImpl implements RealEstateType {
	/**
	 * The cached value of the '{@link #getRealEstateAcreageText() <em>Real Estate Acreage Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEstateAcreageText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> realEstateAcreageText;

	/**
	 * The cached value of the '{@link #getRealEstateBoundaryDescriptionText() <em>Real Estate Boundary Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEstateBoundaryDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> realEstateBoundaryDescriptionText;

	/**
	 * The cached value of the '{@link #getRealEstateAttachedFacility() <em>Real Estate Attached Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEstateAttachedFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> realEstateAttachedFacility;

	/**
	 * The cached value of the '{@link #getRealEstateAugmentationPointGroup() <em>Real Estate Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealEstateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap realEstateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealEstateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getRealEstateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getRealEstateAcreageText() {
		if (realEstateAcreageText == null) {
			realEstateAcreageText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ACREAGE_TEXT);
		}
		return realEstateAcreageText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getRealEstateBoundaryDescriptionText() {
		if (realEstateBoundaryDescriptionText == null) {
			realEstateBoundaryDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_BOUNDARY_DESCRIPTION_TEXT);
		}
		return realEstateBoundaryDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getRealEstateAttachedFacility() {
		if (realEstateAttachedFacility == null) {
			realEstateAttachedFacility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ATTACHED_FACILITY);
		}
		return realEstateAttachedFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRealEstateAugmentationPointGroup() {
		if (realEstateAugmentationPointGroup == null) {
			realEstateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT_GROUP);
		}
		return realEstateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRealEstateAugmentationPoint() {
		return getRealEstateAugmentationPointGroup().list(_0Package.eINSTANCE.getRealEstateType_RealEstateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ACREAGE_TEXT:
				return ((InternalEList<?>)getRealEstateAcreageText()).basicRemove(otherEnd, msgs);
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_BOUNDARY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getRealEstateBoundaryDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ATTACHED_FACILITY:
				return ((InternalEList<?>)getRealEstateAttachedFacility()).basicRemove(otherEnd, msgs);
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getRealEstateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getRealEstateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ACREAGE_TEXT:
				return getRealEstateAcreageText();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_BOUNDARY_DESCRIPTION_TEXT:
				return getRealEstateBoundaryDescriptionText();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ATTACHED_FACILITY:
				return getRealEstateAttachedFacility();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getRealEstateAugmentationPointGroup();
				return ((FeatureMap.Internal)getRealEstateAugmentationPointGroup()).getWrapper();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT:
				return getRealEstateAugmentationPoint();
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
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ACREAGE_TEXT:
				getRealEstateAcreageText().clear();
				getRealEstateAcreageText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_BOUNDARY_DESCRIPTION_TEXT:
				getRealEstateBoundaryDescriptionText().clear();
				getRealEstateBoundaryDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ATTACHED_FACILITY:
				getRealEstateAttachedFacility().clear();
				getRealEstateAttachedFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getRealEstateAugmentationPointGroup()).set(newValue);
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
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ACREAGE_TEXT:
				getRealEstateAcreageText().clear();
				return;
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_BOUNDARY_DESCRIPTION_TEXT:
				getRealEstateBoundaryDescriptionText().clear();
				return;
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ATTACHED_FACILITY:
				getRealEstateAttachedFacility().clear();
				return;
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT_GROUP:
				getRealEstateAugmentationPointGroup().clear();
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
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ACREAGE_TEXT:
				return realEstateAcreageText != null && !realEstateAcreageText.isEmpty();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_BOUNDARY_DESCRIPTION_TEXT:
				return realEstateBoundaryDescriptionText != null && !realEstateBoundaryDescriptionText.isEmpty();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_ATTACHED_FACILITY:
				return realEstateAttachedFacility != null && !realEstateAttachedFacility.isEmpty();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT_GROUP:
				return realEstateAugmentationPointGroup != null && !realEstateAugmentationPointGroup.isEmpty();
			case _0Package.REAL_ESTATE_TYPE__REAL_ESTATE_AUGMENTATION_POINT:
				return !getRealEstateAugmentationPoint().isEmpty();
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
		result.append(" (realEstateAugmentationPointGroup: ");
		result.append(realEstateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //RealEstateTypeImpl
