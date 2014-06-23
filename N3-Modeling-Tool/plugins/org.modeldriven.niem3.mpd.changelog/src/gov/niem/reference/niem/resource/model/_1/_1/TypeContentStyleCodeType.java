/**
 */
package gov.niem.reference.niem.resource.model._1._1;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Content Style Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getValue <em>Value</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getId <em>Id</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getLinkMetadata <em>Link Metadata</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContentStyleCodeType()
 * @model extendedMetaData="name='TypeContentStyleCodeType' kind='simple'"
 * @generated
 */
public interface TypeContentStyleCodeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(TypeContentStyleCodeSimpleType)
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContentStyleCodeType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	TypeContentStyleCodeSimpleType getValue();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(TypeContentStyleCodeSimpleType value);

	/**
	 * Unsets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(TypeContentStyleCodeSimpleType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(TypeContentStyleCodeSimpleType)
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContentStyleCodeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getId <em>Id</em>}' attribute.
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContentStyleCodeType_LinkMetadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='linkMetadata' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	List<String> getLinkMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getLinkMetadata <em>Link Metadata</em>}' attribute.
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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#getTypeContentStyleCodeType_Metadata()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='metadata' namespace='http://niem.gov/niem/structures/2.0'"
	 * @generated
	 */
	List<String> getMetadata();

	/**
	 * Sets the value of the '{@link gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(List<String> value);

} // TypeContentStyleCodeType
