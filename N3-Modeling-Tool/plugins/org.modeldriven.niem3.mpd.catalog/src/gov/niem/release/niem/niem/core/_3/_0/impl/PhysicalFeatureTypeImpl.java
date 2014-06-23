/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ImageType;
import gov.niem.release.niem.niem.core._3._0.PhysicalFeatureType;
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
 * An implementation of the model object '<em><b>Physical Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureGeneralCategoryText <em>Physical Feature General Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureCategoryGroup <em>Physical Feature Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureCategory <em>Physical Feature Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureDescriptionText <em>Physical Feature Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureImage <em>Physical Feature Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureLocationText <em>Physical Feature Location Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureAugmentationPointGroup <em>Physical Feature Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PhysicalFeatureTypeImpl#getPhysicalFeatureAugmentationPoint <em>Physical Feature Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalFeatureTypeImpl extends ObjectTypeImpl implements PhysicalFeatureType {
	/**
	 * The cached value of the '{@link #getPhysicalFeatureGeneralCategoryText() <em>Physical Feature General Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalFeatureGeneralCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> physicalFeatureGeneralCategoryText;

	/**
	 * The cached value of the '{@link #getPhysicalFeatureCategoryGroup() <em>Physical Feature Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalFeatureCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap physicalFeatureCategoryGroup;

	/**
	 * The cached value of the '{@link #getPhysicalFeatureDescriptionText() <em>Physical Feature Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalFeatureDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> physicalFeatureDescriptionText;

	/**
	 * The cached value of the '{@link #getPhysicalFeatureImage() <em>Physical Feature Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalFeatureImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> physicalFeatureImage;

	/**
	 * The cached value of the '{@link #getPhysicalFeatureLocationText() <em>Physical Feature Location Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalFeatureLocationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> physicalFeatureLocationText;

	/**
	 * The cached value of the '{@link #getPhysicalFeatureAugmentationPointGroup() <em>Physical Feature Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalFeatureAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap physicalFeatureAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPhysicalFeatureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPhysicalFeatureGeneralCategoryText() {
		if (physicalFeatureGeneralCategoryText == null) {
			physicalFeatureGeneralCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_GENERAL_CATEGORY_TEXT);
		}
		return physicalFeatureGeneralCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPhysicalFeatureCategoryGroup() {
		if (physicalFeatureCategoryGroup == null) {
			physicalFeatureCategoryGroup = new BasicFeatureMap(this, _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY_GROUP);
		}
		return physicalFeatureCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPhysicalFeatureCategory() {
		return getPhysicalFeatureCategoryGroup().list(_0Package.eINSTANCE.getPhysicalFeatureType_PhysicalFeatureCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPhysicalFeatureDescriptionText() {
		if (physicalFeatureDescriptionText == null) {
			physicalFeatureDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_DESCRIPTION_TEXT);
		}
		return physicalFeatureDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getPhysicalFeatureImage() {
		if (physicalFeatureImage == null) {
			physicalFeatureImage = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_IMAGE);
		}
		return physicalFeatureImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getPhysicalFeatureLocationText() {
		if (physicalFeatureLocationText == null) {
			physicalFeatureLocationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_LOCATION_TEXT);
		}
		return physicalFeatureLocationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPhysicalFeatureAugmentationPointGroup() {
		if (physicalFeatureAugmentationPointGroup == null) {
			physicalFeatureAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT_GROUP);
		}
		return physicalFeatureAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPhysicalFeatureAugmentationPoint() {
		return getPhysicalFeatureAugmentationPointGroup().list(_0Package.eINSTANCE.getPhysicalFeatureType_PhysicalFeatureAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_GENERAL_CATEGORY_TEXT:
				return ((InternalEList<?>)getPhysicalFeatureGeneralCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY_GROUP:
				return ((InternalEList<?>)getPhysicalFeatureCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY:
				return ((InternalEList<?>)getPhysicalFeatureCategory()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getPhysicalFeatureDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_IMAGE:
				return ((InternalEList<?>)getPhysicalFeatureImage()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_LOCATION_TEXT:
				return ((InternalEList<?>)getPhysicalFeatureLocationText()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPhysicalFeatureAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPhysicalFeatureAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_GENERAL_CATEGORY_TEXT:
				return getPhysicalFeatureGeneralCategoryText();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY_GROUP:
				if (coreType) return getPhysicalFeatureCategoryGroup();
				return ((FeatureMap.Internal)getPhysicalFeatureCategoryGroup()).getWrapper();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY:
				return getPhysicalFeatureCategory();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_DESCRIPTION_TEXT:
				return getPhysicalFeatureDescriptionText();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_IMAGE:
				return getPhysicalFeatureImage();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_LOCATION_TEXT:
				return getPhysicalFeatureLocationText();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPhysicalFeatureAugmentationPointGroup();
				return ((FeatureMap.Internal)getPhysicalFeatureAugmentationPointGroup()).getWrapper();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT:
				return getPhysicalFeatureAugmentationPoint();
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
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_GENERAL_CATEGORY_TEXT:
				getPhysicalFeatureGeneralCategoryText().clear();
				getPhysicalFeatureGeneralCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY_GROUP:
				((FeatureMap.Internal)getPhysicalFeatureCategoryGroup()).set(newValue);
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_DESCRIPTION_TEXT:
				getPhysicalFeatureDescriptionText().clear();
				getPhysicalFeatureDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_IMAGE:
				getPhysicalFeatureImage().clear();
				getPhysicalFeatureImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_LOCATION_TEXT:
				getPhysicalFeatureLocationText().clear();
				getPhysicalFeatureLocationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPhysicalFeatureAugmentationPointGroup()).set(newValue);
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
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_GENERAL_CATEGORY_TEXT:
				getPhysicalFeatureGeneralCategoryText().clear();
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY_GROUP:
				getPhysicalFeatureCategoryGroup().clear();
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_DESCRIPTION_TEXT:
				getPhysicalFeatureDescriptionText().clear();
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_IMAGE:
				getPhysicalFeatureImage().clear();
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_LOCATION_TEXT:
				getPhysicalFeatureLocationText().clear();
				return;
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT_GROUP:
				getPhysicalFeatureAugmentationPointGroup().clear();
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
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_GENERAL_CATEGORY_TEXT:
				return physicalFeatureGeneralCategoryText != null && !physicalFeatureGeneralCategoryText.isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY_GROUP:
				return physicalFeatureCategoryGroup != null && !physicalFeatureCategoryGroup.isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_CATEGORY:
				return !getPhysicalFeatureCategory().isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_DESCRIPTION_TEXT:
				return physicalFeatureDescriptionText != null && !physicalFeatureDescriptionText.isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_IMAGE:
				return physicalFeatureImage != null && !physicalFeatureImage.isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_LOCATION_TEXT:
				return physicalFeatureLocationText != null && !physicalFeatureLocationText.isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT_GROUP:
				return physicalFeatureAugmentationPointGroup != null && !physicalFeatureAugmentationPointGroup.isEmpty();
			case _0Package.PHYSICAL_FEATURE_TYPE__PHYSICAL_FEATURE_AUGMENTATION_POINT:
				return !getPhysicalFeatureAugmentationPoint().isEmpty();
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
		result.append(" (physicalFeatureCategoryGroup: ");
		result.append(physicalFeatureCategoryGroup);
		result.append(", physicalFeatureAugmentationPointGroup: ");
		result.append(physicalFeatureAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PhysicalFeatureTypeImpl
