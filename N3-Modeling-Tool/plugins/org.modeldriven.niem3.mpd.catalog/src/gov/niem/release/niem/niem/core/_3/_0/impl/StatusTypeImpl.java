/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

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
 * An implementation of the model object '<em><b>Status Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusCommentText <em>Status Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusDateRepresentationGroup <em>Status Date Representation Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusDateRepresentation <em>Status Date Representation</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusDesignatorGroup <em>Status Designator Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusDesignator <em>Status Designator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusDescriptionText <em>Status Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusIssuerIdentification <em>Status Issuer Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusIssuerText <em>Status Issuer Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusAugmentationPointGroup <em>Status Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.StatusTypeImpl#getStatusAugmentationPoint <em>Status Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusTypeImpl extends ObjectTypeImpl implements StatusType {
	/**
	 * The cached value of the '{@link #getStatusCommentText() <em>Status Comment Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCommentText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> statusCommentText;

	/**
	 * The cached value of the '{@link #getStatusDateRepresentationGroup() <em>Status Date Representation Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDateRepresentationGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap statusDateRepresentationGroup;

	/**
	 * The cached value of the '{@link #getStatusDesignatorGroup() <em>Status Designator Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDesignatorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap statusDesignatorGroup;

	/**
	 * The cached value of the '{@link #getStatusDescriptionText() <em>Status Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> statusDescriptionText;

	/**
	 * The cached value of the '{@link #getStatusIssuerIdentification() <em>Status Issuer Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusIssuerIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> statusIssuerIdentification;

	/**
	 * The cached value of the '{@link #getStatusIssuerText() <em>Status Issuer Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusIssuerText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> statusIssuerText;

	/**
	 * The cached value of the '{@link #getStatusAugmentationPointGroup() <em>Status Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap statusAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getStatusType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStatusCommentText() {
		if (statusCommentText == null) {
			statusCommentText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STATUS_TYPE__STATUS_COMMENT_TEXT);
		}
		return statusCommentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStatusDateRepresentationGroup() {
		if (statusDateRepresentationGroup == null) {
			statusDateRepresentationGroup = new BasicFeatureMap(this, _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION_GROUP);
		}
		return statusDateRepresentationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStatusDateRepresentation() {
		return getStatusDateRepresentationGroup().list(_0Package.eINSTANCE.getStatusType_StatusDateRepresentation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStatusDesignatorGroup() {
		if (statusDesignatorGroup == null) {
			statusDesignatorGroup = new BasicFeatureMap(this, _0Package.STATUS_TYPE__STATUS_DESIGNATOR_GROUP);
		}
		return statusDesignatorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStatusDesignator() {
		return getStatusDesignatorGroup().list(_0Package.eINSTANCE.getStatusType_StatusDesignator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStatusDescriptionText() {
		if (statusDescriptionText == null) {
			statusDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STATUS_TYPE__STATUS_DESCRIPTION_TEXT);
		}
		return statusDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getStatusIssuerIdentification() {
		if (statusIssuerIdentification == null) {
			statusIssuerIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.STATUS_TYPE__STATUS_ISSUER_IDENTIFICATION);
		}
		return statusIssuerIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getStatusIssuerText() {
		if (statusIssuerText == null) {
			statusIssuerText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.STATUS_TYPE__STATUS_ISSUER_TEXT);
		}
		return statusIssuerText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStatusAugmentationPointGroup() {
		if (statusAugmentationPointGroup == null) {
			statusAugmentationPointGroup = new BasicFeatureMap(this, _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT_GROUP);
		}
		return statusAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getStatusAugmentationPoint() {
		return getStatusAugmentationPointGroup().list(_0Package.eINSTANCE.getStatusType_StatusAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.STATUS_TYPE__STATUS_COMMENT_TEXT:
				return ((InternalEList<?>)getStatusCommentText()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION_GROUP:
				return ((InternalEList<?>)getStatusDateRepresentationGroup()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION:
				return ((InternalEList<?>)getStatusDateRepresentation()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR_GROUP:
				return ((InternalEList<?>)getStatusDesignatorGroup()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR:
				return ((InternalEList<?>)getStatusDesignator()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getStatusDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_ISSUER_IDENTIFICATION:
				return ((InternalEList<?>)getStatusIssuerIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_ISSUER_TEXT:
				return ((InternalEList<?>)getStatusIssuerText()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getStatusAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT:
				return ((InternalEList<?>)getStatusAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.STATUS_TYPE__STATUS_COMMENT_TEXT:
				return getStatusCommentText();
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION_GROUP:
				if (coreType) return getStatusDateRepresentationGroup();
				return ((FeatureMap.Internal)getStatusDateRepresentationGroup()).getWrapper();
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION:
				return getStatusDateRepresentation();
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR_GROUP:
				if (coreType) return getStatusDesignatorGroup();
				return ((FeatureMap.Internal)getStatusDesignatorGroup()).getWrapper();
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR:
				return getStatusDesignator();
			case _0Package.STATUS_TYPE__STATUS_DESCRIPTION_TEXT:
				return getStatusDescriptionText();
			case _0Package.STATUS_TYPE__STATUS_ISSUER_IDENTIFICATION:
				return getStatusIssuerIdentification();
			case _0Package.STATUS_TYPE__STATUS_ISSUER_TEXT:
				return getStatusIssuerText();
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT_GROUP:
				if (coreType) return getStatusAugmentationPointGroup();
				return ((FeatureMap.Internal)getStatusAugmentationPointGroup()).getWrapper();
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT:
				return getStatusAugmentationPoint();
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
			case _0Package.STATUS_TYPE__STATUS_COMMENT_TEXT:
				getStatusCommentText().clear();
				getStatusCommentText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION_GROUP:
				((FeatureMap.Internal)getStatusDateRepresentationGroup()).set(newValue);
				return;
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR_GROUP:
				((FeatureMap.Internal)getStatusDesignatorGroup()).set(newValue);
				return;
			case _0Package.STATUS_TYPE__STATUS_DESCRIPTION_TEXT:
				getStatusDescriptionText().clear();
				getStatusDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STATUS_TYPE__STATUS_ISSUER_IDENTIFICATION:
				getStatusIssuerIdentification().clear();
				getStatusIssuerIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.STATUS_TYPE__STATUS_ISSUER_TEXT:
				getStatusIssuerText().clear();
				getStatusIssuerText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getStatusAugmentationPointGroup()).set(newValue);
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
			case _0Package.STATUS_TYPE__STATUS_COMMENT_TEXT:
				getStatusCommentText().clear();
				return;
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION_GROUP:
				getStatusDateRepresentationGroup().clear();
				return;
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR_GROUP:
				getStatusDesignatorGroup().clear();
				return;
			case _0Package.STATUS_TYPE__STATUS_DESCRIPTION_TEXT:
				getStatusDescriptionText().clear();
				return;
			case _0Package.STATUS_TYPE__STATUS_ISSUER_IDENTIFICATION:
				getStatusIssuerIdentification().clear();
				return;
			case _0Package.STATUS_TYPE__STATUS_ISSUER_TEXT:
				getStatusIssuerText().clear();
				return;
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT_GROUP:
				getStatusAugmentationPointGroup().clear();
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
			case _0Package.STATUS_TYPE__STATUS_COMMENT_TEXT:
				return statusCommentText != null && !statusCommentText.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION_GROUP:
				return statusDateRepresentationGroup != null && !statusDateRepresentationGroup.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_DATE_REPRESENTATION:
				return !getStatusDateRepresentation().isEmpty();
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR_GROUP:
				return statusDesignatorGroup != null && !statusDesignatorGroup.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_DESIGNATOR:
				return !getStatusDesignator().isEmpty();
			case _0Package.STATUS_TYPE__STATUS_DESCRIPTION_TEXT:
				return statusDescriptionText != null && !statusDescriptionText.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_ISSUER_IDENTIFICATION:
				return statusIssuerIdentification != null && !statusIssuerIdentification.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_ISSUER_TEXT:
				return statusIssuerText != null && !statusIssuerText.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT_GROUP:
				return statusAugmentationPointGroup != null && !statusAugmentationPointGroup.isEmpty();
			case _0Package.STATUS_TYPE__STATUS_AUGMENTATION_POINT:
				return !getStatusAugmentationPoint().isEmpty();
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
		result.append(" (statusDateRepresentationGroup: ");
		result.append(statusDateRepresentationGroup);
		result.append(", statusDesignatorGroup: ");
		result.append(statusDesignatorGroup);
		result.append(", statusAugmentationPointGroup: ");
		result.append(statusAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //StatusTypeImpl
