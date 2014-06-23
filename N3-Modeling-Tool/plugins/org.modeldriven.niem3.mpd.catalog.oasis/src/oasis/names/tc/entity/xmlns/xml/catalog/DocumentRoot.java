/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegatePublic <em>Delegate Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateSystem <em>Delegate System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateURI <em>Delegate URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getNextCatalog <em>Next Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getPublic <em>Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteSystem <em>Rewrite System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteURI <em>Rewrite URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getSystem <em>System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(Catalog)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_Catalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalog getCatalog();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog value);

	/**
	 * Returns the value of the '<em><b>Delegate Public</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Public</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Public</em>' containment reference.
	 * @see #setDelegatePublic(DelegatePublic)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_DelegatePublic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delegatePublic' namespace='##targetNamespace'"
	 * @generated
	 */
	DelegatePublic getDelegatePublic();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegatePublic <em>Delegate Public</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Public</em>' containment reference.
	 * @see #getDelegatePublic()
	 * @generated
	 */
	void setDelegatePublic(DelegatePublic value);

	/**
	 * Returns the value of the '<em><b>Delegate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate System</em>' containment reference.
	 * @see #setDelegateSystem(DelegateSystem)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_DelegateSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delegateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	DelegateSystem getDelegateSystem();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateSystem <em>Delegate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate System</em>' containment reference.
	 * @see #getDelegateSystem()
	 * @generated
	 */
	void setDelegateSystem(DelegateSystem value);

	/**
	 * Returns the value of the '<em><b>Delegate URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate URI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate URI</em>' containment reference.
	 * @see #setDelegateURI(DelegateURI)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_DelegateURI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delegateURI' namespace='##targetNamespace'"
	 * @generated
	 */
	DelegateURI getDelegateURI();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getDelegateURI <em>Delegate URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate URI</em>' containment reference.
	 * @see #getDelegateURI()
	 * @generated
	 */
	void setDelegateURI(DelegateURI value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Next Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Catalog</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Catalog</em>' containment reference.
	 * @see #setNextCatalog(NextCatalog)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_NextCatalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nextCatalog' namespace='##targetNamespace'"
	 * @generated
	 */
	NextCatalog getNextCatalog();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getNextCatalog <em>Next Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Catalog</em>' containment reference.
	 * @see #getNextCatalog()
	 * @generated
	 */
	void setNextCatalog(NextCatalog value);

	/**
	 * Returns the value of the '<em><b>Public</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' containment reference.
	 * @see #setPublic(Public)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_Public()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='public' namespace='##targetNamespace'"
	 * @generated
	 */
	Public getPublic();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getPublic <em>Public</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' containment reference.
	 * @see #getPublic()
	 * @generated
	 */
	void setPublic(Public value);

	/**
	 * Returns the value of the '<em><b>Rewrite System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite System</em>' containment reference.
	 * @see #setRewriteSystem(RewriteSystem)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_RewriteSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rewriteSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	RewriteSystem getRewriteSystem();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteSystem <em>Rewrite System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite System</em>' containment reference.
	 * @see #getRewriteSystem()
	 * @generated
	 */
	void setRewriteSystem(RewriteSystem value);

	/**
	 * Returns the value of the '<em><b>Rewrite URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite URI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite URI</em>' containment reference.
	 * @see #setRewriteURI(RewriteURI)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_RewriteURI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rewriteURI' namespace='##targetNamespace'"
	 * @generated
	 */
	RewriteURI getRewriteURI();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getRewriteURI <em>Rewrite URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewrite URI</em>' containment reference.
	 * @see #getRewriteURI()
	 * @generated
	 */
	void setRewriteURI(RewriteURI value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(oasis.names.tc.entity.xmlns.xml.catalog.System)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_System()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace'"
	 * @generated
	 */
	oasis.names.tc.entity.xmlns.xml.catalog.System getSystem();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(oasis.names.tc.entity.xmlns.xml.catalog.System value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference.
	 * @see #setUri(Uri)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getDocumentRoot_Uri()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUri();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot#getUri <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' containment reference.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Uri value);

} // DocumentRoot
