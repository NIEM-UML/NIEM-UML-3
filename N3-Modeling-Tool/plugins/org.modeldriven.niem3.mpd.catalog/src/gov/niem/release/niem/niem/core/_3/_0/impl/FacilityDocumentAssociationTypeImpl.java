/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DocumentType;
import gov.niem.release.niem.niem.core._3._0.FacilityDocumentAssociationType;
import gov.niem.release.niem.niem.core._3._0.FacilityType;
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
 * An implementation of the model object '<em><b>Facility Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityDocumentAssociationTypeImpl#getFacility <em>Facility</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityDocumentAssociationTypeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityDocumentAssociationTypeImpl#getFacilityDocumentAssociationAugmentationPointGroup <em>Facility Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.FacilityDocumentAssociationTypeImpl#getFacilityDocumentAssociationAugmentationPoint <em>Facility Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilityDocumentAssociationTypeImpl extends AssociationTypeImpl implements FacilityDocumentAssociationType {
	/**
	 * The cached value of the '{@link #getFacility() <em>Facility</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<FacilityType> facility;

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
	 * The cached value of the '{@link #getFacilityDocumentAssociationAugmentationPointGroup() <em>Facility Document Association Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityDocumentAssociationAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap facilityDocumentAssociationAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityDocumentAssociationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getFacilityDocumentAssociationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FacilityType> getFacility() {
		if (facility == null) {
			facility = new EObjectContainmentEList<FacilityType>(FacilityType.class, this, _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY);
		}
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getDocument() {
		if (document == null) {
			document = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT);
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFacilityDocumentAssociationAugmentationPointGroup() {
		if (facilityDocumentAssociationAugmentationPointGroup == null) {
			facilityDocumentAssociationAugmentationPointGroup = new BasicFeatureMap(this, _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP);
		}
		return facilityDocumentAssociationAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFacilityDocumentAssociationAugmentationPoint() {
		return getFacilityDocumentAssociationAugmentationPointGroup().list(_0Package.eINSTANCE.getFacilityDocumentAssociationType_FacilityDocumentAssociationAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY:
				return ((InternalEList<?>)getFacility()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return ((InternalEList<?>)getDocument()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getFacilityDocumentAssociationAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getFacilityDocumentAssociationAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY:
				return getFacility();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return getDocument();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getFacilityDocumentAssociationAugmentationPointGroup();
				return ((FeatureMap.Internal)getFacilityDocumentAssociationAugmentationPointGroup()).getWrapper();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return getFacilityDocumentAssociationAugmentationPoint();
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
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				getFacility().addAll((Collection<? extends FacilityType>)newValue);
				return;
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				getDocument().clear();
				getDocument().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getFacilityDocumentAssociationAugmentationPointGroup()).set(newValue);
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
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY:
				getFacility().clear();
				return;
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				getDocument().clear();
				return;
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				getFacilityDocumentAssociationAugmentationPointGroup().clear();
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
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY:
				return facility != null && !facility.isEmpty();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__DOCUMENT:
				return document != null && !document.isEmpty();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT_GROUP:
				return facilityDocumentAssociationAugmentationPointGroup != null && !facilityDocumentAssociationAugmentationPointGroup.isEmpty();
			case _0Package.FACILITY_DOCUMENT_ASSOCIATION_TYPE__FACILITY_DOCUMENT_ASSOCIATION_AUGMENTATION_POINT:
				return !getFacilityDocumentAssociationAugmentationPoint().isEmpty();
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
		result.append(" (facilityDocumentAssociationAugmentationPointGroup: ");
		result.append(facilityDocumentAssociationAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //FacilityDocumentAssociationTypeImpl
