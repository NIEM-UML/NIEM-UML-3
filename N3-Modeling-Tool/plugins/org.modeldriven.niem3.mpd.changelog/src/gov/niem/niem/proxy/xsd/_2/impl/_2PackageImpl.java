/**
 */
package gov.niem.niem.proxy.xsd._2.impl;

import gov.niem.niem.proxy.xsd._2.AnyURI;
import gov.niem.niem.proxy.xsd._2.Base64Binary;
import gov.niem.niem.proxy.xsd._2.Date;
import gov.niem.niem.proxy.xsd._2.DateTime;
import gov.niem.niem.proxy.xsd._2.Decimal;
import gov.niem.niem.proxy.xsd._2.Duration;
import gov.niem.niem.proxy.xsd._2.GMonth;
import gov.niem.niem.proxy.xsd._2.GYear;
import gov.niem.niem.proxy.xsd._2.GYearMonth;
import gov.niem.niem.proxy.xsd._2.HexBinary;
import gov.niem.niem.proxy.xsd._2.NonNegativeInteger;
import gov.niem.niem.proxy.xsd._2.Time;
import gov.niem.niem.proxy.xsd._2.Token;
import gov.niem.niem.proxy.xsd._2._2Factory;
import gov.niem.niem.proxy.xsd._2._2Package;

import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2PackageImpl extends EPackageImpl implements _2Package {
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
	private EClass durationEClass = null;

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
	private EClass integerEClass = null;

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
	 * @see gov.niem.niem.proxy.xsd._2._2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _2PackageImpl() {
		super(eNS_URI, _2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _2Package init() {
		if (isInited) return (_2Package)EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI);

		// Obtain or create and register package
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		gov.niem.niem.structures._2.impl._2PackageImpl the_2Package_1 = (gov.niem.niem.structures._2.impl._2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.structures._2._2Package.eNS_URI) instanceof gov.niem.niem.structures._2.impl._2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.structures._2._2Package.eNS_URI) : gov.niem.niem.structures._2._2Package.eINSTANCE);
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI) : _1Package.eINSTANCE);
		gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl the_1Package_1 = (gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.model._1._1._1Package.eNS_URI) instanceof gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.model._1._1._1Package.eNS_URI) : gov.niem.reference.niem.resource.model._1._1._1Package.eINSTANCE);

		// Create package meta-data objects
		the_2Package.createPackageContents();
		the_2Package_1.createPackageContents();
		the_1Package.createPackageContents();
		the_1Package_1.createPackageContents();

		// Initialize created meta-data
		the_2Package.initializePackageContents();
		the_2Package_1.initializePackageContents();
		the_1Package.initializePackageContents();
		the_1Package_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		the_2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_2Package.eNS_URI, the_2Package);
		return the_2Package;
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
	public EAttribute getAnyURI_LinkMetadata() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnyURI_Metadata() {
		return (EAttribute)anyURIEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getBase64Binary_LinkMetadata() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Metadata() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getBoolean_LinkMetadata() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Metadata() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDate_LinkMetadata() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Metadata() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDateTime_LinkMetadata() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Metadata() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDecimal_LinkMetadata() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Metadata() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getDuration_LinkMetadata() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Metadata() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getGMonth_LinkMetadata() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGMonth_Metadata() {
		return (EAttribute)gMonthEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getGYear_LinkMetadata() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYear_Metadata() {
		return (EAttribute)gYearEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getGYearMonth_LinkMetadata() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGYearMonth_Metadata() {
		return (EAttribute)gYearMonthEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getHexBinary_LinkMetadata() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHexBinary_Metadata() {
		return (EAttribute)hexBinaryEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getInteger_LinkMetadata() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Metadata() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getNonNegativeInteger_LinkMetadata() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeInteger_Metadata() {
		return (EAttribute)nonNegativeIntegerEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getString_LinkMetadata() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Metadata() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getTime_LinkMetadata() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Metadata() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getToken_LinkMetadata() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Metadata() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2Factory get_2Factory() {
		return (_2Factory)getEFactoryInstance();
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
		createEAttribute(anyURIEClass, ANY_URI__LINK_METADATA);
		createEAttribute(anyURIEClass, ANY_URI__METADATA);

		base64BinaryEClass = createEClass(BASE64_BINARY);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__VALUE);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__ID);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__LINK_METADATA);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__METADATA);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);
		createEAttribute(booleanEClass, BOOLEAN__ID);
		createEAttribute(booleanEClass, BOOLEAN__LINK_METADATA);
		createEAttribute(booleanEClass, BOOLEAN__METADATA);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__VALUE);
		createEAttribute(dateEClass, DATE__ID);
		createEAttribute(dateEClass, DATE__LINK_METADATA);
		createEAttribute(dateEClass, DATE__METADATA);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__VALUE);
		createEAttribute(dateTimeEClass, DATE_TIME__ID);
		createEAttribute(dateTimeEClass, DATE_TIME__LINK_METADATA);
		createEAttribute(dateTimeEClass, DATE_TIME__METADATA);

		decimalEClass = createEClass(DECIMAL);
		createEAttribute(decimalEClass, DECIMAL__VALUE);
		createEAttribute(decimalEClass, DECIMAL__ID);
		createEAttribute(decimalEClass, DECIMAL__LINK_METADATA);
		createEAttribute(decimalEClass, DECIMAL__METADATA);

		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__ID);
		createEAttribute(durationEClass, DURATION__LINK_METADATA);
		createEAttribute(durationEClass, DURATION__METADATA);

		gMonthEClass = createEClass(GMONTH);
		createEAttribute(gMonthEClass, GMONTH__VALUE);
		createEAttribute(gMonthEClass, GMONTH__ID);
		createEAttribute(gMonthEClass, GMONTH__LINK_METADATA);
		createEAttribute(gMonthEClass, GMONTH__METADATA);

		gYearEClass = createEClass(GYEAR);
		createEAttribute(gYearEClass, GYEAR__VALUE);
		createEAttribute(gYearEClass, GYEAR__ID);
		createEAttribute(gYearEClass, GYEAR__LINK_METADATA);
		createEAttribute(gYearEClass, GYEAR__METADATA);

		gYearMonthEClass = createEClass(GYEAR_MONTH);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__VALUE);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__ID);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__LINK_METADATA);
		createEAttribute(gYearMonthEClass, GYEAR_MONTH__METADATA);

		hexBinaryEClass = createEClass(HEX_BINARY);
		createEAttribute(hexBinaryEClass, HEX_BINARY__VALUE);
		createEAttribute(hexBinaryEClass, HEX_BINARY__ID);
		createEAttribute(hexBinaryEClass, HEX_BINARY__LINK_METADATA);
		createEAttribute(hexBinaryEClass, HEX_BINARY__METADATA);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);
		createEAttribute(integerEClass, INTEGER__ID);
		createEAttribute(integerEClass, INTEGER__LINK_METADATA);
		createEAttribute(integerEClass, INTEGER__METADATA);

		nonNegativeIntegerEClass = createEClass(NON_NEGATIVE_INTEGER);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__VALUE);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__ID);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__LINK_METADATA);
		createEAttribute(nonNegativeIntegerEClass, NON_NEGATIVE_INTEGER__METADATA);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);
		createEAttribute(stringEClass, STRING__ID);
		createEAttribute(stringEClass, STRING__LINK_METADATA);
		createEAttribute(stringEClass, STRING__METADATA);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);
		createEAttribute(timeEClass, TIME__ID);
		createEAttribute(timeEClass, TIME__LINK_METADATA);
		createEAttribute(timeEClass, TIME__METADATA);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__VALUE);
		createEAttribute(tokenEClass, TOKEN__ID);
		createEAttribute(tokenEClass, TOKEN__LINK_METADATA);
		createEAttribute(tokenEClass, TOKEN__METADATA);
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
		initEAttribute(getAnyURI_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnyURI_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, AnyURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(base64BinaryEClass, Base64Binary.class, "Base64Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Binary_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBase64Binary_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, gov.niem.niem.proxy.xsd._2.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1, gov.niem.niem.proxy.xsd._2.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.niem.proxy.xsd._2.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, gov.niem.niem.proxy.xsd._2.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.niem.proxy.xsd._2.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalEClass, Decimal.class, "Decimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimal_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimal_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), theXMLTypePackage.getDuration(), "value", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gMonthEClass, GMonth.class, "GMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGMonth_Value(), theXMLTypePackage.getGMonth(), "value", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMonth_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gYearEClass, GYear.class, "GYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGYear_Value(), theXMLTypePackage.getGYear(), "value", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYear_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gYearMonthEClass, GYearMonth.class, "GYearMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGYearMonth_Value(), theXMLTypePackage.getGYearMonth(), "value", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGYearMonth_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, GYearMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hexBinaryEClass, HexBinary.class, "HexBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHexBinary_Value(), theXMLTypePackage.getHexBinary(), "value", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHexBinary_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, HexBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, gov.niem.niem.proxy.xsd._2.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), theXMLTypePackage.getInteger(), "value", null, 0, 1, gov.niem.niem.proxy.xsd._2.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.niem.proxy.xsd._2.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, gov.niem.niem.proxy.xsd._2.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.niem.proxy.xsd._2.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonNegativeIntegerEClass, NonNegativeInteger.class, "NonNegativeInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonNegativeInteger_Value(), theXMLTypePackage.getNonNegativeInteger(), "value", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonNegativeInteger_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, NonNegativeInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEClass, gov.niem.niem.proxy.xsd._2.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, gov.niem.niem.proxy.xsd._2.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, gov.niem.niem.proxy.xsd._2.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, gov.niem.niem.proxy.xsd._2.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getString_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, gov.niem.niem.proxy.xsd._2.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), theXMLTypePackage.getTime(), "value", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTime_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_Value(), theXMLTypePackage.getToken(), "value", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
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
			 "appinfo", "\r\n      <i:ConformantIndicator xmlns:i=\"http://niem.gov/niem/appinfo/2.0\">true</i:ConformantIndicator>\r\n    \r\n\r\n      <i:resource xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\"/>\r\n  \r\n\r\n      <i:resource xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Association\"/>\r\n  "
		   });		
		addAnnotation
		  (anyURIEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (base64BinaryEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (booleanEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (dateEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });							
		addAnnotation
		  (dateTimeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (decimalEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (durationEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (gMonthEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (gYearEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (gYearMonthEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (hexBinaryEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (integerEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (nonNegativeIntegerEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (stringEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (timeEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
		   });								
		addAnnotation
		  (tokenEClass, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n        <i:Base xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\" i:namespace=\"http://niem.gov/niem/structures/2.0\"/>\r\n      "
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getAnyURI_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getAnyURI_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getBase64Binary_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getBase64Binary_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getBoolean_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getBoolean_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDate_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDate_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDateTime_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDateTime_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDecimal_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDecimal_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDuration_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getDuration_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getGMonth_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getGMonth_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getGYear_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getGYear_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getGYearMonth_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getGYearMonth_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getHexBinary_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getHexBinary_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getInteger_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getNonNegativeInteger_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getNonNegativeInteger_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getString_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getString_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getTime_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getTime_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getToken_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getToken_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });
	}

} //_2PackageImpl
