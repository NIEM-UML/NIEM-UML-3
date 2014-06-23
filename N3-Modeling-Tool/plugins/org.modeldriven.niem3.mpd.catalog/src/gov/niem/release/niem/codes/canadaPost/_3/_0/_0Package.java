/**
 */
package gov.niem.release.niem.codes.canadaPost._3._0;

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
 * Province codes for Canada.
 * Publication: Canada Post Addressing Guidelines; 
 * Date: 14 Jan 2013;   
 * http://www.canadapost.ca/tools/pg/manual/PGaddress-e.asp#1380608
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.canadaPost._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/canada_post/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.canadaPost._3._0.impl.CanadianProvinceCodeTypeImpl <em>Canadian Province Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl.CanadianProvinceCodeTypeImpl
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl#getCanadianProvinceCodeType()
	 * @generated
	 */
	int CANADIAN_PROVINCE_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Canadian Province Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Canadian Province Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANADIAN_PROVINCE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType <em>Canadian Province Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl#getCanadianProvinceCodeSimpleType()
	 * @generated
	 */
	int CANADIAN_PROVINCE_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Canadian Province Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl#getCanadianProvinceCodeSimpleTypeObject()
	 * @generated
	 */
	int CANADIAN_PROVINCE_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType <em>Canadian Province Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Canadian Province Code Type</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType
	 * @generated
	 */
	EClass getCanadianProvinceCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getValue()
	 * @see #getCanadianProvinceCodeType()
	 * @generated
	 */
	EAttribute getCanadianProvinceCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getId()
	 * @see #getCanadianProvinceCodeType()
	 * @generated
	 */
	EAttribute getCanadianProvinceCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getMetadata()
	 * @see #getCanadianProvinceCodeType()
	 * @generated
	 */
	EAttribute getCanadianProvinceCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getRef()
	 * @see #getCanadianProvinceCodeType()
	 * @generated
	 */
	EAttribute getCanadianProvinceCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getRelationshipMetadata()
	 * @see #getCanadianProvinceCodeType()
	 * @generated
	 */
	EAttribute getCanadianProvinceCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeType#getAnyAttribute()
	 * @see #getCanadianProvinceCodeType()
	 * @generated
	 */
	EAttribute getCanadianProvinceCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType <em>Canadian Province Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Canadian Province Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType
	 * @generated
	 */
	EEnum getCanadianProvinceCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType <em>Canadian Province Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Canadian Province Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType"
	 *        extendedMetaData="name='CanadianProvinceCodeSimpleType:Object' baseType='CanadianProvinceCodeSimpleType'"
	 * @generated
	 */
	EDataType getCanadianProvinceCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.canadaPost._3._0.impl.CanadianProvinceCodeTypeImpl <em>Canadian Province Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl.CanadianProvinceCodeTypeImpl
		 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl#getCanadianProvinceCodeType()
		 * @generated
		 */
		EClass CANADIAN_PROVINCE_CODE_TYPE = eINSTANCE.getCanadianProvinceCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANADIAN_PROVINCE_CODE_TYPE__VALUE = eINSTANCE.getCanadianProvinceCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANADIAN_PROVINCE_CODE_TYPE__ID = eINSTANCE.getCanadianProvinceCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANADIAN_PROVINCE_CODE_TYPE__METADATA = eINSTANCE.getCanadianProvinceCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANADIAN_PROVINCE_CODE_TYPE__REF = eINSTANCE.getCanadianProvinceCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANADIAN_PROVINCE_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getCanadianProvinceCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CANADIAN_PROVINCE_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getCanadianProvinceCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType <em>Canadian Province Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType
		 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl#getCanadianProvinceCodeSimpleType()
		 * @generated
		 */
		EEnum CANADIAN_PROVINCE_CODE_SIMPLE_TYPE = eINSTANCE.getCanadianProvinceCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Canadian Province Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.canadaPost._3._0.CanadianProvinceCodeSimpleType
		 * @see gov.niem.release.niem.codes.canadaPost._3._0.impl._0PackageImpl#getCanadianProvinceCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType CANADIAN_PROVINCE_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getCanadianProvinceCodeSimpleTypeObject();

	}

} //_0Package
