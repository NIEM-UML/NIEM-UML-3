/**
 */
package gov.niem.release.niem.proxy.xsd._3._0.impl;

import gov.niem.release.niem.proxy.xsd._3._0.AnyURI;
import gov.niem.release.niem.proxy.xsd._3._0.Base64Binary;
import gov.niem.release.niem.proxy.xsd._3._0.Date;
import gov.niem.release.niem.proxy.xsd._3._0.DateTime;
import gov.niem.release.niem.proxy.xsd._3._0.Decimal;
import gov.niem.release.niem.proxy.xsd._3._0.Duration;
import gov.niem.release.niem.proxy.xsd._3._0.GDay;
import gov.niem.release.niem.proxy.xsd._3._0.GMonth;
import gov.niem.release.niem.proxy.xsd._3._0.GMonthDay;
import gov.niem.release.niem.proxy.xsd._3._0.GYear;
import gov.niem.release.niem.proxy.xsd._3._0.GYearMonth;
import gov.niem.release.niem.proxy.xsd._3._0.HexBinary;
import gov.niem.release.niem.proxy.xsd._3._0.Int;
import gov.niem.release.niem.proxy.xsd._3._0.Language;
import gov.niem.release.niem.proxy.xsd._3._0.NegativeInteger;
import gov.niem.release.niem.proxy.xsd._3._0.NonNegativeInteger;
import gov.niem.release.niem.proxy.xsd._3._0.NonPositiveInteger;
import gov.niem.release.niem.proxy.xsd._3._0.NormalizedString;
import gov.niem.release.niem.proxy.xsd._3._0.PositiveInteger;
import gov.niem.release.niem.proxy.xsd._3._0.Time;
import gov.niem.release.niem.proxy.xsd._3._0.Token;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedByte;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedInt;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedLong;
import gov.niem.release.niem.proxy.xsd._3._0.UnsignedShort;
import gov.niem.release.niem.proxy.xsd._3._0._0Factory;
import gov.niem.release.niem.proxy.xsd._3._0._0Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass anyURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64BinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gMonthDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gYearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gYearMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hexBinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonPositiveIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedByteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedShortEClass = null;

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
	 * @see gov.niem.release.niem.proxy.xsd._3._0._0Package#eNS_URI
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
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl the_0Package_3 = (gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eNS_URI) instanceof gov.niem.reference.niem.resource.mpd.catalog._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eNS_URI) : gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl the_0Package_4 = (gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.coreMisc._3._0._0Package.eINSTANCE);
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
		theNamespacePackage.createPackageContents();
		the_0Package_3.createPackageContents();
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
		theNamespacePackage.initializePackageContents();
		the_0Package_3.initializePackageContents();
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
	public EClass getAnyURI() {
		return anyURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_Value() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_Id() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_Metadata() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_Ref() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_RelationshipMetadata() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_AnyAttribute() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase64Binary() {
		return base64BinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Value() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Id() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Metadata() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Ref() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_RelationshipMetadata() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_AnyAttribute() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Value() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Id() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Metadata() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Ref() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_RelationshipMetadata() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_AnyAttribute() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getByte() {
		return byteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByte_Value() {
		return (EAttribute)byteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByte_Id() {
		return (EAttribute)byteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByte_Metadata() {
		return (EAttribute)byteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByte_Ref() {
		return (EAttribute)byteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByte_RelationshipMetadata() {
		return (EAttribute)byteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getByte_AnyAttribute() {
		return (EAttribute)byteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Value() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Id() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Metadata() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Ref() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_RelationshipMetadata() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_AnyAttribute() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Value() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Id() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Metadata() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Ref() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_RelationshipMetadata() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_AnyAttribute() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimal() {
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Value() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Id() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Metadata() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Ref() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_RelationshipMetadata() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_AnyAttribute() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDouble() {
		return doubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_Value() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_Id() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_Metadata() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_Ref() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_RelationshipMetadata() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDouble_AnyAttribute() {
		return (EAttribute)doubleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Value() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Id() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Metadata() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Ref() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_RelationshipMetadata() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_AnyAttribute() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloat() {
		return floatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_Value() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_Id() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_Metadata() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_Ref() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_RelationshipMetadata() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloat_AnyAttribute() {
		return (EAttribute)floatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGDay() {
		return gDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDay_Value() {
		return (EAttribute)gDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDay_Id() {
		return (EAttribute)gDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDay_Metadata() {
		return (EAttribute)gDayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDay_Ref() {
		return (EAttribute)gDayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDay_RelationshipMetadata() {
		return (EAttribute)gDayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGDay_AnyAttribute() {
		return (EAttribute)gDayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGMonth() {
		return gMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_Value() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_Id() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_Metadata() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_Ref() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_RelationshipMetadata() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_AnyAttribute() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGMonthDay() {
		return gMonthDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonthDay_Value() {
		return (EAttribute)gMonthDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonthDay_Id() {
		return (EAttribute)gMonthDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonthDay_Metadata() {
		return (EAttribute)gMonthDayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonthDay_Ref() {
		return (EAttribute)gMonthDayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonthDay_RelationshipMetadata() {
		return (EAttribute)gMonthDayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonthDay_AnyAttribute() {
		return (EAttribute)gMonthDayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGYear() {
		return gYearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_Value() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_Id() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_Metadata() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_Ref() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_RelationshipMetadata() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_AnyAttribute() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGYearMonth() {
		return gYearMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_Value() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_Id() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_Metadata() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_Ref() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_RelationshipMetadata() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_AnyAttribute() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHexBinary() {
		return hexBinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_Value() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_Id() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_Metadata() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_Ref() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_RelationshipMetadata() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_AnyAttribute() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInt() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt_Value() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt_Id() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt_Metadata() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt_Ref() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt_RelationshipMetadata() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInt_AnyAttribute() {
		return (EAttribute)intEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Value() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Id() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Metadata() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Ref() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_RelationshipMetadata() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_AnyAttribute() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Value() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Id() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Metadata() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_Ref() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_RelationshipMetadata() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_AnyAttribute() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLong() {
		return longEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_Value() {
		return (EAttribute)longEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_Id() {
		return (EAttribute)longEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_Metadata() {
		return (EAttribute)longEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_Ref() {
		return (EAttribute)longEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_RelationshipMetadata() {
		return (EAttribute)longEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLong_AnyAttribute() {
		return (EAttribute)longEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeInteger() {
		return negativeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegativeInteger_Value() {
		return (EAttribute)negativeIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegativeInteger_Id() {
		return (EAttribute)negativeIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegativeInteger_Metadata() {
		return (EAttribute)negativeIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegativeInteger_Ref() {
		return (EAttribute)negativeIntegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegativeInteger_RelationshipMetadata() {
		return (EAttribute)negativeIntegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegativeInteger_AnyAttribute() {
		return (EAttribute)negativeIntegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeInteger() {
		return nonNegativeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_Value() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_Id() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_Metadata() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_Ref() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_RelationshipMetadata() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_AnyAttribute() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonPositiveInteger() {
		return nonPositiveIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPositiveInteger_Value() {
		return (EAttribute)nonPositiveIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPositiveInteger_Id() {
		return (EAttribute)nonPositiveIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPositiveInteger_Metadata() {
		return (EAttribute)nonPositiveIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPositiveInteger_Ref() {
		return (EAttribute)nonPositiveIntegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPositiveInteger_RelationshipMetadata() {
		return (EAttribute)nonPositiveIntegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonPositiveInteger_AnyAttribute() {
		return (EAttribute)nonPositiveIntegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalizedString() {
		return normalizedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizedString_Value() {
		return (EAttribute)normalizedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizedString_Id() {
		return (EAttribute)normalizedStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizedString_Metadata() {
		return (EAttribute)normalizedStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizedString_Ref() {
		return (EAttribute)normalizedStringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizedString_RelationshipMetadata() {
		return (EAttribute)normalizedStringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizedString_AnyAttribute() {
		return (EAttribute)normalizedStringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveInteger() {
		return positiveIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInteger_Value() {
		return (EAttribute)positiveIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInteger_Id() {
		return (EAttribute)positiveIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInteger_Metadata() {
		return (EAttribute)positiveIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInteger_Ref() {
		return (EAttribute)positiveIntegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInteger_RelationshipMetadata() {
		return (EAttribute)positiveIntegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInteger_AnyAttribute() {
		return (EAttribute)positiveIntegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShort() {
		return shortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShort_Value() {
		return (EAttribute)shortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShort_Id() {
		return (EAttribute)shortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShort_Metadata() {
		return (EAttribute)shortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShort_Ref() {
		return (EAttribute)shortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShort_RelationshipMetadata() {
		return (EAttribute)shortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShort_AnyAttribute() {
		return (EAttribute)shortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Id() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Metadata() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Ref() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_RelationshipMetadata() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_AnyAttribute() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Value() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Id() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Metadata() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Ref() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_RelationshipMetadata() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_AnyAttribute() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Value() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Id() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Metadata() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Ref() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_RelationshipMetadata() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_AnyAttribute() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedByte() {
		return unsignedByteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedByte_Value() {
		return (EAttribute)unsignedByteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedByte_Id() {
		return (EAttribute)unsignedByteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedByte_Metadata() {
		return (EAttribute)unsignedByteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedByte_Ref() {
		return (EAttribute)unsignedByteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedByte_RelationshipMetadata() {
		return (EAttribute)unsignedByteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedByte_AnyAttribute() {
		return (EAttribute)unsignedByteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedInt() {
		return unsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_Value() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_Id() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_Metadata() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_Ref() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_RelationshipMetadata() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_AnyAttribute() {
		return (EAttribute)unsignedIntEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedLong() {
		return unsignedLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedLong_Value() {
		return (EAttribute)unsignedLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedLong_Id() {
		return (EAttribute)unsignedLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedLong_Metadata() {
		return (EAttribute)unsignedLongEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedLong_Ref() {
		return (EAttribute)unsignedLongEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedLong_RelationshipMetadata() {
		return (EAttribute)unsignedLongEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedLong_AnyAttribute() {
		return (EAttribute)unsignedLongEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedShort() {
		return unsignedShortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedShort_Value() {
		return (EAttribute)unsignedShortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedShort_Id() {
		return (EAttribute)unsignedShortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedShort_Metadata() {
		return (EAttribute)unsignedShortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedShort_Ref() {
		return (EAttribute)unsignedShortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedShort_RelationshipMetadata() {
		return (EAttribute)unsignedShortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedShort_AnyAttribute() {
		return (EAttribute)unsignedShortEClass.getEStructuralFeatures().get(5);
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
		anyURIEClass = createEClass(ANY_URI);
		createEAttribute(anyURIEClass, ANY_URI__VALUE);
		createEAttribute(anyURIEClass, ANY_URI__ID);
		createEAttribute(anyURIEClass, ANY_URI__METADATA);
		createEAttribute(anyURIEClass, ANY_URI__REF);
		createEAttribute(anyURIEClass, ANY_URI__RELATIONSHIP_METADATA);
		createEAttribute(anyURIEClass, ANY_URI__ANY_ATTRIBUTE);

		base64BinaryEClass = createEClass(BASE64_BINARY);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__VALUE);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__ID);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__METADATA);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__REF);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__RELATIONSHIP_METADATA);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__ANY_ATTRIBUTE);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);
		createEAttribute(booleanEClass, BOOLEAN__ID);
		createEAttribute(booleanEClass, BOOLEAN__METADATA);
		createEAttribute(booleanEClass, BOOLEAN__REF);
		createEAttribute(booleanEClass, BOOLEAN__RELATIONSHIP_METADATA);
		createEAttribute(booleanEClass, BOOLEAN__ANY_ATTRIBUTE);

		byteEClass = createEClass(BYTE);
		createEAttribute(byteEClass, BYTE__VALUE);
		createEAttribute(byteEClass, BYTE__ID);
		createEAttribute(byteEClass, BYTE__METADATA);
		createEAttribute(byteEClass, BYTE__REF);
		createEAttribute(byteEClass, BYTE__RELATIONSHIP_METADATA);
		createEAttribute(byteEClass, BYTE__ANY_ATTRIBUTE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__VALUE);
		createEAttribute(dateEClass, DATE__ID);
		createEAttribute(dateEClass, DATE__METADATA);
		createEAttribute(dateEClass, DATE__REF);
		createEAttribute(dateEClass, DATE__RELATIONSHIP_METADATA);
		createEAttribute(dateEClass, DATE__ANY_ATTRIBUTE);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__VALUE);
		createEAttribute(dateTimeEClass, DATE_TIME__ID);
		createEAttribute(dateTimeEClass, DATE_TIME__METADATA);
		createEAttribute(dateTimeEClass, DATE_TIME__REF);
		createEAttribute(dateTimeEClass, DATE_TIME__RELATIONSHIP_METADATA);
		createEAttribute(dateTimeEClass, DATE_TIME__ANY_ATTRIBUTE);

		decimalEClass = createEClass(DECIMAL);
		createEAttribute(decimalEClass, DECIMAL__VALUE);
		createEAttribute(decimalEClass, DECIMAL__ID);
		createEAttribute(decimalEClass, DECIMAL__METADATA);
		createEAttribute(decimalEClass, DECIMAL__REF);
		createEAttribute(decimalEClass, DECIMAL__RELATIONSHIP_METADATA);
		createEAttribute(decimalEClass, DECIMAL__ANY_ATTRIBUTE);

		doubleEClass = createEClass(DOUBLE);
		createEAttribute(doubleEClass, DOUBLE__VALUE);
		createEAttribute(doubleEClass, DOUBLE__ID);
		createEAttribute(doubleEClass, DOUBLE__METADATA);
		createEAttribute(doubleEClass, DOUBLE__REF);
		createEAttribute(doubleEClass, DOUBLE__RELATIONSHIP_METADATA);
		createEAttribute(doubleEClass, DOUBLE__ANY_ATTRIBUTE);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__ID);
		createEAttribute(durationEClass, DURATION__METADATA);
		createEAttribute(durationEClass, DURATION__REF);
		createEAttribute(durationEClass, DURATION__RELATIONSHIP_METADATA);
		createEAttribute(durationEClass, DURATION__ANY_ATTRIBUTE);

		floatEClass = createEClass(FLOAT);
		createEAttribute(floatEClass, FLOAT__VALUE);
		createEAttribute(floatEClass, FLOAT__ID);
		createEAttribute(floatEClass, FLOAT__METADATA);
		createEAttribute(floatEClass, FLOAT__REF);
		createEAttribute(floatEClass, FLOAT__RELATIONSHIP_METADATA);
		createEAttribute(floatEClass, FLOAT__ANY_ATTRIBUTE);

		gDayEClass = createEClass(GDAY);
		createEAttribute(gDayEClass, GDAY__VALUE);
		createEAttribute(gDayEClass, GDAY__ID);
		createEAttribute(gDayEClass, GDAY__METADATA);
		createEAttribute(gDayEClass, GDAY__REF);
		createEAttribute(gDayEClass, GDAY__RELATIONSHIP_METADATA);
		createEAttribute(gDayEClass, GDAY__ANY_ATTRIBUTE);

		gMonthEClass = createEClass(GMONTH);
		createEAttribute(gMonthEClass, GMONTH__VALUE);
		createEAttribute(gMonthEClass, GMONTH__ID);
		createEAttribute(gMonthEClass, GMONTH__METADATA);
		createEAttribute(gMonthEClass, GMONTH__REF);
		createEAttribute(gMonthEClass, GMONTH__RELATIONSHIP_METADATA);
		createEAttribute(gMonthEClass, GMONTH__ANY_ATTRIBUTE);

		gMonthDayEClass = createEClass(GMONTH_DAY);
		createEAttribute(gMonthDayEClass, GMONTH_DAY__VALUE);
		createEAttribute(gMonthDayEClass, GMONTH_DAY__ID);
		createEAttribute(gMonthDayEClass, GMONTH_DAY__METADATA);
		createEAttribute(gMonthDayEClass, GMONTH_DAY__REF);
		createEAttribute(gMonthDayEClass, GMONTH_DAY__RELATIONSHIP_METADATA);
		createEAttribute(gMonthDayEClass, GMONTH_DAY__ANY_ATTRIBUTE);

		gYearEClass = createEClass(GYEAR);
		createEAttribute(gYearEClass, GYEAR__VALUE);
		createEAttribute(gYearEClass, GYEAR__ID);
		createEAttribute(gYearEClass, GYEAR__METADATA);
		createEAttribute(gYearEClass, GYEAR__REF);
		createEAttribute(gYearEClass, GYEAR__RELATIONSHIP_METADATA);
		createEAttribute(gYearEClass, GYEAR__ANY_ATTRIBUTE);

		gYearMonthEClass = createEClass(GYEAR_MONTH);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__VALUE);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__ID);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__METADATA);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__REF);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__RELATIONSHIP_METADATA);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__ANY_ATTRIBUTE);

		hexBinaryEClass = createEClass(HEX_BINARY);
		createEAttribute(hexBinaryEClass, HEX_BINARY__VALUE);
		createEAttribute(hexBinaryEClass, HEX_BINARY__ID);
		createEAttribute(hexBinaryEClass, HEX_BINARY__METADATA);
		createEAttribute(hexBinaryEClass, HEX_BINARY__REF);
		createEAttribute(hexBinaryEClass, HEX_BINARY__RELATIONSHIP_METADATA);
		createEAttribute(hexBinaryEClass, HEX_BINARY__ANY_ATTRIBUTE);

		intEClass = createEClass(INT);
		createEAttribute(intEClass, INT__VALUE);
		createEAttribute(intEClass, INT__ID);
		createEAttribute(intEClass, INT__METADATA);
		createEAttribute(intEClass, INT__REF);
		createEAttribute(intEClass, INT__RELATIONSHIP_METADATA);
		createEAttribute(intEClass, INT__ANY_ATTRIBUTE);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);
		createEAttribute(integerEClass, INTEGER__ID);
		createEAttribute(integerEClass, INTEGER__METADATA);
		createEAttribute(integerEClass, INTEGER__REF);
		createEAttribute(integerEClass, INTEGER__RELATIONSHIP_METADATA);
		createEAttribute(integerEClass, INTEGER__ANY_ATTRIBUTE);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__VALUE);
		createEAttribute(languageEClass, LANGUAGE__ID);
		createEAttribute(languageEClass, LANGUAGE__METADATA);
		createEAttribute(languageEClass, LANGUAGE__REF);
		createEAttribute(languageEClass, LANGUAGE__RELATIONSHIP_METADATA);
		createEAttribute(languageEClass, LANGUAGE__ANY_ATTRIBUTE);

		longEClass = createEClass(LONG);
		createEAttribute(longEClass, LONG__VALUE);
		createEAttribute(longEClass, LONG__ID);
		createEAttribute(longEClass, LONG__METADATA);
		createEAttribute(longEClass, LONG__REF);
		createEAttribute(longEClass, LONG__RELATIONSHIP_METADATA);
		createEAttribute(longEClass, LONG__ANY_ATTRIBUTE);

		negativeIntegerEClass = createEClass(NEGATIVE_INTEGER);
		createEAttribute(negativeIntegerEClass, NEGATIVE_INTEGER__VALUE);
		createEAttribute(negativeIntegerEClass, NEGATIVE_INTEGER__ID);
		createEAttribute(negativeIntegerEClass, NEGATIVE_INTEGER__METADATA);
		createEAttribute(negativeIntegerEClass, NEGATIVE_INTEGER__REF);
		createEAttribute(negativeIntegerEClass, NEGATIVE_INTEGER__RELATIONSHIP_METADATA);
		createEAttribute(negativeIntegerEClass, NEGATIVE_INTEGER__ANY_ATTRIBUTE);

		nonNegativeIntegerEClass = createEClass(NON_NEGATIVE_INTEGER);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__VALUE);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__ID);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__METADATA);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__REF);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__RELATIONSHIP_METADATA);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__ANY_ATTRIBUTE);

		nonPositiveIntegerEClass = createEClass(NON_POSITIVE_INTEGER);
		createEAttribute(nonPositiveIntegerEClass, NON_POSITIVE_INTEGER__VALUE);
		createEAttribute(nonPositiveIntegerEClass, NON_POSITIVE_INTEGER__ID);
		createEAttribute(nonPositiveIntegerEClass, NON_POSITIVE_INTEGER__METADATA);
		createEAttribute(nonPositiveIntegerEClass, NON_POSITIVE_INTEGER__REF);
		createEAttribute(nonPositiveIntegerEClass, NON_POSITIVE_INTEGER__RELATIONSHIP_METADATA);
		createEAttribute(nonPositiveIntegerEClass, NON_POSITIVE_INTEGER__ANY_ATTRIBUTE);

		normalizedStringEClass = createEClass(NORMALIZED_STRING);
		createEAttribute(normalizedStringEClass, NORMALIZED_STRING__VALUE);
		createEAttribute(normalizedStringEClass, NORMALIZED_STRING__ID);
		createEAttribute(normalizedStringEClass, NORMALIZED_STRING__METADATA);
		createEAttribute(normalizedStringEClass, NORMALIZED_STRING__REF);
		createEAttribute(normalizedStringEClass, NORMALIZED_STRING__RELATIONSHIP_METADATA);
		createEAttribute(normalizedStringEClass, NORMALIZED_STRING__ANY_ATTRIBUTE);

		positiveIntegerEClass = createEClass(POSITIVE_INTEGER);
		createEAttribute(positiveIntegerEClass, POSITIVE_INTEGER__VALUE);
		createEAttribute(positiveIntegerEClass, POSITIVE_INTEGER__ID);
		createEAttribute(positiveIntegerEClass, POSITIVE_INTEGER__METADATA);
		createEAttribute(positiveIntegerEClass, POSITIVE_INTEGER__REF);
		createEAttribute(positiveIntegerEClass, POSITIVE_INTEGER__RELATIONSHIP_METADATA);
		createEAttribute(positiveIntegerEClass, POSITIVE_INTEGER__ANY_ATTRIBUTE);

		shortEClass = createEClass(SHORT);
		createEAttribute(shortEClass, SHORT__VALUE);
		createEAttribute(shortEClass, SHORT__ID);
		createEAttribute(shortEClass, SHORT__METADATA);
		createEAttribute(shortEClass, SHORT__REF);
		createEAttribute(shortEClass, SHORT__RELATIONSHIP_METADATA);
		createEAttribute(shortEClass, SHORT__ANY_ATTRIBUTE);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);
		createEAttribute(stringEClass, STRING__ID);
		createEAttribute(stringEClass, STRING__METADATA);
		createEAttribute(stringEClass, STRING__REF);
		createEAttribute(stringEClass, STRING__RELATIONSHIP_METADATA);
		createEAttribute(stringEClass, STRING__ANY_ATTRIBUTE);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);
		createEAttribute(timeEClass, TIME__ID);
		createEAttribute(timeEClass, TIME__METADATA);
		createEAttribute(timeEClass, TIME__REF);
		createEAttribute(timeEClass, TIME__RELATIONSHIP_METADATA);
		createEAttribute(timeEClass, TIME__ANY_ATTRIBUTE);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__VALUE);
		createEAttribute(tokenEClass, TOKEN__ID);
		createEAttribute(tokenEClass, TOKEN__METADATA);
		createEAttribute(tokenEClass, TOKEN__REF);
		createEAttribute(tokenEClass, TOKEN__RELATIONSHIP_METADATA);
		createEAttribute(tokenEClass, TOKEN__ANY_ATTRIBUTE);

		unsignedByteEClass = createEClass(UNSIGNED_BYTE);
		createEAttribute(unsignedByteEClass, UNSIGNED_BYTE__VALUE);
		createEAttribute(unsignedByteEClass, UNSIGNED_BYTE__ID);
		createEAttribute(unsignedByteEClass, UNSIGNED_BYTE__METADATA);
		createEAttribute(unsignedByteEClass, UNSIGNED_BYTE__REF);
		createEAttribute(unsignedByteEClass, UNSIGNED_BYTE__RELATIONSHIP_METADATA);
		createEAttribute(unsignedByteEClass, UNSIGNED_BYTE__ANY_ATTRIBUTE);

		unsignedIntEClass = createEClass(UNSIGNED_INT);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__VALUE);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__ID);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__METADATA);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__REF);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__RELATIONSHIP_METADATA);
		createEAttribute(unsignedIntEClass, UNSIGNED_INT__ANY_ATTRIBUTE);

		unsignedLongEClass = createEClass(UNSIGNED_LONG);
		createEAttribute(unsignedLongEClass, UNSIGNED_LONG__VALUE);
		createEAttribute(unsignedLongEClass, UNSIGNED_LONG__ID);
		createEAttribute(unsignedLongEClass, UNSIGNED_LONG__METADATA);
		createEAttribute(unsignedLongEClass, UNSIGNED_LONG__REF);
		createEAttribute(unsignedLongEClass, UNSIGNED_LONG__RELATIONSHIP_METADATA);
		createEAttribute(unsignedLongEClass, UNSIGNED_LONG__ANY_ATTRIBUTE);

		unsignedShortEClass = createEClass(UNSIGNED_SHORT);
		createEAttribute(unsignedShortEClass, UNSIGNED_SHORT__VALUE);
		createEAttribute(unsignedShortEClass, UNSIGNED_SHORT__ID);
		createEAttribute(unsignedShortEClass, UNSIGNED_SHORT__METADATA);
		createEAttribute(unsignedShortEClass, UNSIGNED_SHORT__REF);
		createEAttribute(unsignedShortEClass, UNSIGNED_SHORT__RELATIONSHIP_METADATA);
		createEAttribute(unsignedShortEClass, UNSIGNED_SHORT__ANY_ATTRIBUTE);
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
		initEClass(anyURIEClass, AnyURI.class, "AnyURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnyURI_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyURI_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyURI_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyURI_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyURI_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyURI_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64BinaryEClass, Base64Binary.class, "Base64Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Binary_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byteEClass, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, "Byte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByte_Value(), theXMLTypePackage.getByte(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getByte_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getByte_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getByte_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getByte_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getByte_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Byte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalEClass, Decimal.class, "Decimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimal_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleEClass, gov.niem.release.niem.proxy.xsd._3._0.Double.class, "Double", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDouble_Value(), theXMLTypePackage.getDouble(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDouble_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDouble_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDouble_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDouble_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDouble_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Double.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), theXMLTypePackage.getDuration(), "value", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatEClass, gov.niem.release.niem.proxy.xsd._3._0.Float.class, "Float", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloat_Value(), theXMLTypePackage.getFloat(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloat_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Float.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gDayEClass, GDay.class, "GDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGDay_Value(), theXMLTypePackage.getGDay(), "value", null, 0, 1, GDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGDay_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGDay_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGDay_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, GDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGDay_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, GDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGDay_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gMonthEClass, GMonth.class, "GMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGMonth_Value(), theXMLTypePackage.getGMonth(), "value", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gMonthDayEClass, GMonthDay.class, "GMonthDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGMonthDay_Value(), theXMLTypePackage.getGMonthDay(), "value", null, 0, 1, GMonthDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonthDay_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GMonthDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonthDay_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GMonthDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonthDay_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, GMonthDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonthDay_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, GMonthDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonthDay_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GMonthDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gYearEClass, GYear.class, "GYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGYear_Value(), theXMLTypePackage.getGYear(), "value", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gYearMonthEClass, GYearMonth.class, "GYearMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGYearMonth_Value(), theXMLTypePackage.getGYearMonth(), "value", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexBinaryEClass, HexBinary.class, "HexBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexBinary_Value(), theXMLTypePackage.getHexBinary(), "value", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intEClass, Int.class, "Int", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInt_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInt_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), theXMLTypePackage.getInteger(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Value(), theXMLTypePackage.getLanguage(), "value", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longEClass, gov.niem.release.niem.proxy.xsd._3._0.Long.class, "Long", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLong_Value(), theXMLTypePackage.getLong(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Long.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLong_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Long.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLong_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Long.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLong_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Long.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLong_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Long.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLong_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Long.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(negativeIntegerEClass, NegativeInteger.class, "NegativeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNegativeInteger_Value(), theXMLTypePackage.getNegativeInteger(), "value", null, 0, 1, NegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNegativeInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, NegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNegativeInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, NegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNegativeInteger_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, NegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNegativeInteger_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, NegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNegativeInteger_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonNegativeIntegerEClass, NonNegativeInteger.class, "NonNegativeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonNegativeInteger_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPositiveIntegerEClass, NonPositiveInteger.class, "NonPositiveInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonPositiveInteger_Value(), theXMLTypePackage.getNonPositiveInteger(), "value", null, 0, 1, NonPositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPositiveInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, NonPositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPositiveInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, NonPositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPositiveInteger_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, NonPositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPositiveInteger_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, NonPositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonPositiveInteger_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NonPositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(normalizedStringEClass, NormalizedString.class, "NormalizedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNormalizedString_Value(), theXMLTypePackage.getNormalizedString(), "value", null, 0, 1, NormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizedString_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, NormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizedString_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, NormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizedString_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, NormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizedString_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, NormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNormalizedString_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NormalizedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positiveIntegerEClass, PositiveInteger.class, "PositiveInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositiveInteger_Value(), theXMLTypePackage.getPositiveInteger(), "value", null, 0, 1, PositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositiveInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositiveInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, PositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositiveInteger_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, PositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositiveInteger_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, PositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositiveInteger_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PositiveInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortEClass, gov.niem.release.niem.proxy.xsd._3._0.Short.class, "Short", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShort_Value(), theXMLTypePackage.getShort(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShort_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShort_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShort_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShort_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShort_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.Short.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEClass, gov.niem.release.niem.proxy.xsd._3._0.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, gov.niem.release.niem.proxy.xsd._3._0.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, gov.niem.release.niem.proxy.xsd._3._0.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), theXMLTypePackage.getTime(), "value", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedByteEClass, UnsignedByte.class, "UnsignedByte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsignedByte_Value(), theXMLTypePackage.getUnsignedByte(), "value", null, 0, 1, UnsignedByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedByte_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UnsignedByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedByte_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, UnsignedByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedByte_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, UnsignedByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedByte_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, UnsignedByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedByte_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UnsignedByte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedIntEClass, UnsignedInt.class, "UnsignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsignedInt_Value(), theXMLTypePackage.getUnsignedInt(), "value", null, 0, 1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedInt_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedInt_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedInt_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedInt_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedInt_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UnsignedInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedLongEClass, UnsignedLong.class, "UnsignedLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsignedLong_Value(), theXMLTypePackage.getUnsignedLong(), "value", null, 0, 1, UnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedLong_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedLong_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, UnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedLong_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, UnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedLong_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, UnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedLong_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UnsignedLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedShortEClass, UnsignedShort.class, "UnsignedShort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnsignedShort_Value(), theXMLTypePackage.getUnsignedShort(), "value", null, 0, 1, UnsignedShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedShort_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UnsignedShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedShort_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, UnsignedShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedShort_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, UnsignedShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedShort_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, UnsignedShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsignedShort_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, UnsignedShort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://release.niem.gov/niem/conformanceTargets/3.0/
		create_3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (anyURIEClass, 
		   source, 
		   new String[] {
			 "name", "anyURI",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAnyURI_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getAnyURI_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getAnyURI_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getAnyURI_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getAnyURI_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getAnyURI_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (base64BinaryEClass, 
		   source, 
		   new String[] {
			 "name", "base64Binary",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBase64Binary_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBase64Binary_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBase64Binary_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBase64Binary_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBase64Binary_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBase64Binary_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (booleanEClass, 
		   source, 
		   new String[] {
			 "name", "boolean",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBoolean_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBoolean_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBoolean_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBoolean_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBoolean_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getBoolean_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (byteEClass, 
		   source, 
		   new String[] {
			 "name", "byte",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getByte_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getByte_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getByte_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getByte_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getByte_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getByte_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (dateEClass, 
		   source, 
		   new String[] {
			 "name", "date",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDate_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDate_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDate_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDate_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDate_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDate_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (dateTimeEClass, 
		   source, 
		   new String[] {
			 "name", "dateTime",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDateTime_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDateTime_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDateTime_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDateTime_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDateTime_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDateTime_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (decimalEClass, 
		   source, 
		   new String[] {
			 "name", "decimal",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDecimal_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDecimal_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDecimal_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDecimal_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDecimal_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDecimal_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (doubleEClass, 
		   source, 
		   new String[] {
			 "name", "double",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDouble_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDouble_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDouble_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDouble_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDouble_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDouble_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (durationEClass, 
		   source, 
		   new String[] {
			 "name", "duration",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDuration_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDuration_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDuration_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDuration_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDuration_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDuration_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (floatEClass, 
		   source, 
		   new String[] {
			 "name", "float",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFloat_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getFloat_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getFloat_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getFloat_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getFloat_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (gDayEClass, 
		   source, 
		   new String[] {
			 "name", "gDay",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGDay_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGDay_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGDay_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGDay_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGDay_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGDay_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (gMonthEClass, 
		   source, 
		   new String[] {
			 "name", "gMonth",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGMonth_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGMonth_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonth_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonth_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonth_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonth_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (gMonthDayEClass, 
		   source, 
		   new String[] {
			 "name", "gMonthDay",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGMonthDay_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGMonthDay_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonthDay_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonthDay_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonthDay_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGMonthDay_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (gYearEClass, 
		   source, 
		   new String[] {
			 "name", "gYear",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGYear_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGYear_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYear_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYear_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYear_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYear_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (gYearMonthEClass, 
		   source, 
		   new String[] {
			 "name", "gYearMonth",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGYearMonth_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGYearMonth_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYearMonth_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYearMonth_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYearMonth_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getGYearMonth_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (hexBinaryEClass, 
		   source, 
		   new String[] {
			 "name", "hexBinary",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getHexBinary_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getHexBinary_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getHexBinary_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getHexBinary_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getHexBinary_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getHexBinary_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (intEClass, 
		   source, 
		   new String[] {
			 "name", "int",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInt_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInt_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInt_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInt_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInt_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInt_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (integerEClass, 
		   source, 
		   new String[] {
			 "name", "integer",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInteger_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getInteger_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInteger_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInteger_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getInteger_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (languageEClass, 
		   source, 
		   new String[] {
			 "name", "language",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLanguage_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLanguage_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLanguage_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLanguage_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLanguage_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLanguage_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (longEClass, 
		   source, 
		   new String[] {
			 "name", "long",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLong_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLong_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLong_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLong_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLong_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLong_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (negativeIntegerEClass, 
		   source, 
		   new String[] {
			 "name", "negativeInteger",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNegativeInteger_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNegativeInteger_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNegativeInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNegativeInteger_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNegativeInteger_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNegativeInteger_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (nonNegativeIntegerEClass, 
		   source, 
		   new String[] {
			 "name", "nonNegativeInteger",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNonNegativeInteger_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNonNegativeInteger_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonNegativeInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonNegativeInteger_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonNegativeInteger_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonNegativeInteger_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (nonPositiveIntegerEClass, 
		   source, 
		   new String[] {
			 "name", "nonPositiveInteger",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNonPositiveInteger_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNonPositiveInteger_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonPositiveInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonPositiveInteger_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonPositiveInteger_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNonPositiveInteger_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (normalizedStringEClass, 
		   source, 
		   new String[] {
			 "name", "normalizedString",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNormalizedString_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getNormalizedString_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNormalizedString_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNormalizedString_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNormalizedString_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getNormalizedString_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (positiveIntegerEClass, 
		   source, 
		   new String[] {
			 "name", "positiveInteger",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPositiveInteger_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getPositiveInteger_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPositiveInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPositiveInteger_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPositiveInteger_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getPositiveInteger_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (shortEClass, 
		   source, 
		   new String[] {
			 "name", "short",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getShort_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getShort_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getShort_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getShort_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getShort_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getShort_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (stringEClass, 
		   source, 
		   new String[] {
			 "name", "string",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getString_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getString_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getString_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getString_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getString_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getString_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (timeEClass, 
		   source, 
		   new String[] {
			 "name", "time",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTime_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTime_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTime_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTime_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTime_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTime_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (tokenEClass, 
		   source, 
		   new String[] {
			 "name", "token",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getToken_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getToken_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getToken_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getToken_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getToken_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getToken_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (unsignedByteEClass, 
		   source, 
		   new String[] {
			 "name", "unsignedByte",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedByte_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedByte_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedByte_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedByte_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedByte_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedByte_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (unsignedIntEClass, 
		   source, 
		   new String[] {
			 "name", "unsignedInt",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedInt_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedInt_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedInt_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedInt_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedInt_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedInt_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (unsignedLongEClass, 
		   source, 
		   new String[] {
			 "name", "unsignedLong",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedLong_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedLong_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedLong_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedLong_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedLong_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedLong_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (unsignedShortEClass, 
		   source, 
		   new String[] {
			 "name", "unsignedShort",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedShort_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnsignedShort_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedShort_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedShort_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedShort_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUnsignedShort_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
