/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityConveyanceAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.ConveyanceType;
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
 * An implementation of the model object '<em><b>Activity Conveyance Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityConveyanceAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityConveyanceAssociationTypeImpl#getConveyance <em>Conveyance</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityConveyanceAssociationTypeImpl#getActivityConveyanceAssociationAugmentationPointGroup <em>Activity Conveyance Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityConveyanceAssociationTypeImpl#getActivityConveyanceAssociationAugmentationPoint <em>Activity Conveyance Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityConveyanceAssociationTypeImpl extends AssociationTypeImpl implements ActivityConveyanceAssociationType {
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
	 * The cached value of the '{@link #getConveyance() <em>Conveyance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyance()
	 * @generated
	 * @ordered
	 */
	protected EList<ConveyanceType> conveyance;

	/**
	 * The cached value of the '{@link #getActivityConveyanceAssociationAugmentationPointGroup() <em>Activity Conveyance Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityConveyanceAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityConveyanceAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityConveyanceAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityConveyanceAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConveyanceType> getConveyance() {
		if (conveyance == null) {
			conveyance = new EObjectContainmentEList<ConveyanceType>(ConveyanceType.class, this, _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE);
		}
		return conveyance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityConveyanceAssociationAugmentationPointGroup() {
		if (activityConveyanceAssociationAugmentationPointGroup == null) {
			activityConveyanceAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activityConveyanceAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityConveyanceAssociationAugmentationPoint() {
		return getActivityConveyanceAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityConveyanceAssociationType_ActivityConveyanceAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				return ((InternalEList<?>)getConveyance()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityConveyanceAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityConveyanceAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				return getConveyance();
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityConveyanceAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityConveyanceAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT:
				return getActivityConveyanceAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				getConveyance().clear();
				getConveyance().addAll((Collection<? extends ConveyanceType>)newValue);
				return;
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityConveyanceAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				getConveyance().clear();
				return;
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivityConveyanceAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__CONVEYANCE:
				return conveyance != null && !conveyance.isEmpty();
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activityConveyanceAssociationAugmentationPointGroup != null && !activityConveyanceAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_CONVEYANCE_ASSOCIATION_TYPE__ACTIVITY_CONVEYANCE_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivityConveyanceAssociationAugmentationPoint().isEmpty();
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
		result.append(" (activityConveyanceAssociationAugmentationPointGroup: ");
		result.append(activityConveyanceAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityConveyanceAssociationTypeImpl
