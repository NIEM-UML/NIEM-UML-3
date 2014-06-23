/**
 */
package gov.niem.reference.niem.resource.model._1._1.util;

import gov.niem.niem.structures._2.ComplexObjectType;

import gov.niem.reference.niem.resource.model._1._1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.reference.niem.resource.model._1._1._1Package
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
			public Adapter caseFacetCategoryCodeType(FacetCategoryCodeType object) {
				return createFacetCategoryCodeTypeAdapter();
			}
			@Override
			public Adapter caseFacetType(FacetType object) {
				return createFacetTypeAdapter();
			}
			@Override
			public Adapter caseNamespaceType(NamespaceType object) {
				return createNamespaceTypeAdapter();
			}
			@Override
			public Adapter casePropertyObjectType(PropertyObjectType object) {
				return createPropertyObjectTypeAdapter();
			}
			@Override
			public Adapter caseQName(QName object) {
				return createQNameAdapter();
			}
			@Override
			public Adapter caseTypeContainsPropertyType(TypeContainsPropertyType object) {
				return createTypeContainsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTypeContentStyleCodeType(TypeContentStyleCodeType object) {
				return createTypeContentStyleCodeTypeAdapter();
			}
			@Override
			public Adapter caseTypeObjectType(TypeObjectType object) {
				return createTypeObjectTypeAdapter();
			}
			@Override
			public Adapter caseTypeSimpleStyleCodeType(TypeSimpleStyleCodeType object) {
				return createTypeSimpleStyleCodeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
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
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType <em>Facet Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType
	 * @generated
	 */
	public Adapter createFacetCategoryCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.FacetType <em>Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.FacetType
	 * @generated
	 */
	public Adapter createFacetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.NamespaceType <em>Namespace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.NamespaceType
	 * @generated
	 */
	public Adapter createNamespaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.PropertyObjectType <em>Property Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.PropertyObjectType
	 * @generated
	 */
	public Adapter createPropertyObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.QName <em>QName</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.QName
	 * @generated
	 */
	public Adapter createQNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType <em>Type Contains Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType
	 * @generated
	 */
	public Adapter createTypeContainsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType <em>Type Content Style Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType
	 * @generated
	 */
	public Adapter createTypeContentStyleCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.TypeObjectType <em>Type Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeObjectType
	 * @generated
	 */
	public Adapter createTypeObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType <em>Type Simple Style Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType
	 * @generated
	 */
	public Adapter createTypeSimpleStyleCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.niem.reference.niem.resource.model._1._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.niem.reference.niem.resource.model._1._1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
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
