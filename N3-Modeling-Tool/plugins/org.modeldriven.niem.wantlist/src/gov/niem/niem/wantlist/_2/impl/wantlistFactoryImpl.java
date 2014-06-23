/**
 */
package gov.niem.niem.wantlist._2.impl;

import gov.niem.niem.wantlist._2.*;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

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
public class wantlistFactoryImpl extends EFactoryImpl implements wantlistFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static wantlistFactory init() {
		try {
			wantlistFactory thewantlistFactory = (wantlistFactory)EPackage.Registry.INSTANCE.getEFactory(wantlistPackage.eNS_URI);
			if (thewantlistFactory != null) {
				return thewantlistFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new wantlistFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wantlistFactoryImpl() {
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
			case wantlistPackage.ATTRIBUTE_IN_TYPE_TYPE: return createAttributeInTypeType();
			case wantlistPackage.ATTRIBUTE_TYPE: return createAttributeType();
			case wantlistPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case wantlistPackage.ELEMENT_IN_TYPE_TYPE: return createElementInTypeType();
			case wantlistPackage.ELEMENT_TYPE: return createElementType();
			case wantlistPackage.FACET_TYPE: return createFacetType();
			case wantlistPackage.TYPE_TYPE: return createTypeType();
			case wantlistPackage.UNION_MEMBER_TYPE: return createUnionMemberType();
			case wantlistPackage.WANT_LIST_TYPE: return createWantListType();
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
			case wantlistPackage.ALL_NNI_MEMBER1:
				return createAllNNIMember1FromString(eDataType, initialValue);
			case wantlistPackage.FACET_FACET_TYPE:
				return createFacetFacetTypeFromString(eDataType, initialValue);
			case wantlistPackage.ALL_NNI:
				return createAllNNIFromString(eDataType, initialValue);
			case wantlistPackage.ALL_NNI_MEMBER1_OBJECT:
				return createAllNNIMember1ObjectFromString(eDataType, initialValue);
			case wantlistPackage.FACET_FACET_TYPE_OBJECT:
				return createFacetFacetTypeObjectFromString(eDataType, initialValue);
			case wantlistPackage.POSITIVE_INTEGER_LIST_TYPE:
				return createPositiveIntegerListTypeFromString(eDataType, initialValue);
			case wantlistPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
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
			case wantlistPackage.ALL_NNI_MEMBER1:
				return convertAllNNIMember1ToString(eDataType, instanceValue);
			case wantlistPackage.FACET_FACET_TYPE:
				return convertFacetFacetTypeToString(eDataType, instanceValue);
			case wantlistPackage.ALL_NNI:
				return convertAllNNIToString(eDataType, instanceValue);
			case wantlistPackage.ALL_NNI_MEMBER1_OBJECT:
				return convertAllNNIMember1ObjectToString(eDataType, instanceValue);
			case wantlistPackage.FACET_FACET_TYPE_OBJECT:
				return convertFacetFacetTypeObjectToString(eDataType, instanceValue);
			case wantlistPackage.POSITIVE_INTEGER_LIST_TYPE:
				return convertPositiveIntegerListTypeToString(eDataType, instanceValue);
			case wantlistPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeInTypeType createAttributeInTypeType() {
		AttributeInTypeTypeImpl attributeInTypeType = new AttributeInTypeTypeImpl();
		return attributeInTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
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
	public ElementInTypeType createElementInTypeType() {
		ElementInTypeTypeImpl elementInTypeType = new ElementInTypeTypeImpl();
		return elementInTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementType() {
		ElementTypeImpl elementType = new ElementTypeImpl();
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType createFacetType() {
		FacetTypeImpl facetType = new FacetTypeImpl();
		return facetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeType() {
		TypeTypeImpl typeType = new TypeTypeImpl();
		return typeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionMemberType createUnionMemberType() {
		UnionMemberTypeImpl unionMemberType = new UnionMemberTypeImpl();
		return unionMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WantListType createWantListType() {
		WantListTypeImpl wantListType = new WantListTypeImpl();
		return wantListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllNNIMember1 createAllNNIMember1FromString(EDataType eDataType, String initialValue) {
		AllNNIMember1 result = AllNNIMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllNNIMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetFacetType createFacetFacetTypeFromString(EDataType eDataType, String initialValue) {
		FacetFacetType result = FacetFacetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacetFacetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createAllNNIFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createAllNNIMember1FromString(wantlistPackage.Literals.ALL_NNI_MEMBER1, initialValue);
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
	public String convertAllNNIToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (wantlistPackage.Literals.ALL_NNI_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertAllNNIMember1ToString(wantlistPackage.Literals.ALL_NNI_MEMBER1, instanceValue);
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
	public AllNNIMember1 createAllNNIMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createAllNNIMember1FromString(wantlistPackage.Literals.ALL_NNI_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllNNIMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAllNNIMember1ToString(wantlistPackage.Literals.ALL_NNI_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetFacetType createFacetFacetTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFacetFacetTypeFromString(wantlistPackage.Literals.FACET_FACET_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacetFacetTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFacetFacetTypeToString(wantlistPackage.Literals.FACET_FACET_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createPositiveIntegerListTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerListTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.POSITIVE_INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wantlistPackage getwantlistPackage() {
		return (wantlistPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static wantlistPackage getPackage() {
		return wantlistPackage.eINSTANCE;
	}

} //wantlistFactoryImpl
