/**
 */
package gov.niem.release.niem.niem.core._3._0.impl;

import gov.niem.release.niem.niem.core._3._0.DateType;
import gov.niem.release.niem.niem.core._3._0.IdentificationType;
import gov.niem.release.niem.niem.core._3._0.ImageType;
import gov.niem.release.niem.niem.core._3._0.LocationType;
import gov.niem.release.niem.niem.core._3._0.OrganizationType;
import gov.niem.release.niem.niem.core._3._0.PassportType;
import gov.niem.release.niem.niem.core._3._0.PersonNameType;
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
 * An implementation of the model object '<em><b>Passport Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportNumberIdentification <em>Passport Number Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonBirthDate <em>Person Birth Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonBirthLocation <em>Person Birth Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportBookID <em>Passport Book ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportCategoryGroup <em>Passport Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportCategory <em>Passport Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonDigitalImage <em>Person Digital Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonCitizenshipGroup <em>Person Citizenship Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonCitizenship <em>Person Citizenship</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportElectronicIndicator <em>Passport Electronic Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportIssuingOrganization <em>Passport Issuing Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonSexGroup <em>Person Sex Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPersonSex <em>Person Sex</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportStolenLostIndicator <em>Passport Stolen Lost Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportTransmissionTrackingID <em>Passport Transmission Tracking ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportAugmentationPointGroup <em>Passport Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.impl.PassportTypeImpl#getPassportAugmentationPoint <em>Passport Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PassportTypeImpl extends DocumentTypeImpl implements PassportType {
	/**
	 * The cached value of the '{@link #getPassportNumberIdentification() <em>Passport Number Identification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportNumberIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentificationType> passportNumberIdentification;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonNameType> personName;

	/**
	 * The cached value of the '{@link #getPersonBirthDate() <em>Person Birth Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBirthDate()
	 * @generated
	 * @ordered
	 */
	protected EList<DateType> personBirthDate;

	/**
	 * The cached value of the '{@link #getPersonBirthLocation() <em>Person Birth Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonBirthLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationType> personBirthLocation;

	/**
	 * The cached value of the '{@link #getPassportBookID() <em>Passport Book ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportBookID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> passportBookID;

	/**
	 * The cached value of the '{@link #getPassportCategoryGroup() <em>Passport Category Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportCategoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap passportCategoryGroup;

	/**
	 * The cached value of the '{@link #getPersonDigitalImage() <em>Person Digital Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDigitalImage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageType> personDigitalImage;

	/**
	 * The cached value of the '{@link #getPersonCitizenshipGroup() <em>Person Citizenship Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCitizenshipGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personCitizenshipGroup;

	/**
	 * The cached value of the '{@link #getPassportElectronicIndicator() <em>Passport Electronic Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportElectronicIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> passportElectronicIndicator;

	/**
	 * The cached value of the '{@link #getPassportIssuingOrganization() <em>Passport Issuing Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportIssuingOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationType> passportIssuingOrganization;

	/**
	 * The cached value of the '{@link #getPersonSexGroup() <em>Person Sex Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonSexGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap personSexGroup;

	/**
	 * The cached value of the '{@link #getPassportStolenLostIndicator() <em>Passport Stolen Lost Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportStolenLostIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> passportStolenLostIndicator;

	/**
	 * The cached value of the '{@link #getPassportTransmissionTrackingID() <em>Passport Transmission Tracking ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportTransmissionTrackingID()
	 * @generated
	 * @ordered
	 */
	protected EList<gov.niem.release.niem.proxy.xsd._3._0.String> passportTransmissionTrackingID;

	/**
	 * The cached value of the '{@link #getPassportAugmentationPointGroup() <em>Passport Augmentation Point Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassportAugmentationPointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap passportAugmentationPointGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _0Package.eINSTANCE.getPassportType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentificationType> getPassportNumberIdentification() {
		if (passportNumberIdentification == null) {
			passportNumberIdentification = new EObjectContainmentEList<IdentificationType>(IdentificationType.class, this, _0Package.PASSPORT_TYPE__PASSPORT_NUMBER_IDENTIFICATION);
		}
		return passportNumberIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonNameType> getPersonName() {
		if (personName == null) {
			personName = new EObjectContainmentEList<PersonNameType>(PersonNameType.class, this, _0Package.PASSPORT_TYPE__PERSON_NAME);
		}
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateType> getPersonBirthDate() {
		if (personBirthDate == null) {
			personBirthDate = new EObjectContainmentEList<DateType>(DateType.class, this, _0Package.PASSPORT_TYPE__PERSON_BIRTH_DATE);
		}
		return personBirthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationType> getPersonBirthLocation() {
		if (personBirthLocation == null) {
			personBirthLocation = new EObjectContainmentEList<LocationType>(LocationType.class, this, _0Package.PASSPORT_TYPE__PERSON_BIRTH_LOCATION);
		}
		return personBirthLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getPassportBookID() {
		if (passportBookID == null) {
			passportBookID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Integer>(gov.niem.release.niem.proxy.xsd._3._0.Integer.class, this, _0Package.PASSPORT_TYPE__PASSPORT_BOOK_ID);
		}
		return passportBookID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPassportCategoryGroup() {
		if (passportCategoryGroup == null) {
			passportCategoryGroup = new BasicFeatureMap(this, _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY_GROUP);
		}
		return passportCategoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPassportCategory() {
		return getPassportCategoryGroup().list(_0Package.eINSTANCE.getPassportType_PassportCategory());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageType> getPersonDigitalImage() {
		if (personDigitalImage == null) {
			personDigitalImage = new EObjectContainmentEList<ImageType>(ImageType.class, this, _0Package.PASSPORT_TYPE__PERSON_DIGITAL_IMAGE);
		}
		return personDigitalImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonCitizenshipGroup() {
		if (personCitizenshipGroup == null) {
			personCitizenshipGroup = new BasicFeatureMap(this, _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP_GROUP);
		}
		return personCitizenshipGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonCitizenship() {
		return getPersonCitizenshipGroup().list(_0Package.eINSTANCE.getPassportType_PersonCitizenship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPassportElectronicIndicator() {
		if (passportElectronicIndicator == null) {
			passportElectronicIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PASSPORT_TYPE__PASSPORT_ELECTRONIC_INDICATOR);
		}
		return passportElectronicIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationType> getPassportIssuingOrganization() {
		if (passportIssuingOrganization == null) {
			passportIssuingOrganization = new EObjectContainmentEList<OrganizationType>(OrganizationType.class, this, _0Package.PASSPORT_TYPE__PASSPORT_ISSUING_ORGANIZATION);
		}
		return passportIssuingOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPersonSexGroup() {
		if (personSexGroup == null) {
			personSexGroup = new BasicFeatureMap(this, _0Package.PASSPORT_TYPE__PERSON_SEX_GROUP);
		}
		return personSexGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPersonSex() {
		return getPersonSexGroup().list(_0Package.eINSTANCE.getPassportType_PersonSex());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPassportStolenLostIndicator() {
		if (passportStolenLostIndicator == null) {
			passportStolenLostIndicator = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.Boolean>(gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, this, _0Package.PASSPORT_TYPE__PASSPORT_STOLEN_LOST_INDICATOR);
		}
		return passportStolenLostIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gov.niem.release.niem.proxy.xsd._3._0.String> getPassportTransmissionTrackingID() {
		if (passportTransmissionTrackingID == null) {
			passportTransmissionTrackingID = new EObjectContainmentEList<gov.niem.release.niem.proxy.xsd._3._0.String>(gov.niem.release.niem.proxy.xsd._3._0.String.class, this, _0Package.PASSPORT_TYPE__PASSPORT_TRANSMISSION_TRACKING_ID);
		}
		return passportTransmissionTrackingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getPassportAugmentationPointGroup() {
		if (passportAugmentationPointGroup == null) {
			passportAugmentationPointGroup = new BasicFeatureMap(this, _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT_GROUP);
		}
		return passportAugmentationPointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPassportAugmentationPoint() {
		return getPassportAugmentationPointGroup().list(_0Package.eINSTANCE.getPassportType_PassportAugmentationPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _0Package.PASSPORT_TYPE__PASSPORT_NUMBER_IDENTIFICATION:
				return ((InternalEList<?>)getPassportNumberIdentification()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_NAME:
				return ((InternalEList<?>)getPersonName()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_DATE:
				return ((InternalEList<?>)getPersonBirthDate()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_LOCATION:
				return ((InternalEList<?>)getPersonBirthLocation()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_BOOK_ID:
				return ((InternalEList<?>)getPassportBookID()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY_GROUP:
				return ((InternalEList<?>)getPassportCategoryGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY:
				return ((InternalEList<?>)getPassportCategory()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_DIGITAL_IMAGE:
				return ((InternalEList<?>)getPersonDigitalImage()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP_GROUP:
				return ((InternalEList<?>)getPersonCitizenshipGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP:
				return ((InternalEList<?>)getPersonCitizenship()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_ELECTRONIC_INDICATOR:
				return ((InternalEList<?>)getPassportElectronicIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_ISSUING_ORGANIZATION:
				return ((InternalEList<?>)getPassportIssuingOrganization()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_SEX_GROUP:
				return ((InternalEList<?>)getPersonSexGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PERSON_SEX:
				return ((InternalEList<?>)getPersonSex()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_STOLEN_LOST_INDICATOR:
				return ((InternalEList<?>)getPassportStolenLostIndicator()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_TRANSMISSION_TRACKING_ID:
				return ((InternalEList<?>)getPassportTransmissionTrackingID()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT_GROUP:
				return ((InternalEList<?>)getPassportAugmentationPointGroup()).basicRemove(otherEnd, msgs);
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT:
				return ((InternalEList<?>)getPassportAugmentationPoint()).basicRemove(otherEnd, msgs);
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
			case _0Package.PASSPORT_TYPE__PASSPORT_NUMBER_IDENTIFICATION:
				return getPassportNumberIdentification();
			case _0Package.PASSPORT_TYPE__PERSON_NAME:
				return getPersonName();
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_DATE:
				return getPersonBirthDate();
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_LOCATION:
				return getPersonBirthLocation();
			case _0Package.PASSPORT_TYPE__PASSPORT_BOOK_ID:
				return getPassportBookID();
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY_GROUP:
				if (coreType) return getPassportCategoryGroup();
				return ((FeatureMap.Internal)getPassportCategoryGroup()).getWrapper();
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY:
				return getPassportCategory();
			case _0Package.PASSPORT_TYPE__PERSON_DIGITAL_IMAGE:
				return getPersonDigitalImage();
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP_GROUP:
				if (coreType) return getPersonCitizenshipGroup();
				return ((FeatureMap.Internal)getPersonCitizenshipGroup()).getWrapper();
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP:
				return getPersonCitizenship();
			case _0Package.PASSPORT_TYPE__PASSPORT_ELECTRONIC_INDICATOR:
				return getPassportElectronicIndicator();
			case _0Package.PASSPORT_TYPE__PASSPORT_ISSUING_ORGANIZATION:
				return getPassportIssuingOrganization();
			case _0Package.PASSPORT_TYPE__PERSON_SEX_GROUP:
				if (coreType) return getPersonSexGroup();
				return ((FeatureMap.Internal)getPersonSexGroup()).getWrapper();
			case _0Package.PASSPORT_TYPE__PERSON_SEX:
				return getPersonSex();
			case _0Package.PASSPORT_TYPE__PASSPORT_STOLEN_LOST_INDICATOR:
				return getPassportStolenLostIndicator();
			case _0Package.PASSPORT_TYPE__PASSPORT_TRANSMISSION_TRACKING_ID:
				return getPassportTransmissionTrackingID();
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT_GROUP:
				if (coreType) return getPassportAugmentationPointGroup();
				return ((FeatureMap.Internal)getPassportAugmentationPointGroup()).getWrapper();
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT:
				return getPassportAugmentationPoint();
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
			case _0Package.PASSPORT_TYPE__PASSPORT_NUMBER_IDENTIFICATION:
				getPassportNumberIdentification().clear();
				getPassportNumberIdentification().addAll((Collection<? extends IdentificationType>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PERSON_NAME:
				getPersonName().clear();
				getPersonName().addAll((Collection<? extends PersonNameType>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_DATE:
				getPersonBirthDate().clear();
				getPersonBirthDate().addAll((Collection<? extends DateType>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_LOCATION:
				getPersonBirthLocation().clear();
				getPersonBirthLocation().addAll((Collection<? extends LocationType>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_BOOK_ID:
				getPassportBookID().clear();
				getPassportBookID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Integer>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY_GROUP:
				((FeatureMap.Internal)getPassportCategoryGroup()).set(newValue);
				return;
			case _0Package.PASSPORT_TYPE__PERSON_DIGITAL_IMAGE:
				getPersonDigitalImage().clear();
				getPersonDigitalImage().addAll((Collection<? extends ImageType>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP_GROUP:
				((FeatureMap.Internal)getPersonCitizenshipGroup()).set(newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_ELECTRONIC_INDICATOR:
				getPassportElectronicIndicator().clear();
				getPassportElectronicIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_ISSUING_ORGANIZATION:
				getPassportIssuingOrganization().clear();
				getPassportIssuingOrganization().addAll((Collection<? extends OrganizationType>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PERSON_SEX_GROUP:
				((FeatureMap.Internal)getPersonSexGroup()).set(newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_STOLEN_LOST_INDICATOR:
				getPassportStolenLostIndicator().clear();
				getPassportStolenLostIndicator().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.Boolean>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_TRANSMISSION_TRACKING_ID:
				getPassportTransmissionTrackingID().clear();
				getPassportTransmissionTrackingID().addAll((Collection<? extends gov.niem.release.niem.proxy.xsd._3._0.String>)newValue);
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT_GROUP:
				((FeatureMap.Internal)getPassportAugmentationPointGroup()).set(newValue);
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
			case _0Package.PASSPORT_TYPE__PASSPORT_NUMBER_IDENTIFICATION:
				getPassportNumberIdentification().clear();
				return;
			case _0Package.PASSPORT_TYPE__PERSON_NAME:
				getPersonName().clear();
				return;
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_DATE:
				getPersonBirthDate().clear();
				return;
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_LOCATION:
				getPersonBirthLocation().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_BOOK_ID:
				getPassportBookID().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY_GROUP:
				getPassportCategoryGroup().clear();
				return;
			case _0Package.PASSPORT_TYPE__PERSON_DIGITAL_IMAGE:
				getPersonDigitalImage().clear();
				return;
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP_GROUP:
				getPersonCitizenshipGroup().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_ELECTRONIC_INDICATOR:
				getPassportElectronicIndicator().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_ISSUING_ORGANIZATION:
				getPassportIssuingOrganization().clear();
				return;
			case _0Package.PASSPORT_TYPE__PERSON_SEX_GROUP:
				getPersonSexGroup().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_STOLEN_LOST_INDICATOR:
				getPassportStolenLostIndicator().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_TRANSMISSION_TRACKING_ID:
				getPassportTransmissionTrackingID().clear();
				return;
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT_GROUP:
				getPassportAugmentationPointGroup().clear();
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
			case _0Package.PASSPORT_TYPE__PASSPORT_NUMBER_IDENTIFICATION:
				return passportNumberIdentification != null && !passportNumberIdentification.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_NAME:
				return personName != null && !personName.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_DATE:
				return personBirthDate != null && !personBirthDate.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_BIRTH_LOCATION:
				return personBirthLocation != null && !personBirthLocation.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_BOOK_ID:
				return passportBookID != null && !passportBookID.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY_GROUP:
				return passportCategoryGroup != null && !passportCategoryGroup.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_CATEGORY:
				return !getPassportCategory().isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_DIGITAL_IMAGE:
				return personDigitalImage != null && !personDigitalImage.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP_GROUP:
				return personCitizenshipGroup != null && !personCitizenshipGroup.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_CITIZENSHIP:
				return !getPersonCitizenship().isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_ELECTRONIC_INDICATOR:
				return passportElectronicIndicator != null && !passportElectronicIndicator.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_ISSUING_ORGANIZATION:
				return passportIssuingOrganization != null && !passportIssuingOrganization.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_SEX_GROUP:
				return personSexGroup != null && !personSexGroup.isEmpty();
			case _0Package.PASSPORT_TYPE__PERSON_SEX:
				return !getPersonSex().isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_STOLEN_LOST_INDICATOR:
				return passportStolenLostIndicator != null && !passportStolenLostIndicator.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_TRANSMISSION_TRACKING_ID:
				return passportTransmissionTrackingID != null && !passportTransmissionTrackingID.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT_GROUP:
				return passportAugmentationPointGroup != null && !passportAugmentationPointGroup.isEmpty();
			case _0Package.PASSPORT_TYPE__PASSPORT_AUGMENTATION_POINT:
				return !getPassportAugmentationPoint().isEmpty();
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
		result.append(" (passportCategoryGroup: ");
		result.append(passportCategoryGroup);
		result.append(", personCitizenshipGroup: ");
		result.append(personCitizenshipGroup);
		result.append(", personSexGroup: ");
		result.append(personSexGroup);
		result.append(", passportAugmentationPointGroup: ");
		result.append(passportAugmentationPointGroup);
		result.append(')');
		return result.toString();
	}

} //PassportTypeImpl
