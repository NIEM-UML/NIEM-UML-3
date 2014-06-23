/**
 */
package gov.niem.niem.wantlist._2.impl;

import gov.niem.niem.wantlist._2.AllNNIMember1;
import gov.niem.niem.wantlist._2.AttributeInTypeType;
import gov.niem.niem.wantlist._2.AttributeType;
import gov.niem.niem.wantlist._2.DocumentRoot;
import gov.niem.niem.wantlist._2.ElementInTypeType;
import gov.niem.niem.wantlist._2.ElementType;
import gov.niem.niem.wantlist._2.FacetFacetType;
import gov.niem.niem.wantlist._2.FacetType;
import gov.niem.niem.wantlist._2.TypeType;
import gov.niem.niem.wantlist._2.UnionMemberType;
import gov.niem.niem.wantlist._2.WantListType;

import gov.niem.niem.wantlist._2.util.wantlistValidator;

import gov.niem.niem.wantlist._2.wantlistFactory;
import gov.niem.niem.wantlist._2.wantlistPackage;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class wantlistPackageImpl extends EPackageImpl implements wantlistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeInTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementInTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionMemberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wantListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allNNIMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum facetFacetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allNNIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allNNIMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType facetFacetTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerListTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.niem.niem.wantlist._2.wantlistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private wantlistPackageImpl() {
		super(eNS_URI, wantlistFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link wantlistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static wantlistPackage init() {
		if (isInited) return (wantlistPackage)EPackage.Registry.INSTANCE.getEPackage(wantlistPackage.eNS_URI);

		// Obtain or create and register package
		wantlistPackageImpl thewantlistPackage = (wantlistPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof wantlistPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new wantlistPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thewantlistPackage.createPackageContents();

		// Initialize created meta-data
		thewantlistPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thewantlistPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return wantlistValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thewantlistPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(wantlistPackage.eNS_URI, thewantlistPackage);
		return thewantlistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeInTypeType() {
		return attributeInTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeInTypeType_MaxOccurs() {
		return (EAttribute)attributeInTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeInTypeType_MinOccurs() {
		return (EAttribute)attributeInTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeInTypeType_Name() {
		return (EAttribute)attributeInTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeInTypeType_Qualifier() {
		return (EAttribute)attributeInTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Name() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Qualifier() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WantList() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementInTypeType() {
		return elementInTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInTypeType_Choice() {
		return (EAttribute)elementInTypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInTypeType_IsReference() {
		return (EAttribute)elementInTypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInTypeType_MaxOccurs() {
		return (EAttribute)elementInTypeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInTypeType_MinOccurs() {
		return (EAttribute)elementInTypeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInTypeType_Name() {
		return (EAttribute)elementInTypeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementInTypeType_Qualifier() {
		return (EAttribute)elementInTypeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementType() {
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_IsReference() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Name() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Nillable() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementType_Qualifier() {
		return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetType() {
		return facetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetType_Facet() {
		return (EAttribute)facetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetType_Value() {
		return (EAttribute)facetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeType() {
		return typeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeType_AttributeInType() {
		return (EReference)typeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeType_ElementInType() {
		return (EReference)typeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeType_Facet() {
		return (EReference)typeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeType_UnionMember() {
		return (EReference)typeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeType_IsRequested() {
		return (EAttribute)typeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeType_Name() {
		return (EAttribute)typeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionMemberType() {
		return unionMemberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnionMemberType_Type() {
		return (EAttribute)unionMemberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWantListType() {
		return wantListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWantListType_Attribute() {
		return (EReference)wantListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWantListType_Element() {
		return (EReference)wantListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWantListType_Type() {
		return (EReference)wantListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWantListType_NillableDefault() {
		return (EAttribute)wantListTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWantListType_Product() {
		return (EAttribute)wantListTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWantListType_Release() {
		return (EAttribute)wantListTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllNNIMember1() {
		return allNNIMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFacetFacetType() {
		return facetFacetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllNNI() {
		return allNNIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllNNIMember1Object() {
		return allNNIMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFacetFacetTypeObject() {
		return facetFacetTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveIntegerListType() {
		return positiveIntegerListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionType() {
		return versionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public wantlistFactory getwantlistFactory() {
		return (wantlistFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeInTypeTypeEClass = createEClass(ATTRIBUTE_IN_TYPE_TYPE);
		createEAttribute(attributeInTypeTypeEClass, ATTRIBUTE_IN_TYPE_TYPE__MAX_OCCURS);
		createEAttribute(attributeInTypeTypeEClass, ATTRIBUTE_IN_TYPE_TYPE__MIN_OCCURS);
		createEAttribute(attributeInTypeTypeEClass, ATTRIBUTE_IN_TYPE_TYPE__NAME);
		createEAttribute(attributeInTypeTypeEClass, ATTRIBUTE_IN_TYPE_TYPE__QUALIFIER);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__QUALIFIER);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WANT_LIST);

		elementInTypeTypeEClass = createEClass(ELEMENT_IN_TYPE_TYPE);
		createEAttribute(elementInTypeTypeEClass, ELEMENT_IN_TYPE_TYPE__CHOICE);
		createEAttribute(elementInTypeTypeEClass, ELEMENT_IN_TYPE_TYPE__IS_REFERENCE);
		createEAttribute(elementInTypeTypeEClass, ELEMENT_IN_TYPE_TYPE__MAX_OCCURS);
		createEAttribute(elementInTypeTypeEClass, ELEMENT_IN_TYPE_TYPE__MIN_OCCURS);
		createEAttribute(elementInTypeTypeEClass, ELEMENT_IN_TYPE_TYPE__NAME);
		createEAttribute(elementInTypeTypeEClass, ELEMENT_IN_TYPE_TYPE__QUALIFIER);

		elementTypeEClass = createEClass(ELEMENT_TYPE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__IS_REFERENCE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAME);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__NILLABLE);
		createEAttribute(elementTypeEClass, ELEMENT_TYPE__QUALIFIER);

		facetTypeEClass = createEClass(FACET_TYPE);
		createEAttribute(facetTypeEClass, FACET_TYPE__FACET);
		createEAttribute(facetTypeEClass, FACET_TYPE__VALUE);

		typeTypeEClass = createEClass(TYPE_TYPE);
		createEReference(typeTypeEClass, TYPE_TYPE__ATTRIBUTE_IN_TYPE);
		createEReference(typeTypeEClass, TYPE_TYPE__ELEMENT_IN_TYPE);
		createEReference(typeTypeEClass, TYPE_TYPE__FACET);
		createEReference(typeTypeEClass, TYPE_TYPE__UNION_MEMBER);
		createEAttribute(typeTypeEClass, TYPE_TYPE__IS_REQUESTED);
		createEAttribute(typeTypeEClass, TYPE_TYPE__NAME);

		unionMemberTypeEClass = createEClass(UNION_MEMBER_TYPE);
		createEAttribute(unionMemberTypeEClass, UNION_MEMBER_TYPE__TYPE);

		wantListTypeEClass = createEClass(WANT_LIST_TYPE);
		createEReference(wantListTypeEClass, WANT_LIST_TYPE__ATTRIBUTE);
		createEReference(wantListTypeEClass, WANT_LIST_TYPE__ELEMENT);
		createEReference(wantListTypeEClass, WANT_LIST_TYPE__TYPE);
		createEAttribute(wantListTypeEClass, WANT_LIST_TYPE__NILLABLE_DEFAULT);
		createEAttribute(wantListTypeEClass, WANT_LIST_TYPE__PRODUCT);
		createEAttribute(wantListTypeEClass, WANT_LIST_TYPE__RELEASE);

		// Create enums
		allNNIMember1EEnum = createEEnum(ALL_NNI_MEMBER1);
		facetFacetTypeEEnum = createEEnum(FACET_FACET_TYPE);

		// Create data types
		allNNIEDataType = createEDataType(ALL_NNI);
		allNNIMember1ObjectEDataType = createEDataType(ALL_NNI_MEMBER1_OBJECT);
		facetFacetTypeObjectEDataType = createEDataType(FACET_FACET_TYPE_OBJECT);
		positiveIntegerListTypeEDataType = createEDataType(POSITIVE_INTEGER_LIST_TYPE);
		versionTypeEDataType = createEDataType(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeInTypeTypeEClass, AttributeInTypeType.class, "AttributeInTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeInTypeType_MaxOccurs(), theXMLTypePackage.getNonNegativeInteger(), "maxOccurs", null, 0, 1, AttributeInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeInTypeType_MinOccurs(), theXMLTypePackage.getNonNegativeInteger(), "minOccurs", null, 0, 1, AttributeInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeInTypeType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, AttributeInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeInTypeType_Qualifier(), theXMLTypePackage.getNCName(), "qualifier", null, 0, 1, AttributeInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Qualifier(), theXMLTypePackage.getNCName(), "qualifier", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WantList(), this.getWantListType(), null, "wantList", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementInTypeTypeEClass, ElementInTypeType.class, "ElementInTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementInTypeType_Choice(), this.getPositiveIntegerListType(), "choice", null, 0, 1, ElementInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInTypeType_IsReference(), theXMLTypePackage.getBoolean(), "isReference", null, 1, 1, ElementInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInTypeType_MaxOccurs(), this.getAllNNI(), "maxOccurs", null, 0, 1, ElementInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInTypeType_MinOccurs(), theXMLTypePackage.getNonNegativeInteger(), "minOccurs", null, 0, 1, ElementInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInTypeType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, ElementInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementInTypeType_Qualifier(), theXMLTypePackage.getNCName(), "qualifier", null, 0, 1, ElementInTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementType_IsReference(), theXMLTypePackage.getBoolean(), "isReference", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Nillable(), theXMLTypePackage.getBoolean(), "nillable", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementType_Qualifier(), theXMLTypePackage.getNCName(), "qualifier", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetTypeEClass, FacetType.class, "FacetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacetType_Facet(), this.getFacetFacetType(), "facet", null, 1, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetType_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 1, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeTypeEClass, TypeType.class, "TypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeType_AttributeInType(), this.getAttributeInTypeType(), null, "attributeInType", null, 0, -1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeType_ElementInType(), this.getElementInTypeType(), null, "elementInType", null, 0, -1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeType_Facet(), this.getFacetType(), null, "facet", null, 0, -1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeType_UnionMember(), this.getUnionMemberType(), null, "unionMember", null, 0, -1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeType_IsRequested(), theXMLTypePackage.getBoolean(), "isRequested", null, 1, 1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeType_Name(), theXMLTypePackage.getQName(), "name", null, 1, 1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionMemberTypeEClass, UnionMemberType.class, "UnionMemberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnionMemberType_Type(), theXMLTypePackage.getQName(), "type", null, 1, 1, UnionMemberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wantListTypeEClass, WantListType.class, "WantListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWantListType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, WantListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWantListType_Element(), this.getElementType(), null, "element", null, 0, -1, WantListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWantListType_Type(), this.getTypeType(), null, "type", null, 0, -1, WantListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWantListType_NillableDefault(), theXMLTypePackage.getBoolean(), "nillableDefault", null, 1, 1, WantListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWantListType_Product(), theXMLTypePackage.getString(), "product", null, 1, 1, WantListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWantListType_Release(), this.getVersionType(), "release", null, 1, 1, WantListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allNNIMember1EEnum, AllNNIMember1.class, "AllNNIMember1");
		addEEnumLiteral(allNNIMember1EEnum, AllNNIMember1.UNBOUNDED);

		initEEnum(facetFacetTypeEEnum, FacetFacetType.class, "FacetFacetType");
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.MIN_EXCLUSIVE);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.MIN_INCLUSIVE);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.MAX_EXCLUSIVE);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.MAX_INCLUSIVE);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.TOTAL_DIGITS);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.FRACTION_DIGITS);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.LENGTH);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.MIN_LENGTH);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.MAX_LENGTH);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.ENUMERATION);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.WHITE_SPACE);
		addEEnumLiteral(facetFacetTypeEEnum, FacetFacetType.PATTERN);

		// Initialize data types
		initEDataType(allNNIEDataType, Object.class, "AllNNI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(allNNIMember1ObjectEDataType, AllNNIMember1.class, "AllNNIMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(facetFacetTypeObjectEDataType, FacetFacetType.class, "FacetFacetTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntegerListTypeEDataType, List.class, "PositiveIntegerListType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeEDataType, String.class, "VersionType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (allNNIEDataType, 
		   source, 
		   new String[] {
			 "name", "allNNI",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger allNNI_._member_._1"
		   });		
		addAnnotation
		  (allNNIMember1EEnum, 
		   source, 
		   new String[] {
			 "name", "allNNI_._member_._1"
		   });		
		addAnnotation
		  (allNNIMember1ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "allNNI_._member_._1:Object",
			 "baseType", "allNNI_._member_._1"
		   });		
		addAnnotation
		  (attributeInTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributeInTypeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAttributeInTypeType_MaxOccurs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxOccurs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeInTypeType_MinOccurs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minOccurs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeInTypeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeInTypeType_Qualifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (attributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AttributeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAttributeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Qualifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_WantList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WantList",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (elementInTypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ElementInTypeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getElementInTypeType_Choice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "choice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementInTypeType_IsReference(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementInTypeType_MaxOccurs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxOccurs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementInTypeType_MinOccurs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "minOccurs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementInTypeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementInTypeType_Qualifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (elementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ElementType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getElementType_IsReference(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isReference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementType_Nillable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nillable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getElementType_Qualifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "qualifier",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (facetFacetTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "FacetFacetType"
		   });		
		addAnnotation
		  (facetFacetTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "FacetFacetType:Object",
			 "baseType", "FacetFacetType"
		   });		
		addAnnotation
		  (facetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FacetType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFacetType_Facet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "facet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFacetType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (positiveIntegerListTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "PositiveIntegerListType",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#positiveInteger"
		   });		
		addAnnotation
		  (typeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeType_AttributeInType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AttributeInType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeType_ElementInType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ElementInType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeType_Facet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Facet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeType_UnionMember(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UnionMember",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeType_IsRequested(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isRequested",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (unionMemberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UnionMemberType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getUnionMemberType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (versionTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "VersionType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[0-9]+(\\.[0-9]+)*((alpha|beta|rc)[0-9]+)?(-[A-z]+)*"
		   });		
		addAnnotation
		  (wantListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WantListType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWantListType_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Attribute",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWantListType_Element(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWantListType_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWantListType_NillableDefault(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nillableDefault",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWantListType_Product(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "product",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getWantListType_Release(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "release",
			 "namespace", "##targetNamespace"
		   });
	}

} //wantlistPackageImpl
