/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DocumentAssociationType;
import gov.niem.release.niem.niem.core._3._0.DocumentType;
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
 * An implementation of the model object '<em><b>Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentAssociationTypeImpl#getPrimaryDocument <em>Primary Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentAssociationTypeImpl#getSecondaryDocument <em>Secondary Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentAssociationTypeImpl#getDocumentRelationText <em>Document Relation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentAssociationTypeImpl#getDocumentAssociationAugmentationPointGroup <em>Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DocumentAssociationTypeImpl#getDocumentAssociationAugmentationPoint <em>Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentAssociationTypeImpl extends AssociationTypeImpl implements DocumentAssociationType {
	/**
	 * The cached value of the '{@link #getPrimaryDocument() <em>Primary Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> primaryDocument;

	/**
	 * The cached value of the '{@link #getSecondaryDocument() <em>Secondary Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> secondaryDocument;

	/**
	 * The cached value of the '{@link #getDocumentRelationText() <em>Document Relation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentRelationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> documentRelationText;

	/**
	 * The cached value of the '{@link #getDocumentAssociationAugmentationPointGroup() <em>Document Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap documentAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDocumentAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getPrimaryDocument() {
		if (primaryDocument == null) {
			primaryDocument = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.DOCUMENT_ASSOCIATION_TYPE__PRIMARY_DOCUMENT);
		}
		return primaryDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getSecondaryDocument() {
		if (secondaryDocument == null) {
			secondaryDocument = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.DOCUMENT_ASSOCIATION_TYPE__SECONDARY_DOCUMENT);
		}
		return secondaryDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDocumentRelationText() {
		if (documentRelationText == null) {
			documentRelationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_RELATION_TEXT);
		}
		return documentRelationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDocumentAssociationAugmentationPointGroup() {
		if (documentAssociationAugmentationPointGroup == null) {
			documentAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return documentAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDocumentAssociationAugmentationPoint() {
		return getDocumentAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getDocumentAssociationType_DocumentAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__PRIMARY_DOCUMENT:
				return ((InternalEList<?>)getPrimaryDocument()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__SECONDARY_DOCUMENT:
				return ((InternalEList<?>)getSecondaryDocument()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_RELATION_TEXT:
				return ((InternalEList<?>)getDocumentRelationText()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDocumentAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDocumentAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__PRIMARY_DOCUMENT:
				return getPrimaryDocument();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__SECONDARY_DOCUMENT:
				return getSecondaryDocument();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_RELATION_TEXT:
				return getDocumentRelationText();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDocumentAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getDocumentAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return getDocumentAssociationAugmentationPoint();
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
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__PRIMARY_DOCUMENT:
				getPrimaryDocument().clear();
				getPrimaryDocument().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__SECONDARY_DOCUMENT:
				getSecondaryDocument().clear();
				getSecondaryDocument().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_RELATION_TEXT:
				getDocumentRelationText().clear();
				getDocumentRelationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDocumentAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__PRIMARY_DOCUMENT:
				getPrimaryDocument().clear();
				return;
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__SECONDARY_DOCUMENT:
				getSecondaryDocument().clear();
				return;
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_RELATION_TEXT:
				getDocumentRelationText().clear();
				return;
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getDocumentAssociationAugmentationPointGroup().clear();
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
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__PRIMARY_DOCUMENT:
				return primaryDocument != null && !primaryDocument.isEmpty();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__SECONDARY_DOCUMENT:
				return secondaryDocument != null && !secondaryDocument.isEmpty();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_RELATION_TEXT:
				return documentRelationText != null && !documentRelationText.isEmpty();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return documentAssociationAugmentationPointGroup != null && !documentAssociationAugmentationPointGroup.isEmpty();
			case _0Package.DOCUMENT_ASSOCIATION_TYPE__DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return !getDocumentAssociationAugmentationPoint().isEmpty();
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
		result.append(" (documentAssociationAugmentationPointGroup: ");
		result.append(documentAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DocumentAssociationTypeImpl
