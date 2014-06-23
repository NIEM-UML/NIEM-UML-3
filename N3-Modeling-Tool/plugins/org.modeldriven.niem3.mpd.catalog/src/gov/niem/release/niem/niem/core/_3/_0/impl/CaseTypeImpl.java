/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.CaseType;
import gov.niem.release.niem.niem.core._3._0.DocumentType;
import gov.niem.release.niem.niem.core._3._0.TextType;
import gov.niem.release.niem.niem.core._3._0._0Package;

import gov.niem.release.niem.proxy.xsd._3._0.GYear;

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
 * An implementation of the model object '<em><b>Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseTitleText <em>Case Title Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseCategoryText <em>Case Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseGeneralCategoryText <em>Case General Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseYearDate <em>Case Year Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseTrackingID <em>Case Tracking ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseSubCategoryText <em>Case Sub Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseDocketID <em>Case Docket ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseResolutionText <em>Case Resolution Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseFiling <em>Case Filing</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseAugmentationPointGroup <em>Case Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.CaseTypeImpl#getCaseAugmentationPoint <em>Case Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseTypeImpl extends ActivityTypeImpl implements CaseType {
	/**
	 * The cached value of the '{@link #getCaseTitleText() <em>Case Title Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseTitleText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caseTitleText;

	/**
	 * The cached value of the '{@link #getCaseCategoryText() <em>Case Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caseCategoryText;

	/**
	 * The cached value of the '{@link #getCaseGeneralCategoryText() <em>Case General Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseGeneralCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caseGeneralCategoryText;

	/**
	 * The cached value of the '{@link #getCaseYearDate() <em>Case Year Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseYearDate()
	 * @generated
	 * @ordered
	 */
	protected EList<GYear> caseYearDate;

	/**
	 * The cached value of the '{@link #getCaseTrackingID() <em>Case Tracking ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseTrackingID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> caseTrackingID;

	/**
	 * The cached value of the '{@link #getCaseSubCategoryText() <em>Case Sub Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSubCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> caseSubCategoryText;

	/**
	 * The cached value of the '{@link #getCaseDocketID() <em>Case Docket ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseDocketID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> caseDocketID;

	/**
	 * The cached value of the '{@link #getCaseResolutionText() <em>Case Resolution Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseResolutionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> caseResolutionText;

	/**
	 * The cached value of the '{@link #getCaseFiling() <em>Case Filing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseFiling()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> caseFiling;

	/**
	 * The cached value of the '{@link #getCaseAugmentationPointGroup() <em>Case Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap caseAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getCaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaseTitleText() {
		if (caseTitleText == null) {
			caseTitleText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CASE_TYPE__CASE_TITLE_TEXT);
		}
		return caseTitleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaseCategoryText() {
		if (caseCategoryText == null) {
			caseCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CASE_TYPE__CASE_CATEGORY_TEXT);
		}
		return caseCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaseGeneralCategoryText() {
		if (caseGeneralCategoryText == null) {
			caseGeneralCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CASE_TYPE__CASE_GENERAL_CATEGORY_TEXT);
		}
		return caseGeneralCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GYear> getCaseYearDate() {
		if (caseYearDate == null) {
			caseYearDate = new EObjectContainmentEList<GYear>(GYear.class, this, _0Package.CASE_TYPE__CASE_YEAR_DATE);
		}
		return caseYearDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getCaseTrackingID() {
		if (caseTrackingID == null) {
			caseTrackingID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.CASE_TYPE__CASE_TRACKING_ID);
		}
		return caseTrackingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getCaseSubCategoryText() {
		if (caseSubCategoryText == null) {
			caseSubCategoryText = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.CASE_TYPE__CASE_SUB_CATEGORY_TEXT);
		}
		return caseSubCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getCaseDocketID() {
		if (caseDocketID == null) {
			caseDocketID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.CASE_TYPE__CASE_DOCKET_ID);
		}
		return caseDocketID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getCaseResolutionText() {
		if (caseResolutionText == null) {
			caseResolutionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.CASE_TYPE__CASE_RESOLUTION_TEXT);
		}
		return caseResolutionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getCaseFiling() {
		if (caseFiling == null) {
			caseFiling = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.CASE_TYPE__CASE_FILING);
		}
		return caseFiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getCaseAugmentationPointGroup() {
		if (caseAugmentationPointGroup == null) {
			caseAugmentationPointGroup = new BasicFeatureMap(this, _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT_GROUP);
		}
		return caseAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getCaseAugmentationPoint() {
		return getCaseAugmentationPointGroup().list(_0Package.eINSTANCE.getCaseType_CaseAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.CASE_TYPE__CASE_TITLE_TEXT:
				return ((InternalEList<?>)getCaseTitleText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_CATEGORY_TEXT:
				return ((InternalEList<?>)getCaseCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_GENERAL_CATEGORY_TEXT:
				return ((InternalEList<?>)getCaseGeneralCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_YEAR_DATE:
				return ((InternalEList<?>)getCaseYearDate()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_TRACKING_ID:
				return ((InternalEList<?>)getCaseTrackingID()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_SUB_CATEGORY_TEXT:
				return ((InternalEList<?>)getCaseSubCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_DOCKET_ID:
				return ((InternalEList<?>)getCaseDocketID()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_RESOLUTION_TEXT:
				return ((InternalEList<?>)getCaseResolutionText()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_FILING:
				return ((InternalEList<?>)getCaseFiling()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getCaseAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT:
				return ((InternalEList<?>)getCaseAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.CASE_TYPE__CASE_TITLE_TEXT:
				return getCaseTitleText();
			case _0Package.CASE_TYPE__CASE_CATEGORY_TEXT:
				return getCaseCategoryText();
			case _0Package.CASE_TYPE__CASE_GENERAL_CATEGORY_TEXT:
				return getCaseGeneralCategoryText();
			case _0Package.CASE_TYPE__CASE_YEAR_DATE:
				return getCaseYearDate();
			case _0Package.CASE_TYPE__CASE_TRACKING_ID:
				return getCaseTrackingID();
			case _0Package.CASE_TYPE__CASE_SUB_CATEGORY_TEXT:
				return getCaseSubCategoryText();
			case _0Package.CASE_TYPE__CASE_DOCKET_ID:
				return getCaseDocketID();
			case _0Package.CASE_TYPE__CASE_RESOLUTION_TEXT:
				return getCaseResolutionText();
			case _0Package.CASE_TYPE__CASE_FILING:
				return getCaseFiling();
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT_GROUP:
				if (coreType) return getCaseAugmentationPointGroup();
				return ((FeatureMap.Internal)getCaseAugmentationPointGroup()).getWrapper();
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT:
				return getCaseAugmentationPoint();
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
			case _0Package.CASE_TYPE__CASE_TITLE_TEXT:
				getCaseTitleText().clear();
				getCaseTitleText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_CATEGORY_TEXT:
				getCaseCategoryText().clear();
				getCaseCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_GENERAL_CATEGORY_TEXT:
				getCaseGeneralCategoryText().clear();
				getCaseGeneralCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_YEAR_DATE:
				getCaseYearDate().clear();
				getCaseYearDate().addAll((Collection<? extends GYear>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_TRACKING_ID:
				getCaseTrackingID().clear();
				getCaseTrackingID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_SUB_CATEGORY_TEXT:
				getCaseSubCategoryText().clear();
				getCaseSubCategoryText().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_DOCKET_ID:
				getCaseDocketID().clear();
				getCaseDocketID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_RESOLUTION_TEXT:
				getCaseResolutionText().clear();
				getCaseResolutionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_FILING:
				getCaseFiling().clear();
				getCaseFiling().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getCaseAugmentationPointGroup()).set(newValue);
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
			case _0Package.CASE_TYPE__CASE_TITLE_TEXT:
				getCaseTitleText().clear();
				return;
			case _0Package.CASE_TYPE__CASE_CATEGORY_TEXT:
				getCaseCategoryText().clear();
				return;
			case _0Package.CASE_TYPE__CASE_GENERAL_CATEGORY_TEXT:
				getCaseGeneralCategoryText().clear();
				return;
			case _0Package.CASE_TYPE__CASE_YEAR_DATE:
				getCaseYearDate().clear();
				return;
			case _0Package.CASE_TYPE__CASE_TRACKING_ID:
				getCaseTrackingID().clear();
				return;
			case _0Package.CASE_TYPE__CASE_SUB_CATEGORY_TEXT:
				getCaseSubCategoryText().clear();
				return;
			case _0Package.CASE_TYPE__CASE_DOCKET_ID:
				getCaseDocketID().clear();
				return;
			case _0Package.CASE_TYPE__CASE_RESOLUTION_TEXT:
				getCaseResolutionText().clear();
				return;
			case _0Package.CASE_TYPE__CASE_FILING:
				getCaseFiling().clear();
				return;
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT_GROUP:
				getCaseAugmentationPointGroup().clear();
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
			case _0Package.CASE_TYPE__CASE_TITLE_TEXT:
				return caseTitleText != null && !caseTitleText.isEmpty();
			case _0Package.CASE_TYPE__CASE_CATEGORY_TEXT:
				return caseCategoryText != null && !caseCategoryText.isEmpty();
			case _0Package.CASE_TYPE__CASE_GENERAL_CATEGORY_TEXT:
				return caseGeneralCategoryText != null && !caseGeneralCategoryText.isEmpty();
			case _0Package.CASE_TYPE__CASE_YEAR_DATE:
				return caseYearDate != null && !caseYearDate.isEmpty();
			case _0Package.CASE_TYPE__CASE_TRACKING_ID:
				return caseTrackingID != null && !caseTrackingID.isEmpty();
			case _0Package.CASE_TYPE__CASE_SUB_CATEGORY_TEXT:
				return caseSubCategoryText != null && !caseSubCategoryText.isEmpty();
			case _0Package.CASE_TYPE__CASE_DOCKET_ID:
				return caseDocketID != null && !caseDocketID.isEmpty();
			case _0Package.CASE_TYPE__CASE_RESOLUTION_TEXT:
				return caseResolutionText != null && !caseResolutionText.isEmpty();
			case _0Package.CASE_TYPE__CASE_FILING:
				return caseFiling != null && !caseFiling.isEmpty();
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT_GROUP:
				return caseAugmentationPointGroup != null && !caseAugmentationPointGroup.isEmpty();
			case _0Package.CASE_TYPE__CASE_AUGMENTATION_POINT:
				return !getCaseAugmentationPoint().isEmpty();
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
		result.append(" (caseAugmentationPointGroup: ");
		result.append(caseAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //CaseTypeImpl
