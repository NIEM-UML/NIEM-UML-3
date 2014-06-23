/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.AreaType;
import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.LocaleType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.MapLocationType;
import gov.niem.release.niem.niem.core._3._0.ProperNameTextType;
import gov.niem.release.niem.niem.core._3._0.RelativeLocationType;
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
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationAddressAbstractGroup <em>Location Address Abstract Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationAddressAbstract <em>Location Address Abstract</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationArea <em>Location Area</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationCategoryGroup <em>Location Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationCategory <em>Location Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationContactInformation <em>Location Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationDescriptionText <em>Location Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationGeospatialCoordinateGroup <em>Location Geospatial Coordinate Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationGeospatialCoordinate <em>Location Geospatial Coordinate</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationLandmarkText <em>Location Landmark Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationLocale <em>Location Locale</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationMapLocation <em>Location Map Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationRangeDescriptionText <em>Location Range Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationRelativeLocation <em>Location Relative Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationSurroundingAreaDescriptionText <em>Location Surrounding Area Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationIdentification <em>Location Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationHeightGroup <em>Location Height Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationHeight <em>Location Height</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationAugmentationPointGroup <em>Location Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationTypeImpl#getLocationAugmentationPoint <em>Location Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTypeImpl extends ObjectTypeImpl implements LocationType {
	/**
	 * The cached value of the '{@link #getLocationAddressAbstractGroup() <em>Location Address Abstract Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAddressAbstractGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationAddressAbstractGroup;

	/**
	 * The cached value of the '{@link #getLocationArea() <em>Location Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationArea()
	 * @generated
	 * @ordered
	 */
	protected EList<AreaType> locationArea;

	/**
	 * The cached value of the '{@link #getLocationCategoryGroup() <em>Location Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationCategoryGroup;

	/**
	 * The cached value of the '{@link #getLocationContactInformation() <em>Location Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> locationContactInformation;

	/**
	 * The cached value of the '{@link #getLocationDescriptionText() <em>Location Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> locationDescriptionText;

	/**
	 * The cached value of the '{@link #getLocationGeospatialCoordinateGroup() <em>Location Geospatial Coordinate Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationGeospatialCoordinateGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationGeospatialCoordinateGroup;

	/**
	 * The cached value of the '{@link #getLocationLandmarkText() <em>Location Landmark Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLandmarkText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> locationLandmarkText;

	/**
	 * The cached value of the '{@link #getLocationLocale() <em>Location Locale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationLocale()
	 * @generated
	 * @ordered
	 */
	protected EList<LocaleType> locationLocale;

	/**
	 * The cached value of the '{@link #getLocationMapLocation() <em>Location Map Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationMapLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<MapLocationType> locationMapLocation;

	/**
	 * The cached value of the '{@link #getLocationName() <em>Location Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected EList<ProperNameTextType> locationName;

	/**
	 * The cached value of the '{@link #getLocationRangeDescriptionText() <em>Location Range Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationRangeDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> locationRangeDescriptionText;

	/**
	 * The cached value of the '{@link #getLocationRelativeLocation() <em>Location Relative Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationRelativeLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeLocationType> locationRelativeLocation;

	/**
	 * The cached value of the '{@link #getLocationSurroundingAreaDescriptionText() <em>Location Surrounding Area Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSurroundingAreaDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> locationSurroundingAreaDescriptionText;

	/**
	 * The cached value of the '{@link #getLocationIdentification() <em>Location Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> locationIdentification;

	/**
	 * The cached value of the '{@link #getLocationHeightGroup() <em>Location Height Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationHeightGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationHeightGroup;

	/**
	 * The cached value of the '{@link #getLocationAugmentationPointGroup() <em>Location Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLocationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationAddressAbstractGroup() {
		if (locationAddressAbstractGroup == null) {
			locationAddressAbstractGroup = new BasicFeatureMap(this, _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT_GROUP);
		}
		return locationAddressAbstractGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationAddressAbstract() {
		return getLocationAddressAbstractGroup().list(_0Package.eINSTANCE.getLocationType_LocationAddressAbstract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AreaType> getLocationArea() {
		if (locationArea == null) {
			locationArea = new EObjectContainmentEList<AreaType>(AreaType.class, this, _0Package.LOCATION_TYPE__LOCATION_AREA);
		}
		return locationArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationCategoryGroup() {
		if (locationCategoryGroup == null) {
			locationCategoryGroup = new BasicFeatureMap(this, _0Package.LOCATION_TYPE__LOCATION_CATEGORY_GROUP);
		}
		return locationCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationCategory() {
		return getLocationCategoryGroup().list(_0Package.eINSTANCE.getLocationType_LocationCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getLocationContactInformation() {
		if (locationContactInformation == null) {
			locationContactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.LOCATION_TYPE__LOCATION_CONTACT_INFORMATION);
		}
		return locationContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocationDescriptionText() {
		if (locationDescriptionText == null) {
			locationDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCATION_TYPE__LOCATION_DESCRIPTION_TEXT);
		}
		return locationDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationGeospatialCoordinateGroup() {
		if (locationGeospatialCoordinateGroup == null) {
			locationGeospatialCoordinateGroup = new BasicFeatureMap(this, _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE_GROUP);
		}
		return locationGeospatialCoordinateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationGeospatialCoordinate() {
		return getLocationGeospatialCoordinateGroup().list(_0Package.eINSTANCE.getLocationType_LocationGeospatialCoordinate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocationLandmarkText() {
		if (locationLandmarkText == null) {
			locationLandmarkText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCATION_TYPE__LOCATION_LANDMARK_TEXT);
		}
		return locationLandmarkText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocaleType> getLocationLocale() {
		if (locationLocale == null) {
			locationLocale = new EObjectContainmentEList<LocaleType>(LocaleType.class, this, _0Package.LOCATION_TYPE__LOCATION_LOCALE);
		}
		return locationLocale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapLocationType> getLocationMapLocation() {
		if (locationMapLocation == null) {
			locationMapLocation = new EObjectContainmentEList<MapLocationType>(MapLocationType.class, this, _0Package.LOCATION_TYPE__LOCATION_MAP_LOCATION);
		}
		return locationMapLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProperNameTextType> getLocationName() {
		if (locationName == null) {
			locationName = new EObjectContainmentEList<ProperNameTextType>(ProperNameTextType.class, this, _0Package.LOCATION_TYPE__LOCATION_NAME);
		}
		return locationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocationRangeDescriptionText() {
		if (locationRangeDescriptionText == null) {
			locationRangeDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCATION_TYPE__LOCATION_RANGE_DESCRIPTION_TEXT);
		}
		return locationRangeDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeLocationType> getLocationRelativeLocation() {
		if (locationRelativeLocation == null) {
			locationRelativeLocation = new EObjectContainmentEList<RelativeLocationType>(RelativeLocationType.class, this, _0Package.LOCATION_TYPE__LOCATION_RELATIVE_LOCATION);
		}
		return locationRelativeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getLocationSurroundingAreaDescriptionText() {
		if (locationSurroundingAreaDescriptionText == null) {
			locationSurroundingAreaDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.LOCATION_TYPE__LOCATION_SURROUNDING_AREA_DESCRIPTION_TEXT);
		}
		return locationSurroundingAreaDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getLocationIdentification() {
		if (locationIdentification == null) {
			locationIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.LOCATION_TYPE__LOCATION_IDENTIFICATION);
		}
		return locationIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationHeightGroup() {
		if (locationHeightGroup == null) {
			locationHeightGroup = new BasicFeatureMap(this, _0Package.LOCATION_TYPE__LOCATION_HEIGHT_GROUP);
		}
		return locationHeightGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationHeight() {
		return getLocationHeightGroup().list(_0Package.eINSTANCE.getLocationType_LocationHeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationAugmentationPointGroup() {
		if (locationAugmentationPointGroup == null) {
			locationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT_GROUP);
		}
		return locationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationAugmentationPoint() {
		return getLocationAugmentationPointGroup().list(_0Package.eINSTANCE.getLocationType_LocationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT_GROUP:
				return ((InternalEList<?>)getLocationAddressAbstractGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT:
				return ((InternalEList<?>)getLocationAddressAbstract()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_AREA:
				return ((InternalEList<?>)getLocationArea()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY_GROUP:
				return ((InternalEList<?>)getLocationCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY:
				return ((InternalEList<?>)getLocationCategory()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_CONTACT_INFORMATION:
				return ((InternalEList<?>)getLocationContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getLocationDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE_GROUP:
				return ((InternalEList<?>)getLocationGeospatialCoordinateGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE:
				return ((InternalEList<?>)getLocationGeospatialCoordinate()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_LANDMARK_TEXT:
				return ((InternalEList<?>)getLocationLandmarkText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_LOCALE:
				return ((InternalEList<?>)getLocationLocale()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_MAP_LOCATION:
				return ((InternalEList<?>)getLocationMapLocation()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_NAME:
				return ((InternalEList<?>)getLocationName()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_RANGE_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getLocationRangeDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_RELATIVE_LOCATION:
				return ((InternalEList<?>)getLocationRelativeLocation()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_SURROUNDING_AREA_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getLocationSurroundingAreaDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_IDENTIFICATION:
				return ((InternalEList<?>)getLocationIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT_GROUP:
				return ((InternalEList<?>)getLocationHeightGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT:
				return ((InternalEList<?>)getLocationHeight()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLocationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLocationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT_GROUP:
				if (coreType) return getLocationAddressAbstractGroup();
				return ((FeatureMap.Internal)getLocationAddressAbstractGroup()).getWrapper();
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT:
				return getLocationAddressAbstract();
			case _0Package.LOCATION_TYPE__LOCATION_AREA:
				return getLocationArea();
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY_GROUP:
				if (coreType) return getLocationCategoryGroup();
				return ((FeatureMap.Internal)getLocationCategoryGroup()).getWrapper();
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY:
				return getLocationCategory();
			case _0Package.LOCATION_TYPE__LOCATION_CONTACT_INFORMATION:
				return getLocationContactInformation();
			case _0Package.LOCATION_TYPE__LOCATION_DESCRIPTION_TEXT:
				return getLocationDescriptionText();
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE_GROUP:
				if (coreType) return getLocationGeospatialCoordinateGroup();
				return ((FeatureMap.Internal)getLocationGeospatialCoordinateGroup()).getWrapper();
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE:
				return getLocationGeospatialCoordinate();
			case _0Package.LOCATION_TYPE__LOCATION_LANDMARK_TEXT:
				return getLocationLandmarkText();
			case _0Package.LOCATION_TYPE__LOCATION_LOCALE:
				return getLocationLocale();
			case _0Package.LOCATION_TYPE__LOCATION_MAP_LOCATION:
				return getLocationMapLocation();
			case _0Package.LOCATION_TYPE__LOCATION_NAME:
				return getLocationName();
			case _0Package.LOCATION_TYPE__LOCATION_RANGE_DESCRIPTION_TEXT:
				return getLocationRangeDescriptionText();
			case _0Package.LOCATION_TYPE__LOCATION_RELATIVE_LOCATION:
				return getLocationRelativeLocation();
			case _0Package.LOCATION_TYPE__LOCATION_SURROUNDING_AREA_DESCRIPTION_TEXT:
				return getLocationSurroundingAreaDescriptionText();
			case _0Package.LOCATION_TYPE__LOCATION_IDENTIFICATION:
				return getLocationIdentification();
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT_GROUP:
				if (coreType) return getLocationHeightGroup();
				return ((FeatureMap.Internal)getLocationHeightGroup()).getWrapper();
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT:
				return getLocationHeight();
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLocationAugmentationPointGroup();
				return ((FeatureMap.Internal)getLocationAugmentationPointGroup()).getWrapper();
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT:
				return getLocationAugmentationPoint();
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
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT_GROUP:
				((FeatureMap.Internal)getLocationAddressAbstractGroup()).set(newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_AREA:
				getLocationArea().clear();
				getLocationArea().addAll((Collection<? extends AreaType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY_GROUP:
				((FeatureMap.Internal)getLocationCategoryGroup()).set(newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_CONTACT_INFORMATION:
				getLocationContactInformation().clear();
				getLocationContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_DESCRIPTION_TEXT:
				getLocationDescriptionText().clear();
				getLocationDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE_GROUP:
				((FeatureMap.Internal)getLocationGeospatialCoordinateGroup()).set(newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_LANDMARK_TEXT:
				getLocationLandmarkText().clear();
				getLocationLandmarkText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_LOCALE:
				getLocationLocale().clear();
				getLocationLocale().addAll((Collection<? extends LocaleType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_MAP_LOCATION:
				getLocationMapLocation().clear();
				getLocationMapLocation().addAll((Collection<? extends MapLocationType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_NAME:
				getLocationName().clear();
				getLocationName().addAll((Collection<? extends ProperNameTextType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_RANGE_DESCRIPTION_TEXT:
				getLocationRangeDescriptionText().clear();
				getLocationRangeDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_RELATIVE_LOCATION:
				getLocationRelativeLocation().clear();
				getLocationRelativeLocation().addAll((Collection<? extends RelativeLocationType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_SURROUNDING_AREA_DESCRIPTION_TEXT:
				getLocationSurroundingAreaDescriptionText().clear();
				getLocationSurroundingAreaDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_IDENTIFICATION:
				getLocationIdentification().clear();
				getLocationIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT_GROUP:
				((FeatureMap.Internal)getLocationHeightGroup()).set(newValue);
				return;
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLocationAugmentationPointGroup()).set(newValue);
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
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT_GROUP:
				getLocationAddressAbstractGroup().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_AREA:
				getLocationArea().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY_GROUP:
				getLocationCategoryGroup().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_CONTACT_INFORMATION:
				getLocationContactInformation().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_DESCRIPTION_TEXT:
				getLocationDescriptionText().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE_GROUP:
				getLocationGeospatialCoordinateGroup().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_LANDMARK_TEXT:
				getLocationLandmarkText().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_LOCALE:
				getLocationLocale().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_MAP_LOCATION:
				getLocationMapLocation().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_NAME:
				getLocationName().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_RANGE_DESCRIPTION_TEXT:
				getLocationRangeDescriptionText().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_RELATIVE_LOCATION:
				getLocationRelativeLocation().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_SURROUNDING_AREA_DESCRIPTION_TEXT:
				getLocationSurroundingAreaDescriptionText().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_IDENTIFICATION:
				getLocationIdentification().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT_GROUP:
				getLocationHeightGroup().clear();
				return;
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT_GROUP:
				getLocationAugmentationPointGroup().clear();
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
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT_GROUP:
				return locationAddressAbstractGroup != null && !locationAddressAbstractGroup.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_ADDRESS_ABSTRACT:
				return !getLocationAddressAbstract().isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_AREA:
				return locationArea != null && !locationArea.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY_GROUP:
				return locationCategoryGroup != null && !locationCategoryGroup.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_CATEGORY:
				return !getLocationCategory().isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_CONTACT_INFORMATION:
				return locationContactInformation != null && !locationContactInformation.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_DESCRIPTION_TEXT:
				return locationDescriptionText != null && !locationDescriptionText.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE_GROUP:
				return locationGeospatialCoordinateGroup != null && !locationGeospatialCoordinateGroup.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_GEOSPATIAL_COORDINATE:
				return !getLocationGeospatialCoordinate().isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_LANDMARK_TEXT:
				return locationLandmarkText != null && !locationLandmarkText.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_LOCALE:
				return locationLocale != null && !locationLocale.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_MAP_LOCATION:
				return locationMapLocation != null && !locationMapLocation.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_NAME:
				return locationName != null && !locationName.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_RANGE_DESCRIPTION_TEXT:
				return locationRangeDescriptionText != null && !locationRangeDescriptionText.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_RELATIVE_LOCATION:
				return locationRelativeLocation != null && !locationRelativeLocation.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_SURROUNDING_AREA_DESCRIPTION_TEXT:
				return locationSurroundingAreaDescriptionText != null && !locationSurroundingAreaDescriptionText.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_IDENTIFICATION:
				return locationIdentification != null && !locationIdentification.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT_GROUP:
				return locationHeightGroup != null && !locationHeightGroup.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_HEIGHT:
				return !getLocationHeight().isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT_GROUP:
				return locationAugmentationPointGroup != null && !locationAugmentationPointGroup.isEmpty();
			case _0Package.LOCATION_TYPE__LOCATION_AUGMENTATION_POINT:
				return !getLocationAugmentationPoint().isEmpty();
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
		result.append(" (locationAddressAbstractGroup: ");
		result.append(locationAddressAbstractGroup);
		result.append(", locationCategoryGroup: ");
		result.append(locationCategoryGroup);
		result.append(", locationGeospatialCoordinateGroup: ");
		result.append(locationGeospatialCoordinateGroup);
		result.append(", locationHeightGroup: ");
		result.append(locationHeightGroup);
		result.append(", locationAugmentationPointGroup: ");
		result.append(locationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //LocationTypeImpl
