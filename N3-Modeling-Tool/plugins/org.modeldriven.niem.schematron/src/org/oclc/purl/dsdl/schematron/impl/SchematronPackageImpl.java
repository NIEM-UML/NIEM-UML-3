/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.oclc.purl.dsdl.schematron.AbstractType;
import org.oclc.purl.dsdl.schematron.AbstractType1;
import org.oclc.purl.dsdl.schematron.ActiveType;
import org.oclc.purl.dsdl.schematron.AssertType;
import org.oclc.purl.dsdl.schematron.DiagnosticType;
import org.oclc.purl.dsdl.schematron.DiagnosticsType;
import org.oclc.purl.dsdl.schematron.DirType;
import org.oclc.purl.dsdl.schematron.DocumentRoot;
import org.oclc.purl.dsdl.schematron.ExtendsType;
import org.oclc.purl.dsdl.schematron.IncludeType;
import org.oclc.purl.dsdl.schematron.LetType;
import org.oclc.purl.dsdl.schematron.NameType;
import org.oclc.purl.dsdl.schematron.NsType;
import org.oclc.purl.dsdl.schematron.PType;
import org.oclc.purl.dsdl.schematron.ParamType;
import org.oclc.purl.dsdl.schematron.PatternType;
import org.oclc.purl.dsdl.schematron.PhaseType;
import org.oclc.purl.dsdl.schematron.ReportType;
import org.oclc.purl.dsdl.schematron.RuleType;
import org.oclc.purl.dsdl.schematron.SchemaType;
import org.oclc.purl.dsdl.schematron.SchematronFactory;
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.SpanType;
import org.oclc.purl.dsdl.schematron.TitleType;
import org.oclc.purl.dsdl.schematron.ValueOfType;
import org.oclc.purl.dsdl.schematron.ValueType;

import org.oclc.purl.dsdl.schematron.util.SchematronValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchematronPackageImpl extends EPackageImpl implements SchematronPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dirTypeEClass = null;

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
	private EClass extendsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass letTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueOfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abstractTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abstractType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstractTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstractTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exprValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flagValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fpiValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType langValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueTypeObjectEDataType = null;

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchematronPackageImpl() {
		super(eNS_URI, SchematronFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchematronPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchematronPackage init() {
		if (isInited) return (SchematronPackage)EPackage.Registry.INSTANCE.getEPackage(SchematronPackage.eNS_URI);

		// Obtain or create and register package
		SchematronPackageImpl theSchematronPackage = (SchematronPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchematronPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchematronPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSchematronPackage.createPackageContents();

		// Initialize created meta-data
		theSchematronPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSchematronPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SchematronValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSchematronPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchematronPackage.eNS_URI, theSchematronPackage);
		return theSchematronPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveType() {
		return activeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_Mixed() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_Group() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_Any() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_Any1() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActiveType_Dir() {
		return (EReference)activeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_Emph() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActiveType_Span() {
		return (EReference)activeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_Pattern() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveType_AnyAttribute() {
		return (EAttribute)activeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertType() {
		return assertTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Mixed() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Group() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Any() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Any1() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertType_Name() {
		return (EReference)assertTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertType_ValueOf() {
		return (EReference)assertTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Emph() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertType_Dir() {
		return (EReference)assertTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertType_Span() {
		return (EReference)assertTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Diagnostics() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Flag() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Fpi() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Icon() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Id() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Lang() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Role() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_See() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Space() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Subject() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_Test() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertType_AnyAttribute() {
		return (EAttribute)assertTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticsType() {
		return diagnosticsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticsType_Group() {
		return (EAttribute)diagnosticsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticsType_Any() {
		return (EAttribute)diagnosticsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticsType_Any1() {
		return (EAttribute)diagnosticsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticsType_Include() {
		return (EReference)diagnosticsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticsType_Diagnostic() {
		return (EReference)diagnosticsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticsType_AnyAttribute() {
		return (EAttribute)diagnosticsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticType() {
		return diagnosticTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Mixed() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Group() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Any() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Any1() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticType_ValueOf() {
		return (EReference)diagnosticTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Emph() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticType_Dir() {
		return (EReference)diagnosticTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticType_Span() {
		return (EReference)diagnosticTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Fpi() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Icon() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Id() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Lang() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_See() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_Space() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticType_AnyAttribute() {
		return (EAttribute)diagnosticTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirType() {
		return dirTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirType_Mixed() {
		return (EAttribute)dirTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirType_ForeignElement() {
		return (EAttribute)dirTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirType_Any() {
		return (EAttribute)dirTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirType_Any1() {
		return (EAttribute)dirTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirType_Value() {
		return (EAttribute)dirTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirType_AnyAttribute() {
		return (EAttribute)dirTypeEClass.getEStructuralFeatures().get(5);
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
	public EReference getDocumentRoot_Active() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Assert() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Diagnostic() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Diagnostics() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dir() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Emph() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Extends() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Include() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Let() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Name() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ns() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_P() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Param() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Pattern() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Phase() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Report() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Schema() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Span() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueOf() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendsType() {
		return extendsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsType_Rule() {
		return (EAttribute)extendsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsType_AnyAttribute() {
		return (EAttribute)extendsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Href() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLetType() {
		return letTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLetType_Name() {
		return (EAttribute)letTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLetType_Value() {
		return (EAttribute)letTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType() {
		return nameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType_Path() {
		return (EAttribute)nameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType_AnyAttribute() {
		return (EAttribute)nameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNsType() {
		return nsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNsType_Prefix() {
		return (EAttribute)nsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNsType_Uri() {
		return (EAttribute)nsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNsType_AnyAttribute() {
		return (EAttribute)nsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Value() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternType() {
		return patternTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Group() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Any() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Any1() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Include() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Title() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_P() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Let() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Rule() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Title1() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_P1() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Let1() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Rule1() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Title2() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_P2() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatternType_Param() {
		return (EReference)patternTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Abstract() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Fpi() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Icon() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Id() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_IsA() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Lang() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_See() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_Space() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternType_AnyAttribute() {
		return (EAttribute)patternTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhaseType() {
		return phaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Group() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Any() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Any1() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseType_Include() {
		return (EReference)phaseTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseType_P() {
		return (EReference)phaseTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseType_Let() {
		return (EReference)phaseTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhaseType_Active() {
		return (EReference)phaseTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Fpi() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Icon() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Id() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Lang() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_See() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_Space() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhaseType_AnyAttribute() {
		return (EAttribute)phaseTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPType() {
		return pTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Mixed() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Group() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Any() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Any1() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Dir() {
		return (EReference)pTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Emph() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPType_Span() {
		return (EReference)pTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Class() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Icon() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Id() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_AnyAttribute() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportType() {
		return reportTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Mixed() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Group() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Any() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Any1() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportType_Name() {
		return (EReference)reportTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportType_ValueOf() {
		return (EReference)reportTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Emph() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportType_Dir() {
		return (EReference)reportTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportType_Span() {
		return (EReference)reportTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Diagnostics() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Flag() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Fpi() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Icon() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Id() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Lang() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Role() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_See() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Space() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Subject() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_Test() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportType_AnyAttribute() {
		return (EAttribute)reportTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleType() {
		return ruleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Group() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Any() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Any1() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Include() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Let() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Assert() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Report() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Extends() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Let1() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Assert1() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Report1() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleType_Extends1() {
		return (EReference)ruleTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Abstract() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Context() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Flag() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Fpi() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Icon() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Id() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Lang() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Role() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_See() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Space() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_Subject() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleType_AnyAttribute() {
		return (EAttribute)ruleTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchemaType() {
		return schemaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Group() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Any() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Any1() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Include() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Title() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Ns() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_P() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Let() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Phase() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Pattern() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_P1() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchemaType_Diagnostics() {
		return (EReference)schemaTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_DefaultPhase() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Fpi() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Icon() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Id() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Lang() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_QueryBinding() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_SchemaVersion() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_See() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_Space() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchemaType_AnyAttribute() {
		return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanType() {
		return spanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Mixed() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_ForeignElement() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Any() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Any1() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Class() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_AnyAttribute() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleType() {
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Mixed() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleType_Dir() {
		return (EReference)titleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueOfType() {
		return valueOfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueOfType_Select() {
		return (EAttribute)valueOfTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueOfType_AnyAttribute() {
		return (EAttribute)valueOfTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAbstractType() {
		return abstractTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAbstractType1() {
		return abstractType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueType() {
		return valueTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbstractTypeObject() {
		return abstractTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbstractTypeObject1() {
		return abstractTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClassValue() {
		return classValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExprValue() {
		return exprValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlagValue() {
		return flagValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFpiValue() {
		return fpiValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLangValue() {
		return langValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameValue() {
		return nameValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyString() {
		return nonEmptyStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathValue() {
		return pathValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleValue() {
		return roleValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUriValue() {
		return uriValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueTypeObject() {
		return valueTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronFactory getSchematronFactory() {
		return (SchematronFactory)getEFactoryInstance();
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
		activeTypeEClass = createEClass(ACTIVE_TYPE);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__MIXED);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__GROUP);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__ANY);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__ANY1);
		createEReference(activeTypeEClass, ACTIVE_TYPE__DIR);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__EMPH);
		createEReference(activeTypeEClass, ACTIVE_TYPE__SPAN);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__PATTERN);
		createEAttribute(activeTypeEClass, ACTIVE_TYPE__ANY_ATTRIBUTE);

		assertTypeEClass = createEClass(ASSERT_TYPE);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__MIXED);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__GROUP);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__ANY);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__ANY1);
		createEReference(assertTypeEClass, ASSERT_TYPE__NAME);
		createEReference(assertTypeEClass, ASSERT_TYPE__VALUE_OF);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__EMPH);
		createEReference(assertTypeEClass, ASSERT_TYPE__DIR);
		createEReference(assertTypeEClass, ASSERT_TYPE__SPAN);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__DIAGNOSTICS);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__FLAG);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__FPI);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__ICON);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__ID);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__LANG);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__ROLE);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__SEE);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__SPACE);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__SUBJECT);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__TEST);
		createEAttribute(assertTypeEClass, ASSERT_TYPE__ANY_ATTRIBUTE);

		diagnosticsTypeEClass = createEClass(DIAGNOSTICS_TYPE);
		createEAttribute(diagnosticsTypeEClass, DIAGNOSTICS_TYPE__GROUP);
		createEAttribute(diagnosticsTypeEClass, DIAGNOSTICS_TYPE__ANY);
		createEAttribute(diagnosticsTypeEClass, DIAGNOSTICS_TYPE__ANY1);
		createEReference(diagnosticsTypeEClass, DIAGNOSTICS_TYPE__INCLUDE);
		createEReference(diagnosticsTypeEClass, DIAGNOSTICS_TYPE__DIAGNOSTIC);
		createEAttribute(diagnosticsTypeEClass, DIAGNOSTICS_TYPE__ANY_ATTRIBUTE);

		diagnosticTypeEClass = createEClass(DIAGNOSTIC_TYPE);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__MIXED);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__GROUP);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__ANY);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__ANY1);
		createEReference(diagnosticTypeEClass, DIAGNOSTIC_TYPE__VALUE_OF);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__EMPH);
		createEReference(diagnosticTypeEClass, DIAGNOSTIC_TYPE__DIR);
		createEReference(diagnosticTypeEClass, DIAGNOSTIC_TYPE__SPAN);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__FPI);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__ICON);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__ID);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__LANG);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__SEE);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__SPACE);
		createEAttribute(diagnosticTypeEClass, DIAGNOSTIC_TYPE__ANY_ATTRIBUTE);

		dirTypeEClass = createEClass(DIR_TYPE);
		createEAttribute(dirTypeEClass, DIR_TYPE__MIXED);
		createEAttribute(dirTypeEClass, DIR_TYPE__FOREIGN_ELEMENT);
		createEAttribute(dirTypeEClass, DIR_TYPE__ANY);
		createEAttribute(dirTypeEClass, DIR_TYPE__ANY1);
		createEAttribute(dirTypeEClass, DIR_TYPE__VALUE);
		createEAttribute(dirTypeEClass, DIR_TYPE__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACTIVE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSERT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGNOSTIC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGNOSTICS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__EMPH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENDS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUDE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__P);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PATTERN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PHASE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VALUE_OF);

		extendsTypeEClass = createEClass(EXTENDS_TYPE);
		createEAttribute(extendsTypeEClass, EXTENDS_TYPE__RULE);
		createEAttribute(extendsTypeEClass, EXTENDS_TYPE__ANY_ATTRIBUTE);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__HREF);

		letTypeEClass = createEClass(LET_TYPE);
		createEAttribute(letTypeEClass, LET_TYPE__NAME);
		createEAttribute(letTypeEClass, LET_TYPE__VALUE);

		nameTypeEClass = createEClass(NAME_TYPE);
		createEAttribute(nameTypeEClass, NAME_TYPE__PATH);
		createEAttribute(nameTypeEClass, NAME_TYPE__ANY_ATTRIBUTE);

		nsTypeEClass = createEClass(NS_TYPE);
		createEAttribute(nsTypeEClass, NS_TYPE__PREFIX);
		createEAttribute(nsTypeEClass, NS_TYPE__URI);
		createEAttribute(nsTypeEClass, NS_TYPE__ANY_ATTRIBUTE);

		paramTypeEClass = createEClass(PARAM_TYPE);
		createEAttribute(paramTypeEClass, PARAM_TYPE__NAME);
		createEAttribute(paramTypeEClass, PARAM_TYPE__VALUE);

		patternTypeEClass = createEClass(PATTERN_TYPE);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__GROUP);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__ANY);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__ANY1);
		createEReference(patternTypeEClass, PATTERN_TYPE__INCLUDE);
		createEReference(patternTypeEClass, PATTERN_TYPE__TITLE);
		createEReference(patternTypeEClass, PATTERN_TYPE__P);
		createEReference(patternTypeEClass, PATTERN_TYPE__LET);
		createEReference(patternTypeEClass, PATTERN_TYPE__RULE);
		createEReference(patternTypeEClass, PATTERN_TYPE__TITLE1);
		createEReference(patternTypeEClass, PATTERN_TYPE__P1);
		createEReference(patternTypeEClass, PATTERN_TYPE__LET1);
		createEReference(patternTypeEClass, PATTERN_TYPE__RULE1);
		createEReference(patternTypeEClass, PATTERN_TYPE__TITLE2);
		createEReference(patternTypeEClass, PATTERN_TYPE__P2);
		createEReference(patternTypeEClass, PATTERN_TYPE__PARAM);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__ABSTRACT);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__FPI);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__ICON);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__ID);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__IS_A);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__LANG);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__SEE);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__SPACE);
		createEAttribute(patternTypeEClass, PATTERN_TYPE__ANY_ATTRIBUTE);

		phaseTypeEClass = createEClass(PHASE_TYPE);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__GROUP);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__ANY);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__ANY1);
		createEReference(phaseTypeEClass, PHASE_TYPE__INCLUDE);
		createEReference(phaseTypeEClass, PHASE_TYPE__P);
		createEReference(phaseTypeEClass, PHASE_TYPE__LET);
		createEReference(phaseTypeEClass, PHASE_TYPE__ACTIVE);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__FPI);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__ICON);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__ID);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__LANG);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__SEE);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__SPACE);
		createEAttribute(phaseTypeEClass, PHASE_TYPE__ANY_ATTRIBUTE);

		pTypeEClass = createEClass(PTYPE);
		createEAttribute(pTypeEClass, PTYPE__MIXED);
		createEAttribute(pTypeEClass, PTYPE__GROUP);
		createEAttribute(pTypeEClass, PTYPE__ANY);
		createEAttribute(pTypeEClass, PTYPE__ANY1);
		createEReference(pTypeEClass, PTYPE__DIR);
		createEAttribute(pTypeEClass, PTYPE__EMPH);
		createEReference(pTypeEClass, PTYPE__SPAN);
		createEAttribute(pTypeEClass, PTYPE__CLASS);
		createEAttribute(pTypeEClass, PTYPE__ICON);
		createEAttribute(pTypeEClass, PTYPE__ID);
		createEAttribute(pTypeEClass, PTYPE__ANY_ATTRIBUTE);

		reportTypeEClass = createEClass(REPORT_TYPE);
		createEAttribute(reportTypeEClass, REPORT_TYPE__MIXED);
		createEAttribute(reportTypeEClass, REPORT_TYPE__GROUP);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ANY);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ANY1);
		createEReference(reportTypeEClass, REPORT_TYPE__NAME);
		createEReference(reportTypeEClass, REPORT_TYPE__VALUE_OF);
		createEAttribute(reportTypeEClass, REPORT_TYPE__EMPH);
		createEReference(reportTypeEClass, REPORT_TYPE__DIR);
		createEReference(reportTypeEClass, REPORT_TYPE__SPAN);
		createEAttribute(reportTypeEClass, REPORT_TYPE__DIAGNOSTICS);
		createEAttribute(reportTypeEClass, REPORT_TYPE__FLAG);
		createEAttribute(reportTypeEClass, REPORT_TYPE__FPI);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ICON);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ID);
		createEAttribute(reportTypeEClass, REPORT_TYPE__LANG);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ROLE);
		createEAttribute(reportTypeEClass, REPORT_TYPE__SEE);
		createEAttribute(reportTypeEClass, REPORT_TYPE__SPACE);
		createEAttribute(reportTypeEClass, REPORT_TYPE__SUBJECT);
		createEAttribute(reportTypeEClass, REPORT_TYPE__TEST);
		createEAttribute(reportTypeEClass, REPORT_TYPE__ANY_ATTRIBUTE);

		ruleTypeEClass = createEClass(RULE_TYPE);
		createEAttribute(ruleTypeEClass, RULE_TYPE__GROUP);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ANY);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ANY1);
		createEReference(ruleTypeEClass, RULE_TYPE__INCLUDE);
		createEReference(ruleTypeEClass, RULE_TYPE__LET);
		createEReference(ruleTypeEClass, RULE_TYPE__ASSERT);
		createEReference(ruleTypeEClass, RULE_TYPE__REPORT);
		createEReference(ruleTypeEClass, RULE_TYPE__EXTENDS);
		createEReference(ruleTypeEClass, RULE_TYPE__LET1);
		createEReference(ruleTypeEClass, RULE_TYPE__ASSERT1);
		createEReference(ruleTypeEClass, RULE_TYPE__REPORT1);
		createEReference(ruleTypeEClass, RULE_TYPE__EXTENDS1);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ABSTRACT);
		createEAttribute(ruleTypeEClass, RULE_TYPE__CONTEXT);
		createEAttribute(ruleTypeEClass, RULE_TYPE__FLAG);
		createEAttribute(ruleTypeEClass, RULE_TYPE__FPI);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ICON);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ID);
		createEAttribute(ruleTypeEClass, RULE_TYPE__LANG);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ROLE);
		createEAttribute(ruleTypeEClass, RULE_TYPE__SEE);
		createEAttribute(ruleTypeEClass, RULE_TYPE__SPACE);
		createEAttribute(ruleTypeEClass, RULE_TYPE__SUBJECT);
		createEAttribute(ruleTypeEClass, RULE_TYPE__ANY_ATTRIBUTE);

		schemaTypeEClass = createEClass(SCHEMA_TYPE);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__GROUP);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ANY);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ANY1);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__INCLUDE);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__TITLE);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__NS);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__P);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__LET);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__PHASE);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__PATTERN);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__P1);
		createEReference(schemaTypeEClass, SCHEMA_TYPE__DIAGNOSTICS);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__DEFAULT_PHASE);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__FPI);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ICON);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ID);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__LANG);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__QUERY_BINDING);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__SCHEMA_VERSION);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__SEE);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__SPACE);
		createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ANY_ATTRIBUTE);

		spanTypeEClass = createEClass(SPAN_TYPE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__MIXED);
		createEAttribute(spanTypeEClass, SPAN_TYPE__FOREIGN_ELEMENT);
		createEAttribute(spanTypeEClass, SPAN_TYPE__ANY);
		createEAttribute(spanTypeEClass, SPAN_TYPE__ANY1);
		createEAttribute(spanTypeEClass, SPAN_TYPE__CLASS);
		createEAttribute(spanTypeEClass, SPAN_TYPE__ANY_ATTRIBUTE);

		titleTypeEClass = createEClass(TITLE_TYPE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__MIXED);
		createEReference(titleTypeEClass, TITLE_TYPE__DIR);

		valueOfTypeEClass = createEClass(VALUE_OF_TYPE);
		createEAttribute(valueOfTypeEClass, VALUE_OF_TYPE__SELECT);
		createEAttribute(valueOfTypeEClass, VALUE_OF_TYPE__ANY_ATTRIBUTE);

		// Create enums
		abstractTypeEEnum = createEEnum(ABSTRACT_TYPE);
		abstractType1EEnum = createEEnum(ABSTRACT_TYPE1);
		valueTypeEEnum = createEEnum(VALUE_TYPE);

		// Create data types
		abstractTypeObjectEDataType = createEDataType(ABSTRACT_TYPE_OBJECT);
		abstractTypeObject1EDataType = createEDataType(ABSTRACT_TYPE_OBJECT1);
		classValueEDataType = createEDataType(CLASS_VALUE);
		exprValueEDataType = createEDataType(EXPR_VALUE);
		flagValueEDataType = createEDataType(FLAG_VALUE);
		fpiValueEDataType = createEDataType(FPI_VALUE);
		langValueEDataType = createEDataType(LANG_VALUE);
		nameValueEDataType = createEDataType(NAME_VALUE);
		nonEmptyStringEDataType = createEDataType(NON_EMPTY_STRING);
		pathValueEDataType = createEDataType(PATH_VALUE);
		roleValueEDataType = createEDataType(ROLE_VALUE);
		uriValueEDataType = createEDataType(URI_VALUE);
		valueTypeObjectEDataType = createEDataType(VALUE_TYPE_OBJECT);
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
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(activeTypeEClass, ActiveType.class, "ActiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ActiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ActiveType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ActiveType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, ActiveType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActiveType_Dir(), this.getDirType(), null, "dir", null, 0, -1, ActiveType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveType_Emph(), theXMLTypePackage.getString(), "emph", null, 0, -1, ActiveType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActiveType_Span(), this.getSpanType(), null, "span", null, 0, -1, ActiveType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveType_Pattern(), theXMLTypePackage.getIDREF(), "pattern", null, 1, 1, ActiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActiveType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ActiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertTypeEClass, AssertType.class, "AssertType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssertType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssertType_Name(), this.getNameType(), null, "name", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssertType_ValueOf(), this.getValueOfType(), null, "valueOf", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Emph(), theXMLTypePackage.getString(), "emph", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssertType_Dir(), this.getDirType(), null, "dir", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAssertType_Span(), this.getSpanType(), null, "span", null, 0, -1, AssertType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Diagnostics(), theXMLTypePackage.getIDREFS(), "diagnostics", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Flag(), this.getFlagValue(), "flag", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Icon(), this.getUriValue(), "icon", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Lang(), this.getLangValue(), "lang", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Role(), this.getRoleValue(), "role", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_See(), this.getUriValue(), "see", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Subject(), this.getPathValue(), "subject", null, 0, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_Test(), this.getExprValue(), "test", null, 1, 1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AssertType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagnosticsTypeEClass, DiagnosticsType.class, "DiagnosticsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagnosticsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DiagnosticsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DiagnosticsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticsType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, DiagnosticsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagnosticsType_Include(), this.getIncludeType(), null, "include", null, 0, -1, DiagnosticsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagnosticsType_Diagnostic(), this.getDiagnosticType(), null, "diagnostic", null, 0, -1, DiagnosticsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticsType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DiagnosticsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagnosticTypeEClass, DiagnosticType.class, "DiagnosticType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagnosticType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagnosticType_ValueOf(), this.getValueOfType(), null, "valueOf", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Emph(), theXMLTypePackage.getString(), "emph", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagnosticType_Dir(), this.getDirType(), null, "dir", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagnosticType_Span(), this.getSpanType(), null, "span", null, 0, -1, DiagnosticType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Icon(), this.getUriValue(), "icon", null, 0, 1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Lang(), this.getLangValue(), "lang", null, 0, 1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_See(), this.getUriValue(), "see", null, 0, 1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnosticType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DiagnosticType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dirTypeEClass, DirType.class, "DirType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DirType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirType_ForeignElement(), ecorePackage.getEFeatureMapEntry(), "foreignElement", null, 0, -1, DirType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DirType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, DirType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirType_Value(), this.getValueType(), "value", null, 0, 1, DirType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DirType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Active(), this.getActiveType(), null, "active", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Assert(), this.getAssertType(), null, "assert", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Diagnostic(), this.getDiagnosticType(), null, "diagnostic", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Diagnostics(), this.getDiagnosticsType(), null, "diagnostics", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dir(), this.getDirType(), null, "dir", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Emph(), theXMLTypePackage.getString(), "emph", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extends(), this.getExtendsType(), null, "extends", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Include(), this.getIncludeType(), null, "include", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Let(), this.getLetType(), null, "let", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Name(), this.getNameType(), null, "name", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ns(), this.getNsType(), null, "ns", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_P(), this.getPType(), null, "p", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Param(), this.getParamType(), null, "param", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Pattern(), this.getPatternType(), null, "pattern", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Phase(), this.getPhaseType(), null, "phase", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Report(), this.getReportType(), null, "report", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rule(), this.getRuleType(), null, "rule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Schema(), this.getSchemaType(), null, "schema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Span(), this.getSpanType(), null, "span", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getTitleType(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ValueOf(), this.getValueOfType(), null, "valueOf", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extendsTypeEClass, ExtendsType.class, "ExtendsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendsType_Rule(), theXMLTypePackage.getIDREF(), "rule", null, 1, 1, ExtendsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendsType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ExtendsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeType_Href(), this.getUriValue(), "href", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(letTypeEClass, LetType.class, "LetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLetType_Name(), this.getNameValue(), "name", null, 1, 1, LetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLetType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, LetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameTypeEClass, NameType.class, "NameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameType_Path(), this.getPathValue(), "path", null, 0, 1, NameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nsTypeEClass, NsType.class, "NsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNsType_Prefix(), this.getNameValue(), "prefix", null, 1, 1, NsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNsType_Uri(), this.getUriValue(), "uri", null, 1, 1, NsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNsType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramTypeEClass, ParamType.class, "ParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamType_Name(), this.getNameValue(), "name", null, 1, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Value(), this.getNonEmptyString(), "value", null, 1, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternTypeEClass, PatternType.class, "PatternType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Include(), this.getIncludeType(), null, "include", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Title(), this.getTitleType(), null, "title", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_P(), this.getPType(), null, "p", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Let(), this.getLetType(), null, "let", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Rule(), this.getRuleType(), null, "rule", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Title1(), this.getTitleType(), null, "title1", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_P1(), this.getPType(), null, "p1", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Let1(), this.getLetType(), null, "let1", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Rule1(), this.getRuleType(), null, "rule1", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Title2(), this.getTitleType(), null, "title2", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_P2(), this.getPType(), null, "p2", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPatternType_Param(), this.getParamType(), null, "param", null, 0, -1, PatternType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Abstract(), this.getAbstractType(), "abstract", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Icon(), this.getUriValue(), "icon", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_IsA(), theXMLTypePackage.getIDREF(), "isA", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Lang(), this.getLangValue(), "lang", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_See(), this.getUriValue(), "see", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PatternType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phaseTypeEClass, PhaseType.class, "PhaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhaseType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PhaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, PhaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhaseType_Include(), this.getIncludeType(), null, "include", null, 0, -1, PhaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhaseType_P(), this.getPType(), null, "p", null, 0, -1, PhaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhaseType_Let(), this.getLetType(), null, "let", null, 0, -1, PhaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhaseType_Active(), this.getActiveType(), null, "active", null, 0, -1, PhaseType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Icon(), this.getUriValue(), "icon", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Lang(), this.getLangValue(), "lang", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_See(), this.getUriValue(), "see", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhaseType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pTypeEClass, PType.class, "PType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, PType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, PType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPType_Dir(), this.getDirType(), null, "dir", null, 0, -1, PType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Emph(), theXMLTypePackage.getString(), "emph", null, 0, -1, PType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPType_Span(), this.getSpanType(), null, "span", null, 0, -1, PType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Class(), this.getClassValue(), "class", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Icon(), this.getUriValue(), "icon", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportTypeEClass, ReportType.class, "ReportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReportType_Name(), this.getNameType(), null, "name", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReportType_ValueOf(), this.getValueOfType(), null, "valueOf", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Emph(), theXMLTypePackage.getString(), "emph", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReportType_Dir(), this.getDirType(), null, "dir", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReportType_Span(), this.getSpanType(), null, "span", null, 0, -1, ReportType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Diagnostics(), theXMLTypePackage.getIDREFS(), "diagnostics", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Flag(), this.getFlagValue(), "flag", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Icon(), this.getUriValue(), "icon", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Lang(), this.getLangValue(), "lang", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Role(), this.getRoleValue(), "role", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_See(), this.getUriValue(), "see", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Subject(), this.getPathValue(), "subject", null, 0, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_Test(), this.getExprValue(), "test", null, 1, 1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ReportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleTypeEClass, RuleType.class, "RuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Include(), this.getIncludeType(), null, "include", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Let(), this.getLetType(), null, "let", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Assert(), this.getAssertType(), null, "assert", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Report(), this.getReportType(), null, "report", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Extends(), this.getExtendsType(), null, "extends", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Let1(), this.getLetType(), null, "let1", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Assert1(), this.getAssertType(), null, "assert1", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Report1(), this.getReportType(), null, "report1", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRuleType_Extends1(), this.getExtendsType(), null, "extends1", null, 0, -1, RuleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Abstract(), this.getAbstractType1(), "abstract", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Context(), this.getPathValue(), "context", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Flag(), this.getFlagValue(), "flag", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Icon(), this.getUriValue(), "icon", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Lang(), this.getLangValue(), "lang", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Role(), this.getRoleValue(), "role", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_See(), this.getUriValue(), "see", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_Subject(), this.getPathValue(), "subject", null, 0, 1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemaTypeEClass, SchemaType.class, "SchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchemaType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Include(), this.getIncludeType(), null, "include", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Title(), this.getTitleType(), null, "title", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Ns(), this.getNsType(), null, "ns", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_P(), this.getPType(), null, "p", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Let(), this.getLetType(), null, "let", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Phase(), this.getPhaseType(), null, "phase", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Pattern(), this.getPatternType(), null, "pattern", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_P1(), this.getPType(), null, "p1", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSchemaType_Diagnostics(), this.getDiagnosticsType(), null, "diagnostics", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_DefaultPhase(), theXMLTypePackage.getIDREF(), "defaultPhase", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Fpi(), this.getFpiValue(), "fpi", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Icon(), this.getUriValue(), "icon", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Lang(), this.getLangValue(), "lang", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_QueryBinding(), this.getNonEmptyString(), "queryBinding", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_SchemaVersion(), this.getNonEmptyString(), "schemaVersion", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_See(), this.getUriValue(), "see", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_Space(), theXMLNamespacePackage.getSpaceType(), "space", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchemaType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanTypeEClass, SpanType.class, "SpanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_ForeignElement(), ecorePackage.getEFeatureMapEntry(), "foreignElement", null, 0, -1, SpanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, SpanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, SpanType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Class(), this.getClassValue(), "class", null, 1, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titleTypeEClass, TitleType.class, "TitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitleType_Dir(), this.getDirType(), null, "dir", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valueOfTypeEClass, ValueOfType.class, "ValueOfType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueOfType_Select(), this.getPathValue(), "select", null, 1, 1, ValueOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueOfType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, ValueOfType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(abstractTypeEEnum, AbstractType.class, "AbstractType");
		addEEnumLiteral(abstractTypeEEnum, AbstractType.TRUE);
		addEEnumLiteral(abstractTypeEEnum, AbstractType.FALSE);

		initEEnum(abstractType1EEnum, AbstractType1.class, "AbstractType1");
		addEEnumLiteral(abstractType1EEnum, AbstractType1.TRUE);
		addEEnumLiteral(abstractType1EEnum, AbstractType1.FALSE);

		initEEnum(valueTypeEEnum, ValueType.class, "ValueType");
		addEEnumLiteral(valueTypeEEnum, ValueType.LTR);
		addEEnumLiteral(valueTypeEEnum, ValueType.RTL);

		// Initialize data types
		initEDataType(abstractTypeObjectEDataType, AbstractType.class, "AbstractTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(abstractTypeObject1EDataType, AbstractType1.class, "AbstractTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classValueEDataType, String.class, "ClassValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exprValueEDataType, String.class, "ExprValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(flagValueEDataType, String.class, "FlagValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fpiValueEDataType, String.class, "FpiValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(langValueEDataType, String.class, "LangValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nameValueEDataType, String.class, "NameValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonEmptyStringEDataType, String.class, "NonEmptyString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pathValueEDataType, String.class, "PathValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roleValueEDataType, String.class, "RoleValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriValueEDataType, String.class, "UriValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valueTypeObjectEDataType, ValueType.class, "ValueTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (abstractTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "abstract_._type"
		   });		
		addAnnotation
		  (abstractType1EEnum, 
		   source, 
		   new String[] {
			 "name", "abstract_._1_._type"
		   });		
		addAnnotation
		  (abstractTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "abstract_._type:Object",
			 "baseType", "abstract_._type"
		   });		
		addAnnotation
		  (abstractTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "abstract_._1_._type:Object",
			 "baseType", "abstract_._1_._type"
		   });		
		addAnnotation
		  (activeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "active_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getActiveType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getActiveType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getActiveType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getActiveType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getActiveType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getActiveType_Emph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emph",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getActiveType_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getActiveType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pattern"
		   });		
		addAnnotation
		  (getActiveType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":8",
			 "processing", "skip"
		   });		
		addAnnotation
		  (assertTypeEClass, 
		   source, 
		   new String[] {
			 "name", "assert_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAssertType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getAssertType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getAssertType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_ValueOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value-of",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_Emph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emph",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAssertType_Diagnostics(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "diagnostics"
		   });		
		addAnnotation
		  (getAssertType_Flag(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flag"
		   });		
		addAnnotation
		  (getAssertType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getAssertType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getAssertType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getAssertType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getAssertType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role"
		   });		
		addAnnotation
		  (getAssertType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getAssertType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getAssertType_Subject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subject"
		   });		
		addAnnotation
		  (getAssertType_Test(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "test"
		   });		
		addAnnotation
		  (getAssertType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":20",
			 "processing", "skip"
		   });		
		addAnnotation
		  (classValueEDataType, 
		   source, 
		   new String[] {
			 "name", "classValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (diagnosticsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "diagnostics_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDiagnosticsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDiagnosticsType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagnosticsType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagnosticsType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagnosticsType_Diagnostic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diagnostic",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagnosticsType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":5",
			 "processing", "skip"
		   });		
		addAnnotation
		  (diagnosticTypeEClass, 
		   source, 
		   new String[] {
			 "name", "diagnostic_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDiagnosticType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDiagnosticType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_ValueOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value-of",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_Emph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emph",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getDiagnosticType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getDiagnosticType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getDiagnosticType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDiagnosticType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getDiagnosticType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getDiagnosticType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getDiagnosticType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":14",
			 "processing", "skip"
		   });		
		addAnnotation
		  (dirTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dir_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDirType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDirType_ForeignElement(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ForeignElement:1"
		   });		
		addAnnotation
		  (getDirType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#ForeignElement:1"
		   });		
		addAnnotation
		  (getDirType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#ForeignElement:1"
		   });		
		addAnnotation
		  (getDirType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (getDirType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":5",
			 "processing", "skip"
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
		  (getDocumentRoot_Active(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "active",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Assert(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assert",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Diagnostic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diagnostic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Diagnostics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diagnostics",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Emph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emph",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Extends(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extends",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Let(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ns",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pattern",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Phase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phase",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Report(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Rule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ValueOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value-of",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (exprValueEDataType, 
		   source, 
		   new String[] {
			 "name", "exprValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (extendsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "extends_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getExtendsType_Rule(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rule"
		   });		
		addAnnotation
		  (getExtendsType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":1",
			 "processing", "skip"
		   });		
		addAnnotation
		  (flagValueEDataType, 
		   source, 
		   new String[] {
			 "name", "flagValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (fpiValueEDataType, 
		   source, 
		   new String[] {
			 "name", "fpiValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (includeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "include_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIncludeType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (langValueEDataType, 
		   source, 
		   new String[] {
			 "name", "langValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#language"
		   });		
		addAnnotation
		  (letTypeEClass, 
		   source, 
		   new String[] {
			 "name", "let_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLetType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getLetType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (nameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "name_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNameType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });		
		addAnnotation
		  (getNameType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":1",
			 "processing", "skip"
		   });		
		addAnnotation
		  (nameValueEDataType, 
		   source, 
		   new String[] {
			 "name", "nameValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (nonEmptyStringEDataType, 
		   source, 
		   new String[] {
			 "name", "non-empty-string",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "minLength", "1"
		   });		
		addAnnotation
		  (nsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ns_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNsType_Prefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prefix"
		   });		
		addAnnotation
		  (getNsType_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (getNsType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":2",
			 "processing", "skip"
		   });		
		addAnnotation
		  (paramTypeEClass, 
		   source, 
		   new String[] {
			 "name", "param_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParamType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getParamType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (pathValueEDataType, 
		   source, 
		   new String[] {
			 "name", "pathValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (patternTypeEClass, 
		   source, 
		   new String[] {
			 "name", "pattern_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPatternType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPatternType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Let(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Rule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Title1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_P1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Let1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Rule1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Title2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_P2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPatternType_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "abstract"
		   });		
		addAnnotation
		  (getPatternType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getPatternType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getPatternType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPatternType_IsA(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "is-a"
		   });		
		addAnnotation
		  (getPatternType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getPatternType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getPatternType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getPatternType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":23",
			 "processing", "skip"
		   });		
		addAnnotation
		  (phaseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "phase_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPhaseType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getPhaseType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPhaseType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPhaseType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPhaseType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPhaseType_Let(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPhaseType_Active(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "active",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getPhaseType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getPhaseType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getPhaseType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPhaseType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getPhaseType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getPhaseType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getPhaseType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":13",
			 "processing", "skip"
		   });		
		addAnnotation
		  (pTypeEClass, 
		   source, 
		   new String[] {
			 "name", "p_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getPType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getPType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getPType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPType_Emph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emph",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPType_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getPType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getPType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":10",
			 "processing", "skip"
		   });		
		addAnnotation
		  (reportTypeEClass, 
		   source, 
		   new String[] {
			 "name", "report_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getReportType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getReportType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getReportType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_ValueOf(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value-of",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_Emph(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emph",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getReportType_Diagnostics(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "diagnostics"
		   });		
		addAnnotation
		  (getReportType_Flag(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flag"
		   });		
		addAnnotation
		  (getReportType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getReportType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getReportType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getReportType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getReportType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role"
		   });		
		addAnnotation
		  (getReportType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getReportType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getReportType_Subject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subject"
		   });		
		addAnnotation
		  (getReportType_Test(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "test"
		   });		
		addAnnotation
		  (getReportType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":20",
			 "processing", "skip"
		   });		
		addAnnotation
		  (roleValueEDataType, 
		   source, 
		   new String[] {
			 "name", "roleValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (ruleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rule_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRuleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getRuleType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Let(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Assert(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assert",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Report(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Extends(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extends",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Let1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Assert1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "assert",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Report1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "report",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Extends1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extends",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getRuleType_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "abstract"
		   });		
		addAnnotation
		  (getRuleType_Context(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "context"
		   });		
		addAnnotation
		  (getRuleType_Flag(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "flag"
		   });		
		addAnnotation
		  (getRuleType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getRuleType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getRuleType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getRuleType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getRuleType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role"
		   });		
		addAnnotation
		  (getRuleType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getRuleType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getRuleType_Subject(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subject"
		   });		
		addAnnotation
		  (getRuleType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":23",
			 "processing", "skip"
		   });		
		addAnnotation
		  (schemaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "schema_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSchemaType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSchemaType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":1",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Ns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ns",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Let(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "let",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Phase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phase",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Pattern(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pattern",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_P1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_Diagnostics(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diagnostics",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSchemaType_DefaultPhase(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "defaultPhase"
		   });		
		addAnnotation
		  (getSchemaType_Fpi(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fpi"
		   });		
		addAnnotation
		  (getSchemaType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "icon"
		   });		
		addAnnotation
		  (getSchemaType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSchemaType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getSchemaType_QueryBinding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queryBinding"
		   });		
		addAnnotation
		  (getSchemaType_SchemaVersion(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schemaVersion"
		   });		
		addAnnotation
		  (getSchemaType_See(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "see"
		   });		
		addAnnotation
		  (getSchemaType_Space(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "space",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (getSchemaType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":21",
			 "processing", "skip"
		   });		
		addAnnotation
		  (spanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "span_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSpanType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSpanType_ForeignElement(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "ForeignElement:1"
		   });		
		addAnnotation
		  (getSpanType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "skip",
			 "group", "#ForeignElement:1"
		   });		
		addAnnotation
		  (getSpanType_Any1(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##local",
			 "name", ":3",
			 "processing", "skip",
			 "group", "#ForeignElement:1"
		   });		
		addAnnotation
		  (getSpanType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getSpanType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":5",
			 "processing", "skip"
		   });		
		addAnnotation
		  (titleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "title_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTitleType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dir",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (uriValueEDataType, 
		   source, 
		   new String[] {
			 "name", "uriValue",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (valueOfTypeEClass, 
		   source, 
		   new String[] {
			 "name", "value-of_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getValueOfType_Select(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "select"
		   });		
		addAnnotation
		  (getValueOfType_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "!##http://www.w3.org/XML/1998/namespace",
			 "name", ":1",
			 "processing", "skip"
		   });		
		addAnnotation
		  (valueTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "value_._type"
		   });		
		addAnnotation
		  (valueTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "value_._type:Object",
			 "baseType", "value_._type"
		   });
	}

} //SchematronPackageImpl
