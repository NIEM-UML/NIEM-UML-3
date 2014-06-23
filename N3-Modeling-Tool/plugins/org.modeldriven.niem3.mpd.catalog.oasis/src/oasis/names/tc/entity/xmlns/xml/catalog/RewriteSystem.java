/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewrite System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getId <em>Id</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getRewritePrefix <em>Rewrite Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getSystemIdStartString <em>System Id Start String</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getRewriteSystem()
 * @model extendedMetaData="name='rewriteSystem' kind='empty'"
 * @generated
 */
public interface RewriteSystem extends EObject {
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
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getRewriteSystem_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rewrite Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite Prefix</em>' attribute.
	 * @see #setRewritePrefix(String)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getRewriteSystem_RewritePrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='rewritePrefix'"
	 * @generated
	 */
	String getRewritePrefix();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getRewritePrefix <em>Rewrite Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite Prefix</em>' attribute.
	 * @see #getRewritePrefix()
	 * @generated
	 */
	void setRewritePrefix(String value);

	/**
	 * Returns the value of the '<em><b>System Id Start String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Id Start String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Id Start String</em>' attribute.
	 * @see #setSystemIdStartString(String)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getRewriteSystem_SystemIdStartString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='systemIdStartString'"
	 * @generated
	 */
	String getSystemIdStartString();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem#getSystemIdStartString <em>System Id Start String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Id Start String</em>' attribute.
	 * @see #getSystemIdStartString()
	 * @generated
	 */
	void setSystemIdStartString(String value);

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
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getRewriteSystem_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RewriteSystem
