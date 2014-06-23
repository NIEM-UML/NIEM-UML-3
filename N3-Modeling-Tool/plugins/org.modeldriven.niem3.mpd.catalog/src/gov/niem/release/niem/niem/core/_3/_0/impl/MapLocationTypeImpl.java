/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.MapLocationType;
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
 * An implementation of the model object '<em><b>Map Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapCoordinateFullText <em>Map Coordinate Full Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapDate <em>Map Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapElevationCoordinateText <em>Map Elevation Coordinate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapHorizontalCoordinateText <em>Map Horizontal Coordinate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapLocationDescriptionText <em>Map Location Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapName <em>Map Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapPageID <em>Map Page ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapQuadrantText <em>Map Quadrant Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapVersionID <em>Map Version ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapVerticalCoordinateText <em>Map Vertical Coordinate Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapLocationAugmentationPointGroup <em>Map Location Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MapLocationTypeImpl#getMapLocationAugmentationPoint <em>Map Location Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapLocationTypeImpl extends ObjectTypeImpl implements MapLocationType {
	/**
	 * The cached value of the '{@link #getMapCoordinateFullText() <em>Map Coordinate Full Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapCoordinateFullText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapCoordinateFullText;

	/**
	 * The cached value of the '{@link #getMapDate() <em>Map Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> mapDate;

	/**
	 * The cached value of the '{@link #getMapElevationCoordinateText() <em>Map Elevation Coordinate Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapElevationCoordinateText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapElevationCoordinateText;

	/**
	 * The cached value of the '{@link #getMapHorizontalCoordinateText() <em>Map Horizontal Coordinate Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapHorizontalCoordinateText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapHorizontalCoordinateText;

	/**
	 * The cached value of the '{@link #getMapLocationDescriptionText() <em>Map Location Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLocationDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapLocationDescriptionText;

	/**
	 * The cached value of the '{@link #getMapName() <em>Map Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapName;

	/**
	 * The cached value of the '{@link #getMapPageID() <em>Map Page ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapPageID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> mapPageID;

	/**
	 * The cached value of the '{@link #getMapQuadrantText() <em>Map Quadrant Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapQuadrantText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapQuadrantText;

	/**
	 * The cached value of the '{@link #getMapVersionID() <em>Map Version ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapVersionID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> mapVersionID;

	/**
	 * The cached value of the '{@link #getMapVerticalCoordinateText() <em>Map Vertical Coordinate Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapVerticalCoordinateText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> mapVerticalCoordinateText;

	/**
	 * The cached value of the '{@link #getMapLocationAugmentationPointGroup() <em>Map Location Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapLocationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mapLocationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapLocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMapLocationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapCoordinateFullText() {
		if (mapCoordinateFullText == null) {
			mapCoordinateFullText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_COORDINATE_FULL_TEXT);
		}
		return mapCoordinateFullText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getMapDate() {
		if (mapDate == null) {
			mapDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_DATE);
		}
		return mapDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapElevationCoordinateText() {
		if (mapElevationCoordinateText == null) {
			mapElevationCoordinateText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_ELEVATION_COORDINATE_TEXT);
		}
		return mapElevationCoordinateText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapHorizontalCoordinateText() {
		if (mapHorizontalCoordinateText == null) {
			mapHorizontalCoordinateText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_HORIZONTAL_COORDINATE_TEXT);
		}
		return mapHorizontalCoordinateText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapLocationDescriptionText() {
		if (mapLocationDescriptionText == null) {
			mapLocationDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_DESCRIPTION_TEXT);
		}
		return mapLocationDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapName() {
		if (mapName == null) {
			mapName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_NAME);
		}
		return mapName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMapPageID() {
		if (mapPageID == null) {
			mapPageID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MAP_LOCATION_TYPE__MAP_PAGE_ID);
		}
		return mapPageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapQuadrantText() {
		if (mapQuadrantText == null) {
			mapQuadrantText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_QUADRANT_TEXT);
		}
		return mapQuadrantText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getMapVersionID() {
		if (mapVersionID == null) {
			mapVersionID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.MAP_LOCATION_TYPE__MAP_VERSION_ID);
		}
		return mapVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMapVerticalCoordinateText() {
		if (mapVerticalCoordinateText == null) {
			mapVerticalCoordinateText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MAP_LOCATION_TYPE__MAP_VERTICAL_COORDINATE_TEXT);
		}
		return mapVerticalCoordinateText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMapLocationAugmentationPointGroup() {
		if (mapLocationAugmentationPointGroup == null) {
			mapLocationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT_GROUP);
		}
		return mapLocationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMapLocationAugmentationPoint() {
		return getMapLocationAugmentationPointGroup().list(_0Package.eINSTANCE.getMapLocationType_MapLocationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MAP_LOCATION_TYPE__MAP_COORDINATE_FULL_TEXT:
				return ((InternalEList<?>)getMapCoordinateFullText()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_DATE:
				return ((InternalEList<?>)getMapDate()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_ELEVATION_COORDINATE_TEXT:
				return ((InternalEList<?>)getMapElevationCoordinateText()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_HORIZONTAL_COORDINATE_TEXT:
				return ((InternalEList<?>)getMapHorizontalCoordinateText()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getMapLocationDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_NAME:
				return ((InternalEList<?>)getMapName()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_PAGE_ID:
				return ((InternalEList<?>)getMapPageID()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_QUADRANT_TEXT:
				return ((InternalEList<?>)getMapQuadrantText()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_VERSION_ID:
				return ((InternalEList<?>)getMapVersionID()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_VERTICAL_COORDINATE_TEXT:
				return ((InternalEList<?>)getMapVerticalCoordinateText()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getMapLocationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getMapLocationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.MAP_LOCATION_TYPE__MAP_COORDINATE_FULL_TEXT:
				return getMapCoordinateFullText();
			case _0Package.MAP_LOCATION_TYPE__MAP_DATE:
				return getMapDate();
			case _0Package.MAP_LOCATION_TYPE__MAP_ELEVATION_COORDINATE_TEXT:
				return getMapElevationCoordinateText();
			case _0Package.MAP_LOCATION_TYPE__MAP_HORIZONTAL_COORDINATE_TEXT:
				return getMapHorizontalCoordinateText();
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_DESCRIPTION_TEXT:
				return getMapLocationDescriptionText();
			case _0Package.MAP_LOCATION_TYPE__MAP_NAME:
				return getMapName();
			case _0Package.MAP_LOCATION_TYPE__MAP_PAGE_ID:
				return getMapPageID();
			case _0Package.MAP_LOCATION_TYPE__MAP_QUADRANT_TEXT:
				return getMapQuadrantText();
			case _0Package.MAP_LOCATION_TYPE__MAP_VERSION_ID:
				return getMapVersionID();
			case _0Package.MAP_LOCATION_TYPE__MAP_VERTICAL_COORDINATE_TEXT:
				return getMapVerticalCoordinateText();
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getMapLocationAugmentationPointGroup();
				return ((FeatureMap.Internal)getMapLocationAugmentationPointGroup()).getWrapper();
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT:
				return getMapLocationAugmentationPoint();
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
			case _0Package.MAP_LOCATION_TYPE__MAP_COORDINATE_FULL_TEXT:
				getMapCoordinateFullText().clear();
				getMapCoordinateFullText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_DATE:
				getMapDate().clear();
				getMapDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_ELEVATION_COORDINATE_TEXT:
				getMapElevationCoordinateText().clear();
				getMapElevationCoordinateText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_HORIZONTAL_COORDINATE_TEXT:
				getMapHorizontalCoordinateText().clear();
				getMapHorizontalCoordinateText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_DESCRIPTION_TEXT:
				getMapLocationDescriptionText().clear();
				getMapLocationDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_NAME:
				getMapName().clear();
				getMapName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_PAGE_ID:
				getMapPageID().clear();
				getMapPageID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_QUADRANT_TEXT:
				getMapQuadrantText().clear();
				getMapQuadrantText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_VERSION_ID:
				getMapVersionID().clear();
				getMapVersionID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_VERTICAL_COORDINATE_TEXT:
				getMapVerticalCoordinateText().clear();
				getMapVerticalCoordinateText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getMapLocationAugmentationPointGroup()).set(newValue);
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
			case _0Package.MAP_LOCATION_TYPE__MAP_COORDINATE_FULL_TEXT:
				getMapCoordinateFullText().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_DATE:
				getMapDate().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_ELEVATION_COORDINATE_TEXT:
				getMapElevationCoordinateText().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_HORIZONTAL_COORDINATE_TEXT:
				getMapHorizontalCoordinateText().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_DESCRIPTION_TEXT:
				getMapLocationDescriptionText().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_NAME:
				getMapName().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_PAGE_ID:
				getMapPageID().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_QUADRANT_TEXT:
				getMapQuadrantText().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_VERSION_ID:
				getMapVersionID().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_VERTICAL_COORDINATE_TEXT:
				getMapVerticalCoordinateText().clear();
				return;
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT_GROUP:
				getMapLocationAugmentationPointGroup().clear();
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
			case _0Package.MAP_LOCATION_TYPE__MAP_COORDINATE_FULL_TEXT:
				return mapCoordinateFullText != null && !mapCoordinateFullText.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_DATE:
				return mapDate != null && !mapDate.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_ELEVATION_COORDINATE_TEXT:
				return mapElevationCoordinateText != null && !mapElevationCoordinateText.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_HORIZONTAL_COORDINATE_TEXT:
				return mapHorizontalCoordinateText != null && !mapHorizontalCoordinateText.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_DESCRIPTION_TEXT:
				return mapLocationDescriptionText != null && !mapLocationDescriptionText.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_NAME:
				return mapName != null && !mapName.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_PAGE_ID:
				return mapPageID != null && !mapPageID.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_QUADRANT_TEXT:
				return mapQuadrantText != null && !mapQuadrantText.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_VERSION_ID:
				return mapVersionID != null && !mapVersionID.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_VERTICAL_COORDINATE_TEXT:
				return mapVerticalCoordinateText != null && !mapVerticalCoordinateText.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT_GROUP:
				return mapLocationAugmentationPointGroup != null && !mapLocationAugmentationPointGroup.isEmpty();
			case _0Package.MAP_LOCATION_TYPE__MAP_LOCATION_AUGMENTATION_POINT:
				return !getMapLocationAugmentationPoint().isEmpty();
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
		result.append(" (mapLocationAugmentationPointGroup: ");
		result.append(mapLocationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //MapLocationTypeImpl
