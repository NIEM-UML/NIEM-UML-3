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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogFactoryImpl extends EFactoryImpl implements CatalogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogFactory init() {
		try {
			CatalogFactory theCatalogFactory = (CatalogFactory)EPackage.Registry.INSTANCE.getEFactory(CatalogPackage.eNS_URI);
			if (theCatalogFactory != null) {
				return theCatalogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogFactoryImpl() {
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
			case CatalogPackage.CATALOG: return createCatalog();
			case CatalogPackage.DELEGATE_PUBLIC: return createDelegatePublic();
			case CatalogPackage.DELEGATE_SYSTEM: return createDelegateSystem();
			case CatalogPackage.DELEGATE_URI: return createDelegateURI();
			case CatalogPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CatalogPackage.GROUP: return createGroup();
			case CatalogPackage.NEXT_CATALOG: return createNextCatalog();
			case CatalogPackage.PUBLIC: return createPublic();
			case CatalogPackage.REWRITE_SYSTEM: return createRewriteSystem();
			case CatalogPackage.REWRITE_URI: return createRewriteURI();
			case CatalogPackage.SYSTEM: return createSystem();
			case CatalogPackage.URI: return createUri();
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
			case CatalogPackage.SYSTEM_OR_PUBLIC:
				return createSystemOrPublicFromString(eDataType, initialValue);
			case CatalogPackage.PARTIAL_PUBLIC_IDENTIFIER:
				return createPartialPublicIdentifierFromString(eDataType, initialValue);
			case CatalogPackage.PUB_ID_CHARS:
				return createPubIdCharsFromString(eDataType, initialValue);
			case CatalogPackage.PUBLIC_IDENTIFIER:
				return createPublicIdentifierFromString(eDataType, initialValue);
			case CatalogPackage.SYSTEM_OR_PUBLIC_OBJECT:
				return createSystemOrPublicObjectFromString(eDataType, initialValue);
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
			case CatalogPackage.SYSTEM_OR_PUBLIC:
				return convertSystemOrPublicToString(eDataType, instanceValue);
			case CatalogPackage.PARTIAL_PUBLIC_IDENTIFIER:
				return convertPartialPublicIdentifierToString(eDataType, instanceValue);
			case CatalogPackage.PUB_ID_CHARS:
				return convertPubIdCharsToString(eDataType, instanceValue);
			case CatalogPackage.PUBLIC_IDENTIFIER:
				return convertPublicIdentifierToString(eDataType, instanceValue);
			case CatalogPackage.SYSTEM_OR_PUBLIC_OBJECT:
				return convertSystemOrPublicObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatePublic createDelegatePublic() {
		DelegatePublicImpl delegatePublic = new DelegatePublicImpl();
		return delegatePublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateSystem createDelegateSystem() {
		DelegateSystemImpl delegateSystem = new DelegateSystemImpl();
		return delegateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateURI createDelegateURI() {
		DelegateURIImpl delegateURI = new DelegateURIImpl();
		return delegateURI;
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
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextCatalog createNextCatalog() {
		NextCatalogImpl nextCatalog = new NextCatalogImpl();
		return nextCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Public createPublic() {
		PublicImpl public_ = new PublicImpl();
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteSystem createRewriteSystem() {
		RewriteSystemImpl rewriteSystem = new RewriteSystemImpl();
		return rewriteSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewriteURI createRewriteURI() {
		RewriteURIImpl rewriteURI = new RewriteURIImpl();
		return rewriteURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oasis.names.tc.entity.xmlns.xml.catalog.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOrPublic createSystemOrPublicFromString(EDataType eDataType, String initialValue) {
		SystemOrPublic result = SystemOrPublic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemOrPublicToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPartialPublicIdentifierFromString(EDataType eDataType, String initialValue) {
		return createPubIdCharsFromString(CatalogPackage.Literals.PUB_ID_CHARS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartialPublicIdentifierToString(EDataType eDataType, Object instanceValue) {
		return convertPubIdCharsToString(CatalogPackage.Literals.PUB_ID_CHARS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPubIdCharsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPubIdCharsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPublicIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPublicIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOrPublic createSystemOrPublicObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemOrPublicFromString(CatalogPackage.Literals.SYSTEM_OR_PUBLIC, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemOrPublicObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemOrPublicToString(CatalogPackage.Literals.SYSTEM_OR_PUBLIC, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogPackage getCatalogPackage() {
		return (CatalogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CatalogPackage getPackage() {
		return CatalogPackage.eINSTANCE;
	}

} //CatalogFactoryImpl
