/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.PersonDisunionType;
import gov.niem.release.niem.niem.core._3._0.PersonUnionAssociationType;
import gov.niem.release.niem.niem.core._3._0.PersonUnionSeparationType;
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
 * An implementation of the model object '<em><b>Person Union Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonDisunion <em>Person Disunion</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionCertificateIndicator <em>Person Union Certificate Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionLocation <em>Person Union Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionSeparation <em>Person Union Separation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionCategoryGroup <em>Person Union Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionCategory <em>Person Union Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionStatusGroup <em>Person Union Status Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionStatus <em>Person Union Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionAssociationAugmentationPointGroup <em>Person Union Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonUnionAssociationTypeImpl#getPersonUnionAssociationAugmentationPoint <em>Person Union Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonUnionAssociationTypeImpl extends PersonAssociationTypeImpl implements PersonUnionAssociationType {
	/**
	 * The cached value of the '{@link #getPersonDisunion() <em>Person Disunion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDisunion()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonDisunionType> personDisunion;

	/**
	 * The cached value of the '{@link #getPersonUnionCertificateIndicator() <em>Person Union Certificate Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionCertificateIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personUnionCertificateIndicator;

	/**
	 * The cached value of the '{@link #getPersonUnionLocation() <em>Person Union Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> personUnionLocation;

	/**
	 * The cached value of the '{@link #getPersonUnionSeparation() <em>Person Union Separation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionSeparation()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonUnionSeparationType> personUnionSeparation;

	/**
	 * The cached value of the '{@link #getPersonUnionCategoryGroup() <em>Person Union Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personUnionCategoryGroup;

	/**
	 * The cached value of the '{@link #getPersonUnionStatusGroup() <em>Person Union Status Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionStatusGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personUnionStatusGroup;

	/**
	 * The cached value of the '{@link #getPersonUnionAssociationAugmentationPointGroup() <em>Person Union Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonUnionAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personUnionAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonUnionAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonUnionAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonDisunionType> getPersonDisunion() {
		if (personDisunion == null) {
			personDisunion = new EObjectContainmentEList<PersonDisunionType>(PersonDisunionType.class, this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_DISUNION);
		}
		return personDisunion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonUnionCertificateIndicator() {
		if (personUnionCertificateIndicator == null) {
			personUnionCertificateIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CERTIFICATE_INDICATOR);
		}
		return personUnionCertificateIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getPersonUnionLocation() {
		if (personUnionLocation == null) {
			personUnionLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_LOCATION);
		}
		return personUnionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonUnionSeparationType> getPersonUnionSeparation() {
		if (personUnionSeparation == null) {
			personUnionSeparation = new EObjectContainmentEList<PersonUnionSeparationType>(PersonUnionSeparationType.class, this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_SEPARATION);
		}
		return personUnionSeparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonUnionCategoryGroup() {
		if (personUnionCategoryGroup == null) {
			personUnionCategoryGroup = new BasicFeatureMap(this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY_GROUP);
		}
		return personUnionCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonUnionCategory() {
		return getPersonUnionCategoryGroup().list(_0Package.eINSTANCE.getPersonUnionAssociationType_PersonUnionCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonUnionStatusGroup() {
		if (personUnionStatusGroup == null) {
			personUnionStatusGroup = new BasicFeatureMap(this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS_GROUP);
		}
		return personUnionStatusGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonUnionStatus() {
		return getPersonUnionStatusGroup().list(_0Package.eINSTANCE.getPersonUnionAssociationType_PersonUnionStatus());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonUnionAssociationAugmentationPointGroup() {
		if (personUnionAssociationAugmentationPointGroup == null) {
			personUnionAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return personUnionAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonUnionAssociationAugmentationPoint() {
		return getPersonUnionAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonUnionAssociationType_PersonUnionAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_DISUNION:
				return ((InternalEList<?>)getPersonDisunion()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CERTIFICATE_INDICATOR:
				return ((InternalEList<?>)getPersonUnionCertificateIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_LOCATION:
				return ((InternalEList<?>)getPersonUnionLocation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_SEPARATION:
				return ((InternalEList<?>)getPersonUnionSeparation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY_GROUP:
				return ((InternalEList<?>)getPersonUnionCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY:
				return ((InternalEList<?>)getPersonUnionCategory()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS_GROUP:
				return ((InternalEList<?>)getPersonUnionStatusGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS:
				return ((InternalEList<?>)getPersonUnionStatus()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonUnionAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonUnionAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_DISUNION:
				return getPersonDisunion();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CERTIFICATE_INDICATOR:
				return getPersonUnionCertificateIndicator();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_LOCATION:
				return getPersonUnionLocation();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_SEPARATION:
				return getPersonUnionSeparation();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY_GROUP:
				if (coreType) return getPersonUnionCategoryGroup();
				return ((FeatureMap.Internal)getPersonUnionCategoryGroup()).getWrapper();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY:
				return getPersonUnionCategory();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS_GROUP:
				if (coreType) return getPersonUnionStatusGroup();
				return ((FeatureMap.Internal)getPersonUnionStatusGroup()).getWrapper();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS:
				return getPersonUnionStatus();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonUnionAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonUnionAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT:
				return getPersonUnionAssociationAugmentationPoint();
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
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_DISUNION:
				getPersonDisunion().clear();
				getPersonDisunion().addAll((Collection<? extends PersonDisunionType>)newValue);
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CERTIFICATE_INDICATOR:
				getPersonUnionCertificateIndicator().clear();
				getPersonUnionCertificateIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_LOCATION:
				getPersonUnionLocation().clear();
				getPersonUnionLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_SEPARATION:
				getPersonUnionSeparation().clear();
				getPersonUnionSeparation().addAll((Collection<? extends PersonUnionSeparationType>)newValue);
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY_GROUP:
				((FeatureMap.Internal)getPersonUnionCategoryGroup()).set(newValue);
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS_GROUP:
				((FeatureMap.Internal)getPersonUnionStatusGroup()).set(newValue);
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonUnionAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_DISUNION:
				getPersonDisunion().clear();
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CERTIFICATE_INDICATOR:
				getPersonUnionCertificateIndicator().clear();
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_LOCATION:
				getPersonUnionLocation().clear();
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_SEPARATION:
				getPersonUnionSeparation().clear();
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY_GROUP:
				getPersonUnionCategoryGroup().clear();
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS_GROUP:
				getPersonUnionStatusGroup().clear();
				return;
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPersonUnionAssociationAugmentationPointGroup().clear();
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
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_DISUNION:
				return personDisunion != null && !personDisunion.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CERTIFICATE_INDICATOR:
				return personUnionCertificateIndicator != null && !personUnionCertificateIndicator.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_LOCATION:
				return personUnionLocation != null && !personUnionLocation.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_SEPARATION:
				return personUnionSeparation != null && !personUnionSeparation.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY_GROUP:
				return personUnionCategoryGroup != null && !personUnionCategoryGroup.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_CATEGORY:
				return !getPersonUnionCategory().isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS_GROUP:
				return personUnionStatusGroup != null && !personUnionStatusGroup.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_STATUS:
				return !getPersonUnionStatus().isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return personUnionAssociationAugmentationPointGroup != null && !personUnionAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_UNION_ASSOCIATION_TYPE__PERSON_UNION_ASSOCIATION_AUGMENTATION_POINT:
				return !getPersonUnionAssociationAugmentationPoint().isEmpty();
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
		result.append(" (personUnionCategoryGroup: ");
		result.append(personUnionCategoryGroup);
		result.append(", personUnionStatusGroup: ");
		result.append(personUnionStatusGroup);
		result.append(", personUnionAssociationAugmentationPointGroup: ");
		result.append(personUnionAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonUnionAssociationTypeImpl
