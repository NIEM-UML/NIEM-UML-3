/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.SiteType;
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
 * An implementation of the model object '<em><b>Site Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteLocation <em>Site Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteMobileDescriptionText <em>Site Mobile Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteMobileIndicator <em>Site Mobile Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteOwnerEntity <em>Site Owner Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteSpecialInformationText <em>Site Special Information Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteAugmentationPointGroup <em>Site Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.SiteTypeImpl#getSiteAugmentationPoint <em>Site Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteTypeImpl extends ObjectTypeImpl implements SiteType {
	/**
	 * The cached value of the '{@link #getSiteLocation() <em>Site Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> siteLocation;

	/**
	 * The cached value of the '{@link #getSiteMobileDescriptionText() <em>Site Mobile Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteMobileDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> siteMobileDescriptionText;

	/**
	 * The cached value of the '{@link #getSiteMobileIndicator() <em>Site Mobile Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteMobileIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> siteMobileIndicator;

	/**
	 * The cached value of the '{@link #getSiteOwnerEntity() <em>Site Owner Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteOwnerEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> siteOwnerEntity;

	/**
	 * The cached value of the '{@link #getSiteSpecialInformationText() <em>Site Special Information Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteSpecialInformationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> siteSpecialInformationText;

	/**
	 * The cached value of the '{@link #getSiteAugmentationPointGroup() <em>Site Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap siteAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getSiteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getSiteLocation() {
		if (siteLocation == null) {
			siteLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.SITE_TYPE__SITE_LOCATION);
		}
		return siteLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSiteMobileDescriptionText() {
		if (siteMobileDescriptionText == null) {
			siteMobileDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SITE_TYPE__SITE_MOBILE_DESCRIPTION_TEXT);
		}
		return siteMobileDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getSiteMobileIndicator() {
		if (siteMobileIndicator == null) {
			siteMobileIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.SITE_TYPE__SITE_MOBILE_INDICATOR);
		}
		return siteMobileIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getSiteOwnerEntity() {
		if (siteOwnerEntity == null) {
			siteOwnerEntity = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.SITE_TYPE__SITE_OWNER_ENTITY);
		}
		return siteOwnerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getSiteSpecialInformationText() {
		if (siteSpecialInformationText == null) {
			siteSpecialInformationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.SITE_TYPE__SITE_SPECIAL_INFORMATION_TEXT);
		}
		return siteSpecialInformationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getSiteAugmentationPointGroup() {
		if (siteAugmentationPointGroup == null) {
			siteAugmentationPointGroup = new BasicFeatureMap(this, _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT_GROUP);
		}
		return siteAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getSiteAugmentationPoint() {
		return getSiteAugmentationPointGroup().list(_0Package.eINSTANCE.getSiteType_SiteAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.SITE_TYPE__SITE_LOCATION:
				return ((InternalEList<?>)getSiteLocation()).basicRemove(otherEnd, msgs);
			case _0Package.SITE_TYPE__SITE_MOBILE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getSiteMobileDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.SITE_TYPE__SITE_MOBILE_INDICATOR:
				return ((InternalEList<?>)getSiteMobileIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.SITE_TYPE__SITE_OWNER_ENTITY:
				return ((InternalEList<?>)getSiteOwnerEntity()).basicRemove(otherEnd, msgs);
			case _0Package.SITE_TYPE__SITE_SPECIAL_INFORMATION_TEXT:
				return ((InternalEList<?>)getSiteSpecialInformationText()).basicRemove(otherEnd, msgs);
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getSiteAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getSiteAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.SITE_TYPE__SITE_LOCATION:
				return getSiteLocation();
			case _0Package.SITE_TYPE__SITE_MOBILE_DESCRIPTION_TEXT:
				return getSiteMobileDescriptionText();
			case _0Package.SITE_TYPE__SITE_MOBILE_INDICATOR:
				return getSiteMobileIndicator();
			case _0Package.SITE_TYPE__SITE_OWNER_ENTITY:
				return getSiteOwnerEntity();
			case _0Package.SITE_TYPE__SITE_SPECIAL_INFORMATION_TEXT:
				return getSiteSpecialInformationText();
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getSiteAugmentationPointGroup();
				return ((FeatureMap.Internal)getSiteAugmentationPointGroup()).getWrapper();
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT:
				return getSiteAugmentationPoint();
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
			case _0Package.SITE_TYPE__SITE_LOCATION:
				getSiteLocation().clear();
				getSiteLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.SITE_TYPE__SITE_MOBILE_DESCRIPTION_TEXT:
				getSiteMobileDescriptionText().clear();
				getSiteMobileDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SITE_TYPE__SITE_MOBILE_INDICATOR:
				getSiteMobileIndicator().clear();
				getSiteMobileIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.SITE_TYPE__SITE_OWNER_ENTITY:
				getSiteOwnerEntity().clear();
				getSiteOwnerEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.SITE_TYPE__SITE_SPECIAL_INFORMATION_TEXT:
				getSiteSpecialInformationText().clear();
				getSiteSpecialInformationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getSiteAugmentationPointGroup()).set(newValue);
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
			case _0Package.SITE_TYPE__SITE_LOCATION:
				getSiteLocation().clear();
				return;
			case _0Package.SITE_TYPE__SITE_MOBILE_DESCRIPTION_TEXT:
				getSiteMobileDescriptionText().clear();
				return;
			case _0Package.SITE_TYPE__SITE_MOBILE_INDICATOR:
				getSiteMobileIndicator().clear();
				return;
			case _0Package.SITE_TYPE__SITE_OWNER_ENTITY:
				getSiteOwnerEntity().clear();
				return;
			case _0Package.SITE_TYPE__SITE_SPECIAL_INFORMATION_TEXT:
				getSiteSpecialInformationText().clear();
				return;
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT_GROUP:
				getSiteAugmentationPointGroup().clear();
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
			case _0Package.SITE_TYPE__SITE_LOCATION:
				return siteLocation != null && !siteLocation.isEmpty();
			case _0Package.SITE_TYPE__SITE_MOBILE_DESCRIPTION_TEXT:
				return siteMobileDescriptionText != null && !siteMobileDescriptionText.isEmpty();
			case _0Package.SITE_TYPE__SITE_MOBILE_INDICATOR:
				return siteMobileIndicator != null && !siteMobileIndicator.isEmpty();
			case _0Package.SITE_TYPE__SITE_OWNER_ENTITY:
				return siteOwnerEntity != null && !siteOwnerEntity.isEmpty();
			case _0Package.SITE_TYPE__SITE_SPECIAL_INFORMATION_TEXT:
				return siteSpecialInformationText != null && !siteSpecialInformationText.isEmpty();
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT_GROUP:
				return siteAugmentationPointGroup != null && !siteAugmentationPointGroup.isEmpty();
			case _0Package.SITE_TYPE__SITE_AUGMENTATION_POINT:
				return !getSiteAugmentationPoint().isEmpty();
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
		result.append(" (siteAugmentationPointGroup: ");
		result.append(siteAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //SiteTypeImpl
