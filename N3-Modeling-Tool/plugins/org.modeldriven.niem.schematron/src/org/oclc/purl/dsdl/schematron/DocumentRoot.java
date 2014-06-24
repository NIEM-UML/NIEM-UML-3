/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getActive <em>Active</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostic <em>Diagnostic</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getNs <em>Ns</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getP <em>P</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getReport <em>Report</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getRule <em>Rule</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getValueOf <em>Value Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(ActiveType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Active()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	ActiveType getActive();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(ActiveType value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(AssertType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Assert()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace'"
	 * @generated
	 */
	AssertType getAssert();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(AssertType value);

	/**
	 * Returns the value of the '<em><b>Diagnostic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic</em>' containment reference.
	 * @see #setDiagnostic(DiagnosticType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Diagnostic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagnostic' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticType getDiagnostic();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostic <em>Diagnostic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic</em>' containment reference.
	 * @see #getDiagnostic()
	 * @generated
	 */
	void setDiagnostic(DiagnosticType value);

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference.
	 * @see #setDiagnostics(DiagnosticsType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Diagnostics()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagnostics' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticsType getDiagnostics();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDiagnostics <em>Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostics</em>' containment reference.
	 * @see #getDiagnostics()
	 * @generated
	 */
	void setDiagnostics(DiagnosticsType value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' containment reference.
	 * @see #setDir(DirType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Dir()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dir' namespace='##targetNamespace'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getDir <em>Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' containment reference.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Returns the value of the '<em><b>Emph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emph</em>' attribute.
	 * @see #setEmph(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Emph()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emph' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmph();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getEmph <em>Emph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emph</em>' attribute.
	 * @see #getEmph()
	 * @generated
	 */
	void setEmph(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference.
	 * @see #setExtends(ExtendsType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Extends()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extends' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendsType getExtends();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getExtends <em>Extends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' containment reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(ExtendsType value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(IncludeType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Include()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace'"
	 * @generated
	 */
	IncludeType getInclude();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(IncludeType value);

	/**
	 * Returns the value of the '<em><b>Let</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let</em>' containment reference.
	 * @see #setLet(LetType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Let()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='let' namespace='##targetNamespace'"
	 * @generated
	 */
	LetType getLet();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getLet <em>Let</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let</em>' containment reference.
	 * @see #getLet()
	 * @generated
	 */
	void setLet(LetType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns</em>' containment reference.
	 * @see #setNs(NsType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Ns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ns' namespace='##targetNamespace'"
	 * @generated
	 */
	NsType getNs();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getNs <em>Ns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns</em>' containment reference.
	 * @see #getNs()
	 * @generated
	 */
	void setNs(NsType value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(PType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_P()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
	 * @generated
	 */
	PType getP();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(PType value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(ParamType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Param()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamType getParam();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ParamType value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference.
	 * @see #setPattern(PatternType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Pattern()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace'"
	 * @generated
	 */
	PatternType getPattern();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getPattern <em>Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' containment reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PatternType value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference.
	 * @see #setPhase(PhaseType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Phase()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace'"
	 * @generated
	 */
	PhaseType getPhase();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getPhase <em>Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' containment reference.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(PhaseType value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' containment reference.
	 * @see #setReport(ReportType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Report()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportType getReport();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getReport <em>Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' containment reference.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(ReportType value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(RuleType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Rule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	RuleType getRule();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(RuleType value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(SchemaType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Schema()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace'"
	 * @generated
	 */
	SchemaType getSchema();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(SchemaType value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference.
	 * @see #setSpan(SpanType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Span()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace'"
	 * @generated
	 */
	SpanType getSpan();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getSpan <em>Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' containment reference.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(SpanType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_Title()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Value Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of</em>' containment reference.
	 * @see #setValueOf(ValueOfType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDocumentRoot_ValueOf()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value-of' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueOfType getValueOf();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DocumentRoot#getValueOf <em>Value Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Of</em>' containment reference.
	 * @see #getValueOf()
	 * @generated
	 */
	void setValueOf(ValueOfType value);

} // DocumentRoot
