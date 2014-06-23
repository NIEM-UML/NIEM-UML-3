/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityOrganizationAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.OrganizationType;
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
 * An implementation of the model object '<em><b>Activity Organization Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityOrganizationAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityOrganizationAssociationTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityOrganizationAssociationTypeImpl#getActivityInvolvementGroup <em>Activity Involvement Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityOrganizationAssociationTypeImpl#getActivityInvolvement <em>Activity Involvement</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityOrganizationAssociationTypeImpl#getActivityOrganizationAssociationAugmentationPointGroup <em>Activity Organization Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityOrganizationAssociationTypeImpl#getActivityOrganizationAssociationAugmentationPoint <em>Activity Organization Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityOrganizationAssociationTypeImpl extends AssociationTypeImpl implements ActivityOrganizationAssociationType {
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
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> organization;

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
	 * The cached value of the '{@link #getActivityOrganizationAssociationAugmentationPointGroup() <em>Activity Organization Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityOrganizationAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityOrganizationAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityOrganizationAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityOrganizationAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityInvolvementGroup() {
		if (activityInvolvementGroup == null) {
			activityInvolvementGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP);
		}
		return activityInvolvementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityInvolvement() {
		return getActivityInvolvementGroup().list(_0Package.eINSTANCE.getActivityOrganizationAssociationType_ActivityInvolvement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityOrganizationAssociationAugmentationPointGroup() {
		if (activityOrganizationAssociationAugmentationPointGroup == null) {
			activityOrganizationAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activityOrganizationAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityOrganizationAssociationAugmentationPoint() {
		return getActivityOrganizationAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityOrganizationAssociationType_ActivityOrganizationAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				return ((InternalEList<?>)getActivityInvolvementGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT:
				return ((InternalEList<?>)getActivityInvolvement()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityOrganizationAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityOrganizationAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return getOrganization();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				if (coreType) return getActivityInvolvementGroup();
				return ((FeatureMap.Internal)getActivityInvolvementGroup()).getWrapper();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT:
				return getActivityInvolvement();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityOrganizationAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityOrganizationAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return getActivityOrganizationAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				((FeatureMap.Internal)getActivityInvolvementGroup()).set(newValue);
				return;
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityOrganizationAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				getOrganization().clear();
				return;
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				getActivityInvolvementGroup().clear();
				return;
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivityOrganizationAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT_GROUP:
				return activityInvolvementGroup != null && !activityInvolvementGroup.isEmpty();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_INVOLVEMENT:
				return !getActivityInvolvement().isEmpty();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activityOrganizationAssociationAugmentationPointGroup != null && !activityOrganizationAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_ORGANIZATION_ASSOCIATION_TYPE__ACTIVITY_ORGANIZATION_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivityOrganizationAssociationAugmentationPoint().isEmpty();
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
		result.append(", activityOrganizationAssociationAugmentationPointGroup: ");
		result.append(activityOrganizationAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityOrganizationAssociationTypeImpl
