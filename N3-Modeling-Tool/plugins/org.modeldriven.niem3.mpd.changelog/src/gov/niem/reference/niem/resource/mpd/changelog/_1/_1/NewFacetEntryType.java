/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.FacetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Facet Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType#getNewFacet <em>New Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewFacetEntryType()
 * @model extendedMetaData="name='NewFacetEntryType' kind='elementOnly'"
 * @generated
 */
public interface NewFacetEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>New Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Facet</em>' containment reference.
	 * @see #setNewFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getNewFacetEntryType_NewFacet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NewFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getNewFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.NewFacetEntryType#getNewFacet <em>New Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Facet</em>' containment reference.
	 * @see #getNewFacet()
	 * @generated
	 */
	void setNewFacet(FacetType value);

} // NewFacetEntryType
