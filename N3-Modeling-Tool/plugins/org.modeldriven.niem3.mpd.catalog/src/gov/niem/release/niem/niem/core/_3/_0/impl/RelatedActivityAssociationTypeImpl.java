/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.RelatedActivityAssociationType;
import gov.niem.release.niem.niem.core._3._0.TextType;
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
 * An implementation of the model object '<em><b>Related Activity Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelatedActivityAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelatedActivityAssociationTypeImpl#getActivityRelationText <em>Activity Relation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelatedActivityAssociationTypeImpl#getRelatedActivityAssociationAugmentationPointGroup <em>Related Activity Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.RelatedActivityAssociationTypeImpl#getRelatedActivityAssociationAugmentationPoint <em>Related Activity Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelatedActivityAssociationTypeImpl extends AssociationTypeImpl implements RelatedActivityAssociationType {
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
	 * The cached value of the '{@link #getActivityRelationText() <em>Activity Relation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityRelationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> activityRelationText;

	/**
	 * The cached value of the '{@link #getRelatedActivityAssociationAugmentationPointGroup() <em>Related Activity Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedActivityAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap relatedActivityAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedActivityAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getRelatedActivityAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getActivityRelationText() {
		if (activityRelationText == null) {
			activityRelationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY_RELATION_TEXT);
		}
		return activityRelationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRelatedActivityAssociationAugmentationPointGroup() {
		if (relatedActivityAssociationAugmentationPointGroup == null) {
			relatedActivityAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return relatedActivityAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRelatedActivityAssociationAugmentationPoint() {
		return getRelatedActivityAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getRelatedActivityAssociationType_RelatedActivityAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY_RELATION_TEXT:
				return ((InternalEList<?>)getActivityRelationText()).basicRemove(otherEnd, msgs);
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getRelatedActivityAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getRelatedActivityAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY_RELATION_TEXT:
				return getActivityRelationText();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getRelatedActivityAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getRelatedActivityAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT:
				return getRelatedActivityAssociationAugmentationPoint();
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
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY_RELATION_TEXT:
				getActivityRelationText().clear();
				getActivityRelationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getRelatedActivityAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY_RELATION_TEXT:
				getActivityRelationText().clear();
				return;
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getRelatedActivityAssociationAugmentationPointGroup().clear();
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
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__ACTIVITY_RELATION_TEXT:
				return activityRelationText != null && !activityRelationText.isEmpty();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return relatedActivityAssociationAugmentationPointGroup != null && !relatedActivityAssociationAugmentationPointGroup.isEmpty();
			case _0Package.RELATED_ACTIVITY_ASSOCIATION_TYPE__RELATED_ACTIVITY_ASSOCIATION_AUGMENTATION_POINT:
				return !getRelatedActivityAssociationAugmentationPoint().isEmpty();
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
		result.append(" (relatedActivityAssociationAugmentationPointGroup: ");
		result.append(relatedActivityAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //RelatedActivityAssociationTypeImpl
