/**
 */
package org.w3.xpath20.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3.xpath20.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xpath20FactoryImpl extends EFactoryImpl implements Xpath20Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Xpath20Factory init()
  {
    try
    {
      Xpath20Factory theXpath20Factory = (Xpath20Factory)EPackage.Registry.INSTANCE.getEFactory(Xpath20Package.eNS_URI);
      if (theXpath20Factory != null)
      {
        return theXpath20Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Xpath20FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xpath20FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Xpath20Package.XPATH: return createXPath();
      case Xpath20Package.INTEGER_LITERAL: return createIntegerLiteral();
      case Xpath20Package.DECIMAL_LITERAL: return createDecimalLiteral();
      case Xpath20Package.DOUBLE_LITERAL: return createDoubleLiteral();
      case Xpath20Package.STRING_LITERAL: return createStringLiteral();
      case Xpath20Package.QNAME: return createQName();
      case Xpath20Package.PREFIXED_NAME: return createPrefixedName();
      case Xpath20Package.UNPREFIXED_NAME: return createUnprefixedName();
      case Xpath20Package.EXPR: return createExpr();
      case Xpath20Package.EXPR_SINGLE: return createExprSingle();
      case Xpath20Package.FOR_EXPR: return createForExpr();
      case Xpath20Package.SIMPLE_FOR_CLAUSE: return createSimpleForClause();
      case Xpath20Package.VAR_NAME: return createVarName();
      case Xpath20Package.QUANTIFIED_EXPR: return createQuantifiedExpr();
      case Xpath20Package.IF_EXPR: return createIfExpr();
      case Xpath20Package.OR_EXPR: return createOrExpr();
      case Xpath20Package.AND_EXPR: return createAndExpr();
      case Xpath20Package.COMPARISON_EXPR: return createComparisonExpr();
      case Xpath20Package.RANGE_EXPR: return createRangeExpr();
      case Xpath20Package.ADDITIVE_EXPR: return createAdditiveExpr();
      case Xpath20Package.MULTIPLICATIVE_EXPR: return createMultiplicativeExpr();
      case Xpath20Package.UNION_EXPR: return createUnionExpr();
      case Xpath20Package.INTERSECT_EXCEPT_EXPR: return createIntersectExceptExpr();
      case Xpath20Package.INSTANCEOF_EXPR: return createInstanceofExpr();
      case Xpath20Package.TREAT_EXPR: return createTreatExpr();
      case Xpath20Package.SEQUENCE_TYPE: return createSequenceType();
      case Xpath20Package.ITEM_TYPE: return createItemType();
      case Xpath20Package.ATOMIC_TYPE: return createAtomicType();
      case Xpath20Package.CASTABLE_EXPR: return createCastableExpr();
      case Xpath20Package.CAST_EXPR: return createCastExpr();
      case Xpath20Package.VALUE_EXPR: return createValueExpr();
      case Xpath20Package.SINGLE_TYPE: return createSingleType();
      case Xpath20Package.RELATIVE_PATH_EXPR: return createRelativePathExpr();
      case Xpath20Package.PREDICATE_LIST: return createPredicateList();
      case Xpath20Package.PREDICATE: return createPredicate();
      case Xpath20Package.REVERSE_STEP: return createReverseStep();
      case Xpath20Package.REVERSE_AXIS: return createReverseAxis();
      case Xpath20Package.NODE_TEST: return createNodeTest();
      case Xpath20Package.NAME_TEST: return createNameTest();
      case Xpath20Package.FORWARD_STEP: return createForwardStep();
      case Xpath20Package.FORWARD_AXIS: return createForwardAxis();
      case Xpath20Package.ABBREV_FORWARD_STEP: return createAbbrevForwardStep();
      case Xpath20Package.LITERAL: return createLiteral();
      case Xpath20Package.NUMERIC_LITERAL: return createNumericLiteral();
      case Xpath20Package.VAR_REF: return createVarRef();
      case Xpath20Package.PARENTHESIZED_EXPR: return createParenthesizedExpr();
      case Xpath20Package.CONTEXT_ITEM_EXPR: return createContextItemExpr();
      case Xpath20Package.FUNCTION_CALL: return createFunctionCall();
      case Xpath20Package.KIND_TEST: return createKindTest();
      case Xpath20Package.ELEMENT_DECLARATION: return createElementDeclaration();
      case Xpath20Package.ATTRIBUTE_NAME: return createAttributeName();
      case Xpath20Package.ELEMENT_NAME: return createElementName();
      case Xpath20Package.TYPE_NAME: return createTypeName();
      case Xpath20Package.ANY_KIND_TEST: return createAnyKindTest();
      case Xpath20Package.DOCUMENT_TEST: return createDocumentTest();
      case Xpath20Package.TEXT_TEST: return createTextTest();
      case Xpath20Package.COMMENT_TEST: return createCommentTest();
      case Xpath20Package.PI_TEST: return createPITest();
      case Xpath20Package.SCHEMA_ATTRIBUTE_TEST: return createSchemaAttributeTest();
      case Xpath20Package.ATTRIBUTE_DECLARATION: return createAttributeDeclaration();
      case Xpath20Package.SCHEMA_ELEMENT_TEST: return createSchemaElementTest();
      case Xpath20Package.UNARY_EXPR: return createUnaryExpr();
      case Xpath20Package.WILDCARD: return createWildcard();
      case Xpath20Package.ELEMENT_TEST: return createElementTest();
      case Xpath20Package.ATTRIBUTE_TEST: return createAttributeTest();
      case Xpath20Package.AXIS_STEP: return createAxisStep();
      case Xpath20Package.STEP_EXPR: return createStepExpr();
      case Xpath20Package.FILTER_EXPR: return createFilterExpr();
      case Xpath20Package.PATH_EXPR: return createPathExpr();
      case Xpath20Package.ATTRIB_NAME_OR_WILDCARD: return createAttribNameOrWildcard();
      case Xpath20Package.ELEMENT_NAME_OR_WILDCARD: return createElementNameOrWildcard();
      case Xpath20Package.PRIMARY_EXPR: return createPrimaryExpr();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Xpath20Package.INTERSECT_EXCEPT:
        return createIntersectExceptFromString(eDataType, initialValue);
      case Xpath20Package.UNION:
        return createUnionFromString(eDataType, initialValue);
      case Xpath20Package.ADDITIVE:
        return createAdditiveFromString(eDataType, initialValue);
      case Xpath20Package.GENERAL_COMP:
        return createGeneralCompFromString(eDataType, initialValue);
      case Xpath20Package.VALUE_COMP:
        return createValueCompFromString(eDataType, initialValue);
      case Xpath20Package.NODE_COMP:
        return createNodeCompFromString(eDataType, initialValue);
      case Xpath20Package.SEPARATOR:
        return createSeparatorFromString(eDataType, initialValue);
      case Xpath20Package.REVERSE_AXIS_ENUM:
        return createReverseAxisEnumFromString(eDataType, initialValue);
      case Xpath20Package.FORWARD_AXIS_ENUM:
        return createForwardAxisEnumFromString(eDataType, initialValue);
      case Xpath20Package.OCCURRENCE_INDICATOR:
        return createOccurrenceIndicatorFromString(eDataType, initialValue);
      case Xpath20Package.MULTIPLICATIVE:
        return createMultiplicativeFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Xpath20Package.INTERSECT_EXCEPT:
        return convertIntersectExceptToString(eDataType, instanceValue);
      case Xpath20Package.UNION:
        return convertUnionToString(eDataType, instanceValue);
      case Xpath20Package.ADDITIVE:
        return convertAdditiveToString(eDataType, instanceValue);
      case Xpath20Package.GENERAL_COMP:
        return convertGeneralCompToString(eDataType, instanceValue);
      case Xpath20Package.VALUE_COMP:
        return convertValueCompToString(eDataType, instanceValue);
      case Xpath20Package.NODE_COMP:
        return convertNodeCompToString(eDataType, instanceValue);
      case Xpath20Package.SEPARATOR:
        return convertSeparatorToString(eDataType, instanceValue);
      case Xpath20Package.REVERSE_AXIS_ENUM:
        return convertReverseAxisEnumToString(eDataType, instanceValue);
      case Xpath20Package.FORWARD_AXIS_ENUM:
        return convertForwardAxisEnumToString(eDataType, instanceValue);
      case Xpath20Package.OCCURRENCE_INDICATOR:
        return convertOccurrenceIndicatorToString(eDataType, instanceValue);
      case Xpath20Package.MULTIPLICATIVE:
        return convertMultiplicativeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPath createXPath()
  {
    XPathImpl xPath = new XPathImpl();
    return xPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecimalLiteral createDecimalLiteral()
  {
    DecimalLiteralImpl decimalLiteral = new DecimalLiteralImpl();
    return decimalLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QName createQName()
  {
    QNameImpl qName = new QNameImpl();
    return qName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixedName createPrefixedName()
  {
    PrefixedNameImpl prefixedName = new PrefixedNameImpl();
    return prefixedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnprefixedName createUnprefixedName()
  {
    UnprefixedNameImpl unprefixedName = new UnprefixedNameImpl();
    return unprefixedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSingle createExprSingle()
  {
    ExprSingleImpl exprSingle = new ExprSingleImpl();
    return exprSingle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForExpr createForExpr()
  {
    ForExprImpl forExpr = new ForExprImpl();
    return forExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleForClause createSimpleForClause()
  {
    SimpleForClauseImpl simpleForClause = new SimpleForClauseImpl();
    return simpleForClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarName createVarName()
  {
    VarNameImpl varName = new VarNameImpl();
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantifiedExpr createQuantifiedExpr()
  {
    QuantifiedExprImpl quantifiedExpr = new QuantifiedExprImpl();
    return quantifiedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExpr createIfExpr()
  {
    IfExprImpl ifExpr = new IfExprImpl();
    return ifExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpr createOrExpr()
  {
    OrExprImpl orExpr = new OrExprImpl();
    return orExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpr createAndExpr()
  {
    AndExprImpl andExpr = new AndExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparisonExpr createComparisonExpr()
  {
    ComparisonExprImpl comparisonExpr = new ComparisonExprImpl();
    return comparisonExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeExpr createRangeExpr()
  {
    RangeExprImpl rangeExpr = new RangeExprImpl();
    return rangeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpr createAdditiveExpr()
  {
    AdditiveExprImpl additiveExpr = new AdditiveExprImpl();
    return additiveExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpr createMultiplicativeExpr()
  {
    MultiplicativeExprImpl multiplicativeExpr = new MultiplicativeExprImpl();
    return multiplicativeExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionExpr createUnionExpr()
  {
    UnionExprImpl unionExpr = new UnionExprImpl();
    return unionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntersectExceptExpr createIntersectExceptExpr()
  {
    IntersectExceptExprImpl intersectExceptExpr = new IntersectExceptExprImpl();
    return intersectExceptExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceofExpr createInstanceofExpr()
  {
    InstanceofExprImpl instanceofExpr = new InstanceofExprImpl();
    return instanceofExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TreatExpr createTreatExpr()
  {
    TreatExprImpl treatExpr = new TreatExprImpl();
    return treatExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenceType createSequenceType()
  {
    SequenceTypeImpl sequenceType = new SequenceTypeImpl();
    return sequenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType createItemType()
  {
    ItemTypeImpl itemType = new ItemTypeImpl();
    return itemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicType createAtomicType()
  {
    AtomicTypeImpl atomicType = new AtomicTypeImpl();
    return atomicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastableExpr createCastableExpr()
  {
    CastableExprImpl castableExpr = new CastableExprImpl();
    return castableExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpr createCastExpr()
  {
    CastExprImpl castExpr = new CastExprImpl();
    return castExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpr createValueExpr()
  {
    ValueExprImpl valueExpr = new ValueExprImpl();
    return valueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleType createSingleType()
  {
    SingleTypeImpl singleType = new SingleTypeImpl();
    return singleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativePathExpr createRelativePathExpr()
  {
    RelativePathExprImpl relativePathExpr = new RelativePathExprImpl();
    return relativePathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateList createPredicateList()
  {
    PredicateListImpl predicateList = new PredicateListImpl();
    return predicateList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predicate createPredicate()
  {
    PredicateImpl predicate = new PredicateImpl();
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseStep createReverseStep()
  {
    ReverseStepImpl reverseStep = new ReverseStepImpl();
    return reverseStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseAxis createReverseAxis()
  {
    ReverseAxisImpl reverseAxis = new ReverseAxisImpl();
    return reverseAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeTest createNodeTest()
  {
    NodeTestImpl nodeTest = new NodeTestImpl();
    return nodeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameTest createNameTest()
  {
    NameTestImpl nameTest = new NameTestImpl();
    return nameTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardStep createForwardStep()
  {
    ForwardStepImpl forwardStep = new ForwardStepImpl();
    return forwardStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardAxis createForwardAxis()
  {
    ForwardAxisImpl forwardAxis = new ForwardAxisImpl();
    return forwardAxis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbbrevForwardStep createAbbrevForwardStep()
  {
    AbbrevForwardStepImpl abbrevForwardStep = new AbbrevForwardStepImpl();
    return abbrevForwardStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedExpr createParenthesizedExpr()
  {
    ParenthesizedExprImpl parenthesizedExpr = new ParenthesizedExprImpl();
    return parenthesizedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextItemExpr createContextItemExpr()
  {
    ContextItemExprImpl contextItemExpr = new ContextItemExprImpl();
    return contextItemExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindTest createKindTest()
  {
    KindTestImpl kindTest = new KindTestImpl();
    return kindTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDeclaration createElementDeclaration()
  {
    ElementDeclarationImpl elementDeclaration = new ElementDeclarationImpl();
    return elementDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeName createAttributeName()
  {
    AttributeNameImpl attributeName = new AttributeNameImpl();
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementName createElementName()
  {
    ElementNameImpl elementName = new ElementNameImpl();
    return elementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName createTypeName()
  {
    TypeNameImpl typeName = new TypeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyKindTest createAnyKindTest()
  {
    AnyKindTestImpl anyKindTest = new AnyKindTestImpl();
    return anyKindTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentTest createDocumentTest()
  {
    DocumentTestImpl documentTest = new DocumentTestImpl();
    return documentTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextTest createTextTest()
  {
    TextTestImpl textTest = new TextTestImpl();
    return textTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentTest createCommentTest()
  {
    CommentTestImpl commentTest = new CommentTestImpl();
    return commentTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PITest createPITest()
  {
    PITestImpl piTest = new PITestImpl();
    return piTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaAttributeTest createSchemaAttributeTest()
  {
    SchemaAttributeTestImpl schemaAttributeTest = new SchemaAttributeTestImpl();
    return schemaAttributeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDeclaration createAttributeDeclaration()
  {
    AttributeDeclarationImpl attributeDeclaration = new AttributeDeclarationImpl();
    return attributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaElementTest createSchemaElementTest()
  {
    SchemaElementTestImpl schemaElementTest = new SchemaElementTestImpl();
    return schemaElementTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpr createUnaryExpr()
  {
    UnaryExprImpl unaryExpr = new UnaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wildcard createWildcard()
  {
    WildcardImpl wildcard = new WildcardImpl();
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTest createElementTest()
  {
    ElementTestImpl elementTest = new ElementTestImpl();
    return elementTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeTest createAttributeTest()
  {
    AttributeTestImpl attributeTest = new AttributeTestImpl();
    return attributeTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AxisStep createAxisStep()
  {
    AxisStepImpl axisStep = new AxisStepImpl();
    return axisStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StepExpr createStepExpr()
  {
    StepExprImpl stepExpr = new StepExprImpl();
    return stepExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterExpr createFilterExpr()
  {
    FilterExprImpl filterExpr = new FilterExprImpl();
    return filterExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr createPathExpr()
  {
    PathExprImpl pathExpr = new PathExprImpl();
    return pathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttribNameOrWildcard createAttribNameOrWildcard()
  {
    AttribNameOrWildcardImpl attribNameOrWildcard = new AttribNameOrWildcardImpl();
    return attribNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementNameOrWildcard createElementNameOrWildcard()
  {
    ElementNameOrWildcardImpl elementNameOrWildcard = new ElementNameOrWildcardImpl();
    return elementNameOrWildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpr createPrimaryExpr()
  {
    PrimaryExprImpl primaryExpr = new PrimaryExprImpl();
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntersectExcept createIntersectExceptFromString(EDataType eDataType, String initialValue)
  {
    IntersectExcept result = IntersectExcept.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntersectExceptToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Union createUnionFromString(EDataType eDataType, String initialValue)
  {
    Union result = Union.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Additive createAdditiveFromString(EDataType eDataType, String initialValue)
  {
    Additive result = Additive.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAdditiveToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeneralComp createGeneralCompFromString(EDataType eDataType, String initialValue)
  {
    GeneralComp result = GeneralComp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGeneralCompToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueComp createValueCompFromString(EDataType eDataType, String initialValue)
  {
    ValueComp result = ValueComp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertValueCompToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeComp createNodeCompFromString(EDataType eDataType, String initialValue)
  {
    NodeComp result = NodeComp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertNodeCompToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Separator createSeparatorFromString(EDataType eDataType, String initialValue)
  {
    Separator result = Separator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSeparatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReverseAxisEnum createReverseAxisEnumFromString(EDataType eDataType, String initialValue)
  {
    ReverseAxisEnum result = ReverseAxisEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertReverseAxisEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForwardAxisEnum createForwardAxisEnumFromString(EDataType eDataType, String initialValue)
  {
    ForwardAxisEnum result = ForwardAxisEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertForwardAxisEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OccurrenceIndicator createOccurrenceIndicatorFromString(EDataType eDataType, String initialValue)
  {
    OccurrenceIndicator result = OccurrenceIndicator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOccurrenceIndicatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicative createMultiplicativeFromString(EDataType eDataType, String initialValue)
  {
    Multiplicative result = Multiplicative.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplicativeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xpath20Package getXpath20Package()
  {
    return (Xpath20Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Xpath20Package getPackage()
  {
    return Xpath20Package.eINSTANCE;
  }

} //Xpath20FactoryImpl
