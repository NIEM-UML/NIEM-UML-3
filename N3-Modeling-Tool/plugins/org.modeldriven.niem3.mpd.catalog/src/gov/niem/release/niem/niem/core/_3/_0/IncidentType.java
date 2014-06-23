/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an occurrence or an event that may require a response.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentLocation <em>Incident Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentEvent <em>Incident Event</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentJurisdictionalOrganization <em>Incident Jurisdictional Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentObservationText <em>Incident Observation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentReportedNarrative <em>Incident Reported Narrative</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentDayPeriodText <em>Incident Day Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentAugmentationPointGroup <em>Incident Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.IncidentType#getIncidentAugmentationPoint <em>Incident Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType()
 * @model extendedMetaData="name='IncidentType' kind='elementOnly'"
 * @generated
 */
public interface IncidentType extends ActivityType {
	/**
	 * Returns the value of the '<em><b>Incident Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where an incident occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncidentLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getIncidentLocation();

	/**
	 * Returns the value of the '<em><b>Incident Event</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action or occurrence associated with an incident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Event</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentEvent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncidentEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActivityType> getIncidentEvent();

	/**
	 * Returns the value of the '<em><b>Incident Jurisdictional Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization or agency who has jurisdiction over an incident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Jurisdictional Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentJurisdictionalOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncidentJurisdictionalOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getIncidentJurisdictionalOrganization();

	/**
	 * Returns the value of the '<em><b>Incident Observation Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A remark about something noticed with regards to an incident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Observation Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentObservationText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncidentObservationText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIncidentObservationText();

	/**
	 * Returns the value of the '<em><b>Incident Reported Narrative</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A document containing an account of the events that transpired in an incident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Reported Narrative</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentReportedNarrative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncidentReportedNarrative' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getIncidentReportedNarrative();

	/**
	 * Returns the value of the '<em><b>Incident Day Period Text</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.TextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A general time of day during which an incident occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Day Period Text</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentDayPeriodText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IncidentDayPeriodText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TextType> getIncidentDayPeriodText();

	/**
	 * Returns the value of the '<em><b>Incident Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IncidentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IncidentAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIncidentAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Incident Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for IncidentType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incident Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getIncidentType_IncidentAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IncidentAugmentationPoint' namespace='##targetNamespace' group='IncidentAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getIncidentAugmentationPoint();

} // IncidentType
