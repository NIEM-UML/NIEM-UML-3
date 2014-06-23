/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1.util;

import gov.niem.niem.structures._2.ComplexObjectType;

import gov.niem.reference.niem.resource.mpd.changelog._1._1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package
 * @generated
 */
public class _1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
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
	protected _1Switch<Adapter> modelSwitch =
		new _1Switch<Adapter>() {
			@Override
			public Adapter caseChangeCodeType(ChangeCodeType object) {
				return createChangeCodeTypeAdapter();
			}
			@Override
			public Adapter caseChangeInformationType(ChangeInformationType object) {
				return createChangeInformationTypeAdapter();
			}
			@Override
			public Adapter caseChangeLogEntryType(ChangeLogEntryType object) {
				return createChangeLogEntryTypeAdapter();
			}
			@Override
			public Adapter caseChangeLogType(ChangeLogType object) {
				return createChangeLogTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseModifiedFacetEntryType(ModifiedFacetEntryType object) {
				return createModifiedFacetEntryTypeAdapter();
			}
			@Override
			public Adapter caseModifiedNamespaceEntryType(ModifiedNamespaceEntryType object) {
				return createModifiedNamespaceEntryTypeAdapter();
			}
			@Override
			public Adapter caseModifiedPropertyEntryType(ModifiedPropertyEntryType object) {
				return createModifiedPropertyEntryTypeAdapter();
			}
			@Override
			public Adapter caseModifiedTypeContainsPropertyEntryType(ModifiedTypeContainsPropertyEntryType object) {
				return createModifiedTypeContainsPropertyEntryTypeAdapter();
			}
			@Override
			public Adapter caseModifiedTypeEntryType(ModifiedTypeEntryType object) {
				return createModifiedTypeEntryTypeAdapter();
			}
			@Override
			public Adapter caseNewFacetEntryType(NewFacetEntryType object) {
				return createNewFacetEntryTypeAdapter();
			}
			@Override
			public Adapter caseNewNamespaceEntryType(NewNamespaceEntryType object) {
				return createNewNamespaceEntryTypeAdapter();
			}
			@Override
			public Adapter caseNewPropertyEntryType(NewPropertyEntryType object) {
				return createNewPropertyEntryTypeAdapter();
			}
			@Override
			public Adapter caseNewTypeContainsPropertyEntryType(NewTypeContainsPropertyEntryType object) {
				return createNewTypeContainsPropertyEntryTypeAdapter();
			}
			@Override
			public Adapter caseNewTypeEntryType(NewTypeEntryType object) {
				return createNewTypeEntryTypeAdapter();
			}
			@Override
			public Adapter caseRemovedFacetEntryType(RemovedFacetEntryType object) {
				return createRemovedFacetEntryTypeAdapter();
			}
			@Override
			public Adapter caseRemovedNamespaceEntryType(RemovedNamespaceEntryType object) {
				return createRemovedNamespaceEntryTypeAdapter();
			}
			@Override
			public Adapter caseRemovedPropertyEntryType(RemovedPropertyEntryType object) {
				return createRemovedPropertyEntryTypeAdapter();
			}
			@Override
			public Adapter caseRemovedTypeContainsPropertyEntryType(RemovedTypeContainsPropertyEntryType object) {
				return createRemovedTypeContainsPropertyEntryTypeAdapter();
			}
			@Override
			public Adapter caseRemovedTypeEntryType(RemovedTypeEntryType object) {
				return createRemovedTypeEntryTypeAdapter();
			}
			@Override
			public Adapter caseComplexObjectType(ComplexObjectType object) {
				return createComplexObjectTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType <em>Change Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeCodeType
	 * @generated
	 */
	public Adapter createChangeCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType <em>Change Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeInformationType
	 * @generated
	 */
	public Adapter createChangeInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType <em>Change Log Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogEntryType
	 * @generated
	 */
	public Adapter createChangeLogEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType <em>Change Log Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ChangeLogType
	 * @generated
	 */
	public Adapter createChangeLogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType <em>Modified Facet Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType
	 * @generated
	 */
	public Adapter createModifiedFacetEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType <em>Modified Namespace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedNamespaceEntryType
	 * @generated
	 */
	public Adapter createModifiedNamespaceEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType <em>Modified Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedPropertyEntryType
	 * @generated
	 */
	public Adapter createModifiedPropertyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType <em>Modified Type Contains Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeContainsPropertyEntryType
	 * @generated
	 */
	public Adapter createModifiedTypeContainsPropertyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType <em>Modified Type Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedTypeEntryType
	 * @generated
	 */
	public Adapter createModifiedTypeEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType <em>New Facet Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType
	 * @generated
	 */
	public Adapter createNewFacetEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType <em>New Namespace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewNamespaceEntryType
	 * @generated
	 */
	public Adapter createNewNamespaceEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType <em>New Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewPropertyEntryType
	 * @generated
	 */
	public Adapter createNewPropertyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType <em>New Type Contains Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeContainsPropertyEntryType
	 * @generated
	 */
	public Adapter createNewTypeContainsPropertyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType <em>New Type Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.NewTypeEntryType
	 * @generated
	 */
	public Adapter createNewTypeEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType <em>Removed Facet Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType
	 * @generated
	 */
	public Adapter createRemovedFacetEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType <em>Removed Namespace Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedNamespaceEntryType
	 * @generated
	 */
	public Adapter createRemovedNamespaceEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType <em>Removed Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedPropertyEntryType
	 * @generated
	 */
	public Adapter createRemovedPropertyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType <em>Removed Type Contains Property Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeContainsPropertyEntryType
	 * @generated
	 */
	public Adapter createRemovedTypeContainsPropertyEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType <em>Removed Type Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedTypeEntryType
	 * @generated
	 */
	public Adapter createRemovedTypeEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.niem.structures._2.ComplexObjectType <em>Complex Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.niem.structures._2.ComplexObjectType
	 * @generated
	 */
	public Adapter createComplexObjectTypeAdapter() {
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

} //_1AdapterFactory
