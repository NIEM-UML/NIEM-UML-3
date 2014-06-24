/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.NsType#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.NsType#getUri <em>Uri</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.NsType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getNsType()
 * @model extendedMetaData="name='ns_._type' kind='empty'"
 * @generated
 */
public interface NsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getNsType_Prefix()
	 * @model dataType="org.oclc.purl.dsdl.schematron.NameValue" required="true"
	 *        extendedMetaData="kind='attribute' name='prefix'"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.NsType#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getNsType_Uri()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue" required="true"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.NsType#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getNsType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':2' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // NsType
