/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.util;

import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI;
import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Group;
import oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Public;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage
 * @generated
 */
public class CatalogAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CatalogPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CatalogPackage.eINSTANCE;
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
	protected CatalogSwitch<Adapter> modelSwitch =
		new CatalogSwitch<Adapter>() {
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseDelegatePublic(DelegatePublic object) {
				return createDelegatePublicAdapter();
			}
			@Override
			public Adapter caseDelegateSystem(DelegateSystem object) {
				return createDelegateSystemAdapter();
			}
			@Override
			public Adapter caseDelegateURI(DelegateURI object) {
				return createDelegateURIAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseNextCatalog(NextCatalog object) {
				return createNextCatalogAdapter();
			}
			@Override
			public Adapter casePublic(Public object) {
				return createPublicAdapter();
			}
			@Override
			public Adapter caseRewriteSystem(RewriteSystem object) {
				return createRewriteSystemAdapter();
			}
			@Override
			public Adapter caseRewriteURI(RewriteURI object) {
				return createRewriteURIAdapter();
			}
			@Override
			public Adapter caseSystem(oasis.names.tc.entity.xmlns.xml.catalog.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseUri(Uri object) {
				return createUriAdapter();
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
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic <em>Delegate Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic
	 * @generated
	 */
	public Adapter createDelegatePublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem <em>Delegate System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem
	 * @generated
	 */
	public Adapter createDelegateSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI <em>Delegate URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI
	 * @generated
	 */
	public Adapter createDelegateURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog <em>Next Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog
	 * @generated
	 */
	public Adapter createNextCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Public <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Public
	 * @generated
	 */
	public Adapter createPublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem <em>Rewrite System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem
	 * @generated
	 */
	public Adapter createRewriteSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI <em>Rewrite URI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI
	 * @generated
	 */
	public Adapter createRewriteURIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link oasis.names.tc.entity.xmlns.xml.catalog.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.Uri
	 * @generated
	 */
	public Adapter createUriAdapter() {
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

} //CatalogAdapterFactory
