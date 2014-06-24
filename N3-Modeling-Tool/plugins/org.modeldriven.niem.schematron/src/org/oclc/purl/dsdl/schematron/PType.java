/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType()
 * @model extendedMetaData="name='p_._type' kind='mixed'"
 * @generated
 */
public interface PType extends EObject {
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='skip' group='#group:1'"
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':3' processing='skip' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.DirType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Dir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dir' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DirType> getDir();

	/**
	 * Returns the value of the '<em><b>Emph</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emph</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emph</em>' attribute list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Emph()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emph' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getEmph();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.SpanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Class()
	 * @model dataType="org.oclc.purl.dsdl.schematron.ClassValue"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Icon()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PType#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':10' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PType
