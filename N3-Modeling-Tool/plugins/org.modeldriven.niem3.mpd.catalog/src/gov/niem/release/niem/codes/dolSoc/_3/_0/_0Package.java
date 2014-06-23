/**
 */
package gov.niem.release.niem.codes.dolSoc._3._0;

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
 * US Department of Labor occupation codes.
 * Publication: Standard Occupational Classification (SOC); 
 * Version: 2010; 
 * http://www.bls.gov/SOC/
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.dolSoc._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/dol_soc/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.dolSoc._3._0.impl.OccupationCodeTypeImpl <em>Occupation Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.impl.OccupationCodeTypeImpl
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl#getOccupationCodeType()
	 * @generated
	 */
	int OCCUPATION_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Occupation Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Occupation Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCUPATION_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType <em>Occupation Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl#getOccupationCodeSimpleType()
	 * @generated
	 */
	int OCCUPATION_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Occupation Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.impl._0PackageImpl#getOccupationCodeSimpleTypeObject()
	 * @generated
	 */
	int OCCUPATION_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType <em>Occupation Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occupation Code Type</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType
	 * @generated
	 */
	EClass getOccupationCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getValue()
	 * @see #getOccupationCodeType()
	 * @generated
	 */
	EAttribute getOccupationCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getId()
	 * @see #getOccupationCodeType()
	 * @generated
	 */
	EAttribute getOccupationCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getMetadata()
	 * @see #getOccupationCodeType()
	 * @generated
	 */
	EAttribute getOccupationCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getRef()
	 * @see #getOccupationCodeType()
	 * @generated
	 */
	EAttribute getOccupationCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getRelationshipMetadata()
	 * @see #getOccupationCodeType()
	 * @generated
	 */
	EAttribute getOccupationCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeType#getAnyAttribute()
	 * @see #getOccupationCodeType()
	 * @generated
	 */
	EAttribute getOccupationCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType <em>Occupation Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occupation Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType
	 * @generated
	 */
	EEnum getOccupationCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType <em>Occupation Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Occupation Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.dolSoc._3._0.OccupationCodeSimpleType"
	 *        extendedMetaData="name='OccupationCodeSimpleType:Object' baseType='OccupationCodeSimpleType'"
	 * @generated
	 */
	EDataType getOccupationCodeSimpleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

} //_0Package
