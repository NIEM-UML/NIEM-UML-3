/**
 */
package gov.niem.release.niem.codes.deaCtlsub._3._0.impl;

import gov.niem.release.niem.codes.deaCtlsub._3._0.DEAClassScheduleCodeCodeSimpleType;
import gov.niem.release.niem.codes.deaCtlsub._3._0.DEAClassScheduleCodeCodeType;
import gov.niem.release.niem.codes.deaCtlsub._3._0.DrugCategoryCodeSimpleType;
import gov.niem.release.niem.codes.deaCtlsub._3._0.DrugCategoryCodeType;
import gov.niem.release.niem.codes.deaCtlsub._3._0.DrugCodeSimpleType;
import gov.niem.release.niem.codes.deaCtlsub._3._0.DrugCodeType;
import gov.niem.release.niem.codes.deaCtlsub._3._0._0Factory;
import gov.niem.release.niem.codes.deaCtlsub._3._0._0Package;

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
	private EClass deaClassScheduleCodeCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drugCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deaClassScheduleCodeCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deaClassScheduleCodeCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType drugCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType drugCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.deaCtlsub._3._0._0Package#eNS_URI
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
	public EClass getDEAClassScheduleCodeCodeType() {
		return deaClassScheduleCodeCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAClassScheduleCodeCodeType_Value() {
		return (EAttribute)deaClassScheduleCodeCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAClassScheduleCodeCodeType_Id() {
		return (EAttribute)deaClassScheduleCodeCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAClassScheduleCodeCodeType_Metadata() {
		return (EAttribute)deaClassScheduleCodeCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAClassScheduleCodeCodeType_Ref() {
		return (EAttribute)deaClassScheduleCodeCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAClassScheduleCodeCodeType_RelationshipMetadata() {
		return (EAttribute)deaClassScheduleCodeCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEAClassScheduleCodeCodeType_AnyAttribute() {
		return (EAttribute)deaClassScheduleCodeCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugCategoryCodeType() {
		return drugCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCategoryCodeType_Value() {
		return (EAttribute)drugCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCategoryCodeType_Id() {
		return (EAttribute)drugCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCategoryCodeType_Metadata() {
		return (EAttribute)drugCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCategoryCodeType_Ref() {
		return (EAttribute)drugCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)drugCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCategoryCodeType_AnyAttribute() {
		return (EAttribute)drugCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrugCodeType() {
		return drugCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCodeType_Value() {
		return (EAttribute)drugCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCodeType_Id() {
		return (EAttribute)drugCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCodeType_Metadata() {
		return (EAttribute)drugCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCodeType_Ref() {
		return (EAttribute)drugCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCodeType_RelationshipMetadata() {
		return (EAttribute)drugCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrugCodeType_AnyAttribute() {
		return (EAttribute)drugCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDEAClassScheduleCodeCodeSimpleType() {
		return deaClassScheduleCodeCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugCategoryCodeSimpleType() {
		return drugCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugCodeSimpleType() {
		return drugCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDEAClassScheduleCodeCodeSimpleTypeObject() {
		return deaClassScheduleCodeCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDrugCategoryCodeSimpleTypeObject() {
		return drugCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDrugCodeSimpleTypeObject() {
		return drugCodeSimpleTypeObjectEDataType;
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
		deaClassScheduleCodeCodeTypeEClass = createEClass(DEA_CLASS_SCHEDULE_CODE_CODE_TYPE);
		createEAttribute(deaClassScheduleCodeCodeTypeEClass, DEA_CLASS_SCHEDULE_CODE_CODE_TYPE__VALUE);
		createEAttribute(deaClassScheduleCodeCodeTypeEClass, DEA_CLASS_SCHEDULE_CODE_CODE_TYPE__ID);
		createEAttribute(deaClassScheduleCodeCodeTypeEClass, DEA_CLASS_SCHEDULE_CODE_CODE_TYPE__METADATA);
		createEAttribute(deaClassScheduleCodeCodeTypeEClass, DEA_CLASS_SCHEDULE_CODE_CODE_TYPE__REF);
		createEAttribute(deaClassScheduleCodeCodeTypeEClass, DEA_CLASS_SCHEDULE_CODE_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(deaClassScheduleCodeCodeTypeEClass, DEA_CLASS_SCHEDULE_CODE_CODE_TYPE__ANY_ATTRIBUTE);

		drugCategoryCodeTypeEClass = createEClass(DRUG_CATEGORY_CODE_TYPE);
		createEAttribute(drugCategoryCodeTypeEClass, DRUG_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(drugCategoryCodeTypeEClass, DRUG_CATEGORY_CODE_TYPE__ID);
		createEAttribute(drugCategoryCodeTypeEClass, DRUG_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(drugCategoryCodeTypeEClass, DRUG_CATEGORY_CODE_TYPE__REF);
		createEAttribute(drugCategoryCodeTypeEClass, DRUG_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(drugCategoryCodeTypeEClass, DRUG_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		drugCodeTypeEClass = createEClass(DRUG_CODE_TYPE);
		createEAttribute(drugCodeTypeEClass, DRUG_CODE_TYPE__VALUE);
		createEAttribute(drugCodeTypeEClass, DRUG_CODE_TYPE__ID);
		createEAttribute(drugCodeTypeEClass, DRUG_CODE_TYPE__METADATA);
		createEAttribute(drugCodeTypeEClass, DRUG_CODE_TYPE__REF);
		createEAttribute(drugCodeTypeEClass, DRUG_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(drugCodeTypeEClass, DRUG_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		deaClassScheduleCodeCodeSimpleTypeEEnum = createEEnum(DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE);
		drugCategoryCodeSimpleTypeEEnum = createEEnum(DRUG_CATEGORY_CODE_SIMPLE_TYPE);
		drugCodeSimpleTypeEEnum = createEEnum(DRUG_CODE_SIMPLE_TYPE);

		// Create data types
		deaClassScheduleCodeCodeSimpleTypeObjectEDataType = createEDataType(DEA_CLASS_SCHEDULE_CODE_CODE_SIMPLE_TYPE_OBJECT);
		drugCategoryCodeSimpleTypeObjectEDataType = createEDataType(DRUG_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		drugCodeSimpleTypeObjectEDataType = createEDataType(DRUG_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(deaClassScheduleCodeCodeTypeEClass, DEAClassScheduleCodeCodeType.class, "DEAClassScheduleCodeCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEAClassScheduleCodeCodeType_Value(), this.getDEAClassScheduleCodeCodeSimpleType(), "value", null, 0, 1, DEAClassScheduleCodeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAClassScheduleCodeCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DEAClassScheduleCodeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAClassScheduleCodeCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DEAClassScheduleCodeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAClassScheduleCodeCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, DEAClassScheduleCodeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAClassScheduleCodeCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, DEAClassScheduleCodeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDEAClassScheduleCodeCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DEAClassScheduleCodeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drugCategoryCodeTypeEClass, DrugCategoryCodeType.class, "DrugCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrugCategoryCodeType_Value(), this.getDrugCategoryCodeSimpleType(), "value", null, 0, 1, DrugCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DrugCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DrugCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, DrugCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, DrugCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DrugCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drugCodeTypeEClass, DrugCodeType.class, "DrugCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrugCodeType_Value(), this.getDrugCodeSimpleType(), "value", null, 0, 1, DrugCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DrugCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DrugCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, DrugCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, DrugCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrugCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DrugCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(deaClassScheduleCodeCodeSimpleTypeEEnum, DEAClassScheduleCodeCodeSimpleType.class, "DEAClassScheduleCodeCodeSimpleType");
		addEEnumLiteral(deaClassScheduleCodeCodeSimpleTypeEEnum, DEAClassScheduleCodeCodeSimpleType.I);
		addEEnumLiteral(deaClassScheduleCodeCodeSimpleTypeEEnum, DEAClassScheduleCodeCodeSimpleType.II);
		addEEnumLiteral(deaClassScheduleCodeCodeSimpleTypeEEnum, DEAClassScheduleCodeCodeSimpleType.III);
		addEEnumLiteral(deaClassScheduleCodeCodeSimpleTypeEEnum, DEAClassScheduleCodeCodeSimpleType.IV);
		addEEnumLiteral(deaClassScheduleCodeCodeSimpleTypeEEnum, DEAClassScheduleCodeCodeSimpleType.V);

		initEEnum(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.class, "DrugCategoryCodeSimpleType");
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A5);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A6);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A7);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.A8);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.B1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.B2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.B3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.C1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.C2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.C3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.C4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.C5);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.D1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.D2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.D3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.D4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.E1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.G1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.G2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.G3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.H1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.H2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.H3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.H4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.L1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.L2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.L3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.L4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.L5);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.M1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.M2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.M3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.M4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.M5);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N3);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N4);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N5);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N6);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N7);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N8);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.N9);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.R1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.S1);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.S2);
		addEEnumLiteral(drugCategoryCodeSimpleTypeEEnum, DrugCategoryCodeSimpleType.Z1);

		initEEnum(drugCodeSimpleTypeEEnum, DrugCodeSimpleType.class, "DrugCodeSimpleType");
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1100);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1105);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1205);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1228);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1230);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1235);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1237);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1248);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1405);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1475);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1480);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1485);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1503);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1530);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1575);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1580);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1585);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1590);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1605);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1610);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1615);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1631);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1635);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1640);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1645);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1647);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1670);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1675);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1680);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1724);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1750);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._1760);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2010);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2012);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2020);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2100);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2125);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2126);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2138);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2145);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2250);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2264);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2270);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2271);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2285);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2315);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2316);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2460);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2465);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2467);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2510);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2540);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2545);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2550);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2565);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2572);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2575);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2585);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2591);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2600);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2605);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2610);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2737);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2744);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2746);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2748);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2749);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2751);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2752);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2753);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2754);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2756);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2758);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2759);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2762);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2763);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2764);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2765);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2767);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2768);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2771);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2772);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2773);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2774);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2779);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2781);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2782);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2783);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2784);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2800);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2820);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2834);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2835);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2836);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2837);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2838);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2839);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2881);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2882);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2883);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2884);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2885);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2886);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2887);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._2925);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._4000);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._6250);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7008);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7019);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7081);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7104);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7118);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7122);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7173);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7200);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7201);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7203);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7249);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7260);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7285);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7295);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7297);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7298);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7300);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7310);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7315);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7348);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7360);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7369);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7370);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7374);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7379);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7381);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7385);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7390);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7391);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7392);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7395);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7396);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7398);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7399);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7400);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7401);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7402);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7404);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7405);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7411);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7415);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7431);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7432);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7433);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7434);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7435);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7437);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7438);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7439);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7455);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7458);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7460);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7470);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7471);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7473);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7482);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7484);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7493);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7508);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7509);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7517);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7518);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7519);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7521);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7524);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7532);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7535);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7540);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._7694);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._8192);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._8333);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._8501);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._8603);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9010);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9020);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9040);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9041);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9050);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9051);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9052);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9053);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9054);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9055);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9056);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9059);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9064);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9070);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9120);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9143);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9145);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9150);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9167);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9168);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9170);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9180);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9190);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9193);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9200);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9210);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9220);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9226);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9230);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9232);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9233);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9234);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9240);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9250);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9254);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9260);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9273);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9278);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9300);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9301);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9302);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9304);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9305);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9306);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9307);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9308);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9309);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9312);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9313);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9314);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9315);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9319);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9330);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9333);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9334);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9335);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9400);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9600);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9601);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9602);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9603);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9604);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9605);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9606);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9607);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9608);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9609);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9610);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9611);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9612);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9613);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9615);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9616);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9617);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9618);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9619);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9620);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9621);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9622);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9623);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9624);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9625);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9626);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9627);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9628);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9629);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9630);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9631);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9632);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9633);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9634);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9635);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9636);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9637);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9638);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9639);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9640);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9641);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9642);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9643);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9644);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9645);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9646);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9647);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9648);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9649);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9650);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9652);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9661);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9663);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9670);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9709);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9715);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9720);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9730);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9732);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9733);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9737);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9739);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9740);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9743);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9750);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9780);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9800);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9801);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9802);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9803);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9804);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9805);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9806);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9807);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9808);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9809);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9810);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9812);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9813);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9814);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9815);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9830);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9831);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9832);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9833);
		addEEnumLiteral(drugCodeSimpleTypeEEnum, DrugCodeSimpleType._9835);

		// Initialize data types
		initEDataType(deaClassScheduleCodeCodeSimpleTypeObjectEDataType, DEAClassScheduleCodeCodeSimpleType.class, "DEAClassScheduleCodeCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(drugCategoryCodeSimpleTypeObjectEDataType, DrugCategoryCodeSimpleType.class, "DrugCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(drugCodeSimpleTypeObjectEDataType, DrugCodeSimpleType.class, "DrugCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (deaClassScheduleCodeCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DEAClassScheduleCodeCodeSimpleType"
		   });							
		addAnnotation
		  (deaClassScheduleCodeCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DEAClassScheduleCodeCodeSimpleType:Object",
			 "baseType", "DEAClassScheduleCodeCodeSimpleType"
		   });			
		addAnnotation
		  (deaClassScheduleCodeCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DEAClassScheduleCodeCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDEAClassScheduleCodeCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDEAClassScheduleCodeCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDEAClassScheduleCodeCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDEAClassScheduleCodeCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDEAClassScheduleCodeCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDEAClassScheduleCodeCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (drugCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DrugCategoryCodeSimpleType"
		   });																																																					
		addAnnotation
		  (drugCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DrugCategoryCodeSimpleType:Object",
			 "baseType", "DrugCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (drugCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DrugCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDrugCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDrugCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (drugCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DrugCodeSimpleType"
		   });																																																																																																																																																																																																																																																																																																																																					
		addAnnotation
		  (drugCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DrugCodeSimpleType:Object",
			 "baseType", "DrugCodeSimpleType"
		   });			
		addAnnotation
		  (drugCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DrugCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDrugCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDrugCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDrugCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
