/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Of Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.ValueOfType#getSelect <em>Select</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.ValueOfType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getValueOfType()
 * @model extendedMetaData="name='value-of_._type' kind='empty'"
 * @generated
 */
public interface ValueOfType extends EObject {
	/**
	 * Returns the value of the '<em><b>Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' attribute.
	 * @see #setSelect(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getValueOfType_Select()
	 * @model dataType="org.oclc.purl.dsdl.schematron.PathValue" required="true"
	 *        extendedMetaData="kind='attribute' name='select'"
	 * @generated
	 */
	String getSelect();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.ValueOfType#getSelect <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' attribute.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getValueOfType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':1' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ValueOfType
