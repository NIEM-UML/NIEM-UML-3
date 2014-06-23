/**
 */
package gov.niem.reference.niem.resource.mpd.changelog._1._1;

import gov.niem.reference.niem.resource.model._1._1.FacetType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Removed Facet Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType#getRemovedFacet <em>Removed Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedFacetEntryType()
 * @model extendedMetaData="name='RemovedFacetEntryType' kind='elementOnly'"
 * @generated
 */
public interface RemovedFacetEntryType extends ChangeLogEntryType {
	/**
	 * Returns the value of the '<em><b>Removed Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removed Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removed Facet</em>' containment reference.
	 * @see #setRemovedFacet(FacetType)
	 * @see gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package#getRemovedFacetEntryType_RemovedFacet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RemovedFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	FacetType getRemovedFacet();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.mpd.changelog._1._1.RemovedFacetEntryType#getRemovedFacet <em>Removed Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removed Facet</em>' containment reference.
	 * @see #getRemovedFacet()
	 * @generated
	 */
	void setRemovedFacet(FacetType value);

} // RemovedFacetEntryType
