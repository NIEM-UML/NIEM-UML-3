/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityDocumentAssociationType;
import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.DocumentType;
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
 * An implementation of the model object '<em><b>Activity Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityDocumentAssociationTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityDocumentAssociationTypeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityDocumentAssociationTypeImpl#getActivityDocumentAssociationAugmentationPointGroup <em>Activity Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.ActivityDocumentAssociationTypeImpl#getActivityDocumentAssociationAugmentationPoint <em>Activity Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityDocumentAssociationTypeImpl extends AssociationTypeImpl implements ActivityDocumentAssociationType {
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
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> document;

	/**
	 * The cached value of the '{@link #getActivityDocumentAssociationAugmentationPointGroup() <em>Activity Document Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityDocumentAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap activityDocumentAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityDocumentAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getActivityDocumentAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getActivityDocumentAssociationAugmentationPointGroup() {
		if (activityDocumentAssociationAugmentationPointGroup == null) {
			activityDocumentAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return activityDocumentAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getActivityDocumentAssociationAugmentationPoint() {
		return getActivityDocumentAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getActivityDocumentAssociationType_ActivityDocumentAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getActivityDocumentAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getActivityDocumentAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY:
				return getActivity();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return getDocument();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getActivityDocumentAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getActivityDocumentAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return getActivityDocumentAssociationAugmentationPoint();
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
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getActivityDocumentAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY:
				getActivity().clear();
				return;
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				getDocument().clear();
				return;
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getActivityDocumentAssociationAugmentationPointGroup().clear();
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
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return document != null && !document.isEmpty();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return activityDocumentAssociationAugmentationPointGroup != null && !activityDocumentAssociationAugmentationPointGroup.isEmpty();
			case _0Package.ACTIVITY_DOCUMENT_ASSOCIATION_TYPE__ACTIVITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return !getActivityDocumentAssociationAugmentationPoint().isEmpty();
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
		result.append(" (activityDocumentAssociationAugmentationPointGroup: ");
		result.append(activityDocumentAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //ActivityDocumentAssociationTypeImpl
