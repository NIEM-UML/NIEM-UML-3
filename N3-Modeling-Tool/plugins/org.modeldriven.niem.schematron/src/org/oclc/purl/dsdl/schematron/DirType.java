/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dir Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DirType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DirType#getForeignElement <em>Foreign Element</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DirType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DirType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DirType#getValue <em>Value</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DirType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType()
 * @model extendedMetaData="name='dir_._type' kind='mixed'"
 * @generated
 */
public interface DirType extends EObject {
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Foreign Element</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Element</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Element</em>' attribute list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType_ForeignElement()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='ForeignElement:1'"
	 * @generated
	 */
	FeatureMap getForeignElement();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='skip' group='#ForeignElement:1'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Any1</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any1</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any1</em>' attribute list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':3' processing='skip' group='#ForeignElement:1'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oclc.purl.dsdl.schematron.ValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.oclc.purl.dsdl.schematron.ValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(ValueType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	ValueType getValue();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DirType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.oclc.purl.dsdl.schematron.ValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueType value);

	/**
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.DirType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(ValueType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.DirType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(ValueType)
	 * @generated
	 */
	boolean isSetValue();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDirType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':5' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DirType
