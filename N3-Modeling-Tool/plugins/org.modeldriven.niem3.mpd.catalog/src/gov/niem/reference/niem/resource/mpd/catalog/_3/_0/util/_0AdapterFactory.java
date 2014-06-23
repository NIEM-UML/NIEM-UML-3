/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.util;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.*;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package
 * @generated
 */
public class _0AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
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
	protected _0Switch<Adapter> modelSwitch =
		new _0Switch<Adapter>() {
			@Override
			public Adapter caseCatalogType(CatalogType object) {
				return createCatalogTypeAdapter();
			}
			@Override
			public Adapter caseConformanceTargetType(ConformanceTargetType object) {
				return createConformanceTargetTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFileSetType(FileSetType object) {
				return createFileSetTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseIEPConformanceTargetType(IEPConformanceTargetType object) {
				return createIEPConformanceTargetTypeAdapter();
			}
			@Override
			public Adapter caseMPDInformationType(MPDInformationType object) {
				return createMPDInformationTypeAdapter();
			}
			@Override
			public Adapter caseMPDType(MPDType object) {
				return createMPDTypeAdapter();
			}
			@Override
			public Adapter caseQualifiedNamesType(QualifiedNamesType object) {
				return createQualifiedNamesTypeAdapter();
			}
			@Override
			public Adapter caseReferenceSchemaDocumentSetType(ReferenceSchemaDocumentSetType object) {
				return createReferenceSchemaDocumentSetTypeAdapter();
			}
			@Override
			public Adapter caseRelationshipType(RelationshipType object) {
				return createRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseRelaxNGValidationType(RelaxNGValidationType object) {
				return createRelaxNGValidationTypeAdapter();
			}
			@Override
			public Adapter caseSchemaDocumentSetType(SchemaDocumentSetType object) {
				return createSchemaDocumentSetTypeAdapter();
			}
			@Override
			public Adapter caseSchematronValidationType(SchematronValidationType object) {
				return createSchematronValidationTypeAdapter();
			}
			@Override
			public Adapter caseTextRuleType(TextRuleType object) {
				return createTextRuleTypeAdapter();
			}
			@Override
			public Adapter caseValidityContextType(ValidityContextType object) {
				return createValidityContextTypeAdapter();
			}
			@Override
			public Adapter caseXMLSchemaType(XMLSchemaType object) {
				return createXMLSchemaTypeAdapter();
			}
			@Override
			public Adapter caseXPathType(XPathType object) {
				return createXPathTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType <em>Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.CatalogType
	 * @generated
	 */
	public Adapter createCatalogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType <em>Conformance Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ConformanceTargetType
	 * @generated
	 */
	public Adapter createConformanceTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType <em>File Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileSetType
	 * @generated
	 */
	public Adapter createFileSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType <em>IEP Conformance Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType
	 * @generated
	 */
	public Adapter createIEPConformanceTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType <em>MPD Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDInformationType
	 * @generated
	 */
	public Adapter createMPDInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType <em>MPD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.MPDType
	 * @generated
	 */
	public Adapter createMPDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType <em>Qualified Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.QualifiedNamesType
	 * @generated
	 */
	public Adapter createQualifiedNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType <em>Reference Schema Document Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ReferenceSchemaDocumentSetType
	 * @generated
	 */
	public Adapter createReferenceSchemaDocumentSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelationshipType
	 * @generated
	 */
	public Adapter createRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType <em>Relax NG Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.RelaxNGValidationType
	 * @generated
	 */
	public Adapter createRelaxNGValidationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType <em>Schema Document Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchemaDocumentSetType
	 * @generated
	 */
	public Adapter createSchemaDocumentSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType <em>Schematron Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.SchematronValidationType
	 * @generated
	 */
	public Adapter createSchematronValidationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType <em>Text Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.TextRuleType
	 * @generated
	 */
	public Adapter createTextRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType <em>Validity Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType
	 * @generated
	 */
	public Adapter createValidityContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType <em>XML Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XMLSchemaType
	 * @generated
	 */
	public Adapter createXMLSchemaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType <em>XPath Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0.XPathType
	 * @generated
	 */
	public Adapter createXPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.release.niem.structures._3._0.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.release.niem.structures._3._0.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
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

} //_0AdapterFactory
