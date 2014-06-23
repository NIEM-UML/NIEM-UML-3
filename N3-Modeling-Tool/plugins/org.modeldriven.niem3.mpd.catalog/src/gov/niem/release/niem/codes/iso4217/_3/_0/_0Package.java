/**
 */
package gov.niem.release.niem.codes.iso4217._3._0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Source: International Standards Organization (ISO); 
 * Publication: Codes for the representation of currencies and funds; 
 * Version: ISO 4217:2008; 
 * Date: 30 Jun 2008; 
 * http://www.iso.org/iso/en/prods-services/popstds/currencycodeslist.html
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.iso4217._3._0._0Factory
 * @model kind="package"
 *        annotation="http://release.niem.gov/niem/conformanceTargets/3.0/ conformanceTargets='http://reference.niem.gov/niem/specification/naming-and-design-rules/3.0/#ReferenceSchemaDocument'"
 * @generated
 */
public interface _0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://release.niem.gov/niem/codes/iso_4217/3.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_0Package eINSTANCE = gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.iso4217._3._0.impl.CurrencyCodeTypeImpl <em>Currency Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso4217._3._0.impl.CurrencyCodeTypeImpl
	 * @see gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl#getCurrencyCodeType()
	 * @generated
	 */
	int CURRENCY_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Currency Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Currency Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENCY_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType <em>Currency Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType
	 * @see gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl#getCurrencyCodeSimpleType()
	 * @generated
	 */
	int CURRENCY_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Currency Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType
	 * @see gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl#getCurrencyCodeSimpleTypeObject()
	 * @generated
	 */
	int CURRENCY_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType <em>Currency Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Currency Code Type</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType
	 * @generated
	 */
	EClass getCurrencyCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getValue()
	 * @see #getCurrencyCodeType()
	 * @generated
	 */
	EAttribute getCurrencyCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getId()
	 * @see #getCurrencyCodeType()
	 * @generated
	 */
	EAttribute getCurrencyCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getMetadata()
	 * @see #getCurrencyCodeType()
	 * @generated
	 */
	EAttribute getCurrencyCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getRef()
	 * @see #getCurrencyCodeType()
	 * @generated
	 */
	EAttribute getCurrencyCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getRelationshipMetadata()
	 * @see #getCurrencyCodeType()
	 * @generated
	 */
	EAttribute getCurrencyCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeType#getAnyAttribute()
	 * @see #getCurrencyCodeType()
	 * @generated
	 */
	EAttribute getCurrencyCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType <em>Currency Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Currency Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType
	 * @generated
	 */
	EEnum getCurrencyCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType <em>Currency Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Currency Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType"
	 *        extendedMetaData="name='CurrencyCodeSimpleType:Object' baseType='CurrencyCodeSimpleType'"
	 * @generated
	 */
	EDataType getCurrencyCodeSimpleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.iso4217._3._0.impl.CurrencyCodeTypeImpl <em>Currency Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.iso4217._3._0.impl.CurrencyCodeTypeImpl
		 * @see gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl#getCurrencyCodeType()
		 * @generated
		 */
		EClass CURRENCY_CODE_TYPE = eINSTANCE.getCurrencyCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_CODE_TYPE__VALUE = eINSTANCE.getCurrencyCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_CODE_TYPE__ID = eINSTANCE.getCurrencyCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_CODE_TYPE__METADATA = eINSTANCE.getCurrencyCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_CODE_TYPE__REF = eINSTANCE.getCurrencyCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getCurrencyCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENCY_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getCurrencyCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType <em>Currency Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType
		 * @see gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl#getCurrencyCodeSimpleType()
		 * @generated
		 */
		EEnum CURRENCY_CODE_SIMPLE_TYPE = eINSTANCE.getCurrencyCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Currency Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.iso4217._3._0.CurrencyCodeSimpleType
		 * @see gov.niem.release.niem.codes.iso4217._3._0.impl._0PackageImpl#getCurrencyCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType CURRENCY_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getCurrencyCodeSimpleTypeObject();

	}

} //_0Package
