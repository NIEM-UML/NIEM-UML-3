/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DocumentStatusDetailsType;
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
 * An implementation of the model object '<em><b>Document Status Details Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentStatusDetailsTypeImpl#getDocumentStatusCategoryGroup <em>Document Status Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentStatusDetailsTypeImpl#getDocumentStatusCategory <em>Document Status Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentStatusDetailsTypeImpl#getDocumentStatusDescriptionText <em>Document Status Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentStatusDetailsTypeImpl#getDocumentStatusDetailsAugmentationPointGroup <em>Document Status Details Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentStatusDetailsTypeImpl#getDocumentStatusDetailsAugmentationPoint <em>Document Status Details Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentStatusDetailsTypeImpl extends ObjectTypeImpl implements DocumentStatusDetailsType {
	/**
	 * The cached value of the '{@link #getDocumentStatusCategoryGroup() <em>Document Status Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatusCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentStatusCategoryGroup;

	/**
	 * The cached value of the '{@link #getDocumentStatusDescriptionText() <em>Document Status Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatusDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentStatusDescriptionText;

	/**
	 * The cached value of the '{@link #getDocumentStatusDetailsAugmentationPointGroup() <em>Document Status Details Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStatusDetailsAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentStatusDetailsAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentStatusDetailsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDocumentStatusDetailsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentStatusCategoryGroup() {
		if (documentStatusCategoryGroup == null) {
			documentStatusCategoryGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY_GROUP);
		}
		return documentStatusCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentStatusCategory() {
		return getDocumentStatusCategoryGroup().list(_0Package.eINSTANCE.getDocumentStatusDetailsType_DocumentStatusCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentStatusDescriptionText() {
		if (documentStatusDescriptionText == null) {
			documentStatusDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DESCRIPTION_TEXT);
		}
		return documentStatusDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentStatusDetailsAugmentationPointGroup() {
		if (documentStatusDetailsAugmentationPointGroup == null) {
			documentStatusDetailsAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT_GROUP);
		}
		return documentStatusDetailsAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentStatusDetailsAugmentationPoint() {
		return getDocumentStatusDetailsAugmentationPointGroup().list(_0Package.eINSTANCE.getDocumentStatusDetailsType_DocumentStatusDetailsAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY_GROUP:
				return ((InternalEList<?>)getDocumentStatusCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY:
				return ((InternalEList<?>)getDocumentStatusCategory()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getDocumentStatusDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDocumentStatusDetailsAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDocumentStatusDetailsAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY_GROUP:
				if (coreType) return getDocumentStatusCategoryGroup();
				return ((FeatureMap.Internal)getDocumentStatusCategoryGroup()).getWrapper();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY:
				return getDocumentStatusCategory();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DESCRIPTION_TEXT:
				return getDocumentStatusDescriptionText();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDocumentStatusDetailsAugmentationPointGroup();
				return ((FeatureMap.Internal)getDocumentStatusDetailsAugmentationPointGroup()).getWrapper();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT:
				return getDocumentStatusDetailsAugmentationPoint();
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
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY_GROUP:
				((FeatureMap.Internal)getDocumentStatusCategoryGroup()).set(newValue);
				return;
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DESCRIPTION_TEXT:
				getDocumentStatusDescriptionText().clear();
				getDocumentStatusDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDocumentStatusDetailsAugmentationPointGroup()).set(newValue);
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
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY_GROUP:
				getDocumentStatusCategoryGroup().clear();
				return;
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DESCRIPTION_TEXT:
				getDocumentStatusDescriptionText().clear();
				return;
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT_GROUP:
				getDocumentStatusDetailsAugmentationPointGroup().clear();
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
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY_GROUP:
				return documentStatusCategoryGroup != null && !documentStatusCategoryGroup.isEmpty();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_CATEGORY:
				return !getDocumentStatusCategory().isEmpty();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DESCRIPTION_TEXT:
				return documentStatusDescriptionText != null && !documentStatusDescriptionText.isEmpty();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT_GROUP:
				return documentStatusDetailsAugmentationPointGroup != null && !documentStatusDetailsAugmentationPointGroup.isEmpty();
			case _0Package.DOCUMENT_STATUS_DETAILS_TYPE__DOCUMENT_STATUS_DETAILS_AUGMENTATION_POINT:
				return !getDocumentStatusDetailsAugmentationPoint().isEmpty();
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
		result.append(" (documentStatusCategoryGroup: ");
		result.append(documentStatusCategoryGroup);
		result.append(", documentStatusDetailsAugmentationPointGroup: ");
		result.append(documentStatusDetailsAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DocumentStatusDetailsTypeImpl
