/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.ActivityType;
import gov.niem.release.niem.niem.core._3._0.DocumentType;
import gov.niem.release.niem.niem.core._3._0.IncidentType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationType;
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
 * An implementation of the model object '<em><b>Incident Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentLocation <em>Incident Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentEvent <em>Incident Event</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentJurisdictionalOrganization <em>Incident Jurisdictional Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentObservationText <em>Incident Observation Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentReportedNarrative <em>Incident Reported Narrative</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentDayPeriodText <em>Incident Day Period Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentAugmentationPointGroup <em>Incident Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.IncidentTypeImpl#getIncidentAugmentationPoint <em>Incident Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncidentTypeImpl extends ActivityTypeImpl implements IncidentType {
	/**
	 * The cached value of the '{@link #getIncidentLocation() <em>Incident Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> incidentLocation;

	/**
	 * The cached value of the '{@link #getIncidentEvent() <em>Incident Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityType> incidentEvent;

	/**
	 * The cached value of the '{@link #getIncidentJurisdictionalOrganization() <em>Incident Jurisdictional Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentJurisdictionalOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> incidentJurisdictionalOrganization;

	/**
	 * The cached value of the '{@link #getIncidentObservationText() <em>Incident Observation Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentObservationText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> incidentObservationText;

	/**
	 * The cached value of the '{@link #getIncidentReportedNarrative() <em>Incident Reported Narrative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentReportedNarrative()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> incidentReportedNarrative;

	/**
	 * The cached value of the '{@link #getIncidentDayPeriodText() <em>Incident Day Period Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentDayPeriodText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> incidentDayPeriodText;

	/**
	 * The cached value of the '{@link #getIncidentAugmentationPointGroup() <em>Incident Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap incidentAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncidentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getIncidentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getIncidentLocation() {
		if (incidentLocation == null) {
			incidentLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.INCIDENT_TYPE__INCIDENT_LOCATION);
		}
		return incidentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityType> getIncidentEvent() {
		if (incidentEvent == null) {
			incidentEvent = new EObjectContainmentEList<ActivityType>(ActivityType.class, this, _0Package.INCIDENT_TYPE__INCIDENT_EVENT);
		}
		return incidentEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getIncidentJurisdictionalOrganization() {
		if (incidentJurisdictionalOrganization == null) {
			incidentJurisdictionalOrganization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.INCIDENT_TYPE__INCIDENT_JURISDICTIONAL_ORGANIZATION);
		}
		return incidentJurisdictionalOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIncidentObservationText() {
		if (incidentObservationText == null) {
			incidentObservationText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INCIDENT_TYPE__INCIDENT_OBSERVATION_TEXT);
		}
		return incidentObservationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getIncidentReportedNarrative() {
		if (incidentReportedNarrative == null) {
			incidentReportedNarrative = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, _0Package.INCIDENT_TYPE__INCIDENT_REPORTED_NARRATIVE);
		}
		return incidentReportedNarrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getIncidentDayPeriodText() {
		if (incidentDayPeriodText == null) {
			incidentDayPeriodText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.INCIDENT_TYPE__INCIDENT_DAY_PERIOD_TEXT);
		}
		return incidentDayPeriodText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIncidentAugmentationPointGroup() {
		if (incidentAugmentationPointGroup == null) {
			incidentAugmentationPointGroup = new BasicFeatureMap(this, _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT_GROUP);
		}
		return incidentAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getIncidentAugmentationPoint() {
		return getIncidentAugmentationPointGroup().list(_0Package.eINSTANCE.getIncidentType_IncidentAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.INCIDENT_TYPE__INCIDENT_LOCATION:
				return ((InternalEList<?>)getIncidentLocation()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_EVENT:
				return ((InternalEList<?>)getIncidentEvent()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_JURISDICTIONAL_ORGANIZATION:
				return ((InternalEList<?>)getIncidentJurisdictionalOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_OBSERVATION_TEXT:
				return ((InternalEList<?>)getIncidentObservationText()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_REPORTED_NARRATIVE:
				return ((InternalEList<?>)getIncidentReportedNarrative()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_DAY_PERIOD_TEXT:
				return ((InternalEList<?>)getIncidentDayPeriodText()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getIncidentAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getIncidentAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.INCIDENT_TYPE__INCIDENT_LOCATION:
				return getIncidentLocation();
			case _0Package.INCIDENT_TYPE__INCIDENT_EVENT:
				return getIncidentEvent();
			case _0Package.INCIDENT_TYPE__INCIDENT_JURISDICTIONAL_ORGANIZATION:
				return getIncidentJurisdictionalOrganization();
			case _0Package.INCIDENT_TYPE__INCIDENT_OBSERVATION_TEXT:
				return getIncidentObservationText();
			case _0Package.INCIDENT_TYPE__INCIDENT_REPORTED_NARRATIVE:
				return getIncidentReportedNarrative();
			case _0Package.INCIDENT_TYPE__INCIDENT_DAY_PERIOD_TEXT:
				return getIncidentDayPeriodText();
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getIncidentAugmentationPointGroup();
				return ((FeatureMap.Internal)getIncidentAugmentationPointGroup()).getWrapper();
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT:
				return getIncidentAugmentationPoint();
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
			case _0Package.INCIDENT_TYPE__INCIDENT_LOCATION:
				getIncidentLocation().clear();
				getIncidentLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_EVENT:
				getIncidentEvent().clear();
				getIncidentEvent().addAll((Collection<? extends ActivityType>)newValue);
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_JURISDICTIONAL_ORGANIZATION:
				getIncidentJurisdictionalOrganization().clear();
				getIncidentJurisdictionalOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_OBSERVATION_TEXT:
				getIncidentObservationText().clear();
				getIncidentObservationText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_REPORTED_NARRATIVE:
				getIncidentReportedNarrative().clear();
				getIncidentReportedNarrative().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_DAY_PERIOD_TEXT:
				getIncidentDayPeriodText().clear();
				getIncidentDayPeriodText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getIncidentAugmentationPointGroup()).set(newValue);
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
			case _0Package.INCIDENT_TYPE__INCIDENT_LOCATION:
				getIncidentLocation().clear();
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_EVENT:
				getIncidentEvent().clear();
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_JURISDICTIONAL_ORGANIZATION:
				getIncidentJurisdictionalOrganization().clear();
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_OBSERVATION_TEXT:
				getIncidentObservationText().clear();
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_REPORTED_NARRATIVE:
				getIncidentReportedNarrative().clear();
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_DAY_PERIOD_TEXT:
				getIncidentDayPeriodText().clear();
				return;
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT_GROUP:
				getIncidentAugmentationPointGroup().clear();
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
			case _0Package.INCIDENT_TYPE__INCIDENT_LOCATION:
				return incidentLocation != null && !incidentLocation.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_EVENT:
				return incidentEvent != null && !incidentEvent.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_JURISDICTIONAL_ORGANIZATION:
				return incidentJurisdictionalOrganization != null && !incidentJurisdictionalOrganization.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_OBSERVATION_TEXT:
				return incidentObservationText != null && !incidentObservationText.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_REPORTED_NARRATIVE:
				return incidentReportedNarrative != null && !incidentReportedNarrative.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_DAY_PERIOD_TEXT:
				return incidentDayPeriodText != null && !incidentDayPeriodText.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT_GROUP:
				return incidentAugmentationPointGroup != null && !incidentAugmentationPointGroup.isEmpty();
			case _0Package.INCIDENT_TYPE__INCIDENT_AUGMENTATION_POINT:
				return !getIncidentAugmentationPoint().isEmpty();
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
		result.append(" (incidentAugmentationPointGroup: ");
		result.append(incidentAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //IncidentTypeImpl
