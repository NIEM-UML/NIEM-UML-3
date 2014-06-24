/**
 */
package org.oclc.purl.dsdl.schematron;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getAny <em>Any</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getAny1 <em>Any1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getInclude <em>Include</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getLet <em>Let</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getReport <em>Report</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getLet1 <em>Let1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getAssert1 <em>Assert1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getReport1 <em>Report1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getExtends1 <em>Extends1</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getContext <em>Context</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getFpi <em>Fpi</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getId <em>Id</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getRole <em>Role</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getSee <em>See</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.oclc.purl.dsdl.schematron.RuleType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType()
 * @model extendedMetaData="name='rule_._type' kind='elementOnly'"
 * @generated
 */
public interface RuleType extends EObject {
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Group()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Any()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Any1()
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Include()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='include' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<IncludeType> getInclude();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Let()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='let' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LetType> getLet();

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.AssertType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Assert()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AssertType> getAssert();

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.ReportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Report()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReportType> getReport();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.ExtendsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Extends()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extends' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExtendsType> getExtends();

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Let1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='let' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LetType> getLet1();

	/**
	 * Returns the value of the '<em><b>Assert1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.AssertType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assert1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assert1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Assert1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AssertType> getAssert1();

	/**
	 * Returns the value of the '<em><b>Report1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.ReportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Report1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='report' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReportType> getReport1();

	/**
	 * Returns the value of the '<em><b>Extends1</b></em>' containment reference list.
	 * The list contents are of type {@link org.oclc.purl.dsdl.schematron.ExtendsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends1</em>' containment reference list.
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Extends1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extends' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExtendsType> getExtends1();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The literals are from the enumeration {@link org.oclc.purl.dsdl.schematron.AbstractType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType1
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(AbstractType1)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Abstract()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	AbstractType1 getAbstract();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see org.oclc.purl.dsdl.schematron.AbstractType1
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType1 value);

	/**
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(AbstractType1)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(AbstractType1)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Context()
	 * @model dataType="org.oclc.purl.dsdl.schematron.PathValue"
	 *        extendedMetaData="kind='attribute' name='context'"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' attribute.
	 * @see #setFlag(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Flag()
	 * @model dataType="org.oclc.purl.dsdl.schematron.FlagValue"
	 *        extendedMetaData="kind='attribute' name='flag'"
	 * @generated
	 */
	String getFlag();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getFlag <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' attribute.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Fpi()
	 * @model dataType="org.oclc.purl.dsdl.schematron.FpiValue"
	 *        extendedMetaData="kind='attribute' name='fpi'"
	 * @generated
	 */
	String getFpi();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getFpi <em>Fpi</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Icon()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='icon'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getIcon <em>Icon</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getId <em>Id</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Lang()
	 * @model dataType="org.oclc.purl.dsdl.schematron.LangValue"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Role()
	 * @model dataType="org.oclc.purl.dsdl.schematron.RoleValue"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_See()
	 * @model dataType="org.oclc.purl.dsdl.schematron.UriValue"
	 *        extendedMetaData="kind='attribute' name='see'"
	 * @generated
	 */
	String getSee();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getSee <em>See</em>}' attribute.
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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Space()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getSpace <em>Space</em>}' attribute.
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
	 * Unsets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getSpace <em>Space</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_Subject()
	 * @model dataType="org.oclc.purl.dsdl.schematron.PathValue"
	 *        extendedMetaData="kind='attribute' name='subject'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.oclc.purl.dsdl.schematron.RuleType#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

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
	 * @see org.oclc.purl.dsdl.schematron.SchematronPackage#getRuleType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='!##http://www.w3.org/XML/1998/namespace' name=':23' processing='skip'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // RuleType
