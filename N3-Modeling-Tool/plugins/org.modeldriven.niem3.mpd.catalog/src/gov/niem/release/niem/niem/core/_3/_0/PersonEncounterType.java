/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Encounter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an encounter between a person of interest and a governmental element, such as an organization, official or surveillance system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonArmedIndicator <em>Person Armed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonAssaultedOfficerIndicator <em>Person Assaulted Officer Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonPossessCreditCardIndicator <em>Person Possess Credit Card Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonFraudulentIdentificationIndicator <em>Person Fraudulent Identification Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonJuvenileClaimedIndicator <em>Person Juvenile Claimed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonJuvenileVerifiedIndicator <em>Person Juvenile Verified Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getEncounterClassification <em>Encounter Classification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getEncounterCommentText <em>Encounter Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getFingerprintTakenIndicator <em>Fingerprint Taken Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonEncounterLocation <em>Person Encounter Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonEncounterAugmentationPointGroup <em>Person Encounter Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonEncounterType#getPersonEncounterAugmentationPoint <em>Person Encounter Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType()
 * @model extendedMetaData="name='PersonEncounterType' kind='elementOnly'"
 * @generated
 */
public interface PersonEncounterType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Person Armed Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person of interest was armed at the time of encounter; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Armed Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonArmedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonArmedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonArmedIndicator();

	/**
	 * Returns the value of the '<em><b>Person Assaulted Officer Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person of interest assaulted an enforcement officer during an encounter; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Assaulted Officer Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonAssaultedOfficerIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonAssaultedOfficerIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonAssaultedOfficerIndicator();

	/**
	 * Returns the value of the '<em><b>Person Possess Credit Card Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a person of interest indicates possession of any credit cards; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Possess Credit Card Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonPossessCreditCardIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonPossessCreditCardIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonPossessCreditCardIndicator();

	/**
	 * Returns the value of the '<em><b>Person Fraudulent Identification Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if any identification document carried by a person of interest is fraudulent; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Fraudulent Identification Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonFraudulentIdentificationIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonFraudulentIdentificationIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonFraudulentIdentificationIndicator();

	/**
	 * Returns the value of the '<em><b>Person Juvenile Claimed Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the person of interest claims to be a juvenile; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Juvenile Claimed Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonJuvenileClaimedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonJuvenileClaimedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonJuvenileClaimedIndicator();

	/**
	 * Returns the value of the '<em><b>Person Juvenile Verified Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the person of interest claim to be a juvenile is confirmed; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Juvenile Verified Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonJuvenileVerifiedIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonJuvenileVerifiedIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonJuvenileVerifiedIndicator();

	/**
	 * Returns the value of the '<em><b>Encounter Classification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EncounterClassificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classification of encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter Classification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_EncounterClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EncounterClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterClassificationType> getEncounterClassification();

	/**
	 * Returns the value of the '<em><b>Encounter Comment Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comment related to the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter Comment Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_EncounterCommentText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EncounterCommentText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getEncounterCommentText();

	/**
	 * Returns the value of the '<em><b>Fingerprint Taken Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a fingerprint biometric was taken; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fingerprint Taken Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_FingerprintTakenIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FingerprintTakenIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getFingerprintTakenIndicator();

	/**
	 * Returns the value of the '<em><b>Person Encounter Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location of a person encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Encounter Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonEncounterLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonEncounterLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getPersonEncounterLocation();

	/**
	 * Returns the value of the '<em><b>Person Encounter Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonEncounterType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Encounter Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonEncounterAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonEncounterAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonEncounterAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Encounter Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonEncounterType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Encounter Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonEncounterType_PersonEncounterAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonEncounterAugmentationPoint' namespace='##targetNamespace' group='PersonEncounterAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonEncounterAugmentationPoint();

} // PersonEncounterType
