/**
 */
package org.oclc.purl.dsdl.schematron.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.oclc.purl.dsdl.schematron.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage
 * @generated
 */
public class SchematronAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SchematronPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SchematronPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchematronSwitch<Adapter> modelSwitch =
		new SchematronSwitch<Adapter>() {
			@Override
			public Adapter caseActiveType(ActiveType object) {
				return createActiveTypeAdapter();
			}
			@Override
			public Adapter caseAssertType(AssertType object) {
				return createAssertTypeAdapter();
			}
			@Override
			public Adapter caseDiagnosticsType(DiagnosticsType object) {
				return createDiagnosticsTypeAdapter();
			}
			@Override
			public Adapter caseDiagnosticType(DiagnosticType object) {
				return createDiagnosticTypeAdapter();
			}
			@Override
			public Adapter caseDirType(DirType object) {
				return createDirTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExtendsType(ExtendsType object) {
				return createExtendsTypeAdapter();
			}
			@Override
			public Adapter caseIncludeType(IncludeType object) {
				return createIncludeTypeAdapter();
			}
			@Override
			public Adapter caseLetType(LetType object) {
				return createLetTypeAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseNsType(NsType object) {
				return createNsTypeAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter casePatternType(PatternType object) {
				return createPatternTypeAdapter();
			}
			@Override
			public Adapter casePhaseType(PhaseType object) {
				return createPhaseTypeAdapter();
			}
			@Override
			public Adapter casePType(PType object) {
				return createPTypeAdapter();
			}
			@Override
			public Adapter caseReportType(ReportType object) {
				return createReportTypeAdapter();
			}
			@Override
			public Adapter caseRuleType(RuleType object) {
				return createRuleTypeAdapter();
			}
			@Override
			public Adapter caseSchemaType(SchemaType object) {
				return createSchemaTypeAdapter();
			}
			@Override
			public Adapter caseSpanType(SpanType object) {
				return createSpanTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseValueOfType(ValueOfType object) {
				return createValueOfTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.ActiveType <em>Active Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.ActiveType
	 * @generated
	 */
	public Adapter createActiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.AssertType <em>Assert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.AssertType
	 * @generated
	 */
	public Adapter createAssertTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.DiagnosticsType <em>Diagnostics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticsType
	 * @generated
	 */
	public Adapter createDiagnosticsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.DiagnosticType <em>Diagnostic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.DiagnosticType
	 * @generated
	 */
	public Adapter createDiagnosticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.DirType <em>Dir Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.DirType
	 * @generated
	 */
	public Adapter createDirTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.ExtendsType <em>Extends Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.ExtendsType
	 * @generated
	 */
	public Adapter createExtendsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.IncludeType
	 * @generated
	 */
	public Adapter createIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.LetType <em>Let Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.LetType
	 * @generated
	 */
	public Adapter createLetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.NsType <em>Ns Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.NsType
	 * @generated
	 */
	public Adapter createNsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.PatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.PatternType
	 * @generated
	 */
	public Adapter createPatternTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.PhaseType <em>Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.PhaseType
	 * @generated
	 */
	public Adapter createPhaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.PType
	 * @generated
	 */
	public Adapter createPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.ReportType <em>Report Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.ReportType
	 * @generated
	 */
	public Adapter createReportTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.RuleType
	 * @generated
	 */
	public Adapter createRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.SchemaType
	 * @generated
	 */
	public Adapter createSchemaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.SpanType
	 * @generated
	 */
	public Adapter createSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.oclc.purl.dsdl.schematron.ValueOfType <em>Value Of Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.oclc.purl.dsdl.schematron.ValueOfType
	 * @generated
	 */
	public Adapter createValueOfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchematronAdapterFactory
