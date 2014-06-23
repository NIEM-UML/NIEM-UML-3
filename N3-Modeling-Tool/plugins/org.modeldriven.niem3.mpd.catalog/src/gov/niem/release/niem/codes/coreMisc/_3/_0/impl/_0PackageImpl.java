/**
 */
package gov.niem.release.niem.codes.coreMisc._3._0.impl;

import gov.niem.release.niem.codes.coreMisc._3._0.ContactInformationAvailabilityCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.ContactInformationAvailabilityCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.DayOfWeekCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.DayOfWeekCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.ImagePoseCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.ImagePoseCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.MilitaryDischargeCategoryCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.MilitaryDischargeCategoryCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.OffenseLevelCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.OffenseLevelCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.PersonNameCategoryCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.PersonNameCategoryCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.PleaCategoryCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.PleaCategoryCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.StatuteCategoryCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.StatuteCategoryCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.SupervisionLevelCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.SupervisionLevelCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.SupervisionRestrictionCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.SupervisionRestrictionCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0.UTMHemisphereCodeSimpleType;
import gov.niem.release.niem.codes.coreMisc._3._0.UTMHemisphereCodeType;
import gov.niem.release.niem.codes.coreMisc._3._0._0Factory;
import gov.niem.release.niem.codes.coreMisc._3._0._0Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3.xml._1998.namespace.NamespacePackage;

import org.w3.xml._1998.namespace.impl.NamespacePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0PackageImpl extends EPackageImpl implements _0Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInformationAvailabilityCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayOfWeekCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagePoseCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass militaryDischargeCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offenseLevelCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personNameCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pleaCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statuteCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supervisionLevelCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supervisionRestrictionCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utmHemisphereCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactInformationAvailabilityCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayOfWeekCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imagePoseCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum militaryDischargeCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum offenseLevelCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum personNameCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pleaCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statuteCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supervisionLevelCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supervisionRestrictionCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum utmHemisphereCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contactInformationAvailabilityCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dayOfWeekCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imagePoseCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType militaryDischargeCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offenseLevelCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType personNameCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pleaCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statuteCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType supervisionLevelCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType supervisionRestrictionCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType utmHemisphereCodeSimpleTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.niem.release.niem.codes.coreMisc._3._0._0Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _0PackageImpl() {
		super(eNS_URI, _0Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _0Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _0Package init() {
		if (isInited) return (_0Package)EPackage.Registry.INSTANCE.getEPackage(_0Package.eNS_URI);

		// Obtain or create and register package
		_0PackageImpl the_0Package = (_0PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _0PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _0PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		gov.niem.release.niem.niem.core._3._0.impl._0PackageImpl the_0Package_1 = (gov.niem.release.niem.niem.core._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.niem.core._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.niem.core._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.niem.core._3._0._0Package.eNS_URI) : gov.niem.release.niem.niem.core._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.structures._3._0.impl._0PackageImpl the_0Package_2 = (gov.niem.release.niem.structures._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.structures._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.structures._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.structures._3._0._0Package.eNS_URI) : gov.niem.release.niem.structures._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.proxy.xsd._3._0.impl._0PackageImpl the_0Package_3 = (gov.niem.release.niem.proxy.xsd._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.proxy.xsd._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.proxy.xsd._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.proxy.xsd._3._0._0Package.eNS_URI) : gov.niem.release.niem.proxy.xsd._3._0._0Package.eINSTANCE);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl the_0Package_4 = (gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eNS_URI) instanceof gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eNS_URI) : gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl the_0Package_5 = (gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl the_0Package_6 = (gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso4217._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso4217._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso4217._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl the_0Package_7 = (gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl the_0Package_8 = (gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl the_0Package_9 = (gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips10._4._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips10._4._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.fips10._4._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl the_0Package_10 = (gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl the_0Package_11 = (gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl the_0Package_12 = (gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso639._3._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso639._3._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso639._3._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl the_0Package_13 = (gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dolSoc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dolSoc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.dolSoc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl the_0Package_14 = (gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.occsFacility._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.occsFacility._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.occsFacility._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl the_0Package_15 = (gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.canadaPost._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.canadaPost._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.canadaPost._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl the_0Package_16 = (gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips5._2._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips5._2._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.fips5._2._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl the_0Package_17 = (gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uspsStates._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uspsStates._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.uspsStates._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl the_0Package_18 = (gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl the_0Package_19 = (gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl the_0Package_20 = (gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl the_0Package_21 = (gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.hl7._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl the_0Package_22 = (gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.x.card._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.x.card._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.x.card._3._0._0Package.eINSTANCE);

		// Load packages
		the_0Package_1.loadPackage();
		the_0Package_9.loadPackage();
		the_0Package_12.loadPackage();
		the_0Package_13.loadPackage();
		the_0Package_14.loadPackage();

		// Create package meta-data objects
		the_0Package.createPackageContents();
		the_0Package_2.createPackageContents();
		the_0Package_3.createPackageContents();
		theNamespacePackage.createPackageContents();
		the_0Package_4.createPackageContents();
		the_0Package_5.createPackageContents();
		the_0Package_6.createPackageContents();
		the_0Package_7.createPackageContents();
		the_0Package_8.createPackageContents();
		the_0Package_10.createPackageContents();
		the_0Package_11.createPackageContents();
		the_0Package_15.createPackageContents();
		the_0Package_16.createPackageContents();
		the_0Package_17.createPackageContents();
		the_0Package_18.createPackageContents();
		the_0Package_19.createPackageContents();
		the_0Package_20.createPackageContents();
		the_0Package_21.createPackageContents();
		the_0Package_22.createPackageContents();

		// Initialize created meta-data
		the_0Package.initializePackageContents();
		the_0Package_2.initializePackageContents();
		the_0Package_3.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		the_0Package_4.initializePackageContents();
		the_0Package_5.initializePackageContents();
		the_0Package_6.initializePackageContents();
		the_0Package_7.initializePackageContents();
		the_0Package_8.initializePackageContents();
		the_0Package_10.initializePackageContents();
		the_0Package_11.initializePackageContents();
		the_0Package_15.initializePackageContents();
		the_0Package_16.initializePackageContents();
		the_0Package_17.initializePackageContents();
		the_0Package_18.initializePackageContents();
		the_0Package_19.initializePackageContents();
		the_0Package_20.initializePackageContents();
		the_0Package_21.initializePackageContents();
		the_0Package_22.initializePackageContents();

		// Fix loaded packages
		the_0Package_1.fixPackageContents();
		the_0Package_9.fixPackageContents();
		the_0Package_12.fixPackageContents();
		the_0Package_13.fixPackageContents();
		the_0Package_14.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		the_0Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_0Package.eNS_URI, the_0Package);
		return the_0Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactInformationAvailabilityCodeType() {
		return contactInformationAvailabilityCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAvailabilityCodeType_Value() {
		return (EAttribute)contactInformationAvailabilityCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAvailabilityCodeType_Id() {
		return (EAttribute)contactInformationAvailabilityCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAvailabilityCodeType_Metadata() {
		return (EAttribute)contactInformationAvailabilityCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAvailabilityCodeType_Ref() {
		return (EAttribute)contactInformationAvailabilityCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAvailabilityCodeType_RelationshipMetadata() {
		return (EAttribute)contactInformationAvailabilityCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformationAvailabilityCodeType_AnyAttribute() {
		return (EAttribute)contactInformationAvailabilityCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayOfWeekCodeType() {
		return dayOfWeekCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekCodeType_Value() {
		return (EAttribute)dayOfWeekCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekCodeType_Id() {
		return (EAttribute)dayOfWeekCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekCodeType_Metadata() {
		return (EAttribute)dayOfWeekCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekCodeType_Ref() {
		return (EAttribute)dayOfWeekCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekCodeType_RelationshipMetadata() {
		return (EAttribute)dayOfWeekCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeekCodeType_AnyAttribute() {
		return (EAttribute)dayOfWeekCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagePoseCodeType() {
		return imagePoseCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePoseCodeType_Value() {
		return (EAttribute)imagePoseCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePoseCodeType_Id() {
		return (EAttribute)imagePoseCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePoseCodeType_Metadata() {
		return (EAttribute)imagePoseCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePoseCodeType_Ref() {
		return (EAttribute)imagePoseCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePoseCodeType_RelationshipMetadata() {
		return (EAttribute)imagePoseCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagePoseCodeType_AnyAttribute() {
		return (EAttribute)imagePoseCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMilitaryDischargeCategoryCodeType() {
		return militaryDischargeCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitaryDischargeCategoryCodeType_Value() {
		return (EAttribute)militaryDischargeCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitaryDischargeCategoryCodeType_Id() {
		return (EAttribute)militaryDischargeCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitaryDischargeCategoryCodeType_Metadata() {
		return (EAttribute)militaryDischargeCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitaryDischargeCategoryCodeType_Ref() {
		return (EAttribute)militaryDischargeCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitaryDischargeCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)militaryDischargeCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMilitaryDischargeCategoryCodeType_AnyAttribute() {
		return (EAttribute)militaryDischargeCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOffenseLevelCodeType() {
		return offenseLevelCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffenseLevelCodeType_Value() {
		return (EAttribute)offenseLevelCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffenseLevelCodeType_Id() {
		return (EAttribute)offenseLevelCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffenseLevelCodeType_Metadata() {
		return (EAttribute)offenseLevelCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffenseLevelCodeType_Ref() {
		return (EAttribute)offenseLevelCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffenseLevelCodeType_RelationshipMetadata() {
		return (EAttribute)offenseLevelCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOffenseLevelCodeType_AnyAttribute() {
		return (EAttribute)offenseLevelCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonNameCategoryCodeType() {
		return personNameCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameCategoryCodeType_Value() {
		return (EAttribute)personNameCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameCategoryCodeType_Id() {
		return (EAttribute)personNameCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameCategoryCodeType_Metadata() {
		return (EAttribute)personNameCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameCategoryCodeType_Ref() {
		return (EAttribute)personNameCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)personNameCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonNameCategoryCodeType_AnyAttribute() {
		return (EAttribute)personNameCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPleaCategoryCodeType() {
		return pleaCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPleaCategoryCodeType_Value() {
		return (EAttribute)pleaCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPleaCategoryCodeType_Id() {
		return (EAttribute)pleaCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPleaCategoryCodeType_Metadata() {
		return (EAttribute)pleaCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPleaCategoryCodeType_Ref() {
		return (EAttribute)pleaCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPleaCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)pleaCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPleaCategoryCodeType_AnyAttribute() {
		return (EAttribute)pleaCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatuteCategoryCodeType() {
		return statuteCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatuteCategoryCodeType_Value() {
		return (EAttribute)statuteCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatuteCategoryCodeType_Id() {
		return (EAttribute)statuteCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatuteCategoryCodeType_Metadata() {
		return (EAttribute)statuteCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatuteCategoryCodeType_Ref() {
		return (EAttribute)statuteCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatuteCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)statuteCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatuteCategoryCodeType_AnyAttribute() {
		return (EAttribute)statuteCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupervisionLevelCodeType() {
		return supervisionLevelCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionLevelCodeType_Value() {
		return (EAttribute)supervisionLevelCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionLevelCodeType_Id() {
		return (EAttribute)supervisionLevelCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionLevelCodeType_Metadata() {
		return (EAttribute)supervisionLevelCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionLevelCodeType_Ref() {
		return (EAttribute)supervisionLevelCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionLevelCodeType_RelationshipMetadata() {
		return (EAttribute)supervisionLevelCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionLevelCodeType_AnyAttribute() {
		return (EAttribute)supervisionLevelCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupervisionRestrictionCodeType() {
		return supervisionRestrictionCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionRestrictionCodeType_Value() {
		return (EAttribute)supervisionRestrictionCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionRestrictionCodeType_Id() {
		return (EAttribute)supervisionRestrictionCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionRestrictionCodeType_Metadata() {
		return (EAttribute)supervisionRestrictionCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionRestrictionCodeType_Ref() {
		return (EAttribute)supervisionRestrictionCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionRestrictionCodeType_RelationshipMetadata() {
		return (EAttribute)supervisionRestrictionCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupervisionRestrictionCodeType_AnyAttribute() {
		return (EAttribute)supervisionRestrictionCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUTMHemisphereCodeType() {
		return utmHemisphereCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMHemisphereCodeType_Value() {
		return (EAttribute)utmHemisphereCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMHemisphereCodeType_Id() {
		return (EAttribute)utmHemisphereCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMHemisphereCodeType_Metadata() {
		return (EAttribute)utmHemisphereCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMHemisphereCodeType_Ref() {
		return (EAttribute)utmHemisphereCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMHemisphereCodeType_RelationshipMetadata() {
		return (EAttribute)utmHemisphereCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUTMHemisphereCodeType_AnyAttribute() {
		return (EAttribute)utmHemisphereCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactInformationAvailabilityCodeSimpleType() {
		return contactInformationAvailabilityCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDayOfWeekCodeSimpleType() {
		return dayOfWeekCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImagePoseCodeSimpleType() {
		return imagePoseCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMilitaryDischargeCategoryCodeSimpleType() {
		return militaryDischargeCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOffenseLevelCodeSimpleType() {
		return offenseLevelCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersonNameCategoryCodeSimpleType() {
		return personNameCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPleaCategoryCodeSimpleType() {
		return pleaCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatuteCategoryCodeSimpleType() {
		return statuteCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupervisionLevelCodeSimpleType() {
		return supervisionLevelCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupervisionRestrictionCodeSimpleType() {
		return supervisionRestrictionCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUTMHemisphereCodeSimpleType() {
		return utmHemisphereCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContactInformationAvailabilityCodeSimpleTypeObject() {
		return contactInformationAvailabilityCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDayOfWeekCodeSimpleTypeObject() {
		return dayOfWeekCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImagePoseCodeSimpleTypeObject() {
		return imagePoseCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMilitaryDischargeCategoryCodeSimpleTypeObject() {
		return militaryDischargeCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOffenseLevelCodeSimpleTypeObject() {
		return offenseLevelCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPersonNameCategoryCodeSimpleTypeObject() {
		return personNameCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPleaCategoryCodeSimpleTypeObject() {
		return pleaCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatuteCategoryCodeSimpleTypeObject() {
		return statuteCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupervisionLevelCodeSimpleTypeObject() {
		return supervisionLevelCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupervisionRestrictionCodeSimpleTypeObject() {
		return supervisionRestrictionCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUTMHemisphereCodeSimpleTypeObject() {
		return utmHemisphereCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Factory get_0Factory() {
		return (_0Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contactInformationAvailabilityCodeTypeEClass = createEClass(CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE);
		createEAttribute(contactInformationAvailabilityCodeTypeEClass, CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE__VALUE);
		createEAttribute(contactInformationAvailabilityCodeTypeEClass, CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE__ID);
		createEAttribute(contactInformationAvailabilityCodeTypeEClass, CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE__METADATA);
		createEAttribute(contactInformationAvailabilityCodeTypeEClass, CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE__REF);
		createEAttribute(contactInformationAvailabilityCodeTypeEClass, CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(contactInformationAvailabilityCodeTypeEClass, CONTACT_INFORMATION_AVAILABILITY_CODE_TYPE__ANY_ATTRIBUTE);

		dayOfWeekCodeTypeEClass = createEClass(DAY_OF_WEEK_CODE_TYPE);
		createEAttribute(dayOfWeekCodeTypeEClass, DAY_OF_WEEK_CODE_TYPE__VALUE);
		createEAttribute(dayOfWeekCodeTypeEClass, DAY_OF_WEEK_CODE_TYPE__ID);
		createEAttribute(dayOfWeekCodeTypeEClass, DAY_OF_WEEK_CODE_TYPE__METADATA);
		createEAttribute(dayOfWeekCodeTypeEClass, DAY_OF_WEEK_CODE_TYPE__REF);
		createEAttribute(dayOfWeekCodeTypeEClass, DAY_OF_WEEK_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(dayOfWeekCodeTypeEClass, DAY_OF_WEEK_CODE_TYPE__ANY_ATTRIBUTE);

		imagePoseCodeTypeEClass = createEClass(IMAGE_POSE_CODE_TYPE);
		createEAttribute(imagePoseCodeTypeEClass, IMAGE_POSE_CODE_TYPE__VALUE);
		createEAttribute(imagePoseCodeTypeEClass, IMAGE_POSE_CODE_TYPE__ID);
		createEAttribute(imagePoseCodeTypeEClass, IMAGE_POSE_CODE_TYPE__METADATA);
		createEAttribute(imagePoseCodeTypeEClass, IMAGE_POSE_CODE_TYPE__REF);
		createEAttribute(imagePoseCodeTypeEClass, IMAGE_POSE_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(imagePoseCodeTypeEClass, IMAGE_POSE_CODE_TYPE__ANY_ATTRIBUTE);

		militaryDischargeCategoryCodeTypeEClass = createEClass(MILITARY_DISCHARGE_CATEGORY_CODE_TYPE);
		createEAttribute(militaryDischargeCategoryCodeTypeEClass, MILITARY_DISCHARGE_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(militaryDischargeCategoryCodeTypeEClass, MILITARY_DISCHARGE_CATEGORY_CODE_TYPE__ID);
		createEAttribute(militaryDischargeCategoryCodeTypeEClass, MILITARY_DISCHARGE_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(militaryDischargeCategoryCodeTypeEClass, MILITARY_DISCHARGE_CATEGORY_CODE_TYPE__REF);
		createEAttribute(militaryDischargeCategoryCodeTypeEClass, MILITARY_DISCHARGE_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(militaryDischargeCategoryCodeTypeEClass, MILITARY_DISCHARGE_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		offenseLevelCodeTypeEClass = createEClass(OFFENSE_LEVEL_CODE_TYPE);
		createEAttribute(offenseLevelCodeTypeEClass, OFFENSE_LEVEL_CODE_TYPE__VALUE);
		createEAttribute(offenseLevelCodeTypeEClass, OFFENSE_LEVEL_CODE_TYPE__ID);
		createEAttribute(offenseLevelCodeTypeEClass, OFFENSE_LEVEL_CODE_TYPE__METADATA);
		createEAttribute(offenseLevelCodeTypeEClass, OFFENSE_LEVEL_CODE_TYPE__REF);
		createEAttribute(offenseLevelCodeTypeEClass, OFFENSE_LEVEL_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(offenseLevelCodeTypeEClass, OFFENSE_LEVEL_CODE_TYPE__ANY_ATTRIBUTE);

		personNameCategoryCodeTypeEClass = createEClass(PERSON_NAME_CATEGORY_CODE_TYPE);
		createEAttribute(personNameCategoryCodeTypeEClass, PERSON_NAME_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(personNameCategoryCodeTypeEClass, PERSON_NAME_CATEGORY_CODE_TYPE__ID);
		createEAttribute(personNameCategoryCodeTypeEClass, PERSON_NAME_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(personNameCategoryCodeTypeEClass, PERSON_NAME_CATEGORY_CODE_TYPE__REF);
		createEAttribute(personNameCategoryCodeTypeEClass, PERSON_NAME_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(personNameCategoryCodeTypeEClass, PERSON_NAME_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		pleaCategoryCodeTypeEClass = createEClass(PLEA_CATEGORY_CODE_TYPE);
		createEAttribute(pleaCategoryCodeTypeEClass, PLEA_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(pleaCategoryCodeTypeEClass, PLEA_CATEGORY_CODE_TYPE__ID);
		createEAttribute(pleaCategoryCodeTypeEClass, PLEA_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(pleaCategoryCodeTypeEClass, PLEA_CATEGORY_CODE_TYPE__REF);
		createEAttribute(pleaCategoryCodeTypeEClass, PLEA_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(pleaCategoryCodeTypeEClass, PLEA_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		statuteCategoryCodeTypeEClass = createEClass(STATUTE_CATEGORY_CODE_TYPE);
		createEAttribute(statuteCategoryCodeTypeEClass, STATUTE_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(statuteCategoryCodeTypeEClass, STATUTE_CATEGORY_CODE_TYPE__ID);
		createEAttribute(statuteCategoryCodeTypeEClass, STATUTE_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(statuteCategoryCodeTypeEClass, STATUTE_CATEGORY_CODE_TYPE__REF);
		createEAttribute(statuteCategoryCodeTypeEClass, STATUTE_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(statuteCategoryCodeTypeEClass, STATUTE_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		supervisionLevelCodeTypeEClass = createEClass(SUPERVISION_LEVEL_CODE_TYPE);
		createEAttribute(supervisionLevelCodeTypeEClass, SUPERVISION_LEVEL_CODE_TYPE__VALUE);
		createEAttribute(supervisionLevelCodeTypeEClass, SUPERVISION_LEVEL_CODE_TYPE__ID);
		createEAttribute(supervisionLevelCodeTypeEClass, SUPERVISION_LEVEL_CODE_TYPE__METADATA);
		createEAttribute(supervisionLevelCodeTypeEClass, SUPERVISION_LEVEL_CODE_TYPE__REF);
		createEAttribute(supervisionLevelCodeTypeEClass, SUPERVISION_LEVEL_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(supervisionLevelCodeTypeEClass, SUPERVISION_LEVEL_CODE_TYPE__ANY_ATTRIBUTE);

		supervisionRestrictionCodeTypeEClass = createEClass(SUPERVISION_RESTRICTION_CODE_TYPE);
		createEAttribute(supervisionRestrictionCodeTypeEClass, SUPERVISION_RESTRICTION_CODE_TYPE__VALUE);
		createEAttribute(supervisionRestrictionCodeTypeEClass, SUPERVISION_RESTRICTION_CODE_TYPE__ID);
		createEAttribute(supervisionRestrictionCodeTypeEClass, SUPERVISION_RESTRICTION_CODE_TYPE__METADATA);
		createEAttribute(supervisionRestrictionCodeTypeEClass, SUPERVISION_RESTRICTION_CODE_TYPE__REF);
		createEAttribute(supervisionRestrictionCodeTypeEClass, SUPERVISION_RESTRICTION_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(supervisionRestrictionCodeTypeEClass, SUPERVISION_RESTRICTION_CODE_TYPE__ANY_ATTRIBUTE);

		utmHemisphereCodeTypeEClass = createEClass(UTM_HEMISPHERE_CODE_TYPE);
		createEAttribute(utmHemisphereCodeTypeEClass, UTM_HEMISPHERE_CODE_TYPE__VALUE);
		createEAttribute(utmHemisphereCodeTypeEClass, UTM_HEMISPHERE_CODE_TYPE__ID);
		createEAttribute(utmHemisphereCodeTypeEClass, UTM_HEMISPHERE_CODE_TYPE__METADATA);
		createEAttribute(utmHemisphereCodeTypeEClass, UTM_HEMISPHERE_CODE_TYPE__REF);
		createEAttribute(utmHemisphereCodeTypeEClass, UTM_HEMISPHERE_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(utmHemisphereCodeTypeEClass, UTM_HEMISPHERE_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		contactInformationAvailabilityCodeSimpleTypeEEnum = createEEnum(CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE);
		dayOfWeekCodeSimpleTypeEEnum = createEEnum(DAY_OF_WEEK_CODE_SIMPLE_TYPE);
		imagePoseCodeSimpleTypeEEnum = createEEnum(IMAGE_POSE_CODE_SIMPLE_TYPE);
		militaryDischargeCategoryCodeSimpleTypeEEnum = createEEnum(MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE);
		offenseLevelCodeSimpleTypeEEnum = createEEnum(OFFENSE_LEVEL_CODE_SIMPLE_TYPE);
		personNameCategoryCodeSimpleTypeEEnum = createEEnum(PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE);
		pleaCategoryCodeSimpleTypeEEnum = createEEnum(PLEA_CATEGORY_CODE_SIMPLE_TYPE);
		statuteCategoryCodeSimpleTypeEEnum = createEEnum(STATUTE_CATEGORY_CODE_SIMPLE_TYPE);
		supervisionLevelCodeSimpleTypeEEnum = createEEnum(SUPERVISION_LEVEL_CODE_SIMPLE_TYPE);
		supervisionRestrictionCodeSimpleTypeEEnum = createEEnum(SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE);
		utmHemisphereCodeSimpleTypeEEnum = createEEnum(UTM_HEMISPHERE_CODE_SIMPLE_TYPE);

		// Create data types
		contactInformationAvailabilityCodeSimpleTypeObjectEDataType = createEDataType(CONTACT_INFORMATION_AVAILABILITY_CODE_SIMPLE_TYPE_OBJECT);
		dayOfWeekCodeSimpleTypeObjectEDataType = createEDataType(DAY_OF_WEEK_CODE_SIMPLE_TYPE_OBJECT);
		imagePoseCodeSimpleTypeObjectEDataType = createEDataType(IMAGE_POSE_CODE_SIMPLE_TYPE_OBJECT);
		militaryDischargeCategoryCodeSimpleTypeObjectEDataType = createEDataType(MILITARY_DISCHARGE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		offenseLevelCodeSimpleTypeObjectEDataType = createEDataType(OFFENSE_LEVEL_CODE_SIMPLE_TYPE_OBJECT);
		personNameCategoryCodeSimpleTypeObjectEDataType = createEDataType(PERSON_NAME_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		pleaCategoryCodeSimpleTypeObjectEDataType = createEDataType(PLEA_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		statuteCategoryCodeSimpleTypeObjectEDataType = createEDataType(STATUTE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		supervisionLevelCodeSimpleTypeObjectEDataType = createEDataType(SUPERVISION_LEVEL_CODE_SIMPLE_TYPE_OBJECT);
		supervisionRestrictionCodeSimpleTypeObjectEDataType = createEDataType(SUPERVISION_RESTRICTION_CODE_SIMPLE_TYPE_OBJECT);
		utmHemisphereCodeSimpleTypeObjectEDataType = createEDataType(UTM_HEMISPHERE_CODE_SIMPLE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contactInformationAvailabilityCodeTypeEClass, ContactInformationAvailabilityCodeType.class, "ContactInformationAvailabilityCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactInformationAvailabilityCodeType_Value(), this.getContactInformationAvailabilityCodeSimpleType(), "value", null, 0, 1, ContactInformationAvailabilityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationAvailabilityCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ContactInformationAvailabilityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationAvailabilityCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, ContactInformationAvailabilityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationAvailabilityCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, ContactInformationAvailabilityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationAvailabilityCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, ContactInformationAvailabilityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformationAvailabilityCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ContactInformationAvailabilityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayOfWeekCodeTypeEClass, DayOfWeekCodeType.class, "DayOfWeekCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDayOfWeekCodeType_Value(), this.getDayOfWeekCodeSimpleType(), "value", null, 0, 1, DayOfWeekCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfWeekCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DayOfWeekCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfWeekCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DayOfWeekCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfWeekCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, DayOfWeekCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfWeekCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, DayOfWeekCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfWeekCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DayOfWeekCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagePoseCodeTypeEClass, ImagePoseCodeType.class, "ImagePoseCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagePoseCodeType_Value(), this.getImagePoseCodeSimpleType(), "value", null, 0, 1, ImagePoseCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePoseCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ImagePoseCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePoseCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, ImagePoseCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePoseCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, ImagePoseCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePoseCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, ImagePoseCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagePoseCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ImagePoseCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(militaryDischargeCategoryCodeTypeEClass, MilitaryDischargeCategoryCodeType.class, "MilitaryDischargeCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMilitaryDischargeCategoryCodeType_Value(), this.getMilitaryDischargeCategoryCodeSimpleType(), "value", null, 0, 1, MilitaryDischargeCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilitaryDischargeCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MilitaryDischargeCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilitaryDischargeCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, MilitaryDischargeCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilitaryDischargeCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, MilitaryDischargeCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilitaryDischargeCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, MilitaryDischargeCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilitaryDischargeCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MilitaryDischargeCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offenseLevelCodeTypeEClass, OffenseLevelCodeType.class, "OffenseLevelCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOffenseLevelCodeType_Value(), this.getOffenseLevelCodeSimpleType(), "value", null, 0, 1, OffenseLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffenseLevelCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, OffenseLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffenseLevelCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, OffenseLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffenseLevelCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, OffenseLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffenseLevelCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, OffenseLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOffenseLevelCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, OffenseLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personNameCategoryCodeTypeEClass, PersonNameCategoryCodeType.class, "PersonNameCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonNameCategoryCodeType_Value(), this.getPersonNameCategoryCodeSimpleType(), "value", null, 0, 1, PersonNameCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PersonNameCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, PersonNameCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, PersonNameCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, PersonNameCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonNameCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PersonNameCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pleaCategoryCodeTypeEClass, PleaCategoryCodeType.class, "PleaCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPleaCategoryCodeType_Value(), this.getPleaCategoryCodeSimpleType(), "value", null, 0, 1, PleaCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPleaCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PleaCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPleaCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, PleaCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPleaCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, PleaCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPleaCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, PleaCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPleaCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PleaCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statuteCategoryCodeTypeEClass, StatuteCategoryCodeType.class, "StatuteCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatuteCategoryCodeType_Value(), this.getStatuteCategoryCodeSimpleType(), "value", null, 0, 1, StatuteCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatuteCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StatuteCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatuteCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, StatuteCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatuteCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, StatuteCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatuteCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, StatuteCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatuteCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, StatuteCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supervisionLevelCodeTypeEClass, SupervisionLevelCodeType.class, "SupervisionLevelCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupervisionLevelCodeType_Value(), this.getSupervisionLevelCodeSimpleType(), "value", null, 0, 1, SupervisionLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionLevelCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SupervisionLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionLevelCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, SupervisionLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionLevelCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, SupervisionLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionLevelCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, SupervisionLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionLevelCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SupervisionLevelCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supervisionRestrictionCodeTypeEClass, SupervisionRestrictionCodeType.class, "SupervisionRestrictionCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupervisionRestrictionCodeType_Value(), this.getSupervisionRestrictionCodeSimpleType(), "value", null, 0, 1, SupervisionRestrictionCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionRestrictionCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SupervisionRestrictionCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionRestrictionCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, SupervisionRestrictionCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionRestrictionCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, SupervisionRestrictionCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionRestrictionCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, SupervisionRestrictionCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupervisionRestrictionCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SupervisionRestrictionCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utmHemisphereCodeTypeEClass, UTMHemisphereCodeType.class, "UTMHemisphereCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUTMHemisphereCodeType_Value(), this.getUTMHemisphereCodeSimpleType(), "value", null, 0, 1, UTMHemisphereCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUTMHemisphereCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UTMHemisphereCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUTMHemisphereCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, UTMHemisphereCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUTMHemisphereCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, UTMHemisphereCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUTMHemisphereCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, UTMHemisphereCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUTMHemisphereCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UTMHemisphereCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.class, "ContactInformationAvailabilityCodeSimpleType");
		addEEnumLiteral(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.DAY);
		addEEnumLiteral(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.EMERGENCY);
		addEEnumLiteral(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.EVENING);
		addEEnumLiteral(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.NIGHT);
		addEEnumLiteral(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.PRIMARY);
		addEEnumLiteral(contactInformationAvailabilityCodeSimpleTypeEEnum, ContactInformationAvailabilityCodeSimpleType.SECONDARY);

		initEEnum(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.class, "DayOfWeekCodeSimpleType");
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.FRI);
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.MON);
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.SAT);
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.SUN);
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.THU);
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.TUE);
		addEEnumLiteral(dayOfWeekCodeSimpleTypeEEnum, DayOfWeekCodeSimpleType.WED);

		initEEnum(imagePoseCodeSimpleTypeEEnum, ImagePoseCodeSimpleType.class, "ImagePoseCodeSimpleType");
		addEEnumLiteral(imagePoseCodeSimpleTypeEEnum, ImagePoseCodeSimpleType.FRONTAL);
		addEEnumLiteral(imagePoseCodeSimpleTypeEEnum, ImagePoseCodeSimpleType.OBLIQUE);
		addEEnumLiteral(imagePoseCodeSimpleTypeEEnum, ImagePoseCodeSimpleType.SIDE);

		initEEnum(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.class, "MilitaryDischargeCategoryCodeSimpleType");
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.B);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.D);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.G);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.H);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.M);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.N);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.O);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.Q);
		addEEnumLiteral(militaryDischargeCategoryCodeSimpleTypeEEnum, MilitaryDischargeCategoryCodeSimpleType.U);

		initEEnum(offenseLevelCodeSimpleTypeEEnum, OffenseLevelCodeSimpleType.class, "OffenseLevelCodeSimpleType");
		addEEnumLiteral(offenseLevelCodeSimpleTypeEEnum, OffenseLevelCodeSimpleType.F);
		addEEnumLiteral(offenseLevelCodeSimpleTypeEEnum, OffenseLevelCodeSimpleType.G);
		addEEnumLiteral(offenseLevelCodeSimpleTypeEEnum, OffenseLevelCodeSimpleType.M);
		addEEnumLiteral(offenseLevelCodeSimpleTypeEEnum, OffenseLevelCodeSimpleType.P);

		initEEnum(personNameCategoryCodeSimpleTypeEEnum, PersonNameCategoryCodeSimpleType.class, "PersonNameCategoryCodeSimpleType");
		addEEnumLiteral(personNameCategoryCodeSimpleTypeEEnum, PersonNameCategoryCodeSimpleType.ALTERNATE);
		addEEnumLiteral(personNameCategoryCodeSimpleTypeEEnum, PersonNameCategoryCodeSimpleType.ASSERTED);
		addEEnumLiteral(personNameCategoryCodeSimpleTypeEEnum, PersonNameCategoryCodeSimpleType.LEGAL);

		initEEnum(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.class, "PleaCategoryCodeSimpleType");
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.A);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.C);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.G);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.I);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.M);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.N);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.U);
		addEEnumLiteral(pleaCategoryCodeSimpleTypeEEnum, PleaCategoryCodeSimpleType.X);

		initEEnum(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.class, "StatuteCategoryCodeSimpleType");
		addEEnumLiteral(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.B);
		addEEnumLiteral(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.C);
		addEEnumLiteral(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.D);
		addEEnumLiteral(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.J);
		addEEnumLiteral(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.N);
		addEEnumLiteral(statuteCategoryCodeSimpleTypeEEnum, StatuteCategoryCodeSimpleType.P);

		initEEnum(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType.class, "SupervisionLevelCodeSimpleType");
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType._1LOWRISK);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType._2MODERATERISK);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType._3HIGHRISK);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType._4EXTREMERISK);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType.COMPACTOUT);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType.FUGITIVE);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType.ISPI);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType.ISPII);
		addEEnumLiteral(supervisionLevelCodeSimpleTypeEEnum, SupervisionLevelCodeSimpleType.RESIDINSTATECUSTD);

		initEEnum(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.class, "SupervisionRestrictionCodeSimpleType");
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ABSCONDING);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ALCOHOL);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ALCOHOLESTABLISHMNT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ARRESTCITATIONS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ASSOCIATION);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.CHEMICALANALYSIS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.CHILDRENCONGREGATE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.CHILDRENUNDER18);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.CONDUCT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.CURFEW);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.DISCONNECTPHONE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.DNA);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.DOCUMENTSDATAPHOTO);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.DRIVERLICENSEID);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.DRUGS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ELECTRONICMONITOR);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.EMPLOYMENT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.EMPLOYMENTVERIFY);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.ENTERTAINLURE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.EXPLOITMATERIAL);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.FEES);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.FINANCIALAGREEMENT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.FIREARMAMMUITION);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.FIREARMSUSED);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.FREQUENTGANGPLACES);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.FREQUENTSCHOOLS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.GANGMEMBERS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.GEDDIPLOMA);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.HMUABUSE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.HMUMOVE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.HOMEVISITS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.INSIGNIASEMBLEMS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.INTERSTATECOMPACT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.LAWENFORCECONTACT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.LEAVECOUNTY);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.MONTHLYPAYMENTS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.NOALCOHOL);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.NOCONTACTWVICTM);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.NOTATCOURT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.NOTDATE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.PAGER);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.PAINTPENS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.PHONESERVICES);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.POLYGRAPH);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.PORNOGRAPHY);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.PROVIDEPHONELINE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.REGISTRATIONDNA);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.RELEASE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.REPORTING);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.RESIDENCE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.SEARCHES);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.SEXSTIMULUSMATERIA);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.SIGNSGESTURES);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.SPECIAL);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.STOLENVEHICLE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.SUBSTANCETESTING);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.SUPERVISIONFEE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.THERAPY);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.TREATMENTCOUNSELING);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.TRUTHFULNESS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.UNEMPLOYED);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.VEHICLE);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.VICIOUSDOGS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.VICTIMCONTACT);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.VISITS);
		addEEnumLiteral(supervisionRestrictionCodeSimpleTypeEEnum, SupervisionRestrictionCodeSimpleType.WEAPONS);

		initEEnum(utmHemisphereCodeSimpleTypeEEnum, UTMHemisphereCodeSimpleType.class, "UTMHemisphereCodeSimpleType");
		addEEnumLiteral(utmHemisphereCodeSimpleTypeEEnum, UTMHemisphereCodeSimpleType.N);
		addEEnumLiteral(utmHemisphereCodeSimpleTypeEEnum, UTMHemisphereCodeSimpleType.S);

		// Initialize data types
		initEDataType(contactInformationAvailabilityCodeSimpleTypeObjectEDataType, ContactInformationAvailabilityCodeSimpleType.class, "ContactInformationAvailabilityCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dayOfWeekCodeSimpleTypeObjectEDataType, DayOfWeekCodeSimpleType.class, "DayOfWeekCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(imagePoseCodeSimpleTypeObjectEDataType, ImagePoseCodeSimpleType.class, "ImagePoseCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(militaryDischargeCategoryCodeSimpleTypeObjectEDataType, MilitaryDischargeCategoryCodeSimpleType.class, "MilitaryDischargeCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(offenseLevelCodeSimpleTypeObjectEDataType, OffenseLevelCodeSimpleType.class, "OffenseLevelCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(personNameCategoryCodeSimpleTypeObjectEDataType, PersonNameCategoryCodeSimpleType.class, "PersonNameCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pleaCategoryCodeSimpleTypeObjectEDataType, PleaCategoryCodeSimpleType.class, "PleaCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statuteCategoryCodeSimpleTypeObjectEDataType, StatuteCategoryCodeSimpleType.class, "StatuteCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(supervisionLevelCodeSimpleTypeObjectEDataType, SupervisionLevelCodeSimpleType.class, "SupervisionLevelCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(supervisionRestrictionCodeSimpleTypeObjectEDataType, SupervisionRestrictionCodeSimpleType.class, "SupervisionRestrictionCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(utmHemisphereCodeSimpleTypeObjectEDataType, UTMHemisphereCodeSimpleType.class, "UTMHemisphereCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http://release.niem.gov/niem/conformanceTargets/3.0/
		create_3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n      <term:LocalTerm literal=\"Universal Transverse Mercator\" term=\"UTM\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    "
		   });																																																																																																																																																																																																																																																					
	}

	/**
	 * Initializes the annotations for <b>http://release.niem.gov/niem/conformanceTargets/3.0/</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_3Annotations() {
		String source = "http://release.niem.gov/niem/conformanceTargets/3.0/";				
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "conformanceTargets", "http://reference.niem.gov/niem/specification/naming-and-design-rules/3.0/#ReferenceSchemaDocument"
		   });																																																																																																																																																																																																																																																				
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";						
		addAnnotation
		  (contactInformationAvailabilityCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ContactInformationAvailabilityCodeSimpleType"
		   });								
		addAnnotation
		  (contactInformationAvailabilityCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ContactInformationAvailabilityCodeSimpleType:Object",
			 "baseType", "ContactInformationAvailabilityCodeSimpleType"
		   });			
		addAnnotation
		  (contactInformationAvailabilityCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ContactInformationAvailabilityCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getContactInformationAvailabilityCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getContactInformationAvailabilityCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getContactInformationAvailabilityCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getContactInformationAvailabilityCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getContactInformationAvailabilityCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getContactInformationAvailabilityCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (dayOfWeekCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DayOfWeekCodeSimpleType"
		   });									
		addAnnotation
		  (dayOfWeekCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DayOfWeekCodeSimpleType:Object",
			 "baseType", "DayOfWeekCodeSimpleType"
		   });			
		addAnnotation
		  (dayOfWeekCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DayOfWeekCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDayOfWeekCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDayOfWeekCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDayOfWeekCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDayOfWeekCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDayOfWeekCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDayOfWeekCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (imagePoseCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ImagePoseCodeSimpleType"
		   });					
		addAnnotation
		  (imagePoseCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ImagePoseCodeSimpleType:Object",
			 "baseType", "ImagePoseCodeSimpleType"
		   });			
		addAnnotation
		  (imagePoseCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ImagePoseCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getImagePoseCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getImagePoseCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getImagePoseCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getImagePoseCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getImagePoseCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getImagePoseCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (militaryDischargeCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "MilitaryDischargeCategoryCodeSimpleType"
		   });											
		addAnnotation
		  (militaryDischargeCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MilitaryDischargeCategoryCodeSimpleType:Object",
			 "baseType", "MilitaryDischargeCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (militaryDischargeCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MilitaryDischargeCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMilitaryDischargeCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMilitaryDischargeCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMilitaryDischargeCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMilitaryDischargeCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMilitaryDischargeCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMilitaryDischargeCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (offenseLevelCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "OffenseLevelCodeSimpleType"
		   });						
		addAnnotation
		  (offenseLevelCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "OffenseLevelCodeSimpleType:Object",
			 "baseType", "OffenseLevelCodeSimpleType"
		   });			
		addAnnotation
		  (offenseLevelCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OffenseLevelCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getOffenseLevelCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getOffenseLevelCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getOffenseLevelCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getOffenseLevelCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getOffenseLevelCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getOffenseLevelCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (personNameCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PersonNameCategoryCodeSimpleType"
		   });					
		addAnnotation
		  (personNameCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PersonNameCategoryCodeSimpleType:Object",
			 "baseType", "PersonNameCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (personNameCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PersonNameCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPersonNameCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPersonNameCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPersonNameCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPersonNameCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPersonNameCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPersonNameCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (pleaCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "PleaCategoryCodeSimpleType"
		   });										
		addAnnotation
		  (pleaCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PleaCategoryCodeSimpleType:Object",
			 "baseType", "PleaCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (pleaCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PleaCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPleaCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPleaCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPleaCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPleaCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPleaCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPleaCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (statuteCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "StatuteCategoryCodeSimpleType"
		   });								
		addAnnotation
		  (statuteCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "StatuteCategoryCodeSimpleType:Object",
			 "baseType", "StatuteCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (statuteCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StatuteCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getStatuteCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getStatuteCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getStatuteCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getStatuteCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getStatuteCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getStatuteCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (supervisionLevelCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "SupervisionLevelCodeSimpleType"
		   });											
		addAnnotation
		  (supervisionLevelCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SupervisionLevelCodeSimpleType:Object",
			 "baseType", "SupervisionLevelCodeSimpleType"
		   });			
		addAnnotation
		  (supervisionLevelCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SupervisionLevelCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSupervisionLevelCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSupervisionLevelCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionLevelCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionLevelCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionLevelCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionLevelCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (supervisionRestrictionCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "SupervisionRestrictionCodeSimpleType"
		   });																																																																				
		addAnnotation
		  (supervisionRestrictionCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SupervisionRestrictionCodeSimpleType:Object",
			 "baseType", "SupervisionRestrictionCodeSimpleType"
		   });			
		addAnnotation
		  (supervisionRestrictionCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SupervisionRestrictionCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSupervisionRestrictionCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSupervisionRestrictionCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionRestrictionCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionRestrictionCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionRestrictionCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getSupervisionRestrictionCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (utmHemisphereCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "UTMHemisphereCodeSimpleType"
		   });				
		addAnnotation
		  (utmHemisphereCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "UTMHemisphereCodeSimpleType:Object",
			 "baseType", "UTMHemisphereCodeSimpleType"
		   });			
		addAnnotation
		  (utmHemisphereCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UTMHemisphereCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUTMHemisphereCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUTMHemisphereCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUTMHemisphereCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUTMHemisphereCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUTMHemisphereCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUTMHemisphereCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
