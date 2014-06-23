/**
 */
package gov.niem.niem.wantlist._2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gov.niem.niem.wantlist._2.wantlistPackage
 * @generated
 */
public interface wantlistFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	wantlistFactory eINSTANCE = gov.niem.niem.wantlist._2.impl.wantlistFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute In Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute In Type Type</em>'.
	 * @generated
	 */
	AttributeInTypeType createAttributeInTypeType();

	/**
	 * Returns a new object of class '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Type</em>'.
	 * @generated
	 */
	AttributeType createAttributeType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Element In Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element In Type Type</em>'.
	 * @generated
	 */
	ElementInTypeType createElementInTypeType();

	/**
	 * Returns a new object of class '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Type</em>'.
	 * @generated
	 */
	ElementType createElementType();

	/**
	 * Returns a new object of class '<em>Facet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facet Type</em>'.
	 * @generated
	 */
	FacetType createFacetType();

	/**
	 * Returns a new object of class '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Type</em>'.
	 * @generated
	 */
	TypeType createTypeType();

	/**
	 * Returns a new object of class '<em>Union Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Member Type</em>'.
	 * @generated
	 */
	UnionMemberType createUnionMemberType();

	/**
	 * Returns a new object of class '<em>Want List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Want List Type</em>'.
	 * @generated
	 */
	WantListType createWantListType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	wantlistPackage getwantlistPackage();

} //wantlistFactory
