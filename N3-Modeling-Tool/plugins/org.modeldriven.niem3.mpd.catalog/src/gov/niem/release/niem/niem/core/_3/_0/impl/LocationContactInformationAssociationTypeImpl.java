/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ContactInformationType;
import gov.niem.release.niem.niem.core._3._0.LocationContactInformationAssociationType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
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
 * An implementation of the model object '<em><b>Location Contact Information Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationContactInformationAssociationTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationContactInformationAssociationTypeImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationContactInformationAssociationTypeImpl#getLocationContactInformationAssociationAugmentationPointGroup <em>Location Contact Information Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.LocationContactInformationAssociationTypeImpl#getLocationContactInformationAssociationAugmentationPoint <em>Location Contact Information Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationContactInformationAssociationTypeImpl extends AssociationTypeImpl implements LocationContactInformationAssociationType {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> location;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformationType> contactInformation;

	/**
	 * The cached value of the '{@link #getLocationContactInformationAssociationAugmentationPointGroup() <em>Location Contact Information Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationContactInformationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap locationContactInformationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationContactInformationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getLocationContactInformationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformationType> getContactInformation() {
		if (contactInformation == null) {
			contactInformation = new EObjectContainmentEList<ContactInformationType>(ContactInformationType.class, this, _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION);
		}
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getLocationContactInformationAssociationAugmentationPointGroup() {
		if (locationContactInformationAssociationAugmentationPointGroup == null) {
			locationContactInformationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return locationContactInformationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getLocationContactInformationAssociationAugmentationPoint() {
		return getLocationContactInformationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getLocationContactInformationAssociationType_LocationContactInformationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				return ((InternalEList<?>)getContactInformation()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getLocationContactInformationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getLocationContactInformationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION:
				return getLocation();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				return getContactInformation();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getLocationContactInformationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getLocationContactInformationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return getLocationContactInformationAssociationAugmentationPoint();
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
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				getContactInformation().clear();
				getContactInformation().addAll((Collection<? extends ContactInformationType>)newValue);
				return;
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getLocationContactInformationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				return;
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				getContactInformation().clear();
				return;
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getLocationContactInformationAssociationAugmentationPointGroup().clear();
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
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION:
				return location != null && !location.isEmpty();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__CONTACT_INFORMATION:
				return contactInformation != null && !contactInformation.isEmpty();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return locationContactInformationAssociationAugmentationPointGroup != null && !locationContactInformationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.LOCATION_CONTACT_INFORMATION_ASSOCIATION_TYPE__LOCATION_CONTACT_INFORMATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getLocationContactInformationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (locationContactInformationAssociationAugmentationPointGroup: ");
		result.append(locationContactInformationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //LocationContactInformationAssociationTypeImpl
