/**
 */
package gov.niem.release.niem.codes.ngaDatum._3._0;

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
 * Source: National Geospatial-Intelligence Agency; 
 * Publication: Temporal Spatial Positioning Information (TSPI) ; 
 * Version: 2.0; 
 * Date: 1 Mar 2012;   
 * http://metadata.ces.mil/dse/ns/GSIP/tspi/2.0.0/tspi-core.xsd
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.ngaDatum._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/nga_datum/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.impl.DirectionDatumCodeTypeImpl <em>Direction Datum Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl.DirectionDatumCodeTypeImpl
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getDirectionDatumCodeType()
	 * @generated
	 */
	int DIRECTION_DATUM_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Direction Datum Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Direction Datum Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTION_DATUM_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.impl.VerticalDatumCodeTypeImpl <em>Vertical Datum Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl.VerticalDatumCodeTypeImpl
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getVerticalDatumCodeType()
	 * @generated
	 */
	int VERTICAL_DATUM_CODE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Vertical Datum Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Vertical Datum Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_DATUM_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType <em>Direction Datum Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getDirectionDatumCodeSimpleType()
	 * @generated
	 */
	int DIRECTION_DATUM_CODE_SIMPLE_TYPE = 2;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType <em>Vertical Datum Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getVerticalDatumCodeSimpleType()
	 * @generated
	 */
	int VERTICAL_DATUM_CODE_SIMPLE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Direction Datum Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getDirectionDatumCodeSimpleTypeObject()
	 * @generated
	 */
	int DIRECTION_DATUM_CODE_SIMPLE_TYPE_OBJECT = 4;

	/**
	 * The meta object id for the '<em>Vertical Datum Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getVerticalDatumCodeSimpleTypeObject()
	 * @generated
	 */
	int VERTICAL_DATUM_CODE_SIMPLE_TYPE_OBJECT = 5;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType <em>Direction Datum Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direction Datum Code Type</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType
	 * @generated
	 */
	EClass getDirectionDatumCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getValue()
	 * @see #getDirectionDatumCodeType()
	 * @generated
	 */
	EAttribute getDirectionDatumCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getId()
	 * @see #getDirectionDatumCodeType()
	 * @generated
	 */
	EAttribute getDirectionDatumCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getMetadata()
	 * @see #getDirectionDatumCodeType()
	 * @generated
	 */
	EAttribute getDirectionDatumCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getRef()
	 * @see #getDirectionDatumCodeType()
	 * @generated
	 */
	EAttribute getDirectionDatumCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getRelationshipMetadata()
	 * @see #getDirectionDatumCodeType()
	 * @generated
	 */
	EAttribute getDirectionDatumCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeType#getAnyAttribute()
	 * @see #getDirectionDatumCodeType()
	 * @generated
	 */
	EAttribute getDirectionDatumCodeType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType <em>Vertical Datum Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Datum Code Type</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType
	 * @generated
	 */
	EClass getVerticalDatumCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getValue()
	 * @see #getVerticalDatumCodeType()
	 * @generated
	 */
	EAttribute getVerticalDatumCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getId()
	 * @see #getVerticalDatumCodeType()
	 * @generated
	 */
	EAttribute getVerticalDatumCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getMetadata()
	 * @see #getVerticalDatumCodeType()
	 * @generated
	 */
	EAttribute getVerticalDatumCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getRef()
	 * @see #getVerticalDatumCodeType()
	 * @generated
	 */
	EAttribute getVerticalDatumCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getRelationshipMetadata()
	 * @see #getVerticalDatumCodeType()
	 * @generated
	 */
	EAttribute getVerticalDatumCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeType#getAnyAttribute()
	 * @see #getVerticalDatumCodeType()
	 * @generated
	 */
	EAttribute getVerticalDatumCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType <em>Direction Datum Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Datum Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType
	 * @generated
	 */
	EEnum getDirectionDatumCodeSimpleType();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType <em>Vertical Datum Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Datum Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType
	 * @generated
	 */
	EEnum getVerticalDatumCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType <em>Direction Datum Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direction Datum Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType"
	 *        extendedMetaData="name='DirectionDatumCodeSimpleType:Object' baseType='DirectionDatumCodeSimpleType'"
	 * @generated
	 */
	EDataType getDirectionDatumCodeSimpleTypeObject();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType <em>Vertical Datum Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertical Datum Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType"
	 *        extendedMetaData="name='VerticalDatumCodeSimpleType:Object' baseType='VerticalDatumCodeSimpleType'"
	 * @generated
	 */
	EDataType getVerticalDatumCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.impl.DirectionDatumCodeTypeImpl <em>Direction Datum Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl.DirectionDatumCodeTypeImpl
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getDirectionDatumCodeType()
		 * @generated
		 */
		EClass DIRECTION_DATUM_CODE_TYPE = eINSTANCE.getDirectionDatumCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_DATUM_CODE_TYPE__VALUE = eINSTANCE.getDirectionDatumCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_DATUM_CODE_TYPE__ID = eINSTANCE.getDirectionDatumCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_DATUM_CODE_TYPE__METADATA = eINSTANCE.getDirectionDatumCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_DATUM_CODE_TYPE__REF = eINSTANCE.getDirectionDatumCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_DATUM_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getDirectionDatumCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTION_DATUM_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDirectionDatumCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.impl.VerticalDatumCodeTypeImpl <em>Vertical Datum Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl.VerticalDatumCodeTypeImpl
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getVerticalDatumCodeType()
		 * @generated
		 */
		EClass VERTICAL_DATUM_CODE_TYPE = eINSTANCE.getVerticalDatumCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_DATUM_CODE_TYPE__VALUE = eINSTANCE.getVerticalDatumCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_DATUM_CODE_TYPE__ID = eINSTANCE.getVerticalDatumCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_DATUM_CODE_TYPE__METADATA = eINSTANCE.getVerticalDatumCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_DATUM_CODE_TYPE__REF = eINSTANCE.getVerticalDatumCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_DATUM_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getVerticalDatumCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_DATUM_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getVerticalDatumCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType <em>Direction Datum Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getDirectionDatumCodeSimpleType()
		 * @generated
		 */
		EEnum DIRECTION_DATUM_CODE_SIMPLE_TYPE = eINSTANCE.getDirectionDatumCodeSimpleType();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType <em>Vertical Datum Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getVerticalDatumCodeSimpleType()
		 * @generated
		 */
		EEnum VERTICAL_DATUM_CODE_SIMPLE_TYPE = eINSTANCE.getVerticalDatumCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Direction Datum Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.DirectionDatumCodeSimpleType
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getDirectionDatumCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType DIRECTION_DATUM_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getDirectionDatumCodeSimpleTypeObject();

		/**
		 * The meta object literal for the '<em>Vertical Datum Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.VerticalDatumCodeSimpleType
		 * @see gov.niem.release.niem.codes.ngaDatum._3._0.impl._0PackageImpl#getVerticalDatumCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType VERTICAL_DATUM_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getVerticalDatumCodeSimpleTypeObject();

	}

} //_0Package
