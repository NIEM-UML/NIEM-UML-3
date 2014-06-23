package org.modeldriven.magicdraw.niem.qvt;

import java.util.Date;

import org.modeldriven.magicdraw.niem.diagram.toolbar.NIEMTypeAction;
import org.modeldriven.magicdraw.niem.obsolete.CommonRealizationAction;

import com.nomagic.magicdraw.ui.actions.DrawPathDiagramAction;
import com.nomagic.magicdraw.ui.actions.DrawShapeDiagramAction;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Enumeration;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.EnumerationLiteral;

public interface NIEM_ProfileConstants {
	public String PimProfileName="NIEM_PIM_Profile";
	public String PsmProfileName="NIEM_PSM_Profile";
	public String MpdProfileName="Model_Package_Description_Profile";
	public String CommonProfileName="NIEM_Common_Profile";

	public String InformationModelStereotypeName="InformationModel";
	public String NIEMTypeStereotypeName="NIEMType";
	public String ObjectTypeStereotypeName="ObjectType";
	public String AdapterTypeStereotypeName="AdapterType";
	public String AssociationTypeStereotypeName="AssociationType";
	public String AugmentationTypeStereotypeName="AugmentationType";
	public String MetadataTypeStereotypeName="MetadataType";
	public String LocalVocabularyStereotypeName="LocalVocabulary";

	public String ReferenceNameStereotypeName="ReferenceName";
	public String ChoiceStereotypeName="Choice";
	public String PropertyHolderStereotypeName="PropertyHolder";
	public String ListStereotypeName="List";
	public String UnionStereotypeName="Union";
	public String ValueRestrictionStereotypeName="ValueRestriction";
	public String XSDRepresentationRestrictionStereotypeName="XSDRepresentationRestriction";
	public String ModelPackageDescriptionStereotypeName="ModelPackageDescription";
	public String ModelPackageDescriptionFileSetStereotypeName="ModelPackageDescriptionFileSet";
	public String RestrictionStereotypeName="Restriction";
	public String AugmentsStereotypeName="Augments";
	public String RolePlayedByStereotypeName="RolePlayedBy";
	public String XSDSimpleContentStereotypeName="XSDSimpleContent";
	public String ModelPackageDescriptionFileStereotypeName="ModelPackageDescriptionFile";
	public String ModelPackageDescriptionRelationshipStereotypeName="ModelPackageDescriptionRelationship";
	public String AugmentationApplicationStereotypeName="AugmentationApplication";
	public String MetadataApplicationStereotypeName="MetadataApplication";
	public String ReferencesStereotypeName="References";
	public String NamespaceStereotypeName="Namespace";
	public String RoleOfStereotypeName="RoleOf";
	public String UnionOfStereotypeName="UnionOf";
	public String XSDPropertyStereotypeName="XSDProperty";
	public String XSDAnyPropertyStereotypeName="XSDAnyProperty";
	public String SequenceIDStereotypeName="SequenceID";
	public String DocumentationStereotypeName="Documentation";



	public String NIEMNameTagName="NIEMName";
	public String defaultPurposeTagName="defaultPurpose";
	public String targetNamespaceTagName="targetNamespace";
	public String defaultPrefixTagName="defaultPrefix";
	public String isConformantTagName="isConformant";
	public String versionTagName="version";
	public String natureCodeTagName="natureCode";
	public String relativePathNameTagName="relativePathName";
	public String literalTagName="literal";
	public String definitionTagName="definition";
	
	public String fractionDigitsTagName="fractionDigits";
	public String lengthTagName="length";
	public String maxExclusiveTagName="maxExclusive";
	public String maxInclusiveTagName="maxInclusive";
	public String maxLengthTagName="maxLength";
	public String minExclusiveTagName="minExclusive";
	public String minInclusiveTagName="minInclusive";
	public String minLengthTagName="minLength";
	public String patternTagName="pattern";
	public String totalDigitsTagName="totalDigits";

	
	public String purposeCodeTagName="purposeCode";
	public String descriptionTextTagName="descriptionText";
	public String mpdVersionIDTagName="mpdVersionID";
	public String mpdBaseURITagName="mpdBaseURI";
	public String mpdClassCodeTagName="mpdClassCode";
	public String SecurityMarkingTextTagName="SecurityMarkingText";
	public String CreationDateTagName="CreationDate";
	public String StatusTextTagName="StatusText";
	public String KeywordTextTagName="KeywordText";
	public String DomainTextTagName="DomainText";
	public String PurposeTextTagName="PurposeText";
	public String ExchangePatternTextTagName="ExchangePatternText";
	public String ExchangePartnerNameTagName="ExchangePartnerName";
	public String ASNameTagName="ASName";
	public String ASAddressTextTagName="ASAddressText";
	public String ASWebSiteURLTagName="ASWebSiteURL";
	public String POCTagName="POC";


	public String DefaultPurposeCodeTypeName="DefaultPurposeCode";
	public String ModelPackageDescriptionClassCodeName="ModelPackageDescriptionClassCode";
	public String NatureCodeName="NatureCode";
	public String PurposeCodeName="PurposeCode";

	public String subsetLiteralName="subset";
	public String referenceLiteralName="reference";
	public String extensionLiteralName="extension";
	public String exchangeLiteralName="exchange";
	public String constraintLiteralName="constraint";
	
	public String subset_schema_setLiteralName="subset_schema_set";
	public String file_setLiteralName="file_set";
	public String iepdLiteralName="iepd";
	public String eiemLiteralName="eiem";
	
	public String subset_schemaLiteralName="subset_schema";
	public String sample_instanceLiteralName="sample_instance";
	public String web_serviceLiteralName="web_service";
	public String business_rulesLiteralName="business_rules";
	public String xsdLiteralName="xsd";
	public String xmlLiteralName="xml";
	public String wsdlLiteralName="wsdl";
	public String schematronLiteralName="schematron";
	public String domain_updateLiteralName="domain_update";
	public String updatesLiteralName="updates";
	public String conformsToLiteralName="conforms_to";
	public String changelogLiteralName="changelog";
	public String changelogPackageName="changelog";
	public String businessRulesPackageName=business_rulesLiteralName;
	public String businessRuleSuitePackageName="myRuleSuite";
	
	public String ElementImportAction_ID="NIEM_ElementImport";

	public String TYPE_SUFFIX="Type";
	public String SIMPLE_MODIFIER="Simple";
	public String CODE_MODIFIER="Code";
	public String AUGMENTATION_MODIFIER="Augmentation";
	public String METADATA_MODIFIER="Metadata";
	public String ASSOCIATION_MODIFIER="Association";
	public String ADAPTER_MODIFIER="Adapter";
	public String SIMPLETYPE_SUFFIX=SIMPLE_MODIFIER+TYPE_SUFFIX;
	public String CODESIMPLETYPE_SUFFIX=CODE_MODIFIER+SIMPLETYPE_SUFFIX;
	public String CODETYPE_SUFFIX=CODE_MODIFIER+TYPE_SUFFIX;
	public String AUGMENTATION_SUFFIX=AUGMENTATION_MODIFIER+TYPE_SUFFIX;
	public String METADATA_SUFFIX=METADATA_MODIFIER+TYPE_SUFFIX;
	public String ADAPTER_SUFFIX=ADAPTER_MODIFIER+TYPE_SUFFIX;
	public String ASSOCIATION_SUFFIX=ASSOCIATION_MODIFIER+TYPE_SUFFIX;
	public String PROPERTYHOLDER_SUFFIX="PropertyHolder";
	public String REFERENCE_SUFFIX="Reference";
	public String ASSOCIATION_PROPERTY_SUFFIX=ASSOCIATION_MODIFIER;
	public String AUGMENTATION_PROPERTY_SUFFIX=AUGMENTATION_MODIFIER;
	public String METADATA_PROPERTY_SUFFIX=METADATA_MODIFIER;
	public String ROLEOF_PREFIX="RoleOf";

	public String REFERENCE="Reference";
	public String CONTENT="Content";
	public String ASSOCIATION="Association";


	public String XMLSCHEMA_DIRECTORYNAME="XMLschemas";
	public String XMLSAMPLES_DIRECTORYNAME="XMLsamples";
	public String XSL_DIRECTORYNAME="xsl";
	public String SUBSET_DIRECTORYNAME="subset";
	public String CONSTRAINT_DIRECTORYNAME="constraint";
	public String NIEM_DIRECTORYNAME="niem";
	public String NIEM_PAKAGENAME="niem";
	public String CATALOG_FILENAME="catalog.mpdcat";
	public String OASIS_FILENAME="catalog.catalog";// OASIS Catalog, only used for reference models?
	public String WANTLIST_FILENAME="wantlist.wlxml";
	public String XMLVIEWER_FILENAME="XMLviewer-gif.xsl";
	
	

//		public String NIEM_PURPOSES="http://reference.niem.gov/niem/resources/purposes/1#";
	public String NIEM_PURPOSES="http://reference.niem.gov/niem/resource/mpd/lexicon/1.0/purpose#";
	public String NIEM_PURPOSES_EXCHANGE_SCHEMA=NIEM_PURPOSES+"exchange-schema";
	public String NIEM_PURPOSES_EXTENSION_SCHEMA=NIEM_PURPOSES+"extension-schema";
	public String NIEM_PURPOSES_DATAMODEL=NIEM_PURPOSES+"data-model";
	public String NIEM_PURPOSES_SAMPLEINSTANCE=NIEM_PURPOSES+"sample-instance";
	public String NIEM_PURPOSES_REPORT=NIEM_PURPOSES+"report";
	public String NIEM_PURPOSES_WANTLIST=NIEM_PURPOSES+"wantlist";
	public String NIEM_PURPOSES_MASTER_DOC=NIEM_PURPOSES+"master-document";
	public String NIEM_PURPOSES_CATALOG=NIEM_PURPOSES+"catalog";
	public String NIEM_PURPOSES_TRANSFORMATION=NIEM_PURPOSES+"transformation";
	

	public String NIEM_NATURES="http://reference.niem.gov/niem/resource/mpd/lexicon/1.0/nature#";
	public String NIEM_NATURES_XML=NIEM_NATURES+"xml";
	public String NIEM_NATURES_XSLT=NIEM_NATURES+"xslt";
	public String NIEM_NATURES_HTML=NIEM_NATURES+"html";
	public String NIEM_NATURES_WANTLIST=NIEM_NATURES+"wantlist";
	public String NIEM_NATURES_ZIP=NIEM_NATURES+"zip";
	public String NIEM_NATURES_XSD=NIEM_NATURES+"xsd";
	public String NIEM_NATURES_DOC=NIEM_NATURES+"doc";
	public String NIEM_NATURES_CATALOG=NIEM_NATURES+"catalog";
	
	public String DomainUpdateConformsToURI="http://niem.gov/niem/specification/domain-update/1.0/";

	//public String PRESERVE_PSM_OPTION="Preserve_PSM_Model";
	public String MERGE_PSM_OPTION="Merge_PSM_Model";
	public String PROVISION_MASTERDOCUMENT_OPTION="Provision_Master_Document";
	public String PROVISION_MASTERDOCUMENT_DIAGRAMS_OPTION="Provision_Master_Document_Diagrams";
	public String RELAYOUT_SUBSET_DIAGRAMS_OPTION="Relayout_Subset_Diagrams";
	
	public String MPD_WORKING_DIRECTORY_OPTION="MPD_Working_Directory";
	public String DOCUMENT_ELEMENT_INSTANCES_OPTION="Document_Element_Instances";
	public String PROVISION_SCHEMATRON_OPTION="Provision_Schematron";
	
	
	public String MASTER_DOCUMENT_FILENAME="master-document.odt";
	public String modelGroupDefinitionPackageName="modelGroupDefinition";

}

