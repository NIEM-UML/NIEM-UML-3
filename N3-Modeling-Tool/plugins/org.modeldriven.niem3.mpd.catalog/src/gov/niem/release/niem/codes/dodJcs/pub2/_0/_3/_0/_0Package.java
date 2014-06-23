/**
 */
package gov.niem.release.niem.codes.dodJcs.pub2._0._3._0;

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
 * Intelligence discipline codes.
 * Source: DoD Joint Staff; 
 * Publication: Joint Publication 2.0 - Joint Intelligence; 
 * Date: 22 Jun 2007;  
 * http://www.dtic.mil/doctrine/new_pubs/jp2_0.pdf
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/dod_jcs-pub2.0/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl.DocumentIntelligenceCategoryCodeTypeImpl <em>Document Intelligence Category Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl.DocumentIntelligenceCategoryCodeTypeImpl
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl#getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Document Intelligence Category Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Intelligence Category Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType <em>Document Intelligence Category Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl#getDocumentIntelligenceCategoryCodeSimpleType()
	 * @generated
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Document Intelligence Category Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl#getDocumentIntelligenceCategoryCodeSimpleTypeObject()
	 * @generated
	 */
	int DOCUMENT_INTELLIGENCE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType <em>Document Intelligence Category Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Intelligence Category Code Type</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType
	 * @generated
	 */
	EClass getDocumentIntelligenceCategoryCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getValue()
	 * @see #getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	EAttribute getDocumentIntelligenceCategoryCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getId()
	 * @see #getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	EAttribute getDocumentIntelligenceCategoryCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getMetadata()
	 * @see #getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	EAttribute getDocumentIntelligenceCategoryCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getRef()
	 * @see #getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	EAttribute getDocumentIntelligenceCategoryCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getRelationshipMetadata()
	 * @see #getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	EAttribute getDocumentIntelligenceCategoryCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeType#getAnyAttribute()
	 * @see #getDocumentIntelligenceCategoryCodeType()
	 * @generated
	 */
	EAttribute getDocumentIntelligenceCategoryCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType <em>Document Intelligence Category Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Intelligence Category Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType
	 * @generated
	 */
	EEnum getDocumentIntelligenceCategoryCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType <em>Document Intelligence Category Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document Intelligence Category Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType"
	 *        extendedMetaData="name='DocumentIntelligenceCategoryCodeSimpleType:Object' baseType='DocumentIntelligenceCategoryCodeSimpleType'"
	 * @generated
	 */
	EDataType getDocumentIntelligenceCategoryCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl.DocumentIntelligenceCategoryCodeTypeImpl <em>Document Intelligence Category Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl.DocumentIntelligenceCategoryCodeTypeImpl
		 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl#getDocumentIntelligenceCategoryCodeType()
		 * @generated
		 */
		EClass DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE = eINSTANCE.getDocumentIntelligenceCategoryCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__VALUE = eINSTANCE.getDocumentIntelligenceCategoryCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__ID = eINSTANCE.getDocumentIntelligenceCategoryCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__METADATA = eINSTANCE.getDocumentIntelligenceCategoryCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__REF = eINSTANCE.getDocumentIntelligenceCategoryCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getDocumentIntelligenceCategoryCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INTELLIGENCE_CATEGORY_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getDocumentIntelligenceCategoryCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType <em>Document Intelligence Category Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType
		 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl#getDocumentIntelligenceCategoryCodeSimpleType()
		 * @generated
		 */
		EEnum DOCUMENT_INTELLIGENCE_CATEGORY_CODE_SIMPLE_TYPE = eINSTANCE.getDocumentIntelligenceCategoryCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Document Intelligence Category Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.DocumentIntelligenceCategoryCodeSimpleType
		 * @see gov.niem.release.niem.codes.dodJcs.pub2._0._3._0.impl._0PackageImpl#getDocumentIntelligenceCategoryCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType DOCUMENT_INTELLIGENCE_CATEGORY_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getDocumentIntelligenceCategoryCodeSimpleTypeObject();

	}

} //_0Package
