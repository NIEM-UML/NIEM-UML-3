/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.util;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.*;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package
 * @generated
 */
public class _0Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _0Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Switch() {
		if (modelPackage == null) {
			modelPackage = _0Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _0Package.CATALOG_TYPE: {
				CatalogType catalogType = (CatalogType)theEObject;
				T result = caseCatalogType(catalogType);
				if (result == null) result = caseObjectType(catalogType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.CONFORMANCE_TARGET_TYPE: {
				ConformanceTargetType conformanceTargetType = (ConformanceTargetType)theEObject;
				T result = caseConformanceTargetType(conformanceTargetType);
				if (result == null) result = caseObjectType(conformanceTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FILE_SET_TYPE: {
				FileSetType fileSetType = (FileSetType)theEObject;
				T result = caseFileSetType(fileSetType);
				if (result == null) result = caseObjectType(fileSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = caseObjectType(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE: {
				IEPConformanceTargetType iepConformanceTargetType = (IEPConformanceTargetType)theEObject;
				T result = caseIEPConformanceTargetType(iepConformanceTargetType);
				if (result == null) result = caseObjectType(iepConformanceTargetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MPD_INFORMATION_TYPE: {
				MPDInformationType mpdInformationType = (MPDInformationType)theEObject;
				T result = caseMPDInformationType(mpdInformationType);
				if (result == null) result = caseObjectType(mpdInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.MPD_TYPE: {
				MPDType mpdType = (MPDType)theEObject;
				T result = caseMPDType(mpdType);
				if (result == null) result = caseObjectType(mpdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.QUALIFIED_NAMES_TYPE: {
				QualifiedNamesType qualifiedNamesType = (QualifiedNamesType)theEObject;
				T result = caseQualifiedNamesType(qualifiedNamesType);
				if (result == null) result = caseObjectType(qualifiedNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE: {
				ReferenceSchemaDocumentSetType referenceSchemaDocumentSetType = (ReferenceSchemaDocumentSetType)theEObject;
				T result = caseReferenceSchemaDocumentSetType(referenceSchemaDocumentSetType);
				if (result == null) result = caseFileSetType(referenceSchemaDocumentSetType);
				if (result == null) result = caseObjectType(referenceSchemaDocumentSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = caseObjectType(relationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.RELAX_NG_VALIDATION_TYPE: {
				RelaxNGValidationType relaxNGValidationType = (RelaxNGValidationType)theEObject;
				T result = caseRelaxNGValidationType(relaxNGValidationType);
				if (result == null) result = caseObjectType(relaxNGValidationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE: {
				SchemaDocumentSetType schemaDocumentSetType = (SchemaDocumentSetType)theEObject;
				T result = caseSchemaDocumentSetType(schemaDocumentSetType);
				if (result == null) result = caseFileSetType(schemaDocumentSetType);
				if (result == null) result = caseObjectType(schemaDocumentSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.SCHEMATRON_VALIDATION_TYPE: {
				SchematronValidationType schematronValidationType = (SchematronValidationType)theEObject;
				T result = caseSchematronValidationType(schematronValidationType);
				if (result == null) result = caseObjectType(schematronValidationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.TEXT_RULE_TYPE: {
				TextRuleType textRuleType = (TextRuleType)theEObject;
				T result = caseTextRuleType(textRuleType);
				if (result == null) result = caseObjectType(textRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.VALIDITY_CONTEXT_TYPE: {
				ValidityContextType validityContextType = (ValidityContextType)theEObject;
				T result = caseValidityContextType(validityContextType);
				if (result == null) result = caseObjectType(validityContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.XML_SCHEMA_TYPE: {
				XMLSchemaType xmlSchemaType = (XMLSchemaType)theEObject;
				T result = caseXMLSchemaType(xmlSchemaType);
				if (result == null) result = caseObjectType(xmlSchemaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _0Package.XPATH_TYPE: {
				XPathType xPathType = (XPathType)theEObject;
				T result = caseXPathType(xPathType);
				if (result == null) result = caseObjectType(xPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalog Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalog Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogType(CatalogType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceTargetType(ConformanceTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSetType(FileSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IEP Conformance Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IEP Conformance Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIEPConformanceTargetType(IEPConformanceTargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPD Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPD Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDInformationType(MPDInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPDType(MPDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedNamesType(QualifiedNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Schema Document Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Schema Document Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceSchemaDocumentSetType(ReferenceSchemaDocumentSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipType(RelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relax NG Validation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relax NG Validation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelaxNGValidationType(RelaxNGValidationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Document Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Document Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaDocumentSetType(SchemaDocumentSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schematron Validation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schematron Validation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchematronValidationType(SchematronValidationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextRuleType(TextRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validity Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validity Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidityContextType(ValidityContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Schema Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Schema Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLSchemaType(XMLSchemaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPath Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPath Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPathType(XPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //_0Switch
