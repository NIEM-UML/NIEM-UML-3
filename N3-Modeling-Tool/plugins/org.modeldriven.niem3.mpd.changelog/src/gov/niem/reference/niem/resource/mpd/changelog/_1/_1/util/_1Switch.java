/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.util;

import gov.niem.niem.structures._2.ComplexObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.*;

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
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package
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
			case _1Package.CHANGE_CODE_TYPE: {
				ChangeCodeType changeCodeType = (ChangeCodeType)theEObject;
				T result = caseChangeCodeType(changeCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHANGE_INFORMATION_TYPE: {
				ChangeInformationType changeInformationType = (ChangeInformationType)theEObject;
				T result = caseChangeInformationType(changeInformationType);
				if (result == null) result = caseComplexObjectType(changeInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHANGE_LOG_ENTRY_TYPE: {
				ChangeLogEntryType changeLogEntryType = (ChangeLogEntryType)theEObject;
				T result = caseChangeLogEntryType(changeLogEntryType);
				if (result == null) result = caseComplexObjectType(changeLogEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHANGE_LOG_TYPE: {
				ChangeLogType changeLogType = (ChangeLogType)theEObject;
				T result = caseChangeLogType(changeLogType);
				if (result == null) result = caseComplexObjectType(changeLogType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODIFIED_FACET_ENTRY_TYPE: {
				ModifiedFacetEntryType modifiedFacetEntryType = (ModifiedFacetEntryType)theEObject;
				T result = caseModifiedFacetEntryType(modifiedFacetEntryType);
				if (result == null) result = caseChangeLogEntryType(modifiedFacetEntryType);
				if (result == null) result = caseComplexObjectType(modifiedFacetEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODIFIED_NAMESPACE_ENTRY_TYPE: {
				ModifiedNamespaceEntryType modifiedNamespaceEntryType = (ModifiedNamespaceEntryType)theEObject;
				T result = caseModifiedNamespaceEntryType(modifiedNamespaceEntryType);
				if (result == null) result = caseChangeLogEntryType(modifiedNamespaceEntryType);
				if (result == null) result = caseComplexObjectType(modifiedNamespaceEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODIFIED_PROPERTY_ENTRY_TYPE: {
				ModifiedPropertyEntryType modifiedPropertyEntryType = (ModifiedPropertyEntryType)theEObject;
				T result = caseModifiedPropertyEntryType(modifiedPropertyEntryType);
				if (result == null) result = caseChangeLogEntryType(modifiedPropertyEntryType);
				if (result == null) result = caseComplexObjectType(modifiedPropertyEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODIFIED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE: {
				ModifiedTypeContainsPropertyEntryType modifiedTypeContainsPropertyEntryType = (ModifiedTypeContainsPropertyEntryType)theEObject;
				T result = caseModifiedTypeContainsPropertyEntryType(modifiedTypeContainsPropertyEntryType);
				if (result == null) result = caseChangeLogEntryType(modifiedTypeContainsPropertyEntryType);
				if (result == null) result = caseComplexObjectType(modifiedTypeContainsPropertyEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODIFIED_TYPE_ENTRY_TYPE: {
				ModifiedTypeEntryType modifiedTypeEntryType = (ModifiedTypeEntryType)theEObject;
				T result = caseModifiedTypeEntryType(modifiedTypeEntryType);
				if (result == null) result = caseChangeLogEntryType(modifiedTypeEntryType);
				if (result == null) result = caseComplexObjectType(modifiedTypeEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NEW_FACET_ENTRY_TYPE: {
				NewFacetEntryType newFacetEntryType = (NewFacetEntryType)theEObject;
				T result = caseNewFacetEntryType(newFacetEntryType);
				if (result == null) result = caseChangeLogEntryType(newFacetEntryType);
				if (result == null) result = caseComplexObjectType(newFacetEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NEW_NAMESPACE_ENTRY_TYPE: {
				NewNamespaceEntryType newNamespaceEntryType = (NewNamespaceEntryType)theEObject;
				T result = caseNewNamespaceEntryType(newNamespaceEntryType);
				if (result == null) result = caseChangeLogEntryType(newNamespaceEntryType);
				if (result == null) result = caseComplexObjectType(newNamespaceEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NEW_PROPERTY_ENTRY_TYPE: {
				NewPropertyEntryType newPropertyEntryType = (NewPropertyEntryType)theEObject;
				T result = caseNewPropertyEntryType(newPropertyEntryType);
				if (result == null) result = caseChangeLogEntryType(newPropertyEntryType);
				if (result == null) result = caseComplexObjectType(newPropertyEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NEW_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE: {
				NewTypeContainsPropertyEntryType newTypeContainsPropertyEntryType = (NewTypeContainsPropertyEntryType)theEObject;
				T result = caseNewTypeContainsPropertyEntryType(newTypeContainsPropertyEntryType);
				if (result == null) result = caseChangeLogEntryType(newTypeContainsPropertyEntryType);
				if (result == null) result = caseComplexObjectType(newTypeContainsPropertyEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NEW_TYPE_ENTRY_TYPE: {
				NewTypeEntryType newTypeEntryType = (NewTypeEntryType)theEObject;
				T result = caseNewTypeEntryType(newTypeEntryType);
				if (result == null) result = caseChangeLogEntryType(newTypeEntryType);
				if (result == null) result = caseComplexObjectType(newTypeEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMOVED_FACET_ENTRY_TYPE: {
				RemovedFacetEntryType removedFacetEntryType = (RemovedFacetEntryType)theEObject;
				T result = caseRemovedFacetEntryType(removedFacetEntryType);
				if (result == null) result = caseChangeLogEntryType(removedFacetEntryType);
				if (result == null) result = caseComplexObjectType(removedFacetEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMOVED_NAMESPACE_ENTRY_TYPE: {
				RemovedNamespaceEntryType removedNamespaceEntryType = (RemovedNamespaceEntryType)theEObject;
				T result = caseRemovedNamespaceEntryType(removedNamespaceEntryType);
				if (result == null) result = caseChangeLogEntryType(removedNamespaceEntryType);
				if (result == null) result = caseComplexObjectType(removedNamespaceEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMOVED_PROPERTY_ENTRY_TYPE: {
				RemovedPropertyEntryType removedPropertyEntryType = (RemovedPropertyEntryType)theEObject;
				T result = caseRemovedPropertyEntryType(removedPropertyEntryType);
				if (result == null) result = caseChangeLogEntryType(removedPropertyEntryType);
				if (result == null) result = caseComplexObjectType(removedPropertyEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMOVED_TYPE_CONTAINS_PROPERTY_ENTRY_TYPE: {
				RemovedTypeContainsPropertyEntryType removedTypeContainsPropertyEntryType = (RemovedTypeContainsPropertyEntryType)theEObject;
				T result = caseRemovedTypeContainsPropertyEntryType(removedTypeContainsPropertyEntryType);
				if (result == null) result = caseChangeLogEntryType(removedTypeContainsPropertyEntryType);
				if (result == null) result = caseComplexObjectType(removedTypeContainsPropertyEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMOVED_TYPE_ENTRY_TYPE: {
				RemovedTypeEntryType removedTypeEntryType = (RemovedTypeEntryType)theEObject;
				T result = caseRemovedTypeEntryType(removedTypeEntryType);
				if (result == null) result = caseChangeLogEntryType(removedTypeEntryType);
				if (result == null) result = caseComplexObjectType(removedTypeEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeCodeType(ChangeCodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeInformationType(ChangeInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Log Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Log Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeLogEntryType(ChangeLogEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Log Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Log Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeLogType(ChangeLogType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Modified Facet Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modified Facet Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiedFacetEntryType(ModifiedFacetEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modified Namespace Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modified Namespace Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiedNamespaceEntryType(ModifiedNamespaceEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modified Property Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modified Property Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiedPropertyEntryType(ModifiedPropertyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modified Type Contains Property Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modified Type Contains Property Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiedTypeContainsPropertyEntryType(ModifiedTypeContainsPropertyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modified Type Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modified Type Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiedTypeEntryType(ModifiedTypeEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Facet Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Facet Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewFacetEntryType(NewFacetEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Namespace Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Namespace Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewNamespaceEntryType(NewNamespaceEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Property Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Property Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewPropertyEntryType(NewPropertyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Type Contains Property Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Type Contains Property Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewTypeContainsPropertyEntryType(NewTypeContainsPropertyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Type Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Type Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewTypeEntryType(NewTypeEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removed Facet Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removed Facet Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovedFacetEntryType(RemovedFacetEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removed Namespace Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removed Namespace Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovedNamespaceEntryType(RemovedNamespaceEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removed Property Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removed Property Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovedPropertyEntryType(RemovedPropertyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removed Type Contains Property Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removed Type Contains Property Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovedTypeContainsPropertyEntryType(RemovedTypeContainsPropertyEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removed Type Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removed Type Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovedTypeEntryType(RemovedTypeEntryType object) {
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
