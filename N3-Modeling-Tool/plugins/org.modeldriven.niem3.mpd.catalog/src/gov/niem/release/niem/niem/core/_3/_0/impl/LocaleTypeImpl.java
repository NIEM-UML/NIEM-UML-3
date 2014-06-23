/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LocaleType;
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
 * An implementation of the model object '<em><b>Locale Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleCensusBlockID <em>Locale Census Block ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleCensusTractID <em>Locale Census Tract ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleCommunityName <em>Locale Community Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleDescriptionText <em>Locale Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleDistrictName <em>Locale District Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleEmergencyServicesName <em>Locale Emergency Services Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleFireJurisdictionID <em>Locale Fire Jurisdiction ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleJudicialDistrictGroup <em>Locale Judicial District Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleJudicialDistrict <em>Locale Judicial District</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleJudicialDistrictName <em>Locale Judicial District Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleNeighborhoodName <em>Locale Neighborhood Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocalePoliceBeatText <em>Locale Police Beat Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocalePoliceGridText <em>Locale Police Grid Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocalePoliceJurisdictionID <em>Locale Police Jurisdiction ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleRegionName <em>Locale Region Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleSubdivisionName <em>Locale Subdivision Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleZoneName <em>Locale Zone Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleEmergencyServicesJurisdictionID <em>Locale Emergency Services Jurisdiction ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleAugmentationPointGroup <em>Locale Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocaleTypeImpl#getLocaleAugmentationPoint <em>Locale Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocaleTypeImpl extends ObjectTypeImpl implements LocaleType {
	/**
	 * The cached value of the '{@link #getLocaleCensusBlockID() <em>Locale Census Block ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleCensusBlockID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> localeCensusBlockID;

	/**
	 * The cached value of the '{@link #getLocaleCensusTractID() <em>Locale Census Tract ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleCensusTractID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> localeCensusTractID;

	/**
	 * The cached value of the '{@link #getLocaleCommunityName() <em>Locale Community Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleCommunityName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeCommunityName;

	/**
	 * The cached value of the '{@link #getLocaleDescriptionText() <em>Locale Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeDescriptionText;

	/**
	 * The cached value of the '{@link #getLocaleDistrictName() <em>Locale District Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleDistrictName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeDistrictName;

	/**
	 * The cached value of the '{@link #getLocaleEmergencyServicesName() <em>Locale Emergency Services Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleEmergencyServicesName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeEmergencyServicesName;

	/**
	 * The cached value of the '{@link #getLocaleFireJurisdictionID() <em>Locale Fire Jurisdiction ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleFireJurisdictionID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> localeFireJurisdictionID;

	/**
	 * The cached value of the '{@link #getLocaleJudicialDistrictGroup() <em>Locale Judicial District Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleJudicialDistrictGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap localeJudicialDistrictGroup;

	/**
	 * The cached value of the '{@link #getLocaleJudicialDistrictName() <em>Locale Judicial District Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleJudicialDistrictName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeJudicialDistrictName;

	/**
	 * The cached value of the '{@link #getLocaleNeighborhoodName() <em>Locale Neighborhood Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleNeighborhoodName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeNeighborhoodName;

	/**
	 * The cached value of the '{@link #getLocalePoliceBeatText() <em>Locale Police Beat Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalePoliceBeatText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localePoliceBeatText;

	/**
	 * The cached value of the '{@link #getLocalePoliceGridText() <em>Locale Police Grid Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalePoliceGridText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localePoliceGridText;

	/**
	 * The cached value of the '{@link #getLocalePoliceJurisdictionID() <em>Locale Police Jurisdiction ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalePoliceJurisdictionID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> localePoliceJurisdictionID;

	/**
	 * The cached value of the '{@link #getLocaleRegionName() <em>Locale Region Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleRegionName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeRegionName;

	/**
	 * The cached value of the '{@link #getLocaleSubdivisionName() <em>Locale Subdivision Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleSubdivisionName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeSubdivisionName;

	/**
	 * The cached value of the '{@link #getLocaleZoneName() <em>Locale Zone Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleZoneName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> localeZoneName;

	/**
	 * The cached value of the '{@link #getLocaleEmergencyServicesJurisdictionID() <em>Locale Emergency Services Jurisdiction ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleEmergencyServicesJurisdictionID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> localeEmergencyServicesJurisdictionID;

	/**
	 * The cached value of the '{@link #getLocaleAugmentationPointGroup() <em>Locale Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap localeAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocaleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLocaleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleCensusBlockID() {
		if (localeCensusBlockID == null) {
			localeCensusBlockID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.LOCALE_TYPE__LOCALE_CENSUS_BLOCK_ID);
		}
		return localeCensusBlockID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleCensusTractID() {
		if (localeCensusTractID == null) {
			localeCensusTractID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.LOCALE_TYPE__LOCALE_CENSUS_TRACT_ID);
		}
		return localeCensusTractID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleCommunityName() {
		if (localeCommunityName == null) {
			localeCommunityName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_COMMUNITY_NAME);
		}
		return localeCommunityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleDescriptionText() {
		if (localeDescriptionText == null) {
			localeDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_DESCRIPTION_TEXT);
		}
		return localeDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleDistrictName() {
		if (localeDistrictName == null) {
			localeDistrictName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_DISTRICT_NAME);
		}
		return localeDistrictName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleEmergencyServicesName() {
		if (localeEmergencyServicesName == null) {
			localeEmergencyServicesName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_NAME);
		}
		return localeEmergencyServicesName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleFireJurisdictionID() {
		if (localeFireJurisdictionID == null) {
			localeFireJurisdictionID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.LOCALE_TYPE__LOCALE_FIRE_JURISDICTION_ID);
		}
		return localeFireJurisdictionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocaleJudicialDistrictGroup() {
		if (localeJudicialDistrictGroup == null) {
			localeJudicialDistrictGroup = new BasicFeatureMap(this, _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_GROUP);
		}
		return localeJudicialDistrictGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocaleJudicialDistrict() {
		return getLocaleJudicialDistrictGroup().list(_0Package.eINSTANCE.getLocaleType_LocaleJudicialDistrict());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleJudicialDistrictName() {
		if (localeJudicialDistrictName == null) {
			localeJudicialDistrictName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_NAME);
		}
		return localeJudicialDistrictName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleNeighborhoodName() {
		if (localeNeighborhoodName == null) {
			localeNeighborhoodName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_NEIGHBORHOOD_NAME);
		}
		return localeNeighborhoodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocalePoliceBeatText() {
		if (localePoliceBeatText == null) {
			localePoliceBeatText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_POLICE_BEAT_TEXT);
		}
		return localePoliceBeatText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocalePoliceGridText() {
		if (localePoliceGridText == null) {
			localePoliceGridText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_POLICE_GRID_TEXT);
		}
		return localePoliceGridText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocalePoliceJurisdictionID() {
		if (localePoliceJurisdictionID == null) {
			localePoliceJurisdictionID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.LOCALE_TYPE__LOCALE_POLICE_JURISDICTION_ID);
		}
		return localePoliceJurisdictionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleRegionName() {
		if (localeRegionName == null) {
			localeRegionName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_REGION_NAME);
		}
		return localeRegionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleSubdivisionName() {
		if (localeSubdivisionName == null) {
			localeSubdivisionName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_SUBDIVISION_NAME);
		}
		return localeSubdivisionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocaleZoneName() {
		if (localeZoneName == null) {
			localeZoneName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCALE_TYPE__LOCALE_ZONE_NAME);
		}
		return localeZoneName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getLocaleEmergencyServicesJurisdictionID() {
		if (localeEmergencyServicesJurisdictionID == null) {
			localeEmergencyServicesJurisdictionID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_JURISDICTION_ID);
		}
		return localeEmergencyServicesJurisdictionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocaleAugmentationPointGroup() {
		if (localeAugmentationPointGroup == null) {
			localeAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT_GROUP);
		}
		return localeAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocaleAugmentationPoint() {
		return getLocaleAugmentationPointGroup().list(_0Package.eINSTANCE.getLocaleType_LocaleAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_BLOCK_ID:
				return ((InternalEList<?>)getLocaleCensusBlockID()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_TRACT_ID:
				return ((InternalEList<?>)getLocaleCensusTractID()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_COMMUNITY_NAME:
				return ((InternalEList<?>)getLocaleCommunityName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getLocaleDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_DISTRICT_NAME:
				return ((InternalEList<?>)getLocaleDistrictName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_NAME:
				return ((InternalEList<?>)getLocaleEmergencyServicesName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_FIRE_JURISDICTION_ID:
				return ((InternalEList<?>)getLocaleFireJurisdictionID()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_GROUP:
				return ((InternalEList<?>)getLocaleJudicialDistrictGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT:
				return ((InternalEList<?>)getLocaleJudicialDistrict()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_NAME:
				return ((InternalEList<?>)getLocaleJudicialDistrictName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_NEIGHBORHOOD_NAME:
				return ((InternalEList<?>)getLocaleNeighborhoodName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_BEAT_TEXT:
				return ((InternalEList<?>)getLocalePoliceBeatText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_GRID_TEXT:
				return ((InternalEList<?>)getLocalePoliceGridText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_JURISDICTION_ID:
				return ((InternalEList<?>)getLocalePoliceJurisdictionID()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_REGION_NAME:
				return ((InternalEList<?>)getLocaleRegionName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_SUBDIVISION_NAME:
				return ((InternalEList<?>)getLocaleSubdivisionName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_ZONE_NAME:
				return ((InternalEList<?>)getLocaleZoneName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_JURISDICTION_ID:
				return ((InternalEList<?>)getLocaleEmergencyServicesJurisdictionID()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLocaleAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLocaleAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_BLOCK_ID:
				return getLocaleCensusBlockID();
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_TRACT_ID:
				return getLocaleCensusTractID();
			case _0Package.LOCALE_TYPE__LOCALE_COMMUNITY_NAME:
				return getLocaleCommunityName();
			case _0Package.LOCALE_TYPE__LOCALE_DESCRIPTION_TEXT:
				return getLocaleDescriptionText();
			case _0Package.LOCALE_TYPE__LOCALE_DISTRICT_NAME:
				return getLocaleDistrictName();
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_NAME:
				return getLocaleEmergencyServicesName();
			case _0Package.LOCALE_TYPE__LOCALE_FIRE_JURISDICTION_ID:
				return getLocaleFireJurisdictionID();
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_GROUP:
				if (coreType) return getLocaleJudicialDistrictGroup();
				return ((FeatureMap.Internal)getLocaleJudicialDistrictGroup()).getWrapper();
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT:
				return getLocaleJudicialDistrict();
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_NAME:
				return getLocaleJudicialDistrictName();
			case _0Package.LOCALE_TYPE__LOCALE_NEIGHBORHOOD_NAME:
				return getLocaleNeighborhoodName();
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_BEAT_TEXT:
				return getLocalePoliceBeatText();
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_GRID_TEXT:
				return getLocalePoliceGridText();
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_JURISDICTION_ID:
				return getLocalePoliceJurisdictionID();
			case _0Package.LOCALE_TYPE__LOCALE_REGION_NAME:
				return getLocaleRegionName();
			case _0Package.LOCALE_TYPE__LOCALE_SUBDIVISION_NAME:
				return getLocaleSubdivisionName();
			case _0Package.LOCALE_TYPE__LOCALE_ZONE_NAME:
				return getLocaleZoneName();
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_JURISDICTION_ID:
				return getLocaleEmergencyServicesJurisdictionID();
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLocaleAugmentationPointGroup();
				return ((FeatureMap.Internal)getLocaleAugmentationPointGroup()).getWrapper();
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT:
				return getLocaleAugmentationPoint();
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
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_BLOCK_ID:
				getLocaleCensusBlockID().clear();
				getLocaleCensusBlockID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_TRACT_ID:
				getLocaleCensusTractID().clear();
				getLocaleCensusTractID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_COMMUNITY_NAME:
				getLocaleCommunityName().clear();
				getLocaleCommunityName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_DESCRIPTION_TEXT:
				getLocaleDescriptionText().clear();
				getLocaleDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_DISTRICT_NAME:
				getLocaleDistrictName().clear();
				getLocaleDistrictName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_NAME:
				getLocaleEmergencyServicesName().clear();
				getLocaleEmergencyServicesName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_FIRE_JURISDICTION_ID:
				getLocaleFireJurisdictionID().clear();
				getLocaleFireJurisdictionID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_GROUP:
				((FeatureMap.Internal)getLocaleJudicialDistrictGroup()).set(newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_NAME:
				getLocaleJudicialDistrictName().clear();
				getLocaleJudicialDistrictName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_NEIGHBORHOOD_NAME:
				getLocaleNeighborhoodName().clear();
				getLocaleNeighborhoodName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_BEAT_TEXT:
				getLocalePoliceBeatText().clear();
				getLocalePoliceBeatText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_GRID_TEXT:
				getLocalePoliceGridText().clear();
				getLocalePoliceGridText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_JURISDICTION_ID:
				getLocalePoliceJurisdictionID().clear();
				getLocalePoliceJurisdictionID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_REGION_NAME:
				getLocaleRegionName().clear();
				getLocaleRegionName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_SUBDIVISION_NAME:
				getLocaleSubdivisionName().clear();
				getLocaleSubdivisionName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_ZONE_NAME:
				getLocaleZoneName().clear();
				getLocaleZoneName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_JURISDICTION_ID:
				getLocaleEmergencyServicesJurisdictionID().clear();
				getLocaleEmergencyServicesJurisdictionID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLocaleAugmentationPointGroup()).set(newValue);
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
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_BLOCK_ID:
				getLocaleCensusBlockID().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_TRACT_ID:
				getLocaleCensusTractID().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_COMMUNITY_NAME:
				getLocaleCommunityName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_DESCRIPTION_TEXT:
				getLocaleDescriptionText().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_DISTRICT_NAME:
				getLocaleDistrictName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_NAME:
				getLocaleEmergencyServicesName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_FIRE_JURISDICTION_ID:
				getLocaleFireJurisdictionID().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_GROUP:
				getLocaleJudicialDistrictGroup().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_NAME:
				getLocaleJudicialDistrictName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_NEIGHBORHOOD_NAME:
				getLocaleNeighborhoodName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_BEAT_TEXT:
				getLocalePoliceBeatText().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_GRID_TEXT:
				getLocalePoliceGridText().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_JURISDICTION_ID:
				getLocalePoliceJurisdictionID().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_REGION_NAME:
				getLocaleRegionName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_SUBDIVISION_NAME:
				getLocaleSubdivisionName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_ZONE_NAME:
				getLocaleZoneName().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_JURISDICTION_ID:
				getLocaleEmergencyServicesJurisdictionID().clear();
				return;
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT_GROUP:
				getLocaleAugmentationPointGroup().clear();
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
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_BLOCK_ID:
				return localeCensusBlockID != null && !localeCensusBlockID.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_CENSUS_TRACT_ID:
				return localeCensusTractID != null && !localeCensusTractID.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_COMMUNITY_NAME:
				return localeCommunityName != null && !localeCommunityName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_DESCRIPTION_TEXT:
				return localeDescriptionText != null && !localeDescriptionText.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_DISTRICT_NAME:
				return localeDistrictName != null && !localeDistrictName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_NAME:
				return localeEmergencyServicesName != null && !localeEmergencyServicesName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_FIRE_JURISDICTION_ID:
				return localeFireJurisdictionID != null && !localeFireJurisdictionID.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_GROUP:
				return localeJudicialDistrictGroup != null && !localeJudicialDistrictGroup.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT:
				return !getLocaleJudicialDistrict().isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_JUDICIAL_DISTRICT_NAME:
				return localeJudicialDistrictName != null && !localeJudicialDistrictName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_NEIGHBORHOOD_NAME:
				return localeNeighborhoodName != null && !localeNeighborhoodName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_BEAT_TEXT:
				return localePoliceBeatText != null && !localePoliceBeatText.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_GRID_TEXT:
				return localePoliceGridText != null && !localePoliceGridText.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_POLICE_JURISDICTION_ID:
				return localePoliceJurisdictionID != null && !localePoliceJurisdictionID.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_REGION_NAME:
				return localeRegionName != null && !localeRegionName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_SUBDIVISION_NAME:
				return localeSubdivisionName != null && !localeSubdivisionName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_ZONE_NAME:
				return localeZoneName != null && !localeZoneName.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_EMERGENCY_SERVICES_JURISDICTION_ID:
				return localeEmergencyServicesJurisdictionID != null && !localeEmergencyServicesJurisdictionID.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT_GROUP:
				return localeAugmentationPointGroup != null && !localeAugmentationPointGroup.isEmpty();
			case _0Package.LOCALE_TYPE__LOCALE_AUGMENTATION_POINT:
				return !getLocaleAugmentationPoint().isEmpty();
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
		result.append(" (localeJudicialDistrictGroup: ");
		result.append(localeJudicialDistrictGroup);
		result.append(", localeAugmentationPointGroup: ");
		result.append(localeAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //LocaleTypeImpl
