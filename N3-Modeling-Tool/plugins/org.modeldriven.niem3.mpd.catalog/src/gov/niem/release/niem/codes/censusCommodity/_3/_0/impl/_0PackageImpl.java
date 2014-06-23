/**
 */
package gov.niem.release.niem.codes.censusCommodity._3._0.impl;

import gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeSimpleType;
import gov.niem.release.niem.codes.censusCommodity._3._0.ConveyanceCategoryCodeType;
import gov.niem.release.niem.codes.censusCommodity._3._0.ElectronicEquipmentCategoryCodeSimpleType;
import gov.niem.release.niem.codes.censusCommodity._3._0.ElectronicEquipmentCategoryCodeType;
import gov.niem.release.niem.codes.censusCommodity._3._0.ElectronicInstrumentCategoryCodeSimpleType;
import gov.niem.release.niem.codes.censusCommodity._3._0.ElectronicInstrumentCategoryCodeType;
import gov.niem.release.niem.codes.censusCommodity._3._0.MachineryCategoryCodeSimpleType;
import gov.niem.release.niem.codes.censusCommodity._3._0.MachineryCategoryCodeType;
import gov.niem.release.niem.codes.censusCommodity._3._0._0Factory;
import gov.niem.release.niem.codes.censusCommodity._3._0._0Package;

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
	private EClass conveyanceCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicEquipmentCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electronicInstrumentCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineryCategoryCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conveyanceCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum electronicEquipmentCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum electronicInstrumentCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum machineryCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conveyanceCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType electronicEquipmentCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType electronicInstrumentCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType machineryCategoryCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.censusCommodity._3._0._0Package#eNS_URI
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
	public EClass getConveyanceCategoryCodeType() {
		return conveyanceCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceCategoryCodeType_Value() {
		return (EAttribute)conveyanceCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceCategoryCodeType_Id() {
		return (EAttribute)conveyanceCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceCategoryCodeType_Metadata() {
		return (EAttribute)conveyanceCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceCategoryCodeType_Ref() {
		return (EAttribute)conveyanceCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)conveyanceCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConveyanceCategoryCodeType_AnyAttribute() {
		return (EAttribute)conveyanceCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicEquipmentCategoryCodeType() {
		return electronicEquipmentCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicEquipmentCategoryCodeType_Value() {
		return (EAttribute)electronicEquipmentCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicEquipmentCategoryCodeType_Id() {
		return (EAttribute)electronicEquipmentCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicEquipmentCategoryCodeType_Metadata() {
		return (EAttribute)electronicEquipmentCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicEquipmentCategoryCodeType_Ref() {
		return (EAttribute)electronicEquipmentCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicEquipmentCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)electronicEquipmentCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicEquipmentCategoryCodeType_AnyAttribute() {
		return (EAttribute)electronicEquipmentCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectronicInstrumentCategoryCodeType() {
		return electronicInstrumentCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicInstrumentCategoryCodeType_Value() {
		return (EAttribute)electronicInstrumentCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicInstrumentCategoryCodeType_Id() {
		return (EAttribute)electronicInstrumentCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicInstrumentCategoryCodeType_Metadata() {
		return (EAttribute)electronicInstrumentCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicInstrumentCategoryCodeType_Ref() {
		return (EAttribute)electronicInstrumentCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicInstrumentCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)electronicInstrumentCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectronicInstrumentCategoryCodeType_AnyAttribute() {
		return (EAttribute)electronicInstrumentCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachineryCategoryCodeType() {
		return machineryCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineryCategoryCodeType_Value() {
		return (EAttribute)machineryCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineryCategoryCodeType_Id() {
		return (EAttribute)machineryCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineryCategoryCodeType_Metadata() {
		return (EAttribute)machineryCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineryCategoryCodeType_Ref() {
		return (EAttribute)machineryCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineryCategoryCodeType_RelationshipMetadata() {
		return (EAttribute)machineryCategoryCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineryCategoryCodeType_AnyAttribute() {
		return (EAttribute)machineryCategoryCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConveyanceCategoryCodeSimpleType() {
		return conveyanceCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElectronicEquipmentCategoryCodeSimpleType() {
		return electronicEquipmentCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElectronicInstrumentCategoryCodeSimpleType() {
		return electronicInstrumentCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMachineryCategoryCodeSimpleType() {
		return machineryCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConveyanceCategoryCodeSimpleTypeObject() {
		return conveyanceCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElectronicEquipmentCategoryCodeSimpleTypeObject() {
		return electronicEquipmentCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElectronicInstrumentCategoryCodeSimpleTypeObject() {
		return electronicInstrumentCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMachineryCategoryCodeSimpleTypeObject() {
		return machineryCategoryCodeSimpleTypeObjectEDataType;
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
		conveyanceCategoryCodeTypeEClass = createEClass(CONVEYANCE_CATEGORY_CODE_TYPE);
		createEAttribute(conveyanceCategoryCodeTypeEClass, CONVEYANCE_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(conveyanceCategoryCodeTypeEClass, CONVEYANCE_CATEGORY_CODE_TYPE__ID);
		createEAttribute(conveyanceCategoryCodeTypeEClass, CONVEYANCE_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(conveyanceCategoryCodeTypeEClass, CONVEYANCE_CATEGORY_CODE_TYPE__REF);
		createEAttribute(conveyanceCategoryCodeTypeEClass, CONVEYANCE_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(conveyanceCategoryCodeTypeEClass, CONVEYANCE_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		electronicEquipmentCategoryCodeTypeEClass = createEClass(ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE);
		createEAttribute(electronicEquipmentCategoryCodeTypeEClass, ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(electronicEquipmentCategoryCodeTypeEClass, ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE__ID);
		createEAttribute(electronicEquipmentCategoryCodeTypeEClass, ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(electronicEquipmentCategoryCodeTypeEClass, ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE__REF);
		createEAttribute(electronicEquipmentCategoryCodeTypeEClass, ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(electronicEquipmentCategoryCodeTypeEClass, ELECTRONIC_EQUIPMENT_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		electronicInstrumentCategoryCodeTypeEClass = createEClass(ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE);
		createEAttribute(electronicInstrumentCategoryCodeTypeEClass, ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(electronicInstrumentCategoryCodeTypeEClass, ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE__ID);
		createEAttribute(electronicInstrumentCategoryCodeTypeEClass, ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(electronicInstrumentCategoryCodeTypeEClass, ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE__REF);
		createEAttribute(electronicInstrumentCategoryCodeTypeEClass, ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(electronicInstrumentCategoryCodeTypeEClass, ELECTRONIC_INSTRUMENT_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		machineryCategoryCodeTypeEClass = createEClass(MACHINERY_CATEGORY_CODE_TYPE);
		createEAttribute(machineryCategoryCodeTypeEClass, MACHINERY_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(machineryCategoryCodeTypeEClass, MACHINERY_CATEGORY_CODE_TYPE__ID);
		createEAttribute(machineryCategoryCodeTypeEClass, MACHINERY_CATEGORY_CODE_TYPE__METADATA);
		createEAttribute(machineryCategoryCodeTypeEClass, MACHINERY_CATEGORY_CODE_TYPE__REF);
		createEAttribute(machineryCategoryCodeTypeEClass, MACHINERY_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(machineryCategoryCodeTypeEClass, MACHINERY_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		conveyanceCategoryCodeSimpleTypeEEnum = createEEnum(CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE);
		electronicEquipmentCategoryCodeSimpleTypeEEnum = createEEnum(ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE);
		electronicInstrumentCategoryCodeSimpleTypeEEnum = createEEnum(ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE);
		machineryCategoryCodeSimpleTypeEEnum = createEEnum(MACHINERY_CATEGORY_CODE_SIMPLE_TYPE);

		// Create data types
		conveyanceCategoryCodeSimpleTypeObjectEDataType = createEDataType(CONVEYANCE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		electronicEquipmentCategoryCodeSimpleTypeObjectEDataType = createEDataType(ELECTRONIC_EQUIPMENT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		electronicInstrumentCategoryCodeSimpleTypeObjectEDataType = createEDataType(ELECTRONIC_INSTRUMENT_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		machineryCategoryCodeSimpleTypeObjectEDataType = createEDataType(MACHINERY_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(conveyanceCategoryCodeTypeEClass, ConveyanceCategoryCodeType.class, "ConveyanceCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConveyanceCategoryCodeType_Value(), this.getConveyanceCategoryCodeSimpleType(), "value", null, 0, 1, ConveyanceCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConveyanceCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ConveyanceCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConveyanceCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, ConveyanceCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConveyanceCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, ConveyanceCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConveyanceCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, ConveyanceCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConveyanceCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ConveyanceCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electronicEquipmentCategoryCodeTypeEClass, ElectronicEquipmentCategoryCodeType.class, "ElectronicEquipmentCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectronicEquipmentCategoryCodeType_Value(), this.getElectronicEquipmentCategoryCodeSimpleType(), "value", null, 0, 1, ElectronicEquipmentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicEquipmentCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ElectronicEquipmentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicEquipmentCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, ElectronicEquipmentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicEquipmentCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, ElectronicEquipmentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicEquipmentCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, ElectronicEquipmentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicEquipmentCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ElectronicEquipmentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electronicInstrumentCategoryCodeTypeEClass, ElectronicInstrumentCategoryCodeType.class, "ElectronicInstrumentCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectronicInstrumentCategoryCodeType_Value(), this.getElectronicInstrumentCategoryCodeSimpleType(), "value", null, 0, 1, ElectronicInstrumentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicInstrumentCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ElectronicInstrumentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicInstrumentCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, ElectronicInstrumentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicInstrumentCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, ElectronicInstrumentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicInstrumentCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, ElectronicInstrumentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectronicInstrumentCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ElectronicInstrumentCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineryCategoryCodeTypeEClass, MachineryCategoryCodeType.class, "MachineryCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineryCategoryCodeType_Value(), this.getMachineryCategoryCodeSimpleType(), "value", null, 0, 1, MachineryCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineryCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, MachineryCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineryCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, MachineryCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineryCategoryCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, MachineryCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineryCategoryCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, MachineryCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineryCategoryCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, MachineryCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType.class, "ConveyanceCategoryCodeSimpleType");
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36000);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36100);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36101);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36109);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36200);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36210);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36220);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36300);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36310);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36320);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36330);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36340);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36351);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36359);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36360);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36391);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36399);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36400);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36401);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36402);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36403);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36404);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._36409);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37000);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37100);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37101);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37102);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37103);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37104);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37200);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37210);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37220);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37230);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37240);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37300);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37310);
		addEEnumLiteral(conveyanceCategoryCodeSimpleTypeEEnum, ConveyanceCategoryCodeSimpleType._37320);

		initEEnum(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType.class, "ElectronicEquipmentCategoryCodeSimpleType");
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35000);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35100);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35110);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35120);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35200);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35210);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35220);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35300);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35310);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35390);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35400);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35500);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35510);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35520);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35600);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35610);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35621);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35629);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35700);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35800);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35811);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35812);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35813);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35814);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35820);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35900);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35912);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35920);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35991);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35992);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35993);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35994);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35995);
		addEEnumLiteral(electronicEquipmentCategoryCodeSimpleTypeEEnum, ElectronicEquipmentCategoryCodeSimpleType._35999);

		initEEnum(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType.class, "ElectronicInstrumentCategoryCodeSimpleType");
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38000);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38100);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38101);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38109);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38200);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38210);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38220);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38300);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38310);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38320);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38400);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38410);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38420);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38491);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38492);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38499);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38500);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38510);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38520);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38591);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38592);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38593);
		addEEnumLiteral(electronicInstrumentCategoryCodeSimpleTypeEEnum, ElectronicInstrumentCategoryCodeSimpleType._38599);

		initEEnum(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType.class, "MachineryCategoryCodeSimpleType");
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34000);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34100);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34110);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34120);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34130);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34200);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34211);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34212);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34221);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34222);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34300);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34310);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34320);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34330);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34400);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34410);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34421);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34422);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34500);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34511);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34519);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34520);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34900);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34910);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34920);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34930);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34940);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34950);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34960);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34971);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34972);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34991);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34992);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34993);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34994);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34995);
		addEEnumLiteral(machineryCategoryCodeSimpleTypeEEnum, MachineryCategoryCodeSimpleType._34999);

		// Initialize data types
		initEDataType(conveyanceCategoryCodeSimpleTypeObjectEDataType, ConveyanceCategoryCodeSimpleType.class, "ConveyanceCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(electronicEquipmentCategoryCodeSimpleTypeObjectEDataType, ElectronicEquipmentCategoryCodeSimpleType.class, "ElectronicEquipmentCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(electronicInstrumentCategoryCodeSimpleTypeObjectEDataType, ElectronicInstrumentCategoryCodeSimpleType.class, "ElectronicInstrumentCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(machineryCategoryCodeSimpleTypeObjectEDataType, MachineryCategoryCodeSimpleType.class, "MachineryCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (conveyanceCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ConveyanceCategoryCodeSimpleType"
		   });																																							
		addAnnotation
		  (conveyanceCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ConveyanceCategoryCodeSimpleType:Object",
			 "baseType", "ConveyanceCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (conveyanceCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConveyanceCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getConveyanceCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getConveyanceCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getConveyanceCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getConveyanceCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getConveyanceCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getConveyanceCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (electronicEquipmentCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ElectronicEquipmentCategoryCodeSimpleType"
		   });																																				
		addAnnotation
		  (electronicEquipmentCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ElectronicEquipmentCategoryCodeSimpleType:Object",
			 "baseType", "ElectronicEquipmentCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (electronicEquipmentCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ElectronicEquipmentCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getElectronicEquipmentCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getElectronicEquipmentCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicEquipmentCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicEquipmentCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicEquipmentCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicEquipmentCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (electronicInstrumentCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ElectronicInstrumentCategoryCodeSimpleType"
		   });																									
		addAnnotation
		  (electronicInstrumentCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ElectronicInstrumentCategoryCodeSimpleType:Object",
			 "baseType", "ElectronicInstrumentCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (electronicInstrumentCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ElectronicInstrumentCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getElectronicInstrumentCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getElectronicInstrumentCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicInstrumentCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicInstrumentCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicInstrumentCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getElectronicInstrumentCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (machineryCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "MachineryCategoryCodeSimpleType"
		   });																																							
		addAnnotation
		  (machineryCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MachineryCategoryCodeSimpleType:Object",
			 "baseType", "MachineryCategoryCodeSimpleType"
		   });			
		addAnnotation
		  (machineryCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MachineryCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMachineryCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getMachineryCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMachineryCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMachineryCategoryCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMachineryCategoryCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getMachineryCategoryCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
