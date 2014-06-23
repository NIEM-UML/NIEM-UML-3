/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.FacetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modified Facet Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getOriginalFacet <em>Original Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getUpdatedFacet <em>Updated Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedFacetEntryType()
 * @model extendedMetaData="name='ModifiedFacetEntryType' kind='elementOnly'"
 * @generated
 */
public interface ModifiedFacetEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Original Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Facet</em>' containment reference.
	 * @see #setOriginalFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedFacetEntryType_OriginalFacet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OriginalFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getOriginalFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getOriginalFacet <em>Original Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Facet</em>' containment reference.
	 * @see #getOriginalFacet()
	 * @generated
	 */
	void setOriginalFacet(FacetType value);

	/**
	 * Returns the value of the '<em><b>Updated Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated Facet</em>' containment reference.
	 * @see #setUpdatedFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getModifiedFacetEntryType_UpdatedFacet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdatedFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getUpdatedFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.ModifiedFacetEntryType#getUpdatedFacet <em>Updated Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated Facet</em>' containment reference.
	 * @see #getUpdatedFacet()
	 * @generated
	 */
	void setUpdatedFacet(FacetType value);

} // ModifiedFacetEntryType
