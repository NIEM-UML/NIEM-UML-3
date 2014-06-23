/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogFactory eINSTANCE = oasis.names.tc.entity.xmlns.xml.catalog.impl.CatalogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * Returns a new object of class '<em>Delegate Public</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegate Public</em>'.
	 * @generated
	 */
	DelegatePublic createDelegatePublic();

	/**
	 * Returns a new object of class '<em>Delegate System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegate System</em>'.
	 * @generated
	 */
	DelegateSystem createDelegateSystem();

	/**
	 * Returns a new object of class '<em>Delegate URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegate URI</em>'.
	 * @generated
	 */
	DelegateURI createDelegateURI();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Next Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Catalog</em>'.
	 * @generated
	 */
	NextCatalog createNextCatalog();

	/**
	 * Returns a new object of class '<em>Public</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public</em>'.
	 * @generated
	 */
	Public createPublic();

	/**
	 * Returns a new object of class '<em>Rewrite System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rewrite System</em>'.
	 * @generated
	 */
	RewriteSystem createRewriteSystem();

	/**
	 * Returns a new object of class '<em>Rewrite URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rewrite URI</em>'.
	 * @generated
	 */
	RewriteURI createRewriteURI();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Uri</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uri</em>'.
	 * @generated
	 */
	Uri createUri();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogPackage getCatalogPackage();

} //CatalogFactory
