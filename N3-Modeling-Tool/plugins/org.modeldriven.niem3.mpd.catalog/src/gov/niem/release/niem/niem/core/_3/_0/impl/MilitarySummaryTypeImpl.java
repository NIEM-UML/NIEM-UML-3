/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.MeasureType;
import gov.niem.release.niem.niem.core._3._0.MilitarySummaryType;
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
 * An implementation of the model object '<em><b>Military Summary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryBranchName <em>Military Branch Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryDischargeDate <em>Military Discharge Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryDischargeCategoryGroup <em>Military Discharge Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryDischargeCategory <em>Military Discharge Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryExemptionDescriptionText <em>Military Exemption Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryExperienceIndicator <em>Military Experience Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryReleaseDate <em>Military Release Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryReleaseCategoryText <em>Military Release Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryServiceActiveIndicator <em>Military Service Active Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryServiceTimeMeasure <em>Military Service Time Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryStatus <em>Military Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryCountryGroup <em>Military Country Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitaryCountry <em>Military Country</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitarySummaryAugmentationPointGroup <em>Military Summary Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.MilitarySummaryTypeImpl#getMilitarySummaryAugmentationPoint <em>Military Summary Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MilitarySummaryTypeImpl extends ObjectTypeImpl implements MilitarySummaryType {
	/**
	 * The cached value of the '{@link #getMilitaryBranchName() <em>Military Branch Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryBranchName()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> militaryBranchName;

	/**
	 * The cached value of the '{@link #getMilitaryDischargeDate() <em>Military Discharge Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryDischargeDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> militaryDischargeDate;

	/**
	 * The cached value of the '{@link #getMilitaryDischargeCategoryGroup() <em>Military Discharge Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryDischargeCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap militaryDischargeCategoryGroup;

	/**
	 * The cached value of the '{@link #getMilitaryExemptionDescriptionText() <em>Military Exemption Description Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryExemptionDescriptionText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> militaryExemptionDescriptionText;

	/**
	 * The cached value of the '{@link #getMilitaryExperienceIndicator() <em>Military Experience Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryExperienceIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> militaryExperienceIndicator;

	/**
	 * The cached value of the '{@link #getMilitaryReleaseDate() <em>Military Release Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> militaryReleaseDate;

	/**
	 * The cached value of the '{@link #getMilitaryReleaseCategoryText() <em>Military Release Category Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryReleaseCategoryText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> militaryReleaseCategoryText;

	/**
	 * The cached value of the '{@link #getMilitaryServiceActiveIndicator() <em>Military Service Active Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryServiceActiveIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> militaryServiceActiveIndicator;

	/**
	 * The cached value of the '{@link #getMilitaryServiceTimeMeasure() <em>Military Service Time Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryServiceTimeMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureType> militaryServiceTimeMeasure;

	/**
	 * The cached value of the '{@link #getMilitaryStatus() <em>Military Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<StatusType> militaryStatus;

	/**
	 * The cached value of the '{@link #getMilitaryCountryGroup() <em>Military Country Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitaryCountryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap militaryCountryGroup;

	/**
	 * The cached value of the '{@link #getMilitarySummaryAugmentationPointGroup() <em>Military Summary Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilitarySummaryAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap militarySummaryAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilitarySummaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getMilitarySummaryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMilitaryBranchName() {
		if (militaryBranchName == null) {
			militaryBranchName = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_BRANCH_NAME);
		}
		return militaryBranchName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getMilitaryDischargeDate() {
		if (militaryDischargeDate == null) {
			militaryDischargeDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_DATE);
		}
		return militaryDischargeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMilitaryDischargeCategoryGroup() {
		if (militaryDischargeCategoryGroup == null) {
			militaryDischargeCategoryGroup = new BasicFeatureMap(this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY_GROUP);
		}
		return militaryDischargeCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMilitaryDischargeCategory() {
		return getMilitaryDischargeCategoryGroup().list(_0Package.eINSTANCE.getMilitarySummaryType_MilitaryDischargeCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMilitaryExemptionDescriptionText() {
		if (militaryExemptionDescriptionText == null) {
			militaryExemptionDescriptionText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXEMPTION_DESCRIPTION_TEXT);
		}
		return militaryExemptionDescriptionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMilitaryExperienceIndicator() {
		if (militaryExperienceIndicator == null) {
			militaryExperienceIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXPERIENCE_INDICATOR);
		}
		return militaryExperienceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getMilitaryReleaseDate() {
		if (militaryReleaseDate == null) {
			militaryReleaseDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_DATE);
		}
		return militaryReleaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getMilitaryReleaseCategoryText() {
		if (militaryReleaseCategoryText == null) {
			militaryReleaseCategoryText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_CATEGORY_TEXT);
		}
		return militaryReleaseCategoryText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMilitaryServiceActiveIndicator() {
		if (militaryServiceActiveIndicator == null) {
			militaryServiceActiveIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_ACTIVE_INDICATOR);
		}
		return militaryServiceActiveIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureType> getMilitaryServiceTimeMeasure() {
		if (militaryServiceTimeMeasure == null) {
			militaryServiceTimeMeasure = new EObjectContainmentEList<MeasureType>(MeasureType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_TIME_MEASURE);
		}
		return militaryServiceTimeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatusType> getMilitaryStatus() {
		if (militaryStatus == null) {
			militaryStatus = new EObjectContainmentEList<StatusType>(StatusType.class, this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_STATUS);
		}
		return militaryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMilitaryCountryGroup() {
		if (militaryCountryGroup == null) {
			militaryCountryGroup = new BasicFeatureMap(this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY_GROUP);
		}
		return militaryCountryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMilitaryCountry() {
		return getMilitaryCountryGroup().list(_0Package.eINSTANCE.getMilitarySummaryType_MilitaryCountry());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMilitarySummaryAugmentationPointGroup() {
		if (militarySummaryAugmentationPointGroup == null) {
			militarySummaryAugmentationPointGroup = new BasicFeatureMap(this, _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT_GROUP);
		}
		return militarySummaryAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMilitarySummaryAugmentationPoint() {
		return getMilitarySummaryAugmentationPointGroup().list(_0Package.eINSTANCE.getMilitarySummaryType_MilitarySummaryAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_BRANCH_NAME:
				return ((InternalEList<?>)getMilitaryBranchName()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_DATE:
				return ((InternalEList<?>)getMilitaryDischargeDate()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY_GROUP:
				return ((InternalEList<?>)getMilitaryDischargeCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY:
				return ((InternalEList<?>)getMilitaryDischargeCategory()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXEMPTION_DESCRIPTION_TEXT:
				return ((InternalEList<?>)getMilitaryExemptionDescriptionText()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXPERIENCE_INDICATOR:
				return ((InternalEList<?>)getMilitaryExperienceIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_DATE:
				return ((InternalEList<?>)getMilitaryReleaseDate()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_CATEGORY_TEXT:
				return ((InternalEList<?>)getMilitaryReleaseCategoryText()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_ACTIVE_INDICATOR:
				return ((InternalEList<?>)getMilitaryServiceActiveIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_TIME_MEASURE:
				return ((InternalEList<?>)getMilitaryServiceTimeMeasure()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_STATUS:
				return ((InternalEList<?>)getMilitaryStatus()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY_GROUP:
				return ((InternalEList<?>)getMilitaryCountryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY:
				return ((InternalEList<?>)getMilitaryCountry()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getMilitarySummaryAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT:
				return ((InternalEList<?>)getMilitarySummaryAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_BRANCH_NAME:
				return getMilitaryBranchName();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_DATE:
				return getMilitaryDischargeDate();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY_GROUP:
				if (coreType) return getMilitaryDischargeCategoryGroup();
				return ((FeatureMap.Internal)getMilitaryDischargeCategoryGroup()).getWrapper();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY:
				return getMilitaryDischargeCategory();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXEMPTION_DESCRIPTION_TEXT:
				return getMilitaryExemptionDescriptionText();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXPERIENCE_INDICATOR:
				return getMilitaryExperienceIndicator();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_DATE:
				return getMilitaryReleaseDate();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_CATEGORY_TEXT:
				return getMilitaryReleaseCategoryText();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_ACTIVE_INDICATOR:
				return getMilitaryServiceActiveIndicator();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_TIME_MEASURE:
				return getMilitaryServiceTimeMeasure();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_STATUS:
				return getMilitaryStatus();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY_GROUP:
				if (coreType) return getMilitaryCountryGroup();
				return ((FeatureMap.Internal)getMilitaryCountryGroup()).getWrapper();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY:
				return getMilitaryCountry();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT_GROUP:
				if (coreType) return getMilitarySummaryAugmentationPointGroup();
				return ((FeatureMap.Internal)getMilitarySummaryAugmentationPointGroup()).getWrapper();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT:
				return getMilitarySummaryAugmentationPoint();
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
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_BRANCH_NAME:
				getMilitaryBranchName().clear();
				getMilitaryBranchName().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_DATE:
				getMilitaryDischargeDate().clear();
				getMilitaryDischargeDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY_GROUP:
				((FeatureMap.Internal)getMilitaryDischargeCategoryGroup()).set(newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXEMPTION_DESCRIPTION_TEXT:
				getMilitaryExemptionDescriptionText().clear();
				getMilitaryExemptionDescriptionText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXPERIENCE_INDICATOR:
				getMilitaryExperienceIndicator().clear();
				getMilitaryExperienceIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_DATE:
				getMilitaryReleaseDate().clear();
				getMilitaryReleaseDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_CATEGORY_TEXT:
				getMilitaryReleaseCategoryText().clear();
				getMilitaryReleaseCategoryText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_ACTIVE_INDICATOR:
				getMilitaryServiceActiveIndicator().clear();
				getMilitaryServiceActiveIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_TIME_MEASURE:
				getMilitaryServiceTimeMeasure().clear();
				getMilitaryServiceTimeMeasure().addAll((Collection<? extends MeasureType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_STATUS:
				getMilitaryStatus().clear();
				getMilitaryStatus().addAll((Collection<? extends StatusType>)newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY_GROUP:
				((FeatureMap.Internal)getMilitaryCountryGroup()).set(newValue);
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getMilitarySummaryAugmentationPointGroup()).set(newValue);
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
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_BRANCH_NAME:
				getMilitaryBranchName().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_DATE:
				getMilitaryDischargeDate().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY_GROUP:
				getMilitaryDischargeCategoryGroup().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXEMPTION_DESCRIPTION_TEXT:
				getMilitaryExemptionDescriptionText().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXPERIENCE_INDICATOR:
				getMilitaryExperienceIndicator().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_DATE:
				getMilitaryReleaseDate().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_CATEGORY_TEXT:
				getMilitaryReleaseCategoryText().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_ACTIVE_INDICATOR:
				getMilitaryServiceActiveIndicator().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_TIME_MEASURE:
				getMilitaryServiceTimeMeasure().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_STATUS:
				getMilitaryStatus().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY_GROUP:
				getMilitaryCountryGroup().clear();
				return;
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT_GROUP:
				getMilitarySummaryAugmentationPointGroup().clear();
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
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_BRANCH_NAME:
				return militaryBranchName != null && !militaryBranchName.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_DATE:
				return militaryDischargeDate != null && !militaryDischargeDate.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY_GROUP:
				return militaryDischargeCategoryGroup != null && !militaryDischargeCategoryGroup.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_DISCHARGE_CATEGORY:
				return !getMilitaryDischargeCategory().isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXEMPTION_DESCRIPTION_TEXT:
				return militaryExemptionDescriptionText != null && !militaryExemptionDescriptionText.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_EXPERIENCE_INDICATOR:
				return militaryExperienceIndicator != null && !militaryExperienceIndicator.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_DATE:
				return militaryReleaseDate != null && !militaryReleaseDate.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_RELEASE_CATEGORY_TEXT:
				return militaryReleaseCategoryText != null && !militaryReleaseCategoryText.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_ACTIVE_INDICATOR:
				return militaryServiceActiveIndicator != null && !militaryServiceActiveIndicator.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SERVICE_TIME_MEASURE:
				return militaryServiceTimeMeasure != null && !militaryServiceTimeMeasure.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_STATUS:
				return militaryStatus != null && !militaryStatus.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY_GROUP:
				return militaryCountryGroup != null && !militaryCountryGroup.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_COUNTRY:
				return !getMilitaryCountry().isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT_GROUP:
				return militarySummaryAugmentationPointGroup != null && !militarySummaryAugmentationPointGroup.isEmpty();
			case _0Package.MILITARY_SUMMARY_TYPE__MILITARY_SUMMARY_AUGMENTATION_POINT:
				return !getMilitarySummaryAugmentationPoint().isEmpty();
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
		result.append(" (militaryDischargeCategoryGroup: ");
		result.append(militaryDischargeCategoryGroup);
		result.append(", militaryCountryGroup: ");
		result.append(militaryCountryGroup);
		result.append(", militarySummaryAugmentationPointGroup: ");
		result.append(militarySummaryAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //MilitarySummaryTypeImpl
