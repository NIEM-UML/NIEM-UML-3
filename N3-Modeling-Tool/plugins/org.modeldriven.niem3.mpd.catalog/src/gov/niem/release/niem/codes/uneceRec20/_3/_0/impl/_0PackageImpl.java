/**
 */
package gov.niem.release.niem.codes.uneceRec20._3._0.impl;

import gov.niem.release.niem.codes.uneceRec20._3._0.LengthCodeSimpleType;
import gov.niem.release.niem.codes.uneceRec20._3._0.LengthCodeType;
import gov.niem.release.niem.codes.uneceRec20._3._0.MassCodeSimpleType;
import gov.niem.release.niem.codes.uneceRec20._3._0.MassCodeType;
import gov.niem.release.niem.codes.uneceRec20._3._0.TemperatureUnitCodeSimpleType;
import gov.niem.release.niem.codes.uneceRec20._3._0.TemperatureUnitCodeType;
import gov.niem.release.niem.codes.uneceRec20._3._0.TimeCodeSimpleType;
import gov.niem.release.niem.codes.uneceRec20._3._0.TimeCodeType;
import gov.niem.release.niem.codes.uneceRec20._3._0.VelocityCodeSimpleType;
import gov.niem.release.niem.codes.uneceRec20._3._0.VelocityCodeType;
import gov.niem.release.niem.codes.uneceRec20._3._0.VolumeUnitCodeSimpleType;
import gov.niem.release.niem.codes.uneceRec20._3._0.VolumeUnitCodeType;
import gov.niem.release.niem.codes.uneceRec20._3._0._0Factory;
import gov.niem.release.niem.codes.uneceRec20._3._0._0Package;

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
	private EClass lengthCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temperatureUnitCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass velocityCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeUnitCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum massCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temperatureUnitCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum velocityCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum volumeUnitCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType massCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType temperatureUnitCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType velocityCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeUnitCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.uneceRec20._3._0._0Package#eNS_URI
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
		gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl the_0Package_5 = (gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.coreMisc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl the_0Package_6 = (gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl the_0Package_7 = (gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso4217._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso4217._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso4217._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl the_0Package_8 = (gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.deaCtlsub._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.deaCtlsub._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl the_0Package_9 = (gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaDatum._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl the_0Package_10 = (gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips10._4._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips10._4._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.fips10._4._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl the_0Package_11 = (gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso3166._1._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl the_0Package_12 = (gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl the_0Package_13 = (gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso639._3._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.iso639._3._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.iso639._3._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl the_0Package_14 = (gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dolSoc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.dolSoc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.dolSoc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl the_0Package_15 = (gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.occsFacility._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.occsFacility._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.occsFacility._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.occsFacility._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl the_0Package_16 = (gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.canadaPost._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.canadaPost._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.canadaPost._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl the_0Package_17 = (gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips5._2._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.fips5._2._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.fips5._2._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.fips5._2._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl the_0Package_18 = (gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uspsStates._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uspsStates._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.uspsStates._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl the_0Package_19 = (gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl the_0Package_20 = (gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl the_0Package_21 = (gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.hl7._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl the_0Package_22 = (gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.x.card._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.x.card._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.x.card._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.x.card._3._0._0Package.eINSTANCE);

		// Load packages
		the_0Package_1.loadPackage();
		the_0Package_10.loadPackage();
		the_0Package_13.loadPackage();
		the_0Package_14.loadPackage();
		the_0Package_15.loadPackage();

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
		the_0Package_9.createPackageContents();
		the_0Package_11.createPackageContents();
		the_0Package_12.createPackageContents();
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
		the_0Package_9.initializePackageContents();
		the_0Package_11.initializePackageContents();
		the_0Package_12.initializePackageContents();
		the_0Package_16.initializePackageContents();
		the_0Package_17.initializePackageContents();
		the_0Package_18.initializePackageContents();
		the_0Package_19.initializePackageContents();
		the_0Package_20.initializePackageContents();
		the_0Package_21.initializePackageContents();
		the_0Package_22.initializePackageContents();

		// Fix loaded packages
		the_0Package_1.fixPackageContents();
		the_0Package_10.fixPackageContents();
		the_0Package_13.fixPackageContents();
		the_0Package_14.fixPackageContents();
		the_0Package_15.fixPackageContents();

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
	public EClass getLengthCodeType() {
		return lengthCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthCodeType_Value() {
		return (EAttribute)lengthCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthCodeType_Id() {
		return (EAttribute)lengthCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthCodeType_Metadata() {
		return (EAttribute)lengthCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthCodeType_Ref() {
		return (EAttribute)lengthCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthCodeType_RelationshipMetadata() {
		return (EAttribute)lengthCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLengthCodeType_AnyAttribute() {
		return (EAttribute)lengthCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMassCodeType() {
		return massCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassCodeType_Value() {
		return (EAttribute)massCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassCodeType_Id() {
		return (EAttribute)massCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassCodeType_Metadata() {
		return (EAttribute)massCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassCodeType_Ref() {
		return (EAttribute)massCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassCodeType_RelationshipMetadata() {
		return (EAttribute)massCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMassCodeType_AnyAttribute() {
		return (EAttribute)massCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemperatureUnitCodeType() {
		return temperatureUnitCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureUnitCodeType_Value() {
		return (EAttribute)temperatureUnitCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureUnitCodeType_Id() {
		return (EAttribute)temperatureUnitCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureUnitCodeType_Metadata() {
		return (EAttribute)temperatureUnitCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureUnitCodeType_Ref() {
		return (EAttribute)temperatureUnitCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureUnitCodeType_RelationshipMetadata() {
		return (EAttribute)temperatureUnitCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemperatureUnitCodeType_AnyAttribute() {
		return (EAttribute)temperatureUnitCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCodeType() {
		return timeCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCodeType_Value() {
		return (EAttribute)timeCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCodeType_Id() {
		return (EAttribute)timeCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCodeType_Metadata() {
		return (EAttribute)timeCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCodeType_Ref() {
		return (EAttribute)timeCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCodeType_RelationshipMetadata() {
		return (EAttribute)timeCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCodeType_AnyAttribute() {
		return (EAttribute)timeCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVelocityCodeType() {
		return velocityCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityCodeType_Value() {
		return (EAttribute)velocityCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityCodeType_Id() {
		return (EAttribute)velocityCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityCodeType_Metadata() {
		return (EAttribute)velocityCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityCodeType_Ref() {
		return (EAttribute)velocityCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityCodeType_RelationshipMetadata() {
		return (EAttribute)velocityCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVelocityCodeType_AnyAttribute() {
		return (EAttribute)velocityCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolumeUnitCodeType() {
		return volumeUnitCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeUnitCodeType_Value() {
		return (EAttribute)volumeUnitCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeUnitCodeType_Id() {
		return (EAttribute)volumeUnitCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeUnitCodeType_Metadata() {
		return (EAttribute)volumeUnitCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeUnitCodeType_Ref() {
		return (EAttribute)volumeUnitCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeUnitCodeType_RelationshipMetadata() {
		return (EAttribute)volumeUnitCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolumeUnitCodeType_AnyAttribute() {
		return (EAttribute)volumeUnitCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthCodeSimpleType() {
		return lengthCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMassCodeSimpleType() {
		return massCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTemperatureUnitCodeSimpleType() {
		return temperatureUnitCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeCodeSimpleType() {
		return timeCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVelocityCodeSimpleType() {
		return velocityCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVolumeUnitCodeSimpleType() {
		return volumeUnitCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLengthCodeSimpleTypeObject() {
		return lengthCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMassCodeSimpleTypeObject() {
		return massCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTemperatureUnitCodeSimpleTypeObject() {
		return temperatureUnitCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeCodeSimpleTypeObject() {
		return timeCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVelocityCodeSimpleTypeObject() {
		return velocityCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVolumeUnitCodeSimpleTypeObject() {
		return volumeUnitCodeSimpleTypeObjectEDataType;
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
		lengthCodeTypeEClass = createEClass(LENGTH_CODE_TYPE);
		createEAttribute(lengthCodeTypeEClass, LENGTH_CODE_TYPE__VALUE);
		createEAttribute(lengthCodeTypeEClass, LENGTH_CODE_TYPE__ID);
		createEAttribute(lengthCodeTypeEClass, LENGTH_CODE_TYPE__METADATA);
		createEAttribute(lengthCodeTypeEClass, LENGTH_CODE_TYPE__REF);
		createEAttribute(lengthCodeTypeEClass, LENGTH_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(lengthCodeTypeEClass, LENGTH_CODE_TYPE__ANY_ATTRIBUTE);

		massCodeTypeEClass = createEClass(MASS_CODE_TYPE);
		createEAttribute(massCodeTypeEClass, MASS_CODE_TYPE__VALUE);
		createEAttribute(massCodeTypeEClass, MASS_CODE_TYPE__ID);
		createEAttribute(massCodeTypeEClass, MASS_CODE_TYPE__METADATA);
		createEAttribute(massCodeTypeEClass, MASS_CODE_TYPE__REF);
		createEAttribute(massCodeTypeEClass, MASS_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(massCodeTypeEClass, MASS_CODE_TYPE__ANY_ATTRIBUTE);

		temperatureUnitCodeTypeEClass = createEClass(TEMPERATURE_UNIT_CODE_TYPE);
		createEAttribute(temperatureUnitCodeTypeEClass, TEMPERATURE_UNIT_CODE_TYPE__VALUE);
		createEAttribute(temperatureUnitCodeTypeEClass, TEMPERATURE_UNIT_CODE_TYPE__ID);
		createEAttribute(temperatureUnitCodeTypeEClass, TEMPERATURE_UNIT_CODE_TYPE__METADATA);
		createEAttribute(temperatureUnitCodeTypeEClass, TEMPERATURE_UNIT_CODE_TYPE__REF);
		createEAttribute(temperatureUnitCodeTypeEClass, TEMPERATURE_UNIT_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(temperatureUnitCodeTypeEClass, TEMPERATURE_UNIT_CODE_TYPE__ANY_ATTRIBUTE);

		timeCodeTypeEClass = createEClass(TIME_CODE_TYPE);
		createEAttribute(timeCodeTypeEClass, TIME_CODE_TYPE__VALUE);
		createEAttribute(timeCodeTypeEClass, TIME_CODE_TYPE__ID);
		createEAttribute(timeCodeTypeEClass, TIME_CODE_TYPE__METADATA);
		createEAttribute(timeCodeTypeEClass, TIME_CODE_TYPE__REF);
		createEAttribute(timeCodeTypeEClass, TIME_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(timeCodeTypeEClass, TIME_CODE_TYPE__ANY_ATTRIBUTE);

		velocityCodeTypeEClass = createEClass(VELOCITY_CODE_TYPE);
		createEAttribute(velocityCodeTypeEClass, VELOCITY_CODE_TYPE__VALUE);
		createEAttribute(velocityCodeTypeEClass, VELOCITY_CODE_TYPE__ID);
		createEAttribute(velocityCodeTypeEClass, VELOCITY_CODE_TYPE__METADATA);
		createEAttribute(velocityCodeTypeEClass, VELOCITY_CODE_TYPE__REF);
		createEAttribute(velocityCodeTypeEClass, VELOCITY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(velocityCodeTypeEClass, VELOCITY_CODE_TYPE__ANY_ATTRIBUTE);

		volumeUnitCodeTypeEClass = createEClass(VOLUME_UNIT_CODE_TYPE);
		createEAttribute(volumeUnitCodeTypeEClass, VOLUME_UNIT_CODE_TYPE__VALUE);
		createEAttribute(volumeUnitCodeTypeEClass, VOLUME_UNIT_CODE_TYPE__ID);
		createEAttribute(volumeUnitCodeTypeEClass, VOLUME_UNIT_CODE_TYPE__METADATA);
		createEAttribute(volumeUnitCodeTypeEClass, VOLUME_UNIT_CODE_TYPE__REF);
		createEAttribute(volumeUnitCodeTypeEClass, VOLUME_UNIT_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(volumeUnitCodeTypeEClass, VOLUME_UNIT_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		lengthCodeSimpleTypeEEnum = createEEnum(LENGTH_CODE_SIMPLE_TYPE);
		massCodeSimpleTypeEEnum = createEEnum(MASS_CODE_SIMPLE_TYPE);
		temperatureUnitCodeSimpleTypeEEnum = createEEnum(TEMPERATURE_UNIT_CODE_SIMPLE_TYPE);
		timeCodeSimpleTypeEEnum = createEEnum(TIME_CODE_SIMPLE_TYPE);
		velocityCodeSimpleTypeEEnum = createEEnum(VELOCITY_CODE_SIMPLE_TYPE);
		volumeUnitCodeSimpleTypeEEnum = createEEnum(VOLUME_UNIT_CODE_SIMPLE_TYPE);

		// Create data types
		lengthCodeSimpleTypeObjectEDataType = createEDataType(LENGTH_CODE_SIMPLE_TYPE_OBJECT);
		massCodeSimpleTypeObjectEDataType = createEDataType(MASS_CODE_SIMPLE_TYPE_OBJECT);
		temperatureUnitCodeSimpleTypeObjectEDataType = createEDataType(TEMPERATURE_UNIT_CODE_SIMPLE_TYPE_OBJECT);
		timeCodeSimpleTypeObjectEDataType = createEDataType(TIME_CODE_SIMPLE_TYPE_OBJECT);
		velocityCodeSimpleTypeObjectEDataType = createEDataType(VELOCITY_CODE_SIMPLE_TYPE_OBJECT);
		volumeUnitCodeSimpleTypeObjectEDataType = createEDataType(VOLUME_UNIT_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(lengthCodeTypeEClass, LengthCodeType.class, "LengthCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLengthCodeType_Value(), this.getLengthCodeSimpleType(), "value", null, 0, 1, LengthCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LengthCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, LengthCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, LengthCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, LengthCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLengthCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, LengthCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(massCodeTypeEClass, MassCodeType.class, "MassCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMassCodeType_Value(), this.getMassCodeSimpleType(), "value", null, 0, 1, MassCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMassCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MassCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMassCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, MassCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMassCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, MassCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMassCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, MassCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMassCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MassCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temperatureUnitCodeTypeEClass, TemperatureUnitCodeType.class, "TemperatureUnitCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemperatureUnitCodeType_Value(), this.getTemperatureUnitCodeSimpleType(), "value", null, 0, 1, TemperatureUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureUnitCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TemperatureUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureUnitCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, TemperatureUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureUnitCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, TemperatureUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureUnitCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, TemperatureUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemperatureUnitCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TemperatureUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeCodeTypeEClass, TimeCodeType.class, "TimeCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeCodeType_Value(), this.getTimeCodeSimpleType(), "value", null, 0, 1, TimeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TimeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, TimeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, TimeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, TimeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TimeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(velocityCodeTypeEClass, VelocityCodeType.class, "VelocityCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVelocityCodeType_Value(), this.getVelocityCodeSimpleType(), "value", null, 0, 1, VelocityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVelocityCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, VelocityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVelocityCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, VelocityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVelocityCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, VelocityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVelocityCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, VelocityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVelocityCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, VelocityCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeUnitCodeTypeEClass, VolumeUnitCodeType.class, "VolumeUnitCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolumeUnitCodeType_Value(), this.getVolumeUnitCodeSimpleType(), "value", null, 0, 1, VolumeUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeUnitCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, VolumeUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeUnitCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, VolumeUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeUnitCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, VolumeUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeUnitCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, VolumeUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolumeUnitCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, VolumeUnitCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.class, "LengthCodeSimpleType");
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType._4H);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType._77);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.A11);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.A12);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.A45);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.A71);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.AK);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.B57);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.C45);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.C52);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.C63);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.CMT);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.DMT);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.FOT);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.HMT);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.INH);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.KMT);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.M7);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.MMT);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.MTR);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.NMI);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.SMI);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.X1);
		addEEnumLiteral(lengthCodeSimpleTypeEEnum, LengthCodeSimpleType.YRD);

		initEEnum(massCodeSimpleTypeEEnum, MassCodeSimpleType.class, "MassCodeSimpleType");
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType._2U);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.APZ);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.CGM);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.CWA);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.CWI);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.DG);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.DJ);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.DTN);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.GRM);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.GRN);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.HGM);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.KGM);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.KTN);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.LBR);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.LTN);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.MC);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.MGM);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.ONZ);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.STI);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.STN);
		addEEnumLiteral(massCodeSimpleTypeEEnum, MassCodeSimpleType.TNE);

		initEEnum(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.class, "TemperatureUnitCodeSimpleType");
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.A48);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.CEL);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.E98);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.F02);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.F10);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.F11);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.F12);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.F60);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.F61);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.FAH);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.H12);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.H13);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.H14);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J20);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J21);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J23);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J24);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J25);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J26);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J28);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J29);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.J30);
		addEEnumLiteral(temperatureUnitCodeSimpleTypeEEnum, TemperatureUnitCodeSimpleType.N79);

		initEEnum(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.class, "TimeCodeSimpleType");
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.ANN);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.B52);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.B98);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.C26);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.C47);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.D42);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.DAY);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.HUR);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.MIN);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.MON);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.SEC);
		addEEnumLiteral(timeCodeSimpleTypeEEnum, TimeCodeSimpleType.WEE);

		initEEnum(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.class, "VelocityCodeSimpleType");
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType._2M);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType._2X);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.C16);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.FR);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.FS);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.HM);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.IU);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.KMH);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.KNT);
		addEEnumLiteral(velocityCodeSimpleTypeEEnum, VelocityCodeSimpleType.MTS);

		initEEnum(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.class, "VolumeUnitCodeSimpleType");
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType._4G);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType._5I);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.A44);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.BLD);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.BLL);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.BUA);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.BUI);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.CLT);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.CMQ);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.DLT);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.DMA);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.DMQ);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.FTQ);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G21);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G23);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G24);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G25);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G26);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G94);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G95);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G96);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.G97);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.GLD);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.GLI);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.GLL);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.H19);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.H20);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.HLT);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.INQ);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.J57);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.K21);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.K23);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.K6);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.L43);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.L61);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.L62);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.L84);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.L86);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.LTR);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M11);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M14);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M67);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M68);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M69);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M70);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.M71);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.MAL);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.MLT);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.MMQ);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.MTQ);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.OZA);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.OZI);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.PT);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.PTD);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.PTI);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.PTL);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.QT);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.QTD);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.QTI);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.QTL);
		addEEnumLiteral(volumeUnitCodeSimpleTypeEEnum, VolumeUnitCodeSimpleType.YDQ);

		// Initialize data types
		initEDataType(lengthCodeSimpleTypeObjectEDataType, LengthCodeSimpleType.class, "LengthCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(massCodeSimpleTypeObjectEDataType, MassCodeSimpleType.class, "MassCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(temperatureUnitCodeSimpleTypeObjectEDataType, TemperatureUnitCodeSimpleType.class, "TemperatureUnitCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeCodeSimpleTypeObjectEDataType, TimeCodeSimpleType.class, "TimeCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(velocityCodeSimpleTypeObjectEDataType, VelocityCodeSimpleType.class, "VelocityCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(volumeUnitCodeSimpleTypeObjectEDataType, VolumeUnitCodeSimpleType.class, "VolumeUnitCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (lengthCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "LengthCodeSimpleType"
		   });																										
		addAnnotation
		  (lengthCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "LengthCodeSimpleType:Object",
			 "baseType", "LengthCodeSimpleType"
		   });			
		addAnnotation
		  (lengthCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LengthCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLengthCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLengthCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLengthCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLengthCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLengthCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getLengthCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (massCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "MassCodeSimpleType"
		   });																							
		addAnnotation
		  (massCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MassCodeSimpleType:Object",
			 "baseType", "MassCodeSimpleType"
		   });			
		addAnnotation
		  (massCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MassCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMassCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMassCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMassCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMassCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMassCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMassCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (temperatureUnitCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TemperatureUnitCodeSimpleType"
		   });																									
		addAnnotation
		  (temperatureUnitCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TemperatureUnitCodeSimpleType:Object",
			 "baseType", "TemperatureUnitCodeSimpleType"
		   });			
		addAnnotation
		  (temperatureUnitCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TemperatureUnitCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTemperatureUnitCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTemperatureUnitCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTemperatureUnitCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTemperatureUnitCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTemperatureUnitCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTemperatureUnitCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (timeCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TimeCodeSimpleType"
		   });														
		addAnnotation
		  (timeCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TimeCodeSimpleType:Object",
			 "baseType", "TimeCodeSimpleType"
		   });			
		addAnnotation
		  (timeCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTimeCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTimeCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTimeCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTimeCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTimeCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTimeCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (velocityCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "VelocityCodeSimpleType"
		   });												
		addAnnotation
		  (velocityCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "VelocityCodeSimpleType:Object",
			 "baseType", "VelocityCodeSimpleType"
		   });			
		addAnnotation
		  (velocityCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VelocityCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getVelocityCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getVelocityCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVelocityCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVelocityCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVelocityCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVelocityCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (volumeUnitCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "VolumeUnitCodeSimpleType"
		   });																																																															
		addAnnotation
		  (volumeUnitCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "VolumeUnitCodeSimpleType:Object",
			 "baseType", "VolumeUnitCodeSimpleType"
		   });			
		addAnnotation
		  (volumeUnitCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VolumeUnitCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getVolumeUnitCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getVolumeUnitCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVolumeUnitCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVolumeUnitCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVolumeUnitCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVolumeUnitCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
