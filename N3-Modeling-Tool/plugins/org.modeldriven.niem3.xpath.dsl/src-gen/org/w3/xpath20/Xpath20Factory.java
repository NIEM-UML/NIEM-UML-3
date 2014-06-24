/**
 */
package org.w3.xpath20;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.xpath20.Xpath20Package
 * @generated
 */
public interface Xpath20Factory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Xpath20Factory eINSTANCE = org.w3.xpath20.impl.Xpath20FactoryImpl.init();

  /**
   * Returns a new object of class '<em>XPath</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XPath</em>'.
   * @generated
   */
  XPath createXPath();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Decimal Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Literal</em>'.
   * @generated
   */
  DecimalLiteral createDecimalLiteral();

  /**
   * Returns a new object of class '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Literal</em>'.
   * @generated
   */
  DoubleLiteral createDoubleLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>QName</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>QName</em>'.
   * @generated
   */
  QName createQName();

  /**
   * Returns a new object of class '<em>Prefixed Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefixed Name</em>'.
   * @generated
   */
  PrefixedName createPrefixedName();

  /**
   * Returns a new object of class '<em>Unprefixed Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unprefixed Name</em>'.
   * @generated
   */
  UnprefixedName createUnprefixedName();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expr Single</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Single</em>'.
   * @generated
   */
  ExprSingle createExprSingle();

  /**
   * Returns a new object of class '<em>For Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Expr</em>'.
   * @generated
   */
  ForExpr createForExpr();

  /**
   * Returns a new object of class '<em>Simple For Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple For Clause</em>'.
   * @generated
   */
  SimpleForClause createSimpleForClause();

  /**
   * Returns a new object of class '<em>Var Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Name</em>'.
   * @generated
   */
  VarName createVarName();

  /**
   * Returns a new object of class '<em>Quantified Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantified Expr</em>'.
   * @generated
   */
  QuantifiedExpr createQuantifiedExpr();

  /**
   * Returns a new object of class '<em>If Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Expr</em>'.
   * @generated
   */
  IfExpr createIfExpr();

  /**
   * Returns a new object of class '<em>Or Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expr</em>'.
   * @generated
   */
  OrExpr createOrExpr();

  /**
   * Returns a new object of class '<em>And Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expr</em>'.
   * @generated
   */
  AndExpr createAndExpr();

  /**
   * Returns a new object of class '<em>Comparison Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Expr</em>'.
   * @generated
   */
  ComparisonExpr createComparisonExpr();

  /**
   * Returns a new object of class '<em>Range Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Expr</em>'.
   * @generated
   */
  RangeExpr createRangeExpr();

  /**
   * Returns a new object of class '<em>Additive Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expr</em>'.
   * @generated
   */
  AdditiveExpr createAdditiveExpr();

  /**
   * Returns a new object of class '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expr</em>'.
   * @generated
   */
  MultiplicativeExpr createMultiplicativeExpr();

  /**
   * Returns a new object of class '<em>Union Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union Expr</em>'.
   * @generated
   */
  UnionExpr createUnionExpr();

  /**
   * Returns a new object of class '<em>Intersect Except Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intersect Except Expr</em>'.
   * @generated
   */
  IntersectExceptExpr createIntersectExceptExpr();

  /**
   * Returns a new object of class '<em>Instanceof Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instanceof Expr</em>'.
   * @generated
   */
  InstanceofExpr createInstanceofExpr();

  /**
   * Returns a new object of class '<em>Treat Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Treat Expr</em>'.
   * @generated
   */
  TreatExpr createTreatExpr();

  /**
   * Returns a new object of class '<em>Sequence Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequence Type</em>'.
   * @generated
   */
  SequenceType createSequenceType();

  /**
   * Returns a new object of class '<em>Item Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Type</em>'.
   * @generated
   */
  ItemType createItemType();

  /**
   * Returns a new object of class '<em>Atomic Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic Type</em>'.
   * @generated
   */
  AtomicType createAtomicType();

  /**
   * Returns a new object of class '<em>Castable Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Castable Expr</em>'.
   * @generated
   */
  CastableExpr createCastableExpr();

  /**
   * Returns a new object of class '<em>Cast Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expr</em>'.
   * @generated
   */
  CastExpr createCastExpr();

  /**
   * Returns a new object of class '<em>Value Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Expr</em>'.
   * @generated
   */
  ValueExpr createValueExpr();

  /**
   * Returns a new object of class '<em>Single Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Type</em>'.
   * @generated
   */
  SingleType createSingleType();

  /**
   * Returns a new object of class '<em>Relative Path Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relative Path Expr</em>'.
   * @generated
   */
  RelativePathExpr createRelativePathExpr();

  /**
   * Returns a new object of class '<em>Predicate List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate List</em>'.
   * @generated
   */
  PredicateList createPredicateList();

  /**
   * Returns a new object of class '<em>Predicate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate</em>'.
   * @generated
   */
  Predicate createPredicate();

  /**
   * Returns a new object of class '<em>Reverse Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reverse Step</em>'.
   * @generated
   */
  ReverseStep createReverseStep();

  /**
   * Returns a new object of class '<em>Reverse Axis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reverse Axis</em>'.
   * @generated
   */
  ReverseAxis createReverseAxis();

  /**
   * Returns a new object of class '<em>Node Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Test</em>'.
   * @generated
   */
  NodeTest createNodeTest();

  /**
   * Returns a new object of class '<em>Name Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Test</em>'.
   * @generated
   */
  NameTest createNameTest();

  /**
   * Returns a new object of class '<em>Forward Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forward Step</em>'.
   * @generated
   */
  ForwardStep createForwardStep();

  /**
   * Returns a new object of class '<em>Forward Axis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Forward Axis</em>'.
   * @generated
   */
  ForwardAxis createForwardAxis();

  /**
   * Returns a new object of class '<em>Abbrev Forward Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abbrev Forward Step</em>'.
   * @generated
   */
  AbbrevForwardStep createAbbrevForwardStep();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Literal</em>'.
   * @generated
   */
  NumericLiteral createNumericLiteral();

  /**
   * Returns a new object of class '<em>Var Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Ref</em>'.
   * @generated
   */
  VarRef createVarRef();

  /**
   * Returns a new object of class '<em>Parenthesized Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesized Expr</em>'.
   * @generated
   */
  ParenthesizedExpr createParenthesizedExpr();

  /**
   * Returns a new object of class '<em>Context Item Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context Item Expr</em>'.
   * @generated
   */
  ContextItemExpr createContextItemExpr();

  /**
   * Returns a new object of class '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call</em>'.
   * @generated
   */
  FunctionCall createFunctionCall();

  /**
   * Returns a new object of class '<em>Kind Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kind Test</em>'.
   * @generated
   */
  KindTest createKindTest();

  /**
   * Returns a new object of class '<em>Element Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Declaration</em>'.
   * @generated
   */
  ElementDeclaration createElementDeclaration();

  /**
   * Returns a new object of class '<em>Attribute Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Name</em>'.
   * @generated
   */
  AttributeName createAttributeName();

  /**
   * Returns a new object of class '<em>Element Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Name</em>'.
   * @generated
   */
  ElementName createElementName();

  /**
   * Returns a new object of class '<em>Type Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Name</em>'.
   * @generated
   */
  TypeName createTypeName();

  /**
   * Returns a new object of class '<em>Any Kind Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any Kind Test</em>'.
   * @generated
   */
  AnyKindTest createAnyKindTest();

  /**
   * Returns a new object of class '<em>Document Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Test</em>'.
   * @generated
   */
  DocumentTest createDocumentTest();

  /**
   * Returns a new object of class '<em>Text Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Test</em>'.
   * @generated
   */
  TextTest createTextTest();

  /**
   * Returns a new object of class '<em>Comment Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment Test</em>'.
   * @generated
   */
  CommentTest createCommentTest();

  /**
   * Returns a new object of class '<em>PI Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PI Test</em>'.
   * @generated
   */
  PITest createPITest();

  /**
   * Returns a new object of class '<em>Schema Attribute Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Attribute Test</em>'.
   * @generated
   */
  SchemaAttributeTest createSchemaAttributeTest();

  /**
   * Returns a new object of class '<em>Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Declaration</em>'.
   * @generated
   */
  AttributeDeclaration createAttributeDeclaration();

  /**
   * Returns a new object of class '<em>Schema Element Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema Element Test</em>'.
   * @generated
   */
  SchemaElementTest createSchemaElementTest();

  /**
   * Returns a new object of class '<em>Unary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expr</em>'.
   * @generated
   */
  UnaryExpr createUnaryExpr();

  /**
   * Returns a new object of class '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wildcard</em>'.
   * @generated
   */
  Wildcard createWildcard();

  /**
   * Returns a new object of class '<em>Element Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Test</em>'.
   * @generated
   */
  ElementTest createElementTest();

  /**
   * Returns a new object of class '<em>Attribute Test</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Test</em>'.
   * @generated
   */
  AttributeTest createAttributeTest();

  /**
   * Returns a new object of class '<em>Axis Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axis Step</em>'.
   * @generated
   */
  AxisStep createAxisStep();

  /**
   * Returns a new object of class '<em>Step Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Step Expr</em>'.
   * @generated
   */
  StepExpr createStepExpr();

  /**
   * Returns a new object of class '<em>Filter Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Expr</em>'.
   * @generated
   */
  FilterExpr createFilterExpr();

  /**
   * Returns a new object of class '<em>Path Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Expr</em>'.
   * @generated
   */
  PathExpr createPathExpr();

  /**
   * Returns a new object of class '<em>Attrib Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attrib Name Or Wildcard</em>'.
   * @generated
   */
  AttribNameOrWildcard createAttribNameOrWildcard();

  /**
   * Returns a new object of class '<em>Element Name Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Name Or Wildcard</em>'.
   * @generated
   */
  ElementNameOrWildcard createElementNameOrWildcard();

  /**
   * Returns a new object of class '<em>Primary Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expr</em>'.
   * @generated
   */
  PrimaryExpr createPrimaryExpr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Xpath20Package getXpath20Package();

} //Xpath20Factory
