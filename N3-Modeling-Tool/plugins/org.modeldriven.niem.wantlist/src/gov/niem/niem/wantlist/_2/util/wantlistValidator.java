/**
 */
package gov.niem.niem.wantlist._2.util;

import gov.niem.niem.wantlist._2.*;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
 * @see gov.niem.niem.wantlist._2.wantlistPackage
 * @generated
 */
public class wantlistValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final wantlistValidator INSTANCE = new wantlistValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gov.niem.niem.wantlist._2";

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
	public wantlistValidator() {
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
	  return wantlistPackage.eINSTANCE;
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
			case wantlistPackage.ATTRIBUTE_IN_TYPE_TYPE:
				return validateAttributeInTypeType((AttributeInTypeType)value, diagnostics, context);
			case wantlistPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case wantlistPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE:
				return validateElementInTypeType((ElementInTypeType)value, diagnostics, context);
			case wantlistPackage.ELEMENT_TYPE:
				return validateElementType((ElementType)value, diagnostics, context);
			case wantlistPackage.FACET_TYPE:
				return validateFacetType((FacetType)value, diagnostics, context);
			case wantlistPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case wantlistPackage.UNION_MEMBER_TYPE:
				return validateUnionMemberType((UnionMemberType)value, diagnostics, context);
			case wantlistPackage.WANT_LIST_TYPE:
				return validateWantListType((WantListType)value, diagnostics, context);
			case wantlistPackage.ALL_NNI_MEMBER1:
				return validateAllNNIMember1((AllNNIMember1)value, diagnostics, context);
			case wantlistPackage.FACET_FACET_TYPE:
				return validateFacetFacetType((FacetFacetType)value, diagnostics, context);
			case wantlistPackage.ALL_NNI:
				return validateAllNNI(value, diagnostics, context);
			case wantlistPackage.ALL_NNI_MEMBER1_OBJECT:
				return validateAllNNIMember1Object((AllNNIMember1)value, diagnostics, context);
			case wantlistPackage.FACET_FACET_TYPE_OBJECT:
				return validateFacetFacetTypeObject((FacetFacetType)value, diagnostics, context);
			case wantlistPackage.POSITIVE_INTEGER_LIST_TYPE:
				return validatePositiveIntegerListType((List<?>)value, diagnostics, context);
			case wantlistPackage.VERSION_TYPE:
				return validateVersionType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeInTypeType(AttributeInTypeType attributeInTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeInTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeType, diagnostics, context);
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
	public boolean validateElementInTypeType(ElementInTypeType elementInTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementInTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementType(ElementType elementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacetType(FacetType facetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionMemberType(UnionMemberType unionMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWantListType(WantListType wantListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wantListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllNNIMember1(AllNNIMember1 allNNIMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacetFacetType(FacetFacetType facetFacetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllNNI(Object allNNI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAllNNI_MemberTypes(allNNI, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>All NNI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllNNI_MemberTypes(Object allNNI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(allNNI)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)allNNI, tempDiagnostics, context)) return true;
			}
			if (wantlistPackage.Literals.ALL_NNI_MEMBER1.isInstance(allNNI)) {
				if (validateAllNNIMember1((AllNNIMember1)allNNI, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(allNNI)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)allNNI, null, context)) return true;
			}
			if (wantlistPackage.Literals.ALL_NNI_MEMBER1.isInstance(allNNI)) {
				if (validateAllNNIMember1((AllNNIMember1)allNNI, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllNNIMember1Object(AllNNIMember1 allNNIMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacetFacetTypeObject(FacetFacetType facetFacetTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerListType(List<?> positiveIntegerListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveIntegerListType_ItemType(positiveIntegerListType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Positive Integer List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerListType_ItemType(List<?> positiveIntegerListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = positiveIntegerListType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.POSITIVE_INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validatePositiveInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.POSITIVE_INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionType_Pattern(versionType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionType_Pattern
	 */
	public static final  PatternMatcher [][] VERSION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+(\\.[0-9]+)*((alpha|beta|rc)[0-9]+)?(-[A-z]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType_Pattern(String versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(wantlistPackage.Literals.VERSION_TYPE, versionType, VERSION_TYPE__PATTERN__VALUES, diagnostics, context);
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

} //wantlistValidator
