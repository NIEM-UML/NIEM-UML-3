/**
 */
package gov.niem.release.niem.codes.censusUscounty._3._0;

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
 * County codes from US Census and ANSI. 
 * Publication: INCITS 31:2009; 
 * Version: 2009; 
 * http://www.census.gov/geo/www/ansi/download.html
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.censusUscounty._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/census_uscounty/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.censusUscounty._3._0.impl.USCountyCodeTypeImpl <em>US County Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl.USCountyCodeTypeImpl
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl#getUSCountyCodeType()
	 * @generated
	 */
	int US_COUNTY_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>US County Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>US County Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_COUNTY_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType <em>US County Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl#getUSCountyCodeSimpleType()
	 * @generated
	 */
	int US_COUNTY_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>US County Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl#getUSCountyCodeSimpleTypeObject()
	 * @generated
	 */
	int US_COUNTY_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType <em>US County Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US County Code Type</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType
	 * @generated
	 */
	EClass getUSCountyCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getValue()
	 * @see #getUSCountyCodeType()
	 * @generated
	 */
	EAttribute getUSCountyCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getId()
	 * @see #getUSCountyCodeType()
	 * @generated
	 */
	EAttribute getUSCountyCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getMetadata()
	 * @see #getUSCountyCodeType()
	 * @generated
	 */
	EAttribute getUSCountyCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getRef()
	 * @see #getUSCountyCodeType()
	 * @generated
	 */
	EAttribute getUSCountyCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getRelationshipMetadata()
	 * @see #getUSCountyCodeType()
	 * @generated
	 */
	EAttribute getUSCountyCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeType#getAnyAttribute()
	 * @see #getUSCountyCodeType()
	 * @generated
	 */
	EAttribute getUSCountyCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType <em>US County Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>US County Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType
	 * @generated
	 */
	EEnum getUSCountyCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType <em>US County Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>US County Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType"
	 *        extendedMetaData="name='USCountyCodeSimpleType:Object' baseType='USCountyCodeSimpleType'"
	 * @generated
	 */
	EDataType getUSCountyCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.censusUscounty._3._0.impl.USCountyCodeTypeImpl <em>US County Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl.USCountyCodeTypeImpl
		 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl#getUSCountyCodeType()
		 * @generated
		 */
		EClass US_COUNTY_CODE_TYPE = eINSTANCE.getUSCountyCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_COUNTY_CODE_TYPE__VALUE = eINSTANCE.getUSCountyCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_COUNTY_CODE_TYPE__ID = eINSTANCE.getUSCountyCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_COUNTY_CODE_TYPE__METADATA = eINSTANCE.getUSCountyCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_COUNTY_CODE_TYPE__REF = eINSTANCE.getUSCountyCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_COUNTY_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getUSCountyCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_COUNTY_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getUSCountyCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType <em>US County Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType
		 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl#getUSCountyCodeSimpleType()
		 * @generated
		 */
		EEnum US_COUNTY_CODE_SIMPLE_TYPE = eINSTANCE.getUSCountyCodeSimpleType();

		/**
		 * The meta object literal for the '<em>US County Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.censusUscounty._3._0.USCountyCodeSimpleType
		 * @see gov.niem.release.niem.codes.censusUscounty._3._0.impl._0PackageImpl#getUSCountyCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType US_COUNTY_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getUSCountyCodeSimpleTypeObject();

	}

} //_0Package
