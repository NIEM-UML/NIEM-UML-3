/**
 */
package gov.niem.release.niem.codes.censusUscounty._3._0.impl;

import gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType;
import gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType;
import gov.niem.release.niem.codes.censusUscounty._3._0._0Factory;
import gov.niem.release.niem.codes.censusUscounty._3._0._0Package;

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
	private EClass usCountyCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usCountyCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType usCountyCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0._0Package#eNS_URI
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
		gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl the_0Package_20 = (gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.ngaGenc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.ngaGenc._3._0._0Package.eINSTANCE);
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
	public EClass getUSCountyCodeType() {
		return usCountyCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSCountyCodeType_Value() {
		return (EAttribute)usCountyCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSCountyCodeType_Id() {
		return (EAttribute)usCountyCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSCountyCodeType_Metadata() {
		return (EAttribute)usCountyCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSCountyCodeType_Ref() {
		return (EAttribute)usCountyCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSCountyCodeType_RelationshipMetadata() {
		return (EAttribute)usCountyCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUSCountyCodeType_AnyAttribute() {
		return (EAttribute)usCountyCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUSCountyCodeSimpleType() {
		return usCountyCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUSCountyCodeSimpleTypeObject() {
		return usCountyCodeSimpleTypeObjectEDataType;
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
		usCountyCodeTypeEClass = createEClass(US_COUNTY_CODE_TYPE);
		createEAttribute(usCountyCodeTypeEClass, US_COUNTY_CODE_TYPE__VALUE);
		createEAttribute(usCountyCodeTypeEClass, US_COUNTY_CODE_TYPE__ID);
		createEAttribute(usCountyCodeTypeEClass, US_COUNTY_CODE_TYPE__METADATA);
		createEAttribute(usCountyCodeTypeEClass, US_COUNTY_CODE_TYPE__REF);
		createEAttribute(usCountyCodeTypeEClass, US_COUNTY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(usCountyCodeTypeEClass, US_COUNTY_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		usCountyCodeSimpleTypeEEnum = createEEnum(US_COUNTY_CODE_SIMPLE_TYPE);

		// Create data types
		usCountyCodeSimpleTypeObjectEDataType = createEDataType(US_COUNTY_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(usCountyCodeTypeEClass, USCountyCodeType.class, "USCountyCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUSCountyCodeType_Value(), this.getUSCountyCodeSimpleType(), "value", null, 0, 1, USCountyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSCountyCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, USCountyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSCountyCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, USCountyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSCountyCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, USCountyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSCountyCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, USCountyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUSCountyCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, USCountyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType.class, "USCountyCodeSimpleType");
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._1);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._10);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._100);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._101);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._103);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._105);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._107);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._109);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._11);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._110);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._111);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._113);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._115);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._117);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._119);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._12);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._120);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._121);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._122);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._123);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._125);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._127);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._129);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._13);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._130);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._131);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._133);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._135);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._137);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._139);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._14);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._141);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._143);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._145);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._147);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._149);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._15);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._150);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._151);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._153);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._155);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._157);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._159);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._16);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._161);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._163);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._164);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._165);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._167);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._169);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._17);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._170);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._171);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._173);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._175);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._177);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._179);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._180);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._181);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._183);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._185);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._186);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._187);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._188);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._189);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._19);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._191);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._193);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._195);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._197);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._198);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._199);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._20);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._201);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._203);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._205);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._207);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._209);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._21);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._211);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._213);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._215);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._217);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._219);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._220);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._221);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._223);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._225);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._227);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._229);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._23);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._230);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._231);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._233);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._235);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._237);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._239);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._240);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._241);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._243);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._245);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._247);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._249);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._25);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._251);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._253);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._255);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._257);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._259);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._261);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._263);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._265);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._267);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._269);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._27);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._270);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._271);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._273);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._275);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._277);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._279);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._28);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._281);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._282);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._283);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._285);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._287);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._289);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._29);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._290);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._291);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._293);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._295);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._297);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._299);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._3);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._30);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._300);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._301);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._303);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._305);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._307);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._309);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._31);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._311);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._313);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._315);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._317);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._319);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._321);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._323);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._325);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._327);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._329);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._33);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._331);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._333);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._335);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._337);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._339);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._341);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._343);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._345);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._347);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._349);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._35);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._351);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._353);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._355);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._357);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._359);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._36);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._361);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._363);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._365);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._367);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._369);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._37);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._371);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._373);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._375);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._377);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._379);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._381);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._383);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._385);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._387);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._389);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._39);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._391);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._393);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._395);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._397);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._399);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._40);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._401);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._403);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._405);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._407);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._409);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._41);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._411);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._413);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._415);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._417);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._419);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._421);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._423);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._425);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._427);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._429);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._43);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._431);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._433);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._435);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._437);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._439);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._441);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._443);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._445);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._447);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._449);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._45);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._451);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._453);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._455);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._457);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._459);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._461);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._463);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._465);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._467);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._469);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._47);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._471);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._473);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._475);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._477);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._479);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._481);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._483);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._485);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._487);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._489);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._49);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._491);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._493);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._495);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._497);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._499);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._5);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._50);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._501);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._503);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._505);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._507);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._51);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._510);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._515);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._520);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._53);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._530);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._54);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._540);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._55);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._550);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._57);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._570);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._580);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._59);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._590);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._595);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._6);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._60);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._600);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._61);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._610);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._620);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._63);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._630);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._640);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._65);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._650);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._660);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._67);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._670);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._678);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._68);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._680);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._683);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._685);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._69);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._690);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._7);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._70);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._700);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._71);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._710);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._720);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._73);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._730);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._735);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._740);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._75);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._750);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._760);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._77);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._770);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._775);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._78);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._79);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._790);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._800);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._81);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._810);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._820);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._83);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._830);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._840);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._85);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._86);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._87);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._89);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._9);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._90);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._91);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._93);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._95);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._97);
		addEEnumLiteral(usCountyCodeSimpleTypeEEnum, USCountyCodeSimpleType._99);

		// Initialize data types
		initEDataType(usCountyCodeSimpleTypeObjectEDataType, USCountyCodeSimpleType.class, "USCountyCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (usCountyCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "USCountyCodeSimpleType"
		   });																																																																																																																																																																																																																																																																																																																																												
		addAnnotation
		  (usCountyCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "USCountyCodeSimpleType:Object",
			 "baseType", "USCountyCodeSimpleType"
		   });			
		addAnnotation
		  (usCountyCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "USCountyCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUSCountyCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUSCountyCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUSCountyCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUSCountyCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUSCountyCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getUSCountyCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
