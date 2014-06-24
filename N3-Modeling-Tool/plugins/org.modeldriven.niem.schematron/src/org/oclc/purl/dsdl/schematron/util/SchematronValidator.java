/**
 */
package org.oclc.purl.dsdl.schematron.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.oclc.purl.dsdl.schematron.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage
 * @generated
 */
public class SchematronValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchematronValidator INSTANCE = new SchematronValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.oclc.purl.dsdl.schematron";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SchematronPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SchematronPackage.ACTIVE_TYPE:
				return validateActiveType((ActiveType)value, diagnostics, context);
			case SchematronPackage.ASSERT_TYPE:
				return validateAssertType((AssertType)value, diagnostics, context);
			case SchematronPackage.DIAGNOSTICS_TYPE:
				return validateDiagnosticsType((DiagnosticsType)value, diagnostics, context);
			case SchematronPackage.DIAGNOSTIC_TYPE:
				return validateDiagnosticType((DiagnosticType)value, diagnostics, context);
			case SchematronPackage.DIR_TYPE:
				return validateDirType((DirType)value, diagnostics, context);
			case SchematronPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case SchematronPackage.EXTENDS_TYPE:
				return validateExtendsType((ExtendsType)value, diagnostics, context);
			case SchematronPackage.INCLUDE_TYPE:
				return validateIncludeType((IncludeType)value, diagnostics, context);
			case SchematronPackage.LET_TYPE:
				return validateLetType((LetType)value, diagnostics, context);
			case SchematronPackage.NAME_TYPE:
				return validateNameType((NameType)value, diagnostics, context);
			case SchematronPackage.NS_TYPE:
				return validateNsType((NsType)value, diagnostics, context);
			case SchematronPackage.PARAM_TYPE:
				return validateParamType((ParamType)value, diagnostics, context);
			case SchematronPackage.PATTERN_TYPE:
				return validatePatternType((PatternType)value, diagnostics, context);
			case SchematronPackage.PHASE_TYPE:
				return validatePhaseType((PhaseType)value, diagnostics, context);
			case SchematronPackage.PTYPE:
				return validatePType((PType)value, diagnostics, context);
			case SchematronPackage.REPORT_TYPE:
				return validateReportType((ReportType)value, diagnostics, context);
			case SchematronPackage.RULE_TYPE:
				return validateRuleType((RuleType)value, diagnostics, context);
			case SchematronPackage.SCHEMA_TYPE:
				return validateSchemaType((SchemaType)value, diagnostics, context);
			case SchematronPackage.SPAN_TYPE:
				return validateSpanType((SpanType)value, diagnostics, context);
			case SchematronPackage.TITLE_TYPE:
				return validateTitleType((TitleType)value, diagnostics, context);
			case SchematronPackage.VALUE_OF_TYPE:
				return validateValueOfType((ValueOfType)value, diagnostics, context);
			case SchematronPackage.ABSTRACT_TYPE:
				return validateAbstractType((AbstractType)value, diagnostics, context);
			case SchematronPackage.ABSTRACT_TYPE1:
				return validateAbstractType1((AbstractType1)value, diagnostics, context);
			case SchematronPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case SchematronPackage.ABSTRACT_TYPE_OBJECT:
				return validateAbstractTypeObject((AbstractType)value, diagnostics, context);
			case SchematronPackage.ABSTRACT_TYPE_OBJECT1:
				return validateAbstractTypeObject1((AbstractType1)value, diagnostics, context);
			case SchematronPackage.CLASS_VALUE:
				return validateClassValue((String)value, diagnostics, context);
			case SchematronPackage.EXPR_VALUE:
				return validateExprValue((String)value, diagnostics, context);
			case SchematronPackage.FLAG_VALUE:
				return validateFlagValue((String)value, diagnostics, context);
			case SchematronPackage.FPI_VALUE:
				return validateFpiValue((String)value, diagnostics, context);
			case SchematronPackage.LANG_VALUE:
				return validateLangValue((String)value, diagnostics, context);
			case SchematronPackage.NAME_VALUE:
				return validateNameValue((String)value, diagnostics, context);
			case SchematronPackage.NON_EMPTY_STRING:
				return validateNonEmptyString((String)value, diagnostics, context);
			case SchematronPackage.PATH_VALUE:
				return validatePathValue((String)value, diagnostics, context);
			case SchematronPackage.ROLE_VALUE:
				return validateRoleValue((String)value, diagnostics, context);
			case SchematronPackage.URI_VALUE:
				return validateUriValue((String)value, diagnostics, context);
			case SchematronPackage.VALUE_TYPE_OBJECT:
				return validateValueTypeObject((ValueType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActiveType(ActiveType activeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(activeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssertType(AssertType assertType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticsType(DiagnosticsType diagnosticsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticType(DiagnosticType diagnosticType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagnosticType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType(DirType dirType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dirType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtendsType(ExtendsType extendsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extendsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeType(IncludeType includeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLetType(LetType letType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(letType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameType(NameType nameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNsType(NsType nsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternType(PatternType patternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patternType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhaseType(PhaseType phaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePType(PType pType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReportType(ReportType reportType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reportType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleType(RuleType ruleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ruleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaType(SchemaType schemaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpanType(SpanType spanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(TitleType titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueOfType(ValueOfType valueOfType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueOfType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractType(AbstractType abstractType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractType1(AbstractType1 abstractType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTypeObject(AbstractType abstractTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTypeObject1(AbstractType1 abstractTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassValue(String classValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExprValue(String exprValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlagValue(String flagValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFpiValue(String fpiValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLangValue(String langValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateLanguage_Pattern(langValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameValue(String nameValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonEmptyString_MinLength(nonEmptyString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Empty String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonEmptyString_MinLength(String nonEmptyString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonEmptyString.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(SchematronPackage.Literals.NON_EMPTY_STRING, nonEmptyString, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathValue(String pathValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleValue(String roleValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriValue(String uriValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueTypeObject(ValueType valueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SchematronValidator
