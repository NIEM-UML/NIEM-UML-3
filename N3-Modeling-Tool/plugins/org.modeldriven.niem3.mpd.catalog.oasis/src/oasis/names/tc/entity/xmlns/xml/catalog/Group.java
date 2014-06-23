/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getGroup <em>Group</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPublic <em>Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getSystem <em>System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getUri <em>Uri</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getRewriteSystem <em>Rewrite System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getRewriteURI <em>Rewrite URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegatePublic <em>Delegate Public</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegateSystem <em>Delegate System</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getDelegateURI <em>Delegate URI</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getNextCatalog <em>Next Catalog</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getAny <em>Any</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getId <em>Id</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPrefer <em>Prefer</em>}</li>
 *   <li>{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup()
 * @model extendedMetaData="name='group' kind='elementOnly'"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Public</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.Public}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_Public()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='public' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Public> getPublic();

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_System()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='system' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<oasis.names.tc.entity.xmlns.xml.catalog.System> getSystem();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_Uri()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uri' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Uri> getUri();

	/**
	 * Returns the value of the '<em><b>Rewrite System</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite System</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_RewriteSystem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rewriteSystem' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RewriteSystem> getRewriteSystem();

	/**
	 * Returns the value of the '<em><b>Rewrite URI</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewrite URI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewrite URI</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_RewriteURI()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rewriteURI' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RewriteURI> getRewriteURI();

	/**
	 * Returns the value of the '<em><b>Delegate Public</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate Public</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate Public</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_DelegatePublic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delegatePublic' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DelegatePublic> getDelegatePublic();

	/**
	 * Returns the value of the '<em><b>Delegate System</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate System</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_DelegateSystem()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delegateSystem' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DelegateSystem> getDelegateSystem();

	/**
	 * Returns the value of the '<em><b>Delegate URI</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate URI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate URI</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_DelegateURI()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='delegateURI' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DelegateURI> getDelegateURI();

	/**
	 * Returns the value of the '<em><b>Next Catalog</b></em>' containment reference list.
	 * The list contents are of type {@link oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Catalog</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Catalog</em>' containment reference list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_NextCatalog()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='nextCatalog' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NextCatalog> getNextCatalog();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='skip' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

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
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Prefer</b></em>' attribute.
	 * The literals are from the enumeration {@link oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefer</em>' attribute.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
	 * @see #isSetPrefer()
	 * @see #unsetPrefer()
	 * @see #setPrefer(SystemOrPublic)
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_Prefer()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='prefer'"
	 * @generated
	 */
	SystemOrPublic getPrefer();

	/**
	 * Sets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPrefer <em>Prefer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefer</em>' attribute.
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic
	 * @see #isSetPrefer()
	 * @see #unsetPrefer()
	 * @see #getPrefer()
	 * @generated
	 */
	void setPrefer(SystemOrPublic value);

	/**
	 * Unsets the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPrefer <em>Prefer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefer()
	 * @see #getPrefer()
	 * @see #setPrefer(SystemOrPublic)
	 * @generated
	 */
	void unsetPrefer();

	/**
	 * Returns whether the value of the '{@link oasis.names.tc.entity.xmlns.xml.catalog.Group#getPrefer <em>Prefer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefer</em>' attribute is set.
	 * @see #unsetPrefer()
	 * @see #getPrefer()
	 * @see #setPrefer(SystemOrPublic)
	 * @generated
	 */
	boolean isSetPrefer();

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
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#getGroup_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // Group
