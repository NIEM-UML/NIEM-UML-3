/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getValueOf <em>Value Of</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getEmph <em>Emph</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType()
 * @model extendedMetaData="name='diagnostic_._type' kind='mixed'"
 * @generated
 */
public interface DiagnosticType extends EObject {
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Mixed()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Group()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Any()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':3' processing='skip' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Value Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.ValueOfType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_ValueOf()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='value-of' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ValueOfType> getValueOf();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Emph()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emph' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<String> getEmph();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Dir()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dir' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DirType> getDir();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Fpi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fpi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fpi</em>' attribute.
	 * @see #setFpi(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Fpi()
	 * @model dataType="org.oclc.purl.dsdl.schematron.FpiValue"
	 *        extendedMetaData="kind='attribute' name='fpi'"
	 * @generated
	 */
	String getFpi();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getFpi <em>Fpi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpi</em>' attribute.
	 * @see #getFpi()
	 * @generated
	 */
	void setFpi(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Icon()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getIcon <em>Icon</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Lang()
	 * @model dataType="org.oclc.purl.dsdl.schematron.LangValue"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>See</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' attribute.
	 * @see #setSee(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_See()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='see'"
	 * @generated
	 */
	String getSee();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSee <em>See</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See</em>' attribute.
	 * @see #getSee()
	 * @generated
	 */
	void setSee(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecore.xml.namespace.SpaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(SpaceType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_Space()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(SpaceType value);

	/**
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.DiagnosticType#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	boolean isSetSpace();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getDiagnosticType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':14' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DiagnosticType
