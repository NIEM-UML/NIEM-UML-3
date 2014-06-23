/**
 */
package gov.niem.release.niem.codes.fips10._4._3._0;

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
 * Countries, dependencies, areas of special sovereignty, and their principal administrative divisions.
 * Source:  National Geospatial-Intelligence Agency (NGA); 
 * Publication: Geopolitical Entities and Codes (formerly FIPS 10-4); 
 * Date: Apr 2010; 
 * Source Updates: 14+;  
 * http://earth-info.nga.mil/gns/html/GEOPOLITICAL_CODES.pdf
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.fips10._4._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/fips_10-4/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.fips10._4._3._0.impl.CountryCodeTypeImpl <em>Country Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl.CountryCodeTypeImpl
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl#getCountryCodeType()
	 * @generated
	 */
	int COUNTRY_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Country Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Country Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.fips10._4._3._0.impl.InternationalStateCodeTypeImpl <em>International State Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl.InternationalStateCodeTypeImpl
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl#getInternationalStateCodeType()
	 * @generated
	 */
	int INTERNATIONAL_STATE_CODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>International State Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>International State Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNATIONAL_STATE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType <em>Country Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl#getCountryCodeSimpleType()
	 * @generated
	 */
	int COUNTRY_CODE_SIMPLE_TYPE = 2;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType <em>International State Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl#getInternationalStateCodeSimpleType()
	 * @generated
	 */
	int INTERNATIONAL_STATE_CODE_SIMPLE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Country Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl#getCountryCodeSimpleTypeObject()
	 * @generated
	 */
	int COUNTRY_CODE_SIMPLE_TYPE_OBJECT = 4;

	/**
	 * The meta object id for the '<em>International State Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.impl._0PackageImpl#getInternationalStateCodeSimpleTypeObject()
	 * @generated
	 */
	int INTERNATIONAL_STATE_CODE_SIMPLE_TYPE_OBJECT = 5;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType <em>Country Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Code Type</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType
	 * @generated
	 */
	EClass getCountryCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getValue()
	 * @see #getCountryCodeType()
	 * @generated
	 */
	EAttribute getCountryCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getId()
	 * @see #getCountryCodeType()
	 * @generated
	 */
	EAttribute getCountryCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getMetadata()
	 * @see #getCountryCodeType()
	 * @generated
	 */
	EAttribute getCountryCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getRef()
	 * @see #getCountryCodeType()
	 * @generated
	 */
	EAttribute getCountryCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getRelationshipMetadata()
	 * @see #getCountryCodeType()
	 * @generated
	 */
	EAttribute getCountryCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeType#getAnyAttribute()
	 * @see #getCountryCodeType()
	 * @generated
	 */
	EAttribute getCountryCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType <em>International State Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>International State Code Type</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType
	 * @generated
	 */
	EClass getInternationalStateCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getValue()
	 * @see #getInternationalStateCodeType()
	 * @generated
	 */
	EAttribute getInternationalStateCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getId()
	 * @see #getInternationalStateCodeType()
	 * @generated
	 */
	EAttribute getInternationalStateCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getMetadata()
	 * @see #getInternationalStateCodeType()
	 * @generated
	 */
	EAttribute getInternationalStateCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getRef()
	 * @see #getInternationalStateCodeType()
	 * @generated
	 */
	EAttribute getInternationalStateCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getRelationshipMetadata()
	 * @see #getInternationalStateCodeType()
	 * @generated
	 */
	EAttribute getInternationalStateCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeType#getAnyAttribute()
	 * @see #getInternationalStateCodeType()
	 * @generated
	 */
	EAttribute getInternationalStateCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType <em>Country Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Country Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType
	 * @generated
	 */
	EEnum getCountryCodeSimpleType();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType <em>International State Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>International State Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType
	 * @generated
	 */
	EEnum getInternationalStateCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType <em>Country Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Country Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.fips10._4._3._0.CountryCodeSimpleType"
	 *        extendedMetaData="name='CountryCodeSimpleType:Object' baseType='CountryCodeSimpleType'"
	 * @generated
	 */
	EDataType getCountryCodeSimpleTypeObject();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType <em>International State Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>International State Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.fips10._4._3._0.InternationalStateCodeSimpleType"
	 *        extendedMetaData="name='InternationalStateCodeSimpleType:Object' baseType='InternationalStateCodeSimpleType'"
	 * @generated
	 */
	EDataType getInternationalStateCodeSimpleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

} //_0Package
