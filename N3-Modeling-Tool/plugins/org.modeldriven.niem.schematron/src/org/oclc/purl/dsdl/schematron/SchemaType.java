/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getNs <em>Ns</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getP <em>P</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getP1 <em>P1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getDefaultPhase <em>Default Phase</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getQueryBinding <em>Query Binding</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.SchemaType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType()
 * @model extendedMetaData="name='schema_._type' kind='elementOnly'"
 * @generated
 */
public interface SchemaType extends EObject {
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='skip' group='#group:0'"
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Any1()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##local' name=':2' processing='skip' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny1();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.IncludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Include()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IncludeType> getInclude();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.TitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleType> getTitle();

	/**
	 * Returns the value of the '<em><b>Ns</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.NsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Ns()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ns' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NsType> getNs();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>Let</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.LetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Let()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='let' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LetType> getLet();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.PhaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Phase()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phase' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PhaseType> getPhase();

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.PatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Pattern()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pattern' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PatternType> getPattern();

	/**
	 * Returns the value of the '<em><b>P1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_P1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PType> getP1();

	/**
	 * Returns the value of the '<em><b>Diagnostics</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.DiagnosticsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostics</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Diagnostics()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagnostics' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DiagnosticsType> getDiagnostics();

	/**
	 * Returns the value of the '<em><b>Default Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Phase</em>' attribute.
	 * @see #setDefaultPhase(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_DefaultPhase()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='defaultPhase'"
	 * @generated
	 */
	String getDefaultPhase();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getDefaultPhase <em>Default Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Phase</em>' attribute.
	 * @see #getDefaultPhase()
	 * @generated
	 */
	void setDefaultPhase(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Fpi()
	 * @model dataType="org.oclc.purl.dsdl.schematron.FpiValue"
	 *        extendedMetaData="kind='attribute' name='fpi'"
	 * @generated
	 */
	String getFpi();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getFpi <em>Fpi</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Icon()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getIcon <em>Icon</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getId <em>Id</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Lang()
	 * @model dataType="org.oclc.purl.dsdl.schematron.LangValue"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Query Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Binding</em>' attribute.
	 * @see #setQueryBinding(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_QueryBinding()
	 * @model dataType="org.oclc.purl.dsdl.schematron.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='queryBinding'"
	 * @generated
	 */
	String getQueryBinding();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getQueryBinding <em>Query Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Binding</em>' attribute.
	 * @see #getQueryBinding()
	 * @generated
	 */
	void setQueryBinding(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #setSchemaVersion(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_SchemaVersion()
	 * @model dataType="org.oclc.purl.dsdl.schematron.NonEmptyString"
	 *        extendedMetaData="kind='attribute' name='schemaVersion'"
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_See()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='see'"
	 * @generated
	 */
	String getSee();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSee <em>See</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_Space()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSpace <em>Space</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.SchemaType#getSpace <em>Space</em>}' attribute is set.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getSchemaType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':21' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SchemaType
