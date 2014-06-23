/**
 */
package gov.niem.release.niem.codes.x.card._3._0.impl;

import gov.niem.release.niem.codes.x.card._3._0.TelephoneCategoryCodeSimpleType;
import gov.niem.release.niem.codes.x.card._3._0.TelephoneCategoryCodeType;
import gov.niem.release.niem.codes.x.card._3._0._0Factory;
import gov.niem.release.niem.codes.x.card._3._0._0Package;

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
	private EClass telephoneCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telephoneCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType telephoneCategoryCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.x.card._3._0._0Package#eNS_URI
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
		gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl the_0Package_21 = (gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusUscounty._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl the_0Package_22 = (gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.hl7._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.hl7._3._0._0Package.eINSTANCE);

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
	public EClass getTelephoneCategoryCodeType() {
		return telephoneCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneCategoryCodeType_Value() {
		return (EAttribute)telephoneCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneCategoryCodeType_Id() {
		return (EAttribute)telephoneCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneCategoryCodeType_Metadata() {
		return (EAttribute)telephoneCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneCategoryCodeType_Ref() {
		return (EAttribute)telephoneCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)telephoneCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelephoneCategoryCodeType_AnyAttribute() {
		return (EAttribute)telephoneCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTelephoneCategoryCodeSimpleType() {
		return telephoneCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTelephoneCategoryCodeSimpleTypeObject() {
		return telephoneCategoryCodeSimpleTypeObjectEDataType;
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
		telephoneCategoryCodeTypeEClass = createEClass(TELEPHONE_CATEGORY_CODE_TYPE);
		createEAttribute(telephoneCategoryCodeTypeEClass, TELEPHONE_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(telephoneCategoryCodeTypeEClass, TELEPHONE_CATEGORY_CODE_TYPE__ID);
		createEAttribute(telephoneCategoryCodeTypeEClass, TELEPHONE_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(telephoneCategoryCodeTypeEClass, TELEPHONE_CATEGORY_CODE_TYPE__REF);
		createEAttribute(telephoneCategoryCodeTypeEClass, TELEPHONE_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(telephoneCategoryCodeTypeEClass, TELEPHONE_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		telephoneCategoryCodeSimpleTypeEEnum = createEEnum(TELEPHONE_CATEGORY_CODE_SIMPLE_TYPE);

		// Create data types
		telephoneCategoryCodeSimpleTypeObjectEDataType = createEDataType(TELEPHONE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(telephoneCategoryCodeTypeEClass, TelephoneCategoryCodeType.class, "TelephoneCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTelephoneCategoryCodeType_Value(), this.getTelephoneCategoryCodeSimpleType(), "value", null, 0, 1, TelephoneCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TelephoneCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, TelephoneCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, TelephoneCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, TelephoneCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelephoneCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TelephoneCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.class, "TelephoneCategoryCodeSimpleType");
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.CELL);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.FAX);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.HOME);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.PAGER);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.TEXT);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.TEXTPHONE);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.VIDEO);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.VOICE);
		addEEnumLiteral(telephoneCategoryCodeSimpleTypeEEnum, TelephoneCategoryCodeSimpleType.WORK);

		// Initialize data types
		initEDataType(telephoneCategoryCodeSimpleTypeObjectEDataType, TelephoneCategoryCodeSimpleType.class, "TelephoneCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (telephoneCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TelephoneCategoryCodeSimpleType"
		   });											
		addAnnotation
		  (telephoneCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TelephoneCategoryCodeSimpleType:Object",
			 "baseType", "TelephoneCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (telephoneCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TelephoneCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTelephoneCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTelephoneCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTelephoneCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTelephoneCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTelephoneCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getTelephoneCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
