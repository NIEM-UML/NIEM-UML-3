/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.ManifestType;
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
 * An implementation of the model object '<em><b>Manifest Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ManifestTypeImpl#getManifestCategoryGroup <em>Manifest Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ManifestTypeImpl#getManifestCategory <em>Manifest Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ManifestTypeImpl#getManifestTransmittedDate <em>Manifest Transmitted Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ManifestTypeImpl#getManifestAugmentationPointGroup <em>Manifest Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ManifestTypeImpl#getManifestAugmentationPoint <em>Manifest Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManifestTypeImpl extends DocumentTypeImpl implements ManifestType {
	/**
	 * The cached value of the '{@link #getManifestCategoryGroup() <em>Manifest Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap manifestCategoryGroup;

	/**
	 * The cached value of the '{@link #getManifestTransmittedDate() <em>Manifest Transmitted Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestTransmittedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> manifestTransmittedDate;

	/**
	 * The cached value of the '{@link #getManifestAugmentationPointGroup() <em>Manifest Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap manifestAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getManifestType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getManifestCategoryGroup() {
		if (manifestCategoryGroup == null) {
			manifestCategoryGroup = new BasicFeatureMap(this, _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY_GROUP);
		}
		return manifestCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getManifestCategory() {
		return getManifestCategoryGroup().list(_0Package.eINSTANCE.getManifestType_ManifestCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getManifestTransmittedDate() {
		if (manifestTransmittedDate == null) {
			manifestTransmittedDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MANIFEST_TYPE__MANIFEST_TRANSMITTED_DATE);
		}
		return manifestTransmittedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getManifestAugmentationPointGroup() {
		if (manifestAugmentationPointGroup == null) {
			manifestAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT_GROUP);
		}
		return manifestAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getManifestAugmentationPoint() {
		return getManifestAugmentationPointGroup().list(_0Package.eINSTANCE.getManifestType_ManifestAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY_GROUP:
				return ((InternalEList<?>)getManifestCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY:
				return ((InternalEList<?>)getManifestCategory()).basicRemove(otherEnd, msgs);
			case _0Package.MANIFEST_TYPE__MANIFEST_TRANSMITTED_DATE:
				return ((InternalEList<?>)getManifestTransmittedDate()).basicRemove(otherEnd, msgs);
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getManifestAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT:
				return ((InternalEList<?>)getManifestAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY_GROUP:
				if (coreType) return getManifestCategoryGroup();
				return ((FeatureMap.Internal)getManifestCategoryGroup()).getWrapper();
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY:
				return getManifestCategory();
			case _0Package.MANIFEST_TYPE__MANIFEST_TRANSMITTED_DATE:
				return getManifestTransmittedDate();
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT_GROUP:
				if (coreType) return getManifestAugmentationPointGroup();
				return ((FeatureMap.Internal)getManifestAugmentationPointGroup()).getWrapper();
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT:
				return getManifestAugmentationPoint();
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
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY_GROUP:
				((FeatureMap.Internal)getManifestCategoryGroup()).set(newValue);
				return;
			case _0Package.MANIFEST_TYPE__MANIFEST_TRANSMITTED_DATE:
				getManifestTransmittedDate().clear();
				getManifestTransmittedDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getManifestAugmentationPointGroup()).set(newValue);
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
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY_GROUP:
				getManifestCategoryGroup().clear();
				return;
			case _0Package.MANIFEST_TYPE__MANIFEST_TRANSMITTED_DATE:
				getManifestTransmittedDate().clear();
				return;
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT_GROUP:
				getManifestAugmentationPointGroup().clear();
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
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY_GROUP:
				return manifestCategoryGroup != null && !manifestCategoryGroup.isEmpty();
			case _0Package.MANIFEST_TYPE__MANIFEST_CATEGORY:
				return !getManifestCategory().isEmpty();
			case _0Package.MANIFEST_TYPE__MANIFEST_TRANSMITTED_DATE:
				return manifestTransmittedDate != null && !manifestTransmittedDate.isEmpty();
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT_GROUP:
				return manifestAugmentationPointGroup != null && !manifestAugmentationPointGroup.isEmpty();
			case _0Package.MANIFEST_TYPE__MANIFEST_AUGMENTATION_POINT:
				return !getManifestAugmentationPoint().isEmpty();
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
		result.append(" (manifestCategoryGroup: ");
		result.append(manifestCategoryGroup);
		result.append(", manifestAugmentationPointGroup: ");
		result.append(manifestAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ManifestTypeImpl
