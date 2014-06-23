/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.impl;

import oasis.names.tc.entity.xmlns.xml.catalog.Catalog;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogFactory;
import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegatePublic;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.DelegateURI;
import oasis.names.tc.entity.xmlns.xml.catalog.DocumentRoot;
import oasis.names.tc.entity.xmlns.xml.catalog.Group;
import oasis.names.tc.entity.xmlns.xml.catalog.NextCatalog;
import oasis.names.tc.entity.xmlns.xml.catalog.Public;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteSystem;
import oasis.names.tc.entity.xmlns.xml.catalog.RewriteURI;
import oasis.names.tc.entity.xmlns.xml.catalog.SystemOrPublic;
import oasis.names.tc.entity.xmlns.xml.catalog.Uri;

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
public class CatalogPackageImpl extends EPackageImpl implements CatalogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegatePublicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateURIEClass = null;

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
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rewriteSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rewriteURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemOrPublicEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partialPublicIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pubIdCharsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType publicIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemOrPublicObjectEDataType = null;

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
	 * @see oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CatalogPackageImpl() {
		super(eNS_URI, CatalogFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CatalogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CatalogPackage init() {
		if (isInited) return (CatalogPackage)EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI);

		// Obtain or create and register package
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CatalogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CatalogPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCatalogPackage.createPackageContents();

		// Initialize created meta-data
		theCatalogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCatalogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CatalogPackage.eNS_URI, theCatalogPackage);
		return theCatalogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_Group() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Public() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_System() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Uri() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_RewriteSystem() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_RewriteURI() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_DelegatePublic() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_DelegateSystem() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_DelegateURI() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_NextCatalog() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatalog_Group1() {
		return (EReference)catalogEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_Any() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_Id() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_Prefer() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatalog_AnyAttribute() {
		return (EAttribute)catalogEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegatePublic() {
		return delegatePublicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegatePublic_Catalog() {
		return (EAttribute)delegatePublicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegatePublic_Id() {
		return (EAttribute)delegatePublicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegatePublic_PublicIdStartString() {
		return (EAttribute)delegatePublicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegatePublic_AnyAttribute() {
		return (EAttribute)delegatePublicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegateSystem() {
		return delegateSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateSystem_Catalog() {
		return (EAttribute)delegateSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateSystem_Id() {
		return (EAttribute)delegateSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateSystem_SystemIdStartString() {
		return (EAttribute)delegateSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateSystem_AnyAttribute() {
		return (EAttribute)delegateSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegateURI() {
		return delegateURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateURI_Catalog() {
		return (EAttribute)delegateURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateURI_Id() {
		return (EAttribute)delegateURIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateURI_UriStartString() {
		return (EAttribute)delegateURIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegateURI_AnyAttribute() {
		return (EAttribute)delegateURIEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_Catalog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DelegatePublic() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DelegateSystem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DelegateURI() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Group() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NextCatalog() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Public() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RewriteSystem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RewriteURI() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_System() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Uri() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Group() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Public() {
		return (EReference)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_System() {
		return (EReference)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Uri() {
		return (EReference)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_RewriteSystem() {
		return (EReference)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_RewriteURI() {
		return (EReference)groupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_DelegatePublic() {
		return (EReference)groupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_DelegateSystem() {
		return (EReference)groupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_DelegateURI() {
		return (EReference)groupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_NextCatalog() {
		return (EReference)groupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Any() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Id() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Prefer() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_AnyAttribute() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextCatalog() {
		return nextCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextCatalog_Catalog() {
		return (EAttribute)nextCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextCatalog_Id() {
		return (EAttribute)nextCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextCatalog_AnyAttribute() {
		return (EAttribute)nextCatalogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublic() {
		return publicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublic_Id() {
		return (EAttribute)publicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublic_PublicId() {
		return (EAttribute)publicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublic_Uri() {
		return (EAttribute)publicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublic_AnyAttribute() {
		return (EAttribute)publicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRewriteSystem() {
		return rewriteSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteSystem_Id() {
		return (EAttribute)rewriteSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteSystem_RewritePrefix() {
		return (EAttribute)rewriteSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteSystem_SystemIdStartString() {
		return (EAttribute)rewriteSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteSystem_AnyAttribute() {
		return (EAttribute)rewriteSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRewriteURI() {
		return rewriteURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteURI_Id() {
		return (EAttribute)rewriteURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteURI_RewritePrefix() {
		return (EAttribute)rewriteURIEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteURI_UriIdStartString() {
		return (EAttribute)rewriteURIEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRewriteURI_AnyAttribute() {
		return (EAttribute)rewriteURIEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Id() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_SystemId() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Uri() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_AnyAttribute() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUri() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUri_Id() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUri_Name() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUri_Uri() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUri_AnyAttribute() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemOrPublic() {
		return systemOrPublicEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPartialPublicIdentifier() {
		return partialPublicIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPubIdChars() {
		return pubIdCharsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPublicIdentifier() {
		return publicIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSystemOrPublicObject() {
		return systemOrPublicObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactory getCatalogFactory() {
		return (CatalogFactory)getEFactoryInstance();
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
		catalogEClass = createEClass(CATALOG);
		createEAttribute(catalogEClass, CATALOG__GROUP);
		createEReference(catalogEClass, CATALOG__PUBLIC);
		createEReference(catalogEClass, CATALOG__SYSTEM);
		createEReference(catalogEClass, CATALOG__URI);
		createEReference(catalogEClass, CATALOG__REWRITE_SYSTEM);
		createEReference(catalogEClass, CATALOG__REWRITE_URI);
		createEReference(catalogEClass, CATALOG__DELEGATE_PUBLIC);
		createEReference(catalogEClass, CATALOG__DELEGATE_SYSTEM);
		createEReference(catalogEClass, CATALOG__DELEGATE_URI);
		createEReference(catalogEClass, CATALOG__NEXT_CATALOG);
		createEReference(catalogEClass, CATALOG__GROUP1);
		createEAttribute(catalogEClass, CATALOG__ANY);
		createEAttribute(catalogEClass, CATALOG__ID);
		createEAttribute(catalogEClass, CATALOG__PREFER);
		createEAttribute(catalogEClass, CATALOG__ANY_ATTRIBUTE);

		delegatePublicEClass = createEClass(DELEGATE_PUBLIC);
		createEAttribute(delegatePublicEClass, DELEGATE_PUBLIC__CATALOG);
		createEAttribute(delegatePublicEClass, DELEGATE_PUBLIC__ID);
		createEAttribute(delegatePublicEClass, DELEGATE_PUBLIC__PUBLIC_ID_START_STRING);
		createEAttribute(delegatePublicEClass, DELEGATE_PUBLIC__ANY_ATTRIBUTE);

		delegateSystemEClass = createEClass(DELEGATE_SYSTEM);
		createEAttribute(delegateSystemEClass, DELEGATE_SYSTEM__CATALOG);
		createEAttribute(delegateSystemEClass, DELEGATE_SYSTEM__ID);
		createEAttribute(delegateSystemEClass, DELEGATE_SYSTEM__SYSTEM_ID_START_STRING);
		createEAttribute(delegateSystemEClass, DELEGATE_SYSTEM__ANY_ATTRIBUTE);

		delegateURIEClass = createEClass(DELEGATE_URI);
		createEAttribute(delegateURIEClass, DELEGATE_URI__CATALOG);
		createEAttribute(delegateURIEClass, DELEGATE_URI__ID);
		createEAttribute(delegateURIEClass, DELEGATE_URI__URI_START_STRING);
		createEAttribute(delegateURIEClass, DELEGATE_URI__ANY_ATTRIBUTE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CATALOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELEGATE_PUBLIC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELEGATE_SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DELEGATE_URI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NEXT_CATALOG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLIC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REWRITE_SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REWRITE_URI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__URI);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__GROUP);
		createEReference(groupEClass, GROUP__PUBLIC);
		createEReference(groupEClass, GROUP__SYSTEM);
		createEReference(groupEClass, GROUP__URI);
		createEReference(groupEClass, GROUP__REWRITE_SYSTEM);
		createEReference(groupEClass, GROUP__REWRITE_URI);
		createEReference(groupEClass, GROUP__DELEGATE_PUBLIC);
		createEReference(groupEClass, GROUP__DELEGATE_SYSTEM);
		createEReference(groupEClass, GROUP__DELEGATE_URI);
		createEReference(groupEClass, GROUP__NEXT_CATALOG);
		createEAttribute(groupEClass, GROUP__ANY);
		createEAttribute(groupEClass, GROUP__ID);
		createEAttribute(groupEClass, GROUP__PREFER);
		createEAttribute(groupEClass, GROUP__ANY_ATTRIBUTE);

		nextCatalogEClass = createEClass(NEXT_CATALOG);
		createEAttribute(nextCatalogEClass, NEXT_CATALOG__CATALOG);
		createEAttribute(nextCatalogEClass, NEXT_CATALOG__ID);
		createEAttribute(nextCatalogEClass, NEXT_CATALOG__ANY_ATTRIBUTE);

		publicEClass = createEClass(PUBLIC);
		createEAttribute(publicEClass, PUBLIC__ID);
		createEAttribute(publicEClass, PUBLIC__PUBLIC_ID);
		createEAttribute(publicEClass, PUBLIC__URI);
		createEAttribute(publicEClass, PUBLIC__ANY_ATTRIBUTE);

		rewriteSystemEClass = createEClass(REWRITE_SYSTEM);
		createEAttribute(rewriteSystemEClass, REWRITE_SYSTEM__ID);
		createEAttribute(rewriteSystemEClass, REWRITE_SYSTEM__REWRITE_PREFIX);
		createEAttribute(rewriteSystemEClass, REWRITE_SYSTEM__SYSTEM_ID_START_STRING);
		createEAttribute(rewriteSystemEClass, REWRITE_SYSTEM__ANY_ATTRIBUTE);

		rewriteURIEClass = createEClass(REWRITE_URI);
		createEAttribute(rewriteURIEClass, REWRITE_URI__ID);
		createEAttribute(rewriteURIEClass, REWRITE_URI__REWRITE_PREFIX);
		createEAttribute(rewriteURIEClass, REWRITE_URI__URI_ID_START_STRING);
		createEAttribute(rewriteURIEClass, REWRITE_URI__ANY_ATTRIBUTE);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__ID);
		createEAttribute(systemEClass, SYSTEM__SYSTEM_ID);
		createEAttribute(systemEClass, SYSTEM__URI);
		createEAttribute(systemEClass, SYSTEM__ANY_ATTRIBUTE);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__ID);
		createEAttribute(uriEClass, URI__NAME);
		createEAttribute(uriEClass, URI__URI);
		createEAttribute(uriEClass, URI__ANY_ATTRIBUTE);

		// Create enums
		systemOrPublicEEnum = createEEnum(SYSTEM_OR_PUBLIC);

		// Create data types
		partialPublicIdentifierEDataType = createEDataType(PARTIAL_PUBLIC_IDENTIFIER);
		pubIdCharsEDataType = createEDataType(PUB_ID_CHARS);
		publicIdentifierEDataType = createEDataType(PUBLIC_IDENTIFIER);
		systemOrPublicObjectEDataType = createEDataType(SYSTEM_OR_PUBLIC_OBJECT);
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
		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalog_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Public(), this.getPublic(), null, "public", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_System(), this.getSystem(), null, "system", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Uri(), this.getUri(), null, "uri", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_RewriteSystem(), this.getRewriteSystem(), null, "rewriteSystem", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_RewriteURI(), this.getRewriteURI(), null, "rewriteURI", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_DelegatePublic(), this.getDelegatePublic(), null, "delegatePublic", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_DelegateSystem(), this.getDelegateSystem(), null, "delegateSystem", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_DelegateURI(), this.getDelegateURI(), null, "delegateURI", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_NextCatalog(), this.getNextCatalog(), null, "nextCatalog", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCatalog_Group1(), this.getGroup(), null, "group1", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalog_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Catalog.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalog_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalog_Prefer(), this.getSystemOrPublic(), "prefer", null, 0, 1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatalog_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Catalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegatePublicEClass, DelegatePublic.class, "DelegatePublic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelegatePublic_Catalog(), theXMLTypePackage.getAnyURI(), "catalog", null, 1, 1, DelegatePublic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegatePublic_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DelegatePublic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegatePublic_PublicIdStartString(), this.getPartialPublicIdentifier(), "publicIdStartString", null, 1, 1, DelegatePublic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegatePublic_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DelegatePublic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegateSystemEClass, DelegateSystem.class, "DelegateSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelegateSystem_Catalog(), theXMLTypePackage.getAnyURI(), "catalog", null, 1, 1, DelegateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegateSystem_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DelegateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegateSystem_SystemIdStartString(), theXMLTypePackage.getString(), "systemIdStartString", null, 1, 1, DelegateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegateSystem_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DelegateSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegateURIEClass, DelegateURI.class, "DelegateURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelegateURI_Catalog(), theXMLTypePackage.getAnyURI(), "catalog", null, 1, 1, DelegateURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegateURI_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DelegateURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegateURI_UriStartString(), theXMLTypePackage.getString(), "uriStartString", null, 1, 1, DelegateURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegateURI_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DelegateURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Catalog(), this.getCatalog(), null, "catalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DelegatePublic(), this.getDelegatePublic(), null, "delegatePublic", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DelegateSystem(), this.getDelegateSystem(), null, "delegateSystem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DelegateURI(), this.getDelegateURI(), null, "delegateURI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Group(), this.getGroup(), null, "group", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NextCatalog(), this.getNextCatalog(), null, "nextCatalog", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Public(), this.getPublic(), null, "public", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RewriteSystem(), this.getRewriteSystem(), null, "rewriteSystem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RewriteURI(), this.getRewriteURI(), null, "rewriteURI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_System(), this.getSystem(), null, "system", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Uri(), this.getUri(), null, "uri", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Public(), this.getPublic(), null, "public", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_System(), this.getSystem(), null, "system", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Uri(), this.getUri(), null, "uri", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_RewriteSystem(), this.getRewriteSystem(), null, "rewriteSystem", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_RewriteURI(), this.getRewriteURI(), null, "rewriteURI", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_DelegatePublic(), this.getDelegatePublic(), null, "delegatePublic", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_DelegateSystem(), this.getDelegateSystem(), null, "delegateSystem", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_DelegateURI(), this.getDelegateURI(), null, "delegateURI", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_NextCatalog(), this.getNextCatalog(), null, "nextCatalog", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Prefer(), this.getSystemOrPublic(), "prefer", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nextCatalogEClass, NextCatalog.class, "NextCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNextCatalog_Catalog(), theXMLTypePackage.getAnyURI(), "catalog", null, 1, 1, NextCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNextCatalog_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, NextCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNextCatalog_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, NextCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publicEClass, Public.class, "Public", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublic_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublic_PublicId(), this.getPublicIdentifier(), "publicId", null, 1, 1, Public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublic_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, Public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublic_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Public.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rewriteSystemEClass, RewriteSystem.class, "RewriteSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRewriteSystem_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RewriteSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewriteSystem_RewritePrefix(), theXMLTypePackage.getString(), "rewritePrefix", null, 1, 1, RewriteSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewriteSystem_SystemIdStartString(), theXMLTypePackage.getString(), "systemIdStartString", null, 1, 1, RewriteSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewriteSystem_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RewriteSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rewriteURIEClass, RewriteURI.class, "RewriteURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRewriteURI_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RewriteURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewriteURI_RewritePrefix(), theXMLTypePackage.getString(), "rewritePrefix", null, 1, 1, RewriteURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewriteURI_UriIdStartString(), theXMLTypePackage.getString(), "uriIdStartString", null, 1, 1, RewriteURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRewriteURI_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, RewriteURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, oasis.names.tc.entity.xmlns.xml.catalog.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, oasis.names.tc.entity.xmlns.xml.catalog.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_SystemId(), theXMLTypePackage.getString(), "systemId", null, 1, 1, oasis.names.tc.entity.xmlns.xml.catalog.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, oasis.names.tc.entity.xmlns.xml.catalog.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, oasis.names.tc.entity.xmlns.xml.catalog.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uriEClass, Uri.class, "Uri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUri_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUri_Name(), theXMLTypePackage.getAnyURI(), "name", null, 1, 1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUri_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUri_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(systemOrPublicEEnum, SystemOrPublic.class, "SystemOrPublic");
		addEEnumLiteral(systemOrPublicEEnum, SystemOrPublic.SYSTEM);
		addEEnumLiteral(systemOrPublicEEnum, SystemOrPublic.PUBLIC);

		// Initialize data types
		initEDataType(partialPublicIdentifierEDataType, String.class, "PartialPublicIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pubIdCharsEDataType, String.class, "PubIdChars", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(publicIdentifierEDataType, String.class, "PublicIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(systemOrPublicObjectEDataType, SystemOrPublic.class, "SystemOrPublicObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (catalogEClass, 
		   source, 
		   new String[] {
			 "name", "catalog",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCatalog_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCatalog_Public(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "public",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_System(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "system",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_Uri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uri",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_RewriteSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rewriteSystem",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_RewriteURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rewriteURI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_DelegatePublic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegatePublic",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_DelegateSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegateSystem",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_DelegateURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegateURI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_NextCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nextCatalog",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_Group1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":11",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getCatalog_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getCatalog_Prefer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prefer"
		   });		
		addAnnotation
		  (getCatalog_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":14",
			 "processing", "lax"
		   });		
		addAnnotation
		  (delegatePublicEClass, 
		   source, 
		   new String[] {
			 "name", "delegatePublic",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDelegatePublic_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getDelegatePublic_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDelegatePublic_PublicIdStartString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "publicIdStartString"
		   });		
		addAnnotation
		  (getDelegatePublic_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (delegateSystemEClass, 
		   source, 
		   new String[] {
			 "name", "delegateSystem",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDelegateSystem_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getDelegateSystem_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDelegateSystem_SystemIdStartString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "systemIdStartString"
		   });		
		addAnnotation
		  (getDelegateSystem_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (delegateURIEClass, 
		   source, 
		   new String[] {
			 "name", "delegateURI",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDelegateURI_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getDelegateURI_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDelegateURI_UriStartString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uriStartString"
		   });		
		addAnnotation
		  (getDelegateURI_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
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
		  (getDocumentRoot_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "catalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DelegatePublic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegatePublic",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DelegateSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegateSystem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_DelegateURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegateURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NextCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nextCatalog",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Public(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "public",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RewriteSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rewriteSystem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RewriteURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rewriteURI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_System(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "system",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Uri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uri",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "name", "group",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGroup_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getGroup_Public(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "public",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_System(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "system",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_Uri(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "uri",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_RewriteSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rewriteSystem",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_RewriteURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rewriteURI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_DelegatePublic(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegatePublic",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_DelegateSystem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegateSystem",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_DelegateURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "delegateURI",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_NextCatalog(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nextCatalog",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":10",
			 "processing", "skip",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getGroup_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getGroup_Prefer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "prefer"
		   });		
		addAnnotation
		  (getGroup_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":13",
			 "processing", "lax"
		   });		
		addAnnotation
		  (nextCatalogEClass, 
		   source, 
		   new String[] {
			 "name", "nextCatalog",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNextCatalog_Catalog(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "catalog"
		   });		
		addAnnotation
		  (getNextCatalog_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getNextCatalog_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":2",
			 "processing", "lax"
		   });		
		addAnnotation
		  (partialPublicIdentifierEDataType, 
		   source, 
		   new String[] {
			 "name", "partialPublicIdentifier",
			 "baseType", "pubIdChars"
		   });		
		addAnnotation
		  (pubIdCharsEDataType, 
		   source, 
		   new String[] {
			 "name", "pubIdChars",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (publicEClass, 
		   source, 
		   new String[] {
			 "name", "public",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPublic_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPublic_PublicId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "publicId"
		   });		
		addAnnotation
		  (getPublic_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (getPublic_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (publicIdentifierEDataType, 
		   source, 
		   new String[] {
			 "name", "publicIdentifier",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (rewriteSystemEClass, 
		   source, 
		   new String[] {
			 "name", "rewriteSystem",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRewriteSystem_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getRewriteSystem_RewritePrefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rewritePrefix"
		   });		
		addAnnotation
		  (getRewriteSystem_SystemIdStartString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "systemIdStartString"
		   });		
		addAnnotation
		  (getRewriteSystem_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (rewriteURIEClass, 
		   source, 
		   new String[] {
			 "name", "rewriteURI",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRewriteURI_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getRewriteURI_RewritePrefix(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rewritePrefix"
		   });		
		addAnnotation
		  (getRewriteURI_UriIdStartString(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uriIdStartString"
		   });		
		addAnnotation
		  (getRewriteURI_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
			 "name", "system",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSystem_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSystem_SystemId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "systemId"
		   });		
		addAnnotation
		  (getSystem_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (getSystem_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });		
		addAnnotation
		  (systemOrPublicEEnum, 
		   source, 
		   new String[] {
			 "name", "systemOrPublic"
		   });		
		addAnnotation
		  (systemOrPublicObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "systemOrPublic:Object",
			 "baseType", "systemOrPublic"
		   });		
		addAnnotation
		  (uriEClass, 
		   source, 
		   new String[] {
			 "name", "uri",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getUri_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getUri_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getUri_Uri(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "uri"
		   });		
		addAnnotation
		  (getUri_AnyAttribute(), 
		   source, 
		   new String[] {
			 "kind", "attributeWildcard",
			 "wildcards", "##other",
			 "name", ":3",
			 "processing", "lax"
		   });
	}

} //CatalogPackageImpl
