/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.DispositionType;
import gov.niem.release.niem.niem.core._3._0.DocumentType;
import gov.niem.release.niem.niem.core._3._0.EntityType;
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
 * An implementation of the model object '<em><b>Disposition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionCategoryGroup <em>Disposition Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionCategory <em>Disposition Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionEntity <em>Disposition Entity</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionDate <em>Disposition Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionDescriptionText <em>Disposition Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionReasonText <em>Disposition Reason Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionReportedAuthorityText <em>Disposition Reported Authority Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionText <em>Disposition Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionInstrument <em>Disposition Instrument</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionAugmentationPointGroup <em>Disposition Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.DispositionTypeImpl#getDispositionAugmentationPoint <em>Disposition Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispositionTypeImpl extends ObjectTypeImpl implements DispositionType {
	/**
	 * The cached value of the '{@link #getDispositionCategoryGroup() <em>Disposition Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dispositionCategoryGroup;

	/**
	 * The cached value of the '{@link #getDispositionEntity() <em>Disposition Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> dispositionEntity;

	/**
	 * The cached value of the '{@link #getDispositionDate() <em>Disposition Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> dispositionDate;

	/**
	 * The cached value of the '{@link #getDispositionDescriptionText() <em>Disposition Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> dispositionDescriptionText;

	/**
	 * The cached value of the '{@link #getDispositionReasonText() <em>Disposition Reason Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionReasonText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> dispositionReasonText;

	/**
	 * The cached value of the '{@link #getDispositionReportedAuthorityText() <em>Disposition Reported Authority Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionReportedAuthorityText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> dispositionReportedAuthorityText;

	/**
	 * The cached value of the '{@link #getDispositionText() <em>Disposition Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> dispositionText;

	/**
	 * The cached value of the '{@link #getDispositionInstrument() <em>Disposition Instrument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionInstrument()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> dispositionInstrument;

	/**
	 * The cached value of the '{@link #getDispositionAugmentationPointGroup() <em>Disposition Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispositionAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap dispositionAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getDispositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDispositionCategoryGroup() {
		if (dispositionCategoryGroup == null) {
			dispositionCategoryGroup = new BasicFeatureMap(this, _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY_GROUP);
		}
		return dispositionCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDispositionCategory() {
		return getDispositionCategoryGroup().list(_0Package.eINSTANCE.getDispositionType_DispositionCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getDispositionEntity() {
		if (dispositionEntity == null) {
			dispositionEntity = new EObjectContainmentEList<EntityType>(EntityType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_ENTITY);
		}
		return dispositionEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getDispositionDate() {
		if (dispositionDate == null) {
			dispositionDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_DATE);
		}
		return dispositionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDispositionDescriptionText() {
		if (dispositionDescriptionText == null) {
			dispositionDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_DESCRIPTION_TEXT);
		}
		return dispositionDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDispositionReasonText() {
		if (dispositionReasonText == null) {
			dispositionReasonText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_REASON_TEXT);
		}
		return dispositionReasonText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDispositionReportedAuthorityText() {
		if (dispositionReportedAuthorityText == null) {
			dispositionReportedAuthorityText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_REPORTED_AUTHORITY_TEXT);
		}
		return dispositionReportedAuthorityText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getDispositionText() {
		if (dispositionText == null) {
			dispositionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_TEXT);
		}
		return dispositionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getDispositionInstrument() {
		if (dispositionInstrument == null) {
			dispositionInstrument = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.DISPOSITION_TYPE__DISPOSITION_INSTRUMENT);
		}
		return dispositionInstrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDispositionAugmentationPointGroup() {
		if (dispositionAugmentationPointGroup == null) {
			dispositionAugmentationPointGroup = new BasicFeatureMap(this, _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT_GROUP);
		}
		return dispositionAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getDispositionAugmentationPoint() {
		return getDispositionAugmentationPointGroup().list(_0Package.eINSTANCE.getDispositionType_DispositionAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY_GROUP:
				return ((InternalEList<?>)getDispositionCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY:
				return ((InternalEList<?>)getDispositionCategory()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_ENTITY:
				return ((InternalEList<?>)getDispositionEntity()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DATE:
				return ((InternalEList<?>)getDispositionDate()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getDispositionDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REASON_TEXT:
				return ((InternalEList<?>)getDispositionReasonText()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REPORTED_AUTHORITY_TEXT:
				return ((InternalEList<?>)getDispositionReportedAuthorityText()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_TEXT:
				return ((InternalEList<?>)getDispositionText()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_INSTRUMENT:
				return ((InternalEList<?>)getDispositionInstrument()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getDispositionAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT:
				return ((InternalEList<?>)getDispositionAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY_GROUP:
				if (coreType) return getDispositionCategoryGroup();
				return ((FeatureMap.Internal)getDispositionCategoryGroup()).getWrapper();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY:
				return getDispositionCategory();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_ENTITY:
				return getDispositionEntity();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DATE:
				return getDispositionDate();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DESCRIPTION_TEXT:
				return getDispositionDescriptionText();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REASON_TEXT:
				return getDispositionReasonText();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REPORTED_AUTHORITY_TEXT:
				return getDispositionReportedAuthorityText();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_TEXT:
				return getDispositionText();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_INSTRUMENT:
				return getDispositionInstrument();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT_GROUP:
				if (coreType) return getDispositionAugmentationPointGroup();
				return ((FeatureMap.Internal)getDispositionAugmentationPointGroup()).getWrapper();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT:
				return getDispositionAugmentationPoint();
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
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY_GROUP:
				((FeatureMap.Internal)getDispositionCategoryGroup()).set(newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_ENTITY:
				getDispositionEntity().clear();
				getDispositionEntity().addAll((Collection<? extends EntityType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DATE:
				getDispositionDate().clear();
				getDispositionDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DESCRIPTION_TEXT:
				getDispositionDescriptionText().clear();
				getDispositionDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REASON_TEXT:
				getDispositionReasonText().clear();
				getDispositionReasonText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REPORTED_AUTHORITY_TEXT:
				getDispositionReportedAuthorityText().clear();
				getDispositionReportedAuthorityText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_TEXT:
				getDispositionText().clear();
				getDispositionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_INSTRUMENT:
				getDispositionInstrument().clear();
				getDispositionInstrument().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getDispositionAugmentationPointGroup()).set(newValue);
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
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY_GROUP:
				getDispositionCategoryGroup().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_ENTITY:
				getDispositionEntity().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DATE:
				getDispositionDate().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DESCRIPTION_TEXT:
				getDispositionDescriptionText().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REASON_TEXT:
				getDispositionReasonText().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REPORTED_AUTHORITY_TEXT:
				getDispositionReportedAuthorityText().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_TEXT:
				getDispositionText().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_INSTRUMENT:
				getDispositionInstrument().clear();
				return;
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT_GROUP:
				getDispositionAugmentationPointGroup().clear();
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
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY_GROUP:
				return dispositionCategoryGroup != null && !dispositionCategoryGroup.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_CATEGORY:
				return !getDispositionCategory().isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_ENTITY:
				return dispositionEntity != null && !dispositionEntity.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DATE:
				return dispositionDate != null && !dispositionDate.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_DESCRIPTION_TEXT:
				return dispositionDescriptionText != null && !dispositionDescriptionText.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REASON_TEXT:
				return dispositionReasonText != null && !dispositionReasonText.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_REPORTED_AUTHORITY_TEXT:
				return dispositionReportedAuthorityText != null && !dispositionReportedAuthorityText.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_TEXT:
				return dispositionText != null && !dispositionText.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_INSTRUMENT:
				return dispositionInstrument != null && !dispositionInstrument.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT_GROUP:
				return dispositionAugmentationPointGroup != null && !dispositionAugmentationPointGroup.isEmpty();
			case _0Package.DISPOSITION_TYPE__DISPOSITION_AUGMENTATION_POINT:
				return !getDispositionAugmentationPoint().isEmpty();
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
		result.append(" (dispositionCategoryGroup: ");
		result.append(dispositionCategoryGroup);
		result.append(", dispositionAugmentationPointGroup: ");
		result.append(dispositionAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //DispositionTypeImpl
