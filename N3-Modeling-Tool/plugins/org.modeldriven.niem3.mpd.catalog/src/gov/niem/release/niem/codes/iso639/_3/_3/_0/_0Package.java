/**
 */
package gov.niem.release.niem.codes.iso639._3._3._0;

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
 * Publication: Codes for the representation of names of languages -- Part 3: Alpha-3 code for comprehensive coverage of languages; 
 * Version: ISO 639-3:2007; 
 * Date: 2007; 
 * Source Updates: 5 Feb 2007; 
 * http://www.sil.org/iso639-3/
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.iso639._3._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/iso_639-3/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.iso639._3._3._0.impl.LanguageCodeTypeImpl <em>Language Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.impl.LanguageCodeTypeImpl
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl#getLanguageCodeType()
	 * @generated
	 */
	int LANGUAGE_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Language Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Language Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType <em>Language Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl#getLanguageCodeSimpleType()
	 * @generated
	 */
	int LANGUAGE_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Language Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.impl._0PackageImpl#getLanguageCodeSimpleTypeObject()
	 * @generated
	 */
	int LANGUAGE_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType <em>Language Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Code Type</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType
	 * @generated
	 */
	EClass getLanguageCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getValue()
	 * @see #getLanguageCodeType()
	 * @generated
	 */
	EAttribute getLanguageCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getId()
	 * @see #getLanguageCodeType()
	 * @generated
	 */
	EAttribute getLanguageCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getMetadata()
	 * @see #getLanguageCodeType()
	 * @generated
	 */
	EAttribute getLanguageCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getRef()
	 * @see #getLanguageCodeType()
	 * @generated
	 */
	EAttribute getLanguageCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getRelationshipMetadata()
	 * @see #getLanguageCodeType()
	 * @generated
	 */
	EAttribute getLanguageCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeType#getAnyAttribute()
	 * @see #getLanguageCodeType()
	 * @generated
	 */
	EAttribute getLanguageCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType <em>Language Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType
	 * @generated
	 */
	EEnum getLanguageCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType <em>Language Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.iso639._3._3._0.LanguageCodeSimpleType"
	 *        extendedMetaData="name='LanguageCodeSimpleType:Object' baseType='LanguageCodeSimpleType'"
	 * @generated
	 */
	EDataType getLanguageCodeSimpleTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_0Factory get_0Factory();

} //_0Package
