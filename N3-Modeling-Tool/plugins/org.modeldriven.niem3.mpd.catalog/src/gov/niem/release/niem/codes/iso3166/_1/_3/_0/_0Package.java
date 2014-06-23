/**
 */
package gov.niem.release.niem.codes.iso3166._1._3._0;

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
 * Publication: Codes for the representation of names of countries -- Part 1: Country codes; 
 * Date: 2 Aug 2012; 
 * Source Updates: VI-13; 
 * http://www.iso.org/iso/country_codes.htm
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.iso3166._1._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/iso_3166-1/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.iso3166._1._3._0.impl.CountryAlpha2CodeTypeImpl <em>Country Alpha2 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl.CountryAlpha2CodeTypeImpl
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl#getCountryAlpha2CodeType()
	 * @generated
	 */
	int COUNTRY_ALPHA2_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Country Alpha2 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Country Alpha2 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ALPHA2_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType <em>Country Alpha2 Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl#getCountryAlpha2CodeSimpleType()
	 * @generated
	 */
	int COUNTRY_ALPHA2_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Country Alpha2 Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl#getCountryAlpha2CodeSimpleTypeObject()
	 * @generated
	 */
	int COUNTRY_ALPHA2_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType <em>Country Alpha2 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Alpha2 Code Type</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType
	 * @generated
	 */
	EClass getCountryAlpha2CodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getValue()
	 * @see #getCountryAlpha2CodeType()
	 * @generated
	 */
	EAttribute getCountryAlpha2CodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getId()
	 * @see #getCountryAlpha2CodeType()
	 * @generated
	 */
	EAttribute getCountryAlpha2CodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getMetadata()
	 * @see #getCountryAlpha2CodeType()
	 * @generated
	 */
	EAttribute getCountryAlpha2CodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getRef()
	 * @see #getCountryAlpha2CodeType()
	 * @generated
	 */
	EAttribute getCountryAlpha2CodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getRelationshipMetadata()
	 * @see #getCountryAlpha2CodeType()
	 * @generated
	 */
	EAttribute getCountryAlpha2CodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeType#getAnyAttribute()
	 * @see #getCountryAlpha2CodeType()
	 * @generated
	 */
	EAttribute getCountryAlpha2CodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType <em>Country Alpha2 Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Country Alpha2 Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType
	 * @generated
	 */
	EEnum getCountryAlpha2CodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType <em>Country Alpha2 Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Country Alpha2 Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType"
	 *        extendedMetaData="name='CountryAlpha2CodeSimpleType:Object' baseType='CountryAlpha2CodeSimpleType'"
	 * @generated
	 */
	EDataType getCountryAlpha2CodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.iso3166._1._3._0.impl.CountryAlpha2CodeTypeImpl <em>Country Alpha2 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl.CountryAlpha2CodeTypeImpl
		 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl#getCountryAlpha2CodeType()
		 * @generated
		 */
		EClass COUNTRY_ALPHA2_CODE_TYPE = eINSTANCE.getCountryAlpha2CodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ALPHA2_CODE_TYPE__VALUE = eINSTANCE.getCountryAlpha2CodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ALPHA2_CODE_TYPE__ID = eINSTANCE.getCountryAlpha2CodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ALPHA2_CODE_TYPE__METADATA = eINSTANCE.getCountryAlpha2CodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ALPHA2_CODE_TYPE__REF = eINSTANCE.getCountryAlpha2CodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ALPHA2_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getCountryAlpha2CodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ALPHA2_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getCountryAlpha2CodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType <em>Country Alpha2 Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType
		 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl#getCountryAlpha2CodeSimpleType()
		 * @generated
		 */
		EEnum COUNTRY_ALPHA2_CODE_SIMPLE_TYPE = eINSTANCE.getCountryAlpha2CodeSimpleType();

		/**
		 * The meta object literal for the '<em>Country Alpha2 Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.iso3166._1._3._0.CountryAlpha2CodeSimpleType
		 * @see gov.niem.release.niem.codes.iso3166._1._3._0.impl._0PackageImpl#getCountryAlpha2CodeSimpleTypeObject()
		 * @generated
		 */
		EDataType COUNTRY_ALPHA2_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getCountryAlpha2CodeSimpleTypeObject();

	}

} //_0Package
