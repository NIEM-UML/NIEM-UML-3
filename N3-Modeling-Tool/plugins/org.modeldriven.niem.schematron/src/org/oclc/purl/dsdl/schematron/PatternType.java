/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getP <em>P</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getRule <em>Rule</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getTitle1 <em>Title1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getP1 <em>P1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getLet1 <em>Let1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getRule1 <em>Rule1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getTitle2 <em>Title2</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getP2 <em>P2</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getParam <em>Param</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getIsA <em>Is A</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.PatternType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType()
 * @model extendedMetaData="name='pattern_._type' kind='elementOnly'"
 * @generated
 */
public interface PatternType extends EObject {
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Group()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Any()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Any1()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Include()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Title()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleType> getTitle();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_P()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Let()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='let' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LetType> getLet();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Rule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RuleType> getRule();

	/**
	 * Returns the value of the '<em><b>Title1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.TitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Title1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleType> getTitle1();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_P1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PType> getP1();

	/**
	 * Returns the value of the '<em><b>Let1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.LetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Let1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='let' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LetType> getLet1();

	/**
	 * Returns the value of the '<em><b>Rule1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Rule1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RuleType> getRule1();

	/**
	 * Returns the value of the '<em><b>Title2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.TitleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title2</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Title2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TitleType> getTitle2();

	/**
	 * Returns the value of the '<em><b>P2</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P2</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_P2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PType> getP2();

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.ParamType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Param()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ParamType> getParam();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oclc.purl.dsdl.schematron.AbstractType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(AbstractType)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Abstract()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	AbstractType getAbstract();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType value);

	/**
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(AbstractType)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(AbstractType)
	 * @generated
	 */
	boolean isSetAbstract();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Fpi()
	 * @model dataType="org.oclc.purl.dsdl.schematron.FpiValue"
	 *        extendedMetaData="kind='attribute' name='fpi'"
	 * @generated
	 */
	String getFpi();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getFpi <em>Fpi</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Icon()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getIcon <em>Icon</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A</em>' attribute.
	 * @see #setIsA(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_IsA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='is-a'"
	 * @generated
	 */
	String getIsA();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getIsA <em>Is A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A</em>' attribute.
	 * @see #getIsA()
	 * @generated
	 */
	void setIsA(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Lang()
	 * @model dataType="org.oclc.purl.dsdl.schematron.LangValue"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getLang <em>Lang</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_See()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='see'"
	 * @generated
	 */
	String getSee();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getSee <em>See</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_Space()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getSpace <em>Space</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.PatternType#getSpace <em>Space</em>}' attribute is set.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getPatternType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':23' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PatternType
