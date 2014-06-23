/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.DispositionType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.StatusType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

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
 * An implementation of the model object '<em><b>Activity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityIdentification <em>Activity Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityCategoryText <em>Activity Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityDateRepresentationGroup <em>Activity Date Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityDateRepresentation <em>Activity Date Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityDescriptionText <em>Activity Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityName <em>Activity Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityStatus <em>Activity Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityReasonText <em>Activity Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityDispositionGroup <em>Activity Disposition Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityDisposition <em>Activity Disposition</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityAugmentationPointGroup <em>Activity Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityTypeImpl#getActivityAugmentationPoint <em>Activity Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityTypeImpl extends ObjectTypeImpl implements ActivityType {
	/**
	 * The cached value of the '{@link #getActivityIdentification() <em>Activity Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> activityIdentification;

	/**
	 * The cached value of the '{@link #getActivityCategoryText() <em>Activity Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> activityCategoryText;

	/**
	 * The cached value of the '{@link #getActivityDateRepresentationGroup() <em>Activity Date Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDateRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityDateRepresentationGroup;

	/**
	 * The cached value of the '{@link #getActivityDescriptionText() <em>Activity Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> activityDescriptionText;

	/**
	 * The cached value of the '{@link #getActivityName() <em>Activity Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> activityName;

	/**
	 * The cached value of the '{@link #getActivityStatus() <em>Activity Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> activityStatus;

	/**
	 * The cached value of the '{@link #getActivityReasonText() <em>Activity Reason Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityReasonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> activityReasonText;

	/**
	 * The cached value of the '{@link #getActivityDispositionGroup() <em>Activity Disposition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDispositionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityDispositionGroup;

	/**
	 * The cached value of the '{@link #getActivityAugmentationPointGroup() <em>Activity Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getActivityIdentification() {
		if (activityIdentification == null) {
			activityIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.ACTIVITY_TYPE__ACTIVITY_IDENTIFICATION);
		}
		return activityIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getActivityCategoryText() {
		if (activityCategoryText == null) {
			activityCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ACTIVITY_TYPE__ACTIVITY_CATEGORY_TEXT);
		}
		return activityCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityDateRepresentationGroup() {
		if (activityDateRepresentationGroup == null) {
			activityDateRepresentationGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION_GROUP);
		}
		return activityDateRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityDateRepresentation() {
		return getActivityDateRepresentationGroup().list(_0Package.eINSTANCE.getActivityType_ActivityDateRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getActivityDescriptionText() {
		if (activityDescriptionText == null) {
			activityDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ACTIVITY_TYPE__ACTIVITY_DESCRIPTION_TEXT);
		}
		return activityDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getActivityName() {
		if (activityName == null) {
			activityName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ACTIVITY_TYPE__ACTIVITY_NAME);
		}
		return activityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getActivityStatus() {
		if (activityStatus == null) {
			activityStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.ACTIVITY_TYPE__ACTIVITY_STATUS);
		}
		return activityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getActivityReasonText() {
		if (activityReasonText == null) {
			activityReasonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.ACTIVITY_TYPE__ACTIVITY_REASON_TEXT);
		}
		return activityReasonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityDispositionGroup() {
		if (activityDispositionGroup == null) {
			activityDispositionGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION_GROUP);
		}
		return activityDispositionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DispositionType> getActivityDisposition() {
		return getActivityDispositionGroup().list(_0Package.eINSTANCE.getActivityType_ActivityDisposition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityAugmentationPointGroup() {
		if (activityAugmentationPointGroup == null) {
			activityAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT_GROUP);
		}
		return activityAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityAugmentationPoint() {
		return getActivityAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityType_ActivityAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_TYPE__ACTIVITY_IDENTIFICATION:
				return ((InternalEList<?>)getActivityIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_CATEGORY_TEXT:
				return ((InternalEList<?>)getActivityCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getActivityDateRepresentationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION:
				return ((InternalEList<?>)getActivityDateRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getActivityDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_NAME:
				return ((InternalEList<?>)getActivityName()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_STATUS:
				return ((InternalEList<?>)getActivityStatus()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_REASON_TEXT:
				return ((InternalEList<?>)getActivityReasonText()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION_GROUP:
				return ((InternalEList<?>)getActivityDispositionGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION:
				return ((InternalEList<?>)getActivityDisposition()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_TYPE__ACTIVITY_IDENTIFICATION:
				return getActivityIdentification();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_CATEGORY_TEXT:
				return getActivityCategoryText();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION_GROUP:
				if (coreType) return getActivityDateRepresentationGroup();
				return ((FeatureMap.Internal)getActivityDateRepresentationGroup()).getWrapper();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION:
				return getActivityDateRepresentation();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DESCRIPTION_TEXT:
				return getActivityDescriptionText();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_NAME:
				return getActivityName();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_STATUS:
				return getActivityStatus();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_REASON_TEXT:
				return getActivityReasonText();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION_GROUP:
				if (coreType) return getActivityDispositionGroup();
				return ((FeatureMap.Internal)getActivityDispositionGroup()).getWrapper();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION:
				return getActivityDisposition();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT:
				return getActivityAugmentationPoint();
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
			case _0Package.ACTIVITY_TYPE__ACTIVITY_IDENTIFICATION:
				getActivityIdentification().clear();
				getActivityIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_CATEGORY_TEXT:
				getActivityCategoryText().clear();
				getActivityCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getActivityDateRepresentationGroup()).set(newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DESCRIPTION_TEXT:
				getActivityDescriptionText().clear();
				getActivityDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_NAME:
				getActivityName().clear();
				getActivityName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_STATUS:
				getActivityStatus().clear();
				getActivityStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_REASON_TEXT:
				getActivityReasonText().clear();
				getActivityReasonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION_GROUP:
				((FeatureMap.Internal)getActivityDispositionGroup()).set(newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION:
				getActivityDisposition().clear();
				getActivityDisposition().addAll((Collection<? extends DispositionType>)newValue);
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_TYPE__ACTIVITY_IDENTIFICATION:
				getActivityIdentification().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_CATEGORY_TEXT:
				getActivityCategoryText().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION_GROUP:
				getActivityDateRepresentationGroup().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DESCRIPTION_TEXT:
				getActivityDescriptionText().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_NAME:
				getActivityName().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_STATUS:
				getActivityStatus().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_REASON_TEXT:
				getActivityReasonText().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION_GROUP:
				getActivityDispositionGroup().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION:
				getActivityDisposition().clear();
				return;
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT_GROUP:
				getActivityAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_TYPE__ACTIVITY_IDENTIFICATION:
				return activityIdentification != null && !activityIdentification.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_CATEGORY_TEXT:
				return activityCategoryText != null && !activityCategoryText.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION_GROUP:
				return activityDateRepresentationGroup != null && !activityDateRepresentationGroup.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DATE_REPRESENTATION:
				return !getActivityDateRepresentation().isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DESCRIPTION_TEXT:
				return activityDescriptionText != null && !activityDescriptionText.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_NAME:
				return activityName != null && !activityName.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_STATUS:
				return activityStatus != null && !activityStatus.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_REASON_TEXT:
				return activityReasonText != null && !activityReasonText.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION_GROUP:
				return activityDispositionGroup != null && !activityDispositionGroup.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_DISPOSITION:
				return !getActivityDisposition().isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT_GROUP:
				return activityAugmentationPointGroup != null && !activityAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_TYPE__ACTIVITY_AUGMENTATION_POINT:
				return !getActivityAugmentationPoint().isEmpty();
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
		result.append(" (activityDateRepresentationGroup: ");
		result.append(activityDateRepresentationGroup);
		result.append(", activityDispositionGroup: ");
		result.append(activityDispositionGroup);
		result.append(", activityAugmentationPointGroup: ");
		result.append(activityAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityTypeImpl
