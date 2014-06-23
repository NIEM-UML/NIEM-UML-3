/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ImageType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
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
 * An implementation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ImageTypeImpl#getImageHeightValue <em>Image Height Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ImageTypeImpl#getImageLocation <em>Image Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ImageTypeImpl#getImageWidthValue <em>Image Width Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ImageTypeImpl#getImageAugmentationPointGroup <em>Image Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ImageTypeImpl#getImageAugmentationPoint <em>Image Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageTypeImpl extends BinaryTypeImpl implements ImageType {
	/**
	 * The cached value of the '{@link #getImageHeightValue() <em>Image Height Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageHeightValue()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> imageHeightValue;

	/**
	 * The cached value of the '{@link #getImageLocation() <em>Image Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> imageLocation;

	/**
	 * The cached value of the '{@link #getImageWidthValue() <em>Image Width Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWidthValue()
	 * @generated
	 * @ordered
	 */
	protected EList<NonNegativeInteger> imageWidthValue;

	/**
	 * The cached value of the '{@link #getImageAugmentationPointGroup() <em>Image Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap imageAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getImageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getImageHeightValue() {
		if (imageHeightValue == null) {
			imageHeightValue = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.IMAGE_TYPE__IMAGE_HEIGHT_VALUE);
		}
		return imageHeightValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getImageLocation() {
		if (imageLocation == null) {
			imageLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.IMAGE_TYPE__IMAGE_LOCATION);
		}
		return imageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonNegativeInteger> getImageWidthValue() {
		if (imageWidthValue == null) {
			imageWidthValue = new EObjectContainmentEList<NonNegativeInteger>(NonNegativeInteger.class, this, _0Package.IMAGE_TYPE__IMAGE_WIDTH_VALUE);
		}
		return imageWidthValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getImageAugmentationPointGroup() {
		if (imageAugmentationPointGroup == null) {
			imageAugmentationPointGroup = new BasicFeatureMap(this, _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT_GROUP);
		}
		return imageAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getImageAugmentationPoint() {
		return getImageAugmentationPointGroup().list(_0Package.eINSTANCE.getImageType_ImageAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.IMAGE_TYPE__IMAGE_HEIGHT_VALUE:
				return ((InternalEList<?>)getImageHeightValue()).basicRemove(otherEnd, msgs);
			case _0Package.IMAGE_TYPE__IMAGE_LOCATION:
				return ((InternalEList<?>)getImageLocation()).basicRemove(otherEnd, msgs);
			case _0Package.IMAGE_TYPE__IMAGE_WIDTH_VALUE:
				return ((InternalEList<?>)getImageWidthValue()).basicRemove(otherEnd, msgs);
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getImageAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getImageAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.IMAGE_TYPE__IMAGE_HEIGHT_VALUE:
				return getImageHeightValue();
			case _0Package.IMAGE_TYPE__IMAGE_LOCATION:
				return getImageLocation();
			case _0Package.IMAGE_TYPE__IMAGE_WIDTH_VALUE:
				return getImageWidthValue();
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getImageAugmentationPointGroup();
				return ((FeatureMap.Internal)getImageAugmentationPointGroup()).getWrapper();
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT:
				return getImageAugmentationPoint();
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
			case _0Package.IMAGE_TYPE__IMAGE_HEIGHT_VALUE:
				getImageHeightValue().clear();
				getImageHeightValue().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.IMAGE_TYPE__IMAGE_LOCATION:
				getImageLocation().clear();
				getImageLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.IMAGE_TYPE__IMAGE_WIDTH_VALUE:
				getImageWidthValue().clear();
				getImageWidthValue().addAll((Collection<? extends NonNegativeInteger>)newValue);
				return;
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getImageAugmentationPointGroup()).set(newValue);
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
			case _0Package.IMAGE_TYPE__IMAGE_HEIGHT_VALUE:
				getImageHeightValue().clear();
				return;
			case _0Package.IMAGE_TYPE__IMAGE_LOCATION:
				getImageLocation().clear();
				return;
			case _0Package.IMAGE_TYPE__IMAGE_WIDTH_VALUE:
				getImageWidthValue().clear();
				return;
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT_GROUP:
				getImageAugmentationPointGroup().clear();
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
			case _0Package.IMAGE_TYPE__IMAGE_HEIGHT_VALUE:
				return imageHeightValue != null && !imageHeightValue.isEmpty();
			case _0Package.IMAGE_TYPE__IMAGE_LOCATION:
				return imageLocation != null && !imageLocation.isEmpty();
			case _0Package.IMAGE_TYPE__IMAGE_WIDTH_VALUE:
				return imageWidthValue != null && !imageWidthValue.isEmpty();
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT_GROUP:
				return imageAugmentationPointGroup != null && !imageAugmentationPointGroup.isEmpty();
			case _0Package.IMAGE_TYPE__IMAGE_AUGMENTATION_POINT:
				return !getImageAugmentationPoint().isEmpty();
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
		result.append(" (imageAugmentationPointGroup: ");
		result.append(imageAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ImageTypeImpl
