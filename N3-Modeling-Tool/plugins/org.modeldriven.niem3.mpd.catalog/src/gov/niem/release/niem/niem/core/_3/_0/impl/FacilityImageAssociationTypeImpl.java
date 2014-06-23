/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.FacilityImageAssociationType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
import gov.niem.release.niem.niem.core._3._0.ImageType;
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
 * An implementation of the model object '<em><b>Facility Image Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityImageAssociationTypeImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityImageAssociationTypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityImageAssociationTypeImpl#getFacilityImageAssociationAugmentationPointGroup <em>Facility Image Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityImageAssociationTypeImpl#getFacilityImageAssociationAugmentationPoint <em>Facility Image Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilityImageAssociationTypeImpl extends AssociationTypeImpl implements FacilityImageAssociationType {
	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> facility;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> image;

	/**
	 * The cached value of the '{@link #getFacilityImageAssociationAugmentationPointGroup() <em>Facility Image Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityImageAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityImageAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityImageAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFacilityImageAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getFacility() {
		if (facility == null) {
			facility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY);
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getImage() {
		if (image == null) {
			image = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__IMAGE);
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityImageAssociationAugmentationPointGroup() {
		if (facilityImageAssociationAugmentationPointGroup == null) {
			facilityImageAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return facilityImageAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityImageAssociationAugmentationPoint() {
		return getFacilityImageAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getFacilityImageAssociationType_FacilityImageAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY:
				return ((InternalEList<?>)getFacility()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__IMAGE:
				return ((InternalEList<?>)getImage()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFacilityImageAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFacilityImageAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY:
				return getFacility();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__IMAGE:
				return getImage();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFacilityImageAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getFacilityImageAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT:
				return getFacilityImageAssociationAugmentationPoint();
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
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				getFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__IMAGE:
				getImage().clear();
				getImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFacilityImageAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				return;
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__IMAGE:
				getImage().clear();
				return;
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getFacilityImageAssociationAugmentationPointGroup().clear();
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
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY:
				return facility != null && !facility.isEmpty();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__IMAGE:
				return image != null && !image.isEmpty();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return facilityImageAssociationAugmentationPointGroup != null && !facilityImageAssociationAugmentationPointGroup.isEmpty();
			case _0Package.FACILITY_IMAGE_ASSOCIATION_TYPE__FACILITY_IMAGE_ASSOCIATION_AUGMENTATION_POINT:
				return !getFacilityImageAssociationAugmentationPoint().isEmpty();
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
		result.append(" (facilityImageAssociationAugmentationPointGroup: ");
		result.append(facilityImageAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FacilityImageAssociationTypeImpl
