/**
 */
package gov.niem.release.niem.codes.ngaGenc._3._0.impl;

import gov.niem.release.niem.codes.ngaGenc._3._0.CountryAlpha3CodeSimpleType;
import gov.niem.release.niem.codes.ngaGenc._3._0.CountryAlpha3CodeType;
import gov.niem.release.niem.codes.ngaGenc._3._0._0Factory;
import gov.niem.release.niem.codes.ngaGenc._3._0._0Package;

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
	private EClass countryAlpha3CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum countryAlpha3CodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryAlpha3CodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.ngaGenc._3._0._0Package#eNS_URI
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
		gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl the_0Package_19 = (gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.uneceRec20._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.uneceRec20._3._0._0Package.eINSTANCE);
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
	public EClass getCountryAlpha3CodeType() {
		return countryAlpha3CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha3CodeType_Value() {
		return (EAttribute)countryAlpha3CodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha3CodeType_Id() {
		return (EAttribute)countryAlpha3CodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha3CodeType_Metadata() {
		return (EAttribute)countryAlpha3CodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha3CodeType_Ref() {
		return (EAttribute)countryAlpha3CodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha3CodeType_RelationshipMetadata() {
		return (EAttribute)countryAlpha3CodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha3CodeType_AnyAttribute() {
		return (EAttribute)countryAlpha3CodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCountryAlpha3CodeSimpleType() {
		return countryAlpha3CodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountryAlpha3CodeSimpleTypeObject() {
		return countryAlpha3CodeSimpleTypeObjectEDataType;
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
		countryAlpha3CodeTypeEClass = createEClass(COUNTRY_ALPHA3_CODE_TYPE);
		createEAttribute(countryAlpha3CodeTypeEClass, COUNTRY_ALPHA3_CODE_TYPE__VALUE);
		createEAttribute(countryAlpha3CodeTypeEClass, COUNTRY_ALPHA3_CODE_TYPE__ID);
		createEAttribute(countryAlpha3CodeTypeEClass, COUNTRY_ALPHA3_CODE_TYPE__METADATA);
		createEAttribute(countryAlpha3CodeTypeEClass, COUNTRY_ALPHA3_CODE_TYPE__REF);
		createEAttribute(countryAlpha3CodeTypeEClass, COUNTRY_ALPHA3_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(countryAlpha3CodeTypeEClass, COUNTRY_ALPHA3_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		countryAlpha3CodeSimpleTypeEEnum = createEEnum(COUNTRY_ALPHA3_CODE_SIMPLE_TYPE);

		// Create data types
		countryAlpha3CodeSimpleTypeObjectEDataType = createEDataType(COUNTRY_ALPHA3_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(countryAlpha3CodeTypeEClass, CountryAlpha3CodeType.class, "CountryAlpha3CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountryAlpha3CodeType_Value(), this.getCountryAlpha3CodeSimpleType(), "value", null, 0, 1, CountryAlpha3CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha3CodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CountryAlpha3CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha3CodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, CountryAlpha3CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha3CodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, CountryAlpha3CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha3CodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, CountryAlpha3CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha3CodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CountryAlpha3CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.class, "CountryAlpha3CodeSimpleType");
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ABW);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AFG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AGO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AIA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ALB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AND);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ARE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ARG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ARM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ASM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ATA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ATF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ATG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AUS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AUT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AX1);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AX2);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.AZE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BDI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BEL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BEN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BES);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BFA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BGD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BGR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BHR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BHS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BIH);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BLM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BLR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BLZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BMU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BOL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BRA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BRB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BRN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BTN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BVT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.BWA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CAF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CAN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CCK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CHE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CHL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CHN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CIV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CMR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.COD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.COG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.COK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.COL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.COM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CPT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CPV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CRI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CUB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CUW);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CXR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CYM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CYP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.CZE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DEU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DGA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DJI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DMA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DNK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DOM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.DZA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ECU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.EGY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ERI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ESH);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ESP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.EST);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ETH);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.FIN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.FJI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.FLK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.FRA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.FRO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.FSM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GAB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GBR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GEO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GGY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GHA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GIB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GIN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GLP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GMB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GNB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GNQ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GRC);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GRD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GRL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GTM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GUF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GUM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.GUY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.HKG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.HMD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.HND);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.HRV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.HTI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.HUN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IDN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IMN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IND);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IOT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IRL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IRN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.IRQ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ISL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ISR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ITA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.JAM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.JEY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.JOR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.JPN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KAZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KEN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KGZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KHM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KIR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KNA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KOR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.KWT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LAO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LBN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LBR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LBY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LCA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LIE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LKA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LSO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LTU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LUX);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.LVA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MAC);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MAF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MAR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MCO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MDA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MDG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MDV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MEX);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MHL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MKD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MLI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MLT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MMR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MNE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MNG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MNP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MOZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MRT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MSR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MTQ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MUS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MWI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MYS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.MYT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NAM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NCL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NER);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NFK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NGA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NIC);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NIU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NLD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NOR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NPL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NRU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.NZL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.OMN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PAK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PAN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PCN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PER);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PHL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PLW);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PNG);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.POL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PRI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PRK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PRT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PRY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PSE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.PYF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.QAT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.REU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ROU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.RUS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.RWA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SAU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SDN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SEN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SGP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SGS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SHN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SLB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SLE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SLV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SMR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SOM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SPM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SRB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SSD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.STP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SUR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SVK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SVN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SWE);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SWZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SXM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SYC);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.SYR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TCA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TCD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TGO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.THA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TJK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TKL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TKM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TLS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TON);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TTO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TUN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TUR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TUV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TWN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.TZA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.UGA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.UKR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.URY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.USA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.UZB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VAT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VCT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VEN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VGB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VIR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VNM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.VUT);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.WLF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.WSM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XAC);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XAZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XBI);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XBK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XCR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XCS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XCY);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XEU);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XGL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XGZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XHO);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XJA);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XJM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XJN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XJV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XKM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XKN);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XKR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XKS);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XMW);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XNV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XPL);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XPR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XQP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XQZ);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XSP);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XSV);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XTR);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XWB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XWK);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XXD);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.XXX);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.YEM);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ZAF);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ZMB);
		addEEnumLiteral(countryAlpha3CodeSimpleTypeEEnum, CountryAlpha3CodeSimpleType.ZWE);

		// Initialize data types
		initEDataType(countryAlpha3CodeSimpleTypeObjectEDataType, CountryAlpha3CodeSimpleType.class, "CountryAlpha3CodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
			 "appinfo", "\r\n      <term:LocalTerm definition=\"Three-letter\" term=\"Alpha3\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    "
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
		  (countryAlpha3CodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CountryAlpha3CodeSimpleType"
		   });																																																																																																																																																																																																																																																																																												
		addAnnotation
		  (countryAlpha3CodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CountryAlpha3CodeSimpleType:Object",
			 "baseType", "CountryAlpha3CodeSimpleType"
		   });			
		addAnnotation
		  (countryAlpha3CodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CountryAlpha3CodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCountryAlpha3CodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCountryAlpha3CodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha3CodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha3CodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha3CodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha3CodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
