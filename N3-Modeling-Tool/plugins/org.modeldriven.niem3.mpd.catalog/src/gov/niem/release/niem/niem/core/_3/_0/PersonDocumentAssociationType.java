/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Document Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for an association between a person and a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType#getPerson <em>Person</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType#getDocument <em>Document</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType#getPersonDocumentAssociationAugmentationPointGroup <em>Person Document Association Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.PersonDocumentAssociationType#getPersonDocumentAssociationAugmentationPoint <em>Person Document Association Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDocumentAssociationType()
 * @model extendedMetaData="name='PersonDocumentAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PersonDocumentAssociationType extends AssociationType {
	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.PersonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A human being.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDocumentAssociationType_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPerson();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A paper or electronic document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDocumentAssociationType_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentType> getDocument();

	/**
	 * Returns the value of the '<em><b>Person Document Association Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonDocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Document Association Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDocumentAssociationType_PersonDocumentAssociationAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PersonDocumentAssociationAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPersonDocumentAssociationAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Person Document Association Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for PersonDocumentAssociationType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Document Association Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getPersonDocumentAssociationType_PersonDocumentAssociationAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PersonDocumentAssociationAugmentationPoint' namespace='##targetNamespace' group='PersonDocumentAssociationAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getPersonDocumentAssociationAugmentationPoint();

} // PersonDocumentAssociationType
