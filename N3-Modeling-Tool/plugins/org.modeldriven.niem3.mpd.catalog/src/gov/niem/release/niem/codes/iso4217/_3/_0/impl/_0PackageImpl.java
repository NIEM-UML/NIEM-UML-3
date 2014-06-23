/**
 */
package gov.niem.release.niem.codes.iso4217._3._0.impl;

import gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType;
import gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType;
import gov.niem.release.niem.codes.iso4217._3._0._0Factory;
import gov.niem.release.niem.codes.iso4217._3._0._0Package;

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
	private EClass currencyCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum currencyCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType currencyCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.iso4217._3._0._0Package#eNS_URI
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
	public EClass getCurrencyCodeType() {
		return currencyCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyCodeType_Value() {
		return (EAttribute)currencyCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyCodeType_Id() {
		return (EAttribute)currencyCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyCodeType_Metadata() {
		return (EAttribute)currencyCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyCodeType_Ref() {
		return (EAttribute)currencyCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyCodeType_RelationshipMetadata() {
		return (EAttribute)currencyCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrencyCodeType_AnyAttribute() {
		return (EAttribute)currencyCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCurrencyCodeSimpleType() {
		return currencyCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCurrencyCodeSimpleTypeObject() {
		return currencyCodeSimpleTypeObjectEDataType;
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
		currencyCodeTypeEClass = createEClass(CURRENCY_CODE_TYPE);
		createEAttribute(currencyCodeTypeEClass, CURRENCY_CODE_TYPE__VALUE);
		createEAttribute(currencyCodeTypeEClass, CURRENCY_CODE_TYPE__ID);
		createEAttribute(currencyCodeTypeEClass, CURRENCY_CODE_TYPE__METADATA);
		createEAttribute(currencyCodeTypeEClass, CURRENCY_CODE_TYPE__REF);
		createEAttribute(currencyCodeTypeEClass, CURRENCY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(currencyCodeTypeEClass, CURRENCY_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		currencyCodeSimpleTypeEEnum = createEEnum(CURRENCY_CODE_SIMPLE_TYPE);

		// Create data types
		currencyCodeSimpleTypeObjectEDataType = createEDataType(CURRENCY_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(currencyCodeTypeEClass, CurrencyCodeType.class, "CurrencyCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrencyCodeType_Value(), this.getCurrencyCodeSimpleType(), "value", null, 0, 1, CurrencyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CurrencyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, CurrencyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, CurrencyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, CurrencyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrencyCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, CurrencyCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.class, "CurrencyCodeSimpleType");
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AED);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AFN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ALL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AMD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ANG);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AOA);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ARS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AUD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AWG);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.AZN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BAM);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BBD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BDT);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BGN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BHD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BIF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BMD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BND);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BOB);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BOV);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BRL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BSD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BTN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BWP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BYR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.BZD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CAD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CDF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CHE);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CHF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CHW);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CLF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CLP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CNY);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.COP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.COU);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CRC);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CUC);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CUP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CVE);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.CZK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.DJF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.DKK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.DOP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.DZD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.EGP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ERN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ETB);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.EUR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.FJD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.FKP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GBP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GEL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GHS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GIP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GMD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GNF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GTQ);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.GYD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.HKD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.HNL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.HRK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.HTG);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.HUF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.IDR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ILS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.INR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.IQD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.IRR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ISK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.JMD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.JOD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.JPY);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KES);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KGS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KHR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KMF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KPW);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KRW);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KWD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KYD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.KZT);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LAK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LBP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LKR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LRD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LSL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LTL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LVL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.LYD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MAD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MDL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MGA);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MKD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MMK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MNT);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MOP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MRO);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MUR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MVR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MWK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MXN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MXV);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MYR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.MZN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.NAD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.NGN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.NIO);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.NOK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.NPR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.NZD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.OMR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PAB);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PEN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PGK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PHP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PKR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PLN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.PYG);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.QAR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.RON);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.RSD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.RUB);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.RWF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SAR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SBD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SCR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SDG);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SEK);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SGD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SHP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SLL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SOS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SRD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SSP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.STD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SVC);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SYP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.SZL);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.THB);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TJS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TMT);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TND);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TOP);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TRY);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TTD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TWD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.TZS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.UAH);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.UGX);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.USD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.USN);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.USS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.UYI);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.UYU);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.UZS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.VEF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.VND);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.VUV);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.WST);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XAF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XAG);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XAU);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XBA);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XBB);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XBC);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XBD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XCD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XDR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XFU);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XOF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XPD);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XPF);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XPT);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XSU);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XTS);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XUA);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.XXX);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.YER);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ZAR);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ZMW);
		addEEnumLiteral(currencyCodeSimpleTypeEEnum, CurrencyCodeSimpleType.ZWL);

		// Initialize data types
		initEDataType(currencyCodeSimpleTypeObjectEDataType, CurrencyCodeSimpleType.class, "CurrencyCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (currencyCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "CurrencyCodeSimpleType"
		   });																																																																																																																																																																																								
		addAnnotation
		  (currencyCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "CurrencyCodeSimpleType:Object",
			 "baseType", "CurrencyCodeSimpleType"
		   });			
		addAnnotation
		  (currencyCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CurrencyCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCurrencyCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCurrencyCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCurrencyCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCurrencyCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCurrencyCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getCurrencyCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
