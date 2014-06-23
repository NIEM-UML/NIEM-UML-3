/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.impl;

import gov.niem.niem.structures._2._2Package;

import gov.niem.niem.structures._2.impl._2PackageImpl;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeSimpleType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Factory;
import gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1PackageImpl extends EPackageImpl implements _1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeLogEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeLogTypeEClass = null;

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
	private EClass modifiedFacetEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiedNamespaceEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiedPropertyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiedTypeContainsPropertyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiedTypeEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newFacetEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newNamespaceEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newPropertyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newTypeContainsPropertyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newTypeEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedFacetEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedNamespaceEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedPropertyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedTypeContainsPropertyEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedTypeEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType changeCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _1PackageImpl() {
		super(eNS_URI, _1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _1Package init() {
		if (isInited) return (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Obtain or create and register package
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) : _2Package.eINSTANCE);
		gov.niem.niem.proxy.xsd._2.impl._2PackageImpl the_2Package_1 = (gov.niem.niem.proxy.xsd._2.impl._2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.proxy.xsd._2._2Package.eNS_URI) instanceof gov.niem.niem.proxy.xsd._2.impl._2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.proxy.xsd._2._2Package.eNS_URI) : gov.niem.niem.proxy.xsd._2._2Package.eINSTANCE);
		gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl the_1Package_1 = (gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.model._1._1._1Package.eNS_URI) instanceof gov.niem.reference.niem.resource.model._1._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.model._1._1._1Package.eNS_URI) : gov.niem.reference.niem.resource.model._1._1._1Package.eINSTANCE);

		// Create package meta-data objects
		the_1Package.createPackageContents();
		the_2Package.createPackageContents();
		the_2Package_1.createPackageContents();
		the_1Package_1.createPackageContents();

		// Initialize created meta-data
		the_1Package.initializePackageContents();
		the_2Package.initializePackageContents();
		the_2Package_1.initializePackageContents();
		the_1Package_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		the_1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_1Package.eNS_URI, the_1Package);
		return the_1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeCodeType() {
		return changeCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCodeType_Value() {
		return (EAttribute)changeCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCodeType_Id() {
		return (EAttribute)changeCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCodeType_LinkMetadata() {
		return (EAttribute)changeCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCodeType_Metadata() {
		return (EAttribute)changeCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeInformationType() {
		return changeInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeInformationType_ChangeSummaryText() {
		return (EReference)changeInformationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeInformationType_ChangeReasonText() {
		return (EReference)changeInformationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeInformationType_ChangeFullDescriptionText() {
		return (EReference)changeInformationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeInformationType_ChangeNCCTIssueNumber() {
		return (EReference)changeInformationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeInformationType_ChangeCode() {
		return (EReference)changeInformationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeLogEntryType() {
		return changeLogEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeLogEntryType_ChangeInformationAbstractGroup() {
		return (EAttribute)changeLogEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogEntryType_ChangeInformationAbstract() {
		return (EReference)changeLogEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeLogType() {
		return changeLogTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ChangeLogSummaryText() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ChangeLogSubmitterName() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ChangeLogApplicationInstructionsText() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ChangeInformation() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_NewPropertyEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_NewTypeEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_NewTypeContainsPropertyEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_NewFacetEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_NewNamespaceEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ModifiedPropertyEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ModifiedTypeEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ModifiedTypeContainsPropertyEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ModifiedFacetEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_ModifiedNamespaceEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_RemovedPropertyEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_RemovedTypeEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_RemovedTypeContainsPropertyEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_RemovedFacetEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLogType_RemovedNamespaceEntry() {
		return (EReference)changeLogTypeEClass.getEStructuralFeatures().get(18);
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
	public EReference getDocumentRoot_ChangeCode() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeFullDescriptionText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeInformation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeInformationAbstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeInformationReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeLog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeLogApplicationInstructionsText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeLogSubmitterName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeLogSummaryText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeNCCTIssueNumber() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeReasonText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChangeSummaryText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifiedFacetEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifiedNamespaceEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifiedPropertyEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifiedTypeContainsPropertyEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModifiedTypeEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewFacet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewFacetEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewNamespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewNamespaceEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewPropertyEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewTypeContainsProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewTypeContainsPropertyEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NewTypeEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OriginalFacet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OriginalNamespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OriginalProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OriginalType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OriginalTypeContainsProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedFacet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedFacetEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedNamespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedNamespaceEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedPropertyEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedTypeContainsProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedTypeContainsPropertyEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RemovedTypeEntry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdatedFacet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdatedNamespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdatedProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdatedType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UpdatedTypeContainsProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiedFacetEntryType() {
		return modifiedFacetEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedFacetEntryType_OriginalFacet() {
		return (EReference)modifiedFacetEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedFacetEntryType_UpdatedFacet() {
		return (EReference)modifiedFacetEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiedNamespaceEntryType() {
		return modifiedNamespaceEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedNamespaceEntryType_OriginalNamespace() {
		return (EReference)modifiedNamespaceEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedNamespaceEntryType_UpdatedNamespace() {
		return (EReference)modifiedNamespaceEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiedPropertyEntryType() {
		return modifiedPropertyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedPropertyEntryType_OriginalProperty() {
		return (EReference)modifiedPropertyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedPropertyEntryType_UpdatedProperty() {
		return (EReference)modifiedPropertyEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiedTypeContainsPropertyEntryType() {
		return modifiedTypeContainsPropertyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTypeContainsPropertyEntryType_OriginalTypeContainsProperty() {
		return (EReference)modifiedTypeContainsPropertyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTypeContainsPropertyEntryType_UpdatedTypeContainsProperty() {
		return (EReference)modifiedTypeContainsPropertyEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiedTypeEntryType() {
		return modifiedTypeEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTypeEntryType_OriginalType() {
		return (EReference)modifiedTypeEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedTypeEntryType_UpdatedType() {
		return (EReference)modifiedTypeEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewFacetEntryType() {
		return newFacetEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewFacetEntryType_NewFacet() {
		return (EReference)newFacetEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewNamespaceEntryType() {
		return newNamespaceEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewNamespaceEntryType_NewNamespace() {
		return (EReference)newNamespaceEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewPropertyEntryType() {
		return newPropertyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewPropertyEntryType_NewProperty() {
		return (EReference)newPropertyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewTypeContainsPropertyEntryType() {
		return newTypeContainsPropertyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewTypeContainsPropertyEntryType_NewTypeContainsProperty() {
		return (EReference)newTypeContainsPropertyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewTypeEntryType() {
		return newTypeEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewTypeEntryType_NewType() {
		return (EReference)newTypeEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedFacetEntryType() {
		return removedFacetEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemovedFacetEntryType_RemovedFacet() {
		return (EReference)removedFacetEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedNamespaceEntryType() {
		return removedNamespaceEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemovedNamespaceEntryType_RemovedNamespace() {
		return (EReference)removedNamespaceEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedPropertyEntryType() {
		return removedPropertyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemovedPropertyEntryType_RemovedProperty() {
		return (EReference)removedPropertyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedTypeContainsPropertyEntryType() {
		return removedTypeContainsPropertyEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemovedTypeContainsPropertyEntryType_RemovedTypeContainsProperty() {
		return (EReference)removedTypeContainsPropertyEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedTypeEntryType() {
		return removedTypeEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemovedTypeEntryType_RemovedType() {
		return (EReference)removedTypeEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeCodeSimpleType() {
		return changeCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChangeCodeSimpleTypeObject() {
		return changeCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Factory get_1Factory() {
		return (_1Factory)getEFactoryInstance();
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
		changeCodeTypeEClass = createEClass(CHANGE_CODE_TYPE);
		createEAttribute(changeCodeTypeEClass, CHANGE_CODE_TYPE__VALUE);
		createEAttribute(changeCodeTypeEClass, CHANGE_CODE_TYPE__ID);
		createEAttribute(changeCodeTypeEClass, CHANGE_CODE_TYPE__LINK_METADATA);
		createEAttribute(changeCodeTypeEClass, CHANGE_CODE_TYPE__METADATA);

		changeInformationTypeEClass = createEClass(CHANGE_INFORMATION_TYPE);
		createEReference(changeInformationTypeEClass, CHANGE_INFORMATION_TYPE__CHANGE_SUMMARY_TEXT);
		createEReference(changeInformationTypeEClass, CHANGE_INFORMATION_TYPE__CHANGE_REASON_TEXT);
		createEReference(changeInformationTypeEClass, CHANGE_INFORMATION_TYPE__CHANGE_FULL_DESCRIPTION_TEXT);
		createEReference(changeInformationTypeEClass, CHANGE_INFORMATION_TYPE__CHANGE_NCCT_ISSUE_NUMBER);
		createEReference(changeInformationTypeEClass, CHANGE_INFORMATION_TYPE__CHANGE_CODE);

		changeLogEntryTypeEClass = createEClass(CHANGE_LOG_ENTRY_TYPE);
		createEAttribute(changeLogEntryTypeEClass, CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT_GROUP);
		createEReference(changeLogEntryTypeEClass, CHANGE_LOG_ENTRY_TYPE__CHANGE_INFORMATION_ABSTRACT);

		changeLogTypeEClass = createEClass(CHANGE_LOG_TYPE);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__CHANGE_LOG_SUMMARY_TEXT);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__CHANGE_LOG_SUBMITTER_NAME);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__CHANGE_INFORMATION);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__NEW_PROPERTY_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__NEW_TYPE_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__NEW_TYPE_CONTAINS_PROPERTY_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__NEW_FACET_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__NEW_NAMESPACE_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__MODIFIED_PROPERTY_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__MODIFIED_TYPE_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__MODIFIED_FACET_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__MODIFIED_NAMESPACE_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__REMOVED_PROPERTY_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__REMOVED_TYPE_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__REMOVED_FACET_ENTRY);
		createEReference(changeLogTypeEClass, CHANGE_LOG_TYPE__REMOVED_NAMESPACE_ENTRY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_FULL_DESCRIPTION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_INFORMATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_INFORMATION_ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_INFORMATION_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_LOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_LOG_APPLICATION_INSTRUCTIONS_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_LOG_SUBMITTER_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_LOG_SUMMARY_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_NCCT_ISSUE_NUMBER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_REASON_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANGE_SUMMARY_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED_FACET_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED_NAMESPACE_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED_PROPERTY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODIFIED_TYPE_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_FACET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_FACET_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_NAMESPACE_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_PROPERTY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_TYPE_CONTAINS_PROPERTY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEW_TYPE_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORIGINAL_FACET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORIGINAL_NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORIGINAL_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORIGINAL_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORIGINAL_TYPE_CONTAINS_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_FACET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_FACET_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_NAMESPACE_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_PROPERTY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REMOVED_TYPE_ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATED_FACET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATED_NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATED_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATED_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UPDATED_TYPE_CONTAINS_PROPERTY);

		modifiedFacetEntryTypeEClass = createEClass(MODIFIED_FACET_ENTRY_TYPE);
		createEReference(modifiedFacetEntryTypeEClass, MODIFIED_FACET_ENTRY_TYPE__ORIGINAL_FACET);
		createEReference(modifiedFacetEntryTypeEClass, MODIFIED_FACET_ENTRY_TYPE__UPDATED_FACET);

		modifiedNamespaceEntryTypeEClass = createEClass(MODIFIED_NAMESPACE_ENTRY_TYPE);
		createEReference(modifiedNamespaceEntryTypeEClass, MODIFIED_NAMESPACE_ENTRY_TYPE__ORIGINAL_NAMESPACE);
		createEReference(modifiedNamespaceEntryTypeEClass, MODIFIED_NAMESPACE_ENTRY_TYPE__UPDATED_NAMESPACE);

		modifiedPropertyEntryTypeEClass = createEClass(MODIFIED_PROPERTY_ENTRY_TYPE);
		createEReference(modifiedPropertyEntryTypeEClass, MODIFIED_PROPERTY_ENTRY_TYPE__ORIGINAL_PROPERTY);
		createEReference(modifiedPropertyEntryTypeEClass, MODIFIED_PROPERTY_ENTRY_TYPE__UPDATED_PROPERTY);

		modifiedTypeContainsPropertyEntryTypeEClass = createEClass(MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE);
		createEReference(modifiedTypeContainsPropertyEntryTypeEClass, MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__ORIGINAL_TYPE_CONTAINS_PROPERTY);
		createEReference(modifiedTypeContainsPropertyEntryTypeEClass, MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__UPDATED_TYPE_CONTAINS_PROPERTY);

		modifiedTypeEntryTypeEClass = createEClass(MODIFIED_TYPE_ENTRY_TYPE);
		createEReference(modifiedTypeEntryTypeEClass, MODIFIED_TYPE_ENTRY_TYPE__ORIGINAL_TYPE);
		createEReference(modifiedTypeEntryTypeEClass, MODIFIED_TYPE_ENTRY_TYPE__UPDATED_TYPE);

		newFacetEntryTypeEClass = createEClass(NEW_FACET_ENTRY_TYPE);
		createEReference(newFacetEntryTypeEClass, NEW_FACET_ENTRY_TYPE__NEW_FACET);

		newNamespaceEntryTypeEClass = createEClass(NEW_NAMESPACE_ENTRY_TYPE);
		createEReference(newNamespaceEntryTypeEClass, NEW_NAMESPACE_ENTRY_TYPE__NEW_NAMESPACE);

		newPropertyEntryTypeEClass = createEClass(NEW_PROPERTY_ENTRY_TYPE);
		createEReference(newPropertyEntryTypeEClass, NEW_PROPERTY_ENTRY_TYPE__NEW_PROPERTY);

		newTypeContainsPropertyEntryTypeEClass = createEClass(NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE);
		createEReference(newTypeContainsPropertyEntryTypeEClass, NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__NEW_TYPE_CONTAINS_PROPERTY);

		newTypeEntryTypeEClass = createEClass(NEW_TYPE_ENTRY_TYPE);
		createEReference(newTypeEntryTypeEClass, NEW_TYPE_ENTRY_TYPE__NEW_TYPE);

		removedFacetEntryTypeEClass = createEClass(REMOVED_FACET_ENTRY_TYPE);
		createEReference(removedFacetEntryTypeEClass, REMOVED_FACET_ENTRY_TYPE__REMOVED_FACET);

		removedNamespaceEntryTypeEClass = createEClass(REMOVED_NAMESPACE_ENTRY_TYPE);
		createEReference(removedNamespaceEntryTypeEClass, REMOVED_NAMESPACE_ENTRY_TYPE__REMOVED_NAMESPACE);

		removedPropertyEntryTypeEClass = createEClass(REMOVED_PROPERTY_ENTRY_TYPE);
		createEReference(removedPropertyEntryTypeEClass, REMOVED_PROPERTY_ENTRY_TYPE__REMOVED_PROPERTY);

		removedTypeContainsPropertyEntryTypeEClass = createEClass(REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE);
		createEReference(removedTypeContainsPropertyEntryTypeEClass, REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE__REMOVED_TYPE_CONTAINS_PROPERTY);

		removedTypeEntryTypeEClass = createEClass(REMOVED_TYPE_ENTRY_TYPE);
		createEReference(removedTypeEntryTypeEClass, REMOVED_TYPE_ENTRY_TYPE__REMOVED_TYPE);

		// Create enums
		changeCodeSimpleTypeEEnum = createEEnum(CHANGE_CODE_SIMPLE_TYPE);

		// Create data types
		changeCodeSimpleTypeObjectEDataType = createEDataType(CHANGE_CODE_SIMPLE_TYPE_OBJECT);
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
		_2Package the_2Package = (_2Package)EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI);
		gov.niem.niem.proxy.xsd._2._2Package the_2Package_1 = (gov.niem.niem.proxy.xsd._2._2Package)EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.proxy.xsd._2._2Package.eNS_URI);
		gov.niem.reference.niem.resource.model._1._1._1Package the_1Package_1 = (gov.niem.reference.niem.resource.model._1._1._1Package)EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.model._1._1._1Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		changeInformationTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		changeLogEntryTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		changeLogTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		modifiedFacetEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		modifiedNamespaceEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		modifiedPropertyEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		modifiedTypeContainsPropertyEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		modifiedTypeEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		newFacetEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		newNamespaceEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		newPropertyEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		newTypeContainsPropertyEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		newTypeEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		removedFacetEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		removedNamespaceEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		removedPropertyEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		removedTypeContainsPropertyEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());
		removedTypeEntryTypeEClass.getESuperTypes().add(this.getChangeLogEntryType());

		// Initialize classes, features, and operations; add parameters
		initEClass(changeCodeTypeEClass, ChangeCodeType.class, "ChangeCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeCodeType_Value(), this.getChangeCodeSimpleType(), "value", null, 0, 1, ChangeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ChangeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeCodeType_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, ChangeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, ChangeCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeInformationTypeEClass, ChangeInformationType.class, "ChangeInformationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeInformationType_ChangeSummaryText(), the_2Package_1.getString(), null, "changeSummaryText", null, 0, 1, ChangeInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeInformationType_ChangeReasonText(), the_2Package_1.getString(), null, "changeReasonText", null, 0, 1, ChangeInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeInformationType_ChangeFullDescriptionText(), the_2Package_1.getString(), null, "changeFullDescriptionText", null, 0, 1, ChangeInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeInformationType_ChangeNCCTIssueNumber(), the_2Package_1.getInteger(), null, "changeNCCTIssueNumber", null, 0, -1, ChangeInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeInformationType_ChangeCode(), this.getChangeCodeType(), null, "changeCode", null, 0, -1, ChangeInformationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeLogEntryTypeEClass, ChangeLogEntryType.class, "ChangeLogEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeLogEntryType_ChangeInformationAbstractGroup(), ecorePackage.getEFeatureMapEntry(), "changeInformationAbstractGroup", null, 0, -1, ChangeLogEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogEntryType_ChangeInformationAbstract(), ecorePackage.getEObject(), null, "changeInformationAbstract", null, 0, -1, ChangeLogEntryType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(changeLogTypeEClass, ChangeLogType.class, "ChangeLogType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeLogType_ChangeLogSummaryText(), the_2Package_1.getString(), null, "changeLogSummaryText", null, 0, 1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ChangeLogSubmitterName(), the_2Package_1.getString(), null, "changeLogSubmitterName", null, 0, 1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ChangeLogApplicationInstructionsText(), the_2Package_1.getString(), null, "changeLogApplicationInstructionsText", null, 0, 1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ChangeInformation(), this.getChangeInformationType(), null, "changeInformation", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_NewPropertyEntry(), this.getNewPropertyEntryType(), null, "newPropertyEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_NewTypeEntry(), this.getNewTypeEntryType(), null, "newTypeEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_NewTypeContainsPropertyEntry(), this.getNewTypeContainsPropertyEntryType(), null, "newTypeContainsPropertyEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_NewFacetEntry(), this.getNewFacetEntryType(), null, "newFacetEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_NewNamespaceEntry(), this.getNewNamespaceEntryType(), null, "newNamespaceEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ModifiedPropertyEntry(), this.getModifiedPropertyEntryType(), null, "modifiedPropertyEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ModifiedTypeEntry(), this.getModifiedTypeEntryType(), null, "modifiedTypeEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ModifiedTypeContainsPropertyEntry(), this.getModifiedTypeContainsPropertyEntryType(), null, "modifiedTypeContainsPropertyEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ModifiedFacetEntry(), this.getModifiedFacetEntryType(), null, "modifiedFacetEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_ModifiedNamespaceEntry(), this.getModifiedNamespaceEntryType(), null, "modifiedNamespaceEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_RemovedPropertyEntry(), this.getRemovedPropertyEntryType(), null, "removedPropertyEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_RemovedTypeEntry(), this.getRemovedTypeEntryType(), null, "removedTypeEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_RemovedTypeContainsPropertyEntry(), this.getRemovedTypeContainsPropertyEntryType(), null, "removedTypeContainsPropertyEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_RemovedFacetEntry(), this.getRemovedFacetEntryType(), null, "removedFacetEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLogType_RemovedNamespaceEntry(), this.getRemovedNamespaceEntryType(), null, "removedNamespaceEntry", null, 0, -1, ChangeLogType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeCode(), this.getChangeCodeType(), null, "changeCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeFullDescriptionText(), the_2Package_1.getString(), null, "changeFullDescriptionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeInformation(), this.getChangeInformationType(), null, "changeInformation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeInformationAbstract(), ecorePackage.getEObject(), null, "changeInformationAbstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeInformationReference(), the_2Package.getReferenceType(), null, "changeInformationReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeLog(), this.getChangeLogType(), null, "changeLog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeLogApplicationInstructionsText(), the_2Package_1.getString(), null, "changeLogApplicationInstructionsText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeLogSubmitterName(), the_2Package_1.getString(), null, "changeLogSubmitterName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeLogSummaryText(), the_2Package_1.getString(), null, "changeLogSummaryText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeNCCTIssueNumber(), the_2Package_1.getInteger(), null, "changeNCCTIssueNumber", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeReasonText(), the_2Package_1.getString(), null, "changeReasonText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChangeSummaryText(), the_2Package_1.getString(), null, "changeSummaryText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModifiedFacetEntry(), this.getModifiedFacetEntryType(), null, "modifiedFacetEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModifiedNamespaceEntry(), this.getModifiedNamespaceEntryType(), null, "modifiedNamespaceEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModifiedPropertyEntry(), this.getModifiedPropertyEntryType(), null, "modifiedPropertyEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModifiedTypeContainsPropertyEntry(), this.getModifiedTypeContainsPropertyEntryType(), null, "modifiedTypeContainsPropertyEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModifiedTypeEntry(), this.getModifiedTypeEntryType(), null, "modifiedTypeEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewFacet(), the_1Package_1.getFacetType(), null, "newFacet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewFacetEntry(), this.getNewFacetEntryType(), null, "newFacetEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewNamespace(), the_1Package_1.getNamespaceType(), null, "newNamespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewNamespaceEntry(), this.getNewNamespaceEntryType(), null, "newNamespaceEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewProperty(), the_1Package_1.getPropertyObjectType(), null, "newProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewPropertyEntry(), this.getNewPropertyEntryType(), null, "newPropertyEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewType(), the_1Package_1.getTypeObjectType(), null, "newType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "newTypeContainsProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewTypeContainsPropertyEntry(), this.getNewTypeContainsPropertyEntryType(), null, "newTypeContainsPropertyEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NewTypeEntry(), this.getNewTypeEntryType(), null, "newTypeEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OriginalFacet(), the_1Package_1.getFacetType(), null, "originalFacet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OriginalNamespace(), the_1Package_1.getNamespaceType(), null, "originalNamespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OriginalProperty(), the_1Package_1.getPropertyObjectType(), null, "originalProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OriginalType(), the_1Package_1.getTypeObjectType(), null, "originalType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OriginalTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "originalTypeContainsProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedFacet(), the_1Package_1.getFacetType(), null, "removedFacet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedFacetEntry(), this.getRemovedFacetEntryType(), null, "removedFacetEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedNamespace(), the_1Package_1.getNamespaceType(), null, "removedNamespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedNamespaceEntry(), this.getRemovedNamespaceEntryType(), null, "removedNamespaceEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedProperty(), the_1Package_1.getPropertyObjectType(), null, "removedProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedPropertyEntry(), this.getRemovedPropertyEntryType(), null, "removedPropertyEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedType(), the_1Package_1.getTypeObjectType(), null, "removedType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "removedTypeContainsProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedTypeContainsPropertyEntry(), this.getRemovedTypeContainsPropertyEntryType(), null, "removedTypeContainsPropertyEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RemovedTypeEntry(), this.getRemovedTypeEntryType(), null, "removedTypeEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdatedFacet(), the_1Package_1.getFacetType(), null, "updatedFacet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdatedNamespace(), the_1Package_1.getNamespaceType(), null, "updatedNamespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdatedProperty(), the_1Package_1.getPropertyObjectType(), null, "updatedProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdatedType(), the_1Package_1.getTypeObjectType(), null, "updatedType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UpdatedTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "updatedTypeContainsProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(modifiedFacetEntryTypeEClass, ModifiedFacetEntryType.class, "ModifiedFacetEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiedFacetEntryType_OriginalFacet(), the_1Package_1.getFacetType(), null, "originalFacet", null, 1, 1, ModifiedFacetEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifiedFacetEntryType_UpdatedFacet(), the_1Package_1.getFacetType(), null, "updatedFacet", null, 1, 1, ModifiedFacetEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifiedNamespaceEntryTypeEClass, ModifiedNamespaceEntryType.class, "ModifiedNamespaceEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiedNamespaceEntryType_OriginalNamespace(), the_1Package_1.getNamespaceType(), null, "originalNamespace", null, 1, 1, ModifiedNamespaceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifiedNamespaceEntryType_UpdatedNamespace(), the_1Package_1.getNamespaceType(), null, "updatedNamespace", null, 1, 1, ModifiedNamespaceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifiedPropertyEntryTypeEClass, ModifiedPropertyEntryType.class, "ModifiedPropertyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiedPropertyEntryType_OriginalProperty(), the_1Package_1.getPropertyObjectType(), null, "originalProperty", null, 1, 1, ModifiedPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifiedPropertyEntryType_UpdatedProperty(), the_1Package_1.getPropertyObjectType(), null, "updatedProperty", null, 1, 1, ModifiedPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifiedTypeContainsPropertyEntryTypeEClass, ModifiedTypeContainsPropertyEntryType.class, "ModifiedTypeContainsPropertyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiedTypeContainsPropertyEntryType_OriginalTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "originalTypeContainsProperty", null, 1, 1, ModifiedTypeContainsPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifiedTypeContainsPropertyEntryType_UpdatedTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "updatedTypeContainsProperty", null, 1, 1, ModifiedTypeContainsPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifiedTypeEntryTypeEClass, ModifiedTypeEntryType.class, "ModifiedTypeEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiedTypeEntryType_OriginalType(), the_1Package_1.getTypeObjectType(), null, "originalType", null, 1, 1, ModifiedTypeEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifiedTypeEntryType_UpdatedType(), the_1Package_1.getTypeObjectType(), null, "updatedType", null, 1, 1, ModifiedTypeEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newFacetEntryTypeEClass, NewFacetEntryType.class, "NewFacetEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewFacetEntryType_NewFacet(), the_1Package_1.getFacetType(), null, "newFacet", null, 1, 1, NewFacetEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newNamespaceEntryTypeEClass, NewNamespaceEntryType.class, "NewNamespaceEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewNamespaceEntryType_NewNamespace(), the_1Package_1.getNamespaceType(), null, "newNamespace", null, 1, 1, NewNamespaceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newPropertyEntryTypeEClass, NewPropertyEntryType.class, "NewPropertyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewPropertyEntryType_NewProperty(), the_1Package_1.getPropertyObjectType(), null, "newProperty", null, 1, 1, NewPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newTypeContainsPropertyEntryTypeEClass, NewTypeContainsPropertyEntryType.class, "NewTypeContainsPropertyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewTypeContainsPropertyEntryType_NewTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "newTypeContainsProperty", null, 1, 1, NewTypeContainsPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newTypeEntryTypeEClass, NewTypeEntryType.class, "NewTypeEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewTypeEntryType_NewType(), the_1Package_1.getTypeObjectType(), null, "newType", null, 1, 1, NewTypeEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removedFacetEntryTypeEClass, RemovedFacetEntryType.class, "RemovedFacetEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemovedFacetEntryType_RemovedFacet(), the_1Package_1.getFacetType(), null, "removedFacet", null, 1, 1, RemovedFacetEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removedNamespaceEntryTypeEClass, RemovedNamespaceEntryType.class, "RemovedNamespaceEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemovedNamespaceEntryType_RemovedNamespace(), the_1Package_1.getNamespaceType(), null, "removedNamespace", null, 1, 1, RemovedNamespaceEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removedPropertyEntryTypeEClass, RemovedPropertyEntryType.class, "RemovedPropertyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemovedPropertyEntryType_RemovedProperty(), the_1Package_1.getPropertyObjectType(), null, "removedProperty", null, 1, 1, RemovedPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removedTypeContainsPropertyEntryTypeEClass, RemovedTypeContainsPropertyEntryType.class, "RemovedTypeContainsPropertyEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemovedTypeContainsPropertyEntryType_RemovedTypeContainsProperty(), the_1Package_1.getTypeContainsPropertyType(), null, "removedTypeContainsProperty", null, 1, 1, RemovedTypeContainsPropertyEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removedTypeEntryTypeEClass, RemovedTypeEntryType.class, "RemovedTypeEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemovedTypeEntryType_RemovedType(), the_1Package_1.getTypeObjectType(), null, "removedType", null, 1, 1, RemovedTypeEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(changeCodeSimpleTypeEEnum, ChangeCodeSimpleType.class, "ChangeCodeSimpleType");
		addEEnumLiteral(changeCodeSimpleTypeEEnum, ChangeCodeSimpleType.NEW_REQUIREMENT);
		addEEnumLiteral(changeCodeSimpleTypeEEnum, ChangeCodeSimpleType.BUG_FIX);
		addEEnumLiteral(changeCodeSimpleTypeEEnum, ChangeCodeSimpleType.REFACTORING);
		addEEnumLiteral(changeCodeSimpleTypeEEnum, ChangeCodeSimpleType.HARMONIZATION);
		addEEnumLiteral(changeCodeSimpleTypeEEnum, ChangeCodeSimpleType.GENERAL_IMPROVEMENT);

		// Initialize data types
		initEDataType(changeCodeSimpleTypeObjectEDataType, ChangeCodeSimpleType.class, "ChangeCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
			 "appinfo", "\r\n      <i:resource xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\"/>\r\n  \r\n\r\n      <i:resource xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Association\"/>\r\n  \r\n\r\n      <i:ConformantIndicator xmlns:i=\"http://niem.gov/niem/appinfo/2.0\">true</i:ConformantIndicator>\r\n    "
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
		  (changeCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ChangeCodeSimpleType"
		   });		
		addAnnotation
		  (changeCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ChangeCodeSimpleType:Object",
			 "baseType", "ChangeCodeSimpleType"
		   });		
		addAnnotation
		  (changeCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ChangeCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getChangeCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getChangeCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getChangeCodeType_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getChangeCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (changeInformationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ChangeInformationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChangeInformationType_ChangeSummaryText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeSummaryText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeInformationType_ChangeReasonText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeReasonText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeInformationType_ChangeFullDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeFullDescriptionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeInformationType_ChangeNCCTIssueNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeNCCTIssueNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeInformationType_ChangeCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (changeLogEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ChangeLogEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChangeLogEntryType_ChangeInformationAbstractGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ChangeInformationAbstract:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogEntryType_ChangeInformationAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeInformationAbstract",
			 "namespace", "##targetNamespace",
			 "group", "ChangeInformationAbstract:group"
		   });		
		addAnnotation
		  (changeLogTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ChangeLogType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChangeLogType_ChangeLogSummaryText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLogSummaryText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ChangeLogSubmitterName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLogSubmitterName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ChangeLogApplicationInstructionsText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLogApplicationInstructionsText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ChangeInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeInformation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_NewPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_NewTypeEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewTypeEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_NewTypeContainsPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewTypeContainsPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_NewFacetEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewFacetEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_NewNamespaceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewNamespaceEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ModifiedPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ModifiedTypeEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedTypeEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ModifiedTypeContainsPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedTypeContainsPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ModifiedFacetEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedFacetEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_ModifiedNamespaceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedNamespaceEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_RemovedPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_RemovedTypeEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedTypeEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_RemovedTypeContainsPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedTypeContainsPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_RemovedFacetEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedFacetEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChangeLogType_RemovedNamespaceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedNamespaceEntry",
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
		  (getDocumentRoot_ChangeCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeFullDescriptionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeFullDescriptionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeInformation",
			 "namespace", "##targetNamespace",
			 "affiliation", "ChangeInformationAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeInformationAbstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeInformationAbstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeInformationReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeInformationReference",
			 "namespace", "##targetNamespace",
			 "affiliation", "ChangeInformationAbstract"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeLog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeLogApplicationInstructionsText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLogApplicationInstructionsText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeLogSubmitterName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLogSubmitterName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeLogSummaryText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeLogSummaryText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeNCCTIssueNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeNCCTIssueNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeReasonText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeReasonText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChangeSummaryText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ChangeSummaryText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModifiedFacetEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedFacetEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModifiedNamespaceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedNamespaceEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModifiedPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModifiedTypeContainsPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedTypeContainsPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModifiedTypeEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModifiedTypeEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewFacetEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewFacetEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewNamespaceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewNamespaceEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewTypeContainsPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewTypeContainsPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NewTypeEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewTypeEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OriginalFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OriginalNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OriginalProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OriginalType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_OriginalTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedFacetEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedFacetEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedNamespaceEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedNamespaceEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedTypeContainsPropertyEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedTypeContainsPropertyEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RemovedTypeEntry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedTypeEntry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UpdatedFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UpdatedNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UpdatedProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UpdatedType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UpdatedTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modifiedFacetEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModifiedFacetEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModifiedFacetEntryType_OriginalFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModifiedFacetEntryType_UpdatedFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modifiedNamespaceEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModifiedNamespaceEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModifiedNamespaceEntryType_OriginalNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModifiedNamespaceEntryType_UpdatedNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modifiedPropertyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModifiedPropertyEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModifiedPropertyEntryType_OriginalProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModifiedPropertyEntryType_UpdatedProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modifiedTypeContainsPropertyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModifiedTypeContainsPropertyEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModifiedTypeContainsPropertyEntryType_OriginalTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModifiedTypeContainsPropertyEntryType_UpdatedTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modifiedTypeEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModifiedTypeEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModifiedTypeEntryType_OriginalType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OriginalType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModifiedTypeEntryType_UpdatedType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdatedType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (newFacetEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NewFacetEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNewFacetEntryType_NewFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (newNamespaceEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NewNamespaceEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNewNamespaceEntryType_NewNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (newPropertyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NewPropertyEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNewPropertyEntryType_NewProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (newTypeContainsPropertyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NewTypeContainsPropertyEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNewTypeContainsPropertyEntryType_NewTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (newTypeEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NewTypeEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNewTypeEntryType_NewType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NewType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (removedFacetEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemovedFacetEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemovedFacetEntryType_RemovedFacet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedFacet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (removedNamespaceEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemovedNamespaceEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemovedNamespaceEntryType_RemovedNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (removedPropertyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemovedPropertyEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemovedPropertyEntryType_RemovedProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (removedTypeContainsPropertyEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemovedTypeContainsPropertyEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemovedTypeContainsPropertyEntryType_RemovedTypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedTypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (removedTypeEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RemovedTypeEntryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRemovedTypeEntryType_RemovedType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RemovedType",
			 "namespace", "##targetNamespace"
		   });
	}

} //_1PackageImpl
