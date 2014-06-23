/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a government-issued document that authenticates the identity and citizenship of a person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportNumberIdentification <em>Passport Number Identification</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonBirthDate <em>Person Birth Date</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonBirthLocation <em>Person Birth Location</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportBookID <em>Passport Book ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportCategoryGroup <em>Passport Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportCategory <em>Passport Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonDigitalImage <em>Person Digital Image</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonCitizenshipGroup <em>Person Citizenship Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonCitizenship <em>Person Citizenship</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportElectronicIndicator <em>Passport Electronic Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportIssuingOrganization <em>Passport Issuing Organization</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonSexGroup <em>Person Sex Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPersonSex <em>Person Sex</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportStolenLostIndicator <em>Passport Stolen Lost Indicator</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportTransmissionTrackingID <em>Passport Transmission Tracking ID</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportAugmentationPointGroup <em>Passport Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PassportType#getPassportAugmentationPoint <em>Passport Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType()
 * @model extendedMetaData="name='PassportType' kind='elementOnly'"
 * @generated
 */
public interface PassportType extends DocumentType {
	/**
	 * Returns the value of the '<em><b>Passport Number Identification</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.IdentificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identification of a passport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Number Identification</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportNumberIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PassportNumberIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdentificationType> getPassportNumberIdentification();

	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A combination of names and/or titles by which a person is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Name</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonNameType> getPersonName();

	/**
	 * Returns the value of the '<em><b>Person Birth Date</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date a person was born.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Birth Date</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonBirthDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonBirthDate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateType> getPersonBirthDate();

	/**
	 * Returns the value of the '<em><b>Person Birth Location</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A location where a person was born.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Birth Location</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonBirthLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonBirthLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocationType> getPersonBirthLocation();

	/**
	 * Returns the value of the '<em><b>Passport Book ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique document identifier assigned to a US Passport by the Dept. of State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Book ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportBookID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PassportBookID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Integer> getPassportBookID();

	/**
	 * Returns the value of the '<em><b>Passport Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of passport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PassportCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPassportCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Passport Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of passport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PassportCategory' namespace='##targetNamespace' group='PassportCategory:group'"
	 * @generated
	 */
	EList<EObject> getPassportCategory();

	/**
	 * Returns the value of the '<em><b>Person Digital Image</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.ImageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A photograph or image of a person in a digital format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Digital Image</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonDigitalImage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PersonDigitalImage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getPersonDigitalImage();

	/**
	 * Returns the value of the '<em><b>Person Citizenship Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country that assigns rights, duties, and privileges to a person because of the birth or naturalization of the person in that country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Citizenship Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonCitizenshipGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonCitizenship:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonCitizenshipGroup();

	/**
	 * Returns the value of the '<em><b>Person Citizenship</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a country that assigns rights, duties, and privileges to a person because of the birth or naturalization of the person in that country.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Citizenship</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonCitizenship()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonCitizenship' namespace='##targetNamespace' group='PersonCitizenship:group'"
	 * @generated
	 */
	EList<EObject> getPersonCitizenship();

	/**
	 * Returns the value of the '<em><b>Passport Electronic Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the passport document is RFID enabled; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Electronic Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportElectronicIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PassportElectronicIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPassportElectronicIndicator();

	/**
	 * Returns the value of the '<em><b>Passport Issuing Organization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.OrganizationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that issued a passport.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Issuing Organization</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportIssuingOrganization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PassportIssuingOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OrganizationType> getPassportIssuingOrganization();

	/**
	 * Returns the value of the '<em><b>Person Sex Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a gender or sex of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sex Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonSexGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonSex:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonSexGroup();

	/**
	 * Returns the value of the '<em><b>Person Sex</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a gender or sex of a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Sex</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PersonSex()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonSex' namespace='##targetNamespace' group='PersonSex:group'"
	 * @generated
	 */
	EList<EObject> getPersonSex();

	/**
	 * Returns the value of the '<em><b>Passport Stolen Lost Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if a passport is stolen or lost; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Stolen Lost Indicator</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportStolenLostIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PassportStolenLostIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.Boolean> getPassportStolenLostIndicator();

	/**
	 * Returns the value of the '<em><b>Passport Transmission Tracking ID</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.proxy.xsd._3._0.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier assigned to the electronic record transmitted from Dept. of State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Transmission Tracking ID</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportTransmissionTrackingID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PassportTransmissionTrackingID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<gov.niem.release.niem.proxy.xsd._3._0.String> getPassportTransmissionTrackingID();

	/**
	 * Returns the value of the '<em><b>Passport Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PassportType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PassportAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPassportAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Passport Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PassportType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passport Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPassportType_PassportAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PassportAugmentationPoint' namespace='##targetNamespace' group='PassportAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPassportAugmentationPoint();

} // PassportType
