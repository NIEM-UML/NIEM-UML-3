/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0;

import gov.niem.release.niem.niem.core._3._0.TextType;

import gov.niem.release.niem.structures._3._0.ObjectType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validity Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for a rule or instructions for validating an IEP candidate within context defined by an XPath expression.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getValidityConstraintGroup <em>Validity Constraint Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getValidityConstraint <em>Validity Constraint</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getXPathText <em>XPath Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getValidityContextType()
 * @model extendedMetaData="name='ValidityContextType' kind='elementOnly'"
 * @generated
 */
public interface ValidityContextType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getValidityContextType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Text</em>' containment reference.
	 * @see #isSetDescriptionText()
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @generated
	 */
	void setDescriptionText(TextType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getDescriptionText <em>Description Text</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description Text</em>' containment reference is set.
	 * @see #unsetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	boolean isSetDescriptionText();

	/**
	 * Returns the value of the '<em><b>Validity Constraint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a rule or instructions for validating an IEP candidate.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Constraint Group</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getValidityContextType_ValidityConstraintGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='ValidityConstraint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getValidityConstraintGroup();

	/**
	 * Returns the value of the '<em><b>Validity Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a rule or instructions for validating an IEP candidate.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Constraint</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getValidityContextType_ValidityConstraint()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidityConstraint' namespace='##targetNamespace' group='ValidityConstraint:group'"
	 * @generated
	 */
	EList<EObject> getValidityConstraint();

	/**
	 * Returns the value of the '<em><b>XPath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An XPath expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPath Text</em>' attribute.
	 * @see #setXPathText(String)
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getValidityContextType_XPathText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='xPathText' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXPathText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.ValidityContextType#getXPathText <em>XPath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPath Text</em>' attribute.
	 * @see #getXPathText()
	 * @generated
	 */
	void setXPathText(String value);

} // ValidityContextType
