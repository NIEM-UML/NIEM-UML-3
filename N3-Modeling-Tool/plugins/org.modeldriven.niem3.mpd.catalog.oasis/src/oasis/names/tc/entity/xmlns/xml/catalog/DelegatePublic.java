/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegate Public</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getId <em>Id</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getPublicIdStartString <em>Public Id Start String</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDelegatePublic()
 * @model extendedMetaData="name='delegatePublic' kind='empty'"
 * @generated
 */
public interface DelegatePublic extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDelegatePublic_Catalog()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='catalog'"
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDelegatePublic_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Public Id Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Id Start String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Id Start String</em>' attribute.
	 * @see #setPublicIdStartString(String)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDelegatePublic_PublicIdStartString()
	 * @model dataType="oasis.names.tc.entity.xmlns.xml.catalog.PartialPublicIdentifier" required="true"
	 *        extendedMetaData="kind='attribute' name='publicIdStartString'"
	 * @generated
	 */
	String getPublicIdStartString();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic#getPublicIdStartString <em>Public Id Start String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Id Start String</em>' attribute.
	 * @see #getPublicIdStartString()
	 * @generated
	 */
	void setPublicIdStartString(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDelegatePublic_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DelegatePublic
