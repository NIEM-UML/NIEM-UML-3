/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.EncounterClassificationType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.PersonEncounterType;
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
 * An implementation of the model object '<em><b>Person Encounter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonArmedIndicator <em>Person Armed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonAssaultedOfficerIndicator <em>Person Assaulted Officer Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonPossessCreditCardIndicator <em>Person Possess Credit Card Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonFraudulentIdentificationIndicator <em>Person Fraudulent Identification Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonJuvenileClaimedIndicator <em>Person Juvenile Claimed Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonJuvenileVerifiedIndicator <em>Person Juvenile Verified Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getEncounterClassification <em>Encounter Classification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getEncounterCommentText <em>Encounter Comment Text</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getFingerprintTakenIndicator <em>Fingerprint Taken Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonEncounterLocation <em>Person Encounter Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonEncounterAugmentationPointGroup <em>Person Encounter Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PersonEncounterTypeImpl#getPersonEncounterAugmentationPoint <em>Person Encounter Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonEncounterTypeImpl extends ActivityTypeImpl implements PersonEncounterType {
	/**
	 * The cached value of the '{@link #getPersonArmedIndicator() <em>Person Armed Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonArmedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personArmedIndicator;

	/**
	 * The cached value of the '{@link #getPersonAssaultedOfficerIndicator() <em>Person Assaulted Officer Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAssaultedOfficerIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personAssaultedOfficerIndicator;

	/**
	 * The cached value of the '{@link #getPersonPossessCreditCardIndicator() <em>Person Possess Credit Card Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonPossessCreditCardIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personPossessCreditCardIndicator;

	/**
	 * The cached value of the '{@link #getPersonFraudulentIdentificationIndicator() <em>Person Fraudulent Identification Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonFraudulentIdentificationIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personFraudulentIdentificationIndicator;

	/**
	 * The cached value of the '{@link #getPersonJuvenileClaimedIndicator() <em>Person Juvenile Claimed Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonJuvenileClaimedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personJuvenileClaimedIndicator;

	/**
	 * The cached value of the '{@link #getPersonJuvenileVerifiedIndicator() <em>Person Juvenile Verified Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonJuvenileVerifiedIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> personJuvenileVerifiedIndicator;

	/**
	 * The cached value of the '{@link #getEncounterClassification() <em>Encounter Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<EncounterClassificationType> encounterClassification;

	/**
	 * The cached value of the '{@link #getEncounterCommentText() <em>Encounter Comment Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounterCommentText()
	 * @generated
	 * @ordered
	 */
	protected EList<TextType> encounterCommentText;

	/**
	 * The cached value of the '{@link #getFingerprintTakenIndicator() <em>Fingerprint Taken Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFingerprintTakenIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> fingerprintTakenIndicator;

	/**
	 * The cached value of the '{@link #getPersonEncounterLocation() <em>Person Encounter Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEncounterLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> personEncounterLocation;

	/**
	 * The cached value of the '{@link #getPersonEncounterAugmentationPointGroup() <em>Person Encounter Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonEncounterAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personEncounterAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonEncounterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPersonEncounterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonArmedIndicator() {
		if (personArmedIndicator == null) {
			personArmedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ARMED_INDICATOR);
		}
		return personArmedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonAssaultedOfficerIndicator() {
		if (personAssaultedOfficerIndicator == null) {
			personAssaultedOfficerIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ASSAULTED_OFFICER_INDICATOR);
		}
		return personAssaultedOfficerIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonPossessCreditCardIndicator() {
		if (personPossessCreditCardIndicator == null) {
			personPossessCreditCardIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_POSSESS_CREDIT_CARD_INDICATOR);
		}
		return personPossessCreditCardIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonFraudulentIdentificationIndicator() {
		if (personFraudulentIdentificationIndicator == null) {
			personFraudulentIdentificationIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_FRAUDULENT_IDENTIFICATION_INDICATOR);
		}
		return personFraudulentIdentificationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonJuvenileClaimedIndicator() {
		if (personJuvenileClaimedIndicator == null) {
			personJuvenileClaimedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_CLAIMED_INDICATOR);
		}
		return personJuvenileClaimedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPersonJuvenileVerifiedIndicator() {
		if (personJuvenileVerifiedIndicator == null) {
			personJuvenileVerifiedIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_VERIFIED_INDICATOR);
		}
		return personJuvenileVerifiedIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EncounterClassificationType> getEncounterClassification() {
		if (encounterClassification == null) {
			encounterClassification = new EObjectContainmentEList<EncounterClassificationType>(EncounterClassificationType.class, this, _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_CLASSIFICATION);
		}
		return encounterClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextType> getEncounterCommentText() {
		if (encounterCommentText == null) {
			encounterCommentText = new EObjectContainmentEList<TextType>(TextType.class, this, _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_COMMENT_TEXT);
		}
		return encounterCommentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getFingerprintTakenIndicator() {
		if (fingerprintTakenIndicator == null) {
			fingerprintTakenIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PERSON_ENCOUNTER_TYPE__FINGERPRINT_TAKEN_INDICATOR);
		}
		return fingerprintTakenIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getPersonEncounterLocation() {
		if (personEncounterLocation == null) {
			personEncounterLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_LOCATION);
		}
		return personEncounterLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonEncounterAugmentationPointGroup() {
		if (personEncounterAugmentationPointGroup == null) {
			personEncounterAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT_GROUP);
		}
		return personEncounterAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonEncounterAugmentationPoint() {
		return getPersonEncounterAugmentationPointGroup().list(_0Package.eINSTANCE.getPersonEncounterType_PersonEncounterAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ARMED_INDICATOR:
				return ((InternalEList<?>)getPersonArmedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ASSAULTED_OFFICER_INDICATOR:
				return ((InternalEList<?>)getPersonAssaultedOfficerIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_POSSESS_CREDIT_CARD_INDICATOR:
				return ((InternalEList<?>)getPersonPossessCreditCardIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_FRAUDULENT_IDENTIFICATION_INDICATOR:
				return ((InternalEList<?>)getPersonFraudulentIdentificationIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_CLAIMED_INDICATOR:
				return ((InternalEList<?>)getPersonJuvenileClaimedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_VERIFIED_INDICATOR:
				return ((InternalEList<?>)getPersonJuvenileVerifiedIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_CLASSIFICATION:
				return ((InternalEList<?>)getEncounterClassification()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_COMMENT_TEXT:
				return ((InternalEList<?>)getEncounterCommentText()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__FINGERPRINT_TAKEN_INDICATOR:
				return ((InternalEList<?>)getFingerprintTakenIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_LOCATION:
				return ((InternalEList<?>)getPersonEncounterLocation()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPersonEncounterAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPersonEncounterAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ARMED_INDICATOR:
				return getPersonArmedIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ASSAULTED_OFFICER_INDICATOR:
				return getPersonAssaultedOfficerIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_POSSESS_CREDIT_CARD_INDICATOR:
				return getPersonPossessCreditCardIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_FRAUDULENT_IDENTIFICATION_INDICATOR:
				return getPersonFraudulentIdentificationIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_CLAIMED_INDICATOR:
				return getPersonJuvenileClaimedIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_VERIFIED_INDICATOR:
				return getPersonJuvenileVerifiedIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_CLASSIFICATION:
				return getEncounterClassification();
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_COMMENT_TEXT:
				return getEncounterCommentText();
			case _0Package.PERSON_ENCOUNTER_TYPE__FINGERPRINT_TAKEN_INDICATOR:
				return getFingerprintTakenIndicator();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_LOCATION:
				return getPersonEncounterLocation();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPersonEncounterAugmentationPointGroup();
				return ((FeatureMap.Internal)getPersonEncounterAugmentationPointGroup()).getWrapper();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT:
				return getPersonEncounterAugmentationPoint();
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
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ARMED_INDICATOR:
				getPersonArmedIndicator().clear();
				getPersonArmedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ASSAULTED_OFFICER_INDICATOR:
				getPersonAssaultedOfficerIndicator().clear();
				getPersonAssaultedOfficerIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_POSSESS_CREDIT_CARD_INDICATOR:
				getPersonPossessCreditCardIndicator().clear();
				getPersonPossessCreditCardIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_FRAUDULENT_IDENTIFICATION_INDICATOR:
				getPersonFraudulentIdentificationIndicator().clear();
				getPersonFraudulentIdentificationIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_CLAIMED_INDICATOR:
				getPersonJuvenileClaimedIndicator().clear();
				getPersonJuvenileClaimedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_VERIFIED_INDICATOR:
				getPersonJuvenileVerifiedIndicator().clear();
				getPersonJuvenileVerifiedIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_CLASSIFICATION:
				getEncounterClassification().clear();
				getEncounterClassification().addAll((Collection<? extends EncounterClassificationType>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_COMMENT_TEXT:
				getEncounterCommentText().clear();
				getEncounterCommentText().addAll((Collection<? extends TextType>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__FINGERPRINT_TAKEN_INDICATOR:
				getFingerprintTakenIndicator().clear();
				getFingerprintTakenIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_LOCATION:
				getPersonEncounterLocation().clear();
				getPersonEncounterLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPersonEncounterAugmentationPointGroup()).set(newValue);
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
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ARMED_INDICATOR:
				getPersonArmedIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ASSAULTED_OFFICER_INDICATOR:
				getPersonAssaultedOfficerIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_POSSESS_CREDIT_CARD_INDICATOR:
				getPersonPossessCreditCardIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_FRAUDULENT_IDENTIFICATION_INDICATOR:
				getPersonFraudulentIdentificationIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_CLAIMED_INDICATOR:
				getPersonJuvenileClaimedIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_VERIFIED_INDICATOR:
				getPersonJuvenileVerifiedIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_CLASSIFICATION:
				getEncounterClassification().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_COMMENT_TEXT:
				getEncounterCommentText().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__FINGERPRINT_TAKEN_INDICATOR:
				getFingerprintTakenIndicator().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_LOCATION:
				getPersonEncounterLocation().clear();
				return;
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT_GROUP:
				getPersonEncounterAugmentationPointGroup().clear();
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
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ARMED_INDICATOR:
				return personArmedIndicator != null && !personArmedIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ASSAULTED_OFFICER_INDICATOR:
				return personAssaultedOfficerIndicator != null && !personAssaultedOfficerIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_POSSESS_CREDIT_CARD_INDICATOR:
				return personPossessCreditCardIndicator != null && !personPossessCreditCardIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_FRAUDULENT_IDENTIFICATION_INDICATOR:
				return personFraudulentIdentificationIndicator != null && !personFraudulentIdentificationIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_CLAIMED_INDICATOR:
				return personJuvenileClaimedIndicator != null && !personJuvenileClaimedIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_JUVENILE_VERIFIED_INDICATOR:
				return personJuvenileVerifiedIndicator != null && !personJuvenileVerifiedIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_CLASSIFICATION:
				return encounterClassification != null && !encounterClassification.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__ENCOUNTER_COMMENT_TEXT:
				return encounterCommentText != null && !encounterCommentText.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__FINGERPRINT_TAKEN_INDICATOR:
				return fingerprintTakenIndicator != null && !fingerprintTakenIndicator.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_LOCATION:
				return personEncounterLocation != null && !personEncounterLocation.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT_GROUP:
				return personEncounterAugmentationPointGroup != null && !personEncounterAugmentationPointGroup.isEmpty();
			case _0Package.PERSON_ENCOUNTER_TYPE__PERSON_ENCOUNTER_AUGMENTATION_POINT:
				return !getPersonEncounterAugmentationPoint().isEmpty();
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
		result.append(" (personEncounterAugmentationPointGroup: ");
		result.append(personEncounterAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PersonEncounterTypeImpl
