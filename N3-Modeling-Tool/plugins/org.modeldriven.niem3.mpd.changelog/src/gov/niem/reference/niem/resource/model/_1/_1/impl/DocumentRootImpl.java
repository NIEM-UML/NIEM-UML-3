/**
 */
package gov.niem.reference.niem.resource.model._1._1.impl;

import gov.niem.reference.niem.resource.model._1._1.DocumentRoot;
import gov.niem.reference.niem.resource.model._1._1.FacetCategoryCodeType;
import gov.niem.reference.niem.resource.model._1._1.FacetType;
import gov.niem.reference.niem.resource.model._1._1.NamespaceType;
import gov.niem.reference.niem.resource.model._1._1.PropertyObjectType;
import gov.niem.reference.niem.resource.model._1._1.QName;
import gov.niem.reference.niem.resource.model._1._1.TypeContainsPropertyType;
import gov.niem.reference.niem.resource.model._1._1.TypeContentStyleCodeType;
import gov.niem.reference.niem.resource.model._1._1.TypeObjectType;
import gov.niem.reference.niem.resource.model._1._1.TypeSimpleStyleCodeType;
import gov.niem.reference.niem.resource.model._1._1._1Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getFacet <em>Facet</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getFacetCategoryCode <em>Facet Category Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getFacetDefinitionText <em>Facet Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getFacetText <em>Facet Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getNamespacePrefixText <em>Namespace Prefix Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getNamespaceVersionText <em>Namespace Version Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyAbstractIndicator <em>Property Abstract Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyAugmentationOfTypeQualifiedName <em>Property Augmentation Of Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyDataTypeQualifiedName <em>Property Data Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyDefinitionText <em>Property Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyElementIndicator <em>Property Element Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyInlineIndicator <em>Property Inline Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyMaxOccursText <em>Property Max Occurs Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyMinOccursText <em>Property Min Occurs Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyNamespace <em>Property Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyQualifiedName <em>Property Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertyReferenceIndicator <em>Property Reference Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getPropertySubstitutionGroupHeadQualifiedName <em>Property Substitution Group Head Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeAdapterIndicator <em>Type Adapter Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeAssociationIndicator <em>Type Association Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeAugmentationIndicator <em>Type Augmentation Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeBaseTypeQualifiedName <em>Type Base Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeContainsProperty <em>Type Contains Property</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeContentStyleCode <em>Type Content Style Code</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeDefinitionText <em>Type Definition Text</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeMetadataIndicator <em>Type Metadata Indicator</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeNamespace <em>Type Namespace</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeQualifiedName <em>Type Qualified Name</em>}</li>
 *   <li>{@link gov.niem.reference.niem.resource.model._1._1.impl.DocumentRootImpl#getTypeSimpleStyleCode <em>Type Simple Style Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _1Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _1Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetType getFacet() {
		return (FacetType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__FACET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacet(FacetType newFacet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__FACET, newFacet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacet(FacetType newFacet) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__FACET, newFacet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacetCategoryCodeType getFacetCategoryCode() {
		return (FacetCategoryCodeType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__FACET_CATEGORY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacetCategoryCode(FacetCategoryCodeType newFacetCategoryCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__FACET_CATEGORY_CODE, newFacetCategoryCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetCategoryCode(FacetCategoryCodeType newFacetCategoryCode) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__FACET_CATEGORY_CODE, newFacetCategoryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getFacetDefinitionText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__FACET_DEFINITION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacetDefinitionText(gov.niem.niem.proxy.xsd._2.String newFacetDefinitionText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__FACET_DEFINITION_TEXT, newFacetDefinitionText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetDefinitionText(gov.niem.niem.proxy.xsd._2.String newFacetDefinitionText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__FACET_DEFINITION_TEXT, newFacetDefinitionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getFacetText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__FACET_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacetText(gov.niem.niem.proxy.xsd._2.String newFacetText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__FACET_TEXT, newFacetText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacetText(gov.niem.niem.proxy.xsd._2.String newFacetText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__FACET_TEXT, newFacetText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(NamespaceType newNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE, newNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(NamespaceType newNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE, newNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getNamespacePrefixText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespacePrefixText(gov.niem.niem.proxy.xsd._2.String newNamespacePrefixText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT, newNamespacePrefixText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespacePrefixText(gov.niem.niem.proxy.xsd._2.String newNamespacePrefixText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT, newNamespacePrefixText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getNamespaceURI() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaceURI(gov.niem.niem.proxy.xsd._2.String newNamespaceURI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_URI, newNamespaceURI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceURI(gov.niem.niem.proxy.xsd._2.String newNamespaceURI) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_URI, newNamespaceURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getNamespaceVersionText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespaceVersionText(gov.niem.niem.proxy.xsd._2.String newNamespaceVersionText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT, newNamespaceVersionText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceVersionText(gov.niem.niem.proxy.xsd._2.String newNamespaceVersionText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT, newNamespaceVersionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyObjectType getProperty() {
		return (PropertyObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(PropertyObjectType newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY, newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(PropertyObjectType newProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyAbstractIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyAbstractIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyAbstractIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR, newPropertyAbstractIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAbstractIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyAbstractIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR, newPropertyAbstractIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertyAugmentationOfTypeQualifiedName() {
		return (QName)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyAugmentationOfTypeQualifiedName(QName newPropertyAugmentationOfTypeQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, newPropertyAugmentationOfTypeQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAugmentationOfTypeQualifiedName(QName newPropertyAugmentationOfTypeQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME, newPropertyAugmentationOfTypeQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertyDataTypeQualifiedName() {
		return (QName)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyDataTypeQualifiedName(QName newPropertyDataTypeQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME, newPropertyDataTypeQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyDataTypeQualifiedName(QName newPropertyDataTypeQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME, newPropertyDataTypeQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyDefinitionText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyDefinitionText(gov.niem.niem.proxy.xsd._2.String newPropertyDefinitionText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT, newPropertyDefinitionText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyDefinitionText(gov.niem.niem.proxy.xsd._2.String newPropertyDefinitionText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT, newPropertyDefinitionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyElementIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyElementIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyElementIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR, newPropertyElementIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyElementIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyElementIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR, newPropertyElementIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyInlineIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyInlineIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyInlineIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR, newPropertyInlineIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyInlineIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyInlineIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR, newPropertyInlineIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyMaxOccursText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyMaxOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMaxOccursText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT, newPropertyMaxOccursText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyMaxOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMaxOccursText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT, newPropertyMaxOccursText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyMinOccursText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyMinOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMinOccursText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT, newPropertyMinOccursText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyMinOccursText(gov.niem.niem.proxy.xsd._2.String newPropertyMinOccursText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT, newPropertyMinOccursText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getPropertyName() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyName(gov.niem.niem.proxy.xsd._2.String newPropertyName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_NAME, newPropertyName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(gov.niem.niem.proxy.xsd._2.String newPropertyName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_NAME, newPropertyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getPropertyNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyNamespace(NamespaceType newPropertyNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_NAMESPACE, newPropertyNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyNamespace(NamespaceType newPropertyNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_NAMESPACE, newPropertyNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertyQualifiedName() {
		return (QName)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyQualifiedName(QName newPropertyQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME, newPropertyQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyQualifiedName(QName newPropertyQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME, newPropertyQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getPropertyReferenceIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyReferenceIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR, newPropertyReferenceIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyReferenceIndicator(gov.niem.niem.proxy.xsd._2.Boolean newPropertyReferenceIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR, newPropertyReferenceIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getPropertySubstitutionGroupHeadQualifiedName() {
		return (QName)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertySubstitutionGroupHeadQualifiedName(QName newPropertySubstitutionGroupHeadQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, newPropertySubstitutionGroupHeadQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertySubstitutionGroupHeadQualifiedName(QName newPropertySubstitutionGroupHeadQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME, newPropertySubstitutionGroupHeadQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeObjectType getType() {
		return (TypeObjectType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeObjectType newType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE, newType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeObjectType newType) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeAdapterIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAdapterIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAdapterIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR, newTypeAdapterIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAdapterIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAdapterIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR, newTypeAdapterIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeAssociationIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAssociationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAssociationIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR, newTypeAssociationIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAssociationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAssociationIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR, newTypeAssociationIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeAugmentationIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeAugmentationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAugmentationIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR, newTypeAugmentationIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAugmentationIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeAugmentationIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR, newTypeAugmentationIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeBaseTypeQualifiedName() {
		return (QName)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeBaseTypeQualifiedName(QName newTypeBaseTypeQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME, newTypeBaseTypeQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeBaseTypeQualifiedName(QName newTypeBaseTypeQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME, newTypeBaseTypeQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContainsPropertyType getTypeContainsProperty() {
		return (TypeContainsPropertyType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeContainsProperty(TypeContainsPropertyType newTypeContainsProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY, newTypeContainsProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContainsProperty(TypeContainsPropertyType newTypeContainsProperty) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY, newTypeContainsProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeContentStyleCodeType getTypeContentStyleCode() {
		return (TypeContentStyleCodeType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeContentStyleCode(TypeContentStyleCodeType newTypeContentStyleCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE, newTypeContentStyleCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeContentStyleCode(TypeContentStyleCodeType newTypeContentStyleCode) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE, newTypeContentStyleCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getTypeDefinitionText() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDefinitionText(gov.niem.niem.proxy.xsd._2.String newTypeDefinitionText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT, newTypeDefinitionText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefinitionText(gov.niem.niem.proxy.xsd._2.String newTypeDefinitionText) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT, newTypeDefinitionText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.Boolean getTypeMetadataIndicator() {
		return (gov.niem.niem.proxy.xsd._2.Boolean)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeMetadataIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeMetadataIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR, newTypeMetadataIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMetadataIndicator(gov.niem.niem.proxy.xsd._2.Boolean newTypeMetadataIndicator) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR, newTypeMetadataIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gov.niem.niem.proxy.xsd._2.String getTypeName() {
		return (gov.niem.niem.proxy.xsd._2.String)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeName(gov.niem.niem.proxy.xsd._2.String newTypeName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_NAME, newTypeName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(gov.niem.niem.proxy.xsd._2.String newTypeName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_NAME, newTypeName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType getTypeNamespace() {
		return (NamespaceType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeNamespace(NamespaceType newTypeNamespace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_NAMESPACE, newTypeNamespace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeNamespace(NamespaceType newTypeNamespace) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_NAMESPACE, newTypeNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeQualifiedName() {
		return (QName)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeQualifiedName(QName newTypeQualifiedName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME, newTypeQualifiedName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeQualifiedName(QName newTypeQualifiedName) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME, newTypeQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSimpleStyleCodeType getTypeSimpleStyleCode() {
		return (TypeSimpleStyleCodeType)getMixed().get(_1Package.Literals.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeSimpleStyleCode(TypeSimpleStyleCodeType newTypeSimpleStyleCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_1Package.Literals.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE, newTypeSimpleStyleCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeSimpleStyleCode(TypeSimpleStyleCodeType newTypeSimpleStyleCode) {
		((FeatureMap.Internal)getMixed()).set(_1Package.Literals.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE, newTypeSimpleStyleCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _1Package.DOCUMENT_ROOT__FACET:
				return basicSetFacet(null, msgs);
			case _1Package.DOCUMENT_ROOT__FACET_CATEGORY_CODE:
				return basicSetFacetCategoryCode(null, msgs);
			case _1Package.DOCUMENT_ROOT__FACET_DEFINITION_TEXT:
				return basicSetFacetDefinitionText(null, msgs);
			case _1Package.DOCUMENT_ROOT__FACET_TEXT:
				return basicSetFacetText(null, msgs);
			case _1Package.DOCUMENT_ROOT__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT:
				return basicSetNamespacePrefixText(null, msgs);
			case _1Package.DOCUMENT_ROOT__NAMESPACE_URI:
				return basicSetNamespaceURI(null, msgs);
			case _1Package.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT:
				return basicSetNamespaceVersionText(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR:
				return basicSetPropertyAbstractIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				return basicSetPropertyAugmentationOfTypeQualifiedName(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				return basicSetPropertyDataTypeQualifiedName(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT:
				return basicSetPropertyDefinitionText(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR:
				return basicSetPropertyElementIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR:
				return basicSetPropertyInlineIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT:
				return basicSetPropertyMaxOccursText(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT:
				return basicSetPropertyMinOccursText(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAME:
				return basicSetPropertyName(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAMESPACE:
				return basicSetPropertyNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME:
				return basicSetPropertyQualifiedName(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR:
				return basicSetPropertyReferenceIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				return basicSetPropertySubstitutionGroupHeadQualifiedName(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE:
				return basicSetType(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR:
				return basicSetTypeAdapterIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR:
				return basicSetTypeAssociationIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR:
				return basicSetTypeAugmentationIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME:
				return basicSetTypeBaseTypeQualifiedName(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY:
				return basicSetTypeContainsProperty(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE:
				return basicSetTypeContentStyleCode(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT:
				return basicSetTypeDefinitionText(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR:
				return basicSetTypeMetadataIndicator(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_NAME:
				return basicSetTypeName(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_NAMESPACE:
				return basicSetTypeNamespace(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME:
				return basicSetTypeQualifiedName(null, msgs);
			case _1Package.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE:
				return basicSetTypeSimpleStyleCode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _1Package.DOCUMENT_ROOT__FACET:
				return getFacet();
			case _1Package.DOCUMENT_ROOT__FACET_CATEGORY_CODE:
				return getFacetCategoryCode();
			case _1Package.DOCUMENT_ROOT__FACET_DEFINITION_TEXT:
				return getFacetDefinitionText();
			case _1Package.DOCUMENT_ROOT__FACET_TEXT:
				return getFacetText();
			case _1Package.DOCUMENT_ROOT__NAMESPACE:
				return getNamespace();
			case _1Package.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT:
				return getNamespacePrefixText();
			case _1Package.DOCUMENT_ROOT__NAMESPACE_URI:
				return getNamespaceURI();
			case _1Package.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT:
				return getNamespaceVersionText();
			case _1Package.DOCUMENT_ROOT__PROPERTY:
				return getProperty();
			case _1Package.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR:
				return getPropertyAbstractIndicator();
			case _1Package.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				return getPropertyAugmentationOfTypeQualifiedName();
			case _1Package.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				return getPropertyDataTypeQualifiedName();
			case _1Package.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT:
				return getPropertyDefinitionText();
			case _1Package.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR:
				return getPropertyElementIndicator();
			case _1Package.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR:
				return getPropertyInlineIndicator();
			case _1Package.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT:
				return getPropertyMaxOccursText();
			case _1Package.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT:
				return getPropertyMinOccursText();
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName();
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAMESPACE:
				return getPropertyNamespace();
			case _1Package.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME:
				return getPropertyQualifiedName();
			case _1Package.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR:
				return getPropertyReferenceIndicator();
			case _1Package.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				return getPropertySubstitutionGroupHeadQualifiedName();
			case _1Package.DOCUMENT_ROOT__TYPE:
				return getType();
			case _1Package.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR:
				return getTypeAdapterIndicator();
			case _1Package.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR:
				return getTypeAssociationIndicator();
			case _1Package.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR:
				return getTypeAugmentationIndicator();
			case _1Package.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME:
				return getTypeBaseTypeQualifiedName();
			case _1Package.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY:
				return getTypeContainsProperty();
			case _1Package.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE:
				return getTypeContentStyleCode();
			case _1Package.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT:
				return getTypeDefinitionText();
			case _1Package.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR:
				return getTypeMetadataIndicator();
			case _1Package.DOCUMENT_ROOT__TYPE_NAME:
				return getTypeName();
			case _1Package.DOCUMENT_ROOT__TYPE_NAMESPACE:
				return getTypeNamespace();
			case _1Package.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName();
			case _1Package.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE:
				return getTypeSimpleStyleCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _1Package.DOCUMENT_ROOT__FACET:
				setFacet((FacetType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__FACET_CATEGORY_CODE:
				setFacetCategoryCode((FacetCategoryCodeType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__FACET_DEFINITION_TEXT:
				setFacetDefinitionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__FACET_TEXT:
				setFacetText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE:
				setNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT:
				setNamespacePrefixText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_URI:
				setNamespaceURI((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT:
				setNamespaceVersionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR:
				setPropertyAbstractIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				setPropertyAugmentationOfTypeQualifiedName((QName)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				setPropertyDataTypeQualifiedName((QName)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT:
				setPropertyDefinitionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR:
				setPropertyElementIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR:
				setPropertyInlineIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT:
				setPropertyMaxOccursText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT:
				setPropertyMinOccursText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAMESPACE:
				setPropertyNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME:
				setPropertyQualifiedName((QName)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR:
				setPropertyReferenceIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				setPropertySubstitutionGroupHeadQualifiedName((QName)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE:
				setType((TypeObjectType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR:
				setTypeAdapterIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR:
				setTypeAssociationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR:
				setTypeAugmentationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME:
				setTypeBaseTypeQualifiedName((QName)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY:
				setTypeContainsProperty((TypeContainsPropertyType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE:
				setTypeContentStyleCode((TypeContentStyleCodeType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT:
				setTypeDefinitionText((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR:
				setTypeMetadataIndicator((gov.niem.niem.proxy.xsd._2.Boolean)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_NAME:
				setTypeName((gov.niem.niem.proxy.xsd._2.String)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_NAMESPACE:
				setTypeNamespace((NamespaceType)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)newValue);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE:
				setTypeSimpleStyleCode((TypeSimpleStyleCodeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _1Package.DOCUMENT_ROOT__FACET:
				setFacet((FacetType)null);
				return;
			case _1Package.DOCUMENT_ROOT__FACET_CATEGORY_CODE:
				setFacetCategoryCode((FacetCategoryCodeType)null);
				return;
			case _1Package.DOCUMENT_ROOT__FACET_DEFINITION_TEXT:
				setFacetDefinitionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__FACET_TEXT:
				setFacetText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE:
				setNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT:
				setNamespacePrefixText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_URI:
				setNamespaceURI((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT:
				setNamespaceVersionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY:
				setProperty((PropertyObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR:
				setPropertyAbstractIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				setPropertyAugmentationOfTypeQualifiedName((QName)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				setPropertyDataTypeQualifiedName((QName)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT:
				setPropertyDefinitionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR:
				setPropertyElementIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR:
				setPropertyInlineIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT:
				setPropertyMaxOccursText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT:
				setPropertyMinOccursText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAME:
				setPropertyName((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAMESPACE:
				setPropertyNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME:
				setPropertyQualifiedName((QName)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR:
				setPropertyReferenceIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				setPropertySubstitutionGroupHeadQualifiedName((QName)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE:
				setType((TypeObjectType)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR:
				setTypeAdapterIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR:
				setTypeAssociationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR:
				setTypeAugmentationIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME:
				setTypeBaseTypeQualifiedName((QName)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY:
				setTypeContainsProperty((TypeContainsPropertyType)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE:
				setTypeContentStyleCode((TypeContentStyleCodeType)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT:
				setTypeDefinitionText((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR:
				setTypeMetadataIndicator((gov.niem.niem.proxy.xsd._2.Boolean)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_NAME:
				setTypeName((gov.niem.niem.proxy.xsd._2.String)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_NAMESPACE:
				setTypeNamespace((NamespaceType)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME:
				setTypeQualifiedName((QName)null);
				return;
			case _1Package.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE:
				setTypeSimpleStyleCode((TypeSimpleStyleCodeType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _1Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _1Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _1Package.DOCUMENT_ROOT__FACET:
				return getFacet() != null;
			case _1Package.DOCUMENT_ROOT__FACET_CATEGORY_CODE:
				return getFacetCategoryCode() != null;
			case _1Package.DOCUMENT_ROOT__FACET_DEFINITION_TEXT:
				return getFacetDefinitionText() != null;
			case _1Package.DOCUMENT_ROOT__FACET_TEXT:
				return getFacetText() != null;
			case _1Package.DOCUMENT_ROOT__NAMESPACE:
				return getNamespace() != null;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_PREFIX_TEXT:
				return getNamespacePrefixText() != null;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_URI:
				return getNamespaceURI() != null;
			case _1Package.DOCUMENT_ROOT__NAMESPACE_VERSION_TEXT:
				return getNamespaceVersionText() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY:
				return getProperty() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_ABSTRACT_INDICATOR:
				return getPropertyAbstractIndicator() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_AUGMENTATION_OF_TYPE_QUALIFIED_NAME:
				return getPropertyAugmentationOfTypeQualifiedName() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_DATA_TYPE_QUALIFIED_NAME:
				return getPropertyDataTypeQualifiedName() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_DEFINITION_TEXT:
				return getPropertyDefinitionText() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_ELEMENT_INDICATOR:
				return getPropertyElementIndicator() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_INLINE_INDICATOR:
				return getPropertyInlineIndicator() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_MAX_OCCURS_TEXT:
				return getPropertyMaxOccursText() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_MIN_OCCURS_TEXT:
				return getPropertyMinOccursText() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAME:
				return getPropertyName() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_NAMESPACE:
				return getPropertyNamespace() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_QUALIFIED_NAME:
				return getPropertyQualifiedName() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_REFERENCE_INDICATOR:
				return getPropertyReferenceIndicator() != null;
			case _1Package.DOCUMENT_ROOT__PROPERTY_SUBSTITUTION_GROUP_HEAD_QUALIFIED_NAME:
				return getPropertySubstitutionGroupHeadQualifiedName() != null;
			case _1Package.DOCUMENT_ROOT__TYPE:
				return getType() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_ADAPTER_INDICATOR:
				return getTypeAdapterIndicator() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_ASSOCIATION_INDICATOR:
				return getTypeAssociationIndicator() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_AUGMENTATION_INDICATOR:
				return getTypeAugmentationIndicator() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_BASE_TYPE_QUALIFIED_NAME:
				return getTypeBaseTypeQualifiedName() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_CONTAINS_PROPERTY:
				return getTypeContainsProperty() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_CONTENT_STYLE_CODE:
				return getTypeContentStyleCode() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_DEFINITION_TEXT:
				return getTypeDefinitionText() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_METADATA_INDICATOR:
				return getTypeMetadataIndicator() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_NAME:
				return getTypeName() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_NAMESPACE:
				return getTypeNamespace() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_QUALIFIED_NAME:
				return getTypeQualifiedName() != null;
			case _1Package.DOCUMENT_ROOT__TYPE_SIMPLE_STYLE_CODE:
				return getTypeSimpleStyleCode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
