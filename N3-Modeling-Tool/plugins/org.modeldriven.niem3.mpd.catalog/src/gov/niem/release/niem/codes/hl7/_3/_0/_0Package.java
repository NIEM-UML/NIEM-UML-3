/**
 */
package gov.niem.release.niem.codes.hl7._3._0;

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
 * Source: Health (HL-7); 
 * Publication: Religion-HL7 Table 0006_VD; 
 * Date: 19 Jul 2004;   http://ushik.ahrq.gov/dr.ui.drConceptualDomain_View?System=mdr&ConceptualDomainID=74288000&ViewDownFile=yes&DownFile=Co
 * <!-- end-model-doc -->
 * @see gov.niem.release.niem.codes.hl7._3._0._0Factory
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
	String eNS_URI = "http://release.niem.gov/niem/codes/hl7/3.0/";

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
	_0Package eINSTANCE = gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.hl7._3._0.impl.ReligionCodeTypeImpl <em>Religion Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.hl7._3._0.impl.ReligionCodeTypeImpl
	 * @see gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl#getReligionCodeType()
	 * @generated
	 */
	int RELIGION_CODE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE__REF = 3;

	/**
	 * The feature id for the '<em><b>Relationship Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE__RELATIONSHIP_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Religion Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Religion Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIGION_CODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType <em>Religion Code Simple Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType
	 * @see gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl#getReligionCodeSimpleType()
	 * @generated
	 */
	int RELIGION_CODE_SIMPLE_TYPE = 1;

	/**
	 * The meta object id for the '<em>Religion Code Simple Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType
	 * @see gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl#getReligionCodeSimpleTypeObject()
	 * @generated
	 */
	int RELIGION_CODE_SIMPLE_TYPE_OBJECT = 2;


	/**
	 * Returns the meta object for class '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType <em>Religion Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Religion Code Type</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType
	 * @generated
	 */
	EClass getReligionCodeType();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getValue()
	 * @see #getReligionCodeType()
	 * @generated
	 */
	EAttribute getReligionCodeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getId()
	 * @see #getReligionCodeType()
	 * @generated
	 */
	EAttribute getReligionCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getMetadata()
	 * @see #getReligionCodeType()
	 * @generated
	 */
	EAttribute getReligionCodeType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getRef()
	 * @see #getReligionCodeType()
	 * @generated
	 */
	EAttribute getReligionCodeType_Ref();

	/**
	 * Returns the meta object for the attribute '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getRelationshipMetadata <em>Relationship Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Metadata</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getRelationshipMetadata()
	 * @see #getReligionCodeType()
	 * @generated
	 */
	EAttribute getReligionCodeType_RelationshipMetadata();

	/**
	 * Returns the meta object for the attribute list '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeType#getAnyAttribute()
	 * @see #getReligionCodeType()
	 * @generated
	 */
	EAttribute getReligionCodeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType <em>Religion Code Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Religion Code Simple Type</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType
	 * @generated
	 */
	EEnum getReligionCodeSimpleType();

	/**
	 * Returns the meta object for data type '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType <em>Religion Code Simple Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Religion Code Simple Type Object</em>'.
	 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType
	 * @model instanceClass="gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType"
	 *        extendedMetaData="name='ReligionCodeSimpleType:Object' baseType='ReligionCodeSimpleType'"
	 * @generated
	 */
	EDataType getReligionCodeSimpleTypeObject();

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
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.hl7._3._0.impl.ReligionCodeTypeImpl <em>Religion Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.hl7._3._0.impl.ReligionCodeTypeImpl
		 * @see gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl#getReligionCodeType()
		 * @generated
		 */
		EClass RELIGION_CODE_TYPE = eINSTANCE.getReligionCodeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIGION_CODE_TYPE__VALUE = eINSTANCE.getReligionCodeType_Value();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIGION_CODE_TYPE__ID = eINSTANCE.getReligionCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIGION_CODE_TYPE__METADATA = eINSTANCE.getReligionCodeType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIGION_CODE_TYPE__REF = eINSTANCE.getReligionCodeType_Ref();

		/**
		 * The meta object literal for the '<em><b>Relationship Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIGION_CODE_TYPE__RELATIONSHIP_METADATA = eINSTANCE.getReligionCodeType_RelationshipMetadata();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIGION_CODE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getReligionCodeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType <em>Religion Code Simple Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType
		 * @see gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl#getReligionCodeSimpleType()
		 * @generated
		 */
		EEnum RELIGION_CODE_SIMPLE_TYPE = eINSTANCE.getReligionCodeSimpleType();

		/**
		 * The meta object literal for the '<em>Religion Code Simple Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.niem.release.niem.codes.hl7._3._0.ReligionCodeSimpleType
		 * @see gov.niem.release.niem.codes.hl7._3._0.impl._0PackageImpl#getReligionCodeSimpleTypeObject()
		 * @generated
		 */
		EDataType RELIGION_CODE_SIMPLE_TYPE_OBJECT = eINSTANCE.getReligionCodeSimpleTypeObject();

	}

} //_0Package
