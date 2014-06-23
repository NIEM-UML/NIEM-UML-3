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
 * A representation of the model object '<em><b>IEP Conformance Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 		      A data type for a class or category of IEP, which has a set of validity constraints and a unique identifier.
 * 	      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getDescriptionText <em>Description Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getValidityConstraintWithContextGroup <em>Validity Constraint With Context Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getValidityConstraintWithContext <em>Validity Constraint With Context</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getArtifactOrArtifactSetGroup <em>Artifact Or Artifact Set Group</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getArtifactOrArtifactSet <em>Artifact Or Artifact Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getIEPConformanceTargetType()
 * @model extendedMetaData="name='IEPConformanceTargetType' kind='elementOnly'"
 * @generated
 */
public interface IEPConformanceTargetType extends ObjectType {
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
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getIEPConformanceTargetType_DescriptionText()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DescriptionText' namespace='http://release.niem.gov/niem/niem-core/3.0/'"
	 * @generated
	 */
	TextType getDescriptionText();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getDescriptionText <em>Description Text</em>}' containment reference.
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
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getDescriptionText <em>Description Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescriptionText()
	 * @see #getDescriptionText()
	 * @see #setDescriptionText(TextType)
	 * @generated
	 */
	void unsetDescriptionText();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.mpd.catalog._3._0.IEPConformanceTargetType#getDescriptionText <em>Description Text</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Validity Constraint With Context Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a rule or instructions for validating an IEP candidate (XML document) using some context within that XML document.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Constraint With Context Group</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getIEPConformanceTargetType_ValidityConstraintWithContextGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ValidityConstraintWithContext:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getValidityConstraintWithContextGroup();

	/**
	 * Returns the value of the '<em><b>Validity Constraint With Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		      A data concept for a rule or instructions for validating an IEP candidate (XML document) using some context within that XML document.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Constraint With Context</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getIEPConformanceTargetType_ValidityConstraintWithContext()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValidityConstraintWithContext' namespace='##targetNamespace' group='ValidityConstraintWithContext:group'"
	 * @generated
	 */
	EList<EObject> getValidityConstraintWithContext();

	/**
	 * Returns the value of the '<em><b>Artifact Or Artifact Set Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 A concept for a file or file set in an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Or Artifact Set Group</em>' attribute list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getIEPConformanceTargetType_ArtifactOrArtifactSetGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ArtifactOrArtifactSet:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getArtifactOrArtifactSetGroup();

	/**
	 * Returns the value of the '<em><b>Artifact Or Artifact Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 A concept for a file or file set in an MPD.
	 * 	      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Or Artifact Set</em>' containment reference list.
	 * @see gov.niem.reference.niem.resource.mpd.catalog._3._0._0Package#getIEPConformanceTargetType_ArtifactOrArtifactSet()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ArtifactOrArtifactSet' namespace='##targetNamespace' group='ArtifactOrArtifactSet:group'"
	 * @generated
	 */
	EList<EObject> getArtifactOrArtifactSet();

} // IEPConformanceTargetType
