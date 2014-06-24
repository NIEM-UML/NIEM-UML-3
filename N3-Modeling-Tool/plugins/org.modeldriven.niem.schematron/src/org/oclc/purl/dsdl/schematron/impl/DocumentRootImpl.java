/**
 */
package org.oclc.purl.dsdl.schematron.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
import org.oclc.purl.dsdl.schematron.SchematronPackage;
import org.oclc.purl.dsdl.schematron.SpanType;
import org.oclc.purl.dsdl.schematron.TitleType;
import org.oclc.purl.dsdl.schematron.ValueOfType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getDiagnostic <em>Diagnostic</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getP <em>P</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getReport <em>Report</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.impl.DocumentRootImpl#getValueOf <em>Value Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getEmph() <em>Emph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmph()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchematronPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, SchematronPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SchematronPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SchematronPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveType getActive() {
		return (ActiveType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(ActiveType newActive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__ACTIVE, newActive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(ActiveType newActive) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__ACTIVE, newActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertType getAssert() {
		return (AssertType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__ASSERT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssert(AssertType newAssert, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__ASSERT, newAssert, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssert(AssertType newAssert) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__ASSERT, newAssert);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticType getDiagnostic() {
		return (DiagnosticType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__DIAGNOSTIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnostic(DiagnosticType newDiagnostic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__DIAGNOSTIC, newDiagnostic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostic(DiagnosticType newDiagnostic) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__DIAGNOSTIC, newDiagnostic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticsType getDiagnostics() {
		return (DiagnosticsType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnostics(DiagnosticsType newDiagnostics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS, newDiagnostics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostics(DiagnosticsType newDiagnostics) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__DIAGNOSTICS, newDiagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType getDir() {
		return (DirType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__DIR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDir(DirType newDir, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__DIR, newDir, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(DirType newDir) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__DIR, newDir);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmph() {
		return (String)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__EMPH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmph(String newEmph) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__EMPH, newEmph);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsType getExtends() {
		return (ExtendsType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__EXTENDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(ExtendsType newExtends, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__EXTENDS, newExtends, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(ExtendsType newExtends) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__EXTENDS, newExtends);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType getInclude() {
		return (IncludeType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__INCLUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(IncludeType newInclude, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__INCLUDE, newInclude, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(IncludeType newInclude) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__INCLUDE, newInclude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetType getLet() {
		return (LetType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__LET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLet(LetType newLet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__LET, newLet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLet(LetType newLet) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__LET, newLet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return (NameType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__NAME, newName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NsType getNs() {
		return (NsType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__NS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNs(NsType newNs, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__NS, newNs, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNs(NsType newNs) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__NS, newNs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType getP() {
		return (PType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__P, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(PType newP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__P, newP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(PType newP) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__P, newP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType getParam() {
		return (ParamType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParam(ParamType newParam, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__PARAM, newParam, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(ParamType newParam) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__PARAM, newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternType getPattern() {
		return (PatternType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(PatternType newPattern, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__PATTERN, newPattern, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(PatternType newPattern) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhaseType getPhase() {
		return (PhaseType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__PHASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhase(PhaseType newPhase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__PHASE, newPhase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(PhaseType newPhase) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__PHASE, newPhase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportType getReport() {
		return (ReportType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__REPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReport(ReportType newReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__REPORT, newReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReport(ReportType newReport) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__REPORT, newReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getRule() {
		return (RuleType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(RuleType newRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__RULE, newRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(RuleType newRule) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__RULE, newRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaType getSchema() {
		return (SchemaType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(SchemaType newSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__SCHEMA, newSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(SchemaType newSchema) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType getSpan() {
		return (SpanType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__SPAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(SpanType newSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__SPAN, newSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(SpanType newSpan) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return (TitleType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOfType getValueOf() {
		return (ValueOfType)getMixed().get(SchematronPackage.Literals.DOCUMENT_ROOT__VALUE_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueOf(ValueOfType newValueOf, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(SchematronPackage.Literals.DOCUMENT_ROOT__VALUE_OF, newValueOf, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOf(ValueOfType newValueOf) {
		((FeatureMap.Internal)getMixed()).set(SchematronPackage.Literals.DOCUMENT_ROOT__VALUE_OF, newValueOf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchematronPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case SchematronPackage.DOCUMENT_ROOT__ACTIVE:
				return basicSetActive(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__ASSERT:
				return basicSetAssert(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTIC:
				return basicSetDiagnostic(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTICS:
				return basicSetDiagnostics(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__DIR:
				return basicSetDir(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__EXTENDS:
				return basicSetExtends(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__INCLUDE:
				return basicSetInclude(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__LET:
				return basicSetLet(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__NAME:
				return basicSetName(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__NS:
				return basicSetNs(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__P:
				return basicSetP(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__PARAM:
				return basicSetParam(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__PATTERN:
				return basicSetPattern(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__PHASE:
				return basicSetPhase(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__REPORT:
				return basicSetReport(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__RULE:
				return basicSetRule(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__SCHEMA:
				return basicSetSchema(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__SPAN:
				return basicSetSpan(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
			case SchematronPackage.DOCUMENT_ROOT__VALUE_OF:
				return basicSetValueOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchematronPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case SchematronPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case SchematronPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case SchematronPackage.DOCUMENT_ROOT__ACTIVE:
				return getActive();
			case SchematronPackage.DOCUMENT_ROOT__ASSERT:
				return getAssert();
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTIC:
				return getDiagnostic();
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTICS:
				return getDiagnostics();
			case SchematronPackage.DOCUMENT_ROOT__DIR:
				return getDir();
			case SchematronPackage.DOCUMENT_ROOT__EMPH:
				return getEmph();
			case SchematronPackage.DOCUMENT_ROOT__EXTENDS:
				return getExtends();
			case SchematronPackage.DOCUMENT_ROOT__INCLUDE:
				return getInclude();
			case SchematronPackage.DOCUMENT_ROOT__LET:
				return getLet();
			case SchematronPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case SchematronPackage.DOCUMENT_ROOT__NS:
				return getNs();
			case SchematronPackage.DOCUMENT_ROOT__P:
				return getP();
			case SchematronPackage.DOCUMENT_ROOT__PARAM:
				return getParam();
			case SchematronPackage.DOCUMENT_ROOT__PATTERN:
				return getPattern();
			case SchematronPackage.DOCUMENT_ROOT__PHASE:
				return getPhase();
			case SchematronPackage.DOCUMENT_ROOT__REPORT:
				return getReport();
			case SchematronPackage.DOCUMENT_ROOT__RULE:
				return getRule();
			case SchematronPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema();
			case SchematronPackage.DOCUMENT_ROOT__SPAN:
				return getSpan();
			case SchematronPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case SchematronPackage.DOCUMENT_ROOT__VALUE_OF:
				return getValueOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchematronPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__ACTIVE:
				setActive((ActiveType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__ASSERT:
				setAssert((AssertType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTIC:
				setDiagnostic((DiagnosticType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTICS:
				setDiagnostics((DiagnosticsType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__DIR:
				setDir((DirType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__EMPH:
				setEmph((String)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__EXTENDS:
				setExtends((ExtendsType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__INCLUDE:
				setInclude((IncludeType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__LET:
				setLet((LetType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__NAME:
				setName((NameType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__NS:
				setNs((NsType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__P:
				setP((PType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__PATTERN:
				setPattern((PatternType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__PHASE:
				setPhase((PhaseType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__REPORT:
				setReport((ReportType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__RULE:
				setRule((RuleType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((SchemaType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)newValue);
				return;
			case SchematronPackage.DOCUMENT_ROOT__VALUE_OF:
				setValueOf((ValueOfType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchematronPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case SchematronPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case SchematronPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case SchematronPackage.DOCUMENT_ROOT__ACTIVE:
				setActive((ActiveType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__ASSERT:
				setAssert((AssertType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTIC:
				setDiagnostic((DiagnosticType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTICS:
				setDiagnostics((DiagnosticsType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__DIR:
				setDir((DirType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__EMPH:
				setEmph(EMPH_EDEFAULT);
				return;
			case SchematronPackage.DOCUMENT_ROOT__EXTENDS:
				setExtends((ExtendsType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__INCLUDE:
				setInclude((IncludeType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__LET:
				setLet((LetType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__NAME:
				setName((NameType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__NS:
				setNs((NsType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__P:
				setP((PType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__PARAM:
				setParam((ParamType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__PATTERN:
				setPattern((PatternType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__PHASE:
				setPhase((PhaseType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__REPORT:
				setReport((ReportType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__RULE:
				setRule((RuleType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((SchemaType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__TITLE:
				setTitle((TitleType)null);
				return;
			case SchematronPackage.DOCUMENT_ROOT__VALUE_OF:
				setValueOf((ValueOfType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchematronPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case SchematronPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case SchematronPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case SchematronPackage.DOCUMENT_ROOT__ACTIVE:
				return getActive() != null;
			case SchematronPackage.DOCUMENT_ROOT__ASSERT:
				return getAssert() != null;
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTIC:
				return getDiagnostic() != null;
			case SchematronPackage.DOCUMENT_ROOT__DIAGNOSTICS:
				return getDiagnostics() != null;
			case SchematronPackage.DOCUMENT_ROOT__DIR:
				return getDir() != null;
			case SchematronPackage.DOCUMENT_ROOT__EMPH:
				return EMPH_EDEFAULT == null ? getEmph() != null : !EMPH_EDEFAULT.equals(getEmph());
			case SchematronPackage.DOCUMENT_ROOT__EXTENDS:
				return getExtends() != null;
			case SchematronPackage.DOCUMENT_ROOT__INCLUDE:
				return getInclude() != null;
			case SchematronPackage.DOCUMENT_ROOT__LET:
				return getLet() != null;
			case SchematronPackage.DOCUMENT_ROOT__NAME:
				return getName() != null;
			case SchematronPackage.DOCUMENT_ROOT__NS:
				return getNs() != null;
			case SchematronPackage.DOCUMENT_ROOT__P:
				return getP() != null;
			case SchematronPackage.DOCUMENT_ROOT__PARAM:
				return getParam() != null;
			case SchematronPackage.DOCUMENT_ROOT__PATTERN:
				return getPattern() != null;
			case SchematronPackage.DOCUMENT_ROOT__PHASE:
				return getPhase() != null;
			case SchematronPackage.DOCUMENT_ROOT__REPORT:
				return getReport() != null;
			case SchematronPackage.DOCUMENT_ROOT__RULE:
				return getRule() != null;
			case SchematronPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema() != null;
			case SchematronPackage.DOCUMENT_ROOT__SPAN:
				return getSpan() != null;
			case SchematronPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
			case SchematronPackage.DOCUMENT_ROOT__VALUE_OF:
				return getValueOf() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
