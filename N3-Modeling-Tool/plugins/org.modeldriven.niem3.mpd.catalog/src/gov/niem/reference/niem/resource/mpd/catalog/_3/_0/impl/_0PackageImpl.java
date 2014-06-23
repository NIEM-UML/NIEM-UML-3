/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDClassCodeSimpleType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipCodeSimpleType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Factory;
import gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.util._0Validator;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

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
	private EClass catalogTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iepConformanceTargetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mpdInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mpdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNamesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSchemaDocumentSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relaxNGValidationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaDocumentSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schematronValidationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validityContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlSchemaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mpdClassCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classUnionSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mpdClassCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mpdClassListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mpdNameSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mpdVersionIDSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType qualifiedNameListSimpleTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relationshipCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#eNS_URI
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
		gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl the_0Package_4 = (gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.coreMisc._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.coreMisc._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.coreMisc._3._0._0Package.eINSTANCE);
		gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl the_0Package_5 = (gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) instanceof gov.niem.release.niem.codes.censusCommodity._3._0.impl._0PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eNS_URI) : gov.niem.release.niem.codes.censusCommodity._3._0._0Package.eINSTANCE);
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_0Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _0Validator.INSTANCE;
				 }
			 });

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
	public EClass getCatalogType() {
		return catalogTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalogType_MPD() {
		return (EReference)catalogTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceTargetType() {
		return conformanceTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceTargetType_DescriptionText() {
		return (EReference)conformanceTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceTargetType_ConformanceTargetURI() {
		return (EAttribute)conformanceTargetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ApplicationInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArtifactOrArtifactSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuthoritativeSource() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BusinessRulesArtifact() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Catalog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConformanceAssertion() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConformanceReport() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConformsToConformanceTarget() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidityConstraint() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidityConstraintWithContext() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConformsToRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConstraintSchemaDocumentSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CreationDate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Documentation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DomainText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExchangePartnerName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExchangePatternText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EXIXMLSchema() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtendedInformation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtensionSchemaDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalSchemaDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_File() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FileSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HasDocumentElement() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IEPConformanceTarget() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IEPSampleXMLDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_KeywordText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LastRevisionDate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MPD() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MPDChangeLog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MPDInformation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PurposeText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReadMe() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceSchemaDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferenceSchemaDocumentSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Relationship() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelaxNGSchema() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelaxNGValid() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequiredFile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RuleText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SchemaDocumentSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SchematronSchema() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SchematronValid() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StatusText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubsetSchemaDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidityContext() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValidToXPath() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Wantlist() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLCatalog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLSchemaDocument() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLSchemaValid() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ConformanceTargetURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ExternalURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MimeMediaTypeText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MpdClassCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MpdName() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MpdURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_MpdVersionID() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_PathURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_QualifiedNameList() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_RelationshipCode() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_ResourceURI() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_XPathText() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSetType() {
		return fileSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSetType_DescriptionText() {
		return (EReference)fileSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSetType_ArtifactOrArtifactSetGroup() {
		return (EAttribute)fileSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSetType_ArtifactOrArtifactSet() {
		return (EReference)fileSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSetType_ExternalURI() {
		return (EAttribute)fileSetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSetType_PathURI() {
		return (EAttribute)fileSetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileType() {
		return fileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileType_RequiredFile() {
		return (EReference)fileTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileType_DescriptionText() {
		return (EReference)fileTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_ExternalURI() {
		return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_MimeMediaTypeText() {
		return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileType_PathURI() {
		return (EAttribute)fileTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIEPConformanceTargetType() {
		return iepConformanceTargetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEPConformanceTargetType_DescriptionText() {
		return (EReference)iepConformanceTargetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEPConformanceTargetType_ValidityConstraintWithContextGroup() {
		return (EAttribute)iepConformanceTargetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEPConformanceTargetType_ValidityConstraintWithContext() {
		return (EReference)iepConformanceTargetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIEPConformanceTargetType_ArtifactOrArtifactSetGroup() {
		return (EAttribute)iepConformanceTargetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIEPConformanceTargetType_ArtifactOrArtifactSet() {
		return (EReference)iepConformanceTargetTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPDInformationType() {
		return mpdInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_AuthoritativeSource() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_CreationDate() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_LastRevisionDate() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_StatusText() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_Relationship() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_KeywordText() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_DomainText() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_PurposeText() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_ExchangePatternText() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_ExchangePartnerName() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPDInformationType_ExtendedInformationGroup() {
		return (EAttribute)mpdInformationTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDInformationType_ExtendedInformation() {
		return (EReference)mpdInformationTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPDType() {
		return mpdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDType_DescriptionText() {
		return (EReference)mpdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDType_MPDInformation() {
		return (EReference)mpdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDType_IEPConformanceTarget() {
		return (EReference)mpdTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPDType_ArtifactOrArtifactSetGroup() {
		return (EAttribute)mpdTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMPDType_ArtifactOrArtifactSet() {
		return (EReference)mpdTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPDType_MpdClassCode() {
		return (EAttribute)mpdTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPDType_MpdName() {
		return (EAttribute)mpdTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPDType_MpdURI() {
		return (EAttribute)mpdTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMPDType_MpdVersionID() {
		return (EAttribute)mpdTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedNamesType() {
		return qualifiedNamesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedNamesType_DescriptionText() {
		return (EReference)qualifiedNamesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedNamesType_QualifiedNameList() {
		return (EAttribute)qualifiedNamesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceSchemaDocumentSetType() {
		return referenceSchemaDocumentSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceSchemaDocumentSetType_ReferenceSchemaDocument() {
		return (EReference)referenceSchemaDocumentSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipType_DescriptionText() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_RelationshipCode() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipType_ResourceURI() {
		return (EAttribute)relationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelaxNGValidationType() {
		return relaxNGValidationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxNGValidationType_DescriptionText() {
		return (EReference)relaxNGValidationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelaxNGValidationType_RelaxNGSchema() {
		return (EReference)relaxNGValidationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaDocumentSetType() {
		return schemaDocumentSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaDocumentSetType_XMLCatalog() {
		return (EReference)schemaDocumentSetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaDocumentSetType_Wantlist() {
		return (EReference)schemaDocumentSetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaDocumentSetType_XMLSchemaDocument() {
		return (EReference)schemaDocumentSetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchematronValidationType() {
		return schematronValidationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchematronValidationType_DescriptionText() {
		return (EReference)schematronValidationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchematronValidationType_SchematronSchema() {
		return (EReference)schematronValidationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextRuleType() {
		return textRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextRuleType_DescriptionText() {
		return (EReference)textRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextRuleType_RuleText() {
		return (EReference)textRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidityContextType() {
		return validityContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidityContextType_DescriptionText() {
		return (EReference)validityContextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityContextType_ValidityConstraintGroup() {
		return (EAttribute)validityContextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidityContextType_ValidityConstraint() {
		return (EReference)validityContextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValidityContextType_XPathText() {
		return (EAttribute)validityContextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLSchemaType() {
		return xmlSchemaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLSchemaType_DescriptionText() {
		return (EReference)xmlSchemaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLSchemaType_XMLCatalog() {
		return (EReference)xmlSchemaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMLSchemaType_XMLSchemaDocument() {
		return (EReference)xmlSchemaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPathType() {
		return xPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPathType_DescriptionText() {
		return (EReference)xPathTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXPathType_XPathText() {
		return (EAttribute)xPathTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMPDClassCodeSimpleType() {
		return mpdClassCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipCodeSimpleType() {
		return relationshipCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassListSimpleType() {
		return classListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassUnionSimpleType() {
		return classUnionSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMPDClassCodeSimpleTypeObject() {
		return mpdClassCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMPDClassListSimpleType() {
		return mpdClassListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMPDNameSimpleType() {
		return mpdNameSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMPDVersionIDSimpleType() {
		return mpdVersionIDSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQualifiedNameListSimpleType() {
		return qualifiedNameListSimpleTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRelationshipCodeSimpleTypeObject() {
		return relationshipCodeSimpleTypeObjectEDataType;
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
		catalogTypeEClass = createEClass(CATALOG_TYPE);
		createEReference(catalogTypeEClass, CATALOG_TYPE__MPD);

		conformanceTargetTypeEClass = createEClass(CONFORMANCE_TARGET_TYPE);
		createEReference(conformanceTargetTypeEClass, CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT);
		createEAttribute(conformanceTargetTypeEClass, CONFORMANCE_TARGET_TYPE__CONFORMANCE_TARGET_URI);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLICATION_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ARTIFACT_OR_ARTIFACT_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHORITATIVE_SOURCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BUSINESS_RULES_ARTIFACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMANCE_ASSERTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMANCE_REPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMS_TO_CONFORMANCE_TARGET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDITY_CONSTRAINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDITY_CONSTRAINT_WITH_CONTEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMS_TO_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONSTRAINT_SCHEMA_DOCUMENT_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CREATION_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOMAIN_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCHANGE_PARTNER_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCHANGE_PATTERN_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXIXML_SCHEMA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENDED_INFORMATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENSION_SCHEMA_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_SCHEMA_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FILE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_DOCUMENT_ELEMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IEP_CONFORMANCE_TARGET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IEP_SAMPLE_XML_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEYWORD_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAST_REVISION_DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MPD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MPD_CHANGE_LOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MPD_INFORMATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PURPOSE_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__READ_ME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCE_SCHEMA_DOCUMENT_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELATIONSHIP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELAX_NG_SCHEMA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RELAX_NG_VALID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUIRED_FILE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RULE_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMA_DOCUMENT_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMATRON_SCHEMA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMATRON_VALID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STATUS_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSET_SCHEMA_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALIDITY_CONTEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALID_TO_XPATH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WANTLIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XML_CATALOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XML_SCHEMA_DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XML_SCHEMA_VALID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFORMANCE_TARGET_URI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_URI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIME_MEDIA_TYPE_TEXT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MPD_CLASS_CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MPD_NAME);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MPD_URI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MPD_VERSION_ID);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PATH_URI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__QUALIFIED_NAME_LIST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RELATIONSHIP_CODE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__RESOURCE_URI);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__XPATH_TEXT);

		fileSetTypeEClass = createEClass(FILE_SET_TYPE);
		createEReference(fileSetTypeEClass, FILE_SET_TYPE__DESCRIPTION_TEXT);
		createEAttribute(fileSetTypeEClass, FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP);
		createEReference(fileSetTypeEClass, FILE_SET_TYPE__ARTIFACT_OR_ARTIFACT_SET);
		createEAttribute(fileSetTypeEClass, FILE_SET_TYPE__EXTERNAL_URI);
		createEAttribute(fileSetTypeEClass, FILE_SET_TYPE__PATH_URI);

		fileTypeEClass = createEClass(FILE_TYPE);
		createEReference(fileTypeEClass, FILE_TYPE__REQUIRED_FILE);
		createEReference(fileTypeEClass, FILE_TYPE__DESCRIPTION_TEXT);
		createEAttribute(fileTypeEClass, FILE_TYPE__EXTERNAL_URI);
		createEAttribute(fileTypeEClass, FILE_TYPE__MIME_MEDIA_TYPE_TEXT);
		createEAttribute(fileTypeEClass, FILE_TYPE__PATH_URI);

		iepConformanceTargetTypeEClass = createEClass(IEP_CONFORMANCE_TARGET_TYPE);
		createEReference(iepConformanceTargetTypeEClass, IEP_CONFORMANCE_TARGET_TYPE__DESCRIPTION_TEXT);
		createEAttribute(iepConformanceTargetTypeEClass, IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT_GROUP);
		createEReference(iepConformanceTargetTypeEClass, IEP_CONFORMANCE_TARGET_TYPE__VALIDITY_CONSTRAINT_WITH_CONTEXT);
		createEAttribute(iepConformanceTargetTypeEClass, IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP);
		createEReference(iepConformanceTargetTypeEClass, IEP_CONFORMANCE_TARGET_TYPE__ARTIFACT_OR_ARTIFACT_SET);

		mpdInformationTypeEClass = createEClass(MPD_INFORMATION_TYPE);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__AUTHORITATIVE_SOURCE);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__CREATION_DATE);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__LAST_REVISION_DATE);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__STATUS_TEXT);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__RELATIONSHIP);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__KEYWORD_TEXT);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__DOMAIN_TEXT);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__PURPOSE_TEXT);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__EXCHANGE_PATTERN_TEXT);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__EXCHANGE_PARTNER_NAME);
		createEAttribute(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__EXTENDED_INFORMATION_GROUP);
		createEReference(mpdInformationTypeEClass, MPD_INFORMATION_TYPE__EXTENDED_INFORMATION);

		mpdTypeEClass = createEClass(MPD_TYPE);
		createEReference(mpdTypeEClass, MPD_TYPE__DESCRIPTION_TEXT);
		createEReference(mpdTypeEClass, MPD_TYPE__MPD_INFORMATION);
		createEReference(mpdTypeEClass, MPD_TYPE__IEP_CONFORMANCE_TARGET);
		createEAttribute(mpdTypeEClass, MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET_GROUP);
		createEReference(mpdTypeEClass, MPD_TYPE__ARTIFACT_OR_ARTIFACT_SET);
		createEAttribute(mpdTypeEClass, MPD_TYPE__MPD_CLASS_CODE);
		createEAttribute(mpdTypeEClass, MPD_TYPE__MPD_NAME);
		createEAttribute(mpdTypeEClass, MPD_TYPE__MPD_URI);
		createEAttribute(mpdTypeEClass, MPD_TYPE__MPD_VERSION_ID);

		qualifiedNamesTypeEClass = createEClass(QUALIFIED_NAMES_TYPE);
		createEReference(qualifiedNamesTypeEClass, QUALIFIED_NAMES_TYPE__DESCRIPTION_TEXT);
		createEAttribute(qualifiedNamesTypeEClass, QUALIFIED_NAMES_TYPE__QUALIFIED_NAME_LIST);

		referenceSchemaDocumentSetTypeEClass = createEClass(REFERENCE_SCHEMA_DOCUMENT_SET_TYPE);
		createEReference(referenceSchemaDocumentSetTypeEClass, REFERENCE_SCHEMA_DOCUMENT_SET_TYPE__REFERENCE_SCHEMA_DOCUMENT);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__DESCRIPTION_TEXT);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__RELATIONSHIP_CODE);
		createEAttribute(relationshipTypeEClass, RELATIONSHIP_TYPE__RESOURCE_URI);

		relaxNGValidationTypeEClass = createEClass(RELAX_NG_VALIDATION_TYPE);
		createEReference(relaxNGValidationTypeEClass, RELAX_NG_VALIDATION_TYPE__DESCRIPTION_TEXT);
		createEReference(relaxNGValidationTypeEClass, RELAX_NG_VALIDATION_TYPE__RELAX_NG_SCHEMA);

		schemaDocumentSetTypeEClass = createEClass(SCHEMA_DOCUMENT_SET_TYPE);
		createEReference(schemaDocumentSetTypeEClass, SCHEMA_DOCUMENT_SET_TYPE__XML_CATALOG);
		createEReference(schemaDocumentSetTypeEClass, SCHEMA_DOCUMENT_SET_TYPE__WANTLIST);
		createEReference(schemaDocumentSetTypeEClass, SCHEMA_DOCUMENT_SET_TYPE__XML_SCHEMA_DOCUMENT);

		schematronValidationTypeEClass = createEClass(SCHEMATRON_VALIDATION_TYPE);
		createEReference(schematronValidationTypeEClass, SCHEMATRON_VALIDATION_TYPE__DESCRIPTION_TEXT);
		createEReference(schematronValidationTypeEClass, SCHEMATRON_VALIDATION_TYPE__SCHEMATRON_SCHEMA);

		textRuleTypeEClass = createEClass(TEXT_RULE_TYPE);
		createEReference(textRuleTypeEClass, TEXT_RULE_TYPE__DESCRIPTION_TEXT);
		createEReference(textRuleTypeEClass, TEXT_RULE_TYPE__RULE_TEXT);

		validityContextTypeEClass = createEClass(VALIDITY_CONTEXT_TYPE);
		createEReference(validityContextTypeEClass, VALIDITY_CONTEXT_TYPE__DESCRIPTION_TEXT);
		createEAttribute(validityContextTypeEClass, VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT_GROUP);
		createEReference(validityContextTypeEClass, VALIDITY_CONTEXT_TYPE__VALIDITY_CONSTRAINT);
		createEAttribute(validityContextTypeEClass, VALIDITY_CONTEXT_TYPE__XPATH_TEXT);

		xmlSchemaTypeEClass = createEClass(XML_SCHEMA_TYPE);
		createEReference(xmlSchemaTypeEClass, XML_SCHEMA_TYPE__DESCRIPTION_TEXT);
		createEReference(xmlSchemaTypeEClass, XML_SCHEMA_TYPE__XML_CATALOG);
		createEReference(xmlSchemaTypeEClass, XML_SCHEMA_TYPE__XML_SCHEMA_DOCUMENT);

		xPathTypeEClass = createEClass(XPATH_TYPE);
		createEReference(xPathTypeEClass, XPATH_TYPE__DESCRIPTION_TEXT);
		createEAttribute(xPathTypeEClass, XPATH_TYPE__XPATH_TEXT);

		// Create enums
		mpdClassCodeSimpleTypeEEnum = createEEnum(MPD_CLASS_CODE_SIMPLE_TYPE);
		relationshipCodeSimpleTypeEEnum = createEEnum(RELATIONSHIP_CODE_SIMPLE_TYPE);

		// Create data types
		classListSimpleTypeEDataType = createEDataType(CLASS_LIST_SIMPLE_TYPE);
		classUnionSimpleTypeEDataType = createEDataType(CLASS_UNION_SIMPLE_TYPE);
		mpdClassCodeSimpleTypeObjectEDataType = createEDataType(MPD_CLASS_CODE_SIMPLE_TYPE_OBJECT);
		mpdClassListSimpleTypeEDataType = createEDataType(MPD_CLASS_LIST_SIMPLE_TYPE);
		mpdNameSimpleTypeEDataType = createEDataType(MPD_NAME_SIMPLE_TYPE);
		mpdVersionIDSimpleTypeEDataType = createEDataType(MPD_VERSION_ID_SIMPLE_TYPE);
		qualifiedNameListSimpleTypeEDataType = createEDataType(QUALIFIED_NAME_LIST_SIMPLE_TYPE);
		relationshipCodeSimpleTypeObjectEDataType = createEDataType(RELATIONSHIP_CODE_SIMPLE_TYPE_OBJECT);
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
		gov.niem.release.niem.structures._3._0._0Package the_0Package_2 = (gov.niem.release.niem.structures._3._0._0Package)EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.structures._3._0._0Package.eNS_URI);
		gov.niem.release.niem.niem.core._3._0._0Package the_0Package_1 = (gov.niem.release.niem.niem.core._3._0._0Package)EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.niem.core._3._0._0Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		gov.niem.release.niem.proxy.xsd._3._0._0Package the_0Package_3 = (gov.niem.release.niem.proxy.xsd._3._0._0Package)EPackage.Registry.INSTANCE.getEPackage(gov.niem.release.niem.proxy.xsd._3._0._0Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		catalogTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		conformanceTargetTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		fileSetTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		fileTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		iepConformanceTargetTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		mpdInformationTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		mpdTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		qualifiedNamesTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		referenceSchemaDocumentSetTypeEClass.getESuperTypes().add(this.getFileSetType());
		relationshipTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		relaxNGValidationTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		schemaDocumentSetTypeEClass.getESuperTypes().add(this.getFileSetType());
		schematronValidationTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		textRuleTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		validityContextTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		xmlSchemaTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());
		xPathTypeEClass.getESuperTypes().add(the_0Package_2.getObjectType());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogTypeEClass, CatalogType.class, "CatalogType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatalogType_MPD(), this.getMPDType(), null, "mPD", null, 1, 1, CatalogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformanceTargetTypeEClass, ConformanceTargetType.class, "ConformanceTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformanceTargetType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, ConformanceTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConformanceTargetType_ConformanceTargetURI(), theXMLTypePackage.getAnyURI(), "conformanceTargetURI", null, 1, 1, ConformanceTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ApplicationInfo(), this.getFileType(), null, "applicationInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ArtifactOrArtifactSet(), ecorePackage.getEObject(), null, "artifactOrArtifactSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AuthoritativeSource(), the_0Package_1.getEntityType(), null, "authoritativeSource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BusinessRulesArtifact(), this.getFileType(), null, "businessRulesArtifact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Catalog(), this.getCatalogType(), null, "catalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformanceAssertion(), this.getFileType(), null, "conformanceAssertion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformanceReport(), this.getFileType(), null, "conformanceReport", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformsToConformanceTarget(), this.getConformanceTargetType(), null, "conformsToConformanceTarget", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidityConstraint(), ecorePackage.getEObject(), null, "validityConstraint", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidityConstraintWithContext(), ecorePackage.getEObject(), null, "validityConstraintWithContext", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformsToRule(), this.getTextRuleType(), null, "conformsToRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConstraintSchemaDocumentSet(), this.getSchemaDocumentSetType(), null, "constraintSchemaDocumentSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CreationDate(), the_0Package_3.getDate(), null, "creationDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Documentation(), this.getFileType(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DomainText(), the_0Package_3.getString(), null, "domainText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExchangePartnerName(), the_0Package_3.getString(), null, "exchangePartnerName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExchangePatternText(), the_0Package_3.getString(), null, "exchangePatternText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EXIXMLSchema(), this.getXMLSchemaType(), null, "eXIXMLSchema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtendedInformation(), ecorePackage.getEObject(), null, "extendedInformation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExtensionSchemaDocument(), this.getFileType(), null, "extensionSchemaDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalSchemaDocument(), this.getFileType(), null, "externalSchemaDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_File(), this.getFileType(), null, "file", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FileSet(), this.getFileSetType(), null, "fileSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasDocumentElement(), this.getQualifiedNamesType(), null, "hasDocumentElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IEPConformanceTarget(), this.getIEPConformanceTargetType(), null, "iEPConformanceTarget", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IEPSampleXMLDocument(), this.getFileType(), null, "iEPSampleXMLDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_KeywordText(), the_0Package_3.getString(), null, "keywordText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LastRevisionDate(), the_0Package_3.getDate(), null, "lastRevisionDate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MPD(), this.getMPDType(), null, "mPD", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MPDChangeLog(), this.getFileType(), null, "mPDChangeLog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MPDInformation(), this.getMPDInformationType(), null, "mPDInformation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PurposeText(), the_0Package_3.getString(), null, "purposeText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReadMe(), this.getFileType(), null, "readMe", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferenceSchemaDocument(), this.getFileType(), null, "referenceSchemaDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferenceSchemaDocumentSet(), this.getReferenceSchemaDocumentSetType(), null, "referenceSchemaDocumentSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Relationship(), this.getRelationshipType(), null, "relationship", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelaxNGSchema(), this.getFileType(), null, "relaxNGSchema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RelaxNGValid(), this.getRelaxNGValidationType(), null, "relaxNGValid", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequiredFile(), this.getFileType(), null, "requiredFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RuleText(), the_0Package_1.getTextType(), null, "ruleText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SchemaDocumentSet(), this.getSchemaDocumentSetType(), null, "schemaDocumentSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SchematronSchema(), this.getFileType(), null, "schematronSchema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SchematronValid(), this.getSchematronValidationType(), null, "schematronValid", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StatusText(), the_0Package_3.getString(), null, "statusText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubsetSchemaDocument(), this.getFileType(), null, "subsetSchemaDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidityContext(), this.getValidityContextType(), null, "validityContext", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValidToXPath(), this.getXPathType(), null, "validToXPath", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Wantlist(), this.getFileType(), null, "wantlist", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLCatalog(), this.getFileType(), null, "xMLCatalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLSchemaDocument(), this.getFileType(), null, "xMLSchemaDocument", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLSchemaValid(), this.getXMLSchemaType(), null, "xMLSchemaValid", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ConformanceTargetURI(), theXMLTypePackage.getAnyURI(), "conformanceTargetURI", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ExternalURI(), theXMLTypePackage.getAnyURI(), "externalURI", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MimeMediaTypeText(), theXMLTypePackage.getString(), "mimeMediaTypeText", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MpdClassCode(), this.getMPDClassListSimpleType(), "mpdClassCode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MpdName(), this.getMPDNameSimpleType(), "mpdName", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MpdURI(), theXMLTypePackage.getAnyURI(), "mpdURI", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_MpdVersionID(), this.getMPDVersionIDSimpleType(), "mpdVersionID", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_PathURI(), theXMLTypePackage.getAnyURI(), "pathURI", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_QualifiedNameList(), this.getQualifiedNameListSimpleType(), "qualifiedNameList", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_RelationshipCode(), this.getRelationshipCodeSimpleType(), "relationshipCode", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_ResourceURI(), theXMLTypePackage.getAnyURI(), "resourceURI", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_XPathText(), theXMLTypePackage.getString(), "xPathText", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSetTypeEClass, FileSetType.class, "FileSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileSetType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, FileSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSetType_ArtifactOrArtifactSetGroup(), ecorePackage.getEFeatureMapEntry(), "artifactOrArtifactSetGroup", null, 0, -1, FileSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileSetType_ArtifactOrArtifactSet(), ecorePackage.getEObject(), null, "artifactOrArtifactSet", null, 0, -1, FileSetType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSetType_ExternalURI(), theXMLTypePackage.getAnyURI(), "externalURI", null, 0, 1, FileSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSetType_PathURI(), theXMLTypePackage.getAnyURI(), "pathURI", null, 1, 1, FileSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileTypeEClass, FileType.class, "FileType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileType_RequiredFile(), this.getFileType(), null, "requiredFile", null, 0, -1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileType_ExternalURI(), theXMLTypePackage.getAnyURI(), "externalURI", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileType_MimeMediaTypeText(), theXMLTypePackage.getString(), "mimeMediaTypeText", null, 0, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileType_PathURI(), theXMLTypePackage.getAnyURI(), "pathURI", null, 1, 1, FileType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iepConformanceTargetTypeEClass, IEPConformanceTargetType.class, "IEPConformanceTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIEPConformanceTargetType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, IEPConformanceTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEPConformanceTargetType_ValidityConstraintWithContextGroup(), ecorePackage.getEFeatureMapEntry(), "validityConstraintWithContextGroup", null, 0, -1, IEPConformanceTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIEPConformanceTargetType_ValidityConstraintWithContext(), ecorePackage.getEObject(), null, "validityConstraintWithContext", null, 0, -1, IEPConformanceTargetType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIEPConformanceTargetType_ArtifactOrArtifactSetGroup(), ecorePackage.getEFeatureMapEntry(), "artifactOrArtifactSetGroup", null, 0, -1, IEPConformanceTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIEPConformanceTargetType_ArtifactOrArtifactSet(), ecorePackage.getEObject(), null, "artifactOrArtifactSet", null, 0, -1, IEPConformanceTargetType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mpdInformationTypeEClass, MPDInformationType.class, "MPDInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPDInformationType_AuthoritativeSource(), the_0Package_1.getEntityType(), null, "authoritativeSource", null, 0, 1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_CreationDate(), the_0Package_3.getDate(), null, "creationDate", null, 0, 1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_LastRevisionDate(), the_0Package_3.getDate(), null, "lastRevisionDate", null, 0, 1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_StatusText(), the_0Package_3.getString(), null, "statusText", null, 0, 1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_Relationship(), this.getRelationshipType(), null, "relationship", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_KeywordText(), the_0Package_3.getString(), null, "keywordText", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_DomainText(), the_0Package_3.getString(), null, "domainText", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_PurposeText(), the_0Package_3.getString(), null, "purposeText", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_ExchangePatternText(), the_0Package_3.getString(), null, "exchangePatternText", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_ExchangePartnerName(), the_0Package_3.getString(), null, "exchangePartnerName", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPDInformationType_ExtendedInformationGroup(), ecorePackage.getEFeatureMapEntry(), "extendedInformationGroup", null, 0, -1, MPDInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDInformationType_ExtendedInformation(), ecorePackage.getEObject(), null, "extendedInformation", null, 0, -1, MPDInformationType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mpdTypeEClass, MPDType.class, "MPDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMPDType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDType_MPDInformation(), this.getMPDInformationType(), null, "mPDInformation", null, 0, 1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDType_IEPConformanceTarget(), this.getIEPConformanceTargetType(), null, "iEPConformanceTarget", null, 0, -1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPDType_ArtifactOrArtifactSetGroup(), ecorePackage.getEFeatureMapEntry(), "artifactOrArtifactSetGroup", null, 0, -1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMPDType_ArtifactOrArtifactSet(), ecorePackage.getEObject(), null, "artifactOrArtifactSet", null, 0, -1, MPDType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPDType_MpdClassCode(), this.getMPDClassListSimpleType(), "mpdClassCode", null, 1, 1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPDType_MpdName(), this.getMPDNameSimpleType(), "mpdName", null, 1, 1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPDType_MpdURI(), theXMLTypePackage.getAnyURI(), "mpdURI", null, 1, 1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMPDType_MpdVersionID(), this.getMPDVersionIDSimpleType(), "mpdVersionID", null, 1, 1, MPDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiedNamesTypeEClass, QualifiedNamesType.class, "QualifiedNamesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifiedNamesType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, QualifiedNamesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualifiedNamesType_QualifiedNameList(), this.getQualifiedNameListSimpleType(), "qualifiedNameList", null, 1, 1, QualifiedNamesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceSchemaDocumentSetTypeEClass, ReferenceSchemaDocumentSetType.class, "ReferenceSchemaDocumentSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceSchemaDocumentSetType_ReferenceSchemaDocument(), this.getFileType(), null, "referenceSchemaDocument", null, 1, -1, ReferenceSchemaDocumentSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_RelationshipCode(), this.getRelationshipCodeSimpleType(), "relationshipCode", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipType_ResourceURI(), theXMLTypePackage.getAnyURI(), "resourceURI", null, 1, 1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relaxNGValidationTypeEClass, RelaxNGValidationType.class, "RelaxNGValidationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelaxNGValidationType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, RelaxNGValidationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelaxNGValidationType_RelaxNGSchema(), this.getFileType(), null, "relaxNGSchema", null, 1, 1, RelaxNGValidationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaDocumentSetTypeEClass, SchemaDocumentSetType.class, "SchemaDocumentSetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchemaDocumentSetType_XMLCatalog(), this.getFileType(), null, "xMLCatalog", null, 1, 1, SchemaDocumentSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaDocumentSetType_Wantlist(), this.getFileType(), null, "wantlist", null, 0, 1, SchemaDocumentSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaDocumentSetType_XMLSchemaDocument(), this.getFileType(), null, "xMLSchemaDocument", null, 0, -1, SchemaDocumentSetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schematronValidationTypeEClass, SchematronValidationType.class, "SchematronValidationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchematronValidationType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, SchematronValidationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchematronValidationType_SchematronSchema(), this.getFileType(), null, "schematronSchema", null, 1, 1, SchematronValidationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textRuleTypeEClass, TextRuleType.class, "TextRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextRuleType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, TextRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextRuleType_RuleText(), the_0Package_1.getTextType(), null, "ruleText", null, 1, 1, TextRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validityContextTypeEClass, ValidityContextType.class, "ValidityContextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidityContextType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, ValidityContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityContextType_ValidityConstraintGroup(), ecorePackage.getEFeatureMapEntry(), "validityConstraintGroup", null, 1, -1, ValidityContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValidityContextType_ValidityConstraint(), ecorePackage.getEObject(), null, "validityConstraint", null, 1, -1, ValidityContextType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getValidityContextType_XPathText(), theXMLTypePackage.getString(), "xPathText", null, 1, 1, ValidityContextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlSchemaTypeEClass, XMLSchemaType.class, "XMLSchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXMLSchemaType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, XMLSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLSchemaType_XMLCatalog(), this.getFileType(), null, "xMLCatalog", null, 1, 1, XMLSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMLSchemaType_XMLSchemaDocument(), this.getFileType(), null, "xMLSchemaDocument", null, 1, 1, XMLSchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPathTypeEClass, XPathType.class, "XPathType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXPathType_DescriptionText(), the_0Package_1.getTextType(), null, "descriptionText", null, 0, 1, XPathType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXPathType_XPathText(), theXMLTypePackage.getString(), "xPathText", null, 1, 1, XPathType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mpdClassCodeSimpleTypeEEnum, MPDClassCodeSimpleType.class, "MPDClassCodeSimpleType");
		addEEnumLiteral(mpdClassCodeSimpleTypeEEnum, MPDClassCodeSimpleType.REL);
		addEEnumLiteral(mpdClassCodeSimpleTypeEEnum, MPDClassCodeSimpleType.CU);
		addEEnumLiteral(mpdClassCodeSimpleTypeEEnum, MPDClassCodeSimpleType.DU);
		addEEnumLiteral(mpdClassCodeSimpleTypeEEnum, MPDClassCodeSimpleType.IEPD);
		addEEnumLiteral(mpdClassCodeSimpleTypeEEnum, MPDClassCodeSimpleType.EIEM);

		initEEnum(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.class, "RelationshipCodeSimpleType");
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.VERSION_OF);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.SPECIALIZES);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.GENERALIZES);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.SUPERSEDES);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.DEPRECATES);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.ADAPTS);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.UPDATES);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.CONFORMS_TO);
		addEEnumLiteral(relationshipCodeSimpleTypeEEnum, RelationshipCodeSimpleType.DERIVES_FROM);

		// Initialize data types
		initEDataType(classListSimpleTypeEDataType, List.class, "ClassListSimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classUnionSimpleTypeEDataType, Object.class, "ClassUnionSimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mpdClassCodeSimpleTypeObjectEDataType, MPDClassCodeSimpleType.class, "MPDClassCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mpdClassListSimpleTypeEDataType, List.class, "MPDClassListSimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mpdNameSimpleTypeEDataType, String.class, "MPDNameSimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mpdVersionIDSimpleTypeEDataType, String.class, "MPDVersionIDSimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(qualifiedNameListSimpleTypeEDataType, List.class, "QualifiedNameListSimpleType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(relationshipCodeSimpleTypeObjectEDataType, RelationshipCodeSimpleType.class, "RelationshipCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
			 "appinfo", "\r\n\t<term:LocalTerm literal=\"Enterprise Information Exchange Model\" term=\"EIEM\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Efficient XML Interchange\" term=\"EXI\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Internet Assigned Numbers Authority\" term=\"IANA\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Identifier\" term=\"ID\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm definition=\"an instance XML document\" literal=\"Information Exchange Package\" term=\"IEP\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Information Exchange Package        Documentation\" term=\"IEPD\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Multipurpose Internet Mail Extension\" term=\"MIME\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Model Package Description\" term=\"MPD\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Organization for the Advancement       of Structured Information Standards\" term=\"OASIS\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm literal=\"Schema Subset Generation Tool\" term=\"SSGT\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n        <term:LocalTerm literal=\"Uniform Resource Identifier\" term=\"URI\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n\t<term:LocalTerm definition=\"An XML file that represents a NIEM    schema document subset; used by NIEM Schema Subset Generation    Tool to input/output a schema document subset\" term=\"Wantlist\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      \r\n\r\n      <term:LocalTerm literal=\"Social Security Number\" term=\"SSN\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"International Organization for Standardization\" term=\"ISO\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Military Grid Reference System\" term=\"MGRS\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm definition=\"Three-letter\" term=\"Alpha3\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm definition=\"Two-letter\" term=\"Alpha2\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Two-dimensional\" term=\"2D\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Three-dimensional\" term=\"3D\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"International Mobile Equipment Identity\" term=\"IMEI\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Drug Enforcement Administration\" term=\"DEA\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Universal Transverse Mercator\" term=\"UTM\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"electronic serial number\" term=\"ESN\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Federal Information Processing Standards\" term=\"FIPS\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"North American Numbering Plan\" term=\"NANP\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Geopolitical Entities, Names, and Codes\" term=\"GENC\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"media access control address\" term=\"MAC\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm literal=\"Commercial Motor Vehicle\" term=\"CMV\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    \r\n\r\n      <term:LocalTerm literal=\"Universal Transverse Mercator\" term=\"UTM\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    \r\n\r\n      <term:LocalTerm definition=\"Two-letter\" term=\"Alpha2\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n      <term:LocalTerm definition=\"Three-letter\" term=\"Alpha3\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    \r\n\r\n      <term:LocalTerm definition=\"Three-letter\" term=\"Alpha3\" xmlns:term=\"http://release.niem.gov/niem/localTerminology/3.0/\"/>\r\n    "
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
			 "conformanceTargets", "http://reference.niem.gov/niem/specification/naming-and-design-rules/3.0/#ExtensionSchemaDocument"
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
		  (catalogTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CatalogType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getCatalogType_MPD(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MPD",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (classListSimpleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ClassListSimpleType",
			 "itemType", "ClassUnionSimpleType"
		   });			
		addAnnotation
		  (classUnionSimpleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ClassUnionSimpleType",
			 "memberTypes", "MPDClassCodeSimpleType http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });			
		addAnnotation
		  (conformanceTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ConformanceTargetType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getConformanceTargetType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getConformanceTargetType_ConformanceTargetURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conformanceTargetURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_ApplicationInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ApplicationInfo",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ArtifactOrArtifactSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ArtifactOrArtifactSet",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_AuthoritativeSource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuthoritativeSource",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_BusinessRulesArtifact(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BusinessRulesArtifact",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Catalog",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ConformanceAssertion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConformanceAssertion",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ConformanceReport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConformanceReport",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ConformsToConformanceTarget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConformsToConformanceTarget",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraint"
		   });			
		addAnnotation
		  (getDocumentRoot_ValidityConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidityConstraint",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraintWithContext"
		   });			
		addAnnotation
		  (getDocumentRoot_ValidityConstraintWithContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidityConstraintWithContext",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ConformsToRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConformsToRule",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraint"
		   });			
		addAnnotation
		  (getDocumentRoot_ConstraintSchemaDocumentSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ConstraintSchemaDocumentSet",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_DomainText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DomainText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExchangePartnerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePartnerName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExchangePatternText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePatternText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_EXIXMLSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EXIXMLSchema",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ExtendedInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtendedInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExtensionSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtensionSchemaDocument",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ExternalSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalSchemaDocument",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "File",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_FileSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FileSet",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_HasDocumentElement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "HasDocumentElement",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraintWithContext"
		   });			
		addAnnotation
		  (getDocumentRoot_IEPConformanceTarget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPConformanceTarget",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_IEPSampleXMLDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPSampleXMLDocument",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_KeywordText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeywordText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LastRevisionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LastRevisionDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MPD(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MPD",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MPDChangeLog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MPDChangeLog",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_MPDInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MPDInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_PurposeText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PurposeText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ReadMe(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReadMe",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ReferenceSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceSchemaDocument",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ReferenceSchemaDocumentSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceSchemaDocumentSet",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_Relationship(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Relationship",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RelaxNGSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelaxNGSchema",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_RelaxNGValid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelaxNGValid",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraint"
		   });			
		addAnnotation
		  (getDocumentRoot_RequiredFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequiredFile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RuleText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RuleText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SchemaDocumentSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SchemaDocumentSet",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_SchematronSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SchematronSchema",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_SchematronValid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SchematronValid",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraint"
		   });			
		addAnnotation
		  (getDocumentRoot_StatusText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StatusText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_SubsetSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SubsetSchemaDocument",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_ValidityContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidityContext",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraintWithContext"
		   });			
		addAnnotation
		  (getDocumentRoot_ValidToXPath(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidToXPath",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraint"
		   });			
		addAnnotation
		  (getDocumentRoot_Wantlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Wantlist",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_XMLCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLCatalog",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_XMLSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLSchemaDocument",
			 "namespace", "##targetNamespace",
			 "affiliation", "ArtifactOrArtifactSet"
		   });			
		addAnnotation
		  (getDocumentRoot_XMLSchemaValid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLSchemaValid",
			 "namespace", "##targetNamespace",
			 "affiliation", "ValidityConstraint"
		   });			
		addAnnotation
		  (getDocumentRoot_ConformanceTargetURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "conformanceTargetURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ExternalURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MimeMediaTypeText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeMediaTypeText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MpdClassCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdClassCode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MpdName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MpdURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_MpdVersionID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdVersionID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_PathURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pathURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_QualifiedNameList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifiedNameList",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RelationshipCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipCode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_ResourceURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resourceURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_XPathText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xPathText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fileSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FileSetType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getFileSetType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getFileSetType_ArtifactOrArtifactSetGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ArtifactOrArtifactSet:group",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFileSetType_ArtifactOrArtifactSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ArtifactOrArtifactSet",
			 "namespace", "##targetNamespace",
			 "group", "ArtifactOrArtifactSet:group"
		   });			
		addAnnotation
		  (getFileSetType_ExternalURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFileSetType_PathURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pathURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (fileTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FileType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getFileType_RequiredFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RequiredFile",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFileType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getFileType_ExternalURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFileType_MimeMediaTypeText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mimeMediaTypeText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getFileType_PathURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pathURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (iepConformanceTargetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IEPConformanceTargetType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getIEPConformanceTargetType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getIEPConformanceTargetType_ValidityConstraintWithContextGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ValidityConstraintWithContext:group",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getIEPConformanceTargetType_ValidityConstraintWithContext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidityConstraintWithContext",
			 "namespace", "##targetNamespace",
			 "group", "ValidityConstraintWithContext:group"
		   });			
		addAnnotation
		  (getIEPConformanceTargetType_ArtifactOrArtifactSetGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ArtifactOrArtifactSet:group",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getIEPConformanceTargetType_ArtifactOrArtifactSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ArtifactOrArtifactSet",
			 "namespace", "##targetNamespace",
			 "group", "ArtifactOrArtifactSet:group"
		   });			
		addAnnotation
		  (mpdClassCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "MPDClassCodeSimpleType"
		   });							
		addAnnotation
		  (mpdClassCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MPDClassCodeSimpleType:Object",
			 "baseType", "MPDClassCodeSimpleType"
		   });			
		addAnnotation
		  (mpdClassListSimpleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "MPDClassListSimpleType",
			 "baseType", "ClassListSimpleType",
			 "minLength", "1"
		   });			
		addAnnotation
		  (mpdInformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MPDInformationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getMPDInformationType_AuthoritativeSource(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AuthoritativeSource",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_CreationDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CreationDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_LastRevisionDate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LastRevisionDate",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_StatusText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StatusText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_Relationship(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Relationship",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_KeywordText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KeywordText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_DomainText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DomainText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_PurposeText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PurposeText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_ExchangePatternText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePatternText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_ExchangePartnerName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExchangePartnerName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_ExtendedInformationGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ExtendedInformation:group",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDInformationType_ExtendedInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtendedInformation",
			 "namespace", "##targetNamespace",
			 "group", "ExtendedInformation:group"
		   });			
		addAnnotation
		  (mpdNameSimpleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "MPDNameSimpleType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[a-z]([-_]?[a-z0-9]+)*"
		   });			
		addAnnotation
		  (mpdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MPDType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getMPDType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getMPDType_MPDInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MPDInformation",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDType_IEPConformanceTarget(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IEPConformanceTarget",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDType_ArtifactOrArtifactSetGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ArtifactOrArtifactSet:group",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDType_ArtifactOrArtifactSet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ArtifactOrArtifactSet",
			 "namespace", "##targetNamespace",
			 "group", "ArtifactOrArtifactSet:group"
		   });			
		addAnnotation
		  (getMPDType_MpdClassCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdClassCode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDType_MpdName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdName",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDType_MpdURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getMPDType_MpdVersionID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mpdVersionID",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (mpdVersionIDSimpleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "MPDVersionIDSimpleType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[0-9]+(\\.[0-9]+)*((alpha|beta|rc|rev)[0-9]+)?"
		   });			
		addAnnotation
		  (qualifiedNameListSimpleTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "QualifiedNameListSimpleType",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
		   });			
		addAnnotation
		  (qualifiedNamesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "QualifiedNamesType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getQualifiedNamesType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getQualifiedNamesType_QualifiedNameList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifiedNameList",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (referenceSchemaDocumentSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReferenceSchemaDocumentSetType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getReferenceSchemaDocumentSetType_ReferenceSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ReferenceSchemaDocument",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (relationshipCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "RelationshipCodeSimpleType"
		   });											
		addAnnotation
		  (relationshipCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "RelationshipCodeSimpleType:Object",
			 "baseType", "RelationshipCodeSimpleType"
		   });			
		addAnnotation
		  (relationshipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelationshipType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRelationshipType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getRelationshipType_RelationshipCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "relationshipCode",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getRelationshipType_ResourceURI(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resourceURI",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (relaxNGValidationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RelaxNGValidationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRelaxNGValidationType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getRelaxNGValidationType_RelaxNGSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RelaxNGSchema",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (schemaDocumentSetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SchemaDocumentSetType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSchemaDocumentSetType_XMLCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLCatalog",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSchemaDocumentSetType_Wantlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Wantlist",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSchemaDocumentSetType_XMLSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLSchemaDocument",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (schematronValidationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SchematronValidationType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSchematronValidationType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getSchematronValidationType_SchematronSchema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SchematronSchema",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (textRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TextRuleType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTextRuleType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getTextRuleType_RuleText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RuleText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (validityContextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ValidityContextType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getValidityContextType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getValidityContextType_ValidityConstraintGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ValidityConstraint:group",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getValidityContextType_ValidityConstraint(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ValidityConstraint",
			 "namespace", "##targetNamespace",
			 "group", "ValidityConstraint:group"
		   });			
		addAnnotation
		  (getValidityContextType_XPathText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xPathText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (xmlSchemaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XMLSchemaType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getXMLSchemaType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getXMLSchemaType_XMLCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLCatalog",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getXMLSchemaType_XMLSchemaDocument(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XMLSchemaDocument",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (xPathTypeEClass, 
		   source, 
		   new String[] {
			 "name", "XPathType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getXPathType_DescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DescriptionText",
			 "namespace", "http://release.niem.gov/niem/niem-core/3.0/"
		   });			
		addAnnotation
		  (getXPathType_XPathText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xPathText",
			 "namespace", "##targetNamespace"
		   });
	}

} //_0PackageImpl
