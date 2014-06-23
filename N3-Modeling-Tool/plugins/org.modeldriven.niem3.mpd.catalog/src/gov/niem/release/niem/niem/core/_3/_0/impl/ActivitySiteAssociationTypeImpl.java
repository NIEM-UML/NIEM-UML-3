/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivitySiteAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.SiteType;
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
 * An implementation of the model object '<em><b>Activity Site Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivitySiteAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivitySiteAssociationTypeImpl#getSite <em>Site</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivitySiteAssociationTypeImpl#getActivitySiteAssociationAugmentationPointGroup <em>Activity Site Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivitySiteAssociationTypeImpl#getActivitySiteAssociationAugmentationPoint <em>Activity Site Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivitySiteAssociationTypeImpl extends AssociationTypeImpl implements ActivitySiteAssociationType {
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
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteType> site;

	/**
	 * The cached value of the '{@link #getActivitySiteAssociationAugmentationPointGroup() <em>Activity Site Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitySiteAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activitySiteAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivitySiteAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivitySiteAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteType> getSite() {
		if (site == null) {
			site = new EObjectContainmentEList<SiteType>(SiteType.class, this, _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__SITE);
		}
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivitySiteAssociationAugmentationPointGroup() {
		if (activitySiteAssociationAugmentationPointGroup == null) {
			activitySiteAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activitySiteAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivitySiteAssociationAugmentationPoint() {
		return getActivitySiteAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivitySiteAssociationType_ActivitySiteAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__SITE:
				return ((InternalEList<?>)getSite()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivitySiteAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivitySiteAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__SITE:
				return getSite();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivitySiteAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivitySiteAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT:
				return getActivitySiteAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__SITE:
				getSite().clear();
				getSite().addAll((Collection<? extends SiteType>)newValue);
				return;
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivitySiteAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__SITE:
				getSite().clear();
				return;
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivitySiteAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__SITE:
				return site != null && !site.isEmpty();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activitySiteAssociationAugmentationPointGroup != null && !activitySiteAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_SITE_ASSOCIATION_TYPE__ACTIVITY_SITE_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivitySiteAssociationAugmentationPoint().isEmpty();
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
		result.append(" (activitySiteAssociationAugmentationPointGroup: ");
		result.append(activitySiteAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivitySiteAssociationTypeImpl
