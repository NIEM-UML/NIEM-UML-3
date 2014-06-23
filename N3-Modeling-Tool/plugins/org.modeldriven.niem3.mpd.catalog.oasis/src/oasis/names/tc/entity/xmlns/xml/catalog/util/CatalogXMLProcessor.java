/**
 */
package oasis.names.tc.entity.xmlns.xml.catalog.util;

import java.util.Map;

import oasis.names.tc.entity.xmlns.xml.catalog.CatalogPackage;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CatalogPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CatalogResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CatalogResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CatalogResourceFactoryImpl());
		}
		return registrations;
	}

} //CatalogXMLProcessor
