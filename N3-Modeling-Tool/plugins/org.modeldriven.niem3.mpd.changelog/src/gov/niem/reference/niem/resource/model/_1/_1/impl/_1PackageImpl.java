/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.niem.structures._2._2Package;

import gov.niem.niem.structures._2.impl._2PackageImpl;

import gov.niem.reference.niem.resource.model._1._1.DocumentRoot;
import gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeSimpleType;
import gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType;
import gov.niem.reference.niem.resource.model._1._1.FacetType;
import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;
import gov.niem.reference.niem.resource.model._1._1.QName;
import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;
import gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeSimpleType;
import gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType;
import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;
import gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeSimpleType;
import gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType;
import gov.niem.reference.niem.resource.model._1._1._1Factory;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1PackageImpl extends EPackageImpl implements _1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facetCategoryCodeTypeEClass = null;

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
	private EClass namespaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeContainsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeContentStyleCodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSimpleStyleCodeTypeEClass = null;

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
	private EEnum facetCategoryCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeContentStyleCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeSimpleStyleCodeSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType facetCategoryCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeContentStyleCodeSimpleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeSimpleStyleCodeSimpleTypeObjectEDataType = null;

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
	 * @see gov.niem.reference.niem.resource.model._1._1._1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _1PackageImpl() {
		super(eNS_URI, _1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link _1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _1Package init() {
		if (isInited) return (_1Package)EPackage.Registry.INSTANCE.getEPackage(_1Package.eNS_URI);

		// Obtain or create and register package
		_1PackageImpl the_1Package = (_1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _1PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		_2PackageImpl the_2Package = (_2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) instanceof _2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI) : _2Package.eINSTANCE);
		gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl the_1Package_1 = (gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package.eNS_URI) instanceof gov.niem.reference.niem.resource.mpd.changelog._1._1.impl._1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package.eNS_URI) : gov.niem.reference.niem.resource.mpd.changelog._1._1._1Package.eINSTANCE);
		gov.niem.niem.proxy.xsd._2.impl._2PackageImpl the_2Package_1 = (gov.niem.niem.proxy.xsd._2.impl._2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.proxy.xsd._2._2Package.eNS_URI) instanceof gov.niem.niem.proxy.xsd._2.impl._2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.proxy.xsd._2._2Package.eNS_URI) : gov.niem.niem.proxy.xsd._2._2Package.eINSTANCE);

		// Create package meta-data objects
		the_1Package.createPackageContents();
		the_2Package.createPackageContents();
		the_1Package_1.createPackageContents();
		the_2Package_1.createPackageContents();

		// Initialize created meta-data
		the_1Package.initializePackageContents();
		the_2Package.initializePackageContents();
		the_1Package_1.initializePackageContents();
		the_2Package_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		the_1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_1Package.eNS_URI, the_1Package);
		return the_1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacetCategoryCodeType() {
		return facetCategoryCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetCategoryCodeType_Value() {
		return (EAttribute)facetCategoryCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetCategoryCodeType_Id() {
		return (EAttribute)facetCategoryCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetCategoryCodeType_LinkMetadata() {
		return (EAttribute)facetCategoryCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacetCategoryCodeType_Metadata() {
		return (EAttribute)facetCategoryCodeTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getFacetType_TypeQualifiedName() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetType_FacetCategoryCode() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetType_FacetText() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacetType_FacetDefinitionText() {
		return (EReference)facetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceType() {
		return namespaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceType_NamespaceURI() {
		return (EReference)namespaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceType_NamespacePrefixText() {
		return (EReference)namespaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceType_NamespaceVersionText() {
		return (EReference)namespaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyObjectType() {
		return propertyObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyQualifiedName() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyName() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyNamespace() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyDefinitionText() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyDataTypeQualifiedName() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertySubstitutionGroupHeadQualifiedName() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyElementIndicator() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyAbstractIndicator() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyInlineIndicator() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyReferenceIndicator() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyObjectType_PropertyAugmentationOfTypeQualifiedName() {
		return (EReference)propertyObjectTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQName() {
		return qNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQName_Value() {
		return (EAttribute)qNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQName_Id() {
		return (EAttribute)qNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQName_LinkMetadata() {
		return (EAttribute)qNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQName_Metadata() {
		return (EAttribute)qNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeContainsPropertyType() {
		return typeContainsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainsPropertyType_TypeQualifiedName() {
		return (EReference)typeContainsPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainsPropertyType_PropertyQualifiedName() {
		return (EReference)typeContainsPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainsPropertyType_PropertyMinOccursText() {
		return (EReference)typeContainsPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainsPropertyType_PropertyMaxOccursText() {
		return (EReference)typeContainsPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainsPropertyType_PropertyInlineIndicator() {
		return (EReference)typeContainsPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainsPropertyType_PropertyReferenceIndicator() {
		return (EReference)typeContainsPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeContentStyleCodeType() {
		return typeContentStyleCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeContentStyleCodeType_Value() {
		return (EAttribute)typeContentStyleCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeContentStyleCodeType_Id() {
		return (EAttribute)typeContentStyleCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeContentStyleCodeType_LinkMetadata() {
		return (EAttribute)typeContentStyleCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeContentStyleCodeType_Metadata() {
		return (EAttribute)typeContentStyleCodeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeObjectType() {
		return typeObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeQualifiedName() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeName() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeNamespace() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeDefinitionText() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeBaseTypeQualifiedName() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeContentStyleCode() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeSimpleStyleCode() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeAssociationIndicator() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeAugmentationIndicator() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeAdapterIndicator() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeObjectType_TypeMetadataIndicator() {
		return (EReference)typeObjectTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSimpleStyleCodeType() {
		return typeSimpleStyleCodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSimpleStyleCodeType_Value() {
		return (EAttribute)typeSimpleStyleCodeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSimpleStyleCodeType_Id() {
		return (EAttribute)typeSimpleStyleCodeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSimpleStyleCodeType_LinkMetadata() {
		return (EAttribute)typeSimpleStyleCodeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSimpleStyleCodeType_Metadata() {
		return (EAttribute)typeSimpleStyleCodeTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_Facet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacetCategoryCode() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacetDefinitionText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FacetText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Namespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NamespacePrefixText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NamespaceURI() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NamespaceVersionText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Property() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyAbstractIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyAugmentationOfTypeQualifiedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyDataTypeQualifiedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyDefinitionText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyElementIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyInlineIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyMaxOccursText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyMinOccursText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyNamespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyQualifiedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyReferenceIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertySubstitutionGroupHeadQualifiedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Type() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeAdapterIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeAssociationIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeAugmentationIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeBaseTypeQualifiedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeContainsProperty() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeContentStyleCode() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeDefinitionText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeMetadataIndicator() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeNamespace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeQualifiedName() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TypeSimpleStyleCode() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFacetCategoryCodeSimpleType() {
		return facetCategoryCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeContentStyleCodeSimpleType() {
		return typeContentStyleCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeSimpleStyleCodeSimpleType() {
		return typeSimpleStyleCodeSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFacetCategoryCodeSimpleTypeObject() {
		return facetCategoryCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeContentStyleCodeSimpleTypeObject() {
		return typeContentStyleCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeSimpleStyleCodeSimpleTypeObject() {
		return typeSimpleStyleCodeSimpleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Factory get_1Factory() {
		return (_1Factory)getEFactoryInstance();
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
		facetCategoryCodeTypeEClass = createEClass(FACET_CATEGORY_CODE_TYPE);
		createEAttribute(facetCategoryCodeTypeEClass, FACET_CATEGORY_CODE_TYPE__VALUE);
		createEAttribute(facetCategoryCodeTypeEClass, FACET_CATEGORY_CODE_TYPE__ID);
		createEAttribute(facetCategoryCodeTypeEClass, FACET_CATEGORY_CODE_TYPE__LINK_METADATA);
		createEAttribute(facetCategoryCodeTypeEClass, FACET_CATEGORY_CODE_TYPE__METADATA);

		facetTypeEClass = createEClass(FACET_TYPE);
		createEReference(facetTypeEClass, FACET_TYPE__TYPE_QUALIFIED_NAME);
		createEReference(facetTypeEClass, FACET_TYPE__FACET_CATEGORY_CODE);
		createEReference(facetTypeEClass, FACET_TYPE__FACET_TEXT);
		createEReference(facetTypeEClass, FACET_TYPE__FACET_DEFINITION_TEXT);

		namespaceTypeEClass = createEClass(NAMESPACE_TYPE);
		createEReference(namespaceTypeEClass, NAMESPACE_TYPE__NAMESPACE_URI);
		createEReference(namespaceTypeEClass, NAMESPACE_TYPE__NAMESPACE_PREFIX_TEXT);
		createEReference(namespaceTypeEClass, NAMESPACE_TYPE__NAMESPACE_VERSION_TEXT);

		propertyObjectTypeEClass = createEClass(PROPERTY_OBJECT_TYPE);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_QUALIFIED_NAME);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_NAME);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_NAMESPACE);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_DEFINITION_TEXT);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_DATA_TYPE_QUALIFIED_NAME);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_ELEMENT_INDICATOR);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_ABSTRACT_INDICATOR);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_INLINE_INDICATOR);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_REFERENCE_INDICATOR);
		createEReference(propertyObjectTypeEClass, PROPERTY_OBJECT_TYPE__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME);

		qNameEClass = createEClass(QNAME);
		createEAttribute(qNameEClass, QNAME__VALUE);
		createEAttribute(qNameEClass, QNAME__ID);
		createEAttribute(qNameEClass, QNAME__LINK_METADATA);
		createEAttribute(qNameEClass, QNAME__METADATA);

		typeContainsPropertyTypeEClass = createEClass(TYPE_CONTAINS_PROPERTY_TYPE);
		createEReference(typeContainsPropertyTypeEClass, TYPE_CONTAINS_PROPERTY_TYPE__TYPE_QUALIFIED_NAME);
		createEReference(typeContainsPropertyTypeEClass, TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_QUALIFIED_NAME);
		createEReference(typeContainsPropertyTypeEClass, TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MIN_OCCURS_TEXT);
		createEReference(typeContainsPropertyTypeEClass, TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_MAX_OCCURS_TEXT);
		createEReference(typeContainsPropertyTypeEClass, TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_INLINE_INDICATOR);
		createEReference(typeContainsPropertyTypeEClass, TYPE_CONTAINS_PROPERTY_TYPE__PROPERTY_REFERENCE_INDICATOR);

		typeContentStyleCodeTypeEClass = createEClass(TYPE_CONTENT_STYLE_CODE_TYPE);
		createEAttribute(typeContentStyleCodeTypeEClass, TYPE_CONTENT_STYLE_CODE_TYPE__VALUE);
		createEAttribute(typeContentStyleCodeTypeEClass, TYPE_CONTENT_STYLE_CODE_TYPE__ID);
		createEAttribute(typeContentStyleCodeTypeEClass, TYPE_CONTENT_STYLE_CODE_TYPE__LINK_METADATA);
		createEAttribute(typeContentStyleCodeTypeEClass, TYPE_CONTENT_STYLE_CODE_TYPE__METADATA);

		typeObjectTypeEClass = createEClass(TYPE_OBJECT_TYPE);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_QUALIFIED_NAME);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_NAME);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_NAMESPACE);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_DEFINITION_TEXT);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_BASE_TYPE_QUALIFIED_NAME);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_CONTENT_STYLE_CODE);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_SIMPLE_STYLE_CODE);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_ASSOCIATION_INDICATOR);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_AUGMENTATION_INDICATOR);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_ADAPTER_INDICATOR);
		createEReference(typeObjectTypeEClass, TYPE_OBJECT_TYPE__TYPE_METADATA_INDICATOR);

		typeSimpleStyleCodeTypeEClass = createEClass(TYPE_SIMPLE_STYLE_CODE_TYPE);
		createEAttribute(typeSimpleStyleCodeTypeEClass, TYPE_SIMPLE_STYLE_CODE_TYPE__VALUE);
		createEAttribute(typeSimpleStyleCodeTypeEClass, TYPE_SIMPLE_STYLE_CODE_TYPE__ID);
		createEAttribute(typeSimpleStyleCodeTypeEClass, TYPE_SIMPLE_STYLE_CODE_TYPE__LINK_METADATA);
		createEAttribute(typeSimpleStyleCodeTypeEClass, TYPE_SIMPLE_STYLE_CODE_TYPE__METADATA);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FACET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FACET_CATEGORY_CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FACET_DEFINITION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FACET_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE_URI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_DEFINITION_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_METADATA_INDICATOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_NAMESPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_QUALIFIED_NAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE);

		// Create enums
		facetCategoryCodeSimpleTypeEEnum = createEEnum(FACET_CATEGORY_CODE_SIMPLE_TYPE);
		typeContentStyleCodeSimpleTypeEEnum = createEEnum(TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE);
		typeSimpleStyleCodeSimpleTypeEEnum = createEEnum(TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE);

		// Create data types
		facetCategoryCodeSimpleTypeObjectEDataType = createEDataType(FACET_CATEGORY_CODE_SIMPLE_TYPE_OBJECT);
		typeContentStyleCodeSimpleTypeObjectEDataType = createEDataType(TYPE_CONTENT_STYLE_CODE_SIMPLE_TYPE_OBJECT);
		typeSimpleStyleCodeSimpleTypeObjectEDataType = createEDataType(TYPE_SIMPLE_STYLE_CODE_SIMPLE_TYPE_OBJECT);
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
		_2Package the_2Package = (_2Package)EPackage.Registry.INSTANCE.getEPackage(_2Package.eNS_URI);
		gov.niem.niem.proxy.xsd._2._2Package the_2Package_1 = (gov.niem.niem.proxy.xsd._2._2Package)EPackage.Registry.INSTANCE.getEPackage(gov.niem.niem.proxy.xsd._2._2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		facetTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		namespaceTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		propertyObjectTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		typeContainsPropertyTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());
		typeObjectTypeEClass.getESuperTypes().add(the_2Package.getComplexObjectType());

		// Initialize classes, features, and operations; add parameters
		initEClass(facetCategoryCodeTypeEClass, FacetCategoryCodeType.class, "FacetCategoryCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacetCategoryCodeType_Value(), this.getFacetCategoryCodeSimpleType(), "value", null, 0, 1, FacetCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetCategoryCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, FacetCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetCategoryCodeType_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, FacetCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFacetCategoryCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, FacetCategoryCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(facetTypeEClass, FacetType.class, "FacetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacetType_TypeQualifiedName(), this.getQName(), null, "typeQualifiedName", null, 1, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetType_FacetCategoryCode(), this.getFacetCategoryCodeType(), null, "facetCategoryCode", null, 1, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetType_FacetText(), the_2Package_1.getString(), null, "facetText", null, 1, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFacetType_FacetDefinitionText(), the_2Package_1.getString(), null, "facetDefinitionText", null, 0, 1, FacetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceTypeEClass, NamespaceType.class, "NamespaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespaceType_NamespaceURI(), the_2Package_1.getString(), null, "namespaceURI", null, 1, 1, NamespaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespaceType_NamespacePrefixText(), the_2Package_1.getString(), null, "namespacePrefixText", null, 0, 1, NamespaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespaceType_NamespaceVersionText(), the_2Package_1.getString(), null, "namespaceVersionText", null, 0, 1, NamespaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyObjectTypeEClass, PropertyObjectType.class, "PropertyObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyObjectType_PropertyQualifiedName(), this.getQName(), null, "propertyQualifiedName", null, 1, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyName(), the_2Package_1.getString(), null, "propertyName", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyNamespace(), this.getNamespaceType(), null, "propertyNamespace", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyDefinitionText(), the_2Package_1.getString(), null, "propertyDefinitionText", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyDataTypeQualifiedName(), this.getQName(), null, "propertyDataTypeQualifiedName", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertySubstitutionGroupHeadQualifiedName(), this.getQName(), null, "propertySubstitutionGroupHeadQualifiedName", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyElementIndicator(), the_2Package_1.getBoolean(), null, "propertyElementIndicator", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyAbstractIndicator(), the_2Package_1.getBoolean(), null, "propertyAbstractIndicator", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyInlineIndicator(), the_2Package_1.getBoolean(), null, "propertyInlineIndicator", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyReferenceIndicator(), the_2Package_1.getBoolean(), null, "propertyReferenceIndicator", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyObjectType_PropertyAugmentationOfTypeQualifiedName(), this.getQName(), null, "propertyAugmentationOfTypeQualifiedName", null, 0, 1, PropertyObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qNameEClass, QName.class, "QName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQName_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQName_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQName_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQName_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, QName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContainsPropertyTypeEClass, TypeContainsPropertyType.class, "TypeContainsPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeContainsPropertyType_TypeQualifiedName(), this.getQName(), null, "typeQualifiedName", null, 1, 1, TypeContainsPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeContainsPropertyType_PropertyQualifiedName(), this.getQName(), null, "propertyQualifiedName", null, 1, 1, TypeContainsPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeContainsPropertyType_PropertyMinOccursText(), the_2Package_1.getString(), null, "propertyMinOccursText", null, 0, 1, TypeContainsPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeContainsPropertyType_PropertyMaxOccursText(), the_2Package_1.getString(), null, "propertyMaxOccursText", null, 0, 1, TypeContainsPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeContainsPropertyType_PropertyInlineIndicator(), the_2Package_1.getBoolean(), null, "propertyInlineIndicator", null, 0, 1, TypeContainsPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeContainsPropertyType_PropertyReferenceIndicator(), the_2Package_1.getBoolean(), null, "propertyReferenceIndicator", null, 0, 1, TypeContainsPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContentStyleCodeTypeEClass, TypeContentStyleCodeType.class, "TypeContentStyleCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeContentStyleCodeType_Value(), this.getTypeContentStyleCodeSimpleType(), "value", null, 0, 1, TypeContentStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeContentStyleCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TypeContentStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeContentStyleCodeType_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, TypeContentStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeContentStyleCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, TypeContentStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeObjectTypeEClass, TypeObjectType.class, "TypeObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeObjectType_TypeQualifiedName(), this.getQName(), null, "typeQualifiedName", null, 1, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeName(), the_2Package_1.getString(), null, "typeName", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeNamespace(), this.getNamespaceType(), null, "typeNamespace", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeDefinitionText(), the_2Package_1.getString(), null, "typeDefinitionText", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeBaseTypeQualifiedName(), this.getQName(), null, "typeBaseTypeQualifiedName", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeContentStyleCode(), this.getTypeContentStyleCodeType(), null, "typeContentStyleCode", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeSimpleStyleCode(), this.getTypeSimpleStyleCodeType(), null, "typeSimpleStyleCode", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeAssociationIndicator(), the_2Package_1.getBoolean(), null, "typeAssociationIndicator", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeAugmentationIndicator(), the_2Package_1.getBoolean(), null, "typeAugmentationIndicator", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeAdapterIndicator(), the_2Package_1.getBoolean(), null, "typeAdapterIndicator", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeObjectType_TypeMetadataIndicator(), the_2Package_1.getBoolean(), null, "typeMetadataIndicator", null, 0, 1, TypeObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeSimpleStyleCodeTypeEClass, TypeSimpleStyleCodeType.class, "TypeSimpleStyleCodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeSimpleStyleCodeType_Value(), this.getTypeSimpleStyleCodeSimpleType(), "value", null, 0, 1, TypeSimpleStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSimpleStyleCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TypeSimpleStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSimpleStyleCodeType_LinkMetadata(), theXMLTypePackage.getIDREFS(), "linkMetadata", null, 0, 1, TypeSimpleStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSimpleStyleCodeType_Metadata(), theXMLTypePackage.getIDREFS(), "metadata", null, 0, 1, TypeSimpleStyleCodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Facet(), this.getFacetType(), null, "facet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FacetCategoryCode(), this.getFacetCategoryCodeType(), null, "facetCategoryCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FacetDefinitionText(), the_2Package_1.getString(), null, "facetDefinitionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FacetText(), the_2Package_1.getString(), null, "facetText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Namespace(), this.getNamespaceType(), null, "namespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NamespacePrefixText(), the_2Package_1.getString(), null, "namespacePrefixText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NamespaceURI(), the_2Package_1.getString(), null, "namespaceURI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NamespaceVersionText(), the_2Package_1.getString(), null, "namespaceVersionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Property(), this.getPropertyObjectType(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyAbstractIndicator(), the_2Package_1.getBoolean(), null, "propertyAbstractIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyAugmentationOfTypeQualifiedName(), this.getQName(), null, "propertyAugmentationOfTypeQualifiedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyDataTypeQualifiedName(), this.getQName(), null, "propertyDataTypeQualifiedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyDefinitionText(), the_2Package_1.getString(), null, "propertyDefinitionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyElementIndicator(), the_2Package_1.getBoolean(), null, "propertyElementIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyInlineIndicator(), the_2Package_1.getBoolean(), null, "propertyInlineIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyMaxOccursText(), the_2Package_1.getString(), null, "propertyMaxOccursText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyMinOccursText(), the_2Package_1.getString(), null, "propertyMinOccursText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyName(), the_2Package_1.getString(), null, "propertyName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyNamespace(), this.getNamespaceType(), null, "propertyNamespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyQualifiedName(), this.getQName(), null, "propertyQualifiedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertyReferenceIndicator(), the_2Package_1.getBoolean(), null, "propertyReferenceIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PropertySubstitutionGroupHeadQualifiedName(), this.getQName(), null, "propertySubstitutionGroupHeadQualifiedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Type(), this.getTypeObjectType(), null, "type", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeAdapterIndicator(), the_2Package_1.getBoolean(), null, "typeAdapterIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeAssociationIndicator(), the_2Package_1.getBoolean(), null, "typeAssociationIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeAugmentationIndicator(), the_2Package_1.getBoolean(), null, "typeAugmentationIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeBaseTypeQualifiedName(), this.getQName(), null, "typeBaseTypeQualifiedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeContainsProperty(), this.getTypeContainsPropertyType(), null, "typeContainsProperty", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeContentStyleCode(), this.getTypeContentStyleCodeType(), null, "typeContentStyleCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeDefinitionText(), the_2Package_1.getString(), null, "typeDefinitionText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeMetadataIndicator(), the_2Package_1.getBoolean(), null, "typeMetadataIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeName(), the_2Package_1.getString(), null, "typeName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeNamespace(), this.getNamespaceType(), null, "typeNamespace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeQualifiedName(), this.getQName(), null, "typeQualifiedName", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TypeSimpleStyleCode(), this.getTypeSimpleStyleCodeType(), null, "typeSimpleStyleCode", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(facetCategoryCodeSimpleTypeEEnum, FacetCategoryCodeSimpleType.class, "FacetCategoryCodeSimpleType");
		addEEnumLiteral(facetCategoryCodeSimpleTypeEEnum, FacetCategoryCodeSimpleType.ENUMERATION);
		addEEnumLiteral(facetCategoryCodeSimpleTypeEEnum, FacetCategoryCodeSimpleType.PATTERN);
		addEEnumLiteral(facetCategoryCodeSimpleTypeEEnum, FacetCategoryCodeSimpleType.MIN_INCLUSIVE);
		addEEnumLiteral(facetCategoryCodeSimpleTypeEEnum, FacetCategoryCodeSimpleType.MAX_INCLUSIVE);
		addEEnumLiteral(facetCategoryCodeSimpleTypeEEnum, FacetCategoryCodeSimpleType.MAX_EXCLUSIVE);

		initEEnum(typeContentStyleCodeSimpleTypeEEnum, TypeContentStyleCodeSimpleType.class, "TypeContentStyleCodeSimpleType");
		addEEnumLiteral(typeContentStyleCodeSimpleTypeEEnum, TypeContentStyleCodeSimpleType.CCC);
		addEEnumLiteral(typeContentStyleCodeSimpleTypeEEnum, TypeContentStyleCodeSimpleType.CSC);
		addEEnumLiteral(typeContentStyleCodeSimpleTypeEEnum, TypeContentStyleCodeSimpleType.S);

		initEEnum(typeSimpleStyleCodeSimpleTypeEEnum, TypeSimpleStyleCodeSimpleType.class, "TypeSimpleStyleCodeSimpleType");
		addEEnumLiteral(typeSimpleStyleCodeSimpleTypeEEnum, TypeSimpleStyleCodeSimpleType.ATOMIC);
		addEEnumLiteral(typeSimpleStyleCodeSimpleTypeEEnum, TypeSimpleStyleCodeSimpleType.LIST);

		// Initialize data types
		initEDataType(facetCategoryCodeSimpleTypeObjectEDataType, FacetCategoryCodeSimpleType.class, "FacetCategoryCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeContentStyleCodeSimpleTypeObjectEDataType, TypeContentStyleCodeSimpleType.class, "TypeContentStyleCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeSimpleStyleCodeSimpleTypeObjectEDataType, TypeSimpleStyleCodeSimpleType.class, "TypeSimpleStyleCodeSimpleTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "appinfo", "\r\n      <i:resource xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Object\"/>\r\n  \r\n\r\n      <i:resource xmlns:i=\"http://niem.gov/niem/appinfo/2.0\" i:name=\"Association\"/>\r\n  \r\n\r\n      <i:ConformantIndicator xmlns:i=\"http://niem.gov/niem/appinfo/2.0\">true</i:ConformantIndicator>\r\n    "
		   });																																																																																																															
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
		  (facetCategoryCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "FacetCategoryCodeSimpleType"
		   });		
		addAnnotation
		  (facetCategoryCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "FacetCategoryCodeSimpleType:Object",
			 "baseType", "FacetCategoryCodeSimpleType"
		   });		
		addAnnotation
		  (facetCategoryCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FacetCategoryCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFacetCategoryCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getFacetCategoryCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getFacetCategoryCodeType_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getFacetCategoryCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });			
		addAnnotation
		  (facetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FacetType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFacetType_TypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFacetType_FacetCategoryCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FacetCategoryCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFacetType_FacetText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FacetText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFacetType_FacetDefinitionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FacetDefinitionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (namespaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NamespaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNamespaceType_NamespaceURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamespaceType_NamespacePrefixText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespacePrefixText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNamespaceType_NamespaceVersionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceVersionText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (propertyObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyDefinitionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyDefinitionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyDataTypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyDataTypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertySubstitutionGroupHeadQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertySubstitutionGroupHeadQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyElementIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyElementIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyAbstractIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyAbstractIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyInlineIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyInlineIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyReferenceIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyReferenceIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyObjectType_PropertyAugmentationOfTypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyAugmentationOfTypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (qNameEClass, 
		   source, 
		   new String[] {
			 "name", "QName",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getQName_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getQName_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getQName_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getQName_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });			
		addAnnotation
		  (typeContainsPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeContainsPropertyType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeContainsPropertyType_TypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeContainsPropertyType_PropertyQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeContainsPropertyType_PropertyMinOccursText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyMinOccursText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeContainsPropertyType_PropertyMaxOccursText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyMaxOccursText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeContainsPropertyType_PropertyInlineIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyInlineIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeContainsPropertyType_PropertyReferenceIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyReferenceIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeContentStyleCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TypeContentStyleCodeSimpleType"
		   });		
		addAnnotation
		  (typeContentStyleCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TypeContentStyleCodeSimpleType:Object",
			 "baseType", "TypeContentStyleCodeSimpleType"
		   });		
		addAnnotation
		  (typeContentStyleCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeContentStyleCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeContentStyleCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeContentStyleCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getTypeContentStyleCodeType_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getTypeContentStyleCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });			
		addAnnotation
		  (typeObjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeObjectType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeDefinitionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeDefinitionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeBaseTypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeBaseTypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeContentStyleCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeContentStyleCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeSimpleStyleCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeSimpleStyleCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeAssociationIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeAssociationIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeAugmentationIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeAugmentationIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeAdapterIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeAdapterIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTypeObjectType_TypeMetadataIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeMetadataIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeSimpleStyleCodeSimpleTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "TypeSimpleStyleCodeSimpleType"
		   });		
		addAnnotation
		  (typeSimpleStyleCodeSimpleTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TypeSimpleStyleCodeSimpleType:Object",
			 "baseType", "TypeSimpleStyleCodeSimpleType"
		   });		
		addAnnotation
		  (typeSimpleStyleCodeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TypeSimpleStyleCodeType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeSimpleStyleCodeType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeSimpleStyleCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getTypeSimpleStyleCodeType_LinkMetadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkMetadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
		   });		
		addAnnotation
		  (getTypeSimpleStyleCodeType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "metadata",
			 "namespace", "http://niem.gov/niem/structures/2.0"
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
		  (getDocumentRoot_Facet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Facet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FacetCategoryCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FacetCategoryCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FacetDefinitionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FacetDefinitionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_FacetText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FacetText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Namespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Namespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NamespacePrefixText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespacePrefixText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NamespaceURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NamespaceVersionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NamespaceVersionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Property",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyAbstractIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyAbstractIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyAugmentationOfTypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyAugmentationOfTypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyDataTypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyDataTypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyDefinitionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyDefinitionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyElementIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyElementIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyInlineIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyInlineIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyMaxOccursText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyMaxOccursText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyMinOccursText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyMinOccursText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertyReferenceIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertyReferenceIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PropertySubstitutionGroupHeadQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PropertySubstitutionGroupHeadQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeAdapterIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeAdapterIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeAssociationIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeAssociationIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeAugmentationIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeAugmentationIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeBaseTypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeBaseTypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeContainsProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeContainsProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeContentStyleCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeContentStyleCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeDefinitionText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeDefinitionText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeMetadataIndicator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeMetadataIndicator",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeNamespace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeNamespace",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeQualifiedName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeQualifiedName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TypeSimpleStyleCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TypeSimpleStyleCode",
			 "namespace", "##targetNamespace"
		   });
	}

} //_1PackageImpl
