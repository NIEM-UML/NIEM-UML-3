/**
 */
package gov.niem.release.niem.codes.iso3166._1._3._0.impl;

import gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType;
import gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType;
import gov.niem.release.niem.codes.iso3166._1._3._0._0Factory;
import gov.niem.release.niem.codes.iso3166._1._3._0._0Package;

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
	private EClass countryAlpha2CodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum countryAlpha2CodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType countryAlpha2CodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0._0Package#eNS_URI
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
		the_0Package_10.loadPackage();
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
		the_0Package_9.createPackageContents();
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
		the_0Package_9.initializePackageContents();
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
		the_0Package_10.fixPackageContents();
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
	public EClass getCountryAlpha2CodeType() {
		return countryAlpha2CodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha2CodeType_Value() {
		return (EAttribute)countryAlpha2CodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha2CodeType_Id() {
		return (EAttribute)countryAlpha2CodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha2CodeType_Metadata() {
		return (EAttribute)countryAlpha2CodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha2CodeType_Ref() {
		return (EAttribute)countryAlpha2CodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha2CodeType_RelationshipMetadata() {
		return (EAttribute)countryAlpha2CodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountryAlpha2CodeType_AnyAttribute() {
		return (EAttribute)countryAlpha2CodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCountryAlpha2CodeSimpleType() {
		return countryAlpha2CodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCountryAlpha2CodeSimpleTypeObject() {
		return countryAlpha2CodeSimpleTypeObjectEDataType;
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
		countryAlpha2CodeTypeEClass = createEClass(COUNTRY_ALPHA2_CODE_TYPE);
		createEAttribute(countryAlpha2CodeTypeEClass, COUNTRY_ALPHA2_CODE_TYPE__VALUE);
		createEAttribute(countryAlpha2CodeTypeEClass, COUNTRY_ALPHA2_CODE_TYPE__ID);
		createEAttribute(countryAlpha2CodeTypeEClass, COUNTRY_ALPHA2_CODE_TYPE__METADATA);
		createEAttribute(countryAlpha2CodeTypeEClass, COUNTRY_ALPHA2_CODE_TYPE__REF);
		createEAttribute(countryAlpha2CodeTypeEClass, COUNTRY_ALPHA2_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(countryAlpha2CodeTypeEClass, COUNTRY_ALPHA2_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		countryAlpha2CodeSimpleTypeEEnum = createEEnum(COUNTRY_ALPHA2_CODE_SIMPLE_TYPE);

		// Create data types
		countryAlpha2CodeSimpleTypeObjectEDataType = createEDataType(COUNTRY_ALPHA2_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(countryAlpha2CodeTypeEClass, CountryAlpha2CodeType.class, "CountryAlpha2CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountryAlpha2CodeType_Value(), this.getCountryAlpha2CodeSimpleType(), "value", null, 0, 1, CountryAlpha2CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha2CodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CountryAlpha2CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha2CodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, CountryAlpha2CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha2CodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, CountryAlpha2CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha2CodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, CountryAlpha2CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountryAlpha2CodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CountryAlpha2CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.class, "CountryAlpha2CodeSimpleType");
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AQ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AX);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.AZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BB);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BJ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BQ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BV);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.BZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CV);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CX);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.CZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.DE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.DJ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.DK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.DM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.DO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.DZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.EC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.EE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.EG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.EH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ER);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ES);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ET);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.FI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.FJ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.FK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.FM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.FO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.FR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GB);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GP);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GQ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.GY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.HK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.HM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.HN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.HR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.HT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.HU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ID);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IQ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.IT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.JE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.JM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.JO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.JP);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KP);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.KZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LB);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LV);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.LY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ME);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ML);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MP);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MQ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MV);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MX);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.MZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NP);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.NZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.OM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.PY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.QA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.RE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.RO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.RS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.RU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.RW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SB);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SJ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ST);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SV);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SX);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.SZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TD);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TH);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TJ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TK);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TL);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TO);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TR);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TV);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TW);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.TZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.UA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.UG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.UM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.US);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.UY);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.UZ);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VC);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VG);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VI);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VN);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.VU);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.WF);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.WS);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.YE);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.YT);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ZA);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ZM);
		addEEnumLiteral(countryAlpha2CodeSimpleTypeEEnum, CountryAlpha2CodeSimpleType.ZW);

		// Initialize data types
		initEDataType(countryAlpha2CodeSimpleTypeObjectEDataType, CountryAlpha2CodeSimpleType.class, "CountryAlpha2CodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
			 "appinfo", "\r\n      <term:LocalTerm definition=\"Two-letter\" term=\"Alpha2\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm definition=\"Three-letter\" term=\"Alpha3\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    "
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
		  (countryAlpha2CodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CountryAlpha2CodeSimpleType"
		   });																																																																																																																																																																																																																																																											
		addAnnotation
		  (countryAlpha2CodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CountryAlpha2CodeSimpleType:Object",
			 "baseType", "CountryAlpha2CodeSimpleType"
		   });			
		addAnnotation
		  (countryAlpha2CodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CountryAlpha2CodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCountryAlpha2CodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCountryAlpha2CodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha2CodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha2CodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha2CodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCountryAlpha2CodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
