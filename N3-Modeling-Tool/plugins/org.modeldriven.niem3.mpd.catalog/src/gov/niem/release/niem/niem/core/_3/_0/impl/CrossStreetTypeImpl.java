/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CrossStreetType;
import gov.niem.release.niem.niem.core._3._0.RelativeLocationType;
import gov.niem.release.niem.niem.core._3._0.StreetType;
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
 * An implementation of the model object '<em><b>Cross Street Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CrossStreetTypeImpl#getCrossStreetDescriptionText <em>Cross Street Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CrossStreetTypeImpl#getCrossStreetRelativeLocation <em>Cross Street Relative Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CrossStreetTypeImpl#getLocationStreet <em>Location Street</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CrossStreetTypeImpl#getCrossStreetAugmentationPointGroup <em>Cross Street Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CrossStreetTypeImpl#getCrossStreetAugmentationPoint <em>Cross Street Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CrossStreetTypeImpl extends ObjectTypeImpl implements CrossStreetType {
	/**
	 * The cached value of the '{@link #getCrossStreetDescriptionText() <em>Cross Street Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossStreetDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> crossStreetDescriptionText;

	/**
	 * The cached value of the '{@link #getCrossStreetRelativeLocation() <em>Cross Street Relative Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossStreetRelativeLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeLocationType> crossStreetRelativeLocation;

	/**
	 * The cached value of the '{@link #getLocationStreet() <em>Location Street</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationStreet()
	 * @generated
	 * @ordered
	 */
	protected EList<StreetType> locationStreet;

	/**
	 * The cached value of the '{@link #getCrossStreetAugmentationPointGroup() <em>Cross Street Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossStreetAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap crossStreetAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossStreetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCrossStreetType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCrossStreetDescriptionText() {
		if (crossStreetDescriptionText == null) {
			crossStreetDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CROSS_STREET_TYPE__CROSS_STREET_DESCRIPTION_TEXT);
		}
		return crossStreetDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeLocationType> getCrossStreetRelativeLocation() {
		if (crossStreetRelativeLocation == null) {
			crossStreetRelativeLocation = new EObjectContainmentEList<RelativeLocationType>(RelativeLocationType.class, this, _0Package.CROSS_STREET_TYPE__CROSS_STREET_RELATIVE_LOCATION);
		}
		return crossStreetRelativeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StreetType> getLocationStreet() {
		if (locationStreet == null) {
			locationStreet = new EObjectContainmentEList<StreetType>(StreetType.class, this, _0Package.CROSS_STREET_TYPE__LOCATION_STREET);
		}
		return locationStreet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCrossStreetAugmentationPointGroup() {
		if (crossStreetAugmentationPointGroup == null) {
			crossStreetAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT_GROUP);
		}
		return crossStreetAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCrossStreetAugmentationPoint() {
		return getCrossStreetAugmentationPointGroup().list(_0Package.eINSTANCE.getCrossStreetType_CrossStreetAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getCrossStreetDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_RELATIVE_LOCATION:
				return ((InternalEList<?>)getCrossStreetRelativeLocation()).basicRemove(otherEnd, msgs);
			case _0Package.CROSS_STREET_TYPE__LOCATION_STREET:
				return ((InternalEList<?>)getLocationStreet()).basicRemove(otherEnd, msgs);
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCrossStreetAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCrossStreetAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_DESCRIPTION_TEXT:
				return getCrossStreetDescriptionText();
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_RELATIVE_LOCATION:
				return getCrossStreetRelativeLocation();
			case _0Package.CROSS_STREET_TYPE__LOCATION_STREET:
				return getLocationStreet();
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCrossStreetAugmentationPointGroup();
				return ((FeatureMap.Internal)getCrossStreetAugmentationPointGroup()).getWrapper();
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT:
				return getCrossStreetAugmentationPoint();
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
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_DESCRIPTION_TEXT:
				getCrossStreetDescriptionText().clear();
				getCrossStreetDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_RELATIVE_LOCATION:
				getCrossStreetRelativeLocation().clear();
				getCrossStreetRelativeLocation().addAll((Collection<? extends RelativeLocationType>)newValue);
				return;
			case _0Package.CROSS_STREET_TYPE__LOCATION_STREET:
				getLocationStreet().clear();
				getLocationStreet().addAll((Collection<? extends StreetType>)newValue);
				return;
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCrossStreetAugmentationPointGroup()).set(newValue);
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
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_DESCRIPTION_TEXT:
				getCrossStreetDescriptionText().clear();
				return;
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_RELATIVE_LOCATION:
				getCrossStreetRelativeLocation().clear();
				return;
			case _0Package.CROSS_STREET_TYPE__LOCATION_STREET:
				getLocationStreet().clear();
				return;
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT_GROUP:
				getCrossStreetAugmentationPointGroup().clear();
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
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_DESCRIPTION_TEXT:
				return crossStreetDescriptionText != null && !crossStreetDescriptionText.isEmpty();
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_RELATIVE_LOCATION:
				return crossStreetRelativeLocation != null && !crossStreetRelativeLocation.isEmpty();
			case _0Package.CROSS_STREET_TYPE__LOCATION_STREET:
				return locationStreet != null && !locationStreet.isEmpty();
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT_GROUP:
				return crossStreetAugmentationPointGroup != null && !crossStreetAugmentationPointGroup.isEmpty();
			case _0Package.CROSS_STREET_TYPE__CROSS_STREET_AUGMENTATION_POINT:
				return !getCrossStreetAugmentationPoint().isEmpty();
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
		result.append(" (crossStreetAugmentationPointGroup: ");
		result.append(crossStreetAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CrossStreetTypeImpl
