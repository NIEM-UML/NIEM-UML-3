/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.util;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package
 * @generated
 */
public class _0Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _0Validator INSTANCE = new _0Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gov.niem.reference.niem.resource.mpd.catalog._3._0";

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
	public _0Validator() {
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
	  return _0Package.eINSTANCE;
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
			case _0Package.CATALOG_TYPE:
				return validateCatalogType((CatalogType)value, diagnostics, context);
			case _0Package.CONFORMANCE_TARGET_TYPE:
				return validateConformanceTargetType((ConformanceTargetType)value, diagnostics, context);
			case _0Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _0Package.FILE_SET_TYPE:
				return validateFileSetType((FileSetType)value, diagnostics, context);
			case _0Package.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE:
				return validateIEPConformanceTargetType((IEPConformanceTargetType)value, diagnostics, context);
			case _0Package.MPD_INFORMATION_TYPE:
				return validateMPDInformationType((MPDInformationType)value, diagnostics, context);
			case _0Package.MPD_TYPE:
				return validateMPDType((MPDType)value, diagnostics, context);
			case _0Package.QUALIFIED_NAMES_TYPE:
				return validateQualifiedNamesType((QualifiedNamesType)value, diagnostics, context);
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE:
				return validateReferenceSchemaDocumentSetType((ReferenceSchemaDocumentSetType)value, diagnostics, context);
			case _0Package.RELATIONSHIP_TYPE:
				return validateRelationshipType((RelationshipType)value, diagnostics, context);
			case _0Package.RELAX_NG_VALIDATION_TYPE:
				return validateRelaxNGValidationType((RelaxNGValidationType)value, diagnostics, context);
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE:
				return validateSchemaDocumentSetType((SchemaDocumentSetType)value, diagnostics, context);
			case _0Package.SCHEMATRON_VALIDATION_TYPE:
				return validateSchematronValidationType((SchematronValidationType)value, diagnostics, context);
			case _0Package.TEXT_RULE_TYPE:
				return validateTextRuleType((TextRuleType)value, diagnostics, context);
			case _0Package.VALIDITY_CONTEXT_TYPE:
				return validateValidityContextType((ValidityContextType)value, diagnostics, context);
			case _0Package.XML_SCHEMA_TYPE:
				return validateXMLSchemaType((XMLSchemaType)value, diagnostics, context);
			case _0Package.XPATH_TYPE:
				return validateXPathType((XPathType)value, diagnostics, context);
			case _0Package.MPD_CLASS_CODE_SIMPLE_TYPE:
				return validateMPDClassCodeSimpleType((MPDClassCodeSimpleType)value, diagnostics, context);
			case _0Package.RELATIONSHIP_CODE_SIMPLE_TYPE:
				return validateRelationshipCodeSimpleType((RelationshipCodeSimpleType)value, diagnostics, context);
			case _0Package.CLASS_LIST_SIMPLE_TYPE:
				return validateClassListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.CLASS_UNION_SIMPLE_TYPE:
				return validateClassUnionSimpleType(value, diagnostics, context);
			case _0Package.MPD_CLASS_CODE_SIMPLE_TYPE_OBJECT:
				return validateMPDClassCodeSimpleTypeObject((MPDClassCodeSimpleType)value, diagnostics, context);
			case _0Package.MPD_CLASS_LIST_SIMPLE_TYPE:
				return validateMPDClassListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.MPD_NAME_SIMPLE_TYPE:
				return validateMPDNameSimpleType((String)value, diagnostics, context);
			case _0Package.MPD_VERSION_ID_SIMPLE_TYPE:
				return validateMPDVersionIDSimpleType((String)value, diagnostics, context);
			case _0Package.QUALIFIED_NAME_LIST_SIMPLE_TYPE:
				return validateQualifiedNameListSimpleType((List<?>)value, diagnostics, context);
			case _0Package.RELATIONSHIP_CODE_SIMPLE_TYPE_OBJECT:
				return validateRelationshipCodeSimpleTypeObject((RelationshipCodeSimpleType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogType(CatalogType catalogType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceTargetType(ConformanceTargetType conformanceTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceTargetType, diagnostics, context);
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
	public boolean validateFileSetType(FileSetType fileSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIEPConformanceTargetType(IEPConformanceTargetType iepConformanceTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iepConformanceTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDInformationType(MPDInformationType mpdInformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mpdInformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDType(MPDType mpdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mpdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedNamesType(QualifiedNamesType qualifiedNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualifiedNamesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceSchemaDocumentSetType(ReferenceSchemaDocumentSetType referenceSchemaDocumentSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceSchemaDocumentSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipType(RelationshipType relationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelaxNGValidationType(RelaxNGValidationType relaxNGValidationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relaxNGValidationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaDocumentSetType(SchemaDocumentSetType schemaDocumentSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaDocumentSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchematronValidationType(SchematronValidationType schematronValidationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schematronValidationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextRuleType(TextRuleType textRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textRuleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidityContextType(ValidityContextType validityContextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validityContextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMLSchemaType(XMLSchemaType xmlSchemaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlSchemaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXPathType(XPathType xPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDClassCodeSimpleType(MPDClassCodeSimpleType mpdClassCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipCodeSimpleType(RelationshipCodeSimpleType relationshipCodeSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassListSimpleType(List<?> classListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassListSimpleType_ItemType(classListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Class List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassListSimpleType_ItemType(List<?> classListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = classListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (_0Package.Literals.CLASS_UNION_SIMPLE_TYPE.isInstance(item)) {
				result &= validateClassUnionSimpleType(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(_0Package.Literals.CLASS_UNION_SIMPLE_TYPE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassUnionSimpleType(Object classUnionSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassUnionSimpleType_MemberTypes(classUnionSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Class Union Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassUnionSimpleType_MemberTypes(Object classUnionSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE.isInstance(classUnionSimpleType)) {
				if (validateMPDClassCodeSimpleType((MPDClassCodeSimpleType)classUnionSimpleType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(classUnionSimpleType)) {
				if (xmlTypeValidator.validateAnyURI((String)classUnionSimpleType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE.isInstance(classUnionSimpleType)) {
				if (validateMPDClassCodeSimpleType((MPDClassCodeSimpleType)classUnionSimpleType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(classUnionSimpleType)) {
				if (xmlTypeValidator.validateAnyURI((String)classUnionSimpleType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDClassCodeSimpleTypeObject(MPDClassCodeSimpleType mpdClassCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDClassListSimpleType(List<?> mpdClassListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassListSimpleType_ItemType(mpdClassListSimpleType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMPDClassListSimpleType_MinLength(mpdClassListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>MPD Class List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDClassListSimpleType_MinLength(List<?> mpdClassListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = mpdClassListSimpleType.size();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(_0Package.Literals.MPD_CLASS_LIST_SIMPLE_TYPE, mpdClassListSimpleType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDNameSimpleType(String mpdNameSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMPDNameSimpleType_Pattern(mpdNameSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMPDNameSimpleType_Pattern
	 */
	public static final  PatternMatcher [][] MPD_NAME_SIMPLE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-z]([-_]?[a-z0-9]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>MPD Name Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDNameSimpleType_Pattern(String mpdNameSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_0Package.Literals.MPD_NAME_SIMPLE_TYPE, mpdNameSimpleType, MPD_NAME_SIMPLE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDVersionIDSimpleType(String mpdVersionIDSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMPDVersionIDSimpleType_Pattern(mpdVersionIDSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMPDVersionIDSimpleType_Pattern
	 */
	public static final  PatternMatcher [][] MPD_VERSION_ID_SIMPLE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+(\\.[0-9]+)*((alpha|beta|rc|rev)[0-9]+)?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>MPD Version ID Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMPDVersionIDSimpleType_Pattern(String mpdVersionIDSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(_0Package.Literals.MPD_VERSION_ID_SIMPLE_TYPE, mpdVersionIDSimpleType, MPD_VERSION_ID_SIMPLE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedNameListSimpleType(List<?> qualifiedNameListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQualifiedNameListSimpleType_ItemType(qualifiedNameListSimpleType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Qualified Name List Simple Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifiedNameListSimpleType_ItemType(List<?> qualifiedNameListSimpleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = qualifiedNameListSimpleType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipCodeSimpleTypeObject(RelationshipCodeSimpleType relationshipCodeSimpleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //_0Validator
