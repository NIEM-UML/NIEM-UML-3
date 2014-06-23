/**
 */
package gov.niem.reference.niem.resource.mpd.catalog._3._0.impl;

import gov.niem.reference.niem.resource.mpd.catalog._3._0.*;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _0FactoryImpl extends EFactoryImpl implements _0Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _0Factory init() {
		try {
			_0Factory the_0Factory = (_0Factory)EPackage.Registry.INSTANCE.getEFactory(_0Package.eNS_URI);
			if (the_0Factory != null) {
				return the_0Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _0FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _0Package.CATALOG_TYPE: return createCatalogType();
			case _0Package.CONFORMANCE_TARGET_TYPE: return createConformanceTargetType();
			case _0Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _0Package.FILE_SET_TYPE: return createFileSetType();
			case _0Package.FILE_TYPE: return createFileType();
			case _0Package.IEP_CONFORMANCE_TARGET_TYPE: return createIEPConformanceTargetType();
			case _0Package.MPD_INFORMATION_TYPE: return createMPDInformationType();
			case _0Package.MPD_TYPE: return createMPDType();
			case _0Package.QUALIFIED_NAMES_TYPE: return createQualifiedNamesType();
			case _0Package.REFERENCE_SCHEMA_DOCUMENT_SET_TYPE: return createReferenceSchemaDocumentSetType();
			case _0Package.RELATIONSHIP_TYPE: return createRelationshipType();
			case _0Package.RELAX_NG_VALIDATION_TYPE: return createRelaxNGValidationType();
			case _0Package.SCHEMA_DOCUMENT_SET_TYPE: return createSchemaDocumentSetType();
			case _0Package.SCHEMATRON_VALIDATION_TYPE: return createSchematronValidationType();
			case _0Package.TEXT_RULE_TYPE: return createTextRuleType();
			case _0Package.VALIDITY_CONTEXT_TYPE: return createValidityContextType();
			case _0Package.XML_SCHEMA_TYPE: return createXMLSchemaType();
			case _0Package.XPATH_TYPE: return createXPathType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _0Package.MPD_CLASS_CODE_SIMPLE_TYPE:
				return createMPDClassCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.RELATIONSHIP_CODE_SIMPLE_TYPE:
				return createRelationshipCodeSimpleTypeFromString(eDataType, initialValue);
			case _0Package.CLASS_LIST_SIMPLE_TYPE:
				return createClassListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.CLASS_UNION_SIMPLE_TYPE:
				return createClassUnionSimpleTypeFromString(eDataType, initialValue);
			case _0Package.MPD_CLASS_CODE_SIMPLE_TYPE_OBJECT:
				return createMPDClassCodeSimpleTypeObjectFromString(eDataType, initialValue);
			case _0Package.MPD_CLASS_LIST_SIMPLE_TYPE:
				return createMPDClassListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.MPD_NAME_SIMPLE_TYPE:
				return createMPDNameSimpleTypeFromString(eDataType, initialValue);
			case _0Package.MPD_VERSION_ID_SIMPLE_TYPE:
				return createMPDVersionIDSimpleTypeFromString(eDataType, initialValue);
			case _0Package.QUALIFIED_NAME_LIST_SIMPLE_TYPE:
				return createQualifiedNameListSimpleTypeFromString(eDataType, initialValue);
			case _0Package.RELATIONSHIP_CODE_SIMPLE_TYPE_OBJECT:
				return createRelationshipCodeSimpleTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _0Package.MPD_CLASS_CODE_SIMPLE_TYPE:
				return convertMPDClassCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.RELATIONSHIP_CODE_SIMPLE_TYPE:
				return convertRelationshipCodeSimpleTypeToString(eDataType, instanceValue);
			case _0Package.CLASS_LIST_SIMPLE_TYPE:
				return convertClassListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.CLASS_UNION_SIMPLE_TYPE:
				return convertClassUnionSimpleTypeToString(eDataType, instanceValue);
			case _0Package.MPD_CLASS_CODE_SIMPLE_TYPE_OBJECT:
				return convertMPDClassCodeSimpleTypeObjectToString(eDataType, instanceValue);
			case _0Package.MPD_CLASS_LIST_SIMPLE_TYPE:
				return convertMPDClassListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.MPD_NAME_SIMPLE_TYPE:
				return convertMPDNameSimpleTypeToString(eDataType, instanceValue);
			case _0Package.MPD_VERSION_ID_SIMPLE_TYPE:
				return convertMPDVersionIDSimpleTypeToString(eDataType, instanceValue);
			case _0Package.QUALIFIED_NAME_LIST_SIMPLE_TYPE:
				return convertQualifiedNameListSimpleTypeToString(eDataType, instanceValue);
			case _0Package.RELATIONSHIP_CODE_SIMPLE_TYPE_OBJECT:
				return convertRelationshipCodeSimpleTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogType createCatalogType() {
		CatalogTypeImpl catalogType = new CatalogTypeImpl();
		return catalogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConformanceTargetType createConformanceTargetType() {
		ConformanceTargetTypeImpl conformanceTargetType = new ConformanceTargetTypeImpl();
		return conformanceTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSetType createFileSetType() {
		FileSetTypeImpl fileSetType = new FileSetTypeImpl();
		return fileSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEPConformanceTargetType createIEPConformanceTargetType() {
		IEPConformanceTargetTypeImpl iepConformanceTargetType = new IEPConformanceTargetTypeImpl();
		return iepConformanceTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDInformationType createMPDInformationType() {
		MPDInformationTypeImpl mpdInformationType = new MPDInformationTypeImpl();
		return mpdInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDType createMPDType() {
		MPDTypeImpl mpdType = new MPDTypeImpl();
		return mpdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedNamesType createQualifiedNamesType() {
		QualifiedNamesTypeImpl qualifiedNamesType = new QualifiedNamesTypeImpl();
		return qualifiedNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceSchemaDocumentSetType createReferenceSchemaDocumentSetType() {
		ReferenceSchemaDocumentSetTypeImpl referenceSchemaDocumentSetType = new ReferenceSchemaDocumentSetTypeImpl();
		return referenceSchemaDocumentSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelaxNGValidationType createRelaxNGValidationType() {
		RelaxNGValidationTypeImpl relaxNGValidationType = new RelaxNGValidationTypeImpl();
		return relaxNGValidationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDocumentSetType createSchemaDocumentSetType() {
		SchemaDocumentSetTypeImpl schemaDocumentSetType = new SchemaDocumentSetTypeImpl();
		return schemaDocumentSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchematronValidationType createSchematronValidationType() {
		SchematronValidationTypeImpl schematronValidationType = new SchematronValidationTypeImpl();
		return schematronValidationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRuleType createTextRuleType() {
		TextRuleTypeImpl textRuleType = new TextRuleTypeImpl();
		return textRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidityContextType createValidityContextType() {
		ValidityContextTypeImpl validityContextType = new ValidityContextTypeImpl();
		return validityContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLSchemaType createXMLSchemaType() {
		XMLSchemaTypeImpl xmlSchemaType = new XMLSchemaTypeImpl();
		return xmlSchemaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPathType createXPathType() {
		XPathTypeImpl xPathType = new XPathTypeImpl();
		return xPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDClassCodeSimpleType createMPDClassCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		MPDClassCodeSimpleType result = MPDClassCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPDClassCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipCodeSimpleType createRelationshipCodeSimpleTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipCodeSimpleType result = RelationshipCodeSimpleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipCodeSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createClassListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createClassUnionSimpleTypeFromString(_0Package.Literals.CLASS_UNION_SIMPLE_TYPE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertClassUnionSimpleTypeToString(_0Package.Literals.CLASS_UNION_SIMPLE_TYPE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createClassUnionSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMPDClassCodeSimpleTypeFromString(_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassUnionSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE.isInstance(instanceValue)) {
			try {
				String value = convertMPDClassCodeSimpleTypeToString(_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPDClassCodeSimpleType createMPDClassCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMPDClassCodeSimpleTypeFromString(_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPDClassCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMPDClassCodeSimpleTypeToString(_0Package.Literals.MPD_CLASS_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createMPDClassListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return createClassListSimpleTypeFromString(_0Package.Literals.CLASS_LIST_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPDClassListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return convertClassListSimpleTypeToString(_0Package.Literals.CLASS_LIST_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMPDNameSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPDNameSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMPDVersionIDSimpleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPDVersionIDSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createQualifiedNameListSimpleTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<QName> result = new ArrayList<QName>();
		for (String item : split(initialValue)) {
			result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualifiedNameListSimpleTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipCodeSimpleType createRelationshipCodeSimpleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelationshipCodeSimpleTypeFromString(_0Package.Literals.RELATIONSHIP_CODE_SIMPLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipCodeSimpleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelationshipCodeSimpleTypeToString(_0Package.Literals.RELATIONSHIP_CODE_SIMPLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _0Package get_0Package() {
		return (_0Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _0Package getPackage() {
		return _0Package.eINSTANCE;
	}

} //_0FactoryImpl
