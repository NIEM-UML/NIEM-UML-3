/**
 */
package gov.niem.release.niem.codes.uspsStates._3._0;

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
 * Source: U.S. Postal Service (USPS); 
 * Publication: Official USPS Abbreviations, Appendix B; 
 * Date: 2012;   
 * http://pe.usps.com/text/pub28/28apb.htm
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.uspsStates._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/usps_states/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.uspsStates._3._0.impl.USStateCodeTypeImpl <em>US State Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl.USStateCodeTypeImpl
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl#getUSStateCodeType()
	 * @generated
	 */
	int US_STATE_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>US State Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>US State Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int US_STATE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType <em>US State Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl#getUSStateCodeSimpleType()
	 * @generated
	 */
	int US_STATE_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>US State Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl#getUSStateCodeSimpleTypeObject()
	 * @generated
	 */
	int US_STATE_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType <em>US State Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>US State Code Type</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType
	 * @generated
	 */
	EClass getUSStateCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getValue()
	 * @see #getUSStateCodeType()
	 * @generated
	 */
	EAttribute getUSStateCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getId()
	 * @see #getUSStateCodeType()
	 * @generated
	 */
	EAttribute getUSStateCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getMetadata()
	 * @see #getUSStateCodeType()
	 * @generated
	 */
	EAttribute getUSStateCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getRef()
	 * @see #getUSStateCodeType()
	 * @generated
	 */
	EAttribute getUSStateCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getRelationshipMetadata()
	 * @see #getUSStateCodeType()
	 * @generated
	 */
	EAttribute getUSStateCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeType#getAnyAttribute()
	 * @see #getUSStateCodeType()
	 * @generated
	 */
	EAttribute getUSStateCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType <em>US State Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>US State Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType
	 * @generated
	 */
	EEnum getUSStateCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType <em>US State Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>US State Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType"
	 *        extendedMetaData="name='USStateCodeSimpleType:Object' baseType='USStateCodeSimpleType'"
	 * @generated
	 */
	EDataType getUSStateCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.uspsStates._3._0.impl.USStateCodeTypeImpl <em>US State Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl.USStateCodeTypeImpl
		 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl#getUSStateCodeType()
		 * @generated
		 */
		EClass US_STATE_CODE_TYPE = eINSTANCE.getUSStateCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_STATE_CODE_TYPE__VALUE = eINSTANCE.getUSStateCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_STATE_CODE_TYPE__ID = eINSTANCE.getUSStateCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_STATE_CODE_TYPE__METADATA = eINSTANCE.getUSStateCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_STATE_CODE_TYPE__REF = eINSTANCE.getUSStateCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_STATE_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getUSStateCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute US_STATE_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getUSStateCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType <em>US State Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType
		 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl#getUSStateCodeSimpleType()
		 * @generated
		 */
		EEnum US_STATE_CODE_SIMPLE_TYPE = eINSTANCE.getUSStateCodeSimpleType();

		/**
		 * The meta object literal for the '<em>US State Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.uspsStates._3._0.USStateCodeSimpleType
		 * @see gov.niem.release.niem.codes.uspsStates._3._0.impl._0PackageImpl#getUSStateCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType US_STATE_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getUSStateCodeSimpleTypeObject();

	}

} //_0Package