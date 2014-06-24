/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.IncludeType#getHref <em>Href</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getIncludeType()
 * @model extendedMetaData="name='include_._type' kind='empty'"
 * @generated
 */
public interface IncludeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getIncludeType_Href()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue" required="true"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.IncludeType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

} // IncludeType
