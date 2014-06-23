/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.Duration;

import gov.niem.release.niem.structures._3._0.impl.ObjectTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateRepresentationGroup <em>Date Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateRepresentation <em>Date Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateAccuracyGroup <em>Date Accuracy Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateAccuracy <em>Date Accuracy</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateMarginOfErrorDuration <em>Date Margin Of Error Duration</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateAugmentationPointGroup <em>Date Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DateTypeImpl#getDateAugmentationPoint <em>Date Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTypeImpl extends ObjectTypeImpl implements DateType {
	/**
	 * The cached value of the '{@link #getDateRepresentationGroup() <em>Date Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dateRepresentationGroup;

	/**
	 * The cached value of the '{@link #getDateAccuracyGroup() <em>Date Accuracy Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAccuracyGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dateAccuracyGroup;

	/**
	 * The cached value of the '{@link #getDateMarginOfErrorDuration() <em>Date Margin Of Error Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateMarginOfErrorDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration dateMarginOfErrorDuration;

	/**
	 * This is true if the Date Margin Of Error Duration containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dateMarginOfErrorDurationESet;

	/**
	 * The cached value of the '{@link #getDateAugmentationPointGroup() <em>Date Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dateAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDateRepresentationGroup() {
		if (dateRepresentationGroup == null) {
			dateRepresentationGroup = new BasicFeatureMap(this, _0Package.DATE_TYPE__DATE_REPRESENTATION_GROUP);
		}
		return dateRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDateRepresentation() {
		return getDateRepresentationGroup().list(_0Package.eINSTANCE.getDateType_DateRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDateAccuracyGroup() {
		if (dateAccuracyGroup == null) {
			dateAccuracyGroup = new BasicFeatureMap(this, _0Package.DATE_TYPE__DATE_ACCURACY_GROUP);
		}
		return dateAccuracyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDateAccuracy() {
		return (EObject)getDateAccuracyGroup().get(_0Package.eINSTANCE.getDateType_DateAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateAccuracy(EObject newDateAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getDateAccuracyGroup()).basicAdd(_0Package.eINSTANCE.getDateType_DateAccuracy(), newDateAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDateMarginOfErrorDuration() {
		return dateMarginOfErrorDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateMarginOfErrorDuration(Duration newDateMarginOfErrorDuration, NotificationChain msgs) {
		Duration oldDateMarginOfErrorDuration = dateMarginOfErrorDuration;
		dateMarginOfErrorDuration = newDateMarginOfErrorDuration;
		boolean oldDateMarginOfErrorDurationESet = dateMarginOfErrorDurationESet;
		dateMarginOfErrorDurationESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, oldDateMarginOfErrorDuration, newDateMarginOfErrorDuration, !oldDateMarginOfErrorDurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateMarginOfErrorDuration(Duration newDateMarginOfErrorDuration) {
		if (newDateMarginOfErrorDuration != dateMarginOfErrorDuration) {
			NotificationChain msgs = null;
			if (dateMarginOfErrorDuration != null)
				msgs = ((InternalEObject)dateMarginOfErrorDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, null, msgs);
			if (newDateMarginOfErrorDuration != null)
				msgs = ((InternalEObject)newDateMarginOfErrorDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, null, msgs);
			msgs = basicSetDateMarginOfErrorDuration(newDateMarginOfErrorDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDateMarginOfErrorDurationESet = dateMarginOfErrorDurationESet;
			dateMarginOfErrorDurationESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, newDateMarginOfErrorDuration, newDateMarginOfErrorDuration, !oldDateMarginOfErrorDurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDateMarginOfErrorDuration(NotificationChain msgs) {
		Duration oldDateMarginOfErrorDuration = dateMarginOfErrorDuration;
		dateMarginOfErrorDuration = null;
		boolean oldDateMarginOfErrorDurationESet = dateMarginOfErrorDurationESet;
		dateMarginOfErrorDurationESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, oldDateMarginOfErrorDuration, null, oldDateMarginOfErrorDurationESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDateMarginOfErrorDuration() {
		if (dateMarginOfErrorDuration != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dateMarginOfErrorDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, null, msgs);
			msgs = basicUnsetDateMarginOfErrorDuration(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDateMarginOfErrorDurationESet = dateMarginOfErrorDurationESet;
			dateMarginOfErrorDurationESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION, null, null, oldDateMarginOfErrorDurationESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDateMarginOfErrorDuration() {
		return dateMarginOfErrorDurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDateAugmentationPointGroup() {
		if (dateAugmentationPointGroup == null) {
			dateAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT_GROUP);
		}
		return dateAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDateAugmentationPoint() {
		return getDateAugmentationPointGroup().list(_0Package.eINSTANCE.getDateType_DateAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DATE_TYPE__DATE_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getDateRepresentationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_TYPE__DATE_REPRESENTATION:
				return ((InternalEList<?>)getDateRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_TYPE__DATE_ACCURACY_GROUP:
				return ((InternalEList<?>)getDateAccuracyGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_TYPE__DATE_ACCURACY:
				return basicSetDateAccuracy(null, msgs);
			case _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION:
				return basicUnsetDateMarginOfErrorDuration(msgs);
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDateAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDateAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DATE_TYPE__DATE_REPRESENTATION_GROUP:
				if (coreType) return getDateRepresentationGroup();
				return ((FeatureMap.Internal)getDateRepresentationGroup()).getWrapper();
			case _0Package.DATE_TYPE__DATE_REPRESENTATION:
				return getDateRepresentation();
			case _0Package.DATE_TYPE__DATE_ACCURACY_GROUP:
				if (coreType) return getDateAccuracyGroup();
				return ((FeatureMap.Internal)getDateAccuracyGroup()).getWrapper();
			case _0Package.DATE_TYPE__DATE_ACCURACY:
				return getDateAccuracy();
			case _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION:
				return getDateMarginOfErrorDuration();
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDateAugmentationPointGroup();
				return ((FeatureMap.Internal)getDateAugmentationPointGroup()).getWrapper();
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT:
				return getDateAugmentationPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _0Package.DATE_TYPE__DATE_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getDateRepresentationGroup()).set(newValue);
				return;
			case _0Package.DATE_TYPE__DATE_ACCURACY_GROUP:
				((FeatureMap.Internal)getDateAccuracyGroup()).set(newValue);
				return;
			case _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION:
				setDateMarginOfErrorDuration((Duration)newValue);
				return;
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDateAugmentationPointGroup()).set(newValue);
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
			case _0Package.DATE_TYPE__DATE_REPRESENTATION_GROUP:
				getDateRepresentationGroup().clear();
				return;
			case _0Package.DATE_TYPE__DATE_ACCURACY_GROUP:
				getDateAccuracyGroup().clear();
				return;
			case _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION:
				unsetDateMarginOfErrorDuration();
				return;
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT_GROUP:
				getDateAugmentationPointGroup().clear();
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
			case _0Package.DATE_TYPE__DATE_REPRESENTATION_GROUP:
				return dateRepresentationGroup != null && !dateRepresentationGroup.isEmpty();
			case _0Package.DATE_TYPE__DATE_REPRESENTATION:
				return !getDateRepresentation().isEmpty();
			case _0Package.DATE_TYPE__DATE_ACCURACY_GROUP:
				return dateAccuracyGroup != null && !dateAccuracyGroup.isEmpty();
			case _0Package.DATE_TYPE__DATE_ACCURACY:
				return getDateAccuracy() != null;
			case _0Package.DATE_TYPE__DATE_MARGIN_OF_ERROR_DURATION:
				return isSetDateMarginOfErrorDuration();
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT_GROUP:
				return dateAugmentationPointGroup != null && !dateAugmentationPointGroup.isEmpty();
			case _0Package.DATE_TYPE__DATE_AUGMENTATION_POINT:
				return !getDateAugmentationPoint().isEmpty();
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
		result.append(" (dateRepresentationGroup: ");
		result.append(dateRepresentationGroup);
		result.append(", dateAccuracyGroup: ");
		result.append(dateAccuracyGroup);
		result.append(", dateAugmentationPointGroup: ");
		result.append(dateAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DateTypeImpl
