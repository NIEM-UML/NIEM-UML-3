/**
 * 
 */
package org.modeldriven.magicdraw.niem.diagram.context;

/**
 * @author tom
 *
 */
public interface ToolTipConstants {
	public String HTML_TAIL_FRAGMENT="</ul></html> ";
	public String CREATES_FRAGMENT="<html><ul><li>Creates ";
	public String CREATES_AND_ADDS_FRAGMENT=CREATES_FRAGMENT+"and Adds ";
	public String CREATES_AND_ADDS_NOTATION_FRAGMENT="<li>Creates and adds the corresponding notation to the current diagram</li>";
	public String ADDS_TO_INFORMATION_MODEL_FRAGMENT="</li><li>Adds it to the &lt;&lt;InformationModel>> nearest current selection (or diagram)</li> ";
	public String ADDS_TO_CLASSIFIER_FRAGMENT="</li><li>Adds it to the selected Classifier</li> ";
	public String ADDS_TO_CLASSIFIER_TAIL_FRAGMENT=ADDS_TO_CLASSIFIER_FRAGMENT+
			CREATES_AND_ADDS_NOTATION_FRAGMENT+
			HTML_TAIL_FRAGMENT;
	public String CREATES_AND_ADDS_TAIL_FRAGMENT=ADDS_TO_INFORMATION_MODEL_FRAGMENT+
			CREATES_AND_ADDS_NOTATION_FRAGMENT+
			HTML_TAIL_FRAGMENT;
	
	public String POC_ACTION_TOOLTIP=CREATES_AND_ADDS_FRAGMENT+"an Instance of POC to the selected &lt;&lt;ModelPackageDescription>></li> "+
			"<li>opens the new POC Specification to enable creation/editing of the Slots for POCEmail, POCName, POCTelephone</li>"+
			"<li>POC is a set of metadata used to contact the authoritative source for an MPD.</li>"+
			HTML_TAIL_FRAGMENT;
	/*
	public String TOOLBAR_CLASS_ACTION_TOOLTIP=CREATES_FRAGMENT+"a UML Class implicitly representing a NIEM &lt;&lt;ObjectType>>"+
			"</li>"+HTML_TAIL_FRAGMENT;
			*/
	public String CLASS_ACTION_TOOLTIP=CREATES_FRAGMENT+"a UML Class implicitly representing a NIEM &lt;&lt;ObjectType>>"+
			CREATES_AND_ADDS_TAIL_FRAGMENT;
	public String DATATYPE_ACTION_TOOLTIP=CREATES_FRAGMENT+"a UML DataType representing a NIEM SimpleType"+CREATES_AND_ADDS_TAIL_FRAGMENT;
	public String VALUE_RESTRICTION_ACTION_TOOLTIP=CREATES_FRAGMENT+"a &lt;&lt;ValueRestriction>> PrimitiveType representing a NIEM SimpleType"+CREATES_AND_ADDS_TAIL_FRAGMENT;
	public String PRIMITIVE_TYPE_ACTION_TOOLTIP=CREATES_FRAGMENT+"a PrimitiveType representing a NIEM SimpleType"+CREATES_AND_ADDS_TAIL_FRAGMENT;
	public String SEQUENCEID_ACTION_TOOLTIP=CREATES_FRAGMENT+"a &lt;&lt;SequenceID>> Property representing a NIEM sequenceid attribute"+ADDS_TO_CLASSIFIER_TAIL_FRAGMENT;
	public String XSDANYPROPERTY_ACTION_TOOLTIP=CREATES_FRAGMENT+"a &lt;&lt;XSDAnyProperty>> Property representing a NIEM xsd:any particle"+ADDS_TO_CLASSIFIER_TAIL_FRAGMENT;
	public String XSDPROPERTY_ACTION_TOOLTIP=CREATES_FRAGMENT+"an &lt;&lt;XSDProperty>> Property representing a NIEM Containment Element"+
			ADDS_TO_CLASSIFIER_FRAGMENT+
			"<li>Provides Dialog to select Type</li>"+
			"<li>Makes element abstract if no Type Selected</li>"+
			"<li>Adds owned Comment</li>"+
			CREATES_AND_ADDS_NOTATION_FRAGMENT+
			HTML_TAIL_FRAGMENT;
			;
	public String ENUMERATION_ACTION_TOOLTIP=CREATES_FRAGMENT+"a UML Enumeration representing a NIEM SimpleType"+CREATES_AND_ADDS_TAIL_FRAGMENT;
	public String COMPLEX_ENUMERATION_ACTION_TOOLTIP=CREATES_FRAGMENT+"a UML Enumeration representing a NIEM ComplexType with simple content"+CREATES_AND_ADDS_TAIL_FRAGMENT;
	public String MODEL_PACKAGE_DESCRIPTION_FILESET_TOOLTIP=CREATES_FRAGMENT+"a &lt;&lt;ModelPackageDescriptionFileSet>> Component</li>"+
			"<li>Adds it to the selected &lt;&lt;ModelPackageDescription>> Component</li> "+
			"<li>Initializes some tag values</li> "+
			CREATES_AND_ADDS_NOTATION_FRAGMENT+
			"<li>It is <b>not</b> necessary to define a &lt;&lt;ModelPackageDescriptionFileSet>> Component for FileSets defined by the MPD, as these will be provisioned automatically.</li> "+
//			"<li>A &lt;&lt;ModelPackageDescriptionFileSet>> Component Component represents a set of files in an MPD that are grouped for a specific purpose, function, or classification. For example, a set of MPD files might represent a schema subset, extension schema set, set of documentation, or set of test files. The MPD catalog uses the File element to represent artifacts, and the FileSet element to represent a set of artifacts. Note that both files and file sets are considered MPD artifacts.</li> "+
			HTML_TAIL_FRAGMENT;
	public String XML_INSTANCE_DOCUMENT_BROWSER_TOOLTIP="<html><ul><li>Browser for NIEM XML Instance Documents</li>"+
			"<li>The Tree is an Instance of an Exchange &&InformationModel>> Element</li>"+
			"<li>Each Node of Containment Tree represents an XML Element/Attribute</li>"+
			"<li>Name of Instance Specification corresponds to NIEM id</li>"+
			"<li>NIEM References are InstanceValue/InstanceSpecification matches</li>"+
			"<li>Use Properties Window to edit values of selected Leaf Node</li>"+
			"<li>Right click node for additional NIEM and other actions</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_XML_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates a NIEM XML Instance Document Package for each selected (or contained) exchange <<InformationModel>> Property</li>"+
			"<li>If no Property is selected, brings up Dialog for selection of exchange <<InformationModel>> Properties</li>"+
			"<li>Creates &lt;&lt;ModelPackageDescriptionFile>> Realization from &lt;&lt;ModelPackageDescription>> Component to instance Package</li>"+
			"<li>Creates Instance Specifications, Slots, and ValueSpecifications reflecting instantiation of Types, Properties, Values</li>"+
			"<li>Result should be viewed in the NIEM XML Instance Browser</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String ADD_SIMPLE_VALUE_SPECIFICATION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates an additional Literal Value Specification for the currently selected Value or Slot</li>"+
			"<li>The value is formatted according to the corresponding XML Primitive Type (but may not conform to applied facets) </li>"+
			HTML_TAIL_FRAGMENT;
	
	public String SET_ENUMERATION_LITERAL_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Set the currently selected value to a valid EnumerationLiteral</li>"+
			"<li>Brings up Dialog for selection of EnumerationLiteral</li>"+
			HTML_TAIL_FRAGMENT;
	public String SET_METADATA_REFERENCE_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Set the Metadata Reference for the currently selected value</li>"+
			"<li>Brings up Dialog for selection of Metadata Instance</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String SET_REFERENCE_VALUE_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Set the Instance Reference for the currently selected value</li>"+
			"<li>Brings up Dialog for selection of Referenceable Instances in the context of the selected Value</li>"+
			HTML_TAIL_FRAGMENT;
	public String SLOT_FEATURE_CHANGE_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Change the Slot Feature for the currently selected value</li>"+
			"<li>Brings up Dialog for selection of Features in the context of the selected Value</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String REMOVE_VALUE_SPECIFICATION_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Deletes the currently selected value, along with any nested contained instances.</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_INSTANCE_PROPERTY_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates a fully populated additional Slot for the currently selected Instance Value</li>"+
			"<li>A Selection Dialog is provided populated with legal Property options in the context of the Instance Value </li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_VALUE_SPECIFICATION_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates an additional, fully populated, Instance Value Specification for the currently selected Value or Slot</li>"+
			"<li>If the context is a Reference Element, a Selection Dialog is provided for Referenceable Elements within the Document </li>"+
			"<li>If the context is a Containment Element, a Selection Dialog is provided for the type of the Element </li>"+
			"<li>If the Containment Element has only one legal type, the Selection Dialog is suppressed </li>"+
			HTML_TAIL_FRAGMENT;
	public String OPEN_INSTANCE_SPECIFICATION_INSTANCE_DOCUMENT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Specification Dialog for the InstanceSpecification of a Value</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String SET_INSTANCE_TYPE_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Selection Dialog for the Type of an Instance</li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_BUSINESS_RULE_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates a UML Contraint for currently selected Classifier</li>"+
			"<li>Applies validationRule stereotype to the Constraint</li>"+
			"<li>Populates Constraint and Stereotype tags with default values</li>"+
			"<li>Brings up Constraint Dialog for OCL Entry</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_MPD_CHANGELOG_ACTION_TOOLTIP="<html><ul><li>Opens File Dialog to select previous version of Project</li>"+
			"<li>Performs project difference analysis. </li>"+
			"<li>Creates changelog Package</li>"+
			"<li>Sets URI of changelog Package to Previous Version of project</li>"+
			"<li>Creates &lt;&lt;ModelPackageDescriptionFile>> Realization from &lt;&lt;ModelPackageDescription>> Component to changelog Package</li>"+
			"<li>Creates a Default ChangeInformation Package nested in changelog Package.  All change entries will be tied to this Default.</li>"+
			"<li>All new and modified model elements represented as UML Realization.</li>"+
			"<li>All removed model elements represented as UML Artifact with linkage information to previous version of Project.</li>"+
			"<li>Creates and opens a changelog diagram  identifying all changes</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_BUSINESS_RULE_SUITE_ACTION_TOOLTIP="<html><ul><li>Adds Business Rule Suite to MPD Project.</li>"+
			"<li>Creates packages representing business-rules.</li>"+
			"<li>Creates Magic Draw &lt;&lt;activeValidationSuite>></li>"+
			"<li>Creates &lt;&lt;ModelPackageDescriptionFile>> Usage from  &lt;&lt;ModelPackageDescription>> Component to &lt;&lt;activeValidationSuite>></li>"+
			"<li>&lt;&lt;activeValidationSuite>> Default Scope is the MPD </li>"+
			"<li>Validation Options Dialog is opened, allowing refinement of Scope(s) for new &lt;&lt;activeValidationSuite>></li>"+
			"<li>&lt;&lt;activeValidationSuite>> Enables active validation of OCL constraints against Document Instances</li>"+
			"<li>&lt;&lt;activeValidationSuite>> Represents a Schematron artifact in provisioned MPD</li>"+
			HTML_TAIL_FRAGMENT;
	
	
	public String REFRESH_SUBSET_DEFINITIONS_ACTION_TOOLTIP="<html>"+
			"for every applicable subset model component within the MPD:<ul>"+
			"<li>If necessary, creates a subset Comment </li>"+
			"<li>Sets the body of the subset Comment to the corresponding reference Comment</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String ADD_MPD_INITIALVERSION_CHANGELOG_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates changelog Package</li>"+
			"<li>Creates &lt;&lt;ModelPackageDescriptionFile>> Realization from &lt;&lt;ModelPackageDescription>> Component to changelog Package</li>"+
			"<li>Creates and opens a changelog diagram (with no changes)</li>"+
			HTML_TAIL_FRAGMENT;
	public String REFRESH_CHANGELOG_ACTION_TOOLTIP="<html><ul>"+
			"<li>Performs project difference analysis based on originally specified model version. </li>"+
			"<li>Results are merged with existing changelog Package.  </li>"+
			"<li>Obsolete entries from existing changelog are removed.</li>"+
			"<li>All new and modified model elements represented as UML Realization.</li>"+
			"<li>All removed model elements represented as UML Artifact with linkage information to previous version of Project.</li>"+
			"<li>Updates and opens changelog diagram  identifying all changes</li>"+
			HTML_TAIL_FRAGMENT;
	public String RESET_CHANGELOG_BASELINE_ACTION_TOOLTIP="<html><ul><li>Opens File Dialog to select (perhaps different) previous version of Project</li>"+
			"<li>Performs project difference analysis. </li>"+
			"<li>Sets URI of changelog Package to Previous Version of project</li>"+
			"<li>Removes any previous changelog entries and diagrams</li>"+
			"<li>Creates a Default ChangeInformation Package nested in changelog Package.  All change entries will be tied to this Default.</li>"+
			"<li>All new and modified model elements represented as UML Realization.</li>"+
			"<li>All removed model elements represented as UML Artifact with linkage information to previous version of Project.</li>"+
			"<li>Creates and opens a changelog diagram  identifying all changes</li>"+
			HTML_TAIL_FRAGMENT;

	public String LUCENE_ADD_SUBSET_CLASSIFIER_ACTION_TOOLTIP="<html><ul>"+
			"<li>Finds or creates subset &lt;&lt;InformationModel>></li>"+
			"<li>Creates subset Classifier corresponding to selected reference Classifier and adds to subset &lt;&lt;InformationModel>></li>"+
			"<li>Selects added Classifier in Containment Tree, if enabled</li>"+
			"<li>Adds Classifier to Active Diagram, lays it out, and scrolls to it; if enabled</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_ADD_SUBSET_ENUMERATION_LITERAL_ACTION_TOOLTIP="<html><ul>"+
			"<li>Finds or creates subset &lt;&lt;InformationModel>></li>"+
			"<li>Finds or Creates subset Enumeration</li>"+
			"<li>Creates subset EnumerationLiteral corresponding to selected reference EnumerationLiteral and adds to subset Enumeration</li>"+
			"<li>Selects added EnumerationLiteral in Containment Tree, if enabled</li>"+
			"<li>Adds EnumerationLiteral to Active Diagram, lays it out, and scrolls to it; if enabled</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_ADD_SUBSET_PROPERTY_ACTION_TOOLTIP="<html><ul>"+
			"<li>Finds or creates subset &lt;&lt;InformationModel>></li>"+
			"<li>Finds or Creates subset Classifier</li>"+
			"<li>Creates subset Property corresponding to selected reference Property and adds to subset Classifier</li>"+
			"<li>Selects added Property in Containment Tree, if enabled</li>"+
			"<li>Adds Property to Active Diagram, lays it out, and scrolls to it; if enabled</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_FIND_SIMILAR_ACTION_TOOLTIP="<html><ul>"+
			"<li>Repopulates table with search results based on similarity to current (reference model) selection</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_SPECIFICATION_SELECTION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Starts Specification Dialog for current (reference model) selection</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_SEARCH_REFERENCE_MODELS_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates Search Dialog with Results Table</li>"+
			"<li>Populates table with search results based on similarity to current selection</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_SEARCH_REFERENCE_MODELS_QUERY_ACTION_TOOLTIP="<html><ul>"+
			"<li>Pops up Input Dialog for entering Query Expression</li>"+
			"<li>Creates Search Dialog with Results Table</li>"+
			"<li>Populates table with search results based on similarity to query expression</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_CONTAINMENT_TREE_SELECTION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Selects element in Containment Tree, expanding and scrolling as required</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_INHERITANCE_TREE_SELECTION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Selects element in Inheritance Tree, expanding and scrolling as required</li>"+
			HTML_TAIL_FRAGMENT;
	public String LUCENE_LOAD_MODULE_ACTION_TOOLTIP="<html><ul>"+
			"<li>Finds and Loads Module of selected element into the project</li>"+
			HTML_TAIL_FRAGMENT;
	public String DEFINE_SUBSET_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select reference &lt;&lt;InformationModel>>s, Classifiers, Properties to be subset </li>"+
			"<li>Creates subset &lt;&lt;InformationModel>>s, Classifiers, Properties for selected reference elements </li>"+
			"<li>Finds or Creates requisite container &lt;&lt;InformationModel>>s, Classifiers </li>"+
			"<li>Finds or Creates requisite inherited Classifiers, subsetted Properties </li>"+
			HTML_TAIL_FRAGMENT;
	public String ENTITY_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select editable &lt;&lt;InformationModel>>  Classifiers</li>"+
			"<li>Creates a separate Diagram for each selected Classifier </li>"+
			"<li>The generalizations, specializations, associations to/from other Classifiers are included in each diagram</li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_ENTITY_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates a Class Diagram for selected Classifier </li>"+
			"<li>The generalizations, specializations, associations to/from other Classifiers are included in each diagram</li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_BASE_TYPE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates a Class Diagram for selected Classifier </li>"+
			"<li>Diagram include selected Classifier plus all base types and derived types, transitively</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_SUBSET_MODELS_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select reference (read-only reference, subset, extension) &lt;&lt;InformationModel>>s to be subsetted</li>"+
			"<li>For each selected reference &lt;&lt;InformationModel>>, a subset (or extension) &lt;&lt;InformationModel>> is created</li>"+
			"<li>A &lt;&lt;References>> Realization is made from the new subset &lt;&lt;InformationModel>> to the selected reference &lt;&lt;InformationModel>></li>"+
			"<li>The new subset &lt;&lt;InformationModel>> is added to the diagram (if in context of a diagram)</li>"+
			"<li>Action for adding subset Classifiers to the new subset &lt;&lt;InformationModel>> is available</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_CONSTRAINT_MODELS_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select reference (editable reference, subset, extension) &lt;&lt;InformationModel>>s to be constrained</li>"+
			"<li>For each selected reference &lt;&lt;InformationModel>>, a constraint &lt;&lt;InformationModel>> is created</li>"+
			"<li>A &lt;&lt;References>> Realization is made from the new constraint &lt;&lt;InformationModel>> to the selected reference &lt;&lt;InformationModel>></li>"+
			"<li>The new constraint &lt;&lt;InformationModel>> is added to the diagram (if in context of a diagram)</li>"+
			"<li>Action for adding subset Classifiers to the new constraint &lt;&lt;InformationModel>> is available</li>"+
			"<li>Constraint &lt;&lt;InformationModel>>s need only include overrides to respective reference &lt;&lt;InformationModel>></li>"+
			"<li>Complete set of Constraint schemas will be provisioned to MPD in addition to subset based schemas</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_SUBSET_CLASSIFIERS_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select reference Classifiers available in context of the owning &lt;&lt;InformationModel>></li>"+
			"<li>For each selected reference Classifier, a subset Classifier is created and packaged in the subset &lt;&lt;InformationModel>></li>"+
			"<li>Any requisite Classifiers (due to inheritance requirement, etc.), along with their relations, are also created</li>"+
			"<li>The new subset Classifier is added to the diagram (if in context of a diagram)</li>"+
			"<li>Action for adding subset Properties to the new subset Classifier is available</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_SUBSET_ENUMERATION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select reference Enumeration Literals available in context of the selected subset Enumeration</li>"+
			"<li>For each selected reference EnumerationLiteral, a subset EnumerationLiteral is created and added to the subset Enumeration</li>"+
			"<li>The new subset EnumerationLiteral is added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_SUBSET_PROPERTIES_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select reference Properties available in context of the selected subset Classifer</li>"+
			"<li>For each selected reference Property, a subset Property is created and added to the subset Classifier</li>"+
			"<li>Any requisite model elements are also created</li>"+
			"<li>The new subset Property is added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String SUBSTITUTION_GROUP_DECOMPOSITION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select &lt;&lt;PropertyHolder>> Properties available in context of the selected subset Property</li>"+
			"<li>Dialog opened with current Property Group Configuration.</li>"+
			"<li>Current Property Group Configuration is replaced by Ordered Selection</li>"+
			HTML_TAIL_FRAGMENT;
	public String SUBSTITUTION_GROUP_RESTRICTION_DECOMPOSITION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select &lt;&lt;PropertyHolder>> Properties available in context of the selected &lt;&lt;Restriction>> Property</li>"+
			"<li>Dialog opened with current Property Group Configuration.</li>"+
			"<li>Current Property Group Configuration is replaced by Ordered Selection</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String ELEMENT_SUBTYPING_CONSTRAINT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select Property Type Constrint available in context of the selected subsetting Property</li>"+
			"<li>Dialog opened with current Property Type Constraint.</li>"+
			"<li>Current Property Type Constraint is replaced by Selection</li>"+
			"<li>If Property Type Constraint is different then subsetted Property Type, a Constraint schema will be provisioned.</li>"+
			HTML_TAIL_FRAGMENT;
	public String WILDCARD_RESTRICTION_DECOMPOSITION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select All Properties available in context of the selected &lt;&lt;XSDAnyProperty>></li>"+
			"<li>Dialog opened with current Property Group Configuration.</li>"+
			"<li>Current Property Group Configuration is replaced by Ordered Selection</li>"+
			HTML_TAIL_FRAGMENT;
	public String WILDCARD_DECOMPOSITION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select All Properties available in context of the selected &lt;&lt;XSDAnyProperty>></li>"+
			"<li>Dialog opened with current Property Group Configuration.</li>"+
			"<li>Current Property Group Configuration is replaced by Ordered Selection</li>"+
			HTML_TAIL_FRAGMENT;
	public String SET_SUBSTITUION_GROUP_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select Properties available as substitutionGroups in context of the selected Property</li>"+
			"<li>Current subsettedProperty is cleared</li>"+
			"<li>Selected Property is set as subsettedProperty of Property context</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_RESTRICTION_PROPERTY_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select Properties available in context of selected Classifer which is a &lt;&lt;Restriction>> of another Classifier</li>"+
			"<li>For each selected  &lt;&lt;Restriction>> Property, a Property is created and added to the context Classifier</li>"+
			"<li>Any requisite model elements (due to subsetted properties, &lt;&lt;References>>, Associations etc.), along with their relations, are also created</li>"+
			"<li>The new Property is added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_RESTRICTION_ENUMERATION_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select Enumeration Literals available in context of selected derived Enumeration which is a &lt;&lt;Restriction>> of another Enumeration</li>"+
			"<li>Initial selection includes <<Restriction>> EnumerationLiterals already represented in derived Enumeration</li>"+
			"<li>For each selected  &lt;&lt;Restriction>> EnumerationLiteral, an EnumerationLiteral is created (if necessary) and added to the derived Enumeration </li>"+
			"<li>The new EnumerationLiterals are added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_REFERENCES_PROPERTY_ACTION_TOOLTIP="<html><ul>"+
			"<li>In context of a Classifier which &lt;&lt;References>> another Classifier, a set of Properties may be selected from the other Classifier or subsettedProperties thereof</li>"+
			"<li>Opens Dialog to Select Properties available in context of selected Classifer which is a &lt;&lt;References>> of another Classifier</li>"+
			"<li>For each selected  &lt;&lt;References>> Property, a Property is created and added to the context Classifier</li>"+
			"<li>Any requisite model elements (due to subsetted properties, &lt;&lt;References>>, Associations etc.), along with their relations, are also created</li>"+
			"<li>The new Property and related elements are added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_INVERSE_REFERENCES_PROPERTY_ACTION_TOOLTIP="<html><ul>"+
			"<li>In context of a Classifier which is &lt;&lt;References>>s by another Classifier, a set of Properties may be selected from the other Classifier or subsettedProperties thereof</li>"+
			"<li>Opens Dialog to Select Properties available in context of selected Classifer which is &lt;&lt;References>> by another Classifier</li>"+
			"<li>For each selected  &lt;&lt;References>> by Property, a Property is created and added to the context Classifier</li>"+
			"<li>Any requisite model elements (due to subsetted properties, &lt;&lt;References>>, Associations etc.), along with their relations, are also created</li>"+
			"<li>The new Property and related elements are added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String ADD_PRIMITIVE_PROPERTY_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select XML Primitive Types</li>"+
			"<li>For each selected  XML Primitive Type, a Property of that type is created and added to the context Classifier</li>"+
			"<li>The new Property is added to the diagram (if in context of a diagram)</li>"+
			HTML_TAIL_FRAGMENT;
	public String IEPD_2_PIM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select an IEPD *.zip file or directory</li>"+
			"<li>If an IEPD *.zip file is selected, it is expanded into a sibling directory</li>"+
			"<li>Opens Dialog to Select exchange and/or extension schemas from the IEPD</li>"+
			"<li>Constructs a small MPD Catalog</li>"+
			"<li>Transforms the MPD into a NIEM-UML PIM model</li>"+
			"<li>Transforms, if necessary, NIEM 2.0 to NIEM 2.1 subset &lt;&lt;InformationModel>>s</li>"+
			"<li>Loads required reference &lt;&lt;InformationModel>> modules</li>"+
			"<li>Adds &lt;&lt;References>> between IEPD subset and corresponding NIEM reference models</li>"+
			"<li>Creates several diagrams for each &lt;&lt;InformationModel>> plus overview diagrams</li>"+
			HTML_TAIL_FRAGMENT;
	public String MPD_2_PSM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Opens Dialog to Select an MPD *.zip file</li>"+
			"<li>Expands the MPD *.zip file into a sibling directory</li>"+
			"<li>Transforms the MPD into a NIEM-UML PIM model</li>"+
			"<li>Transforms, if necessary, NIEM 2.0 to NIEM 2.1 subset &lt;&lt;InformationModel>>s</li>"+
			"<li>Loads required reference &lt;&lt;InformationModel>> modules</li>"+
			"<li>Adds &lt;&lt;References>> between IEPD subset and corresponding NIEM reference models</li>"+
			"<li>Creates several diagrams for each &lt;&lt;InformationModel>> plus overview diagrams</li>"+
			HTML_TAIL_FRAGMENT;
	public String MPD_COMPARE_ACTION_TOOLTIP="<html><ul>"+
			"<li>Compares schemas from two MPD directories</li>"+
			"<li>Opens Dialog to Select source MPD catalog</li>"+
			"<li>Opens Dialog to Select target MPD catalog</li>"+
			"<li>Executes QVT to compare equivalence of schemas in source with schemas in target</li>"+
			"<li>Results displayed in log window</li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_ABOUT_ACTION_TOOLTIP="<html><ul>"+
			"<li>Displays information about current version of NIEM-UML plugin</li>"+
			HTML_TAIL_FRAGMENT;
	public String PIM_2_PSM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Transforms PIM Model to (intermediate) PSM Model</li>"+
			"<li>Transforms PSM Model to MPD artifacts, including catalog, schemas, change log, xml instance docs, master doc, etc.</li>"+
			"<li>Some artifacts may be suppressed via options at Options-->Project-->General Info-->NIEM</li>"+
			"<li>Retention of PSM Model controlled by Project Options</li>"+
			HTML_TAIL_FRAGMENT;
	public String PIM_2_SCHEMATRON_ACTION_TOOLTIP="<html><ul>"+
			"<li>Transforms PIM Model to Schematron artifacts</li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_RELATION_MAP_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Relation Map Diagram in the context of the selected model element</li>"+
			"<li>The Relation Map Diagram will initially have a default NIEM Filter, other NIEM Filters can be selected from diagram</li>"+
			"<li>Context element may be changed on diagram or by dragging model element from Containment Browser to diagram</li>"+
			HTML_TAIL_FRAGMENT;
	public String CHANGE_RELATION_MAP_DIAGRAM_FILTER_ACTION_TOOLTIP="<html><ul>"+
			"<li>Reconfigures Relation Filter</li>"+
			"<li>Changes context to selected node</li>"+
			HTML_TAIL_FRAGMENT;
		
	public String NIEM_USED_BY_TABLE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Generic Table Diagram in the context of the selected &lt;&lt;InformationModel>></li>"+
			"<li>The Table will be populated with types/properties of this &lt;&lt;InformationModel>> using another &lt;&lt;InformationModel>></li>"+
			HTML_TAIL_FRAGMENT;
	
	public String NIEM_USAGES_OF_TABLE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Generic Table Diagram in the context of the selected &lt;&lt;InformationModel>></li>"+
			"<li>The Table will be populated with types/properties of this &lt;&lt;InformationModel>> used by another &lt;&lt;InformationModel>></li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_UNUSED_ELEMENTS_OF_EXCHANGE_TABLE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Generic Table Diagram for an IEPD Model</li>"+
			"<li>The Table will be populated with schemas/types/properties which are unused for any IEPD exchange</li>"+
			"<li>(Untyped components are ignored, so results may include components which may have otherwise beend used via xsd:any, etc.)</li>"+
			HTML_TAIL_FRAGMENT;
	
	public String NIEM_COMMENT_TABLE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Generic Table Diagram in the context of the selected model element.  </li>"+
			"<li>Uncommented <<InformationModel>>s, Classifiers, Properties will have Comments added to them.  </li>"+
			"<li>The Table will be populated with all Comments transitively nested in model element.  </li>"+
			HTML_TAIL_FRAGMENT;
	public String NIEM_TYPE_TABLE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Generic Table Diagram in the context of the selected Classifiers</li>"+
			"<li>The Table will be populated with the selected Classifiers</li>"+
			"<li>Classifiers may be added to table by dragging Classifiers from Containment Browser to diagram</li>"+
			HTML_TAIL_FRAGMENT;
		
	public String NIEM_PROPERTY_TABLE_DIAGRAM_ACTION_TOOLTIP="<html><ul>"+
			"<li>Creates and Opens a Generic Table Diagram in the context of the selected Properties</li>"+
			"<li>The Table will be populated with the selected Properties</li>"+
			"<li>Properties may be added to table by dragging Properties from Containment Browser to diagram</li>"+
			HTML_TAIL_FRAGMENT;
	/*
	public String LIST_ACTION_TOOLTIP=CREATES_FRAGMENT+"a &lt;&lt;List>> DataType representing a NIEM SimpleType"+
			ADDS_TO_INFORMATION_MODEL_FRAGMENT+
			"<li>Creates a Property representing the list item type</li>"+ 
			CREATES_AND_ADDS_NOTATION_FRAGMENT+
			"<li>A List is a DataType whose values consist of a finite length (possibly empty) sequence of values of another DataType, which is the item type of the List. A List DataType must have a single Property with multiplicity 0..* whose type is the item type.  A List DataType is implemented in XML schema as a list simple type definition. List represents a relationship between two simple type definitions: the first is a list simple type definition whose item type definition is the second. This relationship is implemented in XML Schema through the itemType attribute on the xsd:list element of the list simple type definition, the actual value of which resolves to the second type definition.</li>"+
			HTML_TAIL_FRAGMENT;
	public String UNION_ACTION_TOOLTIP=CREATES_FRAGMENT+"a &lt;&lt;Union>> DataType representing a NIEM SimpleType"+
			ADDS_TO_INFORMATION_MODEL_FRAGMENT+
			CREATES_AND_ADDS_NOTATION_FRAGMENT+
			"<li>A Union is a DataType whose values consist of a finite length (possibly empty) sequence of values of another DataType, which is the item type of the List. A List DataType must have a single Property with multiplicity 0..* whose type is the item type.  A List DataType is implemented in XML schema as a list simple type definition. List represents a relationship between two simple type definitions: the first is a list simple type definition whose item type definition is the second. This relationship is implemented in XML Schema through the itemType attribute on the xsd:list element of the list simple type definition, the actual value of which resolves to the second type definition.</li>"+
			HTML_TAIL_FRAGMENT;
	*/
	
	/*
	public String SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION="" +
			"Enables a substitution group to be decomposed into an ordered list of substitutable elements.  "+
			"The head of the substitution group tree is defined by the reference model.  "+
			"The available substitutable elements is defined by the subset model <<PropertyHolder>>.  "+
			"The list of pre-selected items is the current configuration for the decomposition.  "+
			"Items may be removed, added, and/or ordered with respect to current configuration.  "+
			"The current configuration is updated with the new configuration.  "+
			"Properties retained from the current configuration are not replaced, but may be re-ordered.  "+
			"Note that some sequences of Properties may result in validation errors for unique particle attribution.  "+
			"Search for an element by using list or tree views.  To find an element type text or wildcard (*,?) into the \"Search By Name\" input field.  Search elements by their qualified names or use camel case when searching if the appropriate mode is enabled.";
			
*/			
	public String SELECTION_DIALOG_DESCRIPTION_TAIL="</ul><p>"+"Search for an element by using list or tree views.  To find an element type text or wildcard (*,?) into the \"Search By Name\" input field.  Search elements by their qualified names or use camel case when searching if the appropriate mode is enabled."+
			"</p></html>";
	public String WILDCARD_RESTRICTION_DECOMPOSITION_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables a wildcard to be decomposed into an ordered list of features.  </li>"+
			"<li>The available features may be constrained by the &lt;&lt;XSDAnyProperty>> valueNamespace.  </li>"+
			"<li>The list of pre-selected items is the current configuration for the decomposition.  </li>"+
			"<li>Items may be removed, added, and/or ordered with respect to current configuration.  </li>"+
			"<li>The current configuration is updated with the new configuration.  </li>"+
			"<li>Properties retained from the current configuration are not replaced, but may be re-ordered.  </li>"+
			"<li>Note that some sequences of Properties may result in validation errors for unique particle attribution.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String WILDCARD_RESTRICTION_DECOMPOSITION_DIALOG_DESCRIPTION_TITLE="Select, search for, remove, and/or order Properties of a redefined &lt;&lt;XSDAnyProperty>>";
	public String WILDCARD_DECOMPOSITION_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables a wildcard to be decomposed into an ordered list of features.  </li>"+
			"<li>The available features may be constrained by the &lt;&lt;XSDAnyProperty>> valueNamespace.  </li>"+
			"<li>The list of pre-selected items is the current configuration for the decomposition.  </li>"+
			"<li>Items may be removed, added, and/or ordered with respect to current configuration.  </li>"+
			"<li>The current configuration is updated with the new configuration.  </li>"+
			"<li>Properties retained from the current configuration are not replaced, but may be re-ordered.  </li>"+
			"<li>Note that some sequences of Properties may result in validation errors for unique particle attribution.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String WILDCARD_DECOMPOSITION_DIALOG_DESCRIPTION_TITLE="Select, search for, remove, and/or order Properties of a redefined &lt;&lt;XSDAnyProperty>>";
	public String SUBSTIUTION_GROUP_RESTRICTION_DECOMPOSITION_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables a substitution group to be decomposed into an ordered list of substitutable elements.  </li>"+
			"<li>The head of the substitution group tree is defined by the &lt;&lt;Restriction>> Classifier.  </li>"+
			"<li>The available substitutable elements is defined by the &lt;&lt;Restriction>> element &lt;&lt;PropertyHolder>>.  </li>"+
			"<li>The list of pre-selected items is the current configuration for the decomposition.  </li>"+
			"<li>Items may be removed, added, and/or ordered with respect to current configuration.  </li>"+
			"<li>The current configuration is updated with the new configuration.  </li>"+
			"<li>Properties retained from the current configuration are not replaced, but may be re-ordered.  </li>"+
			"<li>Note that some sequences of Properties may result in validation errors for unique particle attribution.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String SUBSTIUTION_GROUP_RESTRICTION_DECOMPOSITION_DIALOG_DESCRIPTION_TITLE="Select, search for, remove, and/or order Properties of a redefined Substitution Group";
	public String SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables a substitution group to be decomposed into an ordered list of substitutable elements.  </li>"+
			"<li>The head of the substitution group tree is defined by the reference model.  </li>"+
			"<li>The available substitutable elements is defined by the subset model &lt;&lt;PropertyHolder>>.  </li>"+
			"<li>The list of pre-selected items is the current configuration for the decomposition.  </li>"+
			"<li>Items may be removed, added, and/or ordered with respect to current configuration.  </li>"+
			"<li>The current configuration is updated with the new configuration.  </li>"+
			"<li>Properties retained from the current configuration are not replaced, but may be re-ordered.  </li>"+
			"<li>Note that some sequences of Properties may result in validation errors for unique particle attribution.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
				
	public String ELEMENT_SUBTYPING_CONSTRAINT_DIALOG_DESCRIPTION_TITLE="Select and/or search for Constraint Types in the context of a subsetting Property";
	public String ELEMENT_SUBTYPING_CONSTRAINT_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables a subsetted Property to be constrained to a type.  </li>"+
			"<li>The type must be a subtype of the type specified by the subsetted property.  </li>"+
			"<li>The type must be consistent with any related substitution group typing constraints.  </li>"+
			"<li>If the type selected is not the equivalent of the type of the subsetted property, a set of constraint schemas will be provisioned to include the type override.  </li>"+
			"<li>The provisioned schema-set will have a type equivalent to the type of the subsetted property, in accordance with MPD subsetting rules.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
	public String SUBSTIUTION_GROUP_DECOMPOSITION_DIALOG_DESCRIPTION_TITLE="Select, search for, remove, and/or order Properties of a redefined Substitution Group";
	public String TYPE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables a NIEM compliant type to be assigned to a new Property.  </li>"+
			"<li>Legal types include XML Primitive Types, Types in editable &lt;&lt;InformationModel>>s.  </li>"+
			"<li>Types from uneditable reference &lt;&lt;InformationModel>>s are not selectable.  </li>"+
			"<li>Types from uneditable &lt;&lt;InformationModel>>s which have been subset are not selectable.  </li>"+
			"<li>Types which are &lt;&lt;PropertyHolder>>s are not selectable.  </li>"+
			"<li>If no type is selected, the Property is considered abstract.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String TYPE_DIALOG_DESCRIPTION_TITLE="Select, search for valid type of new Property";
	public String REFERENCE_VALUE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of the ref=\"IDREF\" Element Instances for the context Reference Element.  </li>"+
			"<li>Selections are from same document, whose types conform with type of context Reference Element.  </li>"+
			"<li>Each selection will become another instance of the context Reference Element.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String REFERENCE_VALUE_DIALOG_DESCRIPTION_TITLE="Select, search for valid referenceable Element Instances of the context Reference Element";
	public String VALUE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of the type for the context containment Element.  </li>"+
			"<li>Selections include the declared type of the Element, and all subtypes thereof which are not abstract.  </li>"+
			"<li>Each selection will result in creation of a contained Instance for context Element.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String VALUE_DIALOG_DESCRIPTION_TITLE="Select, search for valid types of the context containment Element";
	public String SLOT_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of the Property for the context type.  </li>"+
			"<li>Selections include the declared Properties of the type, and all substitutes thereof which are not abstract.  </li>"+
			"<li>Selections do not include Properties already included for the type.  </li>"+
			"<li>Each selection will result in creation of a contained Slot for context type.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String SLOT_DIALOG_DESCRIPTION_TITLE="Select, search for valid Properties of the context type";
	public String EXCHANGE_ELEMENT_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of exchange &lt;&lt;InformationModel>> top level Elements.  </li>"+
			"<li>Selections include the Properties defined with the namespace of an exchange &lt;&lt;InformationModel>>.  </li>"+
			"<li>Each selection will result in creation of a complete (Sample) XML Instance Document.  </li>"+
			"<li>XML Instance Documents may be edited using the NIEM XML Instances Browser.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String EXCHANGE_ELEMENT_DIALOG_DESCRIPTION_TITLE="Select, search for valid exchange Top Level Elements";
	
		
	public String PRIMITIVE_PROPERTY_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of types from the XML Primitive Types library.  </li>"+
			"<li>Each selection will result in creation of a Property whose type is the selection.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String PRIMITIVE_PROPERTY_DIALOG_DESCRIPTION_TITLE="Select, search for valid XML Primitive Types";
	
	public String SET_SUBSTITUTION_GROUP_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of Property qualified to be a substitutionGroup.  </li>"+
			"<li>Selections include Properties which conform to UML subsettedProperty (inherited Property, type conformant).  </li>"+
			"<li>The selection will become the subsettedProperty of the context Property.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String SET_SUBSTITUTION_GROUP_DIALOG_DESCRIPTION_TITLE="Select, search for valid Substitution Group Properties";
	
	
	public String INSTANCE_TYPE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a legal Type for selected Value.  </li>"+
			"<li>Selection based on type and subtypes of the defining feature.  </li>"+
			"<li>The selection will become the type of the InstanceValue, its InstanceSpecification, and any other referencing InstanceValues.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String INSTANCE_TYPE_DIALOG_DESCRIPTION_TITLE="Select, search for valid Enumeration Literal Value";

	public String ENUMERATION_LITERAL_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a legal EnumerationLiteral for selected Value.  </li>"+
			"<li>Selection conforms to (Enumeration) type of selected Value.  </li>"+
			"<li>The selection will become the instance of the Value.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ENUMERATION_LITERAL_DIALOG_DESCRIPTION_TITLE="Select, search for valid Enumeration Literal Value";
	public String REFERENCE_INSTANCE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a legal Referenceable Instances within the XML Instance Document for selected Value.  </li>"+
			"<li>Selection conforms to type of selected Value.  </li>"+
			"<li>The selection will become the instance of the Value.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String REFERENCE_INSTANCE_DIALOG_DESCRIPTION_TITLE="Select, search for valid Reference Instances";
	public String CHANGE_SLOT_FEATURE_DIALOG_DESCRIPTION_TITLE="Select Feature (top-level Element) for Slot";
	public String CHANGE_SLOT_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a legal Property for Slot of selected Value.  </li>"+
			"<li>Selection is Set of Substitutable Properties for current Slot Feature.  </li>"+
			"<li>The selection will become the definedFeature of the Slot.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
	
	
	public String METADATA_INSTANCE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a legal Metadata Reference from selected Value.  </li>"+
			"<li>Selection consists of referenceable Metadata Instances within same Document.  </li>"+
			"<li>The selection will become the referenced Metadata of the selected Value.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String METADATA_INSTANCE_DIALOG_DESCRIPTION_TITLE="Select, search for valid Metadata Reference from Selected Value";
	public String ADD_SUBSET_PROPERTY_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a reference model Properties which can be added to context Classifier.  </li>"+
			"<li>Selections include Properties defined by reference model plus any substitutable Property (not already in subset).  </li>"+
			"<li>The selections will be cloned, ordered, and added to subset along with transitive closure of requisite types and &lt;&lt;InformationModel>>s.  </li>"+
			"<li>In context of a diagram, symbols for new elements are added.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ADD_SUBSET_PROPERTY_DIALOG_DESCRIPTION_TITLE="Select, search for valid reference Properties";
		
	public String ADD_SUBSET_CLASSIFIER_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of a reference model Classifiers which can be added to context subset &lt;&lt;InformationModel>>.  </li>"+
			"<li>Selections include Classifiers defined by reference  &lt;&lt;InformationModel>> (not already in subset).  </li>"+
			"<li>Each selection will result in creation of a corresponding subset Classifier which is added to subset.  </li>"+
			"<li>In addition, the transitive closure of requisite types (e.g., via base type) and &lt;&lt;InformationModel>>s will be added as required.  </li>"+
			"<li>In context of a diagram, symbols for new elements are added.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ADD_SUBSET_CLASSIFIER_DIALOG_DESCRIPTION_TITLE="Select, search for valid reference Classifiers";
	
	public String ADD_CONSTRAINT_PACKAGE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of &lt;&lt;InformationModel>>s which can be constrained.  </li>"+
			"<li>Selections include &lt;&lt;InformationModel>>s which are editable and are reference, subset, or extension models.  </li>"+
			"<li>Selections exclude &lt;&lt;InformationModel>>s which are already being constrained.  </li>"+
			"<li>Each selection will result in creation of a corresponding constraint &lt;&lt;InformationModel>>.  </li>"+
			"<li>A constraint &lt;&lt;InformationModel>> only need overriding Classifiers, Properties defined.  </li>"+
			"<li>A complete complement of fully populated constraint schemas will be provisioned to target MPD.  </li>"+
			"<li>In context of a diagram, symbols for new elements are added.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ADD_CONSTRAINT_PACKAGE_DIALOG_DESCRIPTION_TITLE="Select, search for valid constrainable <<InformationModel>>s";
	public String ADD_SUBSET_ENUMERATIONLITERALS_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of EnumerationLiterals which can be subsetted.  </li>"+
			"<li>Selections include EnumerationLiterals from subsetted Reference Model Enumeration.  </li>"+
			"<li>Each selection will result in creation of a corresponding subset EnumerationLiterals.  </li>"+
			"<li>In context of a diagram, symbols for new elements are added.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;

	public String ADD_SUBSET_PACKAGE_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of &lt;&lt;InformationModel>>s which can be subsetted.  </li>"+
			"<li>Selections include &lt;&lt;InformationModel>>s which are read-only and are reference, subset, or extension models.  </li>"+
			"<li>Selections exclude &lt;&lt;InformationModel>>s which are already being subset.  </li>"+
			"<li>Each selection will result in creation of a corresponding subset &lt;&lt;InformationModel>>.  </li>"+
			"<li>In context of a diagram, symbols for new elements are added.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ADD_SUBSET_PACKAGE_DIALOG_DESCRIPTION_TITLE="Select, search for valid subsettable <<InformationModel>>s";
	public String ADD_SUBSET_ENUMERATIONLITERAL_DIALOG_DESCRIPTION_TITLE="Select, search for valid subsettable EnumerationLiterals";
	
	public String ADD_RESTRICTION_PROPERTY_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of Properties which can be included in context of a &lt;&lt;Restriction>>.  </li>"+
			"<li>Selections include Properties defined by &lt;&lt;Restriction>> Classifier plus any substitutable Property (not already in subset).  </li>"+
			"<li>The selections will be cloned, ordered, and added to context Classifier.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ADD_RESTRICTION_PROPERTY_DIALOG_DESCRIPTION_TITLE="Select, search for valid Properties in context of a <<Restriction>>";
	public String ADD_RESTRICTION_ENUMERATION_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of EnumerationLiterals which can be included in context of a &lt;&lt;Restriction>>.  </li>"+
			"<li>Selections include EnumerationLiterals defined by &lt;&lt;Restriction>> base Enumeration.  </li>"+
			"<li>The selections will be cloned (if not already present) and added to derived Enumeration.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
	public String ADD_RESTRICTION_ENUMERATION_DIALOG_DESCRIPTION_TITLE="Select EnumerationLiterals in context of a <<Restriction>>";
	
	public String ENTITY_DIAGRAM_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of Classifiers for which an Entity Diagram will be created.  </li>"+
			"<li>Selections include editable Classifiers in &lt;&lt;InformationModel>>s which participate in associations or inheritance.  </li>"+
			"<li>Selections exclude Classifiers already diagrammed, &lt;&lt;PropertyHolder>>s, PrimitiveTypes, Enumerations, &lt;&lt;Choice>>s.</li>"+
			"<li>For each selection, an Entity Diagram is created.</li>"+
			"<li>Diagram includes selected Classifier plus any Generalization, Specialization, or Association from/to it.</li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String ENTITY_DIAGRAM_DIALOG_DESCRIPTION_TITLE="Select, search for Classifiers which may be usefully shown in an Entity Diagram";
	
	
	public String DEFINE_SUBSET_DIALOG_DESCRIPTION="<html><ul>" +
			"<li>Enables selection of &lt;&lt;InformationModel>>s, Classifiers, and Properties which can be subsetted.  </li>"+
			"<li>Selections include &lt;&lt;InformationModel>>s, Classifiers, and Properties which are read-only and are reference, subset, or extension models.  </li>"+
			"<li>Selections exclude &lt;&lt;InformationModel>>s, Classifiers, and Properties which are already being subset.  </li>"+
			"<li>Each selection will result in creation of a corresponding subset &lt;&lt;InformationModel>>, Classifier, or Property.  </li>"+
			"<li>All requisite &lt;&lt;InformationModel>>s, Classifiers, and Properties will also be created, if necessary.  </li>"+
			"<li>In context of a diagram, symbols for new elements are added.  </li>"+
			SELECTION_DIALOG_DESCRIPTION_TAIL;
			
	public String DEFINE_SUBSET_DIALOG_DESCRIPTION_TITLE="Select, search for valid subsettable <<InformationModel>>s, Classifiers, Properties";
	
		
		
}
