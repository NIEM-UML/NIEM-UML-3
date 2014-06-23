/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Simple Style Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getLinkMetadata <em>Link Metadata</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeSimpleStyleCodeType()
 * @model extendedMetaData="name='TypeSimpleStyleCodeType' kind='simple'"
 * @generated
 */
public interface TypeSimpleStyleCodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(TypeSimpleStyleCodeSimpleType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeSimpleStyleCodeType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	TypeSimpleStyleCodeSimpleType getValue();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TypeSimpleStyleCodeSimpleType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(TypeSimpleStyleCodeSimpleType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(TypeSimpleStyleCodeSimpleType)
	 * @generated
	 */
	boolean isSetValue();

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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeSimpleStyleCodeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Link Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Metadata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Metadata</em>' attribute.
	 * @see #setLinkMetadata(List)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeSimpleStyleCodeType_LinkMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='linkMetadata' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	List<String> getLinkMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getLinkMetadata <em>Link Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Metadata</em>' attribute.
	 * @see #getLinkMetadata()
	 * @generated
	 */
	void setLinkMetadata(List<String> value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(List)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeSimpleStyleCodeType_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(List<String> value);

} // TypeSimpleStyleCodeType
