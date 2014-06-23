/**
 */
package gov.niem.release.niem.niem.core._3._0;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Securities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A data type for a financial instrument showing ownership or credit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesCollectionDateRange <em>Securities Collection Date Range</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesDateSeriesGroup <em>Securities Date Series Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesDateSeries <em>Securities Date Series</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesDenominationGroup <em>Securities Denomination Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesDenomination <em>Securities Denomination</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesCategoryGroup <em>Securities Category Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesCategory <em>Securities Category</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesIssuer <em>Securities Issuer</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesAugmentationPointGroup <em>Securities Augmentation Point Group</em>}</li>
 *   <li>{@link gov.niem.release.niem.niem.core._3._0.SecuritiesType#getSecuritiesAugmentationPoint <em>Securities Augmentation Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType()
 * @model extendedMetaData="name='SecuritiesType' kind='elementOnly'"
 * @generated
 */
public interface SecuritiesType extends ItemType {
	/**
	 * Returns the value of the '<em><b>Securities Collection Date Range</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.DateRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A date range during which an owner may collect returns from a security.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Collection Date Range</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesCollectionDateRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SecuritiesCollectionDateRange' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateRangeType> getSecuritiesCollectionDateRange();

	/**
	 * Returns the value of the '<em><b>Securities Date Series Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a security date or series year.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Date Series Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesDateSeriesGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SecuritiesDateSeries:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSecuritiesDateSeriesGroup();

	/**
	 * Returns the value of the '<em><b>Securities Date Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a security date or series year.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Date Series</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesDateSeries()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecuritiesDateSeries' namespace='##targetNamespace' group='SecuritiesDateSeries:group'"
	 * @generated
	 */
	EList<EObject> getSecuritiesDateSeries();

	/**
	 * Returns the value of the '<em><b>Securities Denomination Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a value within a series of values reflecting the worth of a security note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Denomination Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesDenominationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SecuritiesDenomination:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSecuritiesDenominationGroup();

	/**
	 * Returns the value of the '<em><b>Securities Denomination</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a value within a series of values reflecting the worth of a security note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Denomination</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesDenomination()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecuritiesDenomination' namespace='##targetNamespace' group='SecuritiesDenomination:group'"
	 * @generated
	 */
	EList<EObject> getSecuritiesDenomination();

	/**
	 * Returns the value of the '<em><b>Securities Category Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of security.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Category Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesCategoryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SecuritiesCategory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSecuritiesCategoryGroup();

	/**
	 * Returns the value of the '<em><b>Securities Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A data concept for a kind of security.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Category</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesCategory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecuritiesCategory' namespace='##targetNamespace' group='SecuritiesCategory:group'"
	 * @generated
	 */
	EList<EObject> getSecuritiesCategory();

	/**
	 * Returns the value of the '<em><b>Securities Issuer</b></em>' containment reference list.
	 * The list contents are of type {@link gov.niem.release.niem.niem.core._3._0.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An entity which issued a security to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Issuer</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesIssuer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SecuritiesIssuer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityType> getSecuritiesIssuer();

	/**
	 * Returns the value of the '<em><b>Securities Augmentation Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SecuritiesType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Augmentation Point Group</em>' attribute list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesAugmentationPointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SecuritiesAugmentationPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSecuritiesAugmentationPointGroup();

	/**
	 * Returns the value of the '<em><b>Securities Augmentation Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An augmentation point for SecuritiesType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Securities Augmentation Point</em>' containment reference list.
	 * @see gov.niem.release.niem.niem.core._3._0._0Package#getSecuritiesType_SecuritiesAugmentationPoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SecuritiesAugmentationPoint' namespace='##targetNamespace' group='SecuritiesAugmentationPoint:group'"
	 * @generated
	 */
	EList<EObject> getSecuritiesAugmentationPoint();

} // SecuritiesType
