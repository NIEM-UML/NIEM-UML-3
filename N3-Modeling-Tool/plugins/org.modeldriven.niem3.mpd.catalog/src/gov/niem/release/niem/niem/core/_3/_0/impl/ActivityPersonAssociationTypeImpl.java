/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityPersonAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
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
 * An implementation of the model object '<em><b>Activity Person Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityPersonAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityPersonAssociationTypeImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityPersonAssociationTypeImpl#getActivityInvolvementGroup <em>Activity Involvement Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityPersonAssociationTypeImpl#getActivityInvolvement <em>Activity Involvement</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityPersonAssociationTypeImpl#getActivityPersonAssociationAugmentationPointGroup <em>Activity Person Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityPersonAssociationTypeImpl#getActivityPersonAssociationAugmentationPoint <em>Activity Person Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityPersonAssociationTypeImpl extends AssociationTypeImpl implements ActivityPersonAssociationType {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> activity;

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
	 * The cached value of the '{@link #getActivityInvolvementGroup() <em>Activity Involvement Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityInvolvementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityInvolvementGroup;

	/**
	 * The cached value of the '{@link #getActivityPersonAssociationAugmentationPointGroup() <em>Activity Person Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityPersonAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityPersonAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPersonAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityPersonAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonType> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<PersonType>(PersonType.class, this, _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityInvolvementGroup() {
		if (activityInvolvementGroup == null) {
			activityInvolvementGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP);
		}
		return activityInvolvementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityInvolvement() {
		return getActivityInvolvementGroup().list(_0Package.eINSTANCE.getActivityPersonAssociationType_ActivityInvolvement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityPersonAssociationAugmentationPointGroup() {
		if (activityPersonAssociationAugmentationPointGroup == null) {
			activityPersonAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activityPersonAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityPersonAssociationAugmentationPoint() {
		return getActivityPersonAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityPersonAssociationType_ActivityPersonAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				return ((InternalEList<?>)getActivityInvolvementGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT:
				return ((InternalEList<?>)getActivityInvolvement()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityPersonAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityPersonAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__PERSON:
				return getPerson();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				if (coreType) return getActivityInvolvementGroup();
				return ((FeatureMap.Internal)getActivityInvolvementGroup()).getWrapper();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT:
				return getActivityInvolvement();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityPersonAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityPersonAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return getActivityPersonAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonType>)newValue);
				return;
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				((FeatureMap.Internal)getActivityInvolvementGroup()).set(newValue);
				return;
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityPersonAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__PERSON:
				getPerson().clear();
				return;
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				getActivityInvolvementGroup().clear();
				return;
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivityPersonAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__PERSON:
				return person != null && !person.isEmpty();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				return activityInvolvementGroup != null && !activityInvolvementGroup.isEmpty();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT:
				return !getActivityInvolvement().isEmpty();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activityPersonAssociationAugmentationPointGroup != null && !activityPersonAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_PERSON_ASSOCIATION_TYPE__ACTIVITY_PERSON_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivityPersonAssociationAugmentationPoint().isEmpty();
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
		result.append(" (activityInvolvementGroup: ");
		result.append(activityInvolvementGroup);
		result.append(", activityPersonAssociationAugmentationPointGroup: ");
		result.append(activityPersonAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityPersonAssociationTypeImpl
