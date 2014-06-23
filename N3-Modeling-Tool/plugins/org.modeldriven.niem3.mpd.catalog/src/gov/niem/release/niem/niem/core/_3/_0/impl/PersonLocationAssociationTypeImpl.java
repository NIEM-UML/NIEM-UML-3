/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.PersonLocationAssociationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
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
 * An implementation of the model object '<em><b>Person Location Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLocationAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLocationAssociationTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLocationAssociationTypeImpl#getPersonLocationAssociationAugmentationPointGroup <em>Person Location Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonLocationAssociationTypeImpl#getPersonLocationAssociationAugmentationPoint <em>Person Location Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonLocationAssociationTypeImpl extends AssociationTypeImpl implements PersonLocationAssociationType {
	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> person;

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
	 * The cached value of the '{@link #getPersonLocationAssociationAugmentationPointGroup() <em>Person Location Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonLocationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personLocationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonLocationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonLocationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonLocationAssociationAugmentationPointGroup() {
		if (personLocationAssociationAugmentationPointGroup == null) {
			personLocationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personLocationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonLocationAssociationAugmentationPoint() {
		return getPersonLocationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonLocationAssociationType_PersonLocationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonLocationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonLocationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return getLocation();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonLocationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonLocationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonLocationAssociationAugmentationPoint();
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
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonLocationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__LOCATION:
				getLocation().clear();
				return;
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonLocationAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__LOCATION:
				return location != null && !location.isEmpty();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personLocationAssociationAugmentationPointGroup != null && !personLocationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_LOCATION_ASSOCIATION_TYPE__PERSON_LOCATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonLocationAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personLocationAssociationAugmentationPointGroup: ");
		result.append(personLocationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonLocationAssociationTypeImpl
