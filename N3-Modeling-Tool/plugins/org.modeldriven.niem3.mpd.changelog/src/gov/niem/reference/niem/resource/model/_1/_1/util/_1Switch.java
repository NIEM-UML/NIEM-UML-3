/**
 */
package gov.niem.reference.niem.resource.model._1._1.util;

import gov.niem.niem.structures._2.ComplexObjectType;

import gov.niem.reference.niem.resource.model._1._1.*;

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
 * @see gov.niem.reference.niem.resource.model._1._1._1Package
 * @generated
 */
public class _1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Switch() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
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
			case _1Package.FACET_CATEGORY_CODE_TYPE: {
				FacetCategoryCodeType facetCategoryCodeType = (FacetCategoryCodeType)theEObject;
				T result = caseFacetCategoryCodeType(facetCategoryCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FACET_TYPE: {
				FacetType facetType = (FacetType)theEObject;
				T result = caseFacetType(facetType);
				if (result == null) result = caseComplexObjectType(facetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NAMESPACE_TYPE: {
				NamespaceType namespaceType = (NamespaceType)theEObject;
				T result = caseNamespaceType(namespaceType);
				if (result == null) result = caseComplexObjectType(namespaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PROPERTY_OBJECT_TYPE: {
				PropertyObjectType propertyObjectType = (PropertyObjectType)theEObject;
				T result = casePropertyObjectType(propertyObjectType);
				if (result == null) result = caseComplexObjectType(propertyObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.QNAME: {
				QName qName = (QName)theEObject;
				T result = caseQName(qName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_CONTAINS_PROPERTY_TYPE: {
				TypeContainsPropertyType typeContainsPropertyType = (TypeContainsPropertyType)theEObject;
				T result = caseTypeContainsPropertyType(typeContainsPropertyType);
				if (result == null) result = caseComplexObjectType(typeContainsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_CONTENT_STYLE_CODE_TYPE: {
				TypeContentStyleCodeType typeContentStyleCodeType = (TypeContentStyleCodeType)theEObject;
				T result = caseTypeContentStyleCodeType(typeContentStyleCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_OBJECT_TYPE: {
				TypeObjectType typeObjectType = (TypeObjectType)theEObject;
				T result = caseTypeObjectType(typeObjectType);
				if (result == null) result = caseComplexObjectType(typeObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_SIMPLE_STYLE_CODE_TYPE: {
				TypeSimpleStyleCodeType typeSimpleStyleCodeType = (TypeSimpleStyleCodeType)theEObject;
				T result = caseTypeSimpleStyleCodeType(typeSimpleStyleCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Category Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Category Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetCategoryCodeType(FacetCategoryCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacetType(FacetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceType(NamespaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyObjectType(PropertyObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QName</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QName</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQName(QName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Contains Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Contains Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContainsPropertyType(TypeContainsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Content Style Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Content Style Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeContentStyleCodeType(TypeContentStyleCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeObjectType(TypeObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Simple Style Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Simple Style Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSimpleStyleCodeType(TypeSimpleStyleCodeType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Complex Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexObjectType(ComplexObjectType object) {
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

} //_1Switch
