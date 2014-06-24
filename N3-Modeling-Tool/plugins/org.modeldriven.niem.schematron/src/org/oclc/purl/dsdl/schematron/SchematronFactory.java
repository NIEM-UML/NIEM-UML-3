/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage
 * @generated
 */
public interface SchematronFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchematronFactory eINSTANCE = org.oclc.purl.dsdl.schematron.impl.SchematronFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Active Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Type</em>'.
	 * @generated
	 */
	ActiveType createActiveType();

	/**
	 * Returns a new object of class '<em>Assert Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Type</em>'.
	 * @generated
	 */
	AssertType createAssertType();

	/**
	 * Returns a new object of class '<em>Diagnostics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostics Type</em>'.
	 * @generated
	 */
	DiagnosticsType createDiagnosticsType();

	/**
	 * Returns a new object of class '<em>Diagnostic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic Type</em>'.
	 * @generated
	 */
	DiagnosticType createDiagnosticType();

	/**
	 * Returns a new object of class '<em>Dir Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dir Type</em>'.
	 * @generated
	 */
	DirType createDirType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Extends Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extends Type</em>'.
	 * @generated
	 */
	ExtendsType createExtendsType();

	/**
	 * Returns a new object of class '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include Type</em>'.
	 * @generated
	 */
	IncludeType createIncludeType();

	/**
	 * Returns a new object of class '<em>Let Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Let Type</em>'.
	 * @generated
	 */
	LetType createLetType();

	/**
	 * Returns a new object of class '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Type</em>'.
	 * @generated
	 */
	NameType createNameType();

	/**
	 * Returns a new object of class '<em>Ns Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ns Type</em>'.
	 * @generated
	 */
	NsType createNsType();

	/**
	 * Returns a new object of class '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Type</em>'.
	 * @generated
	 */
	ParamType createParamType();

	/**
	 * Returns a new object of class '<em>Pattern Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Type</em>'.
	 * @generated
	 */
	PatternType createPatternType();

	/**
	 * Returns a new object of class '<em>Phase Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phase Type</em>'.
	 * @generated
	 */
	PhaseType createPhaseType();

	/**
	 * Returns a new object of class '<em>PType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PType</em>'.
	 * @generated
	 */
	PType createPType();

	/**
	 * Returns a new object of class '<em>Report Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Type</em>'.
	 * @generated
	 */
	ReportType createReportType();

	/**
	 * Returns a new object of class '<em>Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Type</em>'.
	 * @generated
	 */
	RuleType createRuleType();

	/**
	 * Returns a new object of class '<em>Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema Type</em>'.
	 * @generated
	 */
	SchemaType createSchemaType();

	/**
	 * Returns a new object of class '<em>Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Type</em>'.
	 * @generated
	 */
	SpanType createSpanType();

	/**
	 * Returns a new object of class '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Type</em>'.
	 * @generated
	 */
	TitleType createTitleType();

	/**
	 * Returns a new object of class '<em>Value Of Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Of Type</em>'.
	 * @generated
	 */
	ValueOfType createValueOfType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchematronPackage getSchematronPackage();

} //SchematronFactory
