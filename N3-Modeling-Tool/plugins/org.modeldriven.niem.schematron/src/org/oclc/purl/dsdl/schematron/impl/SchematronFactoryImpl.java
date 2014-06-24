/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.oclc.purl.dsdl.schematron.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchematronFactoryImpl extends EFactoryImpl implements SchematronFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SchematronFactory init() {
		try {
			SchematronFactory theSchematronFactory = (SchematronFactory)EPackage.Registry.INSTANCE.getEFactory("http://purl.oclc.org/dsdl/schematron"); 
			if (theSchematronFactory != null) {
				return theSchematronFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchematronFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SchematronPackage.ACTIVE_TYPE: return createActiveType();
			case SchematronPackage.ASSERT_TYPE: return createAssertType();
			case SchematronPackage.DIAGNOSTICS_TYPE: return createDiagnosticsType();
			case SchematronPackage.DIAGNOSTIC_TYPE: return createDiagnosticType();
			case SchematronPackage.DIR_TYPE: return createDirType();
			case SchematronPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case SchematronPackage.EXTENDS_TYPE: return createExtendsType();
			case SchematronPackage.INCLUDE_TYPE: return createIncludeType();
			case SchematronPackage.LET_TYPE: return createLetType();
			case SchematronPackage.NAME_TYPE: return createNameType();
			case SchematronPackage.NS_TYPE: return createNsType();
			case SchematronPackage.PARAM_TYPE: return createParamType();
			case SchematronPackage.PATTERN_TYPE: return createPatternType();
			case SchematronPackage.PHASE_TYPE: return createPhaseType();
			case SchematronPackage.PTYPE: return createPType();
			case SchematronPackage.REPORT_TYPE: return createReportType();
			case SchematronPackage.RULE_TYPE: return createRuleType();
			case SchematronPackage.SCHEMA_TYPE: return createSchemaType();
			case SchematronPackage.SPAN_TYPE: return createSpanType();
			case SchematronPackage.TITLE_TYPE: return createTitleType();
			case SchematronPackage.VALUE_OF_TYPE: return createValueOfType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SchematronPackage.ABSTRACT_TYPE:
				return createAbstractTypeFromString(eDataType, initialValue);
			case SchematronPackage.ABSTRACT_TYPE1:
				return createAbstractType1FromString(eDataType, initialValue);
			case SchematronPackage.VALUE_TYPE:
				return createValueTypeFromString(eDataType, initialValue);
			case SchematronPackage.ABSTRACT_TYPE_OBJECT:
				return createAbstractTypeObjectFromString(eDataType, initialValue);
			case SchematronPackage.ABSTRACT_TYPE_OBJECT1:
				return createAbstractTypeObject1FromString(eDataType, initialValue);
			case SchematronPackage.CLASS_VALUE:
				return createClassValueFromString(eDataType, initialValue);
			case SchematronPackage.EXPR_VALUE:
				return createExprValueFromString(eDataType, initialValue);
			case SchematronPackage.FLAG_VALUE:
				return createFlagValueFromString(eDataType, initialValue);
			case SchematronPackage.FPI_VALUE:
				return createFpiValueFromString(eDataType, initialValue);
			case SchematronPackage.LANG_VALUE:
				return createLangValueFromString(eDataType, initialValue);
			case SchematronPackage.NAME_VALUE:
				return createNameValueFromString(eDataType, initialValue);
			case SchematronPackage.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			case SchematronPackage.PATH_VALUE:
				return createPathValueFromString(eDataType, initialValue);
			case SchematronPackage.ROLE_VALUE:
				return createRoleValueFromString(eDataType, initialValue);
			case SchematronPackage.URI_VALUE:
				return createUriValueFromString(eDataType, initialValue);
			case SchematronPackage.VALUE_TYPE_OBJECT:
				return createValueTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SchematronPackage.ABSTRACT_TYPE:
				return convertAbstractTypeToString(eDataType, instanceValue);
			case SchematronPackage.ABSTRACT_TYPE1:
				return convertAbstractType1ToString(eDataType, instanceValue);
			case SchematronPackage.VALUE_TYPE:
				return convertValueTypeToString(eDataType, instanceValue);
			case SchematronPackage.ABSTRACT_TYPE_OBJECT:
				return convertAbstractTypeObjectToString(eDataType, instanceValue);
			case SchematronPackage.ABSTRACT_TYPE_OBJECT1:
				return convertAbstractTypeObject1ToString(eDataType, instanceValue);
			case SchematronPackage.CLASS_VALUE:
				return convertClassValueToString(eDataType, instanceValue);
			case SchematronPackage.EXPR_VALUE:
				return convertExprValueToString(eDataType, instanceValue);
			case SchematronPackage.FLAG_VALUE:
				return convertFlagValueToString(eDataType, instanceValue);
			case SchematronPackage.FPI_VALUE:
				return convertFpiValueToString(eDataType, instanceValue);
			case SchematronPackage.LANG_VALUE:
				return convertLangValueToString(eDataType, instanceValue);
			case SchematronPackage.NAME_VALUE:
				return convertNameValueToString(eDataType, instanceValue);
			case SchematronPackage.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			case SchematronPackage.PATH_VALUE:
				return convertPathValueToString(eDataType, instanceValue);
			case SchematronPackage.ROLE_VALUE:
				return convertRoleValueToString(eDataType, instanceValue);
			case SchematronPackage.URI_VALUE:
				return convertUriValueToString(eDataType, instanceValue);
			case SchematronPackage.VALUE_TYPE_OBJECT:
				return convertValueTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveType createActiveType() {
		ActiveTypeImpl activeType = new ActiveTypeImpl();
		return activeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertType createAssertType() {
		AssertTypeImpl assertType = new AssertTypeImpl();
		return assertType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticsType createDiagnosticsType() {
		DiagnosticsTypeImpl diagnosticsType = new DiagnosticsTypeImpl();
		return diagnosticsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticType createDiagnosticType() {
		DiagnosticTypeImpl diagnosticType = new DiagnosticTypeImpl();
		return diagnosticType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirType() {
		DirTypeImpl dirType = new DirTypeImpl();
		return dirType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsType createExtendsType() {
		ExtendsTypeImpl extendsType = new ExtendsTypeImpl();
		return extendsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetType createLetType() {
		LetTypeImpl letType = new LetTypeImpl();
		return letType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NsType createNsType() {
		NsTypeImpl nsType = new NsTypeImpl();
		return nsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternType createPatternType() {
		PatternTypeImpl patternType = new PatternTypeImpl();
		return patternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseType createPhaseType() {
		PhaseTypeImpl phaseType = new PhaseTypeImpl();
		return phaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType createPType() {
		PTypeImpl pType = new PTypeImpl();
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportType createReportType() {
		ReportTypeImpl reportType = new ReportTypeImpl();
		return reportType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType createRuleType() {
		RuleTypeImpl ruleType = new RuleTypeImpl();
		return ruleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaType createSchemaType() {
		SchemaTypeImpl schemaType = new SchemaTypeImpl();
		return schemaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType createSpanType() {
		SpanTypeImpl spanType = new SpanTypeImpl();
		return spanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOfType createValueOfType() {
		ValueOfTypeImpl valueOfType = new ValueOfTypeImpl();
		return valueOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType createAbstractTypeFromString(EDataType eDataType, String initialValue) {
		AbstractType result = AbstractType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType1 createAbstractType1FromString(EDataType eDataType, String initialValue) {
		AbstractType1 result = AbstractType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeFromString(EDataType eDataType, String initialValue) {
		ValueType result = ValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType createAbstractTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAbstractTypeFromString(SchematronPackage.Literals.ABSTRACT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAbstractTypeToString(SchematronPackage.Literals.ABSTRACT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType1 createAbstractTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createAbstractType1FromString(SchematronPackage.Literals.ABSTRACT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertAbstractType1ToString(SchematronPackage.Literals.ABSTRACT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createClassValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExprValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExprValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFlagValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlagValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFpiValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFpiValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLangValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLangValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRoleValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValueTypeFromString(SchematronPackage.Literals.VALUE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueTypeToString(SchematronPackage.Literals.VALUE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronPackage getSchematronPackage() {
		return (SchematronPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SchematronPackage getPackage() {
		return SchematronPackage.eINSTANCE;
	}

} //SchematronFactoryImpl
