/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.JurisdictionType;
import gov.niem.release.niem.niem.core._3._0.ProperNameTextType;
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
 * An implementation of the model object '<em><b>Jurisdiction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getJurisdictionAbstractGroup <em>Jurisdiction Abstract Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getJurisdictionAbstract <em>Jurisdiction Abstract</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationCityName <em>Location City Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationCountryGroup <em>Location Country Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationCountry <em>Location Country</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationCountyGroup <em>Location County Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationCounty <em>Location County</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationStateGroup <em>Location State Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getLocationState <em>Location State</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getJurisdictionIdentification <em>Jurisdiction Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getJurisdictionAugmentationPointGroup <em>Jurisdiction Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.JurisdictionTypeImpl#getJurisdictionAugmentationPoint <em>Jurisdiction Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JurisdictionTypeImpl extends ObjectTypeImpl implements JurisdictionType {
	/**
	 * The cached value of the '{@link #getJurisdictionAbstractGroup() <em>Jurisdiction Abstract Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictionAbstractGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap jurisdictionAbstractGroup;

	/**
	 * The cached value of the '{@link #getLocationCityName() <em>Location City Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCityName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> locationCityName;

	/**
	 * The cached value of the '{@link #getLocationCountryGroup() <em>Location Country Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCountryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationCountryGroup;

	/**
	 * The cached value of the '{@link #getLocationCountyGroup() <em>Location County Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCountyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationCountyGroup;

	/**
	 * The cached value of the '{@link #getLocationStateGroup() <em>Location State Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationStateGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationStateGroup;

	/**
	 * The cached value of the '{@link #getJurisdictionIdentification() <em>Jurisdiction Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictionIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> jurisdictionIdentification;

	/**
	 * The cached value of the '{@link #getJurisdictionAugmentationPointGroup() <em>Jurisdiction Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap jurisdictionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JurisdictionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getJurisdictionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getJurisdictionAbstractGroup() {
		if (jurisdictionAbstractGroup == null) {
			jurisdictionAbstractGroup = new BasicFeatureMap(this, _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT_GROUP);
		}
		return jurisdictionAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getJurisdictionAbstract() {
		return getJurisdictionAbstractGroup().list(_0Package.eINSTANCE.getJurisdictionType_JurisdictionAbstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getLocationCityName() {
		if (locationCityName == null) {
			locationCityName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.JURISDICTION_TYPE__LOCATION_CITY_NAME);
		}
		return locationCityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationCountryGroup() {
		if (locationCountryGroup == null) {
			locationCountryGroup = new BasicFeatureMap(this, _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY_GROUP);
		}
		return locationCountryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationCountry() {
		return getLocationCountryGroup().list(_0Package.eINSTANCE.getJurisdictionType_LocationCountry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationCountyGroup() {
		if (locationCountyGroup == null) {
			locationCountyGroup = new BasicFeatureMap(this, _0Package.JURISDICTION_TYPE__LOCATION_COUNTY_GROUP);
		}
		return locationCountyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationCounty() {
		return getLocationCountyGroup().list(_0Package.eINSTANCE.getJurisdictionType_LocationCounty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationStateGroup() {
		if (locationStateGroup == null) {
			locationStateGroup = new BasicFeatureMap(this, _0Package.JURISDICTION_TYPE__LOCATION_STATE_GROUP);
		}
		return locationStateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationState() {
		return getLocationStateGroup().list(_0Package.eINSTANCE.getJurisdictionType_LocationState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getJurisdictionIdentification() {
		if (jurisdictionIdentification == null) {
			jurisdictionIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.JURISDICTION_TYPE__JURISDICTION_IDENTIFICATION);
		}
		return jurisdictionIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getJurisdictionAugmentationPointGroup() {
		if (jurisdictionAugmentationPointGroup == null) {
			jurisdictionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT_GROUP);
		}
		return jurisdictionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getJurisdictionAugmentationPoint() {
		return getJurisdictionAugmentationPointGroup().list(_0Package.eINSTANCE.getJurisdictionType_JurisdictionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT_GROUP:
				return ((InternalEList<?>)getJurisdictionAbstractGroup()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT:
				return ((InternalEList<?>)getJurisdictionAbstract()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_CITY_NAME:
				return ((InternalEList<?>)getLocationCityName()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY_GROUP:
				return ((InternalEList<?>)getLocationCountryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY:
				return ((InternalEList<?>)getLocationCountry()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY_GROUP:
				return ((InternalEList<?>)getLocationCountyGroup()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY:
				return ((InternalEList<?>)getLocationCounty()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE_GROUP:
				return ((InternalEList<?>)getLocationStateGroup()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE:
				return ((InternalEList<?>)getLocationState()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__JURISDICTION_IDENTIFICATION:
				return ((InternalEList<?>)getJurisdictionIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getJurisdictionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getJurisdictionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT_GROUP:
				if (coreType) return getJurisdictionAbstractGroup();
				return ((FeatureMap.Internal)getJurisdictionAbstractGroup()).getWrapper();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT:
				return getJurisdictionAbstract();
			case _0Package.JURISDICTION_TYPE__LOCATION_CITY_NAME:
				return getLocationCityName();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY_GROUP:
				if (coreType) return getLocationCountryGroup();
				return ((FeatureMap.Internal)getLocationCountryGroup()).getWrapper();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY:
				return getLocationCountry();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY_GROUP:
				if (coreType) return getLocationCountyGroup();
				return ((FeatureMap.Internal)getLocationCountyGroup()).getWrapper();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY:
				return getLocationCounty();
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE_GROUP:
				if (coreType) return getLocationStateGroup();
				return ((FeatureMap.Internal)getLocationStateGroup()).getWrapper();
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE:
				return getLocationState();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_IDENTIFICATION:
				return getJurisdictionIdentification();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getJurisdictionAugmentationPointGroup();
				return ((FeatureMap.Internal)getJurisdictionAugmentationPointGroup()).getWrapper();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT:
				return getJurisdictionAugmentationPoint();
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
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT_GROUP:
				((FeatureMap.Internal)getJurisdictionAbstractGroup()).set(newValue);
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_CITY_NAME:
				getLocationCityName().clear();
				getLocationCityName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY_GROUP:
				((FeatureMap.Internal)getLocationCountryGroup()).set(newValue);
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY_GROUP:
				((FeatureMap.Internal)getLocationCountyGroup()).set(newValue);
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE_GROUP:
				((FeatureMap.Internal)getLocationStateGroup()).set(newValue);
				return;
			case _0Package.JURISDICTION_TYPE__JURISDICTION_IDENTIFICATION:
				getJurisdictionIdentification().clear();
				getJurisdictionIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getJurisdictionAugmentationPointGroup()).set(newValue);
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
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT_GROUP:
				getJurisdictionAbstractGroup().clear();
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_CITY_NAME:
				getLocationCityName().clear();
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY_GROUP:
				getLocationCountryGroup().clear();
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY_GROUP:
				getLocationCountyGroup().clear();
				return;
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE_GROUP:
				getLocationStateGroup().clear();
				return;
			case _0Package.JURISDICTION_TYPE__JURISDICTION_IDENTIFICATION:
				getJurisdictionIdentification().clear();
				return;
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT_GROUP:
				getJurisdictionAugmentationPointGroup().clear();
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
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT_GROUP:
				return jurisdictionAbstractGroup != null && !jurisdictionAbstractGroup.isEmpty();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_ABSTRACT:
				return !getJurisdictionAbstract().isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_CITY_NAME:
				return locationCityName != null && !locationCityName.isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY_GROUP:
				return locationCountryGroup != null && !locationCountryGroup.isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTRY:
				return !getLocationCountry().isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY_GROUP:
				return locationCountyGroup != null && !locationCountyGroup.isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_COUNTY:
				return !getLocationCounty().isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE_GROUP:
				return locationStateGroup != null && !locationStateGroup.isEmpty();
			case _0Package.JURISDICTION_TYPE__LOCATION_STATE:
				return !getLocationState().isEmpty();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_IDENTIFICATION:
				return jurisdictionIdentification != null && !jurisdictionIdentification.isEmpty();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT_GROUP:
				return jurisdictionAugmentationPointGroup != null && !jurisdictionAugmentationPointGroup.isEmpty();
			case _0Package.JURISDICTION_TYPE__JURISDICTION_AUGMENTATION_POINT:
				return !getJurisdictionAugmentationPoint().isEmpty();
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
		result.append(" (jurisdictionAbstractGroup: ");
		result.append(jurisdictionAbstractGroup);
		result.append(", locationCountryGroup: ");
		result.append(locationCountryGroup);
		result.append(", locationCountyGroup: ");
		result.append(locationCountyGroup);
		result.append(", locationStateGroup: ");
		result.append(locationStateGroup);
		result.append(", jurisdictionAugmentationPointGroup: ");
		result.append(jurisdictionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //JurisdictionTypeImpl
