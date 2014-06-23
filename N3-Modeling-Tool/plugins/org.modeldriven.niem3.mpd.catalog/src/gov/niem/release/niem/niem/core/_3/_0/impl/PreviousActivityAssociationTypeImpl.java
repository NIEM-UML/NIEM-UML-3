/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.PreviousActivityAssociationType;
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
 * An implementation of the model object '<em><b>Previous Activity Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PreviousActivityAssociationTypeImpl#getPreviousActivity <em>Previous Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PreviousActivityAssociationTypeImpl#getPreviousActivityAssociationAugmentationPointGroup <em>Previous Activity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PreviousActivityAssociationTypeImpl#getPreviousActivityAssociationAugmentationPoint <em>Previous Activity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreviousActivityAssociationTypeImpl extends RelatedActivityAssociationTypeImpl implements PreviousActivityAssociationType {
	/**
	 * The cached value of the '{@link #getPreviousActivity() <em>Previous Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> previousActivity;

	/**
	 * The cached value of the '{@link #getPreviousActivityAssociationAugmentationPointGroup() <em>Previous Activity Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousActivityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap previousActivityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreviousActivityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPreviousActivityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getPreviousActivity() {
		if (previousActivity == null) {
			previousActivity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY);
		}
		return previousActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPreviousActivityAssociationAugmentationPointGroup() {
		if (previousActivityAssociationAugmentationPointGroup == null) {
			previousActivityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return previousActivityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPreviousActivityAssociationAugmentationPoint() {
		return getPreviousActivityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getPreviousActivityAssociationType_PreviousActivityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY:
				return ((InternalEList<?>)getPreviousActivity()).basicRemove(otherEnd, msgs);
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPreviousActivityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPreviousActivityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY:
				return getPreviousActivity();
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPreviousActivityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getPreviousActivityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT:
				return getPreviousActivityAssociationAugmentationPoint();
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
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY:
				getPreviousActivity().clear();
				getPreviousActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPreviousActivityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY:
				getPreviousActivity().clear();
				return;
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getPreviousActivityAssociationAugmentationPointGroup().clear();
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
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY:
				return previousActivity != null && !previousActivity.isEmpty();
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return previousActivityAssociationAugmentationPointGroup != null && !previousActivityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.PREVIOUS_ACTIVITY_ASSOCIATION_TYPE__PREVIOUS_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getPreviousActivityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (previousActivityAssociationAugmentationPointGroup: ");
		result.append(previousActivityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PreviousActivityAssociationTypeImpl
