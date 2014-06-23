/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ReleaseType;
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
 * An implementation of the model object '<em><b>Release Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleasePerson <em>Release Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseFromLocation <em>Release From Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseIssuer <em>Release Issuer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseItem <em>Release Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseRecipient <em>Release Recipient</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseToLocation <em>Release To Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseSupervisor <em>Release Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseAugmentationPointGroup <em>Release Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReleaseTypeImpl#getReleaseAugmentationPoint <em>Release Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReleaseTypeImpl extends ActivityTypeImpl implements ReleaseType {
	/**
	 * The cached value of the '{@link #getReleasePerson() <em>Release Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleasePerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> releasePerson;

	/**
	 * The cached value of the '{@link #getReleaseFromLocation() <em>Release From Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseFromLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> releaseFromLocation;

	/**
	 * The cached value of the '{@link #getReleaseIssuer() <em>Release Issuer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseIssuer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> releaseIssuer;

	/**
	 * The cached value of the '{@link #getReleaseItem() <em>Release Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> releaseItem;

	/**
	 * The cached value of the '{@link #getReleaseRecipient() <em>Release Recipient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseRecipient()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> releaseRecipient;

	/**
	 * The cached value of the '{@link #getReleaseToLocation() <em>Release To Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseToLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> releaseToLocation;

	/**
	 * The cached value of the '{@link #getReleaseSupervisor() <em>Release Supervisor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseSupervisor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> releaseSupervisor;

	/**
	 * The cached value of the '{@link #getReleaseAugmentationPointGroup() <em>Release Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap releaseAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getReleaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getReleasePerson() {
		if (releasePerson == null) {
			releasePerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.RELEASE_TYPE__RELEASE_PERSON);
		}
		return releasePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getReleaseFromLocation() {
		if (releaseFromLocation == null) {
			releaseFromLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.RELEASE_TYPE__RELEASE_FROM_LOCATION);
		}
		return releaseFromLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReleaseIssuer() {
		if (releaseIssuer == null) {
			releaseIssuer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.RELEASE_TYPE__RELEASE_ISSUER);
		}
		return releaseIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getReleaseItem() {
		if (releaseItem == null) {
			releaseItem = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.RELEASE_TYPE__RELEASE_ITEM);
		}
		return releaseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReleaseRecipient() {
		if (releaseRecipient == null) {
			releaseRecipient = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.RELEASE_TYPE__RELEASE_RECIPIENT);
		}
		return releaseRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getReleaseToLocation() {
		if (releaseToLocation == null) {
			releaseToLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.RELEASE_TYPE__RELEASE_TO_LOCATION);
		}
		return releaseToLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReleaseSupervisor() {
		if (releaseSupervisor == null) {
			releaseSupervisor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.RELEASE_TYPE__RELEASE_SUPERVISOR);
		}
		return releaseSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getReleaseAugmentationPointGroup() {
		if (releaseAugmentationPointGroup == null) {
			releaseAugmentationPointGroup = new BasicFeatureMap(this, _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT_GROUP);
		}
		return releaseAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getReleaseAugmentationPoint() {
		return getReleaseAugmentationPointGroup().list(_0Package.eINSTANCE.getReleaseType_ReleaseAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.RELEASE_TYPE__RELEASE_PERSON:
				return ((InternalEList<?>)getReleasePerson()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_FROM_LOCATION:
				return ((InternalEList<?>)getReleaseFromLocation()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_ISSUER:
				return ((InternalEList<?>)getReleaseIssuer()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_ITEM:
				return ((InternalEList<?>)getReleaseItem()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_RECIPIENT:
				return ((InternalEList<?>)getReleaseRecipient()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_TO_LOCATION:
				return ((InternalEList<?>)getReleaseToLocation()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_SUPERVISOR:
				return ((InternalEList<?>)getReleaseSupervisor()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getReleaseAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getReleaseAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.RELEASE_TYPE__RELEASE_PERSON:
				return getReleasePerson();
			case _0Package.RELEASE_TYPE__RELEASE_FROM_LOCATION:
				return getReleaseFromLocation();
			case _0Package.RELEASE_TYPE__RELEASE_ISSUER:
				return getReleaseIssuer();
			case _0Package.RELEASE_TYPE__RELEASE_ITEM:
				return getReleaseItem();
			case _0Package.RELEASE_TYPE__RELEASE_RECIPIENT:
				return getReleaseRecipient();
			case _0Package.RELEASE_TYPE__RELEASE_TO_LOCATION:
				return getReleaseToLocation();
			case _0Package.RELEASE_TYPE__RELEASE_SUPERVISOR:
				return getReleaseSupervisor();
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getReleaseAugmentationPointGroup();
				return ((FeatureMap.Internal)getReleaseAugmentationPointGroup()).getWrapper();
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT:
				return getReleaseAugmentationPoint();
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
			case _0Package.RELEASE_TYPE__RELEASE_PERSON:
				getReleasePerson().clear();
				getReleasePerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_FROM_LOCATION:
				getReleaseFromLocation().clear();
				getReleaseFromLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_ISSUER:
				getReleaseIssuer().clear();
				getReleaseIssuer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_ITEM:
				getReleaseItem().clear();
				getReleaseItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_RECIPIENT:
				getReleaseRecipient().clear();
				getReleaseRecipient().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_TO_LOCATION:
				getReleaseToLocation().clear();
				getReleaseToLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_SUPERVISOR:
				getReleaseSupervisor().clear();
				getReleaseSupervisor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getReleaseAugmentationPointGroup()).set(newValue);
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
			case _0Package.RELEASE_TYPE__RELEASE_PERSON:
				getReleasePerson().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_FROM_LOCATION:
				getReleaseFromLocation().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_ISSUER:
				getReleaseIssuer().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_ITEM:
				getReleaseItem().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_RECIPIENT:
				getReleaseRecipient().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_TO_LOCATION:
				getReleaseToLocation().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_SUPERVISOR:
				getReleaseSupervisor().clear();
				return;
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT_GROUP:
				getReleaseAugmentationPointGroup().clear();
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
			case _0Package.RELEASE_TYPE__RELEASE_PERSON:
				return releasePerson != null && !releasePerson.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_FROM_LOCATION:
				return releaseFromLocation != null && !releaseFromLocation.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_ISSUER:
				return releaseIssuer != null && !releaseIssuer.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_ITEM:
				return releaseItem != null && !releaseItem.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_RECIPIENT:
				return releaseRecipient != null && !releaseRecipient.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_TO_LOCATION:
				return releaseToLocation != null && !releaseToLocation.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_SUPERVISOR:
				return releaseSupervisor != null && !releaseSupervisor.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT_GROUP:
				return releaseAugmentationPointGroup != null && !releaseAugmentationPointGroup.isEmpty();
			case _0Package.RELEASE_TYPE__RELEASE_AUGMENTATION_POINT:
				return !getReleaseAugmentationPoint().isEmpty();
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
		result.append(" (releaseAugmentationPointGroup: ");
		result.append(releaseAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ReleaseTypeImpl
