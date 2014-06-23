/**
 */
package gov.niem.release.niem.codes.ngaDatum._3._0.impl;

import gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType;
import gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType;
import gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType;
import gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType;
import gov.niem.release.niem.codes.ngaDatum._3._0._0Factory;
import gov.niem.release.niem.codes.ngaDatum._3._0._0Package;

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
	private EClass directionDatumCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verticalDatumCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionDatumCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalDatumCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType directionDatumCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verticalDatumCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0._0Package#eNS_URI
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
	public EClass getDirectionDatumCodeType() {
		return directionDatumCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDatumCodeType_Value() {
		return (EAttribute)directionDatumCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDatumCodeType_Id() {
		return (EAttribute)directionDatumCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDatumCodeType_Metadata() {
		return (EAttribute)directionDatumCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDatumCodeType_Ref() {
		return (EAttribute)directionDatumCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDatumCodeType_RelationshipMetadata() {
		return (EAttribute)directionDatumCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirectionDatumCodeType_AnyAttribute() {
		return (EAttribute)directionDatumCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerticalDatumCodeType() {
		return verticalDatumCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumCodeType_Value() {
		return (EAttribute)verticalDatumCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumCodeType_Id() {
		return (EAttribute)verticalDatumCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumCodeType_Metadata() {
		return (EAttribute)verticalDatumCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumCodeType_Ref() {
		return (EAttribute)verticalDatumCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumCodeType_RelationshipMetadata() {
		return (EAttribute)verticalDatumCodeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerticalDatumCodeType_AnyAttribute() {
		return (EAttribute)verticalDatumCodeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionDatumCodeSimpleType() {
		return directionDatumCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalDatumCodeSimpleType() {
		return verticalDatumCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirectionDatumCodeSimpleTypeObject() {
		return directionDatumCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVerticalDatumCodeSimpleTypeObject() {
		return verticalDatumCodeSimpleTypeObjectEDataType;
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
		directionDatumCodeTypeEClass = createEClass(DIRECTION_DATUM_CODE_TYPE);
		createEAttribute(directionDatumCodeTypeEClass, DIRECTION_DATUM_CODE_TYPE__VALUE);
		createEAttribute(directionDatumCodeTypeEClass, DIRECTION_DATUM_CODE_TYPE__ID);
		createEAttribute(directionDatumCodeTypeEClass, DIRECTION_DATUM_CODE_TYPE__METADATA);
		createEAttribute(directionDatumCodeTypeEClass, DIRECTION_DATUM_CODE_TYPE__REF);
		createEAttribute(directionDatumCodeTypeEClass, DIRECTION_DATUM_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(directionDatumCodeTypeEClass, DIRECTION_DATUM_CODE_TYPE__ANY_ATTRIBUTE);

		verticalDatumCodeTypeEClass = createEClass(VERTICAL_DATUM_CODE_TYPE);
		createEAttribute(verticalDatumCodeTypeEClass, VERTICAL_DATUM_CODE_TYPE__VALUE);
		createEAttribute(verticalDatumCodeTypeEClass, VERTICAL_DATUM_CODE_TYPE__ID);
		createEAttribute(verticalDatumCodeTypeEClass, VERTICAL_DATUM_CODE_TYPE__METADATA);
		createEAttribute(verticalDatumCodeTypeEClass, VERTICAL_DATUM_CODE_TYPE__REF);
		createEAttribute(verticalDatumCodeTypeEClass, VERTICAL_DATUM_CODE_TYPE__RELATIONSHIP_METADATA);
		createEAttribute(verticalDatumCodeTypeEClass, VERTICAL_DATUM_CODE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		directionDatumCodeSimpleTypeEEnum = createEEnum(DIRECTION_DATUM_CODE_SIMPLE_TYPE);
		verticalDatumCodeSimpleTypeEEnum = createEEnum(VERTICAL_DATUM_CODE_SIMPLE_TYPE);

		// Create data types
		directionDatumCodeSimpleTypeObjectEDataType = createEDataType(DIRECTION_DATUM_CODE_SIMPLE_TYPE_OBJECT);
		verticalDatumCodeSimpleTypeObjectEDataType = createEDataType(VERTICAL_DATUM_CODE_SIMPLE_TYPE_OBJECT);
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
		initEClass(directionDatumCodeTypeEClass, DirectionDatumCodeType.class, "DirectionDatumCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectionDatumCodeType_Value(), this.getDirectionDatumCodeSimpleType(), "value", null, 0, 1, DirectionDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectionDatumCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DirectionDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectionDatumCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DirectionDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectionDatumCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, DirectionDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectionDatumCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, DirectionDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectionDatumCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DirectionDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verticalDatumCodeTypeEClass, VerticalDatumCodeType.class, "VerticalDatumCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerticalDatumCodeType_Value(), this.getVerticalDatumCodeSimpleType(), "value", null, 0, 1, VerticalDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalDatumCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, VerticalDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalDatumCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, VerticalDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalDatumCodeType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, VerticalDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalDatumCodeType_RelationshipMetadata(), theXMLTypePackage.getIDREFS(), "relationshipMetadata", null, 0, 1, VerticalDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerticalDatumCodeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, VerticalDatumCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionDatumCodeSimpleTypeEEnum, DirectionDatumCodeSimpleType.class, "DirectionDatumCodeSimpleType");
		addEEnumLiteral(directionDatumCodeSimpleTypeEEnum, DirectionDatumCodeSimpleType.GEODETIC);
		addEEnumLiteral(directionDatumCodeSimpleTypeEEnum, DirectionDatumCodeSimpleType.MAGNETIC);
		addEEnumLiteral(directionDatumCodeSimpleTypeEEnum, DirectionDatumCodeSimpleType.MILITARY_GRID);
		addEEnumLiteral(directionDatumCodeSimpleTypeEEnum, DirectionDatumCodeSimpleType.RELATIVE);

		initEEnum(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.class, "VerticalDatumCodeSimpleType");
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.APPROX_LOWEST_ASTRONOM_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.APPROX_MEAN_LOWER_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.APPROX_MEAN_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.APPROX_MEAN_LOW_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.APPROX_MEAN_SEA_LEVEL);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.EQUINOCTIAL_SPRING_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.GROUND_LEVEL);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.HIGHER_HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.HIGHER_HIGH_WATER_LARGE_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.HIGHEST_ASTRONOMICAL_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.HIGHEST_HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.HIGH_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.IGLD1985);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.INDIAN_SPRING_HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.INDIAN_SPRING_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOWER_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOWER_LOW_WATER_LARGE_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOWEST_ASTRONOMICAL_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOWEST_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOWEST_LOW_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.LOW_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_HIGHER_HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_HIGHER_HIGH_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_HIGH_WATER_NEAPS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_HIGH_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_LOWER_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_LOWER_LOW_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_LOW_WATER_NEAPS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_LOW_WATER_SPRINGS);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_SEA_LEVEL);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_TIDE_LEVEL);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.MEAN_WATER_LEVEL);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.NAVD88);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.NEAP_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.NEARLY_HIGHEST_HIGH_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.NEARLY_LOWEST_LOW_WATER);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.NGVD29);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.SPRING_TIDE);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.WATER_LEVEL);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.WGS84_EGM08_GEOID);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.WGS84_EGM96_GEOID);
		addEEnumLiteral(verticalDatumCodeSimpleTypeEEnum, VerticalDatumCodeSimpleType.WGS84_ELLIPSOID);

		// Initialize data types
		initEDataType(directionDatumCodeSimpleTypeObjectEDataType, DirectionDatumCodeSimpleType.class, "DirectionDatumCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verticalDatumCodeSimpleTypeObjectEDataType, VerticalDatumCodeSimpleType.class, "VerticalDatumCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (directionDatumCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "DirectionDatumCodeSimpleType"
		   });						
		addAnnotation
		  (directionDatumCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DirectionDatumCodeSimpleType:Object",
			 "baseType", "DirectionDatumCodeSimpleType"
		   });			
		addAnnotation
		  (directionDatumCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DirectionDatumCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDirectionDatumCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getDirectionDatumCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDirectionDatumCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDirectionDatumCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDirectionDatumCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getDirectionDatumCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });			
		addAnnotation
		  (verticalDatumCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "VerticalDatumCodeSimpleType"
		   });																																																
		addAnnotation
		  (verticalDatumCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "VerticalDatumCodeSimpleType:Object",
			 "baseType", "VerticalDatumCodeSimpleType"
		   });			
		addAnnotation
		  (verticalDatumCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VerticalDatumCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getVerticalDatumCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getVerticalDatumCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVerticalDatumCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVerticalDatumCodeType_Ref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ref",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVerticalDatumCodeType_RelationshipMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipMetadata",
			 "namespace", "http://release.niem.gov/niem/structures/3.0/"
		   });		
		addAnnotation
		  (getVerticalDatumCodeType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "urn:us:gov:ic:ism urn:us:gov:ic:ntk",
			 "name", ":5",
			 "processing", "lax"
		   });
	}

} //_0PackageImpl
