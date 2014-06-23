/**
 */
package gov.niem.release.niem.niem.core._3._0;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Military Summary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a service of a person in a military.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryBranchName <em>Military Branch Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryDischargeDate <em>Military Discharge Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryDischargeCategoryGroup <em>Military Discharge Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryDischargeCategory <em>Military Discharge Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryExemptionDescriptionText <em>Military Exemption Description Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryExperienceIndicator <em>Military Experience Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryReleaseDate <em>Military Release Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryReleaseCategoryText <em>Military Release Category Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryServiceActiveIndicator <em>Military Service Active Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryServiceTimeMeasure <em>Military Service Time Measure</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryStatus <em>Military Status</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryCountryGroup <em>Military Country Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitaryCountry <em>Military Country</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitarySummaryAugmentationPointGroup <em>Military Summary Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.MilitarySummaryType#getMilitarySummaryAugmentationPoint <em>Military Summary Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType()
 * @model extendedMetaData="name='MilitarySummaryType' kind='elementOnly'"
 * @generated
 */
public interface MilitarySummaryType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Military Branch Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name of a military branch in which a person served.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Branch Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryBranchName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryBranchName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMilitaryBranchName();

	/**
	 * Returns the value of the '<em><b>Military Discharge Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a person was released from further military obligations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Discharge Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryDischargeDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryDischargeDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getMilitaryDischargeDate();

	/**
	 * Returns the value of the '<em><b>Military Discharge Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of discharge a person received from military service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Discharge Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryDischargeCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MilitaryDischargeCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMilitaryDischargeCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Military Discharge Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of discharge a person received from military service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Discharge Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryDischargeCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MilitaryDischargeCategory' namespace='##targetNamespace' group='MilitaryDischargeCategory:group'"
	 * @generated
	 */
	EList<EObject> getMilitaryDischargeCategory();

	/**
	 * Returns the value of the '<em><b>Military Exemption Description Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of why a person was excused from military service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Exemption Description Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryExemptionDescriptionText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryExemptionDescriptionText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMilitaryExemptionDescriptionText();

	/**
	 * Returns the value of the '<em><b>Military Experience Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person has some form of military experience; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Experience Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryExperienceIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryExperienceIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMilitaryExperienceIndicator();

	/**
	 * Returns the value of the '<em><b>Military Release Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a person was released from active service in a military.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Release Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryReleaseDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryReleaseDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getMilitaryReleaseDate();

	/**
	 * Returns the value of the '<em><b>Military Release Category Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A kind of release a person received from military service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Release Category Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryReleaseCategoryText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryReleaseCategoryText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getMilitaryReleaseCategoryText();

	/**
	 * Returns the value of the '<em><b>Military Service Active Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person is currently serving in the military; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Service Active Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryServiceActiveIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryServiceActiveIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getMilitaryServiceActiveIndicator();

	/**
	 * Returns the value of the '<em><b>Military Service Time Measure</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.MeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A quantity of time a person spent in military service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Service Time Measure</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryServiceTimeMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryServiceTimeMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MeasureType> getMilitaryServiceTimeMeasure();

	/**
	 * Returns the value of the '<em><b>Military Status</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.StatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A status of military service of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Status</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MilitaryStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StatusType> getMilitaryStatus();

	/**
	 * Returns the value of the '<em><b>Military Country Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country in whose military a person served.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Country Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryCountryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MilitaryCountry:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMilitaryCountryGroup();

	/**
	 * Returns the value of the '<em><b>Military Country</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country in whose military a person served.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Country</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitaryCountry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MilitaryCountry' namespace='##targetNamespace' group='MilitaryCountry:group'"
	 * @generated
	 */
	EList<EObject> getMilitaryCountry();

	/**
	 * Returns the value of the '<em><b>Military Summary Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MilitarySummaryType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Summary Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitarySummaryAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MilitarySummaryAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMilitarySummaryAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Military Summary Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for MilitarySummaryType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Military Summary Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getMilitarySummaryType_MilitarySummaryAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MilitarySummaryAugmentationPoint' namespace='##targetNamespace' group='MilitarySummaryAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getMilitarySummaryAugmentationPoint();

} // MilitarySummaryType
