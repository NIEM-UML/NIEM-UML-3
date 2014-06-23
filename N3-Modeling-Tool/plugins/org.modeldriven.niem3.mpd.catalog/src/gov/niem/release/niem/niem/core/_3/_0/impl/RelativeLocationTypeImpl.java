/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.RelativeLocationHeadingType;
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
 * An implementation of the model object '<em><b>Relative Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationDescriptionText <em>Relative Location Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationDirectionGroup <em>Relative Location Direction Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationDirection <em>Relative Location Direction</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationDistanceText <em>Relative Location Distance Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationHeadingValue <em>Relative Location Heading Value</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationReferencePoint <em>Relative Location Reference Point</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationAugmentationPointGroup <em>Relative Location Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelativeLocationTypeImpl#getRelativeLocationAugmentationPoint <em>Relative Location Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeLocationTypeImpl extends ObjectTypeImpl implements RelativeLocationType {
	/**
	 * The cached value of the '{@link #getRelativeLocationDescriptionText() <em>Relative Location Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocationDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> relativeLocationDescriptionText;

	/**
	 * The cached value of the '{@link #getRelativeLocationDirectionGroup() <em>Relative Location Direction Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocationDirectionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap relativeLocationDirectionGroup;

	/**
	 * The cached value of the '{@link #getRelativeLocationDistanceText() <em>Relative Location Distance Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocationDistanceText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> relativeLocationDistanceText;

	/**
	 * The cached value of the '{@link #getRelativeLocationHeadingValue() <em>Relative Location Heading Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocationHeadingValue()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeLocationHeadingType> relativeLocationHeadingValue;

	/**
	 * The cached value of the '{@link #getRelativeLocationReferencePoint() <em>Relative Location Reference Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocationReferencePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> relativeLocationReferencePoint;

	/**
	 * The cached value of the '{@link #getRelativeLocationAugmentationPointGroup() <em>Relative Location Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap relativeLocationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeLocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getRelativeLocationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getRelativeLocationDescriptionText() {
		if (relativeLocationDescriptionText == null) {
			relativeLocationDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DESCRIPTION_TEXT);
		}
		return relativeLocationDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRelativeLocationDirectionGroup() {
		if (relativeLocationDirectionGroup == null) {
			relativeLocationDirectionGroup = new BasicFeatureMap(this, _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION_GROUP);
		}
		return relativeLocationDirectionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRelativeLocationDirection() {
		return getRelativeLocationDirectionGroup().list(_0Package.eINSTANCE.getRelativeLocationType_RelativeLocationDirection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getRelativeLocationDistanceText() {
		if (relativeLocationDistanceText == null) {
			relativeLocationDistanceText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DISTANCE_TEXT);
		}
		return relativeLocationDistanceText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeLocationHeadingType> getRelativeLocationHeadingValue() {
		if (relativeLocationHeadingValue == null) {
			relativeLocationHeadingValue = new EObjectContainmentEList<RelativeLocationHeadingType>(RelativeLocationHeadingType.class, this, _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_HEADING_VALUE);
		}
		return relativeLocationHeadingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getRelativeLocationReferencePoint() {
		if (relativeLocationReferencePoint == null) {
			relativeLocationReferencePoint = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_REFERENCE_POINT);
		}
		return relativeLocationReferencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRelativeLocationAugmentationPointGroup() {
		if (relativeLocationAugmentationPointGroup == null) {
			relativeLocationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT_GROUP);
		}
		return relativeLocationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRelativeLocationAugmentationPoint() {
		return getRelativeLocationAugmentationPointGroup().list(_0Package.eINSTANCE.getRelativeLocationType_RelativeLocationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getRelativeLocationDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION_GROUP:
				return ((InternalEList<?>)getRelativeLocationDirectionGroup()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION:
				return ((InternalEList<?>)getRelativeLocationDirection()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DISTANCE_TEXT:
				return ((InternalEList<?>)getRelativeLocationDistanceText()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_HEADING_VALUE:
				return ((InternalEList<?>)getRelativeLocationHeadingValue()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_REFERENCE_POINT:
				return ((InternalEList<?>)getRelativeLocationReferencePoint()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getRelativeLocationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getRelativeLocationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DESCRIPTION_TEXT:
				return getRelativeLocationDescriptionText();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION_GROUP:
				if (coreType) return getRelativeLocationDirectionGroup();
				return ((FeatureMap.Internal)getRelativeLocationDirectionGroup()).getWrapper();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION:
				return getRelativeLocationDirection();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DISTANCE_TEXT:
				return getRelativeLocationDistanceText();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_HEADING_VALUE:
				return getRelativeLocationHeadingValue();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_REFERENCE_POINT:
				return getRelativeLocationReferencePoint();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getRelativeLocationAugmentationPointGroup();
				return ((FeatureMap.Internal)getRelativeLocationAugmentationPointGroup()).getWrapper();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT:
				return getRelativeLocationAugmentationPoint();
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
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DESCRIPTION_TEXT:
				getRelativeLocationDescriptionText().clear();
				getRelativeLocationDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION_GROUP:
				((FeatureMap.Internal)getRelativeLocationDirectionGroup()).set(newValue);
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DISTANCE_TEXT:
				getRelativeLocationDistanceText().clear();
				getRelativeLocationDistanceText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_HEADING_VALUE:
				getRelativeLocationHeadingValue().clear();
				getRelativeLocationHeadingValue().addAll((Collection<? extends RelativeLocationHeadingType>)newValue);
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_REFERENCE_POINT:
				getRelativeLocationReferencePoint().clear();
				getRelativeLocationReferencePoint().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getRelativeLocationAugmentationPointGroup()).set(newValue);
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
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DESCRIPTION_TEXT:
				getRelativeLocationDescriptionText().clear();
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION_GROUP:
				getRelativeLocationDirectionGroup().clear();
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DISTANCE_TEXT:
				getRelativeLocationDistanceText().clear();
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_HEADING_VALUE:
				getRelativeLocationHeadingValue().clear();
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_REFERENCE_POINT:
				getRelativeLocationReferencePoint().clear();
				return;
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT_GROUP:
				getRelativeLocationAugmentationPointGroup().clear();
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
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DESCRIPTION_TEXT:
				return relativeLocationDescriptionText != null && !relativeLocationDescriptionText.isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION_GROUP:
				return relativeLocationDirectionGroup != null && !relativeLocationDirectionGroup.isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DIRECTION:
				return !getRelativeLocationDirection().isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_DISTANCE_TEXT:
				return relativeLocationDistanceText != null && !relativeLocationDistanceText.isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_HEADING_VALUE:
				return relativeLocationHeadingValue != null && !relativeLocationHeadingValue.isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_REFERENCE_POINT:
				return relativeLocationReferencePoint != null && !relativeLocationReferencePoint.isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT_GROUP:
				return relativeLocationAugmentationPointGroup != null && !relativeLocationAugmentationPointGroup.isEmpty();
			case _0Package.RELATIVE_LOCATION_TYPE__RELATIVE_LOCATION_AUGMENTATION_POINT:
				return !getRelativeLocationAugmentationPoint().isEmpty();
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
		result.append(" (relativeLocationDirectionGroup: ");
		result.append(relativeLocationDirectionGroup);
		result.append(", relativeLocationAugmentationPointGroup: ");
		result.append(relativeLocationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //RelativeLocationTypeImpl
