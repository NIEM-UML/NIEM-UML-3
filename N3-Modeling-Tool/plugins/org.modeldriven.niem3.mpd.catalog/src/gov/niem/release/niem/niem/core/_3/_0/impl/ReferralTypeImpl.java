/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
import gov.niem.release.niem.niem.core._3._0.ItemType;
import gov.niem.release.niem.niem.core._3._0.PersonType;
import gov.niem.release.niem.niem.core._3._0.ReferralType;
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
 * An implementation of the model object '<em><b>Referral Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralActivity <em>Referral Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralIssuer <em>Referral Issuer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralMandatoryIndicator <em>Referral Mandatory Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralSupervisor <em>Referral Supervisor</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralItem <em>Referral Item</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralEntity <em>Referral Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralPerson <em>Referral Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralAugmentationPointGroup <em>Referral Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ReferralTypeImpl#getReferralAugmentationPoint <em>Referral Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferralTypeImpl extends ActivityTypeImpl implements ReferralType {
	/**
	 * The cached value of the '{@link #getReferralActivity() <em>Referral Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> referralActivity;

	/**
	 * The cached value of the '{@link #getReferralIssuer() <em>Referral Issuer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralIssuer()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> referralIssuer;

	/**
	 * The cached value of the '{@link #getReferralMandatoryIndicator() <em>Referral Mandatory Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralMandatoryIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> referralMandatoryIndicator;

	/**
	 * The cached value of the '{@link #getReferralSupervisor() <em>Referral Supervisor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralSupervisor()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> referralSupervisor;

	/**
	 * The cached value of the '{@link #getReferralItem() <em>Referral Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemType> referralItem;

	/**
	 * The cached value of the '{@link #getReferralEntity() <em>Referral Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> referralEntity;

	/**
	 * The cached value of the '{@link #getReferralPerson() <em>Referral Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonType> referralPerson;

	/**
	 * The cached value of the '{@link #getReferralAugmentationPointGroup() <em>Referral Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap referralAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferralTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getReferralType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getReferralActivity() {
		if (referralActivity == null) {
			referralActivity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.REFERRAL_TYPE__REFERRAL_ACTIVITY);
		}
		return referralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReferralIssuer() {
		if (referralIssuer == null) {
			referralIssuer = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.REFERRAL_TYPE__REFERRAL_ISSUER);
		}
		return referralIssuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getReferralMandatoryIndicator() {
		if (referralMandatoryIndicator == null) {
			referralMandatoryIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.REFERRAL_TYPE__REFERRAL_MANDATORY_INDICATOR);
		}
		return referralMandatoryIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReferralSupervisor() {
		if (referralSupervisor == null) {
			referralSupervisor = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.REFERRAL_TYPE__REFERRAL_SUPERVISOR);
		}
		return referralSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getReferralItem() {
		if (referralItem == null) {
			referralItem = new EObjectContainmentEList<ItemType>(ItemType.class, this, _0Package.REFERRAL_TYPE__REFERRAL_ITEM);
		}
		return referralItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getReferralEntity() {
		if (referralEntity == null) {
			referralEntity = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.REFERRAL_TYPE__REFERRAL_ENTITY);
		}
		return referralEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getReferralPerson() {
		if (referralPerson == null) {
			referralPerson = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.REFERRAL_TYPE__REFERRAL_PERSON);
		}
		return referralPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getReferralAugmentationPointGroup() {
		if (referralAugmentationPointGroup == null) {
			referralAugmentationPointGroup = new BasicFeatureMap(this, _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT_GROUP);
		}
		return referralAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getReferralAugmentationPoint() {
		return getReferralAugmentationPointGroup().list(_0Package.eINSTANCE.getReferralType_ReferralAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.REFERRAL_TYPE__REFERRAL_ACTIVITY:
				return ((InternalEList<?>)getReferralActivity()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_ISSUER:
				return ((InternalEList<?>)getReferralIssuer()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_MANDATORY_INDICATOR:
				return ((InternalEList<?>)getReferralMandatoryIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_SUPERVISOR:
				return ((InternalEList<?>)getReferralSupervisor()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_ITEM:
				return ((InternalEList<?>)getReferralItem()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_ENTITY:
				return ((InternalEList<?>)getReferralEntity()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_PERSON:
				return ((InternalEList<?>)getReferralPerson()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getReferralAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT:
				return ((InternalEList<?>)getReferralAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.REFERRAL_TYPE__REFERRAL_ACTIVITY:
				return getReferralActivity();
			case _0Package.REFERRAL_TYPE__REFERRAL_ISSUER:
				return getReferralIssuer();
			case _0Package.REFERRAL_TYPE__REFERRAL_MANDATORY_INDICATOR:
				return getReferralMandatoryIndicator();
			case _0Package.REFERRAL_TYPE__REFERRAL_SUPERVISOR:
				return getReferralSupervisor();
			case _0Package.REFERRAL_TYPE__REFERRAL_ITEM:
				return getReferralItem();
			case _0Package.REFERRAL_TYPE__REFERRAL_ENTITY:
				return getReferralEntity();
			case _0Package.REFERRAL_TYPE__REFERRAL_PERSON:
				return getReferralPerson();
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT_GROUP:
				if (coreType) return getReferralAugmentationPointGroup();
				return ((FeatureMap.Internal)getReferralAugmentationPointGroup()).getWrapper();
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT:
				return getReferralAugmentationPoint();
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
			case _0Package.REFERRAL_TYPE__REFERRAL_ACTIVITY:
				getReferralActivity().clear();
				getReferralActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_ISSUER:
				getReferralIssuer().clear();
				getReferralIssuer().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_MANDATORY_INDICATOR:
				getReferralMandatoryIndicator().clear();
				getReferralMandatoryIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_SUPERVISOR:
				getReferralSupervisor().clear();
				getReferralSupervisor().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_ITEM:
				getReferralItem().clear();
				getReferralItem().addAll((Collection<? extends ItemType>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_ENTITY:
				getReferralEntity().clear();
				getReferralEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_PERSON:
				getReferralPerson().clear();
				getReferralPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getReferralAugmentationPointGroup()).set(newValue);
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
			case _0Package.REFERRAL_TYPE__REFERRAL_ACTIVITY:
				getReferralActivity().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_ISSUER:
				getReferralIssuer().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_MANDATORY_INDICATOR:
				getReferralMandatoryIndicator().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_SUPERVISOR:
				getReferralSupervisor().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_ITEM:
				getReferralItem().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_ENTITY:
				getReferralEntity().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_PERSON:
				getReferralPerson().clear();
				return;
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT_GROUP:
				getReferralAugmentationPointGroup().clear();
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
			case _0Package.REFERRAL_TYPE__REFERRAL_ACTIVITY:
				return referralActivity != null && !referralActivity.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_ISSUER:
				return referralIssuer != null && !referralIssuer.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_MANDATORY_INDICATOR:
				return referralMandatoryIndicator != null && !referralMandatoryIndicator.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_SUPERVISOR:
				return referralSupervisor != null && !referralSupervisor.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_ITEM:
				return referralItem != null && !referralItem.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_ENTITY:
				return referralEntity != null && !referralEntity.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_PERSON:
				return referralPerson != null && !referralPerson.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT_GROUP:
				return referralAugmentationPointGroup != null && !referralAugmentationPointGroup.isEmpty();
			case _0Package.REFERRAL_TYPE__REFERRAL_AUGMENTATION_POINT:
				return !getReferralAugmentationPoint().isEmpty();
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
		result.append(" (referralAugmentationPointGroup: ");
		result.append(referralAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ReferralTypeImpl
